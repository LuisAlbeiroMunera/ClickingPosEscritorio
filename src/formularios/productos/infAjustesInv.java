package formularios.productos;
import logs.Logs;
import clases.Instancias;
import clases.productos.ndProducto;
import clases.productos.ndTraslado;
import clases.big;
import clases.metodosGenerales;
import clases.productos.ndCompra;
import clases.productos.ndProductoAjustes;
import formularios.terceros.buscBodegas;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class infAjustesInv extends javax.swing.JInternalFrame {

    String simbolo = "";
    DefaultTableModel modeloPro;
    DefaultTableModel modeloPro1;
    Boolean preguntaLimpiar = true;
    metodosGenerales metodos = new metodosGenerales();
    Instancias instancias;
    Object[] datos;
    DecimalFormat df = new DecimalFormat("#.00");
    boolean dinamico = false;

    //Barra de titulo
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    private String datosEmpresa, cantidadTotal;
    private boolean plu = false;
    private boolean saltarPasos = false;

    public boolean isPlu() {
        return plu;
    }

    public void setPlu(boolean plu) {
        this.plu = plu;
    }

    public infAjustesInv() {
        initComponents();
        modeloPro = (DefaultTableModel) tblProductos.getModel();
        modeloPro1 = (DefaultTableModel) tblDetalle.getModel();

//        tblProductos.setDefaultRenderer(Object.class, new cambiarColorTabla(2, 0));
        instancias = Instancias.getInstancias();
        lbNoFactura.setText((String) instancias.getSql().getNumConsecutivoActual("TRAS")[0]);

        txtFecha.setText(metodos.fecha());
        simbolo = instancias.getSimbolo();

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        consultarMaestros();

        if (!instancias.getConfiguraciones().isProductosSerial()) {
            tblProductos.getColumnModel().getColumn(8).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(8).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(8).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(9).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(9).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(9).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(10).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(10).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(11).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(11).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(11).setMaxWidth(0);
        }

        if (instancias.getConfiguraciones().getTipoImpresion().equals("Sin-Codigo")) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        pnlFormulario.registerKeyboardAction(accion("guardar"), "guardar", KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("limpiar"), "limpiar", KeyStroke.getKeyStroke(KeyEvent.VK_L, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);

        cargarProductoPreAjuste();

        if (!instancias.getConfiguraciones().isInventarioBodegas()) {
            lbBodega.setVisible(false);
            txtBodega.setVisible(false);
        }

        if (instancias.getConfiguraciones().isPuc()) {
            Object[] informacion = instancias.getSql().getDatosPrefijosYModelos();
            if (cmbTipo.getSelectedIndex() == 0) {
                txtModeloContable.setText(informacion[11].toString());
            } else {
                txtModeloContable.setText(informacion[12].toString());
            }
        } else {
            txtModeloContable.setVisible(false);
            lbModeloContable.setVisible(false);
        }

        pnlInvisible.setVisible(false);
    }

    public void consultarPermiso() {
        Logs.log("entro acaa");
        if (cmbTipo.getSelectedIndex() == 0) {
            if (!instancias.getUsuarioLog().isAjustesEntrada()) {
                metodos.msgError(this, "No tiene permisos");
                btnGuardar.setEnabled(false);
                btnLimpiar.setEnabled(false);
                btnReimprimir.setEnabled(false);
                btnAnular.setEnabled(false);
            } else {
                btnGuardar.setEnabled(true);
                btnLimpiar.setEnabled(true);
                btnReimprimir.setEnabled(true);
                btnAnular.setEnabled(true);
            }
        } else {
            if (!instancias.getUsuarioLog().isAjustesSalida()) {
                metodos.msgError(this, "No tiene permisos");
                btnGuardar.setEnabled(false);
                btnLimpiar.setEnabled(false);
                btnReimprimir.setEnabled(false);
                btnAnular.setEnabled(false);
            } else {
                btnGuardar.setEnabled(true);
                btnLimpiar.setEnabled(true);
                btnReimprimir.setEnabled(true);
                btnAnular.setEnabled(true);
            }
        }
    }

    public void consultarMaestros() {
        datos = instancias.getSql().getDatosMaestra();
    }

    private ActionListener accion(final String opc) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
                    case "limpiar":
                        if ((btnLimpiar.isEnabled()) && (btnLimpiar.isVisible())) {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popBorrar = new javax.swing.JMenuItem();
        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbNit4 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        lbNit3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lbNoFactura = new javax.swing.JLabel();
        lbFacturaNo = new javax.swing.JLabel();
        txtModeloContable = new javax.swing.JTextField();
        lbModeloContable = new javax.swing.JLabel();
        lbFacturaNo1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lbProducto = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lbProducto1 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        lbBodega = new javax.swing.JLabel();
        txtBodega = new javax.swing.JTextField();
        btnBusProd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnReimprimir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        pnlInvisible = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();

        popBorrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        popBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        popBorrar.setText("Borrar");
        popBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popBorrarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popBorrar);

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lbNit4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit4.setText("Tipo ajuste:");

        cmbTipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ajustes Entrada", "Ajuste Salida" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });

        lbNit3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit3.setText("Valor:");

        txtValor.setEditable(false);
        txtValor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtValor.setText("0");

        lbNoFactura.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbNoFactura.setForeground(new java.awt.Color(255, 0, 0));
        lbNoFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNoFactura.setText("3");
        lbNoFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbFacturaNo.setBackground(new java.awt.Color(204, 204, 204));
        lbFacturaNo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbFacturaNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFacturaNo.setText("Ajuste No.");
        lbFacturaNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbFacturaNo.setOpaque(true);

        txtModeloContable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtModeloContable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModeloContable.setName("combo"); // NOI18N
        txtModeloContable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloContableKeyReleased(evt);
            }
        });

        lbModeloContable.setBackground(new java.awt.Color(255, 255, 255));
        lbModeloContable.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbModeloContable.setText("M. Contable:");
        lbModeloContable.setOpaque(true);

        lbFacturaNo1.setBackground(new java.awt.Color(204, 204, 204));
        lbFacturaNo1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbFacturaNo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFacturaNo1.setText("Fecha Ajuste");
        lbFacturaNo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbFacturaNo1.setOpaque(true);

        txtFecha.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 0, 0));
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFacturaNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbModeloContable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtModeloContable)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(lbNit3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFacturaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbFacturaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbNoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbFacturaNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValor)
                            .addComponent(lbNit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTipo)
                            .addComponent(lbNit4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbModeloContable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloContable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbProducto.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbProducto.setText("Producto:");
        lbProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbProductoKeyReleased(evt);
            }
        });

        txtCodProducto.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtCodProducto.setName("combo"); // NOI18N
        txtCodProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodProductoKeyReleased(evt);
            }
        });

        tblProductos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Valor/Unit", "Cant", "Subtotal", "Iva %", "Iva", "Total", "Observaciones", "plu", "cant2", "Detalle", "Inv. Inicial", "Inv. Final", "idProd", "idSistema", "costo", "porcImpo", "impoconsumo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, true, true, false, true, false, false, false, false, false, false, true, true, true, true
            };

            boolean[] canEditDinamico = new boolean [] {
                false, false, true, false, false, true, true, false, true, false, false, false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                if(dinamico){
                    return canEdit [columnIndex];
                }else{
                    return canEditDinamico [columnIndex];
                }
            }
        });
        tblProductos.setComponentPopupMenu(jPopupMenu1);
        tblProductos.setRowHeight(27);
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblProductosMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProductosMousePressed(evt);
            }
        });
        tblProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProductosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(300);
            tblProductos.getColumnModel().getColumn(2).setMinWidth(80);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(2).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(3).setMinWidth(50);
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(3).setMaxWidth(50);
            tblProductos.getColumnModel().getColumn(4).setMinWidth(80);
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(4).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(5).setMinWidth(30);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(5).setMaxWidth(70);
            tblProductos.getColumnModel().getColumn(6).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(6).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(7).setMinWidth(80);
            tblProductos.getColumnModel().getColumn(7).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(7).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(8).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(8).setPreferredWidth(120);
            tblProductos.getColumnModel().getColumn(8).setMaxWidth(200);
            tblProductos.getColumnModel().getColumn(9).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(9).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(9).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(10).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(10).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(11).setMinWidth(150);
            tblProductos.getColumnModel().getColumn(11).setPreferredWidth(200);
            tblProductos.getColumnModel().getColumn(11).setMaxWidth(230);
            tblProductos.getColumnModel().getColumn(12).setMinWidth(75);
            tblProductos.getColumnModel().getColumn(12).setPreferredWidth(75);
            tblProductos.getColumnModel().getColumn(12).setMaxWidth(75);
            tblProductos.getColumnModel().getColumn(13).setMinWidth(75);
            tblProductos.getColumnModel().getColumn(13).setPreferredWidth(75);
            tblProductos.getColumnModel().getColumn(13).setMaxWidth(75);
            tblProductos.getColumnModel().getColumn(14).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(14).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(14).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(15).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(15).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(15).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(16).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(16).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(16).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(17).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(17).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(17).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(18).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(18).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(18).setMaxWidth(0);
        }

        lbProducto1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbProducto1.setText("Cant:");
        lbProducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbProducto1KeyReleased(evt);
            }
        });

        txtCant.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCant.setText("1");
        txtCant.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCant.setEnabled(false);
        txtCant.setName("combo"); // NOI18N
        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantKeyReleased(evt);
            }
        });

        lbBodega.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbBodega.setText("Bodega:");
        lbBodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbBodegaKeyReleased(evt);
            }
        });

        txtBodega.setBackground(new java.awt.Color(255, 204, 204));
        txtBodega.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtBodega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBodega.setText("123-22");
        txtBodega.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBodega.setName("combo"); // NOI18N
        txtBodega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBodegaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBodegaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBodegaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBodegaMouseReleased(evt);
            }
        });
        txtBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodegaActionPerformed(evt);
            }
        });
        txtBodega.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBodegaFocusGained(evt);
            }
        });
        txtBodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBodegaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBodegaKeyReleased(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbProducto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lbBodega)
                        .addGap(1, 1, 1)
                        .addComponent(txtBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lbProducto)
                        .addGap(2, 2, 2)
                        .addComponent(txtCodProducto)
                        .addGap(2, 2, 2)
                        .addComponent(btnBusProd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbProducto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCant, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBodega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBodega)
                    .addComponent(btnBusProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnReimprimir.setBackground(new java.awt.Color(247, 220, 111));
        btnReimprimir.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnReimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnReimprimir.setText("REIMPRIMIR");
        btnReimprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReimprimir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnReimprimir.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnReimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReimprimirActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLimpiar.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
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

        btnAnular.setBackground(new java.awt.Color(241, 148, 138));
        btnAnular.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png"))); // NOI18N
        btnAnular.setText("ANULAR");
        btnAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnular.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAnular.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReimprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnular)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnReimprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Imei", "Lote", "F.Vence", "Temp", "cant", "descripcion", "color", "talla", "estado", "plu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDetalle);
        if (tblDetalle.getColumnModel().getColumnCount() > 0) {
            tblDetalle.getColumnModel().getColumn(9).setResizable(false);
            tblDetalle.getColumnModel().getColumn(10).setResizable(false);
        }

        javax.swing.GroupLayout pnlInvisibleLayout = new javax.swing.GroupLayout(pnlInvisible);
        pnlInvisible.setLayout(pnlInvisibleLayout);
        pnlInvisibleLayout.setHorizontalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        pnlInvisibleLayout.setVerticalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInvisible, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void txtCodProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String codigo = txtCodProducto.getText();
            plu = true;
            cargarProducto(codigo.replace("'", "//"), txtCant.getText(), 1, "", "", "", "", "", "", "");
        } else if (evt.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            double cantidad = 1;
            try {
                cantidad = Double.parseDouble(txtCodProducto.getText().replace("*", ""));
            } catch (Exception e) {
            }
            txtCant.setText(String.valueOf(cantidad));
            if (txtCant.getText().substring(txtCant.getText().length() - 1, txtCant.getText().length()).equals("0")) {
                txtCant.setText(txtCant.getText().substring(0, txtCant.getText().length() - 2));
            }
            txtCodProducto.setText("");
        }
    }//GEN-LAST:event_txtCodProductoKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (tblProductos.getRowCount() == 0) {
            metodos.msgError(this, "No ha añadido ningun producto");
        } else {

            int xyz = tblProductos.getRowCount();
            if (xyz > 0) {
                for (int i = 0; i < xyz; i++) {
                    if (tblProductos.getValueAt(i, 3).equals("0")) {
                        metodos.msgError(this, "Las cantidades deben ser mayor a 0");
                        return;
                    }

                    if (big.getMoneda(tblProductos.getValueAt(i, 2).toString()).compareTo(BigDecimal.ZERO) <= 0) {
                        metodos.msgError(this, "Los valores deben ser mayor a " + this.simbolo + " 0");
                        return;
                    }

                    tblProductos.setColumnSelectionInterval(0, 0);
                    tblProductos.setRowSelectionInterval(i, i);
                    KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                    tblProductosKeyReleased(x);
                }
            }

            if (!saltarPasos) {
                if (metodos.msgPregunta(this, "¿Desea continuar?") != 0) {
                    return;
                }
            }

            String factura = "TRAS-" + instancias.getSql().getNumConsecutivo("TRAS")[0];

            //PROCESO GUARDAR REGISTRO EN CAJA
            String origen = "", destino = "";

            if (cmbTipo.getSelectedIndex() == 0) {
                origen = "123-11";
                destino = "123-22";
            } else {
                origen = "123-22";
                destino = "123-11";
            }

            Object[] vector = {factura, origen, destino, metodos.fechaConsulta(metodosGenerales.fecha()), cantidadTotal,
                big.getMoneda(txtValor.getText()), cmbTipo.getSelectedItem(),
                instancias.getUsuario(), instancias.getTerminal(), metodosGenerales.hora(), txtBodega.getText(), txtModeloContable.getText()};

            ndTraslado nodo = metodos.llenarTraslado(vector);

            if (!instancias.getSql().agregarTraslado(nodo)) {
                metodos.msgError(this, "Error al guardar el ajuste");
                return;
            }

            //PROCESO GUARDAR VENTA
            String baseUtilizada = "";
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                Object vectVenta[] = {factura, tblProductos.getValueAt(i, 15), tblProductos.getValueAt(i, 3),
                    big.getMoneda((String) tblProductos.getValueAt(i, 2)), big.getMoneda((String) tblProductos.getValueAt(i, 7)), tblProductos.getValueAt(i, 8),
                    tblProductos.getValueAt(i, 1), tblProductos.getValueAt(i, 9) + "", tblProductos.getValueAt(i, 10),
                    tblProductos.getValueAt(i, 14), tblProductos.getValueAt(i, 11), "", "", big.getMoneda((String) tblProductos.getValueAt(i, 4)),
                    big.getMoneda((String) tblProductos.getValueAt(i, 6)), big.getBigDecimal((String) tblProductos.getValueAt(i, 5)),
                    big.getMoneda((String) tblProductos.getValueAt(i, 16)), big.getBigDecimal((String) tblProductos.getValueAt(i, 17)),
                    big.getMoneda((String) tblProductos.getValueAt(i, 18))
                };

                ndProductoAjustes nodoTras = metodos.llenarAjustes(vectVenta);

                if (!instancias.getSql().agregarProductosAjustes(nodoTras)) {
                    metodos.msgError(this, "Error al guardar el ajuste");
                }

                baseUtilizada = obtenerBase();

                ndProducto producto;
                double cantidad = 0;
                double inventario = 0;
                double fisicoInventario = 0;
                double cantidadProd = nodoTras.getCantidad2();  //SE MODIFICA PARA VER SI ESTE ES EL ERROR Double.parseDouble(tblProductos.getValueAt(i, 3).toString().replace(",", "."));
                double total = 0;
                if (cmbTipo.getSelectedIndex() == 0) {
                    producto = instancias.getSql().getDatosProducto(tblProductos.getValueAt(i, 15).toString(), baseUtilizada);     
                    try {
                        cantidad = Double.parseDouble(producto.getAjusteEntrada().replace(",", "."));
                    } catch (Exception e) {
                        cantidad = 0;
                    }

                    try {
                        inventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    } catch (Exception e) {
                        inventario = 0;
                    }

                    try {
                        fisicoInventario = Double.parseDouble(producto.getFisicoInventario().replace(",", "."));
                    } catch (Exception e) {
                        fisicoInventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    }

                    inventario = inventario + Double.parseDouble(tblProductos.getValueAt(i, 10).toString());
                    fisicoInventario = fisicoInventario + Double.parseDouble(tblProductos.getValueAt(i, 10).toString());
                    total = cantidad + Double.parseDouble(tblProductos.getValueAt(i, 10).toString());

                    String total1 = String.valueOf(df.format(total)).replace(".", ",");
                    String inventario1 = String.valueOf(df.format(inventario)).replace(".", ",");
                    String fisicoInventario1 = String.valueOf(df.format(fisicoInventario)).replace(".", ",");

                    instancias.getSql().modificarInventario("ajusteEntrada", total1, tblProductos.getValueAt(i, 15).toString(), baseUtilizada);
                    instancias.getSql().modificarInventario("inventario", inventario1, tblProductos.getValueAt(i, 15).toString(), baseUtilizada);
                    instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, tblProductos.getValueAt(i, 15).toString(), baseUtilizada);
                } else {
                    producto = instancias.getSql().getDatosProducto(tblProductos.getValueAt(i, 15).toString(), baseUtilizada);
                    try {
                        cantidad = Double.parseDouble(producto.getAjusteSalida().replace(",", "."));
                    } catch (Exception e) {
                        cantidad = 0;
                    }

                    try {
                        inventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    } catch (Exception e) {
                        inventario = 0;
                    }

                    try {
                        fisicoInventario = Double.parseDouble(producto.getFisicoInventario().replace(",", "."));
                    } catch (Exception e) {
                        fisicoInventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    }

                    inventario = inventario - cantidadProd;
                    fisicoInventario = fisicoInventario - cantidadProd;
                    total = cantidad + cantidadProd;

                    String total1 = String.valueOf(df.format(total)).replace(".", ",");
                    String inventario1 = String.valueOf(df.format(inventario)).replace(".", ",");
                    String fisicoInventario1 = String.valueOf(df.format(fisicoInventario)).replace(".", ",");

                    instancias.getSql().modificarInventario("ajusteSalida", total1, tblProductos.getValueAt(i, 15).toString(), baseUtilizada);
                    instancias.getSql().modificarInventario("inventario", inventario1, tblProductos.getValueAt(i, 15).toString(), baseUtilizada);
                    instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, tblProductos.getValueAt(i, 15).toString(), baseUtilizada);

                    String cod = "";
                    try {
                        cod = tblProductos.getValueAt(i, 14).toString();
                    } catch (Exception e) {
                    }

                    if (!cod.equals("")) {
                        String tipo = "";

                        if (producto.getTipoProducto() != null) {
                            if (producto.getTipoProducto().equals("IMEI")) {
                                tipo = "Imei";
                            } else if (producto.getTipoProducto().equals("Fecha/Lote")) {
                                tipo = "Fecha/Lote";
                            } else if (producto.getTipoProducto().equals("Color")) {
                                tipo = "Color";
                            } else if (producto.getTipoProducto().equals("Serial")) {
                                tipo = "Serial";
                            } else if (producto.getTipoProducto().equals("Talla")) {
                                tipo = "Talla";
                            } else if (producto.getTipoProducto().equals("ColorTalla")) {
                                tipo = "ColorTalla";
                            } else if (producto.getTipoProducto().equals("SerialColor")) {
                                tipo = "SerialColor";
                            } else {
                                tipo = "";
                            }
                        }

                        if (tipo.equals("Imei") || tipo.equals("Serial") || tipo.equals("SerialColor")) {
                            instancias.getSql().modificarEstadoDetalleProductos(cod, "NO-DISPONIBLE");
                        } else {
                            Double cantidadActual = Double.parseDouble(instancias.getSql().getCantidadProductos(cod).replace(",", "."));
                            cantidadActual = cantidadActual - cantidadProd;
                            String cantidadFinal = String.valueOf(df.format(cantidadActual)).replace(".", ",");
                            instancias.getSql().modificarCantidadesDetalleProductos(cod, cantidadFinal);
                        }
                    }
                }
                
                
                  
            
            //inicio ajustar promedio
            Object[] ultimoPonderado = instancias.getSql().getUltimoPonderado(tblProductos.getValueAt(i, 15).toString());

            //CALCULAMOS LO QUE HABIA VIEJO
            double invAnt = big.formatDouble(producto.getInventario().replace(",", "."));

            double ponderadoViejo = 0;
            try {
                ponderadoViejo = big.formatDouble(big.getBigDecimal(ultimoPonderado[4].toString()));
            } catch (Exception e) {
            }

            double totalViejo;
            if (invAnt > 0) {
                totalViejo =  big.formatDouble(invAnt*ponderadoViejo);
            } else {
                totalViejo = 0;
            }

            //CALCULAMOS LO QUE ENTRA NUEVO
            double nuevoPrecio;
            double cant = big.formatDouble(tblProductos.getValueAt(i, 3).toString().replace(",", "."));
            double aa=0.0;
            if (instancias.getRegimen().equals("SinIva")) {
                nuevoPrecio = big.getMonedaToDouble(tblProductos.getValueAt(i, 2).toString()) / (big.getMonedaToDouble(tblProductos.getValueAt(i, 10).toString()) / cant);
            } else {
                if (cmbTipo.getSelectedIndex() == 0) {
                  String cantidadRRR =tblProductos.getValueAt(i, 2).toString();
                  String cantidadTTT =tblProductos.getValueAt(i, 10).toString();
                  double cantidadCCC = cant;
                  
                  //se cambia big.getMonedaToDouble por en Double.parseDouble en tblProductos.getValueAt(i, 10) porque en ocaciones lo multiplicaba por 10 el valor
                  nuevoPrecio = big.getMonedaToDouble(tblProductos.getValueAt(i, 2).toString()) / (Double.parseDouble(tblProductos.getValueAt(i, 10).toString()) / cant);
                    
                  aa= ((big.getMonedaToDouble(cantidadRRR)) / (Double.parseDouble(cantidadTTT) / cant));
                }else{
                  nuevoPrecio = big.formatDouble(big.getBigDecimal(ultimoPonderado[4].toString()));
                }
            }

            //nuevoPrecio = big.formatDouble(nuevoPrecio/cant);
            double totalNuevo = big.formatDouble(Double.parseDouble(tblProductos.getValueAt(i, 10).toString())*nuevoPrecio);

            //NUEVO PONDERADO
            double nuevoPonderado;

            if (invAnt <= 0) {
                nuevoPonderado = nuevoPrecio;
            } else {
                if (cmbTipo.getSelectedIndex() == 0) {
                 nuevoPonderado = (totalNuevo+totalViejo);
                 nuevoPonderado =  big.formatDouble(nuevoPonderado/inventario);
                }else{
                 nuevoPonderado = nuevoPrecio;
                }
            }
            if (!instancias.getSql().agregarPonderado(metodos.fechaConsulta(metodosGenerales.fechaHora()), producto.getIdSistema(),
                    big.getBigDecimal(ponderadoViejo), invAnt+"", cant+"",  big.getBigDecimal(nuevoPonderado),
                    String.valueOf(df.format(inventario)), instancias.getUsuario(), big.getBigDecimal(nuevoPrecio), factura)) {
                metodos.msgError(null, "Error al guardar el ponderado");
            }

                if (!instancias.getSql().modificarPonderado(metodos.fechaConsulta(metodosGenerales.fechaHora()), producto.getIdSistema(),
                    big.getBigDecimal(ponderadoViejo), String.valueOf(inventario), tblProductos.getValueAt(i, 3).toString(), big.getBigDecimal(nuevoPonderado),
                    String.valueOf(df.format(inventario)), instancias.getUsuario(), big.getBigDecimal(nuevoPrecio), factura)) {
                metodos.msgError(null, "Error al guardar el ponderado");
            }

            //fin ajustar promedio
            }
          

            if (cmbTipo.getSelectedIndex() == 0) {
                for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                    String cant = tblDetalle.getValueAt(i, 5).toString();
                    if (cant.equals("")) {
                        cant = "1.0";
                    }

                    String fecha = tblDetalle.getValueAt(i, 3).toString();
                    if (fecha.equals("")) {
                        fecha = metodosGenerales.fecha();
                    }

                    String conse = instancias.getSql().getNumConsecutivo("DETALLEPROD")[0].toString();
                    if (!verificaSerialesCreados(conse, tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(),
                            cant, tblDetalle.getValueAt(i, 1).toString(), tblDetalle.getValueAt(i, 2).toString(),
                            metodos.fechaConsulta(fecha), tblDetalle.getValueAt(i, 4).toString(), "DISPONIBLE", factura,
                            metodos.fechaConsulta(metodosGenerales.fecha()), metodosGenerales.hora(), instancias.getUsuario(), tblDetalle.getValueAt(i, 7).toString(),
                            tblDetalle.getValueAt(i, 8).toString(), txtBodega.getText(),cant,factura,i)) {
                        metodos.msgError(null, "Hubo un problema al guardar el detalle del producto");
                        return;
                    }

//                    if (!instancias.getSql().aumentarConsecutivo("DETALLEPROD", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("DETALLEPROD")[0]) + 1)) {
//                        metodos.msgError(null, "Error al guardar el consecutivo del detalle");
//                    }
                }
            }
            
            //CAMBIAR CONSECUTIVO FACTURA
