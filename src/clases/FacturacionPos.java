/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import static java.lang.Thread.sleep;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author amgon
 */
public class FacturacionPos extends Thread {

    JsonObject json;
    String tokenEmisor;
    String nitEmisor;
    Instancias instancias;

    public FacturacionPos(JsonObject json, String nitEmisor, String tokenEmisor, Instancias instancias) {
        this.json = json;
        this.tokenEmisor = tokenEmisor;
        this.nitEmisor = nitEmisor;
        this.instancias = instancias;
    }

    @Override
    public void run() {
        envioFactura(this.json, true);
    }

    private boolean envioFactura(JsonObject json, boolean almacenar) {
        try {
            
            if(almacenar){
                guardarFactura(this.json.get("dsNumeroFactura").getAsString(), this.json.toString(), "0");
            }
            
            facturacionElectronica facturacion = new facturacionElectronica(this.nitEmisor, this.tokenEmisor);
            boolean estadoFactura = facturacion.consumirServicioApiClickingPos(json.toString(), false, this.nitEmisor, json.get("dsNumeroFactura").getAsString(), "0");
            System.out.println("get Respuesta -> " + facturacion.getRespuesta());
            Gson gSon = new Gson();
            JsonObject respuestaServicio = gSon.fromJson(facturacion.getRespuesta(), JsonObject.class);
            System.out.println("Run: respuestaServicio -> " + respuestaServicio);
            if (respuestaServicio.get("estado").getAsString().equals("000")) {
                System.out.println("Dato -> " + respuestaServicio.get("dato").getAsJsonObject().get("id").getAsString());
                modificarIntentosyEstadosFactura(json.get("dsNumeroFactura").getAsString(), "1", respuestaServicio.get("dato").getAsJsonObject().get("id").getAsString());
            } else {
                System.out.println("Dato -> no data");
                modificarIntentosyEstadosFactura(json.get("dsNumeroFactura").getAsString(), "2", null);
            }
        } catch (Exception exp) {
            System.out.println("exp " + exp);
            modificarIntentosyEstadosFactura(this.json.get("dsNumeroFactura").getAsString(), "2", null);
        }
        
        if(almacenar){
         controlFacturas();
        }
        
        return true;
    }
    
    private void controlFacturas(){
        Object dtDatos[][] = this.instancias.getSql().consultarFacturaPosApi();
        if(dtDatos.length > 0){
            for(int i=0;i <dtDatos.length ;i++){
                Gson gSon = new Gson();
                JsonObject respuestaServicio = gSon.fromJson(dtDatos[i][1].toString(), JsonObject.class);
                envioFactura(respuestaServicio, false);
            }
        }
    }

    private boolean guardarFactura(String factura, String json, String estado) {
        return this.instancias.getSql().almacenarFacturaPosApi(factura, json, estado);
    }

    private boolean modificarIntentosyEstadosFactura(String factura, String estado, String idExterno) {
        return this.instancias.getSql().modificarFacturaPosApi(factura, estado, idExterno);
    }
}
