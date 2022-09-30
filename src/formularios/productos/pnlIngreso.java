package formularios.productos;

import logs.Logs;
import clases.Cartera.ndCxp;
import clases.IconCellRenderer;
import clases.Iniciar2;
import clases.Instancias;
import clases.Respuesta;
import clases.RespuestaServicioEnvioFacturas;
import clases.Utils;
import clases.big;
import clases.facturacionElectronica;
import clases.jcThread;
import clases.metodosGenerales;
import clases.productos.ndCompra;
import clases.productos.ndIngreso;
import clases.productos.ndProducto;
import clases.terceros.ndTercero;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import formularios.Tesoreria.dlgTipoEgreso;
import formularios.cargando;
import formularios.terceros.buscBodegas;
import formularios.terceros.buscClientes;
import java.awt.Color;
import java.awt.Event;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.jfree.util.Log;

public class pnlIngreso extends javax.swing.JPanel {

    String simbolo = "";
    DefaultTableModel modeloPro;
    DefaultTableModel modeloPro1;
    metodosGenerales metodos = new metodosGenerales();
    Instancias instancias;
    int ultFila;
    boolean dinamico = true;
    private String respuesta;

    private boolean plu = false, saltarPasos = false, cancelarCompra = false, preguntaLimpiar = true;

    String tipo;
    jcThread barra2;
    Object[] datos;
    DecimalFormat df = new DecimalFormat("#.00");
    Icon icono = null;

    public boolean isCancelarCompra() {
        return cancelarCompra;
    }

    public void setCancelarCompra(boolean cancelarCompra) {
        this.cancelarCompra = cancelarCompra;
    }

