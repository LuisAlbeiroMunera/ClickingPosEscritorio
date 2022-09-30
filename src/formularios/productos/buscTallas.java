package formularios.productos;

import clases.Instancias;
import clases.metodosGenerales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.KeyStroke;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import logs.Logs;

public class buscTallas extends javax.swing.JDialog {

    DefaultTableModel modelo;
    TableRowSorter modeloOrdenado;
    Instancias instancias;
    metodosGenerales metodos = new metodosGenerales();

    public buscTallas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Tallas...");
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

        filtro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnEste1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        btnEste = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Antecedentes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnEste1.setBackground(new java.awt.Color(46, 204, 113));
        btnEste1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnEste1.setText("REGISTRAR");
        btnEste1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEste1ActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMouseClicked(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
        });

        tblRegistros.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"001", "Celular"},
                {"002", "Computador"},
                {"003", "CPU"},
                {"004", "Smartphone"}
            },
            new String [] {
                "Id", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistros.setRowHeight(24);
        tblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseClicked(evt);
            }
        });
        tblRegistros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblRegistrosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistros);
        if (tblRegistros.getColumnModel().getColumnCount() > 0) {
            tblRegistros.getColumnModel().getColumn(0).setMinWidth(50);
            tblRegistros.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblRegistros.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnEste.setBackground(new java.awt.Color(204, 204, 204));
        btnEste.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnEste.setText("SELECCIONAR");
        btnEste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEste1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnEste)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId)
                    .addComponent(btnEste1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEste, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        if ((evt.getKeyCode() == 40 || evt.getKeyCode() == 38)) {
            int aumento = -1;

            if (evt.getKeyCode() == 40) {
                aumento = 1;
            }

            int fila = tblRegistros.getSelectionModel().getMinSelectionIndex() + aumento;
            try {

                if (fila == tblRegistros.getRowCount() && aumento == 1) {
                    fila = 0;
                }

                tblRegistros.getSelectionModel().setSelectionInterval(fila, fila);
                tblRegistros.scrollRectToVisible(tblRegistros.getCellRect(tblRegistros.getSelectedRow(), 0, true));

            } catch (ArrayIndexOutOfBoundsException exp) {
                Logs.error(exp);
            }
            return;
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnEsteActionPerformed(null);
            return;
        }

        int i = 0;

        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + txtId.getText(), i));

        try {
            tblRegistros.getSelectionModel().setSelectionInterval(0, 0);
        } catch (ArrayIndexOutOfBoundsException exp) {
            Logs.error(exp);
        }
    }//GEN-LAST:event_txtIdKeyReleased

    private void tblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseClicked
        if (evt.getClickCount() > 1) {
            btnEsteActionPerformed(null);
        }
    }//GEN-LAST:event_tblRegistrosMouseClicked

    private void tblRegistrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblRegistrosKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tblRegistros.getRowCount() > 1) {
                tblRegistros.getSelectionModel().setSelectionInterval(tblRegistros.getSelectionModel().getMinSelectionIndex() - 1, tblRegistros.getSelectionModel().getMinSelectionIndex() - 1);
            }
            btnEsteActionPerformed(null);
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tblRegistros.scrollRectToVisible(tblRegistros.getCellRect(tblRegistros.getSelectedRow(), 0, true));
        }
    }//GEN-LAST:event_tblRegistrosKeyReleased

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMouseClicked

    private void btnEste1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEste1ActionPerformed
        if (txtId.getText().equals("")) {
            metodos.msgError(null, "Ingrese la talla");
            return;
        }

        String aux = instancias.getSql().getDatosTalla(txtId.getText().toUpperCase());

        if (aux == null) {
            if (metodos.msgPregunta(null, "¿Agregar la talla como " + txtId.getText().toUpperCase() + "? ") == 0) {

                if (!instancias.getSql().agregarTalla(txtId.getText().toUpperCase())) {
                    metodos.msgError(null, "Hubo un error al ingresar la talla");
                    return;
                }

                metodos.msgExito(null, "Talla ingresado con exito");
                this.setInstancia(instancias);
                noEncontrado(txtId.getText());
                btnEsteActionPerformed(evt);
            }
        } else {
            metodos.msgError(null, "La talla ya existe");
        }
    }//GEN-LAST:event_btnEste1ActionPerformed

    private void btnEsteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsteActionPerformed
        instancias.setValorCampo((String) tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 0));
        this.dispose();
        metodosGenerales.presionarEnter(instancias.getCampoActual());
    }//GEN-LAST:event_btnEsteActionPerformed

    public void setInstancia(Instancias instancia) {
        instancias = instancia;

        tblRegistros.setModel(instancias.getSql().getRegistrosTallas());
        modelo = (DefaultTableModel) tblRegistros.getModel();
        modeloOrdenado = new TableRowSorter<>(modelo);
        tblRegistros.setRowSorter(modeloOrdenado);

        txtId.requestFocus();

        try {
            tblRegistros.getSelectionModel().setSelectionInterval(0, 0);
        } catch (ArrayIndexOutOfBoundsException exp) {
            Logs.error(exp);
        }
    }

    public void noEncontrado(String codigo) {
        txtId.setText(codigo);
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + codigo, 0));
        try {
            tblRegistros.getSelectionModel().setSelectionInterval(0, 0);
        } catch (ArrayIndexOutOfBoundsException exp) {
            Logs.error(exp);
        }
    }

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
            java.util.logging.Logger.getLogger(buscTallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscTallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscTallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscTallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                buscTallas dialog = new buscTallas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEste;
    private javax.swing.JButton btnEste1;
    private javax.swing.ButtonGroup filtro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
