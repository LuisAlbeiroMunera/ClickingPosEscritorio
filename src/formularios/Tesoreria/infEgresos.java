package formularios.Tesoreria;

import clases.Egresos.ndEgreso;
import clases.Egresos.ndEgresoCods;
import clases.Instancias;
import clases.Respuesta;
import clases.RespuestaServicioEnvioFacturas;
import clases.Utils;
import clases.terceros.ndTercero;
import clases.big;
import clases.convertirNumeroALetras;
import clases.facturacionElectronica;
import clases.metodosGenerales;
import clases.productos.ndProducto;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import static formularios.productos.pnlIngreso.getCalendarFromDateHum;
import formularios.terceros.buscClientes;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import logs.Logs;
import org.jfree.util.Log;

public class infEgresos extends javax.swing.JInternalFrame {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;
    private Boolean mensaje = true;
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    private TreeMap<String, String[]> codigos;
    convertirNumeroALetras convertirNumeroALetras = new convertirNumeroALetras();
    String ingresoAsociado = "", tipoMovimiento = "", consecutivoBanco = "", simbolo = "";
    Boolean saltarPasos = false, cancelarEgreso = false;
    DecimalFormat df = new DecimalFormat("#.00");
    private String respuesta;
    private String consecutivoDS;
    
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getConsecutivoDS() {
        return consecutivoDS;
    }

    public void setConsecutivoDS(String consecutivoDS) {
        this.consecutivoDS = consecutivoDS;
    }

    public String getConsecutivoBanco() {
        return consecutivoBanco;
    }

    public void setConsecutivoBanco(String consecutivoBanco) {
        this.consecutivoBanco = consecutivoBanco;
    }

    public String getIngresoAsociado() {
        return ingresoAsociado;
    }

    public void setIngresoAsociado(String ingresoAsociado) {
        this.ingresoAsociado = ingresoAsociado;
    }

    public Boolean getSaltarPasos() {
        return saltarPasos;
    }

    public void setSaltarPasos(Boolean saltarPasos) {
        this.saltarPasos = saltarPasos;
    }

    public Boolean getCancelarEgreso() {
        return cancelarEgreso;
    }

    public void setCancelarEgreso(Boolean cancelarEgreso) {
        this.cancelarEgreso = cancelarEgreso;
    }

