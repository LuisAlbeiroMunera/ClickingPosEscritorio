package formularios;

import clases.Instancias;
import clases.metodosGenerales;
import clases.ndMaestra;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class dlgVersiones extends javax.swing.JDialog {

    private metodosGenerales metodos;
    private Instancias instancias;
    private ndMaestra nodo;

    public dlgVersiones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        metodos = new metodosGenerales();
        instancias = Instancias.getInstancias();

        tblVersiones.getColumnModel().getColumn(2).setCellRenderer(new WordWrapCellRenderer());
        tblVersiones.getColumnModel().getColumn(1).setCellRenderer(new WordWrapCellRenderer());
        
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

    static class WordWrapCellRenderer extends JTextArea implements TableCellRenderer {
        WordWrapCellRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText(value.toString());
            setSize(table.getColumnModel().getColumn(column).getWidth(), 31);

            if (table.getRowHeight(row) != getPreferredSize().height) {
                table.setRowHeight(row, getPreferredSize().height);
            }

            if (isSelected) {
                setForeground(new Color(0, 0, 0));
                setBackground(table.getSelectionBackground());
                Font font = new Font("Century Gothic", Font.PLAIN, 20);
                setFont(font);
            } else {
                setForeground(new Color(0, 0, 0));
                setBackground(table.getBackground());
                Font font = new Font("Century Gothic", Font.PLAIN, 20);
                setFont(font);
            }
            return this;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoResolucion = new javax.swing.ButtonGroup();
        grupoPrefijo = new javax.swing.ButtonGroup();
        pnlFormulario = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cmbVersion = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVersiones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Historial de cambios...");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setText("Versiones:");

        cmbVersion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbVersion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "2.2.2" }));
        cmbVersion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVersionItemStateChanged(evt);
            }
        });

        tblVersiones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblVersiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Módulo", "", "Detalle"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVersiones.setRowHeight(25);
        tblVersiones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblVersiones);
        if (tblVersiones.getColumnModel().getColumnCount() > 0) {
            tblVersiones.getColumnModel().getColumn(0).setMinWidth(80);
            tblVersiones.getColumnModel().getColumn(0).setPreferredWidth(120);
            tblVersiones.getColumnModel().getColumn(0).setMaxWidth(150);
            tblVersiones.getColumnModel().getColumn(1).setMinWidth(250);
            tblVersiones.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblVersiones.getColumnModel().getColumn(1).setMaxWidth(400);
        }

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(cmbVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbVersion))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFormulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbVersionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVersionItemStateChanged
        String version = cmbVersion.getSelectedItem().toString();

        DefaultTableModel modelo = (DefaultTableModel) tblVersiones.getModel();
        while (tblVersiones.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        Object[][] historial = instancias.getSql().getHistorialVersiones(version);
        for (Object[] historial1 : historial) {
            modelo.addRow(historial1);
        }
    }//GEN-LAST:event_cmbVersionItemStateChanged

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
            java.util.logging.Logger.getLogger(dlgVersiones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgVersiones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgVersiones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgVersiones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgVersiones dialog = new dlgVersiones(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cmbVersion;
    private javax.swing.ButtonGroup grupoPrefijo;
    private javax.swing.ButtonGroup grupoResolucion;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JTable tblVersiones;
    // End of variables declaration//GEN-END:variables
}
