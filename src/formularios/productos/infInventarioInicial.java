package formularios.productos;

import clases.Instancias;
import clases.SQL;
import clases.big;
import clases.metodosGenerales;
import clases.productos.ndCompra;
import clases.productos.ndIngreso;
import clases.productos.ndInventarioInicial;
import clases.productos.ndProducto;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;
import logs.Logs;

public class infInventarioInicial extends javax.swing.JInternalFrame {

    String simbolo = "";
    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    DecimalFormat df = new DecimalFormat("#.00");
    DefaultTableModel modeloPro1;

    public infInventarioInicial() {
        initComponents();

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        modeloPro1 = (DefaultTableModel) tblDetalle.getModel();
        instancias = Instancias.getInstancias();
        pnlInvisible.setVisible(false);
        simbolo = instancias.getSimbolo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoInventarios = new javax.swing.ButtonGroup();
        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        pnlProducto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalConteo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTotalIngreso = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtConteo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtConteo2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtConteo3 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        btnBusProd = new javax.swing.JButton();
        pnlInvisible = new javax.swing.JPanel();
        txtProducto1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        pnlProducto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setText("Codigo:");
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel2KeyReleased(evt);
            }
        });

        txtProducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtProducto.setName("Codigo"); // NOI18N
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductoKeyReleased(evt);
            }
        });

        txtDescripcion.setEditable(false);
        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setText("Costo unidad:");

        txtCosto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCosto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCostoKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setText("Cantidad Total:");

        txtTotalConteo.setEditable(false);
        txtTotalConteo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel13.setText("Total costo:");

        txtTotalIngreso.setEditable(false);
        txtTotalIngreso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conteos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setText("# 1");

        txtConteo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtConteo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConteo1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtConteo1.setName("Conteo 1"); // NOI18N
        txtConteo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConteo1MouseClicked(evt);
            }
        });
        txtConteo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConteo1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConteo1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setText("# 2:");

        txtConteo2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtConteo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConteo2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtConteo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConteo2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConteo2KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setText("# 3:");

        txtConteo3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtConteo3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConteo3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtConteo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConteo3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConteo3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(txtConteo1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtConteo2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConteo3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConteo2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtConteo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtConteo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel16.setText("Descripción:");
        jLabel16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel16KeyReleased(evt);
            }
        });

        btnBusProd.setBackground(new java.awt.Color(204, 204, 204));
        btnBusProd.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBusProd.setForeground(new java.awt.Color(255, 255, 255));
        btnBusProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        btnBusProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBusProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBusProd.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBusProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProductoLayout = new javax.swing.GroupLayout(pnlProducto);
        pnlProducto.setLayout(pnlProductoLayout);
        pnlProductoLayout.setHorizontalGroup(
            pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(pnlProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProductoLayout.createSequentialGroup()
                        .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalConteo)
                            .addComponent(txtTotalIngreso)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlProductoLayout.createSequentialGroup()
                        .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion)
                            .addGroup(pnlProductoLayout.createSequentialGroup()
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBusProd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlProductoLayout.setVerticalGroup(
            pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBusProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addComponent(txtProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addGap(3, 3, 3)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotalConteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        txtProducto.getAccessibleContext().setAccessibleName("");

        txtProducto1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtProducto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProducto1.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtProducto1.setEnabled(false);
        txtProducto1.setName("Codigo"); // NOI18N
        txtProducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProducto1KeyReleased(evt);
            }
        });

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Imei", "Lote", "F.Vence", "Temp", "cant", "descripcion", "color", "talla"
            }
        ));
        jScrollPane4.setViewportView(tblDetalle);

        javax.swing.GroupLayout pnlInvisibleLayout = new javax.swing.GroupLayout(pnlInvisible);
        pnlInvisible.setLayout(pnlInvisibleLayout);
        pnlInvisibleLayout.setHorizontalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInvisibleLayout.createSequentialGroup()
                        .addComponent(txtProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        pnlInvisibleLayout.setVerticalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtProducto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR  ");
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

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR  ");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpiar.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInvisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
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

    public void bloquearConteo(boolean x) {
        txtProducto.setEditable(!x);
        txtConteo1.setEditable(!x);
        txtConteo2.setEditable(!x);
        txtConteo3.setEditable(!x);
        txtCosto.setEditable(!x);
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Object[] campos = {txtProducto, txtConteo1};
        String faltantes = metodos.camposVacios(campos);
        String cantidad;

        if (!faltantes.equals("")) {
            metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
            return;
        }

        BigDecimal totalIngreso = big.getMoneda(txtTotalIngreso.getText());

        ndIngreso nodoIngreso = null;

        try {
            nodoIngreso = instancias.getSql().getDatosIngreso("ING-0");
        } catch (Exception e) {
            Logs.error(e);
        }

        if (nodoIngreso == null) {
            Object[] vector = {"ING-0", null, metodos.fechaConsulta(metodosGenerales.fecha()), metodos.fechaConsulta(metodosGenerales.fecha()), totalIngreso, 0,
                0, totalIngreso, "INVENTARIO INICIAL", " ", false, "", instancias.getUsuario(), instancias.getTerminal(),
                0, 0, 0, "", metodosGenerales.hora(), big.getMoneda("0"), "PENDIENTE",
                big.getMoneda("0"), big.getMoneda("0"), big.getMoneda("0"), big.getMoneda("0"), big.getMoneda("0"),
                big.getMoneda("0"), "", ""};

            ndIngreso nodo = metodos.llenarIngreso(vector);

            if (!instancias.getSql().agregarIngreso(nodo)) {
                metodos.msgError(null, "Hubo un problema al guardar el registro");
                return;
            }
        }

        cantidad = txtTotalConteo.getText();

        Object[] vector = {txtProducto1.getText(), txtCosto.getText(), txtConteo1.getText(), txtConteo2.getText(), txtConteo3.getText(),
            txtTotalConteo.getText(), "", "", "", "", ""
        };

        ndInventarioInicial nodo = metodos.llenarInventarioInicial(vector);
        if (!instancias.getSql().agregarInventarioInicial(nodo)) {
            metodos.msgError(this, "Hubo un problema al agregar el producto");
            return;
        }

        //PROCESO GUARDAR COMPRA
        Object vectCompra[] = {"ING-0", txtProducto1.getText(), big.getMoneda(txtCosto.getText()), cantidad, "0", totalIngreso, "0", totalIngreso, "0",
            txtDescripcion.getText(), "1" + "", cantidad, big.getMoneda(txtCosto.getText()), "", big.getMoneda("0"), "0",instancias.getUsuario()};

        ndCompra nodoComp = metodos.llenarCompra(vectCompra);
        if (!instancias.getSql().agregarCompra(nodoComp)) {
            metodos.msgError(null, "Hubo un problema al guardar la compra");
            return;
        }

        metodos.msgExito(this, "Inventario agregado con éxito");

        ndProducto producto = instancias.getSql().getDatosProducto(txtProducto.getText(), "bdProductos");
        double inventario;
        double cantidad1;
        double fisicoInventario;

        try {
            inventario = Double.parseDouble(producto.getInventario().replace(",", "."));
        } catch (Exception e) {
            inventario = 0;
        }

        double inv2 = inventario;

        try {
            cantidad1 = Double.parseDouble(producto.getInventarioInicial().replace(",", "."));
        } catch (Exception e) {
            cantidad1 = 0;
        }

        try {
            fisicoInventario = Double.parseDouble(producto.getFisicoInventario().replace(",", "."));
        } catch (Exception e) {
            fisicoInventario = Double.parseDouble(producto.getCompras().replace(",", "."));
        }

        double cantidadProd;
        try {
            cantidadProd = Double.parseDouble(txtTotalConteo.getText());
        } catch (Exception e) {
            cantidadProd = Double.parseDouble(txtTotalConteo.getText().substring(0, txtTotalConteo.getText().length() - 2));
        }

        inventario = inventario + cantidadProd;
        fisicoInventario = fisicoInventario + cantidadProd;
        double total = cantidad1 + cantidadProd;

        String total1 = String.valueOf(total).replace(".", ",");
        String inventario1 = String.valueOf(inventario).replace(".", ",");
        String fisicoInventario1 = String.valueOf(fisicoInventario).replace(".", ",");

        instancias.getSql().modificarInventario("inventarioInicial", total1, txtProducto1.getText(), "bdProductos");
        instancias.getSql().modificarInventario("inventario", inventario1, txtProducto1.getText(), "bdProductos");
        instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, txtProducto1.getText(), "bdProductos");

        Object[] ultimoPonderado = instancias.getSql().getUltimoPonderado(txtProducto1.getText());

        double inv = big.formatDouble(producto.getInventario().replace(",", "."));
        double ponderadoViejo = big.formatDouble(ultimoPonderado[4].toString());
        double totalViejo = big.formatDouble(inv*ponderadoViejo);
        double nuevoPrecio = big.getMonedaToDouble(txtTotalIngreso.getText());
        double cant = big.formatDouble(txtTotalConteo.getText());

        nuevoPrecio = big.formatDouble(nuevoPrecio/cant);
        double totalNuevo = big.formatDouble(cantidadProd*nuevoPrecio);
        double nuevoPonderado = totalNuevo + totalViejo;
        nuevoPonderado = big.formatDouble(nuevoPonderado/inventario);

        if (!instancias.getSql().agregarPonderado(metodos.fechaConsulta(metodosGenerales.fechaHora()), producto.getIdSistema(),
                big.getBigDecimal(ultimoPonderado[4].toString().replace(",", ".")), String.valueOf(inv2), txtTotalConteo.getText(),
                big.getBigDecimal(nuevoPonderado), String.valueOf(inventario), instancias.getUsuario(), big.getBigDecimal(nuevoPrecio), "INV. INICIAL")) {
            metodos.msgError(null, "Hubo un problema al guardar el ponderado");
        }

        if (!instancias.getSql().modificarPonderado(metodos.fechaConsulta(metodosGenerales.fechaHora()), producto.getIdSistema(),
                big.getBigDecimal(ultimoPonderado[4].toString()), String.valueOf(inv2), txtTotalConteo.getText(),
                big.getBigDecimal(nuevoPonderado), String.valueOf(inventario), instancias.getUsuario(), big.getBigDecimal(nuevoPrecio), "INV. INICIAL")) {
            metodos.msgError(null, "Hubo un problema al guardar el ponderado");
        }

        for (int i = 0; i < tblDetalle.getRowCount(); i++) {
            String cant1 = tblDetalle.getValueAt(i, 5).toString();

            if (cant1.equals("")) {
                cant1 = "1.0";
            }

            String fecha = tblDetalle.getValueAt(i, 3).toString();
            if (fecha.equals("")) {
                fecha = metodosGenerales.fecha();
            }

            String conse = instancias.getSql().getNumConsecutivo("DETALLEPROD")[0].toString();
            if (!instancias.getSql().agregarDetalladoProducto(conse, tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(),
                    cant1, tblDetalle.getValueAt(i, 1).toString(), tblDetalle.getValueAt(i, 2).toString(),
                    metodos.fechaConsulta(fecha), tblDetalle.getValueAt(i, 4).toString(), "DISPONIBLE", "INV. INICIAL",
                    metodos.fechaConsulta(metodosGenerales.fecha()), metodosGenerales.hora(), instancias.getUsuario(), tblDetalle.getValueAt(i, 7).toString(),
                    tblDetalle.getValueAt(i, 8).toString(), "123-22")) {
                metodos.msgError(null, "Hubo un problema al guardar el detalle del producto");
                return;
            }

//            if (!instancias.getSql().aumentarConsecutivo("DETALLEPROD", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("DETALLEPROD")[0]) + 1)) {
//                metodos.msgError(null, "Hubo un problema al guardar en el consecutivo del detalle del producto");
//            }
        }

        btnLimpiarActionPerformed(evt);

        if (nodoIngreso != null) {
            String totalValorIngreso = instancias.getSql().sumaTotalesIngreso0();
            System.out.println(" totalValorIngreso "+totalValorIngreso);
            totalIngreso = big.getBigDecimal(totalValorIngreso);
            
            System.out.println(" totalIngreso "+totalIngreso.toString());

            Object[] vectorIngreso = {"ING-0", null, nodoIngreso.getFechaFactura(), nodoIngreso.getFechaVencimiento(), totalIngreso, 0,
                0, totalIngreso, "INVENTARIO INICIAL", " ", false, "", nodoIngreso.getUsuario(), nodoIngreso.getTerminal(),
                0, 0, 0, "", metodosGenerales.hora(), big.getMoneda("0"), "PENDIENTE", big.getMoneda("0"), big.getMoneda("0"),
                big.getMoneda("0"), big.getMoneda("0"), big.getMoneda("0"), big.getMoneda("0"), "", ""};
            
            nodoIngreso = metodos.llenarIngreso(vectorIngreso);

            if (!instancias.getSql().modificarIngreso(nodoIngreso)) {
                metodos.msgError(null, "Hubo un problema al guardar el registro");
                return;
            }
        }

        btnLimpiarActionPerformed(evt);
        txtProducto.requestFocus();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_btnGuardarKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtProducto.setText("");
        txtProducto1.setText("");
        txtConteo1.setText("");
        txtConteo2.setText("");
        txtConteo3.setText("");
        txtCosto.setText(this.simbolo + " 0");
        txtTotalConteo.setText("");
        txtTotalIngreso.setText("");
        txtDescripcion.setText("");

        txtCosto.setEnabled(true);
        btnGuardar.setEnabled(true);
        txtConteo1.setEnabled(true);
        txtConteo2.setEnabled(true);
        txtConteo3.setEnabled(true);

        eliminarRegistros();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtConteo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConteo1KeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtConteo1KeyTyped

    private void txtConteo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConteo2KeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtConteo2KeyTyped

    private void txtConteo3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConteo3KeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtConteo3KeyTyped

    private void txtConteo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConteo1KeyReleased
        sumarConteo();
    }//GEN-LAST:event_txtConteo1KeyReleased

    private void txtConteo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConteo2KeyReleased
        sumarConteo();
    }//GEN-LAST:event_txtConteo2KeyReleased

    private void txtConteo3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConteo3KeyReleased
        sumarConteo();
    }//GEN-LAST:event_txtConteo3KeyReleased

    private void txtProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String codigo = txtProducto.getText().replace("'", "//");
            cargarProducto(codigo, 1);
        } else {
            txtDescripcion.setText("");
            txtProducto1.setText("");
            txtConteo1.setText("");
            txtConteo2.setText("");
            txtConteo3.setText("");
            txtCosto.setText(this.simbolo + " 0");
            txtConteo1.setEnabled(true);
            txtConteo2.setEnabled(true);
            txtConteo3.setEnabled(true);
            txtCosto.setEnabled(true);

            eliminarRegistros();
        }
    }//GEN-LAST:event_txtProductoKeyReleased

    private void jLabel2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtProducto.requestFocus();
        }
    }//GEN-LAST:event_jLabel2KeyReleased

    private void txtCostoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyReleased
        try {
            txtCosto.setText(big.setMoneda(big.getMoneda(txtCosto.getText())));
        } catch (Exception e) {
        }
        sumarConteo();
    }//GEN-LAST:event_txtCostoKeyReleased

    private void txtProducto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProducto1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProducto1KeyReleased

    private void jLabel16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel16KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16KeyReleased

    private void btnBusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProdActionPerformed
        ventanaProductos("");
    }//GEN-LAST:event_btnBusProdActionPerformed

    private void txtConteo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConteo1MouseClicked
        if (txtConteo1.isEnabled()) {
            ndProducto nodo = instancias.getSql().getDatosProducto(txtProducto1.getText(), "bdProductos");

            String tipo = "";
            try {
                if (nodo.getTipoProducto().equals("IMEI")) {
                    tipo = "Imei";
                } else if (nodo.getTipoProducto().equals("Fecha/Lote")) {
                    tipo = "Fecha/Lote";
                } else if (nodo.getTipoProducto().equals("Color")) {
                    tipo = "Color";
                } else if (nodo.getTipoProducto().equals("Serial")) {
                    tipo = "Serial";
                } else if (nodo.getTipoProducto().equals("Talla")) {
                    tipo = "Talla";
                } else if (nodo.getTipoProducto().equals("ColorTalla")) {
                    tipo = "ColorTalla";
                } else if (nodo.getTipoProducto().equals("SerialColor")) {
                    tipo = "SerialColor";
                } else {
                    tipo = "";
                }
            } catch (Exception e) {
                Logs.error(e);
            }

            Object[][] productos = new Object[tblDetalle.getRowCount()][7];

            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                productos[i][0] = tblDetalle.getValueAt(i, 1);
                productos[i][1] = tblDetalle.getValueAt(i, 2);
                productos[i][2] = tblDetalle.getValueAt(i, 3);
                productos[i][3] = tblDetalle.getValueAt(i, 4);
                productos[i][4] = tblDetalle.getValueAt(i, 5);
                productos[i][5] = tblDetalle.getValueAt(i, 7);
                productos[i][6] = tblDetalle.getValueAt(i, 8);
            }

            if (!tipo.equals("")) {
                dlgCompraDetallada1 compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), productos, "Entrada", "invInicial", "bdProductos", "123-22");
                compraDetallada.setLocationRelativeTo(null);
                compraDetallada.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtConteo1MouseClicked

    public void cargarProducto(String codigo, int plu) {
        ndProducto nodo = null;

        String CodigoProd = "";
        if (codigo.equals("")) {
            CodigoProd = "";
        } else {
            Object[][] listado = instancias.getSql().getCodigosRelacionados(codigo, " where codigo");
            if (listado.length > 0) {
                codigo = listado[0][0].toString();
            }

            nodo = instancias.getSql().getDatosProducto(codigo, "bdProductos");
            if (nodo.getIdSistema() != null) {
                CodigoProd = nodo.getIdSistema();
            }
        }

        String tipo = "";

        if (!CodigoProd.equals("")) {

            if (instancias.getSql().getProdActivo(nodo.getIdSistema())) {
                metodos.msgError(null, "Este producto esta inactivo");
                jLabel4.requestFocus();
                return;
            }

            ndInventarioInicial nodoInventario = instancias.getSql().getDatosInventarioInicial(nodo.getIdSistema());

            if (nodoInventario.getProducto() != null) {
                btnGuardar.setEnabled(false);
                txtConteo1.setEnabled(false);
                txtConteo2.setEnabled(false);
                txtConteo3.setEnabled(false);
                txtCosto.setEnabled(false);

                txtConteo1.setText(nodoInventario.getConteo1());
                txtConteo2.setText(nodoInventario.getConteo2());
                txtConteo3.setText(nodoInventario.getConteo3());
            } else {
                txtConteo1.setText("");
                txtConteo2.setText("");
                txtConteo3.setText("");

                btnGuardar.setEnabled(true);
                txtConteo1.setEnabled(true);
                txtConteo2.setEnabled(true);
                txtConteo3.setEnabled(true);
                txtCosto.setEnabled(true);

                if (nodo.getTipoProducto() != null) {
                    if (nodo.getTipoProducto().equals("IMEI")) {
                        tipo = "Imei";
                    } else if (nodo.getTipoProducto().equals("Fecha/Lote")) {
                        tipo = "Fecha/Lote";
                    } else if (nodo.getTipoProducto().equals("Color")) {
                        tipo = "Color";
                    } else if (nodo.getTipoProducto().equals("Serial")) {
                        tipo = "Serial";
                    } else if (nodo.getTipoProducto().equals("Talla")) {
                        tipo = "Talla";
                    } else if (nodo.getTipoProducto().equals("ColorTalla")) {
                        tipo = "ColorTalla";
                    } else if (nodo.getTipoProducto().equals("SerialColor")) {
                        tipo = "SerialColor";
                    } else {
                        tipo = "";
                    }
                }

                if (!tipo.equals("")) {
                    txtConteo2.setEnabled(false);
                    txtConteo3.setEnabled(false);
                }
            }

//                txtCosto.setText(nodoInventario.getCosto());
//                txtConteo1.setText(nodoInventario.getConteo1());
//                txtConteo2.setText(nodoInventario.getConteo2());
//                txtConteo3.setText(nodoInventario.getConteo3());
//                txtTotalConteo.setText(nodoInventario.getTotal());
//                txtAuditoria1.setText(nodoInventario.getAuditoria1());
//                txtAuditoria2.setText(nodoInventario.getAuditoria2());
//                txtTotalAuditoria.setText(nodoInventario.getTotalAuditoria());
//                sumarConteo();
//                sumarAuditoria();
//            } else {
            BigDecimal costo;

            try {
                costo = big.getBigDecimal(instancias.getSql().getUltimoPonderado(nodo.getIdSistema())[7].toString());
            } catch (Exception e) {
                Logs.error(e);
                costo = big.getBigDecimal(0);
            }

            txtCosto.setText(big.setMoneda(costo));
            txtDescripcion.setText(nodo.getDescripcion());
            txtProducto1.setText(nodo.getIdSistema());
            txtProducto.setText(nodo.getCodigo());

            sumarConteo();

            if (!tipo.equals("")) {
                dlgCompraDetallada1 compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), null, "Entrada", "invInicial", "bdProductos", "123-22");
                compraDetallada.setLocationRelativeTo(null);
                compraDetallada.setVisible(true);
            }

            return;
        }

        ventanaProductos(codigo);
    }

    public void eliminarRegistros() {
        while (tblDetalle.getRowCount() > 0) {
            modeloPro1.removeRow(0);
        }
    }

    public void cargarDetallado(String prod, String imei, String lote, String fechaVence, String temp,
            String cant, String nombre, String color, String talla) {
        modeloPro1.addRow(new Object[]{prod, imei, lote, fechaVence, temp, cant, nombre, color, talla});
    }

    public void ventanaProductos(String codigo) {
        buscProductos buscar = new buscProductos(null, true, false, "", "productos1");
        buscar.setLocationRelativeTo(null);
        instancias.setBusProductos(buscar);
        instancias.setCampoActual(txtProducto);
        txtProducto.requestFocus();
        buscar.noEncontrado(codigo.replace("'", "//"));
        buscar.show();
    }

    public void cargarProducto1(String cant) {
        txtConteo1.setText(cant);
        sumarConteo();
    }

    public void sumarConteo() {
        Double valor1 = 0.0, valor2 = 0.0, valor3 = 0.0, total = 0.0;

        if (!txtConteo1.getText().equals("")) {
            valor1 = Double.parseDouble(txtConteo1.getText().replace(",", "."));
        }

        if (!txtConteo2.getText().equals("")) {
            valor2 = Double.parseDouble(txtConteo2.getText().replace(",", "."));
        }

        if (!txtConteo3.getText().equals("")) {
            valor3 = Double.parseDouble(txtConteo3.getText().replace(",", "."));
        }

        total = valor1 + valor2 + valor3;
        txtTotalConteo.setText(String.valueOf(total));
        txtTotalIngreso.setText(big.setMoneda(big.getMoneda(txtCosto.getText()).multiply(big.getBigDecimal(total))));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusProd;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup grupoInventarios;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInvisible;
    private javax.swing.JPanel pnlProducto;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtConteo1;
    private javax.swing.JTextField txtConteo2;
    private javax.swing.JTextField txtConteo3;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProducto1;
    private javax.swing.JTextField txtTotalConteo;
    private javax.swing.JTextField txtTotalIngreso;
    // End of variables declaration//GEN-END:variables
}
