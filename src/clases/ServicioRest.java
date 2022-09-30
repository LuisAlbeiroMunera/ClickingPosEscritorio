/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import logs.Logs;
import com.google.gson.JsonSyntaxException;
import configuracion.Propiedades;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author amgon
 */
public class ServicioRest {

    HttpURLConnection myURLConnection;
    private String json="";
    private String url="";
    
    private static final String CONTENT_TYPE = "application/json";
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String POST_PARAMS = "userName=Pankaj";
    private static String GET_URL = "";
    private static final String POST_URL = "";
    metodosGenerales metodos = new metodosGenerales();
    
    public ServicioRest(String url) {
      GET_URL = url;      
    }
  
    public void SetDatosEnvio(String json){
       this.json= json;
    }
    
    public String GetDatosEnvio(){
       return this.json;
    }
    
    /*
      funcion que retorna el token que se realiza al servicio web 
    */
    public Token GetToken(){     
        Token toke= null;
        String url=this.GET_URL + Propiedades.getInstancia().Login;
        String pass =Propiedades.getInstancia().getPassRest();
        System.err.println("pass: "+pass);
        String user =Propiedades.getInstancia().getUsuarioRest(); 
        System.err.println("user:       "+user);
        Usuario usuario = new Usuario(); 
        usuario.setUserName(user);
        usuario.setPassword(pass);     
        final Gson gson = new Gson();
	final String credenciales = gson.toJson(usuario);
        Logs.log("_______________________GetToken______________________________");
        Logs.log("Url "+url);
//        Logs.log("credenciales "+credenciales);
        Logs.log("_____________________________________________________________");
        
        Respuesta respuesta  = sendPOST("POST",url,credenciales,"");
        if(!respuesta.isError()){
        Gson gSon = new Gson();
            try{
             toke = gSon.fromJson(respuesta.getObjecto().toString(), Token.class);
             try{
                 DateTimeFormatter sdformat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                 toke.setFechaGeneraToken(sdformat.format(LocalDateTime.now()));
             }catch(Exception exp){
               Logs.error("Error al generar Fecha de Token ");
             }
            }catch (IllegalStateException | JsonSyntaxException exception){
                metodos.msgError(null, exception.getMessage());
                System.exit(0);
            }
        }else{
            Logs.error("Error en el Servicio: "+respuesta.mensaje);
            Logs.error("Uno de los servicios esta presentando problemas de conexión, puedes continuar trabajando mientras se restablece el servicio");
            
//            metodos.msgAdvertenciaAjustado(null, "Uno de los servicios esta presentando problemas de conexión, puedes continuar trabajando mientras se restablece el servicio");
//            System.exit(0);
            return toke;  
        }        
        return toke;
    }
    
     public Token GetTokenBTW(){     
        Token toke= null;
        String url=this.GET_URL + Propiedades.getInstancia().Login;
        String pass =Propiedades.getInstancia().getPassRest();
        String user =Propiedades.getInstancia().getUsuarioRest();                
        Usuario usuario = new Usuario(); 
        usuario.setUserName("11CF161974101C74");
        usuario.setPassword("11CF161974101C74");     
        final Gson gson = new Gson();
	final String credenciales = gson.toJson(usuario);
        Logs.log("_______________________GetToken______________________________");
        Logs.log("Url "+url);
//        Logs.log("credenciales "+credenciales);
        Logs.log("_____________________________________________________________");
        
        Respuesta respuesta  = sendPOST("POST",url,credenciales,"");
        if(!respuesta.isError()){
        Gson gSon = new Gson();
            try{
             toke = gSon.fromJson(respuesta.getObjecto().toString(), Token.class);
             try{
                 DateTimeFormatter sdformat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                 toke.setFechaGeneraToken(sdformat.format(LocalDateTime.now()));
             }catch(Exception exp){
               Logs.error("Error al generar Fecha de Token ");
             }
            }catch (IllegalStateException | JsonSyntaxException exception){
                metodos.msgError(null, exception.getMessage());
                System.exit(0);
            }
        }else{
            Logs.error("Error en el Servicio: "+respuesta.mensaje);
            Logs.error("Uno de los servicios esta presentando problemas de conexión, puedes continuar trabajando mientras se restablece el servicio");
            
//            metodos.msgAdvertenciaAjustado(null, "Uno de los servicios esta presentando problemas de conexión, puedes continuar trabajando mientras se restablece el servicio");
//            System.exit(0);
            return toke;  
        }        
        return toke;
    }
    
