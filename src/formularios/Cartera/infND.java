package formularios.Cartera;
import clases.Btw.AdditionalTag;
import clases.Btw.CoOneTime;
import clases.Btw.Company;
import clases.Btw.Customer;
import clases.Btw.InvcDisc;
import clases.Btw.InvcDtl;
import clases.Btw.InvcHead;
import clases.Btw.InvcMisc;
import clases.Btw.InvcTax;
import clases.Btw.PrepaidPayment;
import clases.Btw.SalesTRC;
import logs.Logs;
import clases.Cartera.ndCxc;
import clases.IconCellRenderer;
import clases.Instancias;
import clases.Utils;
import clases.Ventas.ndFactura;
import clases.big;
import clases.facturacionElectronica;
import clases.facturacionElectronicaPanama;
import clases.metodosGenerales;
import clases.productos.ndProducto;
import clases.terceros.ndTercero;
import clases.SQL;
import clases.Ventas.ndNotasCredito;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import configuracion.Propiedades;
import configuracion.ndConfiguracion;
import formularios.Ventas.dlgInformacionCliente;
import formularios.Ventas.dlgProductosSinInventario;
import formularios.Ventas.dlgProductosSinUtilidad;
import formularios.Ventas.dlgTipoDescuento;
import formularios.Ventas.intDevuelta;
import formularios.Ventas.intTotalDevuelta;
import formularios.Ventas.pnlFactura;
import formularios.productos.buscProductos;
import formularios.productos.dlgCompraDetallada1;
import formularios.productos.seleccionarPLU;
import formularios.terceros.buscBodegas;
import formularios.terceros.buscClientes;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.beans.PropertyVetoException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class infND extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    metodosGenerales metodos = new metodosGenerales();
    Instancias instancias;
    ndConfiguracion nodoConf;
    ndTercero nodoCliente;
    SQL sql;
    String codigoAutorizacion = "";
    //String nombreEmpresa = ""; // nombre de la empresa para ser enviada en json BTW

    Object[] datos;

    int cantDias = 0;
    String valorFila = null, simbolo = "";
    Boolean plu = false, saltarPasosFactura = false;
    DefaultTableModel modeloPro;
    DefaultTableModel modeloInventario;
    DecimalFormat df = new DecimalFormat("#.00");

    public Boolean getPlu() {
        return plu;
    }

    public void setPlu(Boolean plu) {
        this.plu = plu;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public infND() {
        initComponents();
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        instancias = Instancias.getInstancias();
        nodoConf = instancias.getSql().getDatosConfiguracion();
        //nodoCliente = instancias.getSql().getDatosTercero(instancias.getNitEmisor().split("-")[0]);
        
        tblComprobantes.setValueAt(getResolucionFE(), 0, 3);
        this.simbolo = instancias.getSimbolo();

        cmbTipoOperacion.setSelectedIndex(18);

        pnlOcultar.setVisible(false);
        String dsPrefijo = "";
        if (instancias.getIdND() != null) {
            dsPrefijo = instancias.getIdND();
        }

        lbNoFactura.setText(dsPrefijo + instancias.getSql().getNumConsecutivoActual("ND")[0].toString());

        String paisFact = instancias.getConfiguraciones().getPais();
        if (paisFact.equals("Panama")) {
            txtIva.setText("Tax");
        }

        consultarMaestros();

        txtIdSistema.setVisible(false);
        tblProductos.setDefaultRenderer(Object.class, new IconCellRenderer());
        tblProductos.getColumnModel().getColumn(1).setCellRenderer(new WordWrapCellRenderer());

        if (!instancias.getConfiguraciones().isInventarioBodegas()) {
            lbBodega.setVisible(false);
            txtBodega.setVisible(false);
        }

        if (instancias.getConfiguraciones().getTipoImpresion().equals("Sin-Codigo")) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        try {
            if (datos[17].equals("SI")) {
                if (tblProductos.getColumnModel().getColumnCount() > 0) {
                    tblProductos.getColumnModel().getColumn(10).setMinWidth(50);
//                    tblProductos.getColumnModel().getColumn(10).setPreferredWidth(150);
                    tblProductos.getColumnModel().getColumn(10).setMaxWidth(125);
                }
            } else {
                tblProductos.getColumnModel().getColumn(10).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(10).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(10).setMaxWidth(0);
            }
        } catch (Exception e) {
            Logs.error(e);
        }

        if (instancias.getConfiguraciones().isProductosSerial()) {
            tblProductos.getColumnModel().getColumn(27).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(27).setPreferredWidth(200);
            tblProductos.getColumnModel().getColumn(27).setMaxWidth(300);
        } else {
            if (instancias.getConfiguraciones().isParqueadero()) {
                tblProductos.getColumnModel().getColumn(27).setMinWidth(100);
                tblProductos.getColumnModel().getColumn(27).setPreferredWidth(200);
                tblProductos.getColumnModel().getColumn(27).setMaxWidth(300);
            } else {
                tblProductos.getColumnModel().getColumn(27).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(27).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(27).setMaxWidth(0);
            }
        }

        if (datos[6].toString().equals("porcentaje")) {
            tblProductos.getColumnModel().getColumn(5).setMinWidth(45);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(45);
            tblProductos.getColumnModel().getColumn(5).setMaxWidth(45);
            tblProductos.getColumnModel().getColumn(6).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(6).setMaxWidth(0);
        } else {
            tblProductos.getColumnModel().getColumn(5).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(5).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(6).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        tblInventario.removeEditor();
        modeloPro = (DefaultTableModel) tblProductos.getModel();

//        combobox en tabla de inventario
        TableColumn tc = tblInventario.getColumnModel().getColumn(0);
        TableCellEditor tce = new DefaultCellEditor(cmbListas);
        tc.setCellEditor(tce);

        txtFechaFactura.setText(metodosGenerales.fecha());
        txtVencimiento.setText(metodosGenerales.fecha());
        setBorder(null);
        repaint();

        txtNit.requestFocus();
        btnReImprimir.setVisible(false);
        tblComprobantes.setValueAt(true, 0, 2);
        tblComprobantes.setRowSelectionInterval(0, 0);
    }

    private String getResolucionFE(){
      Object[] datosFacElect = instancias.getSql().getResolucionTerminales("FE");
        String resolucion="";
        if(datosFacElect[2] != null){
            resolucion = datosFacElect[2].toString();
        } 
      return resolucion;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popBorrar = new javax.swing.JMenuItem();
        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        pnlInformacion = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbNit = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        btnBuscTerceros = new javax.swing.JButton();
        lbNit1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnBuscTerceros1 = new javax.swing.JButton();
        cmbVendedor = new javax.swing.JComboBox();
        lbVendedor = new javax.swing.JLabel();
        lbTipoOperacion = new javax.swing.JLabel();
        cmbTipoOperacion = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        lbFacturaNo = new javax.swing.JTextField();
        lbNoFactura = new javax.swing.JTextField();
        lbDiasPlazo = new javax.swing.JLabel();
        txtDiasPlazo = new javax.swing.JTextField();
        lbRelacion = new javax.swing.JLabel();
        txtRelacion = new javax.swing.JTextField();
        lbRelacion1 = new javax.swing.JLabel();
        txtFactRelacion = new javax.swing.JTextField();
        pnlComprobante = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblComprobantes = new javax.swing.JTable();
        lbTipoOperacion1 = new javax.swing.JLabel();
        cmbConcepto = new javax.swing.JComboBox();
        pnlOcultar = new javax.swing.JPanel();
        txtIdSistema = new javax.swing.JTextField();
        cmbListas = new javax.swing.JComboBox();
        txtFechaFactura = new javax.swing.JTextField();
        txtCartera = new javax.swing.JTextField();
        cmbListaPrecio = new javax.swing.JComboBox();
        txtVencimiento = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnReImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        lbObservaciones = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JLabel();
        lbSubtotal = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JLabel();
        txtIva = new javax.swing.JLabel();
        txtTotalIva = new javax.swing.JLabel();
        lbTotalDescuento = new javax.swing.JLabel();
        txtTotalDescuentos = new javax.swing.JLabel();
        lbImpuestoBolsa = new javax.swing.JLabel();
        lbImpoconsumo = new javax.swing.JLabel();
        txtImpuesto = new javax.swing.JLabel();
        txtTotalImpoconsumo = new javax.swing.JLabel();
        cmbRtf = new javax.swing.JComboBox();
        txtRtf = new javax.swing.JLabel();
        chkReteIva = new javax.swing.JCheckBox();
        txtRiva = new javax.swing.JLabel();
        lbTotalDescuento1 = new javax.swing.JLabel();
        txtCantUnidades = new javax.swing.JLabel();
        lbTotalDescuento2 = new javax.swing.JLabel();
        txtCantProductos = new javax.swing.JLabel();
        lbCar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        scrProductos1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lbProducto = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        btnBusProd = new javax.swing.JButton();
        scrInventario = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        lbProducto1 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        txtPorcentaje = new javax.swing.JTextField();
        lbVendedor1 = new javax.swing.JLabel();
        lbBodega = new javax.swing.JLabel();
        txtBodega = new javax.swing.JTextField();

        popBorrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        popBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        popBorrar.setText("Borrar");
        popBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popBorrarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popBorrar);

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        pnlInformacion.setBackground(new java.awt.Color(255, 255, 255));
        pnlInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("CC/Nit");
        lbNit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNitMouseClicked(evt);
            }
        });
        lbNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNitKeyReleased(evt);
            }
        });

        txtNit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNit.setName("CC/NIT"); // NOI18N
        txtNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitActionPerformed(evt);
            }
        });
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });

        btnBuscTerceros.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscTerceros.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBuscTerceros.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscTerceros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        btnBuscTerceros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscTerceros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTercerosActionPerformed(evt);
            }
        });

        lbNit1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit1.setText("Razón social");
        lbNit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit1KeyReleased(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombre.setEnabled(false);
        txtNombre.setName("Cliente"); // NOI18N
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });

        btnBuscTerceros1.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscTerceros1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBuscTerceros1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarInfo.png"))); // NOI18N
        btnBuscTerceros1.setBorder(null);
        btnBuscTerceros1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros1.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTerceros1ActionPerformed(evt);
            }
        });

        cmbVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbVendedorMouseClicked(evt);
            }
        });

        lbVendedor.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbVendedor.setText("Vendedor");

        lbTipoOperacion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTipoOperacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTipoOperacion.setText("Tipo operacion");

        cmbTipoOperacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTipoOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMBUSTIBLE", "EMISOR_AUTORETENEDOR", "EXCLUIDOS_Y_EXENTOS", "EXPORTACION", "GENERICA", "GENERICA_PAGO_ANTICIPADO", "GENERICA_PERIODO_FACTURACION", "CONSORCIO", "SERVICIOS_AIU", "ESTANDAR", "MANDATOS", "MANDATOS_BIENES", "MANDATOS_SERVICIOS", "SS-CUFE", "SS-CUDE", "SS-POS", "SS-SNum", "SS-Recaudo", "NOTA_DEBITO_REFERENCIA", "NOTA_DEBITO_SINREFERENCIA", "NOTA_DEBITO_REFERENCIAV1" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbVendedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscTerceros, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTipoOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNit1)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(btnBuscTerceros1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbTipoOperacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lbNit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscTerceros)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNit)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscTerceros1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lbNit1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTipoOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbTipoOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(cmbVendedor))
                .addGap(10, 10, 10))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        lbFacturaNo.setEditable(false);
        lbFacturaNo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbFacturaNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lbFacturaNo.setText("Nota Debito No.");
        lbFacturaNo.setBorder(null);
        lbFacturaNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbFacturaNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbFacturaNoKeyTyped(evt);
            }
        });

        lbNoFactura.setEditable(false);
        lbNoFactura.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        lbNoFactura.setForeground(new java.awt.Color(255, 0, 0));
        lbNoFactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbNoFactura.setText("1");
        lbNoFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbNoFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNoFacturaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbNoFacturaKeyTyped(evt);
            }
        });

        lbDiasPlazo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbDiasPlazo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDiasPlazo.setText("Días de Plazo:");
        lbDiasPlazo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDiasPlazoMouseClicked(evt);
            }
        });

        txtDiasPlazo.setBackground(new java.awt.Color(255, 204, 204));
        txtDiasPlazo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtDiasPlazo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiasPlazo.setText("0");
        txtDiasPlazo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDiasPlazo.setName("Plazo"); // NOI18N
        txtDiasPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasPlazoActionPerformed(evt);
            }
        });
        txtDiasPlazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiasPlazoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasPlazoKeyTyped(evt);
            }
        });

        lbRelacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbRelacion.setText("Relación NC:");

        txtRelacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtRelacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRelacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRelacion.setName("Plazo"); // NOI18N
        txtRelacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRelacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRelacionKeyTyped(evt);
            }
        });

        lbRelacion1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbRelacion1.setText("Fact relación:");

        txtFactRelacion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtFactRelacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFactRelacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFactRelacion.setEnabled(false);
        txtFactRelacion.setName("Plazo"); // NOI18N
        txtFactRelacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFactRelacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFactRelacionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbRelacion1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(lbDiasPlazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbFacturaNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbRelacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiasPlazo)
                    .addComponent(lbNoFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txtRelacion)
                    .addComponent(txtFactRelacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFacturaNo))
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiasPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDiasPlazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFactRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRelacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlComprobante.setBackground(new java.awt.Color(255, 255, 255));

        tblComprobantes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblComprobantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "NOTA DEBITO", null, null, null, null, null, null, null, null, null},
                {null, "NOTA DEBITO ADMINISTRATIVA", null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Comprobante", "", "Resolucion", "fechaFin", "desde", "hasta", "tipo", "prefijo", "conse", "plantilla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComprobantes.setRowHeight(25);
        tblComprobantes.getTableHeader().setResizingAllowed(false);
        tblComprobantes.getTableHeader().setReorderingAllowed(false);
        tblComprobantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComprobantesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblComprobantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblComprobantesMouseExited(evt);
            }
        });
        jScrollPane12.setViewportView(tblComprobantes);
        if (tblComprobantes.getColumnModel().getColumnCount() > 0) {
            tblComprobantes.getColumnModel().getColumn(0).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(0).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(2).setMinWidth(20);
            tblComprobantes.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblComprobantes.getColumnModel().getColumn(2).setMaxWidth(20);
            tblComprobantes.getColumnModel().getColumn(3).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(3).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(4).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(4).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(5).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(5).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(6).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(6).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(7).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(7).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(8).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(8).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(8).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(9).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(9).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(9).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(10).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(10).setMaxWidth(0);
        }

        lbTipoOperacion1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTipoOperacion1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTipoOperacion1.setText("Concepto:");

        cmbConcepto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbConcepto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR...", "INTERESES", "GASTOS_COBRAR", "CAMBIO_VALOR", "OTROS" }));

        javax.swing.GroupLayout pnlComprobanteLayout = new javax.swing.GroupLayout(pnlComprobante);
        pnlComprobante.setLayout(pnlComprobanteLayout);
        pnlComprobanteLayout.setHorizontalGroup(
            pnlComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
            .addGroup(pnlComprobanteLayout.createSequentialGroup()
                .addComponent(lbTipoOperacion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbConcepto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlComprobanteLayout.setVerticalGroup(
            pnlComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlComprobanteLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTipoOperacion1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cmbConcepto))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout pnlInformacionLayout = new javax.swing.GroupLayout(pnlInformacion);
        pnlInformacion.setLayout(pnlInformacionLayout);
        pnlInformacionLayout.setHorizontalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(pnlComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlInformacionLayout.setVerticalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        txtIdSistema.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtIdSistema.setForeground(new java.awt.Color(255, 51, 51));
        txtIdSistema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdSistema.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        txtIdSistema.setEnabled(false);
        txtIdSistema.setName("CC/NIT"); // NOI18N
        txtIdSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSistemaActionPerformed(evt);
            }
        });
        txtIdSistema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdSistemaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdSistemaKeyTyped(evt);
            }
        });

        cmbListas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8" }));
        cmbListas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbListasItemStateChanged(evt);
            }
        });
        cmbListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListasActionPerformed(evt);
            }
        });

        txtFechaFactura.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtFechaFactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaFactura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFechaFactura.setEnabled(false);
        txtFechaFactura.setName("Plazo"); // NOI18N
        txtFechaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaFacturaActionPerformed(evt);
            }
        });
        txtFechaFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaFacturaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaFacturaKeyTyped(evt);
            }
        });

        txtCartera.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtCartera.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCartera.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCartera.setEnabled(false);
        txtCartera.setName("Plazo"); // NOI18N
        txtCartera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarteraActionPerformed(evt);
            }
        });
        txtCartera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCarteraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCarteraKeyTyped(evt);
            }
        });

        cmbListaPrecio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8" }));

        txtVencimiento.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtVencimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVencimiento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtVencimiento.setEnabled(false);
        txtVencimiento.setName("Plazo"); // NOI18N
        txtVencimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVencimientoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVencimientoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlOcultarLayout = new javax.swing.GroupLayout(pnlOcultar);
        pnlOcultar.setLayout(pnlOcultarLayout);
        pnlOcultarLayout.setHorizontalGroup(
            pnlOcultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOcultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbListas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCartera, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(cmbListaPrecio, 0, 1, Short.MAX_VALUE)
                .addGap(386, 386, 386)
                .addComponent(txtVencimiento)
                .addContainerGap())
        );
        pnlOcultarLayout.setVerticalGroup(
            pnlOcultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOcultarLayout.createSequentialGroup()
                .addGroup(pnlOcultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOcultarLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnlOcultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlOcultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbListas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCartera, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlOcultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlOcultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbListaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setToolTipText("Ctrl+L");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpiar.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setToolTipText("Ctrl+G");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnGuardarKeyReleased(evt);
            }
        });

        btnReImprimir.setBackground(new java.awt.Color(247, 220, 111));
        btnReImprimir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnReImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnReImprimir.setText("REIMPRIMIR");
        btnReImprimir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnReImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReImprimir.setEnabled(false);
        btnReImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnReImprimir.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnReImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnReImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(2);
        txtObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtObservacionesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtObservaciones);

        lbObservaciones.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbObservaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbObservaciones.setText("Observaciones");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTotal.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotal.setText("Total: 0");

        lbSubtotal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbSubtotal.setText("Subtotal:");

        txtSubTotal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtSubTotal.setText("0");

        txtIva.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtIva.setText("IVA:");

        txtTotalIva.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTotalIva.setText("0");

        lbTotalDescuento.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTotalDescuento.setText("Descuentos:");
        lbTotalDescuento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTotalDescuentoMouseClicked(evt);
            }
        });

        txtTotalDescuentos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTotalDescuentos.setText("0");

        lbImpuestoBolsa.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbImpuestoBolsa.setText("Imp. Bolsa:");

        lbImpoconsumo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbImpoconsumo.setText("Impoconsumo:");

        txtImpuesto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtImpuesto.setText("0");

        txtTotalImpoconsumo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTotalImpoconsumo.setText("0");

        cmbRtf.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cmbRtf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RtF", "0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "6", "7", "10", "20" }));
        cmbRtf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRtfItemStateChanged(evt);
            }
        });
        cmbRtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRtfActionPerformed(evt);
            }
        });

        txtRtf.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtRtf.setText("0");

        chkReteIva.setBackground(new java.awt.Color(255, 255, 255));
        chkReteIva.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        chkReteIva.setText("Rete Iva");
        chkReteIva.setAlignmentY(0.0F);
        chkReteIva.setBorder(null);
        chkReteIva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkReteIva.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkReteIva.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkReteIvaItemStateChanged(evt);
            }
        });
        chkReteIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkReteIvaActionPerformed(evt);
            }
        });

        txtRiva.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtRiva.setText("0");

        lbTotalDescuento1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTotalDescuento1.setText("N° Unit:");
        lbTotalDescuento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTotalDescuento1MouseClicked(evt);
            }
        });

        txtCantUnidades.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCantUnidades.setText("0");
        txtCantUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantUnidadesMouseClicked(evt);
            }
        });

        lbTotalDescuento2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTotalDescuento2.setText("N° Prod:");
        lbTotalDescuento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTotalDescuento2MouseClicked(evt);
            }
        });

        txtCantProductos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtCantProductos.setText("0");
        txtCantProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantProductosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTotalDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTotalDescuento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTotalDescuento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantUnidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbRtf, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addComponent(lbImpuestoBolsa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtRtf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chkReteIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbImpoconsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotalImpoconsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtTotal)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbImpuestoBolsa, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbImpoconsumo)
                            .addComponent(txtTotalImpoconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkReteIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRiva)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalIva)
                            .addComponent(txtIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotalDescuento)
                            .addComponent(txtTotalDescuentos))))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbRtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRtf, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTotalDescuento1)
                            .addComponent(txtCantUnidades))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTotalDescuento2)
                            .addComponent(txtCantProductos))))
                .addGap(5, 5, 5))
        );

        lbCar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCar.setText("300 ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lbObservaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCar))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N

        tblProductos.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Valor/Unit", "Cant.", "Subtotal", "Desc %", "Desc", "Iva %", "Impo", "Total", "Ubicación", "Referencia", "plu", "cant2", "ponderado", "Utilidad", "Estado", "Copago", "datoGrupo", "Pago Tercero", "Utilidad1", "Orden/Aviso", "Borrar", "Impo %", "Orden", "Aviso", "F. Entrega", "Detalle", "Lote", "IdProd", "paraComanda", "permisoDesc", "idSistema", "Iva", "Grupo", "Estandar", "Medida", "ControlInv"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false, true, true, false, true, false, false, false, false, false, false, false, false, true, false, true, true, true, false, true, true, true, true, false, false, false, true, true, true, true, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setComponentPopupMenu(jPopupMenu1);
        tblProductos.setMinimumSize(new java.awt.Dimension(105, 203));
        tblProductos.setRowHeight(31);
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        tblProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProductosKeyReleased(evt);
            }
        });
        scrProductos1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(50);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(200);
            tblProductos.getColumnModel().getColumn(1).setMinWidth(200);
            tblProductos.getColumnModel().getColumn(2).setMinWidth(80);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(2).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(3).setMinWidth(35);
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(35);
            tblProductos.getColumnModel().getColumn(3).setMaxWidth(35);
            tblProductos.getColumnModel().getColumn(4).setMinWidth(80);
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(4).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(5).setMinWidth(50);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(5).setMaxWidth(50);
            tblProductos.getColumnModel().getColumn(6).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(6).setMaxWidth(100);
            tblProductos.getColumnModel().getColumn(7).setMinWidth(35);
            tblProductos.getColumnModel().getColumn(7).setPreferredWidth(35);
            tblProductos.getColumnModel().getColumn(7).setMaxWidth(35);
            tblProductos.getColumnModel().getColumn(8).setMinWidth(80);
            tblProductos.getColumnModel().getColumn(8).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(8).setMaxWidth(140);
            tblProductos.getColumnModel().getColumn(9).setMinWidth(80);
            tblProductos.getColumnModel().getColumn(9).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(9).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(10).setMinWidth(50);
            tblProductos.getColumnModel().getColumn(10).setMaxWidth(125);
            tblProductos.getColumnModel().getColumn(11).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(11).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(11).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(12).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(12).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(12).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(13).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(13).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(13).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(14).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(14).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(14).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(15).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(15).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(15).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(16).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(16).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(16).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(17).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(17).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(17).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(18).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(18).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(18).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(19).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(19).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(19).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(20).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(20).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(20).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(21).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(21).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(21).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(22).setMinWidth(40);
            tblProductos.getColumnModel().getColumn(22).setPreferredWidth(40);
            tblProductos.getColumnModel().getColumn(22).setMaxWidth(40);
            tblProductos.getColumnModel().getColumn(23).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(23).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(23).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(24).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(24).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(24).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(25).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(25).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(25).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(26).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(26).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(26).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(27).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(27).setPreferredWidth(250);
            tblProductos.getColumnModel().getColumn(27).setMaxWidth(300);
            tblProductos.getColumnModel().getColumn(28).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(28).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(28).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(29).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(29).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(29).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(30).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(30).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(30).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(31).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(31).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(31).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(32).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(32).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(32).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(33).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(33).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(33).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(34).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(34).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(34).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(35).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(35).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(35).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(36).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(36).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(36).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(37).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(37).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(37).setMaxWidth(0);
        }

        lbProducto.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbProducto.setText("Producto:");
        lbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbProductoMouseClicked(evt);
            }
        });
        lbProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbProductoKeyReleased(evt);
            }
        });

        txtCodProducto.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtCodProducto.setName("combo"); // NOI18N
        txtCodProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodProductoFocusGained(evt);
            }
        });
        txtCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProductoActionPerformed(evt);
            }
        });
        txtCodProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodProductoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodProductoKeyReleased(evt);
            }
        });

        btnBusProd.setBackground(new java.awt.Color(204, 204, 204));
        btnBusProd.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBusProd.setForeground(new java.awt.Color(255, 255, 255));
        btnBusProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        btnBusProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBusProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBusProd.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBusProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusProdActionPerformed(evt);
            }
        });

        tblInventario.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Actual", "Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInventario.setToolTipText("Doble Click para cambiar la lista");
        tblInventario.setMinimumSize(new java.awt.Dimension(45, 203));
        tblInventario.setRowHeight(31);
        tblInventario.getTableHeader().setReorderingAllowed(false);
        tblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventarioMouseClicked(evt);
            }
        });
        scrInventario.setViewportView(tblInventario);

        lbProducto1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbProducto1.setText("Cant:");
        lbProducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbProducto1KeyReleased(evt);
            }
        });

        txtCant.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCant.setText("1");
        txtCant.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCant.setEnabled(false);
        txtCant.setName("combo"); // NOI18N
        txtCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantActionPerformed(evt);
            }
        });
        txtCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantFocusGained(evt);
            }
        });
        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantKeyReleased(evt);
            }
        });

        txtPorcentaje.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPorcentaje.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPorcentaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPorcentajeMouseClicked(evt);
            }
        });
        txtPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorcentajeActionPerformed(evt);
            }
        });
        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyTyped(evt);
            }
        });

        lbVendedor1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbVendedor1.setText("Desc: %");

        lbBodega.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbBodega.setText("Bodega:");
        lbBodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbBodegaKeyReleased(evt);
            }
        });

        txtBodega.setBackground(new java.awt.Color(255, 204, 204));
        txtBodega.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtBodega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBodega.setText("123-22");
        txtBodega.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBodega.setName("combo"); // NOI18N
        txtBodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBodegaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBodegaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBodegaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBodegaMouseReleased(evt);
            }
        });
        txtBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodegaActionPerformed(evt);
            }
        });
        txtBodega.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBodegaFocusGained(evt);
            }
        });
        txtBodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBodegaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBodegaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(scrProductos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbProducto1)
                        .addGap(2, 2, 2)
                        .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(lbBodega)
                        .addGap(1, 1, 1)
                        .addComponent(txtBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(lbProducto)
                        .addGap(1, 1, 1)
                        .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnBusProd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbVendedor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBusProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBodega, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(lbVendedor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrProductos1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(scrInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOcultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        scrFormulario.setViewportView(pnlFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(scrFormulario)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(scrFormulario)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void popBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popBorrarActionPerformed
        if (tblProductos.getSelectedRow() > -1) {
            int fila[] = tblProductos.getSelectedRows();

            DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();

            for (int i = 0; i < fila.length; i++) {
                modelo.removeRow(fila[i]);
            }

            cargarTotales();
        } else {
            metodos.msgAdvertencia(this, "Seleccione un producto");
        }
    }//GEN-LAST:event_popBorrarActionPerformed

    private void lbNitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNitMouseClicked

    }//GEN-LAST:event_lbNitMouseClicked

    private void lbNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNitKeyReleased

    private void txtNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitActionPerformed

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarCliente(txtNit.getText());
        } else if (!txtNombre.getText().equals("")) {
            txtIdSistema.setText("");
            txtDiasPlazo.setText("0");
            txtNombre.setText("");
            txtObservaciones.setText("");
        }
    }//GEN-LAST:event_txtNitKeyReleased

    private void txtNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitKeyTyped

    private void btnBuscTercerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTercerosActionPerformed
        ventanaTerceros("");
    }//GEN-LAST:event_btnBuscTercerosActionPerformed

    private void lbNit1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit1KeyReleased

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked

    }//GEN-LAST:event_txtNombreMouseClicked

    private void btnBuscTerceros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTerceros1ActionPerformed
        dlgInformacionCliente notaCliente = new dlgInformacionCliente(null, true, txtIdSistema.getText());
        notaCliente.setLocationRelativeTo(null);
        notaCliente.setVisible(true);
    }//GEN-LAST:event_btnBuscTerceros1ActionPerformed

    private void cmbVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbVendedorMouseClicked

    }//GEN-LAST:event_cmbVendedorMouseClicked

    private void lbFacturaNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbFacturaNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbFacturaNoKeyReleased

    private void lbFacturaNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbFacturaNoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lbFacturaNoKeyTyped

    private void lbNoFacturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNoFacturaKeyReleased

    }//GEN-LAST:event_lbNoFacturaKeyReleased

    private void lbNoFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNoFacturaKeyTyped

    }//GEN-LAST:event_lbNoFacturaKeyTyped

    private void lbDiasPlazoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDiasPlazoMouseClicked

    }//GEN-LAST:event_lbDiasPlazoMouseClicked

    private void txtDiasPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasPlazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasPlazoActionPerformed

    private void txtDiasPlazoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPlazoKeyReleased
        calcularDiasPlazo(evt);
    }//GEN-LAST:event_txtDiasPlazoKeyReleased

    private void txtDiasPlazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPlazoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtDiasPlazoKeyTyped

    private void txtVencimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVencimientoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVencimientoKeyReleased

    private void txtVencimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVencimientoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVencimientoKeyTyped

    private void txtIdSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSistemaActionPerformed

    private void txtIdSistemaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSistemaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSistemaKeyReleased

    private void txtIdSistemaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSistemaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSistemaKeyTyped

    private void cmbListasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbListasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbListasItemStateChanged

    private void cmbListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListasActionPerformed
        if (tblInventario.getSelectedRow() != -1) {

            String baseUtilizada = obtenerBase();

            ndProducto codigo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(tblInventario.getSelectedRow(), 32).toString(), baseUtilizada);
            String valor = "";

            switch ((String) tblInventario.getValueAt(tblInventario.getSelectedRow(), 0)) {
                case "L1":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL1()));
                    break;
                case "L2":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL2()));
                    break;
                case "L3":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL3()));
                    break;
                case "L4":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL4()));
                    break;
                case "L5":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL5()));
                    break;
                case "L6":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL6()));
                    break;
                case "L7":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL7()));
                    break;
                case "L8":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL8()));
                    break;
            }

            tblProductos.setColumnSelectionInterval(3, 3);
            tblProductos.setColumnSelectionInterval(6, 6);
            tblProductos.setRowSelectionInterval(tblInventario.getSelectedRow(), tblInventario.getSelectedRow());
            tblProductos.setValueAt(valor, tblInventario.getSelectedRow(), 2);
            //            tblProductos.editCellAt(tblInventario.getSelectedRow(), 6);
            tblProductos.transferFocus();

            //simulando enter sobre el producto
            KeyEvent evento = new KeyEvent(tblInventario, 0, 0, 0, 0);
            evento.setKeyCode(KeyEvent.VK_ENTER);
            tblProductosKeyReleased(evento);
        }
    }//GEN-LAST:event_cmbListasActionPerformed

    private void txtFechaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaFacturaActionPerformed

    private void txtFechaFacturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaFacturaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaFacturaKeyReleased

    private void txtFechaFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaFacturaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaFacturaKeyTyped

    private void txtCarteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarteraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarteraActionPerformed

    private void txtCarteraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarteraKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarteraKeyReleased

    private void txtCarteraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarteraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarteraKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        if (metodos.msgPregunta(null, "¿Desea limpiar la nota debito?") == 0) {
            limpiar(true);
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        instancias.setCancelarFactura(false);

        if (btnGuardar.getText().equals("GUARDAR")) {
            validacionInicialFactura(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_btnGuardarKeyReleased

    private void btnReImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReImprimirActionPerformed

//        instancias.getReporte().ver_Separe("SEPARE-" + txtCargar.getText(), txtObservaciones.getText(),
//                instancias.getInformacionEmpresaCompleto(), legal, "", instancias.getPie(), this.getTipo(), "",
//                !(Boolean) datos[71]);

    }//GEN-LAST:event_btnReImprimirActionPerformed

    private void txtObservacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObservacionesKeyReleased
        int cantidad = txtObservaciones.getText().length();
        cantidad = 300 - cantidad;

        lbCar.setText(String.valueOf(cantidad));

        if (cantidad <= 0) {
            txtObservaciones.setText(txtObservaciones.getText().substring(0, 300));
            lbCar.setText("0");
        }
    }//GEN-LAST:event_txtObservacionesKeyReleased

    private void lbTotalDescuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTotalDescuentoMouseClicked

    }//GEN-LAST:event_lbTotalDescuentoMouseClicked

    private void cmbRtfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRtfItemStateChanged
        cargarTotales();
    }//GEN-LAST:event_cmbRtfItemStateChanged

    private void cmbRtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRtfActionPerformed

    private void chkReteIvaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkReteIvaItemStateChanged
        cargarTotales();
    }//GEN-LAST:event_chkReteIvaItemStateChanged

    private void chkReteIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkReteIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkReteIvaActionPerformed

    private void lbTotalDescuento1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTotalDescuento1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbTotalDescuento1MouseClicked

    private void txtCantUnidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantUnidadesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantUnidadesMouseClicked

    private void lbTotalDescuento2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTotalDescuento2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbTotalDescuento2MouseClicked

    private void txtCantProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantProductosMouseClicked

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        String baseUtilizada = obtenerBase();
        String dato = "";

        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(tblProductos.getSelectedRow(), 32).toString(), baseUtilizada);

        String tipo = "", productoEn = "";
        if (nodo.getTipoProd() != null) {
            if (nodo.getTipoProd().equals("Variable") || nodo.getTipoProd().equals("Fijas")) {
                productoEn = "Desarrollo";
            }
        }

        if (evt.getClickCount() >= 1 && tblProductos.getSelectedColumn() == 3) {

            if (nodo.getTipoProducto() != null) {
                if (nodo.getTipoProducto().equals("IMEI")) {
                    tipo = "Imei";
                } else if (nodo.getTipoProducto().equals("Fecha/Lote")) {
                    tipo = "Fecha/Lote";
                } else if (nodo.getTipoProducto().equals("Color")) {
                    tipo = "Color";
                } else if (nodo.getTipoProducto().equals("Serial")) {
                    tipo = "Serial";
                } else if (nodo.getTipoProducto().equals("Talla")) {
                    tipo = "Talla";
                } else if (nodo.getTipoProducto().equals("ColorTalla")) {
                    tipo = "ColorTalla";
                } else if (nodo.getTipoProducto().equals("SerialColor")) {
                    tipo = "SerialColor";
                } else {
                    tipo = "";
                }
            }

            if (!productoEn.equals("")) {
                metodos.msgAdvertenciaAjustado(null, "La cantidad no se puede modificar");
                return;
            }

            if (!tipo.equals("")) {
                metodos.msgAdvertenciaAjustado(null, "La cantidad no se puede modificar");
                return;
            }

        } else if (tblProductos.getSelectedColumn() == 5) {
            double subtotal = big.getMonedaToDouble(tblProductos.getValueAt(tblProductos.getSelectedRow(), 2).toString()) * (big.getMonedaToDouble(tblProductos.getValueAt(tblProductos.getSelectedRow(), 3).toString()));

            dlgTipoDescuento descuentoProd = new dlgTipoDescuento(null, false, tblProductos.getValueAt(tblProductos.getSelectedRow(), 5).toString(),
                    tblProductos.getValueAt(tblProductos.getSelectedRow(), 6).toString(), tblProductos.getSelectedRow(),
                    tblProductos.getValueAt(tblProductos.getSelectedRow(), 31).toString(), big.getBigDecimal(subtotal), "notaDebito");
            descuentoProd.setVisible(true);
        }

        try {
            dato = tblProductos.getValueAt(tblProductos.getSelectedRow(), tblProductos.getSelectedColumn()).toString();
        } catch (Exception e) {
            Logs.error(e);
        }

        if (!dato.equals("")) {
            valorFila = dato;
        }

        if (tblProductos.getSelectedColumn() != 22) {
            calcularTabla(tblProductos.getSelectedRow(), false);
        }

        if (tblProductos.getSelectedColumn() == 22) {
            int fila = tblProductos.getSelectedRow();
            if (tblProductos.getValueAt(fila, 16).equals("REALIZADO")) {
                metodos.msgAdvertencia(null, "No puede Borrar este producto");
                return;
            }

            eliminarFila();
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void tblProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductosKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            popBorrarActionPerformed(null);
            return;
        }

        String baseUtilizada = obtenerBase();

        int fila = tblProductos.getSelectedRow(), i = 2, j = 0;

        try {
            if (tblProductos.getValueAt(fila, 16).equals("REALIZADO") && valorFila != null) {
                tblProductos.setValueAt(valorFila, fila, tblProductos.getSelectedColumn());
                valorFila = null;
                return;
            }
        } catch (Exception e) {
            Logs.error(e);
            return;
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB || evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN
                || evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_RIGHT) {

            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                fila = fila - 1;
            } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
                fila = fila + 1;
            }

            if (fila < 0) {
                fila = 0;
            }
            if (tblProductos.getRowCount() == fila) {
                fila = fila - 1;
            }

            if (instancias.isLector()) {
                if (tblProductos.getSelectedColumn() == 1) {
                    if (!(Boolean) datos[51]) {
                        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 32).toString(), baseUtilizada);
                        tblProductos.setValueAt(nodo.getDescripcion(), fila, 1);
                    }
                } else if (tblProductos.getSelectedColumn() == 2) {
                    if (!(Boolean) datos[61]) {
                        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 32).toString(), baseUtilizada);
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL1())), fila, 2);
                    }

                    if (tblProductos.getValueAt(fila, 2).toString().equalsIgnoreCase("")) {
                        tblProductos.setValueAt("0", fila, 3);
                    }
                } else if (tblProductos.getSelectedColumn() == 3) {
                    if (tblProductos.getValueAt(fila, 3).toString().equalsIgnoreCase("") || tblProductos.getValueAt(fila, 3).toString().equalsIgnoreCase("0")) {
                        //                        tblProductos.setValueAt("1", fila, 3);
                    }
                    i = 3;
                }

                if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN
                        || evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_RIGHT) {

                } else {
                    txtCodProducto.requestFocus();
                }

            } else {
                if (tblProductos.getSelectedColumn() == 0) {

                    try {
                        int r = tblProductos.getSelectedRow();
                        tblProductos.changeSelection(r, 0, false, false);
                        tblProductos.removeEditor();
                        tblInventario.removeEditor();

                        tblProductos.editCellAt(r, 3);
                        tblProductos.setColumnSelectionInterval(3, 3);
                        tblProductos.transferFocus();
                    } catch (Exception e) {
                        Logs.error(e);
                    }

                } else if (tblProductos.getSelectedColumn() == 1) {

                    ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 32).toString(), baseUtilizada);

                    if (!(Boolean) datos[51]) {
                        tblProductos.setValueAt(nodo.getDescripcion(), fila, 1);
                    }

                    tblProductos.editCellAt(fila, 3);
                    tblProductos.setColumnSelectionInterval(3, 3);
                    tblProductos.transferFocus();

                } else if (tblProductos.getSelectedColumn() == 2) {
                    if (tblProductos.getValueAt(fila, 32).equals("IMP01")) {
                        tblProductos.setValueAt(this.simbolo + " 0", fila, 2);
                    }

                    if (tblProductos.getValueAt(fila, 2).toString().equalsIgnoreCase("")) {
                        tblProductos.setValueAt("0", fila, 3);
                    }

                    if (!(Boolean) datos[51]) {
                        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 32).toString(), baseUtilizada);
                        tblProductos.setValueAt(nodo.getDescripcion(), fila, 1);
                    }

                    if (!(Boolean) datos[61]) {
                        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 32).toString(), baseUtilizada);

                        String lista = tblInventario.getValueAt(tblProductos.getSelectedRow(), 0).toString();
                        if (lista.equals("L1")) {
                            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL1())), tblProductos.getSelectedRow(), 2);
                        } else if (lista.equals("L2")) {
                            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL2())), tblProductos.getSelectedRow(), 2);
                        } else if (lista.equals("L3")) {
                            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL3())), tblProductos.getSelectedRow(), 2);
                        } else if (lista.equals("L4")) {
                            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL4())), tblProductos.getSelectedRow(), 2);
                        }
                    }

                    tblProductos.editCellAt(fila, 3);
                    tblProductos.setColumnSelectionInterval(3, 3);
                    tblProductos.transferFocus();
                } else if (tblProductos.getSelectedColumn() == 3) {

                    if (!(Boolean) datos[61]) {
                        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 32).toString(), baseUtilizada);

                        String lista = tblInventario.getValueAt(tblProductos.getSelectedRow(), 0).toString();
                        if (lista.equals("L1")) {
                            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL1())), tblProductos.getSelectedRow(), 2);
                        } else if (lista.equals("L2")) {
                            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL2())), tblProductos.getSelectedRow(), 2);
                        } else if (lista.equals("L3")) {
                            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL3())), tblProductos.getSelectedRow(), 2);
                        } else if (lista.equals("L4")) {
                            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL4())), tblProductos.getSelectedRow(), 2);
                        }
                    }

                    String cant = tblProductos.getValueAt(tblProductos.getSelectedRow(), 3).toString();
                    ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 32).toString(), baseUtilizada);

                    String tipo = "";
                    if (nodo.getTipoProducto() != null) {
                        if (nodo.getTipoProducto().equals("IMEI")) {
                            tipo = "Imei";
                        } else if (nodo.getTipoProducto().equals("Fecha/Lote")) {
                            tipo = "Fecha/Lote";
                        } else if (nodo.getTipoProducto().equals("Color")) {
                            tipo = "Color";
                        } else if (nodo.getTipoProducto().equals("Serial")) {
                            tipo = "Serial";
                        } else if (nodo.getTipoProducto().equals("Talla")) {
                            tipo = "Talla";
                        } else if (nodo.getTipoProducto().equals("ColorTalla")) {
                            tipo = "ColorTalla";
                        } else if (nodo.getTipoProducto().equals("SerialColor")) {
                            tipo = "SerialColor";
                        } else {
                            tipo = "";
                        }
                    }

                    if (!tipo.equals("")) {
                        tblProductos.setValueAt(cant, fila, 3);
                    }

                    if (tblProductos.getValueAt(fila, 3).toString().equalsIgnoreCase("") || tblProductos.getValueAt(fila, 3).toString().equalsIgnoreCase("0")) {
                        //                        tblProductos.setValueAt("1", fila, 3);
                    }

                    tblProductos.editCellAt(fila, 5);
                    tblProductos.setColumnSelectionInterval(5, 5);
                    tblProductos.transferFocus();
                    i = 3;
                } else if (tblProductos.getSelectedColumn() == 5) {
                    // Si se esta cambiando el campo de descuento

                    if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN
                            || evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_RIGHT) {

                    } else {
                        txtCodProducto.requestFocus();
                    }

                    i = 5;
                    j = 0;
                }
            }

            if (tblProductos.getSelectedColumn() == 17) {
                tblProductos.editCellAt(tblProductos.getSelectedRow(), 17);
                tblProductos.setColumnSelectionInterval(17, 17);
                try {
                    tblProductos.setValueAt(big.setMoneda(big.getMoneda(tblProductos.getValueAt(fila, 17).toString())), fila, 17);
                } catch (Exception e) {
                    Logs.error(e);
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal("0")), fila, 17);
                }
                tblProductos.transferFocus();

            }

            if (tblProductos.getSelectedColumn() == 19) {
                try {
                    tblProductos.setValueAt(big.setMoneda(big.getMoneda(tblProductos.getValueAt(fila, 19).toString())), fila, 19);
                    BigDecimal resta = big.getMoneda(tblProductos.getValueAt(fila, 9).toString()).subtract(big.getMoneda(tblProductos.getValueAt(fila, 19).toString()));
                    tblProductos.setValueAt(resta, fila, 20);

                    if (resta.compareTo(BigDecimal.ZERO) < 0) {
                        metodos.msgAdvertencia(this, "No tiene ninguna utilidad!");
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal("0")), fila, 19);
                    }

                } catch (Exception e) {
                    Logs.error(e);
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal("0")), fila, 19);
                }
                tblProductos.transferFocus();
            }

            BigDecimal porcentajeDescuento = big.getBigDecimal(tblProductos.getValueAt(fila, 5).toString().replace(",", "."));

            int res = porcentajeDescuento.compareTo(big.getBigDecimal("0"));
            if (res == -1 || String.valueOf(tblProductos.getValueAt(fila, i)).equals("")) {
                tblProductos.setValueAt(j, fila, 5);
            }

            if (tblProductos.getSelectedColumn() == 24) {
                tblProductos.editCellAt(fila, 25);
                tblProductos.setColumnSelectionInterval(25, 25);
                tblProductos.transferFocus();
            } else if (tblProductos.getSelectedColumn() == 25) {
                tblProductos.editCellAt(fila, 26);
                tblProductos.setColumnSelectionInterval(26, 26);
                tblProductos.transferFocus();
            } else if (tblProductos.getSelectedColumn() == 26) {
                txtCodProducto.transferFocus();
            }

            calcularTabla(fila, true);
        }

        try {
            BigDecimal num1 = big.getMoneda(tblInventario.getValueAt(fila, 1).toString());
            BigDecimal num2 = big.getBigDecimal(tblProductos.getValueAt(fila, 3).toString().replace(",", "."));
            BigDecimal total = num1.subtract(num2);
            tblInventario.setValueAt(big.setNumero(total), fila, 2);
        } catch (Exception e) {
            Logs.error(e);
        }
       
    }//GEN-LAST:event_tblProductosKeyReleased

    private void lbProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProductoMouseClicked

    }//GEN-LAST:event_lbProductoMouseClicked

    private void lbProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCodProducto.requestFocus();
        }
    }//GEN-LAST:event_lbProductoKeyReleased

    private void txtCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoActionPerformed

    }//GEN-LAST:event_txtCodProductoActionPerformed

    private void txtCodProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodProductoFocusGained
        cargarTotales();
    }//GEN-LAST:event_txtCodProductoFocusGained

    private void txtCodProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProductoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            popBorrarActionPerformed(null);
            return;
        }

        int fila = tblProductos.getSelectedRow(), i = 2, j = 0;

        try {
            if (tblProductos.getValueAt(fila, 16).equals("REALIZADO") && valorFila != null) {
                tblProductos.setValueAt(valorFila, fila, tblProductos.getSelectedColumn());
                valorFila = null;
                return;
            }
        } catch (Exception e) {
            Logs.error(e);
            return;
        }

        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                if (instancias.isLector()) {

                    if (tblProductos.getSelectedColumn() == 2) {
                        if (tblProductos.getValueAt(fila, 2).toString().equalsIgnoreCase("")) {
                            tblProductos.setValueAt("0", fila, 3);
                        }
                    } else if (tblProductos.getSelectedColumn() == 3) {
                        if (tblProductos.getValueAt(fila, 3).toString().equalsIgnoreCase("") || tblProductos.getValueAt(fila, 3).toString().equalsIgnoreCase("0")) {
                            tblProductos.setValueAt("1", fila, 3);
                        }
                        i = 3;
                    }

                    txtCodProducto.requestFocus();

                } else {
                    if (tblProductos.getSelectedColumn() == 0) {

                        try {
                            int r = tblProductos.getSelectedRow();
                            tblProductos.changeSelection(r, 0, false, false);
                            tblProductos.removeEditor();
                            tblInventario.removeEditor();

                            tblProductos.editCellAt(r, 3);
                            tblProductos.setColumnSelectionInterval(3, 3);
                            tblProductos.transferFocus();
                        } catch (Exception e) {
                            Logs.error(e);
                        }

                    } else if (tblProductos.getSelectedColumn() == 2) {
                        if (tblProductos.getValueAt(fila, 2).toString().equalsIgnoreCase("")) {
                            tblProductos.setValueAt("0", fila, 3);
                        }
                        tblProductos.editCellAt(tblProductos.getSelectedRow(), 3);
                        tblProductos.setColumnSelectionInterval(3, 3);
                        tblProductos.transferFocus();

                    } else if (tblProductos.getSelectedColumn() == 3) {
                        if (tblProductos.getValueAt(fila, 3).toString().equalsIgnoreCase("") || tblProductos.getValueAt(fila, 3).toString().equalsIgnoreCase("0")) {
                            //                            tblProductos.setValueAt("1", fila, 3);
                        }
                        tblProductos.editCellAt(tblProductos.getSelectedRow(), 5);
                        tblProductos.setColumnSelectionInterval(5, 5);
                        tblProductos.transferFocus();

                        i = 3;

                    } else if (tblProductos.getSelectedColumn() == 5) {
                        // Si se esta cambiando el campo de descuento
                        txtCodProducto.requestFocus();
                        i = 5;
                        j = 0;
                    }

                }

                if (tblProductos.getSelectedColumn() == 17) {

                    tblProductos.editCellAt(tblProductos.getSelectedRow(), 17);
                    tblProductos.setColumnSelectionInterval(17, 17);
                    try {
                        tblProductos.setValueAt(big.setMoneda(big.getMoneda(tblProductos.getValueAt(fila, 17).toString())), fila, 17);
                    } catch (Exception e) {
                        Logs.error(e);
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal("0")), fila, 17);
                    }
                    tblProductos.transferFocus();

                }

                if (tblProductos.getSelectedColumn() == 19) {
                    try {
                        tblProductos.setValueAt(big.setMoneda(big.getMoneda(tblProductos.getValueAt(fila, 19).toString())), fila, 19);
                        BigDecimal resta = big.getMoneda(tblProductos.getValueAt(fila, 9).toString()).subtract(big.getMoneda(tblProductos.getValueAt(fila, 19).toString()));
                        tblProductos.setValueAt(resta, fila, 20);

                        if (resta.compareTo(BigDecimal.ZERO) < 0) {
                            metodos.msgAdvertencia(this, "No tiene ninguna utilidad!");
                        }
                    } catch (Exception e) {
                        Logs.error(e);
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal("0")), fila, 19);
                    }
                    tblProductos.transferFocus();
                }

                int res = big.getBigDecimal(big.getMoneda(tblProductos.getValueAt(fila, i).toString().replace(".", ","))).compareTo(big.getBigDecimal("0"));
                if (res == -1 || String.valueOf(tblProductos.getValueAt(fila, i)).equals("")) {
                    tblProductos.setValueAt(j, tblProductos.getSelectedRow(), i);
                }

                calcularTabla(fila, true);
            }
        } catch (Exception e) {
            Logs.error(e);
            try {
                BigDecimal auxx = big.getBigDecimal(big.getMoneda(tblProductos.getValueAt(fila, 2).toString()));
                tblProductos.setValueAt(big.setMoneda(auxx), fila, 2);
            } catch (Exception ex) {
                Logs.error(ex);
                tblProductos.setValueAt(this.simbolo + " 0", fila, 2);
            }

            try {
                BigDecimal auxx = big.getBigDecimal(tblProductos.getValueAt(fila, 3).toString().replace(",", "."));
                tblProductos.setValueAt(auxx.toString().replace(".", ","), fila, 3);
            } catch (Exception ex) {
                Logs.error(ex);
                tblProductos.setValueAt(1, fila, 3);
            }

            tblProductos.setValueAt(this.simbolo + " 0", fila, 6);
            tblProductos.setValueAt("0", fila, 5);

            calcularTabla(fila, true);
        }

        BigDecimal num1 = big.getMoneda(tblInventario.getValueAt(fila, 1).toString());
        BigDecimal num2 = big.getBigDecimal(tblProductos.getValueAt(fila, 3).toString().replace(",", "."));
        BigDecimal total = num1.subtract(num2);
        tblInventario.setValueAt(big.setNumero(total), fila, 2);
    }//GEN-LAST:event_txtCodProductoKeyPressed

    private void txtCodProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String codigo = txtCodProducto.getText().replace("'", "//");
            plu = true;

            String cant = txtCant.getText();
            cargarProducto(codigo, cant, 1, "", "", "", true, "", "", "", "", "");
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            btnGuardar.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            double cantidad = 1;
            try {
                cantidad = Double.parseDouble(txtCodProducto.getText().replace("*", ""));
            } catch (Exception e) {
                Logs.error(e);
            }
            txtCant.setText(String.valueOf(cantidad));
            if (txtCant.getText().substring(txtCant.getText().length() - 1, txtCant.getText().length()).equals("0")) {
                txtCant.setText(txtCant.getText().substring(0, txtCant.getText().length() - 2));
            }
            txtCodProducto.setText("");
        }
    }//GEN-LAST:event_txtCodProductoKeyReleased

    private void btnBusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProdActionPerformed
        ventanaProductos("");
    }//GEN-LAST:event_btnBusProdActionPerformed

    private void tblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventarioMouseClicked

    }//GEN-LAST:event_tblInventarioMouseClicked

    private void lbProducto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbProducto1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbProducto1KeyReleased

    private void txtCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantActionPerformed

    private void txtCantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantFocusGained

    private void txtCantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantKeyPressed

    private void txtCantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantKeyReleased

    private void txtPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcentajeActionPerformed

    private void txtPorcentajeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

