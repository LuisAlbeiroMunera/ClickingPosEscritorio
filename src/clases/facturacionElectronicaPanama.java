package clases;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import configuracion.Propiedades;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logs.Logs;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class facturacionElectronicaPanama {
    
    public facturacionElectronicaPanama(){
  
    }

    metodosGenerales metodos = new metodosGenerales();
   
    private boolean prueba = false;
    
    public void setPrueba(boolean prueba) {
        this.prueba = prueba;
    }
   
  

    
    public static void main(String[] args) {
        facturacionElectronicaPanama fe = new facturacionElectronicaPanama();
        fe.setPrueba(true);
        
        
        JsonElement json = new JsonParser().parse("{'documentNumber': 'FA000000007001','documentType': 'A','customerName': 'Julieta Aguirre','customerId': 'AN586474','customerAddress': 'Albrook','items': [{'code':'31','description': 'Tratamiento','qty': '1','price': '20','tax':'7'}],'payments': [{'title': 'Efectivo','amount': '40.00','type': '1'}]}");
        try {
            fe.consumirServicio("comprobante" ,json.toString());
        } catch (Exception ex) {
            Logs.error(ex);
        }
    }

    public String consumirServicio(String metodo, String json) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Logs.error("JSON A ENVIAR PANAMA"+ json);
        Logs.error("URL "+Propiedades.getInstancia().getUrlFacturaElectronicaPanama()+metodo);
  
        InputStream inputStream = null;
        String respuestaCompletaWebService = "";

        try {
           
            HttpURLConnection myURLConnection = (HttpURLConnection) (new URL(Propiedades.getInstancia().getUrlFacturaElectronicaPanama()+metodo).openConnection());
            myURLConnection.setRequestMethod("POST");
            myURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            myURLConnection.setRequestProperty("Version-Document", "2");
            myURLConnection.setDoOutput(true);
            myURLConnection.setConnectTimeout(60000);
            myURLConnection.setUseCaches(false);
            myURLConnection.setInstanceFollowRedirects(false);
            
            
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("request", json));

            OutputStream os = myURLConnection.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
            writer.write(getQuery(params));
            writer.flush();
            writer.close();

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
            inputStream.close();
        }
        
        try {
           Logs.log("Respuesta web service: " + respuestaCompletaWebService);
           JsonObject respuesta = new JsonParser().parse(respuestaCompletaWebService).getAsJsonObject();
          
           if (respuesta.get("response").getAsBoolean()){
                if(!prueba){
                    metodos.msgAdvertenciaAjustado(null, "Respuesta fiscal # " + respuesta.get("fiscalNumber").getAsString());
                }else{
                    Logs.log("Respuesta fiscal # " + respuesta.get("fiscalNumber").getAsString());
                }
                return respuesta.get("fiscalNumber").getAsString();
            } else {
                if(!prueba){
                    metodos.msgAdvertencia(null, "ERROR EN FACTURA ELECTRONICA " + respuesta.get("code").getAsString() +" - "+respuesta.get("message").getAsString());
                }else{
                    Logs.log("ERROR EN FACTURA ELECTRONICA " + respuesta.get("code").getAsString() +" - "+respuesta.get("message").getAsString());
                }
                return null;
            }
        } catch (Exception e) {
            Logs.error(e);
             if(!prueba){
                 metodos.msgAdvertencia(null, "ERROR EN FACTURA ELECTRONICA "+respuestaCompletaWebService);
             }else{
                 Logs.log("ERROR EN FACTURA ELECTRONICA "+respuestaCompletaWebService);
             }
             return null;
        }

      
    }
    
    private String getQuery(List<NameValuePair> params) throws UnsupportedEncodingException{
        StringBuilder result = new StringBuilder();
        boolean first = true;

        for (NameValuePair pair : params)
        {
            if (first)
                first = false;
            else
                result.append("&");

            result.append(URLEncoder.encode(pair.getName(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(pair.getValue(), "UTF-8"));
        }

        return result.toString();
   }

}