    public pnlIngreso(String tipo) {
        initComponents();

        instancias = Instancias.getInstancias();

        simbolo = instancias.getSimbolo();
        chkPesos.setText(simbolo);

        consultarMaestros();

        tblProductos.setDefaultRenderer(Object.class, new IconCellRenderer());
        ImageIcon fot = new ImageIcon(getClass().getResource("/imagenes/eliminar.png"));
        icono = new ImageIcon(fot.getImage().getScaledInstance(30, 25, Image.SCALE_DEFAULT));

        pnlInvisible.setVisible(false);
        setBorder(null);
        repaint();

        modeloPro = (DefaultTableModel) tblProductos.getModel();
        modeloPro1 = (DefaultTableModel) tblDetalle.getModel();

        txtFechaFactura.setFormat(2);
        txtFechaFactura.setText(metodosGenerales.fecha());
        txtVencimiento.setText(metodosGenerales.fecha());

        setTipo(tipo);
        this.tipo = tipo;

        if (instancias.getConfiguraciones().isInventarioBodegas()) {
            TableColumn tcr1 = tblProductos.getColumnModel().getColumn(19);
            TableCellEditor tcer1 = new DefaultCellEditor(cmbBodegas);
            tcr1.setCellEditor(tcer1);

            Object[][] bodegas = instancias.getSql().getTodasBodegas();

            for (int i = 0; i < bodegas.length; i++) {
                cmbBodegas.addItem(bodegas[i][1]);
            }
        } else {
            tblProductos.getColumnModel().getColumn(19).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(19).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(19).setMaxWidth(0);
        }

        pnlFormulario.registerKeyboardAction(accion("guardar"), "guardar", KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("limpiar"), "limpiar", KeyStroke.getKeyStroke(KeyEvent.VK_L, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("proveedor"), "proveedor", KeyStroke.getKeyStroke(KeyEvent.VK_T, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("productos"), "productos", KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("valor"), "valor", KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.ALT_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("cantidad"), "cantidad", KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.ALT_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);

        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(6).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(6).setMaxWidth(0);

            String paisFact = instancias.getConfiguraciones().getPais();
            if (paisFact.equals("Panama")) {
                tblProductos.getColumnModel().getColumn(8).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(8).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(8).setMaxWidth(0);
            }
        }

        txtCant.setText(datos[87].toString());

        if (tipo.equals("ingreso")) {
            btnImportarExcel.setVisible(true);
        } else {
            btnImportarExcel.setEnabled(false);
        }

        if (!instancias.getRegimen().equals("")) {
            txtTotalIva.setVisible(false);
            txtIva.setVisible(false);
            etiqTotal1.setVisible(false);
            txtTotalImpoconsumo.setVisible(false);
            jCheckBox1.setVisible(false);
            txtRiva.setVisible(false);
            cmbRtf.setVisible(false);
            txtRtf.setVisible(false);
            lbSubtotal.setText("Subtotal:");
        }

        if (instancias.getConfiguraciones().getTipoImpresion().equals("Sin-Codigo")) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        if (!instancias.getConfiguraciones().isInventarioBodegas()) {
            lbBodega.setVisible(false);
            txtBodega.setVisible(false);
        }

        if (!instancias.getConfiguraciones().isPuc()) {
            lbModeloContable.setVisible(false);
            txtModeloContable.setVisible(false);
        }

        Object[] informacion = instancias.getSql().getDatosPrefijosYModelos();
        if (null != informacion[13]) {
            txtModeloContable.setText(informacion[13].toString());
        }
        if (instancias.getIdDS()!= null ){
          jCheckBoxDS.setVisible(false);
          lbFacturaNo3.setVisible(false);
          DS.setVisible(false);
        }
    }

    public void consultarMaestros() {
        datos = instancias.getSql().getDatosMaestra();
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public void setTipo(String tipo) {
        switch (tipo) {
            case "ingreso":
                lbFacturaNo.setText("Ingreso No.");
                lbNoFactura.setText((String) instancias.getSql().getNumConsecutivoActual("ING")[0]);

                Object[][] mat1 = instancias.getSql().getProductosPrecompraDetalle("ING");
                for (Object[] reg : mat1) {
                    modeloPro1.addRow(new Object[]{reg[0], reg[3], reg[4], metodos.fecha(reg[5].toString()), reg[6], reg[2], reg[1], reg[7], reg[8],"1",reg[9]});
                }

                Object[][] mat = instancias.getSql().getProductosPrecompra("ING",instancias.getUsuario());

                for (Object[] reg : mat) {
                    cargarProductoPreCompra((String) reg[0], new Double((String) reg[4]) + "", Integer.parseInt((String) reg[3]), big.getBigDecimal(reg[5]) + "", false);
                    try {
                        BigDecimal descuento = big.getBigDecimal(reg[6]);
                        BigDecimal porcentaje2 = big.getBigDecimal(descuento.multiply(big.getBigDecimal("100")).divide(big.getBigDecimal(reg[7]), 2, RoundingMode.HALF_DOWN));
                        tblProductos.setValueAt(porcentaje2, tblProductos.getRowCount() - 1, 5);
                        tblProductos.setValueAt(big.getBigDecimal(reg[6]).toString().replace(".", ","), tblProductos.getRowCount() - 1, 6);
                    } catch (Exception e) {
                        tblProductos.setValueAt(0, tblProductos.getRowCount() - 1, 5);
                        tblProductos.setValueAt(this.simbolo + " 0", tblProductos.getRowCount() - 1, 6);
                    }

                    KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                    tblProductosKeyReleased(x);
                }
                
                lbFechaFactura.setText("Fecha Compra");

                break;
            case "ordenCompra":
                jCheckBoxDS.setVisible(false);
                lbFacturaNo3.setVisible(false);
                DS.setVisible(false);
                lbFacturaNo.setText("Orden No.");
                lbNoFactura.setText((String) instancias.getSql().getNumConsecutivoActual("ORDENCOMPRA")[0]);
                txtNumero.setVisible(false);
                cmbTipo.setVisible(false);
                lbTipo.setVisible(false);
                lbNumero.setVisible(false);

                lbModeloContable.setVisible(false);
                txtModeloContable.setVisible(false);

                cmbCargar.setSelectedIndex(1);
                cmbCargar.setEnabled(false);
                btnAnular.setVisible(false);

                lbDesc.setVisible(false);
                txtDescuento.setVisible(false);

                lbFechaFactura.setText("Fecha Orden");
                break;
        }
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
                    case "proveedor":
                        if ((btnAnular.isEnabled()) && (btnAnular.isVisible())) {
                            btnBuscTercerosActionPerformed(null);
                        }
                        break;
                    case "productos":
                        if ((btnBusProd.isEnabled()) && (btnBusProd.isVisible())) {
                            btnBusProdActionPerformed(null);
                        }
                        break;
                    case "valor":
                        if (tblProductos.getSelectedRow() > -1) {
                            tblProductos.editCellAt(tblProductos.getSelectedRow(), 2);
                            tblProductos.setColumnSelectionInterval(2, 2);
                            tblProductos.transferFocus();
                        }
                        break;
                    case "cantidad":
                        if (tblProductos.getSelectedRow() > -1) {
                            tblProductos.editCellAt(tblProductos.getSelectedRow(), 3);
                            tblProductos.setColumnSelectionInterval(3, 3);
                            tblProductos.transferFocus();
                        }
                        break;
                    case "cargarAutomatico":
                        break;
                }
            }
        };
        return a;
    }

    public boolean isPlu() {
        return plu;
    }

    public void setPlu(boolean plu) {
        this.plu = plu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        popBorrar = new javax.swing.JMenuItem();
        grpTipoDescuento = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlFormulario = new javax.swing.JPanel();
        pblBotones = new javax.swing.JPanel();
        txtCodProducto = new javax.swing.JTextField();
        lbProducto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        lbProducto1 = new javax.swing.JLabel();
        cmbBodegas = new javax.swing.JComboBox();
        btnBusProd = new javax.swing.JButton();
        lbProducto2 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        lbBodega = new javax.swing.JLabel();
        txtBodega = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbNit = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnBuscTerceros = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtPorcentaje = new javax.swing.JTextField();
        lbVendedor1 = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbNumero1 = new javax.swing.JLabel();
        lbNumero2 = new javax.swing.JLabel();
        txtCantProductos = new javax.swing.JTextField();
        txtCantUnidades = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lbFechaFactura = new javax.swing.JLabel();
        txtFechaFactura = new datechooser.beans.DateChooserCombo();
        txtDiasPlazo = new javax.swing.JTextField();
        txtDiasPlazo1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lbTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        lbNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lbModeloContable = new javax.swing.JLabel();
        txtModeloContable = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        lbNumero3 = new javax.swing.JLabel();
        cmbTipo1 = new javax.swing.JComboBox();
        cmbCargar = new javax.swing.JComboBox();
        txtCargarCompra = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        lbFacturaNo = new javax.swing.JLabel();
        lbNoFactura = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lbNumero4 = new javax.swing.JLabel();
        chkPorcentaje = new javax.swing.JCheckBox();
        chkPesos = new javax.swing.JCheckBox();
        lbFacturaNo3 = new javax.swing.JLabel();
        DS = new javax.swing.JLabel();
        jCheckBoxDS = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        btnAnular = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscTerceros2 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        etiqTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        lbSubtotal = new javax.swing.JLabel();
        txtIva = new javax.swing.JLabel();
        lbTotalDescuento = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JLabel();
        etiqTotal1 = new javax.swing.JLabel();
        txtTotalDescuentos = new javax.swing.JLabel();
        txtTotalIva = new javax.swing.JLabel();
        txtTotalImpoconsumo = new javax.swing.JLabel();
        cmbRtf = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtRtf = new javax.swing.JLabel();
        txtRiva = new javax.swing.JLabel();
        btnBuscTerceros3 = new javax.swing.JButton();
        btnImportarExcel = new javax.swing.JButton();
        pnlInvisible = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        txtIdSistema = new javax.swing.JTextField();
        txtVencimiento = new datechooser.beans.DateChooserCombo();

        popBorrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        popBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        popBorrar.setText("Borrar");
        popBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popBorrarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popBorrar);

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormulario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlFormularioMouseClicked(evt);
            }
        });

        pblBotones.setBackground(new java.awt.Color(255, 255, 255));
        pblBotones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtCodProducto.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtCodProducto.setName("combo"); // NOI18N
        txtCodProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodProductoFocusGained(evt);
            }
        });
        txtCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProductoActionPerformed(evt);
            }
        });
        txtCodProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodProductoKeyReleased(evt);
            }
        });

        lbProducto.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbProducto.setText("Producto:");
        lbProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbProductoKeyReleased(evt);
            }
        });

        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(2);
        txtObservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtObservacionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtObservaciones);

        lbProducto1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbProducto1.setText("Observaciones");
        lbProducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbProducto1KeyReleased(evt);
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

        lbProducto2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbProducto2.setText("Cant:");
        lbProducto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbProducto2KeyReleased(evt);
            }
        });

        txtCant.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCant.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCant.setEnabled(false);
        txtCant.setName("combo"); // NOI18N
        txtCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantActionPerformed(evt);
            }
        });
        txtCant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantFocusGained(evt);
            }
        });
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

        javax.swing.GroupLayout pblBotonesLayout = new javax.swing.GroupLayout(pblBotones);
        pblBotones.setLayout(pblBotonesLayout);
        pblBotonesLayout.setHorizontalGroup(
            pblBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblBotonesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pblBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbProducto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(pblBotonesLayout.createSequentialGroup()
                        .addComponent(lbProducto2)
                        .addGap(2, 2, 2)
                        .addGroup(pblBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbBodegas, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pblBotonesLayout.createSequentialGroup()
                                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lbBodega)
                                .addGap(1, 1, 1)
                                .addComponent(txtBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodProducto)
                                .addGap(2, 2, 2)
                                .addComponent(btnBusProd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(5, 5, 5))
        );
        pblBotonesLayout.setVerticalGroup(
            pblBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblBotonesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pblBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBusProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBodega, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pblBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbProducto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCodProducto))
                .addGap(3, 3, 3)
                .addComponent(cmbBodegas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbProducto1)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        tblProductos.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Valor/Unit", "Cant", "Subtotal", "Desc %", "Desc", "Iva %", "Impo %", "Impo", "Medida", "Ultimo costo", "Lista 1", "plu", "cant", "Ponderado", "% Aum", "Utilidad", "% Rent.", "Bodega", "Impoconsumo", "Total", "Iva", "Borrar", "idSistema"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, true, true, true, true, true, false, false, true, false, false, false, true, false, false, true, true, false, true, false, true
            };

            boolean[] canEditDinamico = new boolean [] {
                false, false, true, false, false, true, true, true, true, true, false, false, true, false, false, false, true, false, false, true, true, false, true, false, true
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
        tblProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblProductos.setRowHeight(25);
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        tblProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblProductosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProductosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(300);
            tblProductos.getColumnModel().getColumn(2).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(120);
            tblProductos.getColumnModel().getColumn(2).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(3).setMinWidth(65);
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(65);
            tblProductos.getColumnModel().getColumn(3).setMaxWidth(65);
            tblProductos.getColumnModel().getColumn(4).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblProductos.getColumnModel().getColumn(4).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(5).setMinWidth(40);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblProductos.getColumnModel().getColumn(5).setMaxWidth(80);
            tblProductos.getColumnModel().getColumn(6).setMinWidth(60);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(80);
            tblProductos.getColumnModel().getColumn(6).setMaxWidth(120);
            tblProductos.getColumnModel().getColumn(7).setMinWidth(30);
            tblProductos.getColumnModel().getColumn(7).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(7).setMaxWidth(70);
            tblProductos.getColumnModel().getColumn(8).setMinWidth(30);
            tblProductos.getColumnModel().getColumn(8).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(8).setMaxWidth(70);
            tblProductos.getColumnModel().getColumn(9).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(9).setPreferredWidth(120);
            tblProductos.getColumnModel().getColumn(9).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(10).setMinWidth(50);
            tblProductos.getColumnModel().getColumn(10).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(10).setMaxWidth(50);
            tblProductos.getColumnModel().getColumn(11).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(11).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(11).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(12).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(12).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(12).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(13).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(13).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(13).setMaxWidth(0);
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
            tblProductos.getColumnModel().getColumn(19).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(19).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(19).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(20).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(20).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(20).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(21).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(21).setPreferredWidth(120);
            tblProductos.getColumnModel().getColumn(21).setMaxWidth(150);
            tblProductos.getColumnModel().getColumn(22).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(22).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(22).setMaxWidth(0);
            tblProductos.getColumnModel().getColumn(23).setMinWidth(40);
            tblProductos.getColumnModel().getColumn(23).setPreferredWidth(40);
            tblProductos.getColumnModel().getColumn(23).setMaxWidth(40);
            tblProductos.getColumnModel().getColumn(24).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(24).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(24).setMaxWidth(0);
        }
        tblProductos.getAccessibleContext().setAccessibleName("1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("Nit:");

        txtNit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNit.setName("CC/NIT"); // NOI18N
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
        });

        lbNombre.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNombre.setText("Proveedor:");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setName("Nombre"); // NOI18N

        lbDireccion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbDireccion.setText("Dirección:");

        txtDireccion.setEditable(false);
        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDireccion.setName("Direccion"); // NOI18N

        lbTelefono.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTelefono.setText("Tel:");

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setName("Telefono"); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnBuscTerceros, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(lbTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombre)
                    .addComponent(txtDireccion))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscTerceros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion)
                            .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtPorcentaje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorcentaje.setText("0");
        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyReleased(evt);
            }
        });

        lbVendedor1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbVendedor1.setText("Descuento prods %:");
        lbVendedor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVendedor1MouseClicked(evt);
            }
        });

        lbDesc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbDesc.setText("Descuento general %:");

        txtDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescuento.setText("0");
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVendedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentaje))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescuento))
                .addGap(2, 2, 2))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lbNumero1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNumero1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNumero1.setText("Cant Productos:");

        lbNumero2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbNumero2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNumero2.setText("Cant Unidades:");

        txtCantProductos.setEditable(false);
        txtCantProductos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCantProductos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCantProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantProductosKeyReleased(evt);
            }
        });

        txtCantUnidades.setEditable(false);
        txtCantUnidades.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCantUnidades.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCantUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantUnidadesKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCantProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(txtCantUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbFechaFactura.setBackground(new java.awt.Color(204, 204, 204));
        lbFechaFactura.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbFechaFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFechaFactura.setText("Fecha factura");
        lbFechaFactura.setOpaque(true);

        txtFechaFactura.setFieldFont(new java.awt.Font("Century Gothic", java.awt.Font.PLAIN, 12));
        txtFechaFactura.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                txtFechaFacturaOnCommit(evt);
            }
        });

        txtDiasPlazo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDiasPlazo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiasPlazo.setToolTipText("Días de plazo para pagar esta factura.");
        txtDiasPlazo.setName("Plazo"); // NOI18N
        txtDiasPlazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasPlazoActionPerformed(evt);
            }
        });
        txtDiasPlazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiasPlazoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasPlazoKeyTyped(evt);
            }
        });

        txtDiasPlazo1.setEditable(false);
        txtDiasPlazo1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        txtDiasPlazo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiasPlazo1.setText("Plazo: ");
        txtDiasPlazo1.setToolTipText("Días de plazo para pagar esta factura.");
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbFechaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiasPlazo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtDiasPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiasPlazo)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtFechaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtDiasPlazo1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        lbTipo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbTipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTipo.setText("Tipo");

        cmbTipo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FACTURA", "DOC. EQUIVALENTE", "OTRO INGRESO" }));
        cmbTipo.setBorder(null);
        cmbTipo.setName("Tipo"); // NOI18N
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        lbNumero.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbNumero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNumero.setText("Número");

        txtNumero.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.setToolTipText("Número de factura del ingreso.");
        txtNumero.setName("Número Factura"); // NOI18N
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroKeyReleased(evt);
            }
        });

        lbModeloContable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbModeloContable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbModeloContable.setText("M. Contable:");

        txtModeloContable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtModeloContable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModeloContable.setToolTipText("Número de factura del ingreso.");
        txtModeloContable.setName("Número Factura"); // NOI18N
        txtModeloContable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloContableKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbModeloContable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(cmbTipo, 0, 0, Short.MAX_VALUE)
                    .addComponent(txtModeloContable))
                .addGap(5, 5, 5))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumero)
                    .addComponent(lbNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModeloContable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtModeloContable)))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lbNumero3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbNumero3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNumero3.setText("Tipo Impresión:");

        cmbTipo1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbTipo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CARTA", "POS" }));
        cmbTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipo1ActionPerformed(evt);
            }
        });

        cmbCargar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbCargar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Ingreso", "Cargar Orden" }));
        cmbCargar.setToolTipText("Cargar una orden o compra ya registradas.");

        txtCargarCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCargarCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCargarCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCargarCompraKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lbNumero3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTipo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(cmbCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbCargar)
                    .addComponent(txtCargarCompra))
                .addGap(5, 5, 5))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        lbFacturaNo.setBackground(new java.awt.Color(204, 204, 204));
        lbFacturaNo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbFacturaNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFacturaNo.setText("Ingreso No.");
        lbFacturaNo.setOpaque(true);

        lbNoFactura.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbNoFactura.setForeground(new java.awt.Color(255, 0, 0));
        lbNoFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNoFactura.setText("3");
        lbNoFactura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFacturaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbFacturaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbNoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        lbNumero4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbNumero4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNumero4.setText("Tipo Descuento");

        grpTipoDescuento.add(chkPorcentaje);
        chkPorcentaje.setText("%");
        chkPorcentaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkPorcentaje.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkPorcentajeItemStateChanged(evt);
            }
        });

        grpTipoDescuento.add(chkPesos);
        chkPesos.setText("$");
        chkPesos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkPesos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkPesosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(chkPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbNumero4))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPesos)
                    .addComponent(chkPorcentaje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbFacturaNo3.setBackground(new java.awt.Color(204, 204, 204));
        lbFacturaNo3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbFacturaNo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFacturaNo3.setText("D. Soporte #");
        lbFacturaNo3.setOpaque(true);

        DS.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DS.setForeground(new java.awt.Color(255, 51, 51));
        DS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DS.setText("N/A");
        DS.setToolTipText("");
        DS.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBoxDS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxDS.setText("es D. Sp");
        jCheckBoxDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFacturaNo3, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(DS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxDS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBoxDS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbFacturaNo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DS))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        btnAnular.setBackground(new java.awt.Color(241, 148, 138));
        btnAnular.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
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

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
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

        btnBuscTerceros2.setBackground(new java.awt.Color(247, 220, 111));
        btnBuscTerceros2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBuscTerceros2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnBuscTerceros2.setText("REIMPRIMIR");
        btnBuscTerceros2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros2.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTerceros2ActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscTerceros2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAnular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(btnGuardar)
                .addGap(2, 2, 2)
                .addComponent(btnLimpiar)
                .addGap(2, 2, 2)
                .addComponent(btnBuscTerceros2)
                .addGap(2, 2, 2)
                .addComponent(btnAnular)
                .addGap(2, 2, 2))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        etiqTotal.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        etiqTotal.setText("Total:");

        txtTotal.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        txtTotal.setText("0");

        lbSubtotal.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbSubtotal.setText("Subtotal sin IVA:");

        txtIva.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtIva.setText("IVA:");

        lbTotalDescuento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTotalDescuento.setText("Descuentos:");

        txtSubTotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSubTotal.setText("0");

        etiqTotal1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        etiqTotal1.setText("Impoconsumo:");

        txtTotalDescuentos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTotalDescuentos.setText("0");

        txtTotalIva.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTotalIva.setText("0");

        txtTotalImpoconsumo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTotalImpoconsumo.setText("0");

        cmbRtf.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        cmbRtf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Retefuente", "0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "6", "7", "10", "11", "20" }));
        cmbRtf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRtfItemStateChanged(evt);
            }
        });
        cmbRtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRtfActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCheckBox1.setText("Rete Iva   ");
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        txtRtf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRtf.setText("0");

        txtRiva.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRiva.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(etiqTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbTotalDescuento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSubtotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbRtf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRtf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalDescuentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiqTotal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRiva, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtTotalIva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalImpoconsumo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalIva, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalDescuento)
                    .addComponent(txtTotalDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalImpoconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbRtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRtf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBuscTerceros3.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscTerceros3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBuscTerceros3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-de-suma.png"))); // NOI18N
        btnBuscTerceros3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros3.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTerceros3ActionPerformed(evt);
            }
        });

        btnImportarExcel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnImportarExcel.setText("IMPORTAR BASE DE EXCEL");
        btnImportarExcel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImportarExcel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnImportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarExcelActionPerformed(evt);
            }
        });

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

        txtVencimiento.setFieldFont(new java.awt.Font("Century Gothic", java.awt.Font.PLAIN, 12));

        javax.swing.GroupLayout pnlInvisibleLayout = new javax.swing.GroupLayout(pnlInvisible);
        pnlInvisible.setLayout(pnlInvisibleLayout);
        pnlInvisibleLayout.setHorizontalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlInvisibleLayout.setVerticalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlInvisibleLayout.createSequentialGroup()
                        .addGroup(pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(txtIdSistema))
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnImportarExcel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                                .addComponent(pblBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(0, 0, 0)
                                .addComponent(btnBuscTerceros3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlInvisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImportarExcel))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnBuscTerceros3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pblBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1222, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodProductoFocusGained
        tblProductos.removeEditor();
        cargarTotales();
    }//GEN-LAST:event_txtCodProductoFocusGained

    private void txtCodProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String codigo = txtCodProducto.getText();
            plu = true;
            cargarProducto(codigo.replace("'", "//"), txtCant.getText(), 1, "Directo");
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
        } else if (evt.getKeyCode() == KeyEvent.VK_MULTIPLY && evt.getKeyCode() == KeyEvent.VK_SHIFT) {
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
   
    private String validacionProveedor(){
      ndTercero nodoTerc = instancias.getSql().getDatosTercero(txtIdSistema.getText());
      String mensaje="";  
      String pais = nodoTerc.getPais();
        if(Objects.isNull(pais)){
            mensaje+="No tiene Pais Asignado"+"<br>";  
        }
        String ciudad = nodoTerc.getCiudad();
        if(Objects.isNull(ciudad)){
            mensaje+="No tiene Ciudad Asignado"+"<br>";  
        }
        String departamento = nodoTerc.getDepartamento();
        if(Objects.isNull(departamento)){
            mensaje+="No tiene Departamento Asignado"+"<br>";  
        }
        String codigoPostalAdquirente = nodoTerc.getCategoria();   
        if(Objects.isNull(codigoPostalAdquirente)){
            mensaje+="No tiene Codigo Postal Asignado"+"<br>";  
        }
        String emailAdquiriente = nodoTerc.getEmail();
        if(Objects.isNull(emailAdquiriente)){
            mensaje+="No tiene Correo Asignado"+"<br>";  
        }
        String telefono = nodoTerc.getTelefono();
        if(Objects.isNull(telefono)){
            mensaje+="No tiene Telefono Asignado"+"<br>";  
        }
        
       return mensaje;
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!saltarPasos) {
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                if (big.getMoneda(tblProductos.getValueAt(i, 2).toString()).compareTo(BigDecimal.ZERO) <= 0) {
                    metodos.msgError(null, "Hay productos con costo " + this.simbolo + " 0");
                    tblProductos.editCellAt(i, 2);
                    tblProductos.setColumnSelectionInterval(2, 2);
                    tblProductos.transferFocus();
                    return;
                }

                if (big.getBigDecimal(tblProductos.getValueAt(i, 3).toString().replace(",", ".")).compareTo(BigDecimal.ZERO) <= 0) {
                    metodos.msgError(null, "Hay productos con cantidad 0");
                    tblProductos.editCellAt(i, 3);
                    tblProductos.setColumnSelectionInterval(3, 3);
                    tblProductos.transferFocus();
                    return;
                }
            }
        }

        cancelarCompra = false;

        boolean contado = false;
        if (!(txtDiasPlazo.getText().equals("") || txtDiasPlazo.getText().equals("0"))) {
            contado = false;
        } else {
            contado = true;
        }

        tblProductos.removeEditor();

        int xyz = tblProductos.getRowCount();
        if (xyz > 0) {
            for (int i = 0; i < xyz; i++) {
                calcularTabla(i);
            }
        }

        if (tblProductos.getRowCount() == 0) {
            metodos.msgError(null, "No ha añadido ningun producto");
        } else {

            String baseUtilizada = obtenerBase();

            if (!saltarPasos) {
                if (tipo.equals("ingreso")) {
                    if (txtNumero.getText().equals("") && !cmbTipo.getSelectedItem().equals("OTRO INGRESO")) {
                        metodos.msgAdvertenciaAjustado(null, "Debe ingresar el número de la factura");
                        return;
                    }

                    Object[] campos = {txtNit, txtDiasPlazo, txtNumero};
                    String faltantes = metodos.camposVacios(campos);
                    if (!faltantes.equals("")) {
                        metodos.msgAdvertencia(null, "Faltan los siguientes campos: " + faltantes);
                        return;
                    }
                    
                    Boolean existe = instancias.getSql().existeFacturaCompra(txtIdSistema.getText(), txtNumero.getText());
                    if (existe) {
                        if (metodos.msgPregunta(null, "¿La factura ya existe, Desea continuar?") != 0) {
                            return;
                        }
                    }
                }
            }
            
            if (!saltarPasos) {
                if (txtNombre.getText().equals("")) {
                    metodos.msgAdvertenciaAjustado(null, "Debe ingresar un proveedor");
                    return;
                }

                
            }
            
            String numeroDocumentoSoporte="";
            
            if (tipo.equals("ingreso")) {
            
                if(jCheckBoxDS.isSelected()){
                   numeroDocumentoSoporte=DS.getText();
                }

                if(jCheckBoxDS.isSelected()){               
                   if (metodos.msgPregunta(null, "¿Desea Realizar un Documento Soporte?") != 0) {
                      jCheckBoxDS.setSelected(false);
                      numeroDocumentoSoporte="";
                      DS.setText("N/A");
                   }else{  
                      Object[] datosDocElect = instancias.getSql().getResolucionTerminales("DS");
                        if(datosDocElect.length == 0){
                            metodos.msgAdvertenciaAjustado(null, "No Existe la Configuración para el Documento Soporte");
                            return;
                        }else{
                            long consecutivoRsol = Long.valueOf((String)datosDocElect[7]);
                            long consecInicioRsol =  Long.valueOf((String)datosDocElect[5]);
                            long consecfinRsol =  Long.valueOf((String)datosDocElect[6]);
                      
                            if(!( consecutivoRsol >= consecInicioRsol && consecInicioRsol <= consecfinRsol)){
                              metodos.msgAdvertenciaAjustado(null, "La Numeración Esta Fuera del Rango Permitido");
                              return;    
                            }
                            
                            if(Objects.isNull(datosDocElect[4])){
                              metodos.msgAdvertenciaAjustado(null, "El Prefijo es Obligatorio para el Documento Soporte");
                            }
                            System.err.println("metodosGenerales.fecha() "+metodosGenerales.fecha());
                            System.err.println(" metodos.sumarFecha(metodos.desdeDate2(getCalendarFromDateHum((String)datosDocElect[3])),0) "+ metodos.sumarFecha(metodos.desdeDate2(getCalendarFromDateHum((String)datosDocElect[3])),0));
                            long diasFaltantes = metodos.restarFecha(metodosGenerales.fecha(), metodos.sumarFecha(metodos.desdeDate2(getCalendarFromDateHum((String)datosDocElect[3])),0));
                            System.err.println("diasFaltantes "+diasFaltantes);
                            if(diasFaltantes < 0 ){
                              metodos.msgAdvertenciaAjustado(null, "Resolucion Vencida "+(String)datosDocElect[3]);
                              return;
                            }
                            
                            if(diasFaltantes >= 0 && diasFaltantes <= 2){
                              metodos.msgAdvertenciaAjustado(null, "Resolucion Proxima a Vencer "+(String)datosDocElect[3]);
                            } 
                            String mensaje = validacionProveedor().trim();
                            if(!mensaje.equals("")){
                              metodos.msgAdvertenciaAjustado(null, mensaje);
                              return;
                            }
                        }   
                    if(setDocumentoSoporte(datosDocElect)){                 
                      instancias.getSql().incrementarFacturaActualYDesbloquear("DS");
                      metodos.msgAdvertenciaAjustado(null, "Documento Soporte Generado Correctamente");
                      Gson gSon = new Gson();
                        try {
                            RespuestaServicioEnvioFacturas respuestaApi;
                            respuestaApi = gSon.fromJson(getRespuesta(), RespuestaServicioEnvioFacturas.class);
                            LogsFacturaApi(respuestaApi, numeroDocumentoSoporte);
                        } catch (Exception e1) {
                            instancias.getSql().desbloquearConsecutivosfactura();
                            Respuesta respuestaError = gSon.fromJson(getRespuesta(), Respuesta.class);
                            instancias.getSql().almacenarLogsServicioFacturacion("0", numeroDocumentoSoporte, "", "Error en el Servicio", "", respuestaError.getMensaje(),"1");
                        } 
                    }else{
                      instancias.getSql().desbloquearConsecutivosfactura();
                      metodos.msgAdvertenciaAjustado(null, "Error al generar el Documento Soporte");
                      return;
                    }
                   }
                }else{
                    if (metodos.msgPregunta(null, "¿Desea continuar?") != 0) {
                        return;
                    }
                }
            }
            String ingreso = "";
            if (tipo.equals("ingreso")) {
                ingreso = "ING-" + instancias.getSql().getNumConsecutivo("ING")[0];
            } else {
                ingreso = "ORDENCOMPRA-" + instancias.getSql().getNumConsecutivo("ORDENCOMPRA")[0];
            }

            if (saltarPasos) {

            } else {
                if (tipo.equals("ingreso")) {
                    if (contado) {
                        String tipo = new dlgTipoEgreso(null, true).seleccionar();
                        instancias.getEgresos().setSaltarPasos(true);
                        if (!tipo.equals("")) {
                            BigDecimal subtotal = big.getMoneda(txtTotal.getText()).subtract(big.getMoneda(txtTotalIva.getText()));
                            instancias.getEgresos().cargarEgreso(txtNit.getText(), big.getMoneda(txtTotal.getText()), txtNumero.getText(),
                                    "PAGOS PROVEEDORES", "CANCELACION FACTURA", tipo, ingreso, big.getMoneda(txtTotalIva.getText()), subtotal,
                                    BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, "registrandoCompra");
                        }
                    }
                }
            }

            if (cancelarCompra) {
                return;
            }

            //PROCESO GUARDAR INGRESO
            String por = "";
            if (cmbRtf.getSelectedIndex() == 0) {
                por = "0";
            } else {
                por = cmbRtf.getSelectedItem().toString();
            }

            String fechaFactura = metodos.desdeDate(txtFechaFactura.getCurrent());
            String fechaVencimiento = metodos.desdeDate(txtVencimiento.getCurrent());            
            

            Object[] vector = {ingreso, txtIdSistema.getText(), fechaFactura, fechaVencimiento, big.getMoneda(txtTotal.getText()), big.getMoneda(txtTotalDescuentos.getText()),
                big.getMoneda(txtTotalIva.getText()), big.getMoneda(txtSubTotal.getText()), cmbTipo.getSelectedItem(), txtNumero.getText(),
                !txtFechaFactura.getText().equals(txtVencimiento.getText()), "", instancias.getUsuario(), instancias.getTerminal(),
                big.getMoneda(txtRiva.getText()), big.getMoneda(txtRtf.getText()), por, txtObservaciones.getText(), metodosGenerales.hora(),
                big.getMoneda(txtTotalImpoconsumo.getText()), "PENDIENTE", big.getMoneda("0"), big.getMoneda("0"), big.getMoneda("0"),
                big.getMoneda("0"), big.getMoneda("0"), big.getMoneda("0"), txtBodega.getText(), txtModeloContable.getText(),numeroDocumentoSoporte};

            ndIngreso nodo = metodos.llenarIngreso(vector);

            if (!instancias.getSql().agregarIngreso(nodo)) {
                boolean noPuedaGuardar = false;
                instancias.getSql().eliminarIngreso(ingreso);
                while (!noPuedaGuardar) {
                    noPuedaGuardar = instancias.getSql().eliminarCompra(ingreso);
                }

                metodos.msgError(null, "Hubo un problema al guardar la compra");
                return;
            }

            //PROCESO GUARDAR COMPRA
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                ndProducto producto = instancias.getSql().getDatosProducto(tblProductos.getValueAt(i, 24).toString(), baseUtilizada);
                String cant2 = "1";
                switch (tblProductos.getValueAt(i, 13).toString()) {
                    case "2":
                        cant2 = producto.getCantidad2();
                        break;
                    case "3":
                        cant2 = producto.getCantidad3();
                        break;
                    case "4":
                        cant2 = producto.getCantidad4();
                        break;
                    case "5":
                        cant2 = producto.getCantidad5();
                        break;
                    case "6":
                        cant2 = producto.getCantidad6();
                        break;
                    case "7":
                        cant2 = producto.getCantidad7();
                        break;
                    case "8":
                        cant2 = producto.getCantidad8();
                        break;
                }

                String bodega = "BD-Principal";
                if (instancias.getConfiguraciones().isInventarioBodegas()) {
                    try {
                        bodega = tblProductos.getValueAt(i, 19).toString();
                    } catch (Exception e) {
                    }
                }

                BigDecimal iva = BigDecimal.ZERO, impoconsumo = BigDecimal.ZERO;

                impoconsumo = big.getMoneda((String) tblProductos.getValueAt(i, 9));
                iva = big.getMoneda((String) tblProductos.getValueAt(i, 22));

                Object vectCompra[] = {ingreso, tblProductos.getValueAt(i, 24), big.getMoneda((String) tblProductos.getValueAt(i, 2)), tblProductos.getValueAt(i, 14),
                    big.getMoneda((String) tblProductos.getValueAt(i, 6)), big.getMoneda((String) tblProductos.getValueAt(i, 21)), big.getMoneda((String) tblProductos.getValueAt(i, 22)),
                    big.getMoneda((String) tblProductos.getValueAt(i, 4)), tblProductos.getValueAt(i, 7).toString(), tblProductos.getValueAt(i, 1), tblProductos.getValueAt(i, 13) + "",
                    tblProductos.getValueAt(i, 3), big.getMoneda((String) tblProductos.getValueAt(i, 2)).divide(big.getBigDecimal(cant2), 2, RoundingMode.HALF_DOWN),
                    bodega, impoconsumo, tblProductos.getValueAt(i, 8).toString(),instancias.getUsuario(),numeroDocumentoSoporte};

                ndCompra nodoComp = metodos.llenarCompra(vectCompra);

                if (!instancias.getSql().agregarCompra(nodoComp)) {
                    boolean noPuedaGuardar = false;

                    instancias.getSql().eliminarIngreso(ingreso);
                    while (!noPuedaGuardar) {
                        noPuedaGuardar = instancias.getSql().eliminarCompra(ingreso);
                    }

                    metodos.msgError(null, "Error al guardar la compra");
                    return;
                }
            }

            if (!txtCargarCompra.getText().equals("")) {
                instancias.getSql().cambiarEstadoGeneral("REALIZADO", "ORDENCOMPRA-" + txtCargarCompra.getText(), "bdIngreso");
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

                String conse = instancias.getSql().getNumConsecutivo("DETALLEPROD")[0].toString();
                if (!instancias.getSql().agregarDetalladoProducto(conse, tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(),
                        cant, tblDetalle.getValueAt(i, 1).toString(), tblDetalle.getValueAt(i, 2).toString(),
                        metodos.fechaConsulta(fecha), tblDetalle.getValueAt(i, 4).toString(), "DISPONIBLE", ingreso,
                        metodos.fechaConsulta(metodosGenerales.fecha()), metodosGenerales.hora(), instancias.getUsuario(), tblDetalle.getValueAt(i, 7).toString(),
                        tblDetalle.getValueAt(i, 8).toString(), txtBodega.getText())) {
                    metodos.msgError(null, "Hubo un problema al guardar el detalle del producto");
                    return;
                }

//                if (!instancias.getSql().aumentarConsecutivo("DETALLEPROD", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("DETALLEPROD")[0]) + 1)) {
//                    metodos.msgError(null, "Hubo un problema al guardar en el consecutivo del detalle del producto");
//                }

            }

            if (tipo.equals("ingreso")) {
                if (!(txtDiasPlazo.getText().equals("") || txtDiasPlazo.getText().equals("0"))) {
                    Object[] vectCxp = {ingreso, "FACT-" + txtNumero.getText(), "PEND", "", metodos.desdeDate(txtVencimiento.getCurrent()),
                        instancias.getUsuario(), big.getMoneda(txtTotal.getText()),
                        txtDiasPlazo.getText(), instancias.getTerminal()};

                    ndCxp nodoCxp = metodos.llenarCxp(vectCxp);

                    if (!instancias.getSql().agregarCxp(nodoCxp)) {
                        metodos.msgError(null, "Hubo un problema al guardar la factura en cartera");
                    }
                }
            }

            //CAMBIAR CONSECUTIVO INGRESO
            if (tipo.equals("ingreso")) {
//                if (!instancias.getSql().aumentarConsecutivo("ING", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("ING")[0]) + 1)) {
//                    metodos.msgError(null, "Hubo un problema al guardar en el consecutivo del la compra");
//                }
                lbNoFactura.setText((String) instancias.getSql().getNumConsecutivoActual("ING")[0]);
            } else {
//                if (!instancias.getSql().aumentarConsecutivo("ORDENCOMPRA", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("ORDENCOMPRA")[0]) + 1)) {
//                    metodos.msgError(null, "Hubo un problema al guardar en el consecutivo del la compra");
//                }
                lbNoFactura.setText((String) instancias.getSql().getNumConsecutivoActual("ORDENCOMPRA")[0]);
            }

            if (tipo.equals("ingreso")) {
                for (int i = 0; i < tblProductos.getRowCount(); i++) {

                    ndProducto producto;

                    producto = instancias.getSql().getDatosProducto(tblProductos.getValueAt(i, 24).toString(), baseUtilizada);

                    double inventario, inventarioConteo;
                    double cantidad;
                    double fisicoInventario;

                    try {
                        inventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    } catch (Exception e) {
                        inventario = 0;
                    }

                    double inv2 = inventario;

                    try {
                        cantidad = Double.parseDouble(producto.getCompras().replace(",", "."));
                    } catch (Exception e) {
                        cantidad = 0;
                    }

                    try {
                        fisicoInventario = Double.parseDouble(producto.getFisicoInventario().replace(",", "."));
                    } catch (Exception e) {
                        fisicoInventario = Double.parseDouble(producto.getCompras().replace(",", "."));
                    }

                    double cantidadProd = Double.parseDouble(tblProductos.getValueAt(i, 14).toString().replace(",", "."));

                    inventario = inventario + cantidadProd;
                    fisicoInventario = fisicoInventario + cantidadProd;
                    double total = cantidad + cantidadProd;

                    String total1 = String.valueOf(df.format(total)).replace(".", ",");
                    String inventario1 = String.valueOf(df.format(inventario)).replace(".", ",");
                    String fisicoInventario1 = String.valueOf(df.format(fisicoInventario)).replace(".", ",");

                    instancias.getSql().modificarInventario("compras", total1, tblProductos.getValueAt(i, 24).toString(), baseUtilizada);
                    instancias.getSql().modificarInventario("inventario", inventario1, tblProductos.getValueAt(i, 24).toString(), baseUtilizada);
                    instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, tblProductos.getValueAt(i, 24).toString(), baseUtilizada);

                    if (inv2 < 0) {
                        inventarioConteo = cantidadProd;
                    } else {
                        inventarioConteo = inventario;
                    }

                    Object[] ultimoPonderado = instancias.getSql().getUltimoPonderado(tblProductos.getValueAt(i, 24).toString());

                    //CALCULAMOS LO QUE HABIA VIEJO
                    double inv = big.formatDouble(producto.getInventario().replace(",", "."));

                    double ponderadoViejo = 0;
                    try {
                        ponderadoViejo = big.formatDouble(big.getBigDecimal(ultimoPonderado[4].toString()));
                    } catch (Exception e) {
                    }

                    double totalViejo;
                    if (inv > 0) {
                        totalViejo =  big.formatDouble(inv*ponderadoViejo);
                    } else {
                        totalViejo = 0;
                    }

                    //CALCULAMOS LO QUE ENTRA NUEVO
                    double nuevoPrecio;
                    double cant = big.formatDouble(tblProductos.getValueAt(i, 14).toString().replace(",", "."));

                    if (instancias.getRegimen().equals("SinIva")) {
                        nuevoPrecio = big.getMonedaToDouble(tblProductos.getValueAt(i, 21).toString());
                    } else {
                        nuevoPrecio = big.getMonedaToDouble(tblProductos.getValueAt(i, 4).toString());
                    }

                    nuevoPrecio = big.formatDouble(nuevoPrecio/cant);
                    double totalNuevo = big.formatDouble(cantidadProd*nuevoPrecio);

                    //NUEVO PONDERADO
                    double nuevoPonderado;

                    if (inv2 <= 0) {
                        nuevoPonderado = nuevoPrecio;
                    } else {
                        nuevoPonderado = (totalNuevo+totalViejo);
                        nuevoPonderado =  big.formatDouble(nuevoPonderado/inventario);
                    }

                    if (!instancias.getSql().agregarPonderado(metodos.fechaConsulta(metodosGenerales.fechaHora()), producto.getIdSistema(),
                            big.getBigDecimal(ponderadoViejo), String.valueOf(inv2), tblProductos.getValueAt(i, 14).toString(), big.getBigDecimal(nuevoPonderado),
                            String.valueOf(df.format(inventario)), instancias.getUsuario(), big.getBigDecimal(nuevoPrecio), ingreso)) {
                        metodos.msgError(null, "Error al guardar el ponderado");
                    }

                    if (!instancias.getSql().modificarPonderado(metodos.fechaConsulta(metodosGenerales.fechaHora()), producto.getIdSistema(),
                            big.getBigDecimal(ponderadoViejo), String.valueOf(inv2), tblProductos.getValueAt(i, 14).toString(), big.getBigDecimal(nuevoPonderado),
                            String.valueOf(df.format(inventario)), instancias.getUsuario(), big.getBigDecimal(nuevoPrecio), ingreso)) {
                        metodos.msgError(null, "Error al guardar el ponderado");
                    }
                }
            }

            if (saltarPasos) {

            } else {
                if (tipo.equals("ingreso")) {

//                    if (cmbTipo.getSelectedItem().equals("DOC. EQUIVALENTE")) {
//                        if (!instancias.getSql().aumentarConsecutivo("DOCEQUIVALENTE", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("DOCEQUIVALENTE")[0]) + 1)) {
//                            metodos.msgError(null, "Error al guardar el consecutivo de documento equivalente");
//                        }
//                    }

                    metodos.msgExito(null, "Compra Exitosa");
                } else {
                    metodos.msgExito(null, "Orden de compra exitosa");
                }
            }

            String tipoImp = "";
            if (cmbTipo1.getSelectedIndex() == 1) {
                tipoImp = "Pos";
            }

            if (saltarPasos) {
            } else {
//                if (metodos.msgPregunta(null, "¿Desea imprimir?") == 0) {
                instancias.getReporte().verIngreso(ingreso, tipo, tipoImp);
//                }
            }

            saltarPasos = false;
            preguntaLimpiar = false;
            btnLimpiarActionPerformed(evt);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public static Calendar getCalendarFromDateHum(String DateHum)
    {
      String[] fecVct = DateHum.split("-");
      int dia = Integer.parseInt(fecVct[2]);
      int mes = Integer.parseInt(fecVct[1])-1;
      int year = Integer.parseInt(fecVct[0]);
      Calendar cal;
      cal = Calendar.getInstance();
      cal.clear();
      cal.set(year,mes,dia);

      return cal;
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        if (preguntaLimpiar) {
            if (metodos.msgPregunta(null, "¿Esta seguro de limpiar la compra?") != 0) {
                return;
            }
        }
        ConsecutivoDocSoporte();
        txtIdSistema.setText("");
        txtCant.setText(datos[87].toString());

        cmbBodegas.removeAllItems();
        if (instancias.getConfiguraciones().isInventarioBodegas()) {
            Object[][] bodegas = instancias.getSql().getTodasBodegas();
            for (int i = 0; i < bodegas.length; i++) {
                cmbBodegas.addItem(bodegas[i][1]);
            }
        }
       
        txtObservaciones.setText("");
        txtNit.setText("");
        txtPorcentaje.setText("0");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtDiasPlazo.setText("");
        txtFechaFactura.setSelectedDate(metodos.haciaDate2(metodosGenerales.fecha()));
        txtVencimiento.setText(txtFechaFactura.getText());
        cmbTipo.setSelectedIndex(0);
        txtNumero.setText("");
        txtCargarCompra.setText("");
        txtDescuento.setText("0");
        txtCantProductos.setText("0");
        txtCantUnidades.setText("0");

        while (tblProductos.getRowCount() > 0) {
            modeloPro.removeRow(0);
        }

        while (tblDetalle.getRowCount() > 0) {
            modeloPro1.removeRow(0);
        }

        txtSubTotal.setText(this.simbolo + " 0");
        txtTotal.setText(this.simbolo + " 0");
        txtTotalIva.setText(this.simbolo + " 0");
        txtTotalDescuentos.setText(this.simbolo + " 0");
        txtRiva.setText(this.simbolo + " 0");
        txtTotalImpoconsumo.setText(this.simbolo + " 0");
        txtRtf.setText(this.simbolo + " 0");
        txtBodega.setText("123-22");
        cmbRtf.setSelectedIndex(0);
        jCheckBox1.setSelected(false);

        txtNit.requestFocus();
        instancias.getSql().eliminarPrecompraDetalle("ING"); 
        if (tipo.equals("ingreso")) {
            instancias.getSql().eliminarPrecompra("ING"); 
//            guardarPrecompra();
//            guardarPrecompraDetallada();
        }

        preguntaLimpiar = true;

        Object[] informacion = instancias.getSql().getDatosPrefijosYModelos();
        if (null != informacion[13]) {
            txtModeloContable.setText(informacion[13].toString());
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscTerceros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTerceros2ActionPerformed
        String consecutivo;
        if (tipo.equals("ingreso")) {
            consecutivo = "ING-" + metodos.msgIngresarEnter(null, "Documento a reimprimir");
        } else {
            consecutivo = "ORDENCOMPRA-" + metodos.msgIngresarEnter(null, "Documento a reimprimir");
        }

        if (consecutivo.equals("ING-") || consecutivo.equals("ORDENCOMPRA-")) {
            return;
        }

        boolean anulado = false;
        try {
            anulado = instancias.getSql().getDocumentoAnulado("bdIngreso", "Where id='" + consecutivo + "' ");
        } catch (Exception e) {
            metodos.msgError(null, "El documento no existe");
            return;
        }

        if (anulado) {
            metodos.msgAdvertenciaAjustado(null, "El documento se encuentra anulado");
            return;
        }

        instancias.getReporte().verIngreso(consecutivo, tipo);

        if (tipo.equals("ingreso")) {
            if (instancias.getConfiguraciones().isProductosSerial()) {
                instancias.getReporte().verIngresoDetalle(consecutivo);
            }
        }
    }//GEN-LAST:event_btnBuscTerceros2ActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        String consecutivo = "";

        if (tipo.equals("ingreso")) {
            consecutivo = "ING-" + metodos.msgIngresarEnter(null, "Documento a anular");
        }

        if (consecutivo.equals("ING-")) {
            return;
        }

        boolean anulado = instancias.getSql().getDocumentoAnulado("bdIngreso", "Where id='" + consecutivo + "' ");
        if (anulado) {
            metodos.msgAdvertenciaAjustado(null, "El documento se encuentra anulado");
            return;
        }

        txtCargarCompra.setText(consecutivo.replace("ING-", ""));
        cmbCargar.setSelectedIndex(0);

        KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
        txtCargarCompraKeyReleased(x);
        tblProductos.removeEditor();

        if (instancias.getSql().getRegistrosPagos(consecutivo).length > 0) {
            metodos.msgError(null, "Tiene abonos, no se puede anular");
            btnLimpiarActionPerformed(evt);
            return;
        }

        String baseUtilizada = "";
        try {
            baseUtilizada = instancias.getSql().getBodegaMovimiento(consecutivo, "bdIngreso");
        } catch (Exception e) {
            Logs.error(e);
        }

        if ("".equals(baseUtilizada)) {
            baseUtilizada = "123-22";
        }

        txtBodega.setText(baseUtilizada);

        if (metodos.msgPregunta(null, "¿Anular esta compra?") == 0) {

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

            instancias.getSql().eliminarPonderadoIngreso(" bdPonderado ", consecutivo);

            Object[][] Productos = instancias.getSql().getProductosCompra(consecutivo);

            for (Object[] Producto : Productos) {

                String idPonderado = instancias.getSql().getConsecutivoPonderado(Producto[0].toString());
                Object[] ponderados = instancias.getSql().getUltimoPonderado1(idPonderado);

                String ingreso = "";
                if (ponderados[9] != null) {
                    ingreso = ponderados[9].toString();
                }

                if (!instancias.getSql().modificarPonderado(ponderados[8].toString(), Producto[0].toString(),
                        big.getBigDecimal(ponderados[1].toString()), String.valueOf(ponderados[2]), ponderados[3].toString(),
                        big.getBigDecimal(ponderados[4]), String.valueOf(ponderados[5]), instancias.getUsuario(),
                        big.getBigDecimal(ponderados[7]), ingreso)) {
                }

                ndProducto producto = instancias.getSql().getDatosProducto(Producto[0].toString(), baseUtilizada);
                double cantidad;
                double inventario;
                double fisicoInventario;

                try {
                    cantidad = Double.parseDouble(producto.getCompras().replace(",", "."));
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

                double inv = Double.parseDouble(Producto[1].toString().replace(",", "."));

                inventario = inventario - inv;
                fisicoInventario = fisicoInventario - inv;
                double total = cantidad - inv;

                String total1 = String.valueOf(df.format(total)).replace(".", ",");
                String inventario1 = String.valueOf(df.format(inventario)).replace(".", ",");
                String fisicoInventario1 = String.valueOf(df.format(fisicoInventario)).replace(".", ",");

                instancias.getSql().modificarInventario("compras", total1, Producto[0].toString(), baseUtilizada);
                instancias.getSql().modificarInventario("inventario", inventario1, Producto[0].toString(), baseUtilizada);
                instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, Producto[0].toString(), baseUtilizada);

                if (instancias.getConfiguraciones().isProductosSerial()) {
                    instancias.getSql().anularCompraDetalladoInventario(consecutivo);
                }
            }

            if (!instancias.getSql().anularDocumento(consecutivo, "bdIngreso")) {
                metodos.msgError(null, "Hubo un problema al anular la compra");
                return;
            }

            if (!instancias.getSql().modificarRegistroCxp(consecutivo, "ANULADA")) {
                metodos.msgError(null, "Hubo un problema al anular la Cxp");
                return;
            }

            String egreso = "";
            try {
                egreso = instancias.getSql().idEgresoIngresoAsociado(consecutivo);
            } catch (Exception e) {
                Logs.error(e);
            }

            if (!egreso.equals("")) {
                boolean egresoAnulado = instancias.getSql().getDocumentoAnulado("bdEgreso", "Where id='" + egreso + "' ");
                if (egresoAnulado) {
                    metodos.msgAdvertencia(null, "Este egreso ya se encuentra anulado");
                    return;
                }

                if (!instancias.getSql().anularDocumento(egreso, "bdEgreso")) {
                    metodos.msgError(null, "Hubo un problema al anular el egreso");
                    return;
                }
            }

            if (egreso.equals("")) {
                metodos.msgExito(null, "Compra anulada con éxito");
            } else {
                metodos.msgExito(null, "Compra y egreso anulados con éxito");
            }
        }

        preguntaLimpiar = false;
        btnLimpiarActionPerformed(evt);
    }//GEN-LAST:event_btnAnularActionPerformed

    private void lbProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCodProducto.requestFocus();
        }
    }//GEN-LAST:event_lbProductoKeyReleased

    private void cmbRtfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRtfItemStateChanged
        cargarTotales();
    }//GEN-LAST:event_cmbRtfItemStateChanged

    private void cmbRtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRtfActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        cargarTotales();
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        if (cmbTipo.getSelectedItem().equals("OTRO INGRESO")) {
            if (tipo.equals("ingreso")) {
                txtNumero.setEditable(true);
                txtNumero.setText("");
                txtDiasPlazo.setEditable(true);
            }
        } else if (cmbTipo.getSelectedItem().equals("DOC. EQUIVALENTE")) {
            if (tipo.equals("ingreso")) {
                txtNumero.setText((String) instancias.getSql().getNumConsecutivoActual("DOCEQUIVALENTE")[0]);
                txtNumero.setEditable(false);
                txtDiasPlazo.setEditable(true);
            }
        } else if (cmbTipo.getSelectedItem().equals("FACTURA")) {
            txtNumero.setEditable(true);
            txtNumero.setText("");
            txtDiasPlazo.setEditable(true);
        }
