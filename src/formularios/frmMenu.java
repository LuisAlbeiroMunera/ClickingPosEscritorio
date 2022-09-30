package formularios;
import logs.Logs;
import clases.Instancias;
import clases.alertasHospitalizacionVeterinario;
import clases.metodosGenerales;
import clases.ocultarAlerta;
import clases.recordatorios.alertaRecordatorio;
import clases.solicitudesPermisos;
import configuracion.Propiedades;
import configuracion.dlgConfiguraciones;
import configuracion.dlgPermisos;
import configuracion.infPlantillas;
import configuracion.msgSalir;
import formulario.corresponsal.*;
import formularios.Agenda.infAgendaConsulta;
import formularios.Agenda.infRepAgenda;

import formularios.Cartera.infAbonos;
import formularios.Cartera.infNC;
import formularios.Cartera.infND;
import formularios.Cartera.infPagos;
import formularios.Cartera.infRepAbonos;
import formularios.Cartera.infRepAbonosCxp;
import formularios.Cartera.infRepCartera;
import formularios.Cartera.infRepNc;
import formularios.Cartera.infRepPagos;
import formularios.Contable.infCentroCostos;
import formularios.Contable.infComprobantes;
import formularios.Contable.infEstructura;
import formularios.Contable.infInterfase;
import formularios.Contable.infPUC;
import formularios.Contable.infReportesContables;

import formularios.Tesoreria.infCodsEgresos;
import formularios.Tesoreria.infEgresos;
import formularios.Tesoreria.infRepEgresos;
import formularios.Labotario.infAcidoUrico;
import formularios.Labotario.infAcidos;
import formularios.Labotario.infAntiestreptolisina;
import formularios.Labotario.infCannabinoides;
import formularios.Labotario.infCitoquimico;
import formularios.Labotario.infCocaina;
import formularios.Labotario.infColesterol;
import formularios.Labotario.infCoprograma;
import formularios.Labotario.infCoprologico;
import formularios.Labotario.infCreatinina;
import formularios.Labotario.infDirecto;
import formularios.Labotario.infEmbarazo;
import formularios.Labotario.infGlicemia;
import formularios.Labotario.infHemoclasificacion;
import formularios.Labotario.infHemoglobina;
import formularios.Labotario.infHemograma;
import formularios.Labotario.infHistoriaLaboratorio;
import formularios.Labotario.infKoh;
import formularios.Labotario.infPerfil;
import formularios.Labotario.infProteina;
import formularios.Labotario.infSangreOculta;
import formularios.Labotario.infSerologia;
import formularios.Labotario.infTiempos;
import formularios.Medico.infAyudaDiagnostico;
import formularios.Medico.infContraremision;
import formularios.Medico.infConvenio;
import formularios.Medico.infEps;
import formularios.Medico.infFormatosDeTextos;
import formularios.Medico.infFormulaMedica;
import formularios.Medico.infHistoriaC;
import formularios.Medico.infHistoriaMedica;
import formularios.Medico.infIncapacidad;
import formularios.Medico.infMedicamentos;
import formularios.Medico.infNotaEnfermeria;
import formularios.Medico.infOrdenServicioMedico;
import formularios.Medico.infRemision;
import formularios.Medico.infReportesMedico;
import formularios.Medico.infRips;
import formularios.Oftalmologia.infAyudaDiagnosticoOf;
import formularios.Oftalmologia.infBiometria;
import formularios.Oftalmologia.infFormulaLentesOf;
import formularios.Oftalmologia.infFormulaMedicaOf;
import formularios.Oftalmologia.infHojaIngreso;
import formularios.Oftalmologia.infIncapacidadOf;
import formularios.Oftalmologia.infPaquimetria;
import formularios.PTM.infInicioPTM;
import formularios.Parqueadero.infLavadero;
import formularios.Parqueadero.infMensualidad;
import formularios.Parqueadero.infParqueadero;
import formularios.Parqueadero.infRepHistorial;
import formularios.Parqueadero.infRepLavadero;
import formularios.Parqueadero.infRepLavadero1;
import formularios.Parqueadero.infRepMensualidades;
import formularios.Parqueadero.infRepParqueadero;

import formularios.Tesoreria.infBancos;
import formularios.Tesoreria.infRepBancos;
import formularios.Tesoreria.infCaja;
import formularios.Tesoreria.infRepCuadre;
import formularios.Ventas.buscFacturasElectronicasDian;

import formularios.Ventas.infAnula;
import formularios.Ventas.infCotiza;
import formularios.Ventas.infCuentaCobro;
import formularios.Ventas.infFactura;
import formularios.Ventas.infFacturaCreditos;
import formularios.Ventas.infFacturarLotes;
import formularios.Ventas.infMesas;
import formularios.Ventas.infReimpresion;
import formularios.Ventas.infMesa;
import formularios.Ventas.infMesas1;
import formularios.Ventas.infOrdenServicio;
import formularios.Ventas.infPedido;
import formularios.Ventas.infPlanSepare;
import formularios.Ventas.infPreparacion;
import formularios.Ventas.infReportesVentas;
import formularios.Veterinario.dlgMedicamentosPendientes;
import formularios.Veterinario.infAlertasProximas;
import formularios.Veterinario.infAyudaDiagnosticoVeterinaria;
import formularios.Veterinario.infFormatos;
import formularios.Veterinario.infFormulaMedicaVeterinaria;
import formularios.Veterinario.infGuarderia;
import formularios.Veterinario.infHistoria;
import formularios.Veterinario.infHospitalizacion;
import formularios.Veterinario.infIngresoHospitalizacion;

import formularios.productos.dlgConsultarCodigos;
import formularios.productos.infGrupos;
import formularios.productos.infIngreso;
import formularios.productos.infModificarPrecio;
import formularios.productos.infProductos;
import formularios.productos.infArmado;
import formularios.productos.infCosteo;

import formularios.terceros.infBodegas;
import formularios.terceros.infClientes;
import formularios.terceros.infEmpleados;
import formularios.terceros.infProveedores;
import formularios.terceros.infRepClientes;
import formularios.terceros.infRepEmpleados;
import formularios.terceros.infRepProveedores;

import formularios.Veterinario.infMascotas;
import formularios.Veterinario.infPeluqueria;
import formularios.Veterinario.infQuirurgica;
import formularios.Veterinario.infRemisionVeterinaria;
import formularios.Veterinario.infRepGuarderia;
import formularios.Veterinario.infRepHospitalizacion;
import formularios.Veterinario.infRepMascotas;
import formularios.Veterinario.infRepPeluqueria;

import formularios.productos.infAjustesInv;
import formularios.productos.infAjustesInventarioTotal;
import formularios.productos.infInventarioInicial;
import formularios.productos.infKardexProductos;
import formularios.productos.infOrdenCompra;
import formularios.productos.infPrestamos;
import formularios.productos.infReportesProductos;
import formularios.productos.infTrasladosInternos;
import formularios.recordatorios.infRecordatorios;
import formularios.terceros.infBodegasClientes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

public class frmMenu extends javax.swing.JFrame {

    private final Rectangle desktop;
    private final metodosGenerales metodos;
    private Instancias instancias;
    private Rectangle MENU, SUBMENU;
    boolean seVeElMenu;
    private JInternalFrame[] formularios, anula, caja, cartera;
    ServerSocket SERVER_SOCKETE;

    Object[] datos;
    Boolean noAbrir = true;

    public frmMenu() {
        initComponents();
        MENU = pnlMenu.getBounds();
        SUBMENU = pnlMenu.getBounds();

        this.setLocationRelativeTo(null);
        desktop = dkpFormularios.getBounds();
        metodos = new metodosGenerales();

        seVeElMenu = true;
        setTitle("CLICK.");
        instancias = Instancias.getInstancias();
        String version = instancias.getSql().getVersion();
        lbVersion1.setText("Versión: "+version);
        lbVersion.setText("V: "+version);
        JInternalFrame[] forms = {null, null, null, null, null, null, null, null, null, null};
        btnVeterinario.setVisible(false);
        //jButton1.setVisible(false);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cerrar();
            }
        });

        configurarAtajos();

        pnlMensaje.setVisible(false);
        pnlMiniaturas.setVisible(false);
        pnlOpcionesPeque.setVisible(false);

        datos = instancias.getSql().getDatosMaestra();

