/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author amgon
 */
public class Respuesta {
    String codigo;
    String mensaje;
    boolean error;
    Object objecto;

    public Respuesta() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public Object getObjecto() {
        return objecto;
    }

    public void setObjecto(Object objecto) {
        this.objecto = objecto;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "codigo=" + codigo + ", mensaje=" + mensaje + ", error=" + error + ", objecto=" + objecto + '}';
    }
        
}