//            txtDiasPlazo.setEditable(true);
//            txtConcepto.setEditable(true);
//        } else {
//            txtDiasPlazo.setEditable(false);
//            txtConcepto.setEditable(false);
//        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarCliente(txtNit.getText());
        } else if (!txtNombre.getText().equals("")) {
            txtNombre.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            txtIdSistema.setText("");
        }
    }//GEN-LAST:event_txtNitKeyReleased

    private void txtDiasPlazo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasPlazo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasPlazo1ActionPerformed

    private void txtDiasPlazo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPlazo1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasPlazo1KeyReleased

    private void txtDiasPlazo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPlazo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasPlazo1KeyTyped

    private void txtDiasPlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasPlazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasPlazoActionPerformed

    private void txtDiasPlazoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPlazoKeyReleased
        try {
            txtVencimiento.setSelectedDate(metodos.haciaDate2(metodos.sumarFecha(txtFechaFactura.getText(), Integer.parseInt(txtDiasPlazo.getText()))));
        } catch (Exception e) {
            txtVencimiento.setSelectedDate(metodos.haciaDate2(metodos.sumarFecha(txtFechaFactura.getText(), 0)));
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCodProducto.requestFocus();
        }
    }//GEN-LAST:event_txtDiasPlazoKeyReleased

    private void txtDiasPlazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPlazoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtDiasPlazoKeyTyped

    private void tblProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductosKeyReleased
            
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            popBorrarActionPerformed(null);
            return;
        }

        int fila = tblProductos.getSelectedRow(), i = 2, j = 0;

