package formularios.Ventas;

import clases.IconCellRenderer;
import clases.Instancias;
import clases.big;
import clases.metodosGenerales;
import configuracion.dlgSolicitarPermisos;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logs.Logs;

public class dlgPedidosPendientes extends javax.swing.JDialog {

    private Instancias instancias;
    DefaultTableModel modelo;
    TableRowSorter modeloOrdenado;
    DefaultTableModel modeloComprobantes;

    DefaultTableModel modelo1;
    TableRowSorter modeloOrdenado1;

    String procesoActual = "";
    Boolean guardoFact = false;

    metodosGenerales metodos = new metodosGenerales();

    public Boolean getGuardoFact() {
        return guardoFact;
    }

    public void setGuardoFact(Boolean guardoFact) {
        this.guardoFact = guardoFact;
    }

    public dlgPedidosPendientes(java.awt.Frame parent, boolean modal, String cliente, String proceso) {
        super(parent, modal);
        initComponents();
        lbTipoOperacion.setVisible(false);
        cmbTipoOperacion.setVisible(false);
        cmbTipoOperacion.setSelectedIndex(9);
       
        tblProductos.setDefaultRenderer(Object.class, new IconCellRenderer());

        this.setLocationRelativeTo(null);
        this.setTitle("Pedidos");
        instancias = Instancias.getInstancias();
        modelo = (DefaultTableModel) tblProductos.getModel();
        modeloOrdenado = new TableRowSorter<>(modelo);
        tblProductos.setRowSorter(modeloOrdenado);
        procesoActual = proceso;

        if (!instancias.getConfiguraciones().isEmbarcaciones()) {
            tblProductos.getColumnModel().getColumn(7).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        if (proceso.equals("Facturar")) {
            tblProductos.getColumnModel().getColumn(7).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(7).setMaxWidth(0);
            lbTitulo.setText("FACTURAR PEDIDOS");
        } else {
            if (instancias.getConfiguraciones().isEmbarcaciones()) {
                if (proceso.equals("Chequeo")) {
                    lbTitulo.setText("REVISAR PEDIDOS");
                } else {
                    tblProductos.getColumnModel().getColumn(2).setMinWidth(0);
                    tblProductos.getColumnModel().getColumn(2).setPreferredWidth(0);
                    tblProductos.getColumnModel().getColumn(2).setMaxWidth(0);
                    tblProductos.getColumnModel().getColumn(7).setMinWidth(0);
                    tblProductos.getColumnModel().getColumn(7).setPreferredWidth(0);
                    tblProductos.getColumnModel().getColumn(7).setMaxWidth(0);
                }

                btnFinalizar.setVisible(false);
                tblProductos.getColumnModel().getColumn(5).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(5).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(5).setMaxWidth(0);
                txtPlazo.setEnabled(false);
            } else {
                btnFinalizar.setVisible(true);
            }
        }

        cargarDatos();
        modeloComprobantes = (DefaultTableModel) tblComprobantes.getModel();
        Object[][] comprobantes = instancias.getSql().getTiposComprobantes();
        for (Object[] comprobante : comprobantes) {
             if(!String.valueOf(comprobante[0]).equals("DS")){
            modeloComprobantes.addRow(new Object[]{comprobante[0], comprobante[1], false, comprobante[2], comprobante[5], comprobante[3],
                comprobante[4], comprobante[7], comprobante[6], comprobante[8], comprobante[9], comprobante[10]});
             }
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpEncabezados = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        dtInicio = new datechooser.beans.DateChooserCombo();
        chkFiltro = new javax.swing.JCheckBox();
        lbPlazo = new javax.swing.JLabel();
        txtPlazo = new javax.swing.JTextField();
        lbTipoOperacion = new javax.swing.JLabel();
        cmbTipoOperacion = new javax.swing.JComboBox();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblComprobantes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbTitulo.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("PEDIDOS PENDIENTES");

        btnFinalizar.setBackground(new java.awt.Color(46, 204, 113));
        btnFinalizar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnFinalizar.setText("FACTURAR");
        btnFinalizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnFinalizar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        tblProductos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Vendedor", "Nombre", "Total", "Fact.", "Cedula", "", "Anul", "Bodega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setRowHeight(25);
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(50);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(1).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(1).setMaxWidth(100);
            tblProductos.getColumnModel().getColumn(2).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(180);
            tblProductos.getColumnModel().getColumn(2).setMaxWidth(250);
            tblProductos.getColumnModel().getColumn(4).setMinWidth(50);
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(90);
            tblProductos.getColumnModel().getColumn(4).setMaxWidth(130);
            tblProductos.getColumnModel().getColumn(5).setMinWidth(15);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(30);
            tblProductos.getColumnModel().getColumn(5).setMaxWidth(50);
            tblProductos.getColumnModel().getColumn(6).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(6).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(7).setMinWidth(80);
            tblProductos.getColumnModel().getColumn(7).setPreferredWidth(80);
            tblProductos.getColumnModel().getColumn(7).setMaxWidth(80);
            tblProductos.getColumnModel().getColumn(8).setMinWidth(30);
            tblProductos.getColumnModel().getColumn(8).setPreferredWidth(30);
            tblProductos.getColumnModel().getColumn(8).setMaxWidth(30);
            tblProductos.getColumnModel().getColumn(9).setMinWidth(80);
            tblProductos.getColumnModel().getColumn(9).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(9).setMaxWidth(150);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setText("CEDULA:");

        txtOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOrigenKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setText("NOMBRE:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dtInicio.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        dtInicio.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dtInicioOnSelectionChange(evt);
            }
        });

        chkFiltro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        chkFiltro.setText("FILTRAR");
        chkFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkFiltroItemStateChanged(evt);
            }
        });

        lbPlazo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbPlazo.setText("DÍAS DE PLAZO:");

        txtPlazo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPlazo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlazoActionPerformed(evt);
            }
        });
        txtPlazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlazoKeyReleased(evt);
            }
        });

        lbTipoOperacion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTipoOperacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTipoOperacion.setText("Tipo operacion");

        cmbTipoOperacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTipoOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMBUSTIBLE", "EMISOR_AUTORETENEDOR", "EXCLUIDOS_Y_EXENTOS", "EXPORTACION", "GENERICA", "GENERICA_PAGO_ANTICIPADO", "GENERICA_PERIODO_FACTURACION", "CONSORCIO", "SERVICIOS_AIU", "ESTANDAR", "MANDATOS_BIENES", "MANDATOS_SERVICIOS", "SS-CUFE", "SS-CUDE", "SS-POS", "SS-SNum", "SS-Recaudo" }));

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
            tblComprobantes.getColumnModel().getColumn(2).setMinWidth(40);
            tblComprobantes.getColumnModel().getColumn(2).setPreferredWidth(40);
            tblComprobantes.getColumnModel().getColumn(2).setMaxWidth(40);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkFiltro)
                                    .addComponent(dtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbPlazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTipoOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chkFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbTipoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        int con = 0;
        String cedula = "", cedula1 = "";
        String bodega = "", bodega1 = "";

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            if ((Boolean) tblProductos.getValueAt(i, 5)) {
                if (cedula.equals("")) {
                    cedula = tblProductos.getValueAt(i, 6).toString();
                } else {
                    cedula1 = tblProductos.getValueAt(i, 6).toString();
                    if (cedula.equals(cedula1)) {

                    } else {
                        metodos.msgAdvertenciaAjustado(null, "Todos deben ser del mismo cliente");
                        return;
                    }
                }

                if (bodega.equals("")) {
                    bodega = tblProductos.getValueAt(i, 9).toString();
                } else {
                    bodega1 = tblProductos.getValueAt(i, 9).toString();
                    if (bodega.equals(bodega1)) {

                    } else {
                        metodos.msgAdvertenciaAjustado(null, "Todo debe ser de la misma bodega");
                        return;
                    }
                }
                con++;
            }
        }

        if (con == 0) {
            metodos.msgError(null, "Debe seleccionar almenos un pedido");
            return;
        } else if (con == 1) {
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                if ((Boolean) tblProductos.getValueAt(i, 5)) {
                    try {
                        instancias.getFactura().limpiar();
                        instancias.getFactura().setTipoModulo("pedido");
                        instancias.getFactura().facturarPedido("", txtPlazo.getText(), "Uno", tblProductos.getValueAt(i, 0).toString(), tblProductos.getValueAt(i, 9).toString());
                        instancias.getFactura().setTipoModulo("");
                    } catch (Exception ex) {
                        Logs.error(ex);
                        metodos.msgError(null, "Ocurrio un error : "+ex.getMessage());
                    }
                }
            }

            this.dispose();
            return;
        } else if (con > 1) {
            try {
                instancias.getFactura().limpiar();
                String cliente = "", bod = "";
                for (int i = 0; i < tblProductos.getRowCount(); i++) {
                    if ((Boolean) tblProductos.getValueAt(i, 5)) {
                        cliente = tblProductos.getValueAt(i, 6).toString();
                        instancias.getFactura().cargarPedidosPendientes(tblProductos.getValueAt(i, 0).toString());
                        bod = tblProductos.getValueAt(i, 9).toString();
                    }
                }  
                instancias.getFactura().facturarPedido(cliente, txtPlazo.getText(), "Muchos", "", bod);
            } catch (Exception ex) {
                Logs.error(ex);
                metodos.msgError(null, "Ocurrio un error : "+ex.getMessage());
            }
        }

        if (!instancias.getCancelarFactura()) {
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                if ((Boolean) tblProductos.getValueAt(i, 5)) {
                    instancias.getSql().modificarPedido(tblProductos.getValueAt(i, 0).toString(), "", "REALIZADO");
                    instancias.getSql().cambiarEstadoPedido("FACTURADO", tblProductos.getValueAt(i, 0).toString());
                }
            }
            this.dispose();
        }