//        ((JPanelConFondo) pnlPrincipal).setImagen("fonInicio.png");

    this.addWindowStateListener(new WindowStateListener() {
        public void windowStateChanged(WindowEvent e) {
            //minimized
            if ((e.getNewState() & Frame.ICONIFIED) == Frame.ICONIFIED){
            //maximized    
            } else if ((e.getNewState() & Frame.NORMAL) == Frame.NORMAL){
                ajustarPantalla();
             }
            }
         });
    }
    
    

    public void asignarNombre(String nombre) {
        lbNombre.setText(nombre);
    }

    
    public void ajustarPantalla() {
        Dimension newScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setMaximumSize(newScreenSize);
        this.setSize(newScreenSize);
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void cargarSocket() {

        //QUITAR ESTO PARA NO PERMITIR ENTRAR DOS PROGREAMAS AL MISMO TIEMPO 
        try {
            SERVER_SOCKETE = new ServerSocket(1779);
            Dimension newScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
            this.setMaximumSize(newScreenSize);
            this.setSize(newScreenSize);
            //  this.setSize(new java.awt.Dimension(600, 800));
        } catch (Exception x) {
            Logs.error(x);
            //Informo al usuario
//            JOptionPane.showMessageDialog(null, "EL SISTEMA YA SE ENCUENTRA EN EJECUCIÓN, ¡ YA HAY UNA SESIÓN ABIERTA !", "PRECAUCIÓN", JOptionPane.WARNING_MESSAGE);
//            //En esta parte cierro la segunda instancia de la aplicación que se intenta abrir
//            System.exit(0);
        }
    }
    

    private void configurarAtajos() {
        KeyStroke F2 = KeyStroke.getKeyStroke("F2");
        dkpFormularios.registerKeyboardAction(accion("facturar"), "FACTURA", F2, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke CTRL_S = KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("expcont"), "EXPCONT", CTRL_S, JComponent.WHEN_IN_FOCUSED_WINDOW);

        //BOTONES MODULOS
        KeyStroke ALT_1 = KeyStroke.getKeyStroke(KeyEvent.VK_1, Event.ALT_MASK);
        dkpFormularios.registerKeyboardAction(accion("modulo1"), "MODULO1", ALT_1, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke ALT_2 = KeyStroke.getKeyStroke(KeyEvent.VK_2, Event.ALT_MASK);
        dkpFormularios.registerKeyboardAction(accion("modulo2"), "MODULO2", ALT_2, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke ALT_3 = KeyStroke.getKeyStroke(KeyEvent.VK_3, Event.ALT_MASK);
        dkpFormularios.registerKeyboardAction(accion("modulo3"), "MODULO3", ALT_3, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke ALT_4 = KeyStroke.getKeyStroke(KeyEvent.VK_4, Event.ALT_MASK);
        dkpFormularios.registerKeyboardAction(accion("modulo4"), "MODULO4", ALT_4, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke ALT_5 = KeyStroke.getKeyStroke(KeyEvent.VK_5, Event.ALT_MASK);
        dkpFormularios.registerKeyboardAction(accion("modulo5"), "MODULO5", ALT_5, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke ALT_6 = KeyStroke.getKeyStroke(KeyEvent.VK_6, Event.ALT_MASK);
        dkpFormularios.registerKeyboardAction(accion("modulo6"), "MODULO6", ALT_6, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke ALT_7 = KeyStroke.getKeyStroke(KeyEvent.VK_7, Event.ALT_MASK);
        dkpFormularios.registerKeyboardAction(accion("modulo7"), "MODULO7", ALT_7, JComponent.WHEN_IN_FOCUSED_WINDOW);

        //BOTONES OPCIONES
        KeyStroke CTRL_1 = KeyStroke.getKeyStroke(KeyEvent.VK_1, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("boton1"), "BOTON1", CTRL_1, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke CTRL_2 = KeyStroke.getKeyStroke(KeyEvent.VK_2, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("boton2"), "BOTON2", CTRL_2, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke CTRL_3 = KeyStroke.getKeyStroke(KeyEvent.VK_3, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("boton3"), "BOTON3", CTRL_3, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke CTRL_4 = KeyStroke.getKeyStroke(KeyEvent.VK_4, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("boton4"), "BOTON4", CTRL_4, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke CTRL_5 = KeyStroke.getKeyStroke(KeyEvent.VK_5, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("boton5"), "BOTON5", CTRL_5, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke CTRL_6 = KeyStroke.getKeyStroke(KeyEvent.VK_6, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("boton6"), "BOTON6", CTRL_6, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke CTRL_7 = KeyStroke.getKeyStroke(KeyEvent.VK_7, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("boton7"), "BOTON7", CTRL_7, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke CTRL_8 = KeyStroke.getKeyStroke(KeyEvent.VK_8, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("boton8"), "BOTON8", CTRL_8, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke CTRL_9 = KeyStroke.getKeyStroke(KeyEvent.VK_9, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("boton9"), "BOTON9", CTRL_9, JComponent.WHEN_IN_FOCUSED_WINDOW);

        KeyStroke CTRL_10 = KeyStroke.getKeyStroke(KeyEvent.VK_0, Event.CTRL_MASK);
        dkpFormularios.registerKeyboardAction(accion("boton10"), "BOTON10", CTRL_10, JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    private ActionListener accion(final String opc) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
                    case "facturar":
                        if (noAbrir) {
                            actualizarMenu("ventas");
                            lbItem1ActionPerformed(null);
                        }
                        break;
                    case "expcont":
                        if (noAbrir) {
                            btnOcultarActionPerformed(null);
                        }
                        break;
                    case "boton1":
                        try {
                            lbItem1ActionPerformed(null);
                        } catch (Exception ex) {
                            Logs.error(ex);
                        }
                        break;
                    case "boton2":
                        try {
                            lbItem2ActionPerformed(null);
                        } catch (Exception ex) {
                            Logs.error(ex);
                        }
                        break;
                    case "boton3":
                        try {
                            lbItem3ActionPerformed(null);
                        } catch (Exception ex) {
                            Logs.error(ex);
                        }
                        break;
                    case "boton4":
                        try {
                            lbItem4ActionPerformed(null);
                        } catch (Exception ex) {
                            Logs.error(ex);
                        }
                        break;
                    case "boton5":
                        try {
                            lbItem5ActionPerformed(null);
                        } catch (Exception ex) {
                            Logs.error(ex);
                        }
                        break;
                    case "boton6":
                        try {
                            lbItem6ActionPerformed(null);
                        } catch (Exception ex) {
                            Logs.error(ex);
                        }
                        break;
                    case "boton7":
                        try {
                            lbItem7ActionPerformed(null);
                        } catch (Exception ex) {
                            Logs.error(ex);
                        }
                        break;
                    case "boton8":
                        try {
                            lbItem8ActionPerformed(null);
                        } catch (Exception ex) {
                            Logs.error(ex);
                        }
                        break;
                    case "boton9":
                        try {
                            lbItem9ActionPerformed(null);
                        } catch (Exception ex) {
                            Logs.error(ex);
                        }
                        break;
                    case "boton10":
                        try {
                            lbItem10ActionPerformed(null);
                        } catch (Exception ex) {
                            Logs.error(ex);
                        }
                        break;
                    case "modulo1":
                        animacion("ventas");
                        break;
                    case "modulo2":
                        animacion("productos");
                        break;
                    case "modulo3":
                        animacion("terceros");
                        break;
                    case "modulo4":
                        animacion("egresos");
                        break;
                    case "modulo5":
                        animacion("cartera");
                        break;
                    case "modulo6":
                        btnTesoreriaActionPerformed(null);
                        break;
                    case "modulo7":
                        btnVerificarActionPerformed(null);
                        break;

                }
            }
        };
        return a;
    }

    public void actualizarUsuario(String usuario) {
        setTitle("CLICK - 2.5");
        lbUsuario.setText(usuario);
        lbFecha.setText(metodosGenerales.fecha());
    }

    private void cerrar() {
        if (btnSalir.isEnabled()) {
            msgSalir salir = new msgSalir(this, seVeElMenu, "");
            salir.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpFormularios = new javax.swing.JDesktopPane();
        pnlContenedor = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lbLogo = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        jPanelsSliding1 = new formularios.JPanelsSliding();
        jPanel3 = new javax.swing.JPanel();
        lbItem1 = new javax.swing.JButton();
        lbItem2 = new javax.swing.JButton();
        lbItem3 = new javax.swing.JButton();
        lbItem4 = new javax.swing.JButton();
        lbItem5 = new javax.swing.JButton();
        lbItem6 = new javax.swing.JButton();
        lbItem7 = new javax.swing.JButton();
        lbItem8 = new javax.swing.JButton();
        lbItem9 = new javax.swing.JButton();
        lbItem10 = new javax.swing.JButton();
        lbItem11 = new javax.swing.JButton();
        lbItem12 = new javax.swing.JButton();
        lbItem13 = new javax.swing.JButton();
        lbItem14 = new javax.swing.JButton();
        lbItem15 = new javax.swing.JButton();
        lbItem16 = new javax.swing.JButton();
        lbItem17 = new javax.swing.JButton();
        lbItem18 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnTerceros = new javax.swing.JButton();
        btnTesoreria = new javax.swing.JButton();
        btnCartera = new javax.swing.JButton();
        btnAbrirCaja = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnVeterinario = new javax.swing.JButton();
        btnMedico = new javax.swing.JButton();
        btnOftalmologia = new javax.swing.JButton();
        btnPTM = new javax.swing.JButton();
        btnParqueadero = new javax.swing.JButton();
        btnLaboratorio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnVerificar = new javax.swing.JButton();
        btnContable = new javax.swing.JButton();
        btnCorresponsalWeb = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnConfig = new javax.swing.JButton();
        lbVentas7 = new javax.swing.JButton();
        lbVersion1 = new javax.swing.JLabel();
        btnRecordatorios = new javax.swing.JButton();
        pnlMensaje = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        msg = new javax.swing.JEditorPane();
        btnOcultar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCambiarUsuario = new javax.swing.JButton();
        lbUsuario = new javax.swing.JLabel();
        btnSolicitudes = new javax.swing.JButton();
        sep2 = new javax.swing.JSeparator();
        lbTitulo = new javax.swing.JLabel();
        sep3 = new javax.swing.JSeparator();
        btnMedicamentos = new javax.swing.JButton();
        sep4 = new javax.swing.JSeparator();
        cmbAccesos = new javax.swing.JComboBox();
        btnMedicamentos1 = new javax.swing.JButton();
        sep5 = new javax.swing.JSeparator();
        pnlOpcionesPeque = new javax.swing.JPanel();
        item8 = new javax.swing.JButton();
        item1 = new javax.swing.JButton();
        item2 = new javax.swing.JButton();
        item3 = new javax.swing.JButton();
        item4 = new javax.swing.JButton();
        item5 = new javax.swing.JButton();
        item6 = new javax.swing.JButton();
        item7 = new javax.swing.JButton();
        item9 = new javax.swing.JButton();
        item10 = new javax.swing.JButton();
        item11 = new javax.swing.JButton();
        item12 = new javax.swing.JButton();
        item13 = new javax.swing.JButton();
        pnlMiniaturas = new javax.swing.JPanel();
        lbVentas8 = new javax.swing.JButton();
        lbVentas9 = new javax.swing.JButton();
        lbVentas10 = new javax.swing.JButton();
        lbVentas11 = new javax.swing.JButton();
        lbVentas12 = new javax.swing.JButton();
        lbAgenda1 = new javax.swing.JButton();
        lbVeterinaria1 = new javax.swing.JButton();
        lbConfiguraciones = new javax.swing.JButton();
        btnConexion = new javax.swing.JButton();
        lbMedico1 = new javax.swing.JButton();
        lbPTM = new javax.swing.JButton();
        lbVersion = new javax.swing.JLabel();
        btnParqueadero1 = new javax.swing.JButton();
        btnContable1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbNombreEmpresa = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        setMinimumSize(getPreferredSize());
        setUndecorated(true);
        setSize(preferredSize());
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        javax.swing.GroupLayout dkpFormulariosLayout = new javax.swing.GroupLayout(dkpFormularios);
        dkpFormularios.setLayout(dkpFormulariosLayout);
        dkpFormulariosLayout.setHorizontalGroup(
            dkpFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dkpFormulariosLayout.setVerticalGroup(
            dkpFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlMenu.setBackground(new java.awt.Color(242, 244, 244));
        pnlMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMenuMouseClicked(evt);
            }
        });

        lbLogo.setBackground(new java.awt.Color(242, 244, 244));
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoNuevo.png"))); // NOI18N
        lbLogo.setBorder(null);
        lbLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbLogoActionPerformed(evt);
            }
        });

        pnlPrincipal.setBackground(new java.awt.Color(242, 244, 244));

        jPanelsSliding1.setBackground(new java.awt.Color(242, 244, 244));
        jPanelsSliding1.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(242, 244, 244));
        jPanel3.setName("panel"); // NOI18N

        lbItem1.setBackground(new java.awt.Color(255, 255, 255));
        lbItem1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem1.setText("COTIZACION");
        lbItem1.setBorderPainted(false);
        lbItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem1.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem1ActionPerformed(evt);
            }
        });

        lbItem2.setBackground(new java.awt.Color(255, 255, 255));
        lbItem2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem2.setText("COTIZACION");
        lbItem2.setBorderPainted(false);
        lbItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem2.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem2ActionPerformed(evt);
            }
        });

        lbItem3.setBackground(new java.awt.Color(255, 255, 255));
        lbItem3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem3.setText("COTIZACION");
        lbItem3.setBorderPainted(false);
        lbItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem3.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem3ActionPerformed(evt);
            }
        });

        lbItem4.setBackground(new java.awt.Color(255, 255, 255));
        lbItem4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem4.setText("COTIZACION");
        lbItem4.setBorderPainted(false);
        lbItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem4.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem4ActionPerformed(evt);
            }
        });

        lbItem5.setBackground(new java.awt.Color(255, 255, 255));
        lbItem5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem5.setText("COTIZACION");
        lbItem5.setBorderPainted(false);
        lbItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem5.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem5ActionPerformed(evt);
            }
        });

        lbItem6.setBackground(new java.awt.Color(255, 255, 255));
        lbItem6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem6.setText("COTIZACION");
        lbItem6.setBorderPainted(false);
        lbItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem6.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem6ActionPerformed(evt);
            }
        });

        lbItem7.setBackground(new java.awt.Color(255, 255, 255));
        lbItem7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem7.setText("COTIZACION");
        lbItem7.setBorderPainted(false);
        lbItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem7.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem7ActionPerformed(evt);
            }
        });

        lbItem8.setBackground(new java.awt.Color(255, 255, 255));
        lbItem8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem8.setText("COTIZACION");
        lbItem8.setBorderPainted(false);
        lbItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem8.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem8ActionPerformed(evt);
            }
        });

        lbItem9.setBackground(new java.awt.Color(255, 255, 255));
        lbItem9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem9.setText("COTIZACION");
        lbItem9.setBorderPainted(false);
        lbItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem9.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem9ActionPerformed(evt);
            }
        });

        lbItem10.setBackground(new java.awt.Color(255, 255, 255));
        lbItem10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem10.setText("COTIZACION");
        lbItem10.setBorderPainted(false);
        lbItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem10.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem10ActionPerformed(evt);
            }
        });

        lbItem11.setBackground(new java.awt.Color(255, 255, 255));
        lbItem11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem11.setText("COTIZACION");
        lbItem11.setBorderPainted(false);
        lbItem11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem11.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem11ActionPerformed(evt);
            }
        });

        lbItem12.setBackground(new java.awt.Color(255, 255, 255));
        lbItem12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem12.setText("COTIZACION");
        lbItem12.setBorderPainted(false);
        lbItem12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem12.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem12ActionPerformed(evt);
            }
        });

        lbItem13.setBackground(new java.awt.Color(255, 255, 255));
        lbItem13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem13.setText("COTIZACION");
        lbItem13.setBorderPainted(false);
        lbItem13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem13.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem13ActionPerformed(evt);
            }
        });

        lbItem14.setBackground(new java.awt.Color(255, 255, 255));
        lbItem14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem14.setText("COTIZACION");
        lbItem14.setBorderPainted(false);
        lbItem14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem14.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem14ActionPerformed(evt);
            }
        });

        lbItem15.setBackground(new java.awt.Color(255, 255, 255));
        lbItem15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem15.setText("COTIZACION");
        lbItem15.setBorderPainted(false);
        lbItem15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem15.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem15ActionPerformed(evt);
            }
        });

        lbItem16.setBackground(new java.awt.Color(255, 255, 255));
        lbItem16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem16.setText("COTIZACION");
        lbItem16.setBorderPainted(false);
        lbItem16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem16.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem16ActionPerformed(evt);
            }
        });

        lbItem17.setBackground(new java.awt.Color(255, 255, 255));
        lbItem17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem17.setText("COTIZACION");
        lbItem17.setBorderPainted(false);
        lbItem17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem17.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem17ActionPerformed(evt);
            }
        });

        lbItem18.setBackground(new java.awt.Color(255, 255, 255));
        lbItem18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        lbItem18.setText("COTIZACION");
        lbItem18.setBorderPainted(false);
        lbItem18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbItem18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbItem18.setMargin(new java.awt.Insets(2, 0, 2, 0));
        lbItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbItem18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbItem1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(lbItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbItem18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbItem1)
                .addGap(0, 0, 0)
                .addComponent(lbItem2)
                .addGap(0, 0, 0)
                .addComponent(lbItem3)
                .addGap(0, 0, 0)
                .addComponent(lbItem4)
                .addGap(0, 0, 0)
                .addComponent(lbItem5)
                .addGap(0, 0, 0)
                .addComponent(lbItem6)
                .addGap(0, 0, 0)
                .addComponent(lbItem7)
                .addGap(0, 0, 0)
                .addComponent(lbItem8)
                .addGap(0, 0, 0)
                .addComponent(lbItem9)
                .addGap(0, 0, 0)
                .addComponent(lbItem10)
                .addGap(0, 0, 0)
                .addComponent(lbItem11)
                .addGap(0, 0, 0)
                .addComponent(lbItem12)
                .addGap(0, 0, 0)
                .addComponent(lbItem13)
                .addGap(0, 0, 0)
                .addComponent(lbItem14)
                .addGap(0, 0, 0)
                .addComponent(lbItem15)
                .addGap(0, 0, 0)
                .addComponent(lbItem16)
                .addGap(0, 0, 0)
                .addComponent(lbItem17)
                .addGap(0, 0, 0)
                .addComponent(lbItem18))
        );

        jPanelsSliding1.add(jPanel3, "card2");

        jPanel4.setBackground(new java.awt.Color(242, 244, 244));

        btnVentas.setBackground(new java.awt.Color(214, 214, 214));
        btnVentas.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VENTAS-NEGRO.png"))); // NOI18N
        btnVentas.setText(" MIS VENTAS");
        btnVentas.setBorder(null);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(214, 214, 214));
        btnProductos.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PRODUCTOS-NEGRO.png"))); // NOI18N
        btnProductos.setText(" PRODUCTOS");
        btnProductos.setBorder(null);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProductos.setMaximumSize(new java.awt.Dimension(146, 119));
        btnProductos.setMinimumSize(new java.awt.Dimension(146, 119));
        btnProductos.setPreferredSize(new java.awt.Dimension(146, 119));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnTerceros.setBackground(new java.awt.Color(214, 214, 214));
        btnTerceros.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnTerceros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TERCEROS-NEGRO.png"))); // NOI18N
        btnTerceros.setText(" TERCEROS");
        btnTerceros.setBorder(null);
        btnTerceros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTerceros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTerceros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTercerosActionPerformed(evt);
            }
        });

        btnTesoreria.setBackground(new java.awt.Color(214, 214, 214));
        btnTesoreria.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnTesoreria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TESORERIA-NEGRO.png"))); // NOI18N
        btnTesoreria.setText(" TESORERIA");
        btnTesoreria.setBorder(null);
        btnTesoreria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTesoreria.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTesoreria.setMaximumSize(new java.awt.Dimension(146, 121));
        btnTesoreria.setMinimumSize(new java.awt.Dimension(146, 121));
        btnTesoreria.setPreferredSize(new java.awt.Dimension(146, 121));
        btnTesoreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesoreriaActionPerformed(evt);
            }
        });

        btnCartera.setBackground(new java.awt.Color(214, 214, 214));
        btnCartera.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnCartera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CARTERA-NEGRO.png"))); // NOI18N
        btnCartera.setText(" CARTERA");
        btnCartera.setBorder(null);
        btnCartera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCartera.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCartera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarteraActionPerformed(evt);
            }
        });

        btnAbrirCaja.setBackground(new java.awt.Color(204, 204, 204));
        btnAbrirCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja Reg.png"))); // NOI18N
        btnAbrirCaja.setText("Abrir Caja");
        btnAbrirCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCajaActionPerformed(evt);
            }
        });

        btnAgenda.setBackground(new java.awt.Color(214, 214, 214));
        btnAgenda.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AGENDA-NEGRO.png"))); // NOI18N
        btnAgenda.setText(" AGENDA");
        btnAgenda.setBorder(null);
        btnAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });

        btnVeterinario.setBackground(new java.awt.Color(214, 214, 214));
        btnVeterinario.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VETERINARIO-NEGRO.png"))); // NOI18N
        btnVeterinario.setText(" VETERINARIO");
        btnVeterinario.setBorder(null);
        btnVeterinario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeterinarioActionPerformed(evt);
            }
        });

        btnMedico.setBackground(new java.awt.Color(214, 214, 214));
        btnMedico.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MEDICO-NEGRO.png"))); // NOI18N
        btnMedico.setText("MEDICO");
        btnMedico.setBorder(null);
        btnMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMedico.setMaximumSize(new java.awt.Dimension(146, 119));
        btnMedico.setMinimumSize(new java.awt.Dimension(146, 119));
        btnMedico.setPreferredSize(new java.awt.Dimension(146, 119));
        btnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoActionPerformed(evt);
            }
        });

        btnOftalmologia.setBackground(new java.awt.Color(214, 214, 214));
        btnOftalmologia.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnOftalmologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MEDICO-NEGRO.png"))); // NOI18N
        btnOftalmologia.setText("OFTALMOLOGIA");
        btnOftalmologia.setBorder(null);
        btnOftalmologia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOftalmologia.setMaximumSize(new java.awt.Dimension(146, 119));
        btnOftalmologia.setMinimumSize(new java.awt.Dimension(146, 119));
        btnOftalmologia.setPreferredSize(new java.awt.Dimension(146, 119));
        btnOftalmologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOftalmologiaActionPerformed(evt);
            }
        });

        btnPTM.setBackground(new java.awt.Color(214, 214, 214));
        btnPTM.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnPTM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PTM-NEGRO.png"))); // NOI18N
        btnPTM.setText("PTM");
        btnPTM.setBorder(null);
        btnPTM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPTM.setMaximumSize(new java.awt.Dimension(146, 119));
        btnPTM.setMinimumSize(new java.awt.Dimension(146, 119));
        btnPTM.setPreferredSize(new java.awt.Dimension(146, 119));
        btnPTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPTMActionPerformed(evt);
            }
        });

        btnParqueadero.setBackground(new java.awt.Color(214, 214, 214));
        btnParqueadero.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnParqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PARQUEADERO-NEGRO.png"))); // NOI18N
        btnParqueadero.setText("PARQUEADERO");
        btnParqueadero.setBorder(null);
        btnParqueadero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParqueadero.setMaximumSize(new java.awt.Dimension(146, 119));
        btnParqueadero.setMinimumSize(new java.awt.Dimension(146, 119));
        btnParqueadero.setPreferredSize(new java.awt.Dimension(146, 119));
        btnParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParqueaderoActionPerformed(evt);
            }
        });

        btnLaboratorio.setBackground(new java.awt.Color(214, 214, 214));
        btnLaboratorio.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LABORATORIO-NEGRO.png"))); // NOI18N
        btnLaboratorio.setText("LABORATORIO");
        btnLaboratorio.setBorder(null);
        btnLaboratorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLaboratorio.setMaximumSize(new java.awt.Dimension(146, 119));
        btnLaboratorio.setMinimumSize(new java.awt.Dimension(146, 119));
        btnLaboratorio.setPreferredSize(new java.awt.Dimension(146, 119));
        btnLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaboratorioActionPerformed(evt);
            }
        });

        btnVerificar.setBackground(new java.awt.Color(214, 214, 214));
        btnVerificar.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LupaPequeña.png"))); // NOI18N
        btnVerificar.setText("Verificador");
        btnVerificar.setBorder(null);
        btnVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerificar.setMaximumSize(new java.awt.Dimension(146, 119));
        btnVerificar.setMinimumSize(new java.awt.Dimension(146, 119));
        btnVerificar.setPreferredSize(new java.awt.Dimension(146, 119));
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnContable.setBackground(new java.awt.Color(214, 214, 214));
        btnContable.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnContable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CONTABLE-NEGRO.png"))); // NOI18N
        btnContable.setText("CONTABLE");
        btnContable.setBorder(null);
        btnContable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContableActionPerformed(evt);
            }
        });

        btnCorresponsalWeb.setBackground(new java.awt.Color(214, 214, 214));
        btnCorresponsalWeb.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnCorresponsalWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corresponsalbncario.png"))); // NOI18N
        btnCorresponsalWeb.setMnemonic('C');
        btnCorresponsalWeb.setText("CORRESPONSAL");
        btnCorresponsalWeb.setAlignmentY(0.0F);
        btnCorresponsalWeb.setBorder(null);
        btnCorresponsalWeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorresponsalWeb.setMaximumSize(new java.awt.Dimension(146, 119));
        btnCorresponsalWeb.setMinimumSize(new java.awt.Dimension(146, 119));
        btnCorresponsalWeb.setPreferredSize(new java.awt.Dimension(146, 119));
        btnCorresponsalWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorresponsalWebActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOftalmologia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnParqueadero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLaboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAbrirCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(btnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPTM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTesoreria, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCartera, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTerceros, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnCorresponsalWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnTerceros, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnTesoreria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnCartera, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnOftalmologia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnPTM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnContable, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnCorresponsalWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnAbrirCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel5.setBackground(new java.awt.Color(242, 244, 244));

        btnConfig.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png"))); // NOI18N
        btnConfig.setText("Configuraciones");
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        lbVentas7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbVentas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conexion.png"))); // NOI18N
        lbVentas7.setText("Verificar conexión");
        lbVentas7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbVentas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbVentas7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVentas7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lbVentas7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        lbVersion1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbVersion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion1.setText("Versión 3.0.0");

        btnRecordatorios.setBackground(new java.awt.Color(214, 214, 214));
        btnRecordatorios.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        btnRecordatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RECORDATORIO-NEGRO.png"))); // NOI18N
        btnRecordatorios.setText("RECORDATORIO");
        btnRecordatorios.setBorder(null);
        btnRecordatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecordatorios.setMaximumSize(new java.awt.Dimension(146, 119));
        btnRecordatorios.setMinimumSize(new java.awt.Dimension(146, 119));
        btnRecordatorios.setPreferredSize(new java.awt.Dimension(146, 119));
        btnRecordatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordatoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelsSliding1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRecordatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbVersion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanelsSliding1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnRecordatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lbVersion1)
                .addContainerGap())
        );

        pnlMensaje.setBackground(new java.awt.Color(255, 153, 153));
        pnlMensaje.setMaximumSize(new java.awt.Dimension(319, 173));
        pnlMensaje.setMinimumSize(new java.awt.Dimension(319, 173));
        pnlMensaje.setPreferredSize(new java.awt.Dimension(319, 173));

        lbIcon.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alert1.png"))); // NOI18N
        lbIcon.setText("Error!");

        jScrollPane2.setViewportView(msg);

        javax.swing.GroupLayout pnlMensajeLayout = new javax.swing.GroupLayout(pnlMensaje);
        pnlMensaje.setLayout(pnlMensajeLayout);
        pnlMensajeLayout.setHorizontalGroup(
            pnlMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        pnlMensajeLayout.setVerticalGroup(
            pnlMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMensajeLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnlMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOcultar.setBackground(new java.awt.Color(242, 244, 244));
        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda.png"))); // NOI18N
        btnOcultar.setToolTipText("Ctrl+S");
        btnOcultar.setBorder(null);
        btnOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcultarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(54, 54, 52));

        btnCambiarUsuario.setBackground(new java.awt.Color(54, 54, 52));
        btnCambiarUsuario.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnCambiarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.setBorder(null);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });

        lbUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 147, 51));
        lbUsuario.setText("USUARIO");

        btnSolicitudes.setBackground(new java.awt.Color(54, 54, 52));
        btnSolicitudes.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnSolicitudes.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buzonBlanco.png"))); // NOI18N
        btnSolicitudes.setText(" (0)");
        btnSolicitudes.setToolTipText("");
        btnSolicitudes.setBorder(null);
        btnSolicitudes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudesActionPerformed(evt);
            }
        });

        sep2.setForeground(new java.awt.Color(255, 255, 255));
        sep2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbTitulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("TITULO");

        sep3.setForeground(new java.awt.Color(255, 255, 255));
        sep3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnMedicamentos.setBackground(new java.awt.Color(54, 54, 52));
        btnMedicamentos.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/medicina1.png"))); // NOI18N
        btnMedicamentos.setToolTipText("");
        btnMedicamentos.setBorder(null);
        btnMedicamentos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentosActionPerformed(evt);
            }
        });

        sep4.setForeground(new java.awt.Color(255, 255, 255));
        sep4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cmbAccesos.setBackground(new java.awt.Color(54, 54, 52));
        cmbAccesos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbAccesos.setForeground(new java.awt.Color(255, 147, 51));
        cmbAccesos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Accesos rápidos", "Ventas", "Congeladas", "Compras", "Ajustes" }));
        cmbAccesos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAccesosItemStateChanged(evt);
            }
        });

        btnMedicamentos1.setBackground(new java.awt.Color(54, 54, 52));
        btnMedicamentos1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        btnMedicamentos1.setForeground(new java.awt.Color(255, 255, 255));
        btnMedicamentos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/planillas1.png"))); // NOI18N
        btnMedicamentos1.setText("Plantillas y Manuales");
        btnMedicamentos1.setToolTipText("");
        btnMedicamentos1.setBorder(null);
        btnMedicamentos1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMedicamentos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentos1ActionPerformed(evt);
            }
        });

        sep5.setForeground(new java.awt.Color(255, 255, 255));
        sep5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sep3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(sep4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(cmbAccesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnCambiarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sep5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnMedicamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sep2)
            .addComponent(lbUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(btnSolicitudes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCambiarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sep3)
            .addComponent(btnMedicamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sep4)
            .addComponent(cmbAccesos)
            .addComponent(btnMedicamentos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sep5)
        );

        pnlOpcionesPeque.setBackground(new java.awt.Color(242, 244, 244));

        item8.setBackground(new java.awt.Color(255, 255, 255));
        item8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item8.setText("COTIZACION");
        item8.setBorderPainted(false);
        item8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item8.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item8ActionPerformed(evt);
            }
        });

        item1.setBackground(new java.awt.Color(255, 255, 255));
        item1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item1.setText("COTIZACION");
        item1.setBorderPainted(false);
        item1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item1.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1ActionPerformed(evt);
            }
        });

        item2.setBackground(new java.awt.Color(255, 255, 255));
        item2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item2.setText("COTIZACION");
        item2.setBorderPainted(false);
        item2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item2.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });

        item3.setBackground(new java.awt.Color(255, 255, 255));
        item3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item3.setText("COTIZACION");
        item3.setBorderPainted(false);
        item3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item3.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });

        item4.setBackground(new java.awt.Color(255, 255, 255));
        item4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item4.setText("COTIZACION");
        item4.setBorderPainted(false);
        item4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item4.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4ActionPerformed(evt);
            }
        });

        item5.setBackground(new java.awt.Color(255, 255, 255));
        item5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item5.setText("COTIZACION");
        item5.setBorderPainted(false);
        item5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item5.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5ActionPerformed(evt);
            }
        });

        item6.setBackground(new java.awt.Color(255, 255, 255));
        item6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item6.setText("COTIZACION");
        item6.setBorderPainted(false);
        item6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item6.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6ActionPerformed(evt);
            }
        });

        item7.setBackground(new java.awt.Color(255, 255, 255));
        item7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item7.setText("COTIZACION");
        item7.setBorderPainted(false);
        item7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item7.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item7ActionPerformed(evt);
            }
        });

        item9.setBackground(new java.awt.Color(255, 255, 255));
        item9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item9.setText("COTIZACION");
        item9.setBorderPainted(false);
        item9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item9.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item9ActionPerformed(evt);
            }
        });

        item10.setBackground(new java.awt.Color(255, 255, 255));
        item10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item10.setText("COTIZACION");
        item10.setBorderPainted(false);
        item10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item10.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item10ActionPerformed(evt);
            }
        });

        item11.setBackground(new java.awt.Color(255, 255, 255));
        item11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item11.setText("COTIZACION");
        item11.setBorderPainted(false);
        item11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item11.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item11ActionPerformed(evt);
            }
        });

        item12.setBackground(new java.awt.Color(255, 255, 255));
        item12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item12.setText("COTIZACION");
        item12.setBorderPainted(false);
        item12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item12.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item12ActionPerformed(evt);
            }
        });

        item13.setBackground(new java.awt.Color(255, 255, 255));
        item13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item13.setText("COTIZACION");
        item13.setBorderPainted(false);
        item13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item13.setMargin(new java.awt.Insets(2, 0, 2, 0));
        item13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesPequeLayout = new javax.swing.GroupLayout(pnlOpcionesPeque);
        pnlOpcionesPeque.setLayout(pnlOpcionesPequeLayout);
        pnlOpcionesPequeLayout.setHorizontalGroup(
            pnlOpcionesPequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesPequeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(item13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlOpcionesPequeLayout.setVerticalGroup(
            pnlOpcionesPequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesPequeLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlOpcionesPequeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item8)
                    .addComponent(item1)
                    .addComponent(item2)
                    .addComponent(item3)
                    .addComponent(item4)
                    .addComponent(item5)
                    .addComponent(item6)
                    .addComponent(item7)
                    .addComponent(item9)
                    .addComponent(item10)
                    .addComponent(item11)
                    .addComponent(item12)
                    .addComponent(item13))
                .addGap(5, 5, 5))
        );

        pnlMiniaturas.setBackground(new java.awt.Color(242, 244, 244));

        lbVentas8.setBackground(new java.awt.Color(242, 244, 244));
        lbVentas8.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        lbVentas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VENTAS-NEGRO.png"))); // NOI18N
        lbVentas8.setBorder(null);
        lbVentas8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbVentas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbVentas8ActionPerformed(evt);
            }
        });

        lbVentas9.setBackground(new java.awt.Color(242, 244, 244));
        lbVentas9.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        lbVentas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PRODUCTOS-NEGRO.png"))); // NOI18N
        lbVentas9.setBorder(null);
        lbVentas9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbVentas9.setMaximumSize(new java.awt.Dimension(146, 119));
        lbVentas9.setMinimumSize(new java.awt.Dimension(146, 119));
        lbVentas9.setPreferredSize(new java.awt.Dimension(146, 119));
        lbVentas9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbVentas9ActionPerformed(evt);
            }
        });

        lbVentas10.setBackground(new java.awt.Color(242, 244, 244));
        lbVentas10.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        lbVentas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TERCEROS-NEGRO.png"))); // NOI18N
        lbVentas10.setBorder(null);
        lbVentas10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbVentas10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbVentas10ActionPerformed(evt);
            }
        });

        lbVentas11.setBackground(new java.awt.Color(242, 244, 244));
        lbVentas11.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        lbVentas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TESORERIA-NEGRO.png"))); // NOI18N
        lbVentas11.setBorder(null);
        lbVentas11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbVentas11.setMaximumSize(new java.awt.Dimension(146, 121));
        lbVentas11.setMinimumSize(new java.awt.Dimension(146, 121));
        lbVentas11.setPreferredSize(new java.awt.Dimension(146, 121));
        lbVentas11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbVentas11ActionPerformed(evt);
            }
        });

        lbVentas12.setBackground(new java.awt.Color(242, 244, 244));
        lbVentas12.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        lbVentas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CARTERA-NEGRO.png"))); // NOI18N
        lbVentas12.setBorder(null);
        lbVentas12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbVentas12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbVentas12ActionPerformed(evt);
            }
        });

        lbAgenda1.setBackground(new java.awt.Color(242, 244, 244));
        lbAgenda1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        lbAgenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AGENDA-NEGRO.png"))); // NOI18N
        lbAgenda1.setBorder(null);
        lbAgenda1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbAgenda1ActionPerformed(evt);
            }
        });

        lbVeterinaria1.setBackground(new java.awt.Color(242, 244, 244));
        lbVeterinaria1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbVeterinaria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VETERINARIO-NEGRO.png"))); // NOI18N
        lbVeterinaria1.setBorder(null);
        lbVeterinaria1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbVeterinaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbVeterinaria1ActionPerformed(evt);
            }
        });

        lbConfiguraciones.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ajustes.png"))); // NOI18N
        lbConfiguraciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbConfiguraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbConfiguracionesActionPerformed(evt);
            }
        });

        btnConexion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnConexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conexion.png"))); // NOI18N
        btnConexion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConexionActionPerformed(evt);
            }
        });

        lbMedico1.setBackground(new java.awt.Color(242, 244, 244));
        lbMedico1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        lbMedico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MEDICO-NEGRO.png"))); // NOI18N
        lbMedico1.setBorder(null);
        lbMedico1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMedico1.setMaximumSize(new java.awt.Dimension(146, 119));
        lbMedico1.setMinimumSize(new java.awt.Dimension(146, 119));
        lbMedico1.setPreferredSize(new java.awt.Dimension(146, 119));
        lbMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbMedico1ActionPerformed(evt);
            }
        });

        lbPTM.setBackground(new java.awt.Color(242, 244, 244));
        lbPTM.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        lbPTM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PTM-NEGRO.png"))); // NOI18N
        lbPTM.setBorder(null);
        lbPTM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPTM.setMaximumSize(new java.awt.Dimension(146, 119));
        lbPTM.setMinimumSize(new java.awt.Dimension(146, 119));
        lbPTM.setPreferredSize(new java.awt.Dimension(146, 119));
        lbPTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbPTMActionPerformed(evt);
            }
        });

        lbVersion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersion.setText("V 3.0.0");

        btnParqueadero1.setBackground(new java.awt.Color(242, 244, 244));
        btnParqueadero1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btnParqueadero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PARQUEADERO-NEGRO.png"))); // NOI18N
        btnParqueadero1.setBorder(null);
        btnParqueadero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParqueadero1.setMaximumSize(new java.awt.Dimension(146, 119));
        btnParqueadero1.setMinimumSize(new java.awt.Dimension(146, 119));
        btnParqueadero1.setPreferredSize(new java.awt.Dimension(146, 119));
        btnParqueadero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParqueadero1ActionPerformed(evt);
            }
        });

        btnContable1.setBackground(new java.awt.Color(242, 244, 244));
        btnContable1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btnContable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CONTABLE-NEGRO.png"))); // NOI18N
        btnContable1.setBorder(null);
        btnContable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContable1.setMaximumSize(new java.awt.Dimension(146, 119));
        btnContable1.setMinimumSize(new java.awt.Dimension(146, 119));
        btnContable1.setPreferredSize(new java.awt.Dimension(146, 119));
        btnContable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContable1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMiniaturasLayout = new javax.swing.GroupLayout(pnlMiniaturas);
        pnlMiniaturas.setLayout(pnlMiniaturasLayout);
        pnlMiniaturasLayout.setHorizontalGroup(
            pnlMiniaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMiniaturasLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlMiniaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVentas8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVentas9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbVentas10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbConfiguraciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVeterinaria1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAgenda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVentas12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVentas11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbPTM, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnParqueadero1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnContable1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        pnlMiniaturasLayout.setVerticalGroup(
            pnlMiniaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMiniaturasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbVentas8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVentas9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVentas10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVentas11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVentas12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAgenda1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVeterinaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbPTM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnParqueadero1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContable1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lbConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbVersion)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbNombreEmpresa.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombreEmpresa.setText("TITULO");

        lbFecha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFecha.setText("27/09/2018");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar1.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maximizar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/line.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        lbNombre.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNombre.setText("- Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbFecha)
                .addComponent(lbNombre))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(lbNombreEmpresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(pnlMiniaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOcultar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dkpFormularios))
            .addComponent(pnlOpcionesPeque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlOpcionesPeque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOcultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMiniaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dkpFormularios, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenuMouseClicked

    }//GEN-LAST:event_pnlMenuMouseClicked

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden

    }//GEN-LAST:event_formComponentHidden

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (!seVeElMenu) {
            ocultarMenu("");
        }
    }//GEN-LAST:event_formComponentResized

    private void activarColor1(JButton boton) {
        lbItem1.setForeground(Color.black);
        lbItem1.setBackground(new Color(214, 214, 214));
        lbItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem2.setForeground(Color.black);
        lbItem2.setBackground(new Color(214, 214, 214));
        lbItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem3.setForeground(Color.black);
        lbItem3.setBackground(new Color(214, 214, 214));
        lbItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem4.setForeground(Color.black);
        lbItem4.setBackground(new Color(214, 214, 214));
        lbItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem5.setForeground(Color.black);
        lbItem5.setBackground(new Color(214, 214, 214));
        lbItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem6.setForeground(Color.black);
        lbItem6.setBackground(new Color(214, 214, 214));
        lbItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem7.setForeground(Color.black);
        lbItem7.setBackground(new Color(214, 214, 214));
        lbItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem8.setForeground(Color.black);
        lbItem8.setBackground(new Color(214, 214, 214));
        lbItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem9.setForeground(Color.black);
        lbItem9.setBackground(new Color(214, 214, 214));
        lbItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem10.setForeground(Color.black);
        lbItem10.setBackground(new Color(214, 214, 214));
        lbItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem11.setForeground(Color.black);
        lbItem11.setBackground(new Color(214, 214, 214));
        lbItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem12.setForeground(Color.black);
        lbItem12.setBackground(new Color(214, 214, 214));
        lbItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem13.setForeground(Color.black);
        lbItem13.setBackground(new Color(214, 214, 214));
        lbItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem14.setForeground(Color.black);
        lbItem14.setBackground(new Color(214, 214, 214));
        lbItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem15.setForeground(Color.black);
        lbItem15.setBackground(new Color(214, 214, 214));
        lbItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem16.setForeground(Color.black);
        lbItem16.setBackground(new Color(214, 214, 214));
        lbItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem17.setForeground(Color.black);
        lbItem17.setBackground(new Color(214, 214, 214));
        lbItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));
        lbItem18.setForeground(Color.black);
        lbItem18.setBackground(new Color(214, 214, 214));
        lbItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png")));

        if (boton != null) {
            boton.setForeground(new Color(255, 147, 51));
            boton.setBackground(Color.black);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha1.png")));
        }
    }

    private void activarColor(JButton boton, String texto) {
        btnVentas.setBackground(new Color(214, 214, 214));
        btnVentas.setForeground(Color.black);
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VENTAS-NEGRO.png")));
        btnProductos.setBackground(new Color(214, 214, 214));
        btnProductos.setForeground(Color.black);
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PRODUCTOS-NEGRO.png")));
        btnTerceros.setBackground(new Color(214, 214, 214));
        btnTerceros.setForeground(Color.black);
        btnTerceros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TERCEROS-NEGRO.png")));
        btnTesoreria.setBackground(new Color(214, 214, 214));
        btnTesoreria.setForeground(Color.black);
        btnTesoreria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TESORERIA-NEGRO.png")));
        btnCartera.setBackground(new Color(214, 214, 214));
        btnCartera.setForeground(Color.black);
        btnCartera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CARTERA-NEGRO.png")));
        btnAgenda.setBackground(new Color(214, 214, 214));
        btnAgenda.setForeground(Color.black);
        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AGENDA-NEGRO.png")));
        btnVeterinario.setBackground(new Color(214, 214, 214));
        btnVeterinario.setForeground(Color.black);
        btnVeterinario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VETERINARIO-NEGRO.png")));
        btnMedico.setBackground(new Color(214, 214, 214));
        btnMedico.setForeground(Color.black);
        btnMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MEDICO-NEGRO.png")));
        btnOftalmologia.setBackground(new Color(214, 214, 214));
        btnOftalmologia.setForeground(Color.black);
        btnOftalmologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MEDICO-NEGRO.png")));
        btnPTM.setBackground(new Color(214, 214, 214));
        btnPTM.setForeground(Color.black);
        btnPTM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PTM-NEGRO.png")));
        btnParqueadero.setBackground(new Color(214, 214, 214));
        btnParqueadero.setForeground(Color.black);
        btnParqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PARQUEADERO-NEGRO.png")));
        btnRecordatorios.setBackground(new Color(214, 214, 214));
        btnRecordatorios.setForeground(Color.black);
        btnRecordatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RECORDATORIO-NEGRO.png")));
        btnLaboratorio.setBackground(new Color(214, 214, 214));
        btnLaboratorio.setForeground(Color.black);
        btnLaboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LABORATORIO-NEGRO.png")));
        btnContable.setBackground(new Color(214, 214, 214));
        btnContable.setForeground(Color.black);
        btnContable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CONTABLE-NEGRO.png")));

        if (texto.equals("Ventas")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VENTAS-BLANCO.png")));
        } else if (texto.equals("Productos")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PRODUCTOS-BLANCO.png")));
        } else if (texto.equals("Terceros")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TERCEROS-BLANCO.png")));
        } else if (texto.equals("Tesoreria")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TESORERIA-BLANCO.png")));
        } else if (texto.equals("Cartera")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CARTERA-BLANCO.png")));
        } else if (texto.equals("Agenda")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AGENDA-BLANCO.png")));
        } else if (texto.equals("Veterinario")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VETERINARIO-BLANCO.png")));
        } else if (texto.equals("Medico")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MEDICO-BLANCO.png")));
        } else if (texto.equals("Oftalmologia")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MEDICO-BLANCO.png")));
        } else if (texto.equals("Rip")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RIP-BLANCO.png")));
        } else if (texto.equals("Ptm")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PTM-BLANCO.png")));
        } else if (texto.equals("Parqueadero")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PARQUEADERO-BLANCO.png")));
        } else if (texto.equals("Recordatorio")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RECORDATORIO-BLANCO.png")));
        } else if (texto.equals("Laboratorio")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LABORATORIO-BLANCO.png")));
        } else if (texto.equals("Contable")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CONTABLE-BLANCO.png")));
        }else if (texto.equals("Corresponsal")) {
            boton.setBackground(Color.black);
            boton.setForeground(Color.white);
            boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corresponsalbncario.png")));
        }
        activarColor1(null);
    }

    private void animacion(String opc) {
        jPanelsSliding1.nextPanel(10, 40, jPanel3, true, opc);
        jPanelsSliding1.refresh();
    }

    public void actualizarMenu(String opc) {
        JButton[] etiquetas = {lbItem1, lbItem2, lbItem3, lbItem4, lbItem5, lbItem6, lbItem7, lbItem8, lbItem9, lbItem10, lbItem11, lbItem12, lbItem13, lbItem14, lbItem15, lbItem16, lbItem17, lbItem18};
        JButton[] etiquetas1 = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13};
        String[] textos = new String[18];
        JInternalFrame[] forms = new JInternalFrame[18];
        Color color = null;

        switch (opc) {
            case "ventas":
                textos[0] = "FACTURA";

                if (instancias.getConfiguraciones().isCongeladas()) {
                    if (instancias.getConfiguraciones().isRestaurante()) {
                        textos[1] = "MESAS";
                    } else {
                        textos[1] = "CONGELADAS";
                    }
                } else {
                    textos[1] = (String) null;
                }

                if (instancias.getConfiguraciones().isFacturacionLote()) {
                    textos[2] = "PLANTILLAS";
                } else {
                    textos[2] = (String) null;
                }

                textos[3] = "COTIZACIÓN";

                if (instancias.getConfiguraciones().isSepare()) {
                    textos[4] = "PLAN.SEPARE";
                } else {
                    textos[4] = (String) null;
                }

                if (instancias.getConfiguraciones().isCreditos()) {
                    textos[5] = "CREDITOS";
                } else {
                    textos[5] = (String) null;
                }

                if (instancias.getConfiguraciones().isPedido()) {
                    textos[6] = "PEDIDO";
                } else {
                    textos[6] = (String) null;
                }

                if (instancias.getConfiguraciones().isOrdenServ()) {
                    textos[7] = "ORDEN";
                } else {
                    textos[7] = (String) null;
                }

                if (instancias.getConfiguraciones().isFacturacionLote()) {
                    textos[8] = "FACTURA AUTO";
                } else {
                    textos[8] = (String) null;
                }

                textos[9] = "ANULACIÓN";
                textos[10] = "RE-IMPRESIÓN";
                textos[11] = "REPORTES";
                                
                if (instancias.getConfiguraciones().isFacturaElectronica()) {
                  textos[12] = "DIAN";  
                }else{
                  textos[12] = (String) null; 
                }
                textos[13] = (String) null;
                textos[14] = (String) null;

                forms[0] = instancias.getFacturaContenedor();

                if (instancias.getConfiguraciones().isRestaurante()) {
                    forms[1] = instancias.getMesas();
                } else {
                    forms[1] = instancias.getMesas1();
                }

                forms[2] = instancias.getCuentaCobroContenedor();
                forms[3] = instancias.getCotizaContenedor();
                forms[4] = instancias.getPlanSepareContenedor();
                forms[5] = instancias.getFacturaCreditosContenedor();
                forms[6] = instancias.getPedidoContenedor();
                forms[7] = instancias.getOrdenServicioContenedor();
                forms[8] = instancias.getFacturarLotes();
                forms[9] = instancias.getAnula();
                forms[10] = instancias.getReimpresion();
                forms[11] = instancias.getReportesVentas();
                forms[12] = instancias.getFacturaElectronicaDian();
                forms[13] = null;
                forms[14] = null;

                color = new Color(214, 214, 214);
                break;
            case "productos":
                textos[0] = "CREACIÓN";
                textos[1] = "O.COMPRA";
                textos[2] = "COMPRAS";
                textos[3] = "PRESTAMOS";
                if (instancias.getConfiguraciones().isInventarioBodegas()) {
                    textos[4] = "TRASL.INT";
                } else {
                    textos[4] = (String) null;
                }
                textos[5] = "AJUSTES";
                textos[6] = "GRUPOS";
                textos[7] = "DISEÑO";
                textos[8] = "ARMADO";
                textos[9] = "INV.INICIAL";
                if (instancias.getConfiguraciones().isEmbarcaciones()) {
                    textos[10] = "TRASL.DETAL";
                } else {
                    textos[10] = (String) null;
                }
                textos[11] = "KARDEX";
                textos[12] = "REPORTES";
                textos[13] = "AJUSTE INV.";

                forms[0] = instancias.getProductos();
                forms[1] = instancias.getOrdenCompraContenedor();
                forms[2] = instancias.getIngresoContenedor();
                forms[3] = instancias.getPrestamos();
                forms[4] = instancias.getTrasladosInternos();
                forms[5] = instancias.getuInt();
                forms[6] = instancias.getGrupos();
                forms[7] = instancias.getCosteo();
                forms[8] = instancias.getArmado();
                forms[9] = instancias.getInventarioInicial();
                forms[10] = null;
                forms[11] = instancias.getKardexProductos();
                forms[12] = instancias.getReportesProductos();
                forms[13] = instancias.getAjusteInventarioTotal();

                color = new Color(214, 214, 214);
                break;
            case "recordatorio":
                textos[0] = "RECORDATORIO";
                textos[1] = (String) null;
                textos[2] = (String) null;
                textos[3] = (String) null;
                textos[4] = (String) null;
                textos[5] = (String) null;
                textos[6] = (String) null;
                textos[7] = (String) null;
                textos[8] = (String) null;
                textos[9] = (String) null;
                textos[10] = (String) null;
                textos[11] = (String) null;
                textos[12] = (String) null;
                textos[13] = (String) null;
                textos[14] = (String) null;
//                textos[15] = "INV.INICIAL";

                forms[0] = instancias.getRecordatorios();
                forms[1] = null;
                forms[2] = null;
                forms[3] = null;
                forms[4] = null;
                forms[5] = null;
                forms[6] = null;
                forms[7] = null;
                forms[8] = null;
                forms[9] = null;
                forms[10] = null;
                forms[11] = null;
                forms[12] = null;
                forms[13] = null;
                forms[14] = null;
//                forms[15] = instancias.getInventarioInicial();

                color = new Color(214, 214, 214);
                break;
            case "terceros":
                if (instancias.getConfiguraciones().isMedico() || instancias.getConfiguraciones().isLaboratorio() || instancias.getConfiguraciones().isOftalmologia()) {
                    textos[0] = (String) null;
                } else {
                    textos[0] = "CLIENTE";
                }

                textos[1] = "PROVEEDOR";
                textos[2] = "EMPLEADO";

                if (instancias.getConfiguraciones().isInventarioBodegas()) {
                    textos[3] = "BOD.INTERNA";
                } else {
                    textos[3] = (String) null;
                }

                textos[4] = "C. PRESTAMOS";
                textos[5] = (String) null;
                textos[6] = "R.CLIENTES";
                textos[7] = "R.PROVEEDORES";
                textos[8] = "R.EMPLEADOS";
                textos[9] = (String) null;
                textos[10] = (String) null;
                textos[11] = (String) null;
                textos[12] = (String) null;
                textos[13] = (String) null;
                textos[14] = (String) null;

                forms[0] = instancias.getClientes();
                forms[1] = instancias.getProveedores();
                forms[2] = instancias.getEmpleados();
                forms[3] = instancias.getBodegas();
                forms[4] = instancias.getBodegasClientes();
                forms[5] = null;
                forms[6] = instancias.getRepClientes();
                forms[7] = instancias.getRepProveedores();
                forms[8] = instancias.getRepEmpleados();
                forms[9] = null;
//                forms[10] = instancias.getReferirPuntos();
                forms[10] = null;
                forms[11] = null;
                forms[12] = null;

                color = new Color(214, 214, 214);
                break;
            case "contable":
                textos[0] = "ESTRUCTURA";
                textos[1] = "PUC";
                textos[2] = "C.COSTOS";
                textos[3] = "COMPROBANTES";
                textos[4] = "INTERFASE";
                textos[5] = "REPORTES";
                textos[6] = (String) null;
                textos[7] = (String) null;
                textos[8] = (String) null;
                textos[9] = (String) null;
                textos[10] = (String) null;
                textos[11] = (String) null;
                textos[12] = (String) null;

                forms[0] = instancias.getEstructura();
                forms[1] = instancias.getPuc();
                forms[2] = instancias.getCentroCostos();
                forms[3] = instancias.getComprobantes();
                forms[4] = instancias.getInterfase();
                forms[5] = instancias.getReportesContables();
                forms[6] = null;
                forms[7] = null;
                forms[8] = null;
                forms[9] = null;
                forms[10] = null;
                forms[11] = null;
                forms[12] = null;
                color = new Color(214, 214, 214);
                break;
            case "medico":
                textos[0] = "PACIENTES";

                if (instancias.isGeneraOrdenMedica()) {
                    textos[1] = "ORDEN.SERV";
                } else {
                    textos[1] = null;
                }

                textos[2] = "HISTORIA";
                textos[3] = "CONSULTA";
                textos[4] = "FORMATOS";
                textos[5] = "CONVENIO";
                textos[6] = "N.ENFERMERIA";
                textos[7] = "MEDICAMENTOS";
                textos[8] = "REPORTES";
                textos[9] = "RIPS";
                textos[10] = (String) null;
                textos[11] = (String) null;
                textos[12] = (String) null;

                forms[0] = instancias.getPaciente();

                if (instancias.isGeneraOrdenMedica()) {
                    forms[1] = instancias.getOrdenMedica();
                } else {
                    forms[1] = null;
                }

                forms[2] = instancias.getHistoriaC();
                forms[3] = instancias.getHistoriaClinica();
                forms[4] = instancias.getPlantillasDeTextos();
                forms[5] = instancias.getConvenio();
                forms[6] = instancias.getNotaEnfermeria();
                forms[7] = instancias.getMedicamentos();
                forms[8] = instancias.getReportesMedicos();
                forms[9] = instancias.getRips();
                forms[10] = null;
                forms[11] = null;
                forms[12] = null;
                color = new Color(214, 214, 214);
                break;

            case "laboratorio":
                textos[0] = "PACIENTE";
                textos[1] = "CONSULTA";
                textos[2] = (String) null;
                textos[3] = (String) null;
                textos[4] = (String) null;
                textos[5] = (String) null;
                textos[6] = (String) null;
                textos[7] = (String) null;
                textos[8] = (String) null;
                textos[9] = (String) null;
                textos[10] = (String) null;
                textos[11] = (String) null;
                textos[12] = (String) null;
                textos[13] = (String) null;
                textos[14] = (String) null;

                forms[0] = instancias.getPaciente();
                forms[1] = instancias.getHistoriaLaboratorio();
                forms[2] = null;
                forms[3] = null;
                forms[4] = null;
                forms[5] = null;
                forms[6] = null;
                forms[7] = null;
                forms[8] = null;
                forms[9] = null;
                forms[10] = null;
                forms[11] = null;
                forms[12] = null;
                forms[13] = null;
                forms[14] = null;
                color = new Color(214, 214, 214);
                break;

            case "oftamologia":
                textos[0] = "PACIENTE";
                textos[1] = "CONSULTA";
                textos[2] = (String) null;
                textos[3] = (String) null;
                textos[4] = (String) null;
                textos[5] = (String) null;
                textos[6] = (String) null;
                textos[7] = (String) null;
                textos[8] = (String) null;
                textos[9] = (String) null;
                textos[10] = (String) null;
                textos[11] = (String) null;
                textos[12] = (String) null;
                textos[13] = (String) null;
                textos[14] = (String) null;

                forms[0] = instancias.getPaciente();
                forms[1] = instancias.getHojaIngreso();
                forms[2] = null;
                forms[3] = null;
                forms[4] = null;
                forms[5] = null;
                forms[6] = null;
                forms[7] = null;
                forms[8] = null;
                forms[9] = null;
                forms[10] = null;
                forms[11] = null;
                forms[12] = null;
                forms[13] = null;
                forms[14] = null;
                color = new Color(214, 214, 214);
                break;

            case "egresos":
                textos[0] = "CODIGOS";
                textos[1] = "EGRESOS";
                textos[2] = "R.EGRESOS";
                textos[3] = "BANCOS";
                textos[4] = "REP.BANCOS";
                textos[5] = "CUADRE CAJA";
                textos[6] = "REP.CUADRE";
                textos[7] = (String) null;
                textos[8] = (String) null;
                textos[9] = (String) null;
                textos[10] = (String) null;
                textos[11] = (String) null;
                textos[12] = (String) null;
                textos[13] = (String) null;
                textos[14] = (String) null;

                forms[0] = instancias.getCodigosEgresos();
                forms[1] = instancias.getEgresos();
                forms[2] = instancias.getRepEgresos();
                forms[3] = instancias.getBancos();
                forms[4] = instancias.getRepBancos();
                forms[5] = instancias.getCaja();
                forms[6] = instancias.getRepCuadre();
                forms[7] = null;
                forms[8] = null;
                forms[9] = null;
                forms[10] = null;
                forms[11] = null;
                forms[12] = null;

                color = new Color(214, 214, 214);
                break;
            case "cartera":
                textos[0] = "R.CARTERA CXC";
                textos[1] = "ABONOS CXC";
                textos[2] = "R.ABONOS CXC";
                textos[3] = "R.CARTERA CXP";
                textos[4] = "ABONOS CXP";
                textos[5] = "R.ABONOS CXP";
                textos[6] = "N.CREDITO";
                textos[7] = "R.NC";
                textos[8] = "N. DEBITO";
//                textos[8] = (String) null;
                textos[9] = (String) null;
                textos[10] = (String) null;
                textos[11] = (String) null;
                textos[12] = (String) null;
                textos[13] = (String) null;
                textos[14] = (String) null;

                forms[0] = instancias.getRepCartera();
                forms[1] = instancias.getAbonos();
                forms[2] = instancias.getRepAbonos();
                forms[3] = instancias.getRepPagos();
                forms[4] = instancias.getPagos();
                forms[5] = instancias.getRepAbonosCxp();
                forms[6] = instancias.getNc();
                forms[7] = instancias.getRepNC();
                forms[8] = instancias.getNd();
                forms[9] = null;
                forms[10] = null;
                forms[11] = null;
                forms[12] = null;
                color = new Color(214, 214, 214);
                break;
            case "veterinaria":
                textos[0] = "MASCOTAS";
                textos[1] = "H.CLINICA";
                textos[2] = "R.MASCOTAS";
                textos[3] = "GUARDERIA";
                textos[4] = "R.GUARDERIA";
                textos[5] = "PELUQUERIA";
                textos[6] = "R.PELUQUERIA";
                textos[7] = "ING. HOSPIT";
                textos[8] = "REP. HOSPIT";
                textos[9] = "FORMATOS";
                textos[10] = "ALERTAS";
                textos[11] = (String) null;
                textos[12] = (String) null;
                textos[13] = (String) null;
                textos[14] = (String) null;

                forms[0] = instancias.getMascotas();
                forms[1] = instancias.getHistoria();
                forms[2] = instancias.getRepMascotas();
                forms[3] = instancias.getGuarderia();
                forms[4] = instancias.getRepGuarderia();
                forms[5] = instancias.getPeluqueria();
                forms[6] = instancias.getRepPeluqueria();
                forms[7] = instancias.getIngresoHospitalizacion();
                forms[8] = instancias.getRepHospitalizacion();
                forms[9] = instancias.getFormatos();
                forms[10] = instancias.getAlertasProximas();
                forms[11] = null;
                forms[12] = null;

                color = new Color(214, 214, 214);
                break;
            case "parqueadero":
                textos[0] = (String) null;
                textos[1] = "PARQUEADERO";
                textos[2] = "LAVADO";
                textos[3] = "MENSUALIDAD";
                textos[4] = "REP.MENSUAL";
                textos[5] = "REP.PAGOS.LAV";
                textos[6] = "REP.PARQUEA";
                textos[7] = "REP.LAVADOS";
                textos[8] = "REP.HISTORIAL";
                textos[9] = (String) null;
                textos[10] = (String) null;
                textos[11] = (String) null;
                textos[12] = (String) null;
                textos[13] = (String) null;
                textos[14] = (String) null;

                forms[0] = null;
                forms[1] = instancias.getParqueadero();
                forms[2] = instancias.getLavadero();
                forms[3] = instancias.getMensualidad();
                forms[4] = instancias.getRepMensualidades();
                forms[5] = instancias.getRepLavadero();
                forms[6] = instancias.getRepParqueadero();
                forms[7] = instancias.getRepLavadero1();
                forms[8] = instancias.getRepHistorial();
                forms[9] = null;
                forms[10] = null;
                forms[11] = null;
                forms[12] = null;

                color = new Color(214, 214, 214);
                break;
            case "agenda":
                textos[0] = "AGENDA";
                textos[1] = "REP.AGENDA";
                textos[2] = (String) null;
                textos[3] = (String) null;
                textos[4] = (String) null;
                textos[5] = (String) null;
                textos[6] = (String) null;
                textos[7] = (String) null;
                textos[8] = (String) null;
                textos[9] = (String) null;
                textos[10] = (String) null;
                textos[11] = (String) null;
                textos[12] = (String) null;
                textos[13] = (String) null;
                textos[14] = (String) null;

                forms[0] = instancias.getAgendaConsulta();
                forms[1] = instancias.getRepAgenda();
                forms[2] = null;
                forms[3] = null;
                forms[4] = null;
                forms[5] = null;
                forms[6] = null;
                forms[7] = null;
                forms[8] = null;
                forms[9] = null;
                forms[10] = null;
                forms[11] = null;
                forms[12] = null;

                color = new Color(214, 214, 214);
                break;
        }

        for (int i = 0; i < 13; i++) {
            if (textos[i] != null) {
                etiquetas1[i].setBackground(new Color(242, 244, 244));
                etiquetas1[i].setText(textos[i]);
                etiquetas1[i].setVisible(true);
            } else {
                etiquetas1[i].setVisible(false);
            }
        }

        for (int i = 0; i < 18; i++) {
            if (textos[i] != null) {
                etiquetas[i].setBackground(color);
                etiquetas[i].setText(textos[i]);
                etiquetas[i].setVisible(true);
            } else {
                etiquetas[i].setVisible(false);
            }
        }
        formularios = forms;
    }

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        animacion("ventas");
        activarColor(btnVentas, "Ventas");
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        animacion("productos");
        activarColor(btnProductos, "Productos");
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnTercerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTercerosActionPerformed
        animacion("terceros");
        activarColor(btnTerceros, "Terceros");
    }//GEN-LAST:event_btnTercerosActionPerformed

    private void btnTesoreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesoreriaActionPerformed
        animacion("egresos");
        activarColor(btnTesoreria, "Tesoreria");
    }//GEN-LAST:event_btnTesoreriaActionPerformed

    private void btnCarteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteraActionPerformed
        animacion("cartera");
        activarColor(btnCartera, "Cartera");
    }//GEN-LAST:event_btnCarteraActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        try {
            if (instancias.getUsuarioLog().getUsuario().equals("ADMIN")) {
                instancias.getMaestra().setSelected(true);
                instancias.getMenu().cambiarTitulo("CONFIGURACIÓNES");
            } else {
                metodos.msgAdvertencia(null, "Función solo disponible para el usuario administrador.");

            }
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfigActionPerformed

    private void lbItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem1ActionPerformed
        activarColor1(lbItem1);

        try {
            if (!formularios[0].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[0] instanceof infEstructura) {
                instancias.getMenu().cambiarTitulo("ESTRUCTURAS");
            }

            if (formularios[0] instanceof infMascotas) {
                instancias.getMenu().cambiarTitulo("MASCOTAS");
            }

            if (formularios[0] instanceof infCodsEgresos) {
                instancias.getMenu().cambiarTitulo("CODIGOS DE EGRESOS");
            }

            if (formularios[0] instanceof infRepCartera) {
                instancias.getMenu().cambiarTitulo("REPORTE CARTERA CXC");
            }

            if (formularios[0] instanceof infClientes) {
                if (instancias.getConfiguraciones().isMedico() || instancias.getConfiguraciones().isLaboratorio()
                        || instancias.getConfiguraciones().isOftalmologia()) {
                    instancias.getMenu().cambiarTitulo("PACIENTES");
                } else {
                    instancias.getMenu().cambiarTitulo("CLIENTES");
                }
            }

            if (formularios[0] instanceof infFactura) {
                instancias.getMenu().cambiarTitulo("FACTURACIÓN");
            }

            if (formularios[0] instanceof infProductos) {
                instancias.getMenu().cambiarTitulo("PRODUCTOS");
            }

            if (formularios[0] instanceof infAgendaConsulta) {
                instancias.getAgendaConsulta().cargarAgendas(instancias.getMedico());
                instancias.getAgendaConsulta().cargarAgendas();
            }
            formularios[0].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem1ActionPerformed

    private void lbItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem2ActionPerformed
        activarColor1(lbItem2);

        try {
            if (!formularios[1].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[1] instanceof infParqueadero) {
                instancias.getMenu().cambiarTitulo("PARQUEADERO");
            }

            if (formularios[1] instanceof infPUC) {
                instancias.getMenu().cambiarTitulo("PLAN UNICO DE CUENTAS");
            }

            if (formularios[1] instanceof infMesas) {
                instancias.getMenu().cambiarTitulo("MESAS");
            }

            if (formularios[1] instanceof infEgresos) {
                instancias.getMenu().cambiarTitulo("EGRESOS");
            }

            if (formularios[1] instanceof infProveedores) {
                instancias.getMenu().cambiarTitulo("PROVEEDORES");
            }

            if (formularios[1] instanceof infAbonos) {
                instancias.getMenu().cambiarTitulo("ABONOS CARTERA CXC");
            }

            if (formularios[1] instanceof infMesas1) {
                instancias.getMenu().cambiarTitulo("CONGELADAS");
            }

            if (formularios[1] instanceof infOrdenServicioMedico) {
                instancias.getMenu().cambiarTitulo("ORDEN DE SERVICIO");
            }

            if (formularios[1] instanceof infOrdenCompra) {
                instancias.getMenu().cambiarTitulo("ORDEN DE COMPRA");
            }

            formularios[1].setSelected(true);

            if (formularios[1] instanceof infHistoria) {
                if (instancias.getHistoria().validarHistoriaCargada()) {
                    instancias.getMascotas().setSelected(true);
                    instancias.getMenu().cambiarTitulo("MASCOTAS");
                }
            }
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem2ActionPerformed

    private void lbItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem3ActionPerformed
        activarColor1(lbItem3);

        try {
            if (!formularios[2].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[2] instanceof infCentroCostos) {
                instancias.getMenu().cambiarTitulo("CENTRO DE COSTOS");
            }

            if (formularios[2] instanceof infLavadero) {
                instancias.getMenu().cambiarTitulo("LAVADO");
            }

            if (formularios[2] instanceof infEmpleados) {
                instancias.getMenu().cambiarTitulo("EMPLEADOS");
            }

            if (formularios[2] instanceof infIngreso) {
                instancias.getMenu().cambiarTitulo("COMPRAS");
            }

            if (formularios[2] instanceof infCuentaCobro) {
                instancias.getMenu().cambiarTitulo("PLANTILLAS");
            }

            if (formularios[2] instanceof infRepEgresos) {
                instancias.getMenu().cambiarTitulo("REPORTE DE EGRESOS");
            }

            if (formularios[2] instanceof infHistoriaC) {
                instancias.getMenu().cambiarTitulo("HISTORIAL PACIENTE");
            }

            if (formularios[2] instanceof infRepAbonos) {
                instancias.getMenu().cambiarTitulo("REPORTE ABONOS CXC");
            }

            if (formularios[2] instanceof infRepMascotas) {
                instancias.getMenu().cambiarTitulo("REPORTE DE MASCOTAS");
            }

            formularios[2].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem3ActionPerformed

    private void lbItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem4ActionPerformed
        activarColor1(lbItem4);

        try {
            if (!formularios[3].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }
            formularios[3].setSelected(true);

            if (formularios[3] instanceof infComprobantes) {
                instancias.getMenu().cambiarTitulo("COMPROBANTES");
            }

            if (formularios[3] instanceof infMensualidad) {
                instancias.getMenu().cambiarTitulo("MENSUALIDAD");
            }

            if (formularios[3] instanceof infBancos) {
                instancias.getMenu().cambiarTitulo("BANCOS");
            }

            if (formularios[3] instanceof infPrestamos) {
                instancias.getMenu().cambiarTitulo("PRESTAMOS");
            }

            if (formularios[3] instanceof infBodegas) {
                instancias.getMenu().cambiarTitulo("BODEGAS INTERNAS");
            }

            if (formularios[3] instanceof infCotiza) {
                instancias.getMenu().cambiarTitulo("COTIZACIÓNES");
            }

            if (formularios[3] instanceof infGuarderia) {
                instancias.getMenu().cambiarTitulo("GUARDERIA");
            }

            if (formularios[3] instanceof infRepPagos) {
                instancias.getMenu().cambiarTitulo("REPORTE DE CARTERA CXP");
            }

            if (formularios[3] instanceof infHistoriaMedica) {
                instancias.getHistoriaClinica().validarHistoriaCargada();
            }
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem4ActionPerformed

    private void lbItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem5ActionPerformed
        activarColor1(lbItem5);

        try {
            if (!formularios[4].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            formularios[4].setSelected(true);

            if (formularios[4] instanceof infInterfase) {
                instancias.getMenu().cambiarTitulo("INTERFASE");
            }

            if (formularios[4] instanceof infRepMensualidades) {
                instancias.getMenu().cambiarTitulo("REPORTE DE MENSUALIDADES");
            }

            if (formularios[4] instanceof infPlanSepare) {
                instancias.getMenu().cambiarTitulo("PLAN SEPARES");
            }

            if (formularios[4] instanceof infFormatosDeTextos) {
                instancias.getMenu().cambiarTitulo("FORMATOS");
            }

            if (formularios[4] instanceof infTrasladosInternos) {
                instancias.getMenu().cambiarTitulo("TRASLADOS INTERNOS");
            }

            if (formularios[4] instanceof infRepGuarderia) {
                instancias.getMenu().cambiarTitulo("REPORTE DE GUARDERIAS");
            }

            if (formularios[4] instanceof infPagos) {
                instancias.getMenu().cambiarTitulo("ABONOS CUENTAS POR PAGAR");
            }

            if (formularios[4] instanceof infRepBancos) {
                instancias.getMenu().cambiarTitulo("REPORTES DE BANCOS");
            }

            if (formularios[4] instanceof infGuarderia) {
                instancias.getMenu().cambiarTitulo("ABONOS CUENTAS POR PAGAR");
            }

            if (formularios[4] instanceof infBodegasClientes) {
                instancias.getMenu().cambiarTitulo("CLIENTES DE PRESTAMOS");
            }
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem5ActionPerformed

    private void lbItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem6ActionPerformed
        activarColor1(lbItem6);

        try {
            if (!formularios[5].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[5] instanceof infReportesContables) {
                instancias.getMenu().cambiarTitulo("REPORTES");
            }

            if (formularios[5] instanceof infRepLavadero) {
                instancias.getMenu().cambiarTitulo("REPORTE DE PAGOS DEL LAVADERO");
            }

            if (formularios[5] instanceof infCaja) {
                instancias.getMenu().cambiarTitulo("CUADRE DE CAJA");
            }

            if (formularios[5] instanceof infConvenio) {
                instancias.getMenu().cambiarTitulo("CONVENIO");
            }

            if (formularios[5] instanceof infRepAbonosCxp) {
                instancias.getMenu().cambiarTitulo("REPORTE ABONOS CXP");
            }

            if (formularios[5] instanceof infAjustesInv) {
                instancias.getuInt().consultarPermiso();
                instancias.getMenu().cambiarTitulo("AJUSTES DE INVENTARIO");
            }

            if (formularios[5] instanceof infPeluqueria) {
                instancias.getMenu().cambiarTitulo("PELUQUERIA");
            }

            if (formularios[5] instanceof infPagos) {
//                instancias.getPagos().cargarTablaCxp();
            }

            formularios[5].setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem6ActionPerformed

    private void lbItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem7ActionPerformed
        activarColor1(lbItem7);

        try {
            if (!formularios[6].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[6] instanceof infRepParqueadero) {
                instancias.getMenu().cambiarTitulo("REPORTE DE PARQUEADERO");
            }

            if (formularios[6] instanceof infGrupos) {
                instancias.getMenu().cambiarTitulo("GRUPOS");
            }

            if (formularios[6] instanceof infNotaEnfermeria) {
                instancias.getMenu().cambiarTitulo("NOTA ENFERMERIA");
            }

            if (formularios[6] instanceof infRepCuadre) {
                instancias.getMenu().cambiarTitulo("REPORTE DE CUADRE DE CAJA");
            }

            if (formularios[6] instanceof infRepPeluqueria) {
                instancias.getMenu().cambiarTitulo("REPORTE DE PELUQUERIAS");
            }

            if (formularios[6] instanceof infNC) {
                instancias.getMenu().cambiarTitulo("NOTAS CREDITO");
            }

            if (formularios[6] instanceof infPedido) {
                instancias.getMenu().cambiarTitulo("PEDIDOS");
            }

            if (formularios[6] instanceof infRepClientes) {
                instancias.getMenu().cambiarTitulo("REPORTE DE CLIENTES");
            }

            formularios[6].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem7ActionPerformed

    private void lbItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem8ActionPerformed
        activarColor1(lbItem8);

        try {
            if (!formularios[7].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[7] instanceof infRepLavadero1) {
                instancias.getMenu().cambiarTitulo("REPORTE DE LAVADERO");
            }

            if (formularios[7] instanceof infOrdenServicio) {
                instancias.getMenu().cambiarTitulo("ORDEN DE SERVICIO");
            }

            if (formularios[7] instanceof infMedicamentos) {
                instancias.getMenu().cambiarTitulo("MEDICAMENTOS");
            }

            if (formularios[7] instanceof infRepNc) {
                instancias.getMenu().cambiarTitulo("REPORTE NOTAS CREDITO");
            }

            if (formularios[7] instanceof infCosteo) {
                instancias.getMenu().cambiarTitulo("DISEÑO");
            }

            if (formularios[7] instanceof infIngresoHospitalizacion) {
                instancias.getMenu().cambiarTitulo("INGRESO HOSPITALIZACIÓN");
            }

            if (formularios[7] instanceof infRepProveedores) {
                instancias.getMenu().cambiarTitulo("REPORTE DE PROVEEDORES");
            }

            formularios[7].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem8ActionPerformed

    private void lbItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem9ActionPerformed
        activarColor1(lbItem9);

        try {
            if (!formularios[8].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            formularios[8].setSelected(true);

            if (formularios[8] instanceof infRepHistorial) {
                instancias.getMenu().cambiarTitulo("REPORTE DE HISTORIAL");
            }

            if (formularios[8] instanceof infFacturarLotes) {
                instancias.getMenu().cambiarTitulo("FACTURACIÓN AUTOMÁTICA");
            }

            if (formularios[8] instanceof infND) {
                instancias.getMenu().cambiarTitulo("NOTAS DEBITO");
            }

            if (formularios[8] instanceof infRepEmpleados) {
                instancias.getMenu().cambiarTitulo("REPORTE DE EMPLEADOS");
            }

            if (formularios[8] instanceof infReportesMedico) {
                instancias.getMenu().cambiarTitulo("REPORTES");
            }

            if (formularios[8] instanceof infArmado) {
                instancias.getMenu().cambiarTitulo("ARMADO");
            }

            if (formularios[8] instanceof infRepHospitalizacion) {
                instancias.getMenu().cambiarTitulo("REPORTE DE HOSPITALIZACIÓN");
            }

            if (formularios[8] instanceof infAnula) {
                instancias.getAnula().actualizarTabla();
            }

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem9ActionPerformed

    private void lbItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem10ActionPerformed
        activarColor1(lbItem10);

        try {
            if (!formularios[9].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            formularios[9].setSelected(true);

            if (formularios[9] instanceof infRips) {
                instancias.getMenu().cambiarTitulo("RIPS MEDICOS");
            }

            if (formularios[9] instanceof infInventarioInicial) {
                instancias.getMenu().cambiarTitulo("INVENTARIO INICIAL");
            }

            if (formularios[9] instanceof infFormatos) {
                instancias.getMenu().cambiarTitulo("FORMATOS DE IMPRESIÓN");
            }

            if (formularios[9] instanceof infAnula) {
                instancias.getMenu().cambiarTitulo("ANULACIÓN DE FACTURAS");
                instancias.getAnula().seleccionar();
            }

            if (formularios[9] instanceof infReimpresion) {
                instancias.getReimpresion().actualizarTabla();
            }

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem10ActionPerformed

    private void lbItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem11ActionPerformed
        activarColor1(lbItem11);

        try {
            if (!formularios[10].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[10] instanceof infReimpresion) {
                instancias.getMenu().cambiarTitulo("REIMPRESIÓN DE FACTURAS");
                instancias.getReimpresion().seleccionar();
            }

            if (formularios[10] instanceof infAlertasProximas) {
                instancias.getMenu().cambiarTitulo("ALERTAS VACUNACIÓN");
            }

            formularios[10].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem11ActionPerformed

    private void lbItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem12ActionPerformed
        activarColor1(lbItem12);

        try {
            if (!formularios[11].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[11] instanceof infReportesVentas) {
                instancias.getMenu().cambiarTitulo("REPORTES");
            }

            if (formularios[11] instanceof infKardexProductos) {
                instancias.getMenu().cambiarTitulo("KARDEX POR PRODUCTO");
            }

            formularios[11].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem12ActionPerformed

    private void lbItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem13ActionPerformed
        activarColor1(lbItem13);

        try {
            if (!formularios[12].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[12] instanceof infReportesProductos) {
                instancias.getMenu().cambiarTitulo("REPORTES");
            }
            
            if (formularios[12] instanceof buscFacturasElectronicasDian) {
                instancias.getMenu().cambiarTitulo("DIAN");
            }

            formularios[12].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem13ActionPerformed

    private void lbLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbLogoActionPerformed
        try {
            instancias.getInicial().setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbLogoActionPerformed

    private void btnOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcultarActionPerformed
        boolean seVe = instancias.getMenu().getSeVeElMenu();

        if (seVe) {
            instancias.getMenu().ocultarMenu("");
            btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecha.png")));
        } else {
            instancias.getMenu().expandirMenu();
            btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/izquierda.png")));
        }
    }//GEN-LAST:event_btnOcultarActionPerformed

    private void lbItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem14ActionPerformed
        activarColor1(lbItem14);

        try {
            if (!formularios[13].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }
        
            if (formularios[13] instanceof infAjustesInventarioTotal) {
                instancias.getMenu().cambiarTitulo("Ajuste Total");
            }

            formularios[13].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem14ActionPerformed

    private void lbItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem15ActionPerformed
        activarColor1(lbItem15);

        try {
            if (!formularios[14].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }
            formularios[14].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem15ActionPerformed

    private void btnAbrirCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCajaActionPerformed
        instancias.getReporte().abrirCajaRegistradora();
    }//GEN-LAST:event_btnAbrirCajaActionPerformed

    private void lbItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem16ActionPerformed
        activarColor1(lbItem16);

        try {
            if (!formularios[15].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }
            formularios[15].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem16ActionPerformed

    private void lbItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem17ActionPerformed
        activarColor1(lbItem17);

        try {
            if (!formularios[16].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }
            formularios[16].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem17ActionPerformed

    private void lbItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbItem18ActionPerformed
        activarColor1(lbItem18);

        try {
            if (!formularios[17].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }
            formularios[17].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbItem18ActionPerformed

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
//          infCambiarUsuario cambiar = new infCambiarUsuario();
//          cambiar.setLocationRelativeTo(null);
//          cambiar.setVisible(true);
            try {
                this.instancias.socket.close();
            } catch (Exception e) {
            }

            Inicio.getInstancia().iniciando(); 
            this.dispose();

    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed

    private void btnSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudesActionPerformed
//        try {
//            instancias.getMensajes().setSelected(true);
//            instancias.getMenu().cambiarTitulo("MENSAJERIA");
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(frmMenu.class
//                    .getName()).log(Level.SEVERE, null, ex);
//        }

        dlgPermisos permisos = new dlgPermisos(this, false);
        permisos.setVisible(true);

    }//GEN-LAST:event_btnSolicitudesActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        animacion("agenda");
        activarColor(btnAgenda, "Agenda");
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void item8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item8ActionPerformed
        try {
            if (!formularios[7].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[7] instanceof infRepLavadero1) {
                instancias.getMenu().cambiarTitulo("REPORTE DE LAVADERO");
            }

            if (formularios[7] instanceof infOrdenServicio) {
                instancias.getMenu().cambiarTitulo("ORDEN DE SERVICIO");
            }

            if (formularios[7] instanceof infMedicamentos) {
                instancias.getMenu().cambiarTitulo("MEDICAMENTOS");
            }

            if (formularios[7] instanceof infRepNc) {
                instancias.getMenu().cambiarTitulo("REPORTE NOTAS CREDITO");
            }

            if (formularios[7] instanceof infCosteo) {
                instancias.getMenu().cambiarTitulo("DISEÑO");
            }

            if (formularios[7] instanceof infIngresoHospitalizacion) {
                instancias.getMenu().cambiarTitulo("INGRESO HOSPITALIZACIÓN");
            }

            if (formularios[7] instanceof infRepProveedores) {
                instancias.getMenu().cambiarTitulo("REPORTE DE PROVEEDORES");
            }

            formularios[7].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item8ActionPerformed

    private void item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1ActionPerformed
        try {
            if (!formularios[0].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[0] instanceof infEstructura) {
                instancias.getMenu().cambiarTitulo("ESTRUCTURAS");
            }

            if (formularios[0] instanceof infMascotas) {
                instancias.getMenu().cambiarTitulo("MASCOTAS");
            }

            if (formularios[0] instanceof infCodsEgresos) {
                instancias.getMenu().cambiarTitulo("CODIGOS DE EGRESOS");
            }

            if (formularios[0] instanceof infRepCartera) {
                instancias.getMenu().cambiarTitulo("REPORTE CARTERA CXC");
            }

            if (formularios[0] instanceof infClientes) {
                if (instancias.getConfiguraciones().isMedico() || instancias.getConfiguraciones().isLaboratorio()
                        || instancias.getConfiguraciones().isOftalmologia()) {
                    instancias.getMenu().cambiarTitulo("PACIENTES");
                } else {
                    instancias.getMenu().cambiarTitulo("CLIENTES");
                }
            }

            if (formularios[0] instanceof infFactura) {
                instancias.getMenu().cambiarTitulo("FACTURACIÓN");
            }

            if (formularios[0] instanceof infProductos) {
                instancias.getMenu().cambiarTitulo("PRODUCTOS");
            }

            if (formularios[0] instanceof infAgendaConsulta) {
                instancias.getAgendaConsulta().cargarAgendas(instancias.getMedico());
                instancias.getAgendaConsulta().cargarAgendas();
            }
            formularios[0].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item1ActionPerformed

    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ActionPerformed
        try {
            if (!formularios[1].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[1] instanceof infPUC) {
                instancias.getMenu().cambiarTitulo("PLAN UNICO DE CUENTAS");
            }

            if (formularios[1] instanceof infParqueadero) {
                instancias.getMenu().cambiarTitulo("PARQUEADERO");
            }

            if (formularios[1] instanceof infMesas) {
                instancias.getMenu().cambiarTitulo("MESAS");
            }

            if (formularios[1] instanceof infEgresos) {
                instancias.getMenu().cambiarTitulo("EGRESOS");
            }

            if (formularios[1] instanceof infProveedores) {
                instancias.getMenu().cambiarTitulo("PROVEEDORES");
            }

            if (formularios[1] instanceof infAbonos) {
                instancias.getMenu().cambiarTitulo("ABONOS CARTERA CXC");
            }

            if (formularios[1] instanceof infMesas1) {
                instancias.getMenu().cambiarTitulo("CONGELADAS");
            }

            if (formularios[1] instanceof infOrdenServicioMedico) {
                instancias.getMenu().cambiarTitulo("ORDEN DE SERVICIO");
            }

            if (formularios[1] instanceof infOrdenCompra) {
                instancias.getMenu().cambiarTitulo("ORDEN DE COMPRA");
            }

            formularios[1].setSelected(true);

            if (formularios[1] instanceof infHistoria) {
                if (instancias.getHistoria().validarHistoriaCargada()) {
                    instancias.getMascotas().setSelected(true);
                    instancias.getMenu().cambiarTitulo("MASCOTAS");
                }
            }
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item2ActionPerformed

    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ActionPerformed
        try {
            if (!formularios[2].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[2] instanceof infCentroCostos) {
                instancias.getMenu().cambiarTitulo("CENTRO DE COSTOS");
            }

            if (formularios[2] instanceof infLavadero) {
                instancias.getMenu().cambiarTitulo("LAVADO");
            }

            if (formularios[2] instanceof infCuentaCobro) {
                instancias.getMenu().cambiarTitulo("PLANTILLAS");
            }

            if (formularios[2] instanceof infEmpleados) {
                instancias.getMenu().cambiarTitulo("EMPLEADOS");
            }

            if (formularios[2] instanceof infIngreso) {
                instancias.getMenu().cambiarTitulo("COMPRAS");
            }

            if (formularios[2] instanceof infRepEgresos) {
                instancias.getMenu().cambiarTitulo("REPORTE DE EGRESOS");
            }

            if (formularios[2] instanceof infHistoriaC) {
                instancias.getMenu().cambiarTitulo("HISTORIAL PACIENTE");
            }

            if (formularios[2] instanceof infRepAbonos) {
                instancias.getMenu().cambiarTitulo("REPORTE ABONOS CXC");
            }

            if (formularios[2] instanceof infRepMascotas) {
                instancias.getMenu().cambiarTitulo("REPORTE DE MASCOTAS");
            }

            formularios[2].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item3ActionPerformed

    private void item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4ActionPerformed
        try {
            if (!formularios[3].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }
            formularios[3].setSelected(true);

            if (formularios[3] instanceof infComprobantes) {
                instancias.getMenu().cambiarTitulo("COMPROBANTES");
            }

            if (formularios[3] instanceof infMensualidad) {
                instancias.getMenu().cambiarTitulo("MENSUALIDAD");
            }

            if (formularios[3] instanceof infBancos) {
                instancias.getMenu().cambiarTitulo("BANCOS");
            }

            if (formularios[3] instanceof infPrestamos) {
                instancias.getMenu().cambiarTitulo("PRESTAMOS");
            }

            if (formularios[3] instanceof infBodegas) {
                instancias.getMenu().cambiarTitulo("BODEGAS INTERNAS");
            }

            if (formularios[3] instanceof infCotiza) {
                instancias.getMenu().cambiarTitulo("COTIZACIÓNES");
            }

            if (formularios[3] instanceof infGuarderia) {
                instancias.getMenu().cambiarTitulo("GUARDERIA");
            }

            if (formularios[3] instanceof infRepPagos) {
                instancias.getMenu().cambiarTitulo("REPORTE DE CARTERA CXP");
            }

            if (formularios[3] instanceof infHistoriaMedica) {
                instancias.getHistoriaClinica().validarHistoriaCargada();
            }
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item4ActionPerformed

    private void item5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5ActionPerformed
        try {
            if (!formularios[4].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            formularios[4].setSelected(true);

            if (formularios[4] instanceof infInterfase) {
                instancias.getMenu().cambiarTitulo("INTERFASE");
            }

            if (formularios[4] instanceof infRepMensualidades) {
                instancias.getMenu().cambiarTitulo("REPORTE DE MENSUALIDADES");
            }

            if (formularios[4] instanceof infPlanSepare) {
                instancias.getMenu().cambiarTitulo("PLAN SEPARES");
            }

            if (formularios[4] instanceof infFormatosDeTextos) {
                instancias.getMenu().cambiarTitulo("FORMATOS");
            }

            if (formularios[4] instanceof infTrasladosInternos) {
                instancias.getMenu().cambiarTitulo("TRASLADOS INTERNOS");
            }

            if (formularios[4] instanceof infRepGuarderia) {
                instancias.getMenu().cambiarTitulo("REPORTE DE GUARDERIAS");
            }

            if (formularios[4] instanceof infPagos) {
                instancias.getMenu().cambiarTitulo("ABONOS CUENTAS POR PAGAR");
            }

            if (formularios[4] instanceof infRepBancos) {
                instancias.getMenu().cambiarTitulo("REPORTES DE BANCOS");
            }

            if (formularios[4] instanceof infGuarderia) {
                instancias.getMenu().cambiarTitulo("ABONOS CUENTAS POR PAGAR");
            }

            if (formularios[4] instanceof infBodegasClientes) {
                instancias.getMenu().cambiarTitulo("CLIENTES DE PRESTAMOS");
            }
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item5ActionPerformed

    private void item6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item6ActionPerformed
        try {
            if (!formularios[5].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[5] instanceof infReportesContables) {
                instancias.getMenu().cambiarTitulo("REPORTES");
            }

            if (formularios[5] instanceof infRepLavadero) {
                instancias.getMenu().cambiarTitulo("REPORTE DE PAGOS DEL LAVADERO");
            }

            if (formularios[5] instanceof infConvenio) {
                instancias.getMenu().cambiarTitulo("CONVENIO");
            }

            if (formularios[5] instanceof infCaja) {
                instancias.getMenu().cambiarTitulo("CUADRE DE CAJA");
            }

            if (formularios[5] instanceof infRepAbonosCxp) {
                instancias.getMenu().cambiarTitulo("REPORTE ABONOS CXP");
            }

            if (formularios[5] instanceof infAjustesInv) {
                instancias.getuInt().consultarPermiso();
                instancias.getMenu().cambiarTitulo("AJUSTES DE INVENTARIO");
            }

            if (formularios[5] instanceof infPeluqueria) {
                instancias.getMenu().cambiarTitulo("PELUQUERIA");
            }

            if (formularios[5] instanceof infPagos) {
//                instancias.getPagos().cargarTablaCxp();
            }

            formularios[5].setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item6ActionPerformed

    private void item7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item7ActionPerformed
        try {
            if (!formularios[6].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[6] instanceof infRepParqueadero) {
                instancias.getMenu().cambiarTitulo("REPORTE DE PARQUEADERO");
            }

            if (formularios[6] instanceof infGrupos) {
                instancias.getMenu().cambiarTitulo("GRUPOS");
            }

            if (formularios[6] instanceof infNotaEnfermeria) {
                instancias.getMenu().cambiarTitulo("NOTA ENFERMERIA");
            }

            if (formularios[6] instanceof infRepCuadre) {
                instancias.getMenu().cambiarTitulo("REPORTE DE CUADRE DE CAJA");
            }

            if (formularios[6] instanceof infRepPeluqueria) {
                instancias.getMenu().cambiarTitulo("REPORTE DE PELUQUERIAS");
            }

            if (formularios[6] instanceof infNC) {
                instancias.getMenu().cambiarTitulo("NOTAS CREDITO");
            }

            if (formularios[6] instanceof infPedido) {
                instancias.getMenu().cambiarTitulo("PEDIDOS");
            }

            if (formularios[6] instanceof infRepClientes) {
                instancias.getMenu().cambiarTitulo("REPORTE DE CLIENTES");
            }

            formularios[6].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item7ActionPerformed

    private void item9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item9ActionPerformed
        try {
            if (!formularios[8].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            formularios[8].setSelected(true);

            if (formularios[8] instanceof infFacturarLotes) {
                instancias.getMenu().cambiarTitulo("FACTURACIÓN AUTOMÁTICA");
            }

            if (formularios[8] instanceof infRepHistorial) {
                instancias.getMenu().cambiarTitulo("REPORTE DE HISTORIAL");
            }

            if (formularios[8] instanceof infND) {
                instancias.getMenu().cambiarTitulo("NOTAS DEBITO");
            }

            if (formularios[8] instanceof infRepEmpleados) {
                instancias.getMenu().cambiarTitulo("REPORTE DE EMPLEADOS");
            }

            if (formularios[8] instanceof infReportesMedico) {
                instancias.getMenu().cambiarTitulo("REPORTES");
            }

            if (formularios[8] instanceof infArmado) {
                instancias.getMenu().cambiarTitulo("ARMADO");
            }

            if (formularios[8] instanceof infRepHospitalizacion) {
                instancias.getMenu().cambiarTitulo("REPORTE DE HOSPITALIZACIÓN");
            }

            if (formularios[8] instanceof infAnula) {
                instancias.getAnula().actualizarTabla();
            }
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item9ActionPerformed

    private void item10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item10ActionPerformed
        try {
            if (!formularios[9].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            formularios[9].setSelected(true);

            if (formularios[9] instanceof infRips) {
                instancias.getMenu().cambiarTitulo("RIPS MEDICOS");
            }

            if (formularios[9] instanceof infInventarioInicial) {
                instancias.getMenu().cambiarTitulo("INVENTARIO INICIAL");
            }

            if (formularios[9] instanceof infFormatos) {
                instancias.getMenu().cambiarTitulo("FORMATOS DE IMPRESIÓN");
            }

            if (formularios[9] instanceof infAnula) {
                instancias.getMenu().cambiarTitulo("ANULACIÓN DE FACTURAS");
                instancias.getAnula().seleccionar();
            }

            if (formularios[9] instanceof infReimpresion) {
                instancias.getReimpresion().actualizarTabla();
            }

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item10ActionPerformed

    private void item11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item11ActionPerformed
        try {
            if (!formularios[10].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[10] instanceof infReimpresion) {
                instancias.getMenu().cambiarTitulo("REIMPRESIÓN DE FACTURAS");
                instancias.getReimpresion().seleccionar();
            }

            if (formularios[10] instanceof infAlertasProximas) {
                instancias.getMenu().cambiarTitulo("ALERTAS VACUNACIÓN");
            }

            formularios[10].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item11ActionPerformed

    private void item12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item12ActionPerformed
        try {
            if (!formularios[11].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[11] instanceof infReportesVentas) {
                instancias.getMenu().cambiarTitulo("REPORTES");
            }

            if (formularios[11] instanceof infKardexProductos) {
                instancias.getMenu().cambiarTitulo("KARDEX POR PRODUCTO");
            }

            formularios[11].setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item12ActionPerformed

    private void item13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item13ActionPerformed
        try {
            if (!formularios[12].isVisible()) {
                metodos.msgAdvertencia(null, "No tiene permisos para esta función");
            }

            if (formularios[12] instanceof infReportesProductos) {
                instancias.getMenu().cambiarTitulo("REPORTES");
            }

            formularios[12].setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item13ActionPerformed

    private void lbVentas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbVentas8ActionPerformed
        animacion("ventas");
    }//GEN-LAST:event_lbVentas8ActionPerformed

    private void lbVentas9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbVentas9ActionPerformed
        animacion("productos");
    }//GEN-LAST:event_lbVentas9ActionPerformed

    private void lbVentas10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbVentas10ActionPerformed
        animacion("terceros");
    }//GEN-LAST:event_lbVentas10ActionPerformed

    private void lbVentas11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbVentas11ActionPerformed
        animacion("egresos");
    }//GEN-LAST:event_lbVentas11ActionPerformed

    private void lbVentas12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbVentas12ActionPerformed
        animacion("cartera");
    }//GEN-LAST:event_lbVentas12ActionPerformed

    private void lbAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbAgenda1ActionPerformed
        animacion("agenda");
    }//GEN-LAST:event_lbAgenda1ActionPerformed

    private void btnVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeterinarioActionPerformed
        animacion("veterinaria");
        activarColor(btnVeterinario, "Veterinario");
    }//GEN-LAST:event_btnVeterinarioActionPerformed

    private void lbVeterinaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbVeterinaria1ActionPerformed
        animacion("veterinaria");
    }//GEN-LAST:event_lbVeterinaria1ActionPerformed

    private void btnMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentosActionPerformed
        dlgMedicamentosPendientes medicamentosPend = new dlgMedicamentosPendientes(null, true);
        medicamentosPend.setLocationRelativeTo(null);
        medicamentosPend.setVisible(true);
    }//GEN-LAST:event_btnMedicamentosActionPerformed

    private void btnConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConexionActionPerformed
       String msg = "";
        try {
            
            Object[] datos = instancias.getSql().getDatosMaestra();
            Logs.log("Datos " + datos[0]);
            if(datos[0] != null){
                msg = "Se conecto a la base de datos ";
            }else{
                msg = "Error conectando a la base de datos, es recomendable que reinicie la aplicación";
                metodos.msgError(null, msg);
            }
            
            Socket s = new Socket(Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            if (s.isConnected()) {
                msg = msg + " , y tiene conexión a internet";  
                metodos.msgExito(null, msg);
            }else{
                metodos.msgAdvertenciaAjustado(null, msg);
                msg = msg + " , no se pudo conectar a internet ";   
            }
        } catch (Exception e) {
            msg = msg +  " , no se pudo conectar a internet.";
            metodos.msgAdvertenciaAjustado(null, msg); 
        }
    }//GEN-LAST:event_btnConexionActionPerformed

    private void btnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoActionPerformed
        animacion("medico");
        activarColor(btnMedico, "Medico");
    }//GEN-LAST:event_btnMedicoActionPerformed

    private void btnOftalmologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOftalmologiaActionPerformed
        animacion("oftamologia");
        activarColor(btnOftalmologia, "Oftalmologia");
    }//GEN-LAST:event_btnOftalmologiaActionPerformed

    private void lbConfiguracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbConfiguracionesActionPerformed
        try {
            if (instancias.getUsuarioLog().getUsuario().equals("ADMIN")) {
                instancias.getMaestra().setSelected(true);
                instancias.getMenu().cambiarTitulo("CONFIGURACIÓNES");
            } else {
                metodos.msgAdvertencia(null, "Función solo disponible para el usuario administrador.");
            }
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbConfiguracionesActionPerformed

    private void cmbAccesosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAccesosItemStateChanged
        if (cmbAccesos.getSelectedIndex() == 1) {
            instancias.getFacturaContenedor().setSelected(true);
            cmbAccesos.setSelectedIndex(0);
        } else if (cmbAccesos.getSelectedIndex() == 2) {
            if (instancias.getConfiguraciones().isRestaurante()) {
                instancias.getMesas().setSelected(true);
            } else {
                instancias.getMesas1().setSelected(true);
            }
            cmbAccesos.setSelectedIndex(0);
        } else if (cmbAccesos.getSelectedIndex() == 3) {
            try {
                instancias.getIngresoContenedor().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            cmbAccesos.setSelectedIndex(0);
        } else if (cmbAccesos.getSelectedIndex() == 4) {
            try {
                instancias.getuInt().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            cmbAccesos.setSelectedIndex(0);
        }
    }//GEN-LAST:event_cmbAccesosItemStateChanged

    private void lbMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbMedico1ActionPerformed
        animacion("medico");
    }//GEN-LAST:event_lbMedico1ActionPerformed

    private void lbVentas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbVentas7ActionPerformed
        String msg = "";
        try {
            
            Object[] datos = instancias.getSql().getDatosMaestra();
            Logs.log("Datos " + datos[0]);
            if(datos[0] != null){
                msg = "Se conecto a la base de datos ";
            }else{
                msg = "Error conectando a la base de datos, es recomendable que reinicie la aplicación";
                metodos.msgError(null, msg);
            }
            
            Socket s = new Socket(Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            if (s.isConnected()) {
                msg = msg + " , y tiene conexión a internet";  
                metodos.msgExito(null, msg);
            }else{
                metodos.msgAdvertenciaAjustado(null, msg);
                msg = msg + " , no se pudo conectar a internet ";   
            }
        } catch (Exception e) {
            msg = msg +  " , no se pudo conectar a internet.";
            metodos.msgAdvertenciaAjustado(null, msg); 
        }
    }//GEN-LAST:event_lbVentas7ActionPerformed

    private void lbPTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbPTMActionPerformed
        if (instancias.getUsuarioLog().getUsuario().equals("ADMIN")) {
            instancias.getServiciosPTM().setSelected(true);
            instancias.getMenu().cambiarTitulo("SERVICIOS PTM");

            boolean seVe = instancias.getMenu().getSeVeElMenu();
            if (seVe) {
                instancias.getMenu().ocultarMenu("");
                btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecha.png")));
            }
        } else {
            metodos.msgAdvertencia(null, "Función solo disponible para el usuario administrador.");
        }
    }//GEN-LAST:event_lbPTMActionPerformed

    private void btnPTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPTMActionPerformed
        if (instancias.getUsuarioLog().getUsuario().equals("ADMIN")) {
            instancias.getServiciosPTM().setSelected(true);
            instancias.getMenu().cambiarTitulo("SERVICIOS PTM");
            activarColor(btnPTM, "Ptm");

            boolean seVe = instancias.getMenu().getSeVeElMenu();
            if (seVe) {
                instancias.getMenu().ocultarMenu("");
                btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/derecha.png")));
            }
        } else {
            metodos.msgAdvertencia(null, "Función solo disponible para el usuario administrador.");
        }
    }//GEN-LAST:event_btnPTMActionPerformed

    private void btnParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParqueaderoActionPerformed
        animacion("parqueadero");
        activarColor(btnParqueadero, "Parqueadero");
    }//GEN-LAST:event_btnParqueaderoActionPerformed

    private void btnRecordatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordatoriosActionPerformed
        animacion("recordatorio");
        activarColor(btnRecordatorios, "Recordatorio");
    }//GEN-LAST:event_btnRecordatoriosActionPerformed

    private void btnLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaboratorioActionPerformed
        animacion("laboratorio");
        activarColor(btnLaboratorio, "Laboratorio");
    }//GEN-LAST:event_btnLaboratorioActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        if (btnSalir.isEnabled()) {
            msgSalir salir = new msgSalir(this, seVeElMenu, "");
            salir.setVisible(true);
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ajustarPantalla();  
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        new dlgConsultarCodigos(this, true).setVisible(true);
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnMedicamentos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentos1ActionPerformed
        try {
            instancias.getPlantillas().setSelected(true);
            instancias.getMenu().cambiarTitulo("PLANTILLAS");
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMedicamentos1ActionPerformed

    private void btnParqueadero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParqueadero1ActionPerformed
        animacion("parqueadero");
        activarColor(btnParqueadero, "Parqueadero");
    }//GEN-LAST:event_btnParqueadero1ActionPerformed

    private void btnContable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContable1ActionPerformed
        animacion("contable");
    }//GEN-LAST:event_btnContable1ActionPerformed

    private void btnContableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContableActionPerformed
        animacion("contable");
        activarColor(btnContable, "Contable");
    }//GEN-LAST:event_btnContableActionPerformed

    private void btnCorresponsalWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorresponsalWebActionPerformed
        // TODO add your handling code here:
        corresponsalBancario();
    }//GEN-LAST:event_btnCorresponsalWebActionPerformed
    
    public void corresponsalBancario() {
        if (instancias.getUsuarioLog().getUsuario().equals("ADMIN")) {
            try {
                Runtime.getRuntime().exec("C:\\Windows\\System32\\cmd.exe /K  start " + Propiedades.getInstancia().getUrlClickingPosWeb() + "");
            } catch (IOException e) {
                System.err.println("Error " + e);
            }
        } else {
            metodos.msgAdvertencia(null, "Función solo disponible para el usuario administrador.");
        }
    }
    
    public void cerrarAlCambiar() {
        solicitudesPermisos solicitudes = new solicitudesPermisos();
        solicitudes.interrupt();
        this.dispose();

        if (!instancias.getUsuario().equals("ADMIN")) {
            if ((Boolean) datos[108]) {
                Object[][] vendedores = instancias.getSql().getVendedores1();

                for (int i = 0; i < vendedores.length; i++) {
                    String asociado = "";
                    try {
                        asociado = vendedores[i][1].toString();
                    } catch (Exception e) {
                    }

                    if (instancias.getUsuario().equals(asociado)) {
                        soloMesas();
                    }
                }
            }
        }
    }

    public void setInstancias(Instancias instancias) {

        this.instancias = instancias;

        dlgConfiguraciones internoConfig = new dlgConfiguraciones(null, true);
        instancias.setConfiguraciones(internoConfig);
        internoConfig.cargarConfiguraciones();

        /* INICIAMOS CON CONTABLE */
        try {
            infComprobantes interno = new infComprobantes();
            dkpFormularios.add(interno);
            interno.show();
            instancias.setComprobantes(interno);
            interno.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infReportesContables interno = new infReportesContables();
            dkpFormularios.add(interno);
            interno.show();
            instancias.setReportesContables(interno);
            interno.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infEstructura interno = new infEstructura();
            dkpFormularios.add(interno);
            interno.show();
            instancias.setEstructura(interno);
            interno.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infPUC interno = new infPUC();
            dkpFormularios.add(interno);
            interno.show();
            instancias.setPuc(interno);
            interno.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infCentroCostos interno = new infCentroCostos();
            dkpFormularios.add(interno);
            interno.show();
            instancias.setCentroCostos(interno);
            interno.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infInterfase interno = new infInterfase();
            dkpFormularios.add(interno);
            interno.show();
            instancias.setInterfase(interno);
            interno.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // FIN DE LO CONTABLE //

        /* INICIAMOS CON PLANTILLAS */
        try {
            infPlantillas interno = new infPlantillas();
            dkpFormularios.add(interno);
            interno.show();
            instancias.setPlantillas(interno);
            interno.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // FIN DE LAS PLANTILLAS //
        // FIN DE LAS PLANTILLAS //

        /* INICIAMOS CON MAESTROS */
        try {
            infMaestra interno = new infMaestra();
            dkpFormularios.add(interno);
            interno.show();
            instancias.setMaestra(interno);
            interno.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // FIN DE MAESTROS //
        // FIN DE MAESTROS //

        /* INICIAMOS CON VENTAS */
        try {
            infPedido interno14 = new infPedido();
            dkpFormularios.add(interno14);
            if (instancias.getUsuarioLog().isPedidos()) {
                interno14.show();
            }
            interno14.setMaximum(true);
            instancias.setPedido(interno14);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infPlanSepare interno14 = new infPlanSepare();
            dkpFormularios.add(interno14);
            if (instancias.getUsuarioLog().isPlanSepares()) {
                interno14.show();
            }
            interno14.setMaximum(true);
            instancias.setPlanSepare(interno14);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infFacturarLotes interno14 = new infFacturarLotes();
            dkpFormularios.add(interno14);
            instancias.setFacturarLotes(interno14);
//            if (instancias.getUsuarioLog().isFact()) {
            interno14.show();
//            }
            interno14.setMaximum(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infCuentaCobro interno14 = new infCuentaCobro();
            dkpFormularios.add(interno14);
            instancias.setCuentaCobro(interno14);
//            if (instancias.getUsuarioLog().isFact()) {
            interno14.show();
//            }
            interno14.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infKardexProductos interno4 = new infKardexProductos();
            dkpFormularios.add(interno4);
            instancias.setKardexProductos(interno4);
            if (instancias.getUsuarioLog().isKardex()) {
                interno4.show();
            }
            interno4.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infProductos interno4 = new infProductos();
            dkpFormularios.add(interno4);
            instancias.setProductos(interno4);
            if (instancias.getUsuarioLog().isCreacionProductos()) {
                interno4.show();
            }
            interno4.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infEgresos interno11 = new infEgresos();
            dkpFormularios.add(interno11);
            instancias.setEgresos(interno11);
            if (instancias.getUsuarioLog().isEgresos()) {
                interno11.show();
            }
            interno11.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infPrestamos interno11 = new infPrestamos();
            dkpFormularios.add(interno11);
            instancias.setPrestamos(interno11);
            if (instancias.getUsuarioLog().isTrasladosExternos()) {
                interno11.show();
            }
            interno11.setMaximum(true);
            interno11.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infTrasladosInternos interno11 = new infTrasladosInternos();
            dkpFormularios.add(interno11);
            instancias.setTrasladosInternos(interno11);
            if (instancias.getUsuarioLog().isTrasladosInternos()) {
                interno11.show();
            }
            interno11.setMaximum(true);
            interno11.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infReimpresion interno = new infReimpresion();
            dkpFormularios.add(interno);
            instancias.setReimpresion(interno);
            if (instancias.getUsuarioLog().isReimpresion()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            formularios.Ventas.infOrdenServicio interno14 = new formularios.Ventas.infOrdenServicio();
            dkpFormularios.add(interno14);
            instancias.setOrdenServicio(interno14);
            if (instancias.getUsuarioLog().isOrdenesServicio()) {
                interno14.show();
            }
            interno14.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infFactura interno14 = new infFactura();
            dkpFormularios.add(interno14);
            instancias.setFactura(interno14);
            if (instancias.getUsuarioLog().isFacturas()) {
                interno14.show();
            }
            interno14.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infCotiza interno6 = new infCotiza();
            dkpFormularios.add(interno6);
            instancias.setCotiza(interno6);
            if (instancias.getUsuarioLog().isCotizaciones()) {
                interno6.show();
            }
            interno6.setMaximum(true);
            interno6.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infAnula interno = new infAnula();
            dkpFormularios.add(interno);
            instancias.setAnula(interno);
            if (instancias.getUsuarioLog().isAnulaciones()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (instancias.getConfiguraciones().isPtm()) {
            /* INICIAMOS CON SERVICIOS PTM */
            try {
                infInicioPTM interno = new infInicioPTM();
                dkpFormularios.add(interno);
                interno.show();
                instancias.setServiciosPTM(interno);
                interno.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            // FIN DE PTM //
            // FIN DE PTM //
        }
        
         try {
            buscFacturasElectronicasDian interno14 = new buscFacturasElectronicasDian();
            dkpFormularios.add(interno14);
            if (instancias.getUsuarioLog().isFacturas()) {
                interno14.show();
            }
            interno14.setMaximum(true);
            instancias.setFacturaElectronicaDian(interno14);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        if (instancias.getConfiguraciones().isCongeladas()) {
            try {
                infMesa interno14 = new infMesa();
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isCongeladas()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setMesa(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infMesas interno14 = new infMesas();
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isCongeladas()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setMesas(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infMesas1 interno14 = new infMesas1();
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isCongeladas()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setMesas1(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        /* TERMINAMOS CON VENTAS */

        /* PRODUCTOS */
        try {
            infInventarioInicial interno14 = new infInventarioInicial();
            dkpFormularios.add(interno14);
            instancias.setInventarioInicial(interno14);
            if (instancias.getUsuarioLog().isInventarioInicial()) {
                interno14.show();
            }
            interno14.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infGrupos interno14 = new infGrupos();
            dkpFormularios.add(interno14);
            instancias.setGrupos(interno14);
            if (instancias.getUsuarioLog().isGrupos()) {
                interno14.show();
            }
            interno14.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infOrdenCompra interno13 = new infOrdenCompra();
            dkpFormularios.add(interno13);
            instancias.setOrdenCompra(interno13);
            if (instancias.getUsuarioLog().isOrdenesCompras()) {
                interno13.show();
            }
            interno13.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infAjustesInv interno13 = new infAjustesInv();
            dkpFormularios.add(interno13);
            instancias.setuInt(interno13);
            interno13.show();
            interno13.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infCosteo interno14 = new infCosteo();
            dkpFormularios.add(interno14);
            instancias.setCosteo(interno14);
            if (instancias.getUsuarioLog().isDisenos()) {
                interno14.show();
            }
            interno14.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infArmado interno14 = new infArmado();
            dkpFormularios.add(interno14);
            instancias.setArmado(interno14);
            if (instancias.getUsuarioLog().isArmados()) {
                interno14.show();
            }
            interno14.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infReportesProductos interno = new infReportesProductos();
            dkpFormularios.add(interno);
            instancias.setReportesProductos(interno);
            if (instancias.getUsuarioLog().isReporteProductos()) {
                interno.show();
            }
            interno.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infIngreso interno13 = new infIngreso();
            dkpFormularios.add(interno13);
            instancias.setIngresos(interno13);
            if (instancias.getUsuarioLog().isCompras()) {
                interno13.show();
            }
            interno13.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            infAjustesInventarioTotal infAjusteInv = new infAjustesInventarioTotal();
            dkpFormularios.add(infAjusteInv);
            instancias.setAjusteInventarioTotal(infAjusteInv);
            if (instancias.getUsuarioLog().isReporteProductos()) {
                infAjusteInv.show();
            }
            infAjusteInv.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* FIN DE PRODUCTOS */

        /*INICIO DE TERCEROS */
        try {
            infClientes interno3 = new infClientes("");
            dkpFormularios.add(interno3);
            instancias.setClientes(interno3);
            if (instancias.getUsuarioLog().isCrearClientes()) {
                interno3.show();
            }
            interno3.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infRepEmpleados interno = new infRepEmpleados();
            dkpFormularios.add(interno);
            instancias.setRepEmpleados(interno);
            if (instancias.getUsuarioLog().isReporteEmpleados()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infEmpleados interno = new infEmpleados();
            dkpFormularios.add(interno);
            instancias.setEmpleados(interno);
            if (instancias.getUsuarioLog().isCrearEmpleado()) {
                interno.show();
            }
            interno.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infProveedores interno1 = new infProveedores();
            dkpFormularios.add(interno1);
            instancias.setProveedores(interno1);
            if (instancias.getUsuarioLog().isCrearProveedor()) {
                interno1.show();
            }
            interno1.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infBodegasClientes interno2 = new infBodegasClientes();
            dkpFormularios.add(interno2);
            instancias.setBodegasClientes(interno2);
            if (instancias.getUsuarioLog().isClientesPrestamos()) {
                interno2.show();
            }
            interno2.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infBodegas interno2 = new infBodegas();
            dkpFormularios.add(interno2);
            instancias.setBodegas(interno2);
            if (instancias.getUsuarioLog().isBodegasInternas()) {
                interno2.show();
            }
            interno2.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infRepClientes interno = new infRepClientes();
            dkpFormularios.add(interno);
            instancias.setRepClientes(interno);
            if (instancias.getUsuarioLog().isReporteClientes()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infRepProveedores interno = new infRepProveedores();
            dkpFormularios.add(interno);
            instancias.setRepProveedores(interno);
            if (instancias.getUsuarioLog().isReporteProveedor()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* FIN DE TERCEROS */

        /* INICIO CARTERA  */
        try {
            infRepAbonos interno = new infRepAbonos();
            dkpFormularios.add(interno);
            instancias.setRepAbonos(interno);
            if (instancias.getUsuarioLog().isReporteAbonosCxC()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infRepNc interno = new infRepNc();
            dkpFormularios.add(interno);
            instancias.setRepNC(interno);
            if (instancias.getUsuarioLog().isReporteNotasCredito()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infAbonos interno = new infAbonos();
            dkpFormularios.add(interno);
            instancias.setAbonos(interno);
            if (instancias.getUsuarioLog().isAbonosCxC()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infRepCartera interno = new infRepCartera();
            dkpFormularios.add(interno);
            instancias.setRepCartera(interno);
            if (instancias.getUsuarioLog().isReporteCarteraCxC()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infPagos interno14 = new infPagos();
            dkpFormularios.add(interno14);
            instancias.setPagos(interno14);
            if (instancias.getUsuarioLog().isAbonosCxP()) {
                interno14.show();
            }
            interno14.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infRepPagos interno14 = new infRepPagos();
            dkpFormularios.add(interno14);
            instancias.setRepPagos(interno14);
            if (instancias.getUsuarioLog().isReporteCarteraCxP()) {
                interno14.show();
            }
            interno14.setMaximum(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        /* FIN CARTERA */

        /* INICIO TESORERIA */
        try {
            infCaja interno15 = new infCaja();
            dkpFormularios.add(interno15);
            instancias.setCaja(interno15);
            if (instancias.getUsuarioLog().isCuadreCaja()) {
                interno15.show();
            }
            interno15.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infNC interno15 = new infNC();
            dkpFormularios.add(interno15);
            instancias.setNc(interno15);
            if (instancias.getUsuarioLog().isNotasCredito()) {
                interno15.show();
            }
            interno15.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infND interno15 = new infND();
            dkpFormularios.add(interno15);
            instancias.setNd(interno15);
            if (instancias.getUsuarioLog().isNotasCredito()) {
                interno15.show();
            }
            interno15.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infRepEgresos interno = new infRepEgresos();
            dkpFormularios.add(interno);
            instancias.setRepEgresos(interno);
            if (instancias.getUsuarioLog().isReporteEgresos()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infCodsEgresos interno = new infCodsEgresos();
            dkpFormularios.add(interno);
            if (instancias.getUsuarioLog().isCodigos()) {
                interno.show();
            }
            instancias.setCodigosEgresos(interno);
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infRepCuadre interno14 = new infRepCuadre();
            dkpFormularios.add(interno14);
            if (instancias.getUsuarioLog().isReporteCuadreCaja()) {
                interno14.show();
            }
            interno14.setMaximum(true);
            instancias.setRepCuadre(interno14);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infBancos interno11 = new infBancos();
            dkpFormularios.add(interno11);
            instancias.setBancos(interno11);
            if (instancias.getUsuarioLog().isBancos()) {
                interno11.show();
            }
            interno11.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infRepBancos interno = new infRepBancos();
            dkpFormularios.add(interno);
            instancias.setRepBancos(interno);
            if (instancias.getUsuarioLog().isReporteBancos()) {
                interno.show();
            }
            interno.setMaximum(true);
            interno.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* FIN TESORERIA */

        /* INICIO AGENDA */
        if (instancias.getConfiguraciones().isAgenda()) {
            try {
                infAgendaConsulta interno14 = new infAgendaConsulta();
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isRegistrarAgenda()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setAgendaConsulta(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRepAgenda interno14 = new infRepAgenda("");
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isReportesAgenda()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setRepAgenda(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /* FIN AGENDA */

        /* INICIO VETERINARIO */
        if (instancias.getConfiguraciones().isVeterinaria()) {
            try {
                infAlertasProximas interno14 = new infAlertasProximas();
                dkpFormularios.add(interno14);
                instancias.setAlertasProximas(interno14);
                if (instancias.getUsuarioLog().isAlertas()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infFormatos interno14 = new infFormatos();
                dkpFormularios.add(interno14);
                instancias.setFormatos(interno14);
                if (instancias.getUsuarioLog().isFormatos()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infMascotas interno14 = new infMascotas();
                dkpFormularios.add(interno14);
                instancias.setMascotas(interno14);
                if (instancias.getUsuarioLog().isMascotas()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infHospitalizacion interno14 = new infHospitalizacion();
                dkpFormularios.add(interno14);
                instancias.setHospitalizacion(interno14);
                interno14.show();
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infIngresoHospitalizacion interno14 = new infIngresoHospitalizacion();
                dkpFormularios.add(interno14);
                instancias.setIngresoHospitalizacion(interno14);
                if (instancias.getUsuarioLog().isAlertas()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRepMascotas interno14 = new infRepMascotas();
                dkpFormularios.add(interno14);
                instancias.setRepMascotas(interno14);
                if (instancias.getUsuarioLog().isReporteMascotas()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infHistoria interno14 = new infHistoria();
                dkpFormularios.add(interno14);
                instancias.setHistoria(interno14);
                if (instancias.getUsuarioLog().isHistoriaClinica()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRepPeluqueria interno14 = new infRepPeluqueria();
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isReportePeluqueria()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setRepPeluqueria(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRepGuarderia interno14 = new infRepGuarderia();
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isReporteGuarderia()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setRepGuarderia(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRepHospitalizacion interno14 = new infRepHospitalizacion();
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isReporteHospitalizacion()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setRepHospitalizacion(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infPeluqueria interno14 = new infPeluqueria();
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isPeluqueria()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setPeluqueria(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infGuarderia interno14 = new infGuarderia();
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isGuarderia()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setGuarderia(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infQuirurgica interno14 = new infQuirurgica();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setQuirurgica(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRemisionVeterinaria interno14 = new infRemisionVeterinaria();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setRemisionVeterinaria(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infFormulaMedicaVeterinaria interno14 = new infFormulaMedicaVeterinaria();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setFormulaMedicaVeterinaria(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infAyudaDiagnosticoVeterinaria interno14 = new infAyudaDiagnosticoVeterinaria();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setAyudaDiagnosticoVeterinaria(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /* FIN VETERINARIO */

//         /*CORRESPONSALES*/
//        if (instancias.getConfiguraciones().isCorresponsalWeb()) {
//            System.err.println("instancias.getConfiguraciones().isCorresponsalWeb() "+instancias.getConfiguraciones().isCorresponsalWeb());
//         try {
//                infCorresponsales interno4 = new infCorresponsales();
//                dkpFormularios.add(interno4);
//                instancias.setCorresponsalBancario(interno4);
//                interno4.show();
//                interno4.setMaximum(true);
//                repaint();
//            } catch (PropertyVetoException ex) {
//                 System.err.println("error menu "+ex);
//                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        /*FIN CORRESPONSALES*/  
        instancias.setMenu(this);

        /* INICIO PARQUEADERO */
        if (instancias.getConfiguraciones().isParqueadero()) {

            try {
                infMensualidad interno = new infMensualidad();
                dkpFormularios.add(interno);
                instancias.setMensualidad(interno);
//            if (instancias.getUsuarioLog().isEste()) {
                interno.show();
//            }
                interno.setMaximum(true);
                interno.setSelected(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRepMensualidades interno = new infRepMensualidades();
                dkpFormularios.add(interno);
                instancias.setRepMensualidades(interno);
//            if (instancias.getUsuarioLog().isEste()) {
                interno.show();
//            }
                interno.setMaximum(true);
                interno.setSelected(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRepParqueadero interno = new infRepParqueadero();
                dkpFormularios.add(interno);
                instancias.setRepParqueadero(interno);
//            if (instancias.getUsuarioLog().isrCuent()) {
                interno.show();
//            }
                interno.setMaximum(true);
                interno.setSelected(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infParqueadero interno = new infParqueadero();
                dkpFormularios.add(interno);
                instancias.setParqueadero(interno);
//            if (instancias.getUsuarioLog().isrCuent()) {
                interno.show();
//            }
                interno.setMaximum(true);
                interno.setSelected(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRepLavadero interno = new infRepLavadero();
                dkpFormularios.add(interno);
                instancias.setRepLavadero(interno);
//            if (instancias.getUsuarioLog().isdNomi()) {
                interno.show();
//            }
                interno.setMaximum(true);
                interno.setSelected(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRepLavadero1 interno = new infRepLavadero1();
                dkpFormularios.add(interno);
                instancias.setRepLavadero1(interno);
//            if (instancias.getUsuarioLog().isrLav()) {
                interno.show();
//            }
                interno.setMaximum(true);
                interno.setSelected(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infLavadero interno = new infLavadero();
                dkpFormularios.add(interno);
                instancias.setLavadero(interno);
//            if (instancias.getUsuarioLog().isrLav()) {
                interno.show();
//            }
                interno.setMaximum(true);
                interno.setSelected(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRepHistorial interno = new infRepHistorial();
                dkpFormularios.add(interno);
                instancias.setRepHistorial(interno);
//            if (instancias.getUsuarioLog().isrLav()) {
                interno.show();
//            }
                interno.setMaximum(true);
                interno.setSelected(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        /* FIN PARQUEADERO */

        try {
            infRepAbonosCxp interno = new infRepAbonosCxp();
            dkpFormularios.add(interno);
            instancias.setRepAbonosCxp(interno);
            interno.show();
            interno.setMaximum(true);
            interno.setSelected(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infUsuarios interno14 = new infUsuarios();
            dkpFormularios.add(interno14);
            instancias.setUsuarios(interno14);
            interno14.show();
            interno14.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infModificarPrecio interno14 = new infModificarPrecio();
            dkpFormularios.add(interno14);
            instancias.setModificarPrecio(interno14);
            interno14.show();
            interno14.setMaximum(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infFacturaCreditos interno14 = new infFacturaCreditos();
            dkpFormularios.add(interno14);
            if (instancias.getUsuarioLog().isCreditos()) {
                interno14.show();
            }
            interno14.setMaximum(true);
            instancias.setFacturaCreditos(interno14);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infReportesVentas interno14 = new infReportesVentas();
            dkpFormularios.add(interno14);
            interno14.show();
            interno14.setMaximum(true);
            instancias.setReportesVentas(interno14);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            infPreparacion interno14 = new infPreparacion();
            dkpFormularios.add(interno14);
            interno14.show();
            interno14.setMaximum(true);
            instancias.setPreparacion(interno14);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        //SI TIENE ACTIVADO EL MODULO DE RECORDATORIOS
        if (instancias.getConfiguraciones().isRecordatorios()) {
            try {
                infRecordatorios interno14 = new infRecordatorios();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setRecordatorios(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }

        //SI TIENE ACTIVADO EL MODULO DE OFTAMOLOGIA
        if (instancias.getConfiguraciones().isOftalmologia()) {
            try {
                infClientes interno3 = new infClientes("paciente");
                dkpFormularios.add(interno3);
                instancias.setPaciente(interno3);
                interno3.show();
                interno3.setMaximum(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infHojaIngreso interno3 = new infHojaIngreso();
                dkpFormularios.add(interno3);
                instancias.setHojaIngreso(interno3);
                interno3.show();
                interno3.setMaximum(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infAyudaDiagnosticoOf interno3 = new infAyudaDiagnosticoOf();
                dkpFormularios.add(interno3);
                instancias.setAyudaDiagnosticoOf(interno3);
                interno3.show();
                interno3.setMaximum(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infFormulaMedicaOf interno3 = new infFormulaMedicaOf();
                dkpFormularios.add(interno3);
                instancias.setFormulaMedicaOf(interno3);
                interno3.show();
                interno3.setMaximum(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infIncapacidadOf interno3 = new infIncapacidadOf();
                dkpFormularios.add(interno3);
                instancias.setIncapacidadOf(interno3);
                interno3.show();
                interno3.setMaximum(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infFormulaLentesOf interno3 = new infFormulaLentesOf();
                dkpFormularios.add(interno3);
                instancias.setFormulaLentes(interno3);
                interno3.show();
                interno3.setMaximum(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infBiometria interno3 = new infBiometria();
                dkpFormularios.add(interno3);
                instancias.setBiometria(interno3);
                interno3.show();
                interno3.setMaximum(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infPaquimetria interno3 = new infPaquimetria();
                dkpFormularios.add(interno3);
                instancias.setPaquimetria(interno3);
                interno3.show();
                interno3.setMaximum(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }

        //SI TIENE ACTIVADO EL MODULO DE LABORATORIO
        if (instancias.getConfiguraciones().isLaboratorio()) {
            try {
                infClientes interno3 = new infClientes("paciente");
                dkpFormularios.add(interno3);
                instancias.setPaciente(interno3);
                interno3.show();
                interno3.setMaximum(true);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infAcidoUrico interno14 = new infAcidoUrico();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setAcidoUrico(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infHistoriaLaboratorio interno14 = new infHistoriaLaboratorio();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setHistoriaLaboratorio(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infPerfil interno14 = new infPerfil();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setPerfil(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infEmbarazo interno14 = new infEmbarazo();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setEmbarazo(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infGlicemia interno14 = new infGlicemia();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setGlicemia(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infKoh interno14 = new infKoh();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setKoh(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infProteina interno14 = new infProteina();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setProteina(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infTiempos interno14 = new infTiempos();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setTiempos(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infSerologia interno14 = new infSerologia();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setSerologia(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infHemoclasificacion interno14 = new infHemoclasificacion();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setHemoclasificacion(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infHemograma interno14 = new infHemograma();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setHemograma(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infCreatinina interno14 = new infCreatinina();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setCreatinina(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infDirecto interno14 = new infDirecto();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setDirectos(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infAntiestreptolisina interno14 = new infAntiestreptolisina();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setAntiestreptosilina(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infSangreOculta interno14 = new infSangreOculta();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setSangreOculta(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infAcidos interno14 = new infAcidos();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setAcidos(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infHemoglobina interno14 = new infHemoglobina();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setHemoglobina(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infCannabinoides interno14 = new infCannabinoides();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setCannabinoides(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infCitoquimico interno14 = new infCitoquimico();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setCitoquimico(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infCocaina interno14 = new infCocaina();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setCocaina(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infCoprologico interno14 = new infCoprologico();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setCoprologico(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infCoprograma interno14 = new infCoprograma();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setCoprograma(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infColesterol interno14 = new infColesterol();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setColesterol(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (instancias.getConfiguraciones().isMedico() || instancias.getConfiguraciones().isLaboratorio() || instancias.getConfiguraciones().isOftalmologia()) {
            try {
                infRips interno14 = new infRips();
                dkpFormularios.add(interno14);
                instancias.setRips(interno14);
//                if (instancias.getUsuarioLog().isrNomi()) {
                interno14.show();
//                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //SI TIENE ACTIVADO EL MODULO DE MEDICO
        if (instancias.getConfiguraciones().isMedico()) {
            try {
                infReportesMedico interno3 = new infReportesMedico();
                dkpFormularios.add(interno3);
                instancias.setReportesMedicos(interno3);
                interno3.show();
                interno3.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infClientes interno3 = new infClientes("paciente");
                dkpFormularios.add(interno3);
                instancias.setPaciente(interno3);
                if (instancias.getUsuarioLog().isCrearClientes()) {
                    interno3.show();
                }
                interno3.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infEps interno14 = new infEps();
                dkpFormularios.add(interno14);
                interno14.show();
                interno14.setMaximum(true);
                instancias.setEps(interno14);

            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infFormulaMedica interno14 = new infFormulaMedica();
                dkpFormularios.add(interno14);
                instancias.setFormulaMedica(interno14);
                interno14.show();
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infFormatosDeTextos interno14 = new infFormatosDeTextos();
                dkpFormularios.add(interno14);
                if (instancias.getUsuarioLog().isFormatosMedicas()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
                instancias.setPlantillasDeTextos(interno14);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infOrdenServicioMedico interno14 = new infOrdenServicioMedico();
                dkpFormularios.add(interno14);
                instancias.setOrdenMedica(interno14);
                if (instancias.getUsuarioLog().isOrdenesServicioMedica()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infRemision interno14 = new infRemision();
                dkpFormularios.add(interno14);
                instancias.setRemision(interno14);
                interno14.show();
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infContraremision interno14 = new infContraremision();
                dkpFormularios.add(interno14);
                instancias.setContraremision(interno14);
                interno14.show();
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infIncapacidad interno14 = new infIncapacidad();
                dkpFormularios.add(interno14);
                instancias.setIncapacidad(interno14);
                interno14.show();
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infHistoriaC interno14 = new infHistoriaC();
                dkpFormularios.add(interno14);
                instancias.setHistoriaC(interno14);
                if (instancias.getUsuarioLog().isHistoria()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infAyudaDiagnostico interno14 = new infAyudaDiagnostico();
                dkpFormularios.add(interno14);
                instancias.setAyudaDiagnostica(interno14);
                interno14.show();
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infConvenio interno14 = new infConvenio();
                dkpFormularios.add(interno14);
                instancias.setConvenio(interno14);
                if (instancias.getUsuarioLog().isConvenio()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infNotaEnfermeria interno14 = new infNotaEnfermeria();
                dkpFormularios.add(interno14);
                instancias.setNotaEnfermeria(interno14);
                if (instancias.getUsuarioLog().isNotaEnfermaria()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infMedicamentos interno14 = new infMedicamentos();
                dkpFormularios.add(interno14);
                instancias.setMedicamentos(interno14);
                if (instancias.getUsuarioLog().isMedicamentos()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                infHistoriaMedica interno14 = new infHistoriaMedica();
                dkpFormularios.add(interno14);
                instancias.setHistoriaClinica(interno14);
                if (instancias.getUsuarioLog().isHistoria()) {
                    interno14.show();
                }
                interno14.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //FIN MODULO MEDICO

        btnVentasActionPerformed(null);

        solicitudesPermisos solicitudes = new solicitudesPermisos();
        if (instancias.getUsuario().equals("ADMIN")) {
            if ((Boolean) datos[96]) {
                btnSolicitudes.setVisible(true);
                sep4.setVisible(true);
                solicitudes.start();
            } else {
                btnSolicitudes.setVisible(false);
                sep4.setVisible(false);
            }
        } else {
            btnSolicitudes.setVisible(false);
            sep4.setVisible(false);
            solicitudes.stop();
        }

//        if (instancias.getConfiguraciones().isCongeladas()) {
//            cmbAccesos.setVisible(true);
//            sep2.setVisible(true);
//        } else {
//            cmbAccesos.setVisible(false);
//            sep2.setVisible(false);
//        }
//        
        Boolean vendedorActivo = false;
        if (!instancias.getUsuario().equals("ADMIN")) {

            if (instancias.getConfiguraciones().isRestaurante()) {

                if ((Boolean) datos[108]) {
                    Object[][] vendedores = instancias.getSql().getVendedores1();

                    for (int i = 0; i < vendedores.length; i++) {
                        String asociado = "";
                        try {
                            asociado = vendedores[i][1].toString();
                        } catch (Exception e) {
                        }

                        if (instancias.getUsuario().equals(asociado)) {
                            soloMesas();

                            try {
                                infMesas interno14 = new infMesas();
                                dkpFormularios.add(interno14);
                                if (!vendedorActivo) {
                                    interno14.show();
                                }
                                interno14.setMaximum(true);
                                instancias.setMesas(interno14);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            vendedorActivo = true;
                        }
                    }
                }
            }
        }

        try {
            infInicial interno14 = new infInicial();
            dkpFormularios.add(interno14);

            if (!vendedorActivo) {
                interno14.show();
            }

            interno14.setMaximum(true);
            instancias.setInicial(interno14);
            interno14.setInstancias(this.instancias);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        instancias.getMaestra().todosListos();
        instancias.getReporte().setFirma("");

////        metodos.alertaPromedioDias();     
//        metodos.alertafechaDias();
//        metodos.alertaCantidadNumeracion();
        if (instancias.getConfiguraciones().isRecordatorios()) {
            Object[][] datosRecor = instancias.getSql().getAlertasRecordatorios("PENDIENTE", metodos.fechaConsulta(metodosGenerales.fecha()));
            if (datosRecor.length > 0) {
                metodos.msgAdvertencia(null, "Tiene recordatorios para hoy");
                alertaRecordatorio alerta = new alertaRecordatorio();
                alerta.start();
                Logs.log("volvio a comenzar");
            }
        }

        alertasHospitalizacionVeterinario alertas = new alertasHospitalizacionVeterinario();
        if (instancias.getConfiguraciones().isVeterinaria()) {

            Object[][] vacunas = instancias.getSql().getVacunasPendientes(metodosGenerales.fecha());
            Object[][] peluquerias = instancias.getSql().getPeluqueriasPendientes(metodosGenerales.fecha());

            Boolean activarAlerta = false;
            if (vacunas.length > 0) {
                activarAlerta = true;
            }
            if (peluquerias.length > 0) {
                activarAlerta = true;
            }

            btnMedicamentos.setVisible(true);
            sep3.setVisible(true);
            alertas.start();

            if (activarAlerta) {
                metodos.msgAdvertencia(null, "Tiene peluquerias o vacunas pendientes para el día de hoy!");
            }
        } else {
            btnMedicamentos.setVisible(false);
            sep3.setVisible(false);
            alertas.stop();
        }

          /*CORRESPONSALES*/
        if (instancias.getConfiguraciones().isCorresponsalWeb()) {
//         try {
//                infCorresponsales interno4 = new infCorresponsales();
//                interno4.cargarVista();
//                dkpFormularios.add(interno4);
//                instancias.setCorresponsalBancario(interno4);
//                interno4.show();
//                interno4.setMaximum(true);
//                repaint();
//            } catch (PropertyVetoException ex) {
//                 System.err.println("error menu "+ex);
//                Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        /*FIN CORRESPONSALES*/ 
        
        if (datos[8] != null) {
            lbNombreEmpresa.setText(datos[8].toString());
        }

        cargarModulos();
        abrirCaja();

        instancias.getMenu().cambiarTitulo("");
    }

    public void soloMesas() {
        btnSalir.setEnabled(true);
        sep2.setVisible(false);
        pnlContenedor.setVisible(false);
        pnlPrincipal.setVisible(false);
        pnlMenu.setVisible(false);
        cmbAccesos.setVisible(false);
        btnOcultar.setVisible(false);
        pnlMiniaturas.setVisible(false);
        pnlOpcionesPeque.setVisible(false);
        btnCambiarUsuario.setEnabled(true);
        btnCambiarUsuario.setEnabled(true);
    }

    public void actualizarMedicamentos(boolean cambiarColor) {
        if (cambiarColor) {
            btnMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/medicina2.png")));
        } else {
            btnMedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/medicina1.png")));
        }
    }

    public void actualizarPermisos(int cant, boolean cambiarColor, Boolean actualizarTexto) {
        if (actualizarTexto) {
            btnSolicitudes.setText("(" + cant + ")");
        }

        if (cambiarColor) {
            btnSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buzonRojo.png")));
//            btnSolicitudes.setForeground(Color.red);
        } else {
            btnSolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buzonBlanco.png")));
//            btnSolicitudes.setForeground(Color.white);
        }
    }

    public void cambiarTitulo(String titulo) {
        lbTitulo.setText(titulo);
    }

    public void abrirCaja() {
        if (instancias.getImpresion().equals("pos")) {
            btnAbrirCaja.setVisible(false);
            //Para cuando sea pos active el boton de abrir caja
//            btnAbrirCaja.setVisible(true);
        } else {
            btnAbrirCaja.setVisible(false);
        }
    }

    public void llamarRecordatorio() {
        btnAgendaActionPerformed(null);
        infRecordatorios inf = new infRecordatorios();
        inf.llamarRecordatorios();
    }

    public void cargarModulos() {
        if (instancias.getConfiguraciones().isAgenda()) {
            btnAgenda.setVisible(true);
            lbAgenda1.setVisible(true);
        } else {
            btnAgenda.setVisible(false);
            lbAgenda1.setVisible(false);
        }

        if (instancias.getConfiguraciones().isPtm()) {
            lbPTM.setVisible(true);
            btnPTM.setVisible(true);
        } else {
            lbPTM.setVisible(false);
            btnPTM.setVisible(false);
        }

        if (instancias.getConfiguraciones().isVeterinaria()) {
            btnVeterinario.setVisible(true);
            lbVeterinaria1.setVisible(true);
        } else {
            btnVeterinario.setVisible(false);
            lbVeterinaria1.setVisible(false);
        }

        if (instancias.getConfiguraciones().isRecordatorios()) {
            btnRecordatorios.setVisible(true);
        } else {
            btnRecordatorios.setVisible(false);
        }

        if (instancias.getConfiguraciones().isMedico()) {
            btnMedico.setVisible(true);
            lbMedico1.setVisible(true);
        } else {
            btnMedico.setVisible(false);
            lbMedico1.setVisible(false);
        }

        if (instancias.getConfiguraciones().isLaboratorio()) {
            btnLaboratorio.setVisible(true);
        } else {
            btnLaboratorio.setVisible(false);
        }

        if (instancias.getConfiguraciones().isOftalmologia()) {
            btnOftalmologia.setVisible(true);
        } else {
            btnOftalmologia.setVisible(false);
        }

        if (instancias.getConfiguraciones().isParqueadero()) {
            btnParqueadero.setVisible(true);
            btnParqueadero1.setVisible(true);
        } else {
            btnParqueadero.setVisible(false);
            btnParqueadero1.setVisible(false);
        }

        if (instancias.getConfiguraciones().isPuc()) {
            btnContable.setVisible(true);
            btnContable1.setVisible(true);
        } else {
            btnContable.setVisible(false);
            btnContable1.setVisible(false);
        }
        
        if (instancias.getConfiguraciones().isCorresponsalWeb()) {
//            btnContable2.setVisible(true);
            btnCorresponsalWeb.setVisible(true);
        } else {
//            btnContable2.setVisible(false);
            btnCorresponsalWeb.setVisible(false);
        }

//        if (instancias.getConfiguraciones().isMedico() || instancias.getConfiguraciones().isLaboratorio() || instancias.getConfiguraciones().isOftalmologia()) {
//            btnRips.setVisible(true);
//            lbRips1.setVisible(true);
//        } else {
//            btnRips.setVisible(false);
//            lbRips1.setVisible(false);
//        }
    }

    public JDesktopPane getDkpFormularios() {
        return dkpFormularios;
    }

    public void setDkpFormularios(JDesktopPane dkpFormularios) {
        this.dkpFormularios = dkpFormularios;
    }

//    public void menu(int i) {
//        switch (i) {
//            case 1:
//                lbVentasActionPerformed(null);
//                break;
//            case 2:
//                lbVentas1ActionPerformed(null);
//                break;
//            case 3:
//                lbVentas2ActionPerformed(null);
//                break;
//            case 4:
//                lbVentas3ActionPerformed(null);
//                break;
//            case 5:
//                lbVentas4ActionPerformed(null);
//                break;
//            case 6:
//                lbVentas5ActionPerformed(null);
//                break;
//            case 7:
//                lbVentas7ActionPerformed(null);
//                break;
//        }
//
//        lbItem1ActionPerformed(null);
//        expandirMenu();
//    }
    public void ocultarMenu(String desde) {
//        pnlMiniaturas.setVisible(true);
//        pnlOpcionesPeque.setVisible(true);
        pnlContenedor.setVisible(false);

        pnlMenu.setSize(0, 0);
//        dkpFormularios.setBounds(0, 0, this.getWidth() - 13, this.getHeight());
        seVeElMenu = false;

        if (desde.equals("preparacion")) {
            noAbrir = false;
            btnOcultar.setEnabled(false);
            btnCambiarUsuario.setEnabled(false);
            btnSalir.setEnabled(false);
            pnlMiniaturas.setVisible(false);
            cmbAccesos.setEnabled(false);
            pnlOpcionesPeque.setVisible(false);
        } else {
            pnlMiniaturas.setVisible(true);
            pnlOpcionesPeque.setVisible(true);
        }
    }

    public void expandirMenu() {
        /*pnlMenu.setBounds(0, 0, (int) pnlMenu.size().getWidth() + 319, (int) pnlMenu.size().getHeight());
         scrlSubMenu.setBounds(0, 0, (int) scrlSubMenu.size().getWidth(), (int) scrlSubMenu.size().getHeight() + 122);
         dkpFormularios.setBounds(331, 128, this.getWidth()-319, this.getHeight()-122);*/
//        pnlMenu.setVisible(true);

        Boolean existe = false;
        if (!instancias.getUsuario().equals("ADMIN")) {

            if (instancias.getConfiguraciones().isRestaurante()) {
                if ((Boolean) datos[108]) {
                    Object[][] vendedores = instancias.getSql().getVendedores1();

                    for (int i = 0; i < vendedores.length; i++) {
                        String asociado = "";
                        try {
                            asociado = vendedores[i][1].toString();
                        } catch (Exception e) {
                            Logs.error(e);
                        }

                        if (instancias.getUsuario().equals(asociado)) {
                            existe = true;
                        }
                    }

                    if (existe) {
                        soloMesas();
                    }
                }
            }
        } else {
            noAbrir = true;
            pnlMiniaturas.setVisible(false);
            pnlOpcionesPeque.setVisible(false);
            pnlContenedor.setVisible(true);

            btnOcultar.setEnabled(true);

            Rectangle auxMenu = new Rectangle(MENU.x, MENU.y, MENU.width, this.getHeight());
            pnlMenu.setBounds(auxMenu);
            auxMenu = new Rectangle(SUBMENU.x, SUBMENU.y, this.getWidth() - 320, SUBMENU.height);
            dkpFormularios.setBounds(323, 128, this.getWidth() - 338, this.getHeight() - 166);
            seVeElMenu = true;

            btnCambiarUsuario.setEnabled(true);
            btnSalir.setEnabled(true);
            cmbAccesos.setEnabled(true);
        }

        if (!existe) {
            pnlMiniaturas.setVisible(false);
            pnlOpcionesPeque.setVisible(false);
            pnlContenedor.setVisible(true);

            btnOcultar.setEnabled(true);

            Rectangle auxMenu = new Rectangle(MENU.x, MENU.y, MENU.width, this.getHeight());
            pnlMenu.setBounds(auxMenu);
            auxMenu = new Rectangle(SUBMENU.x, SUBMENU.y, this.getWidth() - 320, SUBMENU.height);
            dkpFormularios.setBounds(323, 128, this.getWidth() - 338, this.getHeight() - 166);
            seVeElMenu = true;

            btnCambiarUsuario.setEnabled(true);
            btnSalir.setEnabled(true);
            cmbAccesos.setEnabled(true);
        }

    }

    public boolean getSeVeElMenu() {
        return pnlContenedor.isVisible();
    }

    public void activarMensaje(String tipoMsg, String mensaje) {

        lbLogo.setVisible(false);
        pnlMensaje.setVisible(true);
        HTMLEditorKit kit = new HTMLEditorKit();
        msg.setEditorKit(kit);
        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule("div {text-align:center; vertical-align:middle;}");
        styleSheet.addRule("h3 {font-family:verdana;}");
 
        msg.setEditable(false);
        if (tipoMsg.equals("Error")) {
            pnlMensaje.setBackground(new Color(255, 153, 153));
            lbIcon.setText(" Error!");
            lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alert1.png")));
//            jScrollPane1.setVisible(false);
//            lbMensaje.setVisible(true);
//            lbMensaje.setText(mensaje);

            msg.setBackground(new java.awt.Color(255,153,153));
            msg.setContentType("text/html");
            msg.setText("<div><h3>"+mensaje+"</h3></div>");

        } else if (tipoMsg.equals("Exito")) {
            pnlMensaje.setBackground(new Color(153, 255, 153));
            lbIcon.setText(" Exito!");
            lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exito.png")));
//            jScrollPane1.setVisible(false);
//            lbMensaje.setVisible(true);
//            lbMensaje.setText(mensaje);
            msg.setBackground(new java.awt.Color(153, 255, 153));
            msg.setContentType("text/html");
            msg.setText("<div><h3>"+mensaje+"</h3></div>");
        } else if (tipoMsg.equals("Atencion")) {
            pnlMensaje.setBackground(new Color(255, 178, 2));
//            lbMensaje1.setBackground(new Color(255, 178, 2));
            lbIcon.setText(" Atención!");
            lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/advertencia.png")));
//            lbMensaje1.setText(mensaje);
//            lbMensaje.setVisible(false);
//            jScrollPane1.setVisible(true);
   
            msg.setBackground(new java.awt.Color(255, 178, 2));
            msg.setContentType("text/html");
            msg.setText("<div><h3>"+mensaje+"</h3></div>");
        }

        msg.setLocation(0, 0);
        ocultarAlerta ocultarAlert = new ocultarAlerta();
        ocultarAlert.start();
    }

    public void desactivarMensaje() {
        lbLogo.setVisible(true);
        pnlMensaje.setVisible(false);
//        ocultarAlert.stop();
//        ocultarAlert.destroy();
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

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirCaja;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnCartera;
    private javax.swing.JButton btnConexion;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnContable;
    private javax.swing.JButton btnContable1;
    private javax.swing.JButton btnCorresponsalWeb;
    private javax.swing.JButton btnLaboratorio;
    private javax.swing.JButton btnMedicamentos;
    private javax.swing.JButton btnMedicamentos1;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnOcultar;
    private javax.swing.JButton btnOftalmologia;
    private javax.swing.JButton btnPTM;
    private javax.swing.JButton btnParqueadero;
    private javax.swing.JButton btnParqueadero1;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRecordatorios;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JButton btnSolicitudes;
    private javax.swing.JButton btnTerceros;
    private javax.swing.JButton btnTesoreria;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton btnVeterinario;
    private javax.swing.JComboBox cmbAccesos;
    private javax.swing.JDesktopPane dkpFormularios;
    private javax.swing.JButton item1;
    private javax.swing.JButton item10;
    private javax.swing.JButton item11;
    private javax.swing.JButton item12;
    private javax.swing.JButton item13;
    private javax.swing.JButton item2;
    private javax.swing.JButton item3;
    private javax.swing.JButton item4;
    private javax.swing.JButton item5;
    private javax.swing.JButton item6;
    private javax.swing.JButton item7;
    private javax.swing.JButton item8;
    private javax.swing.JButton item9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private formularios.JPanelsSliding jPanelsSliding1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton lbAgenda1;
    private javax.swing.JButton lbConfiguraciones;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JButton lbItem1;
    private javax.swing.JButton lbItem10;
    private javax.swing.JButton lbItem11;
    private javax.swing.JButton lbItem12;
    private javax.swing.JButton lbItem13;
    private javax.swing.JButton lbItem14;
    private javax.swing.JButton lbItem15;
    private javax.swing.JButton lbItem16;
    private javax.swing.JButton lbItem17;
    private javax.swing.JButton lbItem18;
    private javax.swing.JButton lbItem2;
    private javax.swing.JButton lbItem3;
    private javax.swing.JButton lbItem4;
    private javax.swing.JButton lbItem5;
    private javax.swing.JButton lbItem6;
    private javax.swing.JButton lbItem7;
    private javax.swing.JButton lbItem8;
    private javax.swing.JButton lbItem9;
    private javax.swing.JButton lbLogo;
    private javax.swing.JButton lbMedico1;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombreEmpresa;
    private javax.swing.JButton lbPTM;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JButton lbVentas10;
    private javax.swing.JButton lbVentas11;
    private javax.swing.JButton lbVentas12;
    private javax.swing.JButton lbVentas7;
    private javax.swing.JButton lbVentas8;
    private javax.swing.JButton lbVentas9;
    private javax.swing.JLabel lbVersion;
    private javax.swing.JLabel lbVersion1;
    private javax.swing.JButton lbVeterinaria1;
    private javax.swing.JEditorPane msg;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlMensaje;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMiniaturas;
    private javax.swing.JPanel pnlOpcionesPeque;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sep2;
    private javax.swing.JSeparator sep3;
    private javax.swing.JSeparator sep4;
    private javax.swing.JSeparator sep5;
    // End of variables declaration//GEN-END:variables

}