//        try {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            //Si se esta cambiando el campo de valor
            if (tblProductos.getSelectedColumn() == 1) {
               
                tblProductos.editCellAt(tblProductos.getSelectedRow(), 2);
                tblProductos.setColumnSelectionInterval(2, 2);
                tblProductos.transferFocus();
            } else if (tblProductos.getSelectedColumn() == 2) {
                 
                tblProductos.editCellAt(tblProductos.getSelectedRow(), 3);
                tblProductos.setColumnSelectionInterval(3, 3);
                tblProductos.transferFocus();
                calcularTabla(fila);
                j = 0;

            } else //Si se esta cambiando el campo de cantidad
            if (tblProductos.getSelectedColumn() == 3) {
               
                //VALIDAR SI TIENE SERIAL 
                int contador = 0;
                for (int k = 0; k < tblDetalle.getRowCount(); k++) {
                    if (tblProductos.getValueAt(tblProductos.getSelectedRow(), 24).equals(tblDetalle.getValueAt(k, 0))) {
                        contador++;
                    }
                }
                if(contador > 0){
                  metodos.msgError(null, "No se puede cambiar cantidades de productos con seriales");
                  return;  
                }
                tblProductos.editCellAt(tblProductos.getSelectedRow(), 5);
                tblProductos.setColumnSelectionInterval(5, 5);
                tblProductos.transferFocus();
//                    txtCodProducto.requestFocus();
                i = 3;
                j = 1;
            } else // Si se esta cambiando el campo de descuento
            if (tblProductos.getSelectedColumn() == 5) {

//                tblProductos.editCellAt(tblProductos.getSelectedRow(), 7);
//                tblProductos.setColumnSelectionInterval(7, 7);
//                tblProductos.transferFocus();
                txtCodProducto.requestFocus();
                i = 5;
            } else if (tblProductos.getSelectedColumn() == 7) {
                
                txtCodProducto.requestFocus();
                i = 7;
                j = 0;
            } else if (tblProductos.getSelectedColumn() == 12) {
               
                if (tblProductos.getValueAt(fila, 12).equals("")) {
                    tblProductos.setValueAt(big.setMoneda(big.getBigDecimal("0")), fila, 12);
                } else {
                   
                    try {
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(tblProductos.getValueAt(fila, 12))), fila, 12);
                    } catch (Exception e) {
                        tblProductos.setValueAt(big.setMoneda(big.getMoneda(tblProductos.getValueAt(fila, 12).toString())), fila, 12);
                    }

                    ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(tblProductos.getSelectedRow(), 24).toString(), "bdProductos");

                    if (metodos.msgPregunta(null, "¿Desea cambiar el valor de la lista de este producto?") == 0) {
                        nodo.setL1(big.getBigDecimal(big.getMoneda(tblProductos.getValueAt(tblProductos.getSelectedRow(), 12).toString())).toString());

                        if (!instancias.getSql().modificarProducto(nodo, "bdProductos")) {
                            metodos.msgError(null, "Hubo un problema al modificar el producto");
                            return;
                        }
                        if (!instancias.getSql().modificarProducto(nodo, "bdProductosBodega1")) {
                            metodos.msgError(null, "Hubo un problema al modificar el producto");
                            return;
                        }

                        if (!instancias.getSql().modificarProducto(nodo, "bdProductosBodega2")) {
                            metodos.msgError(null, "Hubo un problema al modificar el producto");
                            return;
                        }

                        if (!instancias.getSql().modificarProducto(nodo, "bdProductosBodega3")) {
                            metodos.msgError(null, "Hubo un problema al modificar el producto");
                            return;
                        }

                        if (!instancias.getSql().modificarProducto(nodo, "bdProductosBodega4")) {
                            metodos.msgError(null, "Hubo un problema al modificar el producto");
                            return;
                        }
                        metodos.msgExito(null, "Valor actualizado con éxito");

                        BigDecimal utilidad = big.getMoneda(tblProductos.getValueAt(fila, 12).toString()).subtract(big.getMoneda(tblProductos.getValueAt(fila, 15).toString()));
                        tblProductos.setValueAt(big.setMoneda(utilidad), fila, 17);
                        txtCodProducto.requestFocus();
                        i = 12;
                    } else {
                        tblProductos.setValueAt(big.setMoneda(big.getBigDecimal(nodo.getL1())), fila, 12);
                    }

                    j = 0;
                }
            } else if (tblProductos.getSelectedColumn() == 16) {

                if (tblProductos.getValueAt(fila, 16).equals("")) {
                    tblProductos.setValueAt(big.getBigDecimal("0"), fila, 16);
                } else {
                    try {
                        tblProductos.setValueAt(big.getBigDecimal(tblProductos.getValueAt(fila, 16)), fila, 16);
                    } catch (Exception e) {
                        tblProductos.setValueAt(big.getMoneda(tblProductos.getValueAt(fila, 16).toString()), fila, 16);
                    }

                    if (metodos.msgPregunta(null, "¿Desea cambiar el valor de la lista de este producto?") == 0) {
                        BigDecimal valor = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 2)));
                        BigDecimal aumento = big.getBigDecimal(String.valueOf(tblProductos.getValueAt(fila, 16)));
                        BigDecimal iva, total;

                        iva = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 7)));
                        iva = (iva.divide(big.getBigDecimal("100"))).add(big.getBigDecimal("1"));
                        total = valor.multiply(iva);
                        total = total.multiply(aumento.divide(big.getBigDecimal("100")).add(big.getBigDecimal("1")));
                        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 24).toString(), "bdProductos");
                        nodo.setL1(big.getMoneda(big.setMonedaExacta(total)).toString());
                        if (!instancias.getSql().modificarProducto(nodo, "bdProductos")) {
                            metodos.msgError(null, "Hubo un problema al modificar el producto");
                            return;
                        }
                        if (!instancias.getSql().modificarProducto(nodo, "bdProductosBodega1")) {
                            metodos.msgError(null, "Hubo un problema al modificar el producto");
                            return;
                        }

                        if (!instancias.getSql().modificarProducto(nodo, "bdProductosBodega2")) {
                            metodos.msgError(null, "Hubo un problema al modificar el producto");
                            return;
                        }

                        if (!instancias.getSql().modificarProducto(nodo, "bdProductosBodega3")) {
                            metodos.msgError(null, "Hubo un problema al modificar el producto");
                            return;
                        }

                        if (!instancias.getSql().modificarProducto(nodo, "bdProductosBodega4")) {
                            metodos.msgError(null, "Hubo un problema al modificar el producto");
                            return;
                        }

                        metodos.msgExito(null, "Valor actualizado con éxito");

                        tblProductos.setValueAt(big.setMonedaExacta(total), fila, 12);
                        BigDecimal utilidad = big.getMoneda(tblProductos.getValueAt(fila, 12).toString()).subtract(big.getMoneda(tblProductos.getValueAt(fila, 15).toString()));
                        tblProductos.setValueAt(big.setMoneda(utilidad), fila, 17);
                        txtCodProducto.requestFocus();
                        i = 12;
                    } else {
                        tblProductos.setValueAt("0", fila, 16);
                    }
                    j = 0;

                }
            }

            try {
                           
                int res = big.getBigDecimal(big.getMoneda((String) tblProductos.getValueAt(fila, i))).compareTo(big.getBigDecimal("1"));

                if (res == -1 || String.valueOf(tblProductos.getValueAt(fila, i)).equals("")) {
                    tblProductos.setValueAt(j, tblProductos.getSelectedRow(), i);
                }
                 
            } catch (NumberFormatException e) {
                tblProductos.setValueAt(j, tblProductos.getSelectedRow(), i);
            }

            calcularTabla(fila);

            if (tipo != null) {
                if (tipo.equals("ingreso")) {
                   
                      guardarPrecompra();
//                    guardarPrecompraDetallada();
                }
            }
        }
//        } catch (Exception e) {
//
//            if (tblProductos.getValueAt(fila, 3).toString().equalsIgnoreCase("") || tblProductos.getValueAt(fila, 3).toString().equalsIgnoreCase("0")) {
//                tblProductos.setValueAt("1", fila, 3);
//            }
//
//            tblProductos.setValueAt("$ 0", fila, 6);
//            tblProductos.setValueAt("0", fila, 5);
//
//            cargarTotales();
//            guardarPrecompra();
//            guardarPrecompraDetallada();
//        }
    }//GEN-LAST:event_tblProductosKeyReleased

    private void txtPorcentajeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            int xyz = tblProductos.getRowCount();
            tblProductos.removeEditor();

            if (xyz > 0) {
                for (int y = 0; y < xyz; y++) {
                    tblProductos.setValueAt("0", y, 5);
                    tblProductos.setValueAt(this.simbolo + " 0", y, 6);
                    calcularTabla(y);
                }
            }

            if (xyz > 0) {
                BigDecimal porcentaje = big.getBigDecimal(txtPorcentaje.getText());
                for (int y = 0; y < xyz; y++) {
                    tblProductos.setValueAt(porcentaje, y, 5);
                    calcularTabla(y);
                }
            }

            if (tipo.equals("ingreso")) {
              
                guardarPrecompra();
                guardarPrecompraDetallada();
            }

            txtPorcentaje.requestFocus();
            txtPorcentaje.setBackground(Color.WHITE);
            txtPorcentaje.setForeground(Color.BLACK);
        } else {
            txtPorcentaje.setBackground(new Color(251, 238, 152));
            txtPorcentaje.setForeground(new Color(146, 137, 77));
        }
    }//GEN-LAST:event_txtPorcentajeKeyReleased

    private void txtFechaFacturaOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_txtFechaFacturaOnCommit
        try {
            txtVencimiento.setText(metodos.sumarFecha(txtFechaFactura.getText(), Integer.parseInt(txtDiasPlazo.getText())));
        } catch (NumberFormatException exep) {
            txtVencimiento.setText(metodos.sumarFecha(txtFechaFactura.getText(), 0));
        }
    }//GEN-LAST:event_txtFechaFacturaOnCommit

    private void txtCargarCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargarCompraKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String consecutivo = "";

            String id = txtCargarCompra.getText();
            if (cmbCargar.getSelectedIndex() == 0) {
                consecutivo = "ING-" + txtCargarCompra.getText();
            } else if (cmbCargar.getSelectedIndex() == 1) {
                consecutivo = "ORDENCOMPRA-" + txtCargarCompra.getText();
            } else {
                metodos.msgError(null, "Debe seleccionar una opción");
                return;
            }

            preguntaLimpiar = false;
            btnLimpiarActionPerformed(null);

            Logs.log("consecutivo " + consecutivo);
            txtCargarCompra.setText(id);

            Object[][] mat = new Object[0][0];
            mat = instancias.getSql().getProductosCargarCompra(consecutivo);

            if (mat.length > 0) {

                ndIngreso nodo = instancias.getSql().getDatosIngreso(consecutivo);

                if (this.tipo.equals("ordenCompra")) {
                } else {
                    if (nodo.getEstado().equals("REALIZADO")) {
                        metodos.msgError(null, "La orden de compra ya fue cargada");
                        return;
                    }
                }

                txtNit.setText(nodo.getProveedor());
                cargarCliente(nodo.getProveedor());
                txtBodega.setText(nodo.getBodega());

                for (Object[] reg : mat) {
                    cargarProductoPreCompra((String) reg[0], new Double((String) reg[4]) + "", Integer.parseInt((String) reg[3]),
                            big.getBigDecimal(reg[5]) + "", true);

                    try {
                        BigDecimal descuento = big.getBigDecimal(reg[6]);
                        BigDecimal total = big.getBigDecimal(reg[7]).add(descuento);
                        BigDecimal porcentaje2 = big.getBigDecimal(descuento.multiply(big.getBigDecimal("100")).divide(total, 2, RoundingMode.HALF_DOWN));
                        tblProductos.setValueAt(porcentaje2, tblProductos.getRowCount() - 1, 5);
                        tblProductos.setValueAt(big.getBigDecimal(reg[6]).toString().replace(".", ","), tblProductos.getRowCount() - 1, 6);
                    } catch (Exception e) {
                        Logs.error(e);
                        tblProductos.setValueAt(0, tblProductos.getRowCount() - 1, 5);
                        tblProductos.setValueAt(this.simbolo + " 0", tblProductos.getRowCount() - 1, 6);
                    }

                    KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                    tblProductosKeyReleased(x);
                }

                tblProductos.removeEditor();

            } else {
                if (cmbCargar.getSelectedIndex() == 0) {
                    metodos.msgError(null, "El ingreso no existe");
                } else {
                    metodos.msgError(null, "La orden de compra no existe");
                }
                txtCargarCompra.setText("");
            }
        }
    }//GEN-LAST:event_txtCargarCompraKeyReleased

    private void popBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popBorrarActionPerformed
        if (tblProductos.getSelectedRow() > -1) {
            int fila = tblProductos.getSelectedRow();

            int num = tblDetalle.getRowCount();
            for (int i = num - 1; i >= 0; i--) {
                if (tblDetalle.getValueAt(i, 0).equals(tblProductos.getValueAt(fila, 24))) {
                    modeloPro1.removeRow(i);
                }
            }

            modeloPro.removeRow(fila);

            cargarTotales();
            guardarPrecompra();
          
            guardarPrecompraDetallada();
        } else {
            metodos.msgAdvertencia(null, "Seleccione un producto");
        }
    }//GEN-LAST:event_popBorrarActionPerformed

    private void txtCantProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantProductosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantProductosKeyReleased

    private void txtCantUnidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantUnidadesKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantUnidadesKeyReleased

    private void txtNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDiasPlazo.requestFocus();
        }
    }//GEN-LAST:event_txtNumeroKeyReleased

    private void lbProducto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbProducto1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbProducto1KeyReleased

    private void txtObservacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtObservacionesMouseClicked

    }//GEN-LAST:event_txtObservacionesMouseClicked

    private void cmbTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipo1ActionPerformed

    private void chkPesosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkPesosItemStateChanged
        if (chkPesos.isSelected()) {
            if (tblProductos.getColumnModel().getColumnCount() > 0) {
                tblProductos.getColumnModel().getColumn(5).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(5).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(5).setMaxWidth(0);
                tblProductos.getColumnModel().getColumn(6).setMinWidth(100);
                tblProductos.getColumnModel().getColumn(6).setPreferredWidth(120);
                tblProductos.getColumnModel().getColumn(6).setMaxWidth(150);
            }
        } else {
            if (tblProductos.getColumnModel().getColumnCount() > 0) {
                tblProductos.getColumnModel().getColumn(5).setMinWidth(40);
                tblProductos.getColumnModel().getColumn(5).setPreferredWidth(60);
                tblProductos.getColumnModel().getColumn(5).setMaxWidth(80);
                tblProductos.getColumnModel().getColumn(6).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(6).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(6).setMaxWidth(0);
            }
        }

        tblProductos.revalidate();
    }//GEN-LAST:event_chkPesosItemStateChanged

    private void chkPorcentajeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkPorcentajeItemStateChanged
        if (chkPorcentaje.isSelected()) {
            if (tblProductos.getColumnModel().getColumnCount() > 0) {
                tblProductos.getColumnModel().getColumn(5).setMinWidth(40);
                tblProductos.getColumnModel().getColumn(5).setPreferredWidth(60);
                tblProductos.getColumnModel().getColumn(5).setMaxWidth(80);

                tblProductos.getColumnModel().getColumn(6).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(6).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(6).setMaxWidth(0);
            }
        } else {
            if (tblProductos.getColumnModel().getColumnCount() > 0) {
                tblProductos.getColumnModel().getColumn(5).setMinWidth(0);
                tblProductos.getColumnModel().getColumn(5).setPreferredWidth(0);
                tblProductos.getColumnModel().getColumn(5).setMaxWidth(0);

                tblProductos.getColumnModel().getColumn(6).setMinWidth(50);
                tblProductos.getColumnModel().getColumn(6).setPreferredWidth(75);
                tblProductos.getColumnModel().getColumn(6).setMaxWidth(120);
            }
        }

        tblProductos.revalidate();
    }//GEN-LAST:event_chkPorcentajeItemStateChanged

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
 
        String baseUtilizada = obtenerBase();
        ndProducto nodo = instancias.getSql().getDatosProducto(tblProductos.getValueAt(tblProductos.getSelectedRow(), 24).toString(), baseUtilizada);
        
        if(nodo.getTipoProducto() != null && nodo.getTipoProducto()!= ""){
            this.dinamico = false;
        }else{
            this.dinamico = true;
        }
        
