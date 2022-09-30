package formularios.Ventas;
import logs.Logs;
import clases.Instancias;
import clases.Ventas.ndFactura;
import clases.metodosGenerales;
import clases.terceros.ndTercero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.KeyStroke;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;

//import javax.activation.DataHandler;
//import javax.activation.FileDataSource;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class dlgEnviarCorreoMasivo extends javax.swing.JDialog {

    private Instancias instancias;
    metodosGenerales metodos = new metodosGenerales();

    public dlgEnviarCorreoMasivo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setLocationRelativeTo(null);

        metodosGenerales metodos = new metodosGenerales();
        instancias = Instancias.getInstancias();

        this.getRootPane().registerKeyboardAction(accion("cerrar", this), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private ActionListener accion(final String opc, final JDialog ventana) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
                    case "cerrar":
                        ventana.dispose();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDesde = new javax.swing.JTextField();
        txtAsunto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHasta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTextoMensaje = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnDescargar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rdPos = new javax.swing.JRadioButton();
        rdCarta = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdMediaCarta = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("  Mensaje nuevo");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Desde:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Asunto:");

        txtDesde.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDesde.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAsunto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Hasta:");

        txtHasta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtHasta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(txtAsunto, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAsunto))
                .addGap(5, 5, 5))
        );

        txtTextoMensaje.setColumns(20);
        txtTextoMensaje.setRows(5);
        jScrollPane1.setViewportView(txtTextoMensaje);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(247, 220, 111));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setText("IMPRIMIR");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(28, 113, 237));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ENVIAR X CORREO");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnDescargar.setBackground(new java.awt.Color(204, 204, 204));
        btnDescargar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDescargar.setText("DESCARGAR");
        btnDescargar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pos.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        rdPos.setBackground(new java.awt.Color(215, 217, 216));
        buttonGroup1.add(rdPos);
        rdPos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdPos.setSelected(true);
        rdPos.setText("POS");
        rdPos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdPosItemStateChanged(evt);
            }
        });

        rdCarta.setBackground(new java.awt.Color(215, 217, 216));
        buttonGroup1.add(rdCarta);
        rdCarta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdCarta.setText("CARTA");
        rdCarta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdCartaItemStateChanged(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cartaCompleta.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(215, 217, 216));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mediaCarta.jpg"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        rdMediaCarta.setBackground(new java.awt.Color(215, 217, 216));
        buttonGroup1.add(rdMediaCarta);
        rdMediaCarta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdMediaCarta.setText("1/2 CARTA");
        rdMediaCarta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdMediaCartaItemStateChanged(evt);
            }
        });
        rdMediaCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMediaCartaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(rdPos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdCarta)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdMediaCarta)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdPos)
                    .addComponent(rdCarta)
                    .addComponent(rdMediaCarta))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        File fichero = new File(System.getProperty("user.home") + "\\Fact.pdf");
        if (fichero.delete()) {
            Logs.log("El fichero ha sido borrado satisfactoriamente");
        } else {
            Logs.log("El fichero no puede ser borrado");
        }

        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtDesde.getText().equals("")) {
            metodos.msgAdvertencia(null, "Debe ingresar desde que factura va a iniciar a imprimir");
            return;
        }

        if (txtHasta.getText().equals("")) {
            metodos.msgAdvertencia(null, "Debe ingresar hasta que factura va a imprimir");
            return;
        }

        String numeroInicio = "";
        String prefijoInicio = "";
        String desde = txtDesde.getText();
        int inicio = 0;
        int inicio1 = 1;
        for (int i = 0; i < desde.length(); i++) {
            try {
                if (Integer.parseInt(desde.substring(inicio, inicio1)) > 0) {
                    prefijoInicio = desde.substring(0, inicio);
                    numeroInicio = desde.substring(inicio, desde.length());
                    break;
                }
            } catch (Exception e) {
                Logs.error(e);
            }
            inicio++;
            inicio1++;
        }

        String numeroHasta = "";
        String prefijoHasta = "";
        String hasta = txtHasta.getText();
        int inicio2 = 0;
        int inicio3 = 1;
        for (int i = 0; i < hasta.length(); i++) {
            try {
                if (Integer.parseInt(hasta.substring(inicio2, inicio3)) > 0) {
                    prefijoHasta = hasta.substring(0, inicio2);
                    numeroHasta = hasta.substring(inicio2, hasta.length());
                    break;
                }
            } catch (Exception e) {
                Logs.error(e);
            }
            inicio2++;
            inicio3++;
        }

        if (!prefijoInicio.equals(prefijoHasta)) {
            metodos.msgAdvertenciaAjustado(null, "Los prefijos son diferentes");
            return;
        }

        if (Integer.parseInt(numeroInicio) > Integer.parseInt(numeroHasta)) {
            metodos.msgAdvertencia(null, "El consecutivo de inicio debe ser menor al consecutivo final");
            return;
        }

        for (int i = Integer.parseInt(numeroInicio); i <= Integer.parseInt(numeroHasta); i++) {
            imprimir(prefijoInicio + i, false, false);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Logs.error(e);
            }
        }

        metodos.msgExito(null, "Facturas impresas con exito");
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        if (txtDesde.getText().equals("")) {
            metodos.msgAdvertencia(null, "Debe ingresar desde que factura va a iniciar a imprimir");
            return;
        }

        if (txtHasta.getText().equals("")) {
            metodos.msgAdvertencia(null, "Debe ingresar hasta que factura va a imprimir");
            return;
        }

        String numeroInicio = "";
        String prefijoInicio = "";
        String desde = txtDesde.getText();
        int inicio = 0;
        int inicio1 = 1;
        for (int i = 0; i < desde.length(); i++) {
            try {
                if (Integer.parseInt(desde.substring(inicio, inicio1)) > 0) {
                    prefijoInicio = desde.substring(0, inicio);
                    numeroInicio = desde.substring(inicio, desde.length());
                    break;
                }
            } catch (Exception e) {
                Logs.error(e);
            }
            inicio++;
            inicio1++;
        }

        String numeroHasta = "";
        String prefijoHasta = "";
        String hasta = txtHasta.getText();
        int inicio2 = 0;
        int inicio3 = 1;
        for (int i = 0; i < hasta.length(); i++) {
            try {
                if (Integer.parseInt(hasta.substring(inicio2, inicio3)) > 0) {
                    prefijoHasta = hasta.substring(0, inicio2);
                    numeroHasta = hasta.substring(inicio2, hasta.length());
                    break;
                }
            } catch (Exception e) {
                Logs.error(e);
            }
            inicio2++;
            inicio3++;
        }

        if (!prefijoInicio.equals(prefijoHasta)) {
            metodos.msgAdvertenciaAjustado(null, "Los prefijos son diferentes");
            return;
        }

        if (Integer.parseInt(numeroInicio) > Integer.parseInt(numeroHasta)) {
            metodos.msgAdvertencia(null, "El consecutivo de inicio debe ser menor al consecutivo final");
            return;
        }

        File directorio = new File(System.getProperty("user.home") + "/desktop/Facturas ClickingPOS");
        if (directorio.exists()) {
            metodos.msgAdvertenciaAjustado(null, "Ya existe la carpeta");
        } else {
            directorio.mkdir();
        }

        for (int i = Integer.parseInt(numeroInicio); i <= Integer.parseInt(numeroHasta); i++) {
            imprimir(prefijoInicio + i, true, false);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Logs.error(e);
            }
        }

        metodos.msgExito(null, "Facturas descargadas con exito");
        this.dispose();
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        rdPos.setSelected(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void rdPosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdPosItemStateChanged

    }//GEN-LAST:event_rdPosItemStateChanged

    private void rdCartaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdCartaItemStateChanged

    }//GEN-LAST:event_rdCartaItemStateChanged

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        rdCarta.setSelected(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        rdMediaCarta.setSelected(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void rdMediaCartaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdMediaCartaItemStateChanged

    }//GEN-LAST:event_rdMediaCartaItemStateChanged

    private void rdMediaCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMediaCartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMediaCartaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtDesde.getText().equals("")) {
            metodos.msgAdvertencia(null, "Debe ingresar desde que factura va a iniciar a imprimir");
            return;
        }

        if (txtHasta.getText().equals("")) {
            metodos.msgAdvertencia(null, "Debe ingresar hasta que factura va a imprimir");
            return;
        }

        if (txtAsunto.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Debe ingresar el asunto");
            return;
        }

        if (txtTextoMensaje.getText().equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Debe ingresar el contenido");
            return;
        }

        String numeroInicio = "";
        String prefijoInicio = "";
        String desde = txtDesde.getText();
        int inicio = 0;
        int inicio1 = 1;
        for (int i = 0; i < desde.length(); i++) {
            try {
                if (Integer.parseInt(desde.substring(inicio, inicio1)) > 0) {
                    prefijoInicio = desde.substring(0, inicio);
                    numeroInicio = desde.substring(inicio, desde.length());
                    break;
                }
            } catch (Exception e) {
                Logs.error(e);
            }
            inicio++;
            inicio1++;
        }

        String numeroHasta = "";
        String prefijoHasta = "";
        String hasta = txtHasta.getText();
        int inicio2 = 0;
        int inicio3 = 1;
        for (int i = 0; i < hasta.length(); i++) {
            try {
                if (Integer.parseInt(hasta.substring(inicio2, inicio3)) > 0) {
                    prefijoHasta = hasta.substring(0, inicio2);
                    numeroHasta = hasta.substring(inicio2, hasta.length());
                    break;
                }
            } catch (Exception e) {
                Logs.error(e);
            }
            inicio2++;
            inicio3++;
        }

        if (!prefijoInicio.equals(prefijoHasta)) {
            metodos.msgAdvertenciaAjustado(null, "Los prefijos son diferentes");
            return;
        }

        if (Integer.parseInt(numeroInicio) > Integer.parseInt(numeroHasta)) {
            metodos.msgAdvertencia(null, "El consecutivo de inicio debe ser menor al consecutivo final");
            return;
        }

        for (int i = Integer.parseInt(numeroInicio); i <= Integer.parseInt(numeroHasta); i++) {
            imprimir(prefijoInicio + i, true, true);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Logs.error(e);
            }
        }

        metodos.msgExito(null, "Facturas enviadas con exito");
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void imprimir(String facturaPrueba, Boolean crearPDF, Boolean enviarCorreo) {
        String encabezado = ".Reimpresión";

        ndFactura nodo = instancias.getSql().getDatosFactura("FACT-" + facturaPrueba);

        if (nodo.isAnulada()) {
            encabezado = ".Reimpresión (Anulada)";
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

        if (enviarCorreo) {
            encabezado = "Original";
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

        String impresora = "";
        if (rdMediaCarta.isSelected()) {
            impresora = datos[82].toString();
        } else if (rdCarta.isSelected()) {
            impresora = datos[83].toString();
        } else if (rdPos.isSelected()) {
            impresora = datos[81].toString();
        }

        String factura2 = "FACT-" + facturaPrueba;
        String impoconsumo = datos[84].toString();
        String retenciones = datos[85].toString();

        String condicion;
        if ((Boolean) datos[50] && instancias.getConfiguraciones().isRestaurante()) {
            condicion = sentenciaImpresionFactura("agrupada", " WHERE bdFactura.factura = '" + "FACT-" + facturaPrueba + "' ");
        } else {
            if (instancias.getConfiguraciones().isRestaurante()) {
                condicion = sentenciaImpresionFactura("agrupada", " WHERE bdFactura.factura = '" + "FACT-" + facturaPrueba + "' ");
            } else {
                condicion = sentenciaImpresionFactura("", " WHERE bdFactura.factura = '" + "FACT-" + facturaPrueba + "' ");
            }
        }

        String infoEmpresa = metodosGenerales.convertToMultiline(instancias.getInformacionEmpresaReimpresion() + "\n" + nodo.getResolucion());
        instancias.getReporte().ver_Factura("FACT-" + facturaPrueba, nodo.getObservacion(), infoEmpresa, instancias.getLegal(), encabezado, instancias.getPie(), tipo,
                factura2, false, titulo, impresora, impoconsumo, retenciones, condicion, false, crearPDF);

        if (crearPDF && enviarCorreo) {
            ndTercero nodoTerc = instancias.getSql().getDatosTercero(nodo.getCliente());

            String correo = nodoTerc.getEmail();

            if (correo.equals("")) {
                metodos.msgAdvertencia(null, "El cliente de la FACT-" + facturaPrueba + " no tiene correo relacionado y no se pudo enviar");
            } else {
                Boolean envioCorrecto = enviarConGMail(nodoTerc.getEmail(), txtAsunto.getText(), "FACT-" + facturaPrueba, nodoTerc.getNombre());
                if (envioCorrecto) {
                    File fichero = new File(System.getProperty("user.home") + "\\Fact.pdf");
                    if (fichero.delete()) {
                        Logs.log("El fichero ha sido borrado satisfactoriamente");
                    } else {
                        Logs.log("El fichero no puede ser borrado");
                    }

                    this.dispose();
                } else {
                    metodos.msgError(null, "Error al enviar la FACT-" + facturaPrueba);
                }
            }
        }
    }

    public String sentenciaImpresionFactura(String tipo, String condicion) {
        String sentencia = "";

        if (tipo.equals("agrupada")) {
            sentencia = "SELECT bdfactura.idFactura AS idFactura, CAST(SUBSTR(bdfactura.idFactura,6,100) AS SIGNED) AS ordenId, bdterceros.id AS cliente, "
                    + "bdterceros.ciudad AS ciudad, bdfactura.vendedor AS vendedor, bdfactura.red AS red, bdfactura.fechaFactura AS fechaFactura, bdfactura.fechaVencimiento AS fechaVencimiento, "
                    + "bdfactura.efectivoGeneral AS efectivoGeneral, bdfactura.ncGeneral AS ncGeneral, bdfactura.chequeGeneral AS chequeGeneral, "
                    + "bdfactura.targetaGeneral AS targetaGeneral, bdfactura.totalGeneral AS totalGeneral, bdfactura.descuentoGeneral AS descuentoGeneral,"
                    + "bdfactura.ivaGeneral AS ivaGeneral, bdfactura.subtotalGeneral AS subtotalGeneral, bdfactura.comprobante AS comprobante, "
                    + "bdfactura.cotizacion AS cotizacion, bdfactura.anulada AS anulada, bdfactura.anula AS anula, bdfactura.credito AS credito, bdfactura.cxc AS cxc, "
                    + "bdfactura.usuario AS usuario, bdfactura.rtIva AS rtIva, bdfactura.rtIca AS rtIca, bdfactura.rtFuente AS rtFuente, bdfactura.otros AS otros, "
                    + "bdfactura.observacion AS observacion, bdfactura.anulada1 AS anulada1, bdfactura.anula1 AS anula1, bdfactura.credito1 AS credito1, bdfactura.cxc1 AS cxc1, "
                    + "bdfactura.usuario1 AS usuario1, bdfactura.fechaAlerta AS fechaAlerta, bdfactura.terminal AS terminal, bdfactura.estadoGeneral AS estadoGeneral, "
                    + "bdfactura.estado2 AS estado2, bdfactura.devuelta AS devuelta, bdfactura.factura AS factura, bdfactura.resolucion AS resolucion, "
                    + "bdfactura.fechaAnulacion AS fechaAnulacion, bdfactura.cuadreAnulacion AS cuadreAnulacion, bdfactura.usuarioAnula AS usuarioAnula, bdfactura.copago AS copago, "
                    + "bdfactura.garantia AS garantia, bdfactura.diasGarantia AS diasGarantia, bdfactura.rango AS rango, bdfactura.terminos AS terminos, "
                    + "bdfactura.notaAnulacion AS notaAnulacion, bdfactura.conseMesa AS conseMesa, bdfactura.producto AS producto, bdfactura.lista AS lista, "
                    + "bdfactura.cantidad AS cantidad, bdfactura.descuento AS descuento,  bdfactura.total AS total, bdfactura.iva AS iva, bdfactura.subtotal AS subtotal, "
                    + "bdfactura.NC AS NC, bdfactura.utilidad AS utilidad, bdfactura.concepto AS concepto, bdfactura.porcDescuento AS porcDescuento,  "
                    + "bdfactura.descripcion AS descripcion,  bdfactura.plu AS plu, bdfactura.cant2 AS cant2, bdfactura.estado AS estado, bdfactura.porcIva AS porcIva, "
                    + "bdfactura.tercero AS tercero, bdfactura.utilidad1 AS utilidad1, bdterceros.nombre AS nombre, bdterceros.telefono AS telefono, "
                    + "bdterceros.direccion AS direccion, IF(ISNULL(bdprestamo.cuotaInicial),0,bdprestamo.cuotaInicial) AS cuotaInicial2, bdfactura.factura AS id2, "
                    + "bdproductos.ubicacion1 AS ubicacion1, bdproductos.referencia AS referencia, (bdfactura.subtotalGeneral - bdfactura.descuentoGeneral) AS valor3, "
                    + "IF((bdfactura.producto = 'PROD-000000032'),bdfactura.impuesto,'0') AS impuesto, bdcxc.plazo AS plazo, bdterceros.nombreContacto AS nombreContacto, "
                    + "bdterceros.cargo AS cargo, bdfactura.turno AS turno, bdproductos.grupo AS Grupo, bdterceros.eps AS eps, bdepsprecargados.nombre AS nombreEps, "
                    + "bdfactura.Id AS Id, bdfactura.placa AS placa, bdplacas.tipo AS tipo, bdparqueaderoautos.fIngreso AS fIngreso, bdparqueaderoautos.fSalida AS fSalida,"
                    + "bdparqueaderoautos.hIngreso AS hIngreso, bdparqueaderoautos.hSalida AS hSalida, bdparqueaderoautos.horas AS horas, bdfactura.imei AS imei, "
                    + "bddetalleproductos.color AS color,  bdterceros.idSistema AS idSistema, bdfactura.impoconsumo AS impoconsumo, bdproductos.Codigo AS Codigo, "
                    + "bdfactura.totalPropina AS totalPropina, bdfactura.hora AS hora, bdfactura.idProd AS idProd, bdgrupo.nombre AS nombreGrupo, "
                    + "bdfactura.impoGeneral AS impoGeneral,  bdfactura.porcImpo AS porcImpo, bdfactura.bodega AS bodega "
                    + "FROM ((((((((bdfactura LEFT JOIN bdprestamo ON ((bdfactura.idFactura = bdprestamo.factura))) LEFT JOIN bdcxc ON ((bdfactura.factura = bdcxc.factura2))) "
                    + "LEFT JOIN bdplacas ON ((bdfactura.placa = bdplacas.placa))) LEFT JOIN bdparqueaderoautos ON ((bdparqueaderoautos.factura = bdfactura.factura))) "
                    + "LEFT JOIN bddetalleproductos ON ((bdfactura.idProd = bddetalleproductos.Id))) LEFT JOIN bdproductos ON ((bdfactura.producto = bdproductos.idSistema))) "
                    + "LEFT JOIN (bdterceros LEFT JOIN bdepsprecargados ON ((bdepsprecargados.Id = bdterceros.eps))) ON ((bdfactura.cliente = bdterceros.idSistema))) "
                    + "LEFT JOIN bdgrupo ON ((bdproductos.grupo = bdgrupo.codigo))) "
                    + condicion + " AND bdcxc.tipo = 'FACT' GROUP BY bdcxc.plazo,bdFactura.idFactura, CAST(SUBSTR(bdfactura.idFactura,6,100) AS SIGNED),"
                    + "bdFactura.cliente, bdterceros.ciudad, bdFactura.vendedor, bdFactura.red, bdFactura.fechaFactura, bdFactura.fechaVencimiento, bdFactura.efectivoGeneral, bdFactura.ncGeneral,"
                    + "bdFactura.chequeGeneral, bdFactura.targetaGeneral, bdFactura.totalGeneral, bdFactura.descuentoGeneral, bdFactura.ivaGeneral, bdFactura.subtotalGeneral, "
                    + "bdFactura.comprobante, bdFactura.cotizacion, bdFactura.anulada, bdFactura.anula, bdFactura.credito, bdFactura.cxc, bdFactura.usuario, bdFactura.rtIva, "
                    + "bdFactura.rtIca, bdFactura.rtFuente, bdFactura.otros, bdFactura.anulada1, bdFactura.anula1, bdFactura.credito1, bdFactura.cxc1, bdFactura.usuario1, "
                    + "bdFactura.fechaAlerta, bdFactura.terminal, bdFactura.estadoGeneral, bdFactura.estado2, bdFactura.devuelta, bdFactura.factura, bdFactura.resolucion,"
                    + "bdFactura.fechaAnulacion, bdFactura.cuadreAnulacion, bdFactura.usuarioAnula, bdFactura.copago, bdFactura.diasGarantia, bdFactura.rango, "
                    + "bdFactura.conseMesa, bdFactura.producto, bdFactura.lista, bdFactura.NC, bdFactura.porcDescuento, bdFactura.descripcion, bdFactura.plu, bdFactura.estado, "
                    + "bdFactura.porcIva, bdFactura.tercero, bdFactura.utilidad1, bdTerceros.nombre, bdTerceros.telefono, bdTerceros.direccion,"
                    + "IF(ISNULL(bdprestamo.cuotaInicial),0,bdprestamo.cuotaInicial), bdfactura.factura, bdproductos.ubicacion1, bdproductos.referencia,"
                    + "(bdfactura.subtotalGeneral - bdfactura.descuentoGeneral), bdFactura.impuesto, bdcxc.plazo, bdterceros.nombreContacto, bdterceros.cargo, bdFactura.turno,"
                    + "bdproductos.Grupo, bdterceros.eps, bdepsprecargados.nombre, bdFactura.placa, bdplacas.tipo, bdparqueaderoautos.fIngreso, bdparqueaderoautos.fSalida,"
                    + "bdparqueaderoautos.hIngreso, bdparqueaderoautos.hSalida, bdparqueaderoautos.horas, bdFactura.imei, bddetalleproductos.color, bdterceros.idSistema, "
                    + "bdFactura.impoconsumo, bdproductos.Codigo, bdFactura.totalPropina, bdFactura.hora, bdFactura.impoGeneral, bdFactura.porcImpo,'' ";
        } else {
            sentencia = "SELECT bdfactura.idFactura AS idFactura, CAST(SUBSTR(bdfactura.idFactura,6,100) AS SIGNED) AS ordenId, bdterceros.id AS cliente, bdterceros.ciudad AS ciudad, bdfactura.vendedor AS vendedor,  bdfactura.red AS red, "
                    + "bdfactura.fechaFactura AS fechaFactura, bdfactura.fechaVencimiento AS fechaVencimiento, bdfactura.efectivoGeneral AS efectivoGeneral, bdfactura.ncGeneral AS ncGeneral, "
                    + "bdfactura.chequeGeneral AS chequeGeneral, bdfactura.targetaGeneral AS targetaGeneral, bdfactura.totalGeneral AS totalGeneral, bdfactura.descuentoGeneral AS descuentoGeneral, "
                    + "bdfactura.ivaGeneral AS ivaGeneral, bdfactura.subtotalGeneral AS subtotalGeneral, bdfactura.comprobante AS comprobante, bdfactura.cotizacion AS cotizacion, bdfactura.anulada AS anulada, "
                    + "bdfactura.anula AS anula, bdfactura.credito AS credito, bdfactura.cxc AS cxc, bdfactura.usuario AS usuario, bdfactura.rtIva AS rtIva, bdfactura.rtIca AS rtIca, bdfactura.rtFuente AS rtFuente, "
                    + "bdfactura.otros AS otros, bdfactura.observacion AS observacion, bdfactura.anulada1 AS anulada1, bdfactura.anula1 AS anula1, bdfactura.credito1 AS credito1, bdfactura.cxc1 AS cxc1, "
                    + "bdfactura.usuario1 AS usuario1, bdfactura.fechaAlerta AS fechaAlerta, bdfactura.terminal AS terminal, bdfactura.estadoGeneral AS estadoGeneral, bdfactura.estado2 AS estado2, "
                    + "bdfactura.devuelta AS devuelta, bdfactura.factura AS factura, bdfactura.resolucion AS resolucion, bdfactura.fechaAnulacion AS fechaAnulacion, bdfactura.cuadreAnulacion AS cuadreAnulacion, "
                    + "bdfactura.usuarioAnula AS usuarioAnula, bdfactura.copago AS copago, bdfactura.garantia AS garantia, bdfactura.diasGarantia AS diasGarantia, bdfactura.rango AS rango, "
                    + "bdfactura.terminos AS terminos,  bdfactura.notaAnulacion AS notaAnulacion, bdfactura.conseMesa AS conseMesa, bdfactura.producto AS producto, bdfactura.lista AS lista, bdfactura.cantidad AS cantidad, "
                    + "bdfactura.descuento AS descuento,  bdfactura.total AS total, bdfactura.iva AS iva, bdfactura.subtotal AS subtotal, bdfactura.NC AS NC, bdfactura.utilidad AS utilidad, bdfactura.concepto AS concepto, "
                    + "bdfactura.porcDescuento AS porcDescuento,  bdfactura.descripcion AS descripcion,  bdfactura.plu AS plu, bdfactura.cant2 AS cant2, bdfactura.estado AS estado, bdfactura.porcIva AS porcIva, "
                    + "bdfactura.tercero AS tercero, bdfactura.utilidad1 AS utilidad1, bdterceros.nombre AS nombre, bdterceros.telefono AS telefono, bdterceros.direccion AS direccion, "
                    + "IF(ISNULL(bdprestamo.cuotaInicial),0,bdprestamo.cuotaInicial) AS cuotaInicial2, bdfactura.factura AS id2, bdproductos.ubicacion1 AS ubicacion1, bdproductos.referencia AS referencia, "
                    + "(bdfactura.subtotalGeneral - bdfactura.descuentoGeneral) AS valor3, IF((bdfactura.producto = 'PROD-000000032'),bdfactura.impuesto,'0') AS impuesto, bdcxc.plazo AS plazo, "
                    + "bdterceros.nombreContacto AS nombreContacto, bdterceros.cargo AS cargo, bdfactura.turno AS turno, bdproductos.grupo AS Grupo, bdterceros.eps AS eps, bdepsprecargados.nombre AS nombreEps, "
                    + "bdfactura.Id AS Id, bdfactura.placa AS placa,  bdplacas.tipo AS tipo, bdparqueaderoautos.fIngreso AS fIngreso,  bdparqueaderoautos.fSalida AS fSalida, bdparqueaderoautos.hIngreso AS hIngreso, "
                    + "bdparqueaderoautos.hSalida AS hSalida, bdparqueaderoautos.horas AS horas,  bdfactura.imei AS imei, bddetalleproductos.color AS color,  bdterceros.idSistema AS idSistema, "
                    + "bdfactura.impoconsumo AS impoconsumo,  bdproductos.Codigo AS Codigo, bdfactura.totalPropina AS totalPropina,  bdfactura.hora AS hora, bdfactura.idProd AS idProd, bdgrupo.nombre AS nombreGrupo, "
                    + "bdfactura.impoGeneral AS impoGeneral,  bdfactura.porcImpo AS porcImpo, bdfactura.bodega AS bodega "
                    + "FROM ((((((((bdfactura LEFT JOIN bdprestamo ON ((bdfactura.idFactura = bdprestamo.factura))) LEFT JOIN bdcxc ON ((bdfactura.factura = bdcxc.factura2))) LEFT JOIN bdplacas "
                    + "ON ((bdfactura.placa = bdplacas.placa))) LEFT JOIN bdparqueaderoautos ON ((bdparqueaderoautos.factura = bdfactura.factura))) LEFT JOIN bddetalleproductos ON ((bdfactura.idProd = bddetalleproductos.Id))) "
                    + "LEFT JOIN bdproductos ON ((bdfactura.producto = bdproductos.idSistema))) LEFT JOIN (bdterceros LEFT JOIN bdepsprecargados ON ((bdepsprecargados.Id = bdterceros.eps))) "
                    + "ON ((bdfactura.cliente = bdterceros.idSistema))) LEFT JOIN bdgrupo ON ((bdproductos.grupo = bdgrupo.codigo))) "
                    + condicion + " GROUP BY bdfactura.idFactura,CAST(SUBSTR(bdfactura.idFactura,6,100)AS SIGNED),bdterceros.id,bdterceros.ciudad,bdfactura.vendedor,bdfactura.red,bdfactura.fechaFactura,bdfactura.fechaVencimiento,bdfactura.efectivoGeneral,"
                    + "bdfactura.ncGeneral,bdfactura.chequeGeneral,bdfactura.targetaGeneral,bdfactura.totalGeneral,bdfactura.descuentoGeneral,bdfactura.ivaGeneral,bdfactura.subtotalGeneral,bdfactura.comprobante,"
                    + "bdfactura.cotizacion,bdfactura.anulada,bdfactura.anula,bdfactura.credito,bdfactura.cxc,bdfactura.usuario,bdfactura.rtIva,bdfactura.rtIca,bdfactura.rtFuente,bdfactura.otros,bdfactura.anulada1,"
                    + "bdfactura.anula1,bdfactura.credito1,bdfactura.cxc1,bdfactura.usuario1,bdfactura.fechaAlerta,bdfactura.terminal,bdfactura.estadoGeneral,bdfactura.estado2,bdfactura.devuelta,bdfactura.resolucion,"
                    + "bdfactura.fechaAnulacion,bdfactura.cuadreAnulacion,bdfactura.usuarioAnula,bdfactura.copago,bdfactura.garantia,bdfactura.diasGarantia,bdfactura.rango,bdfactura.conseMesa,bdfactura.producto,bdfactura.lista,"
                    + "bdfactura.cantidad,bdfactura.descuento,bdfactura.total,bdfactura.iva,bdfactura.subtotal,bdfactura.NC,bdfactura.utilidad,bdfactura.porcDescuento,bdfactura.descripcion,bdfactura.plu,bdfactura.cant2,"
                    + "bdfactura.estado,bdfactura.porcIva,bdfactura.tercero,bdfactura.utilidad1,bdterceros.nombre,bdterceros.telefono,bdterceros.direccion,IF(ISNULL(bdprestamo.cuotaInicial),0,bdprestamo.cuotaInicial),"
                    + "bdfactura.factura,bdproductos.ubicacion1,bdproductos.referencia,(bdfactura.subtotalGeneral - bdfactura.descuentoGeneral),IF((bdfactura.producto = 'PROD-000000032'),bdfactura.impuesto,'0'),"
                    + "bdterceros.nombreContacto,bdterceros.cargo,bdfactura.turno,bdproductos.grupo,bdterceros.eps,bdepsprecargados.nombre,bdfactura.Id,bdfactura.placa,bdplacas.tipo,bdparqueaderoautos.fIngreso,"
                    + "bdparqueaderoautos.fSalida,bdparqueaderoautos.hIngreso,bdparqueaderoautos.hSalida,bdparqueaderoautos.horas,bdfactura.imei,bddetalleproductos.color,bdterceros.idSistema,bdfactura.impoconsumo,"
                    + "bdproductos.Codigo,bdgrupo.nombre,bdfactura.impoGeneral,bdfactura.porcImpo,bdfactura.bodega ORDER BY bdfactura.Id";
        }

        return sentencia;
    }

    public String getTipo() {
        String factura = "";
        if (instancias.getConfiguraciones().isMedico()) {
            if (rdCarta.isSelected()) {
                return "facturaMedicaCompleta";
            } else {
                return "facturaMedica";
            }
        }

        if (rdCarta.isSelected()) {
            return "facturaCompleta" + instancias.getRegimen();
        } else if (rdPos.isSelected()) {
            return "pos" + instancias.getRegimen();
        }

        return "factura" + instancias.getRegimen();
    }

    private boolean enviarConGMail(String destinatario, String asunto, String numFactura, String cliente) {
//        String remitente = "desarrollo@clickingpos.com";  //Para la dirección nomcuenta@gmail.com
//        String passwordCuenta = "1040756785slz";

        Object[] datos = instancias.getSql().getDatosMaestra();

        String remitente = datos[114].toString();
        if (remitente.equals("")) {
            metodos.msgAdvertenciaAjustado(null, "No se ha establecido el email del remitente");
            return false;
        }

        String passwordCuenta = datos[115].toString();
        if (passwordCuenta.equals("")) {
            metodos.msgAdvertenciaAjustado(null, "No se ha establecido la contraseña del remitente");
            return false;
        }

        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", passwordCuenta);    //La clave de la cuenta
        props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
        props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
        props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(remitente));
            message.addRecipients(Message.RecipientType.TO, destinatario);   //Se podrían añadir varios de la misma manera

            // Se compone la parte del texto
            BodyPart texto = new MimeBodyPart();
            texto.setText(txtTextoMensaje.getText());

            // Se compone el adjunto con la imagen
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(System.getProperty("user.home") + "\\Fact.pdf")));
            adjunto.setFileName(numFactura + ", " + cliente + ".pdf");

            // Una MultiParte para agrupar texto e imagen.
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            multiParte.addBodyPart(adjunto);

            message.setContent(multiParte);
            message.setSubject(asunto);

            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", remitente, passwordCuenta);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (MessagingException me) {
//            me.printStackTrace();
            return false;
        }

        return true;
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dlgEnviarCorreoMasivo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgEnviarCorreoMasivo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgEnviarCorreoMasivo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgEnviarCorreoMasivo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgEnviarCorreoMasivo dialog = new dlgEnviarCorreoMasivo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescargar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdCarta;
    private javax.swing.JRadioButton rdMediaCarta;
    private javax.swing.JRadioButton rdPos;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtHasta;
    private javax.swing.JTextArea txtTextoMensaje;
    // End of variables declaration//GEN-END:variables

    private static class FileDataSource implements DataSource {

        public FileDataSource(String string) {
        }

        @Override
        public InputStream getInputStream() throws IOException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public OutputStream getOutputStream() throws IOException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getContentType() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getName() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