//        metodos.msgExito(null, "Pedido facturado con exito.");

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        if (tblProductos.getSelectedColumn() == 7) {           
            dlgPedidosDetallePendientes pedidos = new dlgPedidosDetallePendientes(null, false,
                    tblProductos.getValueAt(tblProductos.getSelectedRow(), 0).toString());
            this.dispose();
            pedidos.setVisible(true);
        }

        if (tblProductos.getSelectedColumn() == 8) {
            if (!instancias.getUsuario().equals("ADMIN")) {
                dlgSolicitarPermisos permisos = new dlgSolicitarPermisos(null, true,
                        "ANULACIÓN PEDIDO", "ANULACION", tblProductos.getValueAt(tblProductos.getSelectedRow(), 0).toString(), "anulacion");
                permisos.setLocationRelativeTo(null);
                permisos.setVisible(true);
                return;
            } else {
                if (metodos.msgPregunta(null, "¿Anular el pedido?") != 0) {
                    return;
                } else {
                    try {
                        String nota = "";
                        nota = metodos.msgIngresar(null, "NOTA: ");
                        
                        if (nota == null) {
                            return;
                        }
                        
                        if (nota.equals("")) {
                            return;
                        }
                        
                        instancias.getPedido().cargarPedidos(tblProductos.getValueAt(tblProductos.getSelectedRow(), 0).toString());
                        
                        String bodega = "";
                        try {
                            bodega = tblProductos.getValueAt(tblProductos.getSelectedRow(), 9).toString();
                        } catch (Exception e) {
                            Logs.error(e);
                        }
                        
                        if ("".equals(bodega)) {
                            bodega = "123-22";
                        }
                        
                        String baseUtilizada = obtenerBase(bodega);
                        instancias.getPedido().anularPedido(nota, tblProductos.getValueAt(tblProductos.getSelectedRow(), 0).toString(), baseUtilizada);
                        this.dispose();
                    } catch (Exception ex) {
                        Logs.error(ex);
                        metodos.msgError(null, "Ocurrio un error : "+ex.getMessage());
                    }
                }
            }
        }

        if (evt.getClickCount() == 2) {
            try {
                instancias.getPedido().cargarPedidos(tblProductos.getValueAt(tblProductos.getSelectedRow(), 0).toString());
                this.dispose();
            } catch (Exception ex) {
                Logs.error(ex);
                metodos.msgError(null, "Ocurrio un error : "+ex.getMessage());
            }
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + txtId.getText(), 0));
        txtOrigen.setText("");
        txtNombre.setText("");
    }//GEN-LAST:event_txtIdKeyReleased

    private void txtOrigenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrigenKeyReleased
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + txtOrigen.getText(), 6));
        txtId.setText("");
        txtNombre.setText("");
    }//GEN-LAST:event_txtOrigenKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + txtNombre.getText(), 3));
        txtId.setText("");
        txtOrigen.setText("");
    }//GEN-LAST:event_txtNombreKeyReleased

    private void dtInicioOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dtInicioOnSelectionChange
        if (chkFiltro.isSelected()) {

            String ini = metodos.desdeDate(dtInicio.getCurrent());
            String condicion = " fechaFactura = '" + ini + "' ";

            Object[][] datos = instancias.getSql().getPedidosPendientes(condicion);
            DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();

            while (tblProductos.getRowCount() > 0) {
                modeloTabla.removeRow(0);
            }

            for (int i = 0; i < datos.length; i++) {
                modeloTabla.addRow(new Object[]{"", "", "", "", "", false, "", "PROCESAR"});
            }

            Icon icono = null;
            ImageIcon fot = new ImageIcon(getClass().getResource("/imagenes/borrar.png"));
            icono = new ImageIcon(fot.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT));

            for (int i = 0; i < datos.length; i++) {
                tblProductos.setValueAt(datos[i][0], i, 0);
                tblProductos.setValueAt(metodos.fecha(datos[i][1].toString()), i, 1);
                tblProductos.setValueAt(datos[i][6], i, 2);
                tblProductos.setValueAt(datos[i][4], i, 3);
                tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(datos[i][3])), i, 4);
                tblProductos.setValueAt(datos[i][5], i, 6);
                tblProductos.setValueAt(new JLabel(icono), i, 8);
            }
        }
    }//GEN-LAST:event_dtInicioOnSelectionChange

    private void chkFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkFiltroItemStateChanged
        if (chkFiltro.isSelected()) {

            String ini = metodos.desdeDate(dtInicio.getCurrent());
            String condicion = " fechaFactura = '" + ini + "' ";

            Object[][] datos = instancias.getSql().getPedidosPendientes(condicion);
            DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();

            while (tblProductos.getRowCount() > 0) {
                modeloTabla.removeRow(0);
            }

            for (int i = 0; i < datos.length; i++) {
                modeloTabla.addRow(new Object[]{"", "", "", "", "", false, "", "PROCESAR"});
            }

            Icon icono = null;
            ImageIcon fot = new ImageIcon(getClass().getResource("/imagenes/borrar.png"));
            icono = new ImageIcon(fot.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));

            for (int i = 0; i < datos.length; i++) {
                tblProductos.setValueAt(datos[i][0], i, 0);
                tblProductos.setValueAt(metodos.fecha(datos[i][1].toString()), i, 1);
                tblProductos.setValueAt(datos[i][6], i, 2);
                tblProductos.setValueAt(datos[i][4], i, 3);
                tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(datos[i][3])), i, 4);
                tblProductos.setValueAt(datos[i][5], i, 6);
                tblProductos.setValueAt(new JLabel(icono), i, 8);
            }
        } else {
            cargarDatos();
        }
    }//GEN-LAST:event_chkFiltroItemStateChanged

    private void txtPlazoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlazoKeyReleased

    }//GEN-LAST:event_txtPlazoKeyReleased

    private void txtPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlazoActionPerformed

    private void tblComprobantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseClicked

        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
            tblComprobantes.setValueAt(false, i, 2);
        }

        if (tblComprobantes.getSelectedRow() == -1) {
            tblComprobantes.setValueAt(true, 0, 2);

            if (null == tblComprobantes.getValueAt(0, 7)) {
                cmbTipoOperacion.setVisible(false);
                lbTipoOperacion.setVisible(false);
            } else {
                if (tblComprobantes.getValueAt(0, 7).equals("Facturación Electronica")) {
                    cmbTipoOperacion.setVisible(true);
                    lbTipoOperacion.setVisible(true);
                } else {
                    cmbTipoOperacion.setVisible(false);
                    lbTipoOperacion.setVisible(false);
                }
            }
        } else {
            tblComprobantes.setValueAt(true, tblComprobantes.getSelectedRow(), 2);

            if (null == tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 7)) {
                cmbTipoOperacion.setVisible(false);
                lbTipoOperacion.setVisible(false);
            } else {
                if (tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 7).equals("Facturación Electronica")) {
                    cmbTipoOperacion.setVisible(true);
                    lbTipoOperacion.setVisible(true);
                } else {
                    cmbTipoOperacion.setVisible(false);
                    lbTipoOperacion.setVisible(false);
                }
            }
        }
        instancias.getFacturaContenedor().getPnlFactura().cambiarComprobante(tblComprobantes.getSelectedRow());
        instancias.getFacturaContenedor().getPnlFactura().actualizarResolucion(tblComprobantes.getSelectedRow());
    }//GEN-LAST:event_tblComprobantesMouseClicked

    private void tblComprobantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseEntered

    }//GEN-LAST:event_tblComprobantesMouseEntered

    private void tblComprobantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseExited

    }//GEN-LAST:event_tblComprobantesMouseExited

    public String obtenerBase(String baseUtilizada) {
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
        return baseUtilizada;
    }

    public void cargarDatos() {

        Object[][] datos = null;
        if (procesoActual.equals("Facturar")) {
            datos = instancias.getSql().getPedidosPendientes(" estadoGeneral = 'REVISADO' and anulada = false ");
        } else {
            datos = instancias.getSql().getPedidosPendientes(" estadoGeneral = 'PENDIENTE' and anulada = false ");
        }

        DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();

        while (tblProductos.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }

        for (int i = 0; i < datos.length; i++) {
            modeloTabla.addRow(new Object[]{"", "", "", "", "", false, "", "PROCESAR"});
        }

        Icon icono = null;
        ImageIcon fot = new ImageIcon(getClass().getResource("/imagenes/borrar.png"));
        icono = new ImageIcon(fot.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));

        for (int i = 0; i < datos.length; i++) {
            tblProductos.setValueAt(datos[i][0], i, 0);
            tblProductos.setValueAt(metodos.fecha(datos[i][1].toString()), i, 1);
            tblProductos.setValueAt(datos[i][6], i, 2);
            tblProductos.setValueAt(datos[i][4], i, 3);
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(datos[i][3])), i, 4);
            tblProductos.setValueAt(datos[i][5], i, 6);
            tblProductos.setValueAt(new JLabel(icono), i, 8);
            tblProductos.setValueAt(datos[i][7], i, 9);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dlgPedidosPendientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgPedidosPendientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgPedidosPendientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgPedidosPendientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgPedidosPendientes dialog = new dlgPedidosPendientes(new javax.swing.JFrame(), true, null, "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JCheckBox chkFiltro;
    private javax.swing.JComboBox cmbTipoOperacion;
    private datechooser.beans.DateChooserCombo dtInicio;
    private javax.swing.ButtonGroup grpEncabezados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JLabel lbPlazo;
    private javax.swing.JLabel lbTipoOperacion;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tblComprobantes;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPlazo;
    // End of variables declaration//GEN-END:variables
}
