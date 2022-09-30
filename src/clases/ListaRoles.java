/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amgon
 */
public class ListaRoles {
    int id;
    String nombreRol;
    List<ListaPrivilegiosRol> listaPrivilegiosRol = new ArrayList<ListaPrivilegiosRol>(); 

    public ListaRoles() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public List<ListaPrivilegiosRol> getListaPrivilegiosRol() {
        return listaPrivilegiosRol;
    }

    public void setListaPrivilegiosRol(List<ListaPrivilegiosRol> listaPrivilegiosRol) {
        this.listaPrivilegiosRol = listaPrivilegiosRol;
    }

    @Override
    public String toString() {
        return "ListaRoles{" + "id=" + id + ", nombreRol=" + nombreRol + ", listaPrivilegiosRol=" + listaPrivilegiosRol + '}';
    }
    
}
