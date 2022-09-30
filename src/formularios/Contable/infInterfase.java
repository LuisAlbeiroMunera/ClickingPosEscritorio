package formularios.Contable;
import logs.Logs;
import clases.Instancias;
import clases.big;
import clases.cambiarColorTabla;
import clases.metodosGenerales;
import clases.productos.ndGrupo;
import clases.productos.ndProducto;
import clases.terceros.ndBodega;
import clases.terceros.ndTercero;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class infInterfase extends javax.swing.JInternalFrame {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    DefaultTableModel modelo;
    String simbolo = "";

    public infInterfase() {

        initComponents();

        modelo = (DefaultTableModel) tblComprobantes.getModel();

        tblComprobantes.setDefaultRenderer(Object.class, new cambiarColorTabla(26, 0));

//        tblComprobantes.getColumnModel().getColumn(1).setCellRenderer(new WordWrapCellRenderer());
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        instancias = Instancias.getInstancias();
        this.simbolo = instancias.getSimbolo();
        btnGuardar.setEnabled(true);

        pnlFormulario.registerKeyboardAction(accion("guardar"), "guardar", KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("limpiar"), "limpiar", KeyStroke.getKeyStroke(KeyEvent.VK_L, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("modificar"), "modificar", KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    private ActionListener accion(final String opc) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
                    case "limpiar":
                        if ((btnNuevo.isEnabled()) && (btnNuevo.isVisible())) {
                            btnNuevoActionPerformed(null);
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

        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbNit11 = new javax.swing.JLabel();
        dtInicio = new datechooser.beans.DateChooserCombo();
        lbNit9 = new javax.swing.JLabel();
        dtFinal = new datechooser.beans.DateChooserCombo();
        lbNit1 = new javax.swing.JLabel();
        txtFactInicio = new javax.swing.JTextField();
        txtFactFinal = new javax.swing.JTextField();
        lbNit2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lbNit = new javax.swing.JLabel();
        txtAnho = new javax.swing.JTextField();
        lbNit4 = new javax.swing.JLabel();
        cmbComprobantes = new javax.swing.JComboBox();
        lbNit5 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComprobantes = new javax.swing.JTable();
        btnGuardar1 = new javax.swing.JButton();

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbNit11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit11.setText("Fecha inicial:");

        dtInicio.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));

        lbNit9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit9.setText("Fecha final:");

        dtFinal.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));

        lbNit1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit1.setText("Documento inicio:");
        lbNit1.setName(""); // NOI18N
        lbNit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit1KeyReleased(evt);
            }
        });

        txtFactInicio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFactInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFactInicio.setName("Año"); // NOI18N
        txtFactInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFactInicioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFactInicioKeyTyped(evt);
            }
        });

        txtFactFinal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFactFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFactFinal.setName("Año"); // NOI18N
        txtFactFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFactFinalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFactFinalKeyTyped(evt);
            }
        });

        lbNit2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit2.setText("Documento final:");
        lbNit2.setName(""); // NOI18N
        lbNit2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit2KeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevo.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO     ");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNuevo.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GENERAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar))
                .addGap(2, 2, 2))
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("Año: *");
        lbNit.setName(""); // NOI18N
        lbNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNitKeyReleased(evt);
            }
        });

        txtAnho.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAnho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnho.setName("Año"); // NOI18N
        txtAnho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnhoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnhoKeyTyped(evt);
            }
        });

        lbNit4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit4.setText("Comprobante:");
        lbNit4.setName(""); // NOI18N
        lbNit4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit4KeyReleased(evt);
            }
        });

        cmbComprobantes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Ventas", "Recibo de caja", "Egresos", "Compras", "Entrada", "Salida", "TODOS" }));
        cmbComprobantes.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lbNit4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbComprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAnho)
                    .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbComprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        lbNit5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit5.setText("Modelo: *");
        lbNit5.setName(""); // NOI18N
        lbNit5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit5KeyReleased(evt);
            }
        });

        txtModelo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModelo.setName("Año"); // NOI18N
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        cmbTipo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Generar por documento", "Generar totalizados" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbNit11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNit1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFactInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(dtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(cmbTipo, 0, 272, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNit5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFactFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(dtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtModelo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNit1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFactInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFactFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lbNit2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNit9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModelo)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        tblComprobantes.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        tblComprobantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Documento", "Comprobante", "Detalle", "Número", "Cuenta", "Tercero", "Centro costo", "Debito", "Credito"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComprobantes.setRowHeight(25);
        tblComprobantes.getTableHeader().setReorderingAllowed(false);
        tblComprobantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComprobantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblComprobantes);
        if (tblComprobantes.getColumnModel().getColumnCount() > 0) {
            tblComprobantes.getColumnModel().getColumn(0).setMinWidth(100);
            tblComprobantes.getColumnModel().getColumn(0).setPreferredWidth(130);
            tblComprobantes.getColumnModel().getColumn(0).setMaxWidth(180);
            tblComprobantes.getColumnModel().getColumn(1).setMinWidth(80);
            tblComprobantes.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblComprobantes.getColumnModel().getColumn(1).setMaxWidth(260);
            tblComprobantes.getColumnModel().getColumn(2).setMinWidth(100);
            tblComprobantes.getColumnModel().getColumn(2).setPreferredWidth(145);
            tblComprobantes.getColumnModel().getColumn(2).setMaxWidth(200);
            tblComprobantes.getColumnModel().getColumn(3).setMinWidth(80);
            tblComprobantes.getColumnModel().getColumn(3).setPreferredWidth(130);
            tblComprobantes.getColumnModel().getColumn(3).setMaxWidth(200);
            tblComprobantes.getColumnModel().getColumn(5).setMinWidth(100);
            tblComprobantes.getColumnModel().getColumn(5).setPreferredWidth(220);
            tblComprobantes.getColumnModel().getColumn(5).setMaxWidth(270);
            tblComprobantes.getColumnModel().getColumn(6).setMinWidth(80);
            tblComprobantes.getColumnModel().getColumn(6).setPreferredWidth(160);
            tblComprobantes.getColumnModel().getColumn(6).setMaxWidth(190);
        }

        btnGuardar1.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/planillas1.png"))); // NOI18N
        btnGuardar1.setText("GUARDAR EN EXCEL");
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar1.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        scrFormulario.setViewportView(pnlFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFormulario, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(scrFormulario)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnGuardar.setEnabled(true);
        cmbComprobantes.setSelectedIndex(0);
        cmbComprobantes.setEnabled(false);
        txtAnho.setText("");
        txtFactFinal.setText("");
        txtFactInicio.setText("");

        while (tblComprobantes.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtAnho.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(this, "Debe ingresar el año");
            return;
        }

        if (cmbComprobantes.getSelectedIndex() == 0) {
            metodos.msgAdvertenciaAjustado(this, "Debe seleccionar el tipo comprobante");
            return;
        }

        if (!txtFactInicio.getText().equals("")) {
            if (txtFactFinal.getText().equals("")) {
                metodos.msgAdvertenciaAjustado(this, "Debe ingresar factura final");
                return;
            }
        }

        if (!txtFactFinal.getText().equals("")) {
            if (txtFactInicio.getText().equals("")) {
                metodos.msgAdvertenciaAjustado(this, "Debe ingresar factura inicial");
                return;
            }
        }

        //INICIO DE VALIDACION DE RANGOS
        String numeroInicial = "", prefijoInicial = "", numeroFinal = "", prefijoFinal = "";
        String condicionRangos = "AND (";
        if (!txtFactInicio.getText().equals("")) {

            String referenciaInicial = txtFactInicio.getText();
            int inicio = 0;
            int inicio1 = 1;
            for (int i = 0; i < referenciaInicial.length(); i++) {
                try {
                    if (Integer.parseInt(referenciaInicial.substring(inicio, inicio1)) > 0) {
                        prefijoInicial = referenciaInicial.substring(0, inicio);
                        numeroInicial = referenciaInicial.substring(inicio, referenciaInicial.length());
                        break;
                    }
                } catch (Exception e) {
                    Logs.error(e);
                }

                inicio++;
                inicio1++;
            }

            String referenciaFinal = txtFactFinal.getText();
            int inicio2 = 0;
            int inicio3 = 1;
            for (int i = 0; i < referenciaFinal.length(); i++) {
                try {
                    if (Integer.parseInt(referenciaFinal.substring(inicio2, inicio3)) > 0) {
                        prefijoFinal = referenciaFinal.substring(0, inicio2);
                        numeroFinal = referenciaFinal.substring(inicio2, referenciaFinal.length());
                        break;
                    }
                } catch (Exception e) {
                    Logs.error(e);
                }

                inicio2++;
                inicio3++;
            }

            if (!prefijoInicial.equals(prefijoFinal)) {
                metodos.msgAdvertenciaAjustado(this, "Los prefijos son diferentes");
                return;
            }

            if (Integer.parseInt(numeroInicial) > Integer.parseInt(numeroFinal)) {
                metodos.msgAdvertencia(this, "El documento inicial debe ser menor al documento final");
                return;
            }
        }

        if (cmbComprobantes.getSelectedIndex() == 7) {

            while (tblComprobantes.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            //LLENAMOS COMPROBANTE DE VENTAS
            if (!txtFactInicio.getText().equals("")) {
                for (int i = Integer.parseInt(numeroInicial); i <= Integer.parseInt(numeroFinal); i++) {
                    condicionRangos = condicionRangos + "bdFactura.factura = 'FACT-" + prefijoInicial + i + "' OR ";
                }
            }
            if (condicionRangos.equals("AND (")) {
                condicionRangos = "";
            } else {
                condicionRangos = condicionRangos.substring(0, condicionRangos.length() - 4) + ")";
            }
            cmbComprobantes.setSelectedIndex(1);
            llenadoInformacion(condicionRangos);
            condicionRangos = "AND (";
            //FIN COMPROBANTE DE VENTAS

            //LLENAMOS COMPROBANTE DE ABONOS
            if (!txtFactInicio.getText().equals("")) {
                for (int i = Integer.parseInt(numeroInicial); i <= Integer.parseInt(numeroFinal); i++) {
                    condicionRangos = condicionRangos + "factura = 'ABONO-" + prefijoInicial + i + "' OR ";
                }
            }
            if (condicionRangos.equals("AND (")) {
                condicionRangos = "";
            } else {
                condicionRangos = condicionRangos.substring(0, condicionRangos.length() - 4) + ")";
            }
            cmbComprobantes.setSelectedIndex(2);
            llenadoInformacion(condicionRangos);
            condicionRangos = "AND (";
            //FIN COMPROBANTE DE ABONOS

            //LLENAMOS COMPROBANTE DE EGRESOS
            if (!txtFactInicio.getText().equals("")) {
                for (int i = Integer.parseInt(numeroInicial); i <= Integer.parseInt(numeroFinal); i++) {
                    condicionRangos = condicionRangos + "egreso = 'EGR-" + prefijoInicial + i + "' OR ";
                }
            }
            if (condicionRangos.equals("AND (")) {
                condicionRangos = "";
            } else {
                condicionRangos = condicionRangos.substring(0, condicionRangos.length() - 4) + ")";
            }
            cmbComprobantes.setSelectedIndex(3);
            llenadoInformacion(condicionRangos);
            condicionRangos = "AND (";
            //FIN COMPROBANTE DE ABONOS

            //LLENAMOS COMPROBANTE DE COMPRAS
            if (!txtFactInicio.getText().equals("")) {
                for (int i = Integer.parseInt(numeroInicial); i <= Integer.parseInt(numeroFinal); i++) {
                    condicionRangos = condicionRangos + "bdIngreso.id = 'ING-" + prefijoInicial + i + "' OR ";
                }
            }
            if (condicionRangos.equals("AND (")) {
                condicionRangos = "";
            } else {
                condicionRangos = condicionRangos.substring(0, condicionRangos.length() - 4) + ")";
            }
            cmbComprobantes.setSelectedIndex(4);
            llenadoInformacion(condicionRangos);
            condicionRangos = "AND (";
            //FIN COMPROBANTE DE COMPRAS

            //LLENAMOS COMPROBANTE DE ENTRADAS
            if (!txtFactInicio.getText().equals("")) {
                for (int i = Integer.parseInt(numeroInicial); i <= Integer.parseInt(numeroFinal); i++) {
                    condicionRangos = condicionRangos + "bdTraslados.Id = 'TRAS-" + prefijoInicial + i + "' OR ";
                }
            }
            if (condicionRangos.equals("AND (")) {
                condicionRangos = "";
            } else {
                condicionRangos = condicionRangos.substring(0, condicionRangos.length() - 4) + ")";
            }
            cmbComprobantes.setSelectedIndex(5);
            llenadoInformacion(condicionRangos);
            condicionRangos = "AND (";
            //FIN COMPROBANTE DE ENTRADAS

            //LLENAMOS COMPROBANTE DE SALIDAS
            if (!txtFactInicio.getText().equals("")) {
                for (int i = Integer.parseInt(numeroInicial); i <= Integer.parseInt(numeroFinal); i++) {
                    condicionRangos = condicionRangos + "bdTraslados.Id = 'TRAS-" + prefijoInicial + i + "' OR ";
                }
            }
            if (condicionRangos.equals("AND (")) {
                condicionRangos = "";
            } else {
                condicionRangos = condicionRangos.substring(0, condicionRangos.length() - 4) + ")";
            }
            cmbComprobantes.setSelectedIndex(6);
            llenadoInformacion(condicionRangos);
            //FIN COMPROBANTE DE SALIDAS

            cmbComprobantes.setSelectedIndex(7);

            return;
        } else {
            if (!txtFactInicio.getText().equals("")) {
                for (int i = Integer.parseInt(numeroInicial); i <= Integer.parseInt(numeroFinal); i++) {
                    if (cmbComprobantes.getSelectedItem().equals("Ventas")) {
                        condicionRangos = condicionRangos + "bdFactura.factura = 'FACT-" + prefijoInicial + i + "' OR ";
                    } else if (cmbComprobantes.getSelectedItem().equals("Recibo de caja")) {
                        condicionRangos = condicionRangos + "factura = 'ABONO-" + prefijoInicial + i + "' OR ";
                    } else if (cmbComprobantes.getSelectedItem().equals("Egresos")) {
                        condicionRangos = condicionRangos + "egreso = 'EGR-" + prefijoInicial + i + "' OR ";
                    } else if (cmbComprobantes.getSelectedItem().equals("Compras")) {
                        condicionRangos = condicionRangos + "bdIngreso.id = 'ING-" + prefijoInicial + i + "' OR ";
                    } else if (cmbComprobantes.getSelectedItem().equals("Entrada")) {
                        condicionRangos = condicionRangos + "bdTraslados.Id = 'TRAS-" + prefijoInicial + i + "' OR ";
                    } else if (cmbComprobantes.getSelectedItem().equals("Salida")) {
                        condicionRangos = condicionRangos + "bdTraslados.Id = 'TRAS-" + prefijoInicial + i + "' OR ";
                    }
                }
            }
        }

        if (condicionRangos.equals("AND (")) {
            condicionRangos = "";
        } else {
            condicionRangos = condicionRangos.substring(0, condicionRangos.length() - 4) + ")";
        }
        //FIN DE LA VALIDACION DE RANGOS

        while (tblComprobantes.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        llenadoInformacion(condicionRangos);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtAnhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnhoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Object[] datosPuc = instancias.getSql().getDatosRegistro(txtAnho.getText());
            if (datosPuc[0] == null) {
                metodos.msgAdvertenciaAjustado(this, "No existe PUC de ese año");
            } else {
                cmbComprobantes.setEnabled(true);
            }
        } else {
            cmbComprobantes.setSelectedIndex(0);
            cmbComprobantes.setEnabled(false);
            while (tblComprobantes.getRowCount() > 0) {
                modelo.removeRow(0);
            }
        }
    }//GEN-LAST:event_txtAnhoKeyReleased

    private void txtAnhoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnhoKeyTyped

    }//GEN-LAST:event_txtAnhoKeyTyped

    private void lbNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNitKeyReleased

    private void lbNit4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit4KeyReleased

    private void tblComprobantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseClicked

    }//GEN-LAST:event_tblComprobantesMouseClicked

    private void lbNit1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit1KeyReleased

    private void txtFactInicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFactInicioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFactInicioKeyReleased

    private void txtFactInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFactInicioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFactInicioKeyTyped

    private void txtFactFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFactFinalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFactFinalKeyReleased

    private void txtFactFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFactFinalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFactFinalKeyTyped

    private void lbNit2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit2KeyReleased

    private void lbNit5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit5KeyReleased

    private void txtModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloKeyReleased

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloKeyTyped

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        instancias.getSql().eliminarTodo("bdGeneracionInterfase");

        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
            if (!tblComprobantes.getValueAt(i, 0).toString().equals("")) {
                instancias.getSql().agregarGeneracionInterfase(tblComprobantes.getValueAt(i, 0).toString(),
                        tblComprobantes.getValueAt(i, 1).toString(), tblComprobantes.getValueAt(i, 2).toString(),
                        tblComprobantes.getValueAt(i, 3).toString(), tblComprobantes.getValueAt(i, 4).toString(),
                        tblComprobantes.getValueAt(i, 5).toString(), tblComprobantes.getValueAt(i, 6).toString(),
                        big.getMoneda(tblComprobantes.getValueAt(i, 7).toString()), big.getMoneda(tblComprobantes.getValueAt(i, 8).toString()));
            }
        }

        String ini = metodos.desdeDate2(dtInicio.getCurrent()), fin = metodos.desdeDate(dtFinal.getCurrent());
        fin = metodos.sumarFecha(metodos.fecha(fin), 0);
        fin = metodos.fechaConsulta(fin);
        ini = metodos.fechaConsulta(ini);

        String enca = "Interfase de " + cmbComprobantes.getSelectedItem() + " entre el " + ini + " y el " + fin;

        instancias.setRutaAguardar(metodos.obtenerRuta(null, "Interfase de " + cmbComprobantes.getSelectedItem()));
        instancias.getReporte().ver_Interfase(enca);
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void llenadoInformacion(String condicionRangos) {
        Object[][] idComprobantes = null;
        String ini = metodos.desdeDate(dtInicio.getCurrent()), fin = metodos.desdeDate(dtFinal.getCurrent());

        if (cmbTipo.getSelectedIndex() == 0) {

            if (txtModelo.getText().equals("")) {

                if (cmbComprobantes.getSelectedItem().equals("Ventas")) {
                    idComprobantes = instancias.getSql().getIdRegistrosFacturasInterfase(" where (factura like 'FACT-%') AND (anulada = false) AND "
                            + "(((bdFactura.fechaFactura) >= '" + ini + "') And ((bdFactura.fechaFactura)<='" + fin + "')) " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Recibo de caja")) {
                    idComprobantes = instancias.getSql().getIdRegistrosAbonosInterfase(" where (anulada = false) AND "
                            + "(((fechaFactura) >= '" + ini + "') And ((fechaFactura) <= '" + fin + "')) " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Egresos")) {
                    idComprobantes = instancias.getSql().getIdRegistrosEgresosInterfase(" where (anulada = false) AND "
                            + "(((fecha) >= '" + ini + "') And ((fecha) <= '" + fin + "')) " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Compras")) {
                    idComprobantes = instancias.getSql().getIdRegistrosComprasInterfase(" where (bdingreso.id like 'ING-%') AND (bdingreso.anulada = false) AND "
                            + "(((bdingreso.fechaFactura) >= '" + ini + "') And ((bdingreso.fechaFactura) <= '" + fin + "')) " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Entrada")) {
                    idComprobantes = instancias.getSql().getIdRegistrosAjustesInterfase(" where (bdtraslados.tipo = 'Ajustes Entrada') AND (bdtraslados.anulada = false) AND "
                            + "(((bdtraslados.fecha) >= '" + ini + "') And ((bdtraslados.fecha) <= '" + fin + "')) " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Salida")) {
                    idComprobantes = instancias.getSql().getIdRegistrosAjustesInterfase(" where (bdtraslados.tipo = 'Ajuste Salida') AND (bdtraslados.anulada = false) AND "
                            + "(((bdtraslados.fecha) >= '" + ini + "') And ((bdtraslados.fecha) <= '" + fin + "')) " + condicionRangos);
                }

            } else {

                if (cmbComprobantes.getSelectedItem().equals("Ventas")) {
                    idComprobantes = instancias.getSql().getIdRegistrosFacturasInterfase(" where (factura like 'FACT-%') AND (anulada = false) AND "
                            + "(((bdFactura.fechaFactura) >= '" + ini + "') And ((bdFactura.fechaFactura)<='" + fin + "')) "
                            + "AND (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Recibo de caja")) {
                    idComprobantes = instancias.getSql().getIdRegistrosAbonosInterfase(" where (anulada = false) AND "
                            + "(((fechaFactura) >= '" + ini + "') And ((fechaFactura) <= '" + fin + "')) "
                            + "AND (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Egresos")) {
                    idComprobantes = instancias.getSql().getIdRegistrosEgresosInterfase(" where (anulada = false) AND "
                            + "(((fecha) >= '" + ini + "') And ((fecha) <= '" + fin + "')) "
                            + "AND (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Compras")) {
                    idComprobantes = instancias.getSql().getIdRegistrosComprasInterfase(" where (bdingreso.id like 'ING-%') AND (bdingreso.anulada = false) AND "
                            + "(((bdingreso.fechaFactura) >= '" + ini + "') And ((bdingreso.fechaFactura) <= '" + fin + "')) "
                            + "AND (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Entrada")) {
                    idComprobantes = instancias.getSql().getIdRegistrosAjustesInterfase(" where (bdtraslados.tipo = 'Ajustes Entrada') AND (bdtraslados.anulada = false) AND "
                            + "(((bdtraslados.fecha) >= '" + ini + "') And ((bdtraslados.fecha) <= '" + fin + "')) "
                            + "AND (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Salida")) {
                    idComprobantes = instancias.getSql().getIdRegistrosAjustesInterfase(" where (bdtraslados.tipo = 'Ajuste Salida') AND (bdtraslados.anulada = false) AND "
                            + "(((bdtraslados.fecha) >= '" + ini + "') And ((bdtraslados.fecha) <= '" + fin + "')) "
                            + "AND (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos);
                }

            }

            for (int i = 0; i < idComprobantes.length; i++) {

                if (null != idComprobantes[i][1]) {

                    Object[][] registros = instancias.getSql().getRegistrosComprobantes(txtAnho.getText(), cmbComprobantes.getSelectedItem().toString(), idComprobantes[i][1].toString());

                    if (cmbComprobantes.getSelectedItem().equals("Ventas")) {
                        llenarTablaRegistros(registros, "And (bdFactura.factura = '" + idComprobantes[i][0] + "') ", idComprobantes[i][1].toString(), idComprobantes[i][0].toString());
                    } else if (cmbComprobantes.getSelectedItem().equals("Recibo de caja")) {
                        llenarTablaRegistros(registros, "And (factura = '" + idComprobantes[i][0] + "') ", idComprobantes[i][1].toString(), idComprobantes[i][0].toString());
                    } else if (cmbComprobantes.getSelectedItem().equals("Egresos")) {
                        llenarTablaRegistros(registros, "And (egreso = '" + idComprobantes[i][0] + "') ", idComprobantes[i][1].toString(), idComprobantes[i][0].toString());
                    } else if (cmbComprobantes.getSelectedItem().equals("Compras")) {
                        llenarTablaRegistros(registros, "And (bdIngreso.id = '" + idComprobantes[i][0] + "') ", idComprobantes[i][1].toString(), idComprobantes[i][0].toString());
                    } else if (cmbComprobantes.getSelectedItem().equals("Entrada")) {
                        llenarTablaRegistros(registros, "And (bdTraslados.Id = '" + idComprobantes[i][0] + "') ", idComprobantes[i][1].toString(), idComprobantes[i][0].toString());
                    } else if (cmbComprobantes.getSelectedItem().equals("Salida")) {
                        llenarTablaRegistros(registros, "And (bdTraslados.Id = '" + idComprobantes[i][0] + "') ", idComprobantes[i][1].toString(), idComprobantes[i][0].toString());
                    }

                    modelo.addRow(new Object[]{"", "", "", "", "", "", "", "", ""});
                } else {
                    Logs.log("La factura " + idComprobantes[i][0] + ". No tiene modelo contable");
                }

            }

            return;

        } else {

            if (txtModelo.getText().equals("")) {

                if (cmbComprobantes.getSelectedItem().equals("Ventas")) {
                    idComprobantes = instancias.getSql().getModeloContableFacturasInterfase(" where (factura like 'FACT-%') AND (anulada = false) AND "
                            + "(((bdFactura.fechaFactura) >= '" + ini + "') And ((bdFactura.fechaFactura)<='" + fin + "')) " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Recibo de caja")) {
                    idComprobantes = instancias.getSql().getModeloContableAbonosInterfase(" where (anulada = false) AND "
                            + "(((fechaFactura) >= '" + ini + "') And ((fechaFactura) <= '" + fin + "')) " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Egresos")) {
                    idComprobantes = instancias.getSql().getModeloContableEgresosInterfase(" where (anulada = false) AND "
                            + "(((fecha) >= '" + ini + "') And ((fecha) <= '" + fin + "')) " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Compras")) {
                    idComprobantes = instancias.getSql().getModeloContableComprasInterfase(" where (bdingreso.id like 'ING-%') AND (bdingreso.anulada = false) AND "
                            + "(((bdingreso.fechaFactura) >= '" + ini + "') And ((bdingreso.fechaFactura) <= '" + fin + "')) " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Entrada")) {
                    idComprobantes = instancias.getSql().getModeloContableAjustesInterfase(" where (bdtraslados.tipo = 'Ajustes Entrada') AND (bdtraslados.anulada = false) AND "
                            + "(((bdtraslados.fecha) >= '" + ini + "') And ((bdtraslados.fecha) <= '" + fin + "')) " + condicionRangos);
                } else if (cmbComprobantes.getSelectedItem().equals("Salida")) {
                    idComprobantes = instancias.getSql().getModeloContableAjustesInterfase(" where (bdtraslados.tipo = 'Ajuste Salida') AND (bdtraslados.anulada = false) AND "
                            + "(((bdtraslados.fecha) >= '" + ini + "') And ((bdtraslados.fecha) <= '" + fin + "')) " + condicionRangos);
                }

                for (int i = 0; i < idComprobantes.length; i++) {
                    if (null != idComprobantes[i][0]) {

                        Object[][] registros = instancias.getSql().getRegistrosComprobantes(txtAnho.getText(), cmbComprobantes.getSelectedItem().toString(), idComprobantes[i][0].toString());

                        if (cmbComprobantes.getSelectedItem().equals("Ventas")) {
                            llenarTablaRegistros(registros, "And (bdFactura.modeloContable = '" + idComprobantes[i][0] + "') " + condicionRangos, idComprobantes[i][0].toString(), "");
                        } else if (cmbComprobantes.getSelectedItem().equals("Recibo de caja")) {
                            llenarTablaRegistros(registros, "And (modeloContable = '" + idComprobantes[i][0] + "') " + condicionRangos, idComprobantes[i][0].toString(), "");
                        } else if (cmbComprobantes.getSelectedItem().equals("Egresos")) {
                            llenarTablaRegistros(registros, "And (modeloContable = '" + idComprobantes[i][0] + "') " + condicionRangos, idComprobantes[i][0].toString(), "");
                        } else if (cmbComprobantes.getSelectedItem().equals("Compras")) {
                            llenarTablaRegistros(registros, "And (modeloContable = '" + idComprobantes[i][0] + "') " + condicionRangos, idComprobantes[i][0].toString(), "");
                        } else if (cmbComprobantes.getSelectedItem().equals("Entrada")) {
                            llenarTablaRegistros(registros, "And (modeloContable = '" + idComprobantes[i][0] + "') " + condicionRangos, idComprobantes[i][0].toString(), "");
                        } else if (cmbComprobantes.getSelectedItem().equals("Salida")) {
                            llenarTablaRegistros(registros, "And (modeloContable = '" + idComprobantes[i][0] + "') " + condicionRangos, idComprobantes[i][0].toString(), "");
                        }

                        modelo.addRow(new Object[]{"", "", "", "", "", "", "", "", ""});
                    }
                }

            } else {
                Object[][] registros = instancias.getSql().getRegistrosComprobantes(txtAnho.getText(), cmbComprobantes.getSelectedItem().toString(), txtModelo.getText());

                if (registros.length == 0) {
                    metodos.msgAdvertenciaAjustado(this, "No existe comprobantes");
                } else {
                    if (cmbComprobantes.getSelectedItem().equals("Ventas")) {
                        llenarTablaRegistros(registros, "And (bdFactura.modeloContable = '" + txtModelo.getText() + "') " + condicionRangos, txtModelo.getText(), "");
                    } else if (cmbComprobantes.getSelectedItem().equals("Recibo de caja")) {
                        llenarTablaRegistros(registros, "And (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos, txtModelo.getText(), "");
                    } else if (cmbComprobantes.getSelectedItem().equals("Egresos")) {
                        llenarTablaRegistros(registros, "And (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos, txtModelo.getText(), "");
                    } else if (cmbComprobantes.getSelectedItem().equals("Compras")) {
                        llenarTablaRegistros(registros, "And (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos, txtModelo.getText(), "");
                    } else if (cmbComprobantes.getSelectedItem().equals("Entrada")) {
                        llenarTablaRegistros(registros, "And (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos, txtModelo.getText(), "");
                    } else if (cmbComprobantes.getSelectedItem().equals("Salida")) {
                        llenarTablaRegistros(registros, "And (modeloContable = '" + txtModelo.getText() + "') " + condicionRangos, txtModelo.getText(), "");
                    }
                }
            }
        }
    }

    static class WordWrapCellRenderer extends JTextArea implements TableCellRenderer {

        WordWrapCellRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value.toString());
            setSize(table.getColumnModel().getColumn(column).getWidth(), 25);

            if (getPreferredSize().height > 25) {
                if (table.getRowHeight(row) != getPreferredSize().height) {
                    table.setRowHeight(row, getPreferredSize().height);
                }
            } else {
                if (table.getRowHeight(row) != getPreferredSize().height) {
                    table.setRowHeight(row, 25);
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

    public void llenarTablaRegistros(Object[][] registros, String condicionGenerada, String modeloUtilizado, String facturaUtilizada) {

        String ini = metodos.desdeDate(dtInicio.getCurrent()), fin = metodos.desdeDate(dtFinal.getCurrent());

        for (Object[] registro : registros) {
            if (registro[7] != null) {
                if (!registro[7].equals("")) {

                    Object[][] registrosComprobantes = null;
                    Object[][] registrosComprobantes1 = null;
                    if (cmbComprobantes.getSelectedItem().equals("Ventas")) {
                        registrosComprobantes = instancias.getSql().getRegistrosFacturasInterfase(" where (bdFactura.factura like 'FACT-%') AND (bdFactura.anulada = false) AND "
                                + "(((bdFactura.fechaFactura) >= '" + ini + "') And ((bdFactura.fechaFactura)<='" + fin + "')) " + condicionGenerada);
                        registrosComprobantes1 = instancias.getSql().getRegistrosDetalleFacturasInterfase(" where (factura like 'FACT-%') AND (anulada = false) "
                                + "AND (((fechaFactura) >= '" + ini + "') And ((fechaFactura) <= '" + fin + "')) " + condicionGenerada);
                    } else if (cmbComprobantes.getSelectedItem().equals("Recibo de caja")) {
                        registrosComprobantes = instancias.getSql().getRegistrosReciboCajaInterfase(" where (anulada = false) AND "
                                + "(((fechaFactura) >= '" + ini + "') And ((fechaFactura) <= '" + fin + "')) " + condicionGenerada);
                    } else if (cmbComprobantes.getSelectedItem().equals("Egresos")) {
                        registrosComprobantes = instancias.getSql().getRegistrosEgresosInterfase(" where (anulada = false) AND "
                                + "(((fecha) >= '" + ini + "') And ((fecha) <= '" + fin + "')) " + condicionGenerada);
                    } else if (cmbComprobantes.getSelectedItem().equals("Compras")) {
                        registrosComprobantes = instancias.getSql().getRegistrosComprasInterfase(" where (bdingreso.id like 'ING-%') AND (bdingreso.anulada = false) AND "
                                + "(((bdingreso.fechaFactura) >= '" + ini + "') And ((bdingreso.fechaFactura) <= '" + fin + "')) " + condicionGenerada);
                        registrosComprobantes1 = instancias.getSql().getRegistrosDetalleComprasInterfase(" where (id like 'ING-%') AND (anulada = false) AND "
                                + "(((fechaFactura) >= '" + ini + "') And ((fechaFactura) <= '" + fin + "')) " + condicionGenerada);
                    } else if (cmbComprobantes.getSelectedItem().equals("Entrada")) {
                        registrosComprobantes = instancias.getSql().getRegistrosAjustesInterfase(" where (bdtraslados.tipo = 'Ajustes Entrada') AND (bdtraslados.anulada = false) AND "
                                + "(((bdtraslados.fecha) >= '" + ini + "') And ((bdtraslados.fecha) <= '" + fin + "')) " + condicionGenerada);
                    } else if (cmbComprobantes.getSelectedItem().equals("Salida")) {
                        registrosComprobantes = instancias.getSql().getRegistrosAjustesInterfase(" where (bdtraslados.tipo = 'Ajuste Salida') AND (bdtraslados.anulada = false) AND "
                                + "(((bdtraslados.fecha) >= '" + ini + "') And ((bdtraslados.fecha) <= '" + fin + "')) " + condicionGenerada);
                    }

                    String nombre = "";
                    if (registro[9] != null) {
                        if (!registro[9].equals("")) {
                            ndTercero nodo = instancias.getSql().getDatosTercero(registro[9].toString());
                            nombre = nodo.getNombre();
                        }
                    }

                    BigDecimal total = BigDecimal.ZERO;

                    if (cmbComprobantes.getSelectedItem().equals("Ventas")) {

                        if (registro[4].equals("1")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][7] != null) {
                                    if (big.getBigDecimal(registrosComprobantes[i][6]).compareTo(BigDecimal.ZERO) > 0
                                            || big.getBigDecimal(registrosComprobantes[i][8]).compareTo(BigDecimal.ZERO) > 0) {
                                        total = total.add(big.getBigDecimal(registrosComprobantes[i][7]));
                                    }
                                }
                            }
                        } else if (registro[4].equals("2")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][7] != null) {
                                    if (big.getBigDecimal(registrosComprobantes[i][6]).compareTo(BigDecimal.ZERO) == 0
                                            && big.getBigDecimal(registrosComprobantes[i][8]).compareTo(BigDecimal.ZERO) == 0) {
                                        total = total.add(big.getBigDecimal(registrosComprobantes[i][7]));
                                    }
                                }
                            }
                        } else if (registro[4].equals("3")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][6] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][6]));
                                }
                            }
                        } else if (registro[4].equals("4")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][5] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][5]));
                                }
                            }
                        } else if (registro[4].equals("5")) {
                            for (int i = 0; i < registrosComprobantes1.length; i++) {
                                if (registrosComprobantes1[i][2] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes1[i][2]));
                                }
                            }
                        } else if (registro[4].equals("6")) {
                            for (int i = 0; i < registrosComprobantes1.length; i++) {
                                if (registrosComprobantes1[i][1] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes1[i][1]));
                                }
                            }
                        } else if (registro[4].equals("7")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][8] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][8]));
                                }
                            }
                        } else if (registro[4].equals("8")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][4] != null) {
                                    BigDecimal subtotal = big.getBigDecimal(registrosComprobantes[i][3]).multiply(big.getBigDecimal(registrosComprobantes[i][4]));
                                    total = total.add(subtotal);
                                }
                            }
                        } else if (registro[4].equals("9")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][4] != null) {
                                    BigDecimal subtotal = big.getBigDecimal(registrosComprobantes[i][3]).multiply(big.getBigDecimal(registrosComprobantes[i][4]));
                                    total = total.add(subtotal);
                                }
                            }
                        }
                    } else if (cmbComprobantes.getSelectedItem().equals("Recibo de caja")) {

                        if (registro[4].equals("1")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][6] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][6])).add(big.getBigDecimal(registrosComprobantes[i][7]))
                                            .add(big.getBigDecimal(registrosComprobantes[i][8])).add(big.getBigDecimal(registrosComprobantes[i][9]))
                                            .add(big.getBigDecimal(registrosComprobantes[i][11]));
                                }
                            }
                        } else if (registro[4].equals("2")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][1] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][1]));
                                }
                            }
                        } else if (registro[4].equals("3")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][2] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][2]));
                                }
                            }
                        } else if (registro[4].equals("4")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][3] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][3]));
                                }
                            }
                        } else if (registro[4].equals("5")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][4] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][4]));
                                }
                            }
                        } else if (registro[4].equals("6")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][5] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][5]));
                                }
                            }
                        }
                    } else if (cmbComprobantes.getSelectedItem().equals("Egresos")) {
                        if (registro[4].equals("1")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][1] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][1]));
                                }
                            }
                        } else if (registro[4].equals("2")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][1] != null) {
                                    total = total = BigDecimal.ZERO;
                                }
                            }
                        } else if (registro[4].equals("3")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][1] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes[i][1]));
                                }
                            }
                        } else if (registro[4].equals("4")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][1] != null) {
                                    total = BigDecimal.ZERO;
                                }
                            }
                        }
                    } else if (cmbComprobantes.getSelectedItem().equals("Compras")) {

                        if (registro[4].equals("1")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][5] != null) {
                                    if (big.getBigDecimal(registrosComprobantes[i][5]).compareTo(BigDecimal.ZERO) > 0
                                            || big.getBigDecimal(registrosComprobantes[i][7]).compareTo(BigDecimal.ZERO) > 0) {
                                        total = total.add(big.getBigDecimal(registrosComprobantes[i][3]));
                                    }
                                }
                            }
                        } else if (registro[4].equals("2")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][5] != null) {
                                    if (big.getBigDecimal(registrosComprobantes[i][5]).compareTo(BigDecimal.ZERO) == 0
                                            && big.getBigDecimal(registrosComprobantes[i][7]).compareTo(BigDecimal.ZERO) == 0) {
                                        total = total.add(big.getBigDecimal(registrosComprobantes[i][3]));
                                    }
                                }
                            }
                        } else if (registro[4].equals("3")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][5] != null) {
                                    if (big.getBigDecimal(registrosComprobantes[i][5]).compareTo(BigDecimal.ZERO) > 0) {
                                        total = total.add(big.getBigDecimal(registrosComprobantes[i][5]));
                                    }
                                }
                            }
                        } else if (registro[4].equals("4")) {
                            for (int i = 0; i < registrosComprobantes1.length; i++) {
                                if (registrosComprobantes1[i][0] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes1[i][1]));
                                }
                            }
                        } else if (registro[4].equals("5")) {
                            for (int i = 0; i < registrosComprobantes1.length; i++) {
                                if (registrosComprobantes1[i][0] != null) {
                                    total = total.add(big.getBigDecimal(registrosComprobantes1[i][0]));
                                }
                            }
                        } else if (registro[4].equals("6")) {
                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][7] != null) {
                                    if (big.getBigDecimal(registrosComprobantes[i][7]).compareTo(BigDecimal.ZERO) > 0) {
                                        total = total.add(big.getBigDecimal(registrosComprobantes[i][7]));
                                    }
                                }
                            }
                        }
                    } else if (cmbComprobantes.getSelectedItem().equals("Entrada")) {
                        for (int i = 0; i < registrosComprobantes.length; i++) {
                            if (registrosComprobantes[i][4] != null) {
                                if (big.getBigDecimal(registrosComprobantes[i][4]).compareTo(BigDecimal.ZERO) > 0) {
                                    BigDecimal subtotal = big.getBigDecimal(registrosComprobantes[i][4]).multiply(big.getBigDecimal(registrosComprobantes[i][3]));
                                    total = total.add(subtotal);
                                }
                            }
                        }
                    } else if (cmbComprobantes.getSelectedItem().equals("Salida")) {
                        for (int i = 0; i < registrosComprobantes.length; i++) {
                            if (registrosComprobantes[i][4] != null) {
                                if (big.getBigDecimal(registrosComprobantes[i][4]).compareTo(BigDecimal.ZERO) > 0) {
                                    BigDecimal subtotal = big.getBigDecimal(registrosComprobantes[i][4]).multiply(big.getBigDecimal(registrosComprobantes[i][3]));
                                    total = total.add(subtotal);
                                }
                            }
                        }
                    }

                    if (registro[11].equals("DEBITO")) {
                        if (condicionGenerada.equals("")) {
                            modelo.addRow(new Object[]{"", registro[5], "", registro[7], registro[8], nombre, "", big.setMoneda(total), this.simbolo + " 0"});
                        } else {
                            if (condicionGenerada.contains("modeloContable")) {
                                modelo.addRow(new Object[]{modeloUtilizado, registro[5], "", registro[7], registro[8], nombre, "", big.setMoneda(total), this.simbolo + " 0"});
                            } else {
                                modelo.addRow(new Object[]{registrosComprobantes[0][0], registro[5], "", registro[7], registro[8], nombre, "", big.setMoneda(total),
                                    this.simbolo + " 0"});
                            }
                        }
                    } else {
                        if (condicionGenerada.equals("")) {
                            modelo.addRow(new Object[]{"", registro[5], "", registro[7], registro[8], nombre, "", this.simbolo + " 0", big.setMoneda(total)});
                        } else {
                            if (condicionGenerada.contains("modeloContable")) {
                                modelo.addRow(new Object[]{modeloUtilizado, registro[5], "", registro[7], registro[8], nombre, "", this.simbolo + " 0", big.setMoneda(total)});
                            } else {
                                modelo.addRow(new Object[]{registrosComprobantes[0][0], registro[5], "", registro[7], registro[8], nombre, "", this.simbolo + " 0",
                                    big.setMoneda(total)});
                            }
                        }
                    }

                } else {

                    Object[][] registrosAmbitos = instancias.getSql().getRegistrosAmbitos(txtAnho.getText(), cmbComprobantes.getSelectedItem().toString(),
                            registro[4].toString(), modeloUtilizado);

                    String condicionProductos = "";
                    for (Object[] registrosAmbito : registrosAmbitos) {
                        if (!registrosAmbito[0].equals("")) {
                            condicionProductos = condicionProductos + "producto != '" + registrosAmbito[0] + "' AND ";
                        }
                    }

                    for (Object[] registrosAmbito : registrosAmbitos) {
                        String detalle = "", condicion = "";

                        Boolean validacionProducto = false;
                        if (!registrosAmbito[0].equals("")) {
                            ndProducto nodo = instancias.getSql().getDatosProducto(registrosAmbito[0].toString(), "bdProductos");
                            detalle = "Producto: " + nodo.getDescripcion() + ". ";
                            condicion = condicion + "producto = '" + nodo.getIdSistema() + "' AND ";
                            validacionProducto = true;
                        }

                        if (!registrosAmbito[1].equals("")) {
                            ndGrupo nodo = instancias.getSql().getDatosGrupo2(registrosAmbito[1].toString());
                            detalle = detalle + "Grupo: " + nodo.getNombre() + ". ";
                            condicion = condicion + "grupo = '" + nodo.getCodigo() + "' AND ";
                        }

                        if (!registrosAmbito[2].equals("")) {
                            String nombreSubgrupo = instancias.getSql().getDatosSubGrupo(registrosAmbito[2].toString());
                            detalle = detalle + "Subgrupo: " + nombreSubgrupo + ". ";
                            condicion = condicion + "sub_grupo = '" + registrosAmbito[2].toString() + "' AND ";
                        }

                        String centroCosto = "";
                        Logs.log("ambitossssssssssssssssssssssss centro costo: " + registrosAmbito[3]);
                        if (!registrosAmbito[3].equals("")) {
                            String codBodega = "";
                            if (registrosAmbito[3].toString().equals("BODEGA PRINCIPAL")) {
                                codBodega = "123-22";
                            } else {
                                codBodega = registrosAmbito[3].toString();
                            }

                            ndBodega bodega = instancias.getSql().getDatosBodega(codBodega);
                            centroCosto = bodega.getNombre();
                            condicion = condicion + "bodega = '" + codBodega + "' AND ";
                        }

                        if (!registrosAmbito[4].equals("")) {
                            detalle = detalle + "Iva: " + registrosAmbito[4].toString() + ". ";

                            if (cmbComprobantes.getSelectedItem().equals("Compras")) {
                                condicion = condicion + "porIva = '" + registrosAmbito[4].toString() + "' AND ";
                            } else {
                                condicion = condicion + "porcIva = '" + registrosAmbito[4].toString() + "' AND ";
                            }
                        }

                        if (!registrosAmbito[5].equals("")) {
                            detalle = detalle + "Impoconsumo: " + registrosAmbito[5].toString() + ". ";
                            condicion = condicion + "porcImpo = '" + registrosAmbito[5].toString() + "' AND ";
                        }

                        if (!condicionProductos.equals("")) {
                            if (validacionProducto) {
                                condicion = condicion.substring(0, condicion.length() - 4);
                            } else {
                                condicion = condicion + condicionProductos;
                                condicion = condicion.substring(0, condicion.length() - 4);
                            }
                        } else {
                            condicion = condicion.substring(0, condicion.length() - 4);
                        }

                        String nombreCuenta = "";
                        if (registrosAmbito[7] != null) {
                            if (!registrosAmbito[7].toString().equals("")) {
                                nombreCuenta = instancias.getSql().getNombreCuenta1(registrosAmbito[7].toString());
                            }
                        }

                        String nombre = "";
                        if (registro[9] != null) {
                            if (!registro[9].equals("")) {
                                ndTercero nodo = instancias.getSql().getDatosTercero(registro[9].toString());
                                nombre = nodo.getNombre();
                            }
                        }

                        BigDecimal total = BigDecimal.ZERO;
                        Object[][] registrosComprobantes = null;

                        if (cmbComprobantes.getSelectedItem().equals("Ventas")) {

                            registrosComprobantes = instancias.getSql().getRegistrosFacturasInterfase(" where (bdFactura.factura like 'FACT-%') AND (bdFactura.anulada = false) AND "
                                    + "(((bdFactura.fechaFactura) >='" + ini + "') And ((bdFactura.fechaFactura)<='" + fin + "')) AND " + condicion + condicionGenerada);

                            if (registro[4].equals("1")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][7] != null) {
                                        if (big.getBigDecimal(registrosComprobantes[i][6]).compareTo(BigDecimal.ZERO) > 0
                                                || big.getBigDecimal(registrosComprobantes[i][8]).compareTo(BigDecimal.ZERO) > 0) {
                                            total = total.add(big.getBigDecimal(registrosComprobantes[i][7]));
                                        }
                                    }
                                }
                            } else if (registro[4].equals("2")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][7] != null) {
                                        if (big.getBigDecimal(registrosComprobantes[i][6]).compareTo(BigDecimal.ZERO) == 0
                                                && big.getBigDecimal(registrosComprobantes[i][8]).compareTo(BigDecimal.ZERO) == 0) {
                                            total = total.add(big.getBigDecimal(registrosComprobantes[i][7]));
                                        }
                                    }
                                }
                            } else if (registro[4].equals("3")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][6] != null) {
                                        total = total.add(big.getBigDecimal(registrosComprobantes[i][6]));
                                    }
                                }
                            } else if (registro[4].equals("4")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][5] != null) {
                                        total = total.add(big.getBigDecimal(registrosComprobantes[i][5]));
                                    }
                                }
                            } else if (registro[4].equals("7")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][8] != null) {
                                        total = total.add(big.getBigDecimal(registrosComprobantes[i][8]));
                                    }
                                }
                            } else if (registro[4].equals("8")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][4] != null) {
                                        BigDecimal subtotal = big.getBigDecimal(registrosComprobantes[i][3]).multiply(big.getBigDecimal(registrosComprobantes[i][4]));
                                        total = total.add(subtotal);
                                    }
                                }
                            } else if (registro[4].equals("9")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][4] != null) {
                                        BigDecimal subtotal = big.getBigDecimal(registrosComprobantes[i][3]).multiply(big.getBigDecimal(registrosComprobantes[i][4]));
                                        total = total.add(subtotal);
                                    }
                                }
                            }

                        } else if (cmbComprobantes.getSelectedItem().equals("Compras")) {

                            registrosComprobantes = instancias.getSql().getRegistrosComprasInterfase(" where (bdingreso.id like 'ING-%') AND (bdingreso.anulada = false) AND "
                                    + "(((bdingreso.fechaFactura) >='" + ini + "') And ((bdingreso.fechaFactura)<= '" + fin + "')) AND " + condicion + condicionGenerada);

                            if (registro[4].equals("1")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][5] != null) {
                                        if (big.getBigDecimal(registrosComprobantes[i][5]).compareTo(BigDecimal.ZERO) > 0) {
                                            total = total.add(big.getBigDecimal(registrosComprobantes[i][3]));
                                        }
                                    }
                                }
                            } else if (registro[4].equals("2")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][5] != null) {
                                        if (big.getBigDecimal(registrosComprobantes[i][5]).compareTo(BigDecimal.ZERO) == 0) {
                                            total = total.add(big.getBigDecimal(registrosComprobantes[i][3]));
                                        }
                                    }
                                }
                            } else if (registro[4].equals("3")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][5] != null) {
                                        if (big.getBigDecimal(registrosComprobantes[i][5]).compareTo(BigDecimal.ZERO) > 0) {
                                            total = total.add(big.getBigDecimal(registrosComprobantes[i][5]));
                                        }
                                    }
                                }
                            } else if (registro[4].equals("6")) {
                                for (int i = 0; i < registrosComprobantes.length; i++) {
                                    if (registrosComprobantes[i][7] != null) {
                                        if (big.getBigDecimal(registrosComprobantes[i][7]).compareTo(BigDecimal.ZERO) > 0) {
                                            total = total.add(big.getBigDecimal(registrosComprobantes[i][7]));
                                        }
                                    }
                                }
                            }

                        } else if (cmbComprobantes.getSelectedItem().equals("Entrada")) {
                            registrosComprobantes = instancias.getSql().getRegistrosAjustesInterfase(" where (bdtraslados.tipo = 'Ajustes Entrada') AND (bdtraslados.anulada = false) AND "
                                    + "(((bdtraslados.fecha) >= '" + ini + "') And ((bdtraslados.fecha)<= '" + fin + "')) AND " + condicion + condicionGenerada);

                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][4] != null) {
                                    if (big.getBigDecimal(registrosComprobantes[i][4]).compareTo(BigDecimal.ZERO) > 0) {
                                        BigDecimal subtotal = big.getBigDecimal(registrosComprobantes[i][4]).multiply(big.getBigDecimal(registrosComprobantes[i][3]));
                                        total = total.add(subtotal);
                                    }
                                }
                            }
                        } else if (cmbComprobantes.getSelectedItem().equals("Salida")) {
                            registrosComprobantes = instancias.getSql().getRegistrosAjustesInterfase(" where (bdtraslados.tipo = 'Ajuste Salida') AND (bdtraslados.anulada = false) AND "
                                    + "(((bdtraslados.fecha) >='" + ini + "') And ((bdtraslados.fecha)<= '" + fin + "')) AND " + condicion + condicionGenerada);

                            for (int i = 0; i < registrosComprobantes.length; i++) {
                                if (registrosComprobantes[i][4] != null) {
                                    if (big.getBigDecimal(registrosComprobantes[i][4]).compareTo(BigDecimal.ZERO) > 0) {
                                        BigDecimal subtotal = big.getBigDecimal(registrosComprobantes[i][4]).multiply(big.getBigDecimal(registrosComprobantes[i][3]));
                                        total = total.add(subtotal);
                                    }
                                }
                            }
                        }

                        if (registro[11].equals("DEBITO")) {
                            if (condicionGenerada.equals("")) {
                                modelo.addRow(new Object[]{"", registro[5], detalle, registrosAmbito[7], nombreCuenta, nombre, centroCosto, big.setMoneda(total), this.simbolo + " 0"});
                            } else {
                                if (condicionGenerada.contains("modeloContable")) {
                                    modelo.addRow(new Object[]{modeloUtilizado, registro[5], detalle, registrosAmbito[7], nombreCuenta, nombre, centroCosto,
                                        big.setMoneda(total), this.simbolo + " 0"});
                                } else {
                                    modelo.addRow(new Object[]{facturaUtilizada, registro[5], detalle, registrosAmbito[7], nombreCuenta, nombre, centroCosto, big.setMoneda(total),
                                        this.simbolo + " 0"});
                                }
                            }
                        } else {
                            if (condicionGenerada.equals("")) {
                                modelo.addRow(new Object[]{"", registro[5], detalle, registrosAmbito[7], nombreCuenta, nombre, centroCosto, this.simbolo + " 0", big.setMoneda(total)});
                            } else {
                                if (condicionGenerada.contains("modeloContable")) {
                                    modelo.addRow(new Object[]{modeloUtilizado, registro[5], detalle, registrosAmbito[7], nombreCuenta, nombre, centroCosto,
                                        this.simbolo + " 0", big.setMoneda(total)});
                                } else {
                                    modelo.addRow(new Object[]{facturaUtilizada, registro[5], detalle, registrosAmbito[7], nombreCuenta, nombre, centroCosto,
                                        this.simbolo + " 0", big.setMoneda(total)});
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void cargarCliente(String nit) {
        if (nit.equals("")) {
            tblComprobantes.setValueAt("", tblComprobantes.getSelectedRow(), 6);
            tblComprobantes.setValueAt("", tblComprobantes.getSelectedRow(), 7);
        } else {
            ndTercero nodo = instancias.getSql().getDatosTercero(nit);
            tblComprobantes.setValueAt(nodo.getIdSistema(), tblComprobantes.getSelectedRow(), 6);
            tblComprobantes.setValueAt(nodo.getNombre(), tblComprobantes.getSelectedRow(), 7);
        }
    }

    public void cargarCuenta(int fila, String codigo, String cuenta, String nombre) {
        tblComprobantes.setValueAt(codigo, fila, 2);
        tblComprobantes.setValueAt(cuenta, fila, 3);
        tblComprobantes.setValueAt(nombre, fila, 4);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbComprobantes;
    private javax.swing.JComboBox cmbTipo;
    private datechooser.beans.DateChooserCombo dtFinal;
    private datechooser.beans.DateChooserCombo dtInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit1;
    private javax.swing.JLabel lbNit11;
    private javax.swing.JLabel lbNit2;
    private javax.swing.JLabel lbNit4;
    private javax.swing.JLabel lbNit5;
    private javax.swing.JLabel lbNit9;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTable tblComprobantes;
    private javax.swing.JTextField txtAnho;
    private javax.swing.JTextField txtFactFinal;
    private javax.swing.JTextField txtFactInicio;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
