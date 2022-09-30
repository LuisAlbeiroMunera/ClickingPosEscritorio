package clases;
import com.google.gson.Gson;
import logs.Logs;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import configuracion.Propiedades;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class facturacionElectronica {
    
    Instancias instancias;
    String respuesta;
     
    public facturacionElectronica(String nitEmisor, String token){
         this.nitEmisor = nitEmisor;
         this.token = token;
    }
    
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    metodosGenerales metodos = new metodosGenerales();
    private String nitEmisor;
    private String token;
    private boolean prueba = false;
    
    public void setPrueba(boolean prueba) {
        this.prueba = prueba;
    }
   
  

    
    public static void main(String[] args) {
        facturacionElectronica fe = new facturacionElectronica("901049929-7", "eyJhbGciOiJIUzI1NiJ9.eyJwcm92ZWVkb3IiOiIxNSIsImlkIjoiOTMwOCJ9.UgE5l__6MpxfLgc7_P4j9Di5uNLljFGGIkDbknItT9Q");
        fe.setPrueba(true);
        JsonElement json = new JsonParser().parse("{ 'dsPrefijo': 'SETT', 'dsNumeroFactura': '1', 'fechaEmision': '2020-01-13 00:00:00', 'fechaVencimiento': '2020-01-13', 'emailAdquiriente': 'X@X.com', 'tipoIdentificacionAdquiriente': 'CEDULA_CIUDADANIA', 'identificacionAdquiriente': '0000000000', 'digitoVerificacionAdquirente': '0', 'tipoPersonaAdquiriente': 'NATURAL', 'nombresAdquiriente': 'Pesona', 'segundoNombre': 'Natural', 'primerApellido': 'de', 'segundoApellido': 'Prueba', 'direccionAdquiriente': 'calle 100', 'adquirenteResponsable': 'true', 'regimenAdquirente': 'RESPONSABLE_IVA', 'snDistribucionFisica': 'N', 'valorNeto': '1270.00', 'dsObservacion': 'None', 'tipoDocumentoElectronico': 'VENTA', 'valorBaseImponible': '1000.00', 'valorBrutoMasTributos': '1270.00', 'descuentoTotal': '0.00', 'cargoTotal': '0.00', 'anticipoTotal': '0.00', 'moneda': 'COP', 'valorBruto': '1000.00', 'tipoOperacion': 'GENERICA', 'dsResolucionDian': '18760000001', 'versionDian': '2', 'responsabilidadesFiscales': 'ZZ', 'ciudadAdquiriente': { 'dsNombre': 'Medellin', 'cdDane': '001', 'departamento': { 'dsNombre': 'Antioquia', 'cdDane': '05', 'cdIso': 'CO-ANT', 'pais': { 'dsNombre': 'Colombia', 'cdIso': 'CO' } } }, 'pago': { 'formaPago': 'CONTADO', 'medioPago': 'EFECTIVO' }, 'impuestosRetenciones': [ { 'valorTotal': '190.00', 'subtotales': [ { 'valorBase': '1000.00', 'valorImpuestoRetencion': '190.00', 'porcentaje': '19.00', 'tributo': 'IVA' } ] }, { 'valorTotal': '80.00', 'subtotales': [ { 'valorBase': '1000.00', 'valorImpuestoRetencion': '80.00', 'porcentaje': '8.00', 'tributo': 'INC' } ] } ], 'detalles': [ { 'numeroFactura': '1', 'codigoArticulo': 'COD001', 'descripcionArticulo': 'Descripcion 001', 'cantidad': '1', 'precioUnitario': '1000.00', 'valorTotalArticulo': '1270.00', 'nota': 'Nota Opcional', 'unidadMedida': 'UNIDAD', 'valorTotalBruto': '1000.00', 'valorTotalImpuestosRetenciones': '270.00', 'impuestosRetenciones': [ { 'valorTotal': '190.00', 'subtotales': [ { 'valorBase': '1000.00', 'valorImpuestoRetencion': '190.00', 'porcentaje': '19.00', 'tributo': 'IVA' } ] }, { 'valorTotal': '80.00', 'subtotales': [ { 'valorBase': '1000.00', 'valorImpuestoRetencion': '80.00', 'porcentaje': '8.00', 'tributo': 'INC' } ] } ] } ] }");
        try {
            fe.consumirServicio(json.getAsJsonObject().toString(), true);
        } catch (Exception ex) {
            Logs.error(ex);          
        }
    }

    public boolean consumirServicioApiClickingPos(String json, boolean showMsg,String nit,String dsNumeroFactura,String facturaRenvio){
        Logs.log("______________consumirServicioApiClickingPos_________________");
        Logs.log("Datos enviados al servicio:");
        Logs.log("Json Envio: "+json);
        Logs.log("muestra modal. showMsg: "+showMsg);
        Logs.log("nit: "+nit);
        Logs.log("dsNumeroFactura: "+dsNumeroFactura);
        Logs.log("facturaRenvio: "+facturaRenvio);
     try{
       Map<String, String> headApi = new HashMap<String, String>();
       headApi.put("NitEmisor", nit);
       headApi.put("Factura", facturaRenvio);
       RespuestaServicioEnvioFacturas respuesta = new RespuestaServicioEnvioFacturas();
       Respuesta respuestaError;
       String respuestaServicio = metodos.EnvioFacturaApiClikingPos(json,1,headApi,"");
       Logs.log("RespuestaServicio Facturacion: "+respuestaServicio);
       setRespuesta(respuestaServicio);
       Gson gSon = new Gson();
       
       try{
         respuesta = gSon.fromJson(respuestaServicio.toString(), RespuestaServicioEnvioFacturas.class);
       }catch(Exception e1){
           //validar si falla en el seteo de Respuesta.class
           System.err.println("entra-----");
        try{
         respuestaError = gSon.fromJson(respuestaServicio, Respuesta.class); 
         throw new ClassCastException("Erro en el servicio: "+respuestaError.mensaje);
        }catch(Exception exp){
            throw new ClassCastException("Error en el servicio de facturación");
        }
       } 
       //se setea esta variable para leerla desde el modulo de pnlFactura
       
       if(respuesta.getEstado().equals("000")){
        if(showMsg){   
         metodos.msgAdvertenciaAjustado(null, respuesta.getMensaje()+", Pendiente por Confirmacion de la Dian ");
        }
         Logs.log("FACTURA ELECTRONICA OK: "+respuesta.toString());
                  
       }else{
           Logs.log("ERROR EN FACTURA ELECTRONICA  ERROR: "+respuesta.toString());
       }
        
     }catch(Exception e){
        if(showMsg){
         metodos.msgAdvertenciaAjustado(null,"Error al generar la factura : "+e.toString());
        }
       Logs.log("ERROR EN EL SERVICIO: "+e.toString());   
       throw new ClassCastException(" Mensaje: "+e.toString());
       //return false;
     }  
       return true;
    }
    
    public boolean consumirServicio(String json, boolean showMsg) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Logs.debug("JSON A ENVIAR "+ json);
        Logs.debug("nitEmisor "+nitEmisor);
        Logs.debug("token "+token);
        
        InputStream inputStream = null;
        String respuestaCompletaWebService = "";

        try {
           
            HttpURLConnection myURLConnection = (HttpURLConnection) (new URL(Propiedades.getInstancia().getUrlFacturaElectronica() + nitEmisor).openConnection());
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestProperty("Version-Document", "2");
            myURLConnection.setRequestProperty("Authorization", token);
            myURLConnection.setDoOutput(true);
            myURLConnection.setConnectTimeout(60000);
            myURLConnection.setUseCaches(false);
            myURLConnection.setInstanceFollowRedirects(false);

            // myURLConnection.setRequestProperty("charset", "utf-8");
            try (OutputStream os = myURLConnection.getOutputStream()) {
                byte[] input = json.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = myURLConnection.getResponseCode();
            Logs.log("responseCode "+ responseCode);
            if (responseCode == 200) {
                inputStream = myURLConnection.getInputStream();
            } else {
                inputStream = myURLConnection.getErrorStream();
            }

            InputStreamReader isr = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String read = br.readLine();

            while (read != null) {
                respuestaCompletaWebService += read;
                read = br.readLine();
            }
        } finally {

        }
        
        try {
            Gson gSon = new Gson(); 
            JsonObject  respuestasServicio2 = gSon.fromJson(respuestaCompletaWebService.toString(), JsonObject.class);
            Logs.log("..Respuesta web service: " + respuestaCompletaWebService);
            System.err.println("respuestas"+respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("codigo"));
            if(respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("codigo").equals("EXITOSO")){
                
                //ENVIADO DIAN .... escalar como caso de soporte
                //406 ERROR CORREO EMISOR....  se debe enviar un correo generico en los emisores
                try {

                    Date fechaCreacion = sdf.parse(respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("fecha").toString());
                    Calendar c = Calendar.getInstance();
                    c.add(Calendar.MINUTE, -2);
                    Logs.log("Hora creada "+fechaCreacion.getTime()+ " actual menos 2 "+c.getTimeInMillis()+ " diferencia "  +(fechaCreacion.getTime() - c.getTimeInMillis()));
                } catch (Exception e) {
                    throw e;
                }
               
                if(!prueba && showMsg){
                    
                    String errorMensaje=""; 
                    String espacio="";
                    
                    for(int i=0;i<respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("errores").getAsJsonArray().size();i++){
                       errorMensaje += espacio+"- "+respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("errores").getAsJsonArray().get(i);
                       espacio="<br>"; 
                    }  
                    metodos.msgAdvertenciaAjustado(null, errorMensaje);
                
                }else{
                   Logs.log(respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("descripcion").toString());
                }
                return true;
            } else {
                JsonObject adquiriente = new JsonParser().parse(json).getAsJsonObject();
                String errorMensaje=""; 
                String espacio=""; 
                for(int i=0;i<respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("errores").getAsJsonArray().size();i++){
                   errorMensaje += espacio+"- "+respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("errores").getAsJsonArray().get(i);
                   espacio="<br>"; 
                }
                
                if(!prueba && showMsg){
                    metodos.msgAdvertenciaAjustado(null, "ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ "<br> - "+respuestasServicio2.get("estado").getAsJsonObject().get("descripcion").getAsString() + "<br> -"+errorMensaje);
                }else{
                    Logs.log("ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ "<br> - "+respuestasServicio2.get("estado").getAsJsonObject().get("descripcion").getAsString() + "<br> -"+errorMensaje);
                }
                return false;
            }
        } catch (Exception e) {
            JsonObject adquiriente = new JsonParser().parse(json).getAsJsonObject();
             if(!prueba && showMsg){
                 metodos.msgAdvertenciaAjustado(null, "ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ "<br> "+respuestaCompletaWebService);
             }else{
                 Logs.log("ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ "<br> "+respuestaCompletaWebService);
             }
             throw e;
        }
    }

    
    public boolean consumirServicioNota(String json, boolean showMsg) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Logs.debug("JSON A ENVIAR "+ json);
        Logs.debug("nitEmisor "+nitEmisor);
        Logs.debug("token "+token);
        
        InputStream inputStream = null;
        String respuestaCompletaWebService = "";

        try {
           
            HttpURLConnection myURLConnection = (HttpURLConnection) (new URL(Propiedades.getInstancia().getUrlFacturaElectronica() + nitEmisor).openConnection());
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestProperty("Version-Document", "2");
            myURLConnection.setRequestProperty("Authorization", token);
            myURLConnection.setDoOutput(true);
            myURLConnection.setConnectTimeout(60000);
            myURLConnection.setUseCaches(false);
            myURLConnection.setInstanceFollowRedirects(false);

            // myURLConnection.setRequestProperty("charset", "utf-8");
            try (OutputStream os = myURLConnection.getOutputStream()) {
                byte[] input = json.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = myURLConnection.getResponseCode();
            Logs.log("responseCode "+ responseCode);
            if (responseCode == 200) {
                inputStream = myURLConnection.getInputStream();
            } else {
                inputStream = myURLConnection.getErrorStream();
            }

            InputStreamReader isr = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String read = br.readLine();

            while (read != null) {
                respuestaCompletaWebService += read;
                read = br.readLine();
            }
        } finally {

        }
        
        try {
            Gson gSon = new Gson(); 
            JsonObject  respuestasServicio2 = gSon.fromJson(respuestaCompletaWebService.toString(), JsonObject.class);
            Logs.log("..Respuesta web service: " + respuestaCompletaWebService);
            
            if(respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("codigo").getAsString().equals("EXITOSO")){
                
                //ENVIADO DIAN .... escalar como caso de soporte
                //406 ERROR CORREO EMISOR....  se debe enviar un correo generico en los emisores
                try {

                    Date fechaCreacion = sdf.parse(respuestasServicio2.getAsJsonObject().get("fecha").getAsString());
                    Calendar c = Calendar.getInstance();
                    c.add(Calendar.MINUTE, -2);
                    Logs.log("Hora creada "+fechaCreacion.getTime()+ " actual menos 2 "+c.getTimeInMillis()+ " diferencia "  +(fechaCreacion.getTime() - c.getTimeInMillis()));
            
                } catch (Exception e) {
                    throw e;
                }
               
                if(!prueba && showMsg){
                    
                    String errorMensaje=""; 
                    String espacio="";
                    if(Objects.isNull(respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("notificaciones"))){
                        for(int i=0;i<respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("notificaciones").getAsJsonArray().size();i++){
                           errorMensaje += espacio+"- "+respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("errores").getAsJsonArray().get(i);
                           espacio="<br>"; 
                        }  
                    }else{
                      errorMensaje=respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("descripcion").getAsString();
                    }
                    metodos.msgAdvertenciaAjustado(null, errorMensaje);
                
                }else{
                   Logs.log(respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("descripcion").toString());
                }
                return true;
            } else {
                JsonObject adquiriente = new JsonParser().parse(json).getAsJsonObject();
                String errorMensaje=""; 
                String espacio=""; 
                for(int i=0;i<respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("errores").getAsJsonArray().size();i++){
                   errorMensaje += espacio+"- "+respuestasServicio2.getAsJsonObject().get("estado").getAsJsonObject().get("errores").getAsJsonArray().get(i);
                   espacio="<br>"; 
                }
                
                if(!prueba && showMsg){
                    metodos.msgAdvertenciaAjustado(null, "ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ "<br> - "+respuestasServicio2.get("estado").getAsJsonObject().get("descripcion").getAsString() + "<br> -"+errorMensaje);
                }else{
                    Logs.log("ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ "<br> - "+respuestasServicio2.get("estado").getAsJsonObject().get("descripcion").getAsString() + "<br> -"+errorMensaje);
                }
                return false;
            }
        } catch (Exception e) {
            Logs.debug("JSON A ENVIAR "+ e);
            JsonObject adquiriente = new JsonParser().parse(json).getAsJsonObject();
             if(!prueba && showMsg){
                 metodos.msgAdvertenciaAjustado(null, "ERROR EN NOTA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ "<br> "+respuestaCompletaWebService);
             }else{
                 Logs.log("ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ "<br> "+respuestaCompletaWebService);
             }
//             throw e;
             return false;
        }
    }

    public boolean consumirServicio2(String json, boolean showMsg) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Logs.debug("JSON A ENVIAR "+ json);
        Logs.debug("nitEmisor "+nitEmisor);
        Logs.debug("token "+token);
        
        InputStream inputStream = null;
        String respuestaCompletaWebService = "";

        try {
           
            HttpURLConnection myURLConnection = (HttpURLConnection) (new URL(Propiedades.getInstancia().getUrlFacturaElectronica() + nitEmisor).openConnection());
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            myURLConnection.setRequestProperty("Content-Type", "application/json");
            myURLConnection.setRequestProperty("Version-Document", "2");
            myURLConnection.setRequestProperty("Authorization", token);
            myURLConnection.setDoOutput(true);
            myURLConnection.setConnectTimeout(60000);
            myURLConnection.setUseCaches(false);
            myURLConnection.setInstanceFollowRedirects(false);

            // myURLConnection.setRequestProperty("charset", "utf-8");
            try (OutputStream os = myURLConnection.getOutputStream()) {
                byte[] input = json.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = myURLConnection.getResponseCode();
            Logs.log("responseCode "+ responseCode);
            if (responseCode == 200) {
                inputStream = myURLConnection.getInputStream();
            } else {
                inputStream = myURLConnection.getErrorStream();
            }

            InputStreamReader isr = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String read = br.readLine();

            while (read != null) {
                respuestaCompletaWebService += read;
                read = br.readLine();
            }
        } finally {
//            inputStream.close();
        }
        
        try {
           Logs.log("Respuesta web service: " + respuestaCompletaWebService);
           JsonArray respuestaArray = new JsonParser().parse(respuestaCompletaWebService).getAsJsonArray();
           JsonObject respuesta = respuestaArray.get(0).getAsJsonObject();
           int codigoRespuesta = respuesta.get("estado").getAsJsonObject().get("codigo").getAsInt();

            if (codigoRespuesta == 3 || codigoRespuesta == 2 || codigoRespuesta == 5 || codigoRespuesta == 6 || codigoRespuesta == 406 || codigoRespuesta == 001 ){
                
                //ENVIADO DIAN .... escalar como caso de soporte
                //406 ERROR CORREO EMISOR....  se debe enviar un correo generico en los emisores
                try {
                    Date fechaCreacion = sdf.parse(respuesta.get("detalle").getAsString());
                    Calendar c = Calendar.getInstance();
                    c.add(Calendar.MINUTE, -2);
                    Logs.log("Hora creada "+fechaCreacion.getTime()+ " actual menos 2 "+c.getTimeInMillis()+ " diferencia "  +(fechaCreacion.getTime() - c.getTimeInMillis()));
//                    if(fechaCreacion.getTime() < c.getTimeInMillis()){
//                        if(!prueba && showMsg){
//                            metodos.msgAdvertenciaAjustado(null, "FACTURA YA ENVIADA, EL ESTADO ES "+respuesta.get("estado").getAsJsonObject().get("descripcion").getAsString()+ " FECHA CREACION "+respuesta.get("detalle").getAsString());
//                        }else{
//                            Logs.log(respuesta.get("estado").getAsJsonObject().get("descripcion").getAsString() +" FECHA CREACION "+respuesta.get("detalle").getAsString());
//                        }
//                        return false;
//                    }
                } catch (Exception e) {
                    throw e;
                }
               
                if(!prueba && showMsg){
                    metodos.msgAdvertenciaAjustado(null, respuesta.get("estado").getAsJsonObject().get("descripcion").getAsString());
                }else{
                    Logs.log(respuesta.get("estado").getAsJsonObject().get("descripcion").getAsString());
                }
                return true;
            } else {
                JsonObject adquiriente = new JsonParser().parse(json).getAsJsonObject();
                if(!prueba && showMsg){
                    metodos.msgAdvertenciaAjustado(null, "ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ ", " + codigoRespuesta +" - "+respuesta.get("estado").getAsJsonObject().get("descripcion").getAsString() + "-"+respuesta.get("detalle").getAsString());
                }else{
                    Logs.log("ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ ", "  + codigoRespuesta +" - "+respuesta.get("estado").getAsJsonObject().get("descripcion").getAsString() + "-"+respuesta.get("detalle").getAsString());
                }
                return false;
            }
        } catch (Exception e) {
            JsonObject adquiriente = new JsonParser().parse(json).getAsJsonObject();
             if(!prueba && showMsg){
                 metodos.msgAdvertenciaAjustado(null, "ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ ", "+respuestaCompletaWebService);
             }else{
                 Logs.log("ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " +adquiriente.get("identificacionAdquiriente")+ ", "+respuestaCompletaWebService);
             }
             throw e;
        }

      
    }
   
    public Respuesta sendPOSTFactura(String metodo, String POST_URL, String credenciales, String authHeaderValue,String ruta,String nombre) {
        Respuesta respuesta = new Respuesta();
        try {
            URL obj = new URL(POST_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod(metodo);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", authHeaderValue);
            System.err.println("Authorization"+authHeaderValue);
            System.err.println("metodo"+metodo);
            System.err.println("POST_URL"+POST_URL);
            System.err.println("credenciales"+credenciales);
            System.err.println("ruta"+ruta);
            System.err.println("nombre"+nombre);
            con.setDoOutput(true);
            con.setDoInput(true);
            if (!credenciales.equals("")) {
                try (OutputStream os = con.getOutputStream()) {
                    byte[] input = credenciales.getBytes("utf-8");
                    os.write(input, 0, input.length);
                    os.flush();
                    os.close();
                }
            }

            int responseCode = con.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) { //success

                InputStream inputStream = con.getInputStream();
                byte[] buffer = new byte[2048];
                int bufferLength = 0;
                String filename = nombre;   // you can download to any type of file ex:.jpeg (image) ,.txt(text file),.mp3 (audio file)
                File file = new File(ruta, filename);

                //=====================================
                if (file.createNewFile()) {
                    file.createNewFile();
                }
                FileOutputStream fileOutput = new FileOutputStream(file);

                while ((bufferLength = inputStream.read(buffer)) > 0) {
                    fileOutput.write(buffer, 0, bufferLength);
                }

                fileOutput.close();
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
                respuesta.setError(true);
                respuesta.setMensaje("Http Respuesta: Abrir PDF");
                return respuesta;
            } else {
                respuesta.setError(true);
                respuesta.setMensaje("Http Respuesta: " + responseCode + " " + con.getResponseMessage());
                return respuesta;
            }
        } catch (Exception e) {
            Logs.log("Error sendPOST: " + e.getMessage());
            respuesta.setError(true);
            respuesta.setMensaje("Respuesta: " + e.getMessage());
            return respuesta;
        }
    }
    
} 
