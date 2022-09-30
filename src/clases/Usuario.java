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
public class Usuario {
    
    int id;
    String nombreUsuario = "";
    String email = "";
    String userName = "";
    String password = "";
    String telefono = "";
    String claveTemporal = "";
    String version = "";
    List<ListaRoles> listaRoles = new ArrayList<ListaRoles>(); 
    private Punto punto;
    
    
    public Usuario() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClaveTemporal() {
        return claveTemporal;
    }

    public void setClaveTemporal(String claveTemporal) {
        this.claveTemporal = claveTemporal;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ListaRoles> getListaRoles() {
        return listaRoles;
    }

    public void setListaRoles(List<ListaRoles> listaRoles) {
        this.listaRoles = listaRoles;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreUsuario=" + nombreUsuario + ", email=" + email + ", userName=" + userName + ", password=" + password + ", telefono=" + telefono + ", claveTemporal=" + claveTemporal + ", version=" + version + ", listaRoles=" + listaRoles + ", punto=" + punto + '}';
    }
    
}
