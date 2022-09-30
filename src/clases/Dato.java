/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.List;

/**
 *
 * @author amgon
 */
public class Dato {

    private String idFactura;
    private String numeroFactura;
    private String estado;
    private RespuestasDomina respuestasDomina;
    private String id;
    

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public RespuestasDomina getRespuestasDomina() {
        return respuestasDomina;
    }

    public void setRespuestasDomina(RespuestasDomina respuestasDomina) {
        this.respuestasDomina = respuestasDomina;
    }

    @Override
    public String toString() {
        return "Dato{" + "numeroFactura=" + numeroFactura + ", id=" + id + ", idFactura=" + idFactura + ", estado=" + estado + ", respuestasDomina=" + respuestasDomina + '}';
    }
    
    
}