//            if (!instancias.getSql().aumentarConsecutivo("TRAS", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("TRAS")[0]) + 1)) {
//                metodos.msgError(this, "Hubo un problema al guardar en el consecutivo del traslado");
//            }

            lbNoFactura.setText((String) instancias.getSql().getNumConsecutivoActual("TRAS")[0]);

            if (!saltarPasos) {
                metodos.msgExito(this, "Ajuste exitoso");
            }

            saltarPasos = false;

            if (metodos.msgPregunta(this, "¿Desea imprimir?") == 0) {
                String tipo = instancias.getImpresion();
                if (tipo.equals("pos")) {
                    tipo = "posAjustes";
                } else {
                    tipo = "ajustes";
                }
                instancias.getReporte().verAjustes(factura, tipo);
            }

            preguntaLimpiar = false;
            btnLimpiarActionPerformed(evt);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    /*
      funcion que valida si un detalle producto esta registrado si lo esta lo actuliza sino lo crea
    */
    public boolean verificaSerialesCreados(String conse, String codProducto, String descripcion, String cantidad, String imei, String lote, String fechaVence, String temp, String estado,
            String numIngreso, String fecha, String hora, String usuario, String color, String talla, String bodega, String cant, String factura, int i) {
        Object id[][] = instancias.getSql().getProductosDetalleSerial(codProducto, bodega, imei, lote, temp, color, talla, fechaVence);
        
        if (id.length == 0) {
            
            return (instancias.getSql().agregarDetalladoProducto(conse, tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(),
                    cant, tblDetalle.getValueAt(i, 1).toString(), tblDetalle.getValueAt(i, 2).toString(),
                    fechaVence, tblDetalle.getValueAt(i, 4).toString(), "DISPONIBLE", factura,
                    fecha, hora, instancias.getUsuario(), tblDetalle.getValueAt(i, 7).toString(),
                    tblDetalle.getValueAt(i, 8).toString(), txtBodega.getText()));
            
        } else {
            return (instancias.getSql().modificarCantidadesDetalleProductos(id[0][0].toString(), (Double.parseDouble(cant)+Double.parseDouble(id[0][1].toString().replace(",","."))+"")));             
        }
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        if (preguntaLimpiar) {
            if (metodos.msgPregunta(null, "¿Esta seguro de limpiar el ajuste?") != 0) {
                return;
            }
        }

        preguntaLimpiar = true;

        txtCant.setText(datos[87].toString());
        while (tblProductos.getRowCount() > 0) {
            modeloPro.removeRow(0);
        }

        while (tblDetalle.getRowCount() > 0) {
            modeloPro1.removeRow(0);
        }

        txtValor.setText(this.simbolo + " 0");
        cantidadTotal = "0";
        tblProductos.removeEditor();
        txtBodega.setText("123-22");
        lbNoFactura.setText((String) instancias.getSql().getNumConsecutivoActual("TRAS")[0]);

        if (instancias.getConfiguraciones().isPuc()) {
            Object[] informacion = instancias.getSql().getDatosPrefijosYModelos();
            if (cmbTipo.getSelectedIndex() == 0) {
                txtModeloContable.setText(informacion[11].toString());
            } else {
                txtModeloContable.setText(informacion[12].toString());
            }
        }

        guardarPreAjustes();
        guardarPreAjustesDetalle();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void popBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popBorrarActionPerformed
        if (tblProductos.getSelectedRow() > -1) {
            int fila = tblProductos.getSelectedRow();

            int num = tblDetalle.getRowCount();
            for (int i = num - 1; i >= 0; i--) {
                if (tblDetalle.getValueAt(i, 0).equals(tblProductos.getValueAt(fila, 15))) {
                    modeloPro1.removeRow(i);
                }
            }

            DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
            modelo.removeRow(fila);

            tblProductos.removeEditor();
            cargarTotales();
            guardarPreAjustes();
            guardarPreAjustesDetalle();
        } else {
            metodos.msgAdvertencia(this, "Seleccione un producto");
        }
    }//GEN-LAST:event_popBorrarActionPerformed

    private void btnReimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReimprimirActionPerformed
        String consecutivo = "TRAS-" + metodos.msgIngresarEnter(this, "Documento a reimprimir");
        if (consecutivo.equals("TRAS-")) {
            return;
        }

        boolean anulado = instancias.getSql().getDocumentoAnulado("bdTraslados", "Where id='" + consecutivo + "' ");

        if (anulado) {
            metodos.msgAdvertencia(this, "Este documento se encuentra anulado");
            return;
        }

        String tipo = instancias.getImpresion();
        if (tipo.equals("pos")) {
            tipo = "posAjustes";
        } else {
            tipo = "ajustes";
        }

        instancias.getReporte().verAjustes(consecutivo, tipo);
        if (instancias.getConfiguraciones().isProductosSerial()) {
            instancias.getReporte().verIngresoDetalle(consecutivo);
        }

    }//GEN-LAST:event_btnReimprimirActionPerformed

    private void lbProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCodProducto.requestFocus();
        }
    }//GEN-LAST:event_lbProductoKeyReleased

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        String consecutivo = "TRAS-" + metodos.msgIngresarEnter(this, "Documento a anular");
        if (consecutivo.equals("TRAS-")) {
            return;
        }

        try {
            boolean anulado = instancias.getSql().getDocumentoAnulado("bdTraslados", "Where id='" + consecutivo + "' ");
            if (anulado) {
                metodos.msgError(this, "El documento se encuentra anulado");
                return;
            }
        } catch (Exception e) {
            Logs.error(e);
            metodos.msgError(this, "El documento no existe");
            return;
        }

        if (metodos.msgPregunta(this, "¿Anular este ajuste?") == 0) {

            if (!instancias.getSql().anularDocumento(consecutivo, "bdTraslados")) {
                metodos.msgError(this, "Hubo un problema al anular el ajuste");
                return;
            }

            Object[][] Productos = instancias.getSql().getProductosAjuste(consecutivo);
            String origen = instancias.getSql().tipoAjuste(consecutivo);

            String baseUtilizada = "";
            try {
                baseUtilizada = instancias.getSql().getBodegaMovimiento(consecutivo, "bdTraslados");
            } catch (Exception e) {
                Logs.error(e);
            }

            if ("".equals(baseUtilizada)) {
                baseUtilizada = "123-22";
            }

            if (baseUtilizada.equals("123-22")) {
                baseUtilizada = "bdProductos";
            } else if (baseUtilizada.equals("BODEGA-1")) {
                baseUtilizada = "bdProductosBodega1";
            } else if (baseUtilizada.equals("BODEGA-2")) {
                baseUtilizada = "bdProductosBodega2";
            } else if (baseUtilizada.equals("BODEGA-3")) {
                baseUtilizada = "bdProductosBodega3";
            } else if (baseUtilizada.equals("BODEGA-4")) {
                baseUtilizada = "bdProductosBodega4";
            }

            if (origen.equals("123-11")) {
                for (Object[] Producto : Productos) {

                    ndProducto producto = instancias.getSql().getDatosProducto(Producto[0].toString(), baseUtilizada);
                    double cantidad;
                    double inventario;
                    double fisicoInventario;

                    try {
                        cantidad = Double.parseDouble(producto.getAjusteEntrada().replace(",", "."));
                    } catch (Exception e) {
                        cantidad = 0;
                    }

                    try {
                        inventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    } catch (Exception e) {
                        inventario = 0;
                    }

                    try {
                        fisicoInventario = Double.parseDouble(producto.getFisicoInventario().replace(",", "."));
                    } catch (Exception e) {
                        fisicoInventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    }

                    inventario = inventario - Double.parseDouble(Producto[1].toString());
                    fisicoInventario = fisicoInventario - Double.parseDouble(Producto[1].toString());
                    double total = cantidad - Double.parseDouble(Producto[1].toString());

                    String total1 = String.valueOf(df.format(total)).replace(".", ",");
                    String inventario1 = String.valueOf(df.format(inventario)).replace(".", ",");
                    String fisicoInventario1 = String.valueOf(df.format(fisicoInventario)).replace(".", ",");

                    instancias.getSql().modificarInventario("ajustentrada", total1, Producto[0].toString(), baseUtilizada);
                    instancias.getSql().modificarInventario("inventario", inventario1, Producto[0].toString(), baseUtilizada);
                    instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, Producto[0].toString(), baseUtilizada);
                }

                if (instancias.getConfiguraciones().isProductosSerial()) {
                    instancias.getSql().anularCompraDetalladoInventario(consecutivo);
                }

            } else {

                for (Object[] Producto : Productos) {
                    ndProducto producto = instancias.getSql().getDatosProducto(Producto[0].toString(), baseUtilizada);
                    double cantidad;
                    double inventario;
                    double fisicoInventario;

                    try {
                        cantidad = Double.parseDouble(producto.getAjusteSalida().replace(",", "."));
                    } catch (Exception e) {
                        cantidad = 0;
                    }

                    try {
                        inventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    } catch (Exception e) {
                        inventario = 0;
                    }

                    try {
                        fisicoInventario = Double.parseDouble(producto.getFisicoInventario().replace(",", "."));
                    } catch (Exception e) {
                        fisicoInventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    }

                    inventario = inventario + Double.parseDouble(Producto[1].toString());
                    fisicoInventario = fisicoInventario + Double.parseDouble(Producto[1].toString());
                    double total = cantidad - Double.parseDouble(Producto[1].toString());

                    String total1 = String.valueOf(df.format(total)).replace(".", ",");
                    String inventario1 = String.valueOf(df.format(inventario)).replace(".", ",");
                    String fisicoInventario1 = String.valueOf(df.format(fisicoInventario)).replace(".", ",");

                    instancias.getSql().modificarInventario("ajusteSalida", total1, Producto[0].toString(), baseUtilizada);
                    instancias.getSql().modificarInventario("inventario", inventario1, Producto[0].toString(), baseUtilizada);
                    instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, Producto[0].toString(), baseUtilizada);

                    String idProd = "";

                    try {
                        idProd = Producto[2].toString();
                    } catch (Exception e) {
                    }

                    String tipo = "";
                    if (producto.getTipoProducto() != null) {
                        if (producto.getTipoProducto().equals("IMEI")) {
                            tipo = "Imei";
                        } else if (producto.getTipoProducto().equals("Fecha/Lote")) {
                            tipo = "Fecha/Lote";
                        } else if (producto.getTipoProducto().equals("Color")) {
                            tipo = "Color";
                        } else if (producto.getTipoProducto().equals("Serial")) {
                            tipo = "Serial";
                        } else if (producto.getTipoProducto().equals("Talla")) {
                            tipo = "Talla";
                        } else if (producto.getTipoProducto().equals("ColorTalla")) {
                            tipo = "ColorTalla";
                        } else if (producto.getTipoProducto().equals("SerialColor")) {
                            tipo = "SerialColor";
                        } else {
                            tipo = "";
                        }
                    }

                    if (!idProd.equals("")) {
                        if (tipo.equals("Imei") || tipo.equals("Serial") || tipo.equals("SerialColor")) {
                            instancias.getSql().modificarEstadoDetalleProductos(idProd, "DISPONIBLE");
                        } else {
                            Double cantidadActual = Double.parseDouble(instancias.getSql().getCantidadProductos(idProd).replace(",", "."));
                            cantidadActual = cantidadActual + Double.parseDouble(Producto[1].toString());
                            String cantidadFinal = String.valueOf(df.format(cantidadActual)).replace(".", ",");
                            instancias.getSql().modificarCantidadesDetalleProductos(idProd, cantidadFinal);
                        }
                    }
                }
            }
            metodos.msgExito(this, "Ajuste anulado con éxito");
        }
    }//GEN-LAST:event_btnAnularActionPerformed

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        consultarPermiso();

        if (instancias.getConfiguraciones().isPuc()) {
            Object[] informacion = instancias.getSql().getDatosPrefijosYModelos();
            if (cmbTipo.getSelectedIndex() == 0) {
                txtModeloContable.setText(informacion[11].toString());
            } else {
                txtModeloContable.setText(informacion[12].toString());
            }
        }

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            calcularFila(i);
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
       String baseUtilizada = obtenerBase();
       ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(tblProductos.getSelectedRow(), 15).toString(), baseUtilizada);

        if(nodo.getTipoProducto() != null && nodo.getTipoProducto()!= ""){
            this.dinamico = false;
        }else{
            this.dinamico = true;
        }
        
        if (tblProductos.getSelectedColumn() == 3) {

            
            String tipo = "";
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

            int contador = 0;
            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                if (tblProductos.getValueAt(tblProductos.getSelectedRow(), 15).equals(tblDetalle.getValueAt(i, 0))) {
                    contador++;
                }
            }

            Object[][] productos = new Object[contador][9];

            int xyz = 0;
            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                
                if (tblProductos.getValueAt(tblProductos.getSelectedRow(), 15).equals(tblDetalle.getValueAt(i, 0))) {
                    productos[xyz][0] = tblDetalle.getValueAt(i, 1);
                    productos[xyz][1] = tblDetalle.getValueAt(i, 2);
                    productos[xyz][2] = tblDetalle.getValueAt(i, 3);
                    productos[xyz][3] = tblDetalle.getValueAt(i, 4);
                    productos[xyz][4] = tblDetalle.getValueAt(i, 5);
                    productos[xyz][5] = tblDetalle.getValueAt(i, 7);
                    productos[xyz][6] = tblDetalle.getValueAt(i, 8);
                    productos[xyz][7] = "1";//sw estado que el serial esta almacenado en bd
                    productos[xyz][8] = tblDetalle.getValueAt(i, 10);
                    
                    xyz++;
                }
            }

            String tipoMov = "";
            if (cmbTipo.getSelectedIndex() == 0) {
                tipoMov = "Entrada";
            } else {
                tipoMov = "Salida";
            }

            if (!tipo.equals("")) {
                
                dlgCompraDetallada1 compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), productos, tipoMov, "ajusteInv", baseUtilizada, "");
                compraDetallada.setLocationRelativeTo(null);
                compraDetallada.setVisible(true);
            }
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void tblProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseEntered

    }//GEN-LAST:event_tblProductosMouseEntered

    private void tblProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMousePressed

    }//GEN-LAST:event_tblProductosMousePressed

    private void tblProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductosKeyReleased
       String baseUtilizada = obtenerBase();
       ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(tblProductos.getSelectedRow(), 15).toString(), baseUtilizada);

        if(nodo.getTipoProducto() != null && nodo.getTipoProducto()!= ""){
            this.dinamico = false;
            
        }else{
            this.dinamico = true;

        }

        int fila = tblProductos.getSelectedRow();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calcularFila(fila);
        }
    }//GEN-LAST:event_tblProductosKeyReleased

    private void lbProducto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbProducto1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbProducto1KeyReleased

    private void txtCantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantKeyReleased

    private void lbBodegaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbBodegaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbBodegaKeyReleased

    private void txtBodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBodegaMouseClicked
        if (txtBodega.isEnabled()) {
            if (!txtBodega.getText().equals("")) {
                if (tblProductos.getRowCount() > 0) {
                    if (metodos.msgPregunta(null, "¿Limpiar el ajuste?") != 0) {
                        txtCodProducto.requestFocus();
                        return;
                    } else {
                        while (tblProductos.getRowCount() > 0) {
                            modeloPro.removeRow(0);
                        }
                        guardarPreAjustes();
                    }
                }
            }
        }
    }//GEN-LAST:event_txtBodegaMouseClicked

    private void txtBodegaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBodegaMouseEntered

    }//GEN-LAST:event_txtBodegaMouseEntered

    private void txtBodegaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBodegaMousePressed
        if (txtBodega.isEnabled()) {
            if (!txtBodega.getText().equals("")) {
                if (tblProductos.getRowCount() > 0) {
                    if (metodos.msgPregunta(null, "¿Limpiar el ajuste?") != 0) {
                        txtCodProducto.requestFocus();
                        return;
                    } else {
                        while (tblProductos.getRowCount() > 0) {
                            modeloPro.removeRow(0);
                        }
                        guardarPreAjustes();
                    }
                }
            }
        }
    }//GEN-LAST:event_txtBodegaMousePressed

    private void txtBodegaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBodegaMouseReleased
        if (txtBodega.isEnabled()) {
            if (!txtBodega.getText().equals("")) {
                if (tblProductos.getRowCount() > 0) {
                    if (metodos.msgPregunta(null, "¿Limpiar el ajuste?") != 0) {
                        txtCodProducto.requestFocus();
                        return;
                    } else {
                        while (tblProductos.getRowCount() > 0) {
                            modeloPro.removeRow(0);
                        }
                        guardarPreAjustes();
                    }
                }
            }
        }
    }//GEN-LAST:event_txtBodegaMouseReleased

    private void txtBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodegaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodegaActionPerformed

    private void txtBodegaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBodegaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodegaFocusGained

    private void txtBodegaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBodegaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodegaKeyPressed

    private void txtBodegaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBodegaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtBodega.getText().equals("")) {
                ventanaBodegas("");
            } else {
                txtCodProducto.requestFocus();
            }
        } else {
            txtBodega.setText("");
            if (tblProductos.getRowCount() > 0) {
                while (tblProductos.getRowCount() > 0) {
                    modeloPro.removeRow(0);
                }
            }
        }
    }//GEN-LAST:event_txtBodegaKeyReleased

    private void btnBusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProdActionPerformed
        ventanaProductos("");
    }//GEN-LAST:event_btnBusProdActionPerformed

    private void txtModeloContableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloContableKeyReleased
        if (txtModeloContable.getText().length() > 8) {
            txtModeloContable.setText(txtModeloContable.getText().substring(0, 8));
        }
    }//GEN-LAST:event_txtModeloContableKeyReleased

    public void eliminarRegistros(String codigo) {
        for (int i = tblDetalle.getRowCount() - 1; i >= 0; i--) {
            if (tblDetalle.getValueAt(i, 0).equals(codigo)) {
                modeloPro1.removeRow(i);
            }
        }

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            if (tblProductos.getValueAt(i, 15).equals(codigo)) {
                modeloPro.removeRow(i);
            }
        }
    }

    public String obtenerBase() {
        String baseUtilizada = txtBodega.getText();
        if (instancias.getConfiguraciones().isInventarioBodegas()) {
            if (baseUtilizada.equals("123-22")) {
                baseUtilizada = "bdProductos";
            } else if (baseUtilizada.equals("BODEGA-1")) {
                baseUtilizada = "bdProductosBodega1";
            } else if (baseUtilizada.equals("BODEGA-2")) {
                baseUtilizada = "bdProductosBodega2";
            } else if (baseUtilizada.equals("BODEGA-3")) {
                baseUtilizada = "bdProductosBodega3";
            } else if (baseUtilizada.equals("BODEGA-4")) {
                baseUtilizada = "bdProductosBodega4";
            }
        } else {
            baseUtilizada = "bdProductos";
        }
        return baseUtilizada;
    }

    public void ventanaBodegas(String nit) {
        buscBodegas buscar = new buscBodegas(instancias.getMenu(), true, "INTERNA");
        buscar.setLocationRelativeTo(null);
        instancias.setBuscBodegas(buscar);
        instancias.setCampoActual(txtBodega);
        txtBodega.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void calcularFila(int fila) {

        BigDecimal valor, cantidad, subtotal, total, iva, impoconsumo, totalIva, totalImpoconsumo;
        valor = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 2)));
        tblProductos.setValueAt(big.setMoneda(valor), fila, 2);

        String baseUtilizada = obtenerBase();
        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 15).toString(), baseUtilizada);

        if (nodo.getTipoProducto() != null) {
            if (nodo.getTipoProducto().equals("Serial") || nodo.getTipoProducto().equals("IMEI")) {
                // = BigDecimal.ONE;//SE COMENGTA PORQUE POR DEFECTO PONE UN 1
                cantidad = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 3)).replace(".", ","));
            } else {
                cantidad = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 3)).replace(".", ","));
            }
        } else {
            cantidad = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 3)).replace(".", ","));
        }

        iva = big.getBigDecimal(tblProductos.getValueAt(fila, 5));
        impoconsumo = big.getBigDecimal(tblProductos.getValueAt(fila, 17));

        subtotal = valor.multiply(cantidad);

        tblProductos.setValueAt(big.setMoneda(subtotal), fila, 4);

        totalIva = subtotal.multiply(iva).divide(big.getBigDecimal("100"), 2, RoundingMode.CEILING);
        tblProductos.setValueAt(big.setMoneda(totalIva), fila, 6);

        totalImpoconsumo = subtotal.multiply(impoconsumo).divide(big.getBigDecimal("100"), 2, RoundingMode.CEILING);
        tblProductos.setValueAt(big.setMoneda(totalImpoconsumo), fila, 18);

        total = totalIva.add(totalImpoconsumo).add(subtotal);
        tblProductos.setValueAt(big.setMoneda(total), fila, 7);

        tblProductos.setValueAt(cantidad, fila, 3);

        switch (tblProductos.getValueAt(fila, 9).toString()) {
            case "1":
                tblProductos.setValueAt(cantidad, fila, 10);
                break;
            case "2":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(nodo.getCantidad2())), fila, 10);
                break;
            case "3":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(nodo.getCantidad3())), fila, 10);
                break;
            case "4":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(nodo.getCantidad4())), fila, 10);
                break;
            case "5":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(nodo.getCantidad5())), fila, 10);
                break;
            case "6":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(nodo.getCantidad6())), fila, 10);
                break;
            case "7":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(nodo.getCantidad7())), fila, 10);
                break;
            case "8":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(nodo.getCantidad8())), fila, 10);
                break;
        }

        if (tblProductos.getSelectedColumn() == 3) {          
            tblProductos.editCellAt(tblProductos.getSelectedRow(), 5);
            tblProductos.setColumnSelectionInterval(5, 5);
            tblProductos.transferFocus();
        } else if (tblProductos.getSelectedColumn() == 5) {
            txtCodProducto.requestFocus();
        }

        if (cmbTipo.getSelectedIndex() == 0) {
            BigDecimal num1 = big.getMoneda(tblProductos.getValueAt(fila, 12).toString());
            BigDecimal num2 = big.getBigDecimal(tblProductos.getValueAt(fila, 3).toString().replace(",", "."));
            BigDecimal totales = num1.add(num2);
            tblProductos.setValueAt(big.setNumero(totales), fila, 13);
        } else if (cmbTipo.getSelectedIndex() == 1) {
            BigDecimal num1 = big.getMoneda(tblProductos.getValueAt(fila, 12).toString());
            BigDecimal num2 = big.getBigDecimal(tblProductos.getValueAt(fila, 3).toString().replace(",", "."));
            BigDecimal totales = num1.subtract(num2);
            tblProductos.setValueAt(big.setNumero(totales), fila, 13);
        }

