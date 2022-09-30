package formularios;
import clases.Actividad;
import clases.Cliente;
import clases.Identidad;
import logs.Logs;
import clases.Iniciar2;
import clases.Instancias;
import clases.RespuestaServicioRest;
import clases.metodosGenerales;
import clases.ndUsuario;
import configuracion.Propiedades;
import configuracion.ndConfiguracion;
import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;

public class frmIngresarMulti extends javax.swing.JFrame {

    Inicio insInicio;
    Instancias instancias;
    metodosGenerales metodos = new metodosGenerales();
    private multiempresas mesas;
    int teclasPresionadas = 0;

    public frmIngresarMulti(Inicio x) {
        initComponents();

        insInicio = x;
        instancias = Instancias.getInstancias();   
        instancias.setIngreso(this);
        this.setLocationRelativeTo(null);
        cargarEmpresas();

        this.getRootPane().registerKeyboardAction(accion("primera"), "primera", KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        this.getRootPane().registerKeyboardAction(accion("segunda"), "segunda", KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    public void cargarEmpresas() {
        Object[][] datos = instancias.getSql().getMultiempresas();
        if (datos.length > 1) {
            mesas = new multiempresas(pnlServicios.getSize().width, pnlServicios.getSize().height, datos, this, insInicio);
            mesas.setVisible(true);

            pnlServicios.setLayout(new BorderLayout());
            JScrollPane scrollPane = new JScrollPane(mesas);
            scrollPane.getVerticalScrollBar().setUnitIncrement(50);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            pnlServicios.add(scrollPane);
        } else {
            System.err.println("iniciarAplicacion 7");
           this.insInicio.iniciarAplicacion("");
        }
    }

    private ActionListener accion(final String opc) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
                    case "primera":
                        if (teclasPresionadas == 0) {
                            teclasPresionadas = 1;
                        } else {
                            teclasPresionadas = 0;
                        }
                        break;
                    case "segunda":
                        if (teclasPresionadas == 1) {
                            teclasPresionadas = 2;
                        } else if (teclasPresionadas == 2) {
                            new dlgPedirSuperContrasena(null, true, "pagos").setVisible(true);
                            teclasPresionadas = 0;
                        } else {
                            teclasPresionadas = 0;
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

        jPanel1 = new javax.swing.JPanel();
        pnlServicios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TanFacil.Click");
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(233, 111, 0));

        pnlServicios.setBackground(new java.awt.Color(255, 255, 255));
        pnlServicios.setAutoscrolls(true);
        pnlServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlServiciosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlServiciosLayout = new javax.swing.GroupLayout(pnlServicios);
        pnlServicios.setLayout(pnlServiciosLayout);
        pnlServiciosLayout.setHorizontalGroup(
            pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );
        pnlServiciosLayout.setVerticalGroup(
            pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("     MULTIEMPRESAS");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(pnlServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void pnlServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlServiciosMouseClicked
        this.dispose();
    }//GEN-LAST:event_pnlServiciosMouseClicked

    public String codigoEncriptado(String nit, String nombre) {
        String hashEncriptado = nit + "--" + nombre;
        try {
            hashEncriptado = metodos.EncriptarValidacionUsuario(hashEncriptado, "yI4z%jIMndKd3N%bj#%f");
        } catch (Exception ex) {
            Logs.error(ex);
        }
        return hashEncriptado;
    }

   /* public void validarBloqueo2() {
        Logs.log("Entro a validarBloqueo multiempresas");
        ndConfiguracion nodoConf = instancias.getSql().getDatosConfiguracion();

        String respuesta = "";
        try {
            Socket s = new Socket(Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            if (s.isConnected()) {
                 Logs.log("Entro a validarBloqueo consultarEstado multiempresas");
                Logs.log("Entro a validarBloqueo consultarEstado multiempresas nit "+ nodoConf.getNit() + " nombre "+nodoConf.getNombre());
                respuesta = metodos.consultarEstado2(codigoEncriptado(nodoConf.getNit(), nodoConf.getNombre()));
            }
        } catch (Exception e) {
            Logs.error("No hay conexión de internet y no se validaron datos al entrar");
            Logs.error(e);
        }

        String estado = "", fechaCorte1 = "", fechaCorte = "", anticipacion = "", plazo = "";

        String regimen = "", impoconsumo, dispositivoUSB, ordenesServicio, tipoOrden, creditos, planSepare, pedidos, tipoImpresion, invBodega,
                productosSerial, embarcaciones, congeladas, medico, veterinaria, parqueadero, agenda, restaurante, recordatorios, laboratorio,
                oftalmologia, facturaLote, PTM, periodoPrueba, diasFinalizacionPrueba, numeroFacturas, diasDespuesPrueba, info, actualizarPermiso,
                facturacionElectronica, contable, nitEmisor, tokenEmisor, pais = "Colombia";

        if (respuesta.length() > 0) {
            respuesta = respuesta.substring(1, respuesta.length() - 1);
            estado = respuesta.split("XXX")[0];
            fechaCorte = respuesta.split("XXX")[1];
            anticipacion = respuesta.split("XXX")[2];
            plazo = respuesta.split("XXX")[3];

            Boolean actualizarPermisos = true;

            try {
                if (Integer.parseInt(instancias.getSql().getNumConsecutivoActual("FACT")[0].toString()) > 0) {
                    if (respuesta.split("XXX")[32].equals("0")) {
                        actualizarPermisos = false;
                    }
                }

                if (actualizarPermisos) {
                    regimen = respuesta.split("XXX")[4];
                    impoconsumo = respuesta.split("XXX")[5];
                    dispositivoUSB = respuesta.split("XXX")[6];
                    ordenesServicio = respuesta.split("XXX")[7];
                    tipoOrden = respuesta.split("XXX")[8];
                    creditos = respuesta.split("XXX")[9];
                    planSepare = respuesta.split("XXX")[10];
                    pedidos = respuesta.split("XXX")[11];
                    tipoImpresion = respuesta.split("XXX")[12];
                    invBodega = respuesta.split("XXX")[13];
                    productosSerial = respuesta.split("XXX")[14];
                    embarcaciones = respuesta.split("XXX")[15];
                    congeladas = respuesta.split("XXX")[16];
                    medico = respuesta.split("XXX")[17];
                    veterinaria = respuesta.split("XXX")[18];
                    parqueadero = respuesta.split("XXX")[19];
                    agenda = respuesta.split("XXX")[20];
                    restaurante = respuesta.split("XXX")[21];
                    recordatorios = respuesta.split("XXX")[22];
                    laboratorio = respuesta.split("XXX")[23];
                    oftalmologia = respuesta.split("XXX")[24];
                    facturaLote = respuesta.split("XXX")[25];
                    PTM = respuesta.split("XXX")[26];
                    periodoPrueba = respuesta.split("XXX")[27];
                    diasFinalizacionPrueba = respuesta.split("XXX")[28];
                    numeroFacturas = respuesta.split("XXX")[29];
                    diasDespuesPrueba = respuesta.split("XXX")[30];
                    info = respuesta.split("XXX")[31];
                    facturacionElectronica = respuesta.split("XXX")[33];
                    contable = respuesta.split("XXX")[34];
                    nitEmisor = respuesta.split("XXX")[35];
                    tokenEmisor = respuesta.split("XXX")[36];
                    pais = respuesta.split("XXX")[37];

                    instancias.setNitEmisor(nitEmisor);
                    instancias.setTokenEmisor(tokenEmisor);

                    if (dispositivoUSB.equals("1")) {
                        nodoConf.setUsb(true);
                    } else {
                        nodoConf.setUsb(false);
                    }

                    if (embarcaciones.equals("1")) {
                        nodoConf.setEmbarcaciones(true);
                    } else {
                        nodoConf.setEmbarcaciones(false);
                    }

                    if (congeladas.equals("1")) {
                        nodoConf.setCongeladas(true);
                    } else {
                        nodoConf.setCongeladas(false);
                    }

                    if (medico.equals("1")) {
                        nodoConf.setMedico(true);
                    } else {
                        nodoConf.setMedico(false);
                    }

                    if (laboratorio.equals("1")) {
                        nodoConf.setLaboratorio(true);
                    } else {
                        nodoConf.setLaboratorio(false);
                    }

                    if (veterinaria.equals("1")) {
                        nodoConf.setVeterinaria(true);
                    } else {
                        nodoConf.setVeterinaria(false);
                    }

                    if (parqueadero.equals("1")) {
                        nodoConf.setParqueadero(true);
                    } else {
                        nodoConf.setParqueadero(false);
                    }

                    if (ordenesServicio.equals("1")) {
                        nodoConf.setOrdenServ(true);
                    } else {
                        nodoConf.setOrdenServ(false);
                    }

                    if (creditos.equals("1")) {
                        nodoConf.setCreditos(true);
                    } else {
                        nodoConf.setCreditos(false);
                    }

                    if (planSepare.equals("1")) {
                        nodoConf.setSepare(true);
                    } else {
                        nodoConf.setSepare(false);
                    }

                    if (pedidos.equals("1")) {
                        nodoConf.setPedido(true);
                    } else {
                        nodoConf.setPedido(false);
                    }

                    if (agenda.equals("1")) {
                        nodoConf.setAgenda(true);
                    } else {
                        nodoConf.setAgenda(false);
                    }

                    if (restaurante.equals("1")) {
                        nodoConf.setRestaurante(true);
                    } else {
                        nodoConf.setRestaurante(false);
                    }

                    if (recordatorios.equals("1")) {
                        nodoConf.setRecordatorios(true);
                    } else {
                        nodoConf.setRecordatorios(false);
                    }

                    if (tipoOrden.equals("1")) {
                        nodoConf.setServicioAutomotor(true);
                    } else {
                        nodoConf.setServicioAutomotor(false);
                    }

                    if (facturaLote.equals("1")) {
                        nodoConf.setFacturacionLote(true);
                    } else {
                        nodoConf.setFacturacionLote(false);
                    }

                    if (periodoPrueba.equals("1")) {
                        nodoConf.setPeriodo(true);
                    } else {
                        nodoConf.setPeriodo(false);
                    }

                    if (oftalmologia.equals("1")) {
                        nodoConf.setOftalmologia(true);
                    } else {
                        nodoConf.setOftalmologia(false);
                    }

                    if (invBodega.equals("1")) {
                        nodoConf.setInventarioBodegas(true);
                    } else {
                        nodoConf.setInventarioBodegas(false);
                    }

                    if (productosSerial.equals("1")) {
                        nodoConf.setProductosSerial(true);
                    } else {
                        nodoConf.setProductosSerial(false);
                    }

                    if (PTM.equals("1")) {
                        nodoConf.setPtm(true);
                    } else {
                        nodoConf.setPtm(false);
                    }

                    if (facturacionElectronica.equals("1")) {
                        nodoConf.setFacturaElectronica(true);
                    } else {
                        nodoConf.setFacturaElectronica(false);
                    }

                    if (contable.equals("1")) {
                        nodoConf.setPuc(true);
                    } else {
                        nodoConf.setPuc(false);
                    }

                    nodoConf.setInformacionLegal(info);
                    nodoConf.setNumFacturas(numeroFacturas);
                    nodoConf.setAviso(diasFinalizacionPrueba);
                    nodoConf.setAviso1("");
                    nodoConf.setVentasFactura("estandar");
                    nodoConf.setRegimen(regimen);
                    nodoConf.setDiasAlertaBloqueo(nodoConf.getDiasAlertaBloqueo());
                    nodoConf.setDiasBloqueo(nodoConf.getDiasBloqueo());
                    nodoConf.setImpoconsumo(impoconsumo);
                    nodoConf.setActualizacion(metodos.fechaConsulta(metodosGenerales.fecha()));
                    nodoConf.setDiasActualizacion(diasDespuesPrueba);
                    nodoConf.setNombre(nodoConf.getNombre());
                    nodoConf.setNit(nodoConf.getNit());
                    nodoConf.setTipoImpresion(tipoImpresion);
                    nodoConf.setVersion(nodoConf.getVersion());
                    nodoConf.setPais(pais);

                    if (!instancias.getSql().modificarConfiguracion(nodoConf)) {
                        metodos.msgError(null, "Error al guardar los cambios");
                        return;
                    }
                } else {
                    metodos.modificarPermisos(codigoEncriptado(nodoConf.getNit(), nodoConf.getNombre()), nodoConf.getRegimen(), nodoConf.getImpoconsumo(),
                            String.valueOf(nodoConf.isUsb()), String.valueOf(nodoConf.isOrdenServ()), String.valueOf(nodoConf.isServicioAutomotor()),
                            String.valueOf(nodoConf.isCreditos()), String.valueOf(nodoConf.isSepare()), String.valueOf(nodoConf.isPedido()),
                            nodoConf.getTipoImpresion(), String.valueOf(nodoConf.isInventarioBodegas()), String.valueOf(nodoConf.isProductosSerial()),
                            String.valueOf(nodoConf.isEmbarcaciones()), String.valueOf(nodoConf.isCongeladas()), String.valueOf(nodoConf.isMedico()),
                            String.valueOf(nodoConf.isVeterinaria()), String.valueOf(nodoConf.isParqueadero()), String.valueOf(nodoConf.isAgenda()),
                            String.valueOf(nodoConf.isRestaurante()), String.valueOf(nodoConf.isRecordatorios()), String.valueOf(nodoConf.isLaboratorio()),
                            String.valueOf(nodoConf.isOftalmologia()), String.valueOf(nodoConf.isFacturacionLote()), String.valueOf(nodoConf.isPtm()),
                            String.valueOf(nodoConf.isPeriodo()), nodoConf.getAviso(), nodoConf.getNumFacturas(), nodoConf.getDiasActualizacion(),
                            nodoConf.getInformacionLegal(), "1", String.valueOf(nodoConf.isFacturaElectronica()), String.valueOf(nodoConf.isPuc()), pais);
                }
            } catch (Exception e) {
                 Logs.error(e);
            }
        }

        try {
            fechaCorte1 = metodos.encriptarFechaBloqueo(fechaCorte);
        } catch (Exception ex) {
            Logs.error(ex);
        }

        if (estado.equals("Vencido")) {
            validacionFechaCorte(fechaCorte1, anticipacion, plazo);
            this.dispose();
            dlgBloqueoPrograma bloqueo = new dlgBloqueoPrograma();
            bloqueo.show();
            return;
        } else if (estado.equals("Vencido, en espera")) {
            validacionFechaCorte(fechaCorte1, anticipacion, plazo);
            dlgCuotaPendiente cuota = new dlgCuotaPendiente("Tiene una cuota ¡ VENCIDA ! del " + fechaCorte + ". Tiene " + plazo + " días de plazo para realizar el pago.");
            cuota.setVisible(true);
        } else if (estado.equals("Pronto a vencerse")) {
            validacionFechaCorte(fechaCorte1, anticipacion, plazo);
            String fecha = fechaCorte.substring(3, fechaCorte.length() - 5);
            String nombreMes = "";
            if (fecha.equals("01")) {
                nombreMes = "Enero";
            } else if (fecha.equals("02")) {
                nombreMes = "Febrero";
            } else if (fecha.equals("03")) {
                nombreMes = "Marzo";
            } else if (fecha.equals("04")) {
                nombreMes = "Abril";
            } else if (fecha.equals("05")) {
                nombreMes = "Mayo";
            } else if (fecha.equals("06")) {
                nombreMes = "Junio";
            } else if (fecha.equals("07")) {
                nombreMes = "Julio";
            } else if (fecha.equals("08")) {
                nombreMes = "Agosto";
            } else if (fecha.equals("09")) {
                nombreMes = "Septiembre";
            } else if (fecha.equals("10")) {
                nombreMes = "Octubre";
            } else if (fecha.equals("11")) {
                nombreMes = "Noviembre";
            } else if (fecha.equals("12")) {
                nombreMes = "Diciembre";
            }

            dlgCuotaPendiente cuota = new dlgCuotaPendiente("APRECIADO CLIENTE: el día primero de " + nombreMes + " usted recibira via correo electronico su factura, "
                    + "la cual debe cancelar dentro de los " + plazo + " días siguientes. \nEvite la suspención del servicio.");
            cuota.setVisible(true);
        } else if (estado.equals("El usuario no existe")) {
            Logs.log("se pide el codigo 1");
            this.dispose();
            frmValidacionCodigo validar = new frmValidacionCodigo();
            validar.setVisible(true);
        } else if (estado.equals("OK")) {
            validacionFechaCorte(fechaCorte1, anticipacion, plazo);
        } else if (estado.equals("Sin registro, validando")) {
            validacionFechaCorte(fechaCorte1, anticipacion, plazo);
            metodos.msgAdvertenciaAjustado(null, "       ¡ EN ESPERA DE ACTIVACIÓN !       ");
        } else {
            Object[][] fechasBloqueo = instancias.getSql().getFechasBloqueo();
            int diasAlertaBloqueo = Integer.parseInt(nodoConf.getDiasAlertaBloqueo());
            int diasBloqueo = Integer.parseInt(nodoConf.getDiasBloqueo());

            String mensaje = "";
            if (nodoConf.isPeriodo()) {
                mensaje = "Su periodo de prueba esta pronto a vencerse. Vigente hasta";
            } else {
                mensaje = "Tiene una cuota ¡ PENDIENTE ! para el día";
            }

            if (fechasBloqueo.length <= 0) {
                metodos.msgAdvertenciaAjustado(null, "¡SISTEMA SIN REGISTRO! COMUNÍQUESE AL 322-32-59 PARA REALIZAR EL RESPECTIVO REGISTRO.");
                System.exit(0);
            } else {
                for (Object[] fechasBloqueo1 : fechasBloqueo) {
                    String fecha = "";
                    try {
                        fecha = metodos.DesencriptarFechaBloqueo(fechasBloqueo1[1].toString());
                    } catch (Exception ex) {
                        Logs.error(ex);
                    }

                    long faltante = metodos.restarFecha(metodosGenerales.fecha(), fecha);
                    if (faltante <= diasAlertaBloqueo && faltante > 0) {
                        metodos.msgAdvertenciaAjustado(null, mensaje + ": " + fecha);
                        return;
                    } else if (faltante == 0) {
                        dlgCuotaPendiente cuota = new dlgCuotaPendiente(mensaje + " de ¡ HOY ! ");
                        cuota.setVisible(true);
                    } else if ((faltante + diasBloqueo) >= 0 && (faltante + diasBloqueo) <= diasBloqueo) {
                        dlgCuotaPendiente cuota = new dlgCuotaPendiente("Tiene una cuota ¡ ATRASADA ! del día: " + fecha);
                        cuota.setVisible(true);
                    } else if ((faltante + diasBloqueo) < 0) {
                        this.dispose();
                        dlgBloqueoPrograma bloqueo = new dlgBloqueoPrograma();
                        bloqueo.show();
                        return;
                    }
                }
            }
        }
    }*/

    public void validarBloqueo() {
       try{ 
        RespuestaServicioRest respuestaServicio = null;
        ndConfiguracion nodoConf = instancias.getSql().getDatosConfiguracion();
        Cliente cliente = null;
        Actividad actividad = null;
        try {
            Logs.log("Entro a validarBloqueo consultarEstado una empresa");
            Logs.log("Entro a validarBloqueo consultarEstado una empresa nit " + nodoConf.getNit() + " nombre " + nodoConf.getNombre());
            Socket s = new Socket(Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            if (s.isConnected()) {
                Logs.log("Inicia conexion con aws");
                respuestaServicio = metodos.consultarEstado(codigoEncriptado(nodoConf.getNit(), nodoConf.getNombre()), 1);
                if (respuestaServicio.getCliente() == null) {
                    JInternalFrame JInternalFrame = null;
                    metodos.msgError(JInternalFrame, respuestaServicio.getMensaje());
                    System.exit(0);
                    return;
                }
                cliente = respuestaServicio.getCliente();
                actividad = respuestaServicio.getActividad();

                Logs.log("Finaliza conexion con aws");
            }
        } catch (Exception e) {
            Logs.error(e);
            Logs.error("No hay conexión de internet y no se validaron datos al entrar");
        }
    
        String estado = "", fechaCorte1 = "", fechaCorte = "", anticipacion = "", plazo = "";
        String regimen = "", impoconsumo, dispositivoUSB, ordenesServicio, tipoOrden, creditos, planSepare, pedidos, tipoImpresion, invBodega,
                productosSerial, embarcaciones, congeladas, medico, veterinaria, parqueadero, agenda, restaurante, recordatorios, laboratorio,
                oftalmologia, facturaLote, PTM, periodoPrueba, diasFinalizacionPrueba, numeroFacturas, diasDespuesPrueba, info, actualizarPermiso,
                facturacionElectronica, contable, nitEmisor, tokenEmisor, pais = "Colombia",corresponsal;

        // respuesta = respuesta.substring(1, respuesta.length() - 1);//recupera desde la posicion 1 hasta antes de el tamaño
//                cliente.
        if (respuestaServicio != null) {
            estado = String.valueOf(respuestaServicio.getMensaje());
            //recupera la primera posicion antes de XXX
//                fechaCorte = String.valueOf(actividad.getFechaCorte());
            fechaCorte = String.valueOf(metodos.formatoFecha(actividad.getFechaCorte()));
            anticipacion = String.valueOf(cliente.getAnterioridad());
            plazo = String.valueOf(cliente.getPlazo());

            Boolean actualizarPermisos = false; //true por defecto se cambia para probar el modificar

            try {

                if (Integer.parseInt(instancias.getSql().getNumConsecutivoActual("FACT")[0].toString()) > 0) {
                    if (cliente.getActualizarPermisos() == 0) {
                        actualizarPermisos = false;
                    }
                }

                if (actualizarPermisos) {
                    corresponsal = String.valueOf(cliente.getCorresponsalWeb());
                    regimen = String.valueOf(cliente.getRegimen());
                    impoconsumo = String.valueOf(cliente.getImpoconsumo());
                    dispositivoUSB = String.valueOf(cliente.getDispositivoUSB());
                    ordenesServicio = String.valueOf(cliente.getOrdenesServicio());
                    tipoOrden = String.valueOf(cliente.getTipoOrden());
                    creditos = String.valueOf(cliente.getCreditos());
                    planSepare = String.valueOf(cliente.getPlanSepare());
                    pedidos = String.valueOf(cliente.getPedidos());
                    tipoImpresion = String.valueOf(cliente.getTipoImpresion());
                    invBodega = String.valueOf(cliente.getInvBodega());
                    productosSerial = String.valueOf(cliente.getProductosSerial());
                    embarcaciones = String.valueOf(cliente.getEmbarcaciones());
                    congeladas = String.valueOf(cliente.getCongeladas());
                    medico = String.valueOf(cliente.getMedico());
                    veterinaria = String.valueOf(cliente.getVeterinaria());
                    parqueadero = String.valueOf(cliente.getParqueadero());
                    agenda = String.valueOf(cliente.getAgenda());
                    restaurante = String.valueOf(cliente.getRestaurante());
                    recordatorios = String.valueOf(cliente.getRecordatorios());
                    laboratorio = String.valueOf(cliente.getLaboratorio());
                    oftalmologia = String.valueOf(cliente.getOftalmologia());
                    facturaLote = String.valueOf(cliente.getFacturaLote());
                    PTM = String.valueOf(cliente.getPtm());
                    periodoPrueba = String.valueOf(cliente.getPeriodoPrueba());
                    diasFinalizacionPrueba = String.valueOf(cliente.getDiasFinalizacionPrueba());
                    numeroFacturas = String.valueOf(cliente.getNumeroFacturas());
                    diasDespuesPrueba = String.valueOf(cliente.getDiasDespuesPrueba());
                    info = String.valueOf(cliente.getInfo());
                    facturacionElectronica = String.valueOf(cliente.getFacturacionElectronica());
                    contable = String.valueOf(cliente.getPuc());
                    nitEmisor = String.valueOf(cliente.getNitEmisor());
                    tokenEmisor = String.valueOf(cliente.getTokenEmisor());
                    pais = String.valueOf(cliente.getPais());

                    nodoConf.setLogs(cliente.getLogs() > 0);
                    nodoConf.setDebug(cliente.getDebug() > 0);
                    nodoConf.setValidarConfSiempre(cliente.getValidarConfSiempre() > 0);
                    try {
                        Logs.error("ERRORES AWS LOGIN :::: " + respuestaServicio.getMensaje());
                    } catch (Exception e) {
                        Logs.error("ERROR LOGIN AWS CONTROLADO :::: " + e.getMessage());
                        e.printStackTrace();
                    }

                    instancias.setNitEmisor(nitEmisor);
                    instancias.setTokenEmisor(tokenEmisor);
                    
                    if (dispositivoUSB.equals("1")) {
                        nodoConf.setUsb(true);
                    } else {
                        nodoConf.setUsb(false);
                    }

                    if (embarcaciones.equals("1")) {
                        nodoConf.setEmbarcaciones(true);
                    } else {
                        nodoConf.setEmbarcaciones(false);
                    }

                    if (congeladas.equals("1")) {
                        nodoConf.setCongeladas(true);
                    } else {
                        nodoConf.setCongeladas(false);
                    }

                    if (medico.equals("1")) {
                        nodoConf.setMedico(true);
                    } else {
                        nodoConf.setMedico(false);
                    }

                    if (laboratorio.equals("1")) {
                        nodoConf.setLaboratorio(true);
                    } else {
                        nodoConf.setLaboratorio(false);
                    }

                    if (veterinaria.equals("1")) {
                        nodoConf.setVeterinaria(true);
                    } else {
                        nodoConf.setVeterinaria(false);
                    }

                    if (parqueadero.equals("1")) {
                        nodoConf.setParqueadero(true);
                    } else {
                        nodoConf.setParqueadero(false);
                    }

                    if (ordenesServicio.equals("1")) {
                        nodoConf.setOrdenServ(true);
                    } else {
                        nodoConf.setOrdenServ(false);
                    }

                    if (creditos.equals("1")) {
                        nodoConf.setCreditos(true);
                    } else {
                        nodoConf.setCreditos(false);
                    }

                    if (planSepare.equals("1")) {
                        nodoConf.setSepare(true);
                    } else {
                        nodoConf.setSepare(false);
                    }

                    if (pedidos.equals("1")) {
                        nodoConf.setPedido(true);
                    } else {
                        nodoConf.setPedido(false);
                    }

                    if (agenda.equals("1")) {
                        nodoConf.setAgenda(true);
                    } else {
                        nodoConf.setAgenda(false);
                    }

                    if (restaurante.equals("1")) {
                        nodoConf.setRestaurante(true);
                    } else {
                        nodoConf.setRestaurante(false);
                    }

                    if (recordatorios.equals("1")) {
                        nodoConf.setRecordatorios(true);
                    } else {
                        nodoConf.setRecordatorios(false);
                    }

                    if (tipoOrden.equals("1")) {
                        nodoConf.setServicioAutomotor(true);
                    } else {
                        nodoConf.setServicioAutomotor(false);
                    }

                    if (facturaLote.equals("1")) {
                        nodoConf.setFacturacionLote(true);
                    } else {
                        nodoConf.setFacturacionLote(false);
                    }

                    if (periodoPrueba.equals("1")) {
                        nodoConf.setPeriodo(true);
                    } else {
                        nodoConf.setPeriodo(false);
                    }

                    if (oftalmologia.equals("1")) {
                        nodoConf.setOftalmologia(true);
                    } else {
                        nodoConf.setOftalmologia(false);
                    }

                    if (invBodega.equals("1")) {
                        nodoConf.setInventarioBodegas(true);
                    } else {
                        nodoConf.setInventarioBodegas(false);
                    }

                    if (productosSerial.equals("1")) {
                        nodoConf.setProductosSerial(true);
                    } else {
                        nodoConf.setProductosSerial(false);
                    }

                    if (PTM.equals("1")) {
                        nodoConf.setPtm(true);
                    } else {
                        nodoConf.setPtm(false);
                    }

                    if (facturacionElectronica.equals("1")) {
                        nodoConf.setFacturaElectronica(true);
                    } else {
                        nodoConf.setFacturaElectronica(false);
                    }

                    if (contable.equals("1")) {
                        nodoConf.setPuc(true);
                    } else {
                        nodoConf.setPuc(false);
                    }

                    nodoConf.setInformacionLegal(info);
                    nodoConf.setNumFacturas(numeroFacturas);
                    nodoConf.setAviso(diasFinalizacionPrueba);
                    nodoConf.setAviso1("");
                    nodoConf.setVentasFactura("estandar");
                    nodoConf.setRegimen(regimen);
                    nodoConf.setDiasAlertaBloqueo(nodoConf.getDiasAlertaBloqueo());
                    nodoConf.setDiasBloqueo(nodoConf.getDiasBloqueo());
                    nodoConf.setImpoconsumo(impoconsumo);
                    nodoConf.setActualizacion(metodos.fechaConsulta(metodosGenerales.fecha()));
                    nodoConf.setDiasActualizacion(diasDespuesPrueba);
                    nodoConf.setNombre(nodoConf.getNombre());
                    nodoConf.setNit(nodoConf.getNit());
                    nodoConf.setTipoImpresion(tipoImpresion);
                    nodoConf.setVersion(nodoConf.getVersion());
                    nodoConf.setPais(pais);
                    nodoConf.setCorresponsalWeb(corresponsal);

                    if (!instancias.getSql().modificarConfiguracion(nodoConf)) {
                        metodos.msgError(null, "Error al guardar los cambios");
                        return;
                    }
                } else {

                    metodos.modificarPermisos(codigoEncriptado(nodoConf.getNit(), nodoConf.getNombre()), nodoConf.getRegimen(), nodoConf.getImpoconsumo(),
                            String.valueOf(nodoConf.isUsb()), String.valueOf(nodoConf.isOrdenServ()), String.valueOf(nodoConf.isServicioAutomotor()),
                            String.valueOf(nodoConf.isCreditos()), String.valueOf(nodoConf.isSepare()), String.valueOf(nodoConf.isPedido()),
                            nodoConf.getTipoImpresion(), String.valueOf(nodoConf.isInventarioBodegas()), String.valueOf(nodoConf.isProductosSerial()),
                            String.valueOf(nodoConf.isEmbarcaciones()), String.valueOf(nodoConf.isCongeladas()), String.valueOf(nodoConf.isMedico()),
                            String.valueOf(nodoConf.isVeterinaria()), String.valueOf(nodoConf.isParqueadero()), String.valueOf(nodoConf.isAgenda()),
                            String.valueOf(nodoConf.isRestaurante()), String.valueOf(nodoConf.isRecordatorios()), String.valueOf(nodoConf.isLaboratorio()),
                            String.valueOf(nodoConf.isOftalmologia()), String.valueOf(nodoConf.isFacturacionLote()), String.valueOf(nodoConf.isPtm()),
                            String.valueOf(nodoConf.isPeriodo()), nodoConf.getAviso(), nodoConf.getNumFacturas(), nodoConf.getDiasActualizacion(),
                            nodoConf.getInformacionLegal(), "1", String.valueOf(nodoConf.isFacturaElectronica()), String.valueOf(nodoConf.isPuc()), pais);
                }
            } catch (Exception e) {
                Logs.error(e);
            }
        }
        try {
            fechaCorte1 = metodos.encriptarFechaBloqueo(fechaCorte);
        } catch (Exception ex) {
            Logs.error(ex);
        }

        if (respuestaServicio.getEstado().equals(Identidad.CLIENTE_VENCIDO)) {
//        if (estado.equals("Vencido")) {
            validacionFechaCorte(fechaCorte1, anticipacion, plazo);
            this.dispose();
            dlgBloqueoPrograma bloqueo = new dlgBloqueoPrograma();
            bloqueo.show();
            return;
        } else if (respuestaServicio.getEstado().equals(Identidad.CLIENTE_VENCIDO)) {
//        } else if (estado.equals("Vencido, en espera")) {
            validacionFechaCorte(fechaCorte1, anticipacion, plazo);
            dlgCuotaPendiente cuota = new dlgCuotaPendiente("Tiene una cuota ¡ VENCIDA ! del " + fechaCorte + ". Tiene " + plazo + " días de plazo para realizar el pago.");
            cuota.setVisible(true);
        } else if (respuestaServicio.getEstado().equals(Identidad.CLIENTE_PRONTO_VENCE)) {
//        } else if (estado.equals("Pronto a vencerse")) {
            validacionFechaCorte(fechaCorte1, anticipacion, plazo);
            String fecha = fechaCorte.substring(3, fechaCorte.length() - 5);
            String nombreMes = "";
            if (fecha.equals("01")) {
                nombreMes = "Enero";
            } else if (fecha.equals("02")) {
                nombreMes = "Febrero";
            } else if (fecha.equals("03")) {
                nombreMes = "Marzo";
            } else if (fecha.equals("04")) {
                nombreMes = "Abril";
            } else if (fecha.equals("05")) {
                nombreMes = "Mayo";
            } else if (fecha.equals("06")) {
                nombreMes = "Junio";
            } else if (fecha.equals("07")) {
                nombreMes = "Julio";
            } else if (fecha.equals("08")) {
                nombreMes = "Agosto";
            } else if (fecha.equals("09")) {
                nombreMes = "Septiembre";
            } else if (fecha.equals("10")) {
                nombreMes = "Octubre";
            } else if (fecha.equals("11")) {
                nombreMes = "Noviembre";
            } else if (fecha.equals("12")) {
                nombreMes = "Diciembre";
            }

            dlgCuotaPendiente cuota = new dlgCuotaPendiente("APRECIADO CLIENTE: el día primero de " + nombreMes + " usted recibira via correo electronico su factura, "
                    + "la cual debe cancelar dentro de los " + plazo + " días siguientes. \nEvite la suspención del servicio.");
            cuota.setVisible(true);
        } else if (respuestaServicio.getEstado().equals(Identidad.CLIENTE_NO_EXISTE)) {
//        } else if (estado.equals("El usuario no existe")) {
            Logs.log("se pide el codigo 1");
            this.dispose();
            frmValidacionCodigo validar = new frmValidacionCodigo();
            validar.setVisible(true);
        } else if (respuestaServicio.getEstado().equals(Identidad.OK)) {
//        } else if (estado.equals("OK")) {
            validacionFechaCorte(fechaCorte1, anticipacion, plazo);
        } else if (respuestaServicio.getEstado().equals(Identidad.CLIENTE_SIN_REGISTRO)) {
//        } else if (estado.equals("Sin registro, validando")) {
            validacionFechaCorte(fechaCorte1, anticipacion, plazo);
            metodos.msgAdvertenciaAjustado(null, "       ¡ EN ESPERA DE ACTIVACIÓN !       ");
        } else {
            Object[][] fechasBloqueo = instancias.getSql().getFechasBloqueo();
            int diasAlertaBloqueo = Integer.parseInt(nodoConf.getDiasAlertaBloqueo());
            int diasBloqueo = Integer.parseInt(nodoConf.getDiasBloqueo());

            String mensaje = "";
            if (nodoConf.isPeriodo()) {
                mensaje = "Su periodo de prueba esta pronto a vencerse. Vigente hasta";
            } else {
                mensaje = "Tiene una cuota ¡ PENDIENTE ! para el día";
            }

            if (fechasBloqueo.length <= 0) {
                metodos.msgAdvertenciaAjustado(null, "¡SISTEMA SIN REGISTRO! COMUNÍQUESE AL 322-32-59 PARA REALIZAR EL RESPECTIVO REGISTRO.");
                System.exit(0);
            } else {
                for (Object[] fechasBloqueo1 : fechasBloqueo) {
                    String fecha = "";
                    try {
                        fecha = metodos.DesencriptarFechaBloqueo(fechasBloqueo1[1].toString());
                    } catch (Exception ex) {
                        Logs.error(ex);
                    }

                    long faltante = metodos.restarFecha(metodosGenerales.fecha(), fecha);
                    if (faltante <= diasAlertaBloqueo && faltante > 0) {
                        metodos.msgAdvertenciaAjustado(null, mensaje + ": " + fecha);
                        return;
                    } else if (faltante == 0) {
                        dlgCuotaPendiente cuota = new dlgCuotaPendiente(mensaje + " de ¡ HOY ! ");
                        cuota.setVisible(true);
                    } else if ((faltante + diasBloqueo) >= 0 && (faltante + diasBloqueo) <= diasBloqueo) {
                        dlgCuotaPendiente cuota = new dlgCuotaPendiente("Tiene una cuota ¡ ATRASADA ! del día: " + fecha);
                        cuota.setVisible(true);
                    } else if ((faltante + diasBloqueo) < 0) {
                        this.dispose();
                        dlgBloqueoPrograma bloqueo = new dlgBloqueoPrograma();
                        bloqueo.show();
                        return;
                    }
                }
            }
        }
        
         } catch (Exception e) {
             e.printStackTrace();
         }
    }

    
    private void validacionFechaCorte(String fechaCorte, String anti, String plazo) {
        instancias.getSql().eliminarTodo("bdlogerroresbloqueo");
        instancias.getSql().agregarFechasBloqueo(fechaCorte);
        instancias.getSql().cambiarDiasBloqueo(anti, plazo);
        
    }

    class Iniciar extends Iniciar2 {

        Instancias instancias;
        ndUsuario nodo;

        Iniciar(ndUsuario nodo) {
            this.instancias = Instancias.getInstancias();
            this.nodo = nodo;
        }

        public void run() {
            frmMenu form = new frmMenu();
            instancias.setMenu(form);
            instancias.setUsuario(nodo.getUsuario());
            instancias.setUsuarioLog(nodo);

            form.setInstancias(instancias);
            form.setExtendedState(JFrame.MAXIMIZED_BOTH);
            form.show();
            instancias.getProgres().detener(true);
            instancias.setProgres(null);
            form.cargarSocket();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                //DESCOMENTAR ESTO PARA QUE NO DEJE ABRIR DOS PROGRAMAS POR COMPUTADOR
//                try {
//                    ServerSocket SERVER_SOCKETE = new ServerSocket(1779);
//                    Logs.log("Inicio el server");
//                } catch (IOException x) {
//                     x.printStackTrace();
//                    //Informo al usuario
//                    JOptionPane.showMessageDialog(null, "EL SISTEMA YA SE ENCUENTRA EN EJECUCIÓN, ¡ YA HAY UNA SESIÓN ABIERTA !", "PRECAUCIÓN", JOptionPane.WARNING_MESSAGE);
//                    //En esta parte cierro la segunda instancia de la aplicación que se intenta abrir
//                    System.exit(0);
//                }
//
//                frmIngresarMulti jf = new frmIngresarMulti(null);
//                jf.setLocationRelativeTo(null);
//                jf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlServicios;
    // End of variables declaration//GEN-END:variables
}
