package clases;

import java.util.List;

public class RespuestaServicioFactura {

    private String estado;
    private String mensaje;
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "RespuestaServicioFactura{" + "estado=" + estado + ", mensaje=" + mensaje + '}';
    }   
    

}
