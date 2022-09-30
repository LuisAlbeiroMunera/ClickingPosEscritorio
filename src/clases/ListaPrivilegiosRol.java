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
public class ListaPrivilegiosRol {
    int id;
    String recurso;
    String jerarquia;
    String menu;
    String nombreMenu;
    String posicion;

    public ListaPrivilegiosRol() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "ListaPrivilegiosRol{" + "id=" + id + ", recurso=" + recurso + ", jerarquia=" + jerarquia + ", menu=" + menu + ", nombreMenu=" + nombreMenu + ", posicion=" + posicion + '}';
    }
    
}