//        tblProductos.isCellEditable(tblProductos.getSelectedRow(), 3);   
        
        if (tblProductos.getSelectedColumn() == 3) {

             ArrayList<Map<String, String>> existenciasList = new ArrayList<Map<String, String>>();
            existenciasList = instancias.getSql().getProductos(tblProductos.getValueAt(tblProductos.getSelectedRow(), 24).toString(), baseUtilizada);   
                     
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

            int contador = 0;
            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                if (tblProductos.getValueAt(tblProductos.getSelectedRow(), 24).equals(tblDetalle.getValueAt(i, 0))) {
                    contador++;
                }
            }

            Object[][] productos = new Object[contador][9];
            int xyz = 0;
            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
              if (tblProductos.getValueAt(tblProductos.getSelectedRow(), 24).equals(tblDetalle.getValueAt(i, 0))) {
                  
                    String cantidad="0";
                    productos[xyz][0] = tblDetalle.getValueAt(i, 1);
                    productos[xyz][1] = tblDetalle.getValueAt(i, 2);
                      if(tblDetalle.getValueAt(i, 10).equals("1") || tblDetalle.getValueAt(i, 10).equals(null) || Integer.parseInt(tblDetalle.getValueAt(i, 10).toString()) == 1){
                        cantidad=tblDetalle.getValueAt(i, 5).toString();
                      }else{
                         cantidad=""+(Double.parseDouble(tblDetalle.getValueAt(i, 5).toString())/Integer.parseInt(existenciasList.get(0).get("cantidad"+tblDetalle.getValueAt(i, 10))));
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

            if (!tipo.equals("") && !this.tipo.equals("ordenCompra")) {
                dlgCompraDetallada1 compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), productos, "Entrada", "pnlIngreso", baseUtilizada, "");
                compraDetallada.setLocationRelativeTo(null);
                compraDetallada.setVisible(true);             
            }
        } else if (tblProductos.getSelectedColumn() == 23) {
        
            boolean entraBorrar = false;
            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
            
                if (tblDetalle.getValueAt(i, 0).equals(tblProductos.getValueAt(tblProductos.getSelectedRow(), 24))) {
                    
                    String codigo = tblDetalle.getValueAt(i, 0).toString();
                    String lote = tblDetalle.getValueAt(i, 2).toString();
                    String fecha = tblDetalle.getValueAt(i, 3).toString();
                    String cantidad = tblDetalle.getValueAt(i, 5).toString();
                    if(instancias.getSql().eliminarPrecompraDetalleXlote(codigo, lote, metodos.fechaConsulta(fecha), cantidad)){
                     modeloPro1.removeRow(i);
                     entraBorrar = true;
                    }else{
                        System.err.println("ERROR AL ELIMINAR ");
                    }
                }else{
                   entraBorrar = true;
                }
            }
         
            int fila = tblProductos.getSelectedRow();
//            if(entraBorrar && instancias.getSql().eliminarPrecompraXlote(tblProductos.getValueAt(fila, 24).toString())){
            if(instancias.getSql().eliminarPrecompraXlote(tblProductos.getValueAt(fila, 24).toString())){
              modeloPro.removeRow(tblProductos.getSelectedRow());
              cargarTotales();
            }else{
                System.err.println("Error al eliminar ");
            }
            //guardarPrecompra();
            //guardarPrecompraDetallada();
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void txtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyReleased
        if (txtDescuento.getText().equals("")) {
            txtDescuento.setText("0");
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarTotales();
        } else {
            txtDescuento.setText(big.setNumero(big.getBigDecimal(txtDescuento.getText())));
            cargarTotales();
        }
    }//GEN-LAST:event_txtDescuentoKeyReleased

    private void btnImportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarExcelActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();

        JFileChooser examinar = new JFileChooser();
        examinar.setFileFilter(new FileNameExtensionFilter("Archivos excel", "xls", "xlsx"));
        int opcion = examinar.showOpenDialog(this);
        File archivoExcel = null;

        Iniciar2 ini = new Iniciar2();
        cargando barra = new cargando(ini, Instancias.getInstancias());
        barra.show();
        this.barra2 = ini.getBarra();

        if (opcion == JFileChooser.APPROVE_OPTION) {
            archivoExcel = examinar.getSelectedFile().getAbsoluteFile();

            try {
                Workbook leerExcel = Workbook.getWorkbook(archivoExcel);
                for (int hoja = 0; hoja < leerExcel.getNumberOfSheets(); hoja++) {
                    Sheet hojaP = leerExcel.getSheet(hoja);
                    int filas = hojaP.getRows();
                    for (int fila = 0; fila < filas; fila++) {
                        if (fila > 0) {
                            if (!hojaP.getCell(0, fila).getContents().equals("")) {
                                cargarProductoDesdeExcel(hojaP.getCell(0, fila).getContents(), hojaP.getCell(1, fila).getContents(), hojaP.getCell(2, fila).getContents(),
                                        hojaP.getCell(3, fila).getContents(), hojaP.getCell(4, fila).getContents(), hojaP.getCell(5, fila).getContents());
                            }
                        }
                    }
                }
            } catch (IOException | BiffException ex) {
                metodos.msgError(null, "El archivo de excel es de una versión no compatible");
                return;
            }
        }

        cargarTotales();

        this.barra2.detener(true);
    }//GEN-LAST:event_btnImportarExcelActionPerformed

    private void lbVendedor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVendedor1MouseClicked

    }//GEN-LAST:event_lbVendedor1MouseClicked

    private void pnlFormularioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFormularioMouseClicked

    }//GEN-LAST:event_pnlFormularioMouseClicked

    private void btnBuscTercerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTercerosActionPerformed
        ventanaTerceros("");
    }//GEN-LAST:event_btnBuscTercerosActionPerformed

    private void btnBusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProdActionPerformed
        ventanaProductos("");
    }//GEN-LAST:event_btnBusProdActionPerformed

    private void lbProducto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbProducto2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbProducto2KeyReleased

    private void txtCantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantFocusGained

    private void txtCantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantKeyReleased

    private void txtCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProductoActionPerformed

    private void txtCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantActionPerformed

    private void btnBuscTerceros3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTerceros3ActionPerformed
        if (tblProductos.getRowCount() <= 0) {
            metodos.msgError(null, "No ha ingresado ningún producto");
            return;
        }

        Object[][] productosCargados = new Object[tblProductos.getRowCount()][24];

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            productosCargados[i][0] = tblProductos.getValueAt(i, 24);
            productosCargados[i][1] = tblProductos.getValueAt(i, 1);
            productosCargados[i][2] = tblProductos.getValueAt(i, 2);
            productosCargados[i][3] = tblProductos.getValueAt(i, 3);
            productosCargados[i][4] = tblProductos.getValueAt(i, 4);
            productosCargados[i][5] = tblProductos.getValueAt(i, 5);
            productosCargados[i][6] = tblProductos.getValueAt(i, 6);
            productosCargados[i][7] = tblProductos.getValueAt(i, 7);
            productosCargados[i][8] = tblProductos.getValueAt(i, 8);
            productosCargados[i][9] = tblProductos.getValueAt(i, 9);
            productosCargados[i][10] = tblProductos.getValueAt(i, 10);
            productosCargados[i][11] = tblProductos.getValueAt(i, 11);
            productosCargados[i][12] = tblProductos.getValueAt(i, 12);
            productosCargados[i][13] = tblProductos.getValueAt(i, 13);
            productosCargados[i][14] = tblProductos.getValueAt(i, 14);
            productosCargados[i][15] = tblProductos.getValueAt(i, 15);
            productosCargados[i][16] = tblProductos.getValueAt(i, 16);
            productosCargados[i][17] = tblProductos.getValueAt(i, 17);
            productosCargados[i][18] = tblProductos.getValueAt(i, 18);
            productosCargados[i][19] = tblProductos.getValueAt(i, 19);
            productosCargados[i][20] = tblProductos.getValueAt(i, 20);
            productosCargados[i][21] = tblProductos.getValueAt(i, 21);
            productosCargados[i][22] = tblProductos.getValueAt(i, 22);
            productosCargados[i][23] = tblProductos.getValueAt(i, 23);
        }

        dlgDetalleCompra detalle = new dlgDetalleCompra(null, true, productosCargados);
        detalle.setVisible(true);
    }//GEN-LAST:event_btnBuscTerceros3ActionPerformed

    private void lbBodegaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbBodegaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbBodegaKeyReleased

    private void txtBodegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBodegaMouseClicked
        if (txtBodega.isEnabled()) {
            if (!txtBodega.getText().equals("")) {
                if (tblProductos.getRowCount() > 0) {
                    if (metodos.msgPregunta(null, "¿Limpiar la compra?") != 0) {
                        txtCodProducto.requestFocus();
                        return;
                    } else {
                        while (tblProductos.getRowCount() > 0) {
                            modeloPro.removeRow(0);
                        }
                        while (tblDetalle.getRowCount() > 0) {
                            modeloPro1.removeRow(0);
                        }

                        if (tipo.equals("ingreso")) {
                            guardarPrecompra();
                            guardarPrecompraDetallada();
                        }
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
                    if (metodos.msgPregunta(null, "¿Limpiar la compra?") != 0) {
                        txtCodProducto.requestFocus();
                        return;
                    } else {
                        while (tblProductos.getRowCount() > 0) {
                            modeloPro.removeRow(0);
                        }
                        while (tblDetalle.getRowCount() > 0) {
                            modeloPro1.removeRow(0);
                        }

                        if (tipo.equals("ingreso")) {
                            guardarPrecompra();
                            guardarPrecompraDetallada();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_txtBodegaMousePressed

    private void txtBodegaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBodegaMouseReleased
        if (txtBodega.isEnabled()) {
            if (!txtBodega.getText().equals("")) {
                if (tblProductos.getRowCount() > 0) {
                    if (metodos.msgPregunta(null, "¿Limpiar la compra?") != 0) {
                        txtCodProducto.requestFocus();
                        return;
                    } else {
                        while (tblProductos.getRowCount() > 0) {
                            modeloPro.removeRow(0);
                        }
                        while (tblDetalle.getRowCount() > 0) {
                            modeloPro1.removeRow(0);
                        }

                        if (tipo.equals("ingreso")) {
                            guardarPrecompra();
                            guardarPrecompraDetallada();
                        }
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
                while (tblDetalle.getRowCount() > 0) {
                    modeloPro1.removeRow(0);
                }

                if (tipo.equals("ingreso")) {
                    guardarPrecompra();
                    guardarPrecompraDetallada();
                }
            }
        }
    }//GEN-LAST:event_txtBodegaKeyReleased

    private void txtModeloContableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloContableKeyReleased
        if (txtModeloContable.getText().length() > 8) {
            txtModeloContable.setText(txtModeloContable.getText().substring(0, 8));
        }
    }//GEN-LAST:event_txtModeloContableKeyReleased

    private void tblProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductosKeyPressed
      
    }//GEN-LAST:event_tblProductosKeyPressed

    private void jCheckBoxDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDSActionPerformed
       ConsecutivoDocSoporte(); 
    }//GEN-LAST:event_jCheckBoxDSActionPerformed

    private void ConsecutivoDocSoporte(){
        if(jCheckBoxDS.isSelected()){
          DS.setText((String) instancias.getSql().getResolucionTerminales("DS")[7]);
        }else{
          DS.setText("N/A");
        }
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

    public void eliminarRegistros(String codigo) {
        for (int i = tblDetalle.getRowCount() - 1; i >= 0; i--) {
            if (tblDetalle.getValueAt(i, 0).equals(codigo)) {
                modeloPro1.removeRow(i);
            }
        }

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            if (tblProductos.getValueAt(i, 24).equals(codigo)) {
                modeloPro.removeRow(i);
            }
        }
    }

    public void cargarProducto1(String codigo, String cantidad, int plu) {
             
        ArrayList<String> almacenaLotes = new ArrayList<String>();
        
        for (int j = 0; j < tblProductos.getRowCount(); j++) {
            if (codigo.equalsIgnoreCase((String) tblProductos.getValueAt(j, 24)) && (plu + "").equals(((int) tblProductos.getValueAt(j, 13)) + "")) {
                double suma = 0.0;
                for (int z = 0; z < modeloPro1.getRowCount(); z++) {
                    if (modeloPro1.getValueAt(z, 9).toString().equals("0")) {
                        almacenaLotes.add(modeloPro1.getValueAt(z, 2).toString());
                        suma += Double.parseDouble(modeloPro1.getValueAt(z, 5).toString().replace(",", "."));
                    }
                }
                if (suma > 0) {                    
                    tblProductos.setValueAt((cantidad + "").replace(".", ","), j, 3);                    
                    calcularTablaPreCompraValores();
                    guardarPrecompra();
                    return;
                }
            }
//                else{
//                    metodos.msgAdvertencia(null, "El producto ya esta cargado");
//                    tblProductos.setColumnSelectionInterval(2, 2);
//                    tblProductos.setRowSelectionInterval(j, j);
//                    tblProductos.editCellAt(j, 2);
//                    tblProductos.transferFocus();
//                    txtCodProducto.setText("");
//                    return;
//                 }
               }
           
        String baseUtilizada = obtenerBase();
        ndProducto nodo = instancias.getSql().getDatosProducto(codigo, baseUtilizada);
           
        if (nodo.getCodigo() != null) {
            if (instancias.getSql().getProdActivo(nodo.getCodigo())) {
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
                if (cant > 0) {
                    seleccionarPLU pluu = new seleccionarPLU(null, true, baseUtilizada);
                    pluu.setTipo(nodo.getTipoProducto());
                    if (cantidad.contains(".")) {
                        cantidad = cantidad.replace(".", ",");
                    }
                    pluu.setCantidad(cantidad);
                    pluu.setDetalleSerial(modeloPro1);
                    pluu.setInstancias(instancias, nodo.getCodigo(),null);
                    pluu.setOpc("ingreso");                    
                    pluu.setVisible(true);
                    return;
                }
            }

            String cant2 = "1";
            String desc = nodo.getDescripcion();
            String lista = nodo.getL1();
            switch (plu) {
                case 2:
                    cant2 = nodo.getCantidad2();
                    desc = nodo.getDescripcion2();
                    lista = nodo.getL2();
                    break;
                case 3:
                    cant2 = nodo.getCantidad3();
                    desc = nodo.getDescripcion3();
                    lista = nodo.getL3();
                    break;
                case 4:
                    cant2 = nodo.getCantidad4();
                    desc = nodo.getDescripcion4();
                    lista = nodo.getL4();
                    break;
            }
            if (cantidad.contains(".")) {
                cantidad = cantidad.replace(".", ",");
            }

            Object[] ultimoMovimiento = instancias.getSql().getUltimoPonderado(codigo);

            double costo;
            try {
                costo = big.formatDouble(ultimoMovimiento[7].toString());
            } catch (Exception e) {
                costo = 0;
            }

            double pond;
            try {
                pond = big.formatDouble(ultimoMovimiento[4].toString());
            } catch (Exception e) {
                pond = 0;
            }

            double utilidad;
            utilidad = big.formatDouble(nodo.getL1())- pond;

            modeloPro.addRow(new Object[]{nodo.getCodigo(), desc, big.setMoneda(pond * big.getMonedaToDouble(cant2)),
                cantidad, big.setMoneda(big.getBigDecimal("0")), "0", big.setMoneda(big.getBigDecimal("0")), big.setNumero(big.getBigDecimal(nodo.getIvaC())),
                big.setNumero(big.getBigDecimal(nodo.getImpoconsumoCompra())), "0", nodo.getUnd(), big.setMoneda(costo),
                big.setMoneda(big.getBigDecimal(lista)), plu, (big.getBigDecimal(cant2).multiply(big.getMoneda(cantidad))), pond, 0, big.setMoneda(utilidad),
                "", "BD-Principal", nodo.getImpoconsumo(), this.simbolo + " 0", "0", new JLabel(icono), nodo.getIdSistema()});

            tblProductos.setColumnSelectionInterval(1, 1);
            tblProductos.setRowSelectionInterval(tblProductos.getRowCount() - 1, tblProductos.getRowCount() - 1);
            tblProductos.editCellAt(tblProductos.getRowCount() - 1, 1);
            tblProductos.transferFocus();
            txtCodProducto.setText("");

            KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
            tblProductosKeyReleased(x);
            return;
        }

        ventanaProductos(codigo);
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

    public void cargarProductoDesdeExcel(String codigo, String valorUnit, String cantidad, String descuento, String iva, String impo) {
        ndProducto nodo = null;

        String codigoProd = "";
        if (codigo.equals("")) {
            codigoProd = "";
        } else {
            Object[][] listado = instancias.getSql().getCodigosRelacionados(codigo, " where codigo");
            if (listado.length > 0) {
                codigo = listado[0][0].toString();
            }

            String baseUtilizada = obtenerBase();
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

            String cant2 = "1";
            String desc = nodo.getDescripcion();
            String lista = nodo.getL1();

            if (cantidad.contains(".")) {
                cantidad = cantidad.replace(".", ",");
            }

            Object[] ultimoMovimiento = instancias.getSql().getUltimoPonderado(nodo.getIdSistema());
            double costo;

            try {
                costo = big.getMonedaToDouble(ultimoMovimiento[7].toString());
            } catch (Exception e) {
                costo = 0;
            }

            BigDecimal valorUnitario = BigDecimal.ZERO;
            try {
                valorUnitario = big.getBigDecimal(valorUnit);
            } catch (Exception e) {
                try {
                    valorUnitario = big.getMoneda(valorUnit);
                } catch (Exception ef) {

                }
            }

            BigDecimal pond;
            try {
                pond = big.getBigDecimal(ultimoMovimiento[4].toString());
            } catch (Exception e) {
                pond = BigDecimal.ZERO;
            }

            BigDecimal utilidad;
            utilidad = big.getBigDecimal(nodo.getL1()).subtract(pond);

            try {
                cmbBodegas.setSelectedIndex(0);
            } catch (Exception e) {
            }

            BigDecimal impoconsumo = BigDecimal.ZERO;
            try {
                impoconsumo = big.getBigDecimal(impo);
            } catch (Exception e) {
            }

            BigDecimal ivaCompra = BigDecimal.ZERO;
            try {
                ivaCompra = big.getBigDecimal(iva);
            } catch (Exception e) {
            }

            modeloPro.addRow(new Object[]{nodo.getCodigo(), desc, big.setMoneda(valorUnitario.multiply(big.getMoneda(cant2))), cantidad,
                big.setMoneda(big.getBigDecimal("0")), "0", big.setMoneda(big.getBigDecimal("0")), big.setNumero(ivaCompra), big.setNumero(impoconsumo),
                "0", nodo.getUnd(), big.setMoneda(costo), big.setMoneda(big.getBigDecimal(lista)), "1", (big.getBigDecimal(cant2).multiply(big.getMoneda(cantidad))),
                big.setMoneda(pond), 0, big.setMoneda(utilidad), "", "BD-Principal", nodo.getImpoconsumo(), this.simbolo + " 0", "0", new JLabel(icono), nodo.getIdSistema()});

            try {
                tblProductos.setColumnSelectionInterval(1, 1);
                tblProductos.setRowSelectionInterval(tblProductos.getRowCount() - 1, tblProductos.getRowCount() - 1);
                tblProductos.editCellAt(tblProductos.getRowCount() - 1, 1);
            } catch (Exception e) {
                Logs.error(e);
            }

            tblProductos.transferFocus();
            txtCodProducto.setText("");
            calcularTabla(tblProductos.getRowCount() - 1);

//            KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
//            tblProductosKeyReleased(x);
            return;

        }
    }

    public void compraExterna(String codigo, String cantidad, BigDecimal costo) {
        btnLimpiarActionPerformed(null);

        cargarProductoDetal(codigo, cantidad, costo);

        tblProductos.setValueAt(costo, tblProductos.getRowCount() - 1, 2);
        KeyEvent evento = new KeyEvent(tblProductos, 0, 0, 0, 0);
        evento.setKeyCode(KeyEvent.VK_ENTER);

        tblProductosKeyReleased(evento);
        cmbTipo.setSelectedIndex(2);
        saltarPasos = true;
        btnGuardarActionPerformed(null);
    }

    public void actualizarVariables() {
        if (instancias.isCostoConImpoconsumo()) {
            tblProductos.getColumnModel().getColumn(9).setMinWidth(0);
            tblProductos.getColumnModel().getColumn(9).setPreferredWidth(0);
            tblProductos.getColumnModel().getColumn(9).setMaxWidth(0);
        } else {
            tblProductos.getColumnModel().getColumn(9).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(9).setPreferredWidth(115);
            tblProductos.getColumnModel().getColumn(9).setMaxWidth(140);
        }

    }

    public void cargarProductoDetal(String codigo, String cantidad, BigDecimal precio) {

        String baseUtilizada = obtenerBase();
        ndProducto nodo = instancias.getSql().getDatosProducto(codigo, baseUtilizada);

        if (nodo.getCodigo() != null) {

            if (cantidad.contains(".")) {
                cantidad = cantidad.replace(".", ",");
            }

            Object[] ultimoMovimiento = instancias.getSql().getUltimoPonderado(nodo.getIdSistema());

            double costo;
            try {
                costo = big.formatDouble(ultimoMovimiento[7].toString());
            } catch (Exception e) {
                costo = 0;
            }

            double pond;
            try {
                pond = big.formatDouble(ultimoMovimiento[4].toString());
            } catch (Exception e) {
                pond = 0;
            }

            double utilidad;
            utilidad = big.formatDouble(nodo.getL1()) - pond;

            try {
                cmbBodegas.setSelectedIndex(0);
            } catch (Exception e) {
            }

            modeloPro.addRow(new Object[]{nodo.getCodigo(), nodo.getDescripcion(), big.setMoneda(precio),
                cantidad, big.setMoneda(big.getBigDecimal("0")), "0", big.setMoneda(big.getBigDecimal("0")), big.setNumero(big.getBigDecimal(nodo.getIvaC())),
                big.setNumero(big.getBigDecimal(nodo.getImpoconsumoCompra())), "0", nodo.getUnd(), big.setMoneda(costo),
                big.setMoneda(big.getBigDecimal(nodo.getL1())), plu, (big.getBigDecimal("1").multiply(big.getMoneda(cantidad))), big.setMoneda(pond), 0,
                big.setMoneda(utilidad), "", "BD-Principal", nodo.getImpoconsumo(), this.simbolo + " 0", "0", new JLabel(icono), nodo.getIdSistema()});

            tblProductos.setColumnSelectionInterval(1, 1);
            tblProductos.setRowSelectionInterval(tblProductos.getRowCount() - 1, tblProductos.getRowCount() - 1);
            tblProductos.editCellAt(tblProductos.getRowCount() - 1, 1);
            tblProductos.transferFocus();
            txtCodProducto.setText("");

            KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
            tblProductosKeyReleased(x);
            return;

        }
        ventanaProductos(codigo);
    }

    public void cargarProducto(String codigo, String cantidad, int plu, String formaCargo) {

//        for (int j = 0; j < tblProductos.getRowCount(); j++) {
//            if (codigo.equalsIgnoreCase((String) tblProductos.getValueAt(j, 0)) && (plu + "").equals(((int) tblProductos.getValueAt(j, 13)) + "")) {
//                metodos.msgAdvertencia(null, "El producto ya esta cargado");
//                tblProductos.setColumnSelectionInterval(2, 2);
//                tblProductos.setRowSelectionInterval(j, j);
//                tblProductos.editCellAt(j, 2);
//                tblProductos.transferFocus();
//                txtCodProducto.setText("");
//                return;
//            }
//        }
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
            if (codigo.equals(nodo.getCodigo2())) {
                plu = 2;
            } else if (codigo.equals(nodo.getCodigo3())) {
                plu = 3;
            } else if (codigo.equals(nodo.getCodigo4())) {
                plu = 4;
            } else if (codigo.equals(nodo.getCodigo5())) {
                plu = 5;
            } else if (codigo.equals(nodo.getCodigo6())) {
                plu = 6;
            } else if (codigo.equals(nodo.getCodigo7())) {
                plu = 7;
            } else if (codigo.equals(nodo.getCodigo8())) {
                plu = 8;
            }

            if (instancias.getSql().getProdActivo(nodo.getCodigo())) {
                metodos.msgError(null, "Este producto esta inactivo");
                lbProducto.requestFocus();
                return;
            }

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
      
            if (!tipo.equals("") && !this.tipo.equals("ordenCompra") && formaCargo!="null") {
                dlgCompraDetallada1 compraDetallada = null;
                 ArrayList<Map<String, String>> existenciasList = new ArrayList<Map<String, String>>();
                 existenciasList = instancias.getSql().getProductos(codigo, baseUtilizada);   
             
                if(tblDetalle.getRowCount()>0){
                    int contador = 0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        if (nodo.getIdSistema().equals(tblDetalle.getValueAt(i, 0))) {
                            contador++;
                        }
                    }
                    
                if(contador > 0){
                    Object[][] productos = new Object[contador][9];
                    boolean ingresado=false;
                    int xyz = 0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        if (tblProductos.getValueAt(tblProductos.getSelectedRow(), 24).equals(tblDetalle.getValueAt(i, 0))) {
                            ingresado=true;
                            productos[xyz][0] = tblDetalle.getValueAt(i, 1);
                            productos[xyz][1] = tblDetalle.getValueAt(i, 2);                            
                            if (tblDetalle.getValueAt(i, 10).equals("1") || tblDetalle.getValueAt(i, 10).equals(1)) {
                                cantidad = tblDetalle.getValueAt(i, 5).toString();
                            } else {
                                cantidad = "" + (Double.parseDouble(tblDetalle.getValueAt(i, 5).toString()) / Double.parseDouble(existenciasList.get(0).get("cantidad" + tblDetalle.getValueAt(i, 10))));
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
                    if(ingresado==true){
                       compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), productos, "Entrada", "pnlIngreso", baseUtilizada, "");
                    }else{
                       compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), null, "Entrada", "pnlIngreso", baseUtilizada, "");
                    } 
                  }else{
                      compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), null, "Entrada", "pnlIngreso", baseUtilizada, "");
                  }
                }else{
                 compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), null, "Entrada", "pnlIngreso", baseUtilizada, "");
                }
                
                compraDetallada.setLocationRelativeTo(null);
                compraDetallada.setVisible(true);
                return;
            } else {
                if (!formaCargo.equals("Directo")) {
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
                            pluu.setOpc(this.tipo);
                            pluu.setVisible(true);
                            return;
                        }
                    }
                }

                String cant2 = "1";
                String desc = nodo.getDescripcion();
                String lista = nodo.getL1();
                switch (plu) {
                    case 2:
                        cant2 = nodo.getCantidad2();
                        desc = nodo.getDescripcion2();
                        lista = nodo.getL2();
                        break;
                    case 3:
                        cant2 = nodo.getCantidad3();
                        desc = nodo.getDescripcion3();
                        lista = nodo.getL3();
                        break;
                    case 4:
                        cant2 = nodo.getCantidad4();
                        desc = nodo.getDescripcion4();
                        lista = nodo.getL4();
                        break;
                    case 5:
                        cant2 = nodo.getCantidad5();
                        desc = nodo.getDescripcion5();
                        lista = nodo.getL5();
                        break;
                    case 6:
                        cant2 = nodo.getCantidad6();
                        desc = nodo.getDescripcion6();
                        lista = nodo.getL6();
                        break;
                    case 7:
                        cant2 = nodo.getCantidad7();
                        desc = nodo.getDescripcion7();
                        lista = nodo.getL7();
                        break;
                    case 8:
                        cant2 = nodo.getCantidad8();
                        desc = nodo.getDescripcion8();
                        lista = nodo.getL8();
                        break;
                }

                if (cantidad.contains(".")) {
                    cantidad = cantidad.replace(".", ",");
                }

                Object[] ultimoMovimiento = instancias.getSql().getUltimoPonderado(nodo.getIdSistema());
                double costo;

                try {
                    costo = big.formatDouble(big.getBigDecimal(ultimoMovimiento[7].toString()));
                } catch (Exception e) {
                    costo = 0;
                }

                double pond;
                try {
                    pond = big.formatDouble(big.getBigDecimal(ultimoMovimiento[4].toString()));
                } catch (Exception e) {
                    pond = 0;
                }

                double utilidad;
