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
public class Domina {
    private String prefijo;
    private String numero;
    private String cufe;
    private Estado estado;
    private String fecha;
//    private String detalle;

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCufe() {
        return cufe;
    }

    public void setCufe(String cufe) {
        this.cufe = cufe;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }    

    @Override
    public String toString() {
        return "Domina{" + "prefijo=" + prefijo + ", numero=" + numero + ", cufe=" + cufe + ", estado=" + estado + ", fecha=" + fecha + '}';
    }
    }
