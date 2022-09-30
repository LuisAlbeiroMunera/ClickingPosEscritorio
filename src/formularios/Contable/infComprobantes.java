package formularios.Contable;

import clases.Contable.ndEstructura;
import clases.IconCellRenderer;
import clases.Instancias;
import clases.metodosGenerales;
import clases.terceros.ndTercero;
import formularios.terceros.buscClientes;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class infComprobantes extends javax.swing.JInternalFrame {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    DefaultTableModel modelo;

    public infComprobantes() {

        initComponents();

        modelo = (DefaultTableModel) tblComprobantes.getModel();

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        instancias = Instancias.getInstancias();
        btnActualizar.setEnabled(false);
        btnGuardar.setEnabled(true);

        tblComprobantes.setDefaultRenderer(Object.class, new IconCellRenderer());
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
                    case "modificar":
                        if ((btnActualizar.isEnabled()) && (btnActualizar.isVisible())) {
                            btnActualizarActionPerformed(null);
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
        txtAnho = new javax.swing.JTextField();
        lbNit = new javax.swing.JLabel();
        lbNit4 = new javax.swing.JLabel();
        lbRazon = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        cmbComprobantes = new javax.swing.JComboBox();
        lbRazon1 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComprobantes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        pnlInvisible = new javax.swing.JPanel();
        txtNit = new javax.swing.JTextField();
        txtAmbito = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAmbitos = new javax.swing.JTable();

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

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

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("Año: *");
        lbNit.setName(""); // NOI18N
        lbNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNitKeyReleased(evt);
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

        lbRazon.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon.setText("Modelo contable: *");

        txtModelo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModelo.setName("Descripción"); // NOI18N
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloKeyReleased(evt);
            }
        });

        cmbComprobantes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Ventas", "Recibo de caja", "Egresos", "Compras", "Entrada", "Salida" }));
        cmbComprobantes.setEnabled(false);
        cmbComprobantes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbComprobantesItemStateChanged(evt);
            }
        });

        lbRazon1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbRazon1.setText("Descripción: *");

        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescripcion.setName("Modelo contable"); // NOI18N
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNit4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbComprobantes, 0, 142, Short.MAX_VALUE)
                    .addComponent(txtAnho))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbRazon, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(lbRazon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion)
                            .addComponent(lbRazon1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAnho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(lbRazon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbComprobantes)
                            .addComponent(lbNit4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );

        tblComprobantes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblComprobantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idComprobante", "Nombre", "idCuenta", "Cuenta", "Descripcion", "Tercero", "idTercero", "Nombre", "Ambito", "Relacion", "Mov"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true
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
            tblComprobantes.getColumnModel().getColumn(0).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(0).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(2).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(2).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(3).setMinWidth(80);
            tblComprobantes.getColumnModel().getColumn(3).setPreferredWidth(130);
            tblComprobantes.getColumnModel().getColumn(3).setMaxWidth(200);
            tblComprobantes.getColumnModel().getColumn(5).setMinWidth(60);
            tblComprobantes.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblComprobantes.getColumnModel().getColumn(5).setMaxWidth(60);
            tblComprobantes.getColumnModel().getColumn(6).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(6).setMaxWidth(0);
            tblComprobantes.getColumnModel().getColumn(8).setMinWidth(60);
            tblComprobantes.getColumnModel().getColumn(8).setPreferredWidth(60);
            tblComprobantes.getColumnModel().getColumn(8).setMaxWidth(60);
            tblComprobantes.getColumnModel().getColumn(9).setMinWidth(60);
            tblComprobantes.getColumnModel().getColumn(9).setPreferredWidth(60);
            tblComprobantes.getColumnModel().getColumn(9).setMaxWidth(60);
            tblComprobantes.getColumnModel().getColumn(10).setMinWidth(0);
            tblComprobantes.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblComprobantes.getColumnModel().getColumn(10).setMaxWidth(0);
        }

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

        btnActualizar.setBackground(new java.awt.Color(93, 173, 226));
        btnActualizar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("MODIFICAR");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnActualizar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar))
                .addGap(5, 5, 5))
        );

        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
        });

        txtAmbito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmbitoKeyReleased(evt);
            }
        });

        tblAmbitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Grupo", "Subgrupo", "Bodega", "Iva", "Impo", "Descripcion", "Cuenta", "idComprobante", "ambito"
            }
        ));
        jScrollPane2.setViewportView(tblAmbitos);

        javax.swing.GroupLayout pnlInvisibleLayout = new javax.swing.GroupLayout(pnlInvisible);
        pnlInvisible.setLayout(pnlInvisibleLayout);
        pnlInvisibleLayout.setHorizontalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pnlInvisibleLayout.createSequentialGroup()
                        .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmbito, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlInvisibleLayout.setVerticalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmbito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInvisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        scrFormulario.setViewportView(pnlFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(true);
        cmbComprobantes.setSelectedIndex(0);
        cmbComprobantes.setEnabled(false);
        txtAnho.setText("");
        txtNit.setText("");
        txtDescripcion.setText("");
        txtModelo.setText("");

        DefaultTableModel modelo1 = (DefaultTableModel) tblAmbitos.getModel();
        while (tblAmbitos.getRowCount() > 0) {
            modelo1.removeRow(0);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Object[] campos = {txtAnho, txtModelo, txtDescripcion};
        String faltantes = metodos.camposVacios(campos);

        if (!faltantes.equals("")) {
            metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
            return;
        }

        if (cmbComprobantes.getSelectedIndex() == 0) {
            metodos.msgAdvertenciaAjustado(this, "Seleccionar tipo de comprobante");
            return;
        }

        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {

            instancias.getSql().eliminar_registro("bdComprobante", " anho = '" + txtAnho.getText() + "' AND comprobante = '"
                    + cmbComprobantes.getSelectedItem().toString() + "' AND modelo = '" + txtModelo.getText() + "' ");
            instancias.getSql().eliminar_registro("bdAmbitos", " anho = '" + txtAnho.getText() + "' AND comprobante = '"
                    + cmbComprobantes.getSelectedItem().toString() + "' AND modelo = '" + txtModelo.getText() + "' ");

            for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
                if (!instancias.getSql().agregarComprobante(txtAnho.getText(), txtDescripcion.getText(), cmbComprobantes.getSelectedItem().toString(), txtModelo.getText(),
                        tblComprobantes.getValueAt(i, 0).toString(), tblComprobantes.getValueAt(i, 1).toString(), tblComprobantes.getValueAt(i, 2).toString(),
                        tblComprobantes.getValueAt(i, 3).toString(), tblComprobantes.getValueAt(i, 4).toString(), tblComprobantes.getValueAt(i, 6).toString(),
                        tblComprobantes.getValueAt(i, 9).toString(), tblComprobantes.getValueAt(i, 10).toString())) {
                    metodos.msgError(this, "Error al guardar la estructura");
                    return;
                }
            }

            for (int i = 0; i < tblAmbitos.getRowCount(); i++) {
                if (!instancias.getSql().agregarAmbitos(txtAnho.getText(), cmbComprobantes.getSelectedItem().toString(),
                        tblAmbitos.getValueAt(i, 0).toString(), tblAmbitos.getValueAt(i, 1).toString(), tblAmbitos.getValueAt(i, 2).toString(),
                        tblAmbitos.getValueAt(i, 3).toString(), tblAmbitos.getValueAt(i, 4).toString(), tblAmbitos.getValueAt(i, 5).toString(),
                        tblAmbitos.getValueAt(i, 6).toString(), tblAmbitos.getValueAt(i, 7).toString(), tblAmbitos.getValueAt(i, 8).toString(),
                        tblAmbitos.getValueAt(i, 9).toString(), txtModelo.getText())) {
                    metodos.msgError(this, "Error al guardar el ambito");
                    return;
                }
            }

            metodos.msgExito(this, "Comprobante modificado con exito");
            btnNuevoActionPerformed(evt);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Object[] campos = {txtAnho, txtModelo, txtDescripcion};
        String faltantes = metodos.camposVacios(campos);

        if (!faltantes.equals("")) {
            metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
            return;
        }

        if (cmbComprobantes.getSelectedIndex() == 0) {
            metodos.msgAdvertenciaAjustado(this, "Seleccionar tipo de comprobante");
            return;
        }

        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {
            for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
                if (!instancias.getSql().agregarComprobante(txtAnho.getText(), txtDescripcion.getText(), cmbComprobantes.getSelectedItem().toString(), txtModelo.getText(),
                        tblComprobantes.getValueAt(i, 0).toString(), tblComprobantes.getValueAt(i, 1).toString(), tblComprobantes.getValueAt(i, 2).toString(),
                        tblComprobantes.getValueAt(i, 3).toString(), tblComprobantes.getValueAt(i, 4).toString(), tblComprobantes.getValueAt(i, 6).toString(),
                        tblComprobantes.getValueAt(i, 9).toString(), tblComprobantes.getValueAt(i, 10).toString())) {
                    metodos.msgError(this, "Error al guardar la estructura");
                    return;
                }
            }

            for (int i = 0; i < tblAmbitos.getRowCount(); i++) {
                if (!instancias.getSql().agregarAmbitos(txtAnho.getText(), cmbComprobantes.getSelectedItem().toString(),
                        tblAmbitos.getValueAt(i, 0).toString(), tblAmbitos.getValueAt(i, 1).toString(), tblAmbitos.getValueAt(i, 2).toString(),
                        tblAmbitos.getValueAt(i, 3).toString(), tblAmbitos.getValueAt(i, 4).toString(), tblAmbitos.getValueAt(i, 5).toString(),
                        tblAmbitos.getValueAt(i, 6).toString(), tblAmbitos.getValueAt(i, 7).toString(), tblAmbitos.getValueAt(i, 8).toString(),
                        tblAmbitos.getValueAt(i, 9).toString(), txtModelo.getText())) {
                    metodos.msgError(this, "Error al guardar el ambito");
                    return;
                }
            }

            metodos.msgExito(this, "Comprobante guardado con exito");
            btnNuevoActionPerformed(evt);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyReleased
        btnActualizar.setEnabled(false);
        btnGuardar.setEnabled(true);
        cmbComprobantes.setSelectedIndex(0);
        txtDescripcion.setText("");

        while (tblComprobantes.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        if (txtModelo.getText().equals("")) {
            cmbComprobantes.setEnabled(false);
        } else {
            if (!txtAnho.getText().equals("")) {
                cmbComprobantes.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtModeloKeyReleased

    private void txtAnhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnhoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Object[] datosPuc = instancias.getSql().getDatosRegistro(txtAnho.getText());
            if (datosPuc[0] == null) {
                metodos.msgAdvertenciaAjustado(this, "No existe PUC de ese año");
            } else {
                if (txtModelo.getText().equals("")) {
                    cmbComprobantes.setEnabled(false);
                    txtModelo.requestFocus();
                } else {
                    cmbComprobantes.setEnabled(true);
                }
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

    private void cmbComprobantesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbComprobantesItemStateChanged
        btnActualizar.setEnabled(false);
        btnGuardar.setEnabled(true);

        while (tblComprobantes.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        DefaultTableModel modeloAmbitos = (DefaultTableModel) tblAmbitos.getModel();
        while (tblAmbitos.getRowCount() > 0) {
            modeloAmbitos.removeRow(0);
        }

        //LLENAR REGISTROS 
        Object[][] registros = instancias.getSql().getRegistrosComprobantes(txtAnho.getText(), cmbComprobantes.getSelectedItem().toString(), txtModelo.getText());
        Object[][] registrosAmbitos = instancias.getSql().getRegistrosAmbitos(txtAnho.getText(), cmbComprobantes.getSelectedItem().toString(), txtModelo.getText());
        Boolean existenRegistros = false;
        for (Object[] registro : registros) {
            String nombre = "";
            if (registro[9] != null) {
                if (!registro[9].equals("")) {
                    ndTercero nodo = instancias.getSql().getDatosTercero(registro[9].toString());
                    nombre = nodo.getNombre();
                }
            }
            modelo.addRow(new Object[]{registro[4], registro[5], registro[6], registro[7], registro[8], "", registro[9], nombre, "", registro[10], registro[11]});
            existenRegistros = true;
        }

        for (Object[] registro : registrosAmbitos) {
            modeloAmbitos.addRow(registro);
        }
        //FIN DEL LLENADO DE REGISTROS

        if (cmbComprobantes.getSelectedIndex() == 1) {
            if (existenRegistros) {
                txtModelo.setText(registros[0][3].toString());
                txtDescripcion.setText(registros[0][1].toString());
                btnGuardar.setEnabled(false);
                btnActualizar.setEnabled(true);
            } else {
                modelo.addRow(new Object[]{1, "Venta o servicios grabados", "", "", "", "", "", "", "", "", "CREDITO"});
                modelo.addRow(new Object[]{2, "Venta o servicios no grabados", "", "", "", "", "", "", "", "", "CREDITO"});
                modelo.addRow(new Object[]{3, "Iva generado", "", "", "", "", "", "", "", "", "CREDITO"});
                modelo.addRow(new Object[]{4, "Cxc clientes", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{5, "Rete fuente clientes", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{6, "Rete iva clientes", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{7, "Impuesto al consumo", "", "", "", "", "", "", "", "", "CREDITO"});
                modelo.addRow(new Object[]{8, "Costo mercancia vendida", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{9, "Inventario", "", "", "", "", "", "", "", "", "CREDITO"});
            }
        } else if (cmbComprobantes.getSelectedIndex() == 2) {
            if (existenRegistros) {
                txtModelo.setText(registros[0][3].toString());
                txtDescripcion.setText(registros[0][1].toString());
                btnGuardar.setEnabled(false);
                btnActualizar.setEnabled(true);
            } else {
                modelo.addRow(new Object[]{1, "Caja o bancos", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{2, "Cxc clientes", "", "", "", "", "", "", "", "", "CREDITO"});
                modelo.addRow(new Object[]{3, "Descuento financiero", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{4, "Rete fuente", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{5, "Rete iva", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{6, "Rete industria y comercio", "", "", "", "", "", "", "", "", "DEBITO"});
            }
        } else if (cmbComprobantes.getSelectedIndex() == 3) {
            if (existenRegistros) {
                txtModelo.setText(registros[0][3].toString());
                txtDescripcion.setText(registros[0][1].toString());
                btnGuardar.setEnabled(false);
                btnActualizar.setEnabled(true);
            } else {
                modelo.addRow(new Object[]{1, "Cxp proveedores", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{2, "Costos y gastos x pagar", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{3, "Caja o bancos", "", "", "", "", "", "", "", "", "CREDITO"});
                modelo.addRow(new Object[]{4, "Descuento comercial", "", "", "", "", "", "", "", "", "CREDITO"});
            }
        } else if (cmbComprobantes.getSelectedIndex() == 4) {
            if (existenRegistros) {
                txtModelo.setText(registros[0][3].toString());
                txtDescripcion.setText(registros[0][1].toString());
                btnGuardar.setEnabled(false);
                btnActualizar.setEnabled(true);
            } else {
                modelo.addRow(new Object[]{1, "Inventario grabado", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{2, "Inventario no grabado", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{3, "Iva descontable compra", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{4, "Rete fuente x pagar", "", "", "", "", "", "", "", "", "CREDITO"});
                modelo.addRow(new Object[]{5, "Cxp a proveedor", "", "", "", "", "", "", "", "", "CREDITO"});
                modelo.addRow(new Object[]{6, "Impoconsumo compra", "", "", "", "", "", "", "", "", "DEBITO"});
            }
        } else if (cmbComprobantes.getSelectedIndex() == 5) {
            if (existenRegistros) {
                txtModelo.setText(registros[0][3].toString());
                txtDescripcion.setText(registros[0][1].toString());
                btnGuardar.setEnabled(false);
                btnActualizar.setEnabled(true);
            } else {
                modelo.addRow(new Object[]{1, "Inventario", "", "", "", "", "", "", "", "", "DEBITO"});
                modelo.addRow(new Object[]{2, "Costo", "", "", "", "", "", "", "", "", "CREDITO"});
            }
        } else if (cmbComprobantes.getSelectedIndex() == 6) {
            if (existenRegistros) {
                txtModelo.setText(registros[0][3].toString());
                txtDescripcion.setText(registros[0][1].toString());
                btnGuardar.setEnabled(false);
                btnActualizar.setEnabled(true);
            } else {
                modelo.addRow(new Object[]{1, "Inventario", "", "", "", "", "", "", "", "", "CREDITO"});
                modelo.addRow(new Object[]{2, "Costo", "", "", "", "", "", "", "", "", "DEBITO"});
            }
        }

        for (int i = 0; i < tblComprobantes.getRowCount(); i++) {
            ImageIcon fot = new ImageIcon(getClass().getResource("/imagenes/buscar1.png"));
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
            modelo.setValueAt(new JLabel(icono), i, 5);
            modelo.setValueAt(new JLabel(icono), i, 8);
        }
    }//GEN-LAST:event_cmbComprobantesItemStateChanged

    private void tblComprobantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprobantesMouseClicked
        if (tblComprobantes.getSelectedColumn() == 3) {

            if (tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 9).equals("SI")) {
                metodos.msgAdvertencia(this, "Este comprobante tiene ambitos relacionados y no se le puede relacionar cuenta");
                return;
            }

            ventanaCuentas("");
        } else if (tblComprobantes.getSelectedColumn() == 5) {
            ventanaTerceros("");
        } else if (tblComprobantes.getSelectedColumn() == 8) {

            //Restrincciones egresos
            if (cmbComprobantes.getSelectedItem().equals("Egresos")) {
                metodos.msgAdvertencia(this, "A este tipo de comprobante no se le puede relacionar ambitos");
                return;
            }
            //Fin egresos

            //Restrincciones recibo de caja
            if (cmbComprobantes.getSelectedItem().equals("Recibo de caja")) {
                metodos.msgAdvertencia(this, "A este tipo de comprobante no se le puede relacionar ambitos");
                return;
            }
            //Fin recibo de caja

            //Restrincciones ventas
            if (cmbComprobantes.getSelectedItem().equals("Ventas") && tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 0).toString().equals("5")) {
                metodos.msgAdvertencia(this, "A este tipo de comprobante no se le puede relacionar ambitos");
                return;
            }

            if (cmbComprobantes.getSelectedItem().equals("Ventas") && tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 0).toString().equals("6")) {
                metodos.msgAdvertencia(this, "A este tipo de comprobante no se le puede relacionar ambitos");
                return;
            }
            //Fin ventas

            if (cmbComprobantes.getSelectedItem().equals("Compras") && tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 0).toString().equals("5")) {
                metodos.msgAdvertencia(this, "A este tipo de comprobante no se le puede relacionar ambitos");
                return;
            }

            if (cmbComprobantes.getSelectedItem().equals("Compras") && tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 0).toString().equals("4")) {
                metodos.msgAdvertencia(this, "A este tipo de comprobante no se le puede relacionar ambitos");
                return;
            }

            ventanaAmbitos("", tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 1).toString(),
                    tblComprobantes.getValueAt(tblComprobantes.getSelectedRow(), 0).toString(), tblComprobantes.getSelectedRow());
        }
    }//GEN-LAST:event_tblComprobantesMouseClicked

    private void txtAmbitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmbitoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmbitoKeyReleased

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarCliente(txtNit.getText());
        }
    }//GEN-LAST:event_txtNitKeyReleased

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

    public void cargarAmbitos(Object[][] datos, int fila) {
        DefaultTableModel modelo = (DefaultTableModel) tblAmbitos.getModel();

        for (int i = 0; i < tblAmbitos.getRowCount(); i++) {
            if (tblAmbitos.getValueAt(i, 8).equals(tblComprobantes.getValueAt(fila, 0))) {
                modelo.removeRow(i);
                i--;
            }
        }

        Boolean datosAmbito = false;
        for (Object[] dato : datos) {
            if (dato[0] != null) {
                modelo.addRow(dato);
                datosAmbito = true;
            }
        }

        if (datosAmbito) {
            tblComprobantes.setValueAt("SI", fila, 9);
            tblComprobantes.setValueAt("", fila, 2);
            tblComprobantes.setValueAt("", fila, 3);
            tblComprobantes.setValueAt("", fila, 4);
        } else {
            tblComprobantes.setValueAt("", fila, 9);
        }
    }

    public void cargarCuenta(int fila, String codigo, String cuenta, String nombre) {
        tblComprobantes.setValueAt(codigo, fila, 2);
        tblComprobantes.setValueAt(cuenta, fila, 3);
        tblComprobantes.setValueAt(nombre, fila, 4);
    }

    public void ventanaCuentas(String nit) {
        buscCuentas buscar = new buscCuentas(instancias.getMenu(), true, true, txtAnho.getText(), tblComprobantes.getSelectedRow(), "Comprobantes");
        buscar.setLocationRelativeTo(null);
        instancias.setBuscCuentas(buscar);
        instancias.setCampoActual(txtNit);
        txtNit.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void ventanaTerceros(String nit) {
        buscClientes buscar = new buscClientes(instancias.getMenu(), true, false, null, "");
        buscar.setLocationRelativeTo(null);
        buscar.setOpc("Ambitos");
        instancias.setBusClientes(buscar);
        instancias.setCampoActual(txtNit);
        txtNit.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void ventanaAmbitos(String nit, String nombre, String id, int fila) {

        Object[][] ambitos = new Object[tblAmbitos.getRowCount()][9];
        String comprobante = tblComprobantes.getValueAt(fila, 0).toString();

        String tipoAmbito = "";
        for (int i = 0; i < tblAmbitos.getRowCount(); i++) {
            if (comprobante.equals(tblAmbitos.getValueAt(i, 8))) {
                ambitos[i][0] = tblAmbitos.getValueAt(i, 0);
                ambitos[i][1] = tblAmbitos.getValueAt(i, 1);
                ambitos[i][2] = tblAmbitos.getValueAt(i, 2);
                ambitos[i][3] = tblAmbitos.getValueAt(i, 3);
                ambitos[i][4] = tblAmbitos.getValueAt(i, 4);
                ambitos[i][5] = tblAmbitos.getValueAt(i, 5);
                ambitos[i][6] = tblAmbitos.getValueAt(i, 6);
                ambitos[i][7] = tblAmbitos.getValueAt(i, 7);
                ambitos[i][8] = tblAmbitos.getValueAt(i, 8);
                tipoAmbito = tblAmbitos.getValueAt(i, 9).toString();
            }
        }

        buscAmbitos buscar = new buscAmbitos(instancias.getMenu(), true, txtAnho.getText(), nombre, id, fila, ambitos, tipoAmbito);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscAmbitos(buscar);
        instancias.setCampoActual(txtNit);
        txtNit.requestFocus();
        buscar.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbComprobantes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit4;
    private javax.swing.JLabel lbRazon;
    private javax.swing.JLabel lbRazon1;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInvisible;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTable tblAmbitos;
    private javax.swing.JTable tblComprobantes;
    private javax.swing.JTextField txtAmbito;
    private javax.swing.JTextField txtAnho;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNit;
    // End of variables declaration//GEN-END:variables
}
