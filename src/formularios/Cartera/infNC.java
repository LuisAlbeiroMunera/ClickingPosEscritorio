package formularios.Cartera;
import clases.Btw.CoOneTime;
import clases.Btw.Company;
import clases.Btw.InvcDtl;
import clases.Btw.InvcHead;
import clases.Btw.InvcTax;
import clases.Btw.InvcMisc;
import clases.Btw.Customer;
import clases.Btw.InvcDisc;
import clases.Btw.PrepaidPayment;
import clases.Btw.SalesTRC;
import clases.Btw.AdditionalTag;
import clases.Cartera.ndNc;
import clases.IconCellRenderer;
import clases.Instancias;
import clases.RespuestaServicioPreFactura;
import clases.Utils;
import clases.Ventas.ndFactura;
import clases.Ventas.ndNotasCredito;
import clases.big;
import clases.convertirNumeroALetras;
import clases.facturacionElectronica;
import clases.facturacionElectronicaPanama;
import clases.metodosGenerales;
import clases.productos.ndProducto;
import clases.terceros.ndTercero;  
import clases.SQL;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import configuracion.Propiedades;
import configuracion.dlgSolicitarPermisos;
import configuracion.ndConfiguracion;
import formularios.Ventas.pnlFactura;
import formularios.productos.buscProductos;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logs.Logs;
import java.time.format.DateTimeFormatter;  //clase para formatear fechas y horas
import java.time.LocalDate;  //clase para representar fechas.


public class infNC extends javax.swing.JInternalFrame {
    String valorFila = null;
    DefaultTableModel modeloPro;
    DefaultTableModel modelo;
    metodosGenerales metodos = new metodosGenerales();
    Instancias instancias;
    ndConfiguracion nodoConf;
    TableRowSorter modeloOrdenado;
    ndFactura nodo;
    Object[] datos;
    DecimalFormat df = new DecimalFormat("#.00");
    String simbolo = "";
    String codigoAutorizacion = "";
    DefaultTableModel modeloComprobantes;

    //Barra de titulo
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    private String terminal;

    public infNC() {
        initComponents();

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        instancias = Instancias.getInstancias();
        nodoConf = instancias.getSql().getDatosConfiguracion();

        this.simbolo = instancias.getSimbolo();

        txtFechaNC.setText(metodosGenerales.fecha());

        String dsPrefijo = "";
        if (instancias.getIdNC() != null) {
            dsPrefijo = instancias.getIdNC();
        }

        lbNoNC.setText(dsPrefijo + (String) instancias.getSql().getNumConsecutivoActual("NC")[0]);
        txtVendedor.setText(this.instancias.getUsuario());

        if (!instancias.getRegimen().equals("")) {
            txtIva.setText("0");
            txtIva.setVisible(false);
            lbIva.setVisible(false);
        }

        cmbTipoOperacion.setSelectedIndex(18);
        txtBodega.setVisible(false);
        pnlFormulario.registerKeyboardAction(accion("guardar"), "guardar", KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("limpiar"), "limpiar", KeyStroke.getKeyStroke(KeyEvent.VK_L, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);

        pnlInvisible.setVisible(false);
        consultarMaestros();

        String paisFact = instancias.getConfiguraciones().getPais();
        if (paisFact.equals("Panama")) {
            txtIva3.setText("Tax");
            lbIva.setText("% Tax");
        }
        modeloComprobantes = (DefaultTableModel) tblComprobantes.getModel();
        Object[][] comprobantes = instancias.getSql().getTiposComprobantes();
        for (Object[] comprobante : comprobantes) {
            if(!String.valueOf(comprobante[0]).equals("DS")){
            modeloComprobantes.addRow(new Object[]{comprobante[0], comprobante[1], false, comprobante[2], comprobante[5], comprobante[3],
                comprobante[4], comprobante[7], comprobante[6], comprobante[8], comprobante[9], comprobante[10]});
             }
        }
    }
    
    private ActionListener accion(final String opc) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
                    case "limpiar":
                        if ((btnLimpiar.isEnabled()) && (btnLimpiar.isVisible())) {
                            btnLimpiarActionPerformed(null);
                        }
                        break;
                    case "guardar":
                        if ((btnGuardar.isEnabled()) && (btnGuardar.isVisible())) {
                            btnGuardarActionPerformed(null);
                        }
                        break;
                }
            }
        };
        return a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popBorrar = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        cmbListas = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbNit = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        lbNit1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtVendedor = new javax.swing.JTextField();
        lbVendedor = new javax.swing.JLabel();
        lbDireccion1 = new javax.swing.JLabel();
        cmbVendedor = new javax.swing.JComboBox();
        lbVendedor1 = new javax.swing.JLabel();
        cmbTipoOperacion = new javax.swing.JComboBox();
        lbVendedor2 = new javax.swing.JLabel();
        scrProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbCargar = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        txtFechaNC = new javax.swing.JLabel();
        lbFechaFactura = new javax.swing.JLabel();
        lbFacturaNo = new javax.swing.JLabel();
        lbNoNC = new javax.swing.JLabel();
        rdReembolsarSi = new javax.swing.JRadioButton();
        rdReembolsarNo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lbVendedor3 = new javax.swing.JLabel();
        cmbConcepto = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        txtValorEfectivo = new javax.swing.JTextField();
        lbCreditos = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        lbCodigo1 = new javax.swing.JLabel();
        txtTotalNc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        lbIva = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        textoTrm = new javax.swing.JLabel();
        textoFechaTrm = new javax.swing.JLabel();
        jTextTrm = new javax.swing.JTextField();
        jTextTrmFecha = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnAnular = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnReimprimir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JLabel();
        lbSubtotal1 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JLabel();
        txtIva3 = new javax.swing.JLabel();
        txtTotalIva = new javax.swing.JLabel();
        lbTotalDescuento = new javax.swing.JLabel();
        txtTotalDescuentos = new javax.swing.JLabel();
        lbImpuestoBolsa = new javax.swing.JLabel();
        lbImpoconsumo = new javax.swing.JLabel();
        txtImpuesto = new javax.swing.JLabel();
        txtTotalImpoconsumo = new javax.swing.JLabel();
        txtRtf = new javax.swing.JLabel();
        txtRiva = new javax.swing.JLabel();
        lbTotalDescuento1 = new javax.swing.JLabel();
        txtCantUnidades = new javax.swing.JLabel();
        lbTotalDescuento2 = new javax.swing.JLabel();
        txtCantProductos = new javax.swing.JLabel();
        lbReteIva = new javax.swing.JLabel();
        lbRtf = new javax.swing.JLabel();
        pnlInvisible = new javax.swing.JPanel();
        txtBodega = new javax.swing.JTextField();
        txtIdSistema = new javax.swing.JTextField();
        txtBodega2 = new javax.swing.JTextField();
        txtRtfPorc = new javax.swing.JTextField();
        txtIvaEfectivo = new javax.swing.JTextField();
        lbProducto = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        btnBusProd = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblComprobantes = new javax.swing.JTable();

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

        cmbListas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L1", "L2", "L3", "L4" }));
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

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("CC/Nit:");

        txtNit.setEditable(false);
        txtNit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNit.setName("CC/NIT"); // NOI18N
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
        });

        lbNit1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit1.setText("Telefono:");

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setName("CC/NIT"); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setName("Nombre"); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtVendedor.setEditable(false);
        txtVendedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtVendedor.setName("Vendedor"); // NOI18N

        lbVendedor.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbVendedor.setText("Vendedor:");

        lbDireccion1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbDireccion1.setText("Nombre:");

        cmbVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbVendedorMouseClicked(evt);
            }
        });

        lbVendedor1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbVendedor1.setText("Vendedor NC:");

        cmbTipoOperacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTipoOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMBUSTIBLE", "EMISOR_AUTORETENEDOR", "EXCLUIDOS_Y_EXENTOS", "EXPORTACION", "GENERICA", "GENERICA_PAGO_ANTICIPADO", "GENERICA_PERIODO_FACTURACION", "CONSORCIO", "SERVICIOS_AIU", "ESTANDAR", "MANDATOS", "MANDATOS_BIENES", "MANDATOS_SERVICIOS", "SS-CUFE", "SS-CUDE", "SS-POS", "SS-SNum", "SS-Recaudo", "NOTA_CREDITO_REFERENCIA", "NOTA_CREDITO_SINREFERENCIA", "NOTA_CREDITO_REFERENCIAV1" }));

        lbVendedor2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbVendedor2.setText("Tipo Operación:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbDireccion1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNit)
                                .addGap(21, 21, 21)
                                .addComponent(lbNit1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVendedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVendedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbVendedor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTipoOperacion, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNit1)
                        .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDireccion1))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVendedor)
                    .addComponent(lbVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVendedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        tblProductos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Valor/Unit", "Cantidad", "Subtotal", "Descuento", "%", "Iva", "Total", "Plu", "Cant", "CantInicial", "DescInicial", "Imei", "idProd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, false, false, false, true, true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setComponentPopupMenu(jPopupMenu1);
        tblProductos.setRowHeight(24);
        tblProductos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblProductosMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblProductosMouseReleased(evt);
            }
        });
        tblProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProductosKeyReleased(evt);
            }
        });
        scrProductos.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(100);
            tblProductos.getColumnModel().getColumn(9).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(9).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(9).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(10).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(10).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(11).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(11).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(11).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(12).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(12).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(12).setMaxWidth(0);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbCargar.setBackground(new java.awt.Color(204, 204, 204));
        lbCargar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbCargar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCargar.setText("FACTURA *");
        lbCargar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbCargar.setOpaque(true);

        txtFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacturaActionPerformed(evt);
            }
        });
        txtFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFacturaKeyReleased(evt);
            }
        });

        txtFechaNC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFechaNC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFechaNC.setText(" ");
        txtFechaNC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbFechaFactura.setBackground(new java.awt.Color(204, 204, 204));
        lbFechaFactura.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbFechaFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFechaFactura.setText("Fecha N.C");
        lbFechaFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbFechaFactura.setOpaque(true);

        lbFacturaNo.setBackground(new java.awt.Color(204, 204, 204));
        lbFacturaNo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbFacturaNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFacturaNo.setText("Nota credito");
        lbFacturaNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbFacturaNo.setOpaque(true);

        lbNoNC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNoNC.setForeground(new java.awt.Color(255, 0, 0));
        lbNoNC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNoNC.setText("3");
        lbNoNC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rdReembolsarSi.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdReembolsarSi);
        rdReembolsarSi.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rdReembolsarSi.setText("SI");

        rdReembolsarNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdReembolsarNo);
        rdReembolsarNo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rdReembolsarNo.setSelected(true);
        rdReembolsarNo.setText("NO");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setText("¿Reembolso Dinero?");

        lbVendedor3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbVendedor3.setText("Concepto:");

        cmbConcepto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbConcepto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR CONCEPTO...", "DEVOLUCION_BIENES", "ANULACION_FACTURA", "REBAJA_APLICADA", "DESCUENTO_APLICADO", "AJUSTE_DE_PRECIO ", "OTROS" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdReembolsarSi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdReembolsarNo)
                .addGap(78, 78, 78))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txtFactura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFechaNC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lbFacturaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbNoNC, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbVendedor3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbConcepto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdReembolsarSi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdReembolsarNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbFechaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbFacturaNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNoNC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFechaNC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVendedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbCodigo.setBackground(new java.awt.Color(204, 204, 204));
        lbCodigo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCodigo.setText("EFECTIVO");
        lbCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbCodigo.setOpaque(true);

        txtValorEfectivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtValorEfectivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorEfectivo.setText("0");
        txtValorEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorEfectivoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorEfectivoKeyTyped(evt);
            }
        });

        lbCreditos.setBackground(new java.awt.Color(204, 204, 204));
        lbCreditos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCreditos.setText("TOTAL");
        lbCreditos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbCreditos.setOpaque(true);

        txtValorTotal.setEditable(false);
        txtValorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorTotal.setText("0");

        lbCodigo1.setBackground(new java.awt.Color(204, 204, 204));
        lbCodigo1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbCodigo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCodigo1.setText("NC RESTANTE");
        lbCodigo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbCodigo1.setOpaque(true);

        txtTotalNc.setEditable(false);
        txtTotalNc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalNc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalNc.setText("0");
        txtTotalNc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalNcKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalNcKeyTyped(evt);
            }
        });

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(2);
        txtObservaciones.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtObservaciones.setEnabled(false);
        jScrollPane1.setViewportView(txtObservaciones);

        lbIva.setBackground(new java.awt.Color(204, 204, 204));
        lbIva.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbIva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIva.setText("% Iva");
        lbIva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbIva.setOpaque(true);

        txtIva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIva.setText("19");
        txtIva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIvaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIvaKeyTyped(evt);
            }
        });

        textoTrm.setText("TRM:");

        textoFechaTrm.setText("FECHA TRM:");

        jTextTrm.setEditable(false);

        jTextTrmFecha.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIva)
                            .addComponent(lbIva, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbCodigo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalNc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoTrm)
                            .addComponent(textoFechaTrm))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextTrm)
                            .addComponent(jTextTrmFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIva, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoTrm)
                    .addComponent(jTextTrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalNc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoFechaTrm)
                    .addComponent(jTextTrmFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnAnular.setBackground(new java.awt.Color(241, 148, 138));
        btnAnular.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png"))); // NOI18N
        btnAnular.setText("ANULAR ");
        btnAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnular.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAnular.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpiar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnReimprimir.setBackground(new java.awt.Color(247, 220, 111));
        btnReimprimir.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnReimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnReimprimir.setText("REIMPRIMIR");
        btnReimprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReimprimir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnReimprimir.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnReimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReimprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnular)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnReimprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtTotal.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotal.setText("Total: 0");

        lbSubtotal1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbSubtotal1.setText("Subtotal:");

        txtSubTotal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtSubTotal.setText("0");

        txtIva3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtIva3.setText("IVA:");

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

        txtRtf.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtRtf.setText("0");

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

        lbReteIva.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbReteIva.setText("Rete Iva:");

        lbRtf.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbRtf.setText("RtF:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbSubtotal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIva3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTotalDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTotalDescuento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTotalDescuento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantUnidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbImpuestoBolsa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbImpoconsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbReteIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addComponent(lbRtf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalImpoconsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRtf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtTotal)
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbImpuestoBolsa, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbImpoconsumo)
                            .addComponent(txtTotalImpoconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRiva)
                            .addComponent(lbReteIva)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSubtotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalIva)
                            .addComponent(txtIva3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotalDescuento)
                            .addComponent(txtTotalDescuentos))))
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRtf, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRtf))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTotalDescuento1)
                            .addComponent(txtCantUnidades))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTotalDescuento2)
                            .addComponent(txtCantProductos))))
                .addGap(5, 5, 5))
        );

        txtBodega.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBodega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBodegaKeyReleased(evt);
            }
        });

        txtIdSistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIdSistema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdSistema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdSistemaKeyReleased(evt);
            }
        });

        txtBodega2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBodega2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBodega2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBodega2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlInvisibleLayout = new javax.swing.GroupLayout(pnlInvisible);
        pnlInvisible.setLayout(pnlInvisibleLayout);
        pnlInvisibleLayout.setHorizontalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBodega2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRtfPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIvaEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInvisibleLayout.setVerticalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBodega2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRtfPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtIvaEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

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

        tblComprobantes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblComprobantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Comprobante", "", "Resolucion", "fechaFin", "desde", "hasta", "tipo", "prefijo", "conse", "plantilla", "modeloContable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, false, false, true, true
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
            tblComprobantes.getColumnModel().getColumn(0).setMinWidth(50);
            tblComprobantes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblComprobantes.getColumnModel().getColumn(0).setMaxWidth(50);
            tblComprobantes.getColumnModel().getColumn(2).setMinWidth(35);
            tblComprobantes.getColumnModel().getColumn(2).setPreferredWidth(35);
            tblComprobantes.getColumnModel().getColumn(2).setMaxWidth(35);
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
            tblComprobantes.getColumnModel().getColumn(11).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(11).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(11).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlInvisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbProducto)
                        .addGap(1, 1, 1)
                        .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnBusProd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(scrProductos)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbListas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(cmbListas, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        scrFormulario.setViewportView(pnlFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void txtFacturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFacturaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarFactura("FACT-" + txtFactura.getText());
        } else {
            btnLimpiarActionPerformed(null);
        }
    }//GEN-LAST:event_txtFacturaKeyReleased

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved

    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered

    }//GEN-LAST:event_jPanel1MouseEntered

    private void cmbListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListasActionPerformed

    }//GEN-LAST:event_cmbListasActionPerformed

    private void cmbListasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbListasItemStateChanged

    }//GEN-LAST:event_cmbListasItemStateChanged

    private void tblProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductosKeyReleased
       
        int fila = tblProductos.getSelectedRow();

       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           tblProductos.setValueAt(big.setMoneda(big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 2)))), fila, 2);
           
           calcularTabla(fila);
        }

    }//GEN-LAST:event_tblProductosKeyReleased

    private void tblProductosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseReleased

    }//GEN-LAST:event_tblProductosMouseReleased

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked

    }//GEN-LAST:event_tblProductosMouseClicked

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased

    }//GEN-LAST:event_txtNitKeyReleased

    private void txtValorEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorEfectivoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtValorEfectivoKeyTyped

    private void txtValorEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorEfectivoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtValorTotal.requestFocus();
            return;
        }

        if (txtValorEfectivo.getText().equals("") || txtValorEfectivo.getText().equals(this.simbolo) || txtValorEfectivo.getText().equals(this.simbolo + " ")) {
            txtValorEfectivo.setText("0");
        }

        txtValorEfectivo.setText(big.setMoneda(big.getMoneda(txtValorEfectivo.getText())));

        BigDecimal iva = big.getMoneda(txtValorEfectivo.getText()).multiply(big.getBigDecimal(txtIva.getText())).
                divide(big.getBigDecimal("100"), 3, RoundingMode.CEILING);
        txtIvaEfectivo.setText(big.setMoneda(iva));

        txtValorTotal.setText(big.setMoneda(((big.getBigDecimal("0").divide(big.getBigDecimal("100")))
                .multiply(big.getMoneda(txtValorEfectivo.getText()))).add(big.getMoneda(txtValorEfectivo.getText()))));

