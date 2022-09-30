/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author amgon
 */
public class Token {
       
    String token;
    String bearer;
    String userName;
    String fechaGeneraToken;
    ArrayList<Authorities> authorities = new ArrayList<>();

    public Token() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

   public ArrayList<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(ArrayList<Authorities> authorities) {
        this.authorities = authorities;
    }

    public String getFechaGeneraToken() {
        return fechaGeneraToken;
    }

    public void setFechaGeneraToken(String fechaGeneraToken) {
        this.fechaGeneraToken = fechaGeneraToken;
    }

    @Override
    public String toString() {
        return "Token{" + "token=" + token + ", bearer=" + bearer + ", userName=" + userName + ", fechaGeneraToken=" + fechaGeneraToken + ", authorities=" + authorities + '}';
    }

    
       
}
