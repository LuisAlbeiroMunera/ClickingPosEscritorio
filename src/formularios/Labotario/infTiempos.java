package formularios.Labotario;

import formularios.Medico.*;
import clases.Instancias;
import clases.Medico.ndNotaEnfermeria;
import clases.SQL;
import clases.metodosGenerales;
import clases.terceros.ndTercero;
import formularios.terceros.buscClientes;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class infTiempos extends javax.swing.JInternalFrame {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    DefaultTableModel modelo;
    SQL sql= new SQL();

    public infTiempos() {
        initComponents();

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        instancias = Instancias.getInstancias();
        txtResultados1.setEnabled(false);
        txtResultados2.setEnabled(false);
        txtResultados3.setEnabled(false);
        txtResultados4.setEnabled(false);
        txtResultados.setEnabled(false);
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
                        if ((btnLimpiar.isEnabled())) {
                            btnLimpiarActionPerformed(null);
                        }
                        break;
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
        lbNit10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lbRazon6 = new javax.swing.JLabel();
        lbRazon4 = new javax.swing.JLabel();
        lbRazon2 = new javax.swing.JLabel();
        txtRemitido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        lbRazon5 = new javax.swing.JLabel();
        txtNumeroOrden = new javax.swing.JTextField();
        lbRazon1 = new javax.swing.JLabel();
        txtEps = new javax.swing.JTextField();
        lbRazon3 = new javax.swing.JLabel();
        lbRazon7 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        lbRazon9 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTecnica = new javax.swing.JTextArea();
        lbNit15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        lbNit16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtResultados = new javax.swing.JTextField();
        txtResultados1 = new javax.swing.JTextField();
        lbNit25 = new javax.swing.JLabel();
        lbNit43 = new javax.swing.JLabel();
        lbNit26 = new javax.swing.JLabel();
        lbNit19 = new javax.swing.JLabel();
        lbNit20 = new javax.swing.JLabel();
        lbNit21 = new javax.swing.JLabel();
        lbNit44 = new javax.swing.JLabel();
        lbNit45 = new javax.swing.JLabel();
        lbNit46 = new javax.swing.JLabel();
        lbNit47 = new javax.swing.JLabel();
        lbNit48 = new javax.swing.JLabel();
        lbNit49 = new javax.swing.JLabel();
        lbNit53 = new javax.swing.JLabel();
        txtResultados4 = new javax.swing.JTextField();
        lbNit54 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbtTP = new javax.swing.JRadioButton();
        rbtTPT = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        txtResultados2 = new javax.swing.JTextField();
        txtResultados3 = new javax.swing.JTextField();
        lbNit27 = new javax.swing.JLabel();
        lbNit50 = new javax.swing.JLabel();
        lbNit28 = new javax.swing.JLabel();
        lbNit22 = new javax.swing.JLabel();
        lbNit23 = new javax.swing.JLabel();
        lbNit24 = new javax.swing.JLabel();
        lbNit51 = new javax.swing.JLabel();
        lbNit52 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        lbNit10.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lbNit10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit10.setText("TP / TPT");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbRazon6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon6.setText("Sexo:");

        lbRazon4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon4.setText("EPS:");

        lbRazon2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon2.setText("Telefono:");

        txtRemitido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtRemitido.setName("Fecha De Nacimiento"); // NOI18N
        txtRemitido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRemitidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRemitidoKeyTyped(evt);
            }
        });

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTelefono.setName("Tipo De Documento"); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtNombres.setEditable(false);
        txtNombres.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombres.setName("Nombre Y Apellidos"); // NOI18N
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtIdentificacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtIdentificacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIdentificacion.setEnabled(false);
        txtIdentificacion.setName("No. Identificacion"); // NOI18N
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });

        lbRazon5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon5.setText("Remitido por:");

        txtNumeroOrden.setEditable(false);
        txtNumeroOrden.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNumeroOrden.setName("Edad"); // NOI18N
        txtNumeroOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroOrdenActionPerformed(evt);
            }
        });
        txtNumeroOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroOrdenKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroOrdenKeyTyped(evt);
            }
        });

        lbRazon1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon1.setText("No. Identificaci??n:");

        txtEps.setEditable(false);
        txtEps.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEps.setName("Sexo"); // NOI18N
        txtEps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEpsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEpsKeyTyped(evt);
            }
        });

        lbRazon3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon3.setText("Paciente:");

        lbRazon7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon7.setText("N. Registro:");

        txtSexo.setEditable(false);
        txtSexo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtSexo.setName("Estado Civil"); // NOI18N
        txtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSexoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSexoKeyTyped(evt);
            }
        });

        lbRazon9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon9.setText("Edad");

        txtEdad.setEditable(false);
        txtEdad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEdad.setName("Edad"); // NOI18N
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEdadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
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
                        .addComponent(lbRazon5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRemitido))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbRazon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbRazon7, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroOrden))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(lbRazon1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbRazon3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(lbRazon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbRazon9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEps, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(txtEdad))
                                .addGap(18, 18, 18)
                                .addComponent(lbRazon6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSexo)))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombres)
                    .addComponent(lbRazon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdentificacion)
                    .addComponent(lbRazon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lbRazon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRazon7)
                            .addComponent(lbRazon9)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRazon4)
                        .addComponent(txtEps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRazon6)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRazon5)
                    .addComponent(txtRemitido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnImprimir.setBackground(new java.awt.Color(0, 153, 153));
        btnImprimir.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnImprimir.setText("RE-IMPRIMIR");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnImprimir.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        btnImprimir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnImprimirKeyReleased(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 153, 153));
        btnGuardar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR   ");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMargin(new java.awt.Insets(2, 7, 2, 5));
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

        btnLimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpiar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpiar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        btnLimpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnLimpiarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnImprimir)
                .addGap(228, 228, 228))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnImprimir)
                    .addComponent(btnLimpiar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtTecnica.setColumns(20);
        txtTecnica.setRows(3);
        jScrollPane2.setViewportView(txtTecnica);

        lbNit15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbNit15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit15.setText("TECNICA");

        txtObservaciones.setColumns(20);
        txtObservaciones.setRows(3);
        jScrollPane3.setViewportView(txtObservaciones);

        lbNit16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbNit16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit16.setText("OBSERVACIONES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(lbNit15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addComponent(lbNit16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbNit16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbNit15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtResultados.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtResultados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultados.setName("No. Identificacion"); // NOI18N
        txtResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadosActionPerformed(evt);
            }
        });
        txtResultados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResultadosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultadosKeyTyped(evt);
            }
        });

        txtResultados1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtResultados1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultados1.setName("No. Identificacion"); // NOI18N
        txtResultados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultados1ActionPerformed(evt);
            }
        });
        txtResultados1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResultados1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultados1KeyTyped(evt);
            }
        });

        lbNit25.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit25.setText("PACIENTE");

        lbNit43.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit43.setText("RELACI??N PACIENTE CONTROL");

        lbNit26.setBackground(new java.awt.Color(204, 204, 204));
        lbNit26.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lbNit26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit26.setText("TIEMPO DE PROTROMBINA (TP)");
        lbNit26.setOpaque(true);

        lbNit19.setBackground(new java.awt.Color(204, 204, 204));
        lbNit19.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lbNit19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit19.setText("REFERENCIAS");
        lbNit19.setOpaque(true);

        lbNit20.setBackground(new java.awt.Color(204, 204, 204));
        lbNit20.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lbNit20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit20.setText("RESULTADOS");
        lbNit20.setOpaque(true);

        lbNit21.setBackground(new java.awt.Color(204, 204, 204));
        lbNit21.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lbNit21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit21.setText(" ");
        lbNit21.setOpaque(true);

        lbNit44.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNit44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit44.setText("TP del paciente 9.9 a 11.8");

        lbNit45.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNit45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit45.setText("TP del control 9.9 a 11.8");

        lbNit46.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNit46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit46.setText("Profilaxis de trombosis venosa profunda 1.5 - 2.0");

        lbNit47.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNit47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit47.setText("Profilaxis de tromboembolismo pulmonar 2.0 - 2.5");

        lbNit48.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNit48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit48.setText("Protesis valvulares izquierdas 2.5 - 3.0");

        lbNit49.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNit49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit49.setText("Protesis valvulares derechas 3.0 - 4.0");

        lbNit53.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit53.setText("INR");

        txtResultados4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtResultados4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultados4.setName("No. Identificacion"); // NOI18N
        txtResultados4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultados4ActionPerformed(evt);
            }
        });
        txtResultados4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResultados4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultados4KeyTyped(evt);
            }
        });

        lbNit54.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNit54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit54.setText("Rangos de referencia de INR mas utilizados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNit26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNit53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(lbNit25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtResultados4)
                            .addComponent(txtResultados1)
                            .addComponent(txtResultados, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNit20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit47, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                            .addComponent(lbNit19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNit26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNit19)
                    .addComponent(lbNit20)
                    .addComponent(lbNit21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtResultados)
                    .addComponent(lbNit25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNit45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit43, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtResultados1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lbNit54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNit46)
                        .addGap(3, 3, 3)
                        .addComponent(lbNit47)
                        .addGap(3, 3, 3)
                        .addComponent(lbNit48)
                        .addGap(3, 3, 3)
                        .addComponent(lbNit49))
                    .addComponent(lbNit53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtResultados4))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        rbtTP.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbtTP.setText("TIEMPO DE PROTROMBINA");
        rbtTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTPActionPerformed(evt);
            }
        });

        rbtTPT.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbtTPT.setText("TIEMPO PARCIAL DE TROMBOPLASTINA (TPT)");
        rbtTPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTPTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtTP)
                .addGap(40, 40, 40)
                .addComponent(rbtTPT)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtTP)
                    .addComponent(rbtTPT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtResultados2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtResultados2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultados2.setName("No. Identificacion"); // NOI18N
        txtResultados2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultados2ActionPerformed(evt);
            }
        });
        txtResultados2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResultados2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultados2KeyTyped(evt);
            }
        });

        txtResultados3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtResultados3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultados3.setName("No. Identificacion"); // NOI18N
        txtResultados3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultados3ActionPerformed(evt);
            }
        });
        txtResultados3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResultados3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultados3KeyTyped(evt);
            }
        });

        lbNit27.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit27.setText("PACIENTE");

        lbNit50.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit50.setText("RELACI??N PACIENTE CONTROL");

        lbNit28.setBackground(new java.awt.Color(204, 204, 204));
        lbNit28.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lbNit28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit28.setText("TIEMPO PARCIAL DE TROMBOPLASTINA (TPT)");
        lbNit28.setOpaque(true);

        lbNit22.setBackground(new java.awt.Color(204, 204, 204));
        lbNit22.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lbNit22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit22.setText("REFERENCIAS");
        lbNit22.setOpaque(true);

        lbNit23.setBackground(new java.awt.Color(204, 204, 204));
        lbNit23.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lbNit23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit23.setText("RESULTADOS");
        lbNit23.setOpaque(true);

        lbNit24.setBackground(new java.awt.Color(204, 204, 204));
        lbNit24.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lbNit24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit24.setText(" ");
        lbNit24.setOpaque(true);

        lbNit51.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNit51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit51.setText("25.0 a 31.3 ");

        lbNit52.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNit52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNit52.setText("25.0 a 31.3 ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNit28, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbNit27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit50, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNit23, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(txtResultados2)
                            .addComponent(txtResultados3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNit52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNit28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNit22)
                    .addComponent(lbNit23)
                    .addComponent(lbNit24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNit51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtResultados2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNit50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtResultados3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(lbNit52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anterior_1.png"))); // NOI18N
        jLabel10.setText("VOLVER A LA CONSULTA");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNit10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrFormulario.setViewportView(pnlFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFormulario)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtIdentificacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarCliente(txtIdentificacion.getText());
        }
    }//GEN-LAST:event_txtIdentificacionKeyReleased

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped

    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtNumeroOrdenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroOrdenKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroOrdenKeyReleased

    private void txtNumeroOrdenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroOrdenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroOrdenKeyTyped

    private void txtEpsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEpsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEpsKeyReleased

    private void txtEpsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEpsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEpsKeyTyped

    private void txtSexoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoKeyReleased

    private void txtSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoKeyTyped

    public void cargarCliente(String nit) {

        ndTercero Tercero = sql.getDatosTercero(nit);

        if (Tercero.getId() != null) {
            txtIdentificacion.setText(Tercero.getId());
            txtTelefono.setText(Tercero.getTelefono());
            txtNombres.setText(Tercero.getpNombre() + " " + Tercero.getsNombre() + " " + Tercero.getpApellido() + " " + Tercero.getsApellido());
            txtEps.setText(Tercero.getEps());
            txtSexo.setText(Tercero.getSexo());
//            txtRemitido.setText(metodos.fecha(Tercero.getNacimiento()));

            try {
                txtEdad.setText(metodosGenerales.calcularEdad2(metodos.fecha(Tercero.getNacimiento())) + "");
            } catch (Exception e) {
            }

            return;
        }
        ventanaTerceros(nit);
    }

    public void ventanaTerceros(String nit) {
        buscClientes buscar = new buscClientes(instancias.getMenu(), rootPaneCheckingEnabled, false, null, "");
        buscar.setLocationRelativeTo(null);
        instancias.setBusClientes(buscar);
        instancias.setCampoActual(txtIdentificacion);
        txtIdentificacion.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Object[] campos = {txtIdentificacion, txtResultados, txtResultados1};
        String faltantes = metodos.camposVacios(campos);

        if (!faltantes.equals("")) {
            metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
            return;
        }

        if (metodos.msgPregunta(this, "??Desea continuar?") == 0) {

            String id = "TIEMPO-" + instancias.getSql().getNumConsecutivo("TIEMPO")[0];

            if (!instancias.getSql().agregarTiempo(id, txtIdentificacion.getText(), txtNumeroOrden.getText(), txtRemitido.getText(), metodosGenerales.fecha(),
                    txtResultados.getText(), txtTecnica.getText(), txtObservaciones.getText(), txtResultados1.getText(), txtResultados2.getText(), txtResultados3.getText(),
                    txtResultados4.getText())) {
                metodos.msgError(this, "Hubo un problema al guardar");
                return;
            }

//            if (!instancias.getSql().aumentarConsecutivo("TIEMPO", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("TIEMPO")[0]) + 1)) {
//                metodos.msgError(this, "Hubo un problema al guardar en el consecutivo");
//                return;
//            }

            metodos.msgExito(this, "Examen registrado con ??xito");

            if (metodos.msgPregunta(this, "??Desea imprimir?") == 0) {
                String legal = "", pie;
                try {
                    legal = instancias.getLegal();
                } catch (Exception ex) {
                    legal = "";
                }
                try {
                    pie = instancias.getPie();
                } catch (Exception ex) {
                    pie = "";
                }

                instancias.getReporte().ver_Examen(id, instancias.getInformacionEmpresa(), legal, pie, txtEdad.getText(), "tiempos");
            }
            btnLimpiarActionPerformed(evt);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_btnGuardarKeyReleased

    private void txtEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadKeyReleased

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadKeyTyped

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        if (!txtIdentificacion.getText().equals("")) {
            infReimpresionExamenesLaboratorio impresion = new infReimpresionExamenesLaboratorio();
            impresion.cargarRegistros(txtIdentificacion.getText(), "tiempos", instancias);
            impresion.setVisible(true);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnImprimirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnImprimirKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirKeyReleased

    private void txtRemitidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemitidoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemitidoKeyTyped

    private void txtRemitidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemitidoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemitidoKeyReleased

    private void txtNumeroOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroOrdenActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtTecnica.setText("");
        txtResultados.setText("");
        txtResultados1.setText("");
        txtResultados3.setText("");
        txtResultados4.setText("");
        txtResultados2.setText("");
        txtObservaciones.setText("");
        txtRemitido.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimpiarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarKeyReleased

    private void txtResultadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadosKeyTyped

    private void txtResultadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadosKeyReleased

    private void txtResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadosActionPerformed

    private void txtResultados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultados1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados1ActionPerformed

    private void txtResultados1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultados1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados1KeyReleased

    private void txtResultados1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultados1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados1KeyTyped

    private void txtResultados2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultados2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados2ActionPerformed

    private void txtResultados2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultados2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados2KeyReleased

    private void txtResultados2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultados2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados2KeyTyped

    private void txtResultados3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultados3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados3ActionPerformed

    private void txtResultados3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultados3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados3KeyReleased

    private void txtResultados3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultados3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados3KeyTyped

    private void rbtTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTPActionPerformed
        if (rbtTP.isSelected()) {
            txtResultados4.setEnabled(true);
            txtResultados1.setEnabled(true);
            txtResultados.setEnabled(true);
        } else {
            txtResultados4.setEnabled(false);
            txtResultados4.setText("");
            txtResultados1.setEnabled(false);
            txtResultados1.setText("");
            txtResultados.setEnabled(false);
            txtResultados.setText("");
        }
    }//GEN-LAST:event_rbtTPActionPerformed

    private void rbtTPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTPTActionPerformed
        if (rbtTPT.isSelected()) {
            txtResultados2.setEnabled(true);
            txtResultados3.setEnabled(true);
        } else {
            txtResultados2.setEnabled(false);
            txtResultados2.setText("");
            txtResultados3.setEnabled(false);
            txtResultados3.setText("");
        }
    }//GEN-LAST:event_rbtTPTActionPerformed

    private void txtResultados4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultados4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados4ActionPerformed

    private void txtResultados4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultados4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados4KeyReleased

    private void txtResultados4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultados4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultados4KeyTyped

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        try {
            instancias.getHistoriaLaboratorio().setSelected(true);
            instancias.getMenu().expandirMenu();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(infHistoriaLaboratorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    public void reimprimir(String consecutivo) {
        String legal = "", pie;
        try {
            legal = instancias.getLegal();
        } catch (Exception ex) {
            legal = "";
        }
        try {
            pie = instancias.getPie();
        } catch (Exception ex) {
            pie = "";
        }
        instancias.getReporte().ver_Examen(consecutivo, instancias.getInformacionEmpresa(), legal, pie, txtEdad.getText(), "tiempos");
    }

    public void cargar(String nit, String numero) {
        txtNumeroOrden.setText(numero);
        try {
            this.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(infHistoriaMedica.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtIdentificacion.setText(nit);
        cargarCliente(nit);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbNit10;
    private javax.swing.JLabel lbNit15;
    private javax.swing.JLabel lbNit16;
    private javax.swing.JLabel lbNit19;
    private javax.swing.JLabel lbNit20;
    private javax.swing.JLabel lbNit21;
    private javax.swing.JLabel lbNit22;
    private javax.swing.JLabel lbNit23;
    private javax.swing.JLabel lbNit24;
    private javax.swing.JLabel lbNit25;
    private javax.swing.JLabel lbNit26;
    private javax.swing.JLabel lbNit27;
    private javax.swing.JLabel lbNit28;
    private javax.swing.JLabel lbNit43;
    private javax.swing.JLabel lbNit44;
    private javax.swing.JLabel lbNit45;
    private javax.swing.JLabel lbNit46;
    private javax.swing.JLabel lbNit47;
    private javax.swing.JLabel lbNit48;
    private javax.swing.JLabel lbNit49;
    private javax.swing.JLabel lbNit50;
    private javax.swing.JLabel lbNit51;
    private javax.swing.JLabel lbNit52;
    private javax.swing.JLabel lbNit53;
    private javax.swing.JLabel lbNit54;
    private javax.swing.JLabel lbRazon1;
    private javax.swing.JLabel lbRazon2;
    private javax.swing.JLabel lbRazon3;
    private javax.swing.JLabel lbRazon4;
    private javax.swing.JLabel lbRazon5;
    private javax.swing.JLabel lbRazon6;
    private javax.swing.JLabel lbRazon7;
    private javax.swing.JLabel lbRazon9;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JRadioButton rbtTP;
    private javax.swing.JRadioButton rbtTPT;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEps;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroOrden;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRemitido;
    private javax.swing.JTextField txtResultados;
    private javax.swing.JTextField txtResultados1;
    private javax.swing.JTextField txtResultados2;
    private javax.swing.JTextField txtResultados3;
    private javax.swing.JTextField txtResultados4;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextArea txtTecnica;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
