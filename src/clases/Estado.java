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
public class Estado {

    private String codigo;
    private String descripcion;
    private List<String> notificaciones;
    private List<String> errores;
    private String attached_document;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getNotificaciones() {
        return notificaciones;
}

    public void setNotificaciones(List<String> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setErrores(List<String> errores) {
        this.errores = errores;
    }

    public String getAttached_document() {
        return attached_document;
    }

    public void setAttached_document(String attached_document) {
        this.attached_document = attached_document;
    }

    @Override
    public String toString() {
        return "Estado{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", notificaciones=" + notificaciones + ", errores=" + errores + ", attached_document=" + attached_document + '}';
    }

    }
