package formularios;

import clases.Instancias;
import clases.metodosGenerales;
import clases.ndMaestra;
import formularios.terceros.buscTipoDocumento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class dlgTerminales extends javax.swing.JDialog {

    private metodosGenerales metodos;
    private Instancias instancias;
    private ndMaestra nodo;

    public dlgTerminales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        metodos = new metodosGenerales();
        instancias = Instancias.getInstancias();

        Object[] datos = instancias.getSql().getDatosMaestra();
        nodo = metodos.llenarMaestra(datos);

        Object[] informacion = instancias.getSql().getDatosPrefijosYModelos();
        if (null != informacion[3]) {
            txtPrefijoNC.setText(informacion[3].toString());
        }

        if (null != informacion[4]) {
            txtPrefijoND.setText(informacion[4].toString());
        }

        if (null != informacion[6]) {
            txtPrefijoAbono.setText(informacion[6].toString());
        }

        if (null != informacion[7]) {
            txtPrefijoEgreso.setText(informacion[7].toString());
        }

        if (null != informacion[9]) {
            txtModeloAbonos.setText(informacion[9].toString());
        }

        if (null != informacion[10]) {
            txtModeloEgresos.setText(informacion[10].toString());
        }

        if (null != informacion[11]) {
            txtModeloAjustesEntrada.setText(informacion[11].toString());
        }

        if (null != informacion[12]) {
            txtModeloAjustesSalida.setText(informacion[12].toString());
        }

        if (null != informacion[13]) {
            txtModeloCompras.setText(informacion[13].toString());
        }
        
        if (null != informacion[14]) {
            txtPrefijodDS.setText(informacion[14].toString());
        }

//        txtFechaDias.setText(nodo.getAlertaFechaDias());
//        txtCantidadDias.setText(nodo.getAlertaCantidadNumeracion());
//        txtPromedioDias.setText(nodo.getAlertaPromedioDias());
        if (!instancias.getConfiguraciones().isFacturaElectronica()) {
            lbDiseno.setEnabled(false);
            txtDiseno.setEnabled(false);
            chkFC.setEnabled(false);
            chkFC1.setEnabled(false);
            chkFE.setEnabled(false);
        }

        if (!instancias.getConfiguraciones().isPuc()) {
            txtModeloAbonos.setEnabled(false);
            txtModeloEgresos.setEnabled(false);
            txtModeloAjustesEntrada.setEnabled(false);
            txtModeloAjustesSalida.setEnabled(false);
            txtModeloCompras.setEnabled(false);
            lbModeloContable.setVisible(false);
            txtModeloContable.setVisible(false);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnlComprobantes = new javax.swing.JPanel();
        lbNit82 = new javax.swing.JLabel();
        txtIdComprobante = new javax.swing.JTextField();
        btnBuscTerceros = new javax.swing.JButton();
        lbNit84 = new javax.swing.JLabel();
        lbNit74 = new javax.swing.JLabel();
        lbNit75 = new javax.swing.JLabel();
        lbNit77 = new javax.swing.JLabel();
        lbNit79 = new javax.swing.JLabel();
        txtNombreComprobante = new javax.swing.JTextField();
        txtResolucion = new javax.swing.JTextField();
        dtFecha = new datechooser.beans.DateChooserCombo();
        lbNit81 = new javax.swing.JLabel();
        txtRestantes = new javax.swing.JTextField();
        txtNumeracion1 = new javax.swing.JTextField();
        txtNumeracionActual = new javax.swing.JTextField();
        lbPrefijo = new javax.swing.JLabel();
        txtPrefijo = new javax.swing.JTextField();
        lbNit78 = new javax.swing.JLabel();
        txtNumeracion2 = new javax.swing.JTextField();
        lbNit80 = new javax.swing.JLabel();
        txtNumeracionRestante = new javax.swing.JTextField();
        lbNit83 = new javax.swing.JLabel();
        dtFecha1 = new datechooser.beans.DateChooserCombo();
        jSeparator1 = new javax.swing.JSeparator();
        lbDiseno = new javax.swing.JLabel();
        txtDiseno = new javax.swing.JTextField();
        lbModeloContable = new javax.swing.JLabel();
        txtModeloContable = new javax.swing.JTextField();
        chkFE = new javax.swing.JCheckBox();
        chkFC = new javax.swing.JCheckBox();
        chkFC1 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lbNit39 = new javax.swing.JLabel();
        txtPrefijoAbono = new javax.swing.JTextField();
        lbNit40 = new javax.swing.JLabel();
        txtPrefijoEgreso = new javax.swing.JTextField();
        lbNit41 = new javax.swing.JLabel();
        txtPrefijoND = new javax.swing.JTextField();
        lbNit42 = new javax.swing.JLabel();
        txtPrefijoNC = new javax.swing.JTextField();
        lbNit43 = new javax.swing.JLabel();
        txtModeloAbonos = new javax.swing.JTextField();
        lbNit45 = new javax.swing.JLabel();
        txtModeloAjustesEntrada = new javax.swing.JTextField();
        lbNit47 = new javax.swing.JLabel();
        txtModeloCompras = new javax.swing.JTextField();
        lbNit46 = new javax.swing.JLabel();
        txtPrefijodDS = new javax.swing.JTextField();
        txtModeloEgresos = new javax.swing.JTextField();
        lbNit44 = new javax.swing.JLabel();
        btnGuardarPrefijos = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lbNit48 = new javax.swing.JLabel();
        txtModeloAjustesSalida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlComprobantes.setBackground(new java.awt.Color(255, 255, 255));
        pnlComprobantes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipos de comprobantes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lbNit82.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit82.setText("ID comprobante:");

        txtIdComprobante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtIdComprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdComprobanteKeyReleased(evt);
            }
        });

        btnBuscTerceros.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscTerceros.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBuscTerceros.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscTerceros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        btnBuscTerceros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscTerceros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTercerosActionPerformed(evt);
            }
        });

        lbNit84.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit84.setText("Comprobante:");

        lbNit74.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit74.setText("No. Resolución:");

        lbNit75.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit75.setText("Final resolución:");

        lbNit77.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit77.setText("Numeración Del:");

        lbNit79.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit79.setText("Numero Actual:");

        txtNombreComprobante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtResolucion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        dtFecha.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        dtFecha.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dtFechaOnSelectionChange(evt);
            }
        });

        lbNit81.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit81.setText("Dias Restantes:");

        txtRestantes.setEditable(false);
        txtRestantes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtRestantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestantesActionPerformed(evt);
            }
        });

        txtNumeracion1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtNumeracionActual.setEditable(false);
        txtNumeracionActual.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lbPrefijo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbPrefijo.setText("Prefijo:");

        txtPrefijo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lbNit78.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit78.setText("Hasta:");

        txtNumeracion2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lbNit80.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit80.setText("Restante:");

        txtNumeracionRestante.setEditable(false);
        txtNumeracionRestante.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lbNit83.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit83.setText("lnicio resolución:");

        dtFecha1.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        dtFecha1.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dtFecha1OnSelectionChange(evt);
            }
        });

        lbDiseno.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbDiseno.setText("Diseño Impr: ");

        txtDiseno.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDiseno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiseno.setEnabled(false);

        lbModeloContable.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbModeloContable.setText("M. Contable:");

        txtModeloContable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtModeloContable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModeloContable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloContableKeyReleased(evt);
            }
        });

        buttonGroup1.add(chkFE);
        chkFE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chkFE.setText("Factura electronica");
        chkFE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkFE.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkFEItemStateChanged(evt);
            }
        });

        buttonGroup1.add(chkFC);
        chkFC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chkFC.setText("Factura contingencia");
        chkFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(chkFC1);
        chkFC1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        chkFC1.setSelected(true);
        chkFC1.setText("N/A");
        chkFC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(93, 173, 226));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("MODIFICAR");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setEnabled(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnActualizar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNuevo.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizar)
                        .addComponent(btnNuevo)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout pnlComprobantesLayout = new javax.swing.GroupLayout(pnlComprobantes);
        pnlComprobantes.setLayout(pnlComprobantesLayout);
        pnlComprobantesLayout.setHorizontalGroup(
            pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComprobantesLayout.createSequentialGroup()
                .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComprobantesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(pnlComprobantesLayout.createSequentialGroup()
                                .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbNit79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNit77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNit74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNit82, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(lbNit84, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNit81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNit83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlComprobantesLayout.createSequentialGroup()
                                        .addComponent(txtIdComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnBuscTerceros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(lbModeloContable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtModeloContable))
                                    .addComponent(txtNombreComprobante)
                                    .addComponent(txtResolucion)
                                    .addGroup(pnlComprobantesLayout.createSequentialGroup()
                                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(dtFecha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(txtRestantes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                            .addComponent(txtNumeracionActual, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNumeracion1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbNit78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbPrefijo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbNit75, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                            .addComponent(lbNit80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNumeracionRestante, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                            .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(txtPrefijo)
                                            .addComponent(txtNumeracion2)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlComprobantesLayout.createSequentialGroup()
                                .addComponent(chkFE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkFC)
                                .addGap(27, 27, 27)
                                .addComponent(lbDiseno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiseno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlComprobantesLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(chkFC1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        pnlComprobantesLayout.setVerticalGroup(
            pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComprobantesLayout.createSequentialGroup()
                .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComprobantesLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlComprobantesLayout.createSequentialGroup()
                                .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlComprobantesLayout.createSequentialGroup()
                                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnBuscTerceros, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                            .addComponent(txtIdComprobante)
                                            .addComponent(lbNit82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbModeloContable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtModeloContable, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(3, 3, 3)
                                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                            .addComponent(lbNit84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(3, 3, 3)
                                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtResolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                            .addComponent(lbNit74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(3, 3, 3)
                                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbNit75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbNit83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(pnlComprobantesLayout.createSequentialGroup()
                                                .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 1, Short.MAX_VALUE))))
                                    .addGroup(pnlComprobantesLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(dtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)
                                .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbNit81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRestantes, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(lbPrefijo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrefijo))
                                .addGap(3, 3, 3)
                                .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNit77, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbNit78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNumeracion2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(pnlComprobantesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtNumeracion1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNit79, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeracionActual)
                            .addComponent(lbNit80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeracionRestante))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(pnlComprobantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chkFE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkFC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDiseno)))
                    .addGroup(pnlComprobantesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDiseno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(chkFC1)
                .addGap(9, 9, 9)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prefijos y Modelos contables", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lbNit39.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit39.setText("Prefijo Abonos:");

        txtPrefijoAbono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPrefijoAbono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNit40.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit40.setText("Prefijo Egresos:");

        txtPrefijoEgreso.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPrefijoEgreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNit41.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit41.setText("Prefijo Notas Debito:");

        txtPrefijoND.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPrefijoND.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNit42.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit42.setText("Prefijo Notas Credito:");

        txtPrefijoNC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPrefijoNC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNit43.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit43.setText("Modelo Abonos:");

        txtModeloAbonos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtModeloAbonos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNit45.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit45.setText("Modelo Ajustes E:");

        txtModeloAjustesEntrada.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtModeloAjustesEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNit47.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit47.setText("Modelo Compras:");

        txtModeloCompras.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtModeloCompras.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNit46.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit46.setText("Prefijo Doc Soporte:");

        txtPrefijodDS.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPrefijodDS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrefijodDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrefijodDSActionPerformed(evt);
            }
        });

        txtModeloEgresos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtModeloEgresos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbNit44.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit44.setText("Modelo Egresos:");

        btnGuardarPrefijos.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardarPrefijos.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        btnGuardarPrefijos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarPrefijos.setText("GUARDAR PREFIJOS Y MODELOS");
        btnGuardarPrefijos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarPrefijos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardarPrefijos.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnGuardarPrefijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPrefijosActionPerformed(evt);
            }
        });

        lbNit48.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit48.setText("Modelo Ajustes Salida:");

        txtModeloAjustesSalida.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtModeloAjustesSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbNit47, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtModeloCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarPrefijos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(lbNit43, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtModeloAbonos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(lbNit45, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtModeloAjustesEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lbNit44, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtModeloEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lbNit48)
                                .addGap(4, 4, 4)
                                .addComponent(txtModeloAjustesSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbNit39, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtPrefijoAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbNit41, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbNit46)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrefijodDS, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(txtPrefijoND))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lbNit40, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtPrefijoEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lbNit42)
                        .addGap(4, 4, 4)
                        .addComponent(txtPrefijoNC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit39, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtPrefijoAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit41, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrefijoND, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNit46, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrefijodDS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit40, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrefijoEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit42, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrefijoNC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit43, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloAbonos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit45, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloAjustesEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit44, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit48, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloAjustesSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNit47, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModeloCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarPrefijos)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlComprobantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlComprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (instancias.getConfiguraciones().isPuc()) {
            if (txtModeloContable.getText().equals("")) {
                metodos.msgAdvertenciaAjustado(null, "Debe ingresar el modelo contable");
                return;
            }
        }

        String tipo = "", diseno = "";
        if (chkFE.isSelected()) {
            tipo = "Facturación Electronica";
            diseno = txtDiseno.getText();
            if (diseno.equals("")) {
                metodos.msgAdvertenciaAjustado(null, "Debe ingresar el diseño");
                return;
            }
        } else if (chkFC.isSelected()) {
            tipo = "Facturación Contingencia";
        }

        Object[][] datos = instancias.getSql().getTiposComprobantes();
        String IDComprobante = txtIdComprobante.getText();
        if (!IDComprobante.equals("")) {
            for (int i = 0; i < datos.length; i++) {
                if (datos[i][0].toString().equals(IDComprobante)) {
                    metodos.msgAdvertenciaAjustado(null, "El tipo de comprobante ya existe");
                    return;
                }
            }
        }

        if (!IDComprobante.equals("")) {
            if (txtPrefijo.getText().equals("")) {
                if (instancias.getRegimen().equals("")) {
                    metodos.msgAdvertenciaAjustado(null, "Debe ingresar el prefijo");
                    return;
                } else {
                    metodos.msgAdvertenciaAjustado(null, "Falta ingresar el prefijo");
                }
            }
        }

        if (metodos.msgPregunta(null, "¿Desea continuar?") == 0) {

            for (int i = 0; i < datos.length; i++) {
                if (datos[i][0].equals("FA")) {
                    String resolucion = "", fechaFinal = "", num1 = "", num2 = "", prefijo = "";
                    if (null != datos[i][2]) {
                        resolucion = datos[i][2].toString();
                    }

                    if (null != datos[i][3]) {
                        num1 = datos[i][3].toString();
                    }

                    if (null != datos[i][4]) {
                        num2 = datos[i][4].toString();
                    }

                    if (null != datos[i][5]) {
                        fechaFinal = datos[i][5].toString();
                    }

                    if (null != datos[i][6]) {
                        prefijo = datos[i][6].toString();
                    }
                    
                    if (resolucion.equals("")) {
                        nodo.setL3("");
                        nodo.setD4("");
                        nodo.setD5("");
                    } else {
                        nodo.setL3(prefijo);
                        nodo.setD4("RESOLUCION " + resolucion + " " + fechaFinal);
                        nodo.setD5("NUMERACION DESDE " + num1 + " HASTA " + num2);
                    }
                }
            }

            nodo.setAlertaFechaDias("0");
            nodo.setAlertaCantidadNumeracion("0");
            nodo.setAlertaPromedioDias("0");

            if (!instancias.getSql().modificarMaestra(nodo)) {
                metodos.msgError(null, "Error al guardar los cambios");
                return;
            }

            if (!IDComprobante.equals("")) {
                if (!instancias.getSql().agregarLogError(IDComprobante, txtNombreComprobante.getText(), txtResolucion.getText(),
                        metodos.desdeDate(dtFecha.getSelectedDate()), txtPrefijo.getText(), txtNumeracion1.getText(), txtNumeracion2.getText(),
                        metodos.desdeDate(dtFecha1.getSelectedDate()), tipo, diseno, txtModeloContable.getText())) {
                    metodos.msgError(null, "Error al guardar los cambios");
                    return;
                }
            }

            metodos.msgExito(null, "Cambios guardados con éxito");
            instancias.getMaestra().llenarDatos();
            instancias.getFactura().actualizarTablaComprobantes();
            this.dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtRestantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestantesActionPerformed

    private void dtFechaOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dtFechaOnSelectionChange
        long aux = metodos.restarFecha(metodosGenerales.fecha(), metodos.sumarFecha(metodos.desdeDate2(dtFecha.getSelectedDate()), Integer.parseInt(instancias.getDiasAlertaResolucion())));
        txtRestantes.setText(aux + "");
    }//GEN-LAST:event_dtFechaOnSelectionChange

    private void txtIdComprobanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdComprobanteKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtIdComprobante.getText().equals("")) {

                Object[] datos = instancias.getSql().getResolucionTerminales(txtIdComprobante.getText());

                if (null != datos[0]) {
                    if (datos[1] != null) {
                        txtNombreComprobante.setText(datos[1].toString());
                    }

                    if (datos[2] != null) {
                        txtResolucion.setText(datos[2].toString());
                    }

                    if (datos[3] != null) {
                        dtFecha.setSelectedDate(metodos.haciaDate(metodos.fecha3(metodos.fecha(datos[3].toString()))));
                    }

                    if (datos[4] != null) {
                        txtPrefijo.setText(datos[4].toString());
                    }

                    if (datos[5] != null) {
                        txtNumeracion1.setText(datos[5].toString());
                    }

                    if (datos[6] != null) {
                        txtNumeracion2.setText(datos[6].toString());
                    }

                    if (datos[7] != null) {
                        if (!datos[7].toString().equals("")) {
                            txtNumeracionActual.setText(datos[7].toString());
                            String prefijo = "";
                            if (null != datos[4]) {
                                prefijo = datos[4].toString();
                            }

                            int hasta = 0;
                            if (!txtNumeracion2.getText().equals("")) {
                                hasta = Integer.parseInt(txtNumeracion2.getText().replace(prefijo, ""));

                                hasta = hasta - Integer.parseInt(datos[7].toString());
                                txtNumeracionRestante.setText(String.valueOf(hasta));
                            }
                        }
                    }

                    if (datos[8] != null) {
                        dtFecha1.setSelectedDate(metodos.haciaDate(metodos.fecha3(metodos.fecha(datos[8].toString()))));
                    }

                    if (datos[9] != null) {
                        if ("Facturación Electronica".equals(datos[9].toString())) {
                            chkFE.setSelected(true);
                        } else if ("Facturación Contingencia".equals(datos[9].toString())) {
                            chkFC.setSelected(true);
                        } else {
                            chkFC1.setSelected(true);
                        }
                    } else {
                        chkFC1.setSelected(true);
                    }

                    if (datos[10] != null) {
                        txtDiseno.setText(datos[10].toString());
                    }

                    if (datos[11] != null) {
                        txtModeloContable.setText(datos[11].toString());
                    }

                    btnGuardar.setEnabled(false);
                    btnActualizar.setEnabled(true);
                    txtIdComprobante.setEnabled(false);

                    long aux = metodos.restarFecha(metodosGenerales.fecha(), metodos.sumarFecha(metodos.desdeDate2(dtFecha.getSelectedDate()), Integer.parseInt(instancias.getDiasAlertaResolucion())));
                    txtRestantes.setText(aux + "");
                }
            }
        }
    }//GEN-LAST:event_txtIdComprobanteKeyReleased

    private void btnBuscTercerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTercerosActionPerformed
        ventanaTipoDocumento("");
    }//GEN-LAST:event_btnBuscTercerosActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (instancias.getConfiguraciones().isPuc()) {
            if (txtModeloContable.getText().equals("")) {
                metodos.msgAdvertenciaAjustado(null, "Debe ingresar el modelo contable");
                return;
            }
        }

        String tipo = "", diseno = "";
        if (chkFE.isSelected()) {
            tipo = "Facturación Electronica";
            diseno = txtDiseno.getText();
            if (diseno.equals("")) {
                metodos.msgAdvertenciaAjustado(null, "Debe ingresar el diseño");
                return;
            }
        } else if (chkFC.isSelected()) {
            tipo = "Facturación Contingencia";
        }

        if (txtPrefijo.getText().equals("")) {
            if (instancias.getRegimen().equals("")) {
                metodos.msgAdvertenciaAjustado(null, "Debe ingresar el prefijo");
                return;
            } else {
                metodos.msgAdvertenciaAjustado(null, "Falta ingresar el prefijo");
            }
        }

        if (metodos.msgPregunta(null, "¿Desea continuar?") == 0) {

            if (!instancias.getSql().modificarTerminalDetalle(txtIdComprobante.getText(), txtNombreComprobante.getText(), txtResolucion.getText(),
                    metodos.desdeDate(dtFecha.getSelectedDate()), txtPrefijo.getText(), txtNumeracion1.getText(), txtNumeracion2.getText(),
                    metodos.desdeDate(dtFecha1.getSelectedDate()), tipo, diseno, txtModeloContable.getText())) {
                metodos.msgError(null, "Error al guardar los cambios");
                return;
            } else {
                if (txtIdComprobante.getText().equals("FA")) {
                    String resolucion = txtResolucion.getText(), fechaFinal = metodos.desdeDate(dtFecha.getSelectedDate()),
                            num1 = txtNumeracion1.getText(), num2 = txtNumeracion2.getText(), prefijo = txtPrefijo.getText();

                    if (resolucion.equals("")) {
                        nodo.setL3("");
                        nodo.setD4("");
                        nodo.setD5("");
                    } else {
                        nodo.setL3(prefijo);
                        nodo.setD4("RESOLUCION " + resolucion + " " + fechaFinal);
                        nodo.setD5("NUMERACION DESDE " + num1 + " HASTA " + num2);
                    }
                }

                nodo.setAlertaFechaDias("0");
                nodo.setAlertaCantidadNumeracion("0");
                nodo.setAlertaPromedioDias("0");

                if (!instancias.getSql().modificarMaestra(nodo)) {
                    metodos.msgError(null, "Hubo un problema al guardar los cambios");
                    return;
                }

                metodos.msgExito(null, "Resolución guardada con exito");
                btnNuevoActionPerformed(evt);
                instancias.getFactura().actualizarTablaComprobantes();
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void dtFecha1OnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dtFecha1OnSelectionChange
        // TODO add your handling code here:
    }//GEN-LAST:event_dtFecha1OnSelectionChange

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar(pnlComprobantes);
        chkFC1.setSelected(true);
        txtIdComprobante.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void chkFEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkFEItemStateChanged
        if (chkFE.isSelected()) {
            txtDiseno.setEnabled(true);
        } else {
            txtDiseno.setEnabled(false);
            txtDiseno.setText("");
        }
    }//GEN-LAST:event_chkFEItemStateChanged

    private void txtModeloContableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloContableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloContableKeyReleased

    private void btnGuardarPrefijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPrefijosActionPerformed
        if (metodos.msgPregunta(null, "¿Desea continuar?") == 0) {

            Object[] vector = {"TERM-1", "", metodos.desdeDate(dtFecha.getSelectedDate()), "", txtPrefijoNC.getText(), txtPrefijoND.getText(),
                txtPrefijoAbono.getText(), txtPrefijoEgreso.getText(), false, txtModeloAbonos.getText(), txtModeloEgresos.getText(), txtModeloAjustesEntrada.getText(),
                txtModeloAjustesSalida.getText(), txtModeloCompras.getText(), txtPrefijodDS.getText()};
            if (!instancias.getSql().modificarPrefijosYModelos(vector)) {
                metodos.msgError(null, "Error al guardar los cambios");
                return;
            }

            instancias.setIdNC(txtPrefijoNC.getText());
            instancias.setIdND(txtPrefijoND.getText());
            instancias.setIdAbono(txtPrefijoAbono.getText());
            instancias.setIdEgreso(txtPrefijoEgreso.getText());
            instancias.setIdDS(txtPrefijodDS.getText());
            metodos.msgExito(null, "Prefijos y modelos guardados con éxito");
        }
    }//GEN-LAST:event_btnGuardarPrefijosActionPerformed

    private void txtPrefijodDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrefijodDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrefijodDSActionPerformed

    private void limpiar(JPanel panel) {
        for (int x = 0; x < panel.getComponentCount(); x++) {
            if (panel.getComponent(x) instanceof JTextField) {
                JTextField textField = (JTextField) panel.getComponent(x);
                textField.setText("");
            }
        }
    }

    public void ventanaTipoDocumento(String nit) {
        buscTipoDocumento buscar = new buscTipoDocumento(instancias.getMenu(), true);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscTipoDocumento(buscar);
        instancias.setCampoActual(txtIdComprobante);
        txtIdComprobante.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public int getDiasCalendario(Calendar fechaInicial, Calendar fechaFinal) {
        int diffDays = 0;
        if (fechaFinal.before(fechaInicial) || fechaInicial.equals(fechaFinal)) {
            diffDays = 0;
        } else {
            while (fechaInicial.before(fechaFinal) || fechaInicial.equals(fechaFinal)) {
                diffDays++;
                fechaInicial.add(Calendar.DATE, 1);
            }
        }
        return diffDays == 0 ? 0 : diffDays - 1;
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
            java.util.logging.Logger.getLogger(dlgTerminales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgTerminales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgTerminales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgTerminales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgTerminales dialog = new dlgTerminales(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscTerceros;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarPrefijos;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkFC;
    private javax.swing.JCheckBox chkFC1;
    private javax.swing.JCheckBox chkFE;
    private datechooser.beans.DateChooserCombo dtFecha;
    private datechooser.beans.DateChooserCombo dtFecha1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbDiseno;
    private javax.swing.JLabel lbModeloContable;
    private javax.swing.JLabel lbNit39;
    private javax.swing.JLabel lbNit40;
    private javax.swing.JLabel lbNit41;
    private javax.swing.JLabel lbNit42;
    private javax.swing.JLabel lbNit43;
    private javax.swing.JLabel lbNit44;
    private javax.swing.JLabel lbNit45;
    private javax.swing.JLabel lbNit46;
    private javax.swing.JLabel lbNit47;
    private javax.swing.JLabel lbNit48;
    private javax.swing.JLabel lbNit74;
    private javax.swing.JLabel lbNit75;
    private javax.swing.JLabel lbNit77;
    private javax.swing.JLabel lbNit78;
    private javax.swing.JLabel lbNit79;
    private javax.swing.JLabel lbNit80;
    private javax.swing.JLabel lbNit81;
    private javax.swing.JLabel lbNit82;
    private javax.swing.JLabel lbNit83;
    private javax.swing.JLabel lbNit84;
    private javax.swing.JLabel lbPrefijo;
    private javax.swing.JPanel pnlComprobantes;
    private javax.swing.JTextField txtDiseno;
    private javax.swing.JTextField txtIdComprobante;
    private javax.swing.JTextField txtModeloAbonos;
    private javax.swing.JTextField txtModeloAjustesEntrada;
    private javax.swing.JTextField txtModeloAjustesSalida;
    private javax.swing.JTextField txtModeloCompras;
    private javax.swing.JTextField txtModeloContable;
    private javax.swing.JTextField txtModeloEgresos;
    private javax.swing.JTextField txtNombreComprobante;
    private javax.swing.JTextField txtNumeracion1;
    private javax.swing.JTextField txtNumeracion2;
    private javax.swing.JTextField txtNumeracionActual;
    private javax.swing.JTextField txtNumeracionRestante;
    private javax.swing.JTextField txtPrefijo;
    private javax.swing.JTextField txtPrefijoAbono;
    private javax.swing.JTextField txtPrefijoEgreso;
    private javax.swing.JTextField txtPrefijoNC;
    private javax.swing.JTextField txtPrefijoND;
    private javax.swing.JTextField txtPrefijodDS;
    private javax.swing.JTextField txtResolucion;
    private javax.swing.JTextField txtRestantes;
    // End of variables declaration//GEN-END:variables
}
