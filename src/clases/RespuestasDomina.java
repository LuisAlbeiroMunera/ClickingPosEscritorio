/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

//import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 *
 * @author amgon
 */
public class RespuestasDomina {
         
    private String descripcion;
    private String fechaCreacion;
    private String jsonEnvio;
    

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getJsonEnvio() {
        return jsonEnvio;
    }

    public void setJsonEnvio(String jsonEnvio) {
        this.jsonEnvio = jsonEnvio;
    }
    
    
}
