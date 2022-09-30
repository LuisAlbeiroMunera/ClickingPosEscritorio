package formularios.Ventas;

import clases.Instancias;
import clases.SQL;
import clases.big;
import clases.metodosGenerales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.KeyStroke;

//DESCUENTOS_CONTRACTUALES
//DESCUENTOS_PRONTO_PAGO
//ENVIO_GRATIS
//DESCUENTOS_ESPECIFICOS_INVENTARIOS
//DESCUENTO_MONTO_COMPRA
//DESCUENTO_TEMPORADA
//DESCUENTO_ACTUALIZACION_PRODUCTOS_SERVICIOS
//DESCUENTO_GENERAL
//DESCUENTO_VOLUMEN
//OTRO_DESCUENTO
public class dlgTipoDescuento extends javax.swing.JDialog {

    int numFila = 0;
    Instancias instancias;
    private metodosGenerales metodos;
    BigDecimal subtotal;
    String lugarForm = "";

    public dlgTipoDescuento(java.awt.Frame parent, boolean modal, String porcActual, String descActual, int fila,
            String descuentoSeleccionado, BigDecimal subtotal1, String lugar) {
        super(parent, modal);
        initComponents();

        btnQuitarDesc.setVisible(false);
        this.setLocationRelativeTo(null);
        metodos = new metodosGenerales();
        instancias = Instancias.getInstancias();

        txtPorc.setText(porcActual);
        txtPeso.setText(descActual);

        if (instancias.getDescuento().equals("peso")) {
            txtPorc.setEnabled(false);
        } else {
            txtPeso.setEnabled(false);
        }

        subtotal = subtotal1;
        numFila = fila;
        lugarForm = lugar;

        if (!descuentoSeleccionado.equals("Sin-Permiso")) {
            cmbDescuento.setSelectedItem(descuentoSeleccionado.split("///")[0]);
            txtRazonDescuento.setText(descuentoSeleccionado.split("///")[1]);
            btnQuitarDesc.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtPeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPorc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbDescuento = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRazonDescuento = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnQuitarDesc = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DESCUENTO AL PRODUCTO");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtPeso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Descuento en valor:");

        txtPorc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPorc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPorcKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Descuento en %:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Tipo descuento:");

        cmbDescuento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbDescuento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DESCUENTO_NO_CONDICIONADO" }));

        txtRazonDescuento.setColumns(20);
        txtRazonDescuento.setRows(5);
        jScrollPane1.setViewportView(txtRazonDescuento);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RAZÓN DEL DESCUENTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDescuento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbDescuento)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("ACEPTAR");
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