    /*
       funion que retorna el servicio en forma RespuestaServicioRest
      @param : complementoUrl : complemento de la Url 
      @param : token : token para realizar la consulta 
    */
    public RespuestaServicioRest GetCliente(String complementoUrl,String token){ 
        String url=this.GET_URL+complementoUrl;
        RespuestaServicioRest respuestaServicio = null;
        Logs.log("________________________GetCliente___________________________");
        Logs.log("Url "+url);
//        Logs.log("Token "+token);
        Logs.log("_____________________________________________________________");
        Respuesta respuesta = sendPOST("GET",url,"",token);        
        if(!respuesta.isError()){
         
          Gson gSon = new Gson();
          respuestaServicio = gSon.fromJson(respuesta.getObjecto().toString(), RespuestaServicioRest.class);
          
          Logs.log("respuestaServicio "+respuestaServicio);
        }else{
            Logs.log("Respuesta del servicio "+respuesta.mensaje);
            metodos.msgError(null, respuesta.mensaje);
            System.exit(0);
        }  
        return respuestaServicio;
    }
    
    /*
       funion que retorna el servicio en forma RespuestaServicioRest
      @param : complementoUrl : complemento de la Url 
      @param : token : token para realizar la consulta 
    */
    public RespuestaServicioFactura GetServicioApi(String complementoUrl,String token){ 
        String url=this.GET_URL+complementoUrl;
        RespuestaServicioFactura respuestaServicio = null;
        Logs.log("________________________GetServicioApi___________________________");
        Logs.log("Url "+url);
//        Logs.log("Token "+token);
        
        Respuesta respuesta = sendPOST("GET",url,"",token);
        if(!respuesta.isError()){
          
          Gson gSon = new Gson();
          respuestaServicio = gSon.fromJson(respuesta.getObjecto().toString(), RespuestaServicioFactura.class);
          Logs.log("respuestaServicio "+respuestaServicio);
        }else{
            Logs.error("error servicio "+respuesta.mensaje);
            metodos.msgError(null, respuesta.mensaje);
            System.exit(0);
        }
        Logs.log("_____________________________________________________________");
        return respuestaServicio;
    }
    /*
      funcion crea cliente por medio del servicio rest
      @param : complementoUrl : complemento de la Url 
      @param : token : token para realizar la consulta
      @param : Cliente : clase cliente que se quiere enviar al servicio
    */
    public RespuestaServicioRest CrearCliente(String complementoUrl,String token,JsonObject cliente){
        String url=this.GET_URL+complementoUrl; 
        RespuestaServicioRest respuestaServicio = null;
//        final Gson gson = new Gson();
//	final String credenciales = gson.toJson(cliente);
        Logs.log("________________________CrearCliente___________________________");
        Logs.log("Json "+cliente.toString());
        Logs.log("Url "+url);
//        Logs.log("Token "+token);
        Respuesta respuesta = sendPOST("POST",url,cliente.toString(),token);  
        Logs.log("Respuesta::::::::: "+respuesta);
        if(!respuesta.isError()){
            Gson gSon = new Gson();
            respuestaServicio = gSon.fromJson(respuesta.getMensaje(), RespuestaServicioRest.class);
        }else{
            metodos.msgError(null, respuesta.mensaje);
            System.exit(0);
        }
        Logs.log("_____________________________________________________________");
        return respuestaServicio;
    }
    public String CrearFactura(String complementoUrl,String token,String jsonEnvio,Map head,int tipoMetodo){
        String url=this.GET_URL+complementoUrl;
        String respuestaFactura = "";
//        Logs.log("________________________CrearFactura___________________________");
          Logs.log("Json "+jsonEnvio.toString());
          Logs.log("Url "+url);
//        Logs.log("Token "+token);
//        Logs.log("head "+head.toString());
//        Logs.log("tipoMetodo "+tipoMetodo);
        
        String metodo="POST";
        if(tipoMetodo==0){
           metodo="GET"; 
        } 
        Respuesta respuesta = sendPOSTFactura(metodo,url,jsonEnvio,token,head);  
        Logs.log("Respuesta::::::::: "+respuesta);
        if(!respuesta.isError()){
            respuestaFactura = respuesta.getObjecto().toString();
        }else{
            respuestaFactura = respuesta.getObjecto().toString(); 
        }
        return respuestaFactura;
    }
    
    public Respuesta sendGET(String GET_URL, String credenciales) {
        Respuesta respuesta = new Respuesta();
        try {
            URL obj = new URL(GET_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);
            con.setRequestProperty("Authorization", credenciales);     
            int responseCode = con.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                Logs.log("respuesta json:::: "+response.toString());
                respuesta.setError(false);
                respuesta.setObjecto(response);
                return respuesta;
            } else {
                Logs.log("Http Respuesta: "+responseCode+" "+con.getResponseMessage());
                respuesta.setError(true);
                respuesta.setMensaje("Http Respuesta: "+responseCode+" "+con.getResponseMessage());
                return respuesta;
            }
        } catch (Exception e) {
            Logs.log("Error sendGET :" + e.getMessage());
            respuesta.setError(true);
            respuesta.setMensaje("Respuesta: "+e.getMessage());
            return respuesta;
        }
    }
      
    private Respuesta sendPOST(String metodo,String POST_URL, String credenciales,String authHeaderValue) {
          Respuesta respuesta = new Respuesta();
        try {            
            URL obj = new URL(POST_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod(metodo);
            con.setRequestProperty("Content-Type", "application/json; utf-8"); 
            if (!authHeaderValue.equals("")) {
                con.setRequestProperty("Authorization", authHeaderValue);
                System.err.println("Authorization"+ authHeaderValue);
            }
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
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                respuesta.setError(false);
                respuesta.setMensaje(response.toString());
                respuesta.setObjecto(response);
                return respuesta;
            } else {
                respuesta.setError(true);
                respuesta.setMensaje("Http Respuesta: "+responseCode+" "+con.getResponseMessage());
                return respuesta;
            }
        } catch (Exception e) {
            Logs.log("Error sendPost :" + e.getMessage());
            respuesta.setError(true);
            respuesta.setMensaje("Respuesta: "+e.getMessage());
            return respuesta;
        }
    }
    
    private Respuesta sendPOSTFactura(String metodo,String POST_URL, String credenciales,String authHeaderValue,Map head) {
        Respuesta respuesta = new Respuesta();
        int responseCode =0;
        try {            
            URL obj = new URL(POST_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod(metodo);
            con.setRequestProperty("Content-Type", "application/json; utf-8"); 
            if (!authHeaderValue.equals("")) {
                con.setRequestProperty("Authorization", authHeaderValue);
                String secret = Propiedades.secret;
                String encryp= metodos.encryptBase64(head.get("NitEmisor").toString(),secret);
                Logs.log("Encry:" +encryp);
                con.setRequestProperty("NitEmisor",encryp);
                System.err.println("NitEmisor "+encryp);
                con.setRequestProperty("Nit", head.get("NitEmisor").toString());
                if(head.containsKey("Factura")){
                 con.setRequestProperty("Factura", head.get("Factura").toString());
                }
            }
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

            responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { //success
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        con.getInputStream(), "UTF8"));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                respuesta.setCodigo(responseCode+"");
                respuesta.setError(false);
                respuesta.setMensaje(response.toString());
                respuesta.setObjecto(response);
                Logs.log("Factura Correcta: "+ response.toString());
                return respuesta;
            } else {
                JsonObject respuestJson = new JsonObject();
                respuestJson.addProperty("codigo",responseCode);
                respuestJson.addProperty("error",true);
                respuesta.setError(true);
                respuesta.setCodigo(responseCode+"");
                Logs.error("Http Respuesta: "+responseCode+" respuesta "+con.getResponseMessage());
                respuesta.setMensaje(con.getResponseMessage()+"");
                respuesta.setObjecto(respuestJson);
                return respuesta;
            }
        } catch (Exception e) {
            JsonObject respuestJson = new JsonObject();
            respuestJson.addProperty("codigo",responseCode);
            respuestJson.addProperty("error",true);
            Logs.error("Error sendPOST: "+ e.getMessage());
            respuesta.setCodigo(responseCode+"");
            respuesta.setError(true);
            respuesta.setMensaje(e.getMessage());
            respuesta.setObjecto(respuestJson);
            return respuesta;
        }
    }
    
    private HttpURLConnection propiedades(String credenciales,String url){
        InputStream inputStream = null;
        String json=GetDatosEnvio();
        String respuestaCompletaWebService = "";
        try
        {
        myURLConnection = (HttpURLConnection) (new URL(url).openConnection());
        myURLConnection.setRequestMethod("GET");
        myURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
        myURLConnection.setRequestProperty("Content-Type", "application/json");
        myURLConnection.setRequestProperty("Version-Document", "2");
        myURLConnection.setRequestProperty("Authorization", credenciales);
        myURLConnection.setDoOutput(true);
        myURLConnection.setConnectTimeout(60000);
        myURLConnection.setUseCaches(false);
        myURLConnection.setInstanceFollowRedirects(false);   
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
            Logs.log("Respuesta web service: " + respuestaCompletaWebService);
          } catch (Exception e) {
             Logs.log("Error web service: " + e.getMessage());
          }
        return myURLConnection;
    }
    
}