//            if (topeDescuento) {
//                if (Integer.parseInt(txtPorcentaje.getText()) > 20) {
//                    txtPorcentaje.setText("20");
//                }
//            }
            tblProductos.removeEditor();

            int xyz = tblProductos.getRowCount();

            if (xyz > 0) {
                for (int y = 0; y < xyz; y++) {
                    tblProductos.setValueAt("0", y, 5);
                    tblProductos.setValueAt(this.simbolo + " 0", y, 6);
                    calcularTabla(y, false);
                }
            }

            if (xyz > 0) {
                BigDecimal porcentaje = big.getBigDecimal(txtPorcentaje.getText());
                for (int y = 0; y < xyz; y++) {
                    tblProductos.setValueAt(porcentaje, y, 5);
                    tblProductos.setValueAt(big.setMoneda(porcentaje.multiply(big.getMoneda(tblProductos.getValueAt(y, 2).toString()).divide(big.getBigDecimal("100")))), y, 6);
                    calcularTabla(y, false);
                }
            }

            txtPorcentaje.setBackground(Color.WHITE);
            txtPorcentaje.setForeground(Color.BLACK);

            cargarTotales();
            txtPorcentaje.requestFocus();
        } else {
            txtPorcentaje.setBackground(new Color(251, 238, 152));
            txtPorcentaje.setForeground(new Color(146, 137, 77));
        }
    }//GEN-LAST:event_txtPorcentajeKeyReleased

    private void txtPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtPorcentajeKeyTyped

    private void lbBodegaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbBodegaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbBodegaKeyReleased

    private void txtBodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBodegaMouseClicked
        if (txtBodega.isEnabled()) {
            if (!txtBodega.getText().equals("")) {
                if (tblProductos.getRowCount() > 0) {
                    if (metodos.msgPregunta(null, "¿Limpiar nota debito?") != 0) {
                        txtCodProducto.requestFocus();
                        return;
                    } else {
                        while (tblProductos.getRowCount() > 0) {
                            modeloPro.removeRow(0);
                        }
                        while (tblInventario.getRowCount() > 0) {
                            modeloInventario.removeRow(0);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_txtBodegaMouseClicked

    private void txtBodegaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBodegaMouseEntered

    }//GEN-LAST:event_txtBodegaMouseEntered

    private void txtBodegaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBodegaMousePressed
        if (txtBodega.isEnabled()) {
            if (!txtBodega.getText().equals("")) {
                if (tblProductos.getRowCount() > 0) {
                    if (metodos.msgPregunta(null, "¿Limpiar nota debito?") != 0) {
                        txtCodProducto.requestFocus();
                        return;
                    } else {
                        while (tblProductos.getRowCount() > 0) {
                            modeloPro.removeRow(0);
                        }
                        while (tblInventario.getRowCount() > 0) {
                            modeloInventario.removeRow(0);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_txtBodegaMousePressed

    private void txtBodegaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBodegaMouseReleased
        if (txtBodega.isEnabled()) {
            if (!txtBodega.getText().equals("")) {
                if (tblProductos.getRowCount() > 0) {
                    if (metodos.msgPregunta(null, "¿Limpiar nota debito?") != 0) {
                        txtCodProducto.requestFocus();
                        return;
                    } else {
                        while (tblProductos.getRowCount() > 0) {
                            modeloPro.removeRow(0);
                        }
                        while (tblInventario.getRowCount() > 0) {
                            modeloInventario.removeRow(0);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_txtBodegaMouseReleased

    private void txtBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodegaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodegaActionPerformed

    private void txtBodegaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBodegaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodegaFocusGained

    private void txtBodegaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBodegaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodegaKeyPressed

    private void txtBodegaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBodegaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtBodega.getText().equals("")) {
                ventanaBodegas("");
            } else {
                txtCodProducto.requestFocus();
            }
        } else {
            txtBodega.setText("");
            if (tblProductos.getRowCount() > 0) {
                while (tblProductos.getRowCount() > 0) {
                    modeloPro.removeRow(0);
                }
                while (tblInventario.getRowCount() > 0) {
                    modeloInventario.removeRow(0);
                }
            }
        }
    }//GEN-LAST:event_txtBodegaKeyReleased

    private void tblComprobantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseClicked
        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
            tblComprobantes.setValueAt(false, i, 2);
        }

        if (tblComprobantes.getSelectedRow() == -1) {
            tblComprobantes.setValueAt(true, 0, 2);
            if (tblComprobantes.getSelectedRow() == 0) {
                cmbTipoOperacion.setVisible(true);
                lbTipoOperacion.setVisible(true);
                txtRelacion.setVisible(true);
                txtFactRelacion.setVisible(true);
                lbRelacion.setVisible(true);
                lbRelacion1.setVisible(true);
            } else {
                cmbTipoOperacion.setVisible(false);
                lbTipoOperacion.setVisible(false);
                txtRelacion.setVisible(false);
                txtFactRelacion.setVisible(false);
                lbRelacion.setVisible(false);
                lbRelacion1.setVisible(false);
            }
        } else {
            tblComprobantes.setValueAt(true, tblComprobantes.getSelectedRow(), 2);
            if (tblComprobantes.getSelectedRow() == 0) {
                cmbTipoOperacion.setVisible(true);
                lbTipoOperacion.setVisible(true);
                txtRelacion.setVisible(true);
                txtFactRelacion.setVisible(true);
                lbRelacion.setVisible(true);
                lbRelacion1.setVisible(true);
            } else {
                cmbTipoOperacion.setVisible(false);
                lbTipoOperacion.setVisible(false);
                txtRelacion.setVisible(false);
                txtFactRelacion.setVisible(false);
                lbRelacion.setVisible(false);
                lbRelacion1.setVisible(false);
            }
        }
    }//GEN-LAST:event_tblComprobantesMouseClicked

    private void tblComprobantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseEntered

    }//GEN-LAST:event_tblComprobantesMouseEntered

    private void tblComprobantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseExited
        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
            tblComprobantes.setValueAt(false, i, 2);
        }

        if (tblComprobantes.getSelectedRow() == -1) {
            tblComprobantes.setValueAt(true, 0, 2);
            if (tblComprobantes.getSelectedRow() == 0) {
                cmbTipoOperacion.setVisible(true);
                lbTipoOperacion.setVisible(true);
                txtRelacion.setVisible(true);
                txtFactRelacion.setVisible(true);
                lbRelacion.setVisible(true);
                lbRelacion1.setVisible(true);
            } else {
                cmbTipoOperacion.setVisible(false);
                lbTipoOperacion.setVisible(false);
                txtRelacion.setVisible(false);
                txtFactRelacion.setVisible(false);
                lbRelacion.setVisible(false);
                lbRelacion1.setVisible(false);
            }
        } else {
            tblComprobantes.setValueAt(true, tblComprobantes.getSelectedRow(), 2);
            if (tblComprobantes.getSelectedRow() == 0) {
                cmbTipoOperacion.setVisible(true);
                lbTipoOperacion.setVisible(true);
                txtRelacion.setVisible(true);
                txtFactRelacion.setVisible(true);
                lbRelacion.setVisible(true);
                lbRelacion1.setVisible(true);
            } else {
                cmbTipoOperacion.setVisible(false);
                lbTipoOperacion.setVisible(false);
                txtRelacion.setVisible(false);
                txtFactRelacion.setVisible(false);
                lbRelacion.setVisible(false);
                lbRelacion1.setVisible(false);
            }
        }
    }//GEN-LAST:event_tblComprobantesMouseExited

    private void txtRelacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRelacionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String factura = instancias.getSql().getFacturaNotaCredito("NC-" + txtRelacion.getText());
            if (factura.equals("")) {
                metodos.msgAdvertenciaAjustado(this, "La nota credito no existe");
            } else {
                txtFactRelacion.setText(factura.replace("FACT-", ""));
            }
        } else {
            txtFactRelacion.setText("");
        }
    }//GEN-LAST:event_txtRelacionKeyReleased

    private void txtRelacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRelacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelacionKeyTyped

    private void txtFactRelacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFactRelacionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFactRelacionKeyReleased

    private void txtFactRelacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFactRelacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFactRelacionKeyTyped

    private void txtPorcentajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPorcentajeMouseClicked
        if (instancias.getConfiguraciones().isFacturaElectronica()) {
            String descSeleccionado = "Sin-Permiso";
            try {
                descSeleccionado = tblProductos.getValueAt(0, 31).toString();
            } catch (Exception e) {
                Logs.error(e);
            }

            dlgTipoDescuento descuentoProd = new dlgTipoDescuento(null, false, txtPorcentaje.getText(), this.simbolo + " 0",
                    10000, descSeleccionado, BigDecimal.ZERO, "notaDebito");
            descuentoProd.setVisible(true);
        }
    }//GEN-LAST:event_txtPorcentajeMouseClicked

    
    private void calcularTabla(int fila, boolean mostrarAlerta) {

        String baseUtilizada = obtenerBase();
        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 32).toString(), baseUtilizada);

        double impoconsumo = 0;
        double iva = 0;
        double totalImpoconsumo = 0;
        double totalIva = 0;
        double subtotalGeneral = 0;
        double valor = 0;
        double cantidad = 0;
        double descuento = 0;
        double subtotal = 0;
        double total = 0;
        double porcentaje2 =0;
        double compra = 0;
        double utilidadMax = 0;
        double utilidadMin = 0;
        double copago = 0;
        double valorDescuento = 0;
        boolean entro = false;

        try {
            valorDescuento = big.getMonedaToDouble(tblProductos.getValueAt(fila, 6).toString());
        } catch (Exception e) {} 

        tblProductos.setValueAt(big.setMonedaExacta(valorDescuento), fila, 6);

        try {
            valor = big.getMonedaToDouble(String.valueOf(tblProductos.getValueAt(fila, 2)));

            if (!(Boolean) datos[61]) {
                String lista = tblInventario.getValueAt(fila, 0).toString();
                if (lista.equals("L1")) {
                    if (big.formatDouble(nodo.getL1()) != 0) {
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL1())), fila, 2);
                    }
                } else if (lista.equals("L2")) {
                    if (big.formatDouble(nodo.getL2()) != 0) {
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL2())), fila, 2);
                    }
                } else if (lista.equals("L3")) {
                    if (big.formatDouble(nodo.getL3()) != 0) {
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL3())), fila, 2);
                    }
                } else if (lista.equals("L4")) {
                    if (big.formatDouble(nodo.getL4()) != 0) {
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL4())), fila, 2);
                    }
                }
            }

            tblProductos.setValueAt(big.setMoneda(valor), fila, 2);
        } catch (Exception e) {
            Logs.error(e);
            String lista = tblInventario.getValueAt(fila, 0).toString();
            if (lista.equals("L1")) {
                if (big.formatDouble(nodo.getL1()) != 0) {
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL1())), fila, 2);
                }
            } else if (lista.equals("L2")) {
                if (big.formatDouble(nodo.getL2()) != 0) {
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL2())), fila, 2);
                }
            } else if (lista.equals("L3")) {
                if (big.formatDouble(nodo.getL3()) != 0) {
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL3())), fila, 2);
                }
            } else if (lista.equals("L4")) {
                if (big.formatDouble(nodo.getL4()) != 0) {
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL4())), fila, 2);
                }
            }
        }

        try {
            cantidad = big.getMonedaToDouble(tblProductos.getValueAt(fila, 3).toString());
        } catch (Exception e) {}

        String tipo = "", productoEn = "";
        try {
            if (nodo.getTipoProd().equals("Variable") || nodo.getTipoProd().equals("Fijas")) {
                productoEn = "Desarrollo";
            }
        } catch (Exception e) {
            Logs.error(e);
        }

        if (nodo.getTipoProducto() != null) {
            if (nodo.getTipoProducto().equals("IMEI")) {
                tipo = "Imei";
            } else if (nodo.getTipoProducto().equals("Fecha/Lote")) {
                tipo = "Fecha/Lote";
            } else if (nodo.getTipoProducto().equals("Color")) {
                tipo = "Color";
            } else if (nodo.getTipoProducto().equals("Serial")) {
                tipo = "Serial";
            } else if (nodo.getTipoProducto().equals("Talla")) {
                tipo = "Talla";
            } else if (nodo.getTipoProducto().equals("ColorTalla")) {
                tipo = "ColorTalla";
            } else if (nodo.getTipoProducto().equals("SerialColor")) {
                tipo = "SerialColor";
            } else {
                tipo = "";
            }
        }

       
        if (!productoEn.equals("")) {
            cantidad = 1;
        }

        subtotal = big.formatDouble(valor * cantidad);
        copago = big.getMonedaToDouble(String.valueOf(tblProductos.getValueAt(fila, 17)));
        iva = big.formatDouble(tblProductos.getValueAt(fila, 7).toString());
        impoconsumo = big.formatDouble(tblProductos.getValueAt(fila, 23).toString());
        if (tblProductos.getSelectedColumn() == 8) {
            //valor impoconsumo
            totalImpoconsumo = big.getMonedaToDouble(tblProductos.getValueAt(fila, 8).toString());
        }    
        
        double porcImpoconsumo = 0;

        if (instancias.isPvpConIva() || instancias.isPvpConImpoconsumo()) {
            double subIva = 0, subImpo = 0;
            if (instancias.isPvpConIva() && instancias.isPvpConImpoconsumo()) {
                   //SE SUMAN LOS IMPUESTOS
                   double totalImpuestos = iva + impoconsumo;
                   
                   if(totalImpuestos> 0){
                        totalImpuestos = (totalImpuestos/100)+1;

                        //SE CALCULA EL SUBTOTAL SUMANDO TODOS LOS IMPUESTOS
                        subtotal = big.formatDouble(subtotal / totalImpuestos);
                   }
                   
                   //se calcula el descuento
                   if (tblProductos.getValueAt(fila, 6).toString().equals("") || tblProductos.getValueAt(fila, 5).toString().equals("")) {
                       porcentaje2 = 0;
                       descuento = 0;
                   } else {
                       double[] datos = calcularDescuento(fila, subtotal, mostrarAlerta);
                       descuento =  datos[0];
                       porcentaje2 =  datos[1];
                   }  
                   subtotal = big.formatDouble(subtotal - descuento);

                   totalIva = big.formatDouble(subtotal * (iva/ 100));
                   totalImpoconsumo = big.formatDouble(subtotal * (impoconsumo/100));
                   
            } else if (instancias.isPvpConIva()) {
                //OBTENEMOS EL PORCENTAJE DEL IVA
                 if(iva >0){         
                    subIva = big.formatDouble(subtotal/((iva / 100) +1));
                    totalIva = subtotal - subIva;
                 }
                 subtotal = big.formatDouble(subtotal - totalIva);
                
                //se calcula el descuento
                if (tblProductos.getValueAt(fila, 6).toString().equals("") || tblProductos.getValueAt(fila, 5).toString().equals("")) {
                    porcentaje2 = 0;
                    descuento = 0;
                } else {
                    double[] datos = calcularDescuento(fila, subtotal, mostrarAlerta);
                    descuento =  datos[0];
                    porcentaje2 =  datos[1];
                }
                subtotal = big.formatDouble(subtotal - descuento);
                
                //SE CALCULA EL IMPOCONSUMO
                if(impoconsumo >0){
                    totalImpoconsumo = big.formatDouble(subtotal * (impoconsumo / 100));
                }
                
                //SE RECALCULA EL IVA         
                if(iva > 0){
                    totalIva = big.formatDouble(subtotal * (iva / 100));
                }
            } else if (instancias.isPvpConImpoconsumo()) {
                if(impoconsumo >0){
                    subImpo = big.formatDouble(subtotal/((impoconsumo / 100) +1));
                }
                
                totalImpoconsumo = subtotal - subImpo;
                subtotal = big.formatDouble(subtotal - totalImpoconsumo);
                
                 //se calcula el descuento
                if (tblProductos.getValueAt(fila, 6).toString().equals("") || tblProductos.getValueAt(fila, 5).toString().equals("")) {
                    porcentaje2 = 0;
                    descuento = 0;
                } else {
                    double[] datos = calcularDescuento(fila, subtotal, mostrarAlerta);
                    descuento =  datos[0];
                    porcentaje2 =  datos[1];
                }
                subtotal = big.formatDouble(subtotal - descuento);
                
                //OBTENEMOS EL PORCENTAJE DEL IVA          
                if(iva > 0){
                    totalIva = big.formatDouble(subtotal * (iva / 100));
                }
                
                //SE RECALCULA EL IMPOCONSUMO
                if(impoconsumo >0){
                    totalImpoconsumo = big.formatDouble(subtotal * (impoconsumo / 100));
                }
            }
        }else{

           
            if (tblProductos.getValueAt(fila, 6).toString().equals("") || tblProductos.getValueAt(fila, 5).toString().equals("")) {
                porcentaje2 = 0;
                descuento = 0;
            } else {
                double[] datos = calcularDescuento(fila, subtotal, mostrarAlerta);
                descuento =  datos[0];
                porcentaje2 =  datos[1];
            }   
            
            subtotal = big.formatDouble(subtotal - descuento);
            
            //OBTENEMOS EL PORCENTAJE DEL IVA
            if(iva > 0){
                iva = (iva / 100) +1;
                totalIva = big.formatDouble(subtotal * iva);
                totalIva = big.formatDouble(totalIva - subtotal);
            }
            
            if(impoconsumo > 0){
                 impoconsumo = (impoconsumo / 100) + 1;
                 totalImpoconsumo = big.formatDouble(subtotal*impoconsumo);
                 totalImpoconsumo = big.formatDouble(totalImpoconsumo - subtotal);
            }    
                   
        }

        total = big.formatDouble(subtotal + totalIva + totalImpoconsumo);


        if (tblProductos.getSelectedColumn() == 8) {
            tblProductos.setValueAt(porcImpoconsumo, fila, 23);
        }

        tblProductos.setValueAt(big.setMoneda(subtotal), fila, 4);
        tblProductos.setValueAt(big.setMoneda(totalIva), fila, 33);
        tblProductos.setValueAt(big.setMoneda(totalImpoconsumo), fila, 8);
        tblProductos.setValueAt(big.setMoneda(total), fila, 9);

        tblProductos.setValueAt(big.setNumero(porcentaje2), fila, 5);
        tblProductos.setValueAt(big.setMonedaExacta(descuento), fila, 6);
        tblProductos.setValueAt(big.setMoneda(copago), fila, 17);

        switch (tblProductos.getValueAt(fila, 12).toString()) {
            case "1":
                tblProductos.setValueAt(cantidad, fila, 13);
                break;
            case "2":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad2()), fila, 13);
                break;
            case "3":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad3()), fila, 13);
                break;
            case "4":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad4()), fila, 13);
                break;
            case "5":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad5()), fila, 13);
                break;
            case "6":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad6()), fila, 13);
                break;
            case "7":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad7()), fila, 13);
                break;
            case "8":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad8()), fila, 13);
                break;
        }

        tblProductos.setValueAt(big.setNumero(cantidad), fila, 3);

        double costo = 0;
        try {
            costo = big.formatDouble(instancias.getSql().getUltimoPonderado(nodo.getIdSistema())[4].toString());
        } catch (Exception e) {
            Logs.error(e);
            costo = 0;
        }

        double utilidad, valorUnidad;

        valorUnidad = big.getMonedaToDouble(tblProductos.getValueAt(fila, 4).toString()) / big.formatDouble(tblProductos.getValueAt(fila, 13).toString());

        utilidad = valorUnidad - costo;
        utilidad = utilidad*(big.formatDouble(tblProductos.getValueAt(fila, 3).toString().replace(",", ".")));
        tblProductos.setValueAt(big.setMoneda(utilidad), fila, 14);

        if (nodo.getIva().equals("0") || nodo.getIva().equals(".00")) {
            compra = (costo * (big.formatDouble(nodo.getIvaC()) / 100)) + costo;
        } else {
            compra = costo;
        }

        utilidadMin = (compra * (big.formatDouble(nodo.getMinima()) / 100)) + compra;
        utilidadMax = (compra * (big.formatDouble(nodo.getMaxima()) / 100)) + compra;

        if (utilidadMin == -1) {
            tblProductos.setValueAt("ERROR1", fila, 15);
        } else if (utilidadMax == 1) {
            tblProductos.setValueAt("ERROR2", fila, 15);
        } else {
            tblProductos.setValueAt("OK", fila, 15);
        }

        cargarTotales();
    }
    
    private void calcularTabla2(int fila, boolean mostrarAlerta) {

        String baseUtilizada = obtenerBase();
        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 32).toString(), baseUtilizada);

        double impoconsumo = 0;
        double iva = 0;
        double totalImpoconsumo =  0; 
        double totalIva = 0;
        double subtotalGeneral = 0;
        double valor = 0;
        double cantidad = 0;
        double descuento = 0;
        double subtotal = 0;
        double total = 0 ;
        double porcentaje2 = 0;
        double compra = 0;
        double utilidadMax = 0;
        double utilidadMin = 0;
        double copago = 0;
        double valorDescuento = 0;
        Boolean entro = false;

        try {
            valorDescuento = big.getMonedaToDouble(tblProductos.getValueAt(fila, 6).toString());
        } catch (Exception e) {
            Logs.error(e);
            valorDescuento = 0;
        }

        tblProductos.setValueAt(big.setMonedaExacta(valorDescuento), fila, 6);

        try {
            valor = big.getMonedaToDouble(tblProductos.getValueAt(fila, 2).toString());

            if (!(Boolean) datos[61]) {
                String lista = tblInventario.getValueAt(fila, 0).toString();
                if (lista.equals("L1")) {
                    if (big.formatDouble(nodo.getL1()) != 0) {
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL1())), fila, 2);
                    }
                } else if (lista.equals("L2")) {
                    if (big.formatDouble(nodo.getL2()) != 0) {
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL2())), fila, 2);
                    }
                } else if (lista.equals("L3")) {
                    if (big.formatDouble(nodo.getL3()) != 0) {
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL3())), fila, 2);
                    }
                } else if (lista.equals("L4")) {
                    if (big.formatDouble(nodo.getL4()) != 0) {
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL4())), fila, 2);
                    }
                }
            }

            tblProductos.setValueAt(big.setMoneda(valor), fila, 2);
        } catch (Exception e) {
            Logs.error(e);
            String lista = tblInventario.getValueAt(fila, 0).toString();
            if (lista.equals("L1")) {
                if (big.formatDouble(nodo.getL1()) != 0) {
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL1())), fila, 2);
                }
            } else if (lista.equals("L2")) {
                if (big.formatDouble(nodo.getL2()) != 0) {
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL2())), fila, 2);
                }
            } else if (lista.equals("L3")) {
                if (big.formatDouble(nodo.getL3()) != 0) {
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL3())), fila, 2);
                }
            } else if (lista.equals("L4")) {
                if (big.formatDouble(nodo.getL4()) != 0) {
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL4())), fila, 2);
                }
            }
        }

        try {
            cantidad = big.getMonedaToDouble(tblProductos.getValueAt(fila, 3).toString());
        } catch (Exception e) {
            cantidad = 1;
        }

        String tipo = "", productoEn = "";
        try {
            if (nodo.getTipoProd().equals("Variable") || nodo.getTipoProd().equals("Fijas")) {
                productoEn = "Desarrollo";
            }
        } catch (Exception e) {
        }

        if (nodo.getTipoProducto() != null) {
            if (nodo.getTipoProducto().equals("IMEI")) {
                tipo = "Imei";
            } else if (nodo.getTipoProducto().equals("Fecha/Lote")) {
                tipo = "Fecha/Lote";
            } else if (nodo.getTipoProducto().equals("Color")) {
                tipo = "Color";
            } else if (nodo.getTipoProducto().equals("Serial")) {
                tipo = "Serial";
            } else if (nodo.getTipoProducto().equals("Talla")) {
                tipo = "Talla";
            } else if (nodo.getTipoProducto().equals("ColorTalla")) {
                tipo = "ColorTalla";
            } else if (nodo.getTipoProducto().equals("SerialColor")) {
                tipo = "SerialColor";
            } else {
                tipo = "";
            }
        }

        if (!productoEn.equals("")) {
            cantidad = 1;
        }

        subtotal = big.formatDouble(valor * cantidad);
        copago = big.getMonedaToDouble(tblProductos.getValueAt(fila, 17).toString());

        if (tblProductos.getValueAt(fila, 6).toString().equals("") || tblProductos.getValueAt(fila, 5).toString().equals("")) {
            porcentaje2 = 0;
            descuento = 0;
        } else {
            double[] datos = calcularDescuento(fila, subtotal, mostrarAlerta);
            descuento = datos[0];
            porcentaje2 = datos[1];
        }

        //OBTENEMOS EL PORCENTAJE DEL IVA DE LA TABLA
        iva = big.getMonedaToDouble(tblProductos.getValueAt(fila, 7).toString());
        iva = (iva / 100) + 1;

        //OBTENEMOS EL PORCENTAJE DEL IMPOCONSUMO DE LA TABLA
        if (tblProductos.getSelectedColumn() == 8) {
            impoconsumo = big.getMonedaToDouble(tblProductos.getValueAt(fila, 8).toString());
        } else {
            impoconsumo = big.getMonedaToDouble(tblProductos.getValueAt(fila, 23).toString());
            impoconsumo = (impoconsumo/ 100) + 1;
        }

        subtotal = subtotal- descuento;
        subtotalGeneral = subtotal;
        
        double porcImpoconsumo = 0;

        if (instancias.isPvpConIva() || instancias.isPvpConImpoconsumo()) {
            double subIva = 0, subImpo = 0;
            if (instancias.isPvpConIva() && instancias.isPvpConImpoconsumo()) {
                //CALCULAMOS EL IVA
                iva = big.formatDouble(tblProductos.getValueAt(fila, 7).toString());
                impoconsumo = big.formatDouble(tblProductos.getValueAt(fila, 23).toString());
                
                 
                //SE SUMAN LOS IMPUESTOS
                double totalImpuestos = iva + impoconsumo;
                totalImpuestos = (totalImpuestos/100)+1;

                //SE CALCULA EL SUBTOTAL SUMANDO TODOS LOS IMPUESTOS
                subtotal = big.formatDouble(subtotal / totalImpuestos);

                totalIva = big.formatDouble(subtotal * (iva/ 100));

                if (tblProductos.getSelectedColumn() == 8) {
                    //CALCULAMOS EL IMPOCONSUMO
                    totalImpoconsumo = impoconsumo;
                    if (subtotalGeneral == 0) {
                        subtotalGeneral = 1;
                    }
                    porcImpoconsumo = big.formatDouble((100 * impoconsumo) / subtotalGeneral);
                } else {
                    //CALCULAMOS EL IMPOCONSUMO
                    totalImpoconsumo = big.formatDouble(subtotal * (impoconsumo/100)); 
                }
            } else if (instancias.isPvpConIva()) {
                subIva = big.formatDouble(subtotal/iva);
                totalIva = subtotal - subIva;
                subtotal = subtotal - totalIva;
            } else if (instancias.isPvpConImpoconsumo()) {
                 if (tblProductos.getSelectedColumn() == 8) {
                    totalImpoconsumo = impoconsumo;
                    subtotal = subtotal - totalImpoconsumo;
                    if (subtotalGeneral == 0) {
                        subtotalGeneral =1;
                    }
                    porcImpoconsumo = big.formatDouble((100 * impoconsumo) / subtotalGeneral);
                } else {
                    subImpo = big.formatDouble(subtotal/impoconsumo);
                    totalImpoconsumo = subtotal - subImpo;
                    subtotal = subtotal - totalImpoconsumo;
                }
            }
        }

        if (!instancias.isPvpConIva()) {
            iva = big.formatDouble(tblProductos.getValueAt(fila, 7).toString());
            iva = (iva/100) + 1;
            totalIva = big.formatDouble(subtotalGeneral * iva);
            totalIva = big.formatDouble(totalIva - subtotalGeneral);
        }

        if (!instancias.isPvpConImpoconsumo()) {
             if (tblProductos.getSelectedColumn() == 8) {
                totalImpoconsumo = impoconsumo;
                if (subtotalGeneral == 0) {
                    subtotalGeneral = 1;
                }
                porcImpoconsumo = big.formatDouble((100 * impoconsumo) / subtotalGeneral);
            } else {
                impoconsumo = big.formatDouble(tblProductos.getValueAt(fila, 23).toString());
                impoconsumo = (impoconsumo / 100) + 1;
                totalImpoconsumo = big.formatDouble(subtotalGeneral*impoconsumo);
                totalImpoconsumo = big.formatDouble(totalImpoconsumo - subtotalGeneral);
            }
        }

        total = big.formatDouble(subtotal + totalIva + totalImpoconsumo);

        if (tblProductos.getSelectedColumn() == 8) {
            tblProductos.setValueAt(porcImpoconsumo, fila, 23);
        }

        tblProductos.setValueAt(big.setMoneda(subtotal), fila, 4);
        tblProductos.setValueAt(big.setMoneda(totalIva), fila, 33);
        tblProductos.setValueAt(big.setMoneda(totalImpoconsumo), fila, 8);
        tblProductos.setValueAt(big.setMoneda(total), fila, 9);

        tblProductos.setValueAt(porcentaje2, fila, 5);
        tblProductos.setValueAt(big.setMonedaExacta(descuento), fila, 6);
        tblProductos.setValueAt(big.setMoneda(copago), fila, 17);

        switch (tblProductos.getValueAt(fila, 12).toString()) {
            case "1":
                tblProductos.setValueAt(cantidad, fila, 13);
                break;
            case "2":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad2()), fila, 13);
                break;
            case "3":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad3()), fila, 13);
                break;
            case "4":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad4()), fila, 13);
                break;
            case "5":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad5()), fila, 13);
                break;
            case "6":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad6()), fila, 13);
                break;
            case "7":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad7()), fila, 13);
                break;
            case "8":
                tblProductos.setValueAt(cantidad * big.formatDouble(nodo.getCantidad8()), fila, 13);
                break;
        }
        
        tblProductos.setValueAt(cantidad, fila, 3);

        double costo = 0;
        try {
            costo = big.formatDouble(instancias.getSql().getUltimoPonderado(nodo.getIdSistema())[4].toString());
        } catch (Exception e) {
            Logs.error(e);
            costo = big.getMonedaToDouble(instancias.getSql().getUltimoPonderado(nodo.getIdSistema())[4].toString());
        }
        
        double utilidad, valorUnidad;
        
        valorUnidad = big.getMonedaToDouble(tblProductos.getValueAt(fila, 4).toString()) / big.formatDouble(tblProductos.getValueAt(fila, 13).toString());

        utilidad = valorUnidad - costo;
        utilidad = utilidad*(big.formatDouble(tblProductos.getValueAt(fila, 3).toString().replace(",", ".")));
        tblProductos.setValueAt(big.setMoneda(utilidad), fila, 14);


        if (nodo.getIva().equals("0") || nodo.getIva().equals(".00")) {
            compra = (costo * (big.formatDouble(nodo.getIvaC()) / 100)) + costo;
        } else {
            compra = costo;
        }

        utilidadMin = (compra * (big.formatDouble(nodo.getMinima()) / 100)) + compra;
        utilidadMax = (compra * (big.formatDouble(nodo.getMaxima()) / 100)) + compra;

        
        if (utilidadMin == -1) {
            tblProductos.setValueAt("ERROR1", fila, 15);
        } else if (utilidadMax == 1) {
            tblProductos.setValueAt("ERROR2", fila, 15);
        } else {
            tblProductos.setValueAt("OK", fila, 15);
        }

        cargarTotales();
    }
    

    public void cargarTotales() {
        int i;
        BigDecimal subtotal = BigDecimal.ZERO, iva = BigDecimal.ZERO, impoconsumo = BigDecimal.ZERO, total = BigDecimal.ZERO, descuentos = BigDecimal.ZERO,
                rtf = BigDecimal.ZERO, rti = BigDecimal.ZERO, copago = BigDecimal.ZERO, cantUnidades = BigDecimal.ZERO, impuesto = BigDecimal.ZERO;

        BigDecimal valorBolsa;
        valorBolsa = big.getMoneda(datos[53].toString());

        for (i = 0; i < tblProductos.getRowCount(); i++) {
            if (!tblProductos.getValueAt(i, 16).equals("REALIZADO")) {

                if (tblProductos.getValueAt(i, 32).equals("PROD-000000032")) {
                    impuesto = valorBolsa.multiply(big.getBigDecimal(tblProductos.getValueAt(i, 3)));
                }

                subtotal = subtotal.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 4))));
                descuentos = descuentos.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 6))));

                impoconsumo = impoconsumo.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 8))));
                iva = iva.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 33))));

                total = total.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 9))));
                copago = copago.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 17))));
            }
            cantUnidades = cantUnidades.add(big.getBigDecimal(tblProductos.getValueAt(i, 3).toString().replace(",", ".")));
        }

        if (cmbRtf.getSelectedIndex() > 0) {
            rtf = ((subtotal.subtract(descuentos))).multiply(big.getBigDecimal(cmbRtf.getSelectedItem())).divide(big.getBigDecimal("100"), 3, RoundingMode.CEILING);
        }

