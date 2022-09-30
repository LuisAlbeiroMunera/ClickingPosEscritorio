package formularios.Contable;

import clases.Instancias;
import clases.metodosGenerales;
import clases.productos.ndProducto;
import formularios.productos.buscProductos;
import formularios.productos.buscSubGrupos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

public class buscAmbitos extends javax.swing.JDialog {

    DefaultTableModel modelo;
    metodosGenerales metodos = new metodosGenerales();
    Instancias instancias;
    String anho, idComprobante;
    int fila;

    public buscAmbitos(java.awt.Frame parent, boolean modal, String anho, String nombre, String idComprobante, int fila, Object[][] ambitos, String tipoAmbito) {
        super(parent, modal);
        initComponents();

        modelo = (DefaultTableModel) tblAmbitos.getModel();
        this.fila = fila;
        this.anho = anho;
        this.idComprobante = idComprobante;
        this.instancias = Instancias.getInstancias();

        cmbTipoAmbito.setSelectedItem(tipoAmbito);
        lbNombre.setText(nombre.toUpperCase());

        for (Object[] ambito : ambitos) {

            for (int i = 0; i < tblAmbitos.getRowCount(); i++) {
                if (tipoAmbito.equals("POR GRUPO")) {
                    if (tblAmbitos.getValueAt(i, 1).equals(ambito[1])) {
                        modelo.removeRow(i);
                        i--;
                    }
                } else if (tipoAmbito.equals("POR SUBGRUPO")) {
                    if (tblAmbitos.getValueAt(i, 2).equals(ambito[2])) {
                        modelo.removeRow(i);
                        i--;
                    }
                } else if (tipoAmbito.equals("POR IVA %")) {
                    if (tblAmbitos.getValueAt(i, 4).equals(ambito[4])) {
                        modelo.removeRow(i);
                        i--;
                    }
                } else if (tipoAmbito.equals("POR IMPO %")) {
                    if (tblAmbitos.getValueAt(i, 5).equals(ambito[5])) {
                        modelo.removeRow(i);
                        i--;
                    }
                } else if (tipoAmbito.equals("POR BODEGA")) {
                    if (tblAmbitos.getValueAt(i, 3).equals(ambito[3])) {
                        modelo.removeRow(i);
                        i--;
                    }
                }
            }

            if (ambito[0] != null) {
                modelo.addRow(ambito);
                cmbTipoAmbito.setEnabled(false);
            }
        }

//        this.getRootPane().registerKeyboardAction(accion("cerrar", this), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
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

        filtro = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        popBorrar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAmbitos = new javax.swing.JTable();
        lbNombre = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAggAmbito = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtIdProducto = new javax.swing.JTextField();
        txtIdCuenta = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        lbNombre1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbNit8 = new javax.swing.JLabel();
        cmbTipoAmbito = new javax.swing.JComboBox();
        lbNombreAmbito = new javax.swing.JLabel();
        txtCampo = new javax.swing.JTextField();
        btnBuscador = new javax.swing.JButton();
        txtCuenta = new javax.swing.JTextField();
        btnBuscCuentas = new javax.swing.JButton();
        lbNit6 = new javax.swing.JLabel();

        popBorrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        popBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        popBorrar.setText("Borrar");
        popBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popBorrarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popBorrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ambitos...");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblAmbitos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblAmbitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Grupo", "Subgrupo", "Bodega", "Iva", "Impo", "Descripcion", "Cuenta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAmbitos.setComponentPopupMenu(jPopupMenu1);
        tblAmbitos.setRowHeight(24);
        tblAmbitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAmbitosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAmbitos);

