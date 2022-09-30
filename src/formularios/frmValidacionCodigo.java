package formularios;
import clases.Actividad;
import clases.Cliente;
import clases.Identidad;
import logs.Logs;
import clases.Instancias;
import clases.Modulos;
import clases.RespuestaServicioRest;
import clases.Utils;
import clases.metodosGenerales;
import com.google.gson.JsonObject;
import configuracion.Propiedades;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;

public class frmValidacionCodigo extends javax.swing.JFrame {

    Instancias instancias;
    int teclasPresionadas = 0;
    metodosGenerales metodos = new metodosGenerales();
    public frmValidacionCodigo() {

        initComponents();
        ((JPanelConFondo) panelFondo).setImagen("inicio.png");
        this.getRootPane().registerKeyboardAction(accion("primera"), "primera", KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        this.getRootPane().registerKeyboardAction(accion("segunda"), "segunda", KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
//        this.registerKeyboardAction(accion("tercera"), "tercera", KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        this.setLocationRelativeTo(null);
        instancias = Instancias.getInstancias();
        elementosInicio();
    }
    
    private void elementosInicio() {
        jCempresa.setModel(new DefaultComboBoxModel(Modulos.values())); //EmpresasEmpresas
        panelFondo1.setVisible(false);
        panelFondo1.setBackground(new Color(0, 0, 0, 65));
        tilulo.setVisible(false);
        jTcorreo.setVisible(false);
        jTcodigoCorresponsal.setVisible(false);
        jLcorresponsal.setVisible(false);
        jLcorreo.setVisible(false);
        jPanelRegistrarme.setVisible(false);
        jPanelRegistrarme.setBackground(new Color(0, 0, 0, 65));
        jbotonRegistrarme.setVisible(true);
        jbotonCodigoActivacion.setVisible(true);
        jBotonAtras.setVisible(false);
        jBregistar.setEnabled(false);
    }
        
    private void LimpiarElementos(){
        jTrazonsocial.setText("");
        jTcodigoCorresponsal.setText("");
        jTcorreo.setText("");
        jTnit.setText("");
        jTtelefono.setText("");
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelFondo = new JPanelConFondo();
        jLabel1 = new javax.swing.JLabel();
        jPanelRegistrarme = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTrazonsocial = new javax.swing.JTextField();
        jTnit = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jCempresa = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTcorreo = new javax.swing.JTextField();
        jLcorresponsal = new javax.swing.JLabel();
        jTcodigoCorresponsal = new javax.swing.JTextField();
        jCcomun = new javax.swing.JCheckBox();
        jCsimplificado = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jCcorresponsal = new javax.swing.JCheckBox();
        jLcorreo = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jBregistar = new javax.swing.JButton();
        tilulo = new javax.swing.JLabel();
        jBotonAtras = new javax.swing.JLabel();
        jbotonRegistrarme = new javax.swing.JButton();
        jbotonCodigoActivacion = new javax.swing.JButton();
        panelFondo1 = new JPanelConFondo();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TanFacil.Click");
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFondo.setOpaque(false);
        panelFondo.setPreferredSize(new java.awt.Dimension(445, 629));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar1.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 1, -1, 43));

        jPanelRegistrarme.setBackground(new java.awt.Color(204, 204, 204));
        jPanelRegistrarme.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Razón Social :");

        jTrazonsocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrazonsocialActionPerformed(evt);
            }
        });

        jCempresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nit o Documento :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modulo :");
        jLabel3.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¿ES CORRESPONSAL?");

        jLcorresponsal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLcorresponsal.setForeground(new java.awt.Color(255, 255, 255));
        jLcorresponsal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLcorresponsal.setText("Cod. Punto de Venta :");
        jLcorresponsal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCcomun.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jCcomun);
        jCcomun.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCcomun.setForeground(new java.awt.Color(255, 255, 255));
        jCcomun.setText("Común");
        jCcomun.setContentAreaFilled(false);
        jCcomun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCcomun.setOpaque(true);

        jCsimplificado.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jCsimplificado);
        jCsimplificado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCsimplificado.setForeground(new java.awt.Color(255, 255, 255));
        jCsimplificado.setText("Simplificado");
        jCsimplificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCsimplificadoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Regímen: ");

        jCcorresponsal.setBackground(new java.awt.Color(0, 0, 0));
        jCcorresponsal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCcorresponsal.setForeground(new java.awt.Color(255, 255, 255));
        jCcorresponsal.setText(" SI");
        jCcorresponsal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCcorresponsalMouseClicked(evt);
            }
        });
        jCcorresponsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcorresponsalActionPerformed(evt);
            }
        });

        jLcorreo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLcorreo.setForeground(new java.awt.Color(255, 255, 255));
        jLcorreo.setText("Correo :");

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("He leído y acepto el tratamiento de mis datos personales.");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setOpaque(true);
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Ver más");
        jLabel9.setToolTipText("Tratamiento de Datos");

        jBregistar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBregistar.setText("REGISTRARME");
        jBregistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistrarmeLayout = new javax.swing.GroupLayout(jPanelRegistrarme);
        jPanelRegistrarme.setLayout(jPanelRegistrarmeLayout);
        jPanelRegistrarmeLayout.setHorizontalGroup(
            jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(jTrazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(5, 5, 5)
                                .addComponent(jTnit, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49)
                                .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarmeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarmeLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarmeLayout.createSequentialGroup()
                                .addComponent(jLcorresponsal)
                                .addGap(13, 13, 13)
                                .addComponent(jTcodigoCorresponsal))
                            .addComponent(jBregistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                        .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(57, 57, 57)
                                .addComponent(jCempresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                                .addComponent(jLcorreo)
                                .addGap(60, 60, 60)
                                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCcorresponsal)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTcorreo))))
                        .addContainerGap())
                    .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                        .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jCsimplificado)
                                .addGap(17, 17, 17)
                                .addComponent(jCcomun)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelRegistrarmeLayout.setVerticalGroup(
            jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jTrazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(jTnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCsimplificado)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCcomun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarmeLayout.createSequentialGroup()
                        .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCcorresponsal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarmeLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel9)))
                    .addGroup(jPanelRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLcorresponsal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTcodigoCorresponsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBregistar)
                .addGap(214, 214, 214))
        );

        panelFondo.add(jPanelRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 423, 340));

        tilulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tilulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tilulo.setText("REGISTRO");
        panelFondo.add(tilulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 440, -1));

        jBotonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anterior.png"))); // NOI18N
        jBotonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotonAtrasMouseClicked(evt);
            }
        });
        panelFondo.add(jBotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jbotonRegistrarme.setBackground(new java.awt.Color(204, 204, 204));
        jbotonRegistrarme.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbotonRegistrarme.setText("Registrarme");
        jbotonRegistrarme.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jbotonRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonRegistrarmeActionPerformed(evt);
            }
        });
        panelFondo.add(jbotonRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 220, 40));

        jbotonCodigoActivacion.setBackground(new java.awt.Color(204, 204, 204));
        jbotonCodigoActivacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbotonCodigoActivacion.setText("Tengo un Codigo de Activación");
        jbotonCodigoActivacion.setToolTipText("");
        jbotonCodigoActivacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jbotonCodigoActivacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonCodigoActivacionActionPerformed(evt);
            }
        });
        panelFondo.add(jbotonCodigoActivacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 220, 40));

        panelFondo1.setBackground(new java.awt.Color(204, 204, 204));
        panelFondo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelFondo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFondo1MouseClicked(evt);
            }
        });
        panelFondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setVerifyInputWhenFocusTarget(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        panelFondo1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 40, 397, 49));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESE EL CODIGO");
        panelFondo1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 397, 20));

        panelFondo.add(panelFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 420, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void panelFondo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondo1MouseClicked
    
    }//GEN-LAST:event_panelFondo1MouseClicked

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String codigo = txtCodigo.getText();

            if (codigo.equals("")) {
                metodos.msgError(null, "Debe ingresar el codigo!");
                return;
            }

            if (codigo.length() < 8 || codigo.length() > 8) {
                metodos.msgError(null, "Codigo incorrecto!");
                return;
            }
            RespuestaServicioRest respuestaServicio = null;
            String respuesta="";
            try {
//                respuesta = agregarCliente2(codigo);
                respuestaServicio = agregarCliente(codigo);
            } catch (Exception e) {
                Logs.error(e);
                metodos.msgError(null, "Necesita tener acceso a internet");
                return;
            }
            ActivarAplicacion(respuestaServicio,0);
        }
    }//GEN-LAST:event_txtCodigoKeyReleased
   /*
      @param registro: 0-si se registro desde codigo y 1-si se registra con usuario
    */
    private void ActivarAplicacion(RespuestaServicioRest respuestaServicio,int registro){
                  
         if (respuestaServicio.getEstado().equals(Identidad.OK)) {
                String nit = respuestaServicio.getCliente().getNit();
                String nombre = respuestaServicio.getCliente().getNombre();

                Logs.log("nit "+nit);
                Logs.log("nombre "+nombre);
                if (!instancias.getSql().modificarConfiguraciones(nit, nombre)) {
                    metodos.msgError(null, "Error al guardar los datos en bd Local");
                    return;
                } else {
                    try {
                        String fechaCorte = metodos.sumarFecha(metodosGenerales.fecha(), 10);//traer fecha de la respuesta del servicio
                        fechaCorte = Utils.encriptar(fechaCorte);
                        instancias.getSql().agregarFechasBloqueo(fechaCorte);
                    } catch (Exception ex) {
                        Logs.error(ex);
                        System.err.println("Error al ingresar fecha de corte "+ex.getMessage());
                    }
                    this.dispose();
                }


                //se lanza de nuevo el programa
                String file = "\"" + System.getProperty("user.dir") + "\\jre8\\bin\\javaw.exe\" -Xms1024m -jar \"" + System.getProperty("user.dir") + "\\ClickingPos.dat\"";
                try {
                    Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + file);
                    metodos.msgExito(null, "Empresa activada con exito");
                    Inicio iniciar = new Inicio();
                    iniciar.setVisible(true);
                    iniciar.setLocationRelativeTo(null);
                } catch (IOException e) {
                }
                //se cierra la activación
                System.exit(0);
            } else {
                    System.err.println("respuestaServicio: "+respuestaServicio.toString());
                    metodos.msgError(null, respuestaServicio.getMensaje());
            }    
    }  
     
    private String codigoEncriptado(String nit, String nombre) {
        String hashEncriptado = nit + "--" + nombre;
        try {
            hashEncriptado = metodos.EncriptarValidacionUsuario(hashEncriptado, "yI4z%jIMndKd3N%bj#%f");
        } catch (Exception ex) {
            Logs.error(ex);
        }
        return hashEncriptado;
    }
    
     public String calcularCodigo(String nit, String nombre) {
            String hashEncriptado = nit + "--" + nombre;
            try {
                    hashEncriptado = Utils.EncriptarHmacMD5(hashEncriptado, "yI4z%jIMndKd3N%bj#%f");
            } catch (Exception ex) {
                    Logs.error(ex);	
            }
            return hashEncriptado;
    }
    
    
    private String CrearCliente(String razonSocial, String nit, String telefono, Modulos modulo, 
            boolean comun, boolean  simplificado, boolean corresponsal,String correo,String codcorresponsal) {
        
        RespuestaServicioRest respuesta = null;
        
//        Cliente cliente = new Cliente();
//        cliente.setId(calcularCodigo(nit, razonSocial));
//        cliente.setNit(nit);
//        cliente.setNombre(razonSocial);
//        cliente.setCelular(telefono);
//        cliente.setEmail(correo);
//        cliente.setPais("Colombia");
//        cliente.setTipoPago("Mensual");
//        cliente.setAnterioridad(3);
//        cliente.setPlazo(3);
//        cliente.setClientePTM(2);
        
        JsonObject json = new JsonObject(); 
        json.addProperty("id",calcularCodigo(nit, razonSocial));
        json.addProperty("nit",nit);
        json.addProperty("nombre",razonSocial);
        json.addProperty("celular",telefono);        
        json.addProperty("pais","Colombia");
        json.addProperty("tipoPago","mensual");
        json.addProperty("anterioridad",3);
        json.addProperty("plazo",3);
        json.addProperty("clientePTM",2);
         
         
         
         
        if (corresponsal) {
//            cliente.setEmail(correo);
            json.addProperty("email",correo);
            json.addProperty("codigoPunto",codcorresponsal);
//            cliente.setCodigoPunto(codcorresponsal);
        }
        if (comun) {
//            cliente.setResponsableIva(1);
            json.addProperty("responsableIva",1);
        } else {
//            cliente.setResponsableIva(0);
//            cliente.setRegimen("SinIva");
                json.addProperty("responsableIva",0);
                json.addProperty("regimen","SinIva");
        }
        
        metodos.validaModuloCliente(json, modulo);
//        instancias.getSql().modificarConfiguracionInicial(cliente);
//        instancias.getSql().modificarCantProsponer(3);
        respuesta = metodos.CrearMultiEmpresaRest(json, 1);
        
        if(respuesta.getEstado().equals(Identidad.OK)){          
            ActivarAplicacion(respuesta,1);            
        }else{
            LimpiarElementos();
            elementosInicio();
            metodos.msgAdvertenciaAjustado(null, respuesta.getMensaje()+ " #"+respuesta.getEstado());
        }
        return respuesta.getMensaje();
    }
    
    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void jbotonCodigoActivacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonCodigoActivacionActionPerformed
        // TODO add your handling code here:        
        jPanelRegistrarme.setVisible(false);
        jbotonCodigoActivacion.setVisible(false);
        jbotonRegistrarme.setVisible(false);
        tilulo.setVisible(true);
        tilulo.setText("REGISTRO CON CODIGO");
        panelFondo1.setVisible(true);
        jBotonAtras.setVisible(true);
        
    }//GEN-LAST:event_jbotonCodigoActivacionActionPerformed

    private void jbotonRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonRegistrarmeActionPerformed
        // TODO add your handling code here:        
        jbotonCodigoActivacion.setVisible(false);
        jbotonRegistrarme.setVisible(false);
        panelFondo1.setVisible(false);
        tilulo.setVisible(true);
        tilulo.setText("REGISTRO MANUAL");
        jPanelRegistrarme.setVisible(true);
        jBotonAtras.setVisible(true);
    }//GEN-LAST:event_jbotonRegistrarmeActionPerformed

    private void jTrazonsocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrazonsocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTrazonsocialActionPerformed

    private void jCcorresponsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcorresponsalActionPerformed
        // TODO add your handling code here:
        if (jCcorresponsal.isSelected()) {
            jTcorreo.setVisible(true);
            jTcodigoCorresponsal.setVisible(true);
            jTcorreo.setEnabled(true);
            jTcodigoCorresponsal.setEnabled(true);
            jLcorresponsal.setVisible(true);
            jLcorreo.setVisible(true);
        } else {
            jTcodigoCorresponsal.setText("");
            jTcorreo.setText("");
            jTcorreo.setVisible(false);
            jLcorresponsal.setVisible(false);
            jLcorreo.setVisible(false);
            jTcodigoCorresponsal.setVisible(false);
            jTcorreo.setEnabled(false);
            jTcorreo.setText("");
            jTcodigoCorresponsal.setEnabled(false);
            jTcodigoCorresponsal.setText("");
        }
        panelFondo.repaint();
    }//GEN-LAST:event_jCcorresponsalActionPerformed

    private void jBregistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistarActionPerformed
        // TODO add your handling code here:
       boolean validarTodo= false; 
       String corresponsal = jTcodigoCorresponsal.getText().trim();
       String correo = jTcorreo.getText().trim();
       Modulos modulo = (Modulos) jCempresa.getSelectedItem();
       String empresa =  String.valueOf(jCempresa.getSelectedItem());
       String nit = jTnit.getText().trim();
       String razonSocial = jTrazonsocial.getText().trim();
       String telefono = jTtelefono.getText().trim();
       
       if(jCcorresponsal.isSelected()){
          if(!validarCorresponsal(correo,corresponsal)){
            validarTodo = true; 
          }
       }
       if(!validarUsuario( razonSocial, nit, telefono, empresa) || validarTodo){
         return ;
       }
       
        CrearCliente(razonSocial,nit,telefono,modulo,jCcomun.isSelected(),jCsimplificado.isSelected(),jCcorresponsal.isSelected(),correo,corresponsal);
              
    }//GEN-LAST:event_jBregistarActionPerformed

     private boolean validarCorresponsal(String correo,String corresponsa){
         boolean retorno = true;
         String mensaje="";
         if(correo.equals("")){
            mensaje="El Correo";
            retorno = false;
         }else if(corresponsa.equals("")){
           mensaje="El Codigo Corresponsal";  
           retorno = false;
         }
         if(!retorno){
           metodos.msgAdvertenciaAjustado(null, "¡Debe Ingresar "+mensaje+"!");
         }
         return retorno;
     }
     
     private boolean validarUsuario(String razonSocial,String nit,String telefono,String empresa){
         boolean retorno = true;
         String mensaje="";
         if(razonSocial.equals("")){
           mensaje="La Razón Social";  
           retorno = false;
         }else if(nit.equals("")){
           mensaje="La Nit o Documento";  
           retorno = false;
         }else if(telefono.equals("")){
           mensaje="El Telefono";
           retorno = false;
         }else if(empresa.equals("SELECCIONAR")){
           mensaje="La Empresa";
            retorno = false;
         }else if(!(jCcomun.isSelected() || jCsimplificado.isSelected())){
           mensaje="El Régimen";  
           retorno = false;
         }
         if(!retorno){
           metodos.msgAdvertenciaAjustado(null, "¡Debe Ingresar "+mensaje+"!");
         }
         return retorno;
     }   
    
    private void jBotonAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonAtrasMouseClicked
        // TODO add your handling code here:
        elementosInicio();
    }//GEN-LAST:event_jBotonAtrasMouseClicked

    private void jCcorresponsalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCcorresponsalMouseClicked
        // TODO add your handling code here:       
    }//GEN-LAST:event_jCcorresponsalMouseClicked

    private void jCsimplificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCsimplificadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCsimplificadoActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        // TODO add your handling code here:
         if (jCheckBox1.isSelected()==true) {
            jBregistar.setEnabled(true); 
        }else{
         jBregistar.setEnabled(false); 
        }
    }//GEN-LAST:event_jCheckBox1StateChanged
    
    public String agregarCliente2(String codigo) {
        String concat = "NuevoUsuario/-/" + codigo;
        String resultadoFinal = "";
        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(Propiedades.getInstancia().getUrlFuncionesLambdaAWS());
            StringEntity postingString = new StringEntity("\"" + concat + "\"");
            post.setEntity(postingString);
            post.addHeader(HTTP.CONTENT_TYPE, "application/json");
            HttpResponse response = httpClient.execute(post);
            InputStream resultado = response.getEntity().getContent();
            resultadoFinal = IOUtils.toString(resultado);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(frmIngresar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmIngresar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultadoFinal;
    }

    public RespuestaServicioRest agregarCliente(String codigo) { 
        return metodos.consultarEstado(codigo,2);
    }
        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                //DESCOMENTAR ESTO PARA QUE NO DEJE ABRIR DOS PROGRAMAS POR COMPUTADOR
                try {
                    ServerSocket SERVER_SOCKETE = new ServerSocket(1779);
                    Logs.log("Inicio el server validacion codigo");
                } catch (IOException x) {
                    //Informo al usuario
                    JOptionPane.showMessageDialog(null, "EL SISTEMA YA SE ENCUENTRA EN EJECUCIÓN, ¡ YA HAY UNA SESIÓN ABIERTA !", "PRECAUCIÓN", JOptionPane.WARNING_MESSAGE);
                    //En esta parte cierro la segunda instancia de la aplicación que se intenta abrir
                    System.exit(0);
                }
                Logs.log("se pide el codigo 3");
                frmValidacionCodigo jf = new frmValidacionCodigo();
                jf.setLocationRelativeTo(null);
                jf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jBotonAtras;
    private javax.swing.JButton jBregistar;
    private javax.swing.JCheckBox jCcomun;
    private javax.swing.JCheckBox jCcorresponsal;
    private javax.swing.JComboBox<String> jCempresa;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCsimplificado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcorreo;
    private javax.swing.JLabel jLcorresponsal;
    private javax.swing.JPanel jPanelRegistrarme;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTcodigoCorresponsal;
    private javax.swing.JTextField jTcorreo;
    private javax.swing.JTextField jTnit;
    private javax.swing.JTextField jTrazonsocial;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JButton jbotonCodigoActivacion;
    private javax.swing.JButton jbotonRegistrarme;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelFondo1;
    private javax.swing.JLabel tilulo;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