//        txtValorTotal.setText(big.setMoneda(((big.getBigDecimal(txtValorIva.getText()).divide(big.getBigDecimal("100")))
//                .multiply(big.getMoneda(txtValorEfectivo.getText()))).add(big.getMoneda(txtValorEfectivo.getText()))));
        cargarTotales();
    }//GEN-LAST:event_txtValorEfectivoKeyReleased

    private void tblProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProductosMouseEntered

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
              
        if (tblComprobantes.getSelectedRow() == -1) {
             metodos.msgAdvertenciaAjustado(this, "Debe seleccionar un comprobante.");
             return;
        }
        
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

        //SI ES FACTURA ELECTRONICA DEBE TENER UN CLIENTE ASOCIADO POR OBLIGACIÓN
        if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica() && txtNit.getText().equals("1010")) {
            metodos.msgAdvertencia(null, "Debe cargar un cliente para la nota credito electrónicamente");
            return;
        }

        //SI ES FACTURA ELECTRONICA, EL CLIENTE DEBE TENER CODIGO POSTAL POR OBLIGACIÓN
        if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica()) {
            ndTercero nodo = instancias.getSql().getDatosTercero(txtIdSistema.getText());

            if (cmbConcepto.getSelectedIndex() == 0) {
                metodos.msgAdvertenciaAjustado(this, "Debe seleccionar el concepto");
                return;
            }

            if (nodo.getCategoria() != null) {
                if (nodo.getCategoria().equals("")) {
                    metodos.msgAdvertenciaAjustado(this, "El cliente debe tener codigo postal");
                    return;
                }
            }

            if (nodo.getDireccion() != null) {
                if (nodo.getDireccion().equals("")) {
                    metodos.msgAdvertenciaAjustado(this, "El cliente debe tener una dirección");
                    return;
                }
            }

            if (nodo.getId() != null) {
                if (nodo.getId().contains("-")) {
                    if (null == nodo.getId().split("-")[1]) {
                        metodos.msgAdvertencia(this, "El cliente debe tener dígito de verificación");
                        return;
                    }
                }
//                else {
//                    metodos.msgAdvertencia(this, "El cliente debe tener dígito de verificación");
//                    return;
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
                    return;
                }
            } else {
                metodos.msgAdvertenciaAjustado(null, "Debe seleccionar un vendedor");
                return;
            }

            //VALIDAMOS LAS DESCRIPCIONES DE LOS PRODUCTOS
            if (tblProductos.getRowCount() > 0) {
                for (int i = 0; i < tblProductos.getRowCount(); i++) {

                    String paisFact = instancias.getConfiguraciones().getPais();

                    if (paisFact.equals("Panama")) {
                        if (!tblProductos.getValueAt(i, 6).toString().equals("0")
                                && !tblProductos.getValueAt(i, 6).toString().equals("5")
                                && !tblProductos.getValueAt(i, 6).toString().equals("7")
                                && !tblProductos.getValueAt(i, 6).toString().equals("10")
                                && !tblProductos.getValueAt(i, 6).toString().equals("15")) {
                            metodos.msgAdvertencia(this, "El tax del producto '" + tblProductos.getValueAt(i, 1) + "' debe ser 0,5,7,10 ó 15");
                            return;
                        }
                    }

                    if (tblProductos.getValueAt(i, 1).toString().length() < 5) {
                        metodos.msgAdvertencia(this, "El producto '" + tblProductos.getValueAt(i, 1) + "' debe tener una descripción mas larga");
                        return;
                    }

                    String name = tblProductos.getValueAt(i, 1).toString();
                    if (name.length() > 255) {
                        metodos.msgAdvertencia(this, "La descripción del producto supera los 255 caracteres!");
                        return;
                    }

                    if (tblProductos.getValueAt(i, 2).toString().equals(this.simbolo + " 0")) {
                        metodos.msgAdvertenciaAjustado(this, "El valor debe ser mayor a " + this.simbolo + " 0");
                        return;
                    }

                    if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica()) {
                        if (tblProductos.getValueAt(i, 21).toString().equals("")) {
                            metodos.msgAdvertencia(this, "El producto '" + tblProductos.getValueAt(i, 1) + "' no tiene unidad de medida");
                            return;
                        }
                    }
                }
            }
        }

        try {
                Socket s = new Socket(Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
                if (s.isConnected()) {
                    Logs.log("Generando Nota Credito");
                }
            } catch (Exception e) {
                Logs.error(e);
                    Logs.warn("No se puede generar Nota Credito sin conexión a internet !");
                return;
            }
        
        
        
        if (!instancias.getUsuario().equals("ADMIN")) {
            dlgSolicitarPermisos permisos = new dlgSolicitarPermisos(null, true, "NOTAS CREDITO", "NOTA-CREDITO",
                    big.setNumero(big.getMoneda(txtTotal.getText().replace("Total: ", ""))), "notaCredito");
            permisos.setLocationRelativeTo(null);
            permisos.setVisible(true);
            return;
        } else {
            if (metodos.msgPregunta(this, "¿Desea continuar?") != 0) {
                return;
            }
        }

        realizarNc(comprobante);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtObservaciones.setEnabled(false);
        txtBodega.setText("");
        txtNit.setText("");
        txtNombre.setText("");
        txtVendedor.setText("");
        txtTelefono.setText("");
        txtValorEfectivo.setText(this.simbolo + " 0");
        txtTotalNc.setText(this.simbolo + " 0");
        txtTotalImpoconsumo.setText(this.simbolo + " 0");
        txtValorTotal.setText(this.simbolo + " 0");
        txtRiva.setText(this.simbolo + " 0");
        txtRtf.setText(this.simbolo + " 0");
        txtIvaEfectivo.setText(this.simbolo + " 0");
        txtObservaciones.setText("");
        jTextTrm.setText("");
        jTextTrmFecha.setText("");

        DefaultTableModel y = (DefaultTableModel) tblProductos.getModel();

        int i, j = tblProductos.getRowCount();

        for (i = 0; i < j; i++) {
            y.removeRow(0);
        }

        txtSubTotal.setText(this.simbolo + " 0");
        txtTotal.setText("Total: " + this.simbolo + " 0");
        txtTotalIva.setText(this.simbolo + " 0");

        txtFactura.requestFocus();

        if (evt != null) {
            txtFactura.setText("");
        }

        rdReembolsarNo.setSelected(true);
        terminal = null;

        String dsPrefijo = "";
        if (instancias.getIdNC() != null) {
            dsPrefijo = instancias.getIdNC();
        }

        lbNoNC.setText(dsPrefijo + (String) instancias.getSql().getNumConsecutivoActual("NC")[0]);
        resetComprobante(-1);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        
        if (tblComprobantes.getSelectedRow() == -1) {
             metodos.msgAdvertenciaAjustado(this, "Debe seleccionar un comprobante.");
             return;
        }
        
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

        //SI ES FACTURA ELECTRONICA DEBE TENER UN CLIENTE ASOCIADO POR OBLIGACIÓN
        if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica()) {
            metodos.msgAdvertencia(null, "No se puede anular una nota credito de factura electronica.");
            return;
        }
        
        String consecutivo = "NC-" + metodos.msgIngresarEnter(this, "Documento a anular");
        boolean anulado = instancias.getSql().getDocumentoAnulado("bdNc", "Where id ='" + consecutivo + "' ");
        if (anulado) {
            metodos.msgError(null, "El documento esta anulado");
            return;
        }

        if (!instancias.getSql().estaSinUtilizar(consecutivo)) {
            metodos.msgError(this, "La nota credito ya ha sido usada");
            return;
        }

        if (metodos.msgPregunta(this, "¿Anular esta nota credito?") == 0) {

            if (!instancias.getSql().anularDocumento(consecutivo, "bdNc")) {
                metodos.msgError(this, "Hubo un problema al anular la nota credito");
            }

            if (!instancias.getSql().descontarNc(consecutivo, "0")) {
                metodos.msgError(this, "Hubo un problema al anular la nota credito");
            }

            Object[][] notasCredito = instancias.getSql().getNotasCredito(consecutivo);

            for (int i = 0; i < notasCredito.length; i++) {

                ndProducto producto = instancias.getSql().getDatosProducto(notasCredito[i][1].toString(), "bdProductos");
                double cantidad;
                double inventario;
                double fisicoInventario;

                try {
                    cantidad = Double.parseDouble(producto.getNc().replace(",", "."));
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
                    fisicoInventario = Double.parseDouble(producto.getInventario());
                }

                if ("EFECTIVO".equals(producto.getCodigo())) {

                } else {
                    inventario = inventario - Double.parseDouble(notasCredito[i][6].toString().substring(1, notasCredito[i][6].toString().length()));
                    fisicoInventario = fisicoInventario - Double.parseDouble(notasCredito[i][6].toString().substring(1, notasCredito[i][6].toString().length()));
                    double total = cantidad - Double.parseDouble(notasCredito[i][6].toString().substring(1, notasCredito[i][6].toString().length()));

                    String inventario1 = String.valueOf(df.format(inventario)).replace(".", ",");
                    String fisicoInventario1 = String.valueOf(df.format(fisicoInventario)).replace(".", ",");
                    String total1 = String.valueOf(df.format(total)).replace(".", ",");

                    instancias.getSql().modificarInventario("nc", total1, notasCredito[i][1].toString(), "bdProductos");
                    instancias.getSql().modificarInventario("inventario", inventario1, notasCredito[i][1].toString(), "bdProductos");
                    instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, notasCredito[i][1].toString(), "bdProductos");
                }
            }

            metodos.msgExito(this, "Nota credito anulada con éxito");
        }
    }//GEN-LAST:event_btnAnularActionPerformed

    private void btnReimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReimprimirActionPerformed
        String consecutivo = "NC-" + metodos.msgIngresarEnter(this, "Documento a reimprimir");

        boolean anulado = false;
        try {
            anulado = instancias.getSql().getDocumentoAnulado("bdNc", "Where id ='" + consecutivo + "' ");
        } catch (Exception e) {
            Logs.error(e);
            metodos.msgAdvertenciaAjustado(this, "La nota credito no existe");
            return;
        }

        if (anulado) {
            metodos.msgError(null, "Este documento se encuentra anulado");
            return;
        }

        ndNc nodoNc = instancias.getSql().getDatosNotaCredito(consecutivo);
        String infoEmpresa = metodosGenerales.convertToMultiline(instancias.getInformacionEmpresaReimpresion() + "" + nodoNc.getResolucion());
        instancias.getReporte().ver_Nc(consecutivo, "", infoEmpresa);
    }//GEN-LAST:event_btnReimprimirActionPerformed

    private void txtTotalNcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalNcKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalNcKeyReleased

    private void txtTotalNcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalNcKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalNcKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtBodegaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBodegaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodegaKeyReleased

    private void lbTotalDescuentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTotalDescuentoMouseClicked

    }//GEN-LAST:event_lbTotalDescuentoMouseClicked

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

    private void txtIdSistemaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSistemaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSistemaKeyReleased

    private void txtBodega2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBodega2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodega2KeyReleased

    private void cmbVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbVendedorMouseClicked

    }//GEN-LAST:event_cmbVendedorMouseClicked

    private void txtIvaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaKeyReleased
        BigDecimal porcIva = BigDecimal.ONE;
        try {
            porcIva = big.getBigDecimal(txtIva.getText());
        } catch (Exception e) {
            Logs.error(e);
        }

        BigDecimal iva = big.getMoneda(txtValorEfectivo.getText()).multiply(porcIva).divide(big.getBigDecimal("100"), 3, RoundingMode.CEILING);
        txtIvaEfectivo.setText(big.setMoneda(iva));
        cargarTotales();
    }//GEN-LAST:event_txtIvaKeyReleased

    private void txtIvaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIvaKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtIvaKeyTyped

    private void lbProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProductoMouseClicked

    }//GEN-LAST:event_lbProductoMouseClicked

    private void lbProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCodProducto.requestFocus();
        }
    }//GEN-LAST:event_lbProductoKeyReleased

    private void txtCodProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodProductoFocusGained
        cargarTotales();
    }//GEN-LAST:event_txtCodProductoFocusGained

    private void txtCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoActionPerformed

    }//GEN-LAST:event_txtCodProductoActionPerformed

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

                calcularTabla(fila);
            }
        } catch (Exception e) {
            Logs.error(e);
           
        }

    }//GEN-LAST:event_txtCodProductoKeyPressed

    private void txtCodProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String codigo = txtCodProducto.getText().replace("'", "//");         
            cargarProducto(codigo, "1", 1, "", "", "", true, "", "", "", "", "");
            txtCodProducto.setText("");
        }
                   
    }//GEN-LAST:event_txtCodProductoKeyReleased

    private void btnBusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProdActionPerformed
        ventanaProductos("");
    }//GEN-LAST:event_btnBusProdActionPerformed

    private void txtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacturaActionPerformed

    private void tblComprobantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseClicked
        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
            tblComprobantes.setValueAt(false, i, 2);
        }
        if (tblComprobantes.getSelectedRow() == -1) {
            tblComprobantes.setValueAt(true, 0, 2);

            if (null == tblComprobantes.getValueAt(0, 7)) {
                cmbTipoOperacion.setVisible(false);
            } else {
                if (tblComprobantes.getValueAt(0, 7).equals("Facturación Electronica")) {
                    cmbTipoOperacion.setVisible(true);
                } else {
                    cmbTipoOperacion.setVisible(false);
                }
            }

            actualizarResolucion(0);
        } else {
            tblComprobantes.setValueAt(true, tblComprobantes.getSelectedRow(), 2);

            if (null == tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 7)) {
                cmbTipoOperacion.setVisible(false);
            } else {
                if (tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 7).equals("Facturación Electronica")) {
                    cmbTipoOperacion.setVisible(true);
                } else {
                    cmbTipoOperacion.setVisible(false);
                }
            }

            actualizarResolucion(tblComprobantes.getSelectedRow());
        }

    }//GEN-LAST:event_tblComprobantesMouseClicked

    
    
     public void actualizarResolucion(int fila) {

        String resolucion = "", numeracion = "", infoResolucion = "", infoEmpresa = "";
        try {
            infoResolucion = tblComprobantes.getValueAt(fila, 2).toString();
        } catch (Exception e) {
        }
        /* INFORMACION DE LA EMPRESA */
        if (null != datos[8]) {
            infoEmpresa = infoEmpresa + "" + (String) datos[8] + "";
        }

        if (null != datos[9]) {
            infoEmpresa = infoEmpresa + "\n" + (String) datos[9];
        }

        if (null != datos[10]) {
            infoEmpresa = infoEmpresa + "\n" + (String) datos[10];
        }

        if (null != datos[13]) {
            infoEmpresa = infoEmpresa + "\n" + (String) datos[13];
        }

        if (null != datos[14]) {
            infoEmpresa = infoEmpresa + "\n" + (String) datos[14];
        }
        /* FIN DE LA INFORMACION */

        String dato1 = "", dato2 = "";
        if (null != datos[16]) {
            dato1 = (String) datos[16];
        }

        if (null != datos[15]) {
            dato2 = (String) datos[15];
        }

        if (instancias.getRegimen().equals("")) {
            String resol = "", desde = "", hasta = "", fecha = "", tipo = "";

            try {
                resol = tblComprobantes.getValueAt(fila, 1).toString();
            } catch (Exception e) {
            }

            try {
                tipo = tblComprobantes.getValueAt(fila, 7).toString();
            } catch (Exception e) {
            }

            try {
                fecha = tblComprobantes.getValueAt(fila, 4).toString();
            } catch (Exception e) {
            }

            try {
                desde = tblComprobantes.getValueAt(fila, 5).toString();
            } catch (Exception e) {
            }

            try {
                hasta = tblComprobantes.getValueAt(fila, 6).toString();
            } catch (Exception e) {
            }

            resolucion = resol + " " + fecha;
            numeracion = "NUMERACION DESDE " + desde + " HASTA " + hasta;

            infoResolucion = infoResolucion + "\n" + resolucion + "\n" + numeracion;

           

            if (null != tipo) {
                if (tipo.equals("Facturación Electronica")) {
                    cmbTipoOperacion.setVisible(true);
                } else {
                    cmbTipoOperacion.setVisible(false);
                }
            } else {
                cmbTipoOperacion.setVisible(false);
            }

            String datosEmpresa = metodosGenerales.convertToMultiline(infoEmpresa);
            String datosEmpresaReimpresion = infoEmpresa;
            String datosEmpresaCompleto = metodosGenerales.convertToMultiline(infoEmpresa + "" + infoResolucion);

            instancias.setInformacionEmpresaCompleto(datosEmpresaCompleto);
            instancias.setDatosEmpresa(datosEmpresa, dato1, dato2, datosEmpresaCompleto, datosEmpresaReimpresion);
            instancias.setResolucion(resolucion + "\n" + numeracion);
        } else {
            if (datos[11] != null) {
                resolucion = datos[11].toString();
            }

            if (datos[12] != null) {
                numeracion = datos[12].toString();
            }

            if (resolucion.equals("") || numeracion.equals("")) {
            } else {
                infoResolucion = infoResolucion + "\n" + resolucion + "\n" + numeracion;
            }

            String datosEmpresa = metodosGenerales.convertToMultiline(infoEmpresa);
            String datosEmpresaReimpresion = infoEmpresa;
            String datosEmpresaCompleto = metodosGenerales.convertToMultiline(infoEmpresa + "" + infoResolucion);
            instancias.setDatosEmpresa(datosEmpresa, dato1, dato2, datosEmpresaCompleto, datosEmpresaReimpresion);
            instancias.setInformacionEmpresaCompleto(datosEmpresaCompleto);
            instancias.setResolucion(resolucion + "\n" + numeracion);
        }
    }
    
    
    private void tblComprobantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseEntered

    }//GEN-LAST:event_tblComprobantesMouseEntered

    private void tblComprobantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseExited
        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
            tblComprobantes.setValueAt(false, i, 2);
        }

        if (tblComprobantes.getSelectedRow() == -1) {
            tblComprobantes.setValueAt(true, 0, 2);

            if (null == tblComprobantes.getValueAt(0, 7)) {
                cmbTipoOperacion.setVisible(false);
            } else {
                if (tblComprobantes.getValueAt(0, 7).equals("Facturación Electronica")) {
                    cmbTipoOperacion.setVisible(true);
                } else {
                    cmbTipoOperacion.setVisible(false);
                }
            }

            actualizarResolucion(0);
        } else {
            tblComprobantes.setValueAt(true, tblComprobantes.getSelectedRow(), 2);

            if (null == tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 7)) {
                cmbTipoOperacion.setVisible(false);
            } else {
                if (tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 7).equals("Facturación Electronica")) {
                    cmbTipoOperacion.setVisible(true);
                } else {
                    cmbTipoOperacion.setVisible(false);
                }
            }

            actualizarResolucion(tblComprobantes.getSelectedRow());
        }
    }//GEN-LAST:event_tblComprobantesMouseExited

    
    private void calcularTabla(int fila) {

        String baseUtilizada = obtenerBase();
        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 0).toString(), baseUtilizada);

        double impoconsumo = 0;
        double iva = 0;
        double totalImpoconsumo =  0; 
        double totalIva = 0;
        double valor = 0;
        double cantidad = 0;
        double descuento = 0;
        double subtotal = 0;
        double total = 0 ;
        double porcentaje2 = 0;
        double valorDescuento = 0;

        valor = big.getMonedaToDouble(tblProductos.getValueAt(fila, 2).toString());
        try {
            valorDescuento = big.getMonedaToDouble(tblProductos.getValueAt(fila, 5).toString());
        } catch (Exception e) {
            Logs.error(e);
            valorDescuento = 0;
        }

        tblProductos.setValueAt(big.setMonedaExacta(valorDescuento), fila, 5);

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
        descuento = big.getMonedaToDouble(tblProductos.getValueAt(fila, 5).toString());

        //OBTENEMOS EL PORCENTAJE DEL IVA DE LA TABLA
        iva = big.getMonedaToDouble(tblProductos.getValueAt(fila, 6).toString());
        impoconsumo = big.getMonedaToDouble(tblProductos.getValueAt(fila, 8).toString());

        //OBTENEMOS EL PORCENTAJE DEL IMPOCONSUMO DE LA TABLA
        if (tblProductos.getSelectedColumn() == 9) {
            totalImpoconsumo = big.getMonedaToDouble(tblProductos.getValueAt(fila, 9).toString());
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
                    double[] datos = calcularDescuento(fila, subtotal, false);
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
                    double[] datos = calcularDescuento(fila, subtotal, false);
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
                    double[] datos = calcularDescuento(fila, subtotal, false);
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
                double[] datos = calcularDescuento(fila, subtotal, false);
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

        if (tblProductos.getSelectedColumn() == 9) {
            tblProductos.setValueAt(porcImpoconsumo, fila, 9);
        }

        tblProductos.setValueAt(big.setMoneda(subtotal), fila, 4);
        tblProductos.setValueAt(big.setMoneda(totalIva), fila, 7);
        tblProductos.setValueAt(big.setMoneda(totalImpoconsumo), fila, 9);
        tblProductos.setValueAt(big.setMoneda(total), fila, 10);

//        tblProductos.setValueAt(big.setNumero(porcentaje2), fila, 5);
        tblProductos.setValueAt(big.setMonedaExacta(descuento), fila, 5);
       
        switch (tblProductos.getValueAt(fila, 11).toString()) { //estaba en pero aqui carga es cantidad tblProductos.getValueAt(fila, 12).toString()
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

        cargarTotales();
    }
    
    
    
    private double[] calcularDescuento(int fila, double subtotal, boolean mostrarAlerta) {
        double descuento = 0;
        double porcentaje = 0;
        double porcentaje2 = 0;
      
        switch (instancias.getDescuento()) {
            case "porcentaje":
                if (!tblProductos.getValueAt(fila, 5).toString().equals("0.0") && !tblProductos.getValueAt(fila, 5).toString().equals("0")) {
                    if (big.getMonedaToDouble(tblProductos.getValueAt(fila, 5).toString()) > 0.0) {//(boolean) tblProductos.getValueAt(fila, 18)

                        if (tblProductos.getValueAt(fila, 19).toString().equals("")) { //ESTABA EL 5 EN VEZ DE 19
                            porcentaje2 = 0;
                        } else {                           
                            porcentaje2 = big.formatDouble(tblProductos.getValueAt(fila, 19).toString().replace(",", ".")) / 100;
                        }
                        porcentaje = porcentaje2;
                        descuento = subtotal* porcentaje;                        
                        porcentaje2 = porcentaje2 * 100;
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
                    if (big.getMonedaToDouble(tblProductos.getValueAt(fila, 5).toString()) > 0.0) {
                        descuento = big.getMonedaToDouble(tblProductos.getValueAt(fila, 5).toString());//desuento posicion 5 aparecia en posicion 6
                        porcentaje2 = (descuento *100) / subtotal;
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
    
    
    private void calcularTabla2(int fila) {

        String baseUtilizada = obtenerBase();
        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 16).toString(), baseUtilizada);
        
        BigDecimal impoconsumo = BigDecimal.ZERO, iva = BigDecimal.ZERO, totalImpoconsumo = BigDecimal.ZERO, totalIva = BigDecimal.ZERO, subtotalGeneral = BigDecimal.ZERO;

        BigDecimal valor = BigDecimal.ZERO, cantidad = BigDecimal.ZERO, descuento, subtotal, total, porcentaje2, compra, utilidadMax, utilidadMin, valorDescuento;
        valor = big.getBigDecimal(big.getMoneda(tblProductos.getValueAt(fila, 2).toString()));
        try {
            valorDescuento = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 5)));
        } catch (Exception e) {
            Logs.error(e);
            valorDescuento = BigDecimal.ZERO;
        }

        tblProductos.setValueAt(big.setMonedaExacta(valorDescuento), fila, 5);


        try {
            cantidad = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 3)).replace(".", ","));
        } catch (Exception e) {
            cantidad = big.getBigDecimal("1");
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
            cantidad = BigDecimal.ONE;
        }

        subtotal = valor.multiply(cantidad);

        porcentaje2 = big.getBigDecimal("0");
        descuento = big.getMoneda("0");
       
        //OBTENEMOS EL PORCENTAJE DEL IVA DE LA TABLA
        BigDecimal porcIva = BigDecimal.ZERO;
        porcIva = big.getBigDecimal(Double.valueOf(tblProductos.getValueAt(fila, 6).toString()));
        porcIva = (porcIva.divide(big.getBigDecimal("100")));
        iva = valor.multiply(porcIva);
   
        //OBTENEMOS EL PORCENTAJE DEL IMPOCONSUMO DE LA TABLA
        BigDecimal porcImpoconsumo = BigDecimal.ZERO;
        porcImpoconsumo = big.getBigDecimal(Double.valueOf(tblProductos.getValueAt(fila, 8).toString()));
        porcImpoconsumo = (porcImpoconsumo.divide(big.getBigDecimal("100")));
        impoconsumo = valor.multiply(porcImpoconsumo);
     
        subtotal = subtotal.subtract(descuento);
        subtotalGeneral = subtotal;

      

        if (instancias.isPvpConIva() || instancias.isPvpConImpoconsumo()) {
            BigDecimal subIva = BigDecimal.ZERO, subImpo = BigDecimal.ZERO;
            if (instancias.isPvpConIva() && instancias.isPvpConImpoconsumo()) {
                   porcIva = big.getBigDecimal(Double.valueOf(tblProductos.getValueAt(fila, 6).toString()));
                   porcImpoconsumo = big.getBigDecimal(Double.valueOf(tblProductos.getValueAt(fila, 8).toString()));
                   
                   //SE SUMAN LOS IMPUESTOS
                   double totalImpuestos = porcIva.doubleValue() + porcImpoconsumo.doubleValue();
                   totalImpuestos = (totalImpuestos/100)+1;

                   //SE CALCULA EL SUBTOTAL SUMANDO TODOS LOS IMPUESTOS
                   subtotal = subtotal.divide(new BigDecimal(totalImpuestos),2);
                   totalIva = subtotal.multiply(porcIva.divide(big.getBigDecimal("100")));
                    
                   //CALCULAMOS EL IMPOCONSUMO
                   totalImpoconsumo = subtotal.multiply(porcImpoconsumo.divide(big.getBigDecimal("100")));
            } else if (instancias.isPvpConIva()) {
                iva = subtotal.divide(porcIva, 3, RoundingMode.CEILING);
                totalIva = subtotal.subtract(iva);
                subtotal = subtotal.subtract(totalIva);
            } else if (instancias.isPvpConImpoconsumo()) {
                impoconsumo = subtotal.divide(porcImpoconsumo, 3, RoundingMode.CEILING);
                totalImpoconsumo = subtotal.subtract(impoconsumo);
                subtotal = subtotal.subtract(totalImpoconsumo);               
            }
        }

        if (!instancias.isPvpConIva()) {
            porcIva = big.getBigDecimal(Double.valueOf(tblProductos.getValueAt(fila, 6).toString()));
            porcIva = (porcIva.divide(big.getBigDecimal("100")));
            totalIva = subtotalGeneral.multiply(porcIva);
            //totalIva = totalIva.subtract(subtotalGeneral);
        }

        if (!instancias.isPvpConImpoconsumo()) {
          
            porcImpoconsumo = big.getBigDecimal(Double.valueOf(tblProductos.getValueAt(fila, 8).toString()));
            porcImpoconsumo = (porcImpoconsumo.divide(big.getBigDecimal("100")));
            totalImpoconsumo = subtotalGeneral.multiply(porcImpoconsumo);
            //totalImpoconsumo = totalImpoconsumo.subtract(subtotalGeneral);

        }
        total = subtotal.add(totalIva).add(totalImpoconsumo);

        tblProductos.setValueAt(big.setMoneda(subtotal), fila, 4);
        tblProductos.setValueAt(big.setMoneda(totalIva), fila, 7);
        tblProductos.setValueAt(big.setMoneda(totalImpoconsumo), fila, 9);
        tblProductos.setValueAt(big.setMoneda(total), fila, 10);
        cargarTotales();
    }
    
    public void ventanaProductos(String codigo) {
        String base = obtenerBase();
     
        buscProductos buscar = new buscProductos(null, true, false, "", base);
        buscar.setOpc("NotaCredito");
        buscar.setLocationRelativeTo(null);
        instancias.setBusProductos(buscar);
        instancias.setCampoActual(txtCodProducto);
        txtCodProducto.requestFocus();
        buscar.noEncontrado(codigo.replace("'", "//"));
        buscar.show();
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

            BigDecimal aux = new BigDecimal("0.0"), iva, valor;
            valor = big.getBigDecimal(nodo.getL1());
            iva = big.getBigDecimal(nodo.getIva());
            iva = (iva.divide(big.getBigDecimal("100"))).add(big.getBigDecimal("1"));
            aux = valor.divide(iva, 2);
            aux = valor.subtract(aux);
            
            String cant = nodo.getFisicoInventario();
            cant = cant.replace(".", ",");

            //aux = aux.divide(new BigDecimal("100"));
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

            boolean datosGrupo = true;
            try {
                datosGrupo = (boolean) instancias.getSql().getDatosGrupo(nodo.getGrupo())[1];
            } catch (Exception e) {
                Logs.error(e);
                datosGrupo = true;
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
           
           
           
            String columNames[] = {
            "Codigo", "Descripcion", "Valor/Unit", "Cantidad", "Subtotal", "Descuento", "% IVA", "IVA", "% Impo", "Impoconsumo", "Total", "Plu", "Cant2",
            "Cantidad", "Descuento", "imei", "idProd", "Cod", "codEstandar", "porcDescuento", "rango", "unidad", "manejaInventario"
            };
       
        
            tblProductos.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    columNames
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, true, true, false, false, false, false, false, false, false, false, false,
                    false, false, false, false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            }); 
         
            
            
            modeloPro =  (DefaultTableModel) tblProductos.getModel();
            modeloPro.addRow(new Object[]{
                nodo.getIdSistema(),
                desc,
                lista,
                cant2,
                lista,
                "0",
                big.setNumero(nodo.getIva()),
                aux,
                big.setNumero(nodo.getImpoconsumoVenta()),
                "0",
                lista,
                "1",
                cant2,
                cant2,
                "0",
                "",
                nodo.getIdSistema(),
                nodo.getCodigo(),
                false,
                "0",
                "0",
                nodo.getUnd(),
                nodo.getManejaInventario()});
            
                tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
                tblProductos.getColumnModel().getColumn(2).setMinWidth(100);
                tblProductos.getColumnModel().getColumn(2).setPreferredWidth(120);
                tblProductos.getColumnModel().getColumn(2).setMaxWidth(150);
                tblProductos.getColumnModel().getColumn(3).setMinWidth(60);
                tblProductos.getColumnModel().getColumn(3).setPreferredWidth(90);
                tblProductos.getColumnModel().getColumn(3).setMaxWidth(120);
                tblProductos.getColumnModel().getColumn(4).setMinWidth(100);
                tblProductos.getColumnModel().getColumn(4).setPreferredWidth(120);
                tblProductos.getColumnModel().getColumn(4).setMaxWidth(150);
                tblProductos.getColumnModel().getColumn(5).setMinWidth(100);
                tblProductos.getColumnModel().getColumn(5).setPreferredWidth(120);
                tblProductos.getColumnModel().getColumn(5).setMaxWidth(150);
                tblProductos.getColumnModel().getColumn(6).setMinWidth(50);
                tblProductos.getColumnModel().getColumn(6).setPreferredWidth(50);
                tblProductos.getColumnModel().getColumn(6).setMaxWidth(50);
                tblProductos.getColumnModel().getColumn(7).setMinWidth(100);
                tblProductos.getColumnModel().getColumn(7).setPreferredWidth(120);
                tblProductos.getColumnModel().getColumn(7).setMaxWidth(150);
                tblProductos.getColumnModel().getColumn(8).setMinWidth(50);
                tblProductos.getColumnModel().getColumn(8).setPreferredWidth(50);
                tblProductos.getColumnModel().getColumn(8).setMaxWidth(50);
                tblProductos.getColumnModel().getColumn(9).setMinWidth(100);
                tblProductos.getColumnModel().getColumn(9).setPreferredWidth(120);
                tblProductos.getColumnModel().getColumn(9).setMaxWidth(150);
                tblProductos.getColumnModel().getColumn(10).setMinWidth(100);
                tblProductos.getColumnModel().getColumn(10).setPreferredWidth(120);
                tblProductos.getColumnModel().getColumn(10).setMaxWidth(150);
                tblProductos.getColumnModel().getColumn(11).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(11).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(11).setMaxWidth(0);
                tblProductos.getColumnModel().getColumn(12).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(12).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(12).setMaxWidth(0);
                tblProductos.getColumnModel().getColumn(13).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(13).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(14).setMinWidth(100);
                tblProductos.getColumnModel().getColumn(14).setPreferredWidth(120);
                tblProductos.getColumnModel().getColumn(14).setMaxWidth(150);
                tblProductos.getColumnModel().getColumn(13).setMaxWidth(0);
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
                tblProductos.getColumnModel().getColumn(22).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(22).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(22).setMaxWidth(0);

                for (int i = 0; i < tblProductos.getRowCount(); i++) {
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 2))), i, 2);
                    tblProductos.setValueAt(big.setNumero(big.getBigDecimal((String) tblProductos.getValueAt(i, 3))), i, 3);
                    tblProductos.setValueAt(big.setNumero(big.getBigDecimal((String) tblProductos.getValueAt(i, 10))), i, 10);
        //            tblProductos.setValueAt(big.getBigDecimal((String) tblProductos.getValueAt(i, 11)), i, 11);
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 4))), i, 4);
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 5))), i, 5);
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 14))), i, 14);
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(Double.valueOf(tblProductos.getValueAt(i, 7).toString()))), i, 7);
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 9))), i, 9);
                    tblProductos.setValueAt(big.setMoneda(big.getMoneda((String) tblProductos.getValueAt(i, 10))), i, 10);
                }
            txtCodProducto.setText("");

            tblProductos.scrollRectToVisible(tblProductos.getCellRect(tblProductos.getRowCount() - 1, 0, true));
            

            tblProductos.setColumnSelectionInterval(0, 0);
            tblProductos.setRowSelectionInterval(modeloPro.getRowCount() - 1, modeloPro.getRowCount() - 1);

            

            calcularTabla(modeloPro.getRowCount() - 1);
            //cargarTotales();
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
    
    public void cargarProductos1(Object[][] productos) {    
        String baseUtilizada = obtenerBase();
        
        for (int i = 0; i < productos.length; i++) {
            ndProducto nodo = instancias.getSql().getDatosProducto(productos[i][0].toString(), baseUtilizada);
            String codigo = productos[i][0].toString();
                  
            if (nodo.getUsuario().equals("ADMIN")) {
                cargarProducto(codigo, "1", 1, "", "", "", true, "", "", "", "", "");
            } else {
                for (int j = 0; j < Integer.parseInt("1"); j++) {
                    cargarProducto(codigo, "1", 1, "", "", "", true, "", "", "", "", "");
                }
            }
        }

        tblProductos.changeSelection(tblProductos.getRowCount() - 1, 0, false, false);
        tblProductos.removeEditor();
        
        if (tblProductos.editCellAt(tblProductos.getRowCount() - 1, 0)) {
            tblProductos.setColumnSelectionInterval(0, 0);
            tblProductos.transferFocus();
        }

    }

    
    
    public void cargarFactura(String factura) {
        btnLimpiarActionPerformed(null);
        txtFactura.setText(factura.replace("FACT-", ""));

        ndFactura nodo = instancias.getSql().getDatosFactura(factura);

        if (nodo.getIdFactura() == null) {
            metodos.msgAdvertenciaAjustado(this, "Esta factura no existe");
            return;
        }

        if (nodo.isAnulada()) {
            metodos.msgError(this, "Esta factura se encuentra anulada");
            return;
        }
        
        if(nodo.getTrm()!=null || nodo.getTrm()!=""){
          jTextTrm.setText(nodo.getTrm());
          jTextTrmFecha.setText(nodo.getFechaTrm());
        }

        try {
            Object[][] nc = instancias.getSql().getDatosNc(nodo.getFactura());

            if (nc != null && nc[0] != null && nc[0][0] != null) {
                double v1 = Double.parseDouble(nc[0][1].toString());
                double v2;
                try {
                    v2 = Double.parseDouble(nc[0][2].toString());
                } catch (Exception e) {
                    Logs.error(e);
                    v2 = Double.parseDouble(nc[0][2].toString().substring(2, nc[0][2].toString().length()).replace(".", ""));
                }

                if (v1 < v2) {
                    double valor = v2 - v1;
                    BigDecimal valor2 = big.getBigDecimal(valor);
                    txtTotalNc.setText(big.setMoneda((valor2)));
                } else {
                    metodos.msgAdvertenciaAjustado(this, "Limite de notas creditos");
                    return;
                }
            }
        } catch (Exception e) {
            Logs.error(e);
            txtTotalNc.setText(big.setMoneda(big.getBigDecimal(nodo.getTotalGeneral())));
        }

        txtRtfPorc.setText(nodo.getOtros());
        
        tblProductos.setModel(instancias.getSql().getRegistrosVentasPlu(nodo.getFactura()));
                 
        txtBodega.setText(nodo.getBodega());
        tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProductos.getColumnModel().getColumn(1).setMinWidth(150);
        tblProductos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblProductos.getColumnModel().getColumn(1).setMaxWidth(200);
        tblProductos.getColumnModel().getColumn(2).setMinWidth(100);
        tblProductos.getColumnModel().getColumn(2).setPreferredWidth(120);
        tblProductos.getColumnModel().getColumn(2).setMaxWidth(150);
        tblProductos.getColumnModel().getColumn(3).setMinWidth(60);
        tblProductos.getColumnModel().getColumn(3).setPreferredWidth(90);
        tblProductos.getColumnModel().getColumn(3).setMaxWidth(120);
        tblProductos.getColumnModel().getColumn(4).setMinWidth(100);
        tblProductos.getColumnModel().getColumn(4).setPreferredWidth(120);
        tblProductos.getColumnModel().getColumn(4).setMaxWidth(150);
        tblProductos.getColumnModel().getColumn(5).setMinWidth(100);
        tblProductos.getColumnModel().getColumn(5).setPreferredWidth(120);
        tblProductos.getColumnModel().getColumn(5).setMaxWidth(150);
        tblProductos.getColumnModel().getColumn(6).setMinWidth(50);
        tblProductos.getColumnModel().getColumn(6).setPreferredWidth(50);
        tblProductos.getColumnModel().getColumn(6).setMaxWidth(50);
        tblProductos.getColumnModel().getColumn(7).setMinWidth(100);
        tblProductos.getColumnModel().getColumn(7).setPreferredWidth(120);
        tblProductos.getColumnModel().getColumn(7).setMaxWidth(150);
        tblProductos.getColumnModel().getColumn(8).setMinWidth(50);
        tblProductos.getColumnModel().getColumn(8).setPreferredWidth(50);
        tblProductos.getColumnModel().getColumn(8).setMaxWidth(50);
        tblProductos.getColumnModel().getColumn(9).setMinWidth(100);
        tblProductos.getColumnModel().getColumn(9).setPreferredWidth(120);
        tblProductos.getColumnModel().getColumn(9).setMaxWidth(150);
        tblProductos.getColumnModel().getColumn(10).setMinWidth(100);
        tblProductos.getColumnModel().getColumn(10).setPreferredWidth(120);
        tblProductos.getColumnModel().getColumn(10).setMaxWidth(150);
        tblProductos.getColumnModel().getColumn(11).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(11).setPreferredWidth(0);
        tblProductos.getColumnModel().getColumn(11).setMaxWidth(0);
        tblProductos.getColumnModel().getColumn(12).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(12).setPreferredWidth(0);
        tblProductos.getColumnModel().getColumn(12).setMaxWidth(0);
        tblProductos.getColumnModel().getColumn(13).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(13).setPreferredWidth(0);
        tblProductos.getColumnModel().getColumn(14).setMinWidth(100);
        tblProductos.getColumnModel().getColumn(14).setPreferredWidth(120);
        tblProductos.getColumnModel().getColumn(14).setMaxWidth(150);
        tblProductos.getColumnModel().getColumn(13).setMaxWidth(0);
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
        tblProductos.getColumnModel().getColumn(22).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(22).setPreferredWidth(0);
        tblProductos.getColumnModel().getColumn(22).setMaxWidth(0);

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 2))), i, 2);
            tblProductos.setValueAt(big.setNumero(big.getBigDecimal((String) tblProductos.getValueAt(i, 3))), i, 3);
            tblProductos.setValueAt(big.setNumero(big.getBigDecimal((String) tblProductos.getValueAt(i, 10))), i, 10);
