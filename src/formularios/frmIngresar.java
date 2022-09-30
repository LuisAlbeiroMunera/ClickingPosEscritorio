package formularios;

import clases.Actividad;
import clases.Cliente;
import clases.Identidad;
import clases.Iniciar2;
import clases.Instancias;
import clases.RespuestaServicioRest;
import clases.metodosGenerales;
import static clases.metodosGenerales.codificarSerial;
import clases.ndUsuario;
import configuracion.Propiedades;
import configuracion.ndConfiguracion;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.Socket;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;
import logs.Logs;

public class frmIngresar extends javax.swing.JFrame {

    Inicio insInicio;
    Instancias instancias;
    metodosGenerales metodos = new metodosGenerales();
    int teclasPresionadas = 0;
    String nombreEmpresa;
    Object[] datos;
    boolean existeActualizacion = false;
    boolean isHabilitadoIngreso = false;
    boolean isAlertado = false;
    cargando1 barraInicio;
    
    public frmIngresar(String nombre) {
        instancias = Instancias.getInstancias();
        instancias.cargarConfiguraciones();

        validarBloqueo();
        if(isHabilitadoIngreso){
            initComponents();

            jLabel1.setBackground(new Color(0,0,0,0));
            btnIngresar.setBackground(new Color(0,0,0,0));

            instancias.setIngreso(this);


            this.setLocationRelativeTo(null);

            nombreEmpresa = nombre;

            ((JPanelConFondo) panelFondo).setImagen("iniciarSesion.png");

            txtContrasena.requestFocus();

            datos = instancias.getSql().getDatosMaestra();

            this.getRootPane().registerKeyboardAction(accion("primera"), "primera", KeyStroke.getKeyStroke(nombre).getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
            this.getRootPane().registerKeyboardAction(accion("segunda"), "segunda", KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
//        this.registerKeyboardAction(accion("tercera"), "tercera", KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        }
    }

    public frmIngresar(){
    }
    
    public void enviarInstancia(Inicio x) {
        insInicio = x;
    }

    public String codigoEncriptado(String nit, String nombre) {
        String hashEncriptado = nit + "--" + nombre;
        try {
            hashEncriptado = metodos.EncriptarValidacionUsuario(hashEncriptado, "yI4z%jIMndKd3N%bj#%f");
        } catch (Exception ex) {
            Logs.error(ex);
        }
        return hashEncriptado;
    }

    private void validacionFechaCorte(String fechaCorte, String anti, String plazo) {
        instancias.getSql().eliminarTodo("bdlogerroresbloqueo");
        instancias.getSql().agregarFechasBloqueo(fechaCorte);
        instancias.getSql().cambiarDiasBloqueo(anti, plazo);
    }
    
    public void validarBloqueo() {
    try{
        Logs.log("entra a validarBloqueo una empresa");     
        ndConfiguracion nodoConf = instancias.getSql().getDatosConfiguracion();
        Socket s = null;
        try {
              s = new Socket(Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
         } catch (Exception e) {
                Logs.error(e);
         }
        Logs.log(" validacion siempre habilitada "+nodoConf.isValidarConfSiempre());
        if(nodoConf.isValidarConfSiempre() && s != null && s.isConnected()){
           validraEstadoConAsw(nodoConf, s.isConnected());
        }else {
            isHabilitadoIngreso = validarFechaBloqueo(nodoConf);
            Logs.log(" habilitado ingreso "+isHabilitadoIngreso);
            Logs.log(" isAlertado "+isAlertado);
            if(!isHabilitadoIngreso || isAlertado){
                validraEstadoConAsw(nodoConf, false);
            }
        }
        
        if(!nodoConf.isImgMigradas()){
            try {
                  Logs.log("Migrando imagenes a la base de datos ");
                  final File folder = new File("C:\\ClickingPos\\imagenes");
                  Instancias.getInstancias().getSql().migrarImagenesToDB(folder);
                  Instancias.getInstancias().getSql().setImagenesMigradas();  
            } catch (Exception e) {
                 Logs.error(e);
            }
       }
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Error nuevo "+e.getMessage());
        }
    }
    
    private void validraEstadoConAsw(ndConfiguracion nodoConf, boolean tieneConexion){
       try{ 
         RespuestaServicioRest respuestaServicio = null;
         Cliente cliente = null;
         Actividad actividad = null;
         String estado = null;
            try {
                Logs.log("Entro a validarBloqueo consultarEstado una empresa");
                Logs.log("Entro a validarBloqueo consultarEstado una empresa nit "+ nodoConf.getNit() + " nombre "+nodoConf.getNombre());                 
                if (tieneConexion) {
                     Logs.log("Inicia conexion con aws");
                     if(nodoConf != null && !nodoConf.getNit().isEmpty()){
                     respuestaServicio = metodos.consultarEstado(codigoEncriptado(nodoConf.getNit(), nodoConf.getNombre()),1);
                     
                     estado = respuestaServicio.getEstado();
                    if (respuestaServicio.getCliente()== null) {
                          metodos.msgError(null, respuestaServicio.getMensaje());
                          Logs.log("Error servicio "+respuestaServicio.getMensaje());
                          return;
                    }else{  
                     cliente = respuestaServicio.getCliente();
                     actividad = respuestaServicio.getActividad();
                    }
                     Logs.log("Finaliza conexion con aws");
                    }else{
                      Logs.log("Sin datos en configuración");   
                        this.hide();
                        this.dispose();
                        Logs.log("se pide el codigo 2");
                        frmValidacionCodigo validar = new frmValidacionCodigo();
                        validar.setVisible(true);  
                        isHabilitadoIngreso = false;
                        return;
                    }
                }
            } catch (Exception e) {
                Logs.error(e);
                Logs.error("No hay conexión de internet y no se validaron datos al entrar");   
            }
            
            String fechaCorte1 = "", fechaCorte = "", anticipacion = "", plazo = "";
            String regimen = "", impoconsumo, dispositivoUSB, ordenesServicio, tipoOrden, creditos, planSepare, pedidos, tipoImpresion, invBodega,
                    productosSerial, embarcaciones, congeladas, medico, veterinaria, parqueadero, agenda, restaurante, recordatorios, laboratorio,
                    oftalmologia, facturaLote, PTM, periodoPrueba, diasFinalizacionPrueba, numeroFacturas, diasDespuesPrueba, info, actualizarPermiso,
                    facturacionElectronica, contable, nitEmisor, tokenEmisor, pais = "Colombia", actualizarPermisos="" ,corresponsal, actualizacionObligatoria,
                    versionSistema, facturaElectronicaPTM, manejaPreFactura, responsableIva;
            
         if (cliente != null) {
//            if (respuestaServicio.getCliente()!= null && respuestaServicio.getActividad()!= null) {         
                //este es el que debe estar
                
                fechaCorte = String.valueOf(metodos.formatoFecha(actividad.getFechaCorte()));
                anticipacion = String.valueOf(cliente.getAnterioridad());
                plazo = String.valueOf(cliente.getPlazo());

               
                try {
                    
//                    if (Integer.parseInt(instancias.getSql().getNumConsecutivoActual("FACT")[0].toString()) > 0) {
//                        if (cliente.getActualizarPermisos()== 0) {
//                            actualizarPermisos = false;
//                        }
//                    }
                        corresponsal = String.valueOf(cliente.getCorresponsalWeb()); //aqui va la asignacion de corresponsal
                        regimen = String.valueOf(cliente.getRegimen());
                        impoconsumo = String.valueOf(cliente.getImpoconsumo());
                        dispositivoUSB = String.valueOf(cliente.getDispositivoUSB());
                        ordenesServicio = String.valueOf(cliente.getOrdenesServicio());
                        tipoOrden = String.valueOf(cliente.getTipoOrden());
                        creditos = String.valueOf(cliente.getCreditos());
                        planSepare = String.valueOf(cliente.getPlanSepare());
                        pedidos = String.valueOf(cliente.getPedidos());
                        tipoImpresion = String.valueOf(cliente.getTipoImpresion());
                        invBodega = String.valueOf(cliente.getInvBodega());
                        productosSerial = String.valueOf(cliente.getProductosSerial());
                        embarcaciones = String.valueOf(cliente.getEmbarcaciones());
                        congeladas = String.valueOf(cliente.getCongeladas());
                        medico = String.valueOf(cliente.getMedico());
                        veterinaria = String.valueOf(cliente.getVeterinaria());
                        parqueadero = String.valueOf(cliente.getParqueadero());
                        agenda = String.valueOf(cliente.getAgenda());
                        restaurante = String.valueOf(cliente.getRestaurante());
                        recordatorios = String.valueOf(cliente.getRecordatorios());
                        laboratorio = String.valueOf(cliente.getLaboratorio());
                        oftalmologia = String.valueOf(cliente.getOftalmologia());
                        facturaLote = String.valueOf(cliente.getFacturaLote());
                        PTM = String.valueOf(cliente.getPtm());
                        periodoPrueba = String.valueOf(cliente.getPeriodoPrueba());
                        diasFinalizacionPrueba = String.valueOf(cliente.getDiasFinalizacionPrueba());
                        numeroFacturas = String.valueOf(cliente.getNumeroFacturas());
                        diasDespuesPrueba = String.valueOf(cliente.getDiasDespuesPrueba());
                        info = String.valueOf(cliente.getInfo());
                        facturacionElectronica = String.valueOf(cliente.getFacturacionElectronica());
                        contable = String.valueOf(cliente.getPuc());
                        nitEmisor = String.valueOf(cliente.getNitEmisor());
                        tokenEmisor = String.valueOf(cliente.getTokenEmisor());
                        pais = String.valueOf(cliente.getPais());
                        responsableIva = String.valueOf(cliente.getResponsableIva());
                        actualizacionObligatoria="0";
                        if(cliente.getActualizacionObligatoria()!=null){
                          actualizacionObligatoria=cliente.getActualizacionObligatoria();
                        }
                        versionSistema=String.valueOf(cliente.getVersionSistema());
                        facturaElectronicaPTM=String.valueOf(cliente.getFacturaElectronicaPTM());
                        if(cliente.getManejaPreFactura()!=null){
                          manejaPreFactura=String.valueOf(cliente.getManejaPreFactura());
                        }else{
                          manejaPreFactura=String.valueOf("0");
                        }
                        nodoConf.setLogs(cliente.getLogs() > 0);
                        nodoConf.setDebug(cliente.getDebug() > 0);
                        nodoConf.setValidarConfSiempre(cliente.getValidarConfSiempre() > 0);
                                             
                        instancias.setNitEmisor(nitEmisor);
                        instancias.setTokenEmisor(tokenEmisor);
                        
                        nodoConf.setCorresponsalWeb(corresponsal);                        
                        nodoConf.setActualizacionObligatoria(actualizacionObligatoria);
                        nodoConf.setFacturaElectronicaPTM(facturaElectronicaPTM);
                        try{
                          nodoConf.setManejaPreFactura(manejaPreFactura);
                        }catch(Exception exp){
                          nodoConf.setManejaPreFactura("0");
                        }
                        if (dispositivoUSB.equals("1")) {
                            nodoConf.setUsb(true);
                        } else {
                            nodoConf.setUsb(false);
                        }

                        if (embarcaciones.equals("1")) {
                            nodoConf.setEmbarcaciones(true);
                        } else {
                            nodoConf.setEmbarcaciones(false);
                        }

                        if (congeladas.equals("1")) {
                            nodoConf.setCongeladas(true);
                        } else {
                            nodoConf.setCongeladas(false);
                        }

                        if (medico.equals("1")) {
                            nodoConf.setMedico(true);
                        } else {
                            nodoConf.setMedico(false);
                        }

                        if (laboratorio.equals("1")) {
                            nodoConf.setLaboratorio(true);
                        } else {
                            nodoConf.setLaboratorio(false);
                        }

                        if (veterinaria.equals("1")) {
                            nodoConf.setVeterinaria(true);
                        } else {
                            nodoConf.setVeterinaria(false);
                        }

                        if (parqueadero.equals("1")) {
                            nodoConf.setParqueadero(true);
                        } else {
                            nodoConf.setParqueadero(false);
                        }

                        if (ordenesServicio.equals("1")) {
                            nodoConf.setOrdenServ(true);
                        } else {
                            nodoConf.setOrdenServ(false);
                        }

                        if (creditos.equals("1")) {
                            nodoConf.setCreditos(true);
                        } else {
                            nodoConf.setCreditos(false);
                        }

                        if (planSepare.equals("1")) {
                            nodoConf.setSepare(true);
                        } else {
                            nodoConf.setSepare(false);
                        }

                        if (pedidos.equals("1")) {
                            nodoConf.setPedido(true);
                        } else {
                            nodoConf.setPedido(false);
                        }

                        if (agenda.equals("1")) {
                            nodoConf.setAgenda(true);
                        } else {
                            nodoConf.setAgenda(false);
                        }

                        if (restaurante.equals("1")) {
                            nodoConf.setRestaurante(true);
                        } else {
                            nodoConf.setRestaurante(false);
                        }

                        if (recordatorios.equals("1")) {
                            nodoConf.setRecordatorios(true);
                        } else {
                            nodoConf.setRecordatorios(false);
                        }

                        if (tipoOrden.equals("1")) {
                            nodoConf.setServicioAutomotor(true);
                        } else {
                            nodoConf.setServicioAutomotor(false);
                        }

                        if (facturaLote.equals("1")) {
                            nodoConf.setFacturacionLote(true);
                        } else {
                            nodoConf.setFacturacionLote(false);
                        }

                        if (periodoPrueba.equals("1")) {
                            nodoConf.setPeriodo(true);
                        } else {
                            nodoConf.setPeriodo(false);
                        }

                        if (oftalmologia.equals("1")) {
                            nodoConf.setOftalmologia(true);
                        } else {
                            nodoConf.setOftalmologia(false);
                        }

                        if (invBodega.equals("1")) {
                            nodoConf.setInventarioBodegas(true);
                        } else {
                            nodoConf.setInventarioBodegas(false);
                        }

                        if (productosSerial.equals("1")) {
                            nodoConf.setProductosSerial(true);
                        } else {
                            nodoConf.setProductosSerial(false);
                        }

                        if (PTM.equals("1")) {
                            nodoConf.setPtm(true);
                        } else {
                            nodoConf.setPtm(false);
                        }

                        if (facturacionElectronica.equals("1")) {
                            nodoConf.setFacturaElectronica(true);
                        } else {
                            nodoConf.setFacturaElectronica(false);
                        }

                        if (contable.equals("1")) {
                            nodoConf.setPuc(true);
                        } else {
                            nodoConf.setPuc(false);
                        }
                        
                        if (actualizarPermisos.equals("1")) {
                            nodoConf.setActualizarPermisos(true);
                        } else {
                            nodoConf.setActualizarPermisos(false);
                        }
                        
                        if (responsableIva.equals("1")) {
                            nodoConf.setResponsableIva(true);
                        } else {
                            nodoConf.setResponsableIva(false);
                        }
                        
                        nodoConf.setInformacionLegal(info);
                        nodoConf.setNumFacturas(numeroFacturas);
                        nodoConf.setAviso(diasFinalizacionPrueba);
                        nodoConf.setAviso1("");
                        nodoConf.setVentasFactura("estandar");
                        nodoConf.setRegimen(regimen);
                        nodoConf.setDiasAlertaBloqueo(nodoConf.getDiasAlertaBloqueo());
                        nodoConf.setDiasBloqueo(nodoConf.getDiasBloqueo());
                        nodoConf.setImpoconsumo(impoconsumo);
                        nodoConf.setActualizacion(metodos.fechaConsulta(metodosGenerales.fecha()));
                        nodoConf.setDiasActualizacion(diasDespuesPrueba);
                        nodoConf.setNombre(nodoConf.getNombre());
                        nodoConf.setNit(nodoConf.getNit());
                        nodoConf.setTipoImpresion(tipoImpresion);
                        nodoConf.setVersion(nodoConf.getVersion());
                        nodoConf.setPais(pais);
                        

                        if (!instancias.getSql().modificarConfiguracion(nodoConf)) {
                            metodos.msgError(null, "Error al guardar los cambios");
                            return;
                        }
//                    }
//                    else {
//                        
//                        metodos.modificarPermisos(codigoEncriptado(nodoConf.getNit(), nodoConf.getNombre()), nodoConf.getRegimen(), nodoConf.getImpoconsumo(),
//                                String.valueOf(nodoConf.isUsb()), String.valueOf(nodoConf.isOrdenServ()), String.valueOf(nodoConf.isServicioAutomotor()),
//                                String.valueOf(nodoConf.isCreditos()), String.valueOf(nodoConf.isSepare()), String.valueOf(nodoConf.isPedido()),
//                                nodoConf.getTipoImpresion(), String.valueOf(nodoConf.isInventarioBodegas()), String.valueOf(nodoConf.isProductosSerial()),
//                                String.valueOf(nodoConf.isEmbarcaciones()), String.valueOf(nodoConf.isCongeladas()), String.valueOf(nodoConf.isMedico()),
//                                String.valueOf(nodoConf.isVeterinaria()), String.valueOf(nodoConf.isParqueadero()), String.valueOf(nodoConf.isAgenda()),
//                                String.valueOf(nodoConf.isRestaurante()), String.valueOf(nodoConf.isRecordatorios()), String.valueOf(nodoConf.isLaboratorio()),
//                                String.valueOf(nodoConf.isOftalmologia()), String.valueOf(nodoConf.isFacturacionLote()), String.valueOf(nodoConf.isPtm()),
//                                String.valueOf(nodoConf.isPeriodo()), nodoConf.getAviso(), nodoConf.getNumFacturas(), nodoConf.getDiasActualizacion(),
//                                nodoConf.getInformacionLegal(), "1", String.valueOf(nodoConf.isFacturaElectronica()), String.valueOf(nodoConf.isPuc()), pais);
//                    }
                } catch (Exception e) {
                     Logs.error(e);
                }
            
            }
            try {
                fechaCorte1 = metodos.encriptarFechaBloqueo(fechaCorte);
            } catch (Exception ex) {
                Logs.error(ex);
            }
//            estado="000123";
            if(estado == null) {
              isHabilitadoIngreso = validarFechaBloqueo(nodoConf);
             
            }else if (estado.equals(Identidad.CLIENTE_VENCIDO)) {
//            if (estado.equals("Vencido")) {
                validacionFechaCorte(fechaCorte1, anticipacion, plazo);
                this.dispose();
                dlgBloqueoPrograma bloqueo = new dlgBloqueoPrograma();
                bloqueo.show();
                isHabilitadoIngreso = false;
            } else if (estado.equals(Identidad.CLIENTE_ESPERA)) {
//            } else if (estado.equals("Vencido, en espera")) {
                validacionFechaCorte(fechaCorte1, anticipacion, plazo);
                dlgCuotaPendiente cuota = new dlgCuotaPendiente("Tiene una cuota ¡ VENCIDA ! del " + fechaCorte  + ". Tiene " + plazo + " días de plazo para realizar el pago.");
                cuota.setVisible(true);
                isHabilitadoIngreso = true;
            } else if (estado.equals(Identidad.CLIENTE_PRONTO_VENCE)) {
//            } else if (estado.equals("Pronto a vencerse")) {
                validacionFechaCorte(fechaCorte1, anticipacion, plazo);
                String fecha = fechaCorte.substring(3, fechaCorte.length() - 5);
               
                String nombreMes = "";
                if (fecha.equals("01")) {
                    nombreMes = "Enero";
                } else if (fecha.equals("02")) {
                    nombreMes = "Febrero";
                } else if (fecha.equals("03")) {
                    nombreMes = "Marzo";
                } else if (fecha.equals("04")) {
                    nombreMes = "Abril";
                } else if (fecha.equals("05")) {
                    nombreMes = "Mayo";
                } else if (fecha.equals("06")) {
                    nombreMes = "Junio";
                } else if (fecha.equals("07")) {
                    nombreMes = "Julio";
                } else if (fecha.equals("08")) {
                    nombreMes = "Agosto";
                } else if (fecha.equals("09")) {
                    nombreMes = "Septiembre";
                } else if (fecha.equals("10")) {
                    nombreMes = "Octubre";
                } else if (fecha.equals("11")) {
                    nombreMes = "Noviembre";
                } else if (fecha.equals("12")) {
                    nombreMes = "Diciembre";
                }

                dlgCuotaPendiente cuota = new dlgCuotaPendiente("APRECIADO CLIENTE: el día primero de " + nombreMes + " usted recibira via correo electronico su factura, "
                        + "la cual debe cancelar dentro de los " + plazo + " días siguientes. \nEvite la suspención del servicio.");
                cuota.setVisible(true);
                isHabilitadoIngreso = true;
            } else if (estado.equals(Identidad.CLIENTE_NO_EXISTE)) {
//            } else if (estado.equals("El usuario no existe")) {
                this.hide();
                this.dispose();
                Logs.log("se pide el codigo 2");
                frmValidacionCodigo validar = new frmValidacionCodigo();
                validar.setVisible(true);  
                isHabilitadoIngreso = false;
            } else if (estado.equals(Identidad.OK)) {//COLOQUE ESTA ULYIMA VALIDACION POR QUR ESTA VIENENDO MAL DESDE EL SERVICIO
//            } else if (estado.equals("OK")) {
                validacionFechaCorte(fechaCorte1, anticipacion, plazo);
                isHabilitadoIngreso = true;
            } else if (estado.equals(Identidad.CLIENTE_SIN_REGISTRO)) {
//            } else if (estado.equals("Sin registro, validando")) {
                validacionFechaCorte(fechaCorte1, anticipacion, plazo);
                metodos.msgAdvertenciaAjustado(null, "       ¡ EN ESPERA DE ACTIVACIÓN !       ");
                isHabilitadoIngreso = false;
            }else{
              metodos.msgAdvertenciaAjustado(null, "       ¡ ACTUALIZACION OBLIGATORIA !       ");
              isHabilitadoIngreso = true;
            }
            
             } catch (Exception e) {
                 e.printStackTrace();
             }
    }
//    }
    
         
    private boolean validarFechaBloqueo(ndConfiguracion nodoConf){
             Object[][] fechasBloqueo = instancias.getSql().getFechasBloqueo();
            int diasAlertaBloqueo = Integer.parseInt(nodoConf.getDiasAlertaBloqueo());
            int diasBloqueo = Integer.parseInt(nodoConf.getDiasBloqueo());

            String mensaje = "";
            if (nodoConf.isPeriodo()) {
                mensaje = "Su periodo de prueba esta pronto a vencerse. Vigente hasta";
            } else {
                mensaje = "Tiene una cuota ¡ PENDIENTE ! para el día";
            }

            if (fechasBloqueo.length <= 0) {
                metodos.msgAdvertenciaAjustado(null, "¡SISTEMA SIN REGISTRO! COMUNÍQUESE AL 322-32-59 PARA REALIZAR EL RESPECTIVO REGISTRO.");             
                System.exit(0);
                return false;
            } else {
                for (Object[] fechasBloqueo1 : fechasBloqueo) {
                    String fecha = "";
                    try {
                        fecha = metodos.DesencriptarFechaBloqueo(fechasBloqueo1[1].toString());
                    } catch (Exception ex) {
                        Logs.error(ex);
                        metodos.msgError(null, "El sistema esta corrupto");
                        return false;
                    }

                    long faltante = metodos.restarFecha(metodosGenerales.fecha(), fecha);
                    if (faltante <= diasAlertaBloqueo && faltante > 0) {
                        metodos.msgAdvertenciaAjustado(null, mensaje + ": " + fecha);
                        isAlertado = true;
                        return true;
                    } else if (faltante == 0) {
                        dlgCuotaPendiente cuota = new dlgCuotaPendiente(mensaje + " de ¡ HOY ! ");
                        cuota.setVisible(true);
                        isAlertado = true;
                        return true;
                    } else if ((faltante + diasBloqueo) >= 0 && (faltante + diasBloqueo) <= diasBloqueo) {
                        dlgCuotaPendiente cuota = new dlgCuotaPendiente("Tiene una cuota ¡ ATRASADA ! del día: " + fecha);
                        cuota.setVisible(true);
                        isAlertado = true;
                        return true;
                    } else if ((faltante + diasBloqueo) < 0) {
                        this.dispose();
                        dlgBloqueoPrograma bloqueo = new dlgBloqueoPrograma();
                        bloqueo.EditarMensaje("Realice el pago o si ya lo realizó se activara","conectando su Computador a Internet.");
                        bloqueo.show();
                        return false;
                        
                    }
                }
                return true;
            }  
    }

    private ActionListener accion(final String opc) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
                    case "primera":
                        if (teclasPresionadas == 0) {
                            teclasPresionadas = 1;
                        } else {
                            teclasPresionadas = 0;
                        }
                        break;
                    case "segunda":
                        if (teclasPresionadas == 1) {
                            teclasPresionadas = 2;
                        } else if (teclasPresionadas == 2) {
                            new dlgPedirSuperContrasena(null, true, "pagos").setVisible(true);
                            teclasPresionadas = 0;
                        } else {
                            teclasPresionadas = 0;
                        }
                        break;
                }
            }
        };
        return a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new JPanelConFondo();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar1 = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TanFacil.Click");
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelFondo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        panelFondo.setFocusable(false);
        panelFondo.setPreferredSize(new java.awt.Dimension(445, 629));
        panelFondo.setRequestFocusEnabled(false);
        panelFondo.setVerifyInputWhenFocusTarget(false);

        txtContrasena.setFont(new java.awt.Font("Centaur", 0, 40)); // NOI18N
        txtContrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasena.setBorder(null);
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(251, 251, 251));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿ Olvidaste tu contraseña ?");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("ADMIN");
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setText("<");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        btnIngresar1.setBackground(new java.awt.Color(204, 204, 204));
        btnIngresar1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conexion.png"))); // NOI18N
        btnIngresar1.setBorder(null);
        btnIngresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });
        btnIngresar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnIngresar1KeyReleased(evt);
            }
        });

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/ingresar.png"))); // NOI18N
        btnIngresar.setToolTipText("");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnIngresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/ingresar2.png"))); // NOI18N
        btnIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/ingresar3.png"))); // NOI18N
        btnIngresar.setSelected(true);
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngresar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelFondoLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel2)
                    .addContainerGap(399, Short.MAX_VALUE)))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIngresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelFondoLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(574, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validarIniciarSesion();
        }
    }//GEN-LAST:event_txtContrasenaKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        olvidarClave olvida = new olvidarClave();
        olvida.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        instancias.getSql().SQL1("bdclick", true);
         Object[][] datos = instancias.getSql().getMultiempresas();

        if (datos.length > 1) {
            insInicio.setEnabled(true);
            try {
                this.instancias.socket.close();
            } catch (Exception e) {
            }
            this.dispose();
            frmIngresarMulti multiempresas = new frmIngresarMulti(insInicio);
            multiempresas.show();
        } else {
            insInicio.setEnabled(false);
            this.dispose();
            System.exit(0);
        }
      
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        cerrarConexiones cerrar = new cerrarConexiones();
        cerrar.setVisible(true);
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void btnIngresar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresar1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresar1KeyReleased

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
       validarIniciarSesion();
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed

    public void validarIniciarSesion() {
        String ser = codificarSerial();
        Object[][] aux = instancias.getSql().getErrores(ser);
        System.err.println("    "+aux);
        String sFichero = "C:/info.txt";
        File fichero = new File(sFichero);
        metodosGenerales ee = new metodosGenerales();
        if (aux != null && aux.length > 0 && fichero.exists()) {

            ndUsuario nodo = instancias.getSql().getDatosUsuario(txtUsuario.getText());

            if (nodo.getUsuario() != null) {
                if (!txtContrasena.getText().equals(nodo.getContra())) {
                    ee.msgError(null, "Usuario o contraseña incorrectos");
                    txtUsuario.requestFocus();
                    return;
                }

                instancias.setTerminal(instancias.getSql().getTerminal(metodosGenerales.codificarSerial())[0][0].toString());

                Object[] data = instancias.getSql().getDatosUsuarioInicio(txtUsuario.getText());
                if (data[0].toString().equals("ON")) {
                    if (!data[1].toString().equals(instancias.getTerminal())) {
                        ee.msgError(null, "Usuario ingresado en la TERM-" + data[1].toString().replace("TERM-", ""));
                        txtUsuario.requestFocus();
                        return;
                    } else {
//                        ee.msgAdvertencia(null, "Hubo un cierre inesperado del programa en la anterior ejecución. Por favor verifique la información.");
                    }
                }

                insInicio.dispose();

                Iniciar ini = new Iniciar(nodo);
                barraInicio = new cargando1(ini, instancias);
                barraInicio.show();
                this.dispose();

            } else {
                ee.msgError(null, "Usuario o contraseña incorrectos");
                txtUsuario.requestFocus();
                return;
            }

        } else {
            this.dispose();
            ee.msgAdvertencia(null, "Copia no funcional");
        }
    }

    class Iniciar extends Iniciar2 {

        Instancias instancias;
        ndUsuario nodo;

        Iniciar(ndUsuario nodo) {
            this.instancias = Instancias.getInstancias();
            this.nodo = nodo;
        }

        public void run() {
            frmMenu form = new frmMenu();

            instancias.setMenu(form);
            instancias.setUsuario(nodo.getUsuario());
            instancias.setUsuarioLog(nodo);

            form.setInstancias(instancias);
            form.setExtendedState(JFrame.MAXIMIZED_BOTH);
            form.asignarNombre(nombreEmpresa);

            form.show();

            instancias.getProgres().detener(true);
            instancias.setProgres(null);
            form.cargarSocket();
            barraInicio.dispose();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                //DESCOMENTAR ESTO PARA QUE NO DEJE ABRIR DOS PROGRAMAS POR COMPUTADOR
//                try {
//                    ServerSocket SERVER_SOCKETE = new ServerSocket(1779);
//                    Logs.log("Inicio el server");
//                    frmIngresar jf = new frmIngresar("");
//                    jf.setLocationRelativeTo(null);
//                    jf.setVisible(true);
//                } catch (IOException x) {
//                    //Informo al usuario
//                    JOptionPane.showMessageDialog(null, "EL SISTEMA YA SE ENCUENTRA EN EJECUCIÓN, ¡ YA HAY UNA SESIÓN ABIERTA !", "PRECAUCIÓN", JOptionPane.WARNING_MESSAGE);
//                    //En esta parte cierro la segunda instancia de la aplicación que se intenta abrir
//                    System.exit(0);
//                }

               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
