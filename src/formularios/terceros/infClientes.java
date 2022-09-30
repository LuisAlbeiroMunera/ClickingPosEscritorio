package formularios.terceros;

import clases.ImagePreviewPanel;
import clases.Instancias;
import clases.Medico.ndConvenio;
import clases.Medico.ndEpsPrecargados;
import clases.Medico.ndHistoriaClinica;
import clases.Moneda;
import clases.big;
import clases.metodosGenerales;
import clases.terceros.ndTercero;
import formularios.Medico.buscConvenio;
import formularios.Medico.buscEpsPrecargadas;
import formularios.Ventas.buscTipoVehiculo;
import formularios.productos.buscColores;
import formularios.productos.buscMarcas;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import logs.Logs;

public class infClientes extends javax.swing.JInternalFrame {

    metodosGenerales metodos = new metodosGenerales();
    private Instancias instancias;

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    String tipo = "", id = "", simbolo = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public infClientes(String tipo) {

        initComponents();        
        instancias = Instancias.getInstancias();

        simbolo = instancias.getSimbolo();

        String consecutivo = "";
        int num = Integer.parseInt(instancias.getSql().getNumConsecutivoActual("TERCERO")[0].toString());
        consecutivo = String.valueOf(num);
        for (int i = 0; i < 8 - String.valueOf(num).length(); i++) {
            consecutivo = "0" + consecutivo;
        }
        txtIdSistema.setText("TERC-" + consecutivo);

        lbInfoObligatorios.setText(metodosGenerales.convertToMultiline("Los campos marcados (*) son obligatorios."));

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);

        pnlInvisible.setVisible(false);

        this.tipo = tipo;
        
        if (tipo.equals("paciente")) {
            btnImprimir.setVisible(true);
            cmbTipo.removeItem("Nit");
            lbNota.setVisible(false);
            jScrollPane1.setVisible(false);
            txtNota.setVisible(false);
//            jComboMoneda.setVisible(false);
//            jLabel1.setVisible(false);
        } else {
            btnImprimir.setVisible(false); 
            try {
                jTabbedPane1.remove(2);
            } catch (Exception e) {
            }
        }
         cargarMoneda();
        if (instancias.getConfiguraciones().isOrdenServ() || instancias.getConfiguraciones().isParqueadero()) {

        } else {
            try {
                jTabbedPane1.remove(1);
            } catch (Exception e) {
            }
        }
        
        consultarPais(); 
        cmbDepartamento.setSelectedItem("COLOMBIA");
        consultarDepartamentos("COLOMBIA");
        cmbDepartamento.setSelectedItem("ANTIOQUIA");
        consultarMunicipios("ANTIOQUIA");
        
//        Object[][] dep = instancias.getSql().getDepartamentos1();
//        cmbDepartamento.removeAllItems();
//
//        if (dep != null) {
//            for (int i = 0; i < dep.length; i++) {
//                if (null != dep[i][0]) {
//                    cmbDepartamento.addItem(dep[i][0].toString().toUpperCase());
//                }
//            }
//        }
//
//        cmbDepartamento.setSelectedItem("ANTIOQUIA");
//        consultarMunicipios("ANTIOQUIA");

        pnlFormulario.registerKeyboardAction(accion("guardar"), "guardar", KeyStroke.getKeyStroke(KeyEvent.VK_G, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("limpiar"), "limpiar", KeyStroke.getKeyStroke(KeyEvent.VK_L, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("terceros"), "terceros", KeyStroke.getKeyStroke(KeyEvent.VK_T, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        pnlFormulario.registerKeyboardAction(accion("modificar"), "modificar", KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    private void cargarMoneda(){
        jComboMoneda.removeAllItems();
        Object[][] monedas = instancias.getSql().getMonedaSeleccionada();
        for (int i = 0; i < monedas.length; i++) {          
            Moneda moneda = new Moneda(monedas[i][4].toString(),monedas[i][0].toString(),monedas[i][5].toString());
            jComboMoneda.addItem(moneda);
        }
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

    public void consultarMunicipios(String departamento) {
        Object[][] mun = instancias.getSql().getMunicipios(departamento);
        cmbCiudad.removeAllItems();
        cmbCiudad.addItem(" ");
        for (int i = 0; i < mun.length; i++) {
            cmbCiudad.addItem(mun[i][0]);
        }
//        cmbCiudad.setSelectedIndex(48);
    }
    
    public void consultarDepartamentos(String pais) {
        Object[][] dep = instancias.getSql().getDepartamentos(pais);
        cmbDepartamento.removeAllItems();
        cmbDepartamento.addItem(" ");
        for (int i = 0; i < dep.length; i++) {
            if(dep[i][0]!=null){
            cmbDepartamento.addItem(dep[i][0]);
            }
        }
    }
    
    public void consultarPais() {
        Object[][] pais = instancias.getSql().getPais();
        cmbPaises.removeAllItems();
        for (int i = 0; i < pais.length; i++) {
            if(pais[i][0]!=null){
             cmbPaises.addItem(pais[i][0]);
            }
        }
    }

    public void nuevoCliente(String idSistema) {
        txtId.setText(idSistema);
        cargarTercero(idSistema);
    }

//    public void nuevoCliente(String id, String nombre, String tel, String cel, String idSistema) {
//
//        Object[][] nuevoTercero = instancias.getSql().getNuevoTercero(idSistema);
//
//        txtId.setText(id);
//        txtNombre.setText(nombre);
//        txtTelefono.setText(tel);
//        txtCelular.setText(cel);
//
//        String nombre1, nombre2, nombre3, nombre4;
//
//        try {
//            nombre1 = nuevoTercero[0][1].toString();
//        } catch (Exception e) {
//            nombre1 = "";
//        }
//
//        try {
//            nombre2 = nuevoTercero[0][2].toString();
//        } catch (Exception e) {
//            nombre2 = "";
//        }
//
//        try {
//            nombre3 = nuevoTercero[0][3].toString();
//        } catch (Exception e) {
//            nombre3 = "";
//        }
//
//        try {
//            nombre4 = nuevoTercero[0][4].toString();
//        } catch (Exception e) {
//            nombre4 = "";
//        }
//
//        txtpNombre.setText(nombre1);
//        txtsNombre.setText(nombre2);
//        txtpApellido.setText(nombre3);
//        txtsApellido.setText(nombre4);
//        txtNombre.setText(nombre1 + " " + nombre2 + " " + nombre3 + " " + nombre4);
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        grupoResidencia = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        popBorrar = new javax.swing.JMenuItem();
        grupoConvenio = new javax.swing.ButtonGroup();
        grpResponsableIva = new javax.swing.ButtonGroup();
        scrFormulario = new javax.swing.JScrollPane();
        pnlFormulario = new javax.swing.JPanel();
        lbInfoObligatorios = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscTerceros = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbNit = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbNit1 = new javax.swing.JLabel();
        txtTipoCliente = new javax.swing.JTextField();
        lbTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        lbNit2 = new javax.swing.JLabel();
        txtTarjeta = new javax.swing.JTextField();
        lbRazon = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbPNombre = new javax.swing.JLabel();
        txtpNombre = new javax.swing.JTextField();
        lbSNombre = new javax.swing.JLabel();
        txtsNombre = new javax.swing.JTextField();
        lbApellido = new javax.swing.JLabel();
        txtpApellido = new javax.swing.JTextField();
        lbSapellido = new javax.swing.JLabel();
        txtsApellido = new javax.swing.JTextField();
        lbFecha = new javax.swing.JLabel();
        dtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lbFecha1 = new javax.swing.JLabel();
        txtLugarNacimiento = new javax.swing.JTextField();
        lbNit3 = new javax.swing.JLabel();
        txtDigito = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        cmbPaises = new javax.swing.JComboBox();
        lbPais = new javax.swing.JLabel();
        lbDepartamento = new javax.swing.JLabel();
        cmbDepartamento = new javax.swing.JComboBox();
        lbCiudad = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox();
        lbBarrio = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        lbDireccion1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lbDepartamento5 = new javax.swing.JLabel();
        txtCodPostal = new javax.swing.JTextField();
        lbBarrio1 = new javax.swing.JLabel();
        chkSiResponsableIVA = new javax.swing.JCheckBox();
        chkNoResponsableIVA = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        lbCiudad6 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox();
        lbCiudad7 = new javax.swing.JLabel();
        cmbEstadoCivil = new javax.swing.JComboBox();
        lbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbEmail2 = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        lbDepartamento3 = new javax.swing.JLabel();
        cmbNaturaleza = new javax.swing.JComboBox();
        lbCiudad3 = new javax.swing.JLabel();
        cmbRut = new javax.swing.JComboBox();
        btnBuscTerceros1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboMoneda = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lbEmail8 = new javax.swing.JLabel();
        cmbLista = new javax.swing.JComboBox();
        cmbVendedor = new javax.swing.JComboBox();
        lbVendedor = new javax.swing.JLabel();
        lbPlazo = new javax.swing.JLabel();
        txtPlazo = new javax.swing.JTextField();
        txtCupo = new javax.swing.JTextField();
        lbCupo = new javax.swing.JLabel();
        lbNota = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbEmail6 = new javax.swing.JLabel();
        lbPlazo1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lbCupo1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAutos = new javax.swing.JTable();
        btnGuardar1 = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        lbPlazo2 = new javax.swing.JLabel();
        lbPlazo3 = new javax.swing.JLabel();
        lbPlazo4 = new javax.swing.JLabel();
        txtChasis = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtMotor = new javax.swing.JTextField();
        lbEmail7 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lbPlazo5 = new javax.swing.JLabel();
        dtFechaCompra = new datechooser.beans.DateChooserCombo();
        txtTipoVehiculo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lbCiudad23 = new javax.swing.JLabel();
        lbCiudad24 = new javax.swing.JLabel();
        txtNombreMadre = new javax.swing.JTextField();
        txtNombrePadre = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        lbCiudad19 = new javax.swing.JLabel();
        lbCiudad20 = new javax.swing.JLabel();
        txtNombreResponsable = new javax.swing.JTextField();
        lbCiudad21 = new javax.swing.JLabel();
        cmbParentesco = new javax.swing.JComboBox();
        lbCiudad22 = new javax.swing.JLabel();
        txtTelefonoResponsable = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        lbEmail3 = new javax.swing.JLabel();
        txtEps = new javax.swing.JTextField();
        txtNomEps = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        lbCiudad12 = new javax.swing.JLabel();
        lbCiudad13 = new javax.swing.JLabel();
        lbCiudad14 = new javax.swing.JLabel();
        lbCiudad9 = new javax.swing.JLabel();
        cmbRegimen = new javax.swing.JComboBox();
        cmbAfiliado = new javax.swing.JComboBox();
        cmbTrabajador = new javax.swing.JComboBox();
        cmbZona = new javax.swing.JComboBox();
        txtSangre = new javax.swing.JTextField();
        txtReligion = new javax.swing.JTextField();
        lbEmail4 = new javax.swing.JLabel();
        lbCiudad11 = new javax.swing.JLabel();
        lbCiudad15 = new javax.swing.JLabel();
        txtConvenio = new javax.swing.JTextField();
        txtNombreConvenio = new javax.swing.JTextField();
        lbEmail11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNota1 = new javax.swing.JTextArea();
        lbEmail5 = new javax.swing.JLabel();
        txtCodigoReferido = new javax.swing.JTextField();
        txtNombreReferido = new javax.swing.JTextField();
        lbFoto = new javax.swing.JLabel();
        btnImagen = new javax.swing.JButton();
        pnlInvisible = new javax.swing.JPanel();
        lbCupo6 = new javax.swing.JLabel();
        txtIdSistema = new javax.swing.JTextField();

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

        lbInfoObligatorios.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lbInfoObligatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInfoObligatorios.setText("Los campos marcados (*) son obligatorios.");
        lbInfoObligatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnNuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevo.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO        ");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNuevo.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR    ");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(93, 173, 226));
        btnActualizar.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("MODIFICAR  ");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setEnabled(false);
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
        btnEliminar.setText("INACTIVAR ");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setEnabled(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEliminar.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscTerceros.setBackground(new java.awt.Color(247, 220, 111));
        btnBuscTerceros.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnBuscTerceros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        btnBuscTerceros.setText("LISTADO      ");
        btnBuscTerceros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnBuscTerceros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTercerosActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(255, 255, 255));
        btnImprimir.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR INFORME DEL PACIENTE");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.setEnabled(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnImprimir.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscTerceros, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnBuscTerceros))
                .addGap(3, 3, 3)
                .addComponent(btnEliminar)
                .addGap(3, 3, 3)
                .addComponent(btnImprimir)
                .addGap(5, 5, 5))
        );

        jTabbedPane1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 12))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lbNit.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit.setText("Identificación:*");
        lbNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbNitKeyReleased(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtId.setName("CC/NIT"); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        lbNit1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit1.setText("Tipo de cliente:");

        txtTipoCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTipoCliente.setName("Segundo nombre"); // NOI18N
        txtTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoClienteActionPerformed(evt);
            }
        });
        txtTipoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTipoClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoClienteKeyTyped(evt);
            }
        });

        lbTipo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTipo.setText("Tipo: *");

        cmbTipo.setMaximumRowCount(10);
        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Cédula de ciudadanía", "Nit", "Cédula de extranjería", "Pasaporte", "Registro civil", "Tarjeta de identidad", "Adulto sin identificación", "Menor sin identificación", "Número único de identificación", "Documento de identificación extranjero", "NIT de otro país", "PEP", "NUIP" }));
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
        cmbTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbTipoKeyReleased(evt);
            }
        });

        lbNit2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNit2.setText("Num tarjeta:");

        txtTarjeta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTarjeta.setName("Segundo nombre"); // NOI18N
        txtTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarjetaActionPerformed(evt);
            }
        });
        txtTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTarjetaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTarjetaKeyTyped(evt);
            }
        });

        lbRazon.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbRazon.setText("Razón social: *");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setName("Razón social"); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        lbPNombre.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbPNombre.setText("P.Nombre:     ");

        txtpNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtpNombre.setName("Primer nombre"); // NOI18N
        txtpNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpNombreKeyTyped(evt);
            }
        });

        lbSNombre.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbSNombre.setText("S.Nombre:");

        txtsNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtsNombre.setName("Segundo nombre"); // NOI18N
        txtsNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsNombreActionPerformed(evt);
            }
        });
        txtsNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsNombreKeyTyped(evt);
            }
        });

        lbApellido.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbApellido.setText("P.Apellido:   ");

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

        lbSapellido.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbSapellido.setText("S.Apellido:");

        txtsApellido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtsApellido.setName("Segundo apellido"); // NOI18N
        txtsApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsApellidoKeyReleased(evt);
            }
        });

        lbFecha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbFecha.setText("Fecha Nac: * ");

        dtFechaNacimiento.setDateFormatString("dd/MM/yyyy");
        dtFechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dtFechaNacimientoKeyReleased(evt);
            }
        });

        lbFecha1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbFecha1.setText("Lugar Nac:");

        txtLugarNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLugarNacimiento.setName("E-mail"); // NOI18N
        txtLugarNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLugarNacimientoKeyReleased(evt);
            }
        });

        lbNit3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbNit3.setText("-");

        txtDigito.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDigito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDigito.setName("CC/NIT"); // NOI18N
        txtDigito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDigitoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDigitoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbRazon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpApellido)
                            .addComponent(dtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txtpNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbSNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSapellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNit3)
                                .addGap(2, 2, 2)
                                .addComponent(txtDigito, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTarjeta)
                            .addComponent(txtTipoCliente)))
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbNit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(lbNit3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(txtDigito, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTipoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbNit1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lbNit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txtTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lbRazon, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbSNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpNombre)
                    .addComponent(txtsNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbSapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lbApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txtpApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txtsApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dtFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        cmbPaises.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbPaises.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COLOMBIA", "Panamá" }));
        cmbPaises.setName("Ciudad"); // NOI18N
        cmbPaises.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPaisesItemStateChanged(evt);
            }
        });

        lbPais.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbPais.setText("Pais: *");

        lbDepartamento.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbDepartamento.setText("Departamento:*");

        cmbDepartamento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DEPARTAMENTOS" }));
        cmbDepartamento.setName("Departamento"); // NOI18N
        cmbDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDepartamentoItemStateChanged(evt);
            }
        });

        lbCiudad.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbCiudad.setText("Ciudad:  *");

        cmbCiudad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbCiudad.setName("Ciudad"); // NOI18N
        cmbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudadActionPerformed(evt);
            }
        });

        lbBarrio.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbBarrio.setText("Barrio:");

        txtBarrio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtBarrio.setName("Dirección"); // NOI18N
        txtBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarrioActionPerformed(evt);
            }
        });
        txtBarrio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarrioKeyReleased(evt);
            }
        });

        lbDireccion1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbDireccion1.setText("Dirección:    ");

        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
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

        lbDepartamento5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbDepartamento5.setText("Cod. postal: *");

        txtCodPostal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCodPostal.setName("Cod. postal"); // NOI18N
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

        grpResponsableIva.add(chkSiResponsableIVA);
        chkSiResponsableIVA.setText("SI");
        chkSiResponsableIVA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        grpResponsableIva.add(chkNoResponsableIVA);
        chkNoResponsableIVA.setSelected(true);
        chkNoResponsableIVA.setText("NO");
        chkNoResponsableIVA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbDireccion1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(lbCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbDepartamento5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDireccion)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPaises, 0, 0, Short.MAX_VALUE)
                            .addComponent(cmbCiudad, 0, 142, Short.MAX_VALUE)
                            .addComponent(txtCodPostal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(lbBarrio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbBarrio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbDepartamento, 0, 153, Short.MAX_VALUE)
                            .addComponent(txtBarrio)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(chkSiResponsableIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkNoResponsableIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lbDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPaises))
                .addGap(3, 3, 3)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbCiudad)
                    .addComponent(lbCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbBarrio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBarrio, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodPostal, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addComponent(lbDepartamento5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbBarrio1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkNoResponsableIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkSiResponsableIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        lbCiudad6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad6.setText("Sexo:             ");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Femenino", "Masculino" }));
        cmbSexo.setName("Sexo"); // NOI18N
        cmbSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbSexoKeyReleased(evt);
            }
        });

        lbCiudad7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad7.setText("Estado civil:");

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Soltero(a)", "Casado(a)", "Union Libre", "Divorciado(a)", "Viudo(a)" }));
        cmbEstadoCivil.setName("Estado civil"); // NOI18N
        cmbEstadoCivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbEstadoCivilKeyReleased(evt);
            }
        });

        lbTelefono.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTelefono.setText("Teléfono(s): *");

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setName("Teléfono"); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        lbCelular.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCelular.setText("Celular:");

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

        lbEmail.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbEmail.setText("E-mail: *");

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setName("E-mail"); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        lbEmail2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbEmail2.setText("Ocupación:");

        txtOcupacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtOcupacion.setName("Ocupación"); // NOI18N
        txtOcupacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOcupacionKeyReleased(evt);
            }
        });

        lbDepartamento3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbDepartamento3.setText("Naturaleza:  ");

        cmbNaturaleza.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
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

        lbCiudad3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad3.setText("Rut:");

        cmbRut.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbRut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        cmbRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbRutKeyReleased(evt);
            }
        });

        btnBuscTerceros1.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscTerceros1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnBuscTerceros1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscTerceros1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        btnBuscTerceros1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscTerceros1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscTerceros1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBuscTerceros1.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnBuscTerceros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscTerceros1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText("Moneda:");

        jComboMoneda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbDepartamento3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(lbEmail2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCiudad6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefono)
                            .addComponent(cmbSexo, 0, 142, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbCiudad7, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(lbCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCelular)
                            .addComponent(cmbEstadoCivil, 0, 166, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(cmbNaturaleza, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbCiudad3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbRut, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboMoneda, 0, 118, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(txtOcupacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscTerceros1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(lbCiudad7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(lbCiudad6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(lbTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscTerceros1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDepartamento3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbNaturaleza)
                        .addComponent(lbCiudad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbRut)
                        .addComponent(jLabel1)
                        .addComponent(jComboMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbEmail8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbEmail8.setText("Lista Precio:");

        cmbLista.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbLista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8" }));
        cmbLista.setName("Lista Precios"); // NOI18N
        cmbLista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbListaKeyReleased(evt);
            }
        });

        cmbVendedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbVendedor.setName("Vendedor"); // NOI18N
        cmbVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbVendedorKeyReleased(evt);
            }
        });

        lbVendedor.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbVendedor.setText("Vendedor:");

        lbPlazo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbPlazo.setText("Días de plazo:");

        txtPlazo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPlazo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlazo.setName("Plazo"); // NOI18N
        txtPlazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlazoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlazoKeyTyped(evt);
            }
        });

        txtCupo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCupo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCupo.setText("0");
        txtCupo.setName("Cupo"); // NOI18N
        txtCupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCupoActionPerformed(evt);
            }
        });
        txtCupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCupoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCupoKeyTyped(evt);
            }
        });

        lbCupo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCupo.setText("Cupo Crédito:");

        lbNota.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNota.setText("NOTA:");

        txtNota.setColumns(20);
        txtNota.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNota.setLineWrap(true);
        txtNota.setRows(2);
        txtNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNotaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtNota);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbNota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCupo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(lbPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lbEmail8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbLista, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbVendedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCupo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNota, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Cliente", jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        lbEmail6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbEmail6.setText("Marca:");

        lbPlazo1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbPlazo1.setText("Tipo de vehiculo:");

        txtPlaca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlaca.setName("Cupo"); // NOI18N
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaKeyReleased(evt);
            }
        });

        lbCupo1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        lbCupo1.setText("Placa:");

        tblAutos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo", "Modelo", "Marca", "Color", "Chasis", "Motor", "F.Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAutos.setComponentPopupMenu(jPopupMenu1);
        tblAutos.setRowHeight(20);
        tblAutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblAutos);
        if (tblAutos.getColumnModel().getColumnCount() > 0) {
            tblAutos.getColumnModel().getColumn(0).setMinWidth(55);
            tblAutos.getColumnModel().getColumn(0).setPreferredWidth(55);
            tblAutos.getColumnModel().getColumn(0).setMaxWidth(55);
            tblAutos.getColumnModel().getColumn(2).setMinWidth(55);
            tblAutos.getColumnModel().getColumn(2).setPreferredWidth(55);
            tblAutos.getColumnModel().getColumn(2).setMaxWidth(55);
        }

        btnGuardar1.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnGuardar1.setText("Agregar Vehiculo");
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.setEnabled(false);
        btnGuardar1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar1.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        txtMarca.setBackground(new java.awt.Color(204, 204, 204));
        txtMarca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
        });

        lbPlazo2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbPlazo2.setText("Modelo:");

        lbPlazo3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbPlazo3.setText("Numero de chasis:");

        lbPlazo4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbPlazo4.setText("Numero de motor:");

        txtChasis.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txtModelo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtMotor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lbEmail7.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbEmail7.setText("Color:");

        txtColor.setBackground(new java.awt.Color(204, 204, 204));
        txtColor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColorKeyReleased(evt);
            }
        });

        lbPlazo5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbPlazo5.setText("Fecha compra:");

        dtFechaCompra.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        dtFechaCompra.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dtFechaCompraOnCommit(evt);
            }
        });

        txtTipoVehiculo.setBackground(new java.awt.Color(204, 204, 204));
        txtTipoVehiculo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtTipoVehiculo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTipoVehiculoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTipoVehiculoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator4)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPlazo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPlazo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPlazo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMotor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtChasis, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dtFechaCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPlazo2)
                            .addComponent(lbEmail6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(lbEmail7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(lbCupo1)
                        .addGap(19, 19, 19)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lbPlazo1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCupo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPlazo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipoVehiculo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPlazo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbPlazo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtChasis, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(3, 3, 3)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEmail6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMotor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPlazo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPlazo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtFechaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEmail7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnGuardar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Datos Vehiculo", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        lbCiudad23.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad23.setText("Nombre Madre:");

        lbCiudad24.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad24.setText("Nombre Padre:");

        txtNombreMadre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txtNombrePadre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbCiudad24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCiudad23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreMadre)
                    .addComponent(txtNombrePadre))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreMadre, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lbCiudad23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCiudad24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombrePadre, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        lbCiudad19.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbCiudad19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCiudad19.setText("Datos del responsable");

        lbCiudad20.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad20.setText("Nombre:");

        txtNombreResponsable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lbCiudad21.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad21.setText("Parentesco:");

        cmbParentesco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbParentesco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Papá", "Mamá", "Cónyuge", "Yerno", "Nuera", "Madrastra", "Padrastro", "Tio(a)", "Hermano(a)", "Abuelo(a)", "Primo(a)", "Sobrino(a)", "Amigo(a)", "Hijo(a)", "Novio(a)", "Cuñado(a)", "Suegro(a)", "Otro" }));
        cmbParentesco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbParentescoKeyReleased(evt);
            }
        });

        lbCiudad22.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad22.setText("Teléfono:");

        txtTelefonoResponsable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCiudad19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbCiudad20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCiudad21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreResponsable)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(cmbParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbCiudad22, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefonoResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCiudad19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCiudad20)
                    .addComponent(txtNombreResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCiudad22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtTelefonoResponsable)
                    .addComponent(cmbParentesco)
                    .addComponent(lbCiudad21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        lbEmail3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbEmail3.setText("EPS: *");

        txtEps.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEps.setName("Empresa"); // NOI18N
        txtEps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEpsActionPerformed(evt);
            }
        });
        txtEps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEpsKeyReleased(evt);
            }
        });

        txtNomEps.setEditable(false);
        txtNomEps.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomEps.setName("Nombre empresa"); // NOI18N
        txtNomEps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomEpsKeyReleased(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        grupoConvenio.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Paciente");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        grupoConvenio.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jRadioButton1.setText("Convenio");

        lbCiudad12.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbCiudad12.setText("Regimen: *");

        lbCiudad13.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbCiudad13.setText("Afiliado: *");

        lbCiudad14.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbCiudad14.setText("Tipo trabajador: *");

        lbCiudad9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad9.setText("Zona:");

        cmbRegimen.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbRegimen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Contributivo", "Subsidiado", "Vinculado", "Particular", "Otro" }));
        cmbRegimen.setName("Regimen"); // NOI18N
        cmbRegimen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbRegimenKeyReleased(evt);
            }
        });

        cmbAfiliado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbAfiliado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Cotizante", "Beneficiario", "Adicional", "Subsidiado", "Medicina Prepagada", "Particular", "Otros" }));
        cmbAfiliado.setName("Afiliado"); // NOI18N
        cmbAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAfiliadoActionPerformed(evt);
            }
        });
        cmbAfiliado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbAfiliadoKeyReleased(evt);
            }
        });

        cmbTrabajador.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbTrabajador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Dependiente", "Independiente", "Otro" }));
        cmbTrabajador.setName("Tipo trabajador"); // NOI18N
        cmbTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbTrabajadorKeyReleased(evt);
            }
        });

        cmbZona.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbZona.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Urbana", "Rural" }));
        cmbZona.setName("Zona"); // NOI18N
        cmbZona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbZonaKeyReleased(evt);
            }
        });

        txtSangre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtSangre.setName("Sangre"); // NOI18N
        txtSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSangreActionPerformed(evt);
            }
        });

        txtReligion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtReligion.setName("Religion"); // NOI18N

        lbEmail4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbEmail4.setText("Convenio:");

        lbCiudad11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad11.setText("Tipo de sangre:");

        lbCiudad15.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbCiudad15.setText("Religión:");

        txtConvenio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtConvenio.setName("Convenio"); // NOI18N
        txtConvenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConvenioKeyReleased(evt);
            }
        });

        txtNombreConvenio.setEditable(false);
        txtNombreConvenio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreConvenio.setName("Nombre Convenio"); // NOI18N
        txtNombreConvenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreConvenioKeyReleased(evt);
            }
        });

        lbEmail11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbEmail11.setText("NOTA:");

        txtNota1.setColumns(20);
        txtNota1.setLineWrap(true);
        txtNota1.setRows(3);
        txtNota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNota1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtNota1);

        lbEmail5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbEmail5.setText("Referido Por:");

        txtCodigoReferido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigoReferido.setName("Empresa"); // NOI18N
        txtCodigoReferido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoReferidoActionPerformed(evt);
            }
        });
        txtCodigoReferido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoReferidoKeyReleased(evt);
            }
        });

        txtNombreReferido.setEditable(false);
        txtNombreReferido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombreReferido.setName("Referido"); // NOI18N
        txtNombreReferido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreReferidoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(lbEmail11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbEmail3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbEmail4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCiudad11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCiudad12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCiudad14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lbEmail5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(txtEps)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomEps, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtConvenio)
                            .addComponent(txtNombreReferido)
                            .addComponent(txtNombreConvenio)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(txtCodigoReferido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSangre)
                                    .addComponent(cmbTrabajador, 0, 157, Short.MAX_VALUE)
                                    .addComponent(cmbRegimen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbCiudad13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCiudad9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCiudad15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbAfiliado, 0, 0, Short.MAX_VALUE)
                                    .addComponent(cmbZona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtReligion))))))
                .addGap(14, 14, 14))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomEps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbEmail3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbCiudad12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCiudad13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmbAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmbTrabajador, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCiudad9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCiudad14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbZona))
                .addGap(3, 3, 3)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSangre)
                    .addComponent(lbCiudad11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCiudad15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtReligion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(txtNombreConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbEmail11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoReferido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(txtNombreReferido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Medicos", jPanel6);

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

        lbCupo6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbCupo6.setText("CODIGO DEL SISTEMA:");

        txtIdSistema.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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
                .addComponent(txtIdSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInvisibleLayout.setVerticalGroup(
            pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvisibleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInvisibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCupo6)
                    .addComponent(txtIdSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInvisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbInfoObligatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnImagen)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbInfoObligatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        scrFormulario.setViewportView(pnlFormulario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrFormulario)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlazoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtPlazoKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped

    }//GEN-LAST:event_txtIdKeyTyped

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ndTercero nodo = instancias.getSql().getDatosTercero(txtId.getText());
            if (nodo.getId() == null) {
                txtDigito.requestFocus();
            } else {
                cargarTercero(txtId.getText());
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtDigito.requestFocus();
        }
        if (txtId.getText().equals("")) {
            btnImagen.setEnabled(false);
        } else {
            btnImagen.setEnabled(true);
        }
    }//GEN-LAST:event_txtIdKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            dtFechaNacimiento.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtCelular.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtCupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCupoKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtCupoKeyTyped

    private void txtCupoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCupoKeyReleased
        if (txtCupo.getText().equals("") || txtCupo.getText().equals(this.simbolo) || txtCupo.getText().equals(this.simbolo + " ")) {
            txtCupo.setText("0");
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtPlazo.requestFocus();
        } else {
            txtCupo.setText(big.setMoneda(big.getMoneda(txtCupo.getText())));
        }
    }//GEN-LAST:event_txtCupoKeyReleased

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtCelularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyReleased
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
//            txtDireccion.requestFocus();
//        }
    }//GEN-LAST:event_txtCelularKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        chkNoResponsableIVA.setSelected(true);
        txtPlaca.setText("");
        txtNota1.setText("");
        txtTipoVehiculo.setText("");
        cmbPaises.setSelectedIndex(0);
        txtMarca.setText("");

        DefaultTableModel modelo = (DefaultTableModel) tblAutos.getModel();

        while (tblAutos.getRowCount() != 0) {
            modelo.removeRow(0);
        }

        txtId.setEditable(true);

        limpiarPanel(jPanel1);
        limpiarPanel(jPanel3);
        limpiarPanel(jPanel6);
        limpiarPanel(jPanel7);
        limpiarPanel(jPanel8);
        limpiarPanel(jPanel9);
        limpiarPanel(jPanel10);
        limpiarPanel(jPanel11);
        limpiarPanel(jPanel12);
        limpiarPanel(jPanel13);
        txtNota.setText("");

        lbFoto.setIcon(null);
        repaint();

        btnImagen.setEnabled(false);
        cmbDepartamento.setSelectedItem("Antioquia");
        dtFechaNacimiento.setCalendar(null);
        jTabbedPane1.setSelectedIndex(0);
        txtId.requestFocus();
        btnGuardar1.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnImprimir.setEnabled(false);
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
        txtCupo.setText(this.simbolo + " 0");

        if (!instancias.getConfiguraciones().isFacturaElectronica()) {
            Font font = new Font("Century Gothic", Font.PLAIN, 16);
            lbEmail.setFont(font);
        } else {
            Font font = new Font("Century Gothic", Font.BOLD, 16);
            lbEmail.setFont(font);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.tipo.equals("paciente")) {
            Object[] campos = {txtNombre, txtTelefono, cmbTipo, txtId, txtNomEps, cmbRegimen, cmbAfiliado, cmbTrabajador, cmbDepartamento, cmbCiudad};
            String faltantes = metodos.camposVacios(campos);
            if (!faltantes.equals("")) {
                metodos.msgAdvertencia(this, "4No puede continuar, faltan los siguientes campos: " + faltantes);
                return;
            }

        } else {
            String faltantes = "";
            if (instancias.getConfiguraciones().isFacturaElectronica()) {
                Object[] campos = {txtNombre, txtTelefono, cmbTipo, txtId, txtEmail, txtCodPostal, cmbDepartamento, cmbCiudad};
                faltantes = metodos.camposVacios(campos);
            } else {
                Object[] campos = {txtNombre, txtTelefono, cmbTipo, txtId};
                faltantes = metodos.camposVacios(campos);
            }

            if (!faltantes.equals("")) {
                metodos.msgAdvertencia(this, "No puede continuar, faltan los siguientes campos: " + faltantes);
                return;
            }
        }

        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {

            String digito = txtDigito.getText();
            if (digito.equals("")) {
                digito = "";
            } else {
                digito = "-" + digito;
            }

            ndTercero nodo = instancias.getSql().getDatosTercero(txtId.getText() + digito);

            if (nodo.getId() != null) {

                if (this.tipo.equals("paciente")) {
                    metodos.msgAdvertencia(this, "El paciente ya existe");
                } else {
                    metodos.msgAdvertencia(this, "El cliente ya existe");
                }

                txtId.requestFocus();
                return;
            }

            if (txtCupo.getText().equals("")) {
                txtCupo.setText("0");
            }
            if (txtPlazo.getText().equals("")) {
                txtPlazo.setText("0");
            }
            if (txtNomEps.getText().equals("")) {
                txtEps.setText("");
            }

            String idVendedor = "";
            if (cmbVendedor.getSelectedIndex() > 0) {
                idVendedor = instancias.getSql().getIdEmpleado(cmbVendedor.getSelectedItem().toString());
            }

            String fechaNacimiento = "";
            if (instancias.getConfiguraciones().isMedico() || instancias.getConfiguraciones().isLaboratorio()
                    || instancias.getConfiguraciones().isOftalmologia()) {
                try {
                    fechaNacimiento = metodos.desdeDate(dtFechaNacimiento.getCalendar());
                } catch (Exception e) {
                    metodos.msgAdvertenciaAjustado(this, "Debe ingresar la fecha de nacimiento");
                    return;
                }
            } else {
                try {
                    fechaNacimiento = metodos.desdeDate(dtFechaNacimiento.getCalendar());
                } catch (Exception e) {
                    fechaNacimiento = metodos.fechaConsulta(metodosGenerales.fecha());
                }
            }

            String convenio = "";
            if (jRadioButton1.isSelected()) {
                convenio = "1";
            }

            String consecutivo = "";
            int num = Integer.parseInt(instancias.getSql().getNumConsecutivo("TERCERO")[0].toString());
            consecutivo = String.valueOf(num);
            for (int i = 0; i < 8 - String.valueOf(num).length(); i++) {
                consecutivo = "0" + consecutivo;
            }

            String eps = txtEps.getText();
            if ("".equals(eps)) {
                eps = null;
            }
            
            Moneda moneda=(Moneda)jComboMoneda.getSelectedItem();

            Object[] vector = {"TERC-" + consecutivo, txtId.getText() + digito, txtNombre.getText(),
                txtTelefono.getText(), txtCelular.getText(), txtDireccion.getText(), cmbCiudad.getSelectedItem(),
                txtEmail.getText(), cmbDepartamento.getSelectedItem(),
                metodos.fechaConsulta(metodosGenerales.fecha()), instancias.getUsuario(),
                cmbTipo.getSelectedItem().toString(), txtNombre.getText(),
                txtpNombre.getText(), txtsNombre.getText(), txtpApellido.getText(), txtsApellido.getText(),
                txtOcupacion.getText(), cmbNaturaleza.getSelectedItem().toString(), cmbRut.getSelectedItem().toString(),
                false, txtPlazo.getText(), big.getMoneda(txtCupo.getText()), "", cmbPaises.getSelectedItem(),
                cmbSexo.getSelectedItem(), cmbEstadoCivil.getSelectedItem(), txtOcupacion.getText(), cmbRegimen.getSelectedItem(),
                cmbAfiliado.getSelectedItem(), cmbTrabajador.getSelectedItem(),
                cmbZona.getSelectedItem(), fechaNacimiento, txtSangre.getText(), eps, instancias.getTerminal(),
                txtCodigoReferido.getText(), idVendedor, cmbLista.getSelectedItem(), txtNota.getText() + "" + txtNota1.getText(), "",
                "", txtCodPostal.getText(), convenio, txtConvenio.getText(), txtReligion.getText(),
                txtNombreMadre.getText(), txtNombrePadre.getText(), txtNombreResponsable.getText(), cmbParentesco.getSelectedItem(), txtTelefonoResponsable.getText(),
                txtLugarNacimiento.getText(), txtBarrio.getText(), txtTipoCliente.getText(), txtTarjeta.getText(), "", "", "", "", 0,
                metodos.fechaConsulta(metodosGenerales.fecha()), metodos.fechaConsulta(metodosGenerales.fecha()), false, "", "", "", "TERCERO", "",
                chkSiResponsableIVA.isSelected(),moneda.getCodigo()};

            nodo = metodos.llenarTercero(vector);

            if (!instancias.getSql().agregarTercero(nodo)) {
                metodos.msgError(this, "Hubo un error al guardar");
                return;
            }

            for (int i = 0; i < tblAutos.getRowCount(); i++) {
                if (!instancias.getSql().agregarPlacas(txtId.getText(), tblAutos.getValueAt(i, 0).toString(),
                        tblAutos.getValueAt(i, 1).toString(), tblAutos.getValueAt(i, 2).toString(), tblAutos.getValueAt(i, 3).toString(),
                        tblAutos.getValueAt(i, 4).toString(), tblAutos.getValueAt(i, 5).toString(), tblAutos.getValueAt(i, 6).toString(),
                        tblAutos.getValueAt(i, 7).toString())) {
                    metodos.msgError(this, "Hubo un error al guardar las placas");
                    return;
                }
            }

            if (this.tipo.equals("paciente")) {
                String historia = "HSTC-" + txtId.getText();
                Object[] vector2 = {historia, "TERC-" + consecutivo, metodos.fechaConsulta(metodosGenerales.fecha()), "",
                    metodos.fechaConsulta(metodosGenerales.fecha()), metodos.fechaConsulta(metodosGenerales.fecha()), "",
                    "", "", "", "", "0&0&0&0", "", "", ""};

                ndHistoriaClinica nodoDos = metodos.llenarHistClinica(vector2);

                if (!instancias.getSql().agregarHistClinica(nodoDos)) {
                    metodos.msgError(this, "Error al guardar historia clinica");
                    return;
                } else {
                    metodos.msgExito(this, "Historia Clinica No." + historia.replace("HSTC-", ""));
                }
            } else {
                metodos.msgExito(this, "Cliente creado con éxito");
            }

//            if (!instancias.getSql().aumentarConsecutivo("TERCERO", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("TERCERO")[0]) + 1)) {
//                metodos.msgError(this, "Hubo un problema al guardar en el consecutivo del tercero");
//            }

            String cliente = txtId.getText();
            btnNuevoActionPerformed(evt);
            String cita = "";
            String medico = "";

            try {
                cita = instancias.getSql().getAgendasDelDia(cliente, metodos.fechaConsulta(metodosGenerales.fecha()));
            } catch (Exception e) {
                Logs.error(e);
            }

            if (!cita.equals("")) {
                medico = instancias.getSql().medicoDeLaCita(cita);
            }

            if (!cita.equalsIgnoreCase("")) {
                if (tipo.equals("paciente")) {
                    if (instancias.isGeneraOrdenMedica()) {
                        instancias.getOrdenMedica().cargarClienteDesdeAgenda(cliente, medico);
                        try {
                            instancias.getOrdenMedica().setSelected(true);
                        } catch (Exception e) {
                            Logs.error(e);
                        }
                    } else {
                        instancias.getHistoriaC().setPaciente(cliente);
                        try {
                            instancias.getHistoriaC().setSelected(true);
                        } catch (Exception e) {
                            Logs.error(e);
                        }
                    }
                } else {
                    instancias.getFactura().cargarCliente(cliente);
                    try {
                        instancias.getFacturaContenedor().setSelected(true);
                    } catch (Exception e) {
                        Logs.error(e);
                    }

                }
            }

            lbNit.requestFocus();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (this.tipo.equals("paciente")) {
            Object[] campos = {txtNombre, txtTelefono, cmbTipo, txtId, txtNomEps, cmbRegimen, cmbAfiliado, cmbTrabajador, cmbDepartamento, cmbCiudad};
            String faltantes = metodos.camposVacios(campos);

            if (!faltantes.equals("")) {
                metodos.msgAdvertencia(this, "2No puede continuar, faltan los siguientes campos: " + faltantes);
                return;
            }
        } else {

            String faltantes = "";
            System.err.println("cmbDepartamento.getSelectedItem() "+cmbDepartamento.getSelectedItem()); 
            if (instancias.getConfiguraciones().isFacturaElectronica()) {
                Object[] campos = {txtNombre, txtTelefono, cmbTipo, txtId, txtEmail, txtCodPostal, cmbDepartamento, cmbCiudad};
                faltantes = metodos.camposVacios(campos);
            } else {
                Object[] campos = {txtNombre, txtTelefono, cmbTipo, txtId};
                faltantes = metodos.camposVacios(campos);
            }

            if (!faltantes.equals("")) {
                metodos.msgAdvertencia(this, "1No puede continuar, faltan los siguientes campos: " + faltantes);
                return;
            }
        }

        ndTercero nodo = instancias.getSql().getDatosTercero(txtId.getText() + "-" + txtDigito.getText());
        if (nodo.getId() != null) {
            if (!txtIdSistema.getText().equals(nodo.getIdSistema())) {
                metodos.msgError(this, "El documento ya existe");
                txtId.requestFocus();
                return;
            }
        }

        if (metodos.msgPregunta(this, "¿Desea continuar?") == 0) {

//            try {
            if (txtCupo.getText().equals("")) {
                txtCupo.setText("0");
            }

            if (txtNomEps.getText().equals("")) {
                txtEps.setText("");
            }
            String idVendedor = "";
            if (cmbVendedor.getSelectedIndex() > 0) {
                idVendedor = instancias.getSql().getIdEmpleado(cmbVendedor.getSelectedItem().toString());
            }

            String fechaNacimiento = "";
//            boolean fechaNull = false;
            try {
                fechaNacimiento = metodos.desdeDate(dtFechaNacimiento.getCalendar());

            } catch (Exception e) {
                fechaNacimiento = metodosGenerales.fecha();
//                fechaNull = true;
            }

            String convenio = "";
            if (jRadioButton1.isSelected()) {
                convenio = "1";
            }

            String digito = txtDigito.getText();
            if (digito.equals("")) {
                digito = "";
            } else {
                digito = "-" + digito;
            }

            String eps = txtEps.getText();
            if ("".equals(eps)) {
                eps = null;
            }
            
            Moneda moneda=(Moneda)jComboMoneda.getSelectedItem();
            
            Object[] vector = {txtIdSistema.getText(), txtId.getText() + digito, txtNombre.getText(), txtTelefono.getText(), txtCelular.getText(), txtDireccion.getText(), cmbCiudad.getSelectedItem(),
                txtEmail.getText(), cmbDepartamento.getSelectedItem(), nodo.getFecha(), nodo.getUsuario(), cmbTipo.getSelectedItem().toString(), txtNombre.getText(),
                txtpNombre.getText(), txtsNombre.getText(), txtpApellido.getText(), txtsApellido.getText(), txtOcupacion.getText(), cmbNaturaleza.getSelectedItem().toString(),
                cmbRut.getSelectedItem().toString(), nodo.isActivo(), txtPlazo.getText(), big.getMoneda(txtCupo.getText()), "", cmbPaises.getSelectedItem(), cmbSexo.getSelectedItem(),
                cmbEstadoCivil.getSelectedItem(), txtOcupacion.getText(), cmbRegimen.getSelectedItem(), cmbAfiliado.getSelectedItem(), cmbTrabajador.getSelectedItem(),
                cmbZona.getSelectedItem(), fechaNacimiento, txtSangre.getText(), eps, nodo.getTerminal(),
                txtCodigoReferido.getText(), idVendedor, cmbLista.getSelectedItem(), txtNota.getText() + "" + txtNota1.getText(), "",
                "", txtCodPostal.getText(), convenio, txtConvenio.getText(), txtReligion.getText(), txtNombreMadre.getText(), txtNombrePadre.getText(),
                txtNombreResponsable.getText(), cmbParentesco.getSelectedItem(), txtTelefonoResponsable.getText(), txtLugarNacimiento.getText(), txtBarrio.getText(),
                txtTipoCliente.getText(), txtTarjeta.getText(), "", "", "", "", 0, null, null, false, "", "", "", "TERCERO", "", chkSiResponsableIVA.isSelected(),moneda.getCodigo()};

            nodo = metodos.llenarTercero(vector);
            if (!instancias.getSql().modificarTercero(nodo)) {
                metodos.msgError(this, "Hubo un problema al modificar el Tercero");
                return;
            }

            instancias.getSql().eliminar_registro("bdPlacas", " usuario = '" + txtIdSistema.getText() + "'");

            for (int i = 0; i < tblAutos.getRowCount(); i++) {

                String valor1, valor2, valor3, valor4, valor5, valor6, valor7;

                try {
                    valor1 = tblAutos.getValueAt(i, 1).toString();
                } catch (Exception e) {
                    valor1 = "";
                }

                try {
                    valor2 = tblAutos.getValueAt(i, 2).toString();
                } catch (Exception e) {
                    valor2 = "";
                }

                try {
                    valor3 = tblAutos.getValueAt(i, 3).toString();
                } catch (Exception e) {
                    valor3 = "";
                }

                try {
                    valor4 = tblAutos.getValueAt(i, 4).toString();
                } catch (Exception e) {
                    valor4 = "";
                }

                try {
                    valor5 = tblAutos.getValueAt(i, 5).toString();
                } catch (Exception e) {
                    valor5 = "";
                }

                try {
                    valor6 = tblAutos.getValueAt(i, 6).toString();
                } catch (Exception e) {
                    valor6 = "";
                }

                try {
                    valor7 = tblAutos.getValueAt(i, 7).toString();
                } catch (Exception e) {
                    valor7 = "";
                }

                if (!instancias.getSql().agregarPlacas(txtIdSistema.getText(), tblAutos.getValueAt(i, 0).toString(),
                        valor1, valor2, valor3, valor4, valor5, valor6, valor7)) {
                    metodos.msgError(this, "Hubo un error al guardar las placas");
                    return;
                }
            }

            metodos.msgExito(this, "Tercero modificado con éxito");

            btnNuevoActionPerformed(evt);
//            } catch (Exception e) {
//                metodos.msgError(this, "Hubo un problema al modiicar el Tercero");
//            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (btnEliminar.getText().equalsIgnoreCase("ACTIVAR")) {
            if (metodos.msgPregunta(this, "¿Activar este registro?") == 0) {
                instancias.getSql().activarCliente(txtId.getText());
                metodos.msgExito(this, "Cliente activado con éxito");
                btnNuevoActionPerformed(evt);
                return;
            }
        }

        if (metodos.msgPregunta(this, "¿Inactivar este registro?") == 0) {
            instancias.getSql().eliminarCliente(txtId.getText());
            metodos.msgAdvertencia(this, "Cliente inactivado, este registro podrá ser activado posteriormente");
            btnNuevoActionPerformed(evt);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscTercerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTercerosActionPerformed
        cargarMoneda();
        ventanaTerceros("", txtId, "");
    }//GEN-LAST:event_btnBuscTercerosActionPerformed

    private void txtsApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsApellidoKeyReleased
        txtNombre.setText(txtpNombre.getText() + " " + txtsNombre.getText() + " " + txtpApellido.getText() + " " + txtsApellido.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtLugarNacimiento.requestFocus();
        }
    }//GEN-LAST:event_txtsApellidoKeyReleased

    private void txtpApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpApellidoActionPerformed

    private void txtpApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpApellidoKeyReleased
        txtNombre.setText(txtpNombre.getText() + " " + txtsNombre.getText() + " " + txtpApellido.getText() + " " + txtsApellido.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtsApellido.requestFocus();
        }
    }//GEN-LAST:event_txtpApellidoKeyReleased

    private void txtsNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsNombreKeyReleased
        txtNombre.setText(txtpNombre.getText() + " " + txtsNombre.getText() + " " + txtpApellido.getText() + " " + txtsApellido.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtpApellido.requestFocus();
        }
    }//GEN-LAST:event_txtsNombreKeyReleased

    private void txtsNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsNombreKeyTyped

    private void txtpNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpNombreKeyReleased
        txtNombre.setText(txtpNombre.getText() + " " + txtsNombre.getText() + " " + txtpApellido.getText() + " " + txtsApellido.getText());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtsNombre.requestFocus();
        }
    }//GEN-LAST:event_txtpNombreKeyReleased

    private void txtpNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpNombreKeyTyped

    private void cmbTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTipoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            if (cmbTipo.getSelectedIndex() == 0) {

            } else if (cmbTipo.getSelectedItem().equals("NIT")) {
                txtTarjeta.requestFocus();
            } else {
                txtTarjeta.requestFocus();
            }
        }
    }//GEN-LAST:event_cmbTipoKeyReleased

    private void txtEpsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEpsKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarEps(txtEps.getText());
        } else {
            txtNomEps.setText("");
        }
    }//GEN-LAST:event_txtEpsKeyReleased

    private void txtEpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEpsActionPerformed

    private void txtPlazoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlazoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtCodigoReferido.requestFocus();
        }
    }//GEN-LAST:event_txtPlazoKeyReleased

    private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoItemStateChanged
        if (cmbTipo.getSelectedItem().toString().equals("NIT") || cmbTipo.getSelectedItem().toString().equals("Nit") || cmbTipo.getSelectedItem().toString().equals("NIT de otro país")) {
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

    private void txtsNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsNombreActionPerformed

    private void txtNomEpsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomEpsKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

        }
    }//GEN-LAST:event_txtNomEpsKeyReleased

    private void txtCupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCupoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtNombreReferidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreReferidoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreReferidoKeyReleased

    private void txtCodigoReferidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoReferidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoReferidoActionPerformed

    private void txtCodigoReferidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoReferidoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cargarReferido();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            cmbVendedor.requestFocus();
        } else {
            txtNombreReferido.setText("");
        }
    }//GEN-LAST:event_txtCodigoReferidoKeyReleased

    private void dtFechaNacimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtFechaNacimientoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtCupo.requestFocus();
        }
    }//GEN-LAST:event_dtFechaNacimientoKeyReleased

    private void cmbVendedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbVendedorKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            cmbLista.requestFocus();
        }
    }//GEN-LAST:event_cmbVendedorKeyReleased

    private void cmbListaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbListaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtNota.requestFocus();
        }

    }//GEN-LAST:event_cmbListaKeyReleased

    private void txtNotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            btnGuardar.requestFocus();
        }
    }//GEN-LAST:event_txtNotaKeyReleased

    private void cmbSexoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbSexoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cmbEstadoCivil.requestFocus();
        }
    }//GEN-LAST:event_cmbSexoKeyReleased

    private void cmbEstadoCivilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbEstadoCivilKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtOcupacion.requestFocus();
        }
    }//GEN-LAST:event_cmbEstadoCivilKeyReleased

    private void txtOcupacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOcupacionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ventanaOcupaciones(txtOcupacion.getText());
        }
    }//GEN-LAST:event_txtOcupacionKeyReleased

    public void ventanaOcupaciones(String ocupacion) {
        buscOcupaciones buscar = new buscOcupaciones(instancias.getMenu(), rootPaneCheckingEnabled);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscarOcupaciones(buscar);
        instancias.setCampoActual(txtOcupacion);
        txtOcupacion.requestFocus();
        buscar.noEncontrado(ocupacion);
        buscar.show();
    }

    private void cmbRegimenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRegimenKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cmbAfiliado.requestFocus();
        }
    }//GEN-LAST:event_cmbRegimenKeyReleased

    private void cmbAfiliadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbAfiliadoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cmbTrabajador.requestFocus();
        }
    }//GEN-LAST:event_cmbAfiliadoKeyReleased

    private void cmbTrabajadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTrabajadorKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cmbZona.requestFocus();
        }
    }//GEN-LAST:event_cmbTrabajadorKeyReleased

    private void cmbZonaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbZonaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSangre.requestFocus();
        }
    }//GEN-LAST:event_cmbZonaKeyReleased

    private void txtConvenioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConvenioKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ndTercero nodo = instancias.getSql().getDatosTercero(txtConvenio.getText());
            if (nodo.getId() != null) {
                txtNombreConvenio.setText(nodo.getCompleta());
                return;
            }
            ventanaTerceros(txtConvenio.getText(), txtConvenio, "convenio");
        } else {
            txtNombreConvenio.setText("");
        }
    }//GEN-LAST:event_txtConvenioKeyReleased

    private void cmbNaturalezaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbNaturalezaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNaturalezaKeyReleased

    private void cmbRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRutKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRutKeyReleased

    private void txtNombreConvenioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreConvenioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreConvenioKeyReleased

    private void cmbDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDepartamentoItemStateChanged
        try {
            if(cmbDepartamento.getSelectedItem()!=null){
            
              consultarMunicipios(cmbDepartamento.getSelectedItem().toString());
            }
            
        } catch (Exception e) {
            Logs.error(e);
        }
    }//GEN-LAST:event_cmbDepartamentoItemStateChanged

    private void cmbParentescoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbParentescoKeyReleased

    }//GEN-LAST:event_cmbParentescoKeyReleased

    private void txtBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarrioActionPerformed

    private void txtBarrioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarrioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarrioKeyReleased

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

            //Path TO = Paths.get(System.getProperty("user.dir") + "\\imagenes\\terceros\\" + txtIdSistema.getText() + ".jpg");
            String idImagen = "terceros\\" + txtIdSistema.getText() + ".jpg";
            //sobreescribir el fichero de destino, si existe, y copiar
            // los atributos, incluyendo los permisos rwx
//            CopyOption[] options = new CopyOption[]{
//                StandardCopyOption.REPLACE_EXISTING,
//                StandardCopyOption.COPY_ATTRIBUTES
//            };

            try {
//                Files.copy(FROM, TO, options);

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

    private void txtSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSangreActionPerformed

    private void cmbAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAfiliadoActionPerformed

    private void txtNota1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNota1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota1KeyReleased

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTipoVehiculo.requestFocus();
        } else {
            txtPlaca.setText(txtPlaca.getText().toUpperCase());
        }
    }//GEN-LAST:event_txtPlacaKeyReleased

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if (txtPlaca.getText().equals("")) {
            metodos.msgError(this, "Ingrese la placa");
            return;
        }

        if (txtTipoVehiculo.getText().equals("")) {
            metodos.msgError(this, "Seleccione el tipo de auto");
            return;
        }

        if (txtMarca.getText().equals("")) {
            metodos.msgError(this, "Ingrese la marca");
            return;
        }

        if (txtModelo.getText().equals("")) {
            metodos.msgError(this, "Ingrese el modelo");
            return;
        }

        Object[][] placas = instancias.getSql().getPlacas();
        for (int i = 0; i < placas.length; i++) {
            if (txtPlaca.getText().equals(placas[i][1])) {
                metodos.msgError(this, "Esta placa ya esta registrada");
                return;
            }
        }

        for (int i = 0; i < tblAutos.getRowCount(); i++) {
            if (txtPlaca.getText().equals(tblAutos.getValueAt(i, 0))) {
                metodos.msgError(this, "Esta placa ya esta cargada");
                return;
            }
        }

        DefaultTableModel modelo = (DefaultTableModel) tblAutos.getModel();
        modelo.addRow(new Object[]{txtPlaca.getText(), txtTipoVehiculo.getText(), txtModelo.getText(), txtMarca.getText(),
            txtColor.getText(), txtChasis.getText(), txtMotor.getText(), dtFechaCompra.getText()});

        txtPlaca.setText("");
        txtTipoVehiculo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtChasis.setText("");
        txtMotor.setText("");
        txtColor.setText("");
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void popBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popBorrarActionPerformed
        if (tblAutos.getSelectedRow() > -1) {
            int fila = tblAutos.getSelectedRow();

            DefaultTableModel modelo = (DefaultTableModel) tblAutos.getModel();
            modelo.removeRow(fila);
            tblAutos.removeEditor();
        } else {
            metodos.msgAdvertencia(null, "Seleccione una placa");
        }
    }//GEN-LAST:event_popBorrarActionPerformed

    private void dtFechaCompraOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dtFechaCompraOnCommit

    }//GEN-LAST:event_dtFechaCompraOnCommit

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        instancias.getReporte().setImagenInforme1(txtIdSistema.getText());
        instancias.getReporte().setImagenInforme();

        try {
            instancias.getReporte().ver_informePaciente(txtIdSistema.getText());
        } catch (Exception e) {
            Logs.error(e);
            instancias.getReporte().ver_informePaciente1(txtIdSistema.getText());
        }

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoClienteActionPerformed

    private void txtTipoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoClienteKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            cmbTipo.requestFocus();
        }
    }//GEN-LAST:event_txtTipoClienteKeyReleased

    private void txtTipoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoClienteKeyTyped

    private void txtTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarjetaActionPerformed

    private void txtTarjetaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTarjetaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtpNombre.requestFocus();
        }
    }//GEN-LAST:event_txtTarjetaKeyReleased

    private void txtTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTarjetaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarjetaKeyTyped

    private void txtLugarNacimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarNacimientoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtLugarNacimientoKeyReleased

    private void txtIdSistemaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSistemaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSistemaKeyReleased

    private void txtIdSistemaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSistemaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSistemaKeyTyped

    private void txtDigitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDigitoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtTipoCliente.requestFocus();
        }
    }//GEN-LAST:event_txtDigitoKeyReleased

    private void txtDigitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDigitoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDigitoKeyTyped

    private void lbNitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbNitKeyReleased
        txtId.requestFocus();
    }//GEN-LAST:event_lbNitKeyReleased

    private void txtTipoVehiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoVehiculoKeyPressed

    }//GEN-LAST:event_txtTipoVehiculoKeyPressed

    private void txtTipoVehiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoVehiculoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtTipoVehiculo.getText().equals("")) {
                txtChasis.requestFocus();
            } else {
                ventanaTipoVehiculos(txtTipoVehiculo.getText());
            }
        } else {
            txtTipoVehiculo.setText("");
        }
    }//GEN-LAST:event_txtTipoVehiculoKeyReleased

    private void txtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtMarca.getText().equals("")) {
                btnNuevo.requestFocus();
            } else {
                ventanaMarcas(txtMarca.getText());
            }
        } else {
            txtMarca.setText("");
        }
    }//GEN-LAST:event_txtMarcaKeyReleased

    private void txtColorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String color = txtColor.getText();

            if (!txtColor.getText().equals("")) {
                btnGuardar1.requestFocus();
            } else {
                ventanaColores1(txtColor.getText());
            }
        } else {
            txtColor.setText("");
        }
    }//GEN-LAST:event_txtColorKeyReleased

    private void btnBuscTerceros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscTerceros1ActionPerformed
        ventanaOcupaciones("");
    }//GEN-LAST:event_btnBuscTerceros1ActionPerformed

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

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void cmbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudadActionPerformed

    private void cmbPaisesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPaisesItemStateChanged
       try {
            if(cmbPaises.getSelectedItem()!=null){            
              consultarDepartamentos(cmbPaises.getSelectedItem().toString());
            }
            
//        Object[][] dep = instancias.getSql().getDepartamentos1();
//        cmbDepartamento.removeAllItems();
//
//        if (dep != null) {
//            for (int i = 0; i < dep.length; i++) {
//                if (null != dep[i][0]) {
//                    cmbDepartamento.addItem(dep[i][0].toString().toUpperCase());
//                }
//            }
//        }

//        cmbDepartamento.setSelectedItem("ANTIOQUIA");
//        consultarMunicipios("ANTIOQUIA");
            
            
            
        } catch (Exception e) {
            Logs.error(e);
        }
    }//GEN-LAST:event_cmbPaisesItemStateChanged

    public void ventanaColores1(String nit) {
        buscColores buscar = new buscColores(instancias.getMenu(), rootPaneCheckingEnabled);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscColores(buscar);
        instancias.setCampoActual(txtColor);
        txtColor.requestFocus();
        buscar.setInstancia(instancias);
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void ventanaMarcas(String nit) {
        buscMarcas buscar = new buscMarcas(instancias.getMenu(), rootPaneCheckingEnabled);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscMarcas(buscar);
        instancias.setCampoActual(txtMarca);
        txtMarca.requestFocus();
        buscar.setInstancia(instancias);
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void ventanaTipoVehiculos(String nit) {
        buscTipoVehiculo buscar = new buscTipoVehiculo(instancias.getMenu(), true);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscTipoVehiculo(buscar);
        instancias.setCampoActual(txtTipoVehiculo);
        txtTipoVehiculo.requestFocus();
        buscar.setInstancia(instancias);
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void cargarReferido() {
        ndTercero nodo = instancias.getSql().getDatosTercero(txtCodigoReferido.getText());
        if (nodo.getId() != null) {
            txtNombreReferido.setText(nodo.getNombre());
            cmbVendedor.requestFocus();
        } else {
            ventanaTercerosReferidos(txtCodigoReferido.getText());
        }
    }

    public void cargarTercero(String Id) {

        ndTercero nodo = instancias.getSql().getDatosTercero(Id);

        if (nodo.getId() != null) {

            txtIdSistema.setText(nodo.getIdSistema());
            txtId.setText(nodo.getId().split("-")[0]);
            try {
                txtDigito.setText(nodo.getId().split("-")[1]);
            } catch (Exception e) {
                txtDigito.setText("");
            }

            try {
                cmbPaises.setSelectedItem(nodo.getPais());
            } catch (Exception e) {
                cmbPaises.setSelectedIndex(0);
            }

            try {
                txtTelefono.setText(nodo.getTelefono());
            } catch (Exception e) {
            }

            try {
                txtTarjeta.setText(nodo.getCargo());
            } catch (Exception e) {
            }

            try {
                txtTipoCliente.setText(nodo.getNombreContacto());
            } catch (Exception e) {
            }

            try {
                txtCodPostal.setText(nodo.getCategoria());
            } catch (Exception e) {
            }

            try {
                txtCelular.setText(nodo.getCelular());
            } catch (Exception e) {
            }

            try {
                txtDireccion.setText(nodo.getDireccion());
            } catch (Exception e) {
            }

            try {
                cmbDepartamento.setSelectedItem(nodo.getDepartamento());
            } catch (Exception e) {
                cmbDepartamento.addItem(nodo.getDepartamento());
                cmbDepartamento.setSelectedItem(nodo.getDepartamento());
            }

            try {
                cmbCiudad.setSelectedItem(nodo.getCiudad());
            } catch (Exception e) {
                cmbCiudad.addItem(nodo.getCiudad());
                cmbCiudad.setSelectedItem(nodo.getCiudad());
            }
            
            if(nodo.getCodigoMoneda()!= null){
                for(int i = 0; i < jComboMoneda.getItemCount(); i++) {
                    Moneda mon = (Moneda)jComboMoneda.getItemAt(i);
                    if(mon.getCodigo().equals(nodo.getCodigoMoneda())){
                       jComboMoneda.setSelectedItem(mon);
                       break;
                    }
                }
            }
            try {
                txtEmail.setText(nodo.getEmail());
            } catch (Exception e) {
            }

            try {
                dtFechaNacimiento.setCalendar(metodos.haciaDate(nodo.getNacimiento()));
            } catch (Exception e) {
            }

            try {
                if (nodo.getTipo().equals("CEDULA") || nodo.getTipo().equals("CC") || nodo.getTipo().equals("Cedula") || nodo.getTipo().equals("Cédula")) {
                    cmbTipo.setSelectedItem("Cédula de ciudadanía");
                } else if (nodo.getTipo().equals("NIT") || nodo.getTipo().equals("Nit")) {
                    cmbTipo.setSelectedItem("Nit");
                } else {
                    cmbTipo.setSelectedItem(nodo.getTipo());
                }
            } catch (Exception e) {
                Logs.error(e);
            }

            try {
                txtpNombre.setText(nodo.getpNombre());
            } catch (Exception e) {
            }
            try {
                txtsNombre.setText(nodo.getsNombre());
            } catch (Exception e) {
            }
            try {
                txtpApellido.setText(nodo.getpApellido());
            } catch (Exception e) {
            }
            try {
                txtsApellido.setText(nodo.getsApellido());
            } catch (Exception e) {
            }

            try {
                txtOcupacion.setText(nodo.getOcupacion());
            } catch (Exception e) {
            }
            try {
                cmbEstadoCivil.setSelectedItem(nodo.getEstado());
            } catch (Exception e) {
            }

            try {
                cmbRegimen.setSelectedItem(nodo.getRegimen());
            } catch (Exception e) {
            }

            //--------------------------------------------------------
            try {
                cmbTrabajador.setSelectedItem(nodo.getTipoTrabajador());
            } catch (Exception e) {
            }
            try {
                cmbAfiliado.setSelectedItem(nodo.getAfiliado());
            } catch (Exception e) {
            }

            try {
                txtEps.setText(nodo.getEps());
                if (!nodo.getEps().equals("")) {
                    cargarEps(nodo.getEps());
                }

            } catch (Exception e) {
                Logs.error(e);
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
                txtPlazo.setText(nodo.getPlazo());
            } catch (Exception e) {
            }

            try {
                txtCupo.setText(big.setMoneda(big.getBigDecimal(nodo.getCupo())));
            } catch (Exception e) {
            }

            try {
                if (!nodo.getReferido().equals("")) {
                    txtCodigoReferido.setText(nodo.getReferido());
                    cargarReferido();
                }
            } catch (Exception e) {
            }

            try {
                String nombreVendedor = "";
                if (!nodo.getVendedor().equals("")) {
                    nombreVendedor = instancias.getSql().getNombreEmpleado(nodo.getVendedor());
                    cmbVendedor.setSelectedItem(nombreVendedor);
                }
            } catch (Exception e) {
                Logs.error(e);
            }

            try {
                cmbLista.setSelectedItem(nodo.getLista());
            } catch (Exception e) {
            }

            try {
                if (tipo.equals("paciente")) {
                    txtNota1.setText(nodo.getNota());
                } else {
                    txtNota.setText(nodo.getNota());
                }

            } catch (Exception e) {
            }

            try {
                txtReligion.setText(nodo.getReligion());
            } catch (Exception e) {
            }

            try {
                txtNombreMadre.setText(nodo.getNombreMadre());
            } catch (Exception e) {
            }

            try {
                txtNombrePadre.setText(nodo.getNombrePadre());
            } catch (Exception e) {
            }

            try {
                txtNombreResponsable.setText(nodo.getNombreResponsable());
            } catch (Exception e) {
            }

            try {
                cmbParentesco.setSelectedItem(nodo.getParentescoResponsable());
            } catch (Exception e) {
            }

            try {
                txtTelefonoResponsable.setText(nodo.getTelefonoResponsable());
            } catch (Exception e) {
            }

            try {
                cmbSexo.setSelectedItem(nodo.getSexo());
            } catch (Exception e) {
            }

            try {
                txtSangre.setText(nodo.getSangre());
            } catch (Exception e) {
            }
            try {
                txtLugarNacimiento.setText(nodo.getLugarNacimiento());
            } catch (Exception e) {
            }
            try {
                txtBarrio.setText(nodo.getBarrio());
            } catch (Exception e) {
            }

            if (nodo.isResponsableIva()) {
                chkSiResponsableIVA.setSelected(true);
            } else {
                chkNoResponsableIVA.setSelected(true);
            }

            try {
                txtConvenio.setText(nodo.getConvenioActual());
                if (!txtConvenio.getText().equals("")) {
                    ndTercero nodoConv = instancias.getSql().getDatosTercero(txtConvenio.getText());
                    if (nodoConv.getId() != null) {
                        txtNombreConvenio.setText(nodoConv.getCompleta());
//                    cargarConvenio(nodo.getConvenioActual());
                    }
                }
            } catch (Exception e) {
                Logs.error(e);
            }

            txtNombre.setText(nodo.getNombre());

            ImageIcon fot = new ImageIcon(Instancias.getInstancias().getSql().getImagen( "terceros\\" + txtIdSistema.getText() + ".jpg"));
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lbFoto.getWidth(), lbFoto.getHeight(), Image.SCALE_DEFAULT));
            lbFoto.setIcon(icono);
            this.repaint();

            btnGuardar1.setEnabled(true);
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnImprimir.setEnabled(true);
            btnGuardar.setEnabled(false);
            btnImagen.setEnabled(true);

            if (nodo.isActivo()) {
                btnEliminar.setText("ACTIVAR");
                btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png")));
            } else {
                btnEliminar.setText("INACTIVAR");
                btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar2.png")));
            }

            Object[][] placas = instancias.getSql().getPlacasUsuario(nodo.getIdSistema());

            DefaultTableModel modelo = (DefaultTableModel) tblAutos.getModel();

            for (int i = 0; i < placas.length; i++) {
                modelo.addRow(new Object[]{placas[i][1], placas[i][2], placas[i][3], placas[i][4], placas[i][5], placas[i][6], placas[i][7], placas[i][8]});
            }

            return;
        }
        ventanaTerceros(Id, txtId, "");
    }

    public void ventanaTerceros(String nit, JTextField campo, String opcionBuscador) {
        buscClientes buscar = new buscClientes(instancias.getMenu(), rootPaneCheckingEnabled, true, null, "");
        buscar.setLocationRelativeTo(null);
        buscar.setTipoBuscador(opcionBuscador);
        instancias.setBusClientes(buscar);
        instancias.setCampoActual(campo);
        campo.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void ventanaTercerosReferidos(String nit) {
        buscClientes buscar = new buscClientes(instancias.getMenu(), rootPaneCheckingEnabled, true, null, "");
        buscar.setLocationRelativeTo(null);
        instancias.setBusClientes(buscar);
        instancias.setCampoActual(txtCodigoReferido);
        txtCodigoReferido.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void cargarEps(String nit) {
        ndEpsPrecargados nodo = instancias.getSql().getDatosEpsPrecargados(nit);

        if (nodo.getId() != null) {
            txtNomEps.setText(nodo.getNombre());
            txtNomEps.requestFocus();
            return;
        }
        ventanaEps(nit);
    }

    public void setVendedores(String[] Vendedores) {
        cmbVendedor.removeAllItems();
        for (String Vendedore : Vendedores) {
            cmbVendedor.addItem(Vendedore);
        }
    }

    public void cargarConvenio(String nit) {
        txtConvenio.setText(nit);

        ndConvenio nodo = instancias.getSql().getDatosConvenio(nit, "nit");

        if (nodo.getNit() != null) {
            txtNombreConvenio.setText(nodo.getConvenio());
            txtConvenio.requestFocus();
            return;
        }
        ventanaConvenio(nit);
    }

    public void ventanaConvenio(String nit) {
        buscConvenio buscar = new buscConvenio(instancias.getMenu(), rootPaneCheckingEnabled);
        buscar.setLocationRelativeTo(null);
        buscar.setOpc(1);
        instancias.setBuscConvenio(buscar);
        instancias.setCampoActual(txtConvenio);
        txtConvenio.requestFocus();
        buscar.setInstancia(instancias);
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void ventanaEps(String nit) {
        buscEpsPrecargadas buscar = new buscEpsPrecargadas(instancias.getMenu(), rootPaneCheckingEnabled);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscEpsPre(buscar);
        instancias.setCampoActual(txtEps);
        txtEps.requestFocus();
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void limpiarPanel(JPanel panel) {
        for (int x = 0; x < panel.getComponentCount(); x++) {
            try {
                if (panel.getComponent(x) instanceof JTextField) {
                    JTextField textField = (JTextField) panel.getComponent(x);
                    textField.setText("");
                } else if (panel.getComponent(x) instanceof JComboBox) {
                    JComboBox comboBox = (JComboBox) panel.getComponent(x);
                    comboBox.setSelectedIndex(0);
                } else if (panel.getComponent(x) instanceof JTextArea) {
                    JTextArea textArea = (JTextArea) panel.getComponent(x);
                    textArea.setText("");
                }
            } catch (Exception e) {
                Logs.error(e);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscTerceros;
    private javax.swing.JButton btnBuscTerceros1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnImagen;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox chkNoResponsableIVA;
    private javax.swing.JCheckBox chkSiResponsableIVA;
    private javax.swing.JComboBox cmbAfiliado;
    private javax.swing.JComboBox cmbCiudad;
    private javax.swing.JComboBox cmbDepartamento;
    private javax.swing.JComboBox cmbEstadoCivil;
    private javax.swing.JComboBox cmbLista;
    private javax.swing.JComboBox cmbNaturaleza;
    private javax.swing.JComboBox cmbPaises;
    private javax.swing.JComboBox cmbParentesco;
    private javax.swing.JComboBox cmbRegimen;
    private javax.swing.JComboBox cmbRut;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JComboBox cmbTrabajador;
    private javax.swing.JComboBox cmbVendedor;
    private javax.swing.JComboBox cmbZona;
    private datechooser.beans.DateChooserCombo dtFechaCompra;
    private com.toedter.calendar.JDateChooser dtFechaNacimiento;
    private javax.swing.ButtonGroup grpResponsableIva;
    private javax.swing.ButtonGroup grupoConvenio;
    private javax.swing.ButtonGroup grupoResidencia;
    private javax.swing.JComboBox<Object> jComboMoneda;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbBarrio;
    private javax.swing.JLabel lbBarrio1;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCiudad;
    private javax.swing.JLabel lbCiudad11;
    private javax.swing.JLabel lbCiudad12;
    private javax.swing.JLabel lbCiudad13;
    private javax.swing.JLabel lbCiudad14;
    private javax.swing.JLabel lbCiudad15;
    private javax.swing.JLabel lbCiudad19;
    private javax.swing.JLabel lbCiudad20;
    private javax.swing.JLabel lbCiudad21;
    private javax.swing.JLabel lbCiudad22;
    private javax.swing.JLabel lbCiudad23;
    private javax.swing.JLabel lbCiudad24;
    private javax.swing.JLabel lbCiudad3;
    private javax.swing.JLabel lbCiudad6;
    private javax.swing.JLabel lbCiudad7;
    private javax.swing.JLabel lbCiudad9;
    private javax.swing.JLabel lbCupo;
    private javax.swing.JLabel lbCupo1;
    private javax.swing.JLabel lbCupo6;
    private javax.swing.JLabel lbDepartamento;
    private javax.swing.JLabel lbDepartamento3;
    private javax.swing.JLabel lbDepartamento5;
    private javax.swing.JLabel lbDireccion1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmail11;
    private javax.swing.JLabel lbEmail2;
    private javax.swing.JLabel lbEmail3;
    private javax.swing.JLabel lbEmail4;
    private javax.swing.JLabel lbEmail5;
    private javax.swing.JLabel lbEmail6;
    private javax.swing.JLabel lbEmail7;
    private javax.swing.JLabel lbEmail8;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbFecha1;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbInfoObligatorios;
    private javax.swing.JLabel lbNit;
    private javax.swing.JLabel lbNit1;
    private javax.swing.JLabel lbNit2;
    private javax.swing.JLabel lbNit3;
    private javax.swing.JLabel lbNota;
    private javax.swing.JLabel lbPNombre;
    private javax.swing.JLabel lbPais;
    private javax.swing.JLabel lbPlazo;
    private javax.swing.JLabel lbPlazo1;
    private javax.swing.JLabel lbPlazo2;
    private javax.swing.JLabel lbPlazo3;
    private javax.swing.JLabel lbPlazo4;
    private javax.swing.JLabel lbPlazo5;
    private javax.swing.JLabel lbRazon;
    private javax.swing.JLabel lbSNombre;
    private javax.swing.JLabel lbSapellido;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbVendedor;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlInvisible;
    private javax.swing.JMenuItem popBorrar;
    private javax.swing.JScrollPane scrFormulario;
    private javax.swing.JTable tblAutos;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtChasis;
    private javax.swing.JTextField txtCodPostal;
    private javax.swing.JTextField txtCodigoReferido;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtConvenio;
    private javax.swing.JTextField txtCupo;
    private javax.swing.JTextField txtDigito;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEps;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdSistema;
    private javax.swing.JTextField txtLugarNacimiento;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtNomEps;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreConvenio;
    private javax.swing.JTextField txtNombreMadre;
    private javax.swing.JTextField txtNombrePadre;
    private javax.swing.JTextField txtNombreReferido;
    private javax.swing.JTextField txtNombreResponsable;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JTextArea txtNota1;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPlazo;
    private javax.swing.JTextField txtReligion;
    private javax.swing.JTextField txtSangre;
    private javax.swing.JTextField txtTarjeta;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoResponsable;
    private javax.swing.JTextField txtTipoCliente;
    private javax.swing.JTextField txtTipoVehiculo;
    private javax.swing.JTextField txtpApellido;
    private javax.swing.JTextField txtpNombre;
    private javax.swing.JTextField txtsApellido;
    private javax.swing.JTextField txtsNombre;
    // End of variables declaration//GEN-END:variables
}