//            tblProductos.setValueAt(big.getBigDecimal((String) tblProductos.getValueAt(i, 11)), i, 11);
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 4))), i, 4);
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 5))), i, 5);
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 14))), i, 14);
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 7))), i, 7);
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 9))), i, 9);
            tblProductos.setValueAt(big.setMoneda(big.getMoneda((String) tblProductos.getValueAt(i, 10))), i, 10);
        }

        ndTercero nodoCliente = instancias.getSql().getDatosTercero(nodo.getCliente());
        txtIdSistema.setText(nodoCliente.getIdSistema());
        txtNit.setText(nodoCliente.getId());
        txtVendedor.setText(nodo.getVendedor());

        if (big.getBigDecimal(nodo.getRtIva()).compareTo(BigDecimal.ZERO) > 0) {
            txtRiva.setText(big.setMoneda(big.getBigDecimal(nodo.getRtIva())));
        }

        if (big.getBigDecimal(nodo.getRtFuente()).compareTo(BigDecimal.ZERO) > 0) {
            txtRtf.setText(big.setMoneda(big.getBigDecimal(nodo.getRtFuente())));
        }

        if (nodoCliente.getNombre() != null) {
            txtNombre.setText(nodoCliente.getNombre());
            txtTelefono.setText(nodoCliente.getTelefono());
        }

        txtObservaciones.setEnabled(true);

        cargarTotales();
    }

    public Object[] getOcultarIvaPanama() {
        return new Object[]{tblProductos, lbReteIva, txtRiva, lbRtf, txtRtf, txtImpuesto, txtTotalImpoconsumo,
            lbImpoconsumo, lbImpuestoBolsa};
    }

    public Object[] getOcultarIva() {
        return new Object[]{tblProductos, lbReteIva, txtRiva, txtIva, txtTotalIva, lbRtf, txtRtf, txtImpuesto, txtTotalImpoconsumo,
            lbImpoconsumo, lbImpuestoBolsa};
    }

    public void resetComprobante(int row) {
        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
            tblComprobantes.setValueAt(false, i, 2);
        }
        tblComprobantes.setRowSelectionAllowed(true);
        tblComprobantes.getSelectionModel().clearSelection();
        if(row>-1){
            tblComprobantes.getSelectionModel().addSelectionInterval(row, row);
            tblComprobantes.setValueAt(true, row, 2); 
        }
    }
    
    public void realizarNc(String comprobante) {

        try {
            Logs.debug("Ingresa a realizar nota cradito");
            if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica()) {
                if (txtNit.getText().equals("1010")) {
                    metodos.msgAdvertencia(this, "No se puede realizar la NC a este cliente");
                    return;
                }

                if (txtObservaciones.getText().equals("")) {
                    metodos.msgAdvertencia(null, "Debe ingresar la observación de la nota credito");
                    return;
                }
            }

            if (txtNombre.getText().equals("")) {
                metodos.msgError(this, "Cargue una factura");
                txtFactura.requestFocus();
                return;
            }

            if (tblProductos.getRowCount() == 0 && txtValorEfectivo.getText().equals(this.simbolo + " 0")) {
                metodos.msgError(this, "No hay producto ni valor en efectivo");
                txtValorEfectivo.requestFocus();
                return;
            }

            double v2 = new Double(big.getMoneda(txtTotal.getText().replace("Total: ", "")).toString());
            double v3 = new Double(big.getMoneda(txtTotalNc.getText()).toString());

            if (v2 > v3) {
                Object[][] nc = instancias.getSql().getDatosNc("FACT-" + txtFactura.getText());

                if (nc.length > 0) {
                    metodos.msgAdvertenciaAjustado(this, "Esta factura ya tiene nota creditos");
                } else {
                    metodos.msgAdvertenciaAjustado(this, "Valor mayor al de la factura");
                }

                return;
            }

            String dsPrefijo = "";
            if (instancias.getIdNC() != null) {
                dsPrefijo = instancias.getIdNC();
            }
            
            String cons;
            if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica()) {   
                // se bloquea para que no se consuma el consecutivo 
                cons = instancias.getSql().getNumConsecutivoBloqueando("NC")[0].toString(); 
            }else{
                // se consume el consecutivo 
                cons = instancias.getSql().getNumConsecutivo("NC")[0].toString();   
            }

            String factura = "NC-" + dsPrefijo + cons;
            
            ndFactura nodoCaja = instancias.getSql().getDatosFactura("FACT-" +  txtFactura.getText());
            
            if (comprobante.equals("Facturación Electronica") && instancias.getConfiguraciones().isFacturaElectronica()) {                        
                try {                   
                    Boolean generacionFacturaElectronica = aplicarFacturacionElectronica(factura, dsPrefijo);
                    if (!generacionFacturaElectronica) {
                        instancias.getSql().desbloquearConsecutivosfactura();
                        return;
                    }else{
                        instancias.getSql().getNumConsecutivo("NC")[0].toString();
                    } 
                } catch (Exception e) {
                    e.printStackTrace();
                    instancias.getSql().desbloquearConsecutivosfactura();
                    return;
                }
            }

            

            //PROCESO GUARDAR VENTA
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                Object vectVenta[] = {nodoCaja.getFactura() + " NC", tblProductos.getValueAt(i, 0).toString().replace("'", "//"),
                    big.getMoneda((String) tblProductos.getValueAt(i, 2)).multiply(big.getBigDecimal("-1")), "-" + tblProductos.getValueAt(i, 12),
                    big.getMoneda((String) tblProductos.getValueAt(i, 5)).multiply(big.getBigDecimal("-1")),
                    big.getMoneda((String) tblProductos.getValueAt(i, 10)).multiply(big.getBigDecimal("-1")),
                    big.getMoneda((String) tblProductos.getValueAt(i, 7)).multiply(big.getBigDecimal("-1")),
                    big.getMoneda((String) tblProductos.getValueAt(i, 4)).multiply(big.getBigDecimal("-1")),
                    "NC-" + lbNoNC.getText(), "0", "0", tblProductos.getValueAt(i, 1), tblProductos.getValueAt(i, 11),
                    "-" + formatVal(big.formatDouble(big.getMonedaToDouble(tblProductos.getValueAt(i, 3).toString().replace(".", "")))), "REALIZADO", big.getBigDecimal(tblProductos.getValueAt(i, 6)).toString(),
                    "", big.getMoneda("0"), "", "", tblProductos.getValueAt(i, 15), tblProductos.getValueAt(i, 16),
                    big.getBigDecimal(tblProductos.getValueAt(i, 8)).toString(), big.getMoneda((String) tblProductos.getValueAt(i, 9)).multiply(big.getBigDecimal("-1"))};
               
                ndNotasCredito nodoVent = metodos.llenarNotasCredito(vectVenta);

                if (!instancias.getSql().agregarNotasCredito(nodoVent)) {
                    metodos.msgError(this, "Error guardar la nota credito");
                }
            }

            if (!txtValorTotal.getText().equals(this.simbolo + " 0")) {
                ndProducto nodo = instancias.getSql().getDatosProducto("EFECTIVO", "bdProductos");
                Object vectVenta[] = {
                    nodoCaja.getFactura() + " NC", nodo.getIdSistema(),
                    big.getMoneda(txtValorEfectivo.getText()).multiply(big.getBigDecimal("-1")), "-" + 1, big.getMoneda("0"),
                    big.getMoneda(txtValorTotal.getText()).add(big.getMoneda(txtIvaEfectivo.getText())).multiply(big.getBigDecimal("-1")),
                    big.getMoneda(txtIvaEfectivo.getText()).multiply(big.getBigDecimal("-1")),
                    big.getMoneda(txtValorEfectivo.getText()).multiply(big.getBigDecimal("-1")), "NC-" + lbNoNC.getText(),
                    big.getBigDecimal("0"), "0", "EFECTIVO", "1", "1", "REALIZADO", txtIva.getText(),
                    "", big.getMoneda("0"), "", "", "", "", "0", "0"
                };

                ndNotasCredito nodoVent = metodos.llenarNotasCredito(vectVenta);

                if (!instancias.getSql().agregarNotasCredito(nodoVent)) {
                    metodos.msgError(this, "Error al guardar efectivo NC");
                }
            }

            Object[] vector = {factura, nodoCaja.getCliente(), nodoCaja.getFactura(), big.getMoneda(txtTotal.getText().replace("Total: ", "")),
                big.getMoneda(txtTotal.getText().replace("Total: ", "")), false, instancias.getUsuario(), metodos.fechaConsulta(metodosGenerales.fecha()),
                txtVendedor.getText(), instancias.getTerminal(), nodoCaja.getResolucion(),
                rdReembolsarSi.isSelected(), metodosGenerales.hora(), txtBodega.getText(), txtObservaciones.getText(), codigoAutorizacion};

            ndNc nodo = metodos.llenarNc(vector);

            if (!instancias.getSql().agregarNc(nodo)) {
                metodos.msgError(this, "Error al guardar la NC");
                return;
            }

            for (int i = 0; i < tblProductos.getRowCount(); i++) {

                ndProducto producto = instancias.getSql().getDatosProducto(tblProductos.getValueAt(i, 0).toString(), "bdProductos");

                double cantidad;
                double inventario;
                double fisicoInventario;

                try {
                    //Trae la cantidad de la factura osea 15
                    cantidad = Double.parseDouble(producto.getNc().replace(",", "."));
                } catch (Exception e) {
                    Logs.error(e);
                    cantidad = 0;
                    e.printStackTrace();
                }

                try {
                    //trae el inventario actual
                    inventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                } catch (Exception e) {
                    Logs.error(e);
                    e.printStackTrace();
                    inventario = 0;
                }

                try {
                    fisicoInventario = Double.parseDouble(producto.getFisicoInventario().replace(",", "."));
                } catch (Exception e) {
                    Logs.error(e);
                    fisicoInventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                }//trae la cantidad actual de la factura
                inventario = inventario + Double.parseDouble(tblProductos.getValueAt(i, 13).toString().replace(",", "."));
                fisicoInventario = fisicoInventario + Double.parseDouble(tblProductos.getValueAt(i, 13).toString().replace(",", "."));
                double total = cantidad + Double.parseDouble(tblProductos.getValueAt(i, 13).toString().replace(",", "."));

                String inventario1 = String.valueOf(df.format(inventario)).replace(".", ",");
                String fisicoInventario1 = String.valueOf(df.format(fisicoInventario)).replace(".", ",");
                String total1 = String.valueOf(df.format(total)).replace(".", ",");

                String baseUtilizada = nodoCaja.getBodega();
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

                instancias.getSql().modificarInventario("nc", total1, tblProductos.getValueAt(i, 0).toString(), baseUtilizada);
                instancias.getSql().modificarInventario("inventario", inventario1, tblProductos.getValueAt(i, 0).toString(), baseUtilizada);
                instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, tblProductos.getValueAt(i, 0).toString(), baseUtilizada);

                // DESCONTAR DEL INVENTARIO DETALLADO //
                if (instancias.getConfiguraciones().isProductosSerial()) {
                    String cod = tblProductos.getValueAt(i, 16).toString();

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
                            instancias.getSql().modificarEstadoDetalleProductos(cod, "DISPONIBLE");
                        } else {
                            Double cantidadActual = Double.parseDouble(instancias.getSql().getCantidadProductos(cod).replace(",", "."));
                            cantidadActual = cantidadActual + Double.parseDouble(tblProductos.getValueAt(i, 13).toString().replace(",", "."));
                            String cantidadFinal = String.valueOf(df.format(cantidadActual)).replace(".", ",");
                            instancias.getSql().modificarCantidadesDetalleProductos(cod, cantidadFinal);
                        }
                    }
                }
                // FIN DE DESCONTAR DEL INVENTARIO SEPARADO // 
            }

