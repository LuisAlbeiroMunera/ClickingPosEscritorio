/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;
import java.util.List;

/**
 *
 * @author amgon
 */
public class PrefacturaPTM {

    private Long id;

    private String idTxExterno;
    
    private String identificacion;

    private String digitoVerificacion;

    private String tipoIdentificacion;

    private String tipoPersona;

    private String primerNombre;

    private String segundoNombre;

    private String primerApellido;

    private String segundoApellido;

    private String razonSocial;

    private String telefono;

    private String email;

    private Boolean responsableIVA;

    private String fechaNacimiento;

    private Integer estado;

    private String direccion;

    private String codigoDane;

    private List<DetallesPreFactura> detallesPreFactura;
    
    String estadoPrefactura="0";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdTxExterno() {
        return idTxExterno;
    }

    public void setIdTxExterno(String idTxExterno) {
        this.idTxExterno = idTxExterno;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDigitoVerificacion() {
        return digitoVerificacion;
    }

    public void setDigitoVerificacion(String digitoVerificacion) {
        this.digitoVerificacion = digitoVerificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getResponsableIVA() {
        return responsableIVA;
    }

    public void setResponsableIVA(Boolean responsableIVA) {
        this.responsableIVA = responsableIVA;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoDane() {
        return codigoDane;
    }

    public void setCodigoDane(String codigoDane) {
        this.codigoDane = codigoDane;
    }

    public List<DetallesPreFactura> getDetallesPreFactura() {
        return detallesPreFactura;
    }

    public void setDetallesPreFactura(List<DetallesPreFactura> detallesPreFactura) {
        this.detallesPreFactura = detallesPreFactura;
    }

    public String getEstadoPrefactura() {
        return estadoPrefactura;
    }

    public void setEstadoPrefactura(String estadoPrefactura) {
        this.estadoPrefactura = estadoPrefactura;
    }

    @Override
    public String toString() {
        return "PrefacturaPTM{" + "id=" + id + ", idTxExterno=" + idTxExterno + ", identificacion=" + identificacion + ", digitoVerificacion=" + digitoVerificacion + ", tipoIdentificacion=" + tipoIdentificacion + ", tipoPersona=" + tipoPersona + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", razonSocial=" + razonSocial + ", telefono=" + telefono + ", email=" + email + ", responsableIVA=" + responsableIVA + ", fechaNacimiento=" + fechaNacimiento + ", estado=" + estado + ", direccion=" + direccion + ", codigoDane=" + codigoDane + ", detallesPreFactura=" + detallesPreFactura + ", estadoPrefactura=" + estadoPrefactura + '}';
    }
    
   

}
