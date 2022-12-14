/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios.Ventas;
import logs.Logs;
import clases.Instancias;
import clases.metodosGenerales;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author .CLIK
 */
public class impresionComanda extends javax.swing.JDialog {

    /**
     * Creates new form nuevaComanda
     */
    private Instancias instancias;
    private Object[][] datos;
    private Object[] datosMaestra = null;
    private String vendedor;
    private String reimpresion="";
    metodosGenerales metodos = new metodosGenerales();

    public impresionComanda(java.awt.Frame parent, boolean modal, String observaciones, Object[] datosMaestro, String vend, String reimpresion) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        vendedor = vend;
        txtObservaciones.setText(observaciones);
        datosMaestra = datosMaestro;
        this.reimpresion = reimpresion;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lbNit1 = new javax.swing.JLabel();
        txtCongelada = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtNit.setEditable(false);
        txtNit.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        txtNit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNit.setText("Mesa. 5");
        txtNit.setBorder(null);
        txtNit.setName("CC/NIT"); // NOI18N
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });

        tblProductos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "De", "Plato", "Grupo", "Cant. Solicitada", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setRowHeight(22);
        tblProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(2).setMinWidth(50);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(2).setMaxWidth(50);
            tblProductos.getColumnModel().getColumn(3).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(3).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(4).setResizable(false);
        }

        lbNit1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbNit1.setText("CONGELADA No.");

        txtCongelada.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCongelada.setText("123");

        txtObservaciones.setEditable(false);
        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtObservaciones.setRows(3);
        jScrollPane2.setViewportView(txtObservaciones);

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setText("NO GENERAR");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setText("GENERAR COMANDA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNit)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNit1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCongelada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNit1)
                    .addComponent(txtCongelada))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased

    }//GEN-LAST:event_txtNitKeyReleased

    private void txtNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String congelada = "CONGELADA-" + txtCongelada.getText();

        String condicion = "where congelada = '" + congelada + "' AND (";
        boolean entro = false;
        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            if ((Boolean) tblProductos.getValueAt(i, 2) == true) {
                condicion = condicion + " consecutivo ='" + tblProductos.getValueAt(i, 3).toString() + "' OR";
                entro = true;
            }
        }
        if (entro) {
//            condicion = condicion.substring(0, condicion.length() - 2) + ") order by opciones";
              condicion = condicion.substring(0, condicion.length() - 2) + ") ";
        } else {
//            condicion = "where congelada ='" + congelada + "' order by opciones ";
              condicion = "where congelada ='" + congelada + "'  ";
        }

        generarImpresionComanda(condicion, txtObservaciones.getText(),
                txtCongelada.getText(), txtNit.getText().replace("MESA-", ""),
                (Boolean) datosMaestra[103], vendedor);

//        instancias.getReporte().ver_Comanda(condicion, txtObservaciones.getText(), txtCongelada.getText(),
//                txtNit.getText().replace("MESA-", ""), (Boolean) datosMaestra[103], impresoraComanda, vendedor);
        String copias = "";
        try {
            copias = datosMaestra[101].toString();
        } catch (Exception e) {
            Logs.error(e);
        }

        try {
            if (copias != null || !copias.equals("")) {
                for (int i = 0; i < Integer.parseInt(copias); i++) {

                    generarImpresionComanda(condicion, txtObservaciones.getText(),
                            txtCongelada.getText(), txtNit.getText().replace("MESA-", ""),
                            (Boolean) datosMaestra[103], vendedor);

                }
            }
        } catch (Exception e) {
            Logs.error(e);
        }

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void setInstancias(Instancias instancias, String congelada, Boolean estado, Object[][] prod) {
        this.instancias = instancias;
        txtCongelada.setText(congelada);

        Object[][] mat = instancias.getSql().getProductosVenta("CONGELADA-" + congelada);
          int i = 0;
        for (Object[] reg : mat) {
            txtNit.setText(reg[8].toString());
             double cantTotal = Double.parseDouble((String) reg[4]);
             double cantSolicitada = Double.parseDouble((String) reg[18]);
             estado = false;
                          
            ((DefaultTableModel) tblProductos.getModel()).addRow(new Object[]{reg[0], reg[2], estado, reg[9], reg[16], reg[18], reg[4].toString().replace(".", ",")});
            
            if(cantSolicitada > 0){
              tblProductos.setValueAt(true, i, 2);    
             }
            i++;
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
            java.util.logging.Logger.getLogger(impresionComanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(impresionComanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(impresionComanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(impresionComanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                impresionComanda dialog = new impresionComanda(new javax.swing.JFrame(), true, "", null, "", "");
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

    public void generarImpresionComanda(String condicionOrigen, String observaciones, String factura2, String var1,
            Boolean previsualizar, String vendedor) {

        String condicion = "";

        if ((Boolean) datosMaestra[100]) {

            //CREAMOS OBJETO PARA HACER CONTEO DE GRUPOS 
            Object[] grupos = new Object[tblProductos.getRowCount()];
            

            //HACEMOS CONTEO DE GRUPOS DE LOS PRODUCTOS DE FACTURA
            int ser = 0;
            if ((Boolean) datosMaestra[100]) {
                                
                for (int i = 0; i < tblProductos.getRowCount(); i++) {
                    String grupo ="";
                    
                    if(tblProductos.getValueAt(i, 4) != null){
                     grupo = tblProductos.getValueAt(i, 4).toString();
                    }else{
                     continue;
                    }
                    
                    Boolean entro = false;
                    for (int j = 0; j < grupos.length; j++) {
                        if (grupo.equals(grupos[j])) {
                            entro = true;
                        }
                    }

                    if (!entro) {
                        grupos[ser] = grupo;
                        ser++;
                    }
                }
            }

            for (int i = 0; i < ser; i++) {

                String impresoraGrupo = "Sin_impresora";
                Object[] datosGrupo;

                String grupoActual = grupos[i].toString();

                if (!grupoActual.equals("")) {
                    datosGrupo = instancias.getSql().getDatosGrupo(grupoActual);
                    impresoraGrupo = datosGrupo[5].toString();

                } else {
                    impresoraGrupo = "Sin_impresora";
                }
                Logs.log("Usando impresora " + impresoraGrupo);

                if ((Boolean) datosMaestra[50] && instancias.getConfiguraciones().isRestaurante()) {
                    if (grupoActual.equals("")) {
                        //condicion = condicionOrigen + " and Grupo is Null ";
                    } else {
                        //condicion = condicionOrigen + " and Grupo = '" + grupos[i] + "' ";
                    }
                }

                 Logs.log("Usando impresora condicionOrigen  " + condicionOrigen);
                Logs.log("Usando impresora condicion " + condicion);
                instancias.getReporte().ver_Comanda(condicionOrigen, observaciones, factura2, var1, previsualizar, impresoraGrupo, vendedor, this.reimpresion);

                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    Logs.error(e);
                }
            }
        } else {
            String impresoraComanda = "";
            try {
                impresoraComanda = datos[105].toString();
            } catch (Exception e) {
                Logs.error(e);
            }
            instancias.getReporte().ver_Comanda(condicionOrigen, observaciones, factura2, var1, previsualizar, impresoraComanda, vendedor, this.reimpresion);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbNit1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JLabel txtCongelada;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