//            tblProductos.getSelectionModel().setSelectionInterval(tblProductos.getSelectionModel().getMinSelectionIndex() - 1, tblProductos.getSelectionModel().getMinSelectionIndex() - 1);          
        cargarTotales();
        guardarPreAjustes();
        guardarPreAjustesDetalle();
    }

    public void cargarProductoPreAjuste() {
        Object[][] mat1 = instancias.getSql().getProductosPrecompraDetalle("AJUS");
        for (Object[] reg : mat1) {
            modeloPro1.addRow(new Object[]{reg[0], reg[3], reg[4], metodos.fecha(reg[5].toString()), reg[6], reg[2], reg[1], reg[7], reg[8],"1",reg[9]});
        }

        Object[][] mat = instancias.getSql().getProductosPrecompra("AJUS",instancias.getUsuario());

        for (Object[] reg : mat) {
            cargarProducto1((String) reg[0], new Double((String) reg[1]) + "", Integer.parseInt((String) reg[3]), reg[8].toString());
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(reg[5])), tblProductos.getRowCount() - 1, 2);
            tblProductos.setValueAt(reg[8], tblProductos.getRowCount() - 1, 14);

            KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
            tblProductosKeyReleased(x);
        }
    }

    public void guardarPreAjustes() {
        boolean noPuedaGuardar = false;
        while (!noPuedaGuardar) {
            noPuedaGuardar = instancias.getSql().eliminarPrecompra("AJUS");
        }

        for (int i = 0; i < tblProductos.getRowCount(); i++) {

            Object vectCompra[] = {
                "AJUS", tblProductos.getValueAt(i, 15), big.getMoneda((String) tblProductos.getValueAt(i, 2)), tblProductos.getValueAt(i, 3), "0",
                big.getMoneda((String) tblProductos.getValueAt(i, 7)), big.getMoneda((String) tblProductos.getValueAt(i, 6)),
                big.getMoneda((String) tblProductos.getValueAt(i, 4)), tblProductos.getValueAt(i, 5), tblProductos.getValueAt(i, 1),
                tblProductos.getValueAt(i, 9) + "", tblProductos.getValueAt(i, 10), big.getMoneda((String) tblProductos.getValueAt(i, 2)),
                tblProductos.getValueAt(i, 14).toString(), "0", "0",instancias.getUsuario()
            };

            ndCompra nodoComp = metodos.llenarCompra(vectCompra);
            
            if (!instancias.getSql().agregarPrecompra(nodoComp)) {
                metodos.msgError(null, "Hubo un problema al guardar la precompra");
            }
        }
    }

    public void guardarPreAjustesDetalle() {
        boolean noPuedaGuardar = false;
        while (!noPuedaGuardar) {
            noPuedaGuardar = instancias.getSql().eliminarPrecompraDetalle("AJUS");
        }

        for (int i = 0; i < tblDetalle.getRowCount(); i++) {
            String cant = tblDetalle.getValueAt(i, 5).toString();
            if (cant.equals("")) {
                cant = "1.0";
            }

            String fecha = tblDetalle.getValueAt(i, 3).toString();
            if (fecha.equals("")) {
                fecha = metodosGenerales.fecha();
            }

            if (!instancias.getSql().agregarPreCompraDetallada("AJUS", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(),
                    cant, tblDetalle.getValueAt(i, 1).toString(), tblDetalle.getValueAt(i, 2).toString(),
                    metodos.fechaConsulta(fecha), tblDetalle.getValueAt(i, 4).toString(), tblDetalle.getValueAt(i, 7).toString(),
                    tblDetalle.getValueAt(i, 8).toString(),0)) { //se coloca cero en el plu mientras se arregla ajustes
                metodos.msgError(null, "Error al guardar detalle del ajuste");
            }
        }
    }
    
    public void cargarProducto(String codigo, String cantidad, int plu, String imei, String lote, String idProd, String talla, String color,
            String temp, String fechaVence) {

        tblProductos.removeEditor();

        ndProducto nodo = null;

        String baseUtilizada = obtenerBase();
        String codigoProd = "";
        if (codigo.equals("")) {
            codigoProd = "";
        } else {
            Object[][] listado = instancias.getSql().getCodigosRelacionados(codigo, " where codigo");
            if (listado.length > 0) {
                codigo = listado[0][0].toString();
            }

            nodo = instancias.getSql().getDatosProducto(codigo, baseUtilizada);
            if (nodo.getIdSistema() != null) {
                codigoProd = nodo.getIdSistema();
            }
        }

        if (!codigoProd.equals("")) {

            if (instancias.getSql().getProdActivo(nodo.getCodigo())) {
                metodos.msgError(null, "Este producto esta inactivo");
                lbProducto.requestFocus();
                return;
            }

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

            String tipoMov = "", tipoLugar = "";
            if (cmbTipo.getSelectedIndex() == 0) {
                tipoMov = "Entrada";
                tipoLugar = "ajusteInv";
            } else {
                tipoMov = "Salida";
                tipoLugar = "ajusteInv1";
            }

            if (!tipo.equals("") && idProd.equals("")) {
                 //se cargan productos que tengan serial para saber cuanto queda de stock
               
                 Map<String, Double> map = new HashMap<String, Double>();
                 
                 //cuando es un ajuste de salida tenga en cuenta la cantidad del que ya tiene en la tabla final tblProductos
                if (cmbTipo.getSelectedIndex() == 1) {
                    for (int h = 0; h < tblProductos.getRowCount(); h++) {
                        
                        if (tblProductos.getValueAt(h, 15).equals(codigo) && Integer.parseInt(tblProductos.getValueAt(h, 14).toString()) > 0) {
                            double cantIngresada = Double.parseDouble(tblProductos.getValueAt(h, 10).toString());
                           
                            String codigoProducto=tblProductos.getValueAt(h, 14).toString();
                             if(map.containsKey(codigoProducto)){
                                 double cantidadAlmacenada = Double.parseDouble(map.get(codigoProducto).toString());
                              
                                 map.put(codigoProducto, (cantidadAlmacenada+cantIngresada));
                             }else{
                                 map.put(tblProductos.getValueAt(h, 14).toString(), cantIngresada); 
                             }                   
                        }
                    }
                }
                 
                 
                 boolean ingresado=false;
                 dlgCompraDetallada1 compraDetallada =null;
                 ArrayList<Map<String, String>> existenciasList = new ArrayList<Map<String, String>>();
                 existenciasList = instancias.getSql().getProductos(codigo, baseUtilizada);
                 int contador = 0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        if (nodo.getIdSistema().equals(tblDetalle.getValueAt(i, 0))) {
                            contador++;
                        }
                 }
                 Object[][] productos = new Object[contador][9];
                  int xyz = 0;
                 for (int i = 0; i < tblDetalle.getRowCount(); i++) {                   
               
                     if (tblDetalle.getValueAt(i, 0).equals(nodo.getIdSistema())) {
                            ingresado=true;
                            productos[xyz][0] = tblDetalle.getValueAt(i, 1);
                            productos[xyz][1] = tblDetalle.getValueAt(i, 2);                            
                            if (tblDetalle.getValueAt(i, 9).equals("1")) {
                                cantidad = tblDetalle.getValueAt(i, 5).toString();
                            } else {
                               String CantidadPlu="1";
                                if(!(tblDetalle.getValueAt(i, 9).equals("0") || tblDetalle.getValueAt(i, 9).equals(null))){
                                 CantidadPlu = existenciasList.get(0).get("cantidad" + tblDetalle.getValueAt(i, 10));
                                }
                                cantidad = "" + (Double.parseDouble(tblDetalle.getValueAt(i, 5).toString()) / Double.parseDouble(CantidadPlu));
                            }
                            productos[xyz][2] = tblDetalle.getValueAt(i, 3);
                            productos[xyz][3] = tblDetalle.getValueAt(i, 4);
                            productos[xyz][4] = cantidad;                            
                            productos[xyz][5] = tblDetalle.getValueAt(i, 7);
                            productos[xyz][6] = tblDetalle.getValueAt(i, 8);
                            productos[xyz][7] = "1";//sw estado que el serial esta almacenado en bd
                            productos[xyz][8] = tblDetalle.getValueAt(i, 10);//plu
                            xyz++;
                     }
                 }
                if (ingresado) {
                    compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), productos, tipoMov, tipoLugar, baseUtilizada, txtBodega.getText());
                } else {
                    if(map.size()>0){
                      //constructor para enviar la cantidad ya seleccionada de los productos para que realice la resta al stock   
                     compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), null, tipoMov, tipoLugar, baseUtilizada, txtBodega.getText(),map);
                    }else{
                     compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), null, tipoMov, tipoLugar, baseUtilizada, txtBodega.getText());
                    }
                }
                
                compraDetallada.setLocationRelativeTo(null);
                compraDetallada.setVisible(true);
                return;
            } else {
                if (this.plu) {
                    this.plu = false;
                    int cant = 0;
                    if (nodo.isPlu2()) {
                        cant++;
                    }
                    if (nodo.isPlu3()) {
                        cant++;
                    }
                    if (nodo.isPlu4()) {
                        cant++;
                    }
                    if (nodo.getPlu5()) {
                        cant++;
                    }
                    if (nodo.getPlu6()) {
                        cant++;
                    }
                    if (nodo.getPlu7()) {
                        cant++;
                    }
                    if (nodo.getPlu8()) {
                        cant++;
                    }

                    if (cant > 0) {
                        seleccionarPLU pluu = new seleccionarPLU(null, true, baseUtilizada);
                        pluu.setInstancias(instancias, nodo.getCodigo(),null);
                        pluu.setOpc("ajuste");
                        pluu.setVisible(true);
                        return;
                    }
                }
                String cant;
                //PODRIA IR VALIDACION DE LOTE CONSULTAR CANTIDAD
                if (!tipo.equals("")) {
//                    if (nodo.getTipoProd().equals("Fecha/Lote")) {
                   cant = instancias.getSql().getCantidadProductos(idProd).replace(".", ",");
                        //cantidad del lote
//                    }
                }else{
                    cant = nodo.getFisicoInventario();
                    cant = cant.replace(".", ",");                    
                }
                double cant2 = 1;
                String desc = nodo.getDescripcion();

                switch (plu) {
                    case 2:
                        cant2 = big.formatDouble(nodo.getCantidad2());
                        desc = nodo.getDescripcion2();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad2()), 2, RoundingMode.HALF_DOWN);
                        break;
                    case 3:
                        cant2 = big.formatDouble(nodo.getCantidad3());
                        desc = nodo.getDescripcion3();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad3()), 2, RoundingMode.HALF_DOWN);
                        break;
                    case 4:
                        cant2 = big.formatDouble(nodo.getCantidad4());
                        desc = nodo.getDescripcion4();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad4()), 2, RoundingMode.HALF_DOWN);
                        break;
                    case 5:
                        cant2 = big.formatDouble(nodo.getCantidad5());
                        desc = nodo.getDescripcion5();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad5()), 2, RoundingMode.HALF_DOWN);
                        break;
                    case 6:
                        cant2 = big.formatDouble(nodo.getCantidad6());
                        desc = nodo.getDescripcion6();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad6()), 2, RoundingMode.HALF_DOWN);
                        break;
                    case 7:
                        cant2 = big.formatDouble(nodo.getCantidad7());
                        desc = nodo.getDescripcion7();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad7()), 2, RoundingMode.HALF_DOWN);
                        break;
                    case 8:
                        cant2 = big.formatDouble(nodo.getCantidad8());
                        desc = nodo.getDescripcion8();
                        cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad8()), 2, RoundingMode.HALF_DOWN);
                        break;
                }

                double res = 1;
                if (cmbTipo.getSelectedIndex() == 0) {
                    res = big.formatDouble(cant.replace(",", "."))+ (big.formatDouble(cantidad.replace(",", ".")) * cant2);
                } else {
                    res = (big.formatDouble(cant.replace(",", "."))* cant2) - (big.formatDouble(cantidad.replace(",", ".")) * cant2);
                }

                Object[] pond = instancias.getSql().getUltimoPonderado(nodo.getIdSistema());
                double ponderado;

                try {
                    ponderado = big.formatDouble(pond[4].toString());
                } catch (Exception e) {
                    ponderado = 0;
                }
                
                double iva = 0;
                try {
                    iva = big.formatDouble(nodo.getIva());
                } catch (Exception e) {
                }

                double impoconsumo = 0;
                try {
                    iva = big.formatDouble(nodo.getIva());
                } catch (Exception e) {
                }

                double subtotal = big.formatDouble(ponderado * cant2);

                double totalIva = big.formatDouble(subtotal * (iva/100));
                double totalImpoconsumo = big.formatDouble(subtotal*(impoconsumo/100));

                double total = subtotal + totalIva;

                String detalle = "";
                if (!imei.equals("")) {
                    detalle = imei;
                }

                if (!color.equals("")) {
                    if (detalle.equals("")) {
                        detalle = color;
                    } else {
                        detalle = detalle + "-" + color;
                    }
                }

                if (!talla.equals("")) {
                    if (detalle.equals("")) {
                        detalle = talla;
                    } else {
                        detalle = detalle + "-" + talla;
                    }
                }

                if (!lote.equals("")) {
                    detalle = lote;
                }

                if (!fechaVence.equals("")) {
                    if (detalle.equals("")) {
                        detalle = fechaVence;
                    } else {
                        detalle = detalle + "-" + fechaVence;
                    }
                }
                modeloPro.addRow(new Object[]{nodo.getCodigo(), desc, big.setMoneda(subtotal), cantidad.replace(".", ","),
                    big.setMoneda(subtotal * big.formatDouble(cantidad.replace(",", "."))), nodo.getIva(), big.setMoneda(totalIva), big.setMoneda(total* big.formatDouble(cantidad.replace(",", "."))),
                    "", plu, cant2, detalle, big.setNumero(big.getMoneda(cant.replace(".", ","))),
                    big.setNumero(res), idProd, nodo.getIdSistema(), big.setMoneda(ponderado), nodo.getImpoconsumoVenta(), big.setMoneda(totalImpoconsumo), codigo});
             
                tblProductos.setColumnSelectionInterval(5, 5);
                tblProductos.setRowSelectionInterval(tblProductos.getRowCount() - 1, tblProductos.getRowCount() - 1);
                tblProductos.editCellAt(tblProductos.getRowCount() - 1, 2);
                tblProductos.transferFocus();
                txtCodProducto.setText("");

                txtCant.setText(datos[87].toString());
                return;
            }
        }
        ventanaProductos(codigo);
    }

    public void cargarProducto1(String codigo, String cantidad, int plu, String idProd) {
       cantidad=cantidad.replace(".", ",");
        ArrayList<String> almacenaLotes = new ArrayList<String>();
        for (int j = 0; j < tblProductos.getRowCount(); j++) {

            if (codigo.equalsIgnoreCase((String) modeloPro.getValueAt(j, 15)) && (plu + "").equals(((int) modeloPro.getValueAt(j, 9)) + "")) {
                double suma = 0.0;
                for (int z = 0; z < modeloPro1.getRowCount(); z++) {
                    if (modeloPro1.getValueAt(z, 9).toString().equals("0")) {
                        almacenaLotes.add(modeloPro1.getValueAt(z, 2).toString());
                        suma += Double.parseDouble(modeloPro1.getValueAt(z, 5).toString().replace(",", "."));
                    }
                }
                if (suma > 0) {
                    tblProductos.setValueAt((cantidad + "").replace(".", ","), j, 3);
                    calcularFila(j);
//                    calcularTablaPreCompraValores();
//                    guardarPrecompra();
                    return;
                }
            }
        }     
        
        
        
        tblProductos.removeEditor();

        ndProducto nodo = null;

        String baseUtilizada = obtenerBase();
        String codigoProd = "";
        if (codigo.equals("")) {
            codigoProd = "";
        } else {
            Object[][] listado = instancias.getSql().getCodigosRelacionados(codigo, " where codigo");
            if (listado.length > 0) {
                codigo = listado[0][0].toString();
            }
            nodo = instancias.getSql().getDatosProducto(codigo, baseUtilizada); //entro
            if (nodo.getIdSistema() != null) {
                codigoProd = nodo.getIdSistema();//entro
            }
        }

        if (!codigoProd.equals("")) {
            if (instancias.getSql().getProdActivo(nodo.getIdSistema())) {
                metodos.msgError(null, "Este producto esta inactivo");
                lbProducto.requestFocus();
                return;
            }

            if (this.plu) {
                this.plu = false;
                int cant = 0;
                if (nodo.isPlu2()) {
                    cant++;
                }
                if (nodo.isPlu3()) {
                    cant++;
                }
                if (nodo.isPlu4()) {
                    cant++;
                }
                if (nodo.getPlu5()) {
                    cant++;
                }
                if (nodo.getPlu6()) {
                    cant++;
                }
                if (nodo.getPlu7()) {
                    cant++;
                }
                if (nodo.getPlu8()) {
                    cant++;
                }

                if (cant > 0) {
                    seleccionarPLU pluu = new seleccionarPLU(null, true, baseUtilizada);
                    pluu.setInstancias(instancias, nodo.getIdSistema(),null);
                    pluu.setOpc("ajuste");
                    pluu.setVisible(true);
                    return;
                }
            }
            String cant;
            String stockInicial;
            String stockFinal;
            
            if(nodo.getTipoProducto() != null){
                if(!nodo.getTipoProducto().toString().equals("") && cmbTipo.getSelectedIndex() == 1){
                   cant = instancias.getSql().getCantidadProductos(idProd).replace(".", ",");
                }else{
               cant = nodo.getFisicoInventario();//entro
                }
            }else{
               cant = nodo.getFisicoInventario();
            }
            
            cant = cant.replace(".", ",");
            
            String cant2 = "1";
            String desc = nodo.getDescripcion();

            switch (plu) {
                case 2:
                    cant2 = nodo.getCantidad2();
                    desc = nodo.getDescripcion2();
                    cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad2()), 2, RoundingMode.HALF_DOWN);
                    break;
                case 3:
                    cant2 = nodo.getCantidad3();
                    desc = nodo.getDescripcion3();
                    cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad3()), 2, RoundingMode.HALF_DOWN);
                    break;
                case 4:
                    cant2 = nodo.getCantidad4();
                    desc = nodo.getDescripcion4();
                    cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad4()), 2, RoundingMode.HALF_DOWN);
                    break;
                case 5:
                    cant2 = nodo.getCantidad5();
                    desc = nodo.getDescripcion5();
                    cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad5()), 2, RoundingMode.HALF_DOWN);
                    break;
                case 6:
                    cant2 = nodo.getCantidad6();
                    desc = nodo.getDescripcion6();
                    cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad6()), 2, RoundingMode.HALF_DOWN);
                    break;
                case 7:
                    cant2 = nodo.getCantidad7();
                    desc = nodo.getDescripcion7();
                    cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad7()), 2, RoundingMode.HALF_DOWN);
                    break;
                case 8:
                    cant2 = nodo.getCantidad8();
                    desc = nodo.getDescripcion8();
                    cant = "" + big.getMoneda(cant).divide(big.getBigDecimal(nodo.getCantidad8()), 2, RoundingMode.HALF_DOWN);
                    break;
            }
            stockInicial = cant;
            stockFinal= cantidad;
          
            BigDecimal res = BigDecimal.ONE;
            if (cmbTipo.getSelectedIndex() == 0) {
                res = big.getBigDecimal(cant.replace(",", ".")).add(big.getBigDecimal(cantidad.replace(",", ".")));//ENTRO
            } else {
                res = big.getBigDecimal(cant.replace(",", ".")).subtract(big.getBigDecimal(cantidad.replace(",", ".")));
            }
            Object[] pond = instancias.getSql().getUltimoPonderado(nodo.getIdSistema());
            double ponderado;

            try {
                ponderado = big.formatDouble(pond[4].toString());
            } catch (Exception e) {
                ponderado = 0;
            }

            double iva = 0;
            try {
                iva = big.formatDouble(nodo.getIva());
            } catch (Exception e) {
            }

            double impoconsumo = 0;
            try {
                iva = big.formatDouble(nodo.getImpoconsumoVenta());
            } catch (Exception e) {
            }

            double subtotal = ponderado * big.getMonedaToDouble(cantidad);

            double totalImpo = big.formatDouble(subtotal * (impoconsumo / 100));
            double totalIva = big.formatDouble(subtotal*(iva/100));
            double total = (subtotal + totalIva + totalImpo);
   
