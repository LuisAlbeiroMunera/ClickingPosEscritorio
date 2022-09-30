package formularios.Ventas;
import logs.Logs;
import clases.Cartera.ndCxc;
import clases.Instancias;
import clases.Ventas.ndFactura;
import clases.Ventas.ndPlanSepare;
import clases.big;
import clases.metodosGenerales;
import clases.terceros.ndTercero;
import com.lowagie.text.Document;
import com.lowagie.text.html.simpleparser.HTMLWorker;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JComponent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class infReimpresion extends javax.swing.JInternalFrame {

    DefaultTableModel modeloPro;
    DefaultTableModel modelo;
    metodosGenerales metodos = new metodosGenerales();
    Instancias instancias;
    TableRowSorter modeloOrdenado;
    ndFactura nodo;
    ndPlanSepare nodo1;
    private String factura, reciboPTM;
    private String infoEmpresa;
    Object[] datos;

    //Barra de titulo
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    private int posicionFact = 1;

    public infReimpresion() {
        initComponents();

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        instancias = Instancias.getInstancias();
        txtVendedor.setText(this.instancias.getUsuario());
        btnActualizar.setText("VER DATOS");

        consultarMaestros();

        jTabbedPane1.setSelectedIndex(1);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, false);

        if (!instancias.getRegimen().equals("")) {
            txtIva.setVisible(false);
            txtTotalIva.setVisible(false);
            txtIva1.setVisible(false);
            txtTotalImpo.setVisible(false);
        }

        if (!instancias.getConfiguraciones().isPtm()) {
            btnImprimirPtm.setVisible(false);
        }

        pnlInvisible.setVisible(false);
        filtrar.setSelected(true);
    }

    public void seleccionar() {
        jTabbedPane1.setSelectedIndex(1);
    }

    public void consultarMaestros() {
        datos = instancias.getSql().getDatosMaestra();

        if ((Boolean) datos[57]) {
            txtConseManual.setVisible(true);
            lbNit7.setVisible(true);
            tblRegistros.getColumnModel().getColumn(8).setMinWidth(100);
            tblRegistros.getColumnModel().getColumn(8).setPreferredWidth(100);
            tblRegistros.getColumnModel().getColumn(8).setMaxWidth(100);
        } else {
            txtConseManual.setVisible(false);
            lbNit7.setVisible(false);
            tblRegistros.getColumnModel().getColumn(8).setMinWidth(0);
            tblRegistros.getColumnModel().getColumn(8).setPreferredWidth(0);
            tblRegistros.getColumnModel().getColumn(8).setMaxWidth(0);
        }

    }

    public void setTipo() {

        if (instancias.getImpresion().equals("pos")) {
            pos.setSelected(true);
        } else if (instancias.getImpresion().equals("facturaCompleta")) {
            carta.setSelected(true);
        } else {
            mediaCarta.setSelected(true);
        }
    }

    public void actualizarTabla() {
        consultarMaestros();
        btnActualizar.setText("ACTUALIZAR");

        String condicion = "";
        if (!instancias.isVisualizarTodasLasFacturas()) {
            if (!instancias.getUsuario().equals("ADMIN")) {
                condicion = " AND terminal = '" + instancias.getTerminal() + "' ";
            }

            if (filtrar.isSelected()) {
                String ini = metodos.desdeDate(dtInicio.getCurrent()), fin = metodos.desdeDate(dtFinal.getCurrent());
                condicion = condicion + " AND (((fechaFactura)>= '" + ini + "') And ((fechaFactura)<='" + fin + "'))";
            }
        }

        Object[][] facturas;
        if (cmbTipo.getSelectedItem().equals("PLAN SEPARE")) {
            facturas = instancias.getSql().getRegistrosSepares(condicion);
        } else if (cmbTipo.getSelectedItem().equals("FACTURA")) {
            condicion = condicion + " AND (factura LIKE 'FACT-%') ";
            facturas = instancias.getSql().getRegistrosFacturas(condicion);
        } else {
            condicion = condicion + " AND (factura LIKE 'ND-%') ";
            facturas = instancias.getSql().getRegistrosFacturas(condicion);
        }

        
        modelo = (DefaultTableModel) tblRegistros.getModel();
        while (tblRegistros.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (int i = 0; i < facturas.length; i++) {
            try {
                modelo.addRow(facturas[i]);
            } catch (Exception e) {
                Logs.error(e);
            }
        }

        for (int i = 0; i < tblRegistros.getRowCount(); i++) {
            try {
                tblRegistros.setValueAt(metodos.fecha((String) tblRegistros.getValueAt(i, 2)), i, 2);
                tblRegistros.setValueAt(big.setMoneda(big.getBigDecimal((String) tblRegistros.getValueAt(i, 6))), i, 6);
            } catch (Exception e) {
                Logs.error(e);
            }
        }

        tblRegistros.setAutoCreateRowSorter(true);
        modeloOrdenado = new TableRowSorter<>(modelo);
        tblRegistros.setRowSorter(modeloOrdenado);

        if (tblRegistros.getColumnModel().getColumnCount() > 0) {
            tblRegistros.getColumnModel().getColumn(2).setMinWidth(105);
            tblRegistros.getColumnModel().getColumn(2).setPreferredWidth(105);
            tblRegistros.getColumnModel().getColumn(2).setMaxWidth(105);
            tblRegistros.getColumnModel().getColumn(3).setMinWidth(120);
            tblRegistros.getColumnModel().getColumn(3).setPreferredWidth(165);
            tblRegistros.getColumnModel().getColumn(3).setMaxWidth(200);
            tblRegistros.getColumnModel().getColumn(6).setMinWidth(100);
            tblRegistros.getColumnModel().getColumn(6).setPreferredWidth(120);
            tblRegistros.getColumnModel().getColumn(6).setMaxWidth(160);
            tblRegistros.getColumnModel().getColumn(7).setMinWidth(80);
            tblRegistros.getColumnModel().getColumn(7).setPreferredWidth(80);
            tblRegistros.getColumnModel().getColumn(7).setMaxWidth(80);
        }
    }

    public void cargarTabla() {
        tblRegistros.getColumnModel().getColumn(0).setMinWidth(0);
        tblRegistros.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblRegistros.getColumnModel().getColumn(0).setMaxWidth(0);
        tblRegistros.getColumnModel().getColumn(1).setMinWidth(100);
        tblRegistros.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblRegistros.getColumnModel().getColumn(1).setMaxWidth(170);
        posicionFact = 1;
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlFormulario1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lbNit = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbVendedor = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtVendedor = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnBuscTerceros1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txtSubTotal = new javax.swing.JTextField();
        lbSubtotal = new javax.swing.JLabel();
        lbTotalDescuento = new javax.swing.JLabel();
        txtTotalDescuentos = new javax.swing.JTextField();
        txtIva = new javax.swing.JLabel();
        txtTotalIva = new javax.swing.JTextField();
        etiqTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtIva1 = new javax.swing.JLabel();
        txtTotalImpo = new javax.swing.JTextField();
        lbFechaFactura = new javax.swing.JLabel();
        txtFechaFactura = new javax.swing.JLabel();
        lbVencimiento = new javax.swing.JLabel();
        txtVencimiento = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtDiasPlazo1 = new javax.swing.JTextField();
        txtDiasPlazo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        pos = new javax.swing.JRadioButton();
        carta = new javax.swing.JRadioButton();
        mediaCarta = new javax.swing.JRadioButton();
        btnBuscTerceros2 = new javax.swing.JButton();
        btnImprimirPtm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbNit2 = new javax.swing.JLabel();
        txtConsecutivo = new javax.swing.JTextField();
        lbNit3 = new javax.swing.JLabel();
        txtAnho = new javax.swing.JTextField();
        lbNit4 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        lbNit7 = new javax.swing.JLabel();
        txtConseManual = new javax.swing.JTextField();
        lbNit6 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        filtrar = new javax.swing.JCheckBox();
        lbNit8 = new javax.swing.JLabel();
        dtInicio = new datechooser.beans.DateChooserCombo();
        lbNit9 = new javax.swing.JLabel();
        dtFinal = new datechooser.beans.DateChooserCombo();
        btnBuscar2 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscTerceros3 = new javax.swing.JButton();
        pnlInvisible = new javax.swing.JPanel();
        lbNoFactura = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();

        jMenuItem1.setText("Ascendente");
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Descendente");
        jPopupMenu1.add(jMenuItem2);

        setTitle("Factura");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        pnlFormulario1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
        });
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel5MouseMoved(evt);
            }
        });
        jPanel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel5FocusGained(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Valor/Unit", "Cantidad", "Subtotal", "Descuento", "%", "Iva", "Total", "Imp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.setRowHeight(24);
        tblProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblProductos);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("CC/Nit:");

        txtNit.setEditable(false);
        txtNit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNit.setName("CC/NIT"); // NOI18N
        txtNit.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
        });

        lbNombre.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNombre.setText("Nombre:");

        lbDireccion.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbDireccion.setText("Dirección:");

        lbVendedor.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbVendedor.setText("Vendedor:");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setName("Nombre"); // NOI18N
        txtNombre.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtDireccion.setEditable(false);
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDireccion.setName("Direccion"); // NOI18N
        txtDireccion.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtVendedor.setEditable(false);
        txtVendedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtVendedor.setName("Vendedor"); // NOI18N
        txtVendedor.setSelectionColor(new java.awt.Color(0, 0, 0));

        lbTelefono.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono.setText("Telefono:");

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setName("Telefono"); // NOI18N
        txtTelefono.setSelectionColor(new java.awt.Color(0, 0, 0));

        btnBuscTerceros1.setBackground(new java.awt.Color(102, 204, 255));
        btnBuscTerceros1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnBuscTerceros1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anterior.png"))); // NOI18N
        btnBuscTerceros1.setText("VOLVER ");
        btnBuscTerceros1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros1.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTerceros1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscTerceros1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtNombre)
                                    .addComponent(txtVendedor, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(5, 5, 5))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNit)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDireccion)
                    .addComponent(lbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscTerceros1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        txtObservaciones.setColumns(20);
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(5);
        txtObservaciones.setText("\n");
        txtObservaciones.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtObservaciones.setEnabled(false);
        jScrollPane4.setViewportView(txtObservaciones);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de la factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        txtSubTotal.setEditable(false);
        txtSubTotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSubTotal.setText("0");
        txtSubTotal.setSelectionColor(new java.awt.Color(0, 0, 0));

        lbSubtotal.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbSubtotal.setText("Subtotal sin IVA");

        lbTotalDescuento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTotalDescuento.setText("Total descuentos");

        txtTotalDescuentos.setEditable(false);
        txtTotalDescuentos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTotalDescuentos.setText("0");
        txtTotalDescuentos.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtIva.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtIva.setText("IVA");

        txtTotalIva.setEditable(false);
        txtTotalIva.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTotalIva.setText("0");
        txtTotalIva.setSelectionColor(new java.awt.Color(0, 0, 0));

        etiqTotal.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        etiqTotal.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTotal.setText("0");
        txtTotal.setSelectionColor(new java.awt.Color(0, 0, 0));

        txtIva1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtIva1.setText("IMPOCONSUMO");

        txtTotalImpo.setEditable(false);
        txtTotalImpo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTotalImpo.setText("0");
        txtTotalImpo.setSelectionColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTotalDescuento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSubtotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIva1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtTotalDescuentos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalIva)
                            .addComponent(txtTotalImpo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(etiqTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal)))
                .addGap(5, 5, 5))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotalDescuentos)
                    .addComponent(lbTotalDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotalIva)
                    .addComponent(txtIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalImpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIva1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        lbFechaFactura.setBackground(new java.awt.Color(204, 204, 204));
        lbFechaFactura.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbFechaFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFechaFactura.setText("Fecha factura");
        lbFechaFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbFechaFactura.setOpaque(true);

        txtFechaFactura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFechaFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFechaFactura.setText(" ");
        txtFechaFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbVencimiento.setBackground(new java.awt.Color(204, 204, 204));
        lbVencimiento.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbVencimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVencimiento.setText("Vencimiento");
        lbVencimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbVencimiento.setOpaque(true);

        txtVencimiento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtVencimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVencimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbVencimiento)
                    .addComponent(lbFechaFactura))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtDiasPlazo1.setEditable(false);
        txtDiasPlazo1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtDiasPlazo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiasPlazo1.setText("  Dias de plazo");
        txtDiasPlazo1.setBorder(null);
        txtDiasPlazo1.setName("Plazo"); // NOI18N
        txtDiasPlazo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasPlazo1ActionPerformed(evt);
            }
        });
        txtDiasPlazo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiasPlazo1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasPlazo1KeyTyped(evt);
            }
        });

        txtDiasPlazo.setEditable(false);
        txtDiasPlazo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDiasPlazo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiasPlazo.setName("Plazo"); // NOI18N
        txtDiasPlazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiasPlazoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasPlazoKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo impresión", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        pos.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(pos);
        pos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pos.setText("POS");
        pos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posActionPerformed(evt);
            }
        });

        carta.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(carta);
        carta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        carta.setText("CARTA");
        carta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaActionPerformed(evt);
            }
        });

        mediaCarta.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(mediaCarta);
        mediaCarta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mediaCarta.setSelected(true);
        mediaCarta.setText("MEDIA CARTA");
        mediaCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaCartaActionPerformed(evt);
            }
        });

        btnBuscTerceros2.setBackground(new java.awt.Color(247, 220, 111));
        btnBuscTerceros2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnBuscTerceros2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnBuscTerceros2.setText("IMPRIMIR");
        btnBuscTerceros2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros2.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTerceros2ActionPerformed(evt);
            }
        });

        btnImprimirPtm.setBackground(new java.awt.Color(247, 220, 111));
        btnImprimirPtm.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnImprimirPtm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnImprimirPtm.setText("IMPRIMIR PTM");
        btnImprimirPtm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimirPtm.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnImprimirPtm.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnImprimirPtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPtmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mediaCarta)
                    .addComponent(pos)
                    .addComponent(carta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscTerceros2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirPtm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnBuscTerceros2)
                        .addGap(3, 3, 3)
                        .addComponent(btnImprimirPtm))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pos)
                        .addGap(1, 1, 1)
                        .addComponent(carta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mediaCarta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtDiasPlazo1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiasPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 178, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiasPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiasPlazo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFormulario1Layout = new javax.swing.GroupLayout(pnlFormulario1);
        pnlFormulario1.setLayout(pnlFormulario1Layout);
        pnlFormulario1Layout.setHorizontalGroup(
            pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFormulario1Layout.setVerticalGroup(
            pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormulario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(17, 17, 17))
                    .addGroup(pnlFormulario1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Vista Previa", pnlFormulario1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblRegistros.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FACTURA", "FACTURA", "FECHA", "NIT CLIENTE", "CLIENTE", "VENDEDOR", "TOTAL", "TERMINAL", "CONSE.MANUAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistros.setRowHeight(24);
        tblRegistros.getTableHeader().setReorderingAllowed(false);
        tblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistros);
        if (tblRegistros.getColumnModel().getColumnCount() > 0) {
            tblRegistros.getColumnModel().getColumn(8).setMinWidth(100);
            tblRegistros.getColumnModel().getColumn(8).setPreferredWidth(100);
            tblRegistros.getColumnModel().getColumn(8).setMaxWidth(100);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        lbNit2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit2.setText("Factura:");

        txtConsecutivo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtConsecutivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConsecutivoKeyReleased(evt);
            }
        });

        lbNit3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit3.setText("CC/Nit:");

        txtAnho.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAnho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnhoKeyReleased(evt);
            }
        });

        lbNit4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit4.setText("Nombre cliente:");

        txtMes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMesKeyReleased(evt);
            }
        });

        lbNit7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit7.setText("Conse. manual:");

        txtConseManual.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtConseManual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConseManualKeyReleased(evt);
            }
        });

        lbNit6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit6.setText("Tipo:");

        cmbTipo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FACTURA", "PLAN SEPARE", "NOTA DEBITO" }));
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });

        filtrar.setBackground(new java.awt.Color(255, 255, 255));
        filtrar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        filtrar.setText("¿Filtrar por fecha?");
        filtrar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtrarItemStateChanged(evt);
            }
        });

        lbNit8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit8.setText("Fecha inicial:");

        dtInicio.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        dtInicio.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dtInicioOnCommit(evt);
            }
        });

        lbNit9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit9.setText("Fecha final:");

        dtFinal.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        dtFinal.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dtFinalOnCommit(evt);
            }
        });

        btnBuscar2.setBackground(new java.awt.Color(247, 220, 111));
        btnBuscar2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar2.setText("VER  ");
        btnBuscar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscar2.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(46, 204, 113));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnActualizar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscTerceros3.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscTerceros3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnBuscTerceros3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnBuscTerceros3.setText("IMPRIMIR RANGOS");
        btnBuscTerceros3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros3.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTerceros3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNit6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(lbNit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbTipo, 0, 139, Short.MAX_VALUE)
                    .addComponent(txtConsecutivo)
                    .addComponent(txtAnho))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(filtrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNit8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lbNit9)
                        .addGap(3, 3, 3)
                        .addComponent(dtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMes)
                    .addComponent(txtConseManual, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar2))
                    .addComponent(btnBuscTerceros3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscTerceros3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNit6)
                            .addComponent(filtrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbTipo))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtConsecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbNit4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbNit2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNit7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtConseManual)
                            .addComponent(lbNit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAnho))))
                .addGap(8, 8, 8))
        );

        lbNoFactura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNoFactura.setForeground(new java.awt.Color(255, 0, 0));
        lbNoFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNoFactura.setText("3");
        lbNoFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlInvisibleLayout = new javax.swing.GroupLayout(pnlInvisible);
        pnlInvisible.setLayout(pnlInvisibleLayout);
        pnlInvisibleLayout.setHorizontalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInvisibleLayout.setVerticalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNoFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtCorreoCliente))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1189, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlInvisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Listado de facturas", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void posActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posActionPerformed

    }//GEN-LAST:event_posActionPerformed

    private void cartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaActionPerformed

    }//GEN-LAST:event_cartaActionPerformed

    private void mediaCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediaCartaActionPerformed

    private void txtMesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyReleased

        modelo = (DefaultTableModel) tblRegistros.getModel();
        modeloOrdenado = new TableRowSorter<>(modelo);
        tblRegistros.setRowSorter(modeloOrdenado);

        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + txtMes.getText(), 4));
    }//GEN-LAST:event_txtMesKeyReleased

    private void txtAnhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnhoKeyReleased
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + txtAnho.getText(), 3));
    }//GEN-LAST:event_txtAnhoKeyReleased

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        if (cmbTipo.getSelectedItem().equals("FACTURA") || cmbTipo.getSelectedItem().equals("NOTA DEBITO")) {

            if (cmbTipo.getSelectedItem().equals("FACTURA")) {
                nodo = instancias.getSql().getDatosFactura("FACT-" + txtConsecutivo.getText());
            } else {
                nodo = instancias.getSql().getDatosFactura("ND-" + txtConsecutivo.getText());
            }

            factura = nodo.getFactura();

            txtConsecutivo.setText(nodo.getFactura().substring(5, nodo.getFactura().length()));
            tblProductos.setModel(instancias.getSql().getRegistrosVentas(factura, "factura",""));

            if (instancias.getConfiguraciones().isPtm()) {
                try {
                    reciboPTM = instancias.getSql().getReciboPTM(nodo.getIdFactura());
                    btnImprimirPtm.setEnabled(true);
                } catch (Exception e) {
                    Logs.error(e);
                    reciboPTM = "";
                    btnImprimirPtm.setEnabled(false);
                }
            }

        } else if (cmbTipo.getSelectedItem().equals("PLAN SEPARE")) {
            nodo1 = instancias.getSql().getDatosPlanSepare("SEPARE-" + txtConsecutivo.getText());
            factura = nodo1.getIdFactura();
            tblProductos.setModel(instancias.getSql().getRegistrosVentasSepares(factura, "idFactura"));
        }

