/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.google.gson.JsonObject;
import java.util.Map;

/**
 *
 * @author amgon
 */
public class ServicioArchivoBanco extends Thread{
    metodosGenerales metodos = new metodosGenerales();
    JsonObject jsonEnvio;
    Map<String, String> headApi;
    int numeroServicio;
    
    public ServicioArchivoBanco(JsonObject jsonEnvio,Map<String, String> headApi,int numeroServicio) {
        this.jsonEnvio=jsonEnvio;
        this.headApi=headApi;
        this.numeroServicio=numeroServicio;
    }
    
    
    @Override
    public void run() {
        envioFactura();
    }
    
     private boolean envioFactura() {
         String respuestaServicio = metodos.EnvioFacturaApiClikingPos(jsonEnvio.toString(), numeroServicio, this.headApi, "");
         return true;
     }
}
