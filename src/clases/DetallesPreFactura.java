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
public class DetallesPreFactura {
    private Long id;

    private String codigoProducto;

    private String descripcionProducto;

    private String estandarProducto;

    private Double precioUnitario;

    private double cantidad;

    private String unidadMedida;

    private double valorTotalProducto;

    private Double porcentajeIVA;

    private Double porcentajeDescuento;

    private String tipoDescuento;

    private Double valorDescuento;
    
    private int idPrefactura;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getEstandarProducto() {
        return estandarProducto;
    }

    public void setEstandarProducto(String estandarProducto) {
        this.estandarProducto = estandarProducto;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getValorTotalProducto() {
        return valorTotalProducto;
    }

    public void setValorTotalProducto(double valorTotalProducto) {
        this.valorTotalProducto = valorTotalProducto;
    }

    public Double getPorcentajeIVA() {
        return porcentajeIVA;
    }

    public void setPorcentajeIVA(Double porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    public Double getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(Double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public int getIdPrefactura() {
        return idPrefactura;
    }

    public void setIdPrefactura(int idPrefactura) {
        this.idPrefactura = idPrefactura;
    }

    @Override
    public String toString() {
        return "DetallesPreFactura{" + "id=" + id + ", codigoProducto=" + codigoProducto + ", descripcionProducto=" + descripcionProducto + ", estandarProducto=" + estandarProducto + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad + ", unidadMedida=" + unidadMedida + ", valorTotalProducto=" + valorTotalProducto + ", porcentajeIVA=" + porcentajeIVA + ", porcentajeDescuento=" + porcentajeDescuento + ", tipoDescuento=" + tipoDescuento + ", valorDescuento=" + valorDescuento + ", idPrefactura=" + idPrefactura + '}';
    }
    
    
}