//        factura = nodo.getId();
        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 2))), i, 2);
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 4))), i, 4);
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 5))), i, 5);
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 7))), i, 7);
            tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 8))), i, 8);
            if (cmbTipo.getSelectedItem().equals("FACTURA")) {
                tblProductos.setValueAt(big.setMoneda(big.getBigDecimal((String) tblProductos.getValueAt(i, 12))), i, 12);
            }
        }

        tblProductos.getColumnModel().getColumn(10).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(10).setPreferredWidth(0);
        tblProductos.getColumnModel().getColumn(10).setMaxWidth(0);
        tblProductos.getColumnModel().getColumn(9).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(9).setPreferredWidth(0);
        tblProductos.getColumnModel().getColumn(9).setMaxWidth(0);
        tblProductos.getColumnModel().getColumn(8).setMinWidth(80);
        tblProductos.getColumnModel().getColumn(8).setPreferredWidth(100);
        tblProductos.getColumnModel().getColumn(8).setMaxWidth(140);
        tblProductos.getColumnModel().getColumn(7).setMinWidth(80);
        tblProductos.getColumnModel().getColumn(7).setPreferredWidth(100);
        tblProductos.getColumnModel().getColumn(7).setMaxWidth(140);
        tblProductos.getColumnModel().getColumn(6).setMinWidth(20);
        tblProductos.getColumnModel().getColumn(6).setPreferredWidth(50);
        tblProductos.getColumnModel().getColumn(6).setMaxWidth(70);
        tblProductos.getColumnModel().getColumn(5).setMinWidth(80);
        tblProductos.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblProductos.getColumnModel().getColumn(5).setMaxWidth(140);
        tblProductos.getColumnModel().getColumn(4).setMinWidth(80);
        tblProductos.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblProductos.getColumnModel().getColumn(4).setMaxWidth(140);
        tblProductos.getColumnModel().getColumn(3).setMinWidth(20);
        tblProductos.getColumnModel().getColumn(3).setPreferredWidth(60);
        tblProductos.getColumnModel().getColumn(3).setMaxWidth(80);
        tblProductos.getColumnModel().getColumn(2).setMinWidth(80);
        tblProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblProductos.getColumnModel().getColumn(2).setMaxWidth(140);
        tblProductos.getColumnModel().getColumn(0).setMinWidth(80);
        tblProductos.getColumnModel().getColumn(0).setPreferredWidth(120);
        tblProductos.getColumnModel().getColumn(0).setMaxWidth(250);

        if (cmbTipo.getSelectedItem().equals("FACTURA") || cmbTipo.getSelectedItem().equals("NOTA DEBITO")) {
            tblProductos.getColumnModel().getColumn(14).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(14).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(14).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(13).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(13).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(13).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(12).setMinWidth(80);
            tblProductos.getColumnModel().getColumn(12).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(12).setMaxWidth(140);
            tblProductos.getColumnModel().getColumn(11).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(11).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(11).setMaxWidth(0);
        }

        if (!instancias.getRegimen().equals("")) {
            tblProductos.getColumnModel().getColumn(6).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(6).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(7).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(7).setMaxWidth(0);

            if (cmbTipo.getSelectedItem().equals("FACTURA") || cmbTipo.getSelectedItem().equals("NOTA DEBITO")) {
                tblProductos.getColumnModel().getColumn(8).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(8).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(8).setMaxWidth(0);
            }
        }

        if (instancias.getConfiguraciones().getTipoImpresion().equals("Sin-Codigo")) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        if (cmbTipo.getSelectedItem().equals("FACTURA") || cmbTipo.getSelectedItem().equals("NOTA DEBITO")) {
            ndTercero nodoCliente = instancias.getSql().getDatosTercero(nodo.getCliente());

            txtNit.setText(nodoCliente.getId());
            txtCorreoCliente.setText(nodoCliente.getEmail());
            txtVendedor.setText(nodo.getVendedor());
            txtFechaFactura.setText(metodos.fecha(nodo.getFechaFactura()));
            txtVencimiento.setText(metodos.fecha(nodo.getFechaVencimiento()));

            txtSubTotal.setText(big.setMoneda(big.getBigDecimal(nodo.getSubtotalGeneral())));
            txtTotalDescuentos.setText(big.setMoneda(big.getBigDecimal(nodo.getDescuentoGeneral())));
            txtTotalIva.setText(big.setMoneda(big.getBigDecimal(nodo.getIvaGeneral())));
            txtTotalImpo.setText(big.setMoneda(big.getBigDecimal(nodo.getImpoGeneral())));
            txtTotal.setText(big.setMoneda(big.getBigDecimal(nodo.getTotalGeneral())));

//            txtEfectivo.setText(big.setMoneda(big.getBigDecimal(nodo.getEfectivoGeneral())));
//            txtNC.setText(big.setMoneda(big.getBigDecimal(nodo.getNcGeneral())));
//            txtCheque.setText(big.setMoneda(big.getBigDecimal(nodo.getChequeGeneral())));
//            txtTargeta.setText(big.setMoneda(big.getBigDecimal(nodo.getTargetaGeneral())));
            if (nodo.getObservacion() != null && !nodo.getObservacion().equals("null")) {
                txtObservaciones.setText(nodo.getObservacion());
            } else {
                txtObservaciones.setText("");
            }
            lbNoFactura.setText(txtConsecutivo.getText());

            if (nodoCliente.getNombre() != null) {
                txtNombre.setText(nodoCliente.getNombre());
                txtDireccion.setText(nodoCliente.getDireccion());
                txtTelefono.setText(nodoCliente.getTelefono());
            }

            try {
                ndCxc nodoCxc = instancias.getSql().getDatosCxc(nodo.getIdFactura());
                txtDiasPlazo.setText("" + nodoCxc.getPlazo());
            } catch (Exception ex) {
                Logs.error(ex);
                txtDiasPlazo.setText("0");
            }

            jTabbedPane1.setSelectedIndex(0);
            infoEmpresa = metodosGenerales.convertToMultiline(instancias.getInformacionEmpresaReimpresion() + "\n" + nodo.getResolucion());
        } else if (cmbTipo.getSelectedItem().equals("PLAN SEPARE")) {
            ndTercero nodoCliente = instancias.getSql().getDatosTercero(nodo1.getCliente());

            txtNit.setText(nodoCliente.getId());
            txtVendedor.setText(nodo1.getVendedor());
            txtFechaFactura.setText(metodos.fecha(nodo1.getFechaFactura()));
            txtVencimiento.setText(metodos.fecha(nodo1.getFechaVencimiento()));
            txtSubTotal.setText(big.setMoneda(big.getBigDecimal(nodo1.getSubtotalGeneral())));
            txtTotalDescuentos.setText(big.setMoneda(big.getBigDecimal(nodo1.getDescuentoGeneral())));
            txtTotalIva.setText(big.setMoneda(big.getBigDecimal(nodo1.getIvaGeneral())));
            txtTotal.setText(big.setMoneda(big.getBigDecimal(nodo1.getTotalGeneral())));
//            txtEfectivo.setText(big.setMoneda(big.getBigDecimal(nodo1.getEfectivoGeneral())));
//            txtNC.setText(big.setMoneda(big.getBigDecimal(nodo1.getNcGeneral())));
//            txtCheque.setText(big.setMoneda(big.getBigDecimal(nodo1.getChequeGeneral())));
//            txtTargeta.setText(big.setMoneda(big.getBigDecimal(nodo1.getTargetaGeneral())));
            if (nodo1.getObservacion() != null && !nodo1.getObservacion().equals("null")) {
                txtObservaciones.setText(nodo1.getObservacion());
            } else {
                txtObservaciones.setText("");
            }
            lbNoFactura.setText(txtConsecutivo.getText());

            if (nodoCliente.getNombre() != null) {
                txtNombre.setText(nodoCliente.getNombre());
                txtDireccion.setText(nodoCliente.getDireccion());
                txtTelefono.setText(nodoCliente.getTelefono());
            }

            try {
                ndCxc nodoCxc = instancias.getSql().getDatosCxc(nodo1.getIdFactura());
                txtDiasPlazo.setText("" + nodoCxc.getPlazo());
            } catch (Exception ex) {
                Logs.error(ex);
                txtDiasPlazo.setText("0");
            }
            jTabbedPane1.setSelectedIndex(0);
            infoEmpresa = metodosGenerales.convertToMultiline(instancias.getInformacionEmpresaReimpresion() + "\n" + nodo1.getResolucion());
        }

        if (cmbTipo.getSelectedItem().equals("FACTURA")) {
            instancias.getMenu().cambiarTitulo("REIMPRESIÓN DE " + "FACT-" + txtConsecutivo.getText());
        } else if (cmbTipo.getSelectedItem().equals("PLAN SEPARE")) {
            instancias.getMenu().cambiarTitulo("REIMPRESIÓN DE " + "SEPARE-" + txtConsecutivo.getText());
        } else {
            instancias.getMenu().cambiarTitulo("REIMPRESIÓN DE " + "ND-" + txtConsecutivo.getText());
        }
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtConsecutivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsecutivoKeyReleased
        try {
            int i;
            for (i = 0; i < tblRegistros.getRowCount(); i++) {
                if (cmbTipo.getSelectedItem().equals("FACTURA")) {
                    if (tblRegistros.getValueAt(i, posicionFact).equals("FACT-" + txtConsecutivo.getText())) {
                        tblRegistros.setColumnSelectionInterval(0, 0);
                        tblRegistros.setRowSelectionInterval(i, i);
                        tblRegistros.getSelectionModel().setSelectionInterval(i, i);

//                        tblRegistros.scrollRectToVisible(new Rectangle(tblRegistros.getCellRect(i, 0, true)));
                        break;
                    }
                } else if (cmbTipo.getSelectedItem().equals("PLAN SEPARE")) {
                    if (tblRegistros.getValueAt(i, posicionFact).equals("SEPARE-" + txtConsecutivo.getText())) {
                        tblRegistros.setColumnSelectionInterval(0, 0);
                        tblRegistros.setRowSelectionInterval(i, i);
                        tblRegistros.getSelectionModel().setSelectionInterval(i, i);

//                        tblRegistros.scrollRectToVisible(new Rectangle(tblRegistros.getCellRect(i, 0, true)));
                        break;
                    }
                }
            }

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                btnBuscar2ActionPerformed(null);
            }
        } catch (Exception e) {
               Logs.error(e);
        }
    }//GEN-LAST:event_txtConsecutivoKeyReleased

    private void txtConseManualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConseManualKeyReleased
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + txtConseManual.getText(), 8));
        txtMes.setText("");
        txtAnho.setText("");
        txtConsecutivo.setText("");
    }//GEN-LAST:event_txtConseManualKeyReleased

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered

    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseMoved

    }//GEN-LAST:event_jPanel5MouseMoved

    private void jPanel5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel5FocusGained

    }//GEN-LAST:event_jPanel5FocusGained

    private void btnBuscTerceros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTerceros2ActionPerformed
        String encabezado = "Reimpresión";

        if (cmbTipo.getSelectedItem().equals("FACTURA") || cmbTipo.getSelectedItem().equals("NOTA DEBITO")) {
            String email = "";
            Boolean crearPDF = false;

            int respuesta = metodos.msgPreguntaImpresion(null, "¿Desea continuar?");
            if (respuesta == 1) {
                return;
            } else if (respuesta == 2) {
                email = txtCorreoCliente.getText();
                if (email.equals("")) {
                    metodos.msgAdvertenciaAjustado(this, "El cliente no tiene email registrado");
                }

                crearPDF = true;
            }

            if (instancias.getSql().getDatosFactura("FACT-" + lbNoFactura.getText()).isAnulada()) {
                encabezado = "Reimpresión (Anulada)";
            }

            Object[] datos = instancias.getSql().getDatosMaestra();

            String titulo;
            if (instancias.getConfiguraciones().isRestaurante()) {
                if ((Boolean) datos[54]) {
                    titulo = "Turno";
                } else {
                    titulo = "";
                }
            } else if ((Boolean) datos[57]) {
                titulo = "Num Fact2";
            } else {
                titulo = "";
            }

            if (!(Boolean) datos[80]) {
                encabezado = "";
            }

            String tipo = this.getTipo();
            String tipoImpr = instancias.getConfiguraciones().getTipoImpresion();

            if (tipoImpr.equals("Con-Codigo")) {
            } else if (tipoImpr.equals("Sin-Codigo")) {
                tipo = tipo + "1";
            } else if (tipoImpr.equals("Imei")) {
                tipo = tipo + "Imei";
            }

            if (tipo.equals("facturaMedica1") || tipo.equals("facturaMedica") || tipo.equals("facturaMedicaCompleta") || tipo.equals("facturaMedicaCompleta1")) {
                if (!instancias.getRegimen().equals("")) {
                    tipo = tipo + "SinIva";
                }
            }
            boolean tamImpresion = Boolean.valueOf(datos[118].toString());
            String impresora = "";
            if (mediaCarta.isSelected()) {
                impresora = datos[82].toString();
            } else if (carta.isSelected()) {
                impresora = datos[83].toString();
            } else if (pos.isSelected()) {
                impresora = datos[81].toString();
                //verifica si la envia a Impresion de 58mm
                if(tamImpresion == false){
                  tipo=tipo+"Tam58";
                }
            }
            
            String factura2 = "FACT-" + lbNoFactura.getText();
            String impoconsumo = datos[84].toString();
            String retenciones = datos[85].toString();

            String condicion;
            if ((Boolean) datos[50] && instancias.getConfiguraciones().isRestaurante()) {
                condicion = metodos.sentenciaImpresionFactura("agrupada", " WHERE bdFactura.factura = '" + factura + "' ");
            } else {
                if (instancias.getConfiguraciones().isRestaurante()) {
                    condicion = metodos.sentenciaImpresionFactura("agrupada", " WHERE bdFactura.factura = '" + factura + "' ");
                } else {
                    condicion = metodos.sentenciaImpresionFactura("", " WHERE bdFactura.factura = '" + factura + "' ");
                }
            }

            Boolean notaDebito = false;
            if (cmbTipo.getSelectedItem().equals("NOTA DEBITO")) {
                notaDebito = true;
            }
             
            instancias.getReporte().ver_Factura(factura, txtObservaciones.getText(), infoEmpresa, instancias.getLegal(), encabezado, instancias.getPie(), tipo,
                    factura2, false, titulo, impresora, impoconsumo, retenciones, condicion, notaDebito, crearPDF);

            if (crearPDF) {

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    Logs.error(e);
                }

                dlgEnviarCorreo correo = new dlgEnviarCorreo(null, true, email);
                correo.setVisible(true);
            }
        } else if (cmbTipo.getSelectedItem().equals("PLAN SEPARE")) {
            if (instancias.getSql().getDatosPlanSepare("FACT-" + lbNoFactura.getText()).isAnulada()) {
                encabezado = "Reimpresión (Anulada)";
            }

            if (!(Boolean) datos[80]) {
                encabezado = "";
            }

            String tipo = this.getTipo();
            String tipoImpr = instancias.getConfiguraciones().getTipoImpresion();

            if (tipo.equals("separePosSinIva")) {
                tipo = "separePos";
            }

            if (tipoImpr.equals("Con-Codigo")) {
            } else if (tipoImpr.equals("Sin-Codigo")) {
                tipo = tipo + "1";
            } else if (tipoImpr.equals("Imei")) {
                tipo = tipo + "Imei";
            }

            String pie = "", legal = "";

            try {
                pie = instancias.getPie();
            } catch (Exception e) {
            }

            try {
                legal = instancias.getLegal();
            } catch (Exception e) {
            }

            instancias.getReporte().ver_Separe(factura, txtObservaciones.getText(), infoEmpresa, legal, encabezado, pie, tipo, "SEPARE-" + lbNoFactura.getText(), false);
        }
    }//GEN-LAST:event_btnBuscTerceros2ActionPerformed

    private void tblRegistrosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseReleased
        txtConsecutivo.setText(((String) tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 0)).replaceAll("FACT-", ""));
    }//GEN-LAST:event_tblRegistrosMouseReleased

    private void tblRegistrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegistrosMouseEntered

    private void tblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseClicked
        if (cmbTipo.getSelectedItem().equals("FACTURA")) {
            txtConsecutivo.setText(((String) tblRegistros.getValueAt(tblRegistros.getSelectedRow(), posicionFact)).replaceAll("FACT-", ""));
        } else if (cmbTipo.getSelectedItem().equals("PLAN SEPARE")) {
            txtConsecutivo.setText(((String) tblRegistros.getValueAt(tblRegistros.getSelectedRow(), posicionFact)).replaceAll("SEPARE-", ""));
        } else {
            txtConsecutivo.setText(((String) tblRegistros.getValueAt(tblRegistros.getSelectedRow(), posicionFact)).replaceAll("ND-", ""));
        }

        if (evt.getClickCount() == 2) {
            btnBuscar2ActionPerformed(null);
        }
    }//GEN-LAST:event_tblRegistrosMouseClicked

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        btnActualizarActionPerformed(null);
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void dtInicioOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dtInicioOnCommit
        btnActualizarActionPerformed(null);
    }//GEN-LAST:event_dtInicioOnCommit

    private void dtFinalOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dtFinalOnCommit
        btnActualizarActionPerformed(null);
    }//GEN-LAST:event_dtFinalOnCommit

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased

    }//GEN-LAST:event_txtNitKeyReleased

    private void btnBuscTerceros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTerceros1ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        instancias.getMenu().cambiarTitulo("REIMPRESIÓN DE FACTURAS");
        reciboPTM = "";
    }//GEN-LAST:event_btnBuscTerceros1ActionPerformed

    private void txtDiasPlazo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasPlazo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasPlazo1ActionPerformed

    private void txtDiasPlazo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPlazo1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasPlazo1KeyReleased

    private void txtDiasPlazo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPlazo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasPlazo1KeyTyped

    private void txtDiasPlazoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPlazoKeyReleased

    }//GEN-LAST:event_txtDiasPlazoKeyReleased

    private void txtDiasPlazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPlazoKeyTyped

    }//GEN-LAST:event_txtDiasPlazoKeyTyped

    private void filtrarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtrarItemStateChanged
        actualizarTabla();
    }//GEN-LAST:event_filtrarItemStateChanged

    private void btnImprimirPtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPtmActionPerformed
        crearHtml(reciboPTM);

        String tipo = "";
        if (pos.isSelected()) {
            tipo = "2";
        } else if (carta.isSelected()) {
            tipo = "";
        } else if (mediaCarta.isSelected()) {
            tipo = "1";
        }

        crearImg(tipo);
        instancias.getReporte().ver_Recibo(tipo);
    }//GEN-LAST:event_btnImprimirPtmActionPerformed

    private void btnBuscTerceros3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTerceros3ActionPerformed
        dlgEnviarCorreoMasivo correo = new dlgEnviarCorreoMasivo(null, true);
        correo.setVisible(true);
    }//GEN-LAST:event_btnBuscTerceros3ActionPerformed

    public static void crearImg(String tipo) {
        try {
            String sourceDir = System.getProperty("user.dir") + "\\Impresion.pdf";
            String destinationDir = "";
            File sourceFile = new File(sourceDir);
            File destinationFile = new File(destinationDir);

            if (!destinationFile.exists()) {
                destinationFile.mkdir();
                Logs.log("Folder Created -> " + destinationFile.getAbsolutePath());
            }

            if (sourceFile.exists()) {
                PDDocument document = PDDocument.load(sourceDir);
                @SuppressWarnings("unchecked")
                List<PDPage> list = document.getDocumentCatalog().getAllPages();

                String fileName = sourceFile.getName().replace(".pdf", "");
                int pageNumber = 1;
                for (PDPage page : list) {
                    BufferedImage image = page.convertToImage();
                    File outputfile = new File(destinationDir + fileName + "_" + pageNumber + ".png");

                    if (tipo.equals("")) {
                        ImageIO.write(image, "png", outputfile);
                    } else {
                        ImageIO.write(image.getSubimage(image.getMinX(), image.getMinX(), 1150, 800), "png", outputfile);
                    }

                    pageNumber++;
                }
                document.close();
                Logs.log("Image saved at -> " + destinationFile.getAbsolutePath());
            } else {
                Logs.error(sourceFile.getName() + " File does not exist");
            }
        } catch (Exception e) {
            Logs.error(e);
        }
    }

    public String getTipo() {
        String factura = "";

        if (instancias.getConfiguraciones().isMedico()) {
            if (carta.isSelected()) {
                return "facturaMedicaCompleta";
            } else {
                return "facturaMedica";
            }
        }

        if (cmbTipo.getSelectedItem().equals("FACTURA") || cmbTipo.getSelectedItem().equals("NOTA DEBITO")) {
            if (carta.isSelected()) {
                return "facturaCompleta" + instancias.getRegimen();
            } else if (pos.isSelected()) {
                return "pos" + instancias.getRegimen();
            }
        } else if (cmbTipo.getSelectedItem().equals("PLAN SEPARE")) {
            if (carta.isSelected()) {
                return "separeCompleta";
            } else if (pos.isSelected()) {
                return "separePos" + instancias.getRegimen();
            } else if (tblProductos.getRowCount() > 6) {
                return "separeCompleta";
            } else {
                return "separe";
            }
        }

        return "factura" + instancias.getRegimen();
    }

    public static void crearHtml(String html) {
        try {
            OutputStream file = new FileOutputStream(new File("Impresion.pdf"));
            Document document = new Document();
            PdfWriter.getInstance(document, file);
            document.open();
            HTMLWorker htmlWorker = new HTMLWorker(document);
            htmlWorker.parse(new StringReader(html));
            document.close();
            file.close();
        } catch (Exception e) {
            Logs.error(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscTerceros1;
    private javax.swing.JButton btnBuscTerceros2;
    private javax.swing.JButton btnBuscTerceros3;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnImprimirPtm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton carta;
    private javax.swing.JComboBox cmbTipo;
    private datechooser.beans.DateChooserCombo dtFinal;
    private datechooser.beans.DateChooserCombo dtInicio;
    private javax.swing.JLabel etiqTotal;
    private javax.swing.JCheckBox filtrar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbFechaFactura;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit2;
    private javax.swing.JLabel lbNit3;
    private javax.swing.JLabel lbNit4;
    private javax.swing.JLabel lbNit6;
    private javax.swing.JLabel lbNit7;
    private javax.swing.JLabel lbNit8;
    private javax.swing.JLabel lbNit9;
    private javax.swing.JLabel lbNoFactura;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTotalDescuento;
    private javax.swing.JLabel lbVencimiento;
    private javax.swing.JLabel lbVendedor;
    private javax.swing.JRadioButton mediaCarta;
    private javax.swing.JPanel pnlFormulario1;
    private javax.swing.JPanel pnlInvisible;
    private javax.swing.JRadioButton pos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtAnho;
    private javax.swing.JTextField txtConseManual;
    private javax.swing.JTextField txtConsecutivo;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDiasPlazo;
    private javax.swing.JTextField txtDiasPlazo1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JLabel txtFechaFactura;
    private javax.swing.JLabel txtIva;
    private javax.swing.JLabel txtIva1;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalDescuentos;
    private javax.swing.JTextField txtTotalImpo;
    private javax.swing.JTextField txtTotalIva;
    private javax.swing.JLabel txtVencimiento;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
