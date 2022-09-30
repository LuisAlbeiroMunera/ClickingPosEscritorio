package formularios.Contable;

import clases.Instancias;
import clases.metodosGenerales;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class infCentroCostos extends javax.swing.JInternalFrame {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    public infCentroCostos() {

        initComponents();
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        instancias = Instancias.getInstancias();

        Object[] centros = instancias.getSql().getCentroCostos();
        cmbCosto1.setSelectedItem(centros[0]);
        cmbCosto2.setSelectedItem(centros[1]);
        cmbCosto3.setSelectedItem(centros[2]);
        cmbCosto4.setSelectedItem(centros[3]);
        cmbCosto5.setSelectedItem(centros[4]);

        pnlFormulario.registerKeyboardAction(accion("guardar"), "guardar", KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    private ActionListener accion(final String opc) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        cmbCosto1 = new javax.swing.JComboBox();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbCosto2 = new javax.swing.JComboBox();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbCosto3 = new javax.swing.JComboBox();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbCosto4 = new javax.swing.JComboBox();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbCosto5 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Bodega Principal");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Relación Centro de Costo");

        cmbCosto1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbCosto1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sel", "# 1", "# 2", "# 3", "# 4", "# 5" }));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Bodega #1");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Relación Centro de Costo");

        cmbCosto2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbCosto2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sel", "# 1", "# 2", "# 3", "# 4", "# 5" }));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Bodega #2");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Relación Centro de Costo");

        cmbCosto3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbCosto3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sel", "# 1", "# 2", "# 3", "# 4", "# 5" }));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Bodega #3");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setText("Relación Centro de Costo");

        cmbCosto4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbCosto4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sel", "# 1", "# 2", "# 3", "# 4", "# 5" }));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setText("Bodega #4");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setText("Relación Centro de Costo");

        cmbCosto5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbCosto5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sel", "# 1", "# 2", "# 3", "# 4", "# 5" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(cmbCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(cmbCosto2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(cmbCosto3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(cmbCosto4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator8)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(cmbCosto5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbCosto1))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbCosto2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbCosto3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbCosto4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbCosto5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrFormulario)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Boolean uno = false, dos = false, tres = false, cuatro = false, cinco = false;

        if (cmbCosto1.getSelectedIndex() == 0) {
            metodos.msgAdvertencia(this, "Debe seleccionar el centro de costos de la bodega priciapl");
            return;
        } else {
            if (cmbCosto1.getSelectedIndex() == 1) {
                uno = true;
            } else if (cmbCosto1.getSelectedIndex() == 2) {
                dos = true;
            } else if (cmbCosto1.getSelectedIndex() == 3) {
                tres = true;
            } else if (cmbCosto1.getSelectedIndex() == 4) {
                cuatro = true;
            } else if (cmbCosto1.getSelectedIndex() == 5) {
                cinco = true;
            }
        }

        if (cmbCosto2.getSelectedIndex() == 0) {
            metodos.msgAdvertencia(this, "Debe seleccionar el centro de costos de la bodega # 1");
            return;
        } else {
            if (cmbCosto2.getSelectedIndex() == 1) {
                if (uno) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 1 esta repetido");
                    return;
                }
                uno = true;
            } else if (cmbCosto2.getSelectedIndex() == 2) {
                if (dos) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 2 esta repetido");
                    return;
                }
                dos = true;
            } else if (cmbCosto2.getSelectedIndex() == 3) {
                if (tres) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 3 esta repetido");
                    return;
                }
                tres = true;
            } else if (cmbCosto2.getSelectedIndex() == 4) {
                if (cuatro) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 4 esta repetido");
                    return;
                }
                cuatro = true;
            } else if (cmbCosto2.getSelectedIndex() == 5) {
                if (cinco) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 5 esta repetido");
                    return;
                }
                cinco = true;
            }
        }

        if (cmbCosto3.getSelectedIndex() == 0) {
            metodos.msgAdvertencia(this, "Debe seleccionar el centro de costos de la bodega # 2");
            return;
        } else {
            if (cmbCosto3.getSelectedIndex() == 1) {
                if (uno) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 1 esta repetido");
                    return;
                }
                uno = true;
            } else if (cmbCosto3.getSelectedIndex() == 2) {
                if (dos) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 2 esta repetido");
                    return;
                }
                dos = true;
            } else if (cmbCosto3.getSelectedIndex() == 3) {
                if (tres) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 3 esta repetido");
                    return;
                }
                tres = true;
            } else if (cmbCosto3.getSelectedIndex() == 4) {
                if (cuatro) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 4 esta repetido");
                    return;
                }
                cuatro = true;
            } else if (cmbCosto3.getSelectedIndex() == 5) {
                if (cinco) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 5 esta repetido");
                    return;
                }
                cinco = true;
            }
        }

        if (cmbCosto4.getSelectedIndex() == 0) {
            metodos.msgAdvertencia(this, "Debe seleccionar el centro de costos de la bodega # 3");
            return;
        } else {
            if (cmbCosto4.getSelectedIndex() == 1) {
                if (uno) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 1 esta repetido");
                    return;
                }
                uno = true;
            } else if (cmbCosto4.getSelectedIndex() == 2) {
                if (dos) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 2 esta repetido");
                    return;
                }
                dos = true;
            } else if (cmbCosto4.getSelectedIndex() == 3) {
                if (tres) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 3 esta repetido");
                    return;
                }
                tres = true;
            } else if (cmbCosto4.getSelectedIndex() == 4) {
                if (cuatro) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 4 esta repetido");
                    return;
                }
                cuatro = true;
            } else if (cmbCosto4.getSelectedIndex() == 5) {
                if (cinco) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 5 esta repetido");
                    return;
                }
                cinco = true;
            }
        }

        if (cmbCosto5.getSelectedIndex() == 0) {
            metodos.msgAdvertencia(this, "Debe seleccionar el centro de costos de la bodega # 4");
            return;
        } else {
            if (cmbCosto5.getSelectedIndex() == 1) {
                if (uno) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 1 esta repetido");
                    return;
                }
                uno = true;
            } else if (cmbCosto5.getSelectedIndex() == 2) {
                if (dos) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 2 esta repetido");
                    return;
                }
                dos = true;
            } else if (cmbCosto5.getSelectedIndex() == 3) {
                if (tres) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 3 esta repetido");
                    return;
                }
                tres = true;
            } else if (cmbCosto5.getSelectedIndex() == 4) {
                if (cuatro) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 4 esta repetido");
                    return;
                }
                cuatro = true;
            } else if (cmbCosto5.getSelectedIndex() == 5) {
                if (cinco) {
                    metodos.msgAdvertenciaAjustado(this, "El centro de costo 5 esta repetido");
                    return;
                }
                cinco = true;
            }
        }

        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {
            instancias.getSql().eliminarTodo("bdCentroCostos");

            if (!instancias.getSql().agregarCentroCostos(cmbCosto1.getSelectedItem().toString(), cmbCosto2.getSelectedItem().toString(),
                    cmbCosto3.getSelectedItem().toString(), cmbCosto4.getSelectedItem().toString(), cmbCosto5.getSelectedItem().toString())) {
                metodos.msgError(this, "Error al guardar");
                return;
            } else {
                metodos.msgExito(this, "Centro de costos registrados con éxito");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbCosto1;
    private javax.swing.JComboBox cmbCosto2;
    private javax.swing.JComboBox cmbCosto3;
    private javax.swing.JComboBox cmbCosto4;
    private javax.swing.JComboBox cmbCosto5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JScrollPane scrFormulario;
    // End of variables declaration//GEN-END:variables
}