//        if (descGeneral.compareTo(BigDecimal.ZERO) > 0) {
//            subtotal = subtotal.subtract(descGeneral);
//            iva = subtotal.multiply(big.getBigDecimal("1.19")).subtract(subtotal);
//        }
        if (chkReteIva.isSelected()) {
            rti = iva.multiply(big.getBigDecimal("15")).divide(big.getBigDecimal("100"), 3, RoundingMode.CEILING);
        }

        txtSubTotal.setText(big.setMoneda(subtotal));
        txtTotalDescuentos.setText(big.setMoneda(descuentos));
        txtTotalIva.setText(big.setMoneda(iva));
        txtTotalImpoconsumo.setText(big.setMoneda(impoconsumo));

        txtImpuesto.setText(big.setMoneda(impuesto));

        txtTotal.setText("Total: " + big.setMoneda(total.add(impuesto).subtract(rtf).subtract(rti)));

        txtRtf.setText(big.setMonedaExacta(rtf));
        txtRiva.setText(big.setMonedaExacta(rti));

        txtCantProductos.setText(Integer.toString(tblProductos.getRowCount()));
        txtCantUnidades.setText(cantUnidades.toString());
    }

    private void calcularDiasPlazo(java.awt.event.KeyEvent evt) {
        if (txtNombre.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Debe ingresar un cliente");
            txtDiasPlazo.setText("0");
            txtNit.requestFocus();
        }

        if (txtNit.getText().equals("1010")) {
            txtNit.requestFocus();
            txtDiasPlazo.setText("0");
            return;
        }

        try {
            txtVencimiento.setText(metodos.sumarFecha(txtFechaFactura.getText(), Integer.parseInt(txtDiasPlazo.getText())));
        } catch (NumberFormatException exep) {
            txtVencimiento.setText(metodos.sumarFecha(txtFechaFactura.getText(), 0));
        }

        if (evt != null) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                txtCodProducto.requestFocus();
            }
        }
    }

    public void ventanaBodegas(String nit) {
        buscBodegas buscar = new buscBodegas(instancias.getMenu(), true, "INTERNA");
        buscar.setLocationRelativeTo(null);
        instancias.setBuscBodegas(buscar);
        instancias.setCampoActual(txtBodega);
        txtBodega.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void consultarMaestros() {
        datos = instancias.getSql().getDatosMaestra();
    }

    public void ventanaProductos(String codigo) {
        String base = txtBodega.getText();
        if (base.equals("123-22")) {
            base = "productos1";
        } else if (base.equals("BODEGA-1")) {
            base = "productos1bodega1";
        } else if (base.equals("BODEGA-2")) {
            base = "productos1bodega2";
        } else if (base.equals("BODEGA-3")) {
            base = "productos1bodega3";
        } else if (base.equals("BODEGA-4")) {
            base = "productos1bodega4";
        } else {
            base = "productos1";
        }

        buscProductos buscar = new buscProductos(null, true, false, "facturacion", base);
        buscar.setOpc("NotaDebito");
        buscar.setLocationRelativeTo(null);
        instancias.setBusProductos(buscar);
        instancias.setCampoActual(txtCodProducto);
        txtCodProducto.requestFocus();
        buscar.noEncontrado(codigo.replace("'", "//"));
        buscar.show();
    }

    public void ventanaTerceros(String nit) {
        buscClientes buscar = new buscClientes(instancias.getMenu(), true, false, null, "");
        buscar.setLocationRelativeTo(null);
        buscar.setOpc("notaDebito");
        instancias.setBusClientes(buscar);
        instancias.setCampoActual(txtNit);
        txtNit.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();

    }
   
    static class WordWrapCellRenderer extends JTextArea implements TableCellRenderer {

        WordWrapCellRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value.toString());
            setSize(table.getColumnModel().getColumn(column).getWidth(), 30);

            if (getPreferredSize().height > 30) {
                if (table.getRowHeight(row) != getPreferredSize().height) {
                    table.setRowHeight(row, getPreferredSize().height);
                }
            } else {
                if (table.getRowHeight(row) != getPreferredSize().height) {
                    table.setRowHeight(row, 30);
                }
            }

            if (isSelected) {
                setForeground(new Color(0, 0, 0));
                setBackground(table.getSelectionBackground());
                Font font = new Font("Century Gothic", Font.PLAIN, 15);
                setFont(font);
            } else {
                setForeground(new Color(0, 0, 0));
                setBackground(table.getBackground());
                Font font = new Font("Century Gothic", Font.PLAIN, 15);
                setFont(font);
            }
            return this;
        }
    }

    public void cargarProductos1(Object[][] productos) {
        String cantEstablecida = txtCant.getText();
        String baseUtilizada = obtenerBase();

        for (int i = 0; i < productos.length; i++) {
            ndProducto nodo = instancias.getSql().getDatosProducto(productos[i][0].toString(), baseUtilizada);

            String codigo = productos[i][0].toString();
            String cantidad = productos[i][1].toString();
            if (cantidad.equals("0")) {
                cantidad = cantEstablecida;
            }

            this.plu = true;
            if (nodo.getUsuario().equals("ADMIN")) {
                cargarProducto(codigo, cantidad, 1, "", "", "", true, "", "", "", "", "");
            } else {
                for (int j = 0; j < Integer.parseInt(cantidad); j++) {
                    cargarProducto(codigo, "1", 1, "", "", "", true, "", "", "", "", "");
                }
            }
        }

        tblProductos.changeSelection(tblProductos.getRowCount() - 1, 0, false, false);
        tblProductos.removeEditor();
        tblInventario.removeEditor();

        if (tblProductos.editCellAt(tblProductos.getRowCount() - 1, 0)) {
            tblProductos.setColumnSelectionInterval(0, 0);
            tblProductos.transferFocus();
        }

        if (datos[97].toString().equals("Valor")) {
            tblProductos.editCellAt(tblInventario.getRowCount() - 1, 2);
            tblProductos.setColumnSelectionInterval(2, 2);
            tblProductos.transferFocus();
        } else {
            tblProductos.editCellAt(tblInventario.getRowCount() - 1, 3);
            tblProductos.setColumnSelectionInterval(3, 3);
            tblProductos.transferFocus();
        }
    }

    
    public void cargarProducto(String codigo, String cantidad, int plu, String imei, String lote, String idProd, Boolean agrupar, String talla, String color,
            String temp, String fechaVence, String detalleMensualidad) {

        String baseUtilizada = obtenerBase();
        ndProducto nodo = null;

        String CodigoProd = "";
        if (codigo.equals("")) {
            CodigoProd = "";
        } else {
            Object[][] listado = instancias.getSql().getCodigosRelacionados(codigo, " where codigo");
            if (listado.length > 0) {
                codigo = listado[0][0].toString();
            }

            nodo = instancias.getSql().getDatosProducto(codigo, baseUtilizada);
            if (nodo.getIdSistema() != null) {
                CodigoProd = nodo.getIdSistema();
            }
        }

        if (!CodigoProd.equals("")) {
            if (codigo.equals(nodo.getCodigo2())) {
                plu = 2;
            } else if (codigo.equals(nodo.getCodigo3())) {
                plu = 3;
            } else if (codigo.equals(nodo.getCodigo4())) {
                plu = 4;
            } else if (codigo.equals(nodo.getCodigo5())) {
                plu = 5;
            } else if (codigo.equals(nodo.getCodigo6())) {
                plu = 6;
            } else if (codigo.equals(nodo.getCodigo7())) {
                plu = 7;
            } else if (codigo.equals(nodo.getCodigo8())) {
                plu = 8;
            }

            if (instancias.getConfiguraciones().isProductosSerial()) {
                for (int j = 0; j < tblProductos.getRowCount(); j++) {
                    String idPro = tblProductos.getValueAt(j, 29).toString();
                    if (!idPro.equals("")) {
                        if (idPro.equals(idProd)) {
                            if (!imei.equals("")) {
                                metodos.msgError(this, "El imei '" + imei + "' ya esta cargado.");
                                return;
                            } else {
                                metodos.msgError(this, "Este producto con el lote '" + lote + "' ya se cargó.");
                                return;

                            }
                        }
                    }
                }
            }
            tblProductos.setDefaultRenderer(Object.class, new IconCellRenderer());


            if (cantidad.contains(".")) {
                cantidad = cantidad.replace(".", ",");
            }

            if (agrupar) {
                if (nodo.getCodigo() != null) {
                    if (nodo.getGrupo() != null) {
                        if (nodo.getCodigo().equals("IMP01") || nodo.getGrupo().equals("GRP-02")) {
                            for (int j = 0; j < tblProductos.getRowCount(); j++) {
                                if (nodo.getIdSistema().equalsIgnoreCase((String) tblProductos.getValueAt(j, 32)) && (plu + "").equals(((int) tblProductos.getValueAt(j, 12)) + "")) {
                                    tblProductos.setValueAt((big.getMoneda(tblProductos.getValueAt(j, 3).toString().replace(".", ",")).add(big.getMoneda(cantidad))).toString().replace(".", ","), j, 3);
                                    txtCodProducto.setText("");
                                    tblProductos.setColumnSelectionInterval(0, 0);
                                    tblProductos.setRowSelectionInterval(j, j);
                                    KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                                    tblProductosKeyReleased(x);
                                    if (instancias.isLector()) {
                                        txtCodProducto.requestFocus();
                                    } else {
                                        tblProductos.editCellAt(0, 3);
                                        tblProductos.setColumnSelectionInterval(3, 3);
                                        tblProductos.transferFocus();
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }

            if (agrupar) {
                try {
                    if ((Boolean) datos[50]) {
                        if (nodo.getUsuario().equals("ADMIN")) {
                            for (int j = 0; j < tblProductos.getRowCount(); j++) {
                                if (nodo.getIdSistema().equalsIgnoreCase((String) tblProductos.getValueAt(j, 32)) && (plu + "").equals(((int) tblProductos.getValueAt(j, 12)) + "")) {
                                    tblProductos.setValueAt((big.getMoneda(tblProductos.getValueAt(j, 3).toString().replace(".", ",")).add(big.getMoneda(cantidad))).toString().replace(".", ","), j, 3);
                                    txtCodProducto.setText("");

                                    tblProductos.setColumnSelectionInterval(0, 0);
                                    tblProductos.setRowSelectionInterval(j, j);

                                    KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                                    tblProductosKeyReleased(x);

                                    if (instancias.isLector()) {
                                        txtCodProducto.requestFocus();
                                    } else {
                                        tblProductos.editCellAt(0, 3);
                                        tblProductos.setColumnSelectionInterval(3, 3);
                                        tblProductos.transferFocus();
                                    }

                                    txtCant.setText(datos[87].toString());

                                    return;
                                }
                            }
                        } else {

                        }
                    }
                } catch (Exception e) {
                    Logs.error(e);
                }
            }

            if (instancias.getSql().getProdActivo(nodo.getCodigo())) {
                metodos.msgError(null, "Este producto esta inactivo");
                lbProducto.requestFocus();
                return;
            }

            String tipo = "", productoEn = "";
            if (nodo.getTipoProd() != null) {
                if (nodo.getTipoProd().equals("Variable")) {
                    productoEn = "Desarrollo";
                    cantidad = "1";
                }
            }

            if (nodo.getTipoProducto() != null) {
                if (nodo.getTipoProducto().equals("IMEI")) {
                    tipo = "Imei";
                } else if (nodo.getTipoProducto().equals("Fecha/Lote")) {
                    tipo = "Fecha/Lote";
                } else if (nodo.getTipoProducto().equals("Color")) {
                    tipo = "Color";
                } else if (nodo.getTipoProducto().equals("Serial")) {
                    tipo = "Serial";
                } else if (nodo.getTipoProducto().equals("Talla")) {
                    tipo = "Talla";
                } else if (nodo.getTipoProducto().equals("ColorTalla")) {
                    tipo = "ColorTalla";
                } else if (nodo.getTipoProducto().equals("SerialColor")) {
                    tipo = "SerialColor";
                } else {
                    tipo = "";
                }
            }

            if (nodo.getTipoProducto()
                    != null) {
                if (nodo.getTipoProducto().equals("IMEI")) {
                    tipo = "Imei";
                } else if (nodo.getTipoProducto().equals("Fecha/Lote")) {
                    tipo = "Fecha/Lote";
                } else if (nodo.getTipoProducto().equals("Color")) {
                    tipo = "Color";
                } else if (nodo.getTipoProducto().equals("Serial")) {
                    tipo = "Serial";
                } else if (nodo.getTipoProducto().equals("Talla")) {
                    tipo = "Talla";
                } else if (nodo.getTipoProducto().equals("ColorTalla")) {
                    tipo = "ColorTalla";
                } else if (nodo.getTipoProducto().equals("SerialColor")) {
                    tipo = "SerialColor";
                } else {
                    tipo = "";
                }
            }

            if (!tipo.equals(
                    "") && idProd.equals("")) {
                dlgCompraDetallada1 compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), null, "Salida", "NotaDebito", baseUtilizada, txtBodega.getText());
                compraDetallada.setLocationRelativeTo(null);
                compraDetallada.setVisible(true);
                return;

            } else {

                if (this.plu) {

                    this.plu = false;

                    int cant = 0;

                    if (nodo.isPlu2()) {
                        cant++;
                    }
                    if (nodo.isPlu3()) {
                        cant++;
                    }
                    if (nodo.isPlu4()) {
                        cant++;
                    }
                    if (nodo.getPlu5()) {
                        cant++;
                    }
                    if (nodo.getPlu6()) {
                        cant++;
                    }
                    if (nodo.getPlu7()) {
                        cant++;
                    }
                    if (nodo.getPlu8()) {
                        cant++;
                    }

                    if (cant > 0) {
                        seleccionarPLU pluu = new seleccionarPLU(null, true, obtenerBase());
                        pluu.setNotaDebito(this);
                        pluu.setInstancias(instancias, nodo.getIdSistema(),null);
                        pluu.setOpc("NotaDebito");
                        pluu.setVisible(true);
                        return;
                    }
                }

                modeloInventario = (DefaultTableModel) tblInventario.getModel();
                BigDecimal aux = new BigDecimal("0.0"), iva, valor;
                valor = big.getBigDecimal(nodo.getL1());
                iva = big.getBigDecimal(nodo.getIva());
                iva = (iva.divide(big.getBigDecimal("100"))).add(big.getBigDecimal("1"));
                aux = valor.divide(iva, 2, RoundingMode.DOWN);
                aux = valor.subtract(aux);

                String cant = nodo.getFisicoInventario();
                cant = cant.replace(".", ",");

                aux = aux.divide(new BigDecimal("100"));
                //
                String cant2 = "1";
                String desc = nodo.getDescripcion();
                String lista = nodo.getL1(), lista1 = "L1";
                switch (plu) {
                    case 2:
                        cant2 = nodo.getCantidad2();
                        desc = nodo.getDescripcion2();
                        lista = nodo.getL2();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad2()), 2, RoundingMode.DOWN);
                        lista1 = "L2";
                        break;
                    case 3:
                        cant2 = nodo.getCantidad3();
                        desc = nodo.getDescripcion3();
                        lista = nodo.getL3();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad3()), 2, RoundingMode.DOWN);
                        lista1 = "L3";
                        break;
                    case 4:
                        cant2 = nodo.getCantidad4();
                        desc = nodo.getDescripcion4();
                        lista = nodo.getL4();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad4()), 2, RoundingMode.DOWN);
                        lista1 = "L4";
                        break;
                    case 5:
                        cant2 = nodo.getCantidad5();
                        desc = nodo.getDescripcion5();
                        lista = nodo.getL5();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad5()), 2, RoundingMode.DOWN);
                        lista1 = "L5";
                        break;
                    case 6:
                        cant2 = nodo.getCantidad6();
                        desc = nodo.getDescripcion6();
                        lista = nodo.getL6();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad6()), 2, RoundingMode.DOWN);
                        lista1 = "L6";
                        break;
                    case 7:
                        cant2 = nodo.getCantidad7();
                        desc = nodo.getDescripcion7();
                        lista = nodo.getL7();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad7()), 2, RoundingMode.DOWN);
                        lista1 = "L7";
                        break;
                    case 8:
                        cant2 = nodo.getCantidad8();
                        desc = nodo.getDescripcion8();
                        lista = nodo.getL8();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad8()), 2, RoundingMode.DOWN);
                        lista1 = "L8";
                        break;
                }
                Double res = 0.0;

                try {
                    res = Double.parseDouble(cant.replace(",", ".")) - Double.parseDouble(cantidad);
                } catch (Exception e) {
                    try {
                        res = big.getBigDecimal(cant.replace(",", ".")).subtract(big.getBigDecimal(cantidad.replace(",", "."))).doubleValue();
                    } catch (Exception ex) {
                        res = Double.parseDouble(cant.replace(",", ".")) - Integer.parseInt(cantidad);
                    }
                }

                if (cant.equals(",00")) {
                    cant = "0";
                }

                if (!nodo.getManejaInventario()) {
                    modeloInventario.addRow(new Object[]{lista1, "N/A", "N/A"});
                } else {
                    modeloInventario.addRow(new Object[]{lista1, big.setNumero(big.getBigDecimal(cant.replace(",", "."))), res});
                }

                boolean datosGrupo = true;
                try {
                    datosGrupo = (boolean) instancias.getSql().getDatosGrupo(nodo.getGrupo())[1];
                } catch (Exception e) {
                    datosGrupo = true;
                }

                Icon icono = null;
                ImageIcon fot = new ImageIcon(getClass().getResource("/imagenes/eliminar.png"));
                icono = new ImageIcon(fot.getImage().getScaledInstance(30, 25, Image.SCALE_DEFAULT));

                String cadena = "";
                if (instancias.getConfiguraciones().isRestaurante()) {

                } else {
//                    if (!idProd.equals("")) {
//                        cadena = idProd;
//                    }
                }

                String grupo = "";
                if (nodo.getGrupo() != null) {
                    grupo = nodo.getGrupo();
                }

                String detalle = "";
                if (!imei.equals("")) {
                    detalle = imei;
                }

                if (!color.equals("")) {
                    if (detalle.equals("")) {
                        detalle = color;
                    } else {
                        detalle = detalle + "-" + color;
                    }
                }

                if (!talla.equals("")) {
                    if (detalle.equals("")) {
                        detalle = talla;
                    } else {
                        detalle = detalle + "-" + talla;
                    }
                }

                if (!lote.equals("")) {
                    detalle = lote;
                }

                if (!fechaVence.equals("")) {
                    if (detalle.equals("")) {
                        detalle = fechaVence;
                    } else {
                        detalle = detalle + "-" + fechaVence;
                    }
                }

                if (!detalleMensualidad.equals("")) {
                    detalle = detalleMensualidad;
                }

                modeloPro.addRow(new Object[]{nodo.getCodigo(), desc, big.setMoneda(big.getBigDecimal(lista)),
                    cantidad, big.setMoneda(big.getBigDecimal(lista)), "0", "0", big.setMoneda(big.getBigDecimal(nodo.getIva())).replace(this.simbolo + " ", ""),
                    this.simbolo + " 0", big.setMoneda(big.getBigDecimal(lista)),
                    nodo.getUbicacion1(), nodo.getReferencia(), plu,
                    (big.getBigDecimal(cant2).multiply(big.getMoneda(cantidad))), this.simbolo + " 0", "", "PENDIENTE", this.simbolo + " 0", datosGrupo, this.simbolo + " 0",
                    this.simbolo + " 0", cadena, new JLabel(icono), big.setMonedaExacta(big.getBigDecimal(nodo.getImpoconsumoVenta())).replace(this.simbolo + " ", ""), "", "", "",
                    detalle, lote, idProd, "Nuevo", "Sin-Permiso", nodo.getIdSistema(), big.setMoneda(big.getBigDecimal(aux)), grupo, nodo.getCodContable(), nodo.getUnd(),
                    nodo.getManejaInventario()});
                txtCodProducto.setText("");

                tblProductos.scrollRectToVisible(tblProductos.getCellRect(tblProductos.getRowCount() - 1, 0, true));
                cargarTotales();

                tblProductos.setColumnSelectionInterval(0, 0);
                tblProductos.setRowSelectionInterval(modeloPro.getRowCount() - 1, modeloPro.getRowCount() - 1);

                if (!this.plu) {
                    if (cmbListaPrecio.getSelectedIndex() > 0) {
                        cmbListas.setSelectedItem(cmbListaPrecio.getSelectedItem());
                        tblInventario.setValueAt(cmbListaPrecio.getSelectedItem(), tblInventario.getRowCount() - 1, 0);
                        tblInventario.setColumnSelectionInterval(0, 0);
                        tblInventario.setRowSelectionInterval(tblInventario.getRowCount() - 1, tblInventario.getRowCount() - 1);
                        cambiarListaCliente();
                    }
                }
            }

            calcularTabla(modeloPro.getRowCount() - 1, false);
            txtCant.setText(datos[87].toString());

            if (instancias.isLector()) {
                txtCodProducto.requestFocus();
            } else {
                if (datos[97].toString().equals("Valor")) {
                    tblProductos.editCellAt(tblInventario.getRowCount() - 1, 2);
                    tblProductos.setColumnSelectionInterval(2, 2);
                    tblProductos.transferFocus();
                } else {
                    tblProductos.editCellAt(tblInventario.getRowCount() - 1, 3);
                    tblProductos.setColumnSelectionInterval(3, 3);
                    tblProductos.transferFocus();
                }
            }

            return;
        }

        if (codigo.equals("")) {
            ventanaProductos(codigo);
        } else {
            metodos.msgError(this, "El codigo no existe");
            txtCodProducto.setText("");
            lbProducto.requestFocus();
        }
    }
    
    public void cargarProducto2(String codigo, String cantidad, int plu, String imei, String lote, String idProd, Boolean agrupar, String talla, String color,
            String temp, String fechaVence, String detalleMensualidad) {

        String baseUtilizada = obtenerBase();
        ndProducto nodo = null;

        String CodigoProd = "";
        if (codigo.equals("")) {
            CodigoProd = "";
        } else {
            Object[][] listado = instancias.getSql().getCodigosRelacionados(codigo, " where codigo");
            if (listado.length > 0) {
                codigo = listado[0][0].toString();
            }

            nodo = instancias.getSql().getDatosProducto(codigo, baseUtilizada);
            if (nodo.getIdSistema() != null) {
                CodigoProd = nodo.getIdSistema();
            }
        }

        if (!CodigoProd.equals("")) {
            if (codigo.equals(nodo.getCodigo2())) {
                plu = 2;
            } else if (codigo.equals(nodo.getCodigo3())) {
                plu = 3;
            } else if (codigo.equals(nodo.getCodigo4())) {
                plu = 4;
            } else if (codigo.equals(nodo.getCodigo5())) {
                plu = 5;
            } else if (codigo.equals(nodo.getCodigo6())) {
                plu = 6;
            } else if (codigo.equals(nodo.getCodigo7())) {
                plu = 7;
            } else if (codigo.equals(nodo.getCodigo8())) {
                plu = 8;
            }

            if (instancias.getConfiguraciones().isProductosSerial()) {
                for (int j = 0; j < tblProductos.getRowCount(); j++) {
                    String idPro = tblProductos.getValueAt(j, 29).toString();
                    if (!idPro.equals("")) {
                        if (idPro.equals(idProd)) {
                            if (!imei.equals("")) {
                                metodos.msgError(this, "El imei '" + imei + "' ya esta cargado.");
                                return;
                            } else {
                                metodos.msgError(this, "Este producto con el lote '" + lote + "' ya se cargó.");
                                return;

                            }
                        }
                    }
                }
            }

            tblProductos.setDefaultRenderer(Object.class, new IconCellRenderer());

            if (cantidad.contains(
                    ".")) {
                cantidad = cantidad.replace(".", ",");
            }

            if (agrupar) {
                if (nodo.getCodigo() != null) {
                    if (nodo.getGrupo() != null) {
                        if (nodo.getCodigo().equals("IMP01") || nodo.getGrupo().equals("GRP-02")) {
                            for (int j = 0; j < tblProductos.getRowCount(); j++) {
                                if (nodo.getIdSistema().equalsIgnoreCase((String) tblProductos.getValueAt(j, 32)) && (plu + "").equals(((int) tblProductos.getValueAt(j, 12)) + "")) {
                                    tblProductos.setValueAt((big.getMoneda(tblProductos.getValueAt(j, 3).toString().replace(".", ",")).add(big.getMoneda(cantidad))).toString().replace(".", ","), j, 3);
                                    txtCodProducto.setText("");
                                    tblProductos.setColumnSelectionInterval(0, 0);
                                    tblProductos.setRowSelectionInterval(j, j);
                                    KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                                    tblProductosKeyReleased(x);
                                    if (instancias.isLector()) {
                                        txtCodProducto.requestFocus();
                                    } else {
                                        tblProductos.editCellAt(0, 3);
                                        tblProductos.setColumnSelectionInterval(3, 3);
                                        tblProductos.transferFocus();
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }

            if (agrupar) {
                try {
                    if ((Boolean) datos[50]) {
                        if (nodo.getUsuario().equals("ADMIN")) {
                            for (int j = 0; j < tblProductos.getRowCount(); j++) {
                                if (nodo.getIdSistema().equalsIgnoreCase((String) tblProductos.getValueAt(j, 32)) && (plu + "").equals(((int) tblProductos.getValueAt(j, 12)) + "")) {
                                    tblProductos.setValueAt((big.getMoneda(tblProductos.getValueAt(j, 3).toString().replace(".", ",")).add(big.getMoneda(cantidad))).toString().replace(".", ","), j, 3);
                                    txtCodProducto.setText("");

                                    tblProductos.setColumnSelectionInterval(0, 0);
                                    tblProductos.setRowSelectionInterval(j, j);

                                    KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                                    tblProductosKeyReleased(x);

                                    if (instancias.isLector()) {
                                        txtCodProducto.requestFocus();
                                    } else {
                                        tblProductos.editCellAt(0, 3);
                                        tblProductos.setColumnSelectionInterval(3, 3);
                                        tblProductos.transferFocus();
                                    }

                                    txtCant.setText(datos[87].toString());

                                    return;
                                }
                            }
                        } else {

                        }
                    }
                } catch (Exception e) {
                }
            }

            if (instancias.getSql().getProdActivo(nodo.getCodigo())) {
                metodos.msgError(null, "Este producto esta inactivo");
                lbProducto.requestFocus();
                return;
            }

            String tipo = "", productoEn = "";

            if (nodo.getTipoProd()
                    != null) {
                if (nodo.getTipoProd().equals("Variable")) {
                    productoEn = "Desarrollo";
                    cantidad = "1";
                }
            }

            if (nodo.getTipoProducto()
                    != null) {
                if (nodo.getTipoProducto().equals("IMEI")) {
                    tipo = "Imei";
                } else if (nodo.getTipoProducto().equals("Fecha/Lote")) {
                    tipo = "Fecha/Lote";
                } else if (nodo.getTipoProducto().equals("Color")) {
                    tipo = "Color";
                } else if (nodo.getTipoProducto().equals("Serial")) {
                    tipo = "Serial";
                } else if (nodo.getTipoProducto().equals("Talla")) {
                    tipo = "Talla";
                } else if (nodo.getTipoProducto().equals("ColorTalla")) {
                    tipo = "ColorTalla";
                } else if (nodo.getTipoProducto().equals("SerialColor")) {
                    tipo = "SerialColor";
                } else {
                    tipo = "";
                }
            }

            if (!tipo.equals(
                    "") && idProd.equals("")) {
                dlgCompraDetallada1 compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), null, "Salida", "NotaDebito", baseUtilizada, txtBodega.getText());
                compraDetallada.setLocationRelativeTo(null);
                compraDetallada.setVisible(true);
                return;

            } else {

                if (this.plu) {

                    this.plu = false;

                    int cant = 0;

                    if (nodo.isPlu2()) {
                        cant++;
                    }
                    if (nodo.isPlu3()) {
                        cant++;
                    }
                    if (nodo.isPlu4()) {
                        cant++;
                    }
                    if (nodo.getPlu5()) {
                        cant++;
                    }
                    if (nodo.getPlu6()) {
                        cant++;
                    }
                    if (nodo.getPlu7()) {
                        cant++;
                    }
                    if (nodo.getPlu8()) {
                        cant++;
                    }

                    if (cant > 0) {
                        seleccionarPLU pluu = new seleccionarPLU(null, true, obtenerBase());
                        pluu.setNotaDebito(this);
                        pluu.setInstancias(instancias, nodo.getIdSistema(),null);
                        pluu.setOpc("NotaDebito");
                        pluu.setVisible(true);
                        return;
                    }
                }

                modeloInventario = (DefaultTableModel) tblInventario.getModel();
                BigDecimal aux = new BigDecimal("0.0"), iva, valor;
                valor = big.getBigDecimal(nodo.getL1());
                iva = big.getBigDecimal(nodo.getIva());
                iva = (iva.divide(big.getBigDecimal("100"))).add(big.getBigDecimal("1"));
                aux = valor.divide(iva, 2);
                aux = valor.subtract(aux);

                String cant = nodo.getFisicoInventario();
                cant = cant.replace(".", ",");

                aux = aux.divide(new BigDecimal("100"));
                //
                String cant2 = "1";
                String desc = nodo.getDescripcion();
                String lista = nodo.getL1(), lista1 = "L1";
                switch (plu) {
                    case 2:
                        cant2 = nodo.getCantidad2();
                        desc = nodo.getDescripcion2();
                        lista = nodo.getL2();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad2()), 3, RoundingMode.CEILING);
                        lista1 = "L2";
                        break;
                    case 3:
                        cant2 = nodo.getCantidad3();
                        desc = nodo.getDescripcion3();
                        lista = nodo.getL3();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad3()), 3, RoundingMode.CEILING);
                        lista1 = "L3";
                        break;
                    case 4:
                        cant2 = nodo.getCantidad4();
                        desc = nodo.getDescripcion4();
                        lista = nodo.getL4();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad4()), 3, RoundingMode.CEILING);
                        lista1 = "L4";
                        break;
                    case 5:
                        cant2 = nodo.getCantidad5();
                        desc = nodo.getDescripcion5();
                        lista = nodo.getL5();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad5()), 3, RoundingMode.CEILING);
                        lista1 = "L5";
                        break;
                    case 6:
                        cant2 = nodo.getCantidad6();
                        desc = nodo.getDescripcion6();
                        lista = nodo.getL6();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad6()), 3, RoundingMode.CEILING);
                        lista1 = "L6";
                        break;
                    case 7:
                        cant2 = nodo.getCantidad7();
                        desc = nodo.getDescripcion7();
                        lista = nodo.getL7();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad7()), 3, RoundingMode.CEILING);
                        lista1 = "L7";
                        break;
                    case 8:
                        cant2 = nodo.getCantidad8();
                        desc = nodo.getDescripcion8();
                        lista = nodo.getL8();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad8()), 3, RoundingMode.CEILING);
                        lista1 = "L8";
                        break;
                }
                Double res = 0.0;

                try {
                    res = Double.parseDouble(cant.replace(",", ".")) - Double.parseDouble(cantidad);
                } catch (Exception e) {
                    Logs.error(e);
                    try {
                        res = big.getBigDecimal(cant.replace(",", ".")).subtract(big.getBigDecimal(cantidad.replace(",", "."))).doubleValue();
                    } catch (Exception ex) {
                        Logs.error(ex);
                        res = Double.parseDouble(cant.replace(",", ".")) - Integer.parseInt(cantidad);
                    }
                }

                if (cant.equals(",00")) {
                    cant = "0";
                }

                modeloInventario.addRow(new Object[]{lista1, big.setNumero(big.getBigDecimal(cant.replace(",", "."))), res});

                boolean datosGrupo = true;
                try {
                    datosGrupo = (boolean) instancias.getSql().getDatosGrupo(nodo.getGrupo())[1];
                } catch (Exception e) {
                    Logs.error(e);
                    datosGrupo = true;
                }

                Icon icono = null;
                ImageIcon fot = new ImageIcon(getClass().getResource("/imagenes/eliminar.png"));
                icono = new ImageIcon(fot.getImage().getScaledInstance(30, 25, Image.SCALE_DEFAULT));

                String cadena = "";
                if (instancias.getConfiguraciones().isRestaurante()) {

                } else {
//                    if (!idProd.equals("")) {
//                        cadena = idProd;
//                    }
                }

                String grupo = "";
                if (nodo.getGrupo() != null) {
                    grupo = nodo.getGrupo();
                }

                String detalle = "";
                if (!imei.equals("")) {
                    detalle = imei;
                }

                if (!color.equals("")) {
                    if (detalle.equals("")) {
                        detalle = color;
                    } else {
                        detalle = detalle + "-" + color;
                    }
                }

                if (!talla.equals("")) {
                    if (detalle.equals("")) {
                        detalle = talla;
                    } else {
                        detalle = detalle + "-" + talla;
                    }
                }

                if (!lote.equals("")) {
                    detalle = lote;
                }

                if (!fechaVence.equals("")) {
                    if (detalle.equals("")) {
                        detalle = fechaVence;
                    } else {
                        detalle = detalle + "-" + fechaVence;
                    }
                }

                if (!detalleMensualidad.equals("")) {
                    detalle = detalleMensualidad;
                }

                modeloPro.addRow(new Object[]{nodo.getCodigo(), desc, big.setMoneda(big.getBigDecimal(lista)),
                    cantidad, big.setMoneda(big.getBigDecimal(lista)), "0", "0", big.setMoneda(big.getBigDecimal(nodo.getIva())).replace(this.simbolo + " ", ""),
                    this.simbolo + " 0", big.setMoneda(big.getBigDecimal(lista)),
                    nodo.getUbicacion1(), nodo.getReferencia(), plu,
                    (big.getBigDecimal(cant2).multiply(big.getMoneda(cantidad))), this.simbolo + " 0", "", "PENDIENTE", this.simbolo + " 0", datosGrupo, this.simbolo + " 0",
                    this.simbolo + " 0", cadena, new JLabel(icono), big.setMonedaExacta(big.getBigDecimal(nodo.getImpoconsumoVenta())).replace(this.simbolo + " ", ""), "", "", "", detalle,
                    lote, idProd, "Nuevo", "Sin-Permiso", nodo.getIdSistema(), big.setMoneda(big.getBigDecimal(aux)), grupo, nodo.getCodContable(), nodo.getUnd(),
                    nodo.getManejaInventario()});
                txtCodProducto.setText("");

                tblProductos.scrollRectToVisible(tblProductos.getCellRect(tblProductos.getRowCount() - 1, 0, true));
                cargarTotales();

                tblProductos.setColumnSelectionInterval(0, 0);
                tblProductos.setRowSelectionInterval(modeloPro.getRowCount() - 1, modeloPro.getRowCount() - 1);

                if (!this.plu) {
                    if (cmbListaPrecio.getSelectedIndex() > 0) {
                        cmbListas.setSelectedItem(cmbListaPrecio.getSelectedItem());
                        tblInventario.setValueAt(cmbListaPrecio.getSelectedItem(), tblInventario.getRowCount() - 1, 0);
                        tblInventario.setColumnSelectionInterval(0, 0);
                        tblInventario.setRowSelectionInterval(tblInventario.getRowCount() - 1, tblInventario.getRowCount() - 1);
                        cambiarListaCliente();
                    }
                }
            }

            calcularTabla(modeloPro.getRowCount() - 1, false);
            txtCant.setText(datos[87].toString());

            if (instancias.isLector()) {
                txtCodProducto.requestFocus();
            } else {
                if (datos[97].toString().equals("Valor")) {
                    tblProductos.editCellAt(tblInventario.getRowCount() - 1, 2);
                    tblProductos.setColumnSelectionInterval(2, 2);
                    tblProductos.transferFocus();
                } else {
                    tblProductos.editCellAt(tblInventario.getRowCount() - 1, 3);
                    tblProductos.setColumnSelectionInterval(3, 3);
                    tblProductos.transferFocus();
                }
            }

            return;
        }

        if (codigo.equals("")) {
            ventanaProductos(codigo);
        } else {
            metodos.msgError(this, "El codigo no existe");
            txtCodProducto.setText("");
            lbProducto.requestFocus();
        }
    }

    public void eliminarFila() {
        int fila = tblProductos.getSelectedRow();
        if (tblProductos.getValueAt(fila, 16).equals("REALIZADO")) {
            metodos.msgAdvertencia(null, "No puede Borrar este producto");
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        modelo.removeRow(fila);

        modeloInventario = (DefaultTableModel) tblInventario.getModel();
        modeloInventario.removeRow(fila);

        tblInventario.removeEditor();
        tblProductos.removeEditor();
        cargarTotales();
    }

    public String obtenerBase() {
        String baseUtilizada = txtBodega.getText();
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

    public void cambiarListaCliente() {
        if (tblInventario.getSelectedRow() != -1) {
            String baseUtilizada = obtenerBase();
            ndProducto codigo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(tblInventario.getSelectedRow(), 32).toString(), baseUtilizada);
            String valor = "";

            switch ((String) tblInventario.getValueAt(tblInventario.getSelectedRow(), 0)) {
                case "L1":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL1()));
                    break;
                case "L2":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL2()));
                    break;
                case "L3":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL3()));
                    break;
                case "L4":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL4()));
                    break;
                case "L5":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL5()));
                    break;
                case "L6":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL6()));
                    break;
                case "L7":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL7()));
                    break;
                case "L8":
                    valor = big.setMonedaExacta(big.getBigDecimal(codigo.getL8()));
                    break;
            }

            tblProductos.setColumnSelectionInterval(3, 3);
            tblProductos.setRowSelectionInterval(tblInventario.getSelectedRow(), tblInventario.getSelectedRow());
            tblProductos.setValueAt(valor, tblInventario.getSelectedRow(), 2);
            tblProductos.transferFocus();

            //simulando enter sobre el producto
            KeyEvent evento = new KeyEvent(tblInventario, 0, 0, 0, 0);
            evento.setKeyCode(KeyEvent.VK_ENTER);
            tblProductosKeyReleased(evento);
        }
    }

    private double[] calcularDescuento(int fila, double subtotal, boolean mostrarAlerta) {
        double descuento = 0;
        double porcentaje = 0;
        double porcentaje2 = 0;

        switch (instancias.getDescuento()) {
            case "porcentaje":
                if (!tblProductos.getValueAt(fila, 5).toString().equals("0.0") && !tblProductos.getValueAt(fila, 5).toString().equals("0")) {
                    if ((boolean) tblProductos.getValueAt(fila, 18)) {

                        if (tblProductos.getValueAt(fila, 5).toString().equals("")) {
                            porcentaje2 = 0;
                        } else {
                            porcentaje2 = (big.formatDouble(tblProductos.getValueAt(fila, 5).toString().replace(",", ".")) / 100);
                        }
                        porcentaje = porcentaje2;
                        descuento = big.formatDouble(subtotal * porcentaje);
                        porcentaje2 = (porcentaje2 * 100);
                    } else {
                        if (mostrarAlerta) {
                            metodos.msgAdvertencia(null, "Este producto no puede generar descuento.");
                        }
                        porcentaje2 = 0;
                        descuento = 0;
                    }
                } else {
                    porcentaje2 = 0;
                    descuento = 0;
                }
                break;
            case "peso":
                if (!tblProductos.getValueAt(fila, 6).toString().equals(this.simbolo + " 0")) {
                    if ((boolean) tblProductos.getValueAt(fila, 18)) {
                        descuento = big.getMonedaToDouble(tblProductos.getValueAt(fila, 6).toString());
                        porcentaje2 = big.formatDouble((descuento * 100) / subtotal);
                    } else {
                        if (mostrarAlerta) {
                            metodos.msgAdvertencia(null, "Este producto no puede generar descuento.");
                        }
                        porcentaje2 = 0;
                        descuento = 0;
                    }
                } else {
                    porcentaje2 = 0;
                    descuento = 0;
                }
                break;
        }
        return new double[]{descuento, porcentaje2};
    }

    public void cargarCliente(String nit) {
        ndTercero nodo = instancias.getSql().getDatosTercero(nit);

        if (nodo.getIdSistema() != null) {

            if (nodo.isActivo()) {
                metodos.msgError(null, "Este cliente esta inactivado");
                lbNit.requestFocus();
                return;
            }

            txtNombre.setEnabled(false);
            txtNombre.setEditable(false);

            txtIdSistema.setText(nodo.getIdSistema());
            txtNit.setText(nodo.getId());
            txtNombre.setText(nodo.getNombre());
            txtObservaciones.setText(nodo.getPlacas());

            try {
                String nombreVendedor = "";
                if (!nodo.getVendedor().equals("")) {
                    nombreVendedor = instancias.getSql().getNombreEmpleado(nodo.getVendedor());
                    cmbVendedor.setSelectedItem(nombreVendedor);
                }
            } catch (Exception e) {
                Logs.error(e);
            }

            try {
                cmbListaPrecio.setSelectedItem(nodo.getLista());
            } catch (Exception e) {
                Logs.error(e);
                cmbListaPrecio.setSelectedIndex(0);
            }

            txtCodProducto.requestFocus();

            if ((Boolean) datos[95]) {
                txtDiasPlazo.setText(nodo.getPlazo());
                calcularDiasPlazo(null);
            }

            return;
        }

        ventanaTerceros(nit);
    }

    public void limpiar(boolean actualizar) {

        lbNit.requestFocus();
        tblProductos.removeEditor();
        tblInventario.removeEditor();

        cmbTipoOperacion.setSelectedIndex(18);
        txtCant.setText(datos[87].toString());
        tblProductos.setEnabled(true);

        txtNombre.setEnabled(false);
        txtNombre.setEditable(false);

        btnGuardar.setEnabled(true);
        btnGuardar.setVisible(true);

        txtRtf.setText(this.simbolo + " 0");
        txtRiva.setText(this.simbolo + " 0");
        cmbRtf.setSelectedIndex(0);
        chkReteIva.setSelected(false);
        txtObservaciones.setText("");
        txtPorcentaje.setText("");
        txtCantProductos.setText("0");
        txtCantUnidades.setText("0");

        btnReImprimir.setEnabled(false);

        tblInventario.removeEditor();
        modeloInventario = (DefaultTableModel) tblInventario.getModel();

        while (tblProductos.getRowCount() > 0) {
            modeloPro.removeRow(0);
        }

        while (tblInventario.getRowCount() > 0) {
            modeloInventario.removeRow(0);
        }

        txtSubTotal.setText(this.simbolo + " 0");
        txtTotal.setText("Total: " + this.simbolo + " 0");
        txtTotalIva.setText(this.simbolo + " 0");
        txtTotalImpoconsumo.setText(this.simbolo + " 0");
        txtTotalDescuentos.setText(this.simbolo + " 0");

        if (actualizar) {
            txtNit.setText("");
            txtNombre.setText("");
            txtDiasPlazo.setText("0");
            txtVencimiento.setText(txtFechaFactura.getText());
        }

        String dsPrefijo = "";
        if (instancias.getIdND() != null) {
            dsPrefijo = instancias.getIdND();
        }
        lbNoFactura.setText(dsPrefijo + instancias.getSql().getNumConsecutivoActual("ND")[0].toString());

        instancias.setDevuelta(BigDecimal.ZERO);
        instancias.setEfectivoDevuelta(big.getBigDecimal("0"));
        instancias.setFranquisia("");
        instancias.setComision("");
        instancias.setValorComision(big.getBigDecimal("0"));
        instancias.setTotalFacturaComision(big.getBigDecimal("0"));
        instancias.setNcDevuelta(big.getBigDecimal("0"));
        instancias.setTarjetaDevuelta(big.getBigDecimal("0"));
        instancias.setChequeDevuelta(big.getBigDecimal("0"));
        instancias.setTarjetaCredito(big.getBigDecimal("0"));
        instancias.setPropina(big.getBigDecimal("0"));
        instancias.setPorcPropina("0");
        instancias.setCancelarFactura(false);

        tblProductos.removeEditor();
        tblInventario.removeEditor();
    }

    public void setVendedores(String[] Vendedores) {
        cmbVendedor.removeAllItems();
        for (String Vendedore : Vendedores) {
            cmbVendedor.addItem(Vendedore);
        }
    }

    private String validacionInicialFactura(boolean imprimir) {

          //VALIDAMOS QUE TIPO DE COMPROBANTE ESTAN UTILIZANDO
        String comprobante = "";
        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
            if ((Boolean) tblComprobantes.getValueAt(i, 2)) {
                if (null == tblComprobantes.getValueAt(i, 7)) {
                    comprobante = "";
                } else {
                    comprobante = tblComprobantes.getValueAt(i, 7).toString();
                }
            }
        }

        //VALIDAMOS QUE LA NOTA SI TENGA CONCEPTO 
        if (cmbConcepto.getSelectedIndex() == 0) {
            metodos.msgAdvertenciaAjustado(null, "No ha seleccionado el concepto");
            return "";
        }

        //VALIDAMOS QUE LA FACTURA SI TENGA PRODUCTOS 
        if (tblProductos.getRowCount() == 0) {
            metodos.msgAdvertenciaAjustado(null, "No ha agregado ningún producto");
            return "";
        }

        //VALIDAMOS QUE LA FACTURA SI TENGA CLIENTE 
        if (txtNombre.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "No ha agregado ningún cliente");
            return "";
        }

        //SI ES FACTURA ELECTRONICA DEBE TENER UN CLIENTE ASOCIADO POR OBLIGACIÓN
