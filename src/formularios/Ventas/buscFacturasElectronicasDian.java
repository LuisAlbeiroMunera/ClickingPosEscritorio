package formularios.Ventas;

import clases.Dato;
import clases.Descripcion;
import clases.DetallesPreFactura;
import clases.Estado;
import clases.FacturacionAutomatica;
import clases.Iniciar2;
import clases.Instancias;
import clases.PrefacturaPTM;
import clases.Render;
import clases.RespuestaServicioFactura;
import clases.RespuestaServicioFacturacion;
import clases.RespuestaServicioPreFactura;
import clases.big;
import clases.facturacionElectronica;
import clases.metodosGenerales;
import clases.preFacturaTableModel;
import clases.productos.ndProducto;
import clases.terceros.ndTercero;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import configuracion.Propiedades;
import configuracion.ndConfiguracion;
import formularios.cargando;
import formularios.dlgPedirSuperContrasena;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import logs.Logs;

public class buscFacturasElectronicasDian extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;   
    DefaultTableModel modelo;
    private facturaTableModel model,modelDocSoporte;
    private tercerosTableModel modelTerceros;
    private preFacturaTableModel modelPreFactura;
    private Object[] datosFE;
    Timer timer;
    cargando barra;
    Iniciar2 ini;
    
    public buscFacturasElectronicasDian() {
        initComponents();
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();        
        modificarTabla();
        modificarTablaDocSoporte();
        modificarTablaTerceros();
        recargarTabla("","","");
        recargarTablaDocumentoSoporte("","","");
        recargarTablaPrefacturas("","","");
        recargarTablaTerceros("","");
        datosFE = instancias.getSql().getResolucionTerminales("FE");
        HiloFacturaAutomatica();
        ini = new Iniciar2();
        barra = new cargando(ini, instancias);
 }
    
    private void ocultar(boolean control){
        cargarPtm.setVisible(false);
        botonDomina.setVisible(false);
        jPanel2.setVisible(control);
        if(!control){
         jTabbedPane1.removeTabAt(2);
         jTabbedPane1.removeTabAt(1);
        }else{
         fechaExpedicion.setText("Fecha Expedición FE: "+getUltimoDiaMesAnterior());
        }
    }
        
    private void HiloFacturaAutomatica(){
       
        ndConfiguracion nodoConf = instancias.getSql().getDatosConfiguracion();
      
        if(nodoConf.getManejaPreFactura().equals("1") && Integer.parseInt(nodoConf.getFacturaElectronicaPTM())>1 ){
            System.err.println("entra1111::: ");
            ocultar(true);
            FacturacionAutomatica factura = new FacturacionAutomatica(this);
            factura.start();
        }else if(nodoConf.getManejaPreFactura().equals("1")){
            System.err.println("entra2222::: ");
           ocultar(true);
        }else{
            System.err.println("entra3333::: ");
           ocultar(false);
        }
    }
    
    public String getUltimoDiaMesAnterior(){        
      return instancias.getSql().getUltimaFechaMesAnterior();
    }
    
    public void progressBar(int numero){
      jProgressBar1.setValue(numero);
    }
    
    public void recargarTabla(String factura,String fechaInicio,String fechaFin){        
       instancias = Instancias.getInstancias();
       this.model = new facturaTableModel() {};
       this.model.UpdateModel(instancias,factura,fechaInicio,fechaFin,"0");         
       this.tabla.setModel(model);
       consultarEstadoFacturas();
    }
    
     public void recargarTablaDocumentoSoporte(String factura,String fechaInicio,String fechaFin){        
       instancias = Instancias.getInstancias();
       this.modelDocSoporte = new facturaTableModel() {};
       this.modelDocSoporte.UpdateModelDocSoporte(instancias,factura,fechaInicio,fechaFin,"1");         
       this.jTableDocumentoSoporte.setModel(modelDocSoporte);
       consultarEstadoFacturas();
    }
    
    public void recargarTablaTerceros(String identificacion,String estadoCliente){        
       instancias = Instancias.getInstancias();
       this.modelTerceros = new tercerosTableModel() {};
       this.modelTerceros.UpdateModel(instancias,identificacion,estadoCliente);         
       this.configuracionTerceros2.setModel(modelTerceros);
//       consultarEstadoFacturas();
    }
    
    public void recargarTablaPrefacturas(String factura,String fechaInicio,String fechaFin){        
       instancias = Instancias.getInstancias();
       this.modelPreFactura = new preFacturaTableModel() {};
       this.modelPreFactura.UpdateModel(instancias,factura,fechaInicio,fechaFin);         
       this.jTablePreFactura.setModel(modelPreFactura);
//       consultarEstadoFacturas();
    }
    
    public void consultarEstadoFacturas() {
        Object[][] estadoFacturas = instancias.getSql().getConsultarEstadoFactura();
        int numero = estadoFacturas.length;
        jPanel4.setEnabled(true);
        primerEstado.setVisible(false);
        primerNumeroEstado.setVisible(false);
        SegundoEstado.setVisible(false);
        segundoNumeroEstado.setVisible(false);
        tercerEstado.setVisible(false);
        tercerNumeroEstado.setVisible(false);
        cuartoEstado.setVisible(false);
        cuartoNumeroEstado.setVisible(false);
        quintoEstado.setVisible(false);
        quintoNumeroEstado.setVisible(false);

        if (numero > 0) {
            for (int i = 0; i < numero; i++) {
                switch (i) {
                    case (0):
                        primerEstado.setVisible(true);
                        primerNumeroEstado.setVisible(true);
                        primerEstado.setText(estadoFacturas[i][1].toString() + " :");
                        primerNumeroEstado.setText(estadoFacturas[i][0].toString());
                        break;
                    case (1):
                        SegundoEstado.setVisible(true);
                        segundoNumeroEstado.setVisible(true);
                        SegundoEstado.setText(estadoFacturas[i][1].toString() + " :");
                        segundoNumeroEstado.setText(estadoFacturas[i][0].toString());
                        break;
                    case (2):
                        tercerEstado.setVisible(true);
                        tercerNumeroEstado.setVisible(true);
                        tercerEstado.setText(estadoFacturas[i][1].toString() + " :");
                        tercerNumeroEstado.setText(estadoFacturas[i][0].toString());
                        break;
                    case (4):
                        cuartoEstado.setVisible(true);
                        cuartoNumeroEstado.setVisible(true);
                        cuartoEstado.setText(estadoFacturas[i][1].toString() + " :");
                        cuartoNumeroEstado.setText(estadoFacturas[i][0].toString());
                        break;
                    case (5):
                        quintoEstado.setVisible(true);
                        quintoNumeroEstado.setVisible(true);
                        quintoEstado.setText(estadoFacturas[i][0].toString() + " :");
                        quintoNumeroEstado.setText(estadoFacturas[i][1].toString());
                        break;
                }
            }
        } else {
            jPanel4.setEnabled(false);
        }
    }
    
    public void modificarTabla(){
        tabla.setDefaultRenderer(Object.class, new Render());
        this.tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
        this.tabla.getColumnModel().getColumn(1).setPreferredWidth(20);
        this.tabla.getColumnModel().getColumn(2).setPreferredWidth(50);
        this.tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
        this.tabla.getColumnModel().getColumn(4).setPreferredWidth(20);
    }
    
    public void modificarTablaDocSoporte(){
        jTableDocumentoSoporte.setDefaultRenderer(Object.class, new Render());
        this.jTableDocumentoSoporte.getColumnModel().getColumn(0).setPreferredWidth(20);
        this.jTableDocumentoSoporte.getColumnModel().getColumn(1).setPreferredWidth(20);
        this.jTableDocumentoSoporte.getColumnModel().getColumn(2).setPreferredWidth(50);
        this.jTableDocumentoSoporte.getColumnModel().getColumn(3).setPreferredWidth(50);
        this.jTableDocumentoSoporte.getColumnModel().getColumn(4).setPreferredWidth(20);
    }
    
    public void modificarTablaTerceros(){
        configuracionTerceros2.setDefaultRenderer(Object.class, new Render());
        this.configuracionTerceros2.getColumnModel().getColumn(0).setPreferredWidth(20);
        this.configuracionTerceros2.getColumnModel().getColumn(1).setPreferredWidth(20);
        this.configuracionTerceros2.getColumnModel().getColumn(2).setPreferredWidth(50);
        this.configuracionTerceros2.getColumnModel().getColumn(3).setPreferredWidth(50);
        this.configuracionTerceros2.getColumnModel().getColumn(3).setPreferredWidth(50);
    }
    
    /*
    estado: 1 :ENVIO Y REENVIO DE FACTURA
            2 :CONSULTAR PREFACTURAS
            3 :MODIFICAR PREFACTURAS
            4 :CONSULTAR RESPUESTA FACTURAS            
    */
    private RespuestaServicioPreFactura servicioPrefactura(String estadoConsultaPrefactura,int estado) {
        String respuestaServicio = null;
        RespuestaServicioPreFactura servicioPrefac=null;
        Map<String, String> headApi = new HashMap<String, String>();
        String nit = instancias.getNitEmisor();
        headApi.put("NitEmisor", nit);
        try {
            ndConfiguracion nodoConf = instancias.getSql().getDatosConfiguracion();

            if (nodoConf != null && !nodoConf.getNit().isEmpty()) {
                respuestaServicio = metodos.EnvioFacturaApiClikingPos("",estado,headApi,estadoConsultaPrefactura);
                Gson gSons = new Gson();
                servicioPrefac = gSons.fromJson(respuestaServicio, RespuestaServicioPreFactura.class);
            }
        } catch (Exception e) {
            Logs.error("Error en el servicioPrefactura "+e.getMessage());
        }
        return servicioPrefac;
    }

    public String codigoEncriptado(String nit, String nombre) {
        String hashEncriptado = nit + "--" + nombre;
        try {
            hashEncriptado = metodos.EncriptarValidacionUsuario(hashEncriptado, "yI4z%jIMndKd3N%bj#%f");
        } catch (Exception ex) {
            Logs.error(ex);
        }
        return hashEncriptado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Buscar = new javax.swing.JButton();
        buscarFactura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaFinal = new datechooser.beans.DateChooserCombo();
        fechaInicio = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        botonFacturar1 = new javax.swing.JButton();
        jCheckFecha = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        cero = new javax.swing.JLabel();
        cien = new javax.swing.JLabel();
        cargarPtm = new javax.swing.JButton();
        botonFacturar = new javax.swing.JButton();
        botonDomina = new javax.swing.JButton();
        fechaExpedicion = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        primerEstado = new javax.swing.JLabel();
        primerNumeroEstado = new javax.swing.JLabel();
        SegundoEstado = new javax.swing.JLabel();
        tercerEstado = new javax.swing.JLabel();
        cuartoEstado = new javax.swing.JLabel();
        quintoEstado = new javax.swing.JLabel();
        segundoNumeroEstado = new javax.swing.JLabel();
        tercerNumeroEstado = new javax.swing.JLabel();
        cuartoNumeroEstado = new javax.swing.JLabel();
        quintoNumeroEstado = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePreFactura = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        busquedaPrefactura = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        configuracionTerceros2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextIdentificacion = new javax.swing.JTextField();
        jButtonBuscarTercero = new javax.swing.JButton();
        jComboBoxListaFactura = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComboBoxModificarEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDocumentoSoporte = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        numeroFacturaDe = new javax.swing.JTextField();
        tipoMovimiento = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numeroFacturaHasta = new javax.swing.JTextField();

        setTitle("Factura");
        setPreferredSize(new java.awt.Dimension(1158, 742));

        scrFormulario.setPreferredSize(new java.awt.Dimension(1042, 708));

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormulario.setPreferredSize(new java.awt.Dimension(1158, 706));
        pnlFormulario.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                pnlFormularioComponentResized(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1158, 783));
        jPanel1.setRequestFocusEnabled(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Factura"));

        Buscar.setText("Buscar");
        Buscar.setActionCommand("");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        buscarFactura.setPreferredSize(new java.awt.Dimension(6, 23));

        jLabel2.setText("No. Factura ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setPreferredSize(new java.awt.Dimension(57, 23));

        jLabel5.setText("Rango Inicio:");
        jLabel5.setPreferredSize(new java.awt.Dimension(63, 23));

        jLabel6.setText(" Final:");
        jLabel6.setPreferredSize(new java.awt.Dimension(29, 23));

        fechaFinal.setAutoScroll(false);
        fechaFinal.setNothingAllowed(false);
        fechaFinal.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));

        fechaInicio.setAutoScroll(false);
        fechaInicio.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));

        jLabel7.setText("o Razon Social");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel7.setPreferredSize(new java.awt.Dimension(57, 23));

        botonFacturar1.setText("REFRESCAR");
        botonFacturar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturar1ActionPerformed(evt);
            }
        });

        jCheckFecha.setText("Consultar por Fecha");
        jCheckFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buscarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(botonFacturar1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckFecha)
                            .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonFacturar1)
                    .addComponent(jCheckFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Buscar)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Facturas Automaticas"));

        cero.setText("0%");

        cien.setText("100%");

        cargarPtm.setText("CARGA PTM");
        cargarPtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPtmActionPerformed(evt);
            }
        });

        botonFacturar.setText("FACTURAR");
        botonFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturarActionPerformed(evt);
            }
        });

        botonDomina.setBackground(new java.awt.Color(255, 255, 255));
        botonDomina.setText("DOMINA");
        botonDomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDominaActionPerformed(evt);
            }
        });

        fechaExpedicion.setSelected(true);
        fechaExpedicion.setText("Fecha Expedición ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cero)
                        .addGap(171, 171, 171)
                        .addComponent(cien))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cargarPtm, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonDomina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fechaExpedicion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonFacturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonDomina)
                        .addComponent(cargarPtm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cero)
                    .addComponent(cien)
                    .addComponent(fechaExpedicion)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Facturas"));

        primerEstado.setText("jLabel1");

        primerNumeroEstado.setText("jLabel1");

        SegundoEstado.setText("jLabel1");

        tercerEstado.setText("jLabel1");

        cuartoEstado.setText("jLabel1");

        quintoEstado.setText("jLabel1");

        segundoNumeroEstado.setText("jLabel1");

        tercerNumeroEstado.setText("jLabel1");

        cuartoNumeroEstado.setText("jLabel1");

        quintoNumeroEstado.setText("jLabel1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(primerEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(primerNumeroEstado))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(quintoEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quintoNumeroEstado))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(SegundoEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(segundoNumeroEstado))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tercerEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tercerNumeroEstado))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cuartoEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cuartoNumeroEstado)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerNumeroEstado)
                    .addComponent(primerEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SegundoEstado)
                    .addComponent(segundoNumeroEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tercerEstado)
                    .addComponent(tercerNumeroEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuartoEstado)
                    .addComponent(cuartoNumeroEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quintoEstado)
                    .addComponent(quintoNumeroEstado)))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "fecha", "Title 2", "Title 3", "Title 5", "Title 6", "table 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(0).setMaxWidth(20);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(2).setMaxWidth(20);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(3).setMaxWidth(150);
            tabla.getColumnModel().getColumn(6).setResizable(false);
        }

        jTabbedPane1.addTab("Facturas", jScrollPane1);

        jTablePreFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane3.setViewportView(jTablePreFactura);

        jLabel3.setText("Nombre o Identificación");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busquedaPrefactura, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(busquedaPrefactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pre-Facturas", jPanel7);

        configuracionTerceros2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Identificacion", "Facturar Electronicamente", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        configuracionTerceros2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configuracionTerceros2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(configuracionTerceros2);
        if (configuracionTerceros2.getColumnModel().getColumnCount() > 0) {
            configuracionTerceros2.getColumnModel().getColumn(2).setMinWidth(60);
            configuracionTerceros2.getColumnModel().getColumn(2).setPreferredWidth(60);
            configuracionTerceros2.getColumnModel().getColumn(2).setMaxWidth(60);
            configuracionTerceros2.getColumnModel().getColumn(3).setMinWidth(60);
            configuracionTerceros2.getColumnModel().getColumn(3).setPreferredWidth(60);
            configuracionTerceros2.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        jLabel1.setText("Nombre o Identificación");

        jButtonBuscarTercero.setText("Buscar");
        jButtonBuscarTercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTerceroActionPerformed(evt);
            }
        });

        jComboBoxListaFactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pendientes", "Facturan", "No Facturan" }));
        jComboBoxListaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListaFacturaActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxModificarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--seleccionar--", "FACTURAN", "NO FACTURAN" }));
        jComboBoxModificarEstado.setToolTipText("");

        jLabel4.setText("Listar:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscarTercero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxListaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxModificarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarTercero)
                    .addComponent(jComboBoxListaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jComboBoxModificarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(463, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(45, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Config. Terceros", jPanel5);

        jTableDocumentoSoporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDocumentoSoporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDocumentoSoporteMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableDocumentoSoporte);
        if (jTableDocumentoSoporte.getColumnModel().getColumnCount() > 0) {
            jTableDocumentoSoporte.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1131, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Documento Soporte", jPanel8);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Descarga Factura Dian"));

        numeroFacturaDe.setPreferredSize(new java.awt.Dimension(6, 23));
        numeroFacturaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroFacturaDeActionPerformed(evt);
            }
        });

        tipoMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VENTA", "COMPRAVENTA", "SOPORTE_ADQUISICION", "NOTA_DEBITO", "NOTA_CREDITO" }));
        tipoMovimiento.setPreferredSize(new java.awt.Dimension(104, 23));

        jButton3.setText("Descargar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Factura de:");
        jLabel8.setPreferredSize(new java.awt.Dimension(56, 23));

        jLabel9.setText("Hasta:");
        jLabel9.setPreferredSize(new java.awt.Dimension(32, 23));

        numeroFacturaHasta.setMinimumSize(new java.awt.Dimension(6, 23));
        numeroFacturaHasta.setPreferredSize(new java.awt.Dimension(6, 23));
        numeroFacturaHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroFacturaHastaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroFacturaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroFacturaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroFacturaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(tipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroFacturaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );

        scrFormulario.setViewportView(pnlFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlFormularioComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlFormularioComponentResized
        try {
            if (jPanel1.getComponent(0) instanceof JPanel) {
                JPanel panel = (JPanel) jPanel1.getComponent(0);
                panel.setSize(jPanel1.getSize());
            }
        } catch (Exception e) {
            Logs.error("Error al resized "+e.getMessage());
        }
    }//GEN-LAST:event_pnlFormularioComponentResized

    private void cargarPtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPtmActionPerformed
        barra.show();       
        barra.cambiarTexto("Descargando Facturas...");
        procesoPrefacturaPTM();
        recargarTabla("","","");
        recargarTablaDocumentoSoporte("","","");
        recargarTablaTerceros("","");
        barra.dispose();
    }//GEN-LAST:event_cargarPtmActionPerformed

    private void botonFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturarActionPerformed
        barra.show(); 
        barra.cambiarTexto("Facturando...");
        facturar();
        recargarTabla("","","");
        recargarTablaDocumentoSoporte("","","");
        recargarTablaTerceros("","");
        recargarTablaPrefacturas("","","");
        barra.dispose();
    }//GEN-LAST:event_botonFacturarActionPerformed

    private void botonFacturar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturar1ActionPerformed
        barra.show();
        barra.cambiarTexto("Recargando...");
        consultarRespuestaFactura();
        recargarTabla("","","");
        recargarTablaDocumentoSoporte("","","");
        recargarTablaTerceros("","");
        barra.dispose();
    }//GEN-LAST:event_botonFacturar1ActionPerformed

    public void DescargaFactura(String factura,String tipo){
        String nombrePdf=".pdf";
        String archivosPdf="ArchivosPdf";
        String complementoNombre="";
        if (factura.trim().equals("")) {
            metodos.msgAdvertencia(null, "DEBE DIGITAR EL NUMERO DE LA FACTURA");
        } else {
            if(tipoMovimiento.getItemAt(tipoMovimiento.getSelectedIndex()).equals("VENTA")){
            Object[] datosInf = instancias.getSql().getInfoFactura(factura.toString());
              if(datosInf.length>0){
                complementoNombre=datosInf[0].toString();
                  
              }else{
                metodos.msgAdvertencia(null, "La Factura no existe");
              }
            }
            JsonObject JsonPdf = new JsonObject();
            JsonObject JsonFactura = new JsonObject();
            JsonPdf.addProperty("tipoIdentificacion","NIT");
            JsonPdf.addProperty("identificacion",instancias.getNitEmisor());
            Object[] datos = instancias.getSql().getResolucionTerminales("FE");
            JsonFactura.addProperty("prefijo",datos[4].toString());
            JsonFactura.addProperty("numero",factura);
            tipoMovimiento.getSelectedIndex();
            JsonFactura.addProperty("tipo",tipoMovimiento.getItemAt(tipoMovimiento.getSelectedIndex()));
            JsonFactura.addProperty("formato","PDF");
            JsonFactura.addProperty("desencriptaPDF","S");            
            JsonPdf.add("factura",JsonFactura);
//            ndTercero nodo = instancias.getSql().getDatosTercero(txtIdSistema.getText());
            nombrePdf = datos[4].toString()+factura+complementoNombre+nombrePdf;
            try {
                facturacionElectronica facturacion = new facturacionElectronica(instancias.getNitEmisor(),instancias.getTokenEmisor());
                facturacion.setPrueba(true);
                try{
                    File directorio = new File(archivosPdf);
                    directorio.mkdir();
                }catch(Exception ex){
                }
                String ruta = System.getProperty("user.dir") + "\\"+archivosPdf+"\\";
                String nombreArchivo = nombrePdf.trim();
                String token=instancias.getTokenEmisor();
                facturacion.sendPOSTFactura("POST",Propiedades.getInstancia().getUrlFacturaElectronicaPdf(),JsonPdf.toString(),token,ruta,nombreArchivo.replace(" ",""));
            } catch (Exception ex) {
                Logs.error("Error al consultar servicio Domina PDF: "+ex);
            }
        }
    } 
    
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String factura = buscarFactura.getText().trim().replace(datosFE[4].toString(), "");
        String inicio = "";
        String fin = "";
        if (jCheckFecha.isSelected()) {
            if (!fechaInicio.getText().equals("") || !fechaFinal.getText().equals("")) {
                if (!fechaInicio.getText().equals("")) {
                    inicio = metodos.desdeDate(fechaInicio.getCurrent());
                }
                if (!fechaFinal.getText().equals("")) {
                    fin = metodos.desdeDate(fechaFinal.getCurrent());
                }
            }
        }
        recargarTabla(factura, inicio, fin);
        recargarTablaDocumentoSoporte(factura, inicio, fin);
        recargarTablaTerceros("","");
        limpiarBusqqueda();
    }//GEN-LAST:event_BuscarActionPerformed

    
    private void limpiarBusqqueda(){
      buscarFactura.setText("");
    }
    
    private void botonDominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDominaActionPerformed
        consultarRespuestaFactura();
    }//GEN-LAST:event_botonDominaActionPerformed

    private void jCheckFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckFechaActionPerformed

    private void configuracionTerceros2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracionTerceros2MouseClicked
        int column = configuracionTerceros2.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / configuracionTerceros2.getRowHeight();

        if (row < configuracionTerceros2.getRowCount() && row >= 0 && column < configuracionTerceros2.getColumnCount() && column >= 0) {
            Object value = configuracionTerceros2.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                int resp = 2;
                if (boton.getName().equals("NS")) {
                    resp = JOptionPane.showConfirmDialog(null, "¿Desea realizarle Factura Electronica?");
                    if (resp == 2) {
                        return;
                    }
                    System.err.println("Respuesta " + resp);
                } else if (boton.getName().equals("SI")) {
                    resp = 0;
                } else if (boton.getName().equals("NO")) {
                    resp = 1;
                }
                if(resp != 2){
                    if(instancias.getSql().updateTerceroFacturaElectronica(configuracionTerceros2.getValueAt(row, 1).toString(),String.valueOf(resp),"")){
                        metodos.msgExito(this, "Se actualizo correctamente!");
                        recargarTablaTerceros("","");
                    }else{
                        metodos.msgError(this, "Erro al actualizar!");
                    }

                }
                System.err.println("Respuesta::: " + resp);
                System.err.println("boton text::: " + boton.getText());
                System.err.println("boton name::: " + boton.getName());
                System.err.println("Nit " + configuracionTerceros2.getValueAt(row, 1).toString());

            }
        }
    }//GEN-LAST:event_configuracionTerceros2MouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int column = tabla.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/tabla.getRowHeight();

        if(row < tabla.getRowCount() && row >= 0 && column < tabla.getColumnCount() && column >= 0){
            Object value =  tabla.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;

                if(boton.getName().equals("Descargar")){

                    tipoMovimiento.setSelectedIndex(0);
                    DescargaFactura(tabla.getValueAt(row, 0).toString().replace(datosFE[4].toString(), ""),"VENTA");
                }

                if(boton.getName().equals("Ver")){

                    String mensaje=tabla.getValueAt(row, 5).toString();
                    if(!mensaje.trim().equals("")){
                        metodos.msgAdvertenciaAjustado(this,mensaje);
                    }else{
                        metodos.msgAdvertenciaAjustado(this,tabla.getValueAt(row, 4).toString());
                    }
                }
            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void jButtonBuscarTerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTerceroActionPerformed
        String identificacion = jTextIdentificacion.getText();
        recargarTablaTerceros(identificacion,"");
        jTextIdentificacion.setText("");
    }//GEN-LAST:event_jButtonBuscarTerceroActionPerformed

    private void numeroFacturaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroFacturaDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroFacturaDeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String de=numeroFacturaDe.getText();
        String hasta=numeroFacturaHasta.getText();
        boolean isNumericDe =  de.matches("[+-]?\\d*(\\.\\d+)?");
        boolean isNumericDesde =  hasta.matches("[+-]?\\d*(\\.\\d+)?");
        
        if(de.equals("") || hasta.equals("")){
          metodos.msgAdvertenciaAjustado(this,"Debe tener los campos con valores");
          return;
        }
        if(!isNumericDe || !isNumericDesde){
          metodos.msgAdvertenciaAjustado(this,"El Rango debe ser Númerico");
          return;
        }
      
        if(Integer.valueOf(de)>Integer.valueOf(hasta)){
          metodos.msgAdvertenciaAjustado(this,"El primer valor del rango de la factura debe ser menor que el segundo valor");
          return;
        }
        
        DescargaRangoFacturas(de,hasta);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void numeroFacturaHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroFacturaHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroFacturaHastaActionPerformed

    private void jComboBoxListaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListaFacturaActionPerformed
        String estado = estadoBusquedaTerceros();
        recargarTablaTerceros("",estado);
    }//GEN-LAST:event_jComboBoxListaFacturaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String estadoBusqueda = estadoBusquedaTerceros();
        String estado = "";
        String mensaje = "";
       
        if(("FACTURAN").equals(jComboBoxModificarEstado.getSelectedItem())){
           estado="0";
        }else if(("NO FACTURAN").equals(jComboBoxModificarEstado.getSelectedItem())){
          estado="1";
        }else{
          return;
        }
        
        if(estadoBusqueda.equals("")){
           mensaje = "Se modificará el estado de todos los Clientes a '"+jComboBoxModificarEstado.getSelectedItem()+"' \n ¿Desea Continuar? ";
        }else{
           mensaje = "Se modificará el estado de los Clientes en la lista a '"+jComboBoxModificarEstado.getSelectedItem()+"' \n ¿Desea Continuar? ";
        }
               
      if (metodos.msgPregunta(null, mensaje) == 0) {
        if(instancias.getSql().updateTerceroFacturaElectronica("",estado,estadoBusqueda)){
            metodos.msgExito(this, "Se actualizo correctamente!");            
        }else{
            metodos.msgError(this, "Erro al actualizar!");
        }
      }
        recargarTablaTerceros("",estadoBusqueda);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String busuedaTerceros =  busquedaPrefactura.getText();
        recargarTablaPrefacturas(busuedaTerceros,"","");
        busquedaPrefactura.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableDocumentoSoporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDocumentoSoporteMouseClicked
        int column = jTableDocumentoSoporte.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jTableDocumentoSoporte.getRowHeight();

        if(row < jTableDocumentoSoporte.getRowCount() && row >= 0 && column < jTableDocumentoSoporte.getColumnCount() && column >= 0){
            Object value =  jTableDocumentoSoporte.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;

                if(boton.getName().equals("Descargar")){

                    tipoMovimiento.setSelectedIndex(0);
                    DescargaFactura(jTableDocumentoSoporte.getValueAt(row, 0).toString().replace(datosFE[4].toString(), ""),"SOPORTE_ADQUISICION");
                }

                if(boton.getName().equals("Ver")){

                    String mensaje=jTableDocumentoSoporte.getValueAt(row, 5).toString();
                    if(!mensaje.trim().equals("")){
                        metodos.msgAdvertenciaAjustado(this,mensaje);
                    }else{
                        metodos.msgAdvertenciaAjustado(this,jTableDocumentoSoporte.getValueAt(row, 4).toString());
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableDocumentoSoporteMouseClicked

    public String estadoBusquedaTerceros(){
      String estado="";
        if("Pendientes".equals(jComboBoxListaFactura.getSelectedItem())){
           estado="2";
        }else if("Facturan".equals(jComboBoxListaFactura.getSelectedItem())){
          estado="0";
        }else if("No Facturan".equals(jComboBoxListaFactura.getSelectedItem())){
           estado="1";
        }else if("Todos".equals(jComboBoxListaFactura.getSelectedItem())){
           estado="";
        } 
        return estado; 
    } 
            
     public void esperarXsegundos(int segundos) {
        try {
       
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public void DescargaRangoFacturas(String de, String desde) {
        ArrayList<Map<String, String>> facturas = null;
        String nombreDocumento = "";
        String prefijo = "";
        boolean ingresar = false;
        Object[] informacion = instancias.getSql().getDatosPrefijosYModelos();
        
        if ((tipoMovimiento.getItemAt(tipoMovimiento.getSelectedIndex())).equals("VENTA")) {
            ingresar = true;
            nombreDocumento = " Factura ";
            facturas = instancias.getSql().consultarFacturas(de, desde);
        } else if ((tipoMovimiento.getItemAt(tipoMovimiento.getSelectedIndex())).equals("NOTA_CREDITO")) {
            prefijo = informacion[3]+"-";
            facturas = instancias.getSql().consultarNotaCreditos(informacion[3].toString(),de, desde);
            nombreDocumento = " Nota Credito ";
            
        } else if ((tipoMovimiento.getItemAt(tipoMovimiento.getSelectedIndex())).equals("NOTA_DEBITO")) {
//          facturas = instancias.getSql().consultarFacturas(de,desde);
            nombreDocumento = " Nota Debito ";
            prefijo = informacion[4]+"";
        }

        for (Map<String, String> prefactura : facturas) {
            String nombrePdf = ".pdf";
            String archivosPdf = "ArchivosPdf";
            String complementoNombre = "";
            if (prefactura.get("cotizacion").trim().equals("")) {
                metodos.msgAdvertencia(null, "Debe Digitar el Número de la" + nombreDocumento);
            } else {
                if (tipoMovimiento.getItemAt(tipoMovimiento.getSelectedIndex()).equals("VENTA")) {
                    Object[] datosInf = instancias.getSql().getInfoFactura(prefactura.get("cotizacion").trim());
                    if (datosInf.length > 0) {
                        complementoNombre = datosInf[0].toString().replace(".", "").trim();
                    } else {
                        metodos.msgAdvertencia(null, "La" + nombreDocumento + "no existe");
                    }
                }
                JsonObject JsonPdf = new JsonObject();
                JsonObject JsonFactura = new JsonObject();
                JsonPdf.addProperty("tipoIdentificacion", "NIT");
                JsonPdf.addProperty("identificacion", instancias.getNitEmisor());

                if (ingresar) {
                    Object[] datos = instancias.getSql().getResolucionTerminales("FE");
                    JsonFactura.addProperty("prefijo", datos[4].toString());
                    prefijo = datos[4].toString();
                } else {
                    JsonFactura.addProperty("prefijo", prefijo.replace("-", ""));
                }
                JsonFactura.addProperty("numero", prefactura.get("cotizacion").trim());
                tipoMovimiento.getSelectedIndex();
                JsonFactura.addProperty("tipo", tipoMovimiento.getItemAt(tipoMovimiento.getSelectedIndex()));
                JsonFactura.addProperty("formato", "PDF");
                JsonFactura.addProperty("desencriptaPDF", "S");
                JsonPdf.add("factura", JsonFactura);
                nombrePdf = prefijo + prefactura.get("cotizacion") + " " + complementoNombre + nombrePdf;
                try {
                    facturacionElectronica facturacion = new facturacionElectronica(instancias.getNitEmisor(), instancias.getTokenEmisor());
                    facturacion.setPrueba(true);
                    try {
                        File directorio = new File(archivosPdf);
                        directorio.mkdir();
                    } catch (Exception ex) {
                    }
                    String ruta = System.getProperty("user.dir") + "\\" + archivosPdf + "\\";
                    String nombreArchivo = nombrePdf.replaceAll("\\s","").trim();
                    String token = instancias.getTokenEmisor();
                    facturacion.sendPOSTFactura("POST", Propiedades.getInstancia().getUrlFacturaElectronicaPdf(), JsonPdf.toString(), token, ruta, nombreArchivo);
                } catch (Exception ex) {
                    Logs.error("Error al consultar servicio Domina PDF: " + ex);
                }
            }
        }
    }
     
    public void consultarRespuestaFactura() {

        Map<String, String> headApi = new HashMap<String, String>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ArrayList<Map<String, String>> datos = null;
        JsonObject facturas = new JsonObject();
        JsonArray ids = new JsonArray();
        datos = instancias.getSql().getLogsTodasFacturasApi("0", "2");
        if (datos.size() > 0) {
            for (int i = 0; i < datos.size(); i++) {
                if (!datos.get(i).get("idExterno").isEmpty()) {
                    String idExterno = datos.get(i).get("idExterno");

                    try {
                        ids.add(new JsonPrimitive(Integer.parseInt(idExterno)));
                    } catch (Exception excep) {

                    }
                }
            }
            if (ids.getAsJsonArray().size() == 0) {
                Logs.log("NO HAY FACTURAS PARA CONSULTAR");
                return;
            }

            facturas.add("id", ids);
            String nit = instancias.getNitEmisor();
            headApi.put("NitEmisor", nit);
            RespuestaServicioFacturacion respuesta = new RespuestaServicioFacturacion();
            try {
                String respuestaServicio = metodos.EnvioFacturaApiClikingPos(facturas.toString(), 4, headApi, "");
                Gson gSon = new Gson();
                JsonObject respuestasServicio = gSon.fromJson(respuestaServicio.toString(), JsonObject.class);
                try {
                    if (!respuestasServicio.get("errorInterno").toString().equals("")) {
                        metodos.msgAdvertenciaAjustado(null, "Token: " + respuestasServicio.get("errorInterno").toString());
                        Logs.log("Token: " + respuestasServicio.get("errorInterno").toString());
                        return;
                    }
                } catch (Exception exp) {
//                    Logs.log("Favor Comunicarse con Soporte ClickingPos Error #0023: Respuesta=> " + exp.getMessage());
//                    exp.printStackTrace();
                }

                try {
                    respuesta = gSon.fromJson(respuestasServicio, RespuestaServicioFacturacion.class);

                } catch (IllegalStateException | JsonSyntaxException exception) {
                    //metodos.msgAdvertenciaAjustado(this, "Favor Comunicarse con Soporte ClickingPos Error #0023");
                    //Error #0023 Respuesta Api formato de respuesta diferente al requerido 
                    Logs.log("Favor Comunicarse con Soporte ClickingPos Error #0023: Respuesta=> " + respuestaServicio);
                    exception.printStackTrace();
                    return;
                }

                for (Dato dato : respuesta.getDato()) {
                   Descripcion descripcion = new Descripcion(); 
                   if(respuestaActual(gSon,descripcion,dato,respuestasServicio,respuesta,respuestaServicio)){
                    
                   }
                }
            } catch (IllegalStateException | JsonSyntaxException e) {
                Logs.log("ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            Logs.log("NO HAY FACTURAS PARA CONSULTAR");
        }
    }
    
    public boolean respuestaActual(Gson gSon,Descripcion descripcion, Dato dato, JsonObject respuestasServicio, RespuestaServicioFacturacion respuesta, String respuestaServicio) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();        
        boolean resp = false;
        try {
            descripcion = gson.fromJson(dato.getRespuestasDomina().getDescripcion(), Descripcion.class);
        } catch (Exception exception) {
            try {
                JsonArray idss = new JsonArray();
                JsonArray respuestasServicios = gSon.fromJson(dato.getRespuestasDomina().getDescripcion(), JsonArray.class);
                
                String numero = respuestasServicios.get(0).getAsJsonObject().get("numero").getAsString();
                String prefijo = respuestasServicios.get(0).getAsJsonObject().get("prefijo").getAsString();
                String detalle = respuestasServicios.get(0).getAsJsonObject().get("detalle").getAsString();
                descripcion.setNumero(numero);
                descripcion.setPrefijo(prefijo);
                descripcion.setDetalle(detalle);
                
                Estado estado = new Estado();
                estado.setCodigo(respuestasServicios.get(0).getAsJsonObject().get("estado").getAsJsonObject().get("codigo").getAsString());
                estado.setDescripcion(respuestasServicios.get(0).getAsJsonObject().get("estado").getAsJsonObject().get("descripcion").getAsString());
                estado.setDescripcion(respuestasServicios.get(0).getAsJsonObject().get("estado").getAsJsonObject().get("descripcion").getAsString());
                descripcion.setEstado(estado);
            } catch (Exception exception2) {
                exception2.printStackTrace();
                return false;
            }
        }
        
        int codigoRespuesta = 0;
        try {
            codigoRespuesta = Integer.parseInt(descripcion.getEstado().getCodigo());
        } catch (Exception epx) {
            if (descripcion.getEstado().getCodigo().equals("EXITOSO")) {
                codigoRespuesta = 3;
            } else {
                codigoRespuesta = 0;
            }
        }
      
        if (codigoRespuesta == 3 || codigoRespuesta == 2 || codigoRespuesta == 5 || codigoRespuesta == 6 || codigoRespuesta == 406 || codigoRespuesta == 1 || codigoRespuesta == 401 ) {
            try {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String fechaCreacion = "";
                try {
                    fechaCreacion = dato.getRespuestasDomina().getFechaCreacion();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                Calendar c = Calendar.getInstance();
                c.add(Calendar.MINUTE, -2);
                Logs.log("Hora creada " + fechaCreacion);
            } catch (Exception e) {
                Logs.log("LOG DE FACTURA ELECTRONICA" + e.getMessage());
                e.printStackTrace();
            }

            String errorMensaje = "";
            String espacio = "";
            if (!Objects.isNull(descripcion.getEstado().getNotificaciones())) {
                for (int i = 0; i < descripcion.getEstado().getNotificaciones().size(); i++) {
                    errorMensaje += espacio + "- " + descripcion.getEstado().getNotificaciones().get(i);
                    espacio = "<br>";
                }
            }
            String errorMensaje2 = "";
            try {
                errorMensaje2 = descripcion.getEstado().getDescripcion();
            } catch (Exception exp) {
                Logs.log("ERROR EN LA RESPUESTA DE LA API " + exp.getMessage());
                exp.printStackTrace();
            }
            //SI TODO SALE BIEN
            String doc = "0";
            try {
                ArrayList<Map<String, String>> documento = instancias.getSql().consultarDocumentoApi(dato.getIdFactura());
                if (documento.size() > 0) {
                    doc = documento.get(0).get("documento");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            instancias.getSql().modificarLogsServicioFacturacion("1", dato.getNumeroFactura(), respuesta.getMensaje() + " " + errorMensaje + ". " + errorMensaje2, respuestaServicio, errorMensaje + ". " + errorMensaje2, dato.getId(), doc);
        } else {
            String errorMensaje = "";
            String DominaMensaje = "";
            String apiMensaje = "";
            try {
                DominaMensaje = descripcion.getEstado().getDescripcion();
                String espacio = "";
                if (!Objects.isNull(descripcion.getEstado().getErrores())) {
                    for (int i = 0; i < descripcion.getEstado().getErrores().size(); i++) {
                        errorMensaje += espacio + "- " + descripcion.getEstado().getErrores().get(i);
                        espacio = "<br>";
                    }
                }
                apiMensaje = (respuesta.getMensaje().equals("null")) ? "" : respuesta.getMensaje();
            } catch (Exception exp) {
            }
            String doc = "0";
            try {
                ArrayList<Map<String, String>> documento = instancias.getSql().consultarDocumentoApi(dato.getIdFactura());
                if (documento.size() > 0) {
                    doc = documento.get(0).get("documento");
                }
            } catch (Exception e) {
            }
            instancias.getSql().modificarLogsServicioFacturacion("2", dato.getNumeroFactura(), apiMensaje + " - " + errorMensaje, respuestaServicio + " __ " + dato.getRespuestasDomina().getDescripcion().toString(), apiMensaje + " - Domina: " + DominaMensaje + ". <br><br> Errores: <h4>" + errorMensaje + "</h4>", dato.getId(), doc);
            Logs.log("ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  ");
            
        }
        return true;
    }
    
    
 /*   public void consultarRespuestaFactura() {
        
        Map<String, String> headApi = new HashMap<String, String>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ArrayList<Map<String, String>> datos = null;
        JsonObject facturas = new JsonObject();
        JsonArray ids = new JsonArray();
        datos = instancias.getSql().getLogsTodasFacturasApi("0","2");
      if(datos.size()>0){
        for (int i = 0; i < datos.size(); i++) {
            if(!datos.get(i).get("idExterno").isEmpty()){
              String idExterno = datos.get(i).get("idExterno"); 
               
              try{
                       
                ids.add(new JsonPrimitive(Integer.parseInt(idExterno)));
              }catch(Exception excep){
                  
//                ids.add(new JsonPrimitive(-1));
              }
            }
        }
        if(ids.getAsJsonArray().size()==0){
           Logs.log("NO HAY FACTURAS PARA CONSULTAR");
           return;
        }   
        
        facturas.add("id", ids);
        String nit = instancias.getNitEmisor();
        headApi.put("NitEmisor", nit);
        RespuestaServicioFacturacion respuesta = new RespuestaServicioFacturacion();
        try {
            String respuestaServicio = metodos.EnvioFacturaApiClikingPos(facturas.toString(), 4, headApi, "").replaceAll("\\\\","").replaceAll("\"\\[", "\\[").replaceAll("\\]\"", "\\]");
            Gson gSons = new Gson();
            
         try{
            respuesta = gSons.fromJson(respuestaServicio, RespuestaServicioFacturacion.class);
            }catch(Exception ex){
//             metodos.msgAdvertenciaAjustado(this, "Favor Comunicarse con Soporte ClickingPos Error #0023");
                //Error #0023 Respuesta Api formato de respuesta diferente al requerido 
             Logs.log("Favor Comunicarse con Soporte ClickingPos Error #0023: Respuesta=> "+respuestaServicio);
                return;
            }
            for (Dato dato : respuesta.getDato()) {                    
                    
                for (Descripcion descripcion : dato.getRespuestasDomina().getDescripcion()) {
                    int codigoRespuesta = Integer.parseInt(descripcion.getEstado().getCodigo());
                    if (codigoRespuesta == 3 || codigoRespuesta == 2 || codigoRespuesta == 5 || codigoRespuesta == 6 || codigoRespuesta == 406 || codigoRespuesta == 1) {
                       try {
                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                            String fechaCreacion ="";
                            try{
                             fechaCreacion = dato.getRespuestasDomina().getFechaCreacion();
//                             fechaCreacion = formato.parse(dato.getRespuestasDomina().getFechaCreacion());
                            }catch(Exception e1){}
                            Calendar c = Calendar.getInstance();
                            c.add(Calendar.MINUTE, -2);
                            Logs.log("Hora creada " + fechaCreacion);
                        } catch (Exception e) {
                            Logs.log("LOG DE FACTURA ELECTRONICA" + e.getMessage());
                        }
                        
                        String errorMensaje = descripcion.getEstado().getDescripcion();
                        String errorMensaje2 = "";
                        try {
                            errorMensaje2 = descripcion.getDetalle();
                        } catch (Exception exp) {
                            Logs.log("ERROR EN LA RESPUESTA DE LA API " + exp.getMessage());
                        }
                        //SI TODO SALE BIEN
                        instancias.getSql().modificarLogsServicioFacturacion("1", dato.getNumeroFactura(), respuesta.getMensaje()+" "+errorMensaje+". "+errorMensaje2, respuestaServicio, errorMensaje+". "+errorMensaje2,dato.getId());
                    } else if(codigoRespuesta == 401 || codigoRespuesta == 402 || codigoRespuesta == 403 || codigoRespuesta == 404){
                         String estadoDominFactura="2";
                        try {
                    
                            if(codigoRespuesta == 402){
                              estadoDominFactura="1";
                            }
                           if(codigoRespuesta != 401){ 
                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                            Date fechaCreacion =null;
                            try{
                             fechaCreacion = formato.parse(dato.getRespuestasDomina().getFechaCreacion());
                            }catch(Exception e1){}
                            Calendar c = Calendar.getInstance();
                            c.add(Calendar.MINUTE, -2);
                            Logs.log("Hora creada " + fechaCreacion.getTime() + " actual menos 2 " + c.getTimeInMillis() + " diferencia " + (fechaCreacion.getTime() - c.getTimeInMillis()));
                          }                       
                        } catch (Exception e) {
                            Logs.log("ERROR EN EL LOG DE FACTURA ELECTRONICA" + e.getMessage());
                        }
                        
                        String errorMensaje = descripcion.getEstado().getDescripcion();
                        String errorMensaje2 = "";
                        try {
                            errorMensaje2 = descripcion.getDetalle();
                        } catch (Exception exp) {
                            Logs.log("ERROR EN LA RESPUESTA DE LA API " + exp.getMessage());
                        } 
                       //SI TODO SALE BIEN
                        instancias.getSql().modificarLogsServicioFacturacion(estadoDominFactura, dato.getNumeroFactura(), respuesta.getMensaje()+" "+errorMensaje+". "+errorMensaje2, respuestaServicio, errorMensaje+". "+errorMensaje2,dato.getId());
                    
                    }else{
                        String errorMensaje ="";
                        String DominaMensaje ="";
                        String apiMensaje ="";
                        try{
                           errorMensaje = descripcion.getEstado().getDescripcion();
                           DominaMensaje =  descripcion.getDetalle();
                           apiMensaje = (respuesta.getMensaje().equals("null"))?"":respuesta.getMensaje();
                        }catch(Exception exp){
                            Logs.log("ERROR EN LA RESPUESTA DE LA API "+exp.getMessage());
                        }                   
                        instancias.getSql().modificarLogsServicioFacturacion("2", dato.getNumeroFactura(), apiMensaje+" - "+errorMensaje, respuestaServicio+" __ "+descripcion.toString(), apiMensaje+" - Domina: "+DominaMensaje,dato.getId());
                        Logs.log("ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  ");
                    }
            }
            }
        } catch (IllegalStateException | JsonSyntaxException e){
            Logs.log("ERROR EN FACTURA ELECTRONICA PARA EL CLIENTE  " + e.getMessage());
        }
     }else{
         Logs.log("NO HAY FACTURAS PARA CONSULTAR");
     } 
    }*/
    /*
      se realiza la consulta al servicio de la Api almacenando los datos en
      sus respectivas tablas 
    */    
    public boolean procesoPrefacturaPTM() {
      try{
        barra.show(); 
       barra.cambiarTexto("Conectando...");
        RespuestaServicioPreFactura respuestaServicio = servicioPrefactura("0", 2);
      
        if (!respuestaServicio.getEstado().equals("000")) {
            //se debe validar la respuesta y colocarla en un log
          
            return false;
        }
        //recorre las prefacturas almacenandolas en las tablas correspondientes
        List<PrefacturaPTM> listaPrefactura = respuestaServicio.getDato();
        for (PrefacturaPTM prefacturaPTM : listaPrefactura) {
            if (isFactura(prefacturaPTM)) {
              
            }
        }
        
        //se recorre de nuevo las prefacturas con el animo de garantizar que por lo menos ya se 
//        encuentran almacenadas en la tabla correspondiente y no retorne un error sin haber guardado en prefactura        
        for (PrefacturaPTM prefacturaPTM : listaPrefactura) {
             //validar si existe cliente
            if (isCliente(prefacturaPTM)) {
            }
             //validar si existe producto
            if (isProducto(prefacturaPTM)) {
            }
        }
        
        }catch(Exception exp){
        Logs.error("facturar: " + exp.getCause());
      }finally{
        barra.dispose();  
      }
        return true;
    }
    
    /*
      Recorre todas las prefacturas y las factura
    */
    public void facturar(){

      if(instancias.getFactura().modeloPro.getRowCount()>0){
            Logs.error("El Modulo de facturación no debe contener ninguna factura pendiente, para la recepcion y envio de facturas"); 
            metodos.msgAdvertenciaAjustado(this, "El Modulo de facturación no debe contener ninguna factura pendiente, para la recepcion y envio de facturas");
          
          return;
        }
      try{
       ArrayList<Map<String, String>> prefacturas = instancias.getSql().consultarFacturasPTM("0");
        if(prefacturas.size()>0){
         barra.show(); 
         barra.cambiarTexto("Facturando...");
        } 
       for (Map<String, String> prefactura : prefacturas) {
         if(!Objects.isNull(prefactura.get("isFacturaElectronica"))){
            if(prefactura.get("isFacturaElectronica").equals("1")){
              try{
                instancias.getSql().ModificarEstadoPrefactura(prefactura.get("id"),"3");
              }catch(Exception e){
                  System.err.println("Error en "+e);
              }
              continue;
            }
         }else{
           continue;
         }
         String digitoVerificacion = "";
            if (!prefactura.get("digito_verificacion").isEmpty()) {
                if(prefactura.get("digito_verificacion").length()==1){
                  digitoVerificacion = "-" + prefactura.get("digito_verificacion");
                }
            }
         Object[][] productos=null;
         String numeroFactura="";
         String idExternoFactura="";
         if(prefactura.get("numeroFactura").equals("")){   
            productos = instancias.getSql().consultarPreFactura(prefactura.get("id"));  
         }else{
            numeroFactura=prefactura.get("numeroFactura");
            idExternoFactura=prefactura.get("idTxExterno");
            productos = instancias.getSql().consultarFacturaProducto(prefactura.get("numeroFactura"));
         }
         if(prefactura.get("identificacion").contains("-")){
           digitoVerificacion="";  
         }
         String factura = facturarPrefactura(prefactura.get("identificacion")+digitoVerificacion,productos,numeroFactura,idExternoFactura);  
    
         String estadoFactura="1";
         if(factura.equals("")){
             estadoFactura="0";
         }
         instancias.getSql().ModificarEstadoPrefactura(prefactura.get("id"),estadoFactura,factura);
       }
      }catch(Exception exp){
        exp.printStackTrace();
        Logs.error("facturar: " + exp.getCause());
      }finally{
        barra.dispose();  
      }
    }
    
    /*
      Se encarga de invocar las funciones para realizar la factura  String[][] producto
    */
    public String facturarPrefactura(String cliente,Object[][] productos,String numeroFacturaRenvio,String idExternoNumeroFacturaRenvio){
        String numeroFactura ="";
        if(fechaExpedicion.isSelected()){
               System.out.print("ultimo dia fechaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            instancias.getFactura().setFechaExpedicionUltimoDiaMesAnterior(getUltimoDiaMesAnterior());
           }else{
            System.out.print("fechaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
           }
//        Instancias instancia;   
        numeroFactura = instancias.getFactura().checkedComprobante();
        
        instancias.getFactura().setShowMsg(false);
        try{
            instancias.getFactura().limpiarTablas();
            for (int i = 0; i < productos.length; i++) {
                String porcentajeDescuento = productos[i][2].toString();
                String valorDescuento = productos[i][5].toString();
                String tipoDescuento = productos[i][3].toString();
                String vrUnitario = productos[i][4].toString();
                String ObservacionDescuento="///"+"DESCUENTO PRONTO PAGO";                
                if(porcentajeDescuento.equals("0")){
                   porcentajeDescuento ="0";
                   tipoDescuento ="";
                   ObservacionDescuento ="";
                }
                try{
                if(Double.parseDouble(porcentajeDescuento) > 0 && Double.parseDouble(valorDescuento)> 0){
                    porcentajeDescuento="0";
                }
                }catch(Exception exp){}
                instancias.getFactura().cargarClienteYProducto2(cliente, new String[][]{new String[]{productos[i][0].toString(),productos[i][1].toString()}});
                instancias.getFactura().cambiarPrecio(i,vrUnitario);
                instancias.getFactura().cargarDescuento(i, porcentajeDescuento, valorDescuento, tipoDescuento+ObservacionDescuento);
           } 
           if(!numeroFacturaRenvio.equals("")){
            numeroFactura =numeroFacturaRenvio;            
            instancias.getFactura().setNumeroFacturaRenvio(numeroFacturaRenvio);
            instancias.getFactura().setNumeroIdFacturaRenvio(idExternoNumeroFacturaRenvio); 
            instancias.getFactura().lbNoFactura.setText(datosFE[4].toString() + numeroFacturaRenvio);
           }
           instancias.getFactura().diasPlazo("0");
           instancias.getFactura().setMostrarDevuelta(false);
           instancias.getFactura().facturarExterno();
           instancias.getFactura().setMostrarDevuelta(true);
           
           try{
            Gson gSon = new Gson(); 
            System.err.println("instancias.getFactura().getRespuesta() "+instancias.getFactura().getRespuesta());
            JsonObject  respuestaServicio = gSon.fromJson(instancias.getFactura().getRespuesta(), JsonObject.class);
            respuestaServicio.getAsJsonObject().get("codigo");
            respuestaServicio.getAsJsonObject().get("error");
            if(respuestaServicio.get("codigo").getAsInt() != 200){
             numeroFactura="";    
            }
           }catch(Exception exce){
               instancias.getFactura().setFechaExpedicionUltimoDiaMesAnterior("");
               System.err.println("error reenvio "+exce);
           }
        }catch(Exception e){
            instancias.getFactura().setMostrarDevuelta(true);
            instancias.getFactura().setShowMsg(true);
            instancias.getFactura().setNumeroFacturaRenvio("0");
            instancias.getFactura().setNumeroIdFacturaRenvio("0");
            instancias.getFactura().setFechaExpedicionUltimoDiaMesAnterior("");
            numeroFactura="";
            Logs.error("Error al Facturar "+e.getMessage());   
        }
        instancias.getFactura().setFechaExpedicionUltimoDiaMesAnterior("");
        instancias.getFactura().setShowMsg(true);
        instancias.getFactura().setNumeroFacturaRenvio("0");
        instancias.getFactura().setNumeroIdFacturaRenvio("0");
        return numeroFactura;
    }
    
    private boolean isFactura(PrefacturaPTM prefacturaPTM) {
        RespuestaServicioFactura respuestaServicio=null; 
        String id;
        id = instancias.getSql().esPreFactura(prefacturaPTM.getIdTxExterno());
        if("0".equals(id)){
         return crearPrefactura(prefacturaPTM);
        }else{
           respuestaServicio = servicioPrefactura(prefacturaPTM.getId().toString(),3);  
          return false;
        }
    }
    
    @SuppressWarnings("empty-statement")
    private boolean crearPrefactura(PrefacturaPTM prefacturaPTM) {
        RespuestaServicioFactura respuestaServicio=null;
        String idPrefactura;
        try {
            String fechaNacimiento ="1990-01-01";
            if(prefacturaPTM.getFechaNacimiento()!= null && prefacturaPTM.getFechaNacimiento().trim()!=""){
              fechaNacimiento = metodos.fechaLarga(prefacturaPTM.getFechaNacimiento().substring(0, 19));
            }
            
            prefacturaPTM.setFechaNacimiento(fechaNacimiento);
            prefacturaPTM.setEstadoPrefactura("0");
              
            if(prefacturaPTM.getRazonSocial()== null || prefacturaPTM.getRazonSocial().trim()== "" || prefacturaPTM.getRazonSocial().isEmpty()){
                String nombre = prefacturaPTM.getPrimerNombre(); 
                nombre += prefacturaPTM.getSegundoNombre()== null || prefacturaPTM.getSegundoNombre().trim()==""?"":" "+prefacturaPTM.getSegundoNombre();
                nombre += prefacturaPTM.getPrimerApellido()== null || prefacturaPTM.getPrimerApellido().trim()==""?"":" "+prefacturaPTM.getPrimerApellido();
                nombre += prefacturaPTM.getSegundoApellido()== null || prefacturaPTM.getSegundoApellido().trim()==""?"":" "+prefacturaPTM.getSegundoApellido();
                prefacturaPTM.setRazonSocial(nombre); 
             }   
             if (instancias.getSql().insertarPrefacturaPTM(prefacturaPTM)) {
                 idPrefactura = instancias.getSql().consultaSecuencia();
                 for (DetallesPreFactura detallesPreFactura : prefacturaPTM.getDetallesPreFactura()) {
                     detallesPreFactura.setIdPrefactura(Integer.parseInt(idPrefactura));
                     double descuento = ((detallesPreFactura.getValorDescuento())*100)/(detallesPreFactura.getCantidad()*detallesPreFactura.getPrecioUnitario());
                     if(!instancias.getConfigFactura().isResponsableIva()){ 
                       detallesPreFactura.setPorcentajeIVA(0.0);  
                       detallesPreFactura.setPrecioUnitario(detallesPreFactura.getPrecioUnitario()+detallesPreFactura.getValorDescuento());  
                     }else{
                       BigDecimal ivap = new BigDecimal(detallesPreFactura.getPorcentajeIVA());
                       BigDecimal valorProducto  = new BigDecimal(detallesPreFactura.getPrecioUnitario());
                       BigDecimal nuevoValorProducto = CalculaValorSinIva(valorProducto,ivap).add(new BigDecimal(detallesPreFactura.getValorDescuento()));
                       detallesPreFactura.setPrecioUnitario(Double.parseDouble(String.valueOf(nuevoValorProducto)));
                     }
                     
                     BigDecimal bd = new BigDecimal(descuento).setScale(2, RoundingMode.HALF_UP);
                     double descuentoProducto = bd.doubleValue(); 
                     detallesPreFactura.setPorcentajeDescuento(descuentoProducto);                    
                     if (!instancias.getSql().insertarPrefacturaDetallePTM(detallesPreFactura)) {
                         instancias.getSql().deletePrefactura(idPrefactura);
                         throw new UnsupportedOperationException(" Error al almacenar detalle prefactura ");
                     }
                 }
                respuestaServicio = servicioPrefactura(prefacturaPTM.getId().toString(),3); 
             }
        } catch (Exception e) {
            Logs.error("Error al crearPrefactura "+e.getMessage());
            System.out.print("Error: " + e);
            return false;            
        }
        return true;
    }
    
    private boolean isProducto(PrefacturaPTM prefacturaPTM) {
        String bodega = bodega();
        for (DetallesPreFactura detallesPreFactura : prefacturaPTM.getDetallesPreFactura()) {
            String codigo = detallesPreFactura.getCodigoProducto();
            ndProducto nodo = instancias.getSql().getDatosProducto(codigo, "bdProductos");
            if (nodo.getIdSistema() == null) {
                crearProducto(detallesPreFactura);
            }else{
                modificarProducto(nodo, detallesPreFactura);
            }
        }
        return true;
    }
    
    public boolean modificarProducto(ndProducto nodo, DetallesPreFactura detallesPreFactura) {
        String codigoEstandar = "Código Estándar de Productos y Servicios de Naciones Unidas";
        
        double porcentajeIva = detallesPreFactura.getPorcentajeIVA();
        BigDecimal iva;
        BigDecimal valorProducto;
        BigDecimal valorProductoSinIva;
       
        valorProducto  = new BigDecimal(detallesPreFactura.getPrecioUnitario());
        iva  = new BigDecimal(porcentajeIva);
        if(!instancias.getConfigFactura().isResponsableIva()){            
//            valorProductoSinIva = valorProducto.subtract(new BigDecimal(detallesPreFactura.getValorDescuento()));
            valorProductoSinIva = valorProducto.add(new BigDecimal(detallesPreFactura.getValorDescuento()));
            iva  = new BigDecimal(0);
            porcentajeIva=0.0;
        }else{            
            valorProductoSinIva = CalculaValorSinIva(valorProducto,iva).add(new BigDecimal(detallesPreFactura.getValorDescuento()));
        }
        
        Object[] vector = {
            nodo.getIdSistema(), detallesPreFactura.getCodigoProducto(), "", detallesPreFactura.getDescripcionProducto(),
            nodo.getGrupo(), nodo.getSubgrupo(), nodo.getProveedor(), porcentajeIva,
            big.getMoneda((valorProductoSinIva + "").replace(".", ",")), big.getMoneda((valorProductoSinIva + "").replace(".", ",")),
            big.getMoneda((valorProductoSinIva + "").replace(".", ",")), big.getMoneda((valorProductoSinIva + "").replace(".", ",")),
            big.getMoneda((valorProductoSinIva + "").replace(".", ",")), big.getMoneda((valorProductoSinIva + "").replace(".", ",")),
            big.getMoneda((valorProductoSinIva + "").replace(".", ",")), big.getMoneda((valorProductoSinIva + "").replace(".", ",")),
            "ADMIN", "0", detallesPreFactura.getUnidadMedida(),
            detallesPreFactura.getDescripcionProducto(), valorProductoSinIva, "0", "9999999", "",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            false, false, false, false, false, false, false,
            0, 0, instancias.getTerminal(), "0", "", false,
            "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",
            false, "", "", "",
            codigoEstandar, "", "", "", "", "", "0",
            nodo.getCodigo2(), nodo.getCodigo3(), nodo.getCodigo4(), nodo.getCodigo5(), nodo.getCodigo6(), nodo.getCodigo7(),
            nodo.getCodigo8(), "", "", "", "", "", "", "1", "0", "0", "", "0","0"};

        ndProducto producto = metodos.llenarProducto(vector);
        
        if (!instancias.getSql().modificarProducto(producto, "bdProductos")) {
            metodos.msgError(this, "Error al modificar el producto");
            return false;
        }
        if (instancias.getConfiguraciones().isInventarioBodegas()) {
            if (!instancias.getSql().modificarProducto(producto, "bdProductosBodega1")) {
                metodos.msgError(this, "Error al modificar el producto");
            }

            if (!instancias.getSql().modificarProducto(producto, "bdProductosBodega2")) {
                metodos.msgError(this, "Error al modificar el producto");
            }

            if (!instancias.getSql().modificarProducto(producto, "bdProductosBodega3")) {
                metodos.msgError(this, "Error al modificar el producto");
            }

            if (!instancias.getSql().modificarProducto(producto, "bdProductosBodega4")) {
                metodos.msgError(this, "Error al modificar el producto");
            }
        }
        return true;
    }
    
    /* funcion que crea un producto desde cero*/
    private boolean crearProducto(DetallesPreFactura detallesPreFactura) {
        ndProducto nodo;
        String consecutivo = "";
        int num = Integer.parseInt(instancias.getSql().getNumConsecutivo("PROD")[0].toString());
        consecutivo = String.valueOf(num);
        for (int i = 0; i < 8 - String.valueOf(num).length(); i++) {
            consecutivo = "0" + consecutivo;
        }
        String grupo = null;
        String subgrupo = null;
        String proveedor = null;
        BigDecimal costo = BigDecimal.ZERO;
        try {
           costo = big.getMoneda("0");
        } catch (Exception e) {
//            metodos.msgAdvertenciaAjustado(this, "Costo con formato invalidó");
//            return false;
        }
        String codigoEstandar = "Código Estándar de Productos y Servicios de Naciones Unidas";
        //detallesPreFactura.getPorcentajeIVA();
        String codigo1 = (detallesPreFactura.getCodigoProducto() + "-1");
        String codigo2 = (detallesPreFactura.getCodigoProducto() + "-2");
        String codigo3 = (detallesPreFactura.getCodigoProducto() + "-3");
        String codigo4 = (detallesPreFactura.getCodigoProducto() + "-4");
        String codigo5 = (detallesPreFactura.getCodigoProducto() + "-5");
        String codigo6 = (detallesPreFactura.getCodigoProducto() + "-6");
        String codigo7 = (detallesPreFactura.getCodigoProducto() + "-7");
        String codigo8 = (detallesPreFactura.getCodigoProducto() + "-8");
       
        double porcentajeIva = detallesPreFactura.getPorcentajeIVA();
        BigDecimal iva;
        BigDecimal valorProducto;
        BigDecimal valorProductoSinIva;
       
        valorProducto  = new BigDecimal(detallesPreFactura.getPrecioUnitario());
        iva  = new BigDecimal(porcentajeIva);
        if(!instancias.getConfigFactura().isResponsableIva()){ 
//            valorProductoSinIva = valorProducto.subtract(new BigDecimal(detallesPreFactura.getValorDescuento()));
            valorProductoSinIva = valorProducto.add(new BigDecimal(detallesPreFactura.getValorDescuento()));
            iva  = new BigDecimal(0);
            porcentajeIva=0.0;
        }else{            
            valorProductoSinIva = CalculaValorSinIva(valorProducto,iva).add(new BigDecimal(detallesPreFactura.getValorDescuento()));
        }
        
        Object[] vector = {
            "PROD-" + consecutivo, detallesPreFactura.getCodigoProducto(), "", detallesPreFactura.getDescripcionProducto(),
            grupo, subgrupo, proveedor, porcentajeIva,
            big.getMoneda((valorProductoSinIva + "").replace(".", ",")), big.getMoneda((valorProductoSinIva + "").replace(".", ",")),
            big.getMoneda((valorProductoSinIva + "").replace(".", ",")), big.getMoneda((valorProductoSinIva + "").replace(".", ",")),
            big.getMoneda((valorProductoSinIva + "").replace(".", ",")), big.getMoneda((valorProductoSinIva + "").replace(".", ",")),
            big.getMoneda((valorProductoSinIva + "").replace(".", ",")), big.getMoneda((valorProductoSinIva + "").replace(".", ",")),
//            big.getMoneda((detallesPreFactura.getPrecioUnitario() + "").replace(".", ",")), big.getMoneda((detallesPreFactura.getPrecioUnitario() + "").replace(".", ",")),
//            big.getMoneda((detallesPreFactura.getPrecioUnitario() + "").replace(".", ",")), big.getMoneda((detallesPreFactura.getPrecioUnitario() + "").replace(".", ",")),
//            big.getMoneda((detallesPreFactura.getPrecioUnitario() + "").replace(".", ",")), big.getMoneda((detallesPreFactura.getPrecioUnitario() + "").replace(".", ",")),
//            big.getMoneda((detallesPreFactura.getPrecioUnitario() + "").replace(".", ",")), big.getMoneda((detallesPreFactura.getPrecioUnitario() + "").replace(".", ",")),
            "ADMIN", "0", detallesPreFactura.getUnidadMedida(),
            detallesPreFactura.getDescripcionProducto(), costo, "0", "9999999", "",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            detallesPreFactura.getDescripcionProducto(), "", "1",
            false, false, false, false, false, false, false,
            0, 0, instancias.getTerminal(), "0", "", false,
            "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",
            false, "", "", "",
            codigoEstandar, "", "", "", "", "", "0",
            codigo2, codigo3, codigo4, codigo5, codigo6, codigo7,
            codigo8, "", "", "", "", "", "", "1", "0", "0", "", "0","0"};

        nodo = metodos.llenarProducto(vector);
        if (!instancias.getSql().agregarProducto(nodo, "bdProductos")) {
            metodos.msgError(this, "Error al guardar el producto");
            return false;
        }

        if (!instancias.getSql().agregarProducto(nodo, "bdProductosBodega1")) {
            metodos.msgError(this, "Error al guardar el producto");
            return false;
        }
        if (!instancias.getSql().agregarProducto(nodo, "bdProductosBodega2")) {
            metodos.msgError(this, "Error al guardar el producto");
            return false;
        }
        if (!instancias.getSql().agregarProducto(nodo, "bdProductosBodega3")) {
            metodos.msgError(this, "Error al guardar el producto");
            return false;
        }
        if (!instancias.getSql().agregarProducto(nodo, "bdProductosBodega4")) {
            metodos.msgError(this, "Error al guardar el producto");
            return false;
        }
        if (!instancias.getSql().agregarPonderado(metodos.fechaConsulta(metodosGenerales.fechaHora()), "PROD-" + consecutivo,
                BigDecimal.ZERO, "0", "0", costo, "0", instancias.getUsuario(), costo, "CREACIÓN DE PROD")) {
            metodos.msgError(this, "Hubo un problema al guardar en el consecutivo del producto");
        }

        if (!instancias.getSql().agregarUltimoPonderado(
                metodos.fechaConsulta(metodosGenerales.fechaHora()), "PROD-" + consecutivo, BigDecimal.ZERO, "0", "0", costo, "0",
                instancias.getUsuario(), costo, "CREACIÓN DE PROD")) {
            metodos.msgError(this, "Hubo un problema al guardar en el consecutivo del producto");
        }

        return true;
    }
    
    private BigDecimal CalculaValorSinIva(BigDecimal valorProducto,BigDecimal iva){    
        BigDecimal sumaUno  = new BigDecimal(1);
        BigDecimal divisorCien = new BigDecimal(100);
        BigDecimal res =  iva.divide(divisorCien);
        sumaUno = sumaUno.add(res);
        valorProducto = valorProducto.divide(sumaUno, 2, RoundingMode.HALF_UP);        
        return valorProducto;
    }

    private boolean isCliente(PrefacturaPTM prefacturaPTM) {
        String digitoVerificacion = "";
        if (!prefacturaPTM.getDigitoVerificacion().isEmpty()) {
            digitoVerificacion = "-" + prefacturaPTM.getDigitoVerificacion();
        }

        String nit = prefacturaPTM.getIdentificacion() + digitoVerificacion;
        //consultamos si existe el cliente
        ndTercero nodo = instancias.getSql().getDatosTercero(nit);
        
        if (nodo.getId() == null) {
          nodo = instancias.getSql().getDatosTercero(prefacturaPTM.getIdentificacion());
        }
        
        if (nodo.getId() != null) {
            if (nodo.getNombre().equals("") || nodo.getTelefono().equals("") || nodo.getTipo().equals("")
                    || nodo.getEmail().equals("") || nodo.getActividad().equals("")
                    || nodo.getDepartamento().equals("") || nodo.getCiudad().equals("")) {
                crearCliente(prefacturaPTM, nodo.getIdSistema(), false);
            }
            return true;
        } else {
            crearCliente(prefacturaPTM, "", true);
        }
        return true;
    }

    public void crearCliente(PrefacturaPTM prefacturaPTM,String idSistema, boolean estado) {
        String consecutivo = "";
        if(estado){
            int num = Integer.parseInt(instancias.getSql().getNumConsecutivo("TERCERO")[0].toString());
            consecutivo = String.valueOf(num);
            for (int i = 0; i < 8 - String.valueOf(num).length(); i++) {
                consecutivo = "0" + consecutivo;
            }
            consecutivo = "TERC-" + consecutivo;
        }else{
          consecutivo = idSistema;
        }
        String digitoVerificacion = "";
        if (!prefacturaPTM.getDigitoVerificacion().isEmpty()) {
            digitoVerificacion = "-" + prefacturaPTM.getDigitoVerificacion();
        }
        String nit = prefacturaPTM.getIdentificacion() + digitoVerificacion;
        String naturaleza = "";
        String rut = "No";
        String plazo = "0";
        String cupo = "0";
        String pais = "COLOMBIA";
        String sexo = "";
        String regimen = "";
        String codigoPostal = prefacturaPTM.getCodigoDane();
        boolean responsableIva = false;
        prefacturaPTM.getCodigoDane().substring(0, 2);
        String departamento = prefacturaPTM.getCodigoDane().substring(0, 2);     
        String ciudad = prefacturaPTM.getCodigoDane().substring(2,5);
        
        Object[][] depMuni = instancias.getSql().getNombreDepartamentoMunicipios(departamento,ciudad);
        
        String zona = "Urbana";
        if (prefacturaPTM.getTipoPersona().equals("J") || prefacturaPTM.getTipoPersona().equals("Persona juridica")) {
            naturaleza = "Persona juridica";
        } else if (prefacturaPTM.getTipoPersona().equals("N")  || prefacturaPTM.getTipoPersona().equals("Persona natural")) {
            naturaleza = "Persona natural";
        }
        String tipocliente="";
        String eps = null;
        String moneda = null;
        String fecha = metodos.fechaConsulta(metodosGenerales.fecha());
        String fechaNacimiento = prefacturaPTM.getFechaNacimiento()== null || prefacturaPTM.getFechaNacimiento().trim()==""?"1990-01-01":prefacturaPTM.getFechaNacimiento().toString();
//        String fechaNacimiento = metodos.fechaLarga(prefacturaPTM.getFechaNacimiento().substring(0, 19));
        
        if(prefacturaPTM.getRazonSocial()== null || prefacturaPTM.getRazonSocial().trim()== ""){
           String nombre = prefacturaPTM.getPrimerNombre(); 
           nombre += prefacturaPTM.getSegundoNombre()== null || prefacturaPTM.getSegundoNombre().trim()==""?"":" "+prefacturaPTM.getSegundoNombre();
           nombre += prefacturaPTM.getPrimerApellido()== null || prefacturaPTM.getPrimerApellido().trim()==""?"":" "+prefacturaPTM.getPrimerApellido();
           nombre += prefacturaPTM.getSegundoApellido()== null || prefacturaPTM.getSegundoApellido().trim()==""?"":" "+prefacturaPTM.getSegundoApellido();
           prefacturaPTM.setRazonSocial(nombre); 
        }
        System.err.println("consecutivo"+consecutivo);
        System.err.println("nit"+nit);
        System.err.println("prefacturaPTM.getRazonSocial()"+prefacturaPTM.getRazonSocial());
        System.err.println("prefacturaPTM.getTelefono()"+prefacturaPTM.getTelefono());
        System.err.println("prefacturaPTM.getDireccion()"+prefacturaPTM.getDireccion());
        System.err.println("depMuni[0][1].toString().toUpperCase()"+depMuni[0][1].toString().toUpperCase());
        Object[] vector = {consecutivo, nit, prefacturaPTM.getRazonSocial(),
            prefacturaPTM.getTelefono(), "", prefacturaPTM.getDireccion(), depMuni[0][1].toString().toUpperCase(),
            prefacturaPTM.getEmail(), depMuni[0][0].toString().toUpperCase(), fecha,
            instancias.getUsuario(), prefacturaPTM.getTipoIdentificacion(), prefacturaPTM.getRazonSocial(),
            prefacturaPTM.getPrimerNombre()==null?"":prefacturaPTM.getPrimerNombre(), prefacturaPTM.getSegundoNombre()==null?"":prefacturaPTM.getSegundoNombre(), prefacturaPTM.getPrimerApellido()==null?"":prefacturaPTM.getPrimerApellido(),
            prefacturaPTM.getSegundoApellido()==null?"":prefacturaPTM.getSegundoApellido(), "", naturaleza, rut, false, plazo, big.getMoneda(cupo), "", pais,
            sexo, "", "", regimen, "", "", zona, fechaNacimiento, "", eps, instancias.getTerminal(),
            "", "", "L1", "" + "" + "", "", "", codigoPostal, "", "", "", "", "", "", "", "",
            "", "", tipocliente, "", "", "", "", "", 0, fecha,
            fecha, false, "", "", "", "TERCERO", "", responsableIva, moneda};

        ndTercero nodo = metodos.llenarTercero(vector);
         
       if(estado){ 
        if (!instancias.getSql().agregarTercero(nodo)) {
            metodos.msgError(this, "Hubo un error al guardar");
            return;
        }
       }else{
          if (!instancias.getSql().modificarTercero(nodo)) {
            metodos.msgError(this, "Hubo un error al modificar Tercero");
            return;
          }
      }
    }

    public String bodega() {
        String baseUtilizada = "";
        if (instancias.getConfiguraciones().isInventarioBodegas()) {
            if (baseUtilizada.equals("123-22")) {
                baseUtilizada = "bdProductos";
            } else if (baseUtilizada.equals("BODEGA-1")) {
                baseUtilizada = "bdProductosBodega1";
            } else if (baseUtilizada.equals("BODEGA-2")) {
                baseUtilizada = "bdProductosBodega2";
            } else if (baseUtilizada.equals("BODEGA-3")) {
                baseUtilizada = "bdProductosBodega3";
            } else if (baseUtilizada.equals("BODEGA-4")) {
                baseUtilizada = "bdProductosBodega4";
            }
        } else {
            baseUtilizada = "bdProductos";
        }
        return baseUtilizada;
    }
    
    int teclasPresionadas = 0;
    private ActionListener accion(final String opc) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
                    case "primera":
                        if (teclasPresionadas == 0) {
                            teclasPresionadas = 1;
                        } else {
                            teclasPresionadas = 0;
                        }
                        break;
                    case "segunda":
                        if (teclasPresionadas == 1) {
                            teclasPresionadas = 2;
                        } else if (teclasPresionadas == 2) {
                            new dlgPedirSuperContrasena(null, true, "").setVisible(true);
                            teclasPresionadas = 0;
                        } else {
                            teclasPresionadas = 0;
                        }
                        break;

                }
            }
        };
        return a;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel SegundoEstado;
    private javax.swing.JButton botonDomina;
    private javax.swing.JButton botonFacturar;
    private javax.swing.JButton botonFacturar1;
    private javax.swing.JTextField buscarFactura;
    private javax.swing.JTextField busquedaPrefactura;
    private javax.swing.JButton cargarPtm;
    private javax.swing.JLabel cero;
    private javax.swing.JLabel cien;
    private javax.swing.JTable configuracionTerceros2;
    private javax.swing.JLabel cuartoEstado;
    private javax.swing.JLabel cuartoNumeroEstado;
    private javax.swing.JCheckBox fechaExpedicion;
    private datechooser.beans.DateChooserCombo fechaFinal;
    private datechooser.beans.DateChooserCombo fechaInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBuscarTercero;
    private javax.swing.JCheckBox jCheckFecha;
    private javax.swing.JComboBox<String> jComboBoxListaFactura;
    private javax.swing.JComboBox<String> jComboBoxModificarEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableDocumentoSoporte;
    private javax.swing.JTable jTablePreFactura;
    private javax.swing.JTextField jTextIdentificacion;
    private javax.swing.JTextField numeroFacturaDe;
    private javax.swing.JTextField numeroFacturaHasta;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JLabel primerEstado;
    private javax.swing.JLabel primerNumeroEstado;
    private javax.swing.JLabel quintoEstado;
    private javax.swing.JLabel quintoNumeroEstado;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JLabel segundoNumeroEstado;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel tercerEstado;
    private javax.swing.JLabel tercerNumeroEstado;
    private javax.swing.JComboBox<String> tipoMovimiento;
    // End of variables declaration//GEN-END:variables
}
