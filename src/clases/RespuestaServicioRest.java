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
public class RespuestaServicioRest {
    
    
    private String mensaje;
    private String estado;
    private Cliente cliente;
    private Actividad actividad;
    private Object usuarioResponse;
   

    public RespuestaServicioRest() {
    }

 
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public Object getUsuarioResponse() {
        return usuarioResponse;
    }

    public void setUsuarioResponse(Object usuarioResponse) {
        this.usuarioResponse = usuarioResponse;
    }
    
    

//    public UsuarioResponse getUsuarioResponse() {
//        return usuarioResponse;
//    }
//
//    public void setUsuarioResponse(UsuarioResponse usuarioResponse) {
//        this.usuarioResponse = usuarioResponse;
//    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "RespuestaServicioRest{" + " mensaje=" + mensaje + ", codigo=" + estado + ", cliente=" + cliente + ", actividad=" + actividad + ", usuarioResponse=" + usuarioResponse + '}';
    }

         
}