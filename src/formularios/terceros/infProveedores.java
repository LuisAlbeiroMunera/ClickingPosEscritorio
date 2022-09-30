package formularios.terceros;

import clases.ImagePreviewPanel;
import clases.Instancias;
import clases.big;
import clases.metodosGenerales;
import clases.terceros.ndTercero;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import logs.Logs;

public class infProveedores extends javax.swing.JInternalFrame {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    public infProveedores() {

        initComponents();

        lbInfoObligatorios.setText(metodosGenerales.convertToMultiline("Los campos marcados (*) son obligatorios."));

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        instancias = Instancias.getInstancias();
        btnActualizar.setEnabled(false);
        btnImagen.setEnabled(false);
        btnProductosAsignados.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);

        pnlInvisible.setVisible(false);

        String consecutivo = "";
        int num = Integer.parseInt(instancias.getSql().getNumConsecutivoActual("TERCERO")[0].toString());
        consecutivo = String.valueOf(num);
        for (int i = 0; i < 8 - String.valueOf(num).length(); i++) {
            consecutivo = "0" + consecutivo;
        }
        txtIdSistema.setText("TERC-" + consecutivo);

        pnlFormulario.registerKeyboardAction(accion("guardar"), "guardar", KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("limpiar"), "limpiar", KeyStroke.getKeyStroke(KeyEvent.VK_L, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("terceros"), "terceros", KeyStroke.getKeyStroke(KeyEvent.VK_T, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("modificar"), "modificar", KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        consultaDepto();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscTerceros = new javax.swing.JButton();
        lbInfoObligatorios = new javax.swing.JLabel();
        btnProductosAsignados = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbNit = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbNit1 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        lbRazon = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbTelefono1 = new javax.swing.JLabel();
        txtpNombre = new javax.swing.JTextField();
        lbCelular1 = new javax.swing.JLabel();
        txtsNombre = new javax.swing.JTextField();
        lbDireccion1 = new javax.swing.JLabel();
        txtpApellido = new javax.swing.JTextField();
        lbEmail1 = new javax.swing.JLabel();
        txtsApellido = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lbDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtDigito = new javax.swing.JTextField();
        lbNit2 = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbCiudad1 = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        lbDepartamento = new javax.swing.JLabel();
        lbCiudad = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        dtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lbFecha1 = new javax.swing.JLabel();
        cmbTipoProveedor = new javax.swing.JComboBox();
        lbDepartamento1 = new javax.swing.JLabel();
        cmbNaturaleza = new javax.swing.JComboBox();
        lbCiudad2 = new javax.swing.JLabel();
        cmbRut = new javax.swing.JComboBox();
        lbEmail2 = new javax.swing.JLabel();
        txtEmailEmpresa = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lbCargo = new javax.swing.JLabel();
        lbTelefono2 = new javax.swing.JLabel();
        txtTelefonoContacto = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        lbCelular3 = new javax.swing.JLabel();
        lbNombre2 = new javax.swing.JLabel();
        txtNombreContacto = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        lbDepartamento5 = new javax.swing.JLabel();
        txtCodPostal = new javax.swing.JTextField();
        lbBarrio1 = new javax.swing.JLabel();
        chkSiResponsableIVA = new javax.swing.JCheckBox();
        chkNoResponsableIVA = new javax.swing.JCheckBox();
        txtDepartamento = new javax.swing.JComboBox();
        txtCiudad = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        lbFoto = new javax.swing.JLabel();
        btnImagen = new javax.swing.JButton();
        pnlInvisible = new javax.swing.JPanel();
        lbCupo6 = new javax.swing.JLabel();
        txtIdSistema = new javax.swing.JTextField();

        setTitle("Factura");

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));

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

        btnEliminar.setBackground(new java.awt.Color(241, 148, 138));
        btnEliminar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png"))); // NOI18N
        btnEliminar.setText("INACTIVAR");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEliminar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        btnProductosAsignados.setBackground(new java.awt.Color(255, 255, 255));
        btnProductosAsignados.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnProductosAsignados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listado.png"))); // NOI18N
        btnProductosAsignados.setText("PRODUCTOS ASIGNADOS");
        btnProductosAsignados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductosAsignados.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnProductosAsignados.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnProductosAsignados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosAsignadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbInfoObligatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBuscTerceros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProductosAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(3, 3, 3)
                .addComponent(btnProductosAsignados)
                .addGap(3, 3, 3)
                .addComponent(btnEliminar)
                .addGap(5, 5, 5)
                .addComponent(lbInfoObligatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 12))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("Identificación: *");
        lbNit.setName(""); // NOI18N
        lbNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNitKeyReleased(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtId.setName("Identificación"); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        lbNit1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit1.setText("Tipo: *");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Nit", "Cédula de ciudadanía" }));
        cmbTipo.setName("Tipo Id"); // NOI18N
        cmbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoItemStateChanged(evt);
            }
        });
        cmbTipo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                cmbTipoInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        cmbTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbTipoKeyReleased(evt);
            }
        });

        lbRazon.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon.setText("Razón social: *");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setName("Razón social"); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        lbTelefono1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTelefono1.setText("P. Nombre: ");

        txtpNombre.setEditable(false);
        txtpNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtpNombre.setName("Primer nombre"); // NOI18N
        txtpNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpNombreActionPerformed(evt);
            }
        });
        txtpNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpNombreKeyTyped(evt);
            }
        });

        lbCelular1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCelular1.setText("S.Nombre:");

        txtsNombre.setEditable(false);
        txtsNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtsNombre.setName("Segundo nombre"); // NOI18N
        txtsNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsNombreKeyTyped(evt);
            }
        });

        lbDireccion1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbDireccion1.setText("P.Apellido:       ");

        txtpApellido.setEditable(false);
        txtpApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtpApellido.setName("Primer apellido"); // NOI18N
        txtpApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpApellidoActionPerformed(evt);
            }
        });
        txtpApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpApellidoKeyReleased(evt);
            }
        });

        lbEmail1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbEmail1.setText("S.Apellido:");

        txtsApellido.setEditable(false);
        txtsApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtsApellido.setName("Segundo apellido"); // NOI18N
        txtsApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsApellidoKeyReleased(evt);
            }
        });

        lbTelefono.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTelefono.setText("Teléfono: *");

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setName("Teléfono"); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        lbDireccion.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbDireccion.setText("Dirección:            ");

        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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

        txtDigito.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDigito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDigito.setName("Identificación"); // NOI18N
        txtDigito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDigitoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDigitoKeyTyped(evt);
            }
        });

        lbNit2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit2.setText("-");
        lbNit2.setName(""); // NOI18N

        lbEmail.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbEmail.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setName("E-mail"); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        lbCiudad1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad1.setText("Actividad:");

        txtActividad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtActividad.setName("Actividad"); // NOI18N
        txtActividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtActividadKeyReleased(evt);
            }
        });

        lbDepartamento.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbDepartamento.setText("Departamento:");

        lbCiudad.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad.setText("Ciudad:");

        lbFecha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbFecha.setText("F. cumpleaños:  ");

        dtFechaNacimiento.setDateFormatString("dd/MM/yyyy");
        dtFechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dtFechaNacimientoKeyReleased(evt);
            }
        });

        lbFecha1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbFecha1.setText("Tipo:");

        cmbTipoProveedor.setEditable(true);
        cmbTipoProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Hotel", "Finca", "Capilla", "Salon de eventos" }));
        cmbTipoProveedor.setName("Tipo Proveedor"); // NOI18N

        lbDepartamento1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbDepartamento1.setText("Naturaleza:");

        cmbNaturaleza.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbNaturaleza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Persona natural", "Persona juridica" }));
        cmbNaturaleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNaturalezaActionPerformed(evt);
            }
        });
        cmbNaturaleza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbNaturalezaKeyReleased(evt);
            }
        });

        lbCiudad2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad2.setText("Rut:");

        cmbRut.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbRut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        cmbRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbRutKeyReleased(evt);
            }
        });

        lbEmail2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbEmail2.setText("E-mail empresa:");

        txtEmailEmpresa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmailEmpresa.setName("E-mail"); // NOI18N
        txtEmailEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailEmpresaKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contacto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14))); // NOI18N

        lbCargo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCargo.setText("Cargo:");

        lbTelefono2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbTelefono2.setText("Teléfono:");

        txtTelefonoContacto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefonoContacto.setName("Teléfono contacto"); // NOI18N
        txtTelefonoContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoContactoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoContactoKeyTyped(evt);
            }
        });

        txtCelular.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCelular.setName("Celular"); // NOI18N
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCelularKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        lbCelular3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCelular3.setText("Celular:");

        lbNombre2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNombre2.setText("Nombre:");

        txtNombreContacto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreContacto.setName("Nombre contacto"); // NOI18N
        txtNombreContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreContactoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreContactoKeyTyped(evt);
            }
        });

        txtCargo.setBackground(new java.awt.Color(255, 204, 204));
        txtCargo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCargo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCargo.setName("Cargo"); // NOI18N
        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCargoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNombre2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTelefonoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCelular3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCelular))
                    .addComponent(txtNombreContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(84, 84, 84))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTelefono2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefonoContacto)
                    .addComponent(lbCelular3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        lbDepartamento5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbDepartamento5.setText("Cod. postal:");

        txtCodPostal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCodPostal.setMinimumSize(new java.awt.Dimension(6, 25));
        txtCodPostal.setName("Cod. postal"); // NOI18N
        txtCodPostal.setPreferredSize(new java.awt.Dimension(6, 25));
        txtCodPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodPostalActionPerformed(evt);
            }
        });
        txtCodPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodPostalKeyReleased(evt);
            }
        });

        lbBarrio1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbBarrio1.setText("Responsable IVA:");

        buttonGroup1.add(chkSiResponsableIVA);
        chkSiResponsableIVA.setText("SI");
        chkSiResponsableIVA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(chkNoResponsableIVA);
        chkNoResponsableIVA.setSelected(true);
        chkNoResponsableIVA.setText("NO");
        chkNoResponsableIVA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtDepartamento.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txtDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DEPARTAMENTOS" }));
        txtDepartamento.setMinimumSize(new java.awt.Dimension(127, 20));
        txtDepartamento.setName("Departamento"); // NOI18N
        txtDepartamento.setPreferredSize(new java.awt.Dimension(127, 20));
        txtDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtDepartamentoItemStateChanged(evt);
            }
        });

        txtCiudad.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txtCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        txtCiudad.setName("Ciudad"); // NOI18N
        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(lbTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDireccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbTelefono1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbRazon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(lbNit2)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(lbNit1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbTipo, 0, 144, Short.MAX_VALUE))
                                    .addComponent(txtNombre)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtpApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lbCelular1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lbEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtsNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(txtsApellido)))
                                    .addComponent(txtDireccion)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbEmail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCiudad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDepartamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDepartamento1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtCodPostal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbBarrio1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkSiResponsableIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkNoResponsableIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEmailEmpresa)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cmbNaturaleza, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                            .addComponent(lbFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbCiudad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbTipoProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(cmbRut, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(txtActividad)
                                    .addComponent(txtEmail))))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(lbDepartamento5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(txtDigito)
                        .addComponent(lbNit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbNit1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTelefono1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCelular1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpNombre))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbDireccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lbEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsApellido))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCiudad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbDepartamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbTipoProveedor)
                    .addComponent(dtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbCiudad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbNaturaleza, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDepartamento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbRut, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txtEmailEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lbDepartamento5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkSiResponsableIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbBarrio1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkNoResponsableIVA, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        lbFoto.setBackground(new java.awt.Color(204, 204, 204));
        lbFoto.setToolTipText("Esta herramienta solo recibe formatos JPG y PNG. Al montar la imagen recibe el tamaño de 250x250.");
        lbFoto.setMaximumSize(new java.awt.Dimension(200, 200));
        lbFoto.setMinimumSize(new java.awt.Dimension(200, 200));
        lbFoto.setName(""); // NOI18N
        lbFoto.setOpaque(true);
        lbFoto.setPreferredSize(new java.awt.Dimension(200, 200));
        lbFoto.setRequestFocusEnabled(false);

        btnImagen.setBackground(new java.awt.Color(204, 204, 204));
        btnImagen.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnImagen.setForeground(new java.awt.Color(255, 255, 255));
        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/webcam.png"))); // NOI18N
        btnImagen.setText("AGREGAR IMAGEN    ");
        btnImagen.setToolTipText("");
        btnImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImagen.setEnabled(false);
        btnImagen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnImagen.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnImagen)
                .addGap(5, 5, 5))
        );

        lbCupo6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbCupo6.setText("CODIGO DEL SISTEMA:");

        txtIdSistema.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtIdSistema.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdSistema.setDisabledTextColor(new java.awt.Color(255, 51, 0));
        txtIdSistema.setEnabled(false);
        txtIdSistema.setName("Codigo"); // NOI18N
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
                .addComponent(lbCupo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(491, Short.MAX_VALUE))
        );
        pnlInvisibleLayout.setVerticalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCupo6)
                    .addComponent(txtIdSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
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
            .addComponent(scrFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreContactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreContactoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCargo.requestFocus();
        }
    }//GEN-LAST:event_txtNombreContactoKeyReleased

    private void txtNombreContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreContactoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreContactoKeyTyped

    private void txtTelefonoContactoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoContactoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCelular.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoContactoKeyReleased

    private void txtTelefonoContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoContactoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtTelefonoContactoKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtCelularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyReleased

    }//GEN-LAST:event_txtCelularKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        lbFoto.setIcon(null);        
        repaint();

        txtId.setEditable(true);

        for (int x = 0; x < jPanel6.getComponentCount(); x++) {
            if (jPanel6.getComponent(x) instanceof JTextField) {
                JTextField textField = (JTextField) jPanel6.getComponent(x);
                textField.setText("");
            }
        }

        for (int x = 0; x < jPanel3.getComponentCount(); x++) {
            if (jPanel3.getComponent(x) instanceof JTextField) {
                JTextField textField = (JTextField) jPanel3.getComponent(x);
                textField.setText("");
            }
        }
        chkNoResponsableIVA.setSelected(true);
        txtCodPostal.setText("");
        cmbTipoProveedor.setSelectedIndex(0);
        cmbTipo.setSelectedIndex(0);
        txtId.requestFocus();
        btnProductosAsignados.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnImagen.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnEliminar.setText("INACTIVAR");
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png")));

        String consecutivo = "";
        int num = Integer.parseInt(instancias.getSql().getNumConsecutivoActual("TERCERO")[0].toString());
        consecutivo = String.valueOf(num);
        for (int i = 0; i < 8 - String.valueOf(num).length(); i++) {
            consecutivo = "0" + consecutivo;
        }
        txtIdSistema.setText("TERC-" + consecutivo);

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Object[] campos = {txtId, cmbTipo, txtNombre, txtTelefono};
        String faltantes = metodos.camposVacios(campos);

        if (!faltantes.equals("")) {
            metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
            return;
        }

        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {

            ndTercero nodo = instancias.getSql().getDatosTercero(txtId.getText());

            String digito = txtDigito.getText();
            if (digito.equals("")) {
                digito = "";
            } else {
                digito = "-" + digito;
            }

            String fechaNacimiento = "";
            try {
                fechaNacimiento = metodos.desdeDate(dtFechaNacimiento.getCalendar());
            } catch (Exception e) {
                fechaNacimiento = metodos.fechaConsulta(metodosGenerales.fecha());
            }

            Object[] vector = {txtIdSistema.getText(), txtId.getText() + digito, txtNombre.getText(), txtTelefono.getText(), txtCelular.getText(), txtDireccion.getText(),
                txtCiudad.getSelectedItem(), txtEmail.getText(), txtDepartamento.getSelectedItem(), nodo.getFecha(), nodo.getUsuario(),
                cmbTipo.getSelectedItem().toString(), txtNombre.getText(), txtpNombre.getText(), txtsNombre.getText(),
                txtpApellido.getText(), txtsApellido.getText(), txtActividad.getText(), cmbNaturaleza.getSelectedItem().toString(),
                cmbRut.getSelectedItem().toString(), nodo.isActivo(), "0", big.getMoneda("0"), "", "COLOMBIA", "",
                "", "", "", "", "", "", fechaNacimiento, "", null, "", "", "", "", "", "", "", txtCodPostal.getText(), "", "", "", "", "", "", "", "", "", "",
                txtNombreContacto.getText(), txtCargo.getText(), txtTelefonoContacto.getText(), "", txtEmailEmpresa.getText(),
                cmbTipoProveedor.getSelectedItem(), 0, metodos.fechaConsulta(metodosGenerales.fecha()),
                metodos.fechaConsulta(metodosGenerales.fecha()), false,
                "", "", "", "PROVEEDOR", "", chkSiResponsableIVA.isSelected(),null
            };

            nodo = metodos.llenarTercero(vector);
            if (!instancias.getSql().modificarTercero(nodo)) {
                metodos.msgError(this, "Hubo un problema al modificar el Proveedor");
                return;
            } else {
                metodos.msgExito(this, "Proveedor modificado con éxito");
            }
            btnNuevoActionPerformed(evt);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (btnEliminar.getText().equalsIgnoreCase("ACTIVAR")) {
            if (metodos.msgPregunta(this, "¿Activar este registro?") == 0) {
                instancias.getSql().activarProveedor(txtId.getText());
                metodos.msgExito(this, "Proveedor activado con éxito");
                btnNuevoActionPerformed(evt);
                return;
            }
        }

        if (metodos.msgPregunta(this, "¿Inactivar este registro?") == 0) {
            if (instancias.getSql().eliminarProveedor(txtId.getText())) {
                metodos.msgAdvertencia(this, "Proveedor inactivado, este registro podrá ser activado posteriormente");
                btnNuevoActionPerformed(evt);
            } else {
                metodos.msgError(this, "Error al inactivar el proveedor");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Object[] campos = {txtId, cmbTipo, txtNombre, txtTelefono};
        String faltantes = metodos.camposVacios(campos);
//        Object[] campos2 = {txtCelular, txtEmail, txtFecha, txtsNombre, txtsApellido, txtPlazo, txtNombreContacto, txtCargo, txtTelefonoContacto, txtDireccion, txtCiudad, txtDepartamento, txtpNombre, txtpApellido, txtActividad, cmbTipoProveedor};
//        String faltantes2 = metodos.camposVacios(campos2);
        if (!faltantes.equals("")) {
            metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
            return;
        }
//        else if (!faltantes2.equals("")) {
//            metodos.msgAdvertencia(this, "Faltan los siguientes campos: " + faltantes2);
//        }
        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {

            String digito = txtDigito.getText();
            if (digito.equals("")) {
                digito = "";
            } else {
                digito = "-" + digito;
            }

            ndTercero nodo = instancias.getSql().getDatosTercero(txtId.getText() + digito);

            if (nodo.getId() != null) {
                metodos.msgError(this, "El Proveedor ya existe");
                txtId.requestFocus();
                return;
            }

            String consecutivo = "";
            int num = Integer.parseInt(instancias.getSql().getNumConsecutivo("TERCERO")[0].toString());
            consecutivo = String.valueOf(num);
            for (int i = 0; i < 8 - String.valueOf(num).length(); i++) {
                consecutivo = "0" + consecutivo;
            }

            String tipo = cmbTipoProveedor.getSelectedItem().toString();

            String fechaNacimiento = "";
            try {
                fechaNacimiento = metodos.desdeDate(dtFechaNacimiento.getCalendar());
            } catch (Exception e) {
                fechaNacimiento = metodos.fechaConsulta(metodosGenerales.fecha());
            }

            Object[] vector = {"TERC-" + consecutivo, txtId.getText() + digito, txtNombre.getText(),
                txtTelefono.getText(), txtCelular.getText(), txtDireccion.getText(), txtCiudad.getSelectedItem(),
                txtEmail.getText(), txtDepartamento.getSelectedItem(), metodos.fechaConsulta(metodosGenerales.fecha()),
                instancias.getUsuario(), cmbTipo.getSelectedItem().toString(), txtNombre.getText(),
                txtpNombre.getText(), txtsNombre.getText(), txtpApellido.getText(), txtsApellido.getText(),
                "", cmbNaturaleza.getSelectedItem().toString(),
                cmbRut.getSelectedItem().toString(), false, "0", big.getMoneda("0"), "", "COLOMBIA", "",
                "", "", "", "", "", "", fechaNacimiento, "", null, instancias.getTerminal(),
                "", "", "", "", "", "", txtCodPostal.getText(), "", "", "", "", "", "", "", "", "", "", txtNombreContacto.getText(), txtCargo.getText(), txtTelefonoContacto.getText(), "",
                txtEmailEmpresa.getText(), tipo, 0, metodos.fechaConsulta(metodosGenerales.fecha()),
                metodos.fechaConsulta(metodosGenerales.fecha()), false, "", "", "", "PROVEEDOR", "", chkSiResponsableIVA.isSelected(),null
            };

            nodo = metodos.llenarTercero(vector);

            if (!instancias.getSql().agregarTercero(nodo)) {
                metodos.msgError(this, "Hubo un problema al guardar el Proveedor");
                return;
            } else {
                metodos.msgExito(this, "Proveedor registrado con éxito");
            }

//            if (!instancias.getSql().aumentarConsecutivo("TERCERO", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("TERCERO")[0]) + 1)) {
//                metodos.msgError(null, "Hubo un problema al guardar en el consecutivo del tercero");
//            }

            btnNuevoActionPerformed(evt);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscTercerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTercerosActionPerformed
        ventanaProveedor("");
    }//GEN-LAST:event_btnBuscTercerosActionPerformed

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDireccion.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDigito.requestFocus();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            ndTercero nodo = instancias.getSql().getDatosTercero(txtId.getText());

            if (nodo.getId() == null) {
                txtDigito.requestFocus();

            } else {
                cargarProveedor(txtId.getText());
            }
        }
    }//GEN-LAST:event_txtIdKeyReleased

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped

    }//GEN-LAST:event_txtIdKeyTyped

    private void cmbTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTipoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cmbTipo.getSelectedItem().equals("NIT")) {
                txtNombre.requestFocus();
            } else {
                txtpNombre.requestFocus();
            }
        }
    }//GEN-LAST:event_cmbTipoKeyReleased

    private void txtpNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpNombreKeyReleased
        txtNombre.setText(txtpNombre.getText() + " " + txtsNombre.getText() + " " + txtpApellido.getText() + " " + txtsApellido.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtsNombre.requestFocus();
        }
    }//GEN-LAST:event_txtpNombreKeyReleased

    private void txtpNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpNombreKeyTyped

    private void txtsNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsNombreKeyReleased
        txtNombre.setText(txtpNombre.getText() + " " + txtsNombre.getText() + " " + txtpApellido.getText() + " " + txtsApellido.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtpApellido.requestFocus();
        }
    }//GEN-LAST:event_txtsNombreKeyReleased

    private void txtsNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsNombreKeyTyped

    private void txtpApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpApellidoActionPerformed

    private void txtpApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpApellidoKeyReleased
        txtNombre.setText(txtpNombre.getText() + " " + txtsNombre.getText() + " " + txtpApellido.getText() + " " + txtsApellido.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtsApellido.requestFocus();
        }
    }//GEN-LAST:event_txtpApellidoKeyReleased

    private void txtsApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsApellidoKeyReleased
        txtNombre.setText(txtpNombre.getText() + " " + txtsNombre.getText() + " " + txtpApellido.getText() + " " + txtsApellido.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtsApellidoKeyReleased

    private void txtActividadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActividadKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCiudad.requestFocus();
        }
    }//GEN-LAST:event_txtActividadKeyReleased

    private void cmbRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRutKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDepartamento.requestFocus();
        }
    }//GEN-LAST:event_cmbRutKeyReleased

    private void cmbNaturalezaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbNaturalezaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cmbNaturaleza.requestFocus();
        }
    }//GEN-LAST:event_cmbNaturalezaKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtActividad.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        if (cmbTipo.getSelectedItem().toString().equals("Nit")) {
            txtpNombre.setEditable(false);
            txtsNombre.setEditable(false);
            txtpApellido.setEditable(false);
            txtsApellido.setEditable(false);
            txtNombre.setEditable(true);
            txtpNombre.setText("");
            txtsNombre.setText("");
            txtpApellido.setText("");
            txtsApellido.setText("");
        } else {
            txtpNombre.setEditable(true);
            txtsNombre.setEditable(true);
            txtpApellido.setEditable(true);
            txtsApellido.setEditable(true);
            txtNombre.setEditable(false);
            txtNombre.setText("");
        }
    }//GEN-LAST:event_cmbTipoItemStateChanged

    private void cmbTipoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cmbTipoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoInputMethodTextChanged

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtIdSistemaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSistemaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSistemaKeyReleased

    private void txtIdSistemaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSistemaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSistemaKeyTyped

    private void txtpNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpNombreActionPerformed

    private void btnImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenActionPerformed
        JFileChooser chooser = new JFileChooser();
        ImagePreviewPanel preview = new ImagePreviewPanel();
        chooser.setAccessory(preview);
        chooser.addPropertyChangeListener(preview);

        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        chooser.setFileFilter(filtroImagen);

        int respuesta = chooser.showSaveDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            Path FROM = Paths.get(chooser.getSelectedFile().getAbsolutePath());

            String id = "";

            if (lbFoto.getToolTipText().equalsIgnoreCase("")) {
                id = Arrays.toString(instancias.getSql().getNumConsecutivo("IMG"));

            } else {
                id = lbFoto.getToolTipText();
            }

            //Path TO = Paths.get(System.getProperty("user.dir") + "\\imagenes\\proveedores\\" + txtIdSistema.getText() + ".jpg");
            String idImagen = "proveedores\\" + txtIdSistema.getText() + ".jpg";

