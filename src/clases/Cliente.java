package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    
    private String id = null;
    private String codigoCliente = null;
    private String nit = null;
    private String nombre = null;
    private String tipoPago = null;
    private String fechaInicio = null;
    private int anterioridad;
    private int plazo;
    private int estado;
    private String celular = null;
    private String regimen = null;
    private String impoconsumo = null;
    private int dispositivoUSB;
    private int ordenesServicio;
    private int tipoOrden;
    private int creditos;
    private int planSepare;
    private int pedidos;
    private String tipoImpresion = null;
    private int invBodega;
    private int productosSerial;
    private int embarcaciones;
    private int congeladas;
    private int medico;
    private int veterinaria;
    private int parqueadero;
    private int agenda;
    private int restaurante;
    private int recordatorios;
    private int laboratorio;
    private int oftalmologia;
    private int facturaLote;
    private int ptm;
    private int periodoPrueba;
    private String diasFinalizacionPrueba = null;
    private String numeroFacturas = null;
    private String diasDespuesPrueba = null;
    private String info = null;
    private int actualizarPermisos;
    private int facturacionElectronica;
    private int puc;
    private String hora = null;
    private String nitEmisor = null;
    private String tokenEmisor = null;
    private String fechaIngreso = null;
    private String horaIngreso = null;
    private String version = null;
    private String pais = null;
    private int logs;
    private int debug;
    private int validarConfSiempre;
    private String razonSocialEmisor = null;
    private String tipoPersonaEmisor = null;
    private String tipoIdentificacionEmisor = null;
    private String primerNombreEmisor = null;
    private String segundoNombreEmisor = null;
    private String segundoApellidoEmisor = null;
    private String telefonoEmisor = null;
    private String emailErroresEmisor = null;
    private String emailRemitenteEmisor = null;
    private String emailDefectoEmisor = null;
    private String cdDaneCiudadEmisor = null;
    private String cdDaneDepartamentoEmisor = null;
    private String codigoCIIUEmisor = null;
    private String testIdEmisor = null;
    private String primerApellidoEmisor = null;
    private String direccionEmisor = null;
    private String responsabilidadesEmisor = null;
    private int responsableIva;
    private String codigoPunto = null;
    private String email = null;
    private String userName = null;
    private int clientePTM;
    private String corresponsalWeb= null;
    private String actualizacionObligatoria= null;
    private String versionSistema= null;
    private String facturaElectronicaPTM= null;
    private String manejaPreFactura= null;
    
    

    public Cliente() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
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

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
 
        this.fechaInicio = fechaInicio;
    }
    
     public static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public int getAnterioridad() {
        return anterioridad;
    }

    public void setAnterioridad(int anterioridad) {
        this.anterioridad = anterioridad;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getImpoconsumo() {
        return impoconsumo;
    }

    public void setImpoconsumo(String impoconsumo) {
        this.impoconsumo = impoconsumo;
    }

    public int getDispositivoUSB() {
        return dispositivoUSB;
    }

    public void setDispositivoUSB(int dispositivoUSB) {
        this.dispositivoUSB = dispositivoUSB;
    }

    public int getOrdenesServicio() {
        return ordenesServicio;
    }

    public void setOrdenesServicio(int ordenesServicio) {
        this.ordenesServicio = ordenesServicio;
    }

    public int getTipoOrden() {
        return tipoOrden;
    }

    public void setTipoOrden(int tipoOrden) {
        this.tipoOrden = tipoOrden;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getPlanSepare() {
        return planSepare;
    }

    public void setPlanSepare(int planSepare) {
        this.planSepare = planSepare;
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }

    public String getTipoImpresion() {
        return tipoImpresion;
    }

    public void setTipoImpresion(String tipoImpresion) {
        this.tipoImpresion = tipoImpresion;
    }

    public int getInvBodega() {
        return invBodega;
    }

    public void setInvBodega(int invBodega) {
        this.invBodega = invBodega;
    }

    public int getProductosSerial() {
        return productosSerial;
    }

    public void setProductosSerial(int productosSerial) {
        this.productosSerial = productosSerial;
    }

    public int getEmbarcaciones() {
        return embarcaciones;
    }

    public void setEmbarcaciones(int embarcaciones) {
        this.embarcaciones = embarcaciones;
    }

    public int getCongeladas() {
        return congeladas;
    }

    public void setCongeladas(int congeladas) {
        this.congeladas = congeladas;
    }

    public int getMedico() {
        return medico;
    }

    public void setMedico(int medico) {
        this.medico = medico;
    }

    public int getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(int veterinaria) {
        this.veterinaria = veterinaria;
    }

    public int getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(int parqueadero) {
        this.parqueadero = parqueadero;
    }

    public int getAgenda() {
        return agenda;
    }

    public void setAgenda(int agenda) {
        this.agenda = agenda;
    }

    public int getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(int restaurante) {
        this.restaurante = restaurante;
    }

    public int getRecordatorios() {
        return recordatorios;
    }

    public void setRecordatorios(int recordatorios) {
        this.recordatorios = recordatorios;
    }

    public int getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(int laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getOftalmologia() {
        return oftalmologia;
    }

    public void setOftalmologia(int oftalmologia) {
        this.oftalmologia = oftalmologia;
    }

    public int getFacturaLote() {
        return facturaLote;
    }

    public void setFacturaLote(int facturaLote) {
        this.facturaLote = facturaLote;
    }

    public int getPtm() {
        return ptm;
    }

    public void setPtm(int ptm) {
        this.ptm = ptm;
    }

    public int getPeriodoPrueba() {
        return periodoPrueba;
    }

    public void setPeriodoPrueba(int periodoPrueba) {
        this.periodoPrueba = periodoPrueba;
    }

    public String getDiasFinalizacionPrueba() {
        return diasFinalizacionPrueba;
    }

    public void setDiasFinalizacionPrueba(String diasFinalizacionPrueba) {
        this.diasFinalizacionPrueba = diasFinalizacionPrueba;
    }

    public String getNumeroFacturas() {
        return numeroFacturas;
    }

    public void setNumeroFacturas(String numeroFacturas) {
        this.numeroFacturas = numeroFacturas;
    }

    public String getDiasDespuesPrueba() {
        return diasDespuesPrueba;
    }

    public void setDiasDespuesPrueba(String diasDespuesPrueba) {
        this.diasDespuesPrueba = diasDespuesPrueba;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getActualizarPermisos() {
        return actualizarPermisos;
    }

    public void setActualizarPermisos(int actualizarPermisos) {
        this.actualizarPermisos = actualizarPermisos;
    }

    public int getFacturacionElectronica() {
        return facturacionElectronica;
    }

    public void setFacturacionElectronica(int facturacionElectronica) {
        this.facturacionElectronica = facturacionElectronica;
    }

    public int getPuc() {
        return puc;
    }

    public void setPuc(int puc) {
        this.puc = puc;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNitEmisor() {
        return nitEmisor;
    }

    public void setNitEmisor(String nitEmisor) {
        this.nitEmisor = nitEmisor;
    }

    public String getTokenEmisor() {
        return tokenEmisor;
    }

    public void setTokenEmisor(String tokenEmisor) {
        this.tokenEmisor = tokenEmisor;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso =  fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getLogs() {
        return logs;
    }

    public void setLogs(int logs) {
        this.logs = logs;
    }

    public int getDebug() {
        return debug;
    }

    public void setDebug(int debug) {
        this.debug = debug;
    }

    public int getValidarConfSiempre() {
        return validarConfSiempre;
    }

    public void setValidarConfSiempre(int validarConfSiempre) {
        this.validarConfSiempre = validarConfSiempre;
    }

    public String getRazonSocialEmisor() {
        return razonSocialEmisor;
    }

    public void setRazonSocialEmisor(String razonSocialEmisor) {
        this.razonSocialEmisor = razonSocialEmisor;
    }

    public String getTipoPersonaEmisor() {
        return tipoPersonaEmisor;
    }

    public void setTipoPersonaEmisor(String tipoPersonaEmisor) {
        this.tipoPersonaEmisor = tipoPersonaEmisor;
    }

    public String getTipoIdentificacionEmisor() {
        return tipoIdentificacionEmisor;
    }

    public void setTipoIdentificacionEmisor(String tipoIdentificacionEmisor) {
        this.tipoIdentificacionEmisor = tipoIdentificacionEmisor;
    }

    public String getPrimerNombreEmisor() {
        return primerNombreEmisor;
    }

    public void setPrimerNombreEmisor(String primerNombreEmisor) {
        this.primerNombreEmisor = primerNombreEmisor;
    }

    public String getSegundoNombreEmisor() {
        return segundoNombreEmisor;
    }

    public void setSegundoNombreEmisor(String segundoNombreEmisor) {
        this.segundoNombreEmisor = segundoNombreEmisor;
    }

    public String getSegundoApellidoEmisor() {
        return segundoApellidoEmisor;
    }

    public void setSegundoApellidoEmisor(String segundoApellidoEmisor) {
        this.segundoApellidoEmisor = segundoApellidoEmisor;
    }

    public String getTelefonoEmisor() {
        return telefonoEmisor;
    }

    public void setTelefonoEmisor(String telefonoEmisor) {
        this.telefonoEmisor = telefonoEmisor;
    }

    public String getEmailErroresEmisor() {
        return emailErroresEmisor;
    }

    public void setEmailErroresEmisor(String emailErroresEmisor) {
        this.emailErroresEmisor = emailErroresEmisor;
    }

    public String getEmailRemitenteEmisor() {
        return emailRemitenteEmisor;
    }

    public void setEmailRemitenteEmisor(String emailRemitenteEmisor) {
        this.emailRemitenteEmisor = emailRemitenteEmisor;
    }

    public String getEmailDefectoEmisor() {
        return emailDefectoEmisor;
    }

    public void setEmailDefectoEmisor(String emailDefectoEmisor) {
        this.emailDefectoEmisor = emailDefectoEmisor;
    }

    public String getCdDaneCiudadEmisor() {
        return cdDaneCiudadEmisor;
    }

    public void setCdDaneCiudadEmisor(String cdDaneCiudadEmisor) {
        this.cdDaneCiudadEmisor = cdDaneCiudadEmisor;
    }

    public String getCdDaneDepartamentoEmisor() {
        return cdDaneDepartamentoEmisor;
    }

    public void setCdDaneDepartamentoEmisor(String cdDaneDepartamentoEmisor) {
        this.cdDaneDepartamentoEmisor = cdDaneDepartamentoEmisor;
    }

    public String getCodigoCIIUEmisor() {
        return codigoCIIUEmisor;
    }

    public void setCodigoCIIUEmisor(String codigoCIIUEmisor) {
        this.codigoCIIUEmisor = codigoCIIUEmisor;
    }

    public String getTestIdEmisor() {
        return testIdEmisor;
    }

    public void setTestIdEmisor(String testIdEmisor) {
        this.testIdEmisor = testIdEmisor;
    }

    public String getPrimerApellidoEmisor() {
        return primerApellidoEmisor;
    }

    public void setPrimerApellidoEmisor(String primerApellidoEmisor) {
        this.primerApellidoEmisor = primerApellidoEmisor;
    }

    public String getDireccionEmisor() {
        return direccionEmisor;
    }

    public void setDireccionEmisor(String direccionEmisor) {
        this.direccionEmisor = direccionEmisor;
    }

    public String getResponsabilidadesEmisor() {
        return responsabilidadesEmisor;
    }

    public void setResponsabilidadesEmisor(String responsabilidadesEmisor) {
        this.responsabilidadesEmisor = responsabilidadesEmisor;
    }

    public int getResponsableIva() {
        return responsableIva;
    }

    public void setResponsableIva(int responsableIva) {
        this.responsableIva = responsableIva;
    }

    public String getCodigoPunto() {
        return codigoPunto;
    }

    public void setCodigoPunto(String codigoPunto) {
        this.codigoPunto = codigoPunto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getClientePTM() {
        return clientePTM;
    }

    public void setClientePTM(int clientePTM) {
        this.clientePTM = clientePTM;
    }

    public String getCorresponsalWeb() {
        return corresponsalWeb;
    }

    public void setCorresponsalWeb(String corresponsalWeb) {
        this.corresponsalWeb = corresponsalWeb;
    }

    public String getActualizacionObligatoria() {
        return actualizacionObligatoria;
    }

    public void setActualizacionObligatoria(String actualizacionObligatoria) {
        this.actualizacionObligatoria = actualizacionObligatoria;
    }

    public String getVersionSistema() {
        return versionSistema;
    }

    public void setVersionSistema(String versionSistema) {
        this.versionSistema = versionSistema;
    }

    public String getFacturaElectronicaPTM() {
        return facturaElectronicaPTM;
    }

    public void setFacturaElectronicaPTM(String facturaElectronicaPTM) {
        this.facturaElectronicaPTM = facturaElectronicaPTM;
    }

    public String getManejaPreFactura() {
        return manejaPreFactura;
    }

    public void setManejaPreFactura(String manejaPreFactura) {
        this.manejaPreFactura = manejaPreFactura;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", codigoCliente=" + codigoCliente + ", nit=" + nit + ", nombre=" + nombre + ", tipoPago=" + tipoPago + ", fechaInicio=" + fechaInicio + ", anterioridad=" + anterioridad + ", plazo=" + plazo + ", estado=" + estado + ", celular=" + celular + ", regimen=" + regimen + ", impoconsumo=" + impoconsumo + ", dispositivoUSB=" + dispositivoUSB + ", ordenesServicio=" + ordenesServicio + ", tipoOrden=" + tipoOrden + ", creditos=" + creditos + ", planSepare=" + planSepare + ", pedidos=" + pedidos + ", tipoImpresion=" + tipoImpresion + ", invBodega=" + invBodega + ", productosSerial=" + productosSerial + ", embarcaciones=" + embarcaciones + ", congeladas=" + congeladas + ", medico=" + medico + ", veterinaria=" + veterinaria + ", parqueadero=" + parqueadero + ", agenda=" + agenda + ", restaurante=" + restaurante + ", recordatorios=" + recordatorios + ", laboratorio=" + laboratorio + ", oftalmologia=" + oftalmologia + ", facturaLote=" + facturaLote + ", ptm=" + ptm + ", periodoPrueba=" + periodoPrueba + ", diasFinalizacionPrueba=" + diasFinalizacionPrueba + ", numeroFacturas=" + numeroFacturas + ", diasDespuesPrueba=" + diasDespuesPrueba + ", info=" + info + ", actualizarPermisos=" + actualizarPermisos + ", facturacionElectronica=" + facturacionElectronica + ", puc=" + puc + ", hora=" + hora + ", nitEmisor=" + nitEmisor + ", tokenEmisor=" + tokenEmisor + ", fechaIngreso=" + fechaIngreso + ", horaIngreso=" + horaIngreso + ", version=" + version + ", pais=" + pais + ", logs=" + logs + ", debug=" + debug + ", validarConfSiempre=" + validarConfSiempre + ", razonSocialEmisor=" + razonSocialEmisor + ", tipoPersonaEmisor=" + tipoPersonaEmisor + ", tipoIdentificacionEmisor=" + tipoIdentificacionEmisor + ", primerNombreEmisor=" + primerNombreEmisor + ", segundoNombreEmisor=" + segundoNombreEmisor + ", segundoApellidoEmisor=" + segundoApellidoEmisor + ", telefonoEmisor=" + telefonoEmisor + ", emailErroresEmisor=" + emailErroresEmisor + ", emailRemitenteEmisor=" + emailRemitenteEmisor + ", emailDefectoEmisor=" + emailDefectoEmisor + ", cdDaneCiudadEmisor=" + cdDaneCiudadEmisor + ", cdDaneDepartamentoEmisor=" + cdDaneDepartamentoEmisor + ", codigoCIIUEmisor=" + codigoCIIUEmisor + ", testIdEmisor=" + testIdEmisor + ", primerApellidoEmisor=" + primerApellidoEmisor + ", direccionEmisor=" + direccionEmisor + ", responsabilidadesEmisor=" + responsabilidadesEmisor + ", responsableIva=" + responsableIva + ", codigoPunto=" + codigoPunto + ", email=" + email + ", userName=" + userName + ", clientePTM=" + clientePTM + ", corresponsalWeb=" + corresponsalWeb + ", actualizacionObligatoria=" + actualizacionObligatoria + ", versionSistema=" + versionSistema + ", facturaElectronicaPTM=" + facturaElectronicaPTM + ", manejaPreFactura=" + manejaPreFactura + '}';
    }
    
}