//                utilidad = big.formatDouble(nodo.getL1()) - pond;
                utilidad = big.formatDouble(nodo.getL1()) - costo;

                try {
                    cmbBodegas.setSelectedIndex(0);
                } catch (Exception e) {
                }

                modeloPro.addRow(new Object[]{nodo.getCodigo(), desc, big.setMoneda(costo * big.getMonedaToDouble(cant2)),
                    cantidad, big.setMoneda(big.getBigDecimal("0")), "0", big.setMoneda(big.getBigDecimal("0")), big.setNumero(big.getBigDecimal(nodo.getIvaC())),
                    big.setNumero(big.getBigDecimal(nodo.getImpoconsumoCompra())), "0", nodo.getUnd(), big.setMoneda(costo),
                    big.setMoneda(big.getBigDecimal(lista)), plu, (big.getBigDecimal(cant2).multiply(big.getMoneda(cantidad))), big.setMoneda(costo), 0,
                    big.setMoneda(utilidad), "", "BD-Principal", nodo.getImpoconsumo(), this.simbolo + " 0", "0", new JLabel(icono), nodo.getIdSistema()});

                tblProductos.setColumnSelectionInterval(1, 1);
                tblProductos.setRowSelectionInterval(tblProductos.getRowCount() - 1, tblProductos.getRowCount() - 1);
                tblProductos.editCellAt(tblProductos.getRowCount() - 1, 1);
                tblProductos.transferFocus();
                txtCodProducto.setText("");

                KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                tblProductosKeyReleased(x);
                txtCant.setText(datos[87].toString());

                Rectangle r;
                if (datos[97].toString().equals("Valor")) {
                    r = tblProductos.getCellRect(tblProductos.getRowCount() - 1, 2, true);
                } else {
                    r = tblProductos.getCellRect(tblProductos.getRowCount() - 1, 3, true);
                }

                jScrollPane1.getViewport().scrollRectToVisible(r);

