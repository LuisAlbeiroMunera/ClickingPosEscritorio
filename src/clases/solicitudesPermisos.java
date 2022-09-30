/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import logs.Logs;
import configuracion.dlgAlertaPermiso;

public class solicitudesPermisos extends Thread {

    metodosGenerales metodos = new metodosGenerales();
    Instancias instancias = Instancias.getInstancias();

    @Override
    public void run() {

        int cantActual = 0, inicio = 1;
        String parar = "Nunca";
//        System.err.println("ojo  quitar este codigo solo va para pruebas");
//        if (parar.equals("Nunca")) {
        while (parar.equals("Nunca")) {
            System.err.println("permiso "+parar+" "+instancias.getUsuario());
            if (!instancias.getUsuario().equals("ADMIN")) {
                parar = "SI";
            }

            Object[][] pendientes = new Object[0][0];

            try {
                pendientes = instancias.getSql().getPermisosPendientes(" where estado = 'PENDIENTE'; ");
            } catch (Exception e) {
                Logs.error(e);
            }

            if (pendientes.length > 0) {
                if (cantActual == 0 && inicio == 1) {
                    inicio = 0;
//                    metodos.msgAdvertencia(null, "Tiene permisos pendientes");
                } else {
                    if (pendientes.length == cantActual) {
                        Logs.log("Nada nuevo");
                    } else if (pendientes.length < cantActual) {
                        Logs.log("Menos solicitudes");
                    } else if (pendientes.length > cantActual) {
                        dlgAlertaPermiso alertaPermiso = new dlgAlertaPermiso(null, true);
                        alertaPermiso.setLocationRelativeTo(null);
                        alertaPermiso.setVisible(true);
                    }
                }

                instancias.getMenu().actualizarPermisos(pendientes.length, true, true);
                cantActual = pendientes.length;
                
            } else {
                inicio = 0;
                cantActual = 0;
                instancias.getMenu().actualizarPermisos(pendientes.length, false, true);
            }
            
            esperarXsegundos(7);
        }
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