//            CopyOption[] options = new CopyOption[]{
//                StandardCopyOption.REPLACE_EXISTING,
//                StandardCopyOption.COPY_ATTRIBUTES
//            };

            try {
                metodos.montarImagenTerceros(FROM.toString(), idImagen);
                ImageIcon fot = new ImageIcon(Instancias.getInstancias().getSql().getImagen( idImagen));
                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lbFoto.getWidth(), lbFoto.getHeight(), Image.SCALE_DEFAULT));
                lbFoto.setIcon(icono);
                this.repaint();
            } catch (Exception ex) {
                Logs.error(ex);
                metodos.msgError(this, "Hubo un error al cargar el archivo");
            }
        }
    }//GEN-LAST:event_btnImagenActionPerformed

    private void txtDigitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDigitoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cmbTipo.requestFocus();
        }
    }//GEN-LAST:event_txtDigitoKeyReleased

    private void txtDigitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDigitoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDigitoKeyTyped

    private void lbNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNitKeyReleased

    private void dtFechaNacimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtFechaNacimientoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            cmbTipoProveedor.requestFocus();
        }
    }//GEN-LAST:event_dtFechaNacimientoKeyReleased

    private void txtEmailEmpresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailEmpresaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailEmpresaKeyReleased

    private void btnProductosAsignadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosAsignadosActionPerformed
        dlgProductosAsignados productos = new dlgProductosAsignados(null, closable, txtIdSistema.getText());
        productos.setVisible(true);
    }//GEN-LAST:event_btnProductosAsignadosActionPerformed

    private void txtCargoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCargo.getText().equals("")) {
                txtNombre.requestFocus();
            } else {
                ventanaCargos(txtCargo.getText());
            }
        } else {
            txtCargo.setText("");
        }
    }//GEN-LAST:event_txtCargoKeyReleased

    private void cmbNaturalezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNaturalezaActionPerformed
        if (cmbNaturaleza.getSelectedItem().equals("Persona juridica")) {
            cmbRut.setSelectedItem("Si");
        }
    }//GEN-LAST:event_cmbNaturalezaActionPerformed

    private void txtCodPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodPostalActionPerformed

    private void txtCodPostalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodPostalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodPostalKeyReleased

    private void txtDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtDepartamentoItemStateChanged
        try {
            if(txtDepartamento.getSelectedItem()!=null){

                consultarMunicipios(txtDepartamento.getSelectedItem().toString());
            }

        } catch (Exception e) {
            Logs.error(e);
        }
    }//GEN-LAST:event_txtDepartamentoItemStateChanged
   
    public void consultaDepto(){
     consultarDepartamentos("COLOMBIA");
    } 
    
    public void consultarDepartamentos(String pais) {
        Object[][] dep = instancias.getSql().getDepartamentos(pais);
        txtDepartamento.removeAllItems();
        txtDepartamento.addItem(" ");
        for (int i = 0; i < dep.length; i++) {
            if(dep[i][0]!=null){
            txtDepartamento.addItem(dep[i][0]);
            }
        }
    }
    
    public void consultarMunicipios(String departamento) {
        Object[][] mun = instancias.getSql().getMunicipios(departamento);
        txtCiudad.removeAllItems();
        txtCiudad.addItem(" ");
        for (int i = 0; i < mun.length; i++) {
            txtCiudad.addItem(mun[i][0]);
        }
    }
    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    public void ventanaCargos(String nit) {
        buscCargos buscar = new buscCargos(instancias.getMenu(), rootPaneCheckingEnabled);
        buscar.setLocationRelativeTo(null);
        instancias.setCampoActual(txtCargo);
        txtCargo.requestFocus();
        buscar.setInstancia(instancias);
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void cargarProveedor(String Id) {

        ndTercero nodo = instancias.getSql().getDatosTercero(Id);

        if (nodo.getId() != null) {
            txtIdSistema.setText(nodo.getIdSistema());

            ImageIcon fot = new ImageIcon(Instancias.getInstancias().getSql().getImagen( "proveedores\\" + txtIdSistema.getText() + ".jpg"));
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lbFoto.getWidth(), lbFoto.getHeight(), Image.SCALE_DEFAULT));
            lbFoto.setIcon(icono);
            this.repaint();

            txtId.setText(nodo.getId().split("-")[0]);
            try {
                txtDigito.setText(nodo.getId().split("-")[1]);
            } catch (Exception e) {
                txtDigito.setText("");
            }

            txtTelefono.setText(nodo.getTelefono());
            txtCelular.setText(nodo.getCelular());
            txtDireccion.setText(nodo.getDireccion());
            try {
                txtCiudad.setSelectedItem(nodo.getCiudad());
            } catch (Exception e) {
                txtCiudad.addItem(nodo.getCiudad());
                txtCiudad.setSelectedItem(nodo.getCiudad());
            }
            txtEmail.setText(nodo.getEmail());          
            try {
                txtDepartamento.setSelectedItem(nodo.getDepartamento());
            } catch (Exception e) {
                txtDepartamento.addItem(nodo.getDepartamento());
                txtDepartamento.setSelectedItem(nodo.getDepartamento());
            }
            
            txtEmailEmpresa.setText(nodo.getRnt());
            txtCodPostal.setText(nodo.getCategoria());
            
            if (nodo.isResponsableIva()) {
                chkSiResponsableIVA.setSelected(true);
            } else {
                chkNoResponsableIVA.setSelected(true);
            }

            try {
                dtFechaNacimiento.setCalendar(metodos.haciaDate(nodo.getNacimiento()));
            } catch (Exception e) {
            }

            try {
                if (nodo.getTipo().equals("NIT")) {
                    cmbTipo.setSelectedItem("Nit");
                } else if (nodo.getTipo().equals("CC")) {
                    cmbTipo.setSelectedItem("Cédula de ciudadanía");
                } else {
                    cmbTipo.setSelectedItem(nodo.getTipo());
                }
            } catch (Exception e) {
                Logs.error(e);
            }

            txtNombre.setText(nodo.getNombre());
            txtpNombre.setText(nodo.getpNombre());
            txtsNombre.setText(nodo.getsNombre());
            txtpApellido.setText(nodo.getpApellido());
            txtsApellido.setText(nodo.getsApellido());

            try {
                txtActividad.setText(nodo.getActividad());
            } catch (Exception e) {
            }

            try {
                cmbNaturaleza.setSelectedItem(nodo.getNaturaleza());
            } catch (Exception e) {
            }

            try {
                cmbRut.setSelectedItem(nodo.getRut());
            } catch (Exception e) {
            }

            try {
                txtNombreContacto.setText(nodo.getNombreContacto());
            } catch (Exception e) {
            }

            try {
                txtCargo.setText(nodo.getCargo());
            } catch (Exception e) {
            }

            try {
                txtTelefonoContacto.setText(nodo.getTelefonoContacto());
            } catch (Exception e) {
            }

            try {
                cmbTipoProveedor.setSelectedItem(nodo.getTipoProveedor());
            } catch (Exception e) {
            }

            txtNombre.requestFocus();
            btnProductosAsignados.setEnabled(true);
            btnActualizar.setEnabled(true);
            btnImagen.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnGuardar.setEnabled(false);

            if (nodo.isActivo()) {
                btnEliminar.setText("ACTIVAR");
                btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png")));
            } else {
                btnEliminar.setText("INACTIVAR");
                btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png")));
            }
            return;
        }
        ventanaProveedor(Id);
    }

    public void ventanaProveedor(String nit) {
        buscProveedores buscar = new buscProveedores(instancias.getMenu(), rootPaneCheckingEnabled, true);
        buscar.setLocationRelativeTo(null);
        instancias.setBusProveedores(buscar);
        instancias.setCampoActual(txtId);
        txtId.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscTerceros;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImagen;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnProductosAsignados;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkNoResponsableIVA;
    private javax.swing.JCheckBox chkSiResponsableIVA;
    private javax.swing.JComboBox cmbNaturaleza;
    private javax.swing.JComboBox cmbRut;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JComboBox cmbTipoProveedor;
    private com.toedter.calendar.JDateChooser dtFechaNacimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbBarrio1;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCelular1;
    private javax.swing.JLabel lbCelular3;
    private javax.swing.JLabel lbCiudad;
    private javax.swing.JLabel lbCiudad1;
    private javax.swing.JLabel lbCiudad2;
    private javax.swing.JLabel lbCupo6;
    private javax.swing.JLabel lbDepartamento;
    private javax.swing.JLabel lbDepartamento1;
    private javax.swing.JLabel lbDepartamento5;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbDireccion1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmail1;
    private javax.swing.JLabel lbEmail2;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbFecha1;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbInfoObligatorios;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit1;
    private javax.swing.JLabel lbNit2;
    private javax.swing.JLabel lbNombre2;
    private javax.swing.JLabel lbRazon;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTelefono1;
    private javax.swing.JLabel lbTelefono2;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInvisible;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTextField txtActividad;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JComboBox txtCiudad;
    private javax.swing.JTextField txtCodPostal;
    private javax.swing.JComboBox txtDepartamento;
    private javax.swing.JTextField txtDigito;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailEmpresa;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdSistema;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreContacto;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoContacto;
    private javax.swing.JTextField txtpApellido;
    private javax.swing.JTextField txtpNombre;
    private javax.swing.JTextField txtsApellido;
    private javax.swing.JTextField txtsNombre;
    // End of variables declaration//GEN-END:variables
}