//                tblProductos.setColumnSelectionInterval(0, 0);
//                tblProductos.setRowSelectionInterval(modeloPro.getRowCount() - 1, modeloPro.getRowCount() - 1);
                return;
            }
        }
        ventanaProductos(codigo);
    }

    public void cargarProductoPreCompra(String codigo, String cantidad, int plu, String valor, Boolean cargando) {

        String baseUtilizada = obtenerBase();

        ndProducto nodo = instancias.getSql().getDatosProducto(codigo, baseUtilizada);

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

        if (!tipo.equals("") && cargando) {
            dlgCompraDetallada1 compraDetallada = new dlgCompraDetallada1(null, true, tipo, nodo.getIdSistema(), null, "Entrada", "pnlIngreso", baseUtilizada, "");
            compraDetallada.setLocationRelativeTo(null);
            compraDetallada.setVisible(true);
            return;
        } else {

            if (nodo.getIdSistema() != null) {
                String cant2 = "1";
                String desc = nodo.getDescripcion();
                String lista = nodo.getL1();
                switch (plu) {
                    case 2:
                        cant2 = nodo.getCantidad2();
                        desc = nodo.getDescripcion2();
                        lista = nodo.getL2();
                        break;
                    case 3:
                        cant2 = nodo.getCantidad3();
                        desc = nodo.getDescripcion3();
                        lista = nodo.getL3();
                        break;
                    case 4:
                        cant2 = nodo.getCantidad4();
                        desc = nodo.getDescripcion4();
                        lista = nodo.getL4();
                        break;
                    case 5:
                        cant2 = nodo.getCantidad5();
                        desc = nodo.getDescripcion5();
                        lista = nodo.getL5();
                        break;
                    case 6:
                        cant2 = nodo.getCantidad6();
                        desc = nodo.getDescripcion6();
                        lista = nodo.getL6();
                        break;
                    case 7:
                        cant2 = nodo.getCantidad7();
                        desc = nodo.getDescripcion7();
                        lista = nodo.getL7();
                        break;
                    case 8:
                        cant2 = nodo.getCantidad8();
                        desc = nodo.getDescripcion8();
                        lista = nodo.getL8();
                        break;
                }
                if (cantidad.contains(".")) {
                    cantidad = cantidad.replace(".", ",");
                }

                Object[] ultimoPonderado = instancias.getSql().getUltimoPonderado(codigo);

                double costo;
                try {
                    costo = big.formatDouble(ultimoPonderado[7].toString());
                } catch (Exception e) {
                    costo = 0;
                }

                BigDecimal ponderado = big.getBigDecimal(valor + "");
                BigDecimal utilidad;
                utilidad = big.getBigDecimal(nodo.getL1()).subtract(ponderado);

                modeloPro.addRow(new Object[]{nodo.getCodigo(), desc, big.setMoneda(ponderado),
                    cantidad, big.setMoneda(big.getBigDecimal("0")), "0", big.setMoneda(big.getBigDecimal("0")), big.setNumero(big.getBigDecimal(nodo.getIvaC())),
                    big.setNumero(big.getBigDecimal(nodo.getImpoconsumoCompra())), "0", nodo.getUnd(), big.setMoneda(costo),
                    big.setMoneda(big.getBigDecimal(lista)), plu, (big.getBigDecimal(cant2).multiply(big.getMoneda(cantidad))), big.setMoneda(ponderado), 0, big.setMoneda(utilidad),
                    "", "BD-Principal", nodo.getImpoconsumo(), this.simbolo + " 0", "0", new JLabel(icono), nodo.getIdSistema()});

                tblProductos.setColumnSelectionInterval(1, 1);
                tblProductos.setRowSelectionInterval(tblProductos.getRowCount() - 1, tblProductos.getRowCount() - 1);
                tblProductos.editCellAt(tblProductos.getRowCount() - 1, 1);
                tblProductos.transferFocus();
                txtCodProducto.setText("");

                KeyEvent x = new KeyEvent(this, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                tblProductosKeyReleased(x);
            }
        }
    }

    public void ventanaProductos(String codigo) {
        String lugar = "sinArmados";
//        if (tipo.equals("ordenCompra")) {
//            lugar = "sinSerial";
//        }

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

        buscProductos buscar = new buscProductos(null, true, false, lugar, base);
        buscar.setOpc(tipo);
        buscar.setIngreso(this);
        buscar.setLocationRelativeTo(null);
        instancias.setBusProductos(buscar);
        instancias.setCampoActual(txtCodProducto);
        txtCodProducto.requestFocus();
        buscar.noEncontrado(codigo.replace("'", "//"));
        buscar.show();
    }

    public void cargarCliente(String nit) {
        ndTercero nodo = instancias.getSql().getDatosTercero(nit);
        if (nodo.getId() != null) {
            txtNit.setText(nodo.getId());
            txtNombre.setText(nodo.getNombre());
            txtTelefono.setText(nodo.getTelefono());
            txtDireccion.setText(nodo.getDireccion());
            txtIdSistema.setText(nodo.getIdSistema());
            txtNumero.requestFocus();
            return;
        }
        ventanaTerceros(nit);
    }

    public void ventanaTerceros(String nit) {
        buscClientes buscar = new buscClientes(instancias.getMenu(), true, false, null, "");
        buscar.setOpc("ingreso");
        buscar.setLocationRelativeTo(null);
        instancias.setBusClientes(buscar);
        instancias.setCampoActual(txtNit);
        txtNit.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void nuevoProveedor(String id) {
        txtNit.setText(id);
        cargarCliente(id);
        txtCodProducto.requestFocus();
    }

    public void guardarPrecompra() {
        boolean noPuedaGuardar = false;
        String numeroDocuemntoSoporte="";
        if(jCheckBoxDS.isSelected()){
           numeroDocuemntoSoporte=DS.getText();
        }
        

        while (!noPuedaGuardar) {
            noPuedaGuardar = instancias.getSql().eliminarPrecompra("ING");
        }

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            Object vectCompra[] = {"ING", tblProductos.getValueAt(i, 24), big.getMoneda((String) tblProductos.getValueAt(i, 2)), tblProductos.getValueAt(i, 14),
                big.getMoneda((String) tblProductos.getValueAt(i, 6)), big.getMoneda((String) tblProductos.getValueAt(i, 21)), big.getMoneda((String) tblProductos.getValueAt(i, 22)),
                big.getMoneda((String) tblProductos.getValueAt(i, 4)), tblProductos.getValueAt(i, 7).toString(), tblProductos.getValueAt(i, 1), tblProductos.getValueAt(i, 13) + "",
                tblProductos.getValueAt(i, 3), big.getMoneda((String) tblProductos.getValueAt(i, 2)), "", big.getMoneda((String) tblProductos.getValueAt(i, 9)),
                tblProductos.getValueAt(i, 8).toString(),instancias.getUsuario(),numeroDocuemntoSoporte};

            ndCompra nodoComp = metodos.llenarCompra(vectCompra);

            if (!instancias.getSql().agregarPrecompra(nodoComp)) {
                metodos.msgError(null, "Hubo un problema al guardar la precompra");
            }
        }
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
         
        if (!instancias.getSql().agregarPreCompraDetallada("ING", prod, nombre,
                    cant, imei, lote, metodos.fechaConsulta(fecha), temp, color, talla, plu) ) {
                metodos.msgError(null, "Hubo un problema al guardar la precompra detallada");
            }
    }
    
    public void guardarPrecompraDetallada() {
       
        boolean noPuedaGuardar = false;

//        while (!noPuedaGuardar) {
          
//            noPuedaGuardar = instancias.getSql().eliminarPrecompraDetalle("ING");
//        }

        for (int i = 0; i < tblDetalle.getRowCount(); i++) {
            String cant = tblDetalle.getValueAt(i, 5).toString();
            if (cant.equals("")) {
                cant = "1.0";
            }

            String fecha = tblDetalle.getValueAt(i, 3).toString();
            if (fecha.equals("")) {
                fecha = metodosGenerales.fecha();
            }
         
            if (!instancias.getSql().agregarPreCompraDetallada("ING", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(),
                    cant, tblDetalle.getValueAt(i, 1).toString(), tblDetalle.getValueAt(i, 2).toString(),
                    metodos.fechaConsulta(fecha), tblDetalle.getValueAt(i, 4).toString(), tblDetalle.getValueAt(i, 7).toString(),
                    tblDetalle.getValueAt(i, 8).toString(),0)) {
                metodos.msgError(null, "Hubo un problema al guardar la precompra detallada");
            }
        }
    }

    public void cargarDetallado(String prod, String imei, String lote, String fechaVence, String temp,
            String cant, String nombre, String color, String talla, String sw_estado,int plu) {
         if(sw_estado.equals("0")){
           modeloPro1.addRow(new Object[]{prod, imei, lote, fechaVence, temp, cant, nombre, color, talla , sw_estado, plu});
           guardarPrecompraDetallada(prod, imei, lote, fechaVence, temp, cant, nombre, color, talla , plu);
         }
        }

    public void cargarTotales() {

        int i;

        BigDecimal subtotal, iva, impoconsumo, total, descuentos, rtf, rti, cantUnidades, descuentoGeneral;
        subtotal = big.getBigDecimal("0");
        iva = big.getBigDecimal("0");
        impoconsumo = big.getBigDecimal("0");
        descuentos = big.getBigDecimal("0");
        total = big.getBigDecimal("0");
        rtf = big.getBigDecimal("0");
        rti = big.getBigDecimal("0");
        cantUnidades = big.getBigDecimal("0");
        descuentoGeneral = big.getBigDecimal("0");

        try {
            descuentoGeneral = big.getBigDecimal(txtDescuento.getText());
        } catch (Exception e) {
        }

        for (i = 0; i < tblProductos.getRowCount(); i++) {
            subtotal = subtotal.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 4))));
            descuentos = descuentos.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 6))));

            impoconsumo = impoconsumo.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 9))));
            iva = iva.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 22))));

            total = total.add(big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 21))));
            cantUnidades = cantUnidades.add(big.getBigDecimal(tblProductos.getValueAt(i, 3).toString().replace(",", ".")));
        }

        if (cmbRtf.getSelectedIndex() > 0) {
            rtf = ((subtotal.subtract(descuentos))).multiply(big.getBigDecimal(cmbRtf.getSelectedItem())).divide(big.getBigDecimal("100"), 2, RoundingMode.HALF_DOWN);
        }

        if (jCheckBox1.isSelected()) {
            rti = iva.multiply(big.getBigDecimal("15")).divide(big.getBigDecimal("100"), 2, RoundingMode.HALF_DOWN);
        }

        descuentoGeneral = descuentoGeneral.multiply(subtotal);
        descuentoGeneral = descuentoGeneral.divide(big.getBigDecimal("100"), 3, RoundingMode.CEILING);

        descuentos = descuentos.add(descuentoGeneral);

        txtSubTotal.setText(big.setMoneda(subtotal));
        txtTotalDescuentos.setText(big.setMoneda(descuentos));
        txtTotalIva.setText(big.setMoneda(iva));
        txtTotalImpoconsumo.setText(big.setMoneda(impoconsumo));
        txtTotal.setText(big.setMoneda(total.subtract(rtf).subtract(rti).subtract(descuentoGeneral)));

        txtRtf.setText(big.setMonedaExacta(rtf));
        txtRiva.setText(big.setMonedaExacta(rti));
        txtCantProductos.setText(Integer.toString(tblProductos.getRowCount()));
        txtCantUnidades.setText(cantUnidades.toString());

    }

    public void desdeTraslado(String cliente, String[][] productos) {
        btnLimpiarActionPerformed(null);

        txtNit.setText(cliente);
        cargarCliente(cliente);

        for (String[] producto : productos) {
            cargarProducto(producto[0], "1", 1, "");
        }

        tblProductos.editCellAt(tblProductos.getSelectedRow(), 6);
        tblProductos.setColumnSelectionInterval(6, 6);
        tblProductos.transferFocus();

        for (int i = 0; i < tblProductos.getRowCount(); i++) {
            tblProductos.setValueAt(productos[i][1], i, 3);

            BigDecimal valor, cantidad, descuento, iva, subtotal, total;

            valor = big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 2)));
            cantidad = big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 3)));
            descuento = big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 6)));
            iva = big.getMoneda(String.valueOf(tblProductos.getValueAt(i, 7)));
            subtotal = (valor.multiply(cantidad)).subtract(descuento);
            iva = (big.getBigDecimal(subtotal).multiply(iva)).divide(new BigDecimal("100"));
            total = subtotal.add(iva);

            tblProductos.setValueAt(big.setMoneda(subtotal), i, 4);
            tblProductos.setValueAt(big.setMoneda(iva), i, 22);
            tblProductos.setValueAt(big.setMoneda(total), i, 21);

        }

        cargarTotales();
    }

    public void nuevoProducto(String id) {
        Logs.log("id producto nuevo " + id);
        cargarProducto(id, "1", 1, "");
    }

    public void cargarProductos(Object[][] productos) {
        String cantEstablecida = txtCant.getText();
        for (int i = 0; i < productos.length; i++) {
            this.plu = true;
            String codigo = productos[i][0].toString();
            String cantidad = productos[i][1].toString();
            if (cantidad.equals("0")) {
                cantidad = cantEstablecida;
            }
            cargarProducto(codigo, cantidad, 1, "");
        }
    }

    public void calcularTablaPreCompraValores() {
        int q = tblProductos.getRowCount();
        for (int i = 0; i < q; i++) {
            calcularTabla(i);
        }
    }

    private void calcularTabla(int fila) {
        BigDecimal valor, cantidad, descuento, iva, subtotal, total = BigDecimal.ZERO, porcentaje, porcentaje2, totalIva = BigDecimal.ZERO, subtotalGeneral = BigDecimal.ZERO;
        BigDecimal impoconsumo, totalImpoconsumo = BigDecimal.ZERO;

        tblProductos.setValueAt(big.setMoneda(big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 6)))), fila, 6);
        valor = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 2)));

        cantidad = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 3)).replace(".", ","));
        subtotal = valor.multiply(cantidad);

        if (tblProductos.getSelectedColumn() == 6) {
            descuento = big.getMoneda(tblProductos.getValueAt(fila, 6).toString());
            porcentaje2 = big.getBigDecimal(descuento.multiply(big.getBigDecimal("100")).divide(subtotal, 2, RoundingMode.HALF_DOWN));
        } else {
            if (tblProductos.getValueAt(fila, 5).toString().equals("")) {
                porcentaje2 = big.getBigDecimal("0");
            } else {
                porcentaje2 = big.getBigDecimal(tblProductos.getValueAt(fila, 5).toString().replace(",", ".")).divide(big.getBigDecimal("100"));
            }
            porcentaje = big.getBigDecimal(porcentaje2);
            descuento = big.getMoneda(big.setNumero(subtotal.multiply(porcentaje)));
            porcentaje2 = porcentaje2.multiply(big.getBigDecimal("100"));
        }

        iva = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 7)));
        iva = (iva.divide(big.getBigDecimal("100"))).add(big.getBigDecimal("1"));

        if (tblProductos.getSelectedColumn() == 9) {
            impoconsumo = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 9)));
        } else {
            impoconsumo = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 8)));
            impoconsumo = (impoconsumo.divide(big.getBigDecimal("100"))).add(big.getBigDecimal("1"));
        }

        subtotal = subtotal.subtract(descuento);
        subtotalGeneral = subtotal;

        BigDecimal porcImpoconsumo = BigDecimal.ZERO;

        if (instancias.isCostoConIva() || instancias.isCostoConImpoconsumo()) {
            BigDecimal subIva = BigDecimal.ZERO, subImpo = BigDecimal.ZERO;

            if (instancias.isCostoConIva() && instancias.isCostoConImpoconsumo()) {

                //CALCULAMOS EL IVA
                subIva = subtotal.divide(iva, 2, RoundingMode.HALF_UP);
                totalIva = subtotal.subtract(subIva);

                if (tblProductos.getSelectedColumn() == 9) {
                    //CALCULAMOS EL IMPOCONSUMO
                    totalImpoconsumo = impoconsumo;
                    porcImpoconsumo = big.getBigDecimal("100").multiply(impoconsumo).divide(subtotalGeneral, 2, RoundingMode.HALF_UP);
                } else {
                    //CALCULAMOS EL IMPOCONSUMO
                    subImpo = subtotal.divide(impoconsumo, 2, RoundingMode.HALF_UP);
                    totalImpoconsumo = subtotal.subtract(subImpo);
                }

                //CALCULAMOS EL SUBTOTAL
                subtotal = subtotal.subtract(totalImpoconsumo).subtract(totalIva);
            } else if (instancias.isCostoConIva()) {
                subIva = subtotal.divide(iva, 2, RoundingMode.HALF_UP);
                totalIva = subtotal.subtract(subIva);
                subtotal = subtotal.subtract(totalIva);
            } else if (instancias.isCostoConImpoconsumo()) {
                if (tblProductos.getSelectedColumn() == 9) {
                    totalImpoconsumo = impoconsumo;
                    subtotal = subtotal.subtract(totalImpoconsumo);
                    porcImpoconsumo = big.getBigDecimal("100").multiply(impoconsumo).divide(subtotalGeneral, 2, RoundingMode.HALF_UP);
                } else {
                    subImpo = subtotal.divide(impoconsumo, 2, RoundingMode.HALF_UP);
                    totalImpoconsumo = subtotal.subtract(subImpo);
                    subtotal = subtotal.subtract(totalImpoconsumo);
                }
            }
        }

        if (!instancias.isCostoConIva()) {
            iva = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 7)));
            iva = (iva.divide(big.getBigDecimal("100"))).add(big.getBigDecimal("1"));
            totalIva = subtotalGeneral.multiply(iva);
            totalIva = totalIva.subtract(subtotalGeneral);
        }

        if (!instancias.isCostoConImpoconsumo()) {
            if (tblProductos.getSelectedColumn() == 9) {
                totalImpoconsumo = impoconsumo;
                porcImpoconsumo = big.getBigDecimal("100").multiply(impoconsumo).divide(subtotalGeneral, 2, RoundingMode.HALF_UP);
            } else {
                impoconsumo = big.getMoneda(String.valueOf(tblProductos.getValueAt(fila, 8)));
                impoconsumo = (impoconsumo.divide(big.getBigDecimal("100"))).add(big.getBigDecimal("1"));
                totalImpoconsumo = subtotalGeneral.multiply(impoconsumo);
                totalImpoconsumo = totalImpoconsumo.subtract(subtotalGeneral);
            }
        }

        total = subtotal.add(totalIva).add(totalImpoconsumo);

        if (tblProductos.getSelectedColumn() == 9) {
            tblProductos.setValueAt(big.setNumero(porcImpoconsumo), fila, 8);
        }

        tblProductos.setValueAt(big.setMoneda(big.getMoneda(tblProductos.getValueAt(fila, 15).toString())), fila, 15);
        tblProductos.setValueAt(big.setMoneda(big.getMoneda(tblProductos.getValueAt(fila, 17).toString())), fila, 17);

        tblProductos.setValueAt(big.setMoneda(valor), fila, 2);
        //tblProductos.setValueAt(big.setNumero(cantidad), fila, 3);
        tblProductos.setValueAt(big.setMoneda(totalImpoconsumo), fila, 9);
        tblProductos.setValueAt(big.setMoneda(subtotal), fila, 4);
        tblProductos.setValueAt(porcentaje2, fila, 5);
        tblProductos.setValueAt(big.setMoneda(descuento), fila, 6);
        tblProductos.setValueAt(big.setMoneda(totalIva), fila, 22);
        tblProductos.setValueAt(big.setMoneda(total), fila, 21);

        String baseUtilizada = obtenerBase();

        switch (tblProductos.getValueAt(fila, 13).toString()) {
            case "1":
                tblProductos.setValueAt(cantidad, fila, 14);
                break;
            case "2":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(
                        instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 24).toString(), baseUtilizada).getCantidad2())), fila, 14);
                break;
            case "3":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(
                        instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 24).toString(), baseUtilizada).getCantidad3())), fila, 14);
                break;
            case "4":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(
                        instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 24).toString(), baseUtilizada).getCantidad4())), fila, 14);
                break;
            case "5":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(
                        instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 24).toString(), baseUtilizada).getCantidad5())), fila, 14);
                break;
            case "6":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(
                        instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 24).toString(), baseUtilizada).getCantidad6())), fila, 14);
                break;
            case "7":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(
                        instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 24).toString(), baseUtilizada).getCantidad7())), fila, 14);
                break;
            case "8":
                tblProductos.setValueAt(cantidad.multiply(big.getBigDecimal(
                        instancias.getSql().getDatosProducto(tblProductos.getValueAt(fila, 24).toString(), baseUtilizada).getCantidad8())), fila, 14);
                break;
        }

        cargarTotales();
    }
    
    private String consecutivo(String tipoConsecutivo) {
        try {
            int valor = 0;
            do {
                Thread.sleep(500);
                valor = instancias.getSql().getConsultaTablaBloqueada("bdLogErroresDetalle");
            } while (valor > 0);
        } catch (InterruptedException ex) {
        }
        instancias.getSql().bloqueoConsecutivosfactura();
        int consecutivo = instancias.getSql().getConsecutivoFacturaActual(tipoConsecutivo);
        return String.valueOf(consecutivo);
    }
    
    private boolean setDocumentoSoporte(Object[] datosDocElect){
        boolean documentoExitoso = false;
        ndTercero nodoTerc = instancias.getSql().getDatosTercero(txtIdSistema.getText());
        Object[][] paises = instancias.getSql().getPais(nodoTerc.getPais());         
     
        String dsNumeroFactura = "0";       
        
//        String dsPrefijo = (String) instancias.getSql().getDatosPrefijosYModelos()[14];
        //bloquear tablas
        String fechaEmision = metodos.fecha4(metodosGenerales.fecha()) + " " + metodosGenerales.fechaHora().split(" ")[1];
        String fechaEmisionPeriodo = metodos.fecha4(metodosGenerales.fecha());
        String fechaVencimiento = metodos.fecha4(metodosGenerales.fecha());
        String emailAdquiriente = nodoTerc.getEmail();

//        String tipoIdentificacionAdquiriente = getTipoDocumentoEquivalente(nodoTerc.getTipo());
        String identificacionAdquiriente = nodoTerc.getId();

        String codigoPostalAdquirente = nodoTerc.getCategoria();
        String tipoPersonaAdquiriente = "NATURAL";
        if (nodoTerc.getNaturaleza() != null) {
            if (nodoTerc.getNaturaleza().equals("Persona juridica")) {
                tipoPersonaAdquiriente = "JURIDICA";
            } else {
                tipoPersonaAdquiriente = "NATURAL";
            }
        }

        String tipoIdent = "", nombresAdquiriente = "";
        if (null != nodoTerc.getTipo()) {
            tipoIdent = nodoTerc.getTipo();
        }

        if (tipoIdent.equals("Nit") || tipoIdent.equals("NIT de otro país")) {
            nombresAdquiriente = nodoTerc.getNombre();
        } else {
            nombresAdquiriente = nodoTerc.getpNombre();
        }

        String segundoNombre = nodoTerc.getsNombre();
        String primerApellido = nodoTerc.getpApellido();
        String segundoApellido = nodoTerc.getsApellido();
        String direccionAdquiriente = nodoTerc.getDireccion();
        String telefonoAdquiriente = nodoTerc.getTelefono();
        Boolean adquirenteResponsable = nodoTerc.isResponsableIva();
        String tipoIdentificacionAdquiriente = metodos.getTipoDocumentoEquivalente(nodoTerc.getTipo());
        String regimenAdquirente = "NO_RESPONSABLE_IVA";
        if (adquirenteResponsable) {
            regimenAdquirente = "RESPONSABLE_IVA";
        }

        String cdIso = paises[0][2].toString();//"CO";
        String pais = nodoTerc.getPais();
        String ciudad = nodoTerc.getCiudad();
        String departamento = nodoTerc.getDepartamento();

        Object[][] codigo = instancias.getSql().getCodigoLugar(departamento, ciudad);
        String cdDaneDepartamento = codigo[0][0].toString();
        String cdDaneCiudad = codigo[0][1].toString();
       
        int anticipoTotal = 0;
  
        //cambio moneda   
        String moneda = "COP";

        String versionDian = "2";

        //String[] responsabilidades = datos[113].toString().split(", ");
        String[] responsabilidades = {"R-99-PN /No responsable"};
        String responsabilidadesFiscales = "";
        for (int i = 0; i < responsabilidades.length; i++) {
            responsabilidadesFiscales = responsabilidadesFiscales + responsabilidades[i].split(" /")[0] + ";";
        }
        if (!responsabilidadesFiscales.equals("")) {
            responsabilidadesFiscales = responsabilidadesFiscales.substring(0, responsabilidadesFiscales.length() - 1);
        }

        //INICIO METODOS DE PAGO
        String minutos = metodosGenerales.hora().split(":")[0], segundos = metodosGenerales.hora().split(":")[1];
        if (minutos.length() == 1) {
            minutos = "0" + minutos;
        }

        if (segundos.length() == 1) {
            segundos = "0" + segundos;
        }

        String tipoDocumentoElectronico = "SOPORTE_ADQUISICION";
       
        //se crea el json       
        
        JsonObject adquiriente = new JsonObject();
        adquiriente.addProperty("tipoFactura", 3);
        adquiriente.addProperty("dsPrefijo",(String)  datosDocElect[4]);
        adquiriente.addProperty("dsNumeroFactura", dsNumeroFactura);
        adquiriente.addProperty("tipoOperacion", "RESIDENTE");
        adquiriente.addProperty("regimenAdquirente", regimenAdquirente);
        adquiriente.addProperty("fechaEmision", fechaEmision);
        adquiriente.addProperty("fechaVencimiento", fechaVencimiento);        
        adquiriente.addProperty("tipoDocumentoElectronico", tipoDocumentoElectronico);        
        adquiriente.addProperty("dsResolucionDian",(String) datosDocElect[2]);        
        adquiriente.addProperty("emailAdquiriente", emailAdquiriente);
        adquiriente.addProperty("tipoIdentificacionAdquiriente", tipoIdentificacionAdquiriente);
        adquiriente.addProperty("identificacionAdquiriente", identificacionAdquiriente);
        if(nodoTerc.getId().contains("-")){
             String digitoVerificacionAdquirente = nodoTerc.getId().split("-")[1];
             adquiriente.addProperty("digitoVerificacionAdquirente", digitoVerificacionAdquirente);
        }
        adquiriente.addProperty("tipoPersonaAdquiriente", tipoPersonaAdquiriente);
        adquiriente.addProperty("nombresAdquiriente", nombresAdquiriente);
        adquiriente.addProperty("segundoNombre", segundoNombre);
        adquiriente.addProperty("primerApellido", primerApellido);
        adquiriente.addProperty("segundoApellido", segundoApellido);        
        adquiriente.addProperty("codigoPostalAdquirente", codigoPostalAdquirente);       
        adquiriente.addProperty("direccionAdquiriente", direccionAdquiriente);
        adquiriente.addProperty("adquirenteResponsable", ""+adquirenteResponsable);
        adquiriente.addProperty("telefonoAdquiriente", telefonoAdquiriente);
        adquiriente.addProperty("celularAdquiriente", telefonoAdquiriente);
        adquiriente.addProperty("celularAdquiriente", telefonoAdquiriente);
                      adquiriente.addProperty("identificadorTributarioAdquiriente","IVA");
        //se adiciona la ciudad
        JsonObject ciudadAdquiriente = new JsonObject();
        ciudadAdquiriente.addProperty("cdDane", cdDaneCiudad);
        ciudadAdquiriente.addProperty("dsNombre", ciudad);
        JsonObject departamentoAdquiriente = new JsonObject();
        departamentoAdquiriente.addProperty("cdDane", cdDaneDepartamento);
        departamentoAdquiriente.addProperty("dsNombre", (departamento).toUpperCase());
        departamentoAdquiriente.addProperty("cdIso", (cdIso+"-"+departamento.substring(0,3)).toUpperCase());
        JsonObject paisAdquiriente = new JsonObject();
        paisAdquiriente.addProperty("cdIso", cdIso);
        paisAdquiriente.addProperty("dsNombre", pais);//Colombia
        departamentoAdquiriente.add("pais", paisAdquiriente);
        ciudadAdquiriente.add("departamento", departamentoAdquiriente);
        adquiriente.add("ciudadAdquiriente", ciudadAdquiriente);
        //fin adicion ciudad
        JsonObject pagoJson = new JsonObject();
        String formaPago,tipoPago,fechaVencimientoPago;
        if (Double.valueOf(txtDiasPlazo.getText()) > 0) {
            formaPago = "CREDITO";
            tipoPago = "CREDITO_ACH";
            fechaVencimientoPago = metodos.fecha4(metodos.sumarFecha(txtFechaFactura.getText(), Integer.parseInt(txtDiasPlazo.getText())));
        } else {
            formaPago = "CONTADO";
            tipoPago = "EFECTIVO";
            fechaVencimientoPago = fechaVencimiento;
        }
        pagoJson.addProperty("formaPago",  formaPago);
        pagoJson.addProperty("medioPago", tipoPago);
        
        pagoJson.addProperty("fechaVencimientoPago", fechaVencimientoPago + " " + minutos + ":" + segundos + ":00" );
        pagoJson.addProperty("idPago", "");
        adquiriente.add("pago", pagoJson);
       
        JsonArray impuestosRetencionesTotales = new JsonArray();
        JsonObject detalleIva = new JsonObject();
        JsonArray impuestosRetencionesTotalesReIva = new JsonArray();
        JsonArray impuestosRetencionesTotalesIva = new JsonArray();
        JsonArray impuestosRetencionesTotalesINC = new JsonArray();
        JsonObject detalleIcn = new JsonObject();
        //RECORRE TODOS LOS PRODUCTOS
        JsonArray detalleTodos = new JsonArray();
        JsonArray impuestosRetencionesTotal = new JsonArray();
        JsonArray cargosDescuentosTotal = new JsonArray();
        
        double valorBruto=0;
        double valorTotalArticulo=0;
        double valorBaseImponible =0;
        double impuestosNacionalConsumo=0;
        for (int i = 0; i < tblProductos.getRowCount(); i++) {
                JsonObject detalle = new JsonObject();
                double impuestos=0;                
                double cargos=0;
                double descuentos=0;
                JsonArray impuestosRetenciones = new JsonArray();
                JsonArray descuentosArray = new JsonArray();
                JsonObject impuestosRetencionesIva = new JsonObject();
                JsonObject impuestosRetencionesReteIva = new JsonObject();
                JsonObject impuestosRetencionesInc = new JsonObject();
                valorBaseImponible +=big.getMonedaToDouble(tblProductos.getValueAt(i,2).toString())*big.getMonedaToDouble(tblProductos.getValueAt(i,3).toString().replace(".", ","));
               
                if (big.formatDouble(big.getBigDecimal(tblProductos.getValueAt(i, 7))) > 0) {
                    JsonArray arraySubTotalesIva = new JsonArray();
                    impuestosRetencionesIva.addProperty("valorTotal",metodos.formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i,22).toString())));
                    JsonObject subTotal = new JsonObject();
                    subTotal.addProperty("valorBase", metodos.formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i,4).toString().toString()))); 
                    double valorImpuestoRetencion =  big.getMonedaToDouble(tblProductos.getValueAt(i,22).toString().toString());
                    impuestos+=valorImpuestoRetencion;
                    subTotal.addProperty("valorImpuestoRetencion", metodos.formatVal(valorImpuestoRetencion));                    
                    subTotal.addProperty("porcentaje", metodos.formatVal(big.formatDouble(big.getBigDecimal(tblProductos.getValueAt(i, 7)))));
                    subTotal.addProperty("tributo", "IVA");
                    arraySubTotalesIva.add(subTotal);
                    impuestosRetencionesIva.add("subtotales", arraySubTotalesIva);
                    impuestosRetenciones.add(impuestosRetencionesIva);
                    impuestosRetencionesTotalesIva.add(subTotal);
                    
                }                
                                
                if (big.formatDouble(big.getBigDecimal(tblProductos.getValueAt(i, 8))) > 0) {                    
//                    JsonArray arraySubTotalesInc = new JsonArray();
//                    impuestosRetencionesInc.addProperty("valorTotal", metodos.formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i,9).toString())));
//                    JsonObject subTotal = new JsonObject();
//                    subTotal.addProperty("valorBase", metodos.formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i,4).toString().toString()))); 
                      double valorImpuestoRetencion =  big.getMonedaToDouble(tblProductos.getValueAt(i,9).toString().toString());
                      impuestosNacionalConsumo+=valorImpuestoRetencion;
//                    subTotal.addProperty("valorImpuestoRetencion", metodos.formatVal(valorImpuestoRetencion));
//                    subTotal.addProperty("porcentaje", metodos.formatVal(big.formatDouble(big.getBigDecimal(tblProductos.getValueAt(i, 8)))));
//                    subTotal.addProperty("tributo", "INC");
//                    arraySubTotalesInc.add(subTotal);
//                    impuestosRetencionesInc.add("subtotales", arraySubTotalesInc);
//                    impuestosRetenciones.add(impuestosRetencionesInc);
//                    impuestosRetencionesTotalesINC.add(subTotal);
                } 
                
                if (big.formatDouble(big.getBigDecimal(tblProductos.getValueAt(i, 5))) > 0) {
                    JsonObject descuento= new JsonObject();
                    descuento.addProperty("tipo", "" + false);
                    descuento.addProperty("codigoDescuento","DESCUENTO_NO_CONDICIONADO");
                    descuento.addProperty("razon","DESCUENTO_GENERAL");
                    descuento.addProperty("porcentaje",metodos.formatVal(big.formatDouble(big.getBigDecimal(tblProductos.getValueAt(i, 5)))));
                    descuentos+=big.getMonedaToDouble(tblProductos.getValueAt(i,6).toString().toString());
                    descuento.addProperty("valor",metodos.formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i,6).toString())));
                    descuento.addProperty("valorBase",metodos.formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i,2).toString())*big.getMonedaToDouble(tblProductos.getValueAt(i,3).toString().replace(".", ",")))); 
                    cargosDescuentosTotal.add(descuento);
                    descuentosArray.add(descuento);
                }
                             
            
            detalle.addProperty("descripcionArticulo", "" + tblProductos.getValueAt(i,1));
            detalle.addProperty("unidadMedida", "" + tblProductos.getValueAt(i,10));
            detalle.addProperty("nombreMarca", "" + "");
            detalle.addProperty("nombreModelo", "" + "");
            detalle.addProperty("codigoArticulo", "" + tblProductos.getValueAt(i,0));
            detalle.addProperty("precioUnitario", metodos.formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i,2).toString())));
            detalle.addProperty("valorTotalImpuestosRetenciones",metodos.formatVal(impuestos));
            detalle.addProperty("valorTotalArticulo", metodos.formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i,21).toString())));
            detalle.addProperty("cantidad", metodos.formatVal(big.getMonedaToDouble(tblProductos.getValueAt(i,3).toString().replace(".", ","))));
            valorBruto +=(big.getMonedaToDouble(tblProductos.getValueAt(i,2).toString())*big.getMonedaToDouble(tblProductos.getValueAt(i,3).toString().replace(".", ",")))-descuentos;
            detalle.addProperty("valorTotalBruto", metodos.formatVal((big.getMonedaToDouble(tblProductos.getValueAt(i,2).toString())*big.getMonedaToDouble(tblProductos.getValueAt(i,3).toString().replace(".", ","))-(big.getMonedaToDouble(tblProductos.getValueAt(i,6).toString())))));
            
            JsonObject periodoFactura = new JsonObject();
            periodoFactura.addProperty("fechaInicio", fechaEmisionPeriodo);
            periodoFactura.addProperty("codigoGeneracion", "POR_OPERACION");
            detalle.add("periodoFactura", periodoFactura);
            detalle.add("impuestosRetenciones",impuestosRetenciones);
            detalle.add("cargosDescuentos",descuentosArray);
            detalleTodos.add(detalle);
        }    
        adquiriente.add("detalles", detalleTodos);
        adquiriente.addProperty("customTotalUnidades", tblProductos.getRowCount());
        
        double porcentajeIca =0;
        double porcentajeIva =0;
        double porcentajeConsumo =0;
        double dsPorcentajeReteFuente =0;
        double dsRetencionFuente =0;
        double dsPorcentajeReteIva = 0;
        double dsRetencionIva = big.getMonedaToDouble(txtRiva.getText());
        double dsPorcentajeReteIca =0;
        double dsRetencionIca =0;
        double dsDescuento =0;
        
        double descuentoTotal = big.getMonedaToDouble(txtTotalDescuentos.getText());
        double cargoTotal =0;
        
        double valorTotalIva = big.getMonedaToDouble(txtTotalIva.getText());
        double valorTotalReIva = big.getMonedaToDouble(txtRiva.getText());
        double valorTotalIca =0;
        double valorTotalImpuestoConsumo = 0;
        double valorTotalImpuestoNacionalConsumo = big.getMonedaToDouble(txtTotalImpoconsumo.getText());
        double valorOtrosImpuestos =0;
        //valorBruto=valorBruto-descuentoTotal;
        double valorBrutoMasTributos = big.formatDouble(valorBruto + valorTotalIva + valorTotalIca + valorTotalImpuestoConsumo + valorTotalImpuestoNacionalConsumo);        
        double valorNeto = big.formatDouble((valorBrutoMasTributos) - descuentoTotal);
        
        /*DETALLE DE IMPUESTOS*/
        
        if (valorTotalReIva > 0) { 
            JsonObject detalleReIva = new JsonObject();
            JsonObject subTotal = new JsonObject();
            subTotal.addProperty("valorBase", metodos.formatVal(valorTotalIva));                    
            subTotal.addProperty("valorImpuestoRetencion", metodos.formatVal(valorTotalReIva));                    
            subTotal.addProperty("porcentaje", metodos.formatVal(15));
            subTotal.addProperty("tributo", "RETE_IVA");
            impuestosRetencionesTotalesReIva.add(subTotal);
            detalleReIva.addProperty("valorTotal", metodos.formatVal(valorTotalReIva));
            detalleReIva.add("subtotales", impuestosRetencionesTotalesReIva);
            impuestosRetencionesTotal.add(detalleReIva);
            adquiriente.addProperty("dsPorcentajeReteIva",metodos.formatVal(15));
            adquiriente.addProperty("dsRetencionIva",metodos.formatVal(valorTotalReIva));
        }
        
        if (valorTotalIva > 0) {
            detalleIva.addProperty("valorTotal", metodos.formatVal(valorTotalIva));
            detalleIva.add("subtotales", impuestosRetencionesTotalesIva);
            impuestosRetencionesTotal.add(detalleIva);
        }
        
        
