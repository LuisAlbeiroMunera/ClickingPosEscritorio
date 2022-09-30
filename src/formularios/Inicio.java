
package formularios;

import clases.Instancias;
import clases.RespuestaServicioRest;
import clases.metodosGenerales;
import com.google.gson.Gson;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import configuracion.Propiedades;
import configuracion.ndConfiguracion;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import javax.swing.JOptionPane;
import logs.Logs;

/**
 *
 * @author johnj
 */
public class Inicio extends javax.swing.JFrame{
    Instancias instancias;
    metodosGenerales metodos = new metodosGenerales();
    private static Inicio laInstancia;
    private boolean existeActualizacion;
    
    public static Inicio getInstancia(){
        if(laInstancia == null){
            laInstancia = new Inicio();
        }
        return laInstancia;
    }
    public static void main(String[] args) {
         Inicio.getInstancia().iniciando();    
    }
    
    
    public void iniciando(){
        instancias = Instancias.getInstancias();
       try{
        instancias.cargarConfiguracionesInicial();
       }catch(Exception exp){
           System.err.println("Error por BD ");
       }
        try {
            Socket s = new Socket(Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            if (s.isConnected()) {
                    Logs.log("Inicia validación de actualización");
                    conexionSFTP();
                    Logs.log("Termina validación de actualización"); 
            }else{
                Object[][] datos = instancias.getSql().getMultiempresas();
                if (datos.length > 1) {
                    frmIngresarMulti multiempresas = new frmIngresarMulti(this);
                    multiempresas.show();
                } else {
                    iniciarAplicacion("");
                }
            }
        } catch (Exception e) {
                Object[][] datos = instancias.getSql().getMultiempresas();
                if (datos.length > 1) {
                    frmIngresarMulti multiempresas = new frmIngresarMulti(this);
                    multiempresas.show();
                } else {
                    iniciarAplicacion("");
                }
        }
       
    }
    
    
     private void conexionSFTP() {
         Session session = null;
         Channel channel = null;
         ChannelSftp channelSftp = null;

        try {
            JSch jsch = new JSch();
            session = jsch.getSession(Propiedades.getInstancia().getUsuarioSFTP(), Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            session.setPassword(Propiedades.getInstancia().getPasswordSFTP());
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();

            channelSftp = (ChannelSftp) channel;
            Vector<ChannelSftp.LsEntry> list = channelSftp.ls(Propiedades.getInstancia().getDirSFTP());

            String versionActual = instancias.getSql().getVersion();

            existeActualizacion = false;
            List<Integer> listaVersiones = new ArrayList<Integer>();
            for (ChannelSftp.LsEntry entry : list) {
                if (entry.getFilename().length() >= 5) {
                      int versionSFTP = Integer.parseInt(entry.getFilename().replace(".", ""));
                      Logs.log("Nueva Versión "+versionSFTP);
                    if (Integer.parseInt(versionActual.replace(".", "")) < versionSFTP) {
                        Logs.log("Versión actual  "+Integer.parseInt(versionActual.replace(".", "")));
                        existeActualizacion = true;
                        listaVersiones.add(versionSFTP);     
                    }
                }
            }

            while (session != null) {
                session.disconnect();
                session = null;
            }
            
            if (existeActualizacion) {
                 try {
                    metodos.createFile();                  
                    int multiempresasA = 1;
                    try {
                        multiempresasA = Integer.parseInt(instancias.getSql().getNumConsecutivoActual("MULTI")[0].toString());
                    } catch (Exception e) {
                        Logs.error(e);
                    }
                    if(multiempresasA == 0){
                        multiempresasA=1;
                    }       
                    
                    Collections.sort(listaVersiones);
                    String actualizacionPendiente = listaVersiones.get(0).toString();
                    String version = "";
                    String versionUltima = "";
                    String actualizacionUltima = listaVersiones.get(listaVersiones.size()-1).toString();
                    
                    for(int i=0; i<actualizacionUltima.length();i++ )  {
                        
                        if(i == 0){
                            versionUltima = ""+actualizacionUltima.charAt(i);
                        }else{
                            versionUltima = versionUltima+"."+actualizacionUltima.charAt(i);  
                        }
                    }
                    
                    for(int i=0; i<actualizacionPendiente.length();i++ )  {
                        
                        if(i == 0){
                            version = ""+actualizacionPendiente.charAt(i);
                        }else{
                            version = version+"."+actualizacionPendiente.charAt(i);  
                        }
                        System.err.println(i+"- version:::  "+version);
                    }
                    this.dispose();
                    
                    ////////////////LECTURA DE ARCHIVO JSON///////////
                    boolean socket = iniciarAplicacionSegundoPlano(12345);
                    boolean procesoNormal=true;
                    
                    try {
                        
                        Properties properties = new Properties();
                        properties = metodos.readFile();
                        int procesoGeneral = !properties.get("proceso").equals("") ? Integer.parseInt(properties.get("proceso").toString()) : 0;
                        int procesoBackup = !properties.get("backupProceso").equals("") ? Integer.parseInt(properties.get("backupProceso").toString()) : 0;
                        int procesoActualizacion = !properties.get("descargaProceso").equals("") ? Integer.parseInt(properties.get("descargaProceso").toString()) : 0;
                        int descragaCompleta = !properties.get("descargaCompleta").equals("") ? Integer.parseInt(properties.get("descargaCompleta").toString()) : 0;
                        String versionActualSistema = !properties.get("version").equals("") ? properties.get("version").toString() : "";
                        String versionDescargadaSistema = !properties.get("descargaVersion").equals("") ? properties.get("descargaVersion").toString() : "";

                        
                        if (procesoGeneral != 1 && procesoBackup != 1 && procesoActualizacion != 1 && !socket && (!versionUltima.equals(versionDescargadaSistema) || versionDescargadaSistema == "")) {
                            System.err.println("No ingresa Auto");
                            try{ 
                            File f = new File("clickSegundoPlano.jar"); 
                            if (f.exists()){
                                System.out.println("Exists");
                                String sentencia = System.getProperty("user.dir")+"\\jre8\\bin\\java -jar clickSegundoPlano.jar bdclick " + multiempresasA + " " + Propiedades.getInstancia().getUsuarioDB() + " " + Propiedades.getInstancia().getPasswordDB() + " " + Propiedades.getInstancia().getUsuarioSFTP() + " " + Propiedades.getInstancia().getHostSFTP() + " " + Propiedades.getInstancia().getPuertoSFTP() + " " + Propiedades.getInstancia().getPasswordSFTP() + " VERSIONES/ " + versionActual + " 1 " + versionUltima + "";
                                System.err.println("Imprima cmd: "+sentencia);
                                ProcessBuilder pb = new ProcessBuilder("CMD", "/C", sentencia);
                                Process p = pb.start();
                                procesoNormal = false;
                            }else{
                                procesoNormal = true;
                                System.out.println("Does not Exists");
                            }
                            
                          }catch(Exception exp){
                              System.err.println("Error no existe file ");
                              procesoNormal = true;
                          }
                        } else if (procesoGeneral == 0 && procesoBackup == 0 && procesoActualizacion == 0 && versionUltima.equals(versionDescargadaSistema) && descragaCompleta==1) {
                          System.err.println("actualiza pendiente");
                           try{ 
                            dlgActualizacionPendiente actualizaciones = new dlgActualizacionPendiente();
                            actualizaciones.ActualizarVersion(versionUltima);
                            procesoNormal = false;
                          }catch(Exception exp){
                              procesoNormal = true;
                          }
                        }else if (procesoGeneral == 1 && socket){
                            System.err.println("por socket");
                              procesoNormal = false;
                        }else{
                            System.err.println("procesoGenerala-"+procesoGeneral);
                            System.err.println("socketa-"+socket);
                            System.err.println("Abre Ventana de actualizacion");
                            System.err.println("1-valicadion "+(procesoGeneral != 1 && procesoBackup != 1 && procesoActualizacion != 1 && !socket && (!versionUltima.equals(versionDescargadaSistema) || versionDescargadaSistema == "")));
                            System.err.println("2-valicadion "+(procesoGeneral == 0 && procesoBackup == 0 && procesoActualizacion == 0 && versionUltima.equals(versionDescargadaSistema) && descragaCompleta==1));
                            System.err.println("Dtos 1-valicadion Proceso: ("+procesoGeneral+") procesoBackup:  ("+ procesoBackup+") procesoActualizacion: ("+ procesoActualizacion+") versionUltima: ("+ versionUltima +") versionDescargadaSistema: ("+versionDescargadaSistema+") descragaCompleta: (" +descragaCompleta+") socket: ("+socket+")");
                            
                        }
                    } catch (Exception exp) {
                        procesoNormal = true;
                        Logs.log("Descarga Segundo Plano: " + exp.getMessage());
                    }
                    
                  if(procesoNormal){  
                    ///////////////////////////
                    dlgActualizacionPendiente actualizacion = new dlgActualizacionPendiente(version, versionActual, this, listaVersiones);
                    ///aqui debo validar si es obligatorio o no
                    String actualizacionObligatoria="1";
                     try{
                       ndConfiguracion nodoConf = instancias.getSql().getDatosConfiguracionInicial();
                       frmIngresar frmIngresar = new frmIngresar();
                       RespuestaServicioRest respuestaServicio = metodos.consultarEstado(frmIngresar.codigoEncriptado(nodoConf.getNit(), nodoConf.getNombre()),1);
                       
                       actualizacionObligatoria=respuestaServicio.getCliente().getActualizacionObligatoria();                   
                     }catch(Exception exp){
                          Logs.log("Mensaje: " + exp.getMessage());
                     }
                    
                    Properties properties = new Properties();
                    properties = metodos.readFile();
                    SimpleDateFormat sdfin = new SimpleDateFormat();
                    sdfin = metodos.generarFecha("dd_MM_yyyy");//fechaFin backup 
                    properties.setProperty("inicioFecha",sdfin.format(Calendar.getInstance().getTime()));
                    sdfin = metodos.generarFecha("hh_mm_ss");
                    properties.setProperty("inicioHora",sdfin.format(Calendar.getInstance().getTime()));
                    properties.setProperty("proceso","1");
                    properties.setProperty("version",versionUltima);//version actual        
                    properties.setProperty("borraArchivoDescarga","");
                    Gson gson = new Gson();
                    String json = gson.toJson(properties);
                    metodos.writeFile(json);
                    
                    if (instancias.getSql().getNumeroFacturas() > 0 && actualizacionObligatoria.equals("0")) {
                        actualizacion.setVisible(true);
                    } else {
                        actualizacion.presionarAutoGuardar();
                    }
                    
                    properties.setProperty("finFecha",sdfin.format(Calendar.getInstance().getTime()));//fechaFin backup
                    sdfin = metodos.generarFecha("hh_mm_ss");
                    properties.setProperty("finHora",sdfin.format(Calendar.getInstance().getTime()));
                    properties.setProperty("proceso","0");
                    json = gson.toJson(properties);
                    metodos.writeFile(json);
                 }else{
                    Object[][] datos = instancias.getSql().getMultiempresas();
                    if (datos.length > 1) {
                        System.err.println("Carga multiempresa:  "+datos.length);
                        frmIngresarMulti multiempresas = new frmIngresarMulti(this);
                        multiempresas.show();
                    } else {
                        iniciarAplicacion("");
                    }    
                 }
                } catch (Exception e) {
                     Logs.error(e);
                     metodos.msgError(null, "Ocurrio un error durante la actualización");                 
                }
            }else{  
                Object[][] datos = instancias.getSql().getMultiempresas();
                if (datos.length > 1) {
                    frmIngresarMulti multiempresas = new frmIngresarMulti(this);
                    multiempresas.show();
                } else {
                    iniciarAplicacion("");
                }
            }

        } catch (Exception ex) {
            Logs.error("Error en el cargue ");
            Logs.error(ex);
            ex.getStackTrace();
        }
    }
    
     
    public void iniciarAplicacion(String nombre){
        try {
            ServerSocket SERVER_SOCKETE = new ServerSocket(9821);
            this.instancias.socket = SERVER_SOCKETE;
            Logs.log("Inicio el server");
            frmIngresar ingresar = new frmIngresar(nombre);
            ingresar.enviarInstancia(this);
            ingresar.show();
       } catch (IOException x) {
           //Informo al usuario
            JOptionPane.showMessageDialog(null, "EL SISTEMA YA SE ENCUENTRA EN EJECUCIÓN, ¡ YA HAY UNA SESIÓN ABIERTA !", "PRECAUCIÓN", JOptionPane.WARNING_MESSAGE);
           //En esta parte cierro la segunda instancia de la aplicación que se intenta abrir
           System.exit(0);
       }

    }
    
    public boolean iniciarAplicacionSegundoPlano(int puerto){
        boolean abierto=true;
        try {
            ServerSocket SERVER_SOCKETE = new ServerSocket(puerto);
            abierto=false;
            SERVER_SOCKETE.close();
       } catch (IOException x) {
           abierto=true;
       }
        return abierto;
    }  

}