//        if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica() && (Boolean) tblComprobantes.getValueAt(0, 2) == true && txtNit.getText().equals("1010")) {
        if (instancias.getConfiguraciones().isFacturaElectronica() && (Boolean) tblComprobantes.getValueAt(0, 2) == true && txtNit.getText().equals("1010")) {
            metodos.msgAdvertencia(this, "Debe cargar un cliente para realizar la nota debito");
            return "";
        }

        //SI ES FACTURA ELECTRONICA, EL CLIENTE DEBE TENER CODIGO POSTAL POR OBLIGACIÓN
//        if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica() && (Boolean) tblComprobantes.getValueAt(0, 2) == true) {
        if (instancias.getConfiguraciones().isFacturaElectronica() && (Boolean) tblComprobantes.getValueAt(0, 2) == true) {
            ndTercero nodo = instancias.getSql().getDatosTercero(txtIdSistema.getText());
            if (nodo.getCategoria() != null) {
                if (nodo.getCategoria().equals("")) {
                    metodos.msgAdvertenciaAjustado(this, "El cliente debe tener codigo postal");
                    return "";
                }
            }

            if (nodo.getDireccion() != null) {
                if (nodo.getDireccion().equals("")) {
                    metodos.msgAdvertenciaAjustado(this, "El cliente debe tener una dirección");
                    return "";
                }
            }

            if (nodo.getId() != null) {
                if (nodo.getId().contains("-")) {
                    if (null == nodo.getId().split("-")[1]) {
                        metodos.msgAdvertencia(this, "El cliente debe tener dígito de verificación");
                        return "";
                    }
                }
//                else {
//                    metodos.msgAdvertencia(this, "El cliente debe tener dígito de verificación");
//                    return "";
//                }

            }

            String vendedor = "";
            try {
                vendedor = cmbVendedor.getSelectedItem().toString();
            } catch (Exception e) {
                Logs.error(e);
            }

            if (vendedor != null) {
                if (vendedor.equals("") || vendedor.equals(" ")) {
                    metodos.msgAdvertenciaAjustado(null, "Debe seleccionar un vendedor");
                    return "";
                }
            } else {
                metodos.msgAdvertenciaAjustado(null, "Debe seleccionar un vendedor");
                return "";
            }

            if (txtFactRelacion.getText().equals("")) {
                metodos.msgAdvertencia(null, "Debe cargar la nota credito para relacionarla con el número de factura");
                return "";
            }

            if (txtObservaciones.getText().equals("")) {
                metodos.msgAdvertencia(null, "Debe ingresar la observación de la nota debito");
                return "";
            }
        }

        //VALIDAMOS LAS DESCRIPCIONES DE LOS PRODUCTOS
        if (tblProductos.getRowCount() > 0) {
            for (int i = 0; i < tblProductos.getRowCount(); i++) {

                String paisFact = instancias.getConfiguraciones().getPais();

                if (paisFact.equals("Panama")) {
                    if (!tblProductos.getValueAt(i, 7).toString().equals("0")
                            && !tblProductos.getValueAt(i, 7).toString().equals("5")
                            && !tblProductos.getValueAt(i, 7).toString().equals("7")
                            && !tblProductos.getValueAt(i, 7).toString().equals("10")
                            && !tblProductos.getValueAt(i, 7).toString().equals("15")) {
                        metodos.msgAdvertencia(this, "El tax del producto '" + tblProductos.getValueAt(i, 1) + "' debe ser 0,5,7,10 ó 15");
                        return "";
                    }
                }

                if (tblProductos.getValueAt(i, 1).toString().length() < 5) {
                    metodos.msgAdvertencia(this, "El producto '" + tblProductos.getValueAt(i, 1) + "' debe tener una descripción mas larga");
                    return "";
                }

                String name = tblProductos.getValueAt(i, 1).toString();
                if (name.length() > 255) {
                    metodos.msgAdvertencia(this, "La descripción del producto supera los 255 caracteres!");
                    return "";
                }

                if (tblProductos.getValueAt(i, 2).toString().equals(this.simbolo + " 0")) {
                    metodos.msgAdvertenciaAjustado(this, "El valor debe ser mayor a " + this.simbolo + " 0");
                    return "";
                }

//                if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica() && (Boolean) tblComprobantes.getValueAt(0, 2) == true) {
                if (instancias.getConfiguraciones().isFacturaElectronica() && (Boolean) tblComprobantes.getValueAt(0, 2) == true) {
                    if (tblProductos.getValueAt(i, 36).toString().equals("")) {
                        metodos.msgAdvertencia(this, "El producto '" + tblProductos.getValueAt(i, 1) + "' no tiene unidad de medida");
                        return "";
                    }
                }

                calcularTabla(i, true);
            }
        }

        tblProductos.removeEditor();
        tblInventario.removeEditor();
        Boolean bolsa = false;
        Boolean facturarSinInventario = (Boolean) datos[79];

        int cantProdFact = 0;
        String baseUtilizada = obtenerBase();
        if (!saltarPasosFactura) {
            //HACEMOS CONTEO DE LOS ITEMS DE LOS PRODUCTOS PREPARADOS
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(i, 32).toString(), baseUtilizada);
                if (nodo.getUsuario().equals("FACTURA")) {
                    String opciones = "";
                    try {
                        opciones = tblProductos.getValueAt(i, 21).toString().split("; ")[3];
                    } catch (Exception e) {
                        Logs.error(e);
                    }

                    if (opciones.equals("")) {
                        Object[][] productos = instancias.getSql().getCantidadesDiscosteo(tblProductos.getValueAt(i, 32).toString());
                        cantProdFact = cantProdFact + productos.length;
                    } else {
                        cantProdFact = cantProdFact + opciones.split(", ").length;
                    }
                }
            }

            //CREAMOS LOS OBJETOS
            Object[][] productosSinInventario = new Object[tblProductos.getRowCount()][4];
            Object[][] productosUtilidades = new Object[tblProductos.getRowCount()][3];
            Object[][] productosSinInventarioDis = new Object[cantProdFact][5];

            Boolean entro = false, entroUtilidad = false;
            int ser = 0, ser1 = 0, contadorUtilidades = 0;

            //INICIAMOS CON LA VALIDACIÓN DEL INVENTARIO
            for (int i = 0; i < tblProductos.getRowCount(); i++) {

                //VALIDAMOS QUE LA FACTURA INCLUYA LA BOLSA
                if (tblProductos.getValueAt(i, 32).equals("PROD-000000032")) {
                    bolsa = true;
                }

                ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(i, 32).toString(), baseUtilizada);

                BigDecimal num = BigDecimal.ZERO;
                try {
                    num = big.getBigDecimal(tblInventario.getValueAt(i, 2).toString().replace(",", "."));
                } catch (Exception e) {
                    Logs.error(e);
                    //num = big.getBigDecimal(tblInventario.getValueAt(i, 2).toString().replace(".", "").replace(",", "."));
                }

                //SI ES UN PRODUCTO CON DISEÑO
                if (nodo.getUsuario().equals("FACTURA")) {
                    String opciones = "";

                    try {
                        opciones = tblProductos.getValueAt(i, 21).toString().split("; ")[3];
                    } catch (Exception e) {
                        Logs.error(e);
                    }

                    String opciones2[];
                    if (!opciones.equals("")) {
                        opciones2 = opciones.split(", ");
                        for (int k = 0; k < opciones2.length; k++) {
                            String codigo = opciones2[k].split("/")[1];
                            String cant = opciones2[k].split("/")[2];
                            String estado = opciones2[k].split("/")[3];

                            if (estado.equals(" true")) {
                                ndProducto nodo1 = instancias.getSql().getDatosProducto(codigo, baseUtilizada);
                                Double cant1 = Double.parseDouble(nodo1.getFisicoInventario().replace(",", "."));
                                Double total = cant1 - Double.parseDouble(cant.replace(",", "."));

                                if (total < 0) {
                                    productosSinInventarioDis[ser1][0] = nodo1.getIdSistema();
                                    productosSinInventarioDis[ser1][1] = nodo1.getDescripcion();
                                    productosSinInventarioDis[ser1][2] = cant1;
                                    productosSinInventarioDis[ser1][3] = total;
                                    productosSinInventarioDis[ser1][4] = cant;
                                    entro = true;
                                    ser1++;
                                }
                            }
                        }
                    } else {
                        Object[][] productos = instancias.getSql().getCantidadesDiscosteo(tblProductos.getValueAt(i, 32).toString());
                        for (int k = 0; k < productos.length; k++) {
                            String codigo = productos[k][0].toString();
                            String cant = productos[k][1].toString();

                            ndProducto insumo = instancias.getSql().getDatosProducto(codigo, baseUtilizada);
                            Double cant1 = Double.parseDouble(insumo.getFisicoInventario().replace(",", "."));
                            Double total = cant1 - Double.parseDouble(cant.replace(",", "."));

                            if (total < 0) {
                                productosSinInventarioDis[ser1][0] = insumo.getIdSistema();
                                productosSinInventarioDis[ser1][1] = insumo.getDescripcion();
                                productosSinInventarioDis[ser1][2] = cant1;
                                productosSinInventarioDis[ser1][3] = total;
                                productosSinInventarioDis[ser1][4] = cant;
                                entro = true;
                                ser1++;
                            }
                        }
                    }
                } else {
                    //SI ES UN PRODUCTO NORMAL
                    if (num.compareTo(BigDecimal.ZERO) < 0) {
                        if (nodo.getManejaInventario()) {
                            productosSinInventario[ser][0] = nodo.getIdSistema();
                            productosSinInventario[ser][1] = nodo.getDescripcion();
                            productosSinInventario[ser][2] = tblInventario.getValueAt(i, 1);
                            productosSinInventario[ser][3] = tblInventario.getValueAt(i, 2);
                            entro = true;
                            ser++;
                        } else {
                            Logs.log("Este producto no maneja inventario.");
                        }
                    }
                }

                //VALIDAMOS LAS UTILIDADES DE LOS PRODUCTOS
                if (tblProductos.getValueAt(i, 15).equals("ERROR1")) {
                    productosUtilidades[contadorUtilidades][0] = tblProductos.getValueAt(i, 32);
                    productosUtilidades[contadorUtilidades][1] = tblProductos.getValueAt(i, 1);
                    productosUtilidades[contadorUtilidades][2] = "Utilidad minima sobrepasada";
                    contadorUtilidades++;
                    entroUtilidad = true;
                } else if (tblProductos.getValueAt(i, 15).equals("ERROR2")) {
                    productosUtilidades[contadorUtilidades][0] = tblProductos.getValueAt(i, 32);
                    productosUtilidades[contadorUtilidades][1] = tblProductos.getValueAt(i, 1);
                    productosUtilidades[contadorUtilidades][2] = "Utilidad maxima sobrepasada";
                    contadorUtilidades++;
                    entroUtilidad = true;
                }
            }
            //FIN DE VALIDACIÓN DEL INVENTARIO

            //VALIDAMOS SI LOS PRODUCTOS PREPARADOS TIENE ALGUNA ADICCIÓN PARA AGREGARLOS A LA FACTURA
            if (instancias.getConfiguraciones().isRestaurante()) {
                for (int i = 0; i < tblProductos.getRowCount(); i++) {
                    ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(i, 32).toString(), baseUtilizada);

                    if (nodo.getUsuario().equals("FACTURA")) {
                        String opciones = "";

                        try {
                            opciones = tblProductos.getValueAt(i, 21).toString().split("; ")[3];
                        } catch (Exception e) {
                            Logs.error(e);
                        }

                        String opciones2[];
                        if (!opciones.equals("")) {
                            opciones2 = opciones.split(", ");
                            for (int k = 0; k < opciones2.length; k++) {
                                String codigo = opciones2[k].split("/")[1];
                                String cant = opciones2[k].split("/")[2];
                                String estado = opciones2[k].split("/")[3];

                                if (estado.equals(" true")) {
                                    ndProducto nodo1 = instancias.getSql().getDatosProducto(codigo, baseUtilizada);

                                    if (nodo1.getGrupo() != null) {
                                        if (nodo1.getGrupo().equals("GRP-02")) {
                                            cargarProducto(codigo, cant, 1, "", "", "", false, "", "", "", "", "");
                                            tblProductos.setValueAt("PRODUCTO-AGREGADO|"+i, tblProductos.getRowCount() - 1, 31);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            //VALIDAMOS SI TIENE ALGUNA ALERTA DE UTILIDAD PARA MOSTRARLO
            if (entroUtilidad) {
                if (instancias.isMensajeUtilidad()) {
                    dlgProductosSinUtilidad prodSinUtilidad = new dlgProductosSinUtilidad(null, true, productosUtilidades, instancias.isUtilidad());
                    prodSinUtilidad.setVisible(true);

                    if (instancias.getCancelarFactura()) {
                        instancias.setCancelarFactura(false);
                        return "";
                    }
                }
            }

            //VALIDAMOS SI TIENE ALGUNA ALERTA DE PRODUCTOS SIN INVENTARIO PARA MOSTRARLO
            if (entro) {
                if (!facturarSinInventario) {
                    metodos.msgError(this, "No tiene inventario suficiente");
                    return "";
                } else {
                    dlgProductosSinInventario prodSinInventario = new dlgProductosSinInventario(null, true, productosSinInventario,
                            productosSinInventarioDis);
                    prodSinInventario.setVisible(true);

                    if (instancias.getCancelarFactura()) {
                        instancias.setCancelarFactura(false);
                        return "";
                    }
                }
            }

            //SI ES UNA FACTURA Y ES REGIMEN COMÚN, SE VALIDA EL NUMERO DE BOLSAS A FACTURAR
            if (instancias.getRegimen().equals("")) {
                if (!bolsa) {
                    if (!instancias.getConfiguraciones().isParqueadero()) {
                        if ((Boolean) datos[52]) {
                            int num = 0;
                            try {
                                num = Integer.parseInt(metodos.msgIngresarEnter(null, "Ingrese # de bolsas"));
                            } catch (Exception e) {
                                Logs.error(e);
                                metodos.msgError(this, "Número no válido");
                                return "";
                            }

                            if (num > 0) {
                                cargarProducto("IMP01", String.valueOf(num), 1, "", "", "", true, "", "", "", "", "");
                            }
                        }
                    }
                }
                entro = false;
            }
        }

        //VALIDAMOS SI HACE PAGO A TERCEROS EN LA FACTURA
        int contador = 0;
        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            BigDecimal pago = big.getMoneda(tblProductos.getValueAt(i, 19).toString());
            if (pago.compareTo(BigDecimal.ZERO) > 0) {
                BigDecimal venta = big.getMoneda(tblProductos.getValueAt(i, 9).toString());
                BigDecimal pago1 = big.getMoneda(tblProductos.getValueAt(i, 19).toString());

                BigDecimal resta = venta.subtract(pago1);

                tblProductos.setValueAt(resta, i, 20);
                if (resta.compareTo(BigDecimal.ZERO) < 0) {
                    contador = contador + 1;
                }
            }
        }

        if (contador > 0) {
            metodos.msgAdvertencia(this, "¡Hay algunos productos que no tienen utilidad!");
        }
        //FIN DE VALIDACION DE PAGO A TERCEROS

        return facturar(null, imprimir, "", comprobante);
    }

    private String facturar(intDevuelta devuelta, boolean imprimir, String desde, String comprobante) {
         if (tblComprobantes.getSelectedRow() == -1) {
             metodos.msgAdvertenciaAjustado(this, "Debe seleccionar un comprobante.");
             return "";
        }
        
      
        //SI ES FACTURA ELECTRONICA DEBE TENER UN CLIENTE ASOCIADO POR OBLIGACIÓN
//        if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica() && txtNit.getText().equals("1010")) {
        if (instancias.getConfiguraciones().isFacturaElectronica() && txtNit.getText().equals("1010")) {
            metodos.msgAdvertencia(null, "Debe cargar un cliente para la nota debito electrónicamente");
            return "";
        }
        
        codigoAutorizacion = "";
        //SI ES MESA O ESTA ACTIVO SALTAR PASOS DE FACTURA, NO MOSTRAR EL MODULO DE DEVUELTA
        if (saltarPasosFactura) {
            devuelta = new intDevuelta(instancias.getMenu(), true, big.getMoneda(txtTotal.getText().replace("Total: ", "")),
                    instancias, "", txtIdSistema.getText());
        }

        //OBTENEMOS LA BASE DE LA BODEGA QUE SE ESTA UTILIZANDO
        String baseUtilizada = obtenerBase();

        //MODULO DE DEVUELTA
        if (devuelta == null) {
            //VALIDAMOS SI LA FACTURA ES A CONTADO
            if (txtFechaFactura.getText().equals(txtVencimiento.getText())) {
                devuelta = new intDevuelta(null, true, big.getMoneda(txtTotal.getText().replace("Total: ", "")),
                        instancias, "NotaDebito", txtIdSistema.getText());
                devuelta.show();
            } else {
                instancias.setEfectivoDevuelta(big.getBigDecimal("0"));
                instancias.setNcDevuelta(big.getBigDecimal("0"));
                instancias.setTarjetaDevuelta(big.getBigDecimal("0"));
                instancias.setTarjetaCredito(big.getBigDecimal("0"));
                instancias.setChequeDevuelta(big.getBigDecimal("0"));
                instancias.setDevuelta(BigDecimal.ZERO);
                instancias.setPorcPropina("0");
                instancias.setPropina(big.getBigDecimal("0"));
                instancias.setTotalPropina(big.getBigDecimal("0"));
            }
        } else {
            if (txtFechaFactura.getText().equals(txtVencimiento.getText())) {
                instancias.setEfectivoDevuelta(big.getBigDecimal(big.getMoneda(txtTotal.getText().replace("Total: ", ""))));
                instancias.setNcDevuelta(big.getBigDecimal("0"));
                instancias.setTarjetaDevuelta(big.getBigDecimal("0"));
                instancias.setTarjetaCredito(big.getBigDecimal("0"));
                instancias.setChequeDevuelta(big.getBigDecimal("0"));
                instancias.setDevuelta(BigDecimal.ZERO);
                instancias.setPorcPropina("0");
                instancias.setPropina(big.getBigDecimal("0"));
                instancias.setTotalPropina(big.getBigDecimal("0"));
            } else {
                instancias.setEfectivoDevuelta(big.getBigDecimal("0"));
                instancias.setNcDevuelta(big.getBigDecimal("0"));
                instancias.setTarjetaDevuelta(big.getBigDecimal("0"));
                instancias.setTarjetaCredito(big.getBigDecimal("0"));
                instancias.setChequeDevuelta(big.getBigDecimal("0"));
                instancias.setDevuelta(BigDecimal.ZERO);
                instancias.setPorcPropina("0");
                instancias.setPropina(big.getBigDecimal("0"));
                instancias.setTotalPropina(big.getBigDecimal("0"));
            }
        }

        //VALIDAMOS QUE SI CANCELARON LA FACTURA, SE REESTABLEZCAN AL VALOR INICIAL
        if (instancias.getCancelarFactura()) {
            Logs.log("DEVOLVIO LA FACTURA");
            instancias.setEfectivoDevuelta(big.getBigDecimal("0"));
            instancias.setNcDevuelta(big.getBigDecimal("0"));
            instancias.setTarjetaDevuelta(big.getBigDecimal("0"));
            instancias.setTarjetaCredito(big.getBigDecimal("0"));
            instancias.setChequeDevuelta(big.getBigDecimal("0"));
            instancias.setDevuelta(BigDecimal.ZERO);
            instancias.setPorcPropina("0");
            instancias.setPropina(big.getBigDecimal("0"));
            instancias.setTotalPropina(big.getBigDecimal("0"));
            return "";
        }

        //OBTENEMOS EL CONSECUTIVO DE CUALQUIER TIPO DE DOCUMENTO
        String prefijo = "";
        if (instancias.getIdND() != null) {
            prefijo = instancias.getIdND();
        }

        String cons = instancias.getSql().getNumConsecutivo("ND")[0].toString();
//        if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica()) {
        if (instancias.getConfiguraciones().isFacturaElectronica()) {
            cons = instancias.getSql().getNumConsecutivoBloqueando("ND")[0].toString();
        }else{
            cons = instancias.getSql().getNumConsecutivo("ND")[0].toString();
        }
        String factura = "", factura2 = "";
        factura = "ND-" + prefijo + cons;
        factura2 = factura;

        String por = "";
        if (cmbRtf.getSelectedIndex() == 0) {
            por = "0";
        } else {
            por = cmbRtf.getSelectedItem().toString();
        }

        String estado = "PENDIENTE";

        //OBTENEMOS EL VENDEDOR DE LA FACTURA
        String vendedor = "";
        try {
            vendedor = cmbVendedor.getSelectedItem().toString();
        } catch (Exception e) {
            Logs.error(e);
            vendedor = "";
        }

        ndFactura nodo;

        //AGREGAMOS EL REGISTRO TOTALIZADO EN VERIFICADOR DE FACTURAS 
        instancias.getSql().agregarVerificarFactura(factura, txtIdSistema.getText(), factura2, instancias.getTerminal(),
                big.getMoneda(txtTotal.getText().replace("Total: ", "")), metodos.fechaConsulta(metodosGenerales.fechaHora()),
                metodos.fechaConsulta(txtVencimiento.getText()), metodos.fechaConsulta(metodos.sumarFecha(txtVencimiento.getText(), cantDias)),
                vendedor, "SIN-CONSECUTIVO", "", "");

        //OBTENEMOS LA HORA EN LA QUE SE REALIZA LA FACTURA
        String hora = metodosGenerales.hora();

        //AGREGAR FORMAS DE PAGOS
        if (instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) > 0) {
            String idPago = "FORMAPAGO-" + instancias.getSql().getNumConsecutivo("FORMAPAGO")[0].toString();
            instancias.getSql().agregarFormaPago(idPago, factura2, "10", "EFECTIVO", instancias.getEfectivoDevuelta(), "",
                    metodos.fechaConsulta(metodosGenerales.fecha()), hora, instancias.getUsuario());
//            instancias.getSql().aumentarConsecutivo("FORMAPAGO", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("FORMAPAGO")[0]) + 1);
        }

        if (instancias.getChequeDevuelta().compareTo(BigDecimal.ZERO) > 0) {
            String idPago = "FORMAPAGO-" + instancias.getSql().getNumConsecutivo("FORMAPAGO")[0].toString();
            instancias.getSql().agregarFormaPago(idPago, factura2, "20", "CHEQUE", instancias.getChequeDevuelta(), "",
                    metodos.fechaConsulta(metodosGenerales.fecha()), hora, instancias.getUsuario());
//            instancias.getSql().aumentarConsecutivo("FORMAPAGO", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("FORMAPAGO")[0]) + 1);
        }

        if (instancias.getTarjetaDevuelta().compareTo(BigDecimal.ZERO) > 0) {
            String idPago = "FORMAPAGO-" + instancias.getSql().getNumConsecutivo("FORMAPAGO")[0].toString();
            instancias.getSql().agregarFormaPago(idPago, factura2, "49", "TARJETA_DEBITO", instancias.getTarjetaDevuelta(), "",
                    metodos.fechaConsulta(metodosGenerales.fecha()), hora, instancias.getUsuario());
//            instancias.getSql().aumentarConsecutivo("FORMAPAGO", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("FORMAPAGO")[0]) + 1);
        }

        if (instancias.getTarjetaCredito().compareTo(BigDecimal.ZERO) > 0) {
            String idPago = "FORMAPAGO-" + instancias.getSql().getNumConsecutivo("FORMAPAGO")[0].toString();
            instancias.getSql().agregarFormaPago(idPago, factura2, "48", "TARJETA_CREDITO", instancias.getTarjetaCredito(), "",
                    metodos.fechaConsulta(metodosGenerales.fecha()), hora, instancias.getUsuario());
//            instancias.getSql().aumentarConsecutivo("FORMAPAGO", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("FORMAPAGO")[0]) + 1);
        }

        String dsPrefijo = "";
        if (instancias.getIdND() != null) {
            dsPrefijo = instancias.getIdND();
        }
        
//        if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica()) {
        if (instancias.getConfiguraciones().isFacturaElectronica()) {
            try {                         
                Boolean generacionFacturaElectronica = aplicarFacturacionElectronica(factura, factura2, prefijo, dsPrefijo);
                if (!generacionFacturaElectronica) {
                    instancias.getSql().desbloquearConsecutivosfactura();
                    return ""; 
                }else{
                     instancias.getSql().getNumConsecutivo("ND");
                }
            } catch (Exception e) {
                e.printStackTrace();
                instancias.getSql().desbloquearConsecutivosfactura();
                return ""; 
            }
        }

//            if (instancias.getNcDevuelta().compareTo(BigDecimal.ZERO) > 0) {
//            }
        for (int i = 0; i < tblProductos.getRowCount(); i++) {

            if (!tblProductos.getValueAt(i, 16).equals("REALIZADO")) {
                String imei = "", lote = "", idProd = "";

                if (instancias.getConfiguraciones().isProductosSerial()) {
                    imei = tblProductos.getValueAt(i, 27).toString();
                    lote = tblProductos.getValueAt(i, 28).toString();
                    idProd = tblProductos.getValueAt(i, 29).toString();
                } else if (instancias.getConfiguraciones().isParqueadero()) {
                    imei = tblProductos.getValueAt(i, 27).toString();
                }

                BigDecimal porcDesc;
                try {
                    porcDesc = big.getBigDecimal(tblProductos.getValueAt(i, 5).toString().replace(",", ".")).setScale(3, RoundingMode.CEILING);
                } catch (Exception e) {
                    Logs.error(e);
                    porcDesc = BigDecimal.ZERO;
                }

                String preparacion = "";

                try {
                    preparacion = tblProductos.getValueAt(i, 21).toString();
                } catch (Exception e) {
                    Logs.error(e);
                }

                String bodega = txtBodega.getText();
                if (!instancias.getConfiguraciones().isInventarioBodegas()) {
                    bodega = "123-22";
                }
                Map preparacion1 = null;
                if (instancias.getSql().getDatosProducto(tblProductos.getValueAt(i, 32).toString(), baseUtilizada).getUsuario().equalsIgnoreCase("FACTURA")) {
                    instancias.getArmado().facturarPreparado(tblProductos.getValueAt(i, 32).toString(), tblProductos.getValueAt(i, 3).toString(),
                            preparacion1, bodega);
                }

                String garantia = "", cotizacionesAsociadas = "", mesFacturar = "", turno = "", placa = "", loteCuentasCobro = "", numPedido = "", consecutivoCosteo = "",
                        congelada = "";

                BigDecimal copago = BigDecimal.ZERO;

                Object[] ultimoMovimiento = instancias.getSql().getUltimoPonderado(tblProductos.getValueAt(i, 32).toString());
                double pond;
                try {
                    pond = big.formatDouble(ultimoMovimiento[4].toString());
                } catch (Exception e) {
                    Logs.error(e);
                    pond = 0;
                }
                
                String numeroOrdenCompra="";

                Object[] vector = {factura, txtIdSistema.getText(), vendedor, "", metodos.fechaConsulta(metodosGenerales.fechaHora()),
                    metodos.fechaConsulta(txtVencimiento.getText()), instancias.getEfectivoDevuelta(), instancias.getNcDevuelta(), instancias.getChequeDevuelta(),
                    instancias.getTarjetaDevuelta(), big.getMoneda(txtTotal.getText().replace("Total: ", "")),
                    big.getMoneda(txtTotalDescuentos.getText()),
                    big.getMoneda(txtTotalIva.getText()), big.getMoneda(txtSubTotal.getText()), cotizacionesAsociadas,
                    factura.replace("ND-", ""), false, "", !txtFechaFactura.getText().equals(txtVencimiento.getText()),
                    loteCuentasCobro, instancias.getUsuario(), big.getMoneda(txtRiva.getText()), big.getMoneda("0"), big.getMoneda(txtRtf.getText()),
                    big.getMoneda(por), txtObservaciones.getText(), false, "", false, "", "",
                    metodos.fechaConsulta(metodos.sumarFecha(txtVencimiento.getText(), cantDias)), instancias.getTerminal(),
                    estado, "", instancias.getDevuelta(), factura2, instancias.getResolucion(), metodos.fechaConsulta(metodosGenerales.fecha()), "", "",
                    copago, placa, garantia, numPedido, tblProductos.getValueAt(i, 31), "",
                    "", congelada, tblProductos.getValueAt(i, 32), big.getMoneda((String) tblProductos.getValueAt(i, 2)),
                    tblProductos.getValueAt(i, 3).toString().replace(",", "."), big.getMoneda((String) tblProductos.getValueAt(i, 6)),
                    big.getMoneda((String) tblProductos.getValueAt(i, 9)), big.getMoneda((String) tblProductos.getValueAt(i, 33)),
                    big.getMoneda((String) tblProductos.getValueAt(i, 4)), "", big.getMoneda((String) tblProductos.getValueAt(i, 14)), "",
                    porcDesc + "", tblProductos.getValueAt(i, 1), tblProductos.getValueAt(i, 12) + "", tblProductos.getValueAt(i, 13).toString().replace(",", "."),
                    "PENDIENTE", tblProductos.getValueAt(i, 7), tblProductos.getValueAt(i, 19), big.getMoneda(tblProductos.getValueAt(i, 20).toString()),
                    preparacion, big.getMoneda(txtImpuesto.getText()), turno, big.getMoneda(txtTotalImpoconsumo.getText()), instancias.getFranquisia(),
                    instancias.getComision(), instancias.getValorComision(), instancias.getTotalFacturaComision(), imei, lote, idProd,
                    mesFacturar, instancias.getTarjetaCredito(), instancias.getTotalPropina(), instancias.getPorcPropina(),
                    consecutivoCosteo, hora, tblProductos.getValueAt(i, 23).toString().replace(".", "").replace(",", "."),
                    big.getMoneda((String) tblProductos.getValueAt(i, 8)), false, txtBodega.getText(), pond, "", codigoAutorizacion,"","",numeroOrdenCompra
                };

                nodo = metodos.llenarFactura(vector);

                if (!instancias.getSql().agregarFactura(nodo)) {
                    boolean noPuedaGuardar = false;

                    instancias.getSql().eliminarFactura(factura);
                    while (!noPuedaGuardar) {
                        noPuedaGuardar = instancias.getSql().eliminarFactura(factura);
                    }

                    metodos.msgError(null, "Error al guardar la factura");
                    return null;
                }
            }

            // DESCONTAR DEL INVENTARIO 
            //OBTENEMOS EL NODO DEL PRODUCTO PARA REALIZAR LOS MOVIMIENTOS
            ndProducto producto = instancias.getSql().getDatosProducto(tblProductos.getValueAt(i, 32).toString(), baseUtilizada);

            //OBTENEMOS LA CANTIDAD TOTAL A DESCONTAR DEL INVENTARIO
            double cant2 = Double.parseDouble(tblProductos.getValueAt(i, 13).toString().replace(",", "."));

            //OBTENEMOS EL CODIGO SI EL PRODUCTO ES UN PRODUCTO DE SERIE
            String cod = "";
            try {
                cod = tblProductos.getValueAt(i, 29).toString();
            } catch (Exception e) {
                Logs.error(e);
            }

            if (!cod.equals("")) {
                String tipo = "";

                if (producto.getTipoProducto() != null) {
                    if (producto.getTipoProducto().equals("IMEI")) {
                        tipo = "Imei";
                    } else if (producto.getTipoProducto().equals("Fecha/Lote")) {
                        tipo = "Fecha/Lote";
                    } else if (producto.getTipoProducto().equals("Color")) {
                        tipo = "Color";
                    } else if (producto.getTipoProducto().equals("Serial")) {
                        tipo = "Serial";
                    } else if (producto.getTipoProducto().equals("Talla")) {
                        tipo = "Talla";
                    } else if (producto.getTipoProducto().equals("ColorTalla")) {
                        tipo = "ColorTalla";
                    } else if (producto.getTipoProducto().equals("SerialColor")) {
                        tipo = "SerialColor";
                    } else {
                        tipo = "";
                    }
                }

                if (tipo.equals("Imei") || tipo.equals("Serial") || tipo.equals("SerialColor")) {
                    instancias.getSql().modificarEstadoDetalleProductos(cod, "NO-DISPONIBLE");
                } else {
                    Double cantidadActual = Double.parseDouble(instancias.getSql().getCantidadProductos(cod).replace(",", "."));
                    cantidadActual = cantidadActual - cant2;
                    String cantidadFinal = String.valueOf(df.format(cantidadActual)).replace(".", ",");
                    instancias.getSql().modificarCantidadesDetalleProductos(cod, cantidadFinal);
                }

            }
            // FIN DE DESCONTAR DEL INVENTARIO SEPARADO // 

            double cantidad, inventario, fisicoInventario;

            try {
                cantidad = Double.parseDouble(producto.getNotaDebito().replace(",", "."));
            } catch (Exception e) {
                Logs.error(e);
                cantidad = 0;
            }

            try {
                inventario = Double.parseDouble(producto.getInventario().replace(",", "."));
            } catch (Exception e) {
                Logs.error(e);
                inventario = 0;
            }

            try {
                fisicoInventario = Double.parseDouble(producto.getFisicoInventario().replace(",", "."));
            } catch (Exception e) {
                Logs.error(e);
                fisicoInventario = Double.parseDouble(producto.getInventario().replace(",", "."));
            }

            inventario = inventario - cant2;
            fisicoInventario = fisicoInventario - cant2;
            double total = cantidad + cant2;

            String total1 = String.valueOf(df.format(total)).replace(".", ",");
            String inventario1 = String.valueOf(df.format(inventario)).replace(".", ",");
            String fisicoInventario1 = String.valueOf(df.format(fisicoInventario)).replace(".", ",");

            instancias.getSql().modificarInventario("notaDebito", total1, tblProductos.getValueAt(i, 32).toString(), baseUtilizada);
            instancias.getSql().modificarInventario("inventario", inventario1, tblProductos.getValueAt(i, 32).toString(), baseUtilizada);
            instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, tblProductos.getValueAt(i, 32).toString(), baseUtilizada);
        }

        //PROCESO GUARDAR CUENTA POR COBRAR
        if (!txtFechaFactura.getText().equals(txtVencimiento.getText())) {
            if (txtDiasPlazo.getText().equals("")) {
                txtDiasPlazo.setText("0");
            }

            Object[] vectCxc = {factura, "NOTADEBITO", "PEND", "", big.getMoneda(txtTotal.getText().replace("Total: ", "")), txtDiasPlazo.getText(),
                metodos.fechaConsulta(txtVencimiento.getText()), instancias.getUsuario(), instancias.getTerminal(), false, factura2};

            ndCxc nodoCxc = metodos.llenarCxc(vectCxc);

            if (!instancias.getSql().agregarCxc(nodoCxc)) {
                metodos.msgError(null, "Error al guardar la ND en cartera");
            }
        }

//        if (!instancias.getSql().aumentarConsecutivo("ND", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("ND")[0]) + 1)) {
//            metodos.msgError(this, "Error al aumentar consecutivo de ND");
//        }

        lbNoFactura.setText(dsPrefijo + instancias.getSql().getNumConsecutivoActual("ND")[0].toString());
        lbProducto.requestFocus();

        if (!saltarPasosFactura) {
            lbObservaciones.requestFocus();
            metodos.msgExito(null, "Nota debito Exitosa");
        }

        if (txtDiasPlazo.getText()
                .equals("0")) {
            if ((Boolean) datos[91]) {
                if (!saltarPasosFactura) {
                    intTotalDevuelta devueltaTotal = new intTotalDevuelta(instancias.getMenu(), true, instancias, instancias.getDevuelta());
                    devueltaTotal.setVisible(true);
                }
            }
        }

//        if (imprimir) {
//            imprimir(factura, factura2);
//        }
        if (instancias.isUbicacion()) {
            try {
                if (metodos.msgPregunta(null, "¿Desea imprimir ubicación?") == 0) {
                    instancias.getReporte().ver_ubicacion(factura2, false);
                }
            } catch (Exception e) {
                Logs.error(e);
            }
        }

        saltarPasosFactura = false;

        limpiar(
                true);

        return factura2;
    }

    public Object[] getOcultarIvaPanama() {
        return new Object[]{tblProductos, chkReteIva, txtRiva, cmbRtf, txtRtf, txtImpuesto, txtTotalImpoconsumo,
            lbImpoconsumo, lbImpuestoBolsa};
    }

    public Object[] getOcultarIva() {
        return new Object[]{tblProductos, chkReteIva, txtRiva, txtIva, txtTotalIva, cmbRtf, txtRtf, txtImpuesto, txtTotalImpoconsumo,
            lbImpoconsumo, lbImpuestoBolsa};
    }

    public void cargarDescuento(int fila, String descPorc, String totalDesc, String tipo) {
        if (descPorc == null) {
            tblProductos.setValueAt(totalDesc, fila, 6);
        } else {

            if (fila == 10000) {
                for (int i = 0; i < tblProductos.getRowCount(); i++) {
                    tblProductos.setValueAt(descPorc, i, 5);
                    calcularTabla(i, false);
                }
            } else {
                tblProductos.setValueAt(descPorc, fila, 5);
            }
        }

        if (fila == 10000) {
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                tblProductos.setValueAt(tipo, i, 31);
                calcularTabla(i, false);
            }
        } else {
            tblProductos.setValueAt(tipo, fila, 31);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusProd;
    private javax.swing.JButton btnBuscTerceros;
    private javax.swing.JButton btnBuscTerceros1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReImprimir;
    private javax.swing.JCheckBox chkReteIva;
    private javax.swing.JComboBox cmbConcepto;
    private javax.swing.JComboBox cmbListaPrecio;
    private javax.swing.JComboBox cmbListas;
    private javax.swing.JComboBox cmbRtf;
    private javax.swing.JComboBox cmbTipoOperacion;
    private javax.swing.JComboBox cmbVendedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JLabel lbBodega;
    private javax.swing.JLabel lbCar;
    private javax.swing.JLabel lbDiasPlazo;
    private javax.swing.JTextField lbFacturaNo;
    private javax.swing.JLabel lbImpoconsumo;
    private javax.swing.JLabel lbImpuestoBolsa;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit1;
    private javax.swing.JTextField lbNoFactura;
    private javax.swing.JLabel lbObservaciones;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JLabel lbProducto1;
    private javax.swing.JLabel lbRelacion;
    private javax.swing.JLabel lbRelacion1;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTipoOperacion;
    private javax.swing.JLabel lbTipoOperacion1;
    private javax.swing.JLabel lbTotalDescuento;
    private javax.swing.JLabel lbTotalDescuento1;
    private javax.swing.JLabel lbTotalDescuento2;
    private javax.swing.JLabel lbVendedor;
    private javax.swing.JLabel lbVendedor1;
    private javax.swing.JPanel pnlComprobante;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInformacion;
    private javax.swing.JPanel pnlOcultar;
    private javax.swing.JMenuItem popBorrar;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JScrollPane scrInventario;
    private javax.swing.JScrollPane scrProductos1;
    private javax.swing.JTable tblComprobantes;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBodega;
    private javax.swing.JTextField txtCant;
    private javax.swing.JLabel txtCantProductos;
    private javax.swing.JLabel txtCantUnidades;
    private javax.swing.JTextField txtCartera;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtDiasPlazo;
    private javax.swing.JTextField txtFactRelacion;
    private javax.swing.JTextField txtFechaFactura;
    private javax.swing.JTextField txtIdSistema;
    private javax.swing.JLabel txtImpuesto;
    private javax.swing.JLabel txtIva;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtRelacion;
    private javax.swing.JLabel txtRiva;
    private javax.swing.JLabel txtRtf;
    private javax.swing.JLabel txtSubTotal;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtTotalDescuentos;
    private javax.swing.JLabel txtTotalImpoconsumo;
    private javax.swing.JLabel txtTotalIva;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables







private Boolean aplicarFacturacionElectronica(String factura, String factura2, String prefijo, String dsPrefijo) {

        Boolean documentoExitoso = false;

        if (instancias.getConfiguraciones().isFacturaElectronica() && (Boolean) tblComprobantes.getValueAt(0, 2) == true) {

            ndTercero nodoTerc = instancias.getSql().getDatosTercero(txtIdSistema.getText());

            String paisFact = instancias.getConfiguraciones().getPais();

            if (paisFact.equals("Panama")) {
                 documentoExitoso = facturacionElectronicaNDPanama(nodoTerc, factura2);
            } else if (paisFact.equals("Colombia")) {
                 documentoExitoso = facturacionElectronicaNDColombia(nodoTerc,factura,factura2,prefijo,dsPrefijo);
            }
        }

        return documentoExitoso;
    }

    private boolean facturacionElectronicaNDPanama2(ndTercero nodoTerc, String factura2){
        boolean documentoExitoso = false;
            String xml;
            xml = "<?xml version='1.0' encoding='UTF-8' standalone='no'?>"
                    + "<FiscalDoc>"
                    + "<DocType>NOTA DE DEBITO</DocType>"
                    + "<CustomerName>" + nodoTerc.getNombre() + "</CustomerName>"
                    + "<CustomerAddress>" + nodoTerc.getEmail() + "</CustomerAddress>"
                    + "<CustomerRUC>" + nodoTerc.getId() + "</CustomerRUC>"
                    + "<DocNumber>" + factura2 + "</DocNumber>"
                    + "<appliedTo>NC-" + txtRelacion.getText() + "</appliedTo>"
                    + "<AddInfo>"
                    + "<Head>" + instancias.getInformacionEmpresaCompleto().
                            replace("<center>", "").replace("<br />", " ").
                            replace("<html>", "").replace("</html>", "").
                            replace("</center>", "")
                    + "</Head>"
                    + "<Foot>" + instancias.getPie() + "</Foot>"
                    + "</AddInfo>"
                    + "<Items>";

            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                String tipo = "";
                if ((Boolean) tblProductos.getValueAt(i, 37)) {
                    tipo = "01";
                } else {
                    tipo = "02";
                }

                xml = xml + "<Item Code='" + tblProductos.getValueAt(i, 32) + "' "
                        + "Desc='" + tblProductos.getValueAt(i, 1) + "' "
                        + "Qty='" + big.getBigDecimal(tblProductos.getValueAt(i, 3)) + "' "
                        + "Price='" + big.getMoneda(tblProductos.getValueAt(i, 2).toString()) + "' "
                        + "Descuento='" + big.getMoneda(tblProductos.getValueAt(i, 6).toString()) + "' "
                        + "Tax='" + tblProductos.getValueAt(i, 7) + "' "
                        + "type='" + tipo + "' "
                        + "detail='" + tblProductos.getValueAt(i, 27) + "' />";
            }

            Double dsPorcentajeDescuento = Double.parseDouble(big.setNumero(big.getMoneda(txtTotalDescuentos.getText())).replace(".", "").replace(",", "."))
                    / Double.parseDouble(big.setNumero(big.getMoneda(txtSubTotal.getText())).replace(".", "").replace(",", "."));
            dsPorcentajeDescuento = dsPorcentajeDescuento * 100;
            String dsPorcentajeDescuento1 = "0";
            if (df.format(dsPorcentajeDescuento).replace(",", ".").equals(".00")) {
                dsPorcentajeDescuento1 = "0";
            } else {
                dsPorcentajeDescuento1 = df.format(dsPorcentajeDescuento).replace(",", ".");
            }

            xml = xml + "</Items>"
                    + "<DescuentoGlobal>"
                    + "<Descuento desc='" + big.getMoneda(txtTotalDescuentos.getText()) + "' "
                    + "porcentaje='" + dsPorcentajeDescuento1 + "' />"
                    + "</DescuentoGlobal>"
                    + "<Pagos>";

            if (!txtFechaFactura.getText().equals(txtVencimiento.getText())) {
                xml = xml + "<pago desc='CREDITO' "
                        + "value='" + big.getMoneda(txtTotal.getText().replace("Total: ", "")) + "' "
                        + "tipo='4' />";
            } else {
                if (instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) > 0) {
                    xml = xml + "<pago desc='CONTADO' "
                            + "value='" + instancias.getEfectivoDevuelta() + "' "
                            + "tipo='" + 1 + "' />";
                } else if (instancias.getChequeDevuelta().compareTo(BigDecimal.ZERO) > 0 && instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) == 0) {
                    xml = xml + "<pago desc='CONTADO' "
                            + "value='" + instancias.getChequeDevuelta() + "' "
                            + "tipo='" + 4 + "' />";
                } else if (instancias.getTarjetaCredito().compareTo(BigDecimal.ZERO) > 0 && instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) == 0) {
                    xml = xml + "<pago desc='CONTADO' "
                            + "value='" + instancias.getTarjetaCredito() + "' "
                            + "tipo='" + 3 + "' />";
                } else if (instancias.getTarjetaDevuelta().compareTo(BigDecimal.ZERO) > 0 && instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) == 0) {
                    xml = xml + "<pago desc='CONTADO' "
                            + "value='" + instancias.getTarjetaDevuelta() + "' "
                            + "tipo='" + 2 + "' />";
                }
            }

            xml = xml + "</Pagos>"
                    + "<Sucursal>01</Sucursal>"
                    + "<Terminal>0" + instancias.getTerminal().replace("TERM-", "") + "</Terminal>"
                    + "<TotalFactura>" + big.getMoneda(txtTotal.getText().replace("Total: ", "")) + "</TotalFactura>"
                    + "</FiscalDoc>";

            documentoExitoso = true;
            Logs.log("xml: " + xml);
            metodos.crearArchivo(xml, factura2);
                
            return documentoExitoso;

    }
    
    private boolean facturacionElectronicaNDPanama(ndTercero nodoTerc, String factura2){
                JsonObject comprobante = new JsonObject();
                comprobante.addProperty("apicode", Propiedades.getInstancia().getAppiCodePanama());
                comprobante.addProperty("documentNumber", factura2);
                comprobante.addProperty("documentType", "B"); //A = FACTURA D = NOTA DE CREDITO B = NOTA DE DEBITO
                comprobante.addProperty("customerId", nodoTerc.getId());
                comprobante.addProperty("customerName", nodoTerc.getNombre());
                comprobante.addProperty("customerAddress", nodoTerc.getEmail());
                comprobante.addProperty("aplicadoA", "NC-"+txtRelacion.getText());
                
              
                JsonArray items = new JsonArray();
               

                for (int i = 0; i < tblProductos.getRowCount(); i++) {
                    JsonObject item = new JsonObject();
                    String tipo = "";
                    if ((Boolean) tblProductos.getValueAt(i, 37)) {
                        tipo = "01";
                    } else {
                        tipo = "02";
                    }

                   item.addProperty("code", tblProductos.getValueAt(i, 32).toString());
                   item.addProperty("description", tblProductos.getValueAt(i, 1).toString());
                   item.addProperty("qty", big.getBigDecimal(tblProductos.getValueAt(i, 3)));
                   item.addProperty("price", big.getBigDecimal(big.getMoneda(tblProductos.getValueAt(i, 2).toString())));
                   item.addProperty("discount", big.getBigDecimal(big.getMoneda(tblProductos.getValueAt(i, 6).toString())));
                   item.addProperty("discountDescription", tblProductos.getValueAt(i, 27).toString());
                   item.addProperty("tax", tblProductos.getValueAt(i, 7).toString());
                   item.addProperty("type", tipo);
                   if(tipo.equalsIgnoreCase("02")){
                    item.addProperty("detail", tblProductos.getValueAt(i, 27).toString());
                   }
                    
                   items.add(item);
                }
                
                JsonObject pago = new JsonObject();

                if (!txtFechaFactura.getText().equals(txtVencimiento.getText())) {
                    pago.addProperty("title", "otros");
                    pago.addProperty("amount", Double.parseDouble(big.setNumero(big.getMoneda(txtTotal.getText().replace("Total: ", ""))).replace(".", "").replace(",", ".")));
                    pago.addProperty("type", "4");    
                } else {
                    if (instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) > 0) {
                         pago.addProperty("title", "Efectivo");
                         pago.addProperty("amount", Double.parseDouble(big.setNumero(instancias.getEfectivoDevuelta()).replace(".", "").replace(",", ".")));
                         pago.addProperty("type", "1");
                    } else if (instancias.getChequeDevuelta().compareTo(BigDecimal.ZERO) > 0 && instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) == 0) {
                         pago.addProperty("title", "otros");
                         pago.addProperty("amount", Double.parseDouble(big.setNumero(instancias.getChequeDevuelta()).replace(".", "").replace(",", ".")));
                         pago.addProperty("type", "4"); 
                    } else if (instancias.getTarjetaCredito().compareTo(BigDecimal.ZERO) > 0 && instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) == 0) {
                         pago.addProperty("title", "Tarjeta de crédito");
                         pago.addProperty("amount", Double.parseDouble(big.setNumero(instancias.getTarjetaCredito()).replace(".", "").replace(",", ".")));
                         pago.addProperty("type", "3");
                    } else if (instancias.getTarjetaDevuelta().compareTo(BigDecimal.ZERO) > 0 && instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) == 0) {
                         pago.addProperty("title", "Tarjeta de debito");
                         pago.addProperty("amount", Double.parseDouble(big.setNumero(instancias.getTarjetaDevuelta()).replace(".", "").replace(",", ".")));
                         pago.addProperty("type", "2");
                    }
                }
                
                JsonArray payments = new JsonArray();
                payments.add(pago);
                
                comprobante.add("payments", payments);
                comprobante.add("items", items);
                
                
                
                  Double dsPorcentajeDescuento = Double.parseDouble(big.setNumero(big.getMoneda(txtTotalDescuentos.getText())).replace(".", "").replace(",", "."))
                        / Double.parseDouble(big.setNumero(big.getMoneda(txtSubTotal.getText())).replace(".", "").replace(",", "."));
                dsPorcentajeDescuento = dsPorcentajeDescuento * 100;
                String dsPorcentajeDescuento1 = "0";
                if (df.format(dsPorcentajeDescuento).replace(",", ".").equals(".00")) {
                    dsPorcentajeDescuento1 = "0";
                } else {
                    dsPorcentajeDescuento1 = df.format(dsPorcentajeDescuento).replace(",", ".");
                }
                
                JsonArray globalDiscount = new JsonArray();
                JsonObject discount = new JsonObject();
                discount.addProperty("description", ""+big.setNumero(big.getMoneda(txtTotalDescuentos.getText())).replace(".", "").replace(",", "."));
                discount.addProperty("percentaje", dsPorcentajeDescuento1);
                
                
                globalDiscount.add(discount);
                comprobante.add("globalDiscount", globalDiscount);
                
                JsonArray header = new JsonArray();
        
                for (String linea: Utils.dividirTextoEnLineas(9, 42, Utils.quitarEtiquetas(instancias.getInformacionEmpresaCompleto()))) {
                    if(linea!= null && !linea.isEmpty()){
                        JsonElement element = new JsonPrimitive(linea);
                        header.add(element);
                    }
                }
                comprobante.add("header", header);
                         

                
            
                JsonArray footer = new JsonArray();   
       
                for (String linea: Utils.dividirTextoEnLineas(10, 42, Utils.quitarEtiquetas(instancias.getPie()))) {
                    if(linea!= null && !linea.isEmpty()){
                        JsonElement element = new JsonPrimitive(linea);
                        footer.add(element);
                    }
                }
                 
                comprobante.add("footer", footer);
                
            

                Logs.log("json requestComprobante: " + comprobante.toString());
                facturacionElectronicaPanama fep = new facturacionElectronicaPanama();
                String resultado = null;
                try {
                    resultado = fep.consumirServicio("comprobante", comprobante.toString());
                } catch (Exception ex) {
                    Logs.error(ex);
                    
                }  
                
                if(resultado != null){
                     codigoAutorizacion = resultado;
                     return true;
                }else{
                     return false;
                }
  
    }
    
      private String getTipoDocumentoEquivalente(String tipoIdentificacionAdquiriente) {
        if (tipoIdentificacionAdquiriente.equals("Cédula de ciudadanía")) {
            return "CEDULA_CIUDADANIA";
        } else if (tipoIdentificacionAdquiriente.equals("Nit")) {
            return "NIT";
        } else if (tipoIdentificacionAdquiriente.equals("Registro civil")) {
            return "REGISTRO_CIVIL";
        } else if (tipoIdentificacionAdquiriente.equals("Tarjeta de identidad")) {
            return "TARJETA_IDENTIDAD";
        } else if (tipoIdentificacionAdquiriente.equals("Cédula de extranjería")) {
            return "CEDULA_EXTRANJERIA";
        } else if (tipoIdentificacionAdquiriente.equals("Pasaporte")) {
            return "PASAPORTE";
        } else if (tipoIdentificacionAdquiriente.equals("Documento de identificación extranjero")) {
            return "DOC_ID_EXTRANJERO";
        } else if (tipoIdentificacionAdquiriente.equals("NIT de otro país")) {
            return "NIT_OTRO_PAIS";    
        }else if (tipoIdentificacionAdquiriente.equals("PEP")) {
            return "PEP";    
        } else if (tipoIdentificacionAdquiriente.equals("NUIP")) {
            return "NUIP";    
        } else {
            return tipoIdentificacionAdquiriente;
        }
    } 
      
      
    private boolean facturacionElectronicaNDColombia(ndTercero nodoTerc, String factura,String factura2, String prefijo, String dsPrefijo){
        boolean documentoExitoso = false;
        Object[][] paises = instancias.getSql().getPais(nodoTerc.getPais());
        String dsNumeroFactura = factura.replace("ND-", "").replace(prefijo, "");
        String fechaEmision = metodos.fecha4(metodosGenerales.fecha()) + " " + metodosGenerales.fechaHora().split(" ")[1];
        String fechaVencimiento = metodos.fecha4(txtVencimiento.getText());
        String emailAdquiriente = nodoTerc.getEmail();
        String tipoIdentificacionAdquiriente = getTipoDocumentoEquivalente(nodoTerc.getTipo());
        
        String identificacionAdquiriente = nodoTerc.getId();
        String codigoPostalAdquirente = nodoTerc.getCategoria();
        String tipoPersonaAdquiriente = "NATURAL";
        if (nodoTerc.getNaturaleza() != null) {
            if (nodoTerc.getNaturaleza().equals("Persona juridica")) {
                tipoPersonaAdquiriente = "JURIDICA";
            }
        }

        String tipoIdent = "", nombresAdquiriente = "";
        if (null != nodoTerc.getTipo()) {
            tipoIdent = nodoTerc.getTipo();
        }

        if (tipoIdent.equals("Nit") || tipoIdent.equals("NIT de otro país")) {
            nombresAdquiriente = nodoTerc.getNombre();
        } else {
            nombresAdquiriente = nodoTerc.getpNombre();
        }

        String segundoNombre = nodoTerc.getsNombre();
        String primerApellido = nodoTerc.getpApellido();
        String segundoApellido = nodoTerc.getsApellido();
        String direccionAdquiriente = nodoTerc.getDireccion();
        Boolean adquirenteResponsable = nodoTerc.isResponsableIva();
        String regimenAdquirente = "NO_RESPONSABLE_IVA";
        if (adquirenteResponsable) {
            regimenAdquirente = "RESPONSABLE_IVA";
        }

        String telefonoAdquiriente = nodoTerc.getTelefono();
      
        String cdIso = paises[0][2].toString();//"CO";
        String pais = nodoTerc.getPais();
        String ciudad = nodoTerc.getCiudad();
        String departamento = nodoTerc.getDepartamento();

        Object[][] codigo = instancias.getSql().getCodigoLugar(departamento, ciudad);
        String cdDaneDepartamento = codigo[0][0].toString();
        String cdDaneCiudad = codigo[0][1].toString();
        String snDistribucionFisica = "N";
        
        String rtf = cmbRtf.getSelectedItem().toString();
        if (rtf.equals("RtF")) {
            rtf = "0.00";
        }
        double dsPorcentajeReteFuente = Double.parseDouble(rtf);

        int cargoTotal = 0,anticipoTotal = 0;

        String moneda = "COP";

        String dsObservacion = txtObservaciones.getText();
        String tipoDocumentoElectronico = "NOTA_DEBITO";

        String dsNumeroReferencia = "";
        String dsPrefijoReferencia = "";
        String referenciaNotaDebito = txtRelacion.getText();
        int inicio = 0;
        int inicio1 = 1;
        for (int i = 0; i < referenciaNotaDebito.length(); i++) {
            try {
                if (Integer.parseInt(referenciaNotaDebito.substring(inicio, inicio1)) > 0) {
                    dsPrefijoReferencia = referenciaNotaDebito.substring(0, inicio);
                    dsNumeroReferencia = referenciaNotaDebito.substring(inicio, referenciaNotaDebito.length());
                    break;
                }
            } catch (Exception e) {
                Logs.error(e);
            }

            inicio++;
            inicio1++;
        }


        int contadorIvas = 0, contadorImpos = 0;
        Object[][] arregloImpuestosIva = new Object[tblProductos.getRowCount()][3];
        Object[][] arregloImpuestosImpo = new Object[tblProductos.getRowCount()][3];

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            int posicionImpuestoIva = 0, posicionImpuestoImpo = 0;
            Boolean impuestoExistenteIva = false, impuestoExistenteImpo = false;

            for (int j = 0; j < arregloImpuestosIva.length; j++) {
                if (arregloImpuestosIva[j][0] != null) {
                    if (arregloImpuestosIva[j][0].equals(tblProductos.getValueAt(i, 7))) {
                        posicionImpuestoIva = j;
                        impuestoExistenteIva = true;
                    }
                }
            }

            for (int j = 0; j < arregloImpuestosImpo.length; j++) {
                if (arregloImpuestosImpo[j][0] != null) {
                    if (arregloImpuestosImpo[j][0].equals(tblProductos.getValueAt(i, 23))) {
                        posicionImpuestoImpo = j;
                        impuestoExistenteImpo = true;
                    }
                }
            }

            if (impuestoExistenteIva) {
                if(big.getMonedaToDouble(tblProductos.getValueAt(i, 7).toString())>0){
                    arregloImpuestosIva[posicionImpuestoIva][1] = big.formatDouble(big.getBigDecimal(arregloImpuestosIva[posicionImpuestoIva][1].toString())) + big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
                    arregloImpuestosIva[posicionImpuestoIva][2] = big.formatDouble(big.getBigDecimal(arregloImpuestosIva[posicionImpuestoIva][2].toString())) + big.getMonedaToDouble(tblProductos.getValueAt(i, 33).toString());
                }
            } else {
                if(big.getMonedaToDouble(tblProductos.getValueAt(i, 7).toString())>0){
                    arregloImpuestosIva[contadorIvas][0] = big.formatDouble(tblProductos.getValueAt(i, 7).toString());
                    arregloImpuestosIva[contadorIvas][1] = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
                    arregloImpuestosIva[contadorIvas][2] = big.getMonedaToDouble(tblProductos.getValueAt(i, 33).toString());
                    contadorIvas = contadorIvas + 1;
                }
            }

            if (impuestoExistenteImpo) {
                if(big.getMonedaToDouble(tblProductos.getValueAt(i, 23).toString())>0){
                    arregloImpuestosImpo[posicionImpuestoImpo][1] = big.formatDouble(big.getBigDecimal(arregloImpuestosImpo[posicionImpuestoImpo][1].toString())) + big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
                    arregloImpuestosImpo[posicionImpuestoImpo][2] = big.formatDouble(big.getBigDecimal(arregloImpuestosImpo[posicionImpuestoImpo][2].toString())) + big.getMonedaToDouble(tblProductos.getValueAt(i, 8).toString());
                }
            } else {
                if(big.getMonedaToDouble(tblProductos.getValueAt(i, 23).toString())>0){
                    arregloImpuestosImpo[contadorImpos][0] = big.formatDouble(tblProductos.getValueAt(i, 23).toString());
                    arregloImpuestosImpo[contadorImpos][1] = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
                    arregloImpuestosImpo[contadorImpos][2] = big.getMonedaToDouble(tblProductos.getValueAt(i, 8).toString());
                    contadorImpos = contadorImpos + 1;
                }
            }
        }

        double totalIvas = 0.0;
        for (int i = 0; i < contadorIvas; i++) {
            totalIvas =  big.sumaExacta(totalIvas, big.formatDouble(big.getBigDecimal(arregloImpuestosIva[i][2].toString())));
        }

        double totalImpos = 0.0;
        for (int i = 0; i < contadorImpos; i++) {
            totalImpos = big.sumaExacta(totalImpos, big.formatDouble(big.getBigDecimal(arregloImpuestosImpo[i][2].toString())));
        }


        String tipoOperacion = cmbTipoOperacion.getSelectedItem().toString();
        int fila = 0;
        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
            for (int J = 0; J < tblComprobantes.getColumnCount(); J++) {
                System.err.println(i+") ver "+J+")  ->"+tblComprobantes.getValueAt(i, J));
            }
            if ((Boolean) tblComprobantes.getValueAt(i, 2)) {
                fila = i;
            }
        }
        String dsResolucionDian = tblComprobantes.getValueAt(fila, 3).toString();
        String versionDian = "2";

        //String[] responsabilidades = datos[113].toString().split(", ");
        String[] responsabilidades = {"R-99-PN /No responsable"};
        String responsabilidadesFiscales = "";
        for (int i = 0; i < responsabilidades.length; i++) {
            responsabilidadesFiscales = responsabilidadesFiscales + responsabilidades[i].split(" /")[0] + ";";
        }
        if (!responsabilidadesFiscales.equals("")) {
            responsabilidadesFiscales = responsabilidadesFiscales.substring(0, responsabilidadesFiscales.length() - 1);
            Logs.log("responsabilidadesFiscales: " + responsabilidadesFiscales);
        }

        //ESTOS SON LOS METODOS DE PAGO
        String minutos = metodosGenerales.hora().split(":")[0], segundos = metodosGenerales.hora().split(":")[1];
        if (minutos.length() == 1) {
            minutos = "0" + minutos;
        }

        if (segundos.length() == 1) {
            segundos = "0" + segundos;
        }

        Object[] metodosPagos = new Object[4];
        if (!txtFechaFactura.getText().equals(txtVencimiento.getText())) {
            metodosPagos[0] = "CREDITO";
            metodosPagos[1] = "CREDITO_ACH";
            metodosPagos[2] = fechaVencimiento + " " + minutos + ":" + segundos + ":00";
            metodosPagos[3] = "";
        } else {
            if (instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) > 0) {
                metodosPagos[0] = "CONTADO";
                metodosPagos[1] = "EFECTIVO";
                metodosPagos[2] = fechaVencimiento + " " + minutos + ":" + segundos + ":00";
                metodosPagos[3] = instancias.getSql().getIDPago(factura2, "EFECTIVO");
            } else if (instancias.getChequeDevuelta().compareTo(BigDecimal.ZERO) > 0 && instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) == 0) {
                metodosPagos[0] = "CONTADO";
                metodosPagos[1] = "CHEQUE";
                metodosPagos[2] = fechaVencimiento + " " + minutos + ":" + segundos + ":00";
                metodosPagos[3] = instancias.getSql().getIDPago(factura2, "CHEQUE");
            } else if (instancias.getTarjetaCredito().compareTo(BigDecimal.ZERO) > 0 && instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) == 0) {
                metodosPagos[0] = "CONTADO";
                metodosPagos[1] = "TARJETA_CREDITO";
                metodosPagos[2] = fechaVencimiento + " " + metodosGenerales.hora() + ":00";
                metodosPagos[3] = instancias.getSql().getIDPago(factura2, "TARJETA_CREDITO");
            } else if (instancias.getTarjetaDevuelta().compareTo(BigDecimal.ZERO) > 0 && instancias.getEfectivoDevuelta().compareTo(BigDecimal.ZERO) == 0) {
                metodosPagos[0] = "CONTADO";
                metodosPagos[1] = "TARJETA_DEBITO";
                metodosPagos[2] = fechaVencimiento + " " + minutos + ":" + segundos + ":00";
                metodosPagos[3] = instancias.getSql().getIDPago(factura2, "TARJETA_DEBITO");
            }
        }

        String dsNumeroFacturaReferencia = "";
        String dsPrefijoFacturaReferencia = "";
        String referenciaFactura = txtFactRelacion.getText();
        int inicio3 = 0;
        int inicio2 = 1;
        for (int i = 0; i < referenciaFactura.length(); i++) {
            try {
                if (Integer.parseInt(referenciaFactura.substring(inicio3, inicio2)) > 0) {
                    dsPrefijoFacturaReferencia = referenciaFactura.substring(0, inicio3);
                    dsNumeroFacturaReferencia = referenciaFactura.substring(inicio3, referenciaFactura.length());
                    break;
                }
            } catch (Exception e) {
                Logs.error(e);
            }

            inicio3++;
            inicio2++;
        }
       
        //se crea el json 


        JsonObject adquiriente = new JsonObject();
        adquiriente.addProperty("dsPrefijo", dsPrefijo);
        adquiriente.addProperty("dsNumeroFactura", dsNumeroFactura);
        adquiriente.addProperty("fechaEmision", fechaEmision);
        adquiriente.addProperty("fechaVencimiento", fechaVencimiento);
        adquiriente.addProperty("emailAdquiriente", emailAdquiriente);
        adquiriente.addProperty("tipoIdentificacionAdquiriente", tipoIdentificacionAdquiriente);
        adquiriente.addProperty("identificacionAdquiriente", identificacionAdquiriente);
        if(nodoTerc.getId().contains("-")){
             String digitoVerificacionAdquirente = nodoTerc.getId().split("-")[1];
             adquiriente.addProperty("digitoVerificacionAdquirente", digitoVerificacionAdquirente);
        }
        adquiriente.addProperty("codigoPostalAdquirente", codigoPostalAdquirente);
        adquiriente.addProperty("tipoPersonaAdquiriente", tipoPersonaAdquiriente);
        adquiriente.addProperty("nombresAdquiriente", nombresAdquiriente);
        adquiriente.addProperty("segundoNombre", segundoNombre);
        adquiriente.addProperty("primerApellido", primerApellido);
        adquiriente.addProperty("segundoApellido", segundoApellido);
        adquiriente.addProperty("direccionAdquiriente", direccionAdquiriente);
        adquiriente.addProperty("adquirenteResponsable", ""+adquirenteResponsable);
        adquiriente.addProperty("regimenAdquirente", regimenAdquirente);
        adquiriente.addProperty("telefonoAdquiriente", telefonoAdquiriente);
        adquiriente.addProperty("snDistribucionFisica",snDistribucionFisica);
        if(dsObservacion.isEmpty()){
             adquiriente.addProperty("dsObservacion","");
        }else{
             adquiriente.addProperty("dsObservacion", dsObservacion);
        }
        adquiriente.addProperty("tipoDocumentoElectronico",tipoDocumentoElectronico);
        adquiriente.addProperty("cargoTotal",formatVal(cargoTotal));
        adquiriente.addProperty("anticipoTotal",formatVal(anticipoTotal));
        adquiriente.addProperty("moneda",moneda);
 
        adquiriente.addProperty("tipoOperacion",tipoOperacion);
        adquiriente.addProperty("dsResolucionDian",dsResolucionDian);
        adquiriente.addProperty("versionDian",versionDian);
        adquiriente.addProperty("responsabilidadesFiscales",responsabilidadesFiscales);

        JsonArray facturasReferencia = new JsonArray();
        JsonObject facturaRef = new JsonObject();
        
        facturaRef.addProperty("prefijo", dsPrefijoFacturaReferencia);
        facturaRef.addProperty("numero", dsNumeroFacturaReferencia);
        facturaRef.addProperty("conceptoNotaDebito", cmbConcepto.getSelectedItem().toString());
        facturaRef.addProperty("descripcion", txtObservaciones.getText());
        
        facturasReferencia.add(facturaRef);
        adquiriente.add("facturasReferencia", facturasReferencia);
        
        //se adiciona la ciudad
        JsonObject ciudadAdquiriente = new JsonObject();

        ciudadAdquiriente.addProperty("cdDane", cdDaneCiudad);
        ciudadAdquiriente.addProperty("dsNombre", ciudad);

        JsonObject departamentoAdquiriente = new JsonObject();
        departamentoAdquiriente.addProperty("cdDane", cdDaneDepartamento);        
        departamentoAdquiriente.addProperty("dsNombre", departamento);
        departamentoAdquiriente.addProperty("cdIso", cdIso+"-"+departamento.substring(0,3));

        JsonObject paisAdquiriente = new JsonObject();
        paisAdquiriente.addProperty("cdIso", cdIso);
        paisAdquiriente.addProperty("dsNombre", pais);

        departamentoAdquiriente.add("pais", paisAdquiriente);

        ciudadAdquiriente.add("departamento", departamentoAdquiriente);

        adquiriente.add("ciudadAdquiriente", ciudadAdquiriente);
        //fin adicion ciudad

        JsonObject pagoJson = new JsonObject();
        pagoJson.addProperty("formaPago",  ""+metodosPagos[0]);
        pagoJson.addProperty("medioPago", ""+metodosPagos[1]);
        if (!txtFechaFactura.getText().equals(txtVencimiento.getText())) {
           pagoJson.addProperty("fechaVencimientoPago", ""+metodosPagos[2]);
        //pagoJson.addProperty("idPago", ""+metodosPagos[3]);
        }

        Logs.log("adquiriente: " + adquiriente.toString());

        Logs.log("pago: " + pagoJson.toString());
        adquiriente.add("pago", pagoJson);
                
        
        
        JsonArray impuestosRetenciones = new JsonArray();
        if(contadorIvas > 0){
            JsonObject impuestosRetencionesIva = new JsonObject();
            JsonArray arraySubTotalesIva = new JsonArray();

            impuestosRetencionesIva.addProperty("valorTotal", formatVal(totalIvas));
            impuestosRetencionesIva.add("subtotales", arraySubTotalesIva);



            for (int i = 0; i < contadorIvas; i++) {
                JsonObject subTotal = new JsonObject();
                subTotal.addProperty("valorBase", formatVal(big.formatDouble(arregloImpuestosIva[i][1].toString())));
                subTotal.addProperty("valorImpuestoRetencion", formatVal(big.formatDouble(arregloImpuestosIva[i][2].toString())));
                subTotal.addProperty("porcentaje", formatVal(big.formatDouble(arregloImpuestosIva[i][0].toString())));
                subTotal.addProperty("tributo", "IVA");
                arraySubTotalesIva.add(subTotal);
            }
            impuestosRetenciones.add(impuestosRetencionesIva);
        }
  

        //Cadena del impoconsumo
        if(contadorImpos > 0){
            JsonObject impuestosRetencionesInc = new JsonObject();
            JsonArray arraySubTotalesInc = new JsonArray();

            impuestosRetencionesInc.addProperty("valorTotal", formatVal(totalImpos));
            impuestosRetencionesInc.add("subtotales", arraySubTotalesInc);

            for (int i = 0; i < contadorImpos; i++) {
                JsonObject subTotal = new JsonObject();
                subTotal.addProperty("valorBase", formatVal(big.formatDouble(arregloImpuestosImpo[i][1].toString())));
                subTotal.addProperty("valorImpuestoRetencion", formatVal(big.formatDouble(arregloImpuestosImpo[i][2].toString())));
                subTotal.addProperty("porcentaje", formatVal(big.formatDouble(arregloImpuestosImpo[i][0].toString())));  
                subTotal.addProperty("tributo", "INC");
                arraySubTotalesInc.add(subTotal);        
            }
            impuestosRetenciones.add(impuestosRetencionesInc);
        }

        if (big.getMonedaToDouble(txtRiva.getText()) > 0) {

            JsonObject impuestosRetencionesRteIva = new JsonObject();
            JsonArray arraySubTotalesRteIva = new JsonArray();

            impuestosRetencionesRteIva.addProperty("valorTotal", formatVal(totalImpos));
            impuestosRetencionesRteIva.add("subtotales", arraySubTotalesRteIva);
            JsonObject subTotal = new JsonObject();

            subTotal.addProperty("valorBase", formatVal(big.getMonedaToDouble(txtTotalIva.getText())));
            subTotal.addProperty("valorImpuestoRetencion", formatVal(big.getMonedaToDouble(txtRiva.getText())));
            subTotal.addProperty("porcentaje", "15.00");
            subTotal.addProperty("tributo", "RETE_IVA");
            arraySubTotalesRteIva.add(subTotal);  
            impuestosRetenciones.add(impuestosRetencionesRteIva);
        }

        if (big.getMonedaToDouble(txtRtf.getText()) > 0) {
            JsonObject impuestosRetencionesRteFuente = new JsonObject();
            JsonArray arraySubTotalesRteFuente = new JsonArray();

            impuestosRetencionesRteFuente.addProperty("valorTotal", formatVal(big.getMonedaToDouble(txtRtf.getText())));
            impuestosRetencionesRteFuente.add("subtotales", arraySubTotalesRteFuente);
            JsonObject subTotal = new JsonObject();

            subTotal.addProperty("valorBase",""+ formatVal(big.getMonedaToDouble(txtSubTotal.getText())));
            subTotal.addProperty("valorImpuestoRetencion", formatVal(big.getMonedaToDouble(txtRtf.getText())));
            subTotal.addProperty("porcentaje", formatVal(dsPorcentajeReteFuente));
            subTotal.addProperty("tributo", "RETE_FUENTE");
            arraySubTotalesRteFuente.add(subTotal);  
            impuestosRetenciones.add(impuestosRetencionesRteFuente);
        }
        
        JsonObject impuestosRetencionesImpBolsa = new JsonObject();
        JsonArray arraySubTotalesImpBolsa = new JsonArray();

        impuestosRetencionesImpBolsa.addProperty("valorTotal", formatVal(totalImpos));
        impuestosRetencionesImpBolsa.add("subtotales", arraySubTotalesImpBolsa);

        
        Logs.log("impuestosRetenciones: " + impuestosRetenciones.toString());

        if(impuestosRetenciones.size() >0){
             adquiriente.add("impuestosRetenciones", impuestosRetenciones);
        }else{
             adquiriente.add("impuestosRetenciones", new JsonArray());
        }

        double valorBaseImponible = 0.00;
        Object[][] detalladoProductos = new Object[tblProductos.getRowCount()][20];




        double valorBrutoTotal = 0.0;
        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            //se valida el impuesto a la bolsa
            if (tblProductos.getValueAt(i, 0).equals("IMP01")) {
                JsonObject subTotal = new JsonObject();

                double totalBolsas = big.getMonedaToDouble(tblProductos.getValueAt(i, 2).toString());


                subTotal.addProperty("valorBase",formatVal(totalBolsas));
                subTotal.addProperty("valorImpuestoRetencion", formatVal(big.getMonedaToDouble(txtImpuesto.getText())));
                subTotal.addProperty("porcentaje", "0.00");
                subTotal.addProperty("tributo", "BOLSAS");
                subTotal.addProperty("unidadMedida", tblProductos.getValueAt(i, 36).toString());
                subTotal.addProperty("valorUnitario", formatVal(totalBolsas));
                arraySubTotalesImpBolsa.add(subTotal);  
            }

            //numeroFactura
            detalladoProductos[i][0] = factura.replace("ND-", "");

            //codigoArticulo
            detalladoProductos[i][1] = tblProductos.getValueAt(i, 0);

            //estandarProducto
            String estandar = tblProductos.getValueAt(i, 35).toString();
            if (estandar.equals("Código Estándar de Productos y Servicios de Naciones Unidas")) {
                estandar = "UNSPSC";
            } else if (estandar.equals("Números Globales de Identificación de Productos")) {
                estandar = "GTIN";
            } else if (estandar.equals("Partida Arancelaria")) {
                estandar = "PARTIDA_ARANCELARIA";
            } else if (estandar.equals("Estándar de adopción del contribuyente")) {
                estandar = "ESTANDAR_CONTRIBUYENTE";
            }
            detalladoProductos[i][2] = estandar;

            //descripcionArticulo
            detalladoProductos[i][3] = tblProductos.getValueAt(i, 1);

            //porcentajeIva
            double porcIva = big.getMonedaToDouble(tblProductos.getValueAt(i, 7).toString());                   
            detalladoProductos[i][4] = porcIva;

            //porcentajeIca
            detalladoProductos[i][5] = "0.00";

            //porcentajeConsumo
            double porcImpo = big.getMonedaToDouble(tblProductos.getValueAt(i, 23).toString()); 
            detalladoProductos[i][6] = porcImpo;

            //cantidad
            double cantidad = big.getMonedaToDouble(tblProductos.getValueAt(i, 3).toString());
            detalladoProductos[i][7] = cantidad;

            //precioUnitario
            double precioUnitario = big.getMonedaToDouble(tblProductos.getValueAt(i, 2).toString());  
            detalladoProductos[i][8] = precioUnitario;

            //valorTotalArticulo
            double valorTotalArticulo = big.getMonedaToDouble(tblProductos.getValueAt(i, 9).toString())/ big.getMonedaToDouble(tblProductos.getValueAt(i, 3).toString());

            detalladoProductos[i][9] = valorTotalArticulo;

            //valorIva
            double valorIva = big.getMonedaToDouble(tblProductos.getValueAt(i, 33).toString());
            detalladoProductos[i][10] = valorIva;

             //valorImpo
            double valorImpo = big.getMonedaToDouble(tblProductos.getValueAt(i, 8).toString());
            detalladoProductos[i][11] = valorImpo;

            //unidadMedida
            detalladoProductos[i][12] = tblProductos.getValueAt(i, 36).toString();

            //valorTotalBruto
            if (instancias.isPvpConIva() && instancias.isPvpConImpoconsumo()) {
                double valorTotalBruto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
                //valorTotalBruto = valorTotalBruto - (valorImpo + valorIva);
                valorBrutoTotal+=valorTotalBruto;
                detalladoProductos[i][13] = valorTotalBruto;
            }else if (instancias.isPvpConImpoconsumo()) {
                double valorTotalBruto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());

                //valorTotalBruto = valorTotalBruto - valorImpo;
                valorBrutoTotal+=valorTotalBruto;
                detalladoProductos[i][13] = valorTotalBruto;

            }else if (instancias.isPvpConIva()) {
                double valorTotalBruto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());

                //valorTotalBruto = valorTotalBruto -  valorIva;
                valorBrutoTotal+=valorTotalBruto;
                detalladoProductos[i][13] = valorTotalBruto;
            } else {
                double valorTotalBruto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());

                valorBrutoTotal+=valorTotalBruto;
                detalladoProductos[i][13] = valorTotalBruto;
            }

            //unidadesEmpaque
            detalladoProductos[i][14] = big.getMonedaToDouble(tblProductos.getValueAt(i, 13).toString()) / big.getMonedaToDouble(tblProductos.getValueAt(i, 3).toString());

            //valorTotalImpuestosRetenciones
            double valorTotalImpuestosRetenciones = big.getMonedaToDouble(tblProductos.getValueAt(i, 8).toString())
                    + big.getMonedaToDouble(tblProductos.getValueAt(i, 33).toString());

            detalladoProductos[i][17] = valorTotalImpuestosRetenciones;

            //codigoVendedor
            String codigoVendedor = instancias.getSql().getIdEmpleado(cmbVendedor.getSelectedItem().toString());
            detalladoProductos[i][18] = codigoVendedor;

            //detalle Producto
            detalladoProductos[i][19] = tblProductos.getValueAt(i, 27);

            detalladoProductos[i][19] = tblProductos.getValueAt(i, 27);


        }
        

        if(arraySubTotalesImpBolsa.size() >0){
              impuestosRetenciones.add(impuestosRetencionesImpBolsa);
        }


        JsonArray arrayDetalles = new JsonArray();

        double valorDescuento = 0.0;
        JsonArray arraydescuentosGeneral = new JsonArray();
        for (int i = 0; i < tblProductos.getRowCount(); i++) {

            JsonObject detalle = new JsonObject();
            detalle.addProperty("numeroFactura", detalladoProductos[i][0].toString().replace("ND", ""));
            detalle.addProperty("codigoArticulo", ""+detalladoProductos[i][1].toString());
            //detalle.addProperty("estandarProducto", ""+ detalladoProductos[i][2]);
            detalle.addProperty("descripcionArticulo", ""+detalladoProductos[i][3].toString());
            detalle.addProperty("cantidad", formatVal(big.getBigDecimal(detalladoProductos[i][7].toString())));                
            detalle.addProperty("precioUnitario", formatVal(big.formatDouble(detalladoProductos[i][8].toString())));
            detalle.addProperty("valorTotalArticulo", formatVal(big.formatDouble(detalladoProductos[i][9].toString())));
            //detalle.addProperty("nota", ""+detalladoProductos[i][19]);
            //detalle.addProperty("observacionDetalle", ""+detalladoProductos[i][19]);
            detalle.addProperty("unidadMedida", ""+detalladoProductos[i][12].toString());
            detalle.addProperty("valorTotalBruto", formatVal(big.formatDouble(detalladoProductos[i][13].toString())));
            detalle.addProperty("valorTotalImpuestosRetenciones", formatVal(big.formatDouble(detalladoProductos[i][17].toString())+big.getMonedaToDouble(txtRtf.getText())));

            //detalle.addProperty("porcentajeIva", ""+detalladoProductos[i][4]);
            //detalle.addProperty("porcentajeIca", ""+detalladoProductos[i][5]);
            //detalle.addProperty("porcentajeConsumo", ""+detalladoProductos[i][6]);

            //detalle.addProperty("valorIva", ""+detalladoProductos[i][10]);

            //detalle.addProperty("unidadesEmpaque", ""+detalladoProductos[i][14]);

            //detalle.addProperty("codigoVendedor", ""+detalladoProductos[i][18] );

            if (big.getBigDecimal(tblProductos.getValueAt(i, 5)).compareTo(big.getBigDecimal("0")) > 0) {
                Logs.error("ENTRO POR DESCUENTOS ");
                JsonArray cargosDescuentos = new JsonArray();
                boolean descuentoExiste = false;
                JsonObject descuento = new JsonObject();
                descuento.addProperty("tipo", ""+false);
                descuento.addProperty("codigoDescuento",""+tblProductos.getValueAt(i, 31).toString().split("///")[0]);
                descuento.addProperty("razon",""+tblProductos.getValueAt(i, 31).toString().split("///")[1]);  
                descuento.addProperty("porcentaje", formatVal(big.formatDouble(tblProductos.getValueAt(i, 5).toString())));

                double valorDesc = big.getMonedaToDouble(tblProductos.getValueAt(i, 6).toString());

                valorDescuento = valorDescuento + valorDesc;
                descuento.addProperty("valor", formatVal(valorDesc));
                descuento.addProperty("valorBase", formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i, 9).toString())));
                cargosDescuentos.add(descuento);
                JsonObject descuentoTmp = null;
                for (JsonElement cargosDescuento : arraydescuentosGeneral) {
                    descuentoTmp = cargosDescuento.getAsJsonObject();
                    String codigoDescuento = tblProductos.getValueAt(i, 31).toString().split("///")[0];
                    
                    if (descuentoTmp != null && descuentoTmp.get("codigoDescuento").getAsString().equalsIgnoreCase(codigoDescuento) && descuentoTmp.get("porcentaje").getAsString().equalsIgnoreCase(descuento.get("porcentaje").getAsString())) {
                        valorDesc = descuentoTmp.get("valor").getAsDouble()+valorDesc;

                        descuentoTmp.addProperty("valor", formatVal(valorDesc));
                        descuentoTmp.addProperty("valorBase", formatVal(descuentoTmp.get("valorBase").getAsDouble()+big.getMonedaToDouble(tblProductos.getValueAt(i, 9).toString())));
                        descuentoExiste = true;
                    }
                }
                if(!descuentoExiste){ 
                    descuentoTmp = deepCopy(descuento.getAsJsonObject(), JsonObject.class);
                    arraydescuentosGeneral.add(descuentoTmp);
                }
                detalle.add("cargosDescuentos", cargosDescuentos);

            }


            JsonArray impuestosRetencionesProducto = new JsonArray();
            boolean baseSumada = false;
            if (detalladoProductos[i][1].toString().equals("IMP01")) {
                JsonObject impuestoRetencionBolsa = new JsonObject();
                JsonArray subTotales = new JsonArray();

                impuestoRetencionBolsa.addProperty("valorTotal", formatVal(big.getMonedaToDouble(txtImpuesto.getText())));
                impuestoRetencionBolsa.add("subtotales", subTotales);
                JsonObject subTotal = new JsonObject();

                subTotal.addProperty("valorBase", formatVal(big.formatDouble(detalladoProductos[i][8].toString())));
                subTotal.addProperty("valorImpuestoRetencion", formatVal(big.getMonedaToDouble(datos[53].toString())));
                subTotal.addProperty("porcentaje", "0.00");
                subTotal.addProperty("tributo", "BOLSAS");
                subTotal.addProperty("unidadMedida","" + detalladoProductos[i][12]);
                subTotal.addProperty("valorUnitario",formatVal(big.formatDouble(detalladoProductos[i][8].toString())));

                subTotales.add(subTotal);  
                impuestosRetencionesProducto.add(impuestoRetencionBolsa);
            }

            double baseImponibleProducto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());

            if (cmbRtf.getSelectedIndex() > 0) {
                JsonObject impuestoRetencionRtf = new JsonObject();
                JsonArray subTotalesRtf = new JsonArray();

                impuestoRetencionRtf.addProperty("valorTotal", formatVal(big.formatDouble(baseImponibleProducto*(Double.valueOf(cmbRtf.getSelectedItem().toString())/100))));
                impuestoRetencionRtf.add("subtotales", subTotalesRtf);
                JsonObject subTotalRtf = new JsonObject();


                subTotalRtf.addProperty("valorBase",formatVal(baseImponibleProducto));
                subTotalRtf.addProperty("valorImpuestoRetencion",formatVal(big.formatDouble(baseImponibleProducto*(Double.valueOf(cmbRtf.getSelectedItem().toString())/100))));
                subTotalRtf.addProperty("porcentaje", formatVal(cmbRtf.getSelectedItem().toString()));
                subTotalRtf.addProperty("tributo","RETE_FUENTE");

                subTotalesRtf.add(subTotalRtf);  
                impuestosRetencionesProducto.add(impuestoRetencionRtf);
            }


            if (big.getMonedaToDouble(tblProductos.getValueAt(i, 33).toString()) > 0) {
                JsonObject impuestoRetencionIva = new JsonObject();
                JsonArray subTotalesIva = new JsonArray();

                impuestoRetencionIva.addProperty("valorTotal", formatVal(big.formatDouble(detalladoProductos[i][10].toString())));
                impuestoRetencionIva.add("subtotales", subTotalesIva);
                JsonObject subTotalIva = new JsonObject();


                subTotalIva.addProperty("valorBase",formatVal(baseImponibleProducto));
                subTotalIva.addProperty("valorImpuestoRetencion",formatVal(big.formatDouble(detalladoProductos[i][10].toString())));
                subTotalIva.addProperty("porcentaje", formatVal(big.formatDouble(tblProductos.getValueAt(i, 7).toString())));
                subTotalIva.addProperty("tributo","IVA");

                subTotalesIva.add(subTotalIva);  
                impuestosRetencionesProducto.add(impuestoRetencionIva);
                
                if(!baseSumada){
                    valorBaseImponible = big.formatDouble(valorBaseImponible + baseImponibleProducto);
                    baseSumada = true;
                }
            }

            if (big.getMonedaToDouble(tblProductos.getValueAt(i, 8).toString()) > 0) {
                JsonObject impuestoRetencionInc = new JsonObject();
                JsonArray subTotalesInc = new JsonArray();

                impuestoRetencionInc.addProperty("valorTotal", formatVal(big.formatDouble(detalladoProductos[i][11].toString())));
                impuestoRetencionInc.add("subtotales", subTotalesInc);
                JsonObject subTotalInc = new JsonObject();

                subTotalInc.addProperty("valorBase", formatVal(baseImponibleProducto));
                subTotalInc.addProperty("valorImpuestoRetencion", formatVal(big.formatDouble(detalladoProductos[i][11].toString())));
                subTotalInc.addProperty("porcentaje",formatVal(big.formatDouble(tblProductos.getValueAt(i, 23).toString())));
                subTotalInc.addProperty("tributo","INC");

                subTotalesInc.add(subTotalInc);  
                impuestosRetencionesProducto.add(impuestoRetencionInc);
                if(!baseSumada){
                    valorBaseImponible = big.formatDouble(valorBaseImponible + baseImponibleProducto);
                    baseSumada = true;
                }
            }
            if(impuestosRetencionesProducto.size() > 0){
                detalle.add("impuestosRetenciones",impuestosRetencionesProducto);
            }
            arrayDetalles.add(detalle);
        }

        adquiriente.addProperty("valorBaseImponible", formatVal(valorBaseImponible));
        Logs.log("arrayDetalles: " + arrayDetalles.toString());
        adquiriente.add("detalles", arrayDetalles);

        if (valorDescuento > 0){
            Logs.log("arraydescuentos: " + arraydescuentosGeneral.toString());
            adquiriente.add("cargosDescuentos", arraydescuentosGeneral);
        }