//            if (!instancias.getSql().aumentarConsecutivo("NC", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("NC")[0]) + 1)) {
//                metodos.msgError(this, "Hubo un problema al guardar en el consecutivo de la nota credito");
//            }

            lbNoNC.setText(dsPrefijo + (String) cons);
            metodos.msgExito(this, "Nota credito exitosa");
            String observaciones = txtObservaciones.getText();
            btnLimpiarActionPerformed(null);

            if (metodos.msgPregunta(this, "¿Desea imprimir?") == 0) {
                String infoEmpresa = metodosGenerales.convertToMultiline(instancias.getInformacionEmpresaReimpresion() + "" + nodo.getResolucion());
                instancias.getReporte().ver_Nc(factura, observaciones, infoEmpresa);
            }

            txtFactura.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            Logs.error(e);
        }
    }

    public void consultarMaestros() {
        datos = instancias.getSql().getDatosMaestra();
    }

    public void setVendedores(String[] Vendedores) {
        cmbVendedor.removeAllItems();
        for (String Vendedore : Vendedores) {
            cmbVendedor.addItem(Vendedore);
        }
    }

    public void cargarTotales() {
        double cantUnidades = 0;
        int i;
        BigDecimal subtotal = big.getBigDecimal("0"), iva = big.getBigDecimal("0"), impuesto = big.getBigDecimal("0"), total = big.getBigDecimal("0"),
                descuentos = big.getBigDecimal("0"), impoconsumo = big.getBigDecimal("0");
        BigDecimal valorBolsa = big.getMoneda(datos[53].toString());

        for (i = 0; i < tblProductos.getRowCount(); i++) {
            if (tblProductos.getValueAt(i, 0).equals("PROD-000000032")) {
                try {
                    impuesto = valorBolsa.multiply(big.getBigDecimal(tblProductos.getValueAt(i, 3)));
                } catch (Exception e) {
                    Logs.error(e);
                    impuesto = valorBolsa.multiply(big.getBigDecimal(tblProductos.getValueAt(i, 3).toString().replace(",", ".")));
                }
            }

            subtotal = subtotal.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 4))));
            descuentos = descuentos.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 5))));
            impoconsumo = impoconsumo.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 9))));
            iva = iva.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 7))));
            total = total.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 10))));
            cantUnidades = big.formatDouble(cantUnidades + big.getMonedaToDouble(tblProductos.getValueAt(i, 3).toString()));
        }

        txtImpuesto.setText(big.setMoneda(impuesto));

        subtotal = subtotal.add(big.getMoneda(txtValorEfectivo.getText()));
        total = total.add(big.getMoneda(txtValorTotal.getText())).add(big.getMoneda(txtImpuesto.getText())).subtract(big.getMoneda(txtRiva.getText()));
        iva = iva.add(big.getMoneda(txtValorTotal.getText()).subtract(big.getMoneda(txtValorEfectivo.getText())));

        BigDecimal ivaEfectivo = BigDecimal.ZERO;
        try {
            ivaEfectivo = big.getMoneda(txtIvaEfectivo.getText());
        } catch (Exception e) {
            Logs.error(e);
        }

        iva = iva.add(ivaEfectivo);
        total = total.add(ivaEfectivo);
        txtCantUnidades.setText("" + cantUnidades);
        txtSubTotal.setText(big.setMoneda(subtotal));
        txtTotalIva.setText(big.setMoneda(iva));
        txtTotalImpoconsumo.setText(big.setMoneda(impoconsumo));
        txtTotalDescuentos.setText(big.setMoneda(descuentos));
        txtTotal.setText("Total: " + big.setMoneda(total));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnBusProd;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReimprimir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbConcepto;
    private javax.swing.JComboBox cmbListas;
    private javax.swing.JComboBox cmbTipoOperacion;
    private javax.swing.JComboBox cmbVendedor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JTextField jTextTrm;
    private javax.swing.JTextField jTextTrmFecha;
    private javax.swing.JLabel lbCargar;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCodigo1;
    private javax.swing.JLabel lbCreditos;
    private javax.swing.JLabel lbDireccion1;
    private javax.swing.JLabel lbFacturaNo;
    private javax.swing.JLabel lbFechaFactura;
    private javax.swing.JLabel lbImpoconsumo;
    private javax.swing.JLabel lbImpuestoBolsa;
    private javax.swing.JLabel lbIva;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit1;
    private javax.swing.JLabel lbNoNC;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JLabel lbReteIva;
    private javax.swing.JLabel lbRtf;
    private javax.swing.JLabel lbSubtotal1;
    private javax.swing.JLabel lbTotalDescuento;
    private javax.swing.JLabel lbTotalDescuento1;
    private javax.swing.JLabel lbTotalDescuento2;
    private javax.swing.JLabel lbVendedor;
    private javax.swing.JLabel lbVendedor1;
    private javax.swing.JLabel lbVendedor2;
    private javax.swing.JLabel lbVendedor3;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInvisible;
    private javax.swing.JMenuItem popBorrar;
    private javax.swing.JRadioButton rdReembolsarNo;
    private javax.swing.JRadioButton rdReembolsarSi;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JScrollPane scrProductos;
    private javax.swing.JTable tblComprobantes;
    private javax.swing.JTable tblProductos;
    private javax.swing.JLabel textoFechaTrm;
    private javax.swing.JLabel textoTrm;
    private javax.swing.JTextField txtBodega;
    private javax.swing.JTextField txtBodega2;
    private javax.swing.JLabel txtCantProductos;
    private javax.swing.JLabel txtCantUnidades;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtFactura;
    private javax.swing.JLabel txtFechaNC;
    private javax.swing.JTextField txtIdSistema;
    private javax.swing.JLabel txtImpuesto;
    private javax.swing.JTextField txtIva;
    private javax.swing.JLabel txtIva3;
    private javax.swing.JTextField txtIvaEfectivo;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JLabel txtRiva;
    private javax.swing.JLabel txtRtf;
    private javax.swing.JTextField txtRtfPorc;
    private javax.swing.JLabel txtSubTotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtTotalDescuentos;
    private javax.swing.JLabel txtTotalImpoconsumo;
    private javax.swing.JLabel txtTotalIva;
    private javax.swing.JTextField txtTotalNc;
    private javax.swing.JTextField txtValorEfectivo;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables



   
    private Boolean aplicarFacturacionElectronica(String factura, String dsPrefijo) {
        Boolean documentoExitoso = false;
        if (instancias.getConfiguraciones().isFacturaElectronica()) {

            String paisFact = instancias.getConfiguraciones().getPais();

            if (paisFact.equals("Panama")) {
                documentoExitoso = facturacionElectronicaNCPanama(factura);
            } else if (paisFact.equals("Colombia")) {
                documentoExitoso = facturacionElectronicaNCColombia(factura, dsPrefijo);
            }
        }
        return documentoExitoso;
    }
    
    
    private boolean facturacionElectronicaNCPanama(String factura){
        
        ndTercero nodoTerc = instancias.getSql().getDatosTercero(txtIdSistema.getText());
        JsonObject comprobante = new JsonObject();
        comprobante.addProperty("apicode", Propiedades.getInstancia().getAppiCodePanama());
        comprobante.addProperty("documentNumber", factura);
        comprobante.addProperty("documentType", "D"); //A = FACTURA D = NOTA DE CREDITO B = NOTA DE DEBITO
        comprobante.addProperty("customerId", nodoTerc.getId());
        comprobante.addProperty("customerName", nodoTerc.getNombre());
        comprobante.addProperty("customerAddress", nodoTerc.getEmail());
        comprobante.addProperty("aplicadoA", "FACT-" + txtFactura.getText());


        JsonArray items = new JsonArray();


        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            JsonObject item = new JsonObject();
            String tipo = "";
            //if ((Boolean) tblProductos.getValueAt(i, 22)) {  //PENDIENTE VALIDAR ESTO APLICA SOLO PARA SERVICIOS CUANDO SE QUIERE ENVIAR MAS DESCRIPCION
                tipo = "01";
           // } else {
           //     tipo = "02";
           // }

           item.addProperty("code", tblProductos.getValueAt(i, 0).toString());
           item.addProperty("description", tblProductos.getValueAt(i, 1).toString());
           item.addProperty("qty", big.getBigDecimal(big.getMoneda(tblProductos.getValueAt(i, 3).toString())));//ojo verificar si la cantidad se va como decimal o como debe ser
           item.addProperty("price", big.getBigDecimal(big.getMoneda(tblProductos.getValueAt(i, 2).toString())));
           item.addProperty("discount", big.getBigDecimal(big.getMoneda(tblProductos.getValueAt(i, 14).toString())));
           item.addProperty("discountDescription", tblProductos.getValueAt(i, 5).toString());
           item.addProperty("tax", tblProductos.getValueAt(i, 6).toString());
           item.addProperty("type", tipo);
           if(tipo.equalsIgnoreCase("02")){
            item.addProperty("detail", tblProductos.getValueAt(i, 1).toString());
           }

           items.add(item);
        }


        JsonObject pago = new JsonObject();

        pago.addProperty("title", "CONTADO");
        pago.addProperty("amount", Double.parseDouble(big.setNumero(big.getMoneda(txtTotal.getText().replace("Total: ", ""))).replace(".", "").replace(",", ".")));
        pago.addProperty("type", "1");    

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
        discount.addProperty("description", ""+big.getMoneda(txtTotalDescuentos.getText()));
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
            Logger.getLogger(pnlFactura.class.getName()).log(Level.SEVERE, null, ex);
        }  

        if(resultado != null){
             codigoAutorizacion = resultado;
             return true;
        }else{
             return false;
        }
    }
    
    
    
    private boolean facturacionElectronicaNCColombia(String factura, String dsPrefijo){
        boolean documentoExitoso = false;
        ndTercero nodoTerc = instancias.getSql().getDatosTercero(txtIdSistema.getText());
        Object[][] paises = instancias.getSql().getPais(nodoTerc.getPais()); 
        String dsNumeroFactura = factura.replace("NC-", "").replace(dsPrefijo, "");
        String fechaEmision = metodos.fecha4(metodosGenerales.fecha()) + " " + metodosGenerales.fechaHora().split(" ")[1];
        String fechaVencimiento = metodos.fecha4(metodosGenerales.fecha());
        String emailAdquiriente = nodoTerc.getEmail();

        String tipoIdentificacionAdquiriente = getTipoDocumentoEquivalente(nodoTerc.getTipo());
        String identificacionAdquiriente = nodoTerc.getId();

        String codigoPostalAdquirente = nodoTerc.getCategoria();
        String tipoPersonaAdquiriente = "NATURAL";
        if (nodoTerc.getNaturaleza() != null) {
            if (nodoTerc.getNaturaleza().equals("Persona juridica")) {
                tipoPersonaAdquiriente = "JURIDICA";
            } else {
                tipoPersonaAdquiriente = "NATURAL";
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
        String telefonoAdquiriente = nodoTerc.getTelefono();
        Boolean adquirenteResponsable = nodoTerc.isResponsableIva();
        String regimenAdquirente = "NO_RESPONSABLE_IVA";
        if (adquirenteResponsable) {
            regimenAdquirente = "RESPONSABLE_IVA";
        }

        String cdIso = paises[0][2].toString();//"CO";
        String pais = nodoTerc.getPais();
        String ciudad = nodoTerc.getCiudad();
        String departamento = nodoTerc.getDepartamento();

        Object[][] codigo = instancias.getSql().getCodigoLugar(departamento, ciudad);
        String cdDaneDepartamento = codigo[0][0].toString();
        String cdDaneCiudad = codigo[0][1].toString();

        String snDistribucionFisica = "N";      

        String dsObservacion = txtObservaciones.getText();
        String tipoDocumentoElectronico = "NOTA_CREDITO";

        String dsNumeroReferencia = "";
        String dsPrefijoReferencia = "";
        String referenciaNotaCredito = txtFactura.getText();
        int inicio = 0;
        int inicio1 = 1;
        for (int i = 0; i < referenciaNotaCredito.length(); i++) {
            try {
                if (Integer.parseInt(referenciaNotaCredito.substring(inicio, inicio1)) > 0) {
                    dsPrefijoReferencia = referenciaNotaCredito.substring(0, inicio);
                    dsNumeroReferencia = referenciaNotaCredito.substring(inicio, referenciaNotaCredito.length());
                    break;
                }
            } catch (Exception e) {
                Logs.error(e);
            }

            inicio++;
            inicio1++;
        }
       
        String rtf = txtRtfPorc.getText();
        if (rtf.equals("RtF")) {
            rtf = "0.00";
        }
        double dsPorcentajeReteFuente = big.getMonedaToDouble(rtf.replace(".", ","));
        String dsPorcentajeReteFuente1 = "0";
        if (df.format(dsPorcentajeReteFuente).replace(",", ".").equals(".00")) {
            dsPorcentajeReteFuente1 = "0";
        } else {
            dsPorcentajeReteFuente1 = df.format(dsPorcentajeReteFuente).replace(",", ".");
        }

        
        int cargoTotal = 0, anticipoTotal = 0;
  
        double valorBaseImponible = 0.00;
        //cambio moneda   
        String moneda = "COP";
        String descripcionMoneda = "";
        JsonObject monedaCambio = new JsonObject();
        if((nodoTerc.getCodigoMoneda()!= null)){
            if(nodoTerc.getCodigoMoneda()!= "" && nodoTerc.getCodigoMoneda()!= "COP"){
              moneda = nodoTerc.getCodigoMoneda();
              if(moneda.equals("USD")){
               descripcionMoneda = "DÓLARES";
               monedaCambio.addProperty("fechaTipoCambio", jTextTrmFecha.getText());
               monedaCambio.addProperty("valorTipoCambio", jTextTrm.getText());
              } 
             }
        }
        
        String tipoOperacion = cmbTipoOperacion.getSelectedItem().toString();
        int fila = 0;
        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
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
        }

        //INICIO METODOS DE PAGO
        String minutos = metodosGenerales.hora().split(":")[0], segundos = metodosGenerales.hora().split(":")[1];
        if (minutos.length() == 1) {
            minutos = "0" + minutos;
        }

        if (segundos.length() == 1) {
            segundos = "0" + segundos;
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
//                if(Double.valueOf(dsPorcentajeReteFuente1) >0 ){
//                    adquiriente.addProperty("dsPorcentajeReteFuente",dsPorcentajeReteFuente1);
//                }
//                if(Double.valueOf(dsRetencionFuente1) >0 ){
//                    adquiriente.addProperty("dsRetencionFuente",dsRetencionFuente1);
//                }

        //adquiriente.addProperty("valorBaseImponible", valorBaseImponible1);
        adquiriente.addProperty("cargoTotal",formatVal(cargoTotal));
        adquiriente.addProperty("anticipoTotal",formatVal(anticipoTotal));
        adquiriente.addProperty("moneda",moneda);
        if(!descripcionMoneda.equals("")){
         adquiriente.add("tipoCambio", monedaCambio);
        }
        adquiriente.addProperty("tipoOperacion",tipoOperacion);
        adquiriente.addProperty("dsResolucionDian",dsResolucionDian);
        adquiriente.addProperty("versionDian",versionDian);
        adquiriente.addProperty("responsabilidadesFiscales",responsabilidadesFiscales);
        JsonArray facturasReferencia = new JsonArray();
        JsonObject facturaRef = new JsonObject();
        facturaRef.addProperty("prefijo", dsPrefijoReferencia);
        facturaRef.addProperty("numero", dsNumeroReferencia);
        facturaRef.addProperty("conceptoNotaCredito", cmbConcepto.getSelectedItem().toString());
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
        pagoJson.addProperty("formaPago",  "CONTADO");
        pagoJson.addProperty("medioPago", "EFECTIVO");
        pagoJson.addProperty("fechaVencimientoPago", fechaVencimiento + " " + minutos + ":" + segundos + ":00" );
        pagoJson.addProperty("idPago", "");
        
        Logs.log("adquiriente: " + adquiriente.toString());

        Logs.log("pago: " + pagoJson.toString());
        adquiriente.add("pago", pagoJson);
       
        int contadorIvas = 0, contadorImpos = 0;
        Object[][] arregloImpuestosIva = new Object[tblProductos.getRowCount()][3];
        Object[][] arregloImpuestosImpo = new Object[tblProductos.getRowCount()][3];

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
             int posicionImpuestoIva = 0, posicionImpuestoImpo = 0;
            Boolean impuestoExistenteIva = false, impuestoExistenteImpo = false;

            for (int j = 0; j < arregloImpuestosIva.length; j++) {
                if (arregloImpuestosIva[j][0] != null) {
                    if (arregloImpuestosIva[j][0].equals(tblProductos.getValueAt(i, 6))) {
                        posicionImpuestoIva = j;
                        impuestoExistenteIva = true;
                    }
                }
            }

            for (int j = 0; j < arregloImpuestosImpo.length; j++) {
                if (arregloImpuestosImpo[j][0] != null) {
                    if (arregloImpuestosImpo[j][0].equals(tblProductos.getValueAt(i, 8))) {
                        posicionImpuestoImpo = j;
                        impuestoExistenteImpo = true;
                    }
                }
            }

            if (impuestoExistenteIva) {
                if(big.getMonedaToDouble(tblProductos.getValueAt(i, 6).toString())>0){
                    arregloImpuestosIva[posicionImpuestoIva][1] = big.formatDouble(big.getBigDecimal(arregloImpuestosIva[posicionImpuestoIva][1].toString())) + big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
                    arregloImpuestosIva[posicionImpuestoIva][2] = big.formatDouble(big.getBigDecimal(arregloImpuestosIva[posicionImpuestoIva][2].toString())) + big.getMonedaToDouble(tblProductos.getValueAt(i, 7).toString());
                }
            } else {
                if(big.getMonedaToDouble(tblProductos.getValueAt(i, 6).toString())>0){
                    arregloImpuestosIva[contadorIvas][0] = big.formatDouble(tblProductos.getValueAt(i, 6).toString());
                    arregloImpuestosIva[contadorIvas][1] = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
                    arregloImpuestosIva[contadorIvas][2] = big.getMonedaToDouble(tblProductos.getValueAt(i, 7).toString());
                    contadorIvas = contadorIvas + 1;
                }
            }

            if (impuestoExistenteImpo) {
                if(big.getMonedaToDouble(tblProductos.getValueAt(i, 8).toString())>0){
                    arregloImpuestosImpo[posicionImpuestoImpo][1] = big.formatDouble(big.getBigDecimal(arregloImpuestosImpo[posicionImpuestoImpo][1].toString())) + big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
                    arregloImpuestosImpo[posicionImpuestoImpo][2] = big.formatDouble(big.getBigDecimal(arregloImpuestosImpo[posicionImpuestoImpo][2].toString())) + big.getMonedaToDouble(tblProductos.getValueAt(i, 9).toString());
                }
            } else {
                if(big.getMonedaToDouble(tblProductos.getValueAt(i, 8).toString())>0){
                    arregloImpuestosImpo[contadorImpos][0] = big.formatDouble(tblProductos.getValueAt(i, 8).toString());
                    arregloImpuestosImpo[contadorImpos][1] = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
                    arregloImpuestosImpo[contadorImpos][2] = big.getMonedaToDouble(tblProductos.getValueAt(i, 9).toString());
                    contadorImpos = contadorImpos + 1;
                }
            }
        }
      

        
        double totalIvas = 0.0;
        for (int i = 0; i < contadorIvas; i++) {
            totalIvas = big.sumaExacta(totalIvas , (double) arregloImpuestosIva[i][2]);
        }

        double totalImpos = 0.0;
        for (int i = 0; i < contadorImpos; i++) {
            totalImpos = totalImpos  + big.formatDouble(big.getBigDecimal(arregloImpuestosImpo[i][2].toString()));
        }


        double valorBrutoTotal = 0.0;
        Object[][] detalladoProductos = new Object[tblProductos.getRowCount()][19];
        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            //numeroFactura
            detalladoProductos[i][0] = factura.replace("NC-", "").replace(dsPrefijo, "");

            //codigoArticulo
            detalladoProductos[i][1] = tblProductos.getValueAt(i, 17);

            //estandarProducto
            String estandar = tblProductos.getValueAt(i, 18).toString();
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
            double porcIva =  big.getMonedaToDouble(tblProductos.getValueAt(i, 6).toString());
            
            detalladoProductos[i][4] = porcIva;

            //porcentajeIca
            detalladoProductos[i][5] = "0";

            //porcentajeConsumo
            double porcImpo =  big.getMonedaToDouble(tblProductos.getValueAt(i, 8).toString());
           
            detalladoProductos[i][6] = porcImpo;

            //cantidad
            double cantidad = big.getMonedaToDouble(tblProductos.getValueAt(i, 3).toString());          
            detalladoProductos[i][7] = cantidad;

            //precioUnitario
            double precioUnitario = big.getMonedaToDouble(tblProductos.getValueAt(i, 2).toString());
            detalladoProductos[i][8] = precioUnitario;

            //valorTotalArticulo
            double valorTotalArticulo = big.getMonedaToDouble(tblProductos.getValueAt(i, 10).toString())/ big.getMonedaToDouble(tblProductos.getValueAt(i, 3).toString());
            detalladoProductos[i][9] = valorTotalArticulo;
            
            //valorIva
            double valorIva = big.getMonedaToDouble(tblProductos.getValueAt(i, 7).toString());
            detalladoProductos[i][10] = valorIva;
      
            
            //valorImpo
            double valorImpo = big.getMonedaToDouble(tblProductos.getValueAt(i, 9).toString());
            detalladoProductos[i][11] = valorImpo;

            //unidadMedida
            detalladoProductos[i][12] = tblProductos.getValueAt(i, 21).toString();

            //valorTotalBruto
            double valorDescuento = big.getMonedaToDouble(tblProductos.getValueAt(i, 5).toString());
            double valorTotalBruto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
            valorTotalBruto = valorTotalBruto + valorDescuento;
            valorBrutoTotal = big.formatDouble(valorBrutoTotal + valorTotalBruto);
            detalladoProductos[i][13] = valorTotalBruto;
//              if (instancias.isPvpConIva() && instancias.isPvpConImpoconsumo()) {
//                 double valorTotalBruto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
//
//                 //valorTotalBruto = valorTotalBruto - (valorImpo + valorIva);
//                 valorBrutoTotal+=valorTotalBruto;
//                 detalladoProductos[i][13] = valorTotalBruto;
//             }else if (instancias.isPvpConImpoconsumo()) {
//                 double valorTotalBruto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
//
//                //valorTotalBruto = valorTotalBruto - valorImpo;
//                valorBrutoTotal+=valorTotalBruto;
//                detalladoProductos[i][13] = valorTotalBruto;
//             }else if (instancias.isPvpConIva()) {
//                double valorTotalBruto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
//  
//                //valorTotalBruto = valorTotalBruto -  valorIva;
//                valorBrutoTotal+=valorTotalBruto;
//                detalladoProductos[i][13] = valorTotalBruto;
//            } else {
//                double valorTotalBruto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
//
//                valorBrutoTotal+=valorTotalBruto;
//                detalladoProductos[i][13] = valorTotalBruto;
//            }

            //unidadesEmpaque
            detalladoProductos[i][14] = big.formatDouble(big.getMonedaToDouble(tblProductos.getValueAt(i, 12).toString()) / big.getMonedaToDouble(tblProductos.getValueAt(i, 3).toString()));

            //valorTotalImpuestosRetenciones
            double valorTotalImpuestosRetenciones = Double.parseDouble(big.setNumero(big.getMoneda(tblProductos.getValueAt(i, 9).toString())).replace(".", "").replace(",", "."))
                    + Double.parseDouble(big.setNumero(big.getMoneda(tblProductos.getValueAt(i, 7).toString())).replace(".", "").replace(",", "."));
          
            detalladoProductos[i][17] = valorTotalImpuestosRetenciones;

            //codigoVendedor
            String codigoVendedor = instancias.getSql().getIdEmpleado(cmbVendedor.getSelectedItem().toString());
            detalladoProductos[i][18] = codigoVendedor;

        }


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
        
        if (big.getMoneda(txtRiva.getText()).compareTo(BigDecimal.ZERO) > 0) {

            JsonObject impuestosRetencionesRteIva = new JsonObject();
            JsonArray arraySubTotalesRteIva = new JsonArray();

            impuestosRetencionesRteIva.addProperty("valorTotal", formatVal(totalImpos));
            impuestosRetencionesRteIva.add("subtotales", arraySubTotalesRteIva);
            JsonObject subTotal = new JsonObject();

            subTotal.addProperty("valorBase", formatVal(Double.parseDouble(big.setNumero(big.getMoneda(txtTotalIva.getText())).replace(".", "").replace(",", "."))).replace(",", "."));
            subTotal.addProperty("valorImpuestoRetencion", formatVal(Double.parseDouble(big.setNumero(big.getMoneda(txtRiva.getText())).replace(".", "").replace(",", "."))).replace(",", "."));
            subTotal.addProperty("porcentaje", "15.00");
            subTotal.addProperty("tributo", "RETE_IVA");
            arraySubTotalesRteIva.add(subTotal);  
            impuestosRetenciones.add(impuestosRetencionesRteIva);
        }

        if (big.getMoneda(txtRtf.getText()).compareTo(BigDecimal.ZERO) > 0) {
            JsonObject impuestosRetencionesRteFuente = new JsonObject();
            JsonArray arraySubTotalesRteFuente = new JsonArray();

            impuestosRetencionesRteFuente.addProperty("valorTotal", formatVal(big.getMonedaToDouble(txtRtf.getText())).replace(",", "."));
            impuestosRetencionesRteFuente.add("subtotales", arraySubTotalesRteFuente);
            JsonObject subTotal = new JsonObject();

            subTotal.addProperty("valorBase",""+ formatVal(Double.parseDouble(big.setNumero(big.getMoneda(txtSubTotal.getText())).replace(".", "").replace(",", "."))).replace(",", "."));
            subTotal.addProperty("valorImpuestoRetencion", formatVal(big.getMonedaToDouble(txtRtf.getText())).replace(",", "."));
            subTotal.addProperty("porcentaje", dsPorcentajeReteFuente1);
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


        JsonArray arrayDetalles = new JsonArray();

        double valorDescuento = 0;
        JsonArray arraydescuentosGeneral = new JsonArray();
        for (int i = 0; i < tblProductos.getRowCount(); i++) {

            JsonObject detalle = new JsonObject();
            
            detalle.addProperty("numeroFactura", ""+detalladoProductos[i][0]);
            detalle.addProperty("codigoArticulo", ""+detalladoProductos[i][1]);
            //detalle.addProperty("estandarProducto", ""+ detalladoProductos[i][2]);
            detalle.addProperty("descripcionArticulo", ""+detalladoProductos[i][3]);
            detalle.addProperty("cantidad", formatVal(big.formatDouble(detalladoProductos[i][7].toString())));                    
            detalle.addProperty("precioUnitario", formatVal(big.formatDouble(detalladoProductos[i][8].toString())));
            detalle.addProperty("valorTotalArticulo", formatVal(detalladoProductos[i][9]));
            //detalle.addProperty("nota", ""+detalladoProductos[i][19]);
            //detalle.addProperty("observacionDetalle", ""+detalladoProductos[i][19]);
            detalle.addProperty("unidadMedida", ""+detalladoProductos[i][12]);            
            detalle.addProperty("valorTotalBruto", formatVal(big.formatDouble(detalladoProductos[i][13].toString())));
            detalle.addProperty("valorTotalImpuestosRetenciones", formatVal(big.formatDouble(detalladoProductos[i][17].toString())+big.getMonedaToDouble(txtRtf.getText())));

            //detalle.addProperty("porcentajeIva", ""+detalladoProductos[i][4]);
            //detalle.addProperty("porcentajeIca", ""+detalladoProductos[i][5]);
            //detalle.addProperty("porcentajeConsumo", ""+detalladoProductos[i][6]);

            //detalle.addProperty("valorIva", ""+detalladoProductos[i][10]);

            //detalle.addProperty("unidadesEmpaque", ""+detalladoProductos[i][14]);

            //detalle.addProperty("codigoVendedor", ""+detalladoProductos[i][18] );
   
            
            if (big.getMonedaToDouble(tblProductos.getValueAt(i, 5).toString()) > 0) {
                Logs.error("ENTRO POR DESCUENTOS ");
                JsonArray cargosDescuentos = new JsonArray();
                boolean descuentoExiste = false;
                JsonObject descuento = new JsonObject();

                descuento.addProperty("tipo", ""+false);
                descuento.addProperty("codigoDescuento",tblProductos.getValueAt(i, 20).toString().split("///")[0]);
                descuento.addProperty("porcentaje", formatVal(big.formatDouble(tblProductos.getValueAt(i, 19).toString())));
                
                double valorDesc = big.getMonedaToDouble(tblProductos.getValueAt(i, 5).toString());
               
                valorDescuento = valorDescuento + valorDesc;
                descuento.addProperty("valor", formatVal(valorDesc));
//              descuento.addProperty("valorBase", formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString()) + valorDesc));
                descuento.addProperty("valorBase", formatVal(big.formatDouble(big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString().replace(".", ""))+ valorDesc )));
                cargosDescuentos.add(descuento);
                
                JsonObject descuentoTmp = null;
                for (JsonElement cargosDescuento : arraydescuentosGeneral) {
                    descuentoTmp =  cargosDescuento.getAsJsonObject();
                    String codigoDescuento = tblProductos.getValueAt(i, 20).toString().split("///")[0];
                    if(descuentoTmp != null && descuentoTmp.get("codigoDescuento").getAsString().equalsIgnoreCase(codigoDescuento) && descuentoTmp.get("porcentaje").getAsString().equalsIgnoreCase(descuento.get("porcentaje").getAsString())){
                        valorDesc = descuentoTmp.get("valor").getAsDouble()+valorDesc;
                        descuentoTmp.addProperty("valor",formatVal(big.formatDouble(valorDesc+"")));
                        descuentoTmp.addProperty("valorBase", formatVal(descuentoTmp.get("valorBase").getAsDouble()+ big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString()) + valorDesc));
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

                impuestoRetencionBolsa.addProperty("valorTotal", formatVal(Double.parseDouble(big.setNumero(big.getMoneda(txtImpuesto.getText())).replace(".", "").replace(",", "."))).replace(",", "."));
                impuestoRetencionBolsa.add("subtotales", subTotales);
                JsonObject subTotal = new JsonObject();

                subTotal.addProperty("valorBase", formatVal(big.formatDouble(detalladoProductos[i][8].toString())));
                subTotal.addProperty("valorImpuestoRetencion", formatVal(big.getMonedaToDouble(datos[53].toString())));
                subTotal.addProperty("porcentaje", "0.00");
                subTotal.addProperty("tributo", "BOLSAS");
                subTotal.addProperty("unidadMedida","" + detalladoProductos[i][12]);
                subTotal.addProperty("valorUnitario",formatVal(detalladoProductos[i][8]));

                subTotales.add(subTotal);  
                impuestosRetencionesProducto.add(impuestoRetencionBolsa);
            }

            double baseImponibleProducto = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());


            if (big.getMoneda(txtRtf.getText()).compareTo(BigDecimal.ZERO) > 0) {
                JsonObject impuestoRetencionRtf = new JsonObject();
                JsonArray subTotalesRtf = new JsonArray();

                impuestoRetencionRtf.addProperty("valorTotal", formatVal(big.getMonedaToDouble(txtRtf.getText())).replace(",", "."));
                impuestoRetencionRtf.add("subtotales", subTotalesRtf);
                JsonObject subTotalRtf = new JsonObject();


                subTotalRtf.addProperty("valorBase",formatVal(baseImponibleProducto));
                subTotalRtf.addProperty("valorImpuestoRetencion",formatVal(big.getMonedaToDouble(txtRtf.getText())).replace(",", "."));
                subTotalRtf.addProperty("porcentaje", formatVal(dsPorcentajeReteFuente));
                subTotalRtf.addProperty("tributo","RETE_FUENTE");

                subTotalesRtf.add(subTotalRtf);  
                impuestosRetencionesProducto.add(impuestoRetencionRtf);
            }


            if (big.getMoneda(tblProductos.getValueAt(i, 6).toString()).compareTo(BigDecimal.ZERO) > 0) {
                JsonObject impuestoRetencionIva = new JsonObject();
                JsonArray subTotalesIva = new JsonArray();

                impuestoRetencionIva.addProperty("valorTotal", formatVal(detalladoProductos[i][10]));
                impuestoRetencionIva.add("subtotales", subTotalesIva);
                JsonObject subTotalIva = new JsonObject();


                subTotalIva.addProperty("valorBase",formatVal(baseImponibleProducto));
                subTotalIva.addProperty("valorImpuestoRetencion",formatVal(detalladoProductos[i][10]));
                subTotalIva.addProperty("porcentaje", formatVal(big.formatDouble(tblProductos.getValueAt(i, 6).toString())));
                subTotalIva.addProperty("tributo","IVA");

                subTotalesIva.add(subTotalIva);  
                impuestosRetencionesProducto.add(impuestoRetencionIva);

                valorBaseImponible = big.formatDouble(valorBaseImponible + baseImponibleProducto);
                baseSumada = true;
              
            }
            
           

            if (big.getMoneda(tblProductos.getValueAt(i, 9).toString()).compareTo(BigDecimal.ZERO) > 0) {
                JsonObject impuestoRetencionInc = new JsonObject();
                JsonArray subTotalesInc = new JsonArray();

                impuestoRetencionInc.addProperty("valorTotal", formatVal(detalladoProductos[i][11]));
                impuestoRetencionInc.add("subtotales", subTotalesInc);
                JsonObject subTotalInc = new JsonObject();

                subTotalInc.addProperty("valorBase", formatVal(baseImponibleProducto));
                subTotalInc.addProperty("valorImpuestoRetencion", formatVal(detalladoProductos[i][11]));
                subTotalInc.addProperty("porcentaje",formatVal(big.formatDouble(tblProductos.getValueAt(i, 8).toString())));
                subTotalInc.addProperty("tributo","INC");

                subTotalesInc.add(subTotalInc);  
                impuestosRetencionesProducto.add(impuestoRetencionInc);
                
                 if(!baseSumada){
                    valorBaseImponible = big.formatDouble(valorBaseImponible + baseImponibleProducto);
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
//        adquiriente.addProperty("descuentoTotal",formatVal(valorDescuento)); //se debe aproximar
        adquiriente.addProperty("descuentoTotal", formatVal(big.formatDouble(valorDescuento+"")));
        convertirNumeroALetras convertirNumeroALetras = new convertirNumeroALetras();
        
        if(!descripcionMoneda.equals("")){
            
         adquiriente.addProperty("valorEnLetras", convertirNumeroALetras.Convertir(formatVal(varloNeto),descripcionMoneda));
        }else{
           
         adquiriente.addProperty("valorEnLetras", convertirNumeroALetras.Convertir(formatVal(varloNeto)));
        }
       
        adquiriente.addProperty("customTotalUnidades", txtCantUnidades.getText());

        Logs.log("json: " + adquiriente.toString());
         //condicional de btw y domina
         //if(true){
         setBtwNotaCredito(adquiriente,detalladoProductos);
         //}else{
         
         
         //}

        facturacionElectronica facturacion = new facturacionElectronica(instancias.getNitEmisor(),instancias.getTokenEmisor());

        try {
            documentoExitoso = facturacion.consumirServicio2(adquiriente.toString(), true);
        } catch (Exception ex) {
            Logs.error(ex);
        }
        return documentoExitoso;
    }
    
    private String setBtwNotaCredito(JsonObject adquiriente, Object[][] detalladoProductos){
        
   JsonObject notasCredito = new JsonObject();
   JsonObject jsonNotaCredito = new JsonObject();
   // CREAR EL JSON CON LOS VALORES DE LOS CAMPOS A ENVIAR
   
   notasCredito.addProperty("company", instancias.getNitEmisor().split("-")[0]);
   notasCredito.addProperty("invoiceType", "CreditNoteType");
   notasCredito.addProperty("invoiceNum",adquiriente.get("dsNumeroFactura").getAsString());
   notasCredito.addProperty("legalNumber",lbNoNC.getText());
   notasCredito.addProperty("invoiceRef",txtFactura.getText());
   notasCredito.addProperty("custNum",txtNit.getText());
   ndTercero nodoTerc2 = instancias.getSql().getDatosTercero(txtIdSistema.getText());
   notasCredito.addProperty("contactName",nodoTerc2.getNombre());
   notasCredito.addProperty("customerName",nodoTerc2.getNombre());
   
   String fechaEmision = formatoFecha(adquiriente.get("fechaEmision").getAsString(),"yyyy-MM-dd HH:mm:ss","MM/dd/yyyy");
   String fechaVencimiento = formatoFecha(adquiriente.get("fechaVencimiento").getAsString(),"yyyy-MM-dd","MM/dd/yyyy");
      
   notasCredito.addProperty("invoiceDate",fechaEmision);
   notasCredito.addProperty("dueDate",fechaVencimiento);
   
   String valorNumero = eliminarCaracteres(txtSubTotal.getText(),"$","");
   int subTotalFactura = Integer.parseInt(valorNumero);
   notasCredito.addProperty("dspDocSubTotal",subTotalFactura);
   
   String valorNumeroIva = eliminarCaracteres(txtTotalIva.getText(),"$","");
   String valorTotalImpoconsumo = eliminarCaracteres(txtTotalImpoconsumo.getText(),"$","");
   int ivaFactura = Integer.parseInt(valorNumeroIva) + Integer.parseInt(valorTotalImpoconsumo); // se agrega valor de impoconsumo validar
   notasCredito.addProperty("docTaxAmt",ivaFactura);   
   String valortxtRiva = eliminarCaracteres(txtRiva.getText(),"$","");
   String valortxtRtf = eliminarCaracteres(txtRtf.getText(),"$","");
   int valorRetensiones = Integer.parseInt(valortxtRiva) + Integer.parseInt(valortxtRtf); // validar si son los dos o uno solo u otro valor
   notasCredito.addProperty("docWHTaxAmt",valorRetensiones);   
  
    String valortxtTotal = eliminarCaracteres(txtTotal.getText(),"Total: $","");
    int valorTotal = Integer.parseInt(valortxtTotal);
    notasCredito.addProperty("dspDocInvoiceAmt",valorTotal);
    
    notasCredito.addProperty("invoiceComment",txtObservaciones.getText());
    notasCredito.addProperty("currencyCodeCurrencyID",adquiriente.get("moneda").getAsString());
    notasCredito.addProperty("currencyCode",adquiriente.get("moneda").getAsString());
      
    String totalDescuentos = eliminarCaracteres(txtTotalDescuentos.getText(),"$","");
    int  valorTotalDescuentos = Integer.parseInt(totalDescuentos);
    notasCredito.addProperty("discount",valorTotalDescuentos);
 
   
    switch(cmbConcepto.getSelectedItem().toString())
    {
     case "DEVOLUCION_BIENES" :
        notasCredito.addProperty("cmReasonCode_c","1");
        notasCredito.addProperty("cmReasonDesc_c","Devolución parcial de los bienes y/o no aceptación parcial del servicio");
        break; // break es opcional
    case "ANULACION_FACTURA" :
        notasCredito.addProperty("cmReasonCode_c","2");
        notasCredito.addProperty("cmReasonDesc_c","Anulación de factura electrónica");
        break; // break es opcional      
     case "REBAJA_APLICADA" :
        notasCredito.addProperty("cmReasonCode_c","3");
        notasCredito.addProperty("cmReasonDesc_c","Rebaja o descuento parcial o total");
        break; // break es opcional   
    case "AJUSTE_DE_PRECIO" :
        notasCredito.addProperty("cmReasonCode_c","4");
        notasCredito.addProperty("cmReasonDesc_c","Ajuste de precio");
        break; // break es opcional   
    default :
        notasCredito.addProperty("cmReasonCode_c","5");
        notasCredito.addProperty("cmReasonDesc_c","Otros");
    }
    
    notasCredito.addProperty("dmReasonCode_c","0");
    notasCredito.addProperty("dmReasonDesc_c","0");
        
    JsonObject pagoJson = new JsonObject();
    pagoJson = adquiriente.get("pago").getAsJsonObject();
    
    if (pagoJson.get("formaPago").getAsString().equals("CONTADO")){
            notasCredito.addProperty("PaymentMeansID_c","1");
    } else if (pagoJson.get("formaPago").getAsString().equals("CREDITO")) {
            notasCredito.addProperty("PaymentMeansID_c","2");
    }
    notasCredito.addProperty("PaymentMeansDescription",pagoJson.get("formaPago").getAsString());
    
    //Validar otros medios de pago como se llaman
    String medioPago = codTipoPago(pagoJson.get("medioPago").getAsString());
    
    notasCredito.addProperty("PaymentMeansCode_c",medioPago);

    String fechaEmision2 = formatoFecha(adquiriente.get("fechaEmision").getAsString(),"yyyy-MM-dd HH:mm:ss","dd/MM/yyyy");
    String fechaVencimiento2 = formatoFecha(adquiriente.get("fechaVencimiento").getAsString(),"yyyy-MM-dd","dd/MM/yyyy");
    long diasPlazo = metodos.restarFecha(fechaEmision2,fechaVencimiento2);  
    notasCredito.addProperty("paymentDurationMeasure",Long.toString(diasPlazo));
    notasCredito.addProperty("paymentDueDate",pagoJson.get("fechaVencimientoPago").getAsString());
    String dateCalculationRate = formatoFecha(adquiriente.get("fechaEmision").getAsString(),"yyyy-MM-dd HH:mm:ss","yyyy-MM-dd");
    notasCredito.addProperty("dateCalculationRate_c",dateCalculationRate);
    
    jsonNotaCredito.add("invcHead",notasCredito);
    
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
            
            double montoIVA = big.formatDouble(tblProductos.getValueAt(i, 7).toString());
            if (montoIVA > 0){
                invcTax.addProperty("company",instancias.getNitEmisor().split("-")[0]);
                invcTax.addProperty("invoiceNum",adquiriente.get("dsNumeroFactura").getAsString());
                invcTax.addProperty("invoiceLine",i+1); 
                invcTax.addProperty("currencyCode",adquiriente.get("moneda").getAsString());
                String valorIVA = obtenerValorIVA(tblProductos.getValueAt(i, 6).toString()); // VALIDAR CUANTOS NIVELES DE IVA PUEDEN HABER
                invcTax.addProperty("rateCode",valorIVA);
                invcTax.addProperty("docTaxableAmt",DocExtPrice);   
                invcTax.addProperty("taxAmt",montoIVA);
                invcTax.addProperty("docTaxAmt",montoIVA);
                invcTax.addProperty("percent",big.formatDouble(tblProductos.getValueAt(i, 7).toString()));
                if(valorRetensiones > 0){
                    invcTax.addProperty("withholdingTax_c",true);
                }else {
                    invcTax.addProperty("withholdingTax_c",false);
                }
             arrayinvcTax.add(invcTax);
            }
           
            
            //******* clase invcDisc*****************************************************
            if (valorDesc > 0){
                
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
                if (valorDesc > 0){
                    invcMisc.addProperty("miscBaseAmt",big.formatDouble(unitPrice));
                }else{
                    invcMisc.addProperty("miscBaseAmt",0);
                } 
               arrayinvcMisc.add(invcMisc);
    
         }  
    }
    
     
    jsonNotaCredito.add("invcDtl",arrayinvcDtl);
    jsonNotaCredito.add("invcTax",arrayinvcTax);
 
        jsonNotaCredito.add("invcMisc",arrayinvcMisc);
    
    JsonObject company = new JsonObject(); 

    company.addProperty("company",instancias.getNitEmisor().split("-")[0]);
    company.addProperty("stateTaxID",instancias.getNitEmisor().split("-")[0]);
    company.addProperty("name",nodoConf.getNombre());

    String regimenAdquiriente = setRegimenCodigo(adquiriente.get("regimenAdquirente").getAsString());
    company.addProperty("regimeType_c",regimenAdquiriente);

    company.addProperty("fiscalResposability_c",adquiriente.get("responsabilidadesFiscales").getAsString());
    
    String tipoOperacion = adquiriente.get("tipoDocumentoElectronico").getAsString();
    if (tipoOperacion.equals("NOTA_CREDITO")){
         company.addProperty("operationType_c","23");
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
    String codigoCuidad = adquiriente.getAsJsonObject().get("ciudadAdquiriente").getAsJsonObject().get("cdDane").getAsString();
    String nombreCiudad = adquiriente.getAsJsonObject().get("ciudadAdquiriente").getAsJsonObject().get("dsNombre").getAsString();
    codigoCuidad = codigoDepartamentos + codigoCuidad;
    
    company.addProperty("state",nombreDepartamentos);
    company.addProperty("stateNum",codigoDepartamentos);
    company.addProperty("city",nombreCiudad);
    company.addProperty("cityNum",codigoCuidad);
    
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

    jsonNotaCredito.add("company",company);

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

    customer.addProperty("currencyCode",adquiriente.get("moneda").getAsString());
    customer.addProperty("country",nombrePais);
    customer.addProperty("regimeType_c",regimenAdquiriente);
    customer.addProperty("fiscalResposability_c","R-99-PN");
    customer.addProperty("state",nombreDepartamentos);
    customer.addProperty("stateNum",codigoDepartamentos);
    
    customer.addProperty("city",nombreCiudad);
    customer.addProperty("cityNum",codigoCuidad);

    jsonNotaCredito.add("customer",customer);

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
    jsonNotaCredito.add("salesTRC",arraysalesTRC);
 
    //******* clase COOneTime***********************************************
    
    JsonObject coOneTime = new JsonObject(); 
    
    coOneTime.addProperty("company",instancias.getNitEmisor().split("-")[0]);
    coOneTime.addProperty("identificationType",codigoIdentificacion);
    //coOneTime.addProperty("coOneTimeID",adquiriente.get("identificacionAdquiriente").getAsString());
    coOneTime.addProperty("coOneTimeID",txtNit.getText());
    coOneTime.addProperty("companyName",nodoTerc2.getNombre());
    coOneTime.addProperty("countryCode","CO");

    jsonNotaCredito.add("coOneTime",coOneTime);

     //******* clase PrepaidPayment***********************************************
    JsonObject prepaidPayment = new JsonObject(); 
    JsonArray arrayprepaidPayment = new JsonArray();
    
    prepaidPayment.addProperty("prepaidPaymentID_c","Anticipo");
    prepaidPayment.addProperty("paidDate","2017-12-01");
    prepaidPayment.addProperty("paidTime","12:00:00");
    prepaidPayment.addProperty("paidAmount",0);
    prepaidPayment.addProperty("instructionPrepaidPayment_c","No Aplica");

    arrayprepaidPayment.add(prepaidPayment);
    jsonNotaCredito.add("prepaidPayment",arrayprepaidPayment);

    jsonNotaCredito.add("invcDisc",arrayinvcDisc);
    
     //******* clase additionalTag***********************************************
     
    JsonObject additionalTag = new JsonObject(); 
    JsonArray arrayadditionalTag = new JsonArray();
    
    additionalTag.addProperty("company",instancias.getNitEmisor().split("-")[0]);
    additionalTag.addProperty("invoiceNum",adquiriente.get("dsNumeroFactura").getAsString());
    
    arrayadditionalTag.add(additionalTag);
    jsonNotaCredito.add("additionalTag",arrayadditionalTag);
    
    String jsonNC = jsonNotaCredito.toString();
    //ObjectMapper mapper = new ObjectMapper(); 
    
     ndNotasCredito notaCredito = new ndNotasCredito();
     
    boolean estadoNotaCredito = notaCredito.consumirServicioApiClickingPosBTW(jsonNC,instancias.getNitEmisor());

      //System.err.println("JSON btw "+invcHead.toString());
      return "";
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
        } else if (tipoIdentificacionAdquiriente.equals("PEP")) {
            return "PEP";    
        } else if (tipoIdentificacionAdquiriente.equals("NUIP")) {
            return "NUIP";    
        } else {
            return tipoIdentificacionAdquiriente;
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