        btnQuitarDesc.setBackground(new java.awt.Color(241, 148, 138));
        btnQuitarDesc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnQuitarDesc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png"))); // NOI18N
        btnQuitarDesc.setText("QUITAR DESCUENTO");
        btnQuitarDesc.setToolTipText("Ctrl+G");
        btnQuitarDesc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnQuitarDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuitarDesc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnQuitarDesc.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnQuitarDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarDescActionPerformed(evt);
            }
        });
        btnQuitarDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnQuitarDescKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuitarDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitarDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        txtPorc.setText(txtPorc.getText().replace(",", "."));

        if (txtRazonDescuento.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Debe ingresar la razón del descuento");
            txtRazonDescuento.requestFocus();
            return;
        }

        if (txtRazonDescuento.getText().length() < 10) {
            metodos.msgAdvertenciaAjustado(null, "Debe ingresar una razón mas larga");
            txtRazonDescuento.requestFocus();
            return;
        }

        BigDecimal porcDescuento, totalDescuento = BigDecimal.ZERO;
        if (instancias.getDescuento().equals("peso")) {
            porcDescuento = big.getBigDecimal("0");
            totalDescuento = big.getMoneda(txtPeso.getText());
            porcDescuento = big.getBigDecimal(totalDescuento.multiply(big.getBigDecimal("100")).divide(subtotal, 2, RoundingMode.HALF_DOWN));
        } else {
            porcDescuento = big.getBigDecimal(txtPorc.getText());
        }

        if (porcDescuento.compareTo(big.getBigDecimal("100")) >= 0) {
            metodos.msgAdvertenciaAjustado(null, "Descuento no válido");
            return;
        }

        if (instancias.getDescuento().equals("peso")) {
            if (totalDescuento.compareTo(big.getBigDecimal("0")) <= 0) {
                metodos.msgAdvertenciaAjustado(null, "Ingrese el descuento");
                return;
            }
        } else {
            if (porcDescuento.compareTo(big.getBigDecimal("0")) <= 0) {
                metodos.msgAdvertenciaAjustado(null, "Ingrese el descuento");
                return;
            }
        }

        if (!instancias.getUsuario().equals("ADMIN")) {
            if (porcDescuento.compareTo(big.getBigDecimal(instancias.getDescuentoMaximoVentas())) > 0) {
                metodos.msgAdvertenciaAjustado(null, "El descuento máximo es " + instancias.getDescuentoMaximoVentas() + "%.");

                if (instancias.getDescuento().equals("peso")) {
                    txtPeso.requestFocus();
                } else {
                    txtPorc.requestFocus();
                }

                return;
            }
        }

        if (instancias.getDescuento().equals("peso")) {
            if (lugarForm.equals("facturacion")) {
                instancias.getFactura().cargarDescuento(numFila, null, txtPeso.getText(), cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("cotizacion")) {
                instancias.getCotiza().cargarDescuento(numFila, null, txtPeso.getText(), cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("orden")) {
                instancias.getOrdenServicio().cargarDescuento(numFila, null, txtPeso.getText(), cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("pedido")) {
                instancias.getPedido().cargarDescuento(numFila, null, txtPeso.getText(), cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("separe")) {
                instancias.getPlanSepare().cargarDescuento(numFila, null, txtPeso.getText(), cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("credito")) {
                instancias.getFacturaCreditos().cargarDescuento(numFila, null, txtPeso.getText(), cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("cuentaCobro")) {
                instancias.getCuentaCobro().cargarDescuento(numFila, null, txtPeso.getText(), cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("mesa")) {
                instancias.getMesa1().cargarDescuento(numFila, null, txtPeso.getText(), cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("notaDebito")) {
                instancias.getNd().cargarDescuento(numFila, null, txtPeso.getText(), cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            }
        } else {
            if (lugarForm.equals("facturacion")) {
                instancias.getFactura().cargarDescuento(numFila, txtPorc.getText().replace(".", ","), null, cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("cotizacion")) {
                instancias.getCotiza().cargarDescuento(numFila, txtPorc.getText().replace(".", ","), null, cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("orden")) {
                instancias.getOrdenServicio().cargarDescuento(numFila, txtPorc.getText().replace(".", ","), null, cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("pedido")) {
                instancias.getPedido().cargarDescuento(numFila, txtPorc.getText().replace(".", ","), null, cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("separe")) {
                instancias.getPlanSepare().cargarDescuento(numFila, txtPorc.getText().replace(".", ","), null, cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("credito")) {
                instancias.getFacturaCreditos().cargarDescuento(numFila, txtPorc.getText().replace(".", ","), null, cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("cuentaCobro")) {
                instancias.getCuentaCobro().cargarDescuento(numFila, txtPorc.getText().replace(".", ","), null, cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("mesa")) {
                instancias.getMesa1().cargarDescuento(numFila, txtPorc.getText().replace(".", ","), null, cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            } else if (lugarForm.equals("notaDebito")) {
                instancias.getNd().cargarDescuento(numFila, txtPorc.getText().replace(".", ","), null, cmbDescuento.getSelectedItem().toString() + "///" + txtRazonDescuento.getText());
            }
        }

        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_btnGuardarKeyReleased

    private void txtPorcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_txtPorcKeyReleased

    private void txtPorcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtPorcKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtPesoKeyTyped

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnQuitarDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarDescActionPerformed
        if (lugarForm.equals("facturacion")) {
            instancias.getFactura().cargarDescuento(numFila, "0", null, "Sin-Permiso");
        } else if (lugarForm.equals("cotizacion")) {
            instancias.getCotiza().cargarDescuento(numFila, "0", null, "Sin-Permiso");
        } else if (lugarForm.equals("orden")) {
            instancias.getOrdenServicio().cargarDescuento(numFila, "0", null, "Sin-Permiso");
        } else if (lugarForm.equals("pedido")) {
            instancias.getPedido().cargarDescuento(numFila, "0", null, "Sin-Permiso");
        } else if (lugarForm.equals("separe")) {
            instancias.getPlanSepare().cargarDescuento(numFila, "0", null, "Sin-Permiso");
        } else if (lugarForm.equals("credito")) {
            instancias.getFacturaCreditos().cargarDescuento(numFila, "0", null, "Sin-Permiso");
        } else if (lugarForm.equals("cuentaCobro")) {
            instancias.getCuentaCobro().cargarDescuento(numFila, "0", null, "Sin-Permiso");
        } else if (lugarForm.equals("mesa")) {
            instancias.getMesa1().cargarDescuento(numFila, "0", null, "Sin-Permiso");
        } else if (lugarForm.equals("notaDebito")) {
            instancias.getNd().cargarDescuento(numFila, "0", null, "Sin-Permiso");
        }

        this.dispose();
    }//GEN-LAST:event_btnQuitarDescActionPerformed

    private void btnQuitarDescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnQuitarDescKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitarDescKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnQuitarDesc;
    private javax.swing.JComboBox cmbDescuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPorc;
    private javax.swing.JTextArea txtRazonDescuento;
    // End of variables declaration//GEN-END:variables
}