        lbNombre.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombre.setText("NOMBRE");
        lbNombre.setName(""); // NOI18N
        lbNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNombreKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAggAmbito.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAggAmbito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-suma.png"))); // NOI18N
        btnAggAmbito.setText("Agregar ambito");
        btnAggAmbito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggAmbitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAggAmbito, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(btnAggAmbito)
                .addGap(2, 2, 2))
        );

        txtIdProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIdProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdProducto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIdProducto.setName("Codigo"); // NOI18N
        txtIdProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdProductoKeyTyped(evt);
            }
        });

        txtIdCuenta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIdCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdCuenta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIdCuenta.setName("Codigo"); // NOI18N
        txtIdCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdCuentaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdCuentaKeyTyped(evt);
            }
        });

        txtNombreProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreProducto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombreProducto.setName("Codigo"); // NOI18N
        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProducto)
                    .addComponent(txtIdCuenta)
                    .addComponent(txtNombreProducto))
                .addContainerGap())
        );

        lbNombre1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombre1.setText("X");
        lbNombre1.setName(""); // NOI18N
        lbNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNombre1MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbNit8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit8.setText("AMBITOS:");
        lbNit8.setName(""); // NOI18N
        lbNit8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit8KeyReleased(evt);
            }
        });

        cmbTipoAmbito.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbTipoAmbito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR...", "POR GRUPO", "POR SUBGRUPO", "POR IVA %", "POR IMPO %", "POR BODEGA" }));
        cmbTipoAmbito.setName("Grupo"); // NOI18N
        cmbTipoAmbito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoAmbitoItemStateChanged(evt);
            }
        });
        cmbTipoAmbito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoAmbitoActionPerformed(evt);
            }
        });

        lbNombreAmbito.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNombreAmbito.setText("PRODUCTO:");
        lbNombreAmbito.setName(""); // NOI18N
        lbNombreAmbito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNombreAmbitoKeyReleased(evt);
            }
        });

        txtCampo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCampo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCampo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCampo.setEnabled(false);
        txtCampo.setName("Codigo"); // NOI18N
        txtCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCampoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCampoKeyTyped(evt);
            }
        });

        btnBuscador.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscador.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBuscador.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        btnBuscador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscador.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscador.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscadorActionPerformed(evt);
            }
        });

        txtCuenta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCuenta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
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

        btnBuscCuentas.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscCuentas.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBuscCuentas.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        btnBuscCuentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscCuentas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscCuentas.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscCuentasActionPerformed(evt);
            }
        });

        lbNit6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit6.setText("CUENTA:");
        lbNit6.setName(""); // NOI18N
        lbNit6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit6KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNombreAmbito, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(lbNit8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCampo)
                    .addComponent(cmbTipoAmbito, 0, 150, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(btnBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lbNit6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnBuscCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbTipoAmbito, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lbNit8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCuenta, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbNit6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNombreAmbito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lbNombre1)
                .addGap(0, 0, 0)
                .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNombreKeyReleased

    private void btnAggAmbitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggAmbitoActionPerformed
        if (txtCampo.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Debe cargar un producto");
            return;
        }

        if (txtCuenta.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Debe cargar una cuenta");
            return;
        }

        modelo.addRow(new Object[]{txtIdProducto.getText(), "", "", "", "", "", txtNombreProducto.getText(), txtCuenta.getText()});
        txtCampo.setText("");
        txtIdProducto.setText("");
        txtNombreProducto.setText("");
        txtCuenta.setText("");
        txtIdCuenta.setText("");
        cmbTipoAmbito.setEnabled(false);
    }//GEN-LAST:event_btnAggAmbitoActionPerformed

    private void lbNombreAmbitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNombreAmbitoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNombreAmbitoKeyReleased

    private void txtCampoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoKeyReleased

    }//GEN-LAST:event_txtCampoKeyReleased

    private void txtCampoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoKeyTyped
        if (cmbTipoAmbito.getSelectedIndex() == 3 || cmbTipoAmbito.getSelectedIndex() == 4) {
            metodos.soloNum(evt);
        }
    }//GEN-LAST:event_txtCampoKeyTyped

    private void lbNit6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit6KeyReleased

    private void txtCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaKeyReleased

    private void txtCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaKeyTyped

    private void btnBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscadorActionPerformed
        if (cmbTipoAmbito.getSelectedIndex() > 0) {
            ventanaProductos("");
        } else {
            metodos.msgAdvertenciaAjustado(null, "Debe seleccionar un ambito");
        }
    }//GEN-LAST:event_btnBuscadorActionPerformed

    private void txtIdProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ndProducto nodo = instancias.getSql().getDatosProducto(txtIdProducto.getText(), "bdProductos");
            txtCampo.setText(nodo.getCodigo());
            txtNombreProducto.setText(nodo.getDescripcion());
        }
    }//GEN-LAST:event_txtIdProductoKeyReleased

    private void txtIdProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoKeyTyped

    private void btnBuscCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscCuentasActionPerformed
        if (cmbTipoAmbito.getSelectedIndex() > 0) {
            ventanaCuentas("", "Ambitos1");
        } else {
            metodos.msgAdvertenciaAjustado(null, "Debe seleccionar un ambito");
        }
    }//GEN-LAST:event_btnBuscCuentasActionPerformed

    private void txtIdCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCuentaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCuentaKeyReleased

    private void txtIdCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdCuentaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCuentaKeyTyped

    private void lbNombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNombre1MouseClicked
        Object[][] cuenta = new Object[tblAmbitos.getRowCount()][10];

        int ser = 0;
        for (int i = 0; i < tblAmbitos.getRowCount(); i++) {
            if (!tblAmbitos.getValueAt(i, 7).equals("")) {
                cuenta[ser][0] = tblAmbitos.getValueAt(i, 0);
                cuenta[ser][1] = tblAmbitos.getValueAt(i, 1);
                cuenta[ser][2] = tblAmbitos.getValueAt(i, 2);
                cuenta[ser][3] = tblAmbitos.getValueAt(i, 3);
                cuenta[ser][4] = tblAmbitos.getValueAt(i, 4);
                cuenta[ser][5] = tblAmbitos.getValueAt(i, 5);
                cuenta[ser][6] = tblAmbitos.getValueAt(i, 6);
                cuenta[ser][7] = tblAmbitos.getValueAt(i, 7);
                cuenta[ser][8] = idComprobante;
                cuenta[ser][9] = cmbTipoAmbito.getSelectedItem();
                ser++;
            }
        }

        instancias.getComprobantes().cargarAmbitos(cuenta, fila);

        this.dispose();
    }//GEN-LAST:event_lbNombre1MouseClicked

    private void popBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popBorrarActionPerformed
        if (tblAmbitos.getSelectedRow() > -1) {
            DefaultTableModel modelo = (DefaultTableModel) tblAmbitos.getModel();
            modelo.removeRow(tblAmbitos.getSelectedRow());
            tblAmbitos.removeEditor();

            if (tblAmbitos.getRowCount() == 0) {
                cmbTipoAmbito.setEnabled(true);
            }

        } else {
            metodos.msgAdvertenciaAjustado(null, "Seleccione un ambito");
        }
    }//GEN-LAST:event_popBorrarActionPerformed

    private void lbNit8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit8KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit8KeyReleased

    private void cmbTipoAmbitoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoAmbitoItemStateChanged
        while (tblAmbitos.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        if (cmbTipoAmbito.getSelectedIndex() == 1) {
            Object[][] grupos = instancias.getSql().getRegistrosGrupos();
            for (Object[] grupo : grupos) {
                modelo.addRow(new Object[]{"", grupo[0], "", "", "", "", grupo[1], ""});
            }

            tblAmbitos.getColumnModel().getColumn(0).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(0).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setMinWidth(90);
            tblAmbitos.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblAmbitos.getColumnModel().getColumn(1).setMaxWidth(90);
            tblAmbitos.getColumnModel().getColumn(2).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(6).setMinWidth(200);
            tblAmbitos.getColumnModel().getColumn(6).setPreferredWidth(220);
            tblAmbitos.getColumnModel().getColumn(6).setMaxWidth(250);

        } else if (cmbTipoAmbito.getSelectedIndex() == 2) {
            Object[][] subgrupos = instancias.getSql().getRegistrosSubgrupos();
            for (Object[] subgrupo : subgrupos) {
                modelo.addRow(new Object[]{"", "", subgrupo[0], "", "", "", subgrupo[1], ""});
            }

            tblAmbitos.getColumnModel().getColumn(0).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(0).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setMinWidth(100);
            tblAmbitos.getColumnModel().getColumn(2).setPreferredWidth(120);
            tblAmbitos.getColumnModel().getColumn(2).setMaxWidth(120);
            tblAmbitos.getColumnModel().getColumn(3).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(6).setMinWidth(200);
            tblAmbitos.getColumnModel().getColumn(6).setPreferredWidth(220);
            tblAmbitos.getColumnModel().getColumn(6).setMaxWidth(250);

        } else if (cmbTipoAmbito.getSelectedIndex() == 3) {
            modelo.addRow(new Object[]{"", "", "", "", "0", "", "", ""});
            modelo.addRow(new Object[]{"", "", "", "", "5", "", "", ""});
            modelo.addRow(new Object[]{"", "", "", "", "19", "", "", ""});

            tblAmbitos.getColumnModel().getColumn(0).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(0).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setMinWidth(50);
            tblAmbitos.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblAmbitos.getColumnModel().getColumn(4).setMaxWidth(50);
            tblAmbitos.getColumnModel().getColumn(5).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(6).setMinWidth(200);
            tblAmbitos.getColumnModel().getColumn(6).setPreferredWidth(220);
            tblAmbitos.getColumnModel().getColumn(6).setMaxWidth(250);
        } else if (cmbTipoAmbito.getSelectedIndex() == 4) {
            modelo.addRow(new Object[]{"", "", "", "", "", "0", "", ""});
            modelo.addRow(new Object[]{"", "", "", "", "", "4", "", ""});
            modelo.addRow(new Object[]{"", "", "", "", "", "8", "", ""});
            modelo.addRow(new Object[]{"", "", "", "", "", "16", "", ""});

            tblAmbitos.getColumnModel().getColumn(0).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(0).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setMinWidth(50);
            tblAmbitos.getColumnModel().getColumn(5).setPreferredWidth(50);
            tblAmbitos.getColumnModel().getColumn(5).setMaxWidth(50);
            tblAmbitos.getColumnModel().getColumn(6).setMinWidth(200);
            tblAmbitos.getColumnModel().getColumn(6).setPreferredWidth(220);
            tblAmbitos.getColumnModel().getColumn(6).setMaxWidth(250);
        } else if (cmbTipoAmbito.getSelectedIndex() == 5) {
            modelo.addRow(new Object[]{"", "", "", "BODEGA PRINCIPAL", "", "", "", ""});
            modelo.addRow(new Object[]{"", "", "", "BODEGA-1", "", "", "", ""});
            modelo.addRow(new Object[]{"", "", "", "BODEGA-2", "", "", "", ""});
            modelo.addRow(new Object[]{"", "", "", "BODEGA-3", "", "", "", ""});
            modelo.addRow(new Object[]{"", "", "", "BODEGA-4", "", "", "", ""});

            tblAmbitos.getColumnModel().getColumn(0).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(0).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(1).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(2).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(3).setMinWidth(110);
            tblAmbitos.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblAmbitos.getColumnModel().getColumn(3).setMaxWidth(150);
            tblAmbitos.getColumnModel().getColumn(4).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(4).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setMinWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblAmbitos.getColumnModel().getColumn(5).setMaxWidth(0);
            tblAmbitos.getColumnModel().getColumn(6).setMinWidth(200);
            tblAmbitos.getColumnModel().getColumn(6).setPreferredWidth(220);
            tblAmbitos.getColumnModel().getColumn(6).setMaxWidth(250);
        }

//        txtCampo.setText("");
//        txtIdProducto.setText("");
//        txtNombreProducto.setText("");
//
//        if (cmbTipoAmbito.getSelectedIndex() == 3 || cmbTipoAmbito.getSelectedIndex() == 4) {
//            txtCampo.setEnabled(true);
//        } else {
//            txtCampo.setEnabled(false);
//        }
//
//        lbNombreAmbito.setText(cmbTipoAmbito.getSelectedItem().toString().substring(4, cmbTipoAmbito.getSelectedItem().toString().length()));
//
//        if (cmbTipoAmbito.getSelectedIndex() == 1 || cmbTipoAmbito.getSelectedIndex() == 5) {
//
//            if (cmbTipoAmbito.getSelectedIndex() == 1) {
//                cmbCombo.removeAllItems();
//                grupos = instancias.getSql().getRegistrosGrupos();
//                for (Object[] grupo : grupos) {
//                    cmbCombo.addItem(grupo[1]);
//                }
//            } else if (cmbTipoAmbito.getSelectedIndex() == 5) {
//                modelo.addRow(new Object[]{"", "", "", "", "", "", "BODEGA PRINCIPAL", ""});
//                modelo.addRow(new Object[]{"", "", "", "", "", "", "BODEGA-1", ""});
//                modelo.addRow(new Object[]{"", "", "", "", "", "", "BODEGA-2", ""});
//                modelo.addRow(new Object[]{"", "", "", "", "", "", "BODEGA-3", ""});
//                modelo.addRow(new Object[]{"", "", "", "", "", "", "BODEGA-4", ""});
//            }
//
//            cmbCombo.setVisible(true);
//            txtCampo.setVisible(false);
//            btnBuscador.setEnabled(false);
//        } else {
//            cmbCombo.setVisible(false);
//            txtCampo.setVisible(true);
//            btnBuscador.setEnabled(true);
//            if (cmbTipoAmbito.getSelectedIndex() == 3 || cmbTipoAmbito.getSelectedIndex() == 4) {
//                btnBuscador.setEnabled(false);
//            }
//        }
    }//GEN-LAST:event_cmbTipoAmbitoItemStateChanged

    private void cmbTipoAmbitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoAmbitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoAmbitoActionPerformed

    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void txtNombreProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoKeyReleased

    private void tblAmbitosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAmbitosMouseClicked
        if (tblAmbitos.getSelectedColumn() == 7) {
            ventanaCuentas("", "Ambitos");
        }
    }//GEN-LAST:event_tblAmbitosMouseClicked

    public void cargarCuenta1(String codigo, String cuenta) {
        txtIdCuenta.setText(codigo);
        txtCuenta.setText(cuenta);
    }

    public void cargarCuenta(int fila, String cuenta) {
        tblAmbitos.setValueAt(cuenta, fila, 7);
    }

    public void ventanaProductos(String codigo) {
        buscProductos buscar = new buscProductos(null, true, true, "", "productos1");
        buscar.setLocationRelativeTo(null);
        instancias.setBusProductos(buscar);
        instancias.setCampoActual(txtIdProducto);
        txtIdProducto.requestFocus();
        buscar.noEncontrado(codigo.replace("'", "//"));
        buscar.show();
    }

    public void ventanaCuentas(String nit, String opc) {
        buscCuentas buscar = new buscCuentas(instancias.getMenu(), true, true, anho, tblAmbitos.getSelectedRow(), opc);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscCuentas(buscar);
//        instancias.setCampoActual(txtIdProducto);
        buscar.noEncontrado(nit);
        buscar.show();
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
            java.util.logging.Logger.getLogger(buscAmbitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscAmbitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscAmbitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscAmbitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                buscAmbitos dialog = new buscAmbitos(new javax.swing.JFrame(), true, "", "", "", 0, null, "");
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
    private javax.swing.JButton btnAggAmbito;
    private javax.swing.JButton btnBuscCuentas;
    private javax.swing.JButton btnBuscador;
    private javax.swing.JComboBox cmbTipoAmbito;
    private javax.swing.ButtonGroup filtro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbNit6;
    private javax.swing.JLabel lbNit8;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbNombreAmbito;
    private javax.swing.JMenuItem popBorrar;
    private javax.swing.JTable tblAmbitos;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtIdCuenta;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombreProducto;
    // End of variables declaration//GEN-END:variables
}