//            modeloPro.addRow(new Object[]{
//                nodo.getCodigo(), desc, 
//                big.setMoneda(subtotal), cantidad.replace(".", ","), 
//                big.setMoneda(subtotal * big.getMonedaToDouble(cantidad)), nodo.getIva(), 
//                big.setMoneda(totalIva), big.setMoneda(total * big.getMonedaToDouble(cantidad)), 
//                "", plu, 
//                cant2,"", 
//                   big.setNumero(big.getMoneda(cant.replace(".", ","))),
//                   big.setNumero(res),
//                idProd, nodo.getIdSistema(), 
//                big.setMoneda(ponderado), nodo.getImpoconsumoVenta(), big.setMoneda(totalImpo),codigo});
//se comenta porque se esta cargando con valores diferentes a los que se carga cuando se agrega un producto
            modeloPro.addRow(new Object[]{nodo.getCodigo(), desc, 
                big.setMoneda(ponderado), cantidad.replace(".", ","), 
                big.setMoneda(ponderado * big.getMonedaToDouble(cantidad)),
                nodo.getIva(), big.setMoneda(totalIva), big.setMoneda(total), "", plu, cant2, "", big.setNumero(big.getMoneda(cant.replace(".", ","))),
                big.setNumero(res), "", nodo.getIdSistema(), big.setMoneda(ponderado), nodo.getImpoconsumoVenta(), big.setMoneda(totalImpo),codigo});

            tblProductos.setColumnSelectionInterval(5, 5);
            tblProductos.setRowSelectionInterval(tblProductos.getRowCount() - 1, tblProductos.getRowCount() - 1);
            tblProductos.editCellAt(tblProductos.getRowCount() - 1, 5);
            tblProductos.transferFocus();
            txtCodProducto.setText("");

            txtCant.setText(datos[87].toString());
            return;
        }
        ventanaProductos(codigo);
    }

    public void cargarDetallado(String prod, String imei, String lote, String fechaVence, String temp,
            String cant, String nombre, String color, String talla, String sw_estado, int plu) {
        modeloPro1.addRow(new Object[]{prod, imei, lote, fechaVence, temp, cant, nombre, color, talla, sw_estado, plu });
        guardarPrecompraDetallada(prod, imei, lote, fechaVence, temp, cant, nombre, color, talla , plu);
    }

    public void guardarPrecompraDetallada(String prod, String imei, String lote, String fechaVence, String temp,
            String cant, String nombre, String color, String talla, int plu) {
 
         if (cant.equals("")) {
                cant = "1.0";
            }
         
         String fecha = fechaVence;
            if (fecha.equals("")) {
                fecha = metodosGenerales.fecha();
            }
         
        if (!instancias.getSql().agregarPreCompraDetallada("AJUS", prod, nombre,
                    cant, imei, lote, metodos.fechaConsulta(fecha), temp, color, talla, plu) ) {
                metodos.msgError(null, "Hubo un problema al guardar la precompra detallada");
            }
    }
    
    public void ventanaProductos(String codigo) {
        String base = txtBodega.getText();
        if (instancias.getConfiguraciones().isInventarioBodegas()) {
            if (base.equals("123-22")) {
                base = "productos1";
            } else if (base.equals("BODEGA-1")) {
                base = "productos1bodega1";
            } else if (base.equals("BODEGA-2")) {
                base = "productos1bodega2";
            } else if (base.equals("BODEGA-3")) {
                base = "productos1bodega3";
            } else if (base.equals("BODEGA-4")) {
                base = "productos1bodega4";
            }
        } else {
            base = "productos1";
        }

        if (base.equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Seleccione una bodega...");
            return;
        }

        buscProductos buscar = new buscProductos(null, true, false, "", base);
        buscar.setOpc("ajuste");
        buscar.setLocationRelativeTo(null);
        instancias.setBusProductos(buscar);
        instancias.setCampoActual(txtCodProducto);
        txtCodProducto.requestFocus();
        buscar.noEncontrado(codigo.replace("'", "//"));
        buscar.show();
    }

    public void cargarTotales() {
        int i;
        BigDecimal total, cantidad;
        total = big.getBigDecimal("0");
        cantidad = big.getBigDecimal("0");

        for (i = 0; i < tblProductos.getRowCount(); i++) {
            total = total.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 7))));
            cantidad = cantidad.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 3).toString().replace(".", ","))));
        }

        this.cantidadTotal = cantidad + "";
        txtValor.setText(big.setMoneda(total));
    }

    public void setDatosEmpresa(String datos) {
        //lbInfoEmpresa.setText(metodosGenerales.convertToMultiline("Aqui va la\ninformacion \nde la \nempresa"));
        datosEmpresa = datos;
    }

    public void cargarProductos(Object[][] productos) {
        String cantEstablecida = txtCant.getText();
        for (int i = 0; i < productos.length; i++) {
            String codigo = productos[i][0].toString();
            String cantidad = productos[i][1].toString();
            if (cantidad.equals("0")) {
                cantidad = cantEstablecida;
            }

            this.plu = true;
            cargarProducto(codigo, cantidad, 1, "", "", "", "", "", "", "");
            KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
            tblProductosKeyReleased(x);
        }

        tblProductos.removeEditor();
        txtCodProducto.requestFocus();
    }

    public void ajustesExterno(Object[][] productos) {
        cmbTipo.setSelectedIndex(1);

        for (Object[] prod : productos) {
            cargarProducto(prod[0].toString(), prod[1].toString(), 1, "", "", "", "", "", "", "");
        }

        int xyz = tblProductos.getRowCount();
        tblProductos.removeEditor();

        if (xyz > 0) {
            for (int i = 0; i < xyz; i++) {
                tblProductos.setColumnSelectionInterval(0, 0);
                tblProductos.setRowSelectionInterval(i, i);
                KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                tblProductosKeyReleased(x);
            }
        }

        saltarPasos = true;
        btnGuardarActionPerformed(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnBusProd;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReimprimir;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBodega;
    private javax.swing.JLabel lbFacturaNo;
    private javax.swing.JLabel lbFacturaNo1;
    private javax.swing.JLabel lbModeloContable;
    private javax.swing.JLabel lbNit3;
    private javax.swing.JLabel lbNit4;
    private javax.swing.JLabel lbNoFactura;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JLabel lbProducto1;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInvisible;
    private javax.swing.JMenuItem popBorrar;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBodega;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JTextField txtModeloContable;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

}
