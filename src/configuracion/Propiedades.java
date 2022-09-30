/*
 * Clase que permite hablitar el ambiente para el cual se ejecutara la app
 */
package configuracion;
import clases.Token;

/**
 * Fecha 23/01/2020
 * @version 2.0.0
 * @author johnj
 */
public class Propiedades {
    
    private static Propiedades instancia;
    private boolean isPrueba = true;
    private int timeoutPTM = 5000;                                         
    public final static String secret = "5HU2;)F(:fgZ.pfS%";
    public final static String Login = "/auth/login" ;
    public final static String CrearCliente = "/cliente/crear-cliente" ;
    public final static String ModificarCliente = "/cliente/modificar-cliente" ;
    public final static String DatosCliente = "/cliente/datos-cliente/" ;
    public final static String ActivarCliente = "/cliente/activar-cliente/" ;
    public final static String ServicioPrefacturaPTM ="/prefactura/consultar-prefacturas/";
    public final static String ServicioPrefacturaModificarPTM ="/prefactura/modificar-prefactura/";
    public final static String ServicioGuardarFactura ="/factura/guardar-factura";
    public final static String ServicioRespuestaFactura ="/factura/respuestas-factura/";
    public final static String ServicioArchivoBanco ="/pagosBanco/generarArchivo";
    public static Token tokenUsuario = new Token();

    public static Propiedades getInstancia(){
        if(instancia == null){
            instancia = new Propiedades();
        }
        return instancia;
    }


    public String getUrlPTM() {
        if(isPrueba){
           // return  "http://dllo.ptm.com.co:8080/PTMWS/services/ServiciosPTMWS.ServiciosPTMWS";
           return  "http://pruebas.ptm.com.co/PTMWS/services/ServiciosPTMWS.ServiciosPTMWS";
        }else{
           return "https://www.comercialcard.com.co/PTMWS/services/ServiciosPTMWS.ServiciosPTMWS";
        }
    }
    
    public int getTimeoutPTM() {
        return timeoutPTM;
    }
    public String getTerceroPTM() {
        if(isPrueba){
           // return  "9877777771";
            return  "6315992471";
        }else{
           return "6315992471";
        }
    }

    public String getPassTerceroPTM() {
        if(isPrueba){
            //return  "015b4847d896533acc39a8ae18357045";
           return  "C1m31p$nG$#ptM$pr5";
        }else{
           return "p4$cL3Ck#nGP#R4p$TM";
        }
    }
    
    public String getPassRest() {
        if(isPrueba){
           return  "69wE8AULUm3CCB64DopyTS6Ys2t8LVEP9SvnayvvZLs=";
        }else{
          return  "69wE8AULUm3CCB64DopyTS6Ys2t8LVEP9SvnayvvZLs=";  
//          return  "/8KmT3anKLW4RD9x7zViBjy7rm9rf7+9lBklJ3kZHLA=";
        }
    }
    
    public String getUsuarioRest() {
        if(isPrueba){
           return  "ClickingPos";
        }else{
           return  "ClickingPos";
        }
    }

    public String getHashEncricionPTM() {
        if(isPrueba){
           // return  "pruebaDesarrollo";
            return  "w2p4s$EncrYptPr5tr$ck8$";
        }else{
           return "p1$$#enCcL3NG#rYp4$rv*q";
        }
    }
    
    public String getUrlFacturaElectronica() {
        if(isPrueba){
           return  "https://demo.dominadigital.com.co/DCloudProcessorReceptorFacturas/rest/ReceptorFacturaJson/";
//           return  "https://alfauat.dominadigital.com.co/api/ReceptorFacturaJson/";
        }else{
           return "https://www.dominadigital.com.co/DCloudProcessorReceptorFacturas/rest/ReceptorFacturaJson/";
//           return "https://alfaprod.dominadigital.com.co/api/ReceptorFacturaJson/";
        }
    }
    
    public String getUrlFacturaElectronicaPdf() {
        if(isPrueba){
           return "https://demo.dominadigital.com.co/DCloudServices/restprivate/descargaFacturaService";
//            return "https://alfauat.dominadigital.com.co/api/DescargaFactura"; 
        }else{
           return "https://www.dominadigital.com.co/DCloudServices/restprivate/descargaFacturaService";
//            return "https://alfaprod.dominadigital.com.co/api/DescargaFactura";
        }
    }
    
    public String getUrlFacturaElectronicaPanama() {
        if(isPrueba){
            return  "http://201.221.224.124:91/panama/";
        }else{
//           return "http://186.188.207.57:80/panama/";
           return "http://190.140.49.4:80/panama/";
        }
    }
    
    
    //Llave o contraseña para la comunicación, no siempre es requerida solo si el cliente la desea usar
    public String getAppiCodePanama() {
         
        if(isPrueba){
            return  "";
        }else{
           return "";
        }
    }

  
    
    public int getPosponer() {
        return 100;
    }
    
    public String getUrlClickingPosWeb(){    
       if(isPrueba){
            return "https://clickingpostest.transacciones.com.co/clickingpos/login";
        }else{
            return "https://clickingpos.transacciones.com.co/clickingposapi/login";
        }
    }
    

    public String getUrlFuncionesLambdaAWS() {
        if(isPrueba){
            return  "https://ujvgudsfe4.execute-api.us-east-2.amazonaws.com/dev/testbd";
        }else{
            return "https://ujvgudsfe4.execute-api.us-east-2.amazonaws.com/prod/suspen-prod";
        }
    }
    /*
      Servicio Rest que reemplaza a la funcion  lambda
    */
    public String getUrlFuncionesRest() {
        if(isPrueba){
            //return "http://localhost:8081/clickingposapi";
            return "https://clickingpostest.transacciones.com.co/clickingposapi";
        }else{
            //return "http://localhost:8082/clickingposapi";
            return "https://clickingpos.transacciones.com.co/clickingposapi";
        }
    }
    
        public String getUrlFuncionesRestBTW() {
        if(isPrueba){
            //return "http://localhost:8081/clickingposapi";
            return "https://test-apiconnect.febtw.co/auth/Autenticacion";
        }else{
            //return "http://localhost:8082/clickingposapi";
            return "https://test-apiconnect.febtw.co/auth/Autenticacion";
        }
    }
    
    

    public String getHostSFTP() {
        if(isPrueba){
            return  "179.50.92.34";
        }else{
           return "179.50.92.34";
        }
    }

    public int getPuertoSFTP() {
        if(isPrueba){
            return  9821;
        }else{
           return 9821;
        }
    }

    public String getUsuarioSFTP() {
        if(isPrueba){
            return  "usr_clickpru";
        }else{
           return "usr_clickpro";
        }
    }

    public String getPasswordSFTP() {
        if(isPrueba){
            return  "cLr4mPr5#t2C";
        }else{
           return "pr4Cl1$l2r5";
        }
    }

    public String getDirSFTP() {
        if(isPrueba){
            return  "VERSIONES/";
        }else{
           return "VERSIONES/";
        }
    }

    public String getUsuarioDB() {
        if(isPrueba){
            return  "click";
        }else{
           return "click";
        }
    }

    public String getPasswordDB() {
        if(isPrueba){
            return  "cl1ckP4$4yMzf";
        }else{
           return "cl1ckP4$4yMzf";
        }
    }

}
