package formularios.productos;

import clases.Instancias;
import clases.big;
import clases.metodosGenerales;
import clases.productos.ndGrupo;
import clases.productos.ndProducto;
import clases.terceros.ndProveedor;
import clases.terceros.ndTercero;
import formularios.creditos.*;
import formularios.productos.buscGrupos;
import formularios.terceros.buscProveedores;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;
import logs.Logs;

public class infModificarPrecio extends javax.swing.JInternalFrame {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    DefaultTableModel modelo;

    public infModificarPrecio() {
        initComponents();

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);

        instancias = Instancias.getInstancias();
        Object[][] datos = instancias.getSql().getRegistrosGrupos();
        for (int i = 0; i < datos.length; i++) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        lbNit10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnRemCliente = new javax.swing.JButton();
        btnAggCliente = new javax.swing.JButton();
        lbNit = new javax.swing.JLabel();
        cmbCientes = new javax.swing.JComboBox();
        txtProveedor1 = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnRemProv = new javax.swing.JButton();
        txtProveedor = new javax.swing.JTextField();
        lbNit4 = new javax.swing.JLabel();
        btnAggProv = new javax.swing.JButton();
        lbNit5 = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox();
        txtNomProveedor = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtAumento = new javax.swing.JTextField();
        txtDisminucion = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        lbNit10.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        lbNit10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit10.setText("ACTUALIZAR PRECIOS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 1, 14))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grupo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        btnRemCliente.setBackground(new java.awt.Color(255, 102, 102));
        btnRemCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemCliente.setForeground(new java.awt.Color(153, 0, 0));
        btnRemCliente.setText("REMOVER SELECCIÓN");
        btnRemCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemClienteActionPerformed(evt);
            }
        });

        btnAggCliente.setBackground(new java.awt.Color(102, 153, 0));
        btnAggCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAggCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAggCliente.setText("AGREGAR");
        btnAggCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggClienteActionPerformed(evt);
            }
        });

        lbNit.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        lbNit.setText("Grupo");

        txtProveedor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProveedor1KeyReleased(evt);
            }
        });

        txtGrupo.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAggCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmbCientes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAggCliente)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNit)
                            .addComponent(cmbCientes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemCliente))))
                .addGap(19, 19, 19))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        btnRemProv.setBackground(new java.awt.Color(255, 102, 102));
        btnRemProv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemProv.setForeground(new java.awt.Color(153, 0, 0));
        btnRemProv.setText("REMOVER SELECCIÓN");
        btnRemProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemProvActionPerformed(evt);
            }
        });

        txtProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProveedorKeyReleased(evt);
            }
        });

        lbNit4.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        lbNit4.setText("Nombre:");

        btnAggProv.setBackground(new java.awt.Color(102, 153, 0));
        btnAggProv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAggProv.setForeground(new java.awt.Color(255, 255, 255));
        btnAggProv.setText("AGREGAR");
        btnAggProv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggProvActionPerformed(evt);
            }
        });

        lbNit5.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        lbNit5.setText("Nit:");

        txtNomProveedor.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNit4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNit5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAggProv, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNit5)
                            .addComponent(btnAggProv))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNit4)
                            .addComponent(btnRemProv)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 1, 14))); // NOI18N

        txtAumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAumentoKeyTyped(evt);
            }
        });

        txtDisminucion.setEditable(false);
        txtDisminucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDisminucionKeyTyped(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("L1");

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("L2");

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("L3");

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setSelected(true);
        jCheckBox4.setText("L4");

        jButton1.setText("Cambiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Porcentaje Aumento:");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jRadioButton2.setText("Porcentaje Disminución:");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(37, 37, 37)
                        .addComponent(txtAumento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)))
                .addGap(20, 20, 20)
                .addComponent(txtDisminucion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisminucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Costo", "L1", "U1", "R1", "L2", "U2", "R2", "L3", "U3", "R3", "L4", "U4", "R4", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 229, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(lbNit10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addComponent(lbNit10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        scrFormulario.setViewportView(pnlFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFormulario)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFormulario)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemClienteActionPerformed
        cmbCientes.removeItem(cmbCientes.getSelectedItem());
        jTable1.setModel(instancias.getSql().getRegistrosProductos2(condicion()));
    }//GEN-LAST:event_btnRemClienteActionPerformed

    private void btnAggClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggClienteActionPerformed

        if (txtGrupo.getText().equals("")) {
            metodos.msgError(null, "Cargue primero un grupo");
        } else {

            if (yaEsta(cmbCientes, txtGrupo.getText())) {
                metodos.msgAdvertencia(null, "Ya cargo este grupo");
            } else {
                cmbCientes.addItem(txtGrupo.getText());
                cmbCientes.setSelectedItem(txtGrupo.getText());
            }
            txtProveedor1.setText("");
            txtGrupo.setText("");
        }
        jTable1.setModel(instancias.getSql().getRegistrosProductos2(condicion()));
    }//GEN-LAST:event_btnAggClienteActionPerformed

    private void btnRemProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemProvActionPerformed
        cmbProveedor.removeItem(cmbProveedor.getSelectedItem());
        jTable1.setModel(instancias.getSql().getRegistrosProductos2(condicion()));
    }//GEN-LAST:event_btnRemProvActionPerformed

    private void txtProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarProveedor(txtProveedor.getText());
        } else {
            txtNomProveedor.setText("");
        }
    }//GEN-LAST:event_txtProveedorKeyReleased
    public void cargarProveedor(String nit) {

        ndTercero nodo = instancias.getSql().getDatosTercero(nit);

        if (nodo.getId() != null) {
            txtNomProveedor.setText(nodo.getNombre());
            btnAggProvActionPerformed(null);
            return;
        }
        ventanaProveedor(nit);
    }

    public void ventanaProveedor(String nit) {
        buscProveedores buscar = new buscProveedores(instancias.getMenu(), rootPaneCheckingEnabled, false);
        buscar.setLocationRelativeTo(null);
        instancias.setBusProveedores(buscar);
        instancias.setCampoActual(txtProveedor);
        txtProveedor.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void cargarGrupo(String nit) {
        try {
            String nombre = instancias.getSql().getDatosGrupoNombre(nit);

            if (nombre != null) {
                txtProveedor1.setText(nombre);
                txtGrupo.setText(nit);
                btnAggClienteActionPerformed(null);
                return;
            }
            ventanaGrupo(nit);
        } catch (Exception e) {
            Logs.error(e);
            ventanaGrupo(nit);
        }
    }

    public void ventanaGrupo(String nit) {
        buscGrupos buscar = new buscGrupos(instancias.getMenu(), rootPaneCheckingEnabled, "");
        buscar.setLocationRelativeTo(null);
        instancias.setBuscGrupos(buscar);
        instancias.setCampoActual(txtProveedor1);
        txtProveedor1.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public boolean yaEsta(JComboBox combo, String dato) {
        boolean sw = false;

        for (int i = 0; i < combo.getItemCount(); i++) {
            if (((String) combo.getItemAt(i)).equals(dato)) {
                return true;
            }
        }

        return sw;
    }
    private void btnAggProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggProvActionPerformed
        if (txtNomProveedor.getText().equals("")) {
            metodos.msgError(null, "Cargue primero un proveedor");
        } else {

            if (yaEsta(cmbProveedor, txtProveedor.getText())) {
                metodos.msgAdvertencia(null, "Ya cargo este proveedor");
            } else {
                cmbProveedor.addItem(txtProveedor.getText());
                cmbProveedor.setSelectedItem(txtProveedor.getText());
            }

            txtProveedor.setText("");
            txtNomProveedor.setText("");
        }
        jTable1.setModel(instancias.getSql().getRegistrosProductos2(condicion()));
    }//GEN-LAST:event_btnAggProvActionPerformed
    private String condicion() {
        String sql = "";
        for (int i = 0; i < cmbProveedor.getItemCount(); i++) {
            if (sql.equals("")) {
                sql = "WHERE (";
            }
            sql = sql + " Proveedor = '" + cmbProveedor.getItemAt(i) + "' OR";
        }
        if (!sql.equals("")) {
            sql = sql.substring(0, sql.length() - 2) + ")";
        }
        for (int i = 0; i < cmbCientes.getItemCount(); i++) {
            if (sql.equals("")) {
                sql = "WHERE (";
            } else {
                if (i == 0) {
                    sql = sql + " AND (";
                }
            }
            sql = sql + " Grupo = '" + cmbCientes.getItemAt(i) + "' OR";
        }
        if (!sql.equals("")) {
            sql = sql.substring(0, sql.length() - 2) + ")";
        }
        return sql;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTable1.setModel(instancias.getSql().getRegistrosProductos2(""));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Double por = 0.0;
        try {
            if (jRadioButton1.isSelected()) {
                por = ((Double.parseDouble(txtAumento.getText().replace(",", ".")) / 100) + 1);
            } else {
                por = (1 - (Double.parseDouble(txtDisminucion.getText().replace(",", ".")) / 100));
            }
        } catch (Exception e) {
            metodos.msgError(this, "Debe ingresar un porcentaje de aumento/disminución");
            return;
        }
        int cant = jTable1.getRowCount();
        for (int i = 0; i < cant; i++) {
            if ((Boolean) jTable1.getValueAt(i, 15)) {
                String cod = jTable1.getValueAt(i, 0).toString();
                ndProducto nodo = instancias.getSql().getDatosProducto(cod, "bdProductos");

                ndProducto nodo1 = null, nodo2 = null, nodo3 = null, nodo4 = null;
                if (instancias.getConfiguraciones().isInventarioBodegas()) {
                    nodo1 = instancias.getSql().getDatosProducto(cod, "bdProductosBodega1");
                    nodo2 = instancias.getSql().getDatosProducto(cod, "bdProductosBodega2");
                    nodo3 = instancias.getSql().getDatosProducto(cod, "bdProductosBodega3");
                    nodo4 = instancias.getSql().getDatosProducto(cod, "bdProductosBodega4");
                }

                if (jCheckBox1.isSelected()) {
                    nodo.setL1(new Double(Double.parseDouble(nodo.getL1()) * (por)).intValue() + "");
                }
                if (jCheckBox2.isSelected()) {
                    nodo.setL2(new Double(Double.parseDouble(nodo.getL2()) * (por)).intValue() + "");
                }
                if (jCheckBox3.isSelected()) {
                    nodo.setL3(new Double(Double.parseDouble(nodo.getL3()) * (por)).intValue() + "");
                }
                if (jCheckBox4.isSelected()) {
                    nodo.setL4(new Double(Double.parseDouble(nodo.getL4()) * (por)).intValue() + "");
                }
                instancias.getSql().modificarProducto(nodo, "bdProductos");

                if (instancias.getConfiguraciones().isInventarioBodegas()) {
                    instancias.getSql().modificarProducto(nodo1, "bdProductosBodega1");
                    instancias.getSql().modificarProducto(nodo2, "bdProductosBodega2");
                    instancias.getSql().modificarProducto(nodo3, "bdProductosBodega3");
                    instancias.getSql().modificarProducto(nodo4, "bdProductosBodega4");
                }
            }
        }
        instancias.getSql().agregarLogActualizarPrecios(new Object[]{instancias.getUsuario(), metodosGenerales.fecha(), (jRadioButton1.isSelected()) ? txtAumento.getText() : txtDisminucion.getText(), (jRadioButton1.isSelected()) ? "Aumento" : "Disminucion", condicion()});
        metodos.msgExito(this, "Precios modificados con exito");
        for (int i = 0; i < cant; i++) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }
        cmbProveedor.removeAllItems();
        cmbCientes.removeAllItems();
        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(true);
        jCheckBox3.setSelected(true);
        jCheckBox4.setSelected(true);
        jRadioButton1.setSelected(true);
        txtAumento.setText("");
        txtDisminucion.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAumentoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtAumentoKeyTyped

    private void txtDisminucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisminucionKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtDisminucionKeyTyped

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (jRadioButton1.isSelected()) {
            txtAumento.setEditable(true);
            txtDisminucion.setEditable(false);
            txtDisminucion.setText("");
        } else {
            txtAumento.setEditable(false);
            txtDisminucion.setEditable(true);
            txtAumento.setText("");
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (jRadioButton1.isSelected()) {
            txtAumento.setEditable(true);
            txtDisminucion.setEditable(false);
            txtDisminucion.setText("");
        } else {
            txtAumento.setEditable(false);
            txtDisminucion.setEditable(true);
            txtAumento.setText("");
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void txtProveedor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedor1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarGrupo(txtProveedor1.getText());
        } else {
            txtGrupo.setText("");
        }
    }//GEN-LAST:event_txtProveedor1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggCliente;
    private javax.swing.JButton btnAggProv;
    private javax.swing.JButton btnRemCliente;
    private javax.swing.JButton btnRemProv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbCientes;
    private javax.swing.JComboBox cmbProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit10;
    private javax.swing.JLabel lbNit4;
    private javax.swing.JLabel lbNit5;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTextField txtAumento;
    private javax.swing.JTextField txtDisminucion;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtNomProveedor;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtProveedor1;
    // End of variables declaration//GEN-END:variables
}
