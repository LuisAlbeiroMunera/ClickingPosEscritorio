package formularios;
import logs.Logs;
import clases.Iniciar2;
import clases.Instancias;
import clases.metodosGenerales;
import static clases.metodosGenerales.codificarSerial;
import clases.ndUsuario;
import configuracion.ndConfiguracion;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class infCambiarUsuario extends javax.swing.JFrame {

    Inicio insInicio;
    Instancias instancias;
    metodosGenerales metodos = new metodosGenerales();

    int teclasPresionadas = 0;

    public infCambiarUsuario() {
        initComponents();
        instancias = Instancias.getInstancias();
        instancias.setIngreso(this);
        this.setLocationRelativeTo(null);
        ((JPanelConFondo) panelFondo).setImagen("cambiarUsuario.png");
        txtUsuario.requestFocus();

        this.getRootPane().registerKeyboardAction(accion("primera"), "primera", KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        this.getRootPane().registerKeyboardAction(accion("segunda"), "segunda", KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
//        this.registerKeyboardAction(accion("tercera"), "tercera", KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);

    }

    public void enviarInstancia(Inicio x) {
        insInicio = x;
    }

    public void validarBloqueo() {
//        Object[][] fechasBloqueo = instancias.getSql().getFechasBloqueo(metodos.fechaConsulta(metodosGenerales.fecha()));
        Object[][] fechasBloqueo = instancias.getSql().getFechasBloqueo();
        ndConfiguracion nodoConf = instancias.getSql().getDatosConfiguracion();
        int diasAlertaBloqueo = Integer.parseInt(nodoConf.getDiasAlertaBloqueo());
        int diasBloqueo = Integer.parseInt(nodoConf.getDiasBloqueo());

        String mensaje = "";
        if (nodoConf.isPeriodo()) {
            mensaje = "Su periodo de prueba esta pronto a vencerse. Vigente hasta";
        } else {
            mensaje = "Tiene una cuota ¡ PENDIENTE ! para el día";
        }

        for (Object[] fechasBloqueo1 : fechasBloqueo) {
            long faltante = metodos.restarFecha(metodosGenerales.fecha(), metodos.fecha(fechasBloqueo1[1].toString()));

            if (faltante <= diasAlertaBloqueo && faltante > 0) {
                metodos.msgAdvertencia(null, mensaje + ": " + metodos.fecha(fechasBloqueo1[1].toString()));
                return;
            } else if (faltante == 0) {
                metodos.msgAdvertencia(null, mensaje + " ¡ HOY ! ");
                return;
            } else if ((faltante + diasBloqueo) >= 0 && (faltante + diasBloqueo) <= diasBloqueo) {
//            }else if((faltante) <= (diasBloqueo*-1) && faltante < diasBloqueo-1){
                metodos.msgError(null, "Tiene una cuota ¡ ATRASADA ! del día: " + metodos.fecha(fechasBloqueo1[1].toString()));
                return;
            } else if ((faltante + diasBloqueo) < 0) {
                metodos.msgError(null, "¡ PROGRAMA BLOQUEADO ! Por favor comuníquese a Clicking Pos.");
                this.dispose();
                return;
            }
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

        panelFondo = new JPanelConFondo();
        txtContrasena = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TanFacil.Click");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFondo.setOpaque(false);
        panelFondo.setPreferredSize(new java.awt.Dimension(445, 629));

        txtContrasena.setBackground(new java.awt.Color(233, 232, 234));
        txtContrasena.setFont(new java.awt.Font("Centaur", 0, 40)); // NOI18N
        txtContrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasena.setBorder(null);
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyReleased(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Entrar");
        btnIngresar.setBorder(null);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnIngresarKeyReleased(evt);
            }
        });

        txtUsuario.setBackground(new java.awt.Color(233, 232, 234));
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(400, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(txtContrasena))
                        .addGap(61, 61, 61))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContrasenaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_txtContrasenaKeyReleased

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String ser = codificarSerial();
        Object[][] aux = instancias.getSql().getErrores(ser);

        String sFichero = "C:/info.txt";
        File fichero = new File(sFichero);
        metodosGenerales ee = new metodosGenerales();
        if (aux != null && aux.length > 0 && fichero.exists()) {

            ndUsuario nodo = instancias.getSql().getDatosUsuario(txtUsuario.getText());

            if (nodo.getUsuario() != null) {
                if (!txtContrasena.getText().equals(nodo.getContra())) {
                    ee.msgError(null, "Usuario o contraseña incorrectos");
                    txtUsuario.requestFocus();
                    return;
                }

                instancias.setTerminal(instancias.getSql().getTerminal(metodosGenerales.codificarSerial())[0][0].toString());
                
                Object[] data = instancias.getSql().getDatosUsuarioInicio(txtUsuario.getText());

                if (data[0].toString().equals("ON")) {
                    if (!data[1].toString().equals(instancias.getTerminal())) {
                        ee.msgError(null, "Este usuario ya se encuentra ingresado en la terminal " + data[1].toString().replace("TERM-", ""));
                        txtUsuario.requestFocus();
                        return;
                    }
                }

                //CERRAR EL ACTUAL
                Object[] data1 = instancias.getSql().getDatosUsuarioInicio(instancias.getUsuario());
                boolean adentro = false;
                if (data1[0].toString().equals("ON")) {
                    adentro = true;
                }

                while (adentro) {
                    if (Instancias.getInstancias().getSql().usuarioActivo("OFF", "")) {
                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                            Logs.error(e);
                        }
                    }
                    data = instancias.getSql().getDatosUsuarioInicio(instancias.getUsuario());
                    if (data[0].toString().equals("OFF")) {
                        adentro = false;
                    } else {
                    }
                }

                instancias.getMenu().cerrarAlCambiar();
                this.dispose();

//                insInicio.dispose();
                Iniciar ini = new Iniciar(nodo);
                cargando1 barra = new cargando1(ini, instancias);
                barra.show();
                this.dispose();
            } else {
                ee.msgError(null, "Usuario o contraseña incorrectos");
                txtUsuario.requestFocus();
                return;
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_btnIngresarKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
                try {
                    ServerSocket SERVER_SOCKETE = new ServerSocket(1779);
                    Logs.log("Inicio el server");
                } catch (IOException x) {
                    //Informo al usuario
                    JOptionPane.showMessageDialog(null, "EL SISTEMA YA SE ENCUENTRA EN EJECUCIÓN, ¡ YA HAY UNA SESIÓN ABIERTA !", "PRECAUCIÓN", JOptionPane.WARNING_MESSAGE);
                    //En esta parte cierro la segunda instancia de la aplicación que se intenta abrir
                    System.exit(0);
                }

                infCambiarUsuario jf = new infCambiarUsuario();
                jf.setLocationRelativeTo(null);
                jf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