//        if (valorTotalImpuestoNacionalConsumo > 0) {
//            detalleIcn.addProperty("valorTotal", metodos.formatVal(valorTotalImpuestoNacionalConsumo));
//            detalleIcn.add("subtotales", impuestosRetencionesTotalesINC);
//            impuestosRetencionesTotal.add(detalleIcn);
//        }
         
        adquiriente.add("impuestosRetenciones", impuestosRetencionesTotal);        
        adquiriente.add("cargosDescuentos", cargosDescuentosTotal);
        
        adquiriente.addProperty("valorTotalImpuestoNacionalConsumo", metodos.formatVal(impuestosNacionalConsumo));
        adquiriente.addProperty("responsabilidadesFiscales",responsabilidadesFiscales);
        adquiriente.addProperty("moneda",moneda);
                
        adquiriente.addProperty("dsObservacion", txtObservaciones.getText());;
        adquiriente.addProperty("dsRetencionIva", metodos.formatVal(dsRetencionIva));
        
        adquiriente.addProperty("versionDian", "2");
        if (Utils.quitarEtiquetas(instancias.getLegal()).isEmpty()) {
            adquiriente.addProperty("customNumeroCuenta", "");
        } else {
            adquiriente.addProperty("customNumeroCuenta", Utils.quitarEtiquetas(instancias.getLegal()));
        }
        adquiriente.addProperty("valorEnLetras", "");
        
        adquiriente.addProperty("valorIva", metodos.formatVal(valorTotalIva));
        adquiriente.addProperty("valorTotalIca", metodos.formatVal(valorTotalIca));
        adquiriente.addProperty("valorTotalImpuestoConsumo", metodos.formatVal(valorTotalImpuestoConsumo));
//        adquiriente.addProperty("valorTotalImpuestoNacionalConsumo ", metodos.formatVal(valorTotalImpuestoNacionalConsumo));
        adquiriente.addProperty("valorOtrosImpuestos ", metodos.formatVal(valorOtrosImpuestos));
        
        
        adquiriente.addProperty("valorNeto", metodos.formatVal(valorNeto));
        adquiriente.addProperty("valorBrutoMasTributos", metodos.formatVal(valorBrutoMasTributos));
        
        if(valorBaseImponible>0){
             adquiriente.addProperty("valorBaseImponible", metodos.formatVal(valorBaseImponible));
        }else{
            adquiriente.addProperty("valorBaseImponible", "0.00");
        } 
        adquiriente.addProperty("descuentoTotal", metodos.formatVal(descuentoTotal));
        adquiriente.addProperty("cargoTotal", metodos.formatVal(cargoTotal));
        adquiriente.addProperty("anticipoTotal", "0.00");
        adquiriente.addProperty("valorBruto", metodos.formatVal(valorBruto));
        
        adquiriente.addProperty("dsNumeroFactura",consecutivo("DS"));
        System.out.println("Json: "+adquiriente.toString());
        //validacion de 
        facturacionElectronica facturacion = new facturacionElectronica(instancias.getNitEmisor(),instancias.getTokenEmisor());
        boolean estadoFactura= false;
        try {
            estadoFactura = facturacion.consumirServicioApiClickingPos(adquiriente.toString(),false,instancias.getNitEmisor(),dsNumeroFactura,"0");
            setRespuesta(facturacion.getRespuesta());
        } catch (Exception ex) {
           Logs.error(ex);
        }
        
        return estadoFactura;
    }
        
    public void LogsFacturaApi(RespuestaServicioEnvioFacturas respuesta,String facturaEnvio) {
        
        ArrayList<Map<String, String>> datos = null;
        try {
                datos = instancias.getSql().getLogsFacturaApi(respuesta.getDato().getNumeroFactura(), "");
            if (datos.size() > 0) {
                instancias.getSql().modificarLogsServicioFacturacion("0", respuesta.getDato().getNumeroFactura(), respuesta.getMensaje(), getRespuesta(), "",respuesta.getDato().getId(),"1");
            } else {
                String respuestaDomina = "";
                instancias.getSql().almacenarLogsServicioFacturacion("0", respuesta.getDato().getNumeroFactura(), respuesta.getDato().getId(), respuesta.getMensaje() + " " + respuestaDomina, getRespuesta(), "","1");
            }
        } catch (Exception e) {
                instancias.getSql().almacenarLogsServicioFacturacion("2", facturaEnvio, "", "Error en la respuesta del servicio "+e.getMessage(), "Error en el Servicio - Respuesta: "+getRespuesta(), "","1");
                Log.error("Error en LogsFacturaApi: "+e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DS;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnBusProd;
    private javax.swing.JButton btnBuscTerceros;
    private javax.swing.JButton btnBuscTerceros2;
    private javax.swing.JButton btnBuscTerceros3;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImportarExcel;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkPesos;
    private javax.swing.JCheckBox chkPorcentaje;
    private javax.swing.JComboBox cmbBodegas;
    private javax.swing.JComboBox cmbCargar;
    private javax.swing.JComboBox cmbRtf;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JComboBox cmbTipo1;
    private javax.swing.JLabel etiqTotal;
    private javax.swing.JLabel etiqTotal1;
    private javax.swing.ButtonGroup grpTipoDescuento;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBoxDS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbBodega;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbFacturaNo;
    private javax.swing.JLabel lbFacturaNo3;
    private javax.swing.JLabel lbFechaFactura;
    private javax.swing.JLabel lbModeloContable;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNoFactura;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbNumero1;
    private javax.swing.JLabel lbNumero2;
    private javax.swing.JLabel lbNumero3;
    private javax.swing.JLabel lbNumero4;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JLabel lbProducto1;
    private javax.swing.JLabel lbProducto2;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTotalDescuento;
    private javax.swing.JLabel lbVendedor1;
    private javax.swing.JPanel pblBotones;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInvisible;
    private javax.swing.JMenuItem popBorrar;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBodega;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCantProductos;
    private javax.swing.JTextField txtCantUnidades;
    private javax.swing.JTextField txtCargarCompra;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDiasPlazo;
    private javax.swing.JTextField txtDiasPlazo1;
    private javax.swing.JTextField txtDireccion;
    private datechooser.beans.DateChooserCombo txtFechaFactura;
    private javax.swing.JTextField txtIdSistema;
    private javax.swing.JLabel txtIva;
    private javax.swing.JTextField txtModeloContable;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JLabel txtRiva;
    private javax.swing.JLabel txtRtf;
    private javax.swing.JLabel txtSubTotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtTotalDescuentos;
    private javax.swing.JLabel txtTotalImpoconsumo;
    private javax.swing.JLabel txtTotalIva;
    private datechooser.beans.DateChooserCombo txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