//        double valorBrutoMasTributos = valorBrutoTotal+totalIvas+totalImpos;
//        double varloNeto = (valorBrutoTotal+totalIvas+totalImpos) - valorDescuento;
        double valorBrutoMasTributos = big.formatDouble(valorBrutoTotal+totalIvas+totalImpos);
        double varloNeto = big.formatDouble((valorBrutoTotal+totalIvas+totalImpos) - valorDescuento);

        adquiriente.addProperty("valorBruto",formatVal(valorBrutoTotal));
        adquiriente.addProperty("valorNeto",formatVal(varloNeto));
        adquiriente.addProperty("valorBrutoMasTributos",formatVal(valorBrutoMasTributos));
        adquiriente.addProperty("descuentoTotal",formatVal(valorDescuento));

        Logs.log("json: " + adquiriente.toString());   
        
        setBtwNotaDebito(adquiriente,detalladoProductos);

        facturacionElectronica facturacion = new facturacionElectronica(instancias.getNitEmisor(),instancias.getTokenEmisor());

        try {
            documentoExitoso = facturacion.consumirServicio2(adquiriente.toString(), true);
        } catch (Exception ex) {
           Logs.error(ex);
        }
        return documentoExitoso;
    }
    
    private String setBtwNotaDebito(JsonObject adquiriente, Object[][] detalladoProductos){
      
   JsonObject notasDebito = new JsonObject();
   JsonObject jsonNotaDebito = new JsonObject();
   // CREAR EL JSON CON LOS VALORES DE LOS CAMPOS A ENVIAR
   
   notasDebito.addProperty("company", instancias.getNitEmisor().split("-")[0]);
   notasDebito.addProperty("invoiceType", "DebitNoteType");
   notasDebito.addProperty("invoiceNum",adquiriente.get("dsNumeroFactura").getAsString());
   notasDebito.addProperty("legalNumber",lbNoFactura.getText());
   notasDebito.addProperty("invoiceRef",txtFactRelacion.getText());
   notasDebito.addProperty("custNum",txtNit.getText());
   ndTercero nodoTerc2 = instancias.getSql().getDatosTercero(txtIdSistema.getText());
   notasDebito.addProperty("contactName",nodoTerc2.getNombre());
   notasDebito.addProperty("customerName",nodoTerc2.getNombre());
   
   String fechaEmision = formatoFecha(adquiriente.get("fechaEmision").getAsString(),"yyyy-MM-dd HH:mm:ss","MM/dd/yyyy");
   String fechaVencimiento = formatoFecha(adquiriente.get("fechaVencimiento").getAsString(),"yyyy-MM-dd","MM/dd/yyyy");
      
   notasDebito.addProperty("invoiceDate",fechaEmision);
   notasDebito.addProperty("dueDate",fechaVencimiento);
   
   String valorNumero = eliminarCaracteres(txtSubTotal.getText(),"$","");
   int subTotalFactura = Integer.parseInt(valorNumero);
   notasDebito.addProperty("dspDocSubTotal",subTotalFactura);
   
   String valorNumeroIva = eliminarCaracteres(txtTotalIva.getText(),"$","");
   String valorTotalImpoconsumo = eliminarCaracteres(txtTotalImpoconsumo.getText(),"$","");
   int ivaFactura = Integer.parseInt(valorNumeroIva) + Integer.parseInt(valorTotalImpoconsumo); // se agrega valor de impoconsumo validar
   notasDebito.addProperty("docTaxAmt",ivaFactura);   
   String valortxtRiva = eliminarCaracteres(txtRiva.getText(),"$","");
   String valortxtRtf = eliminarCaracteres(txtRtf.getText(),"$","");
   int valorRetensiones = Integer.parseInt(valortxtRiva) + Integer.parseInt(valortxtRtf); // validar si son los dos o uno solo u otro valor
   notasDebito.addProperty("docWHTaxAmt",valorRetensiones);   
  
    String valortxtTotal = eliminarCaracteres(txtTotal.getText(),"Total: $","");
    int valorTotal = Integer.parseInt(valortxtTotal);
    notasDebito.addProperty("dspDocInvoiceAmt",valorTotal);
    
    notasDebito.addProperty("invoiceComment",txtObservaciones.getText());
    notasDebito.addProperty("currencyCodeCurrencyID",adquiriente.get("moneda").getAsString());
    notasDebito.addProperty("currencyCode",adquiriente.get("moneda").getAsString());
      
    String totalDescuentos = eliminarCaracteres(txtTotalDescuentos.getText(),"$","");
    int  valorTotalDescuentos = Integer.parseInt(totalDescuentos);
    notasDebito.addProperty("discount",valorTotalDescuentos);
 
   
    switch(cmbConcepto.getSelectedItem().toString())
    {
     case "INTERESES" :
        notasDebito.addProperty("cmReasonCode_c","1");
        notasDebito.addProperty("cmReasonDesc_c","Intereses");
        break; // break es opcional
    case "GASTOS_COBRAR" :
        notasDebito.addProperty("cmReasonCode_c","2");
        notasDebito.addProperty("cmReasonDesc_c","Gastos por cobrar");
        break; // break es opcional      
    case "CAMBIO_VALOR" :
        notasDebito.addProperty("cmReasonCode_c","3");
        notasDebito.addProperty("cmReasonDesc_c","Cambio del valor");
        break; // break es opcional   
    default :
        notasDebito.addProperty("cmReasonCode_c","4");
        notasDebito.addProperty("cmReasonDesc_c","Otros");
    }
    
    notasDebito.addProperty("dmReasonCode_c","0");
    notasDebito.addProperty("dmReasonDesc_c","0");
        
    JsonObject pagoJson = new JsonObject();
    pagoJson = adquiriente.get("pago").getAsJsonObject();
    
    if (pagoJson.get("formaPago").getAsString().equals("CONTADO")){
            notasDebito.addProperty("PaymentMeansID_c","1");
    } else if (pagoJson.get("formaPago").getAsString().equals("CREDITO")) {
            notasDebito.addProperty("PaymentMeansID_c","2");
    }
    notasDebito.addProperty("PaymentMeansDescription",pagoJson.get("formaPago").getAsString());
    
    //Validar otros medios de pago como se llaman
    String medioPago = codTipoPago(pagoJson.get("medioPago").getAsString());
    
    notasDebito.addProperty("PaymentMeansCode_c",medioPago);

    String fechaEmision2 = formatoFecha(adquiriente.get("fechaEmision").getAsString(),"yyyy-MM-dd HH:mm:ss","dd/MM/yyyy");
    String fechaVencimiento2 = formatoFecha(adquiriente.get("fechaVencimiento").getAsString(),"yyyy-MM-dd","dd/MM/yyyy");
    long diasPlazo = metodos.restarFecha(fechaEmision2,fechaVencimiento2);  
    notasDebito.addProperty("paymentDurationMeasure",Long.toString(diasPlazo));
    notasDebito.addProperty("paymentDueDate",pagoJson.get("fechaVencimientoPago").getAsString());
    String dateCalculationRate = formatoFecha(adquiriente.get("fechaEmision").getAsString(),"yyyy-MM-dd HH:mm:ss","yyyy-MM-dd");
    notasDebito.addProperty("dateCalculationRate_c",dateCalculationRate);
    
    jsonNotaDebito.add("invcHead",notasDebito);
    
 //******* clase InvcDtl*****************************************************
    JsonObject invcDtl = new JsonObject();  
    JsonObject invcTax = new JsonObject(); 
    JsonObject invcDisc = new JsonObject(); 
    JsonObject invcMisc = new JsonObject(); 

    JsonArray arrayinvcDtl = new JsonArray();
    JsonArray arrayinvcTax = new JsonArray();
    JsonArray arrayinvcDisc = new JsonArray();
    JsonArray arrayinvcMisc = new JsonArray();
    
    double valorDescuento = 0;
    
     for (int i = 0; i < tblProductos.getRowCount(); i++) {
            
            invcDtl.addProperty("company",instancias.getNitEmisor().split("-")[0]);
            invcDtl.addProperty("invoiceNum",(String) detalladoProductos[i][0]);
            invcDtl.addProperty("invoiceLine",i+1); 
            invcDtl.addProperty("partNum",(String) tblProductos.getValueAt(i, 0).toString());
            invcDtl.addProperty("lineDesc",(String) tblProductos.getValueAt(i, 1).toString());
            invcDtl.addProperty("partNumPartDescription",(String) tblProductos.getValueAt(i, 1).toString());
            double sellingShipQty =  big.formatDouble(tblProductos.getValueAt(i, 3).toString());
            invcDtl.addProperty("sellingShipQty",sellingShipQty);
            invcDtl.addProperty("salesUM",tblProductos.getValueAt(i, 21).toString());
            String unitPrice = eliminarCaracteres(tblProductos.getValueAt(i, 2).toString(),"$","");
            invcDtl.addProperty("unitPrice",big.formatDouble(unitPrice));
            invcDtl.addProperty("docUnitPrice",big.formatDouble(unitPrice));
            double DocExtPrice = big.formatDouble(unitPrice) * big.formatDouble(tblProductos.getValueAt(i, 3).toString());
            invcDtl.addProperty("docExtPrice",DocExtPrice);
            invcDtl.addProperty("dspDocExtPrice",DocExtPrice);
            invcDtl.addProperty("discountPercent",tblProductos.getValueAt(i, 19).toString());
            double valorDesc = big.getMonedaToDouble(tblProductos.getValueAt(i, 5).toString());
            invcDtl.addProperty("discount",valorDesc);
            invcDtl.addProperty("docDiscount",valorDesc);
            invcDtl.addProperty("dspDocLessDiscount",valorDesc);

            invcDtl.addProperty("dspDocTotalMiscChrg",0);
            invcDtl.addProperty("currencyCode",adquiriente.get("moneda").getAsString());

            arrayinvcDtl.add(invcDtl);
            
            //******* clase InvcTax*****************************************************
          
            invcTax.addProperty("company",instancias.getNitEmisor().split("-")[0]);
            invcTax.addProperty("invoiceNum",adquiriente.get("dsNumeroFactura").getAsString());
            invcTax.addProperty("invoiceLine",i+1); 
            invcTax.addProperty("currencyCode",adquiriente.get("moneda").getAsString());
            String valorIVA = obtenerValorIVA(tblProductos.getValueAt(i, 6).toString()); // VALIDAR CUANTOS NIVELES DE IVA PUEDEN HABER
            invcTax.addProperty("rateCode",valorIVA);
            invcTax.addProperty("docTaxableAmt",DocExtPrice);
            double montoIVA = big.formatDouble(tblProductos.getValueAt(i, 7).toString());
            invcTax.addProperty("taxAmt",montoIVA);
            invcTax.addProperty("docTaxAmt",montoIVA);
            invcTax.addProperty("percent",big.formatDouble(tblProductos.getValueAt(i, 7).toString()));
            if(valorRetensiones > 0){
                invcTax.addProperty("withholdingTax_c",true);
            }else {
                invcTax.addProperty("withholdingTax_c",false);
            }
            
            arrayinvcTax.add(invcTax);
            
            //******* clase invcDisc*****************************************************
     
            invcDisc.addProperty("company",instancias.getNitEmisor().split("-")[0]);
            invcDisc.addProperty("invoiceNum",adquiriente.get("dsNumeroFactura").getAsString());
            invcDisc.addProperty("discCode","00");
            invcDisc.addProperty("description","Descuento no condicionado");
            invcDisc.addProperty("discBaseAmount",big.formatDouble(unitPrice));
            invcDisc.addProperty("discAmt",valorDesc);
            invcDisc.addProperty("docDiscAmt",valorDesc);
            invcDisc.addProperty("discCodeDescription","Descuento no condicionado");
            invcDisc.addProperty("percentage",tblProductos.getValueAt(i, 19).toString());

            arrayinvcDisc.add(invcDisc);
            
            //******* clase invcMisc*****************************************************
            
            invcMisc.addProperty("company",instancias.getNitEmisor().split("-")[0]);
            invcMisc.addProperty("invoiceNum",adquiriente.get("dsNumeroFactura").getAsString());
            invcMisc.addProperty("invoiceLine",i+1);
            invcMisc.addProperty("miscCode","00"); 
            invcMisc.addProperty("description","Descuento no condicionado"); 
            invcMisc.addProperty("miscAmt",valorDesc);    
            invcMisc.addProperty("docMiscAmt",valorDesc);
            invcMisc.addProperty("miscCodeDescription","Descuento no condicionado");
            invcMisc.addProperty("percentage",tblProductos.getValueAt(i, 19).toString());
            invcMisc.addProperty("miscBaseAmt",big.formatDouble(unitPrice));

            arrayinvcMisc.add(invcMisc);
    }
    
     
    jsonNotaDebito.add("invcDtl",arrayinvcDtl);
    jsonNotaDebito.add("invcTax",arrayinvcTax);
 
    jsonNotaDebito.add("invcMisc",arrayinvcMisc);
    
    JsonObject company = new JsonObject(); 

    company.addProperty("company",instancias.getNitEmisor().split("-")[0]);
    company.addProperty("stateTaxID",instancias.getNitEmisor().split("-")[0]);
    company.addProperty("name",nodoConf.getNombre());

    String regimenAdquiriente = setRegimenCodigo(adquiriente.get("regimenAdquirente").getAsString());
    company.addProperty("regimeType_c",regimenAdquiriente);

    company.addProperty("fiscalResposability_c",adquiriente.get("responsabilidadesFiscales").getAsString());
    
    String tipoOperacion = adquiriente.get("tipoDocumentoElectronico").getAsString();
    if (tipoOperacion.equals("NOTA_CREDITO")){
         company.addProperty("operationType_c","20");
    }else if (tipoOperacion.equals("NOTA_DEBITO")){
        company.addProperty("operationType_c","30");
    }
    
    String tipoCompania = adquiriente.get("tipoPersonaAdquiriente").getAsString();
    if (tipoCompania.equals("NATURAL")){
        company.addProperty("companyType_c",2);

    }else if (tipoOperacion.equals("JURIDICA")){
        company.addProperty("companyType_c",1);
    }
 
    String codigoDepartamentos = adquiriente.getAsJsonObject().get("ciudadAdquiriente").getAsJsonObject().get("departamento").getAsJsonObject().get("cdDane").getAsString();
    String nombreDepartamentos = adquiriente.getAsJsonObject().get("ciudadAdquiriente").getAsJsonObject().get("departamento").getAsJsonObject().get("dsNombre").getAsString();
    String codigoPais = adquiriente.getAsJsonObject().get("ciudadAdquiriente").getAsJsonObject().get("departamento").getAsJsonObject().get("pais").getAsJsonObject().get("cdIso").getAsString();
    String nombrePais = adquiriente.getAsJsonObject().get("ciudadAdquiriente").getAsJsonObject().get("departamento").getAsJsonObject().get("pais").getAsJsonObject().get("dsNombre").getAsString();
    
    company.addProperty("state",codigoDepartamentos);
    company.addProperty("stateNum",nombreDepartamentos);
    company.addProperty("city",codigoPais);
    company.addProperty("cityNum",nombrePais);
    
    String tipoIdentificacion =  adquiriente.get("tipoIdentificacionAdquiriente").getAsString();
    String codigoIdentificacion = obtenerTipoIdentificacion(tipoIdentificacion);
    
    company.addProperty("identificationType",codigoIdentificacion);
    company.addProperty("address1",adquiriente.get("direccionAdquiriente").getAsString());
    company.addProperty("country","Colombia");
    company.addProperty("phoneNum",adquiriente.get("telefonoAdquiriente").getAsString());
    company.addProperty("email",adquiriente.get("emailAdquiriente").getAsString());
    company.addProperty("companyOrigin","01");
    company.addProperty("shareholder",false);
    company.addProperty("participationPercent",0);

    jsonNotaDebito.add("company",company);

    //******* clase Customer***********************************************
    JsonObject customer = new JsonObject();
    
    customer.addProperty("company",instancias.getNitEmisor().split("-")[0]);
    //HABLAR CON ANDRES
    customer.addProperty("custID",txtNit.getText());
    customer.addProperty("custNum",txtNit.getText());
    customer.addProperty("resaleID",txtNit.getText());
 
    customer.addProperty("name",nodoTerc2.getNombre());
    customer.addProperty("address1",adquiriente.get("direccionAdquiriente").getAsString());

    customer.addProperty("eMailAddress",adquiriente.get("emailAdquiriente").getAsString());
    customer.addProperty("phoneNum",adquiriente.get("telefonoAdquiriente").getAsString());

    String codigoCuidad = adquiriente.getAsJsonObject().get("ciudadAdquiriente").getAsJsonObject().get("cdDane").getAsString();
    String nombreCiudad = adquiriente.getAsJsonObject().get("ciudadAdquiriente").getAsJsonObject().get("dsNombre").getAsString();

    customer.addProperty("currencyCode",adquiriente.get("moneda").getAsString());
    customer.addProperty("country",nombrePais);
    customer.addProperty("regimeType_c",regimenAdquiriente);
    customer.addProperty("fiscalResposability_c","R-99-PN");
    customer.addProperty("state",nombreDepartamentos);
    customer.addProperty("stateNum",codigoDepartamentos);
 
    customer.addProperty("city",nombreCiudad);
    customer.addProperty("cityNum",codigoCuidad);

    jsonNotaDebito.add("customer",customer);

    //******* clase SalesTRC***********************************************
    
    JsonObject salesTRC = new JsonObject(); 
    JsonArray arraysalesTRC = new JsonArray();
    
    salesTRC.addProperty("company",instancias.getNitEmisor().split("-")[0]);

    if (txtIva.getText().equals("19")){
        salesTRC.addProperty("rateCode","IVA 19");
    }else{
        String valorIVA = "IVA " + txtIva.getText();
        salesTRC.addProperty("rateCode",valorIVA);
    }
    salesTRC.addProperty("taxCode","01");
    salesTRC.addProperty("description","IVA");
    salesTRC.addProperty("idImpDIAN_c","01");
    
    arraysalesTRC.add(salesTRC);
    jsonNotaDebito.add("salesTRC",arraysalesTRC);
 
    //******* clase COOneTime***********************************************
    
    JsonObject coOneTime = new JsonObject(); 
    
    coOneTime.addProperty("company",instancias.getNitEmisor().split("-")[0]);
    coOneTime.addProperty("identificationType",codigoIdentificacion);
    //coOneTime.addProperty("coOneTimeID",adquiriente.get("identificacionAdquiriente").getAsString());
    coOneTime.addProperty("coOneTimeID",txtNit.getText());
    coOneTime.addProperty("companyName",nodoTerc2.getNombre());
    coOneTime.addProperty("countryCode","CO");

    jsonNotaDebito.add("coOneTime",coOneTime);

     //******* clase PrepaidPayment***********************************************
    JsonObject prepaidPayment = new JsonObject(); 
    JsonArray arrayprepaidPayment = new JsonArray();
    
    prepaidPayment.addProperty("prepaidPaymentID_c","Anticipo");
    prepaidPayment.addProperty("paidDate","2017-12-01");
    prepaidPayment.addProperty("paidTime","12:00:00");
    prepaidPayment.addProperty("paidAmount",0);
    prepaidPayment.addProperty("instructionPrepaidPayment_c","No Aplica");

    arrayprepaidPayment.add(prepaidPayment);
    jsonNotaDebito.add("prepaidPayment",arrayprepaidPayment);

    jsonNotaDebito.add("invcDisc",arrayinvcDisc);
    
     //******* clase additionalTag***********************************************
     
    JsonObject additionalTag = new JsonObject(); 
    JsonArray arrayadditionalTag = new JsonArray();
    
    additionalTag.addProperty("company",instancias.getNitEmisor().split("-")[0]);
    additionalTag.addProperty("invoiceNum",adquiriente.get("dsNumeroFactura").getAsString());
    
    arrayadditionalTag.add(additionalTag);
    jsonNotaDebito.add("additionalTag",arrayadditionalTag);
    
    String jsonNC = jsonNotaDebito.toString();
    //ObjectMapper mapper = new ObjectMapper(); 
    
    // ndNotasDebito notaDebito = new ndNotasDebito();
     
    //boolean estadoNotaDebito = notaCredito.consumirServicioApiClickingPosNC(jsonNC,instancias.getNitEmisor());

      //System.err.println("JSON btw "+invcHead.toString());
      return "";
    }
    
      private String obtenerValorIVA(String valorIva){
        
        switch(valorIva)
        {
            case "19" :
                return "IVA 19";
            case "16" :
                return "IVA 16";
            case "14" :
                return "IVA 14";
            case "0" :
                return "IVA 0";
        }
        
        return null;
   
    }
    
      private String setRegimenCodigo(String tipo) {
		String tipoRegimen="";
		if(tipo.equals("NO_RESPONSABLE_IVA")) {
			tipoRegimen="04";	
		}else if(tipo.equals("RESPONSABLE_IVA")) {
			tipoRegimen="05";
		}else {
			tipoRegimen="No aplica";
		}
		return tipoRegimen;
    }
    
    private String codTipoPago(String medioPago) {
	 	String respuesta;
	 	switch(medioPago) {
	 		case "CREDITO_ACH": respuesta="2"; 
		 	case "EFECTIVO": respuesta="10"; 
		 	case "CHEQUE": respuesta="20"; 
		 	case "TARJETA_CREDITO": respuesta="48"; 
		 	case "TARJETA_DEBITO": respuesta="49"; 
	 	    default: respuesta="10";
	 	}
		return respuesta;
    }
    
      
    private String eliminarCaracteres(String cadena, String caraterEliminar, String caracterCambiar){
        
            String valorNumero = cadena.replace(caraterEliminar,caracterCambiar);
            String valorNumeroSinespacio = valorNumero.replace(" ", "");
            String valorNumeroSinPunto = valorNumeroSinespacio.replace(".", "");
            
      return valorNumeroSinPunto;
    }
    
    public String formatoFecha(String fechaCambiar, String formatoEntrada, String formatoSalida)
    {
        DateTimeFormatter formatoDeEntrada = DateTimeFormatter.ofPattern(formatoEntrada);
        DateTimeFormatter formatoDeSalida = DateTimeFormatter.ofPattern(formatoSalida);
        
        LocalDate fecha = LocalDate.parse(fechaCambiar, formatoDeEntrada);
        String fechaString = fecha.format(formatoDeSalida);
     
        return fechaString;

    }
   
    public String obtenerTipoIdentificacion(String tipoIdentificacion) {
   
        switch(tipoIdentificacion)
        {
            case "CEDULA_CIUDADANIA" :
                return "13";
            case "NIT" :
                return "31";
        }
        
        return null;
    }
    
    
    
    
    public <T> T deepCopy(T object, Class<T> type) {
        try {
            Gson gson = new Gson();
            return gson.fromJson(gson.toJson(object, type), type);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private String formatVal(Object numero){
        df.setRoundingMode(RoundingMode.DOWN);
        String dato = df.format(numero).replace(",", ".");
        if(dato.equals(".00")){
           return "0.00";
        }else{
           return dato;
        }
    }
    
}
