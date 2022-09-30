package formularios;
import logs.Logs;
import clases.Instancias;
import clases.metodosGenerales;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import configuracion.Propiedades;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class Inicio1 extends javax.swing.JFrame {

    int teclasPresionadas = 0;
    metodosGenerales metodos;
    Instancias instancias;

    public Inicio1() {
        initComponents();

        ((JPanelConFondo) panelFondo).setImagen("inicio.png");
        ((JPanelConFondo) panelFondo1).setImagen("botonEntrar.png");
        this.getRootPane().registerKeyboardAction(accion("primera"), "primera", KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        this.getRootPane().registerKeyboardAction(accion("segunda"), "segunda", KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
       

        metodos = new metodosGenerales();
        instancias = Instancias.getInstancias();

        
        Object[][] datos = instancias.getSql().getMultiempresas();

//        if (datos.length > 1) {
//            frmIngresarMulti multiempresas = new frmIngresarMulti(this);
//            multiempresas.show();
//            multiempresas.validarBloqueo();
//        } else {
//            frmIngresar ingresar = new frmIngresar("");
//            ingresar.enviarInstancia(this);
//            ingresar.show();
//            ingresar.validarBloqueo();
//        }
        
        try {
            Socket s = new Socket(Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            if (s.isConnected()) {
                Logs.log("Inicia validación de actualización");
                conexionSFTP("");
            }
        } catch (Exception e) {
            Logs.error(e);
            Logs.error("No hay conexión de internet y no se validaron las actualizaciones");
        }

    }

    public void conexionSFTP(String variable) {
        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;

        try {
            JSch jsch = new JSch();
            session = jsch.getSession(Propiedades.getInstancia().getUsuarioSFTP(), Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            session.setPassword(Propiedades.getInstancia().getPasswordSFTP());
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();

            channelSftp = (ChannelSftp) channel;
            Vector<ChannelSftp.LsEntry> list = channelSftp.ls(Propiedades.getInstancia().getDirSFTP());

            String versionActual = instancias.getSql().getVersion();

            Boolean existeActualizacion = false;
            String actualizacionPendiente = "";
            for (ChannelSftp.LsEntry entry : list) {
                if (entry.getFilename().length() >= 5) {
                    int versionSFTP = Integer.parseInt(entry.getFilename().replace(".", ""));
                      Logs.log("Versión actual "+versionSFTP);
                    if (Integer.parseInt(versionActual.replace(".", "")) < versionSFTP) {
                         Logs.log("Nueva Versión "+Integer.parseInt(versionActual.replace(".", "")));
                        existeActualizacion = true;
                        actualizacionPendiente = entry.getFilename();
                        break;
                    }
                }
            }

            while (session != null) {
                session.disconnect();
                session = null;
            }

            if (existeActualizacion) {
                dlgActualizacionPendiente actualizacion = new dlgActualizacionPendiente(actualizacionPendiente, versionActual, null, null);
                actualizacion.setVisible(true);
            }

        } catch (Exception ex) {
            Logs.error(ex);
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
        panelFondo1 = new JPanelConFondo();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TanFacil.Click");
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFondo.setOpaque(false);
        panelFondo.setPreferredSize(new java.awt.Dimension(445, 629));

        panelFondo1.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo1.setOpaque(false);
        panelFondo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFondo1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondo1Layout = new javax.swing.GroupLayout(panelFondo1);
        panelFondo1.setLayout(panelFondo1Layout);
        panelFondo1Layout.setHorizontalGroup(
            panelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        panelFondo1Layout.setVerticalGroup(
            panelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(panelFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(469, 469, 469)
                .addComponent(panelFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void panelFondo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondo1MouseClicked
        this.setEnabled(false);

        Object[][] datos = instancias.getSql().getMultiempresas();

//        if (datos.length > 1) {
//            frmIngresarMulti multiempresas = new frmIngresarMulti(this);
//            multiempresas.show();
//            multiempresas.validarBloqueo();
//        } else {
//            frmIngresar ingresar = new frmIngresar("");
//            ingresar.enviarInstancia(this);
//            ingresar.show();
//            ingresar.validarBloqueo();
//        }
    }//GEN-LAST:event_panelFondo1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    public static String Encriptar(String valor, String keyPrivate) throws Exception {
        String resultado = null;
        //Se obtienen los bytes de la clave privada   
        byte[] keyBytes = keyPrivate.getBytes();
        Key key = new SecretKeySpec(keyBytes, 0, keyBytes.length, "HmacMD5");
        Mac mac = null;

        //Se obtiene el algoritmo de encriptacion   
        try {
            mac = Mac.getInstance("HmacMD5");
            mac.init(key);
        } catch (InvalidKeyException e) {
            throw new Exception(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception(e.getMessage(), e);
        }      //Se encripta el valor enviado   

        byte[] valorEncriptado = mac.doFinal(valor.getBytes(StandardCharsets.ISO_8859_1));

        //Cadena con los digitos correspondientes en hexadecimal   
        String digitosHexadecimales = "0123456789abcdef";

        Logs.log("valorleng: " + valorEncriptado.length);

        StringBuilder stringBuilder = new StringBuilder(valorEncriptado.length * 2);
        for (int cx = 0; cx < valorEncriptado.length; cx++) {
            int hn = ((int) (valorEncriptado[cx]) & 0x00ff) / 16;
            int ln = ((int) (valorEncriptado[cx]) & 0x000f);
            stringBuilder.append(digitosHexadecimales.charAt(hn));
            stringBuilder.append(digitosHexadecimales.charAt(ln));
        }

        resultado = stringBuilder.toString();
        return resultado;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelFondo1;
    // End of variables declaration//GEN-END:variables
}
