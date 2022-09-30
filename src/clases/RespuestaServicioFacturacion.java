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
public class RespuestaServicioFacturacion extends RespuestaServicioFactura{
    
    private List<Dato> dato;

    public List<Dato> getDato() {
        return dato;
    }

    public void setDato(List<Dato> dato) {
        this.dato = dato;
    }

    }
