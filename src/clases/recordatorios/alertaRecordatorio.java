package clases.recordatorios;
import logs.Logs;
import clases.Instancias;
import clases.metodosGenerales;
import formularios.recordatorios.infRecordatorios;
import formularios.frmMenu;

public class alertaRecordatorio extends Thread {

    private metodosGenerales metodos;
    Instancias instancias;
    private Object[][] datos;

    public void alertaRecordatorio() {
        metodos = new metodosGenerales();
        instancias = Instancias.getInstancias();
    }

    public void run() {
        metodos = new metodosGenerales();
        instancias = Instancias.getInstancias();
        Logs.log("entro al Cronometro");
        frmMenu menu = new frmMenu();

        int minutosCont = 0, segundosCont = 0, horasCont = 0;

        for (horasCont = 0; horasCont <= 50; horasCont++) {

            for (minutosCont = 0; minutosCont < 59; minutosCont++) {
                for (segundosCont = 0; segundosCont < 59; segundosCont++) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        Logs.error(e);
                    }
                    
                    Logs.log(horasCont + ":" + minutosCont + ":" + segundosCont);
                }
                datos = instancias.getSql().getAlertasRecordatorios("PENDIENTE", metodos.fechaConsulta(metodosGenerales.fecha()));
//                Logs.log("dato leng " + datos.length);
                for (int i = 0; i < datos.length; i++) {
//                    Logs.log("datos 1 " + datos[i][2]);
//                    Logs.log("datos 2 " + metodosGenerales.hora());
                    if (datos[i][2].equals(metodosGenerales.hora())) {
//                        Logs.log("HORAS IGUALES");
                        if (metodos.msgPregunta(null, "TIENE UN RECORDATORIO PARA ESTA HORA ¿Desea revisarlo?") == 0) {
                            menu.llamarRecordatorio();
                            infRecordatorios inf = new infRecordatorios();
                            inf.llamarRecordatorios();
//                            infRecordatorios recor = new infRecordatorios();
//                            recor.show();
                        }
                    }

                }

                for (int i = 0; i < datos.length; i++) {
//                Logs.log("hora 1 " + Integer.parseInt(metodosGenerales.hora().split(":")[0]));
//                Logs.log("hora 2 " + Integer.parseInt(datos[i][2].toString().split(":")[0]));
                    if (datos[i][3].equals("hora")) {
                        if (minutosCont == 10 || minutosCont == 20 || minutosCont == 30 || minutosCont == 40 || minutosCont == 50 || minutosCont == 0) {
                            if (metodos.msgPregunta(null, "TIENE UN RECORDATORIO ATRASADO ¿Desea revisarlo?") == 0) {
                                menu.llamarRecordatorio();
                                infRecordatorios inf = new infRecordatorios();
                                inf.llamarRecordatorios();
//                        infRecordatorios recor = new infRecordatorios();
//                        recor.show();
                            }
                        }
                        break;
                    }
                }
            }
            for (int i = 0; i < datos.length; i++) {
                if (datos[i][3].equals("dias")) {
                    if (horasCont == 3 || horasCont == 6 || horasCont == 9) {
                        metodos.msgAdvertencia(null, "Tiene recordatorios para hoy");
                    }
                }
            }

        }

    }
}
