package configuracion;
import logs.Logs;
import clases.Instancias;
import clases.metodosGenerales;
import clases.ndMaestra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class dlgConfiguraciones extends javax.swing.JDialog {
    
    private metodosGenerales metodos;
    private Instancias instancias;
    private ndMaestra nodo;
    String tipoFactura;
    private boolean congeladas, medico, veterinaria, parqueadero, restaurante, laboratorio, oftalmologia;
    private boolean ordenServ, creditos, separe, servicioAutomotor, facturacionLote, embarcaciones, usb, ptm, facturaElectronica, puc;
    private boolean pedido, agenda, recordatorios, periodo;
    private boolean inventarioBodegas, productosSerial,corresponsalWeb;
    private String numFacturas, aviso, tipoImpresion, pais, numeroCorresponsales;
    DefaultTableModel modelo;
    
    public String getPais() {
        return pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public boolean isPuc() {
        return puc;
    }
    
    public void setPuc(boolean puc) {
        this.puc = puc;
    }
    
    public boolean isFacturaElectronica() {
        return facturaElectronica;
    }
    
    public void setFacturaElectronica(boolean facturaElectronica) {
        this.facturaElectronica = facturaElectronica;
    }
    
    public boolean isPtm() {
        return ptm;
    }
    
    public void setPtm(boolean ptm) {
        this.ptm = ptm;
    }
    
    public boolean isUsb() {
        return usb;
    }
    
    public void setUsb(boolean usb) {
        this.usb = usb;
    }
    
    public boolean isEmbarcaciones() {
        return embarcaciones;
    }
    
    public void setEmbarcaciones(boolean embarcaciones) {
        this.embarcaciones = embarcaciones;
    }
    
    public boolean isFacturacionLote() {
        return facturacionLote;
    }
    
    public void setFacturacionLote(boolean facturacionLote) {
        this.facturacionLote = facturacionLote;
    }
    
    public boolean isProductosSerial() {
        return productosSerial;
    }
    
    public void setProductosSerial(boolean productosSerial) {
        this.productosSerial = productosSerial;
    }
    
    public boolean isInventarioBodegas() {
        return inventarioBodegas;
    }
    
    public void setInventarioBodegas(boolean inventarioBodegas) {
        this.inventarioBodegas = inventarioBodegas;
    }
    
    public String getTipoImpresion() {
        return tipoImpresion;
    }
    
    public void setTipoImpresion(String tipoImpresion) {
        this.tipoImpresion = tipoImpresion;
    }
    
    public boolean isOftalmologia() {
        return oftalmologia;
    }
    
    public void setOftalmologia(boolean oftalmologia) {
        this.oftalmologia = oftalmologia;
    }
    
    public String getNumFacturas() {
        return numFacturas;
    }
    
    public void setNumFacturas(String numFacturas) {
        this.numFacturas = numFacturas;
    }
    
    public String getAviso() {
        return aviso;
    }
    
    public void setAviso(String aviso) {
        this.aviso = aviso;
    }
    
    public boolean isPeriodo() {
        return periodo;
    }
    
    public void setPeriodo(boolean periodo) {
        this.periodo = periodo;
    }
    
    public boolean isServicioAutomotor() {
        return servicioAutomotor;
    }
    
    public void setServicioAutomotor(boolean servicioAutomotor) {
        this.servicioAutomotor = servicioAutomotor;
    }
    
    public boolean isLaboratorio() {
        return laboratorio;
    }
    
    public void setLaboratorio(boolean laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    public boolean isRecordatorios() {
        return recordatorios;
    }
    
    public void setRecordatorios(boolean recordatorios) {
        this.recordatorios = recordatorios;
    }
    
    public boolean isRestaurante() {
        return restaurante;
    }
    
    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
    public boolean isPedido() {
        return pedido;
    }
    
    public void setPedido(boolean pedido) {
        this.pedido = pedido;
    }
    
    public boolean isAgenda() {
        return agenda;
    }
    
    public void setAgenda(boolean agenda) {
        this.agenda = agenda;
    }
    
    public boolean isOrdenServ() {
        return ordenServ;
    }
    
    public void setOrdenServ(boolean ordenServ) {
        this.ordenServ = ordenServ;
    }
    
    public boolean isCreditos() {
        return creditos;
    }
    
    public void setCreditos(boolean creditos) {
        this.creditos = creditos;
    }
    
    public boolean isSepare() {
        return separe;
    }
    
    public void setSepare(boolean separe) {
        this.separe = separe;
    }
    
    public boolean isCongeladas() {
        return congeladas;
    }
    
    public void setCongeladas(boolean congeladas) {
        this.congeladas = congeladas;
    }
    
    public boolean isMedico() {
        return medico;
    }
    
    public void setMedico(boolean medico) {
        this.medico = medico;
    }
    
    public boolean isVeterinaria() {
        return veterinaria;
    }
    
    public void setVeterinaria(boolean veterinaria) {
        this.veterinaria = veterinaria;
    }
    
    public boolean isParqueadero() {
        return parqueadero;
    }
    
    public void setParqueadero(boolean parqueadero) {
        this.parqueadero = parqueadero;
    }
    
    public String getTipoFactura() {
        return tipoFactura;
    }
    
    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public boolean isCorresponsalWeb() {
        return corresponsalWeb;
    }

    public void setCorresponsalWeb(boolean corresponsalWeb) {
        this.corresponsalWeb = corresponsalWeb;
    }

    public String getNumeroCorresponsal() {
        return numeroCorresponsales;
    }

    public void setNumeroCorresponsal(String numeroCorresponsales) {
        this.numeroCorresponsales = numeroCorresponsales;
    }
        
    public dlgConfiguraciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        instancias = Instancias.getInstancias();
        metodos = new metodosGenerales();
        
        cargarConfiguraciones();
        
        modelo = (DefaultTableModel) tblMonedas.getModel();
        
        Object[][] monedas = instancias.getSql().getMonedas();
        for (Object[] moneda : monedas) {
            Boolean estado = false;
            if (moneda[3].toString().equals("1")) {
                estado = true;
            }
            modelo.addRow(new Object[]{moneda[1], moneda[0], moneda[2], estado});
        }
        
        Object[][] moneda = instancias.getSql().getMonedaSeleccionada();
        
        if (moneda.length > 0) {
            String cadenaDecimales = "";
            for (int i = 0; i < Integer.parseInt(moneda[0][2].toString()); i++) {
                cadenaDecimales = cadenaDecimales + "#";
            }
            
            instancias.setSimbolo(moneda[0][0].toString());
            instancias.setDescripcionSimbolo(moneda[0][1].toString());
            instancias.setCadenaDecimales(cadenaDecimales);
        } else {
            instancias.setSimbolo("$");
            instancias.setDescripcionSimbolo("PESOS");
            instancias.setCadenaDecimales("##");
        }
        
        this.getRootPane().registerKeyboardAction(accion("cerrar", this), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }
    
    private ActionListener accion(final String opc, final JDialog ventana) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
                    case "cerrar":
                        ventana.dispose();
                        break;
                }
            }
        };
        return a;
    }
    
    public void cargarConfiguraciones() {
        
        Object[] datos = instancias.getSql().getDatosMaestra();
//        Object[] datos = sql.getDatosMaestra();

        //Se tiene que llamar desde aca ya que es la primera instancia antes de pasar a factura y hacer la validacion.
        if ((boolean) datos[42]) {
            instancias.setOcultarInformacionCliente(true);
        } else {
            instancias.setOcultarInformacionCliente(false);
        }
        
        nodo = metodos.llenarMaestra(datos);
        ndConfiguracion nodoConf = instancias.getSql().getDatosConfiguracion();
        
        if (nodoConf.isLogs()) {
              logs.setSelected(true);
        } else {
              logs.setSelected(false);
        }
        
        if (nodoConf.isDebug()) {
              debug.setSelected(true);
        } else {
              debug.setSelected(false);
        }
        
        if (nodoConf.isValidarConfSiempre()) {
              validarConfSiempre.setSelected(true);
        } else {
              validarConfSiempre.setSelected(false);
        }
        
        if (nodoConf.getVentasFactura().equals("retail")) {
            setTipoFactura("retail");
        } else {
            setTipoFactura("estandar");
        }
        
        try {
            if (nodoConf.getRegimen().equals("SinIva")) {
                simplificado.setSelected(true);
            } else {
                comun.setSelected(true);
            }
        } catch (Exception e) {
            comun.setSelected(true);
        }
        
        try {
            if (nodoConf.isPuc()) {
                rdSiPUC.setSelected(true);
                setPuc(true);
            } else {
                rdNoPUC.setSelected(true);
                setPuc(false);
            }
        } catch (Exception e) {
            rdNoPUC.setSelected(true);
            setPuc(false);
        }
        
        try {
            if (nodoConf.isFacturaElectronica()) {
                rdSiFacturaElectronica.setSelected(true);
                setFacturaElectronica(true);
            } else {
                rdNoFacturaElectronica.setSelected(true);
                setFacturaElectronica(false);
            }
        } catch (Exception e) {
            rdNoFacturaElectronica.setSelected(true);
            setFacturaElectronica(false);
        }
        
        try {
            if (nodoConf.isCongeladas()) {
                rdSiCongeladas.setSelected(true);
                setCongeladas(true);
            } else {
                rdNoCongeladas.setSelected(true);
                setCongeladas(false);
            }
        } catch (Exception e) {
            rdNoCongeladas.setSelected(true);
            setCongeladas(false);
        }
        
        try {
            if (nodoConf.isPtm()) {
                rdSiPTM.setSelected(true);
                setPtm(true);
            } else {
                rdNoPTM.setSelected(true);
                setPtm(false);
            }
        } catch (Exception e) {
            rdNoPTM.setSelected(true);
            setPtm(false);
        }
        
        try {
            if (nodoConf.isUsb()) {
                rdSiUSB.setSelected(true);
                setUsb(true);
            } else {
                rdNoUSB.setSelected(true);
                setUsb(false);
            }
        } catch (Exception e) {
            rdNoUSB.setSelected(true);
            setUsb(false);
        }
        
        try {
            if (nodoConf.isEmbarcaciones()) {
                rdSiEmbarcaciones.setSelected(true);
                setEmbarcaciones(true);
            } else {
                rdNoEmbarcaciones.setSelected(true);
                setEmbarcaciones(false);
            }
        } catch (Exception e) {
            rdNoEmbarcaciones.setSelected(true);
            setEmbarcaciones(false);
        }
        
        try {
            if (nodoConf.isFacturacionLote()) {
                rdSiFacturarLote.setSelected(true);
                setFacturacionLote(true);
            } else {
                rdNoFacturaLote.setSelected(true);
                setFacturacionLote(false);
            }
        } catch (Exception e) {
            rdNoFacturaLote.setSelected(true);
            setFacturacionLote(false);
        }
        
        try {
            if (nodoConf.isLaboratorio()) {
                rdSiLaboratorio.setSelected(true);
                setLaboratorio(true);
            } else {
                rdNoLaboratorio.setSelected(true);
                setLaboratorio(false);
            }
        } catch (Exception e) {
            rdNoLaboratorio.setSelected(true);
            setLaboratorio(false);
        }
        
        try {
            if (nodoConf.isOftalmologia()) {
                rdSiOftalmologia.setSelected(true);
                setOftalmologia(true);
            } else {
                rdNoOftalmologia.setSelected(true);
                setOftalmologia(false);
            }
        } catch (Exception e) {
            rdNoOftalmologia.setSelected(true);
            setOftalmologia(false);
        }
        
        try {
            if (nodoConf.isMedico()) {
                rdSiMedico.setSelected(true);
                setMedico(true);
            } else {
                rdNoMedico.setSelected(true);
                setMedico(false);
            }
        } catch (Exception e) {
            rdNoMedico.setSelected(true);
            setMedico(false);
        }
        
        try {
            if (nodoConf.isRecordatorios()) {
                rdSiRecordatorios.setSelected(true);
                setRecordatorios(true);
            } else {
                rdNoRecordatorios.setSelected(true);
                setRecordatorios(false);
            }
        } catch (Exception e) {
            rdNoRecordatorios.setSelected(true);
            setRecordatorios(false);
        }
        
        try {
            if (nodoConf.isRestaurante()) {
                rdSiRestaurante.setSelected(true);
                setRestaurante(true);
            } else {
                rdNoRestaurante.setSelected(true);
                setRestaurante(false);
            }
        } catch (Exception e) {
            rdNoRestaurante.setSelected(true);
            setRestaurante(false);
        }
        
        try {
            if (nodoConf.isMedico()) {
                rdSiMedico.setSelected(true);
                setMedico(true);
            } else {
                rdNoMedico.setSelected(true);
                setMedico(false);
            }
        } catch (Exception e) {
            rdNoMedico.setSelected(true);
            setMedico(false);
        }
        
        try {
            if (nodoConf.isPeriodo()) {
                rdSiPeriodo.setSelected(true);
                setPeriodo(true);
            } else {
                rdNoPeriodo.setSelected(true);
                setPeriodo(false);
            }
        } catch (Exception e) {
            rdNoPeriodo.setSelected(true);
            setPeriodo(false);
        }
        
        try {
            if (nodoConf.isVeterinaria()) {
                rdSiVeterinaria.setSelected(true);
                setVeterinaria(true);
            } else {
                rdNoVeterinaria.setSelected(true);
                setVeterinaria(false);
            }
        } catch (Exception e) {
            rdNoVeterinaria.setSelected(true);
            setVeterinaria(false);
        }
        
        try {
            if (nodoConf.isParqueadero()) {
                rdSiParqueadero.setSelected(true);
                setParqueadero(true);
            } else {
                rdNoParqueadero.setSelected(true);
                setParqueadero(false);
            }
        } catch (Exception e) {
            rdNoParqueadero.setSelected(true);
            setParqueadero(false);
        }
        
        try {
            if (nodoConf.isOrdenServ()) {
                rdSiOrdenServ.setSelected(true);
                setOrdenServ(true);
            } else {
                rdNoOrdenServ.setSelected(true);
                setOrdenServ(false);
            }
        } catch (Exception e) {
            rdNoOrdenServ.setSelected(true);
            setOrdenServ(false);
        }
        
        try {
            if (nodoConf.isCreditos()) {
                rdSiCreditos.setSelected(true);
                setCreditos(true);
            } else {
                rdNoCreditos.setSelected(true);
                setCreditos(false);
            }
        } catch (Exception e) {
            rdNoCreditos.setSelected(true);
            setCreditos(false);
        }
        
        try {
            if (nodoConf.isSepare()) {
                rdSiSepare.setSelected(true);
                setSepare(true);
            } else {
                rdNoSepare.setSelected(true);
                setSepare(false);
            }
        } catch (Exception e) {
            rdNoSepare.setSelected(true);
            setSepare(false);
        }
        
        try {
            if (nodoConf.isServicioAutomotor()) {
                rdSiTaller.setSelected(true);
                setServicioAutomotor(true);
            } else {
                rdNoTaller.setSelected(true);
                setServicioAutomotor(false);
            }
        } catch (Exception e) {
            rdNoTaller.setSelected(true);
            setServicioAutomotor(false);
        }
        
        try {
            if (nodoConf.isPedido()) {
                rdSiPedido.setSelected(true);
                setPedido(true);
            } else {
                rdNoPedido.setSelected(true);
                setPedido(false);
            }
        } catch (Exception e) {
            rdNoPedido.setSelected(true);
            setPedido(false);
        }
        
        try {
            if (nodoConf.isAgenda()) {
                rdSiAgenda.setSelected(true);
                setAgenda(true);
            } else {
                rdNoAgenda.setSelected(true);
                setAgenda(false);
            }
        } catch (Exception e) {
            rdNoAgenda.setSelected(true);
            setAgenda(false);
        }
        
        try {
            if (nodoConf.isInventarioBodegas()) {
                rdSiInventarioBodegas.setSelected(true);
                setInventarioBodegas(true);
            } else {
                rdNoInventarioBodegas.setSelected(true);
                setInventarioBodegas(false);
            }
        } catch (Exception e) {
            rdNoInventarioBodegas.setSelected(true);
            setInventarioBodegas(false);
        }
        
        try {
            if (nodoConf.isProductosSerial()) {
                rdSiProductosSerial.setSelected(true);
                setProductosSerial(true);
            } else {
                rdNoProductosSerial.setSelected(true);
                setProductosSerial(false);
            }
        } catch (Exception e) {
            rdNoProductosSerial.setSelected(true);
            setProductosSerial(false);
        }
        
        String tipoImp = nodoConf.getTipoImpresion();
        if (tipoImp.equals("Sin-Codigo")) {
            chkSinCodigo.setSelected(true);
            setTipoImpresion("Sin-Codigo");
        } else if (tipoImp.equals("Con-Codigo")) {
            chkCodigo.setSelected(true);
            setTipoImpresion("Con-Codigo");
        } else if (tipoImp.equals("Imei")) {
            setTipoImpresion("Imei");
            chkImei.setSelected(true);
        }
        
        txtInformacionLegal.setText(nodoConf.getInformacionLegal());
        instancias.getReporte().setInformacionLegalClick(nodoConf.getInformacionLegal());
        
        String numFacturas = "";
        try {
            numFacturas = nodoConf.getNumFacturas();
        } catch (Exception e) {
            numFacturas = "0";
        }
        txtFacturas.setText(numFacturas);
        setNumFacturas(numFacturas);
        
        String aviso = "";
        try {
            aviso = nodoConf.getAviso();
        } catch (Exception e) {
            aviso = "0";
        }
        txtAviso.setText(aviso);
        setAviso(aviso);
        
        String nit = "";
        
        if (null != nodoConf.getNit()) {
            nit = nodoConf.getNit();
            txtIdentificadorNit.setText(nit);
            if (nit.equals("")) {
                txtIdentificadorNit.setEnabled(true);
            } else {
                txtIdentificadorNit.setEnabled(false);
            }
        }
        
        if (null != nodoConf.getVersion()) {
            lbVersion.setText("Versión: " + nodoConf.getVersion());
        }
        
        if (null != nodoConf.getPais()) {
            cmbPais.setSelectedItem(nodoConf.getPais());
            setPais(nodoConf.getPais());
        }
        
        String nombre = "";
        if (null != nodoConf.getNombre()) {
            nombre = nodoConf.getNombre();
            txtIdentificadorNombre.setText(nombre);
            if (nombre.equals("")) {
                txtIdentificadorNombre.setEnabled(true);
            } else {
                txtIdentificadorNombre.setEnabled(false);
            }
        }
        
        if (!nombre.equals("") && !nit.equals("")) {
            calcularCodigo();
        }

//        String aviso1 = "";
//        try {
//            aviso1 = nodoConf.getAviso1();
//        } catch (Exception e) {
//            aviso1 = "0";
//        }
//        txtAviso1.setText(aviso1);
        txtDiasAlertaBloqueo.setText(nodoConf.getDiasAlertaBloqueo());
        txtDiasBloqueo.setText(nodoConf.getDiasBloqueo());
        txtImpoconsumo.setText(nodoConf.getImpoconsumo());
        numeroCorresponsal.setText(nodoConf.getCorresponsalWeb());
        
        if(!nodoConf.getCorresponsalWeb().toString().equals("0") && !nodoConf.getCorresponsalWeb().toString().equals("")){
          setNumeroCorresponsal(nodoConf.getCorresponsalWeb());
          setCorresponsalWeb(true);
        }else{
          setNumeroCorresponsal("0");
          setCorresponsalWeb(false);
        }
        
        String regimen = "";
        if (simplificado.isSelected()) {
            Logs.log("ENTRO A SIMPLIFICADO");
            regimen = "SinIva";
        } else {
            Object[] datos4 = instancias.getSql().getDatosPrefijosYModelos();
            
            String idAbono = "", idEgreso = "", idNc = "", idNd = "";
            if (datos4[3] != null) {
                idNc = datos4[3].toString();
            }
            
            if (datos4[4] != null) {
                idNd = datos4[4].toString();
            }
            
            if (datos4[6] != null) {
                idAbono = datos4[6].toString();
            }
            
            if (datos4[7] != null) {
                idEgreso = datos4[7].toString();
            }
            
            instancias.setIdNC(idNc);
            instancias.setIdND(idNd);
            instancias.setIdAbono(idAbono);
            instancias.setIdEgreso(idEgreso);
        }
        instancias.setRegimen(regimen);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        factura = new javax.swing.ButtonGroup();
        grupoRegimen = new javax.swing.ButtonGroup();
        grupoCongeladas = new javax.swing.ButtonGroup();
        grupoMedico = new javax.swing.ButtonGroup();
        grupoVeterinaria = new javax.swing.ButtonGroup();
        grupoParqueadero = new javax.swing.ButtonGroup();
        grupoOrdenServ = new javax.swing.ButtonGroup();
        grupoCreditos = new javax.swing.ButtonGroup();
        grupoSepare = new javax.swing.ButtonGroup();
        grupoPedido = new javax.swing.ButtonGroup();
        grupoAgenda = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        grupoOftalmologia = new javax.swing.ButtonGroup();
        grupoTipoImpresion = new javax.swing.ButtonGroup();
        grupoInventarioBodegas = new javax.swing.ButtonGroup();
        grupoProductosSerial = new javax.swing.ButtonGroup();
        grupoFacturaLote = new javax.swing.ButtonGroup();
        grupoEmbarcaciones = new javax.swing.ButtonGroup();
        grupoUsb = new javax.swing.ButtonGroup();
        grupoPTM = new javax.swing.ButtonGroup();
        grupoFElectronica = new javax.swing.ButtonGroup();
        grupoPUC = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        configuracion = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbTelefono3 = new javax.swing.JLabel();
        comun = new javax.swing.JRadioButton();
        simplificado = new javax.swing.JRadioButton();
        lbTelefono21 = new javax.swing.JLabel();
        txtImpoconsumo = new javax.swing.JTextField();
        lbTelefono37 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        lbTelefono10 = new javax.swing.JLabel();
        lbTelefono11 = new javax.swing.JLabel();
        lbTelefono12 = new javax.swing.JLabel();
        lbTelefono15 = new javax.swing.JLabel();
        rdSiOrdenServ = new javax.swing.JRadioButton();
        rdNoOrdenServ = new javax.swing.JRadioButton();
        rdNoCreditos = new javax.swing.JRadioButton();
        rdSiCreditos = new javax.swing.JRadioButton();
        rdSiSepare = new javax.swing.JRadioButton();
        rdNoSepare = new javax.swing.JRadioButton();
        rdSiPedido = new javax.swing.JRadioButton();
        rdNoPedido = new javax.swing.JRadioButton();
        rdSiTaller = new javax.swing.JRadioButton();
        rdNoTaller = new javax.swing.JRadioButton();
        lbTelefono38 = new javax.swing.JLabel();
        numeroCorresponsal = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        lbTelefono6 = new javax.swing.JLabel();
        lbTelefono7 = new javax.swing.JLabel();
        lbTelefono8 = new javax.swing.JLabel();
        lbTelefono9 = new javax.swing.JLabel();
        lbTelefono16 = new javax.swing.JLabel();
        lbTelefono18 = new javax.swing.JLabel();
        lbTelefono19 = new javax.swing.JLabel();
        lbTelefono20 = new javax.swing.JLabel();
        rdSiCongeladas = new javax.swing.JRadioButton();
        rdNoCongeladas = new javax.swing.JRadioButton();
        rdSiMedico = new javax.swing.JRadioButton();
        rdNoMedico = new javax.swing.JRadioButton();
        rdSiVeterinaria = new javax.swing.JRadioButton();
        rdNoVeterinaria = new javax.swing.JRadioButton();
        rdSiParqueadero = new javax.swing.JRadioButton();
        rdNoParqueadero = new javax.swing.JRadioButton();
        rdSiAgenda = new javax.swing.JRadioButton();
        rdNoAgenda = new javax.swing.JRadioButton();
        rdSiRestaurante = new javax.swing.JRadioButton();
        rdNoRestaurante = new javax.swing.JRadioButton();
        rdSiRecordatorios = new javax.swing.JRadioButton();
        rdNoRecordatorios = new javax.swing.JRadioButton();
        rdSiLaboratorio = new javax.swing.JRadioButton();
        rdNoLaboratorio = new javax.swing.JRadioButton();
        lbTelefono22 = new javax.swing.JLabel();
        rdSiOftalmologia = new javax.swing.JRadioButton();
        rdNoOftalmologia = new javax.swing.JRadioButton();
        lbTelefono28 = new javax.swing.JLabel();
        rdSiFacturarLote = new javax.swing.JRadioButton();
        rdNoFacturaLote = new javax.swing.JRadioButton();
        lbTelefono34 = new javax.swing.JLabel();
        rdSiPTM = new javax.swing.JRadioButton();
        rdNoPTM = new javax.swing.JRadioButton();
        lbTelefono35 = new javax.swing.JLabel();
        rdSiFacturaElectronica = new javax.swing.JRadioButton();
        rdNoFacturaElectronica = new javax.swing.JRadioButton();
        lbTelefono36 = new javax.swing.JLabel();
        rdSiPUC = new javax.swing.JRadioButton();
        rdNoPUC = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lbTelefono23 = new javax.swing.JLabel();
        lbTelefono24 = new javax.swing.JLabel();
        lbTelefono25 = new javax.swing.JLabel();
        chkCodigo = new javax.swing.JCheckBox();
        chkSinCodigo = new javax.swing.JCheckBox();
        chkImei = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        lbTelefono26 = new javax.swing.JLabel();
        rdSiInventarioBodegas = new javax.swing.JRadioButton();
        rdNoInventarioBodegas = new javax.swing.JRadioButton();
        lbTelefono27 = new javax.swing.JLabel();
        rdSiProductosSerial = new javax.swing.JRadioButton();
        rdNoProductosSerial = new javax.swing.JRadioButton();
        lbTelefono29 = new javax.swing.JLabel();
        rdSiEmbarcaciones = new javax.swing.JRadioButton();
        rdNoEmbarcaciones = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lbTelefono30 = new javax.swing.JLabel();
        rdSiUSB = new javax.swing.JCheckBox();
        rdNoUSB = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMonedas = new javax.swing.JTable();
        txtDescripcion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSimbolo = new javax.swing.JTextField();
        txtDecimales = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnOcultarInfoCliente = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFacturas = new javax.swing.JTextField();
        rdSiPeriodo = new javax.swing.JRadioButton();
        rdNoPeriodo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAviso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDiasBloqueo = new javax.swing.JTextField();
        txtDiasAlertaBloqueo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        dtFecha1 = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        txtDiasAlertaBloqueo1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbTelefono17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformacionLegal = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        lbTelefono31 = new javax.swing.JLabel();
        txtIdentificadorNit = new javax.swing.JTextField();
        lbTelefono32 = new javax.swing.JLabel();
        txtIdentificadorNombre = new javax.swing.JTextField();
        lbTelefono33 = new javax.swing.JLabel();
        txtCodigoFinal = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        logs = new javax.swing.JCheckBox();
        debug = new javax.swing.JCheckBox();
        validarConfSiempre = new javax.swing.JCheckBox();
        btnLiberarMesasBloqueadas = new javax.swing.JButton();
        btnDesbloquearUsuarios = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbVersion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuraciones del sistema");
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        configuracion.setBackground(new java.awt.Color(255, 255, 255));
        configuracion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbTelefono3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTelefono3.setText("Regimen:");

        comun.setBackground(new java.awt.Color(255, 255, 255));
        grupoRegimen.add(comun);
        comun.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        comun.setSelected(true);
        comun.setText("Común");

        simplificado.setBackground(new java.awt.Color(255, 255, 255));
        grupoRegimen.add(simplificado);
        simplificado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        simplificado.setText("Simplificado");

        lbTelefono21.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono21.setText("Impoconsumo:");

        txtImpoconsumo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtImpoconsumo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImpoconsumo.setText("8");
        txtImpoconsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpoconsumoKeyTyped(evt);
            }
        });

        lbTelefono37.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono37.setText("Pais:");

        cmbPais.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Colombia", "Panama" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTelefono21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtImpoconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(simplificado)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lbTelefono37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono3)
                    .addComponent(comun)
                    .addComponent(simplificado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTelefono21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtImpoconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTelefono37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbPais))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modúlos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        lbTelefono10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono10.setText("Ordenes Serv:");

        lbTelefono11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono11.setText("Creditos:");

        lbTelefono12.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono12.setText("Plan Separe:");

        lbTelefono15.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono15.setText("Pedidos:");

        rdSiOrdenServ.setBackground(new java.awt.Color(255, 255, 255));
        grupoOrdenServ.add(rdSiOrdenServ);
        rdSiOrdenServ.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiOrdenServ.setText("Si");
        rdSiOrdenServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSiOrdenServActionPerformed(evt);
            }
        });

        rdNoOrdenServ.setBackground(new java.awt.Color(255, 255, 255));
        grupoOrdenServ.add(rdNoOrdenServ);
        rdNoOrdenServ.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoOrdenServ.setText("No");

        rdNoCreditos.setBackground(new java.awt.Color(255, 255, 255));
        grupoCreditos.add(rdNoCreditos);
        rdNoCreditos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoCreditos.setText("No");

        rdSiCreditos.setBackground(new java.awt.Color(255, 255, 255));
        grupoCreditos.add(rdSiCreditos);
        rdSiCreditos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiCreditos.setSelected(true);
        rdSiCreditos.setText("Si");

        rdSiSepare.setBackground(new java.awt.Color(255, 255, 255));
        grupoSepare.add(rdSiSepare);
        rdSiSepare.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiSepare.setSelected(true);
        rdSiSepare.setText("Si");

        rdNoSepare.setBackground(new java.awt.Color(255, 255, 255));
        grupoSepare.add(rdNoSepare);
        rdNoSepare.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoSepare.setText("No");

        rdSiPedido.setBackground(new java.awt.Color(255, 255, 255));
        grupoPedido.add(rdSiPedido);
        rdSiPedido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiPedido.setSelected(true);
        rdSiPedido.setText("Si");

        rdNoPedido.setBackground(new java.awt.Color(255, 255, 255));
        grupoPedido.add(rdNoPedido);
        rdNoPedido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoPedido.setText("No");

        rdSiTaller.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(rdSiTaller);
        rdSiTaller.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiTaller.setText("Taller");

        rdNoTaller.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(rdNoTaller);
        rdNoTaller.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoTaller.setSelected(true);
        rdNoTaller.setText("Normal");

        lbTelefono38.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono38.setText("Corresponsal:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTelefono15, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbTelefono12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTelefono11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTelefono10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(rdSiSepare)
                                .addGap(5, 5, 5)
                                .addComponent(rdNoSepare))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(rdSiPedido)
                                .addGap(5, 5, 5)
                                .addComponent(rdNoPedido)))
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(rdSiOrdenServ)
                                .addGap(5, 5, 5)
                                .addComponent(rdNoOrdenServ))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(rdSiCreditos)
                                .addGap(5, 5, 5)
                                .addComponent(rdNoCreditos)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(rdSiTaller)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdNoTaller))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(lbTelefono38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numeroCorresponsal)
                                .addContainerGap())))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiTaller)
                        .addComponent(rdNoTaller))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTelefono10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdSiOrdenServ)
                        .addComponent(rdNoOrdenServ)))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdSiCreditos)
                    .addComponent(rdNoCreditos)
                    .addComponent(lbTelefono11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono38)
                    .addComponent(numeroCorresponsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdSiSepare)
                    .addComponent(rdNoSepare)
                    .addComponent(lbTelefono12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiPedido)
                        .addComponent(rdNoPedido))
                    .addComponent(lbTelefono15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        lbTelefono6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono6.setText("Congeladas:");

        lbTelefono7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono7.setText("Medico:");

        lbTelefono8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono8.setText("Veterinaria:");

        lbTelefono9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono9.setText("Parqueadero:");

        lbTelefono16.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono16.setText("Agenda:");

        lbTelefono18.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono18.setText("Restaurante:");

        lbTelefono19.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono19.setText("Recordatorios:");

        lbTelefono20.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono20.setText("Laboratorio:");

        rdSiCongeladas.setBackground(new java.awt.Color(255, 255, 255));
        grupoCongeladas.add(rdSiCongeladas);
        rdSiCongeladas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiCongeladas.setSelected(true);
        rdSiCongeladas.setText("Si");

        rdNoCongeladas.setBackground(new java.awt.Color(255, 255, 255));
        grupoCongeladas.add(rdNoCongeladas);
        rdNoCongeladas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoCongeladas.setText("No");

        rdSiMedico.setBackground(new java.awt.Color(255, 255, 255));
        grupoMedico.add(rdSiMedico);
        rdSiMedico.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiMedico.setSelected(true);
        rdSiMedico.setText("Si");

        rdNoMedico.setBackground(new java.awt.Color(255, 255, 255));
        grupoMedico.add(rdNoMedico);
        rdNoMedico.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoMedico.setText("No");

        rdSiVeterinaria.setBackground(new java.awt.Color(255, 255, 255));
        grupoVeterinaria.add(rdSiVeterinaria);
        rdSiVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiVeterinaria.setSelected(true);
        rdSiVeterinaria.setText("Si");

        rdNoVeterinaria.setBackground(new java.awt.Color(255, 255, 255));
        grupoVeterinaria.add(rdNoVeterinaria);
        rdNoVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoVeterinaria.setText("No");

        rdSiParqueadero.setBackground(new java.awt.Color(255, 255, 255));
        grupoParqueadero.add(rdSiParqueadero);
        rdSiParqueadero.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiParqueadero.setSelected(true);
        rdSiParqueadero.setText("Si");

        rdNoParqueadero.setBackground(new java.awt.Color(255, 255, 255));
        grupoParqueadero.add(rdNoParqueadero);
        rdNoParqueadero.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoParqueadero.setText("No");

        rdSiAgenda.setBackground(new java.awt.Color(255, 255, 255));
        grupoAgenda.add(rdSiAgenda);
        rdSiAgenda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiAgenda.setSelected(true);
        rdSiAgenda.setText("Si");

        rdNoAgenda.setBackground(new java.awt.Color(255, 255, 255));
        grupoAgenda.add(rdNoAgenda);
        rdNoAgenda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoAgenda.setText("No");

        rdSiRestaurante.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdSiRestaurante);
        rdSiRestaurante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiRestaurante.setSelected(true);
        rdSiRestaurante.setText("Si");

        rdNoRestaurante.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdNoRestaurante);
        rdNoRestaurante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoRestaurante.setText("No");
        rdNoRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoRestauranteActionPerformed(evt);
            }
        });

        rdSiRecordatorios.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdSiRecordatorios);
        rdSiRecordatorios.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiRecordatorios.setSelected(true);
        rdSiRecordatorios.setText("Si");

        rdNoRecordatorios.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdNoRecordatorios);
        rdNoRecordatorios.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoRecordatorios.setText("No");
        rdNoRecordatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoRecordatoriosActionPerformed(evt);
            }
        });

        rdSiLaboratorio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rdSiLaboratorio);
        rdSiLaboratorio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiLaboratorio.setSelected(true);
        rdSiLaboratorio.setText("Si");

        rdNoLaboratorio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rdNoLaboratorio);
        rdNoLaboratorio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoLaboratorio.setText("No");
        rdNoLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoLaboratorioActionPerformed(evt);
            }
        });

        lbTelefono22.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono22.setText("Oftalmología:");

        rdSiOftalmologia.setBackground(new java.awt.Color(255, 255, 255));
        grupoOftalmologia.add(rdSiOftalmologia);
        rdSiOftalmologia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiOftalmologia.setSelected(true);
        rdSiOftalmologia.setText("Si");

        rdNoOftalmologia.setBackground(new java.awt.Color(255, 255, 255));
        grupoOftalmologia.add(rdNoOftalmologia);
        rdNoOftalmologia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoOftalmologia.setText("No");
        rdNoOftalmologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoOftalmologiaActionPerformed(evt);
            }
        });

        lbTelefono28.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono28.setText("Factura Lote:");

        rdSiFacturarLote.setBackground(new java.awt.Color(255, 255, 255));
        grupoFacturaLote.add(rdSiFacturarLote);
        rdSiFacturarLote.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiFacturarLote.setSelected(true);
        rdSiFacturarLote.setText("Si");

        rdNoFacturaLote.setBackground(new java.awt.Color(255, 255, 255));
        grupoFacturaLote.add(rdNoFacturaLote);
        rdNoFacturaLote.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoFacturaLote.setText("No");
        rdNoFacturaLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoFacturaLoteActionPerformed(evt);
            }
        });

        lbTelefono34.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono34.setText("PTM");

        rdSiPTM.setBackground(new java.awt.Color(255, 255, 255));
        grupoPTM.add(rdSiPTM);
        rdSiPTM.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiPTM.setSelected(true);
        rdSiPTM.setText("Si");

        rdNoPTM.setBackground(new java.awt.Color(255, 255, 255));
        grupoPTM.add(rdNoPTM);
        rdNoPTM.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoPTM.setText("No");
        rdNoPTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoPTMActionPerformed(evt);
            }
        });

        lbTelefono35.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono35.setText("F. Electrónica:");

        rdSiFacturaElectronica.setBackground(new java.awt.Color(255, 255, 255));
        grupoFElectronica.add(rdSiFacturaElectronica);
        rdSiFacturaElectronica.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiFacturaElectronica.setSelected(true);
        rdSiFacturaElectronica.setText("Si");

        rdNoFacturaElectronica.setBackground(new java.awt.Color(255, 255, 255));
        grupoFElectronica.add(rdNoFacturaElectronica);
        rdNoFacturaElectronica.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoFacturaElectronica.setText("No");
        rdNoFacturaElectronica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoFacturaElectronicaActionPerformed(evt);
            }
        });

        lbTelefono36.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono36.setText("Contable:");

        rdSiPUC.setBackground(new java.awt.Color(255, 255, 255));
        grupoPUC.add(rdSiPUC);
        rdSiPUC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiPUC.setText("Si");

        rdNoPUC.setBackground(new java.awt.Color(255, 255, 255));
        grupoPUC.add(rdNoPUC);
        rdNoPUC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoPUC.setText("No");
        rdNoPUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNoPUCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTelefono28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono19, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(lbTelefono18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rdSiCongeladas)
                        .addGap(5, 5, 5)
                        .addComponent(rdNoCongeladas))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rdSiParqueadero)
                        .addGap(5, 5, 5)
                        .addComponent(rdNoParqueadero))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rdSiAgenda)
                        .addGap(5, 5, 5)
                        .addComponent(rdNoAgenda))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rdSiRestaurante)
                        .addGap(5, 5, 5)
                        .addComponent(rdNoRestaurante))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(rdSiRecordatorios)
                        .addGap(5, 5, 5)
                        .addComponent(rdNoRecordatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rdSiMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdSiVeterinaria))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdNoVeterinaria)
                            .addComponent(rdNoMedico, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rdSiFacturarLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdSiOftalmologia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdSiPTM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdSiFacturaElectronica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdSiPUC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(rdSiLaboratorio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rdNoLaboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdNoPTM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdNoFacturaLote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdNoOftalmologia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdNoFacturaElectronica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdNoPUC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(5, 5, 5))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiCongeladas)
                        .addComponent(rdNoCongeladas))
                    .addComponent(lbTelefono6))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdNoMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono7)
                    .addComponent(rdSiMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiVeterinaria)
                        .addComponent(rdNoVeterinaria))
                    .addComponent(lbTelefono8))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiParqueadero)
                        .addComponent(rdNoParqueadero))
                    .addComponent(lbTelefono9))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiAgenda)
                        .addComponent(rdNoAgenda))
                    .addComponent(lbTelefono16))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiRestaurante)
                        .addComponent(rdNoRestaurante))
                    .addComponent(lbTelefono18))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiRecordatorios)
                        .addComponent(rdNoRecordatorios))
                    .addComponent(lbTelefono19))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiLaboratorio)
                        .addComponent(rdNoLaboratorio))
                    .addComponent(lbTelefono20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiOftalmologia)
                        .addComponent(rdNoOftalmologia))
                    .addComponent(lbTelefono22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono28)
                    .addComponent(rdSiFacturarLote)
                    .addComponent(rdNoFacturaLote))
                .addGap(3, 3, 3)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdNoPTM)
                    .addComponent(rdSiPTM)
                    .addComponent(lbTelefono34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono35)
                    .addComponent(rdNoFacturaElectronica)
                    .addComponent(rdSiFacturaElectronica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono36)
                    .addComponent(rdSiPUC)
                    .addComponent(rdNoPUC))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de impresión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        lbTelefono23.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono23.setText("Con codigo:");

        lbTelefono24.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono24.setText("Sin codigo:");

        lbTelefono25.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono25.setText("Imei:");

        grupoTipoImpresion.add(chkCodigo);
        chkCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        chkCodigo.setText("Sel");

        grupoTipoImpresion.add(chkSinCodigo);
        chkSinCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        chkSinCodigo.setText("Sel");

        grupoTipoImpresion.add(chkImei);
        chkImei.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        chkImei.setText("Sel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbTelefono25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkImei)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(chkSinCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSinCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkImei, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Divisiones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        lbTelefono26.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono26.setText("Inv. por bodegas:");

        rdSiInventarioBodegas.setBackground(new java.awt.Color(255, 255, 255));
        grupoInventarioBodegas.add(rdSiInventarioBodegas);
        rdSiInventarioBodegas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiInventarioBodegas.setText("Si");
        rdSiInventarioBodegas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSiInventarioBodegasActionPerformed(evt);
            }
        });

        rdNoInventarioBodegas.setBackground(new java.awt.Color(255, 255, 255));
        grupoInventarioBodegas.add(rdNoInventarioBodegas);
        rdNoInventarioBodegas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoInventarioBodegas.setText("No");

        lbTelefono27.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono27.setText("Productos con serial:");

        rdSiProductosSerial.setBackground(new java.awt.Color(255, 255, 255));
        grupoProductosSerial.add(rdSiProductosSerial);
        rdSiProductosSerial.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiProductosSerial.setText("Si");
        rdSiProductosSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSiProductosSerialActionPerformed(evt);
            }
        });

        rdNoProductosSerial.setBackground(new java.awt.Color(255, 255, 255));
        grupoProductosSerial.add(rdNoProductosSerial);
        rdNoProductosSerial.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoProductosSerial.setText("No");

        lbTelefono29.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono29.setText("Embarcaciones");

        rdSiEmbarcaciones.setBackground(new java.awt.Color(255, 255, 255));
        grupoEmbarcaciones.add(rdSiEmbarcaciones);
        rdSiEmbarcaciones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiEmbarcaciones.setSelected(true);
        rdSiEmbarcaciones.setText("Si");
        rdSiEmbarcaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSiEmbarcacionesActionPerformed(evt);
            }
        });

        rdNoEmbarcaciones.setBackground(new java.awt.Color(255, 255, 255));
        grupoEmbarcaciones.add(rdNoEmbarcaciones);
        rdNoEmbarcaciones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoEmbarcaciones.setText("No");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbTelefono26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(rdSiInventarioBodegas)
                            .addGap(5, 5, 5)
                            .addComponent(rdNoInventarioBodegas))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                            .addComponent(rdSiProductosSerial)
                            .addGap(5, 5, 5)
                            .addComponent(rdNoProductosSerial)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(rdSiEmbarcaciones)
                        .addGap(5, 5, 5)
                        .addComponent(rdNoEmbarcaciones)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdSiInventarioBodegas)
                    .addComponent(rdNoInventarioBodegas))
                .addGap(3, 3, 3)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiProductosSerial)
                        .addComponent(rdNoProductosSerial))
                    .addComponent(lbTelefono27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdSiEmbarcaciones)
                        .addComponent(rdNoEmbarcaciones))
                    .addComponent(lbTelefono29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        lbTelefono30.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTelefono30.setText("Dispositivo USB para desbloquear:");

        grupoUsb.add(rdSiUSB);
        rdSiUSB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdSiUSB.setText("Si");

        grupoUsb.add(rdNoUSB);
        rdNoUSB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        rdNoUSB.setSelected(true);
        rdNoUSB.setText("No");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTelefono30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdSiUSB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdNoUSB)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdSiUSB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdNoUSB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        configuracion.addTab("Tipo", jPanel1);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        tblMonedas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblMonedas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripcion", "Simbolo", "Decimales", "Sel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMonedas.setRowHeight(24);
        tblMonedas.getTableHeader().setReorderingAllowed(false);
        tblMonedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonedasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblMonedasMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(tblMonedas);
        if (tblMonedas.getColumnModel().getColumnCount() > 0) {
            tblMonedas.getColumnModel().getColumn(0).setMinWidth(150);
            tblMonedas.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblMonedas.getColumnModel().getColumn(3).setMinWidth(70);
            tblMonedas.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblMonedas.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setText("Descripción:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setText("Simbolo:");

        txtSimbolo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSimbolo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSimboloKeyTyped(evt);
            }
        });

        txtDecimales.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDecimales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDecimalesKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel10.setText("Decimales:");

        btnOcultarInfoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-suma.png"))); // NOI18N
        btnOcultarInfoCliente.setToolTipText("Ctrl+M");
        btnOcultarInfoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcultarInfoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOcultarInfoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSimbolo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDecimales, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOcultarInfoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        configuracion.addTab("Monedas", jPanel14);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plazos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("Número facturas:");

        txtFacturas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFacturasKeyTyped(evt);
            }
        });

        buttonGroup5.add(rdSiPeriodo);
        rdSiPeriodo.setText("Si");

        buttonGroup5.add(rdNoPeriodo);
        rdNoPeriodo.setText("No");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Periodo de prueba");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel5.setText("Avisar finalización de prueba:");

        txtAviso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAvisoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Días despues para bloqueo:");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Días para alerta de bloqueo:");

        txtDiasBloqueo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiasBloqueo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasBloqueoKeyTyped(evt);
            }
        });

        txtDiasAlertaBloqueo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiasAlertaBloqueo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasAlertaBloqueoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ACTUALIZACIÓN OBLIGATORIA");

        try {
            dtFecha1.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2016, 10, 25),
                new java.util.GregorianCalendar(2016, 10, 25))));
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    dtFecha1.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));

    jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
    jLabel7.setText("Días para alerta de bloqueo:");

    txtDiasAlertaBloqueo1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtDiasAlertaBloqueo1KeyTyped(evt);
        }
    });

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDiasBloqueo)
                        .addComponent(txtDiasAlertaBloqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(rdSiPeriodo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rdNoPeriodo))
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDiasAlertaBloqueo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(241, Short.MAX_VALUE))
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDiasAlertaBloqueo))
            .addGap(3, 3, 3)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDiasBloqueo))
            .addGap(15, 15, 15)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdSiPeriodo)
                    .addComponent(rdNoPeriodo))
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txtAviso)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(3, 3, 3)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addComponent(txtFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(3, 3, 3)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7)
                .addComponent(txtDiasAlertaBloqueo1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dtFecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(151, Short.MAX_VALUE))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    configuracion.addTab("Bloqueo", jPanel6);

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));

    lbTelefono17.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
    lbTelefono17.setText("Información legal impresión:");

    txtInformacionLegal.setColumns(20);
    txtInformacionLegal.setRows(3);
    jScrollPane1.setViewportView(txtInformacionLegal);

    jPanel13.setBackground(new java.awt.Color(255, 255, 255));
    jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Identificador de la empresa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

    lbTelefono31.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
    lbTelefono31.setText("Nit:");

    txtIdentificadorNit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
    txtIdentificadorNit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtIdentificadorNit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    txtIdentificadorNit.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txtIdentificadorNitKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtIdentificadorNitKeyTyped(evt);
        }
    });

    lbTelefono32.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
    lbTelefono32.setText("Nombre:");

    txtIdentificadorNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
    txtIdentificadorNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtIdentificadorNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    txtIdentificadorNombre.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txtIdentificadorNombreKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtIdentificadorNombreKeyTyped(evt);
        }
    });

    lbTelefono33.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
    lbTelefono33.setText("Codigo:");

    txtCodigoFinal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
    txtCodigoFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    txtCodigoFinal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
    txtCodigoFinal.setEnabled(false);
    txtCodigoFinal.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtCodigoFinalKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
    jPanel13.setLayout(jPanel13Layout);
    jPanel13Layout.setHorizontalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel13Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(lbTelefono33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTelefono32, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addComponent(lbTelefono31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(5, 5, 5)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txtIdentificadorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addComponent(txtIdentificadorNit, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtCodigoFinal))
            .addContainerGap(20, Short.MAX_VALUE))
    );
    jPanel13Layout.setVerticalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel13Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtIdentificadorNit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbTelefono31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(3, 3, 3)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbTelefono32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtIdentificadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(3, 3, 3)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbTelefono33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtCodigoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(5, 5, 5))
    );

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 232, Short.MAX_VALUE))
                .addComponent(lbTelefono17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(lbTelefono17)
            .addGap(3, 3, 3)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
            .addContainerGap())
    );

    configuracion.addTab("Información", jPanel4);

    jPanel12.setBackground(new java.awt.Color(255, 255, 255));

    logs.setText("Habilitar Logs");

    debug.setText("Habilitar Debug");
    debug.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            debugActionPerformed(evt);
        }
    });

    validarConfSiempre.setText("Validar Configuración Siempre");
    validarConfSiempre.setToolTipText("");

    btnLiberarMesasBloqueadas.setText("Liberar Mesas");
    btnLiberarMesasBloqueadas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLiberarMesasBloqueadasActionPerformed(evt);
        }
    });

    btnDesbloquearUsuarios.setText("Desbloquear Ususrios");
    btnDesbloquearUsuarios.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDesbloquearUsuariosActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
    jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLiberarMesasBloqueadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDesbloquearUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(logs)
                .addComponent(validarConfSiempre)
                .addComponent(debug))
            .addContainerGap(537, Short.MAX_VALUE))
    );
    jPanel12Layout.setVerticalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(logs)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(debug)
            .addGap(16, 16, 16)
            .addComponent(validarConfSiempre)
            .addGap(114, 114, 114)
            .addComponent(btnLiberarMesasBloqueadas)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnDesbloquearUsuarios)
            .addContainerGap(121, Short.MAX_VALUE))
    );

    configuracion.addTab("Administración", jPanel12);

    jButton1.setBackground(new java.awt.Color(46, 204, 113));
    jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
    jButton1.setText("GUARDAR");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    lbVersion.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
    lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lbVersion.setText("Versión: ");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(lbVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ndConfiguracion nodoConf = new ndConfiguracion();
        
        String regimen = "";
        if (simplificado.isSelected()) {
            regimen = "SinIva";
        }
        
        if (rdSiUSB.isSelected()) {
            nodoConf.setUsb(true);
        } else {
            nodoConf.setUsb(false);
        }
            
        if (rdSiEmbarcaciones.isSelected()) {
            nodoConf.setEmbarcaciones(true);
        } else {
            nodoConf.setEmbarcaciones(false);
        }
        
        if (rdSiCongeladas.isSelected()) {
            nodoConf.setCongeladas(true);
        } else {
            nodoConf.setCongeladas(false);
        }
        
        if (rdSiMedico.isSelected()) {
            nodoConf.setMedico(true);
        } else {
            nodoConf.setMedico(false);
        }
        
        if (rdSiLaboratorio.isSelected()) {
            nodoConf.setLaboratorio(true);
        } else {
            nodoConf.setLaboratorio(false);
        }
        
        if (rdSiVeterinaria.isSelected()) {
            nodoConf.setVeterinaria(true);
        } else {
            nodoConf.setVeterinaria(false);
        }
        
        if (rdSiParqueadero.isSelected()) {
            nodoConf.setParqueadero(true);
        } else {
            nodoConf.setParqueadero(false);
        }
        
        if (rdSiOrdenServ.isSelected()) {
            nodoConf.setOrdenServ(true);
        } else {
            nodoConf.setOrdenServ(false);
        }
        
        if (rdSiCreditos.isSelected()) {
            nodoConf.setCreditos(true);
        } else {
            nodoConf.setCreditos(false);
        }
        
        if (rdSiSepare.isSelected()) {
            nodoConf.setSepare(true);
        } else {
            nodoConf.setSepare(false);
        }
        
        if (rdSiPedido.isSelected()) {
            nodoConf.setPedido(true);
        } else {
            nodoConf.setPedido(false);
        }
        
        if (rdSiAgenda.isSelected()) {
            nodoConf.setAgenda(true);
        } else {
            nodoConf.setAgenda(false);
        }
        
        if (rdSiRestaurante.isSelected()) {
            nodoConf.setRestaurante(true);
        } else {
            nodoConf.setRestaurante(false);
        }
        
        if (rdSiRecordatorios.isSelected()) {
            nodoConf.setRecordatorios(true);
        } else {
            nodoConf.setRecordatorios(false);
        }
        
        if (rdSiTaller.isSelected()) {
            nodoConf.setServicioAutomotor(true);
        } else {
            nodoConf.setServicioAutomotor(false);
        }
        
        if (rdSiFacturarLote.isSelected()) {
            nodoConf.setFacturacionLote(true);
        } else {
            nodoConf.setFacturacionLote(false);
        }
        
        if (rdSiPeriodo.isSelected()) {
            nodoConf.setPeriodo(true);
        } else {
            nodoConf.setPeriodo(false);
        }
        
        if (rdSiOftalmologia.isSelected()) {
            nodoConf.setOftalmologia(true);
        } else {
            nodoConf.setOftalmologia(false);
        }
        
        if (rdSiInventarioBodegas.isSelected()) {
            nodoConf.setInventarioBodegas(true);
        } else {
            nodoConf.setInventarioBodegas(false);
        }
        
        if (rdSiProductosSerial.isSelected()) {
            nodoConf.setProductosSerial(true);
        } else {
            nodoConf.setProductosSerial(false);
        }
        
        if (rdSiPTM.isSelected()) {
            nodoConf.setPtm(true);
        } else {
            nodoConf.setPtm(false);
        }
        
        if (rdSiFacturaElectronica.isSelected()) {
            nodoConf.setFacturaElectronica(true);
        } else {
            nodoConf.setFacturaElectronica(false);
        }
        
        if (rdSiPUC.isSelected()) {
            nodoConf.setPuc(true);
        } else {
            nodoConf.setPuc(false);
        }
        
        nodoConf.setInformacionLegal(txtInformacionLegal.getText());
        nodoConf.setNumFacturas(txtFacturas.getText());
        nodoConf.setAviso(txtAviso.getText());
        nodoConf.setAviso1("");
        nodoConf.setVentasFactura("estandar");
        nodoConf.setRegimen(regimen);
        
        nodoConf.setDiasAlertaBloqueo(txtDiasAlertaBloqueo.getText());
        nodoConf.setDiasBloqueo(txtDiasBloqueo.getText());
        
        nodoConf.setImpoconsumo(txtImpoconsumo.getText());
        nodoConf.setActualizacion(metodos.fechaConsulta(dtFecha1.getText()));
        nodoConf.setDiasActualizacion(txtDiasAlertaBloqueo1.getText());
        nodoConf.setNombre(txtIdentificadorNombre.getText());
        nodoConf.setNit(txtIdentificadorNit.getText());
        nodoConf.setVersion(lbVersion.getText().replace("Versión: ", ""));
        nodoConf.setPais(cmbPais.getSelectedItem().toString());
        nodoConf.setCorresponsalWeb(numeroCorresponsal.getText());
        String tipo = "";
        if (chkCodigo.isSelected()) {
            tipo = "Con-Codigo";
        } else if (chkSinCodigo.isSelected()) {
            tipo = "Sin-Codigo";
        } else if (chkImei.isSelected()) {
            tipo = "Imei";
        }
        
        nodoConf.setTipoImpresion(tipo);
        
        if (logs.isSelected()) {
            nodoConf.setLogs(true);
        } else {
            nodoConf.setLogs(false);
        }
        
        if (debug.isSelected()) {
            nodoConf.setDebug(true);
        } else {
            nodoConf.setDebug(false);
        }
        if (validarConfSiempre.isSelected()) {
            nodoConf.setValidarConfSiempre(true);
        } else {
            nodoConf.setValidarConfSiempre(false);
        }
        
        
        if (!instancias.getSql().modificarConfiguracion(nodoConf)) {
            metodos.msgError(null, "Hubo un problema al guardar los cambios de configuracion");
            return;
        }
        
        if (!instancias.getSql().cambiarEstadoMoneda()) {
            metodos.msgError(null, "Error al cambiar estados de monedas");
            return;
        } else {
            String simbolo = "";
            for (int i = 0; i < tblMonedas.getRowCount(); i++) {
                if ((Boolean) tblMonedas.getValueAt(i, 3)) {
                    simbolo = tblMonedas.getValueAt(i, 1).toString();
                }
            }
            
            if (!instancias.getSql().modificarMoneda(simbolo)) {
                metodos.msgError(null, "Error al asignar moneda");
            }
        }

//        if (txtIdentificadorNit.isEnabled()) {
//            if (!instancias.getSql1().agregarRegistro(txtCodigoFinal.getText(), txtIdentificadorNit.getText(), txtIdentificadorNombre.getText())) {
//                metodos.msgError(null, "Error al registrar cliente");
//                return;
//            }
//        }
        metodos.msgExito(null, "Cambios guardados con éxito");
        instancias.getMenu().setInstancias(instancias);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCodigoFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoFinalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoFinalKeyTyped

    private void txtIdentificadorNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificadorNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificadorNombreKeyTyped

    private void txtIdentificadorNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificadorNombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtInformacionLegal.requestFocus();
        } else {
            calcularCodigo();
        }
    }//GEN-LAST:event_txtIdentificadorNombreKeyReleased

    private void txtIdentificadorNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificadorNitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificadorNitKeyTyped

    private void txtIdentificadorNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificadorNitKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIdentificadorNombre.requestFocus();
        } else {
            calcularCodigo();
        }
    }//GEN-LAST:event_txtIdentificadorNitKeyReleased

    private void txtDiasAlertaBloqueo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasAlertaBloqueo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasAlertaBloqueo1KeyTyped

    private void txtDiasAlertaBloqueoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasAlertaBloqueoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtDiasAlertaBloqueoKeyTyped

    private void txtDiasBloqueoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasBloqueoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtDiasBloqueoKeyTyped

    private void txtAvisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAvisoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvisoKeyTyped

    private void txtFacturasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFacturasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturasKeyTyped

    private void btnOcultarInfoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcultarInfoClienteActionPerformed
        if (txtDescripcion.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Debe ingresar la descripción");
            return;
        }

        if (txtSimbolo.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Debe ingresar el simbolo de la moneda");
            return;
        }

        String descripcion = instancias.getSql().getDescripcionMoneda(txtSimbolo.getText());
        if (!descripcion.equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Ya existe este simbolo");
            return;
        }

        if (txtDecimales.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Debe ingresar el # de decimales");
            return;
        }

        try {
            if (Integer.parseInt(txtDecimales.getText()) > 4) {
                metodos.msgAdvertenciaAjustado(null, "No puede contener mas de 4 decimales");
                return;
            }
        } catch (Exception e) {
            metodos.msgAdvertenciaAjustado(null, "Solo esta permitido números enteros");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tblMonedas.getModel();
        instancias.getSql().agregarMonedas(txtSimbolo.getText(), txtDescripcion.getText(), Integer.parseInt(txtDecimales.getText()));
        modelo.addRow(new Object[]{txtDescripcion.getText(), txtSimbolo.getText(), txtDecimales.getText(), false});
        txtDescripcion.setText("");
        txtSimbolo.setText("");
        txtDecimales.setText("");
    }//GEN-LAST:event_btnOcultarInfoClienteActionPerformed

    private void txtDecimalesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDecimalesKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtDecimalesKeyTyped

    private void txtSimboloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSimboloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSimboloKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void tblMonedasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonedasMouseExited
        if (tblMonedas.getSelectedColumn() == 3) {
            for (int i = 0; i < tblMonedas.getRowCount(); i++) {
                tblMonedas.setValueAt(false, i, 3);
            }

            if (tblMonedas.getSelectedRow() == -1) {

            } else {
                tblMonedas.setValueAt(true, tblMonedas.getSelectedRow(), 3);
            }
        }
    }//GEN-LAST:event_tblMonedasMouseExited

    private void tblMonedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonedasMouseClicked
        if (tblMonedas.getSelectedColumn() == 3) {
            for (int i = 0; i < tblMonedas.getRowCount(); i++) {
                tblMonedas.setValueAt(false, i, 3);
            }

            if (tblMonedas.getSelectedRow() == -1) {

            } else {
                tblMonedas.setValueAt(true, tblMonedas.getSelectedRow(), 3);
            }
        }
    }//GEN-LAST:event_tblMonedasMouseClicked

    private void rdSiEmbarcacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSiEmbarcacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSiEmbarcacionesActionPerformed

    private void rdSiProductosSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSiProductosSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSiProductosSerialActionPerformed

    private void rdSiInventarioBodegasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSiInventarioBodegasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSiInventarioBodegasActionPerformed

    private void rdNoPUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoPUCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNoPUCActionPerformed

    private void rdNoFacturaElectronicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoFacturaElectronicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNoFacturaElectronicaActionPerformed

    private void rdNoPTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoPTMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNoPTMActionPerformed

    private void rdNoFacturaLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoFacturaLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNoFacturaLoteActionPerformed

    private void rdNoOftalmologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoOftalmologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNoOftalmologiaActionPerformed

    private void rdNoLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoLaboratorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNoLaboratorioActionPerformed

    private void rdNoRecordatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoRecordatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNoRecordatoriosActionPerformed

    private void rdNoRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNoRestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNoRestauranteActionPerformed

    private void rdSiOrdenServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSiOrdenServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSiOrdenServActionPerformed

    private void txtImpoconsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpoconsumoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpoconsumoKeyTyped

    private void debugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_debugActionPerformed

    private void btnLiberarMesasBloqueadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarMesasBloqueadasActionPerformed
        instancias.getSql().desbloquearMesas();
    }//GEN-LAST:event_btnLiberarMesasBloqueadasActionPerformed

    private void btnDesbloquearUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesbloquearUsuariosActionPerformed
        instancias.getSql().desbloquearUsuarios();
    }//GEN-LAST:event_btnDesbloquearUsuariosActionPerformed
    
    
    public void calcularCodigo() {
        String hashEncriptado = txtIdentificadorNit.getText() + "--" + txtIdentificadorNombre.getText();
        try {
            hashEncriptado = Encriptar(hashEncriptado, "yI4z%jIMndKd3N%bj#%f");
        } catch (Exception ex) {
            Logs.error(ex);
        }
        txtCodigoFinal.setText(hashEncriptado);
    }
    
    public static String Encriptar(String valor, String keyPrivate) throws Exception {
        String resultado = null;
        //Se obtienen los bytes de la clave privada   
        byte[] keyBytes = keyPrivate.getBytes();
        Key key = new SecretKeySpec(keyBytes, 0, keyBytes.length, "HmacMD5");
        Mac mac = null;

        //Se obtiene el algoritmo de encriptacion   
        try {
            mac = Mac.getInstance("HmacMD5");
            mac.init(key);
        } catch (InvalidKeyException e) {
            throw new Exception(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception(e.getMessage(), e);
        }      //Se encripta el valor enviado   

        byte[] valorEncriptado = mac.doFinal(valor.getBytes());

        //Cadena con los digitos correspondientes en hexadecimal   
        String digitosHexadecimales = "0123456789abcdef";
        StringBuilder stringBuilder = new StringBuilder(valorEncriptado.length * 2);
        
        for (int cx = 0; cx < valorEncriptado.length; cx++) {
            int hn = ((int) (valorEncriptado[cx]) & 0x00ff) / 16;
            int ln = ((int) (valorEncriptado[cx]) & 0x000f);
            stringBuilder.append(digitosHexadecimales.charAt(hn));
            stringBuilder.append(digitosHexadecimales.charAt(ln));
        }
        
        resultado = stringBuilder.toString();
        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesbloquearUsuarios;
    private javax.swing.JButton btnLiberarMesasBloqueadas;
    private javax.swing.JButton btnOcultarInfoCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JCheckBox chkCodigo;
    private javax.swing.JCheckBox chkImei;
    private javax.swing.JCheckBox chkSinCodigo;
    private javax.swing.JComboBox cmbPais;
    private javax.swing.JRadioButton comun;
    private javax.swing.JTabbedPane configuracion;
    private javax.swing.JCheckBox debug;
    private datechooser.beans.DateChooserCombo dtFecha1;
    private javax.swing.ButtonGroup factura;
    private javax.swing.ButtonGroup grupoAgenda;
    private javax.swing.ButtonGroup grupoCongeladas;
    private javax.swing.ButtonGroup grupoCreditos;
    private javax.swing.ButtonGroup grupoEmbarcaciones;
    private javax.swing.ButtonGroup grupoFElectronica;
    private javax.swing.ButtonGroup grupoFacturaLote;
    private javax.swing.ButtonGroup grupoInventarioBodegas;
    private javax.swing.ButtonGroup grupoMedico;
    private javax.swing.ButtonGroup grupoOftalmologia;
    private javax.swing.ButtonGroup grupoOrdenServ;
    private javax.swing.ButtonGroup grupoPTM;
    private javax.swing.ButtonGroup grupoPUC;
    private javax.swing.ButtonGroup grupoParqueadero;
    private javax.swing.ButtonGroup grupoPedido;
    private javax.swing.ButtonGroup grupoProductosSerial;
    private javax.swing.ButtonGroup grupoRegimen;
    private javax.swing.ButtonGroup grupoSepare;
    private javax.swing.ButtonGroup grupoTipoImpresion;
    private javax.swing.ButtonGroup grupoUsb;
    private javax.swing.ButtonGroup grupoVeterinaria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTelefono10;
    private javax.swing.JLabel lbTelefono11;
    private javax.swing.JLabel lbTelefono12;
    private javax.swing.JLabel lbTelefono15;
    private javax.swing.JLabel lbTelefono16;
    private javax.swing.JLabel lbTelefono17;
    private javax.swing.JLabel lbTelefono18;
    private javax.swing.JLabel lbTelefono19;
    private javax.swing.JLabel lbTelefono20;
    private javax.swing.JLabel lbTelefono21;
    private javax.swing.JLabel lbTelefono22;
    private javax.swing.JLabel lbTelefono23;
    private javax.swing.JLabel lbTelefono24;
    private javax.swing.JLabel lbTelefono25;
    private javax.swing.JLabel lbTelefono26;
    private javax.swing.JLabel lbTelefono27;
    private javax.swing.JLabel lbTelefono28;
    private javax.swing.JLabel lbTelefono29;
    private javax.swing.JLabel lbTelefono3;
    private javax.swing.JLabel lbTelefono30;
    private javax.swing.JLabel lbTelefono31;
    private javax.swing.JLabel lbTelefono32;
    private javax.swing.JLabel lbTelefono33;
    private javax.swing.JLabel lbTelefono34;
    private javax.swing.JLabel lbTelefono35;
    private javax.swing.JLabel lbTelefono36;
    private javax.swing.JLabel lbTelefono37;
    private javax.swing.JLabel lbTelefono38;
    private javax.swing.JLabel lbTelefono6;
    private javax.swing.JLabel lbTelefono7;
    private javax.swing.JLabel lbTelefono8;
    private javax.swing.JLabel lbTelefono9;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JCheckBox logs;
    private javax.swing.JTextField numeroCorresponsal;
    private javax.swing.JRadioButton rdNoAgenda;
    private javax.swing.JRadioButton rdNoCongeladas;
    private javax.swing.JRadioButton rdNoCreditos;
    private javax.swing.JRadioButton rdNoEmbarcaciones;
    private javax.swing.JRadioButton rdNoFacturaElectronica;
    private javax.swing.JRadioButton rdNoFacturaLote;
    private javax.swing.JRadioButton rdNoInventarioBodegas;
    private javax.swing.JRadioButton rdNoLaboratorio;
    private javax.swing.JRadioButton rdNoMedico;
    private javax.swing.JRadioButton rdNoOftalmologia;
    private javax.swing.JRadioButton rdNoOrdenServ;
    private javax.swing.JRadioButton rdNoPTM;
    private javax.swing.JRadioButton rdNoPUC;
    private javax.swing.JRadioButton rdNoParqueadero;
    private javax.swing.JRadioButton rdNoPedido;
    private javax.swing.JRadioButton rdNoPeriodo;
    private javax.swing.JRadioButton rdNoProductosSerial;
    private javax.swing.JRadioButton rdNoRecordatorios;
    private javax.swing.JRadioButton rdNoRestaurante;
    private javax.swing.JRadioButton rdNoSepare;
    private javax.swing.JRadioButton rdNoTaller;
    private javax.swing.JCheckBox rdNoUSB;
    private javax.swing.JRadioButton rdNoVeterinaria;
    private javax.swing.JRadioButton rdSiAgenda;
    private javax.swing.JRadioButton rdSiCongeladas;
    private javax.swing.JRadioButton rdSiCreditos;
    private javax.swing.JRadioButton rdSiEmbarcaciones;
    private javax.swing.JRadioButton rdSiFacturaElectronica;
    private javax.swing.JRadioButton rdSiFacturarLote;
    private javax.swing.JRadioButton rdSiInventarioBodegas;
    private javax.swing.JRadioButton rdSiLaboratorio;
    private javax.swing.JRadioButton rdSiMedico;
    private javax.swing.JRadioButton rdSiOftalmologia;
    private javax.swing.JRadioButton rdSiOrdenServ;
    private javax.swing.JRadioButton rdSiPTM;
    private javax.swing.JRadioButton rdSiPUC;
    private javax.swing.JRadioButton rdSiParqueadero;
    private javax.swing.JRadioButton rdSiPedido;
    private javax.swing.JRadioButton rdSiPeriodo;
    private javax.swing.JRadioButton rdSiProductosSerial;
    private javax.swing.JRadioButton rdSiRecordatorios;
    private javax.swing.JRadioButton rdSiRestaurante;
    private javax.swing.JRadioButton rdSiSepare;
    private javax.swing.JRadioButton rdSiTaller;
    private javax.swing.JCheckBox rdSiUSB;
    private javax.swing.JRadioButton rdSiVeterinaria;
    private javax.swing.JRadioButton simplificado;
    private javax.swing.JTable tblMonedas;
    private javax.swing.JTextField txtAviso;
    private javax.swing.JTextField txtCodigoFinal;
    private javax.swing.JTextField txtDecimales;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDiasAlertaBloqueo;
    private javax.swing.JTextField txtDiasAlertaBloqueo1;
    private javax.swing.JTextField txtDiasBloqueo;
    private javax.swing.JTextField txtFacturas;
    private javax.swing.JTextField txtIdentificadorNit;
    private javax.swing.JTextField txtIdentificadorNombre;
    private javax.swing.JTextField txtImpoconsumo;
    private javax.swing.JTextArea txtInformacionLegal;
    private javax.swing.JTextField txtSimbolo;
    private javax.swing.JCheckBox validarConfSiempre;
    // End of variables declaration//GEN-END:variables
}
