package formularios.Contable;

import clases.Contable.ndEstructura;
import clases.Instancias;
import clases.metodosGenerales;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;

public class infPUC extends javax.swing.JInternalFrame {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    DefaultTableModel modeloNuevo;
    DefaultTableModel modelo;

    public infPUC() {
        initComponents();

        modelo = (DefaultTableModel) tblCuenta.getModel();
        modeloNuevo = (DefaultTableModel) tblNuevaCuenta.getModel();

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        instancias = Instancias.getInstancias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablaNueva = new javax.swing.JPopupMenu();
        popTablaNueva = new javax.swing.JMenuItem();
        tabla = new javax.swing.JPopupMenu();
        popTabla = new javax.swing.JMenuItem();
        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuenta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNuevaCuenta = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lbNit = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        btnAggCuenta = new javax.swing.JButton();
        lbNit4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtIdEstructura = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbNit1 = new javax.swing.JLabel();
        txtAnho = new javax.swing.JTextField();
        lbNit2 = new javax.swing.JLabel();
        txtNombreEstructura = new javax.swing.JTextField();
        btnBuscarEstructuras = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        popTablaNueva.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        popTablaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        popTablaNueva.setText("Borrar");
        popTablaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popTablaNuevaActionPerformed(evt);
            }
        });
        tablaNueva.add(popTablaNueva);

        popTabla.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        popTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        popTabla.setText("Borrar");
        popTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popTablaActionPerformed(evt);
            }
        });
        tabla.add(popTabla);

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblCuenta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Cuenta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCuenta.setComponentPopupMenu(tabla);
        tblCuenta.setRowHeight(25);
        tblCuenta.getTableHeader().setReorderingAllowed(false);
        tblCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCuentaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblCuenta);
        if (tblCuenta.getColumnModel().getColumnCount() > 0) {
            tblCuenta.getColumnModel().getColumn(0).setMinWidth(0);
            tblCuenta.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblCuenta.getColumnModel().getColumn(0).setMaxWidth(0);
            tblCuenta.getColumnModel().getColumn(1).setMinWidth(100);
            tblCuenta.getColumnModel().getColumn(1).setPreferredWidth(110);
            tblCuenta.getColumnModel().getColumn(1).setMaxWidth(160);
        }

        tblNuevaCuenta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblNuevaCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Afectable", "Terceros", "C. Costos", "% Imp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblNuevaCuenta.setComponentPopupMenu(tablaNueva);
        tblNuevaCuenta.setRowHeight(25);
        tblNuevaCuenta.getTableHeader().setReorderingAllowed(false);
        tblNuevaCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNuevaCuentaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblNuevaCuentaMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(tblNuevaCuenta);
        if (tblNuevaCuenta.getColumnModel().getColumnCount() > 0) {
            tblNuevaCuenta.getColumnModel().getColumn(0).setMinWidth(100);
            tblNuevaCuenta.getColumnModel().getColumn(0).setPreferredWidth(110);
            tblNuevaCuenta.getColumnModel().getColumn(0).setMaxWidth(160);
            tblNuevaCuenta.getColumnModel().getColumn(2).setMinWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(2).setMaxWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(3).setMinWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(3).setMaxWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(4).setMinWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(4).setPreferredWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(4).setMaxWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(5).setMinWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(5).setPreferredWidth(70);
            tblNuevaCuenta.getColumnModel().getColumn(5).setMaxWidth(70);
        }

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbNit.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit.setText("Codigo:");
        lbNit.setName(""); // NOI18N
        lbNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNitKeyReleased(evt);
            }
        });

        txtCuenta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCuenta.setEnabled(false);
        txtCuenta.setName("Codigo"); // NOI18N
        txtCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCuentaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuentaKeyTyped(evt);
            }
        });

        btnAggCuenta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAggCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-suma.png"))); // NOI18N
        btnAggCuenta.setEnabled(false);
        btnAggCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggCuentaActionPerformed(evt);
            }
        });

        lbNit4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit4.setText("PLAN DE CUENTAS");
        lbNit4.setName(""); // NOI18N
        lbNit4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit4KeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevo.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO   ");
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
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setEnabled(false);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar))
                .addGap(5, 5, 5))
        );

        txtIdEstructura.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIdEstructura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdEstructura.setName("Estructura"); // NOI18N
        txtIdEstructura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdEstructuraKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbNit4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                    .addComponent(txtIdEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbNit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAggCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNit4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAggCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCuenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbNit1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit1.setText("Año:");
        lbNit1.setName(""); // NOI18N
        lbNit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit1KeyReleased(evt);
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

        lbNit2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit2.setText("Estructura:");
        lbNit2.setName(""); // NOI18N
        lbNit2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit2KeyReleased(evt);
            }
        });

        txtNombreEstructura.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreEstructura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreEstructura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombreEstructura.setEnabled(false);
        txtNombreEstructura.setName("Codigo"); // NOI18N
        txtNombreEstructura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreEstructuraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEstructuraKeyTyped(evt);
            }
        });

        btnBuscarEstructuras.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarEstructuras.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBuscarEstructuras.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEstructuras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        btnBuscarEstructuras.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscarEstructuras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarEstructuras.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscarEstructuras.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscarEstructuras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstructurasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNit1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbNit2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtNombreEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarEstructuras, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAnho, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(lbNit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreEstructura)
                    .addComponent(btnBuscarEstructuras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
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

    private void lbNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNitKeyReleased

    private void txtCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAggCuentaActionPerformed(null);
        }
        //
        //        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        //
        //            ndTercero nodo = instancias.getSql().getDatosTercero(txtCodigo.getText());
        //
        //            if (nodo.getId() == null) {
        //                txtDigito.requestFocus();
        //
        //            } else {
        //                cargarProveedor(txtCodigo.getText());
        //            }
        //        }
    }//GEN-LAST:event_txtCuentaKeyReleased

    private void txtCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtCuentaKeyTyped

    private void btnAggCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggCuentaActionPerformed
        if (txtCuenta.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Ingrese el nombre de la cuenta");
            return;
        }

        modeloNuevo.addRow(new Object[]{txtCuenta.getText(), "", false, false, false, 0});
        txtCuenta.setText("");
    }//GEN-LAST:event_btnAggCuentaActionPerformed

    private void tblNuevaCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNuevaCuentaMouseClicked
        if (tblNuevaCuenta.getSelectedRow() >= 0) {
            if (!(Boolean) tblNuevaCuenta.getValueAt(tblNuevaCuenta.getSelectedRow(), 2)) {
                tblNuevaCuenta.setValueAt(false, tblNuevaCuenta.getSelectedRow(), 3);
                tblNuevaCuenta.setValueAt(false, tblNuevaCuenta.getSelectedRow(), 4);
                tblNuevaCuenta.setValueAt("0", tblNuevaCuenta.getSelectedRow(), 5);
            }
        }
    }//GEN-LAST:event_tblNuevaCuentaMouseClicked

    private void tblNuevaCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNuevaCuentaMouseExited
        if (tblNuevaCuenta.getSelectedRow() >= 0) {
            if (!(Boolean) tblNuevaCuenta.getValueAt(tblNuevaCuenta.getSelectedRow(), 2)) {
                tblNuevaCuenta.setValueAt(false, tblNuevaCuenta.getSelectedRow(), 3);
                tblNuevaCuenta.setValueAt(false, tblNuevaCuenta.getSelectedRow(), 4);
                tblNuevaCuenta.setValueAt("0", tblNuevaCuenta.getSelectedRow(), 5);
            }
        }
    }//GEN-LAST:event_tblNuevaCuentaMouseExited

    private void lbNit1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit1KeyReleased

    private void txtAnhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnhoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ndEstructura nodo = instancias.getSql().getDatosEstructura1(txtAnho.getText());

            if (nodo.getCodigo() != null) {
                txtNombreEstructura.setText(nodo.getDescripcion());
                txtIdEstructura.setText(nodo.getId());
                btnBuscarEstructuras.setEnabled(false);
                btnGuardar.setEnabled(true);
                btnAggCuenta.setEnabled(true);
                txtCuenta.setEnabled(true);

                Object[] datos = instancias.getSql().getDatosRegistro(txtAnho.getText());

                if (datos[0] != null) {
                    txtAnho.setText(datos[0].toString());
                    txtNombreEstructura.setText(datos[2].toString());

                    Object[][] registros = instancias.getSql().getRegistrosCuentas(txtAnho.getText());
                    for (int i = 0; i < registros.length; i++) {
                        modelo.addRow(new Object[]{registros[i][0], registros[i][1], registros[i][2]});
                    }
                }
            } else {
                metodos.msgAdvertenciaAjustado(this, "No existe estructura de ese año");
            }
        }
    }//GEN-LAST:event_txtAnhoKeyReleased

    private void txtAnhoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnhoKeyTyped

    }//GEN-LAST:event_txtAnhoKeyTyped

    private void lbNit2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit2KeyReleased

    private void txtNombreEstructuraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstructuraKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_txtNombreEstructuraKeyReleased

    private void txtNombreEstructuraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEstructuraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEstructuraKeyTyped

    private void btnBuscarEstructurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstructurasActionPerformed
        ventanaEstructura("");
    }//GEN-LAST:event_btnBuscarEstructurasActionPerformed

    private void txtIdEstructuraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEstructuraKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ndEstructura nodo = instancias.getSql().getDatosEstructura(txtIdEstructura.getText());
            txtNombreEstructura.setText(nodo.getDescripcion());
            txtAnho.setText(nodo.getCodigo());
            btnBuscarEstructuras.setEnabled(false);
            btnGuardar.setEnabled(true);
            btnAggCuenta.setEnabled(true);
            txtCuenta.setEnabled(true);
        }
    }//GEN-LAST:event_txtIdEstructuraKeyReleased

    private void lbNit4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit4KeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtCuenta.setEnabled(false);
        btnAggCuenta.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnBuscarEstructuras.setEnabled(true);
        txtAnho.setText("");
        txtIdEstructura.setText("");
        txtNombreEstructura.setText("");
        txtCuenta.setText("");

        while (tblCuenta.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        while (tblNuevaCuenta.getRowCount() > 0) {
            modeloNuevo.removeRow(0);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Object[] campos = {txtAnho, txtIdEstructura};
        String faltantes = metodos.camposVacios(campos);

        if (!faltantes.equals("")) {
            metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
            return;
        }

        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {

            ndEstructura nodo = instancias.getSql().getDatosEstructura(txtIdEstructura.getText());

            int level1 = Integer.parseInt(nodo.getLongitudNivel1());
            int level2 = Integer.parseInt(nodo.getLongitudNivel2()) + level1;
            int level3 = Integer.parseInt(nodo.getLongitudNivel3()) + level2;
            int level4 = Integer.parseInt(nodo.getLongitudNivel4()) + level3;
            int level5 = Integer.parseInt(nodo.getLongitudNivel5()) + level4;
            int level6 = Integer.parseInt(nodo.getLongitudNivel6()) + level5;
            int level7 = Integer.parseInt(nodo.getLongitudNivel7()) + level6;

            Object[] datosPuc = instancias.getSql().getDatosRegistro(txtAnho.getText());

            if (datosPuc[0] == null) {
                if (!instancias.getSql().agregarPUC(txtAnho.getText(), txtIdEstructura.getText(), txtNombreEstructura.getText(),
                        instancias.getUsuario(), metodos.fechaConsulta(metodosGenerales.fecha()))) {
                    metodos.msgError(this, "Error al guardar el registro");
                    return;
                }
            }

            for (int i = 0; i < tblNuevaCuenta.getRowCount(); i++) {

                Boolean guardarRegistro = true;
                int nivel = 0;

                String codigo = "";
                if ("".equals(tblNuevaCuenta.getValueAt(i, 1))) {
                    metodos.msgAdvertencia(this, "Debe ingresar la descripción del codigo: \"" + tblNuevaCuenta.getValueAt(i, 0) + "\"");
                    guardarRegistro = false;
                }

                if ("".equals(tblNuevaCuenta.getValueAt(i, 0))) {
                    metodos.msgAdvertencia(this, "Debe ingresar el codigo de la cuenta: \"" + tblNuevaCuenta.getValueAt(i, 1) + "\"");
                    guardarRegistro = false;
                } else {
                    codigo = tblNuevaCuenta.getValueAt(i, 0).toString();
                }

                for (int j = 0; j < tblCuenta.getRowCount(); j++) {
                    if (tblCuenta.getValueAt(j, 1).equals(codigo)) {
                        metodos.msgAdvertenciaAjustado(this, "La cuenta ya existe");
                        guardarRegistro = false;
                    }
                }

                if (codigo.length() == level1) {
                    if ((Boolean) tblNuevaCuenta.getValueAt(i, 2)) {
                        metodos.msgAdvertencia(this, "Las cuentas de primer nivel no pueden ser afectables");
                        guardarRegistro = false;
                    }

                    nivel = 1;
                } else {
                    int longitud = codigo.length();

                    if (longitud > level1 && longitud <= level2) {
                        String cod = codigo.substring(0, level1);

                        Boolean existe = false;
                        for (int j = 0; j < tblCuenta.getRowCount(); j++) {
                            if (tblCuenta.getValueAt(j, 1).equals(cod)) {
                                existe = true;
                            }
                        }

                        if (!existe) {
                            metodos.msgAdvertenciaAjustado(this, "La cuenta madre no existe");
                            guardarRegistro = false;
                        }

                        nivel = 2;
                    } else if (longitud > level2 && longitud <= level3) {
                        String cod = codigo.substring(0, level2);

                        Boolean existe = false;
                        for (int j = 0; j < tblCuenta.getRowCount(); j++) {
                            if (tblCuenta.getValueAt(j, 1).equals(cod)) {
                                existe = true;
                            }
                        }

                        if (!existe) {
                            metodos.msgAdvertenciaAjustado(this, "La cuenta madre no existe");
                            guardarRegistro = false;
                        }
                        nivel = 3;
                    } else if (longitud > level3 && longitud <= level4) {
                        String cod = codigo.substring(0, level3);

                        Boolean existe = false;
                        for (int j = 0; j < tblCuenta.getRowCount(); j++) {
                            if (tblCuenta.getValueAt(j, 1).equals(cod)) {
                                existe = true;
                            }
                        }

                        if (!existe) {
                            metodos.msgAdvertenciaAjustado(this, "La cuenta madre no existe");
                            guardarRegistro = false;
                        }
                        nivel = 4;
                    } else if (longitud > level4 && longitud <= level5) {
                        String cod = codigo.substring(0, level4);

                        Boolean existe = false;
                        for (int j = 0; j < tblCuenta.getRowCount(); j++) {
                            if (tblCuenta.getValueAt(j, 1).equals(cod)) {
                                existe = true;
                            }
                        }

                        if (!existe) {
                            metodos.msgAdvertenciaAjustado(this, "La cuenta madre no existe");
                            guardarRegistro = false;
                        }
                        nivel = 5;
                    } else if (longitud > level5 && longitud <= level6) {
                        String cod = codigo.substring(0, level5);

                        Boolean existe = false;
                        for (int j = 0; j < tblCuenta.getRowCount(); j++) {
                            if (tblCuenta.getValueAt(j, 1).equals(cod)) {
                                existe = true;
                            }
                        }

                        if (!existe) {
                            metodos.msgAdvertenciaAjustado(this, "La cuenta madre no existe");
                            guardarRegistro = false;
                        }
                        nivel = 6;
                    } else if (longitud > level6 && longitud <= level7) {
                        String cod = codigo.substring(0, level6);

                        Boolean existe = false;
                        for (int j = 0; j < tblCuenta.getRowCount(); j++) {
                            if (tblCuenta.getValueAt(j, 1).equals(cod)) {
                                existe = true;
                            }
                        }

                        if (!existe) {
                            metodos.msgAdvertenciaAjustado(this, "La cuenta madre no existe");
                            guardarRegistro = false;
                        }
                        nivel = 7;
                    } else {
                        metodos.msgAdvertenciaAjustado(this, "Codigo no válido para ningún nivel");
                        guardarRegistro = false;
                    }
                }

                if (guardarRegistro) {
                    String codigoCuenta = tblNuevaCuenta.getValueAt(i, 0).toString();
                    String cuenta = tblNuevaCuenta.getValueAt(i, 1).toString();
                    Boolean afectable = (Boolean) tblNuevaCuenta.getValueAt(i, 2);
                    Boolean terceros = (Boolean) tblNuevaCuenta.getValueAt(i, 3);
                    Boolean centroCostos = (Boolean) tblNuevaCuenta.getValueAt(i, 4);
                    Double imp = Double.parseDouble(tblNuevaCuenta.getValueAt(i, 5).toString());

                    if (!instancias.getSql().agregarDetallePUC(txtAnho.getText(), codigoCuenta, cuenta, afectable, terceros, centroCostos, imp, nivel)) {
                        metodos.msgError(this, "Error al guardar la cuenta");
                        return;
                    } else {
                        metodos.msgExito(this, "Cuenta registrado con éxito");
                    }

                    actualizarTablaCuentas();

                    modeloNuevo.removeRow(i);
                    i = i - 1;
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCuentaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tblCuenta.getSelectedColumn() == 2) {
                if (metodos.msgPregunta(this, "¿Desea modificar la cuenta?") == 0) {

                    if ("".equals(tblCuenta.getValueAt(tblCuenta.getSelectedRow(), 0))) {
                        metodos.msgAdvertenciaAjustado(this, "No se puede modificar esta cuenta");
                        return;
                    }

                    instancias.getSql().modificarCuenta(tblCuenta.getValueAt(tblCuenta.getSelectedRow(), 0).toString(),
                            tblCuenta.getValueAt(tblCuenta.getSelectedRow(), 2).toString());
                } else {
                    String name = instancias.getSql().getNombreCuenta(tblCuenta.getValueAt(tblCuenta.getSelectedRow(), 0).toString());
                    tblCuenta.setValueAt(name, tblCuenta.getSelectedRow(), 2);
                }
            }
        }
    }//GEN-LAST:event_tblCuentaKeyReleased

    private void popTablaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popTablaNuevaActionPerformed
        if (tblNuevaCuenta.getSelectedRow() > -1) {
            modeloNuevo.removeRow(tblNuevaCuenta.getSelectedRow());
        } else {
            metodos.msgAdvertenciaAjustado(null, "Seleccione una cuenta");
        }
    }//GEN-LAST:event_popTablaNuevaActionPerformed

    private void popTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popTablaActionPerformed
        if (tblCuenta.getSelectedRow() > -1) {
            metodos.msgAdvertencia(this, "Al eliminar esta cuenta, tambien se eliminará las cuentas relacionadas.");
            if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {
                String codigo = tblCuenta.getValueAt(tblCuenta.getSelectedRow(), 1).toString();
                for (int i = 0; i < tblCuenta.getRowCount(); i++) {
                    String codAdquiriente = tblCuenta.getValueAt(i, 1).toString();
                    if (codAdquiriente.length() >= codigo.length()) {
                        codAdquiriente = codAdquiriente.substring(0, codigo.length());
                        if (codigo.equals(codAdquiriente)) {
                            instancias.getSql().eliminar_registro("bdDetallePUC", " id = " + tblCuenta.getValueAt(i, 0));
                            modelo.removeRow(i);
                            i = i - 1;
                        }
                    }
                }
            }
        } else {
            metodos.msgAdvertenciaAjustado(null, "Seleccione una cuenta");
        }
    }//GEN-LAST:event_popTablaActionPerformed

    public void actualizarTablaCuentas() {
        while (tblCuenta.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        Object[][] registros = instancias.getSql().getRegistrosCuentas(txtAnho.getText());
        for (int ser = 0; ser < registros.length; ser++) {
            modelo.addRow(new Object[]{registros[ser][0], registros[ser][1], registros[ser][2]});
        }
    }

    public void ventanaEstructura(String nit) {
        buscEstructura buscar = new buscEstructura(instancias.getMenu(), rootPaneCheckingEnabled, false);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscEstructura(buscar);
        instancias.setCampoActual(txtIdEstructura);
        txtIdEstructura.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggCuenta;
    private javax.swing.JButton btnBuscarEstructuras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit1;
    private javax.swing.JLabel lbNit2;
    private javax.swing.JLabel lbNit4;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JMenuItem popTabla;
    private javax.swing.JMenuItem popTablaNueva;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JPopupMenu tabla;
    private javax.swing.JPopupMenu tablaNueva;
    private javax.swing.JTable tblCuenta;
    private javax.swing.JTable tblNuevaCuenta;
    private javax.swing.JTextField txtAnho;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtIdEstructura;
    private javax.swing.JTextField txtNombreEstructura;
    // End of variables declaration//GEN-END:variables
}
