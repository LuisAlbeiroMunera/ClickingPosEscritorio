package clases;

public class Actividad {

    private Long id;
    private String idCliente;
    private String nit;
    private String nombre;
    private String fechaCorte;
    private Integer estadoPago;
    private String fechaPago;
    private String numFactura;

    public Actividad() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(String fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public Integer getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(Integer estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    @Override
    public String toString() {
        return "Actividad{" + "id=" + id + ", idCliente=" + idCliente + ", nit=" + nit + ", nombre=" + nombre + ", fechaCorte=" + fechaCorte + ", estadoPago=" + estadoPago + ", fechaPago=" + fechaPago + ", numFactura=" + numFactura + '}';
    }   
}
