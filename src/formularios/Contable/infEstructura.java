package formularios.Contable;

import clases.Contable.ndEstructura;
import clases.Instancias;
import clases.big;
import clases.metodosGenerales;
import clases.terceros.ndTercero;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import logs.Logs;

public class infEstructura extends javax.swing.JInternalFrame {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    DefaultTableModel modelo;

    public infEstructura() {

        initComponents();

        modelo = (DefaultTableModel) tblNiveles.getModel();

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        instancias = Instancias.getInstancias();
        btnActualizar.setEnabled(false);
        btnGuardar.setEnabled(true);

        pnlFormulario.registerKeyboardAction(accion("guardar"), "guardar", KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("limpiar"), "limpiar", KeyStroke.getKeyStroke(KeyEvent.VK_L, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("terceros"), "terceros", KeyStroke.getKeyStroke(KeyEvent.VK_T, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
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
                    case "terceros":
                        if ((btnBuscTerceros.isEnabled()) && (btnBuscTerceros.isVisible())) {
                            btnBuscTercerosActionPerformed(null);
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
        jPanel5 = new javax.swing.JPanel();
        lbNit = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbRazon = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lbNit4 = new javax.swing.JLabel();
        txtNumNiveles = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNiveles = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscTerceros = new javax.swing.JButton();
        lbInfoObligatorios = new javax.swing.JLabel();
        txtIdEstructura = new javax.swing.JTextField();

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("Año: *");
        lbNit.setName(""); // NOI18N
        lbNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNitKeyReleased(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setName("Codigo"); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        lbRazon.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbRazon.setText("Descripción: *");

        txtDescripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDescripcion.setName("Descripción"); // NOI18N
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });

        lbNit4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit4.setText("# Niveles: *");
        lbNit4.setName(""); // NOI18N
        lbNit4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNit4KeyReleased(evt);
            }
        });

        txtNumNiveles.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNumNiveles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumNiveles.setName("# Niveles"); // NOI18N
        txtNumNiveles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumNivelesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumNivelesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lbRazon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lbNit4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNit4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescripcion)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbRazon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNumNiveles))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblNiveles.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblNiveles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Niveles", "Longitud"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNiveles.setRowHeight(25);
        jScrollPane1.setViewportView(tblNiveles);
        if (tblNiveles.getColumnModel().getColumnCount() > 0) {
            tblNiveles.getColumnModel().getColumn(1).setMinWidth(70);
            tblNiveles.getColumnModel().getColumn(1).setPreferredWidth(70);
            tblNiveles.getColumnModel().getColumn(1).setMaxWidth(70);
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

        btnBuscTerceros.setBackground(new java.awt.Color(247, 220, 111));
        btnBuscTerceros.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnBuscTerceros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        btnBuscTerceros.setText("LISTADO");
        btnBuscTerceros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTercerosActionPerformed(evt);
            }
        });

        lbInfoObligatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfoObligatorios.setText("Los campos marcados (*) son obligatorios.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInfoObligatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBuscTerceros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnBuscTerceros))
                .addGap(10, 10, 10)
                .addComponent(lbInfoObligatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        txtIdEstructura.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIdEstructura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdEstructura.setName("Codigo"); // NOI18N
        txtIdEstructura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdEstructuraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdEstructuraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdEstructura, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtNumNiveles.setText("");
        txtDescripcion.setText("");
        txtCodigo.setText("");

        while (tblNiveles.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        btnBuscTerceros.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Object[] campos = {txtCodigo, txtDescripcion, txtNumNiveles};
        String faltantes = metodos.camposVacios(campos);

        if (!faltantes.equals("")) {
            metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
            return;
        }

        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {

            int longitud1 = 0, longitud2 = 0, longitud3 = 0, longitud4 = 0, longitud5 = 0, longitud6 = 0, longitud7 = 0;
            if (tblNiveles.getRowCount() > 1) {
                try {
                    longitud1 = Integer.parseInt(tblNiveles.getValueAt(0, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 1");
                    return;
                }
            } else {
                metodos.msgAdvertenciaAjustado(this, "Debe cargar los niveles");
            }

            if (tblNiveles.getRowCount() >= 2) {
                try {
                    longitud2 = Integer.parseInt(tblNiveles.getValueAt(1, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 2");
                    return;
                }
            }

            if (tblNiveles.getRowCount() >= 3) {
                try {
                    longitud3 = Integer.parseInt(tblNiveles.getValueAt(2, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 3");
                    return;
                }
            }

            if (tblNiveles.getRowCount() >= 4) {
                try {
                    longitud4 = Integer.parseInt(tblNiveles.getValueAt(3, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 4");
                    return;
                }
            }

            if (tblNiveles.getRowCount() >= 5) {
                try {
                    longitud5 = Integer.parseInt(tblNiveles.getValueAt(4, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 5");
                    return;
                }
            }

            if (tblNiveles.getRowCount() >= 6) {
                try {
                    longitud6 = Integer.parseInt(tblNiveles.getValueAt(5, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 6");
                    return;
                }
            }

            if (tblNiveles.getRowCount() >= 7) {
                try {
                    longitud7 = Integer.parseInt(tblNiveles.getValueAt(6, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 7");
                    return;
                }
            }

            Object[] vector = {txtIdEstructura.getText(), txtCodigo.getText(), txtDescripcion.getText(), txtNumNiveles.getText(),
                longitud1, longitud2, longitud3, longitud4, longitud5, longitud6, longitud7, false
            };

            ndEstructura nodo = metodos.llenarEstructura(vector);
            if (!instancias.getSql().modificarEstructura(nodo)) {
                metodos.msgError(this, "Error al modificar la estructura");
                return;
            } else {
                metodos.msgExito(this, "Estructura modificada con éxito");
            }

            btnNuevoActionPerformed(evt);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Object[] campos = {txtCodigo, txtDescripcion, txtNumNiveles};
        String faltantes = metodos.camposVacios(campos);

        if (!faltantes.equals("")) {
            metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
            return;
        }

        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {

            String id = instancias.getSql().estructuraExistente(txtCodigo.getText());

            if (!id.equals("")) {
                metodos.msgAdvertenciaAjustado(this, "Ya existe estructura para este año");
                return;
            }

            int longitud1 = 0, longitud2 = 0, longitud3 = 0, longitud4 = 0, longitud5 = 0, longitud6 = 0, longitud7 = 0;
            if (tblNiveles.getRowCount() > 1) {
                try {
                    longitud1 = Integer.parseInt(tblNiveles.getValueAt(0, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 1");
                    return;
                }
            } else {
                metodos.msgAdvertenciaAjustado(this, "Debe cargar los niveles");
            }

            if (tblNiveles.getRowCount() >= 2) {
                try {
                    longitud2 = Integer.parseInt(tblNiveles.getValueAt(1, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 2");
                    return;
                }
            }

            if (tblNiveles.getRowCount() >= 3) {
                try {
                    longitud3 = Integer.parseInt(tblNiveles.getValueAt(2, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 3");
                    return;
                }
            }

            if (tblNiveles.getRowCount() >= 4) {
                try {
                    longitud4 = Integer.parseInt(tblNiveles.getValueAt(3, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 4");
                    return;
                }
            }

            if (tblNiveles.getRowCount() >= 5) {
                try {
                    longitud5 = Integer.parseInt(tblNiveles.getValueAt(4, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 5");
                    return;
                }
            }

            if (tblNiveles.getRowCount() >= 6) {
                try {
                    longitud6 = Integer.parseInt(tblNiveles.getValueAt(5, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 6");
                    return;
                }
            }

            if (tblNiveles.getRowCount() >= 7) {
                try {
                    longitud7 = Integer.parseInt(tblNiveles.getValueAt(6, 1).toString());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Número no valido en longitud 7");
                    return;
                }
            }

            String idEstructura = "ESTRUC-" + instancias.getSql().getNumConsecutivo("ESTRUC")[0].toString();

            Object[] vector = {idEstructura, txtCodigo.getText(), txtDescripcion.getText(), txtNumNiveles.getText(),
                longitud1, longitud2, longitud3, longitud4, longitud5, longitud6, longitud7, false
            };

            ndEstructura nodo = metodos.llenarEstructura(vector);

            if (!instancias.getSql().agregarEstructura(nodo)) {
                metodos.msgError(this, "Error al guardar la estructura");
                return;
            } else {
                metodos.msgExito(this, "Estructura registrado con éxito");
            }

//            instancias.getSql().aumentarConsecutivo("ESTRUC", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("ESTRUC")[0]) + 1);

            btnNuevoActionPerformed(evt);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscTercerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTercerosActionPerformed
        ventanaEstructura("");
    }//GEN-LAST:event_btnBuscTercerosActionPerformed

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            txtDigito.requestFocus();
//        }
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
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped

    }//GEN-LAST:event_txtCodigoKeyTyped

    private void lbNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNitKeyReleased

    private void txtNumNivelesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumNivelesKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarNiveles();
        }
    }//GEN-LAST:event_txtNumNivelesKeyReleased

    private void txtNumNivelesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumNivelesKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtNumNivelesKeyTyped

    private void lbNit4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNit4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNit4KeyReleased

    private void txtIdEstructuraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEstructuraKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            ndEstructura nodo = instancias.getSql().getDatosEstructura(txtIdEstructura.getText());

            txtCodigo.setText(nodo.getCodigo());
            txtDescripcion.setText(nodo.getDescripcion());
            txtNumNiveles.setText(nodo.getNumNiveles());
            cargarNiveles();

            try {
                tblNiveles.setValueAt(nodo.getLongitudNivel1(), 0, 1);
            } catch (Exception e) {
                Logs.error(e);
            }

            try {
                tblNiveles.setValueAt(nodo.getLongitudNivel2(), 1, 1);
            } catch (Exception e) {
                Logs.error(e);
            }

            try {
                tblNiveles.setValueAt(nodo.getLongitudNivel3(), 2, 1);
            } catch (Exception e) {
                Logs.error(e);
            }

            try {
                tblNiveles.setValueAt(nodo.getLongitudNivel4(), 3, 1);
            } catch (Exception e) {
                Logs.error(e);
            }

            try {
                tblNiveles.setValueAt(nodo.getLongitudNivel5(), 4, 1);
            } catch (Exception e) {
                Logs.error(e);
            }

            try {
                tblNiveles.setValueAt(nodo.getLongitudNivel6(), 5, 1);
            } catch (Exception e) {
                Logs.error(e);
            }

            try {
                tblNiveles.setValueAt(nodo.getLongitudNivel7(), 6, 1);
            } catch (Exception e) {
                Logs.error(e);
            }

            btnBuscTerceros.setEnabled(false);
            btnGuardar.setEnabled(false);
            btnActualizar.setEnabled(true);
        }
    }//GEN-LAST:event_txtIdEstructuraKeyReleased

    private void txtIdEstructuraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEstructuraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEstructuraKeyTyped

    public void cargarNiveles() {
        try {
            if (Integer.parseInt(txtNumNiveles.getText()) > 7) {
                metodos.msgAdvertenciaAjustado(this, "Máximo son 7 niveles");
                txtNumNiveles.setText("");
                return;
            }
        } catch (Exception e) {
            metodos.msgAdvertenciaAjustado(this, "Solo se pueden números enteros");
            txtNumNiveles.setText("");
            txtNumNiveles.requestFocus();
            return;
        }

        int num = Integer.parseInt(txtNumNiveles.getText());
        int numActual = tblNiveles.getRowCount();

        if (num > numActual) {
            //AGREGAR FILAS  
            for (int i = numActual; i < num; i++) {
                int nume = i + 1;
                modelo.addRow(new Object[]{"Longitud nivel " + nume, ""});
            }
        } else {
            //ELIMINAR FILAS
            while (tblNiveles.getRowCount() > num) {
                modelo.removeRow(num);
            }
        }
    }

    public void ventanaEstructura(String nit) {
        buscEstructura buscar = new buscEstructura(instancias.getMenu(), rootPaneCheckingEnabled, true);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscEstructura(buscar);
        instancias.setCampoActual(txtIdEstructura);
        txtIdEstructura.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscTerceros;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbInfoObligatorios;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit4;
    private javax.swing.JLabel lbRazon;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTable tblNiveles;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdEstructura;
    private javax.swing.JTextField txtNumNiveles;
    // End of variables declaration//GEN-END:variables
}
