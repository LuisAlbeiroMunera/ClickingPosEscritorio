package clases.Ventas;

import clases.Respuesta;
import clases.RespuestaServicioEnvioFacturas;
import clases.metodosGenerales;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import logs.Logs;

public class ndNotasCredito {

    private String factura, producto, NC, plu, descripcion, estado;
    private String lista, total, iva, impoconsumo, subtotal, descuento, utilidad, porcDescuento; //NUMEROS
    private double cantidad, cant2;
    private String porcIva, porcImpoconsumo, tercero, utilidad1, preparacion, conseMesa, imei, idProd;

    metodosGenerales metodos = new metodosGenerales();
    private String nitEmisor;
    private String token;

    /*public ndNotasCredito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    public String getImpoconsumo() {
        return impoconsumo;
    }

    public void setImpoconsumo(String impoconsumo) {
        this.impoconsumo = impoconsumo;
    }

    public String getPorcImpoconsumo() {
        return porcImpoconsumo;
    }

    public void setPorcImpoconsumo(String porcImpoconsumo) {
        this.porcImpoconsumo = porcImpoconsumo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getIdProd() {
        return idProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String getConseMesa() {
        return conseMesa;
    }

    public void setConseMesa(String conseMesa) {
        this.conseMesa = conseMesa;
    }

    public String getTercero() {
        return tercero;
    }

    public void setTercero(String tercero) {
        this.tercero = tercero;
    }

    public String getUtilidad1() {
        return utilidad1;
    }

    public void setUtilidad1(String utilidad1) {
        this.utilidad1 = utilidad1;
    }

    public String getPorcIva() {
        return porcIva;
    }

    public void setPorcIva(String porcIva) {
        this.porcIva = porcIva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPlu() {
        return plu;
    }

    public void setPlu(String plu) {
        this.plu = plu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCant2() {
        return cant2;
    }

    public void setCant2(double cant2) {
        this.cant2 = cant2;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public String getFactura() {
        return factura;
    }

    public String getDescuento() {
        return descuento;
    }

    public String getNC() {
        return NC;
    }

    public void setNC(String NC) {
        this.NC = NC;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(String porcDescuento) {
        this.porcDescuento = porcDescuento;
    }

     public boolean consumirServicioApiClickingPosBTW(String json,String nit){
        Logs.log("______________consumirServicioApiClickingPos_________________");
        Logs.log("Datos enviados al servicio:");
        Logs.log("Json Envio: "+json);
        Logs.log("nit: "+nit);

     try{
       Map<String, String> headApi = new HashMap<String, String>();
       RespuestaServicioEnvioFacturas respuesta = new RespuestaServicioEnvioFacturas();
       Respuesta respuestaError;
       String respuestaServicio = metodos.EnvioFacturaApiClikingPosBTW(json);
       Logs.log("RespuestaServicio Facturacion: "+respuestaServicio);
       //setRespuesta(respuestaServicio);
       Gson gSon = new Gson();
       
       /*try{
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
       }*/
        
     }catch(Exception e){
        //if(showMsg){
         metodos.msgAdvertenciaAjustado(null,"Error al generar la factura : "+e.toString());
        //}
       Logs.log("ERROR EN EL SERVICIO: "+e.toString());   
       throw new ClassCastException(" Mensaje: "+e.toString());
       //return false;
     }  
       return true;
    }
    
    
}