    public infEgresos() {

        initComponents();
        codigos = new TreeMap();

        instancias = Instancias.getInstancias();

        simbolo = instancias.getSimbolo();
        txtCheque.setText(this.simbolo + " 0");
        txtBanco.setText(this.simbolo + " 0");

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        btnLimpiarActionPerformed(null);
        Object[][] codigos = instancias.getSql().getCodsEgresos();

        String prefijo = "";
        if (instancias.getIdEgreso() != null) {
            prefijo = instancias.getIdEgreso();
        }
        lbNoEgreso.setText(prefijo + (String) instancias.getSql().getNumConsecutivoActual("EGR")[0]);

        if (!instancias.getConfiguraciones().isPuc()) {
            Object[] informacion = instancias.getSql().getDatosPrefijosYModelos();
            if (null != informacion[10]) {
                txtModeloContable.setText(informacion[10].toString());
            }

            txtModeloContable.setVisible(false);
            lbModeloContable.setVisible(false);
        }

        pnlFormulario.registerKeyboardAction(accion("guardar"), "guardar", KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("limpiar"), "limpiar", KeyStroke.getKeyStroke(KeyEvent.VK_L, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("proveedor"), "proveedor", KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("terceros"), "terceros", KeyStroke.getKeyStroke(KeyEvent.VK_T, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);

        try {
            
            if (instancias.getTipoImpresion()!= null){
                if(instancias.getTipoImpresion().equals("Pos")) {
                    cmbTipo1.setSelectedIndex(1);
                } else {
                    cmbTipo1.setSelectedIndex(0);
                }
            } else {
                cmbTipo1.setSelectedIndex(0);
            }
        } catch (Exception e) {
            Logs.error(e);
            cmbTipo1.setSelectedIndex(0);
        }

        pnlInvisible.setVisible(false);

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
//                    case "proveedor":
//                        if ((btnBuscTerceros1.isEnabled()) && (btnBuscTerceros1.isVisible())) {
//                            btnBuscTerceros1ActionPerformed(null);
//                        }
//                        break;
                    case "terceros":
                        if ((btnBuscTerceros.isEnabled()) && (btnBuscTerceros.isVisible())) {
                            btnBuscTercerosActionPerformed(null);
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
        pnlCliente = new javax.swing.JPanel();
        txtTelefono = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        lbRazon = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lbDireccion = new javax.swing.JLabel();
        lbNit = new javax.swing.JLabel();
        txtRazon = new javax.swing.JTextField();
        txtNit = new javax.swing.JTextField();
        btnBuscTerceros = new javax.swing.JButton();
        lbNumero3 = new javax.swing.JLabel();
        cmbTipo1 = new javax.swing.JComboBox();
        pnlValores = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lbLetras1 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        lbModeloContable = new javax.swing.JLabel();
        txtModeloContable = new javax.swing.JTextField();
        lbLetras2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        lbLetras9 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JLabel();
        lbLetras3 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JLabel();
        lbBanco = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        lbEfectivo = new javax.swing.JLabel();
        lbCheque = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        txtCheque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEgresos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbLetras = new javax.swing.JLabel();
        txtTotalLetras = new javax.swing.JTextField();
        lbLetras8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBusProd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscTerceros2 = new javax.swing.JButton();
        btnBuscTerceros3 = new javax.swing.JButton();
        pnlInvisible = new javax.swing.JPanel();
        txtIdSistema = new javax.swing.JTextField();
        lbLetras10 = new javax.swing.JLabel();
        lbNoEgreso = new javax.swing.JLabel();
        jCheckBoxDS = new javax.swing.JCheckBox();
        lbFacturaNo3 = new javax.swing.JLabel();
        DS = new javax.swing.JLabel();

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

        pnlCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnlCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefono.setEnabled(false);
        txtTelefono.setName("Teléfono"); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        lbTelefono.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono.setText("Teléfono:");

        lbRazon.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbRazon.setText("Razón social:");

        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDireccion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDireccion.setEnabled(false);
        txtDireccion.setName("Dirección"); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });

        lbDireccion.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbDireccion.setText("Dirección:");

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("CC/Nit: *");
        lbNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNitKeyReleased(evt);
            }
        });

        txtRazon.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRazon.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRazon.setEnabled(false);
        txtRazon.setName("Razón social"); // NOI18N
        txtRazon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRazonKeyReleased(evt);
            }
        });

        txtNit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNit.setName("CC/NIT"); // NOI18N
        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNitKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });

        btnBuscTerceros.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscTerceros.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
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

        lbNumero3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNumero3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNumero3.setText("Impresión:");

        cmbTipo1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        cmbTipo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CARTA", "POS" }));
        cmbTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbRazon, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlClienteLayout.createSequentialGroup()
                                .addComponent(txtNit, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscTerceros, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addComponent(txtRazon)
                            .addComponent(txtDireccion)
                            .addGroup(pnlClienteLayout.createSequentialGroup()
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addComponent(lbNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscTerceros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRazon)
                    .addComponent(lbRazon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlValores.setBackground(new java.awt.Color(255, 255, 255));
        pnlValores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma de pago", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbLetras1.setBackground(new java.awt.Color(255, 255, 255));
        lbLetras1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbLetras1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbLetras1.setText("Tipo egreso:");
        lbLetras1.setOpaque(true);

        cmbTipo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "LOCAL", "GENERAL" }));
        cmbTipo.setName("Tipo"); // NOI18N

        lbModeloContable.setBackground(new java.awt.Color(255, 255, 255));
        lbModeloContable.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbModeloContable.setText("M. Contable:");
        lbModeloContable.setOpaque(true);

        txtModeloContable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtModeloContable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModeloContable.setName("combo"); // NOI18N
        txtModeloContable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloContableKeyReleased(evt);
            }
        });

        lbLetras2.setBackground(new java.awt.Color(255, 255, 255));
        lbLetras2.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        lbLetras2.setText("TOTAL");
        lbLetras2.setOpaque(true);

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtTotal.setText("0");
        txtTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtTotal.setOpaque(true);

        lbLetras9.setBackground(new java.awt.Color(255, 255, 255));
        lbLetras9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbLetras9.setText("SubTotal");
        lbLetras9.setOpaque(true);

        txtSubTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubTotal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSubTotal.setText("0");
        txtSubTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSubTotal.setOpaque(true);

        lbLetras3.setBackground(new java.awt.Color(255, 255, 255));
        lbLetras3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbLetras3.setText("IVA");
        lbLetras3.setOpaque(true);

        txtIVA.setBackground(new java.awt.Color(255, 255, 255));
        txtIVA.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIVA.setText("0");
        txtIVA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIVA.setOpaque(true);

        lbBanco.setBackground(new java.awt.Color(204, 204, 204));
        lbBanco.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbBanco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBanco.setText("Banco");
        lbBanco.setOpaque(true);

        txtBanco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBanco.setName("Banco"); // NOI18N
        txtBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBancoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBancoKeyTyped(evt);
            }
        });

        lbEfectivo.setBackground(new java.awt.Color(204, 204, 204));
        lbEfectivo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbEfectivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEfectivo.setText("Efectivo");
        lbEfectivo.setOpaque(true);

        lbCheque.setBackground(new java.awt.Color(204, 204, 204));
        lbCheque.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbCheque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCheque.setText("Cheque");
        lbCheque.setOpaque(true);

        txtEfectivo.setEditable(false);
        txtEfectivo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEfectivoActionPerformed(evt);
            }
        });

        txtCheque.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCheque.setName("Cheque"); // NOI18N
        txtCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChequeActionPerformed(evt);
            }
        });
        txtCheque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChequeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChequeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlValoresLayout = new javax.swing.GroupLayout(pnlValores);
        pnlValores.setLayout(pnlValoresLayout);
        pnlValoresLayout.setHorizontalGroup(
            pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresLayout.createSequentialGroup()
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlValoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbLetras2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbLetras1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbLetras9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
                    .addGroup(pnlValoresLayout.createSequentialGroup()
                        .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlValoresLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbLetras3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlValoresLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlValoresLayout.createSequentialGroup()
                        .addComponent(lbModeloContable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModeloContable, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlValoresLayout.createSequentialGroup()
                            .addComponent(lbCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlValoresLayout.createSequentialGroup()
                            .addComponent(lbBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlValoresLayout.createSequentialGroup()
                            .addComponent(lbEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        pnlValoresLayout.setVerticalGroup(
            pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlValoresLayout.createSequentialGroup()
                        .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbLetras1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(txtModeloContable)
                            .addComponent(lbModeloContable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlValoresLayout.createSequentialGroup()
                                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbLetras2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3)
                                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbLetras9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIVA, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(lbLetras3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlValoresLayout.createSequentialGroup()
                                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(pnlValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4))
                    .addComponent(jSeparator1)))
        );

        tblEgresos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblEgresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "CONCEPTO", "DESCRIPCIÓN", "SUBTOTAL", "IVA", "TOTAL", "FACTURA", "CODIGOINTERNO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEgresos.setComponentPopupMenu(jPopupMenu1);
        tblEgresos.setRowHeight(24);
        tblEgresos.getTableHeader().setReorderingAllowed(false);
        tblEgresos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblEgresosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblEgresosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tblEgresos);
        if (tblEgresos.getColumnModel().getColumnCount() > 0) {
            tblEgresos.getColumnModel().getColumn(0).setMinWidth(75);
            tblEgresos.getColumnModel().getColumn(0).setPreferredWidth(75);
            tblEgresos.getColumnModel().getColumn(0).setMaxWidth(75);
            tblEgresos.getColumnModel().getColumn(3).setMinWidth(100);
            tblEgresos.getColumnModel().getColumn(3).setPreferredWidth(130);
            tblEgresos.getColumnModel().getColumn(3).setMaxWidth(150);
            tblEgresos.getColumnModel().getColumn(4).setMinWidth(100);
            tblEgresos.getColumnModel().getColumn(4).setPreferredWidth(130);
            tblEgresos.getColumnModel().getColumn(4).setMaxWidth(150);
            tblEgresos.getColumnModel().getColumn(5).setMinWidth(100);
            tblEgresos.getColumnModel().getColumn(5).setPreferredWidth(130);
            tblEgresos.getColumnModel().getColumn(5).setMaxWidth(150);
            tblEgresos.getColumnModel().getColumn(6).setMinWidth(75);
            tblEgresos.getColumnModel().getColumn(6).setPreferredWidth(75);
            tblEgresos.getColumnModel().getColumn(6).setMaxWidth(75);
            tblEgresos.getColumnModel().getColumn(7).setMinWidth(0);
            tblEgresos.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblEgresos.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbLetras.setBackground(new java.awt.Color(255, 255, 255));
        lbLetras.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbLetras.setText("Total (en letras)");
        lbLetras.setOpaque(true);

        txtTotalLetras.setEditable(false);
        txtTotalLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalLetrasActionPerformed(evt);
            }
        });

        lbLetras8.setBackground(new java.awt.Color(255, 255, 255));
        lbLetras8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbLetras8.setText("Concepto:");
        lbLetras8.setOpaque(true);

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setName("combo"); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        btnBusProd.setBackground(new java.awt.Color(204, 204, 204));
        btnBusProd.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnBusProd.setForeground(new java.awt.Color(255, 255, 255));
        btnBusProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        btnBusProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBusProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusProd.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBusProd.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnBusProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbLetras8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBusProd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lbLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalLetras))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBusProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalLetras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLetras8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR  ");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
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

        btnBuscTerceros2.setBackground(new java.awt.Color(241, 148, 138));
        btnBuscTerceros2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnBuscTerceros2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png"))); // NOI18N
        btnBuscTerceros2.setText("ANULAR  ");
        btnBuscTerceros2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros2.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTerceros2ActionPerformed(evt);
            }
        });

        btnBuscTerceros3.setBackground(new java.awt.Color(247, 220, 111));
        btnBuscTerceros3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnBuscTerceros3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnBuscTerceros3.setText("REIMPRIMIR");
        btnBuscTerceros3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros3.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTerceros3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscTerceros3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscTerceros2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnBuscTerceros3)
                    .addComponent(btnBuscTerceros2))
                .addGap(5, 5, 5))
        );

        txtIdSistema.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIdSistema.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtIdSistema.setEnabled(false);
        txtIdSistema.setName("Teléfono"); // NOI18N
        txtIdSistema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdSistemaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdSistemaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlInvisibleLayout = new javax.swing.GroupLayout(pnlInvisible);
        pnlInvisible.setLayout(pnlInvisibleLayout);
        pnlInvisibleLayout.setHorizontalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdSistema)
                .addGap(554, 554, 554))
        );
        pnlInvisibleLayout.setVerticalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdSistema)
                .addContainerGap())
        );

        lbLetras10.setBackground(new java.awt.Color(255, 255, 255));
        lbLetras10.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbLetras10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLetras10.setText("Egreso No");
        lbLetras10.setOpaque(true);

        lbNoEgreso.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbNoEgreso.setForeground(new java.awt.Color(255, 0, 0));
        lbNoEgreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNoEgreso.setText("1");
        lbNoEgreso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBoxDS.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBoxDS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBoxDS.setText("es D. Sp");
        jCheckBoxDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDSActionPerformed(evt);
            }
        });

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
        DS.setAlignmentY(0.0F);
        DS.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlInvisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(pnlValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckBoxDS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNoEgreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbLetras10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(lbFacturaNo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(lbLetras10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbNoEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jCheckBoxDS)
                        .addGap(0, 0, 0)
                        .addComponent(lbFacturaNo3)
                        .addGap(0, 0, 0)
                        .addComponent(DS))
                    .addComponent(pnlValores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        scrFormulario.setViewportView(pnlFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrFormulario)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFormulario)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyTyped

    }//GEN-LAST:event_txtNitKeyTyped

    private void txtNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarCliente(txtNit.getText());
        } else if (!txtRazon.getText().equals("")) {
            txtRazon.setText("");
            txtIdSistema.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
        }
    }//GEN-LAST:event_txtNitKeyReleased

    private void txtRazonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtRazonKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased

    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased

    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChequeActionPerformed

    private void tblEgresosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEgresosKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int i = 3, fila = tblEgresos.getSelectedRow();
            BigDecimal subtotal, iva, total;
            subtotal = big.getBigDecimal("0");
            iva = big.getBigDecimal("0");
            total = big.getBigDecimal("0");

            if (tblEgresos.getSelectedColumn() == 2) {
                tblEgresos.editCellAt(fila, 3);
                tblEgresos.setColumnSelectionInterval(3, 3);
                tblEgresos.transferFocus();
            } else if (tblEgresos.getSelectedColumn() == 3) {
                tblEgresos.editCellAt(fila, 4);
                tblEgresos.setColumnSelectionInterval(4, 4);
                tblEgresos.transferFocus();
                i = 3;
            } else if (tblEgresos.getSelectedColumn() == 4) {
                tblEgresos.editCellAt(fila, 6);
                tblEgresos.setColumnSelectionInterval(6, 6);
                tblEgresos.transferFocus();
                i = 4;

            } else if (tblEgresos.getSelectedColumn() == 6) {
                txtCodigo.requestFocus();
            }
            try {
                tblEgresos.setValueAt(big.setMonedaExacta(big.getMoneda(((String) tblEgresos.getValueAt(fila, i)))), fila, i);
            } catch (NumberFormatException e) {
                tblEgresos.setValueAt(this.simbolo + " 0", tblEgresos.getSelectedRow(), i);
            }
            try {
                subtotal = big.getMoneda(tblEgresos.getValueAt(fila, 3).toString());
            } catch (Exception e) {
                Logs.error(e);
                tblEgresos.setValueAt(this.simbolo + " 0", tblEgresos.getSelectedRow(), 3);
            }

            try {
                iva = big.getMoneda(tblEgresos.getValueAt(fila, 4).toString());
            } catch (Exception e) {
                Logs.error(e);
                tblEgresos.setValueAt(this.simbolo + " 0", tblEgresos.getSelectedRow(), 4);
            }
            total = subtotal.add(iva);
            tblEgresos.setValueAt(big.setMonedaExacta(total), fila, 5);

            calcularValores();
        }
    }//GEN-LAST:event_tblEgresosKeyReleased

    private void txtEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEfectivoActionPerformed

    private void tblEgresosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEgresosKeyTyped

    }//GEN-LAST:event_tblEgresosKeyTyped

    private void txtChequeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChequeKeyReleased
        if (txtCheque.getText().equals("") || txtCheque.getText().equals(this.simbolo) || txtCheque.getText().equals(this.simbolo + " ")) {
            txtCheque.setText("0");
        }

        txtCheque.setText(big.setMoneda(big.getMoneda(txtCheque.getText())));
        calcularValores();
    }//GEN-LAST:event_txtChequeKeyReleased

    private void txtBancoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBancoKeyReleased
        if (txtBanco.getText().equals("") || txtBanco.getText().equals(this.simbolo) || txtBanco.getText().equals(this.simbolo + " ")) {
            txtBanco.setText("0");
        }

        txtBanco.setText(big.setMoneda(big.getMoneda(txtBanco.getText())));
        calcularValores();
    }//GEN-LAST:event_txtBancoKeyReleased

    private void txtChequeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChequeKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtChequeKeyTyped

    private void txtBancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBancoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtBancoKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        tblEgresos.removeEditor();

        try {
            int xyz = tblEgresos.getRowCount();
            if (xyz > 0) {
                for (int i = 0; i < xyz; i++) {
                    tblEgresos.setColumnSelectionInterval(0, 0);
                    tblEgresos.setRowSelectionInterval(i, i);

                    KeyEvent x = new KeyEvent(Barra, WIDTH, WIDTH, WIDTH, KeyEvent.VK_ENTER);
                    tblEgresosKeyReleased(x);
                }
            }
        } catch (Exception e) {
            Logs.error(e);
        }

        if (tblEgresos.getRowCount() == 0) {
            metodos.msgError(this, "No ha añadido ningun egreso");
        } else {
            Object[] campos = {txtNit, txtRazon, cmbTipo};
            String faltantes = metodos.camposVacios(campos);

            if (!faltantes.equals("")) {
                metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
                return;
            }

            if (!saltarPasos) {
                if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {
                    String dcSoporte="";
                    setConsecutivoDS("");
                    if (jCheckBoxDS.isSelected()) {
                        if(!generarDocSoporte()){
                          return;
                        }
                    }
                    guardar(getConsecutivoDS());
                }
            } else {
                guardar("");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private boolean  generarDocSoporte() {
        String numeroDocumentoSoporte = "";
        if (jCheckBoxDS.isSelected()) {
            numeroDocumentoSoporte = DS.getText();
        }

        if (jCheckBoxDS.isSelected()) {
            if (metodos.msgPregunta(null, "¿Desea Realizar un Documento Soporte?") != 0) {
                jCheckBoxDS.setSelected(false);
                numeroDocumentoSoporte = "";
                DS.setText("N/A");
            } else {
                Object[] datosDocElect = instancias.getSql().getResolucionTerminales("DS");
                if (datosDocElect.length == 0) {
                    metodos.msgAdvertenciaAjustado(null, "No Existe la Configuración para el Documento Soporte");
                    return false;
                } else {
                    long consecutivoRsol = Long.valueOf((String) datosDocElect[7]);
                    long consecInicioRsol = Long.valueOf((String) datosDocElect[5]);
                    long consecfinRsol = Long.valueOf((String) datosDocElect[6]);

                    if (!(consecutivoRsol >= consecInicioRsol && consecInicioRsol <= consecfinRsol)) {
                        metodos.msgAdvertenciaAjustado(null, "La Numeración Esta Fuera del Rango Permitido");
                        return false;
                    }

                    if (Objects.isNull(datosDocElect[4])) {
                        metodos.msgAdvertenciaAjustado(null, "El Prefijo es Obligatorio para el Documento Soporte");
                    }
                    System.err.println("metodosGenerales.fecha() " + metodosGenerales.fecha());
                    System.err.println(" metodos.sumarFecha(metodos.desdeDate2(getCalendarFromDateHum((String)datosDocElect[3])),0) " + metodos.sumarFecha(metodos.desdeDate2(getCalendarFromDateHum((String) datosDocElect[3])), 0));
                    long diasFaltantes = metodos.restarFecha(metodosGenerales.fecha(), metodos.sumarFecha(metodos.desdeDate2(getCalendarFromDateHum((String) datosDocElect[3])), 0));
                    System.err.println("diasFaltantes " + diasFaltantes);
                    if (diasFaltantes < 0) {
                        metodos.msgAdvertenciaAjustado(null, "Resolucion Vencida " + (String) datosDocElect[3]);
                        return false;
                    }
                    
                    if(diasFaltantes == 0){
                         metodos.msgAdvertenciaAjustado(null, "La Resolución del Documento Soporte Vence Hoy ");
                    }else if (diasFaltantes > 0 && diasFaltantes <= 4) {
                        metodos.msgAdvertenciaAjustado(null, "Resolución Documento Soporte esta Proximo a Vencer " + (String) datosDocElect[3]);
                    }
                    String mensaje = validacionProveedor().trim();
                    if (!mensaje.equals("")) {
                        metodos.msgAdvertenciaAjustado(null, mensaje);
                        return false;
                    }
                }
                if (setDocumentoSoporte(datosDocElect)) {
                    instancias.getSql().incrementarFacturaActualYDesbloquear("DS");
                    metodos.msgAdvertenciaAjustado(null, "Documento Soporte Generado Correctamente");
                    Gson gSon = new Gson();
                    try {
                        RespuestaServicioEnvioFacturas respuestaApi;
                        respuestaApi = gSon.fromJson(getRespuesta(), RespuestaServicioEnvioFacturas.class);
                        LogsFacturaApi(respuestaApi, numeroDocumentoSoporte);
                        return true;
                    } catch (Exception e1) {
                        setConsecutivoDS("");
                        instancias.getSql().desbloquearConsecutivosfactura();
                        Respuesta respuestaError = gSon.fromJson(getRespuesta(), Respuesta.class);
                        instancias.getSql().almacenarLogsServicioFacturacion("0", numeroDocumentoSoporte, "", "Error en el Servicio", "", respuestaError.getMensaje(), "1");
                        return true;
                    }
                } else {
                    setConsecutivoDS("");
                    instancias.getSql().desbloquearConsecutivosfactura();
                    metodos.msgAdvertenciaAjustado(null, "Error al generar el Documento Soporte");
                    return false;
                }
            }
        }
        return true;
    }
   
    
    private void guardar(String dcSoporte) {
        cancelarEgreso = false;
        if (instancias.getTipoImpresion() != null) {
            if (instancias.getTipoImpresion().equals("Pos")) {
                cmbTipo1.setSelectedIndex(1);
            } else {
                cmbTipo1.setSelectedIndex(0);
            }
        } else {
            cmbTipo1.setSelectedIndex(0);
        }

//        String cons =  instancias.getSql().getNumConsecutivo("EGR")[0].toString();
//        String factura = "EGR-" + cons;

        //PROCESO GUARDAR REGISTRO EN CAJA
        String estado = "PENDIENTE";
        if (cmbTipo.getSelectedIndex() == 2) {
            estado = "REALIZADO";
        }

        String egreso2 = "", prefijo = "";
        if (instancias.getIdEgreso() != null) {
            prefijo = instancias.getIdEgreso();
        }

//        egreso2 = "EGR-" + prefijo +cons;

        if (instancias.getUsuario().equals("ADMIN")) {
            if (cmbTipo.getSelectedItem().equals("GENERAL")) {
                if (metodos.msgPregunta(this, "¿Sacar dinero del banco?") == 0) {

                    if (tipoMovimiento.equals("")) {
                        tipoMovimiento = "movEgreso";
                    }

                    dlgMovimientosBanco movimiento = new dlgMovimientosBanco(null, true, "", "", BigDecimal.ZERO, "Salida", "EGRESO", big.getMoneda(txtTotal.getText()),
                            "EGRESO NÚM " + lbNoEgreso.getText() + "," + " CONCEPTO " + tblEgresos.getValueAt(0, 1) + ", " + "No.Factura " + tblEgresos.getValueAt(0, 6),
                            tipoMovimiento);
                    movimiento.setLocationRelativeTo(null);
                    movimiento.setVisible(true);
                }
            }
        }

        tipoMovimiento = "";

        if (cancelarEgreso) {
            return;
        }

        if (!consecutivoBanco.equals("")) {
            ingresoAsociado = consecutivoBanco;
        }
        
        if (!jCheckBoxDS.isSelected()) {
           dcSoporte=""; 
        }
        String cons =  instancias.getSql().getNumConsecutivo("EGR")[0].toString();
        String factura = "EGR-" + cons;
        egreso2 = "EGR-" + prefijo +cons;
        Object[] vector = {factura, txtNit.getText(), txtRazon.getText(), txtTelefono.getText(),
            txtDireccion.getText(), big.getMoneda(txtTotal.getText()), big.getMoneda(txtSubTotal.getText()), big.getMoneda(txtIVA.getText()),
            txtIdSistema.getText(), "", "", "", big.getMoneda(txtCheque.getText()),
            big.getMoneda(txtBanco.getText()), big.getMoneda(txtEfectivo.getText()), metodos.fechaConsulta(metodosGenerales.fecha()),
            factura.replace("EGR-", ""), instancias.getUsuario(), instancias.getTerminal(), estado, cmbTipo.getSelectedItem(), ingresoAsociado,
            egreso2, txtModeloContable.getText(),dcSoporte};

        ndEgreso nodo = metodos.llenarEgreso(vector);

        if (!instancias.getSql().agregarEgreso(nodo)) {

            boolean noPuedaGuardar = false;

            instancias.getSql().eliminarEgreso(factura);
            while (!noPuedaGuardar) {
                noPuedaGuardar = instancias.getSql().eliminarCodEgreso(factura);
            }

            metodos.msgError(this, "Hubo un problema al guardar el egreso");
            return;
        }

        //PROCESO GUARDAR VENTA
        for (int i = 0; i < tblEgresos.getRowCount(); i++) {
            String fact = "";
            if (tblEgresos.getValueAt(i, 6) != null) {
                fact = tblEgresos.getValueAt(i, 6).toString();
            }

            Object vectCods[] = {factura, tblEgresos.getValueAt(i, 7), tblEgresos.getValueAt(i, 2),
                big.getMoneda((String) tblEgresos.getValueAt(i, 5)), fact, tblEgresos.getValueAt(i, 0), big.getMoneda((String) tblEgresos.getValueAt(i, 3)), big.getMoneda((String) tblEgresos.getValueAt(i, 4))};

            ndEgresoCods nodoCods = metodos.llenarEgresoCods(vectCods);

            if (!instancias.getSql().agregarEgreso(nodoCods)) {
                boolean noPuedaGuardar = false;
                instancias.getSql().eliminarEgreso(factura);
                while (!noPuedaGuardar) {
                    noPuedaGuardar = instancias.getSql().eliminarCodEgreso(factura);
                }

                metodos.msgError(this, "Hubo un problema al guardar el egreso");
            }
        }

        //CAMBIAR CONSECUTIVO FACTURA
//        if (!instancias.getSql().aumentarConsecutivo("EGR", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("EGR")[0]) + 1)) {
//            metodos.msgError(this, "Hubo un problema al guardar en el consecutivo del egreso");
//        }

        lbNoEgreso.setText((String) instancias.getSql().getNumConsecutivoActual("EGR")[0]);

        if (!saltarPasos) {
            metodos.msgExito(this, "Egreso exitoso");
        }

        String tipo = "";
        if (cmbTipo1.getSelectedIndex() == 1) {
            tipo = "Pos";
        }

        if (!saltarPasos) {
            if (metodos.msgPregunta(this, "¿Desea imprimir?") == 0) {
                instancias.getReporte().ver_Egreso(factura, instancias.getInformacionEmpresa(), txtTotalLetras.getText(), true, tipo);
            } else {
                instancias.getReporte().ver_Egreso(factura, instancias.getInformacionEmpresa(), txtTotalLetras.getText(), false, tipo);
            }
        } else {
            instancias.getReporte().ver_Egreso(factura, instancias.getInformacionEmpresa(), txtTotalLetras.getText(), false, tipo);
        }

        saltarPasos = false;
        btnLimpiarActionPerformed(null);
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        for (int x = 0; x < pnlCliente.getComponentCount(); x++) {
            if (pnlCliente.getComponent(x) instanceof JTextField) {
                JTextField textField = (JTextField) pnlCliente.getComponent(x);
                textField.setText("");
                textField.setEditable(true);
            }
        }

        for (int x = 0; x < pnlValores.getComponentCount(); x++) {
            if (pnlValores.getComponent(x) instanceof JTextField) {
                JTextField textField = (JTextField) pnlValores.getComponent(x);
                textField.setText("");
            }
        }
        ConsecutivoDocSoporte();
        consecutivoBanco = "";

        txtCheque.setText(this.simbolo + " 0");
        txtBanco.setText(this.simbolo + " 0");
        txtEfectivo.setText(this.simbolo + " 0");
        txtSubTotal.setText(this.simbolo + " 0");
        txtIVA.setText(this.simbolo + " 0");
        txtTotal.setText(this.simbolo + " 0");
        ingresoAsociado = "";

        DefaultTableModel x = (DefaultTableModel) tblEgresos.getModel();
        int i, j = tblEgresos.getRowCount();

        for (i = 0; i < j; i++) {
            x.removeRow(0);
        }

        cmbTipo.setSelectedIndex(0);
        txtTotalLetras.setText("");

        String prefijo = "";
        if (instancias.getIdEgreso() != null) {
            prefijo = instancias.getIdEgreso();
        }
        lbNoEgreso.setText(prefijo + (String) instancias.getSql().getNumConsecutivoActual("EGR")[0]);

        if (instancias.getConfiguraciones().isPuc()) {
            Object[] informacion = instancias.getSql().getDatosPrefijosYModelos();
            if (null != informacion[10]) {
                txtModeloContable.setText(informacion[10].toString());
            }
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscTercerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTercerosActionPerformed
        ventanaTerceros("");
    }//GEN-LAST:event_btnBuscTercerosActionPerformed

    private void popBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popBorrarActionPerformed

        if (tblEgresos.getSelectedRow() > -1) {
            int fila = tblEgresos.getSelectedRow();

            DefaultTableModel modelo = (DefaultTableModel) tblEgresos.getModel();
            modelo.removeRow(fila);

            calcularValores();
        } else {
            metodos.msgAdvertencia(this, "Seleccione un producto");
        }
    }//GEN-LAST:event_popBorrarActionPerformed

    private void btnBuscTerceros3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTerceros3ActionPerformed
        String consecutivo = "EGR-" + metodos.msgIngresarEnter(this, "Documento a reimprimir");

        if (consecutivo.equals("EGR-")) {
            return;
        }

        boolean anulado = false;
        try {
            anulado = instancias.getSql().getDocumentoAnulado("bdEgreso", "Where egreso ='" + consecutivo + "' ");
        } catch (Exception e) {
            Logs.error(e);
            metodos.msgError(this, "El egreso no existe");
            return;
        }

        if (anulado) {
            metodos.msgError(this, "El egreso ya esta anulado");
            return;
        }

        ndEgreso nodo = instancias.getSql().getDatosEgreso(consecutivo);

        if (nodo.getId() == null) {
            metodos.msgError(this, "Este egreso no existe.");
            return;
        }

        String tipo = "";
        if (cmbTipo1.getSelectedIndex() == 1) {
            tipo = "Pos";
        }

        instancias.getReporte().ver_Egreso(consecutivo, instancias.getInformacionEmpresa(), convertirNumeroALetras.Convertir(nodo.getTotal()), false, tipo);
    }//GEN-LAST:event_btnBuscTerceros3ActionPerformed
                
    private void btnBuscTerceros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTerceros2ActionPerformed
        String consecutivo = "EGR-" + metodos.msgIngresarEnter(this, "Documento a anular");

        if (consecutivo.equals("EGR-")) {
            return;
        }
           
        boolean anulado = false;
        try {
            anulado = instancias.getSql().getDocumentoAnulado("bdEgreso", "Where egreso = '" + consecutivo + "' ");
        } catch (Exception e) {
            Logs.error(e);
            metodos.msgError(this, "El egreso no existe");
            return;
        }

        if (anulado) {
            metodos.msgError(this, "El egreso ya esta anulado");
            return;
        }
        
         boolean anuladoDoc = false;
          try {
            anuladoDoc = instancias.getSql().getDocumentoDocSoporte("bdEgreso", "Where egreso = '" + consecutivo + "' ");
        } catch (Exception e) {
        }
          
        if (anuladoDoc) {
            metodos.msgError(this, "No se puede Eliminar cuando existe un Documento Soporte asignado");
            return;
        }

        String pago = "";

        try {
            pago = instancias.getSql().getIngresoAsociado(consecutivo);
        } catch (Exception e) {
            Logs.error(e);
        }

        String mensaje = "";
        if (!pago.equals("")) {
            mensaje = "Se anulará tambien el " + pago;
        } else {
            mensaje = "¿Anular egreso?";
        }

        metodos.msgAdvertenciaAjustado(this, mensaje);

        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {

            if (!instancias.getSql().anularEgreso(consecutivo)) {
                metodos.msgError(this, "Hubo un problema al anular el egreso");
                return;
            }

            if (pago.contains("MOVBANC")) {

                Object[][] mov = instancias.getSql().getMovimientoBanco(pago);

                String monto = "0";
                try {
                    monto = instancias.getSql().montoBanco(mov[0][3].toString());
                } catch (Exception e) {
                    Logs.error(e);
                }
                monto = big.setMoneda(big.getMoneda(monto));

                String tipo = mov[0][1].toString();
                BigDecimal total = BigDecimal.ZERO;

                if (tipo.equals("Entrada")) {
                    tipo = "Salida";
                    total = big.getMoneda(monto).subtract(big.getBigDecimal(mov[0][0]));
                } else if (tipo.equals("Salida")) {
                    tipo = "Entrada";
                    total = big.getMoneda(monto).add(big.getBigDecimal(mov[0][0]));
                }

                String consMov = instancias.getSql().getNumConsecutivo("MOVBANC")[0].toString();
                String consecutivoMovimiento = "MOVBANC-" + consMov;
                Object[] vector = {consecutivoMovimiento, mov[0][2], mov[0][3], "ANULACIÓN DEL MOVIMIENTO DEL BANCO '" + pago + "' ", instancias.getUsuario(),
                    metodos.fechaConsulta(metodosGenerales.fecha()), tipo, "", metodosGenerales.hora(), ""};

                Object[] vector1 = {big.getMoneda(monto), big.getBigDecimal(mov[0][0]), big.getMoneda(big.setMoneda(total))};

                if (!instancias.getSql().agregarMovimientoBanco(vector, vector1)) {
                    metodos.msgError(null, "Hubo un problema al guardar el movimiento");
                    return;
                }

                instancias.getSql().modificarMontoBanco(big.getMoneda(big.setMoneda(total)), mov[0][3].toString());
//                instancias.getSql().aumentarConsecutivo("MOVBANC", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("MOVBANC")[0]) + 1);

            } else if (pago.contains("PAGO")) {
                String estadoCuenta, id;
                try {
                    id = instancias.getSql().getIdCxp("Where recibo ='" + pago + "' ");
                    estadoCuenta = instancias.getSql().getEstadoPago("Where ingreso = '" + id + "' and tipo <> 'PAGO' ");

                    if (!estadoCuenta.equals("PEND")) {
                        instancias.getSql().modificarRegistroCxp(" where ingreso = '" + id + "' and tipo <> 'PAGO' ");
                    }
                    instancias.getSql().modificarRegistroCxp1(pago, "ANULADO");
                } catch (Exception e) {
                    Logs.error(e);
                }
            } else {
                if (!instancias.getSql().anularDocumento(pago, "bdIngreso")) {
                    metodos.msgError(null, "Hubo un problema al anular la compra");
                    return;
                }

                instancias.getSql().eliminarPonderadoIngreso(" bdPonderado ", pago);
//                instancias.getSql().eliminarPonderadoIngreso(" bdUltimoPonderado ", pago);

                if (!instancias.getSql().modificarRegistroCxp(pago, "ANULADA")) {
                    metodos.msgError(null, "Hubo un problema al anular la Cxp");
                    return;
                }

                Object[][] Productos = instancias.getSql().getProductosCompra(pago);
                for (Object[] Producto : Productos) {

                    String idPonderado = instancias.getSql().getConsecutivoPonderado(Producto[0].toString());
                    Object[] ponderados = instancias.getSql().getUltimoPonderado1(idPonderado);

                    String ingreso = "";
                    try {
                        ingreso = ponderados[9].toString();
                    } catch (Exception e) {
                        Logs.error(e);
                    }

                    if (!instancias.getSql().modificarPonderado(ponderados[8].toString(), Producto[0].toString(),
                            big.getBigDecimal(ponderados[1].toString()), String.valueOf(ponderados[2]), ponderados[3].toString(),
                            big.getBigDecimal(ponderados[4]), String.valueOf(ponderados[5]), instancias.getUsuario(),
                            big.getBigDecimal(ponderados[7]), ingreso)) {
                        metodos.msgError(null, "Error al modificar ponderado");
                    }

                    ndProducto producto = instancias.getSql().getDatosProducto(Producto[0].toString(), "bdProductos");
                    double cantidad;
                    double inventario;
                    double fisicoInventario;

                    try {
                        cantidad = Double.parseDouble(producto.getCompras().replace(",", "."));
                    } catch (Exception e) {
                        Logs.error(e);
                        cantidad = 0;
                    }

                    try {
                        inventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    } catch (Exception e) {
                        Logs.error(e);
                        inventario = 0;
                    }

                    try {
                        fisicoInventario = Double.parseDouble(producto.getFisicoInventario().replace(",", "."));
                    } catch (Exception e) {
                        Logs.error(e);
                        fisicoInventario = Double.parseDouble(producto.getInventario().replace(",", "."));
                    }

                    double inv = Double.parseDouble(Producto[1].toString().replace(",", "."));

                    inventario = inventario - inv;
                    fisicoInventario = fisicoInventario - inv;
                    double total = cantidad - inv;

                    String total1 = String.valueOf(df.format(total)).replace(".", ",");
                    String inventario1 = String.valueOf(df.format(inventario)).replace(".", ",");
                    String fisicoInventario1 = String.valueOf(df.format(fisicoInventario)).replace(".", ",");

                    instancias.getSql().modificarInventario("compras", total1, Producto[0].toString(), "bdProductos");
                    instancias.getSql().modificarInventario("inventario", inventario1, Producto[0].toString(), "bdProductos");
                    instancias.getSql().modificarInventario("fisicoInventario", fisicoInventario1, Producto[0].toString(), "bdProductos");

                    if (instancias.getConfiguraciones().isProductosSerial()) {
                        instancias.getSql().anularCompraDetalladoInventario(consecutivo);
                    }
                }
            }

//                if (banco.length > 0) {
//
//                    Object[] vector = {banco[0][0], banco[0][1], "Anulación del egreso " + idEgreso, instancias.getUsuario(), metodosGenerales.fechaHora(), "Entrada", ""};
//                    Object[] vector1 = {big.getMoneda(banco[0][2].toString()), big.getMoneda(txtValor.getText()), big.getMoneda(txtTotal.getText())};
//
//                    if (!instancias.getSql().agregarMovimientoBanco(vector, vector1)) {
//                        metodos.msgError(null, "Hubo un problema al guardar el movimiento");
//                        return;
//                    } else {
//                        metodos.msgExito(null, "Movimiento registrado con exito");
//                        instancias.getSql().modificarMontoBanco(big.getMoneda(txtTotal.getText()), banco[0][1].toString());
//                        instancias.getBancos().refrescarDatos();
//                        this.dispose();
//                    }
//                }
            if (pago.equals("")) {
                metodos.msgExito(this, "Egreso anulado con éxito");
            } else {
                if (pago.contains("MOVBANC")) {
                    metodos.msgExito(this, "Mov.Banco y pago anulado con éxito");
                } else if (pago.contains("PAGO")) {
                    metodos.msgExito(this, "Egreso y pago anulado con éxito");
                } else {
                    metodos.msgExito(this, "Egreso y compra anulado con éxito");
                }
            }
        }
    }//GEN-LAST:event_btnBuscTerceros2ActionPerformed

    private void txtTotalLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalLetrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalLetrasActionPerformed

    private void lbNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNitKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNit.requestFocus();
        }
    }//GEN-LAST:event_lbNitKeyReleased

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained

    }//GEN-LAST:event_txtCodigoFocusGained

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            Object[][] datos = instancias.getSql().getDatosCodsEgreso(txtCodigo.getText());

            if (datos.length > 0) {

//            Object[][] codigos = instancias.getSql().getCodsEgresos();
//        for (int i = 0; i < codigos.length; i++) {
//            cmbConcepto.addItem(codigos[i][1]);
//            this.codigos.put(codigos[i][1].toString(), new String[]{codigos[i][0].toString(), codigos[i][2].toString()});
//        }
                Object[] fila = {datos[0][1].toString(), datos[0][2].toString(), "", this.simbolo + " 0", this.simbolo + " 0", this.simbolo + " 0", "", datos[0][0].toString()};

                DefaultTableModel modelo = (DefaultTableModel) tblEgresos.getModel();
                modelo.addRow(fila);

                tblEgresos.setColumnSelectionInterval(2, 2);
                tblEgresos.setRowSelectionInterval(tblEgresos.getRowCount() - 1, tblEgresos.getRowCount() - 1);
                tblEgresos.editCellAt(tblEgresos.getRowCount() - 1, 2);
                tblEgresos.transferFocus();
                txtCodigo.setText("");
            } else {
                ventanaEgresos(txtCodigo.getText());
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            btnGuardar.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void btnBusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProdActionPerformed
        ventanaEgresos(txtCodigo.getText());
    }//GEN-LAST:event_btnBusProdActionPerformed

    private void cmbTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipo1ActionPerformed

    private void txtIdSistemaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSistemaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSistemaKeyReleased

    private void txtIdSistemaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSistemaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSistemaKeyTyped

    private void txtModeloContableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloContableKeyReleased
        if (txtModeloContable.getText().length() > 8) {
            txtModeloContable.setText(txtModeloContable.getText().substring(0, 8));
        }
    }//GEN-LAST:event_txtModeloContableKeyReleased

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
    
    public void limpiar() {
        btnLimpiarActionPerformed(null);
    }

    public void ventanaEgresos(String nit) {
        buscEgresos buscar = new buscEgresos(instancias.getMenu(), rootPaneCheckingEnabled);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscarEgresos(buscar);
        instancias.setCampoActual(txtCodigo);
        txtCodigo.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void cargarEgreso(String nit, BigDecimal total, String factura, String codEgreso, String concepto, String tipo, String ingresoAsociado,
            BigDecimal iva, BigDecimal subtotal, BigDecimal efectivo, BigDecimal tarjeta, BigDecimal cheque, BigDecimal rtf, BigDecimal rtIva, String desde) {

        if (tipo.equals("GENERAL")) {
            cmbTipo.setSelectedIndex(2);
        } else {
            cmbTipo.setSelectedIndex(1);
        }

        txtNit.setText(nit);

        txtCheque.setText(big.setMonedaExacta(cheque));
        txtBanco.setText(big.setMonedaExacta(tarjeta));
        txtEfectivo.setText(big.setMonedaExacta(efectivo));

        cargarCliente(txtNit.getText());
        this.ingresoAsociado = ingresoAsociado;
        Object dato[] = instancias.getSql().getInfoCodEgreso(codEgreso);

        Object[] fila = {dato[2].toString(), dato[1].toString(), concepto, big.setMoneda(subtotal), big.setMoneda(iva),
            big.setMoneda(total), factura, dato[0].toString()};

        DefaultTableModel modelo = (DefaultTableModel) tblEgresos.getModel();
        modelo.addRow(fila);
        calcularValores();

        if (desde.equals("registrandoCompra")) {
            tipoMovimiento = "movCompra";
        } else if (desde.equals("registrandoPago")) {
            tipoMovimiento = "movPago";
        }

        guardar("");
    }

    public void desdeLavadero(String nit, String valor, String factura, String codEgreso, String concepto, String ingresoAsociado, String tipo) {

        if (tipo.equals("GENERAL")) {
            cmbTipo.setSelectedIndex(2);
        } else {
            cmbTipo.setSelectedIndex(1);
        }

        txtNit.setText(nit);
        cargarCliente(txtNit.getText());

        this.ingresoAsociado = ingresoAsociado;
        Object dato[] = instancias.getSql().getInfoCodEgreso(codEgreso);

        Object[] fila = {dato[2].toString(), dato[1].toString(), concepto, valor, this.simbolo + " 0", valor, factura, dato[0].toString()};

        DefaultTableModel modelo = (DefaultTableModel) tblEgresos.getModel();
        modelo.addRow(fila);
        calcularValores();

        guardar("");
    }

    public void calcularValores() {

        BigDecimal subtotal = big.getBigDecimal("0");
        BigDecimal iva = big.getBigDecimal("0");
        BigDecimal total = big.getBigDecimal("0");

        for (int i = 0; i < tblEgresos.getRowCount(); i++) {
            subtotal = subtotal.add(big.getMoneda(((String) tblEgresos.getValueAt(i, 3))));
            iva = iva.add(big.getMoneda(((String) tblEgresos.getValueAt(i, 4))));
            total = total.add(big.getMoneda(((String) tblEgresos.getValueAt(i, 5))));
        }

        txtSubTotal.setText(big.setMoneda(subtotal));
        txtIVA.setText(big.setMoneda(iva));
        txtTotal.setText(big.setMoneda(total));

        total = (total.subtract(big.getMoneda(txtBanco.getText()))).subtract(big.getMoneda(txtCheque.getText()));

        int res = total.compareTo(big.getBigDecimal("0"));

        if (res == 1) {
            txtEfectivo.setText(big.setMoneda(total));
        } else {
            txtEfectivo.setText(this.simbolo + " 0");
        }

        txtTotalLetras.setText(convertirNumeroALetras.Convertir(big.getMoneda(txtTotal.getText()).toString()));
    }

    public void cargarCliente(String nit) {

        ndTercero nodo = instancias.getSql().getDatosTercero(nit);
//            ndProveedor nodPro = instancias.getSql().getDatosProveedor(nit);

        if (nodo.getId() != null) {

            if (nodo.isActivo()) {
                metodos.msgError(this, "Este cliente esta inactivado");
                lbNit.requestFocus();
                return;
            }

            txtIdSistema.setText(nodo.getIdSistema());
            txtRazon.setText(nodo.getNombre());
            txtTelefono.setText(nodo.getTelefono());
            txtDireccion.setText(nodo.getDireccion());
            txtRazon.setEditable(false);
            txtTelefono.setEditable(false);
            txtDireccion.setEditable(false);
            return;
        }
//            else if (nodPro.getId() != null) {
//                if (nodPro.isActivo()) {
//                    metodos.msgError(this, "Este cliente esta inactivado");
//                    return;
//                }
//                txtRazon.setText(nodPro.getNombre());
//                txtTelefono.setText(nodPro.getTelefono());
//                txtDireccion.setText(nodPro.getDireccion());
//                txtRazon.setEditable(false);
//                txtTelefono.setEditable(false);
//                txtDireccion.setEditable(false);
//                return;
//            }

        txtRazon.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtRazon.setEditable(true);
        txtTelefono.setEditable(true);
        txtDireccion.setEditable(true);

        ventanaTerceros("");

    }

    public void ventanaTerceros(String nit) {
        buscClientes buscar = new buscClientes(instancias.getMenu(), rootPaneCheckingEnabled, false, null, "");
        buscar.setOpc("egreso");
        buscar.setLocationRelativeTo(null);
        instancias.setBusClientes(buscar);
        instancias.setCampoActual(txtNit);
        txtNit.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
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
        String tipoIdentificacionAdquiriente = metodosGenerales.getTipoDocumentoEquivalente(nodoTerc.getTipo());
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
//        if (Double.valueOf(txtDiasPlazo.getText()) > 0) {
//            formaPago = "CREDITO";
//            tipoPago = "CREDITO_ACH";
//            fechaVencimientoPago = metodos.fecha4(metodos.sumarFecha(txtFechaFactura.getText(), Integer.parseInt(txtDiasPlazo.getText())));
//        } else {
            formaPago = "CONTADO";
            tipoPago = "EFECTIVO";
            fechaVencimientoPago = fechaVencimiento;
//        }
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
        for (int i = 0; i < tblEgresos.getRowCount(); i++) {
        for (int j = 0; j < tblEgresos.getColumnCount(); j++) {
            System.err.println(i+") "+j+") "+ tblEgresos.getValueAt(i, j));
        }
        

                JsonObject detalle = new JsonObject();
                double impuestos=0;                
                double cargos=0;
                double descuentos=0;
                JsonArray impuestosRetenciones = new JsonArray();
                JsonArray descuentosArray = new JsonArray();
                JsonObject impuestosRetencionesIva = new JsonObject();
                JsonObject impuestosRetencionesReteIva = new JsonObject();
                JsonObject impuestosRetencionesInc = new JsonObject();
                valorBaseImponible +=big.getMonedaToDouble(tblEgresos.getValueAt(i,3).toString());
               
                if (big.getMonedaToDouble(tblEgresos.getValueAt(i,4).toString()) > 0) {
                    JsonArray arraySubTotalesIva = new JsonArray();
                    impuestosRetencionesIva.addProperty("valorTotal",metodos.formatVal(big.getMonedaToDouble(tblEgresos.getValueAt(i,5).toString())));
                    JsonObject subTotal = new JsonObject();
                    subTotal.addProperty("valorBase", metodos.formatVal(big.getMonedaToDouble(tblEgresos.getValueAt(i,3).toString()))); 
                    double valorImpuestoRetencion =  big.getMonedaToDouble(tblEgresos.getValueAt(i,4).toString());
                    impuestos+=valorImpuestoRetencion;
                    double porcentaje =  (((big.getMonedaToDouble(tblEgresos.getValueAt(i,5).toString()))/big.getMonedaToDouble(tblEgresos.getValueAt(i,3).toString()))*100)-100;
                    subTotal.addProperty("valorImpuestoRetencion", metodos.formatVal(valorImpuestoRetencion)); 
                    
                    subTotal.addProperty("porcentaje", metodos.formatVal(porcentaje));
                    subTotal.addProperty("tributo", "IVA");
                    arraySubTotalesIva.add(subTotal);
                    impuestosRetencionesIva.add("subtotales", arraySubTotalesIva);
                    impuestosRetenciones.add(impuestosRetencionesIva);
                    impuestosRetencionesTotalesIva.add(subTotal);
                    
                }                
                                
//                if (big.formatDouble(big.getBigDecimal(tblEgresos.getValueAt(i, 8))) > 0) {                    
////                      double valorImpuestoRetencion =  big.getMonedaToDouble(tblEgresos.getValueAt(i,9).toString().toString());
////                      impuestosNacionalConsumo+=valorImpuestoRetencion;
//                } 
                
//                if (big.formatDouble(big.getBigDecimal(tblEgresos.getValueAt(i, 5))) > 0) {
//                    JsonObject descuento= new JsonObject();
//                    descuento.addProperty("tipo", "" + false);
//                    descuento.addProperty("codigoDescuento","DESCUENTO_NO_CONDICIONADO");
//                    descuento.addProperty("razon","DESCUENTO_GENERAL");
//                    descuento.addProperty("porcentaje",metodos.formatVal(big.formatDouble(big.getBigDecimal(tblEgresos.getValueAt(i, 5)))));
//                    descuentos+=big.getMonedaToDouble(tblEgresos.getValueAt(i,6).toString().toString());
//                    descuento.addProperty("valor",metodos.formatVal(big.getMonedaToDouble(tblEgresos.getValueAt(i,6).toString())));
//                    descuento.addProperty("valorBase",metodos.formatVal(big.getMonedaToDouble(tblEgresos.getValueAt(i,2).toString())*big.getMonedaToDouble(tblEgresos.getValueAt(i,3).toString().replace(".", ",")))); 
//                    cargosDescuentosTotal.add(descuento);
//                    descuentosArray.add(descuento);
//                }
                             
            //0) 0) 1
//0) 1) PAGOS PROVEEDORES
//0) 2) jardinero
//0) 3) $ 20.000
//0) 4) $ 0
//0) 5) $ 20.000
//0) 6) 
//0) 7) 1
            detalle.addProperty("descripcionArticulo", "" + tblEgresos.getValueAt(i,1));
            detalle.addProperty("unidadMedida", "UNO");
            detalle.addProperty("nombreMarca", "" + "");
            detalle.addProperty("nombreModelo", "" + "");
            detalle.addProperty("codigoArticulo", "" + tblEgresos.getValueAt(i,0));
            detalle.addProperty("precioUnitario", metodos.formatVal(big.getMonedaToDouble(tblEgresos.getValueAt(i,3).toString())));
            detalle.addProperty("valorTotalImpuestosRetenciones",metodos.formatVal(impuestos));
            detalle.addProperty("valorTotalArticulo", metodos.formatVal(big.getMonedaToDouble(tblEgresos.getValueAt(i,3).toString())));
            detalle.addProperty("cantidad","1");
            valorBruto +=(big.getMonedaToDouble(tblEgresos.getValueAt(i,3).toString()));
            detalle.addProperty("valorTotalBruto", metodos.formatVal((big.getMonedaToDouble(tblEgresos.getValueAt(i,3).toString()))));
            
            JsonObject periodoFactura = new JsonObject();
            periodoFactura.addProperty("fechaInicio", fechaEmisionPeriodo);
            periodoFactura.addProperty("codigoGeneracion", "POR_OPERACION");
            detalle.add("periodoFactura", periodoFactura);
            detalle.add("impuestosRetenciones",impuestosRetenciones);
            detalle.add("cargosDescuentos",descuentosArray);
            detalleTodos.add(detalle);
        }    
        adquiriente.add("detalles", detalleTodos);
        adquiriente.addProperty("customTotalUnidades", tblEgresos.getRowCount());
        
        double porcentajeIca =0;
        double porcentajeIva =0;
        double porcentajeConsumo =0;
        double dsPorcentajeReteFuente =0;
        double dsRetencionFuente =0;
        double dsPorcentajeReteIva = 0;
        double dsRetencionIva = 0;// big.getMonedaToDouble(txtRiva.getText());
        double dsPorcentajeReteIca =0;
        double dsRetencionIca =0;
        double dsDescuento =0;
        
        double descuentoTotal = 0;//big.getMonedaToDouble(txtTotalDescuentos.getText());
        double cargoTotal =0;
        
        double valorTotalIva = big.getMonedaToDouble(txtIVA.getText());
        double valorTotalReIva = 0;//big.getMonedaToDouble(txtRiva.getText());
        double valorTotalIca =0;
        double valorTotalImpuestoConsumo = 0;
        double valorTotalImpuestoNacionalConsumo = 0;//big.getMonedaToDouble(txtTotalImpoconsumo.getText());
        double valorOtrosImpuestos =0;
        //valorBruto=valorBruto-descuentoTotal;
        double valorBrutoMasTributos = big.formatDouble(valorBruto + valorTotalIva + valorTotalIca + valorTotalImpuestoConsumo + valorTotalImpuestoNacionalConsumo);        
        double valorNeto = big.formatDouble((valorBrutoMasTributos) - descuentoTotal);
        
        /*DETALLE DE IMPUESTOS*/
        
        if (valorTotalReIva > 0) { 
//            JsonObject detalleReIva = new JsonObject();
//            JsonObject subTotal = new JsonObject();
//            subTotal.addProperty("valorBase", metodos.formatVal(valorTotalIva));                    
//            subTotal.addProperty("valorImpuestoRetencion", metodos.formatVal(valorTotalReIva));                    
//            subTotal.addProperty("porcentaje", metodos.formatVal(15));
//            subTotal.addProperty("tributo", "RETE_IVA");
//            impuestosRetencionesTotalesReIva.add(subTotal);
//            detalleReIva.addProperty("valorTotal", metodos.formatVal(valorTotalReIva));
//            detalleReIva.add("subtotales", impuestosRetencionesTotalesReIva);
//            impuestosRetencionesTotal.add(detalleReIva);
//            adquiriente.addProperty("dsPorcentajeReteIva",metodos.formatVal(15));
//            adquiriente.addProperty("dsRetencionIva",metodos.formatVal(valorTotalReIva));
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
                
        adquiriente.addProperty("dsObservacion", "");
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
        setConsecutivoDS(consecutivo("DS"));
        adquiriente.addProperty("dsNumeroFactura",getConsecutivoDS());
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
//    public void ventanaProveedores(String nit) {
//        buscProveedores buscar = new buscProveedores(instancias.getMenu(), rootPaneCheckingEnabled);
//        buscar.setLocationRelativeTo(null);
//        instancias.setBusProveedores(buscar);
//        instancias.setCampoActual(txtNit);
//        txtNit.requestFocus();
//        buscar.noEncontrado(nit);
//        buscar.show();
//    }
//    public void actualizarConceptos() {
//        cmbConcepto.removeAllItems();
//        this.codigos = new TreeMap();
//        Object[][] codigos = instancias.getSql().getCodsEgresos();
//
//        for (int i = 0; i < codigos.length; i++) {
//            cmbConcepto.addItem(codigos[i][1]);
//            this.codigos.put(codigos[i][1].toString(), new String[]{codigos[i][0].toString(), codigos[i][2].toString()});
//        }
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DS;
    private javax.swing.JButton btnBusProd;
    private javax.swing.JButton btnBuscTerceros;
    private javax.swing.JButton btnBuscTerceros2;
    private javax.swing.JButton btnBuscTerceros3;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JComboBox cmbTipo1;
    private javax.swing.JCheckBox jCheckBoxDS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBanco;
    private javax.swing.JLabel lbCheque;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbEfectivo;
    private javax.swing.JLabel lbFacturaNo3;
    private javax.swing.JLabel lbLetras;
    private javax.swing.JLabel lbLetras1;
    private javax.swing.JLabel lbLetras10;
    private javax.swing.JLabel lbLetras2;
    private javax.swing.JLabel lbLetras3;
    private javax.swing.JLabel lbLetras8;
    private javax.swing.JLabel lbLetras9;
    private javax.swing.JLabel lbModeloContable;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNoEgreso;
    private javax.swing.JLabel lbNumero3;
    private javax.swing.JLabel lbRazon;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInvisible;
    private javax.swing.JPanel pnlValores;
    private javax.swing.JMenuItem popBorrar;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTable tblEgresos;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCheque;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JLabel txtIVA;
    private javax.swing.JTextField txtIdSistema;
    private javax.swing.JTextField txtModeloContable;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtRazon;
    private javax.swing.JLabel txtSubTotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JTextField txtTotalLetras;
    // End of variables declaration//GEN-END:variables
}
