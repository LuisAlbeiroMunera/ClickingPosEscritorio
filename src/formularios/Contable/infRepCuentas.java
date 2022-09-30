package formularios.Contable;
import logs.Logs;
import clases.Instancias;
import clases.metodosGenerales;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

public class infRepCuentas extends javax.swing.JPanel {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;
    private Dimension dimBarra = null;

    public infRepCuentas() {
        initComponents();

        instancias = Instancias.getInstancias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTipo = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbNit11 = new javax.swing.JLabel();
        btnImpresa = new javax.swing.JRadioButton();
        chkExcel = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        lbNit1 = new javax.swing.JLabel();
        lbNit17 = new javax.swing.JLabel();
        cmbNiveles = new javax.swing.JComboBox();
        txtCuenta = new javax.swing.JTextField();
        lbNit2 = new javax.swing.JLabel();
        txtAnho = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        btnAggProd1 = new javax.swing.JButton();
        btnRemProd1 = new javax.swing.JButton();
        btnAggCliente = new javax.swing.JButton();
        btnRemCliente = new javax.swing.JButton();
        btnAggAnho = new javax.swing.JButton();
        btnRemAnho = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        cmbCuentas = new javax.swing.JComboBox();
        cmbNiveles2 = new javax.swing.JComboBox();
        cmbAnho = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lbNit11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lbNit11.setText("Versión:");

        btnImpresa.setBackground(new java.awt.Color(255, 255, 255));
        grupoTipo.add(btnImpresa);
        btnImpresa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnImpresa.setSelected(true);
        btnImpresa.setText("En pantalla");
        btnImpresa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnImpresa.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        chkExcel.setBackground(new java.awt.Color(255, 255, 255));
        grupoTipo.add(chkExcel);
        chkExcel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chkExcel.setText("Hoja de calculo");
        chkExcel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkExcel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNit11)
                .addGap(53, 53, 53)
                .addComponent(btnImpresa)
                .addGap(38, 38, 38)
                .addComponent(chkExcel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImpresa)
                    .addComponent(lbNit11)
                    .addComponent(chkExcel))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lbNit1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit1.setText("Cuenta:");

        lbNit17.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit17.setText("Niveles:");

        cmbNiveles.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbNiveles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        txtCuenta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCuentaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCuentaKeyReleased(evt);
            }
        });

        lbNit2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit2.setText("Año:");

        txtAnho.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAnho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnhoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnhoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit17, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(cmbNiveles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCuenta)
                    .addComponent(lbNit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAnho))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbNit1)
                .addGap(3, 3, 3)
                .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lbNit2)
                .addGap(3, 3, 3)
                .addComponent(txtAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lbNit17)
                .addGap(3, 3, 3)
                .addComponent(cmbNiveles, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        btnAggProd1.setBackground(new java.awt.Color(204, 204, 204));
        btnAggProd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAggProd1.setForeground(new java.awt.Color(255, 255, 255));
        btnAggProd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAggProd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggProd1ActionPerformed(evt);
            }
        });

        btnRemProd1.setBackground(new java.awt.Color(204, 204, 204));
        btnRemProd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemProd1.setForeground(new java.awt.Color(153, 0, 0));
        btnRemProd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png"))); // NOI18N
        btnRemProd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemProd1ActionPerformed(evt);
            }
        });

        btnAggCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnAggCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAggCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAggCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAggCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggClienteActionPerformed(evt);
            }
        });

        btnRemCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnRemCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemCliente.setForeground(new java.awt.Color(153, 0, 0));
        btnRemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png"))); // NOI18N
        btnRemCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemClienteActionPerformed(evt);
            }
        });

        btnAggAnho.setBackground(new java.awt.Color(204, 204, 204));
        btnAggAnho.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAggAnho.setForeground(new java.awt.Color(255, 255, 255));
        btnAggAnho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btnAggAnho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAggAnho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggAnhoActionPerformed(evt);
            }
        });

        btnRemAnho.setBackground(new java.awt.Color(204, 204, 204));
        btnRemAnho.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemAnho.setForeground(new java.awt.Color(153, 0, 0));
        btnRemAnho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png"))); // NOI18N
        btnRemAnho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemAnho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemAnhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnAggCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemCliente))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnAggProd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemProd1))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnAggAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemAnho)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAggCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAggAnho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemAnho))
                .addGap(47, 47, 47)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemProd1)
                    .addComponent(btnAggProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        cmbCuentas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        cmbNiveles2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        cmbAnho.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCuentas, 0, 214, Short.MAX_VALUE)
                    .addComponent(cmbNiveles2, 0, 214, Short.MAX_VALUE)
                    .addComponent(cmbAnho, 0, 214, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(cmbAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(cmbNiveles2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setBackground(new java.awt.Color(46, 204, 113));
        jButton5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton5.setText("Generar");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        scrFormulario.setViewportView(pnlFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFormulario)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFormulario)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarRegistro(txtCuenta.getText());
        }
    }//GEN-LAST:event_txtCuentaKeyReleased

    private void txtCuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaKeyPressed

    private void btnAggClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggClienteActionPerformed
        if (txtCuenta.getText().equals("")) {
            metodos.msgError(null, "Cargue primero una cuenta");
        } else {
            if (yaEsta(cmbCuentas, txtCuenta.getText())) {
                metodos.msgAdvertencia(null, "Ya cargo esta cuenta");
            } else {
                cmbCuentas.addItem(txtCuenta.getText());
                cmbCuentas.setSelectedItem(txtCuenta.getText());
            }

            txtCuenta.setText("");
        }
    }//GEN-LAST:event_btnAggClienteActionPerformed

    private void btnRemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemClienteActionPerformed
        cmbCuentas.removeItem(cmbCuentas.getSelectedItem());
    }//GEN-LAST:event_btnRemClienteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (metodos.msgPregunta(null, "¿Esta seguro?") == 0) {

            String sql = "where ";

            if (cmbAnho.getItemCount() > 0) {
                sql = sql + " (";
                for (int i = 0; i < cmbAnho.getItemCount(); i++) {
                    sql = sql + " anho = " + cmbAnho.getItemAt(i) + " OR";
                }
                sql = sql.substring(0, sql.length() - 2) + ") AND";
            }

            if (cmbNiveles2.getItemCount() > 0) {
                sql = sql + " (";

                for (int i = 0; i < cmbNiveles2.getItemCount(); i++) {
                    sql = sql + " nivel = " + cmbNiveles2.getItemAt(i) + " OR";
                }
                sql = sql.substring(0, sql.length() - 2) + ") AND";
            }

            if (cmbCuentas.getItemCount() > 0) {
                sql = sql + " (";
                for (int i = 0; i < cmbCuentas.getItemCount(); i++) {
                    sql = sql + " codigo ='" + cmbCuentas.getItemAt(i) + "' OR";
                }
                sql = sql.substring(0, sql.length() - 2) + ") AND";
            }

            if (!sql.equals("where ")) {
                sql = sql.substring(0, sql.length() - 3);
            } else {
                sql = "";
            }

            Logs.log("Consulta Rep Ventas : " + sql);

            String tipo = "";
            if (chkExcel.isSelected()) {
                instancias.setRutaAguardar(metodos.obtenerRuta(null, "Reporte de cuentas " + metodosGenerales.dia() + " de " + metodosGenerales.mesEnPalabra() + " del " + metodosGenerales.anho()));
                tipo = "xls";
            }

            instancias.getReporte().ver_RepCuentas(sql, tipo);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnRemProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemProd1ActionPerformed
        if (cmbNiveles2.getItemCount() == 0) {
            metodos.msgError(null, "Ningún tipo seleccionado");
            return;
        }
        cmbNiveles2.removeItem(cmbNiveles2.getSelectedItem());
    }//GEN-LAST:event_btnRemProd1ActionPerformed

    private void btnAggProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggProd1ActionPerformed
        cmbNiveles2.removeAllItems();
        cmbNiveles2.addItem(cmbNiveles.getSelectedItem());
    }//GEN-LAST:event_btnAggProd1ActionPerformed

    private void txtAnhoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnhoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnhoKeyPressed

    private void txtAnhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnhoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAggAnhoActionPerformed(null);
        }
    }//GEN-LAST:event_txtAnhoKeyReleased

    private void btnAggAnhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggAnhoActionPerformed
        if (txtAnho.getText().equals("")) {
            metodos.msgError(null, "Cargue primero un año");
        } else {
            if (yaEsta(cmbAnho, txtAnho.getText())) {
                metodos.msgAdvertencia(null, "Ya cargo este año");
            } else {
                cmbAnho.addItem(txtAnho.getText());
                cmbAnho.setSelectedItem(txtAnho.getText());
            }

            txtAnho.setText("");
        }
    }//GEN-LAST:event_btnAggAnhoActionPerformed

    private void btnRemAnhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemAnhoActionPerformed
        cmbAnho.removeItem(cmbAnho.getSelectedItem());
    }//GEN-LAST:event_btnRemAnhoActionPerformed

    public void cargarRegistro(String nit) {
//        Object[] datos = instancias.getSql().getDatosRegistro(nit);

        if (nit.equals("")) {
            ventanaRegistros(nit);
        } else {
            btnAggClienteActionPerformed(null);
        }

//        if (datos[0] != null) {
//            txtCuenta.setText(nit);
//            return;
//        }
//     
    }

    public void ventanaRegistros(String nit) {
        buscCuentas buscar = new buscCuentas(instancias.getMenu(), false, false, "", 0, "");
        buscar.setLocationRelativeTo(null);
        instancias.setBuscCuentas(buscar);
        instancias.setCampoActual(txtCuenta);
        txtCuenta.requestFocus();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAggAnho;
    private javax.swing.JButton btnAggCliente;
    private javax.swing.JButton btnAggProd1;
    private javax.swing.JRadioButton btnImpresa;
    private javax.swing.JButton btnRemAnho;
    private javax.swing.JButton btnRemCliente;
    private javax.swing.JButton btnRemProd1;
    private javax.swing.JRadioButton chkExcel;
    private javax.swing.JComboBox cmbAnho;
    private javax.swing.JComboBox cmbCuentas;
    private javax.swing.JComboBox cmbNiveles;
    private javax.swing.JComboBox cmbNiveles2;
    private javax.swing.ButtonGroup grupoTipo;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbNit1;
    private javax.swing.JLabel lbNit11;
    private javax.swing.JLabel lbNit17;
    private javax.swing.JLabel lbNit2;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTextField txtAnho;
    private javax.swing.JTextField txtCuenta;
    // End of variables declaration//GEN-END:variables
}
