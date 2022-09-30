package formularios.PTM;
import logs.Logs;
import clases.Instancias;
import clases.PTM.PruebaPTM;
import clases.Utils;
import clases.big;
import clases.cambiarColorTabla;
import clases.metodosGenerales;
import com.lowagie.text.Document;
import com.lowagie.text.html.simpleparser.HTMLWorker;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import co.com.tecnofactor.ptfcc.modelo.dto.common.xsd.CamposProducto;
import co.com.tecnofactor.ptfcc.modelo.ws.xsd.RespuestaVentaWS;
import co.com.tecnofactor.ptfcc.modelo.ws.xsd.UsuarioWS;
import co.com.tecnofactor.ptfcc.modelo.ws.xsd.VentaWS;
import configuracion.Propiedades;
import java.awt.Image;
import java.rmi.RemoteException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public final class dlgFormularios extends javax.swing.JDialog {

    DefaultTableModel modelo;
    TableRowSorter modeloOrdenado;
    Instancias instancias;
    metodosGenerales metodos;
    int codigoGeneral;
    String simbolo = "";
    Object[] datos;
    Object[][] datosActuales = null;
    Object[][] datosOcultos = null;
    PruebaPTM servicioWeb;

    public dlgFormularios() {
        cargarMaestra();
    }

    public dlgFormularios(java.awt.Frame parent, boolean modal, int codigo, Object[][] datos) {
        super(parent, modal);

        initComponents();
        this.setTitle(datos[0][3].toString());

        codigoGeneral = codigo;
        instancias = Instancias.getInstancias();

        this.simbolo = instancias.getSimbolo();
        metodos = new metodosGenerales();

//        txtCampo.setVisible(false);
        tblDatos.setDefaultRenderer(Object.class, new cambiarColorTabla(6, 0));
        tblDatos.getColumnModel().getColumn(4).setCellRenderer(new WordWrapCellRenderer());
        BufferedImage bufferedImage = instancias.getSql().getImagen2("LogosProductosPTM\\"+ codigo + ".png");
        ImageIcon img = new ImageIcon(bufferedImage);
        Icon icono = new ImageIcon(img.getImage());
        lbImagen.setIcon(icono);
        this.repaint();

        modelo = (DefaultTableModel) tblDatos.getModel();

        Boolean fecha = false;

        int ser = 0;
        datosOcultos = new Object[datos.length][2];
                
        
        for (Object[] dato : datos) {

            if (dato[0] != null) {

                btnNuevoProducto.setText(dato[15].toString());
                if (dato[12].toString().equals("F")) {
                    fecha = true;
                }

                if (!dato[12].toString().equals("O")) {
                    if (dato[12].toString().equals("C")) {
                        modelo.addRow(new Object[]{dato[11], dato[10], dato[12], dato[7], dato[9], "SI/NO", dato[14], "", dato[8]});
                    } else {
                        if (dato[14] == null) {
                            modelo.addRow(new Object[]{dato[11], dato[10], dato[12], dato[7], dato[9], "", "", "", dato[8]});
                        } else {
                            if (!dato[14].toString().equals("")) {
                                modelo.addRow(new Object[]{dato[11], dato[10], dato[12], dato[7], dato[9], "Seleccionar...", dato[14], "", dato[8]});
                            } else {
                                modelo.addRow(new Object[]{dato[11], dato[10], dato[12], dato[7], dato[9], "", "", "", dato[8]});
                            }
                        }
                    }
                } else {
                    Logs.log("borrando ocultos");
                    datosOcultos[ser][0] = dato[8];
                    datosOcultos[ser][1] = dato[13];
                    ser++;
                }
            }
        }

        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            if (tblDatos.getValueAt(i, 1).toString().equals("true")) {
                tblDatos.setValueAt(tblDatos.getValueAt(i, 4) + " *", i, 4);
            }
        }

        if (fecha) {
            lbFecha.setVisible(true);
        } else {
            lbFecha.setVisible(false);
        }

        cargarMaestra();
        datosActuales = datos;
        this.setLocationRelativeTo(null);
        this.getRootPane().registerKeyboardAction(accion("cerrar", this), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        servicioWeb = new PruebaPTM();
        servicioWeb.getService();
    }

    static class WordWrapCellRenderer extends JTextArea implements TableCellRenderer {

        WordWrapCellRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            setText(value.toString());
            setSize(table.getColumnModel().getColumn(column).getWidth(), 31);

            if (table.getRowHeight(row) != getPreferredSize().height) {
                table.setRowHeight(row, getPreferredSize().height);
            }

            if (isSelected) {
                setForeground(new Color(0, 0, 0));
                setBackground(table.getSelectionBackground());
                Font font = new Font("Century Gothic", Font.PLAIN, 20);
                setFont(font);
            } else {
                setForeground(new Color(0, 0, 0));
                setBackground(table.getBackground());
                Font font = new Font("Century Gothic", Font.PLAIN, 20);
                setFont(font);
            }

            return this;
        }
    }

    public void cargarMaestra() {
        datos = instancias.getSql().getDatosMaestra();
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

        filtro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lbFecha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCampo = new javax.swing.JTextField();
        btnNuevoProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        lbImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImagenMouseClicked(evt);
            }
        });

        tblDatos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "orden", "obligatorio", "letra", "tipo", "Descripción", "", "codCargar", "IdSel", "codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.setRowHeight(24);
        tblDatos.getTableHeader().setReorderingAllowed(false);
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tblDatosMouseExited(evt);
            }
        });
        tblDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDatosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblDatos);
        if (tblDatos.getColumnModel().getColumnCount() > 0) {
            tblDatos.getColumnModel().getColumn(0).setMinWidth(0);
            tblDatos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblDatos.getColumnModel().getColumn(0).setMaxWidth(0);
            tblDatos.getColumnModel().getColumn(1).setMinWidth(0);
            tblDatos.getColumnModel().getColumn(1).setPreferredWidth(0);
            tblDatos.getColumnModel().getColumn(1).setMaxWidth(0);
            tblDatos.getColumnModel().getColumn(2).setMinWidth(0);
            tblDatos.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblDatos.getColumnModel().getColumn(2).setMaxWidth(0);
            tblDatos.getColumnModel().getColumn(3).setMinWidth(0);
            tblDatos.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblDatos.getColumnModel().getColumn(3).setMaxWidth(0);
            tblDatos.getColumnModel().getColumn(4).setMinWidth(150);
            tblDatos.getColumnModel().getColumn(4).setPreferredWidth(250);
            tblDatos.getColumnModel().getColumn(4).setMaxWidth(400);
            tblDatos.getColumnModel().getColumn(6).setMinWidth(0);
            tblDatos.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblDatos.getColumnModel().getColumn(6).setMaxWidth(0);
            tblDatos.getColumnModel().getColumn(7).setMinWidth(0);
            tblDatos.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblDatos.getColumnModel().getColumn(7).setMaxWidth(0);
            tblDatos.getColumnModel().getColumn(8).setMinWidth(0);
            tblDatos.getColumnModel().getColumn(8).setPreferredWidth(0);
            tblDatos.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        lbFecha.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFecha.setText("Formato de fecha: AAAA/MM/DD");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        txtCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCampoKeyReleased(evt);
            }
        });

        btnNuevoProducto.setBackground(new java.awt.Color(46, 204, 113));
        btnNuevoProducto.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnNuevoProducto.setText("NUEVO");
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCampo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFecha)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        validarTabla();
        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            if (tblDatos.getValueAt(i, 1).toString().equals("true") && tblDatos.getValueAt(i, 5).toString().equals("")) {
                metodos.msgAdvertenciaAjustado(null, tblDatos.getValueAt(i, 4).toString() + " es obligatorio");
                return;
            }
        }

        if (datosActuales[0][1] != null) {
            if (!datosActuales[0][1].toString().equals("")) {
                if (datosActuales[0][1].toString().equals("null")) {
                    consumirServicio();
                } else {
                    consumirServicioConfirmacion();
                }
            } else {
                consumirServicio();
            }
        } else {
            consumirServicio();
        }
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void tblDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDatosKeyReleased
        if (tblDatos.getValueAt(tblDatos.getSelectedRow(), 2).equals("N")) {
            BigDecimal dato = BigDecimal.ZERO;

            try {
                dato = big.getBigDecimal(tblDatos.getValueAt(tblDatos.getSelectedRow(), 5).toString());
                tblDatos.setValueAt(dato, tblDatos.getSelectedRow(), 5);
            } catch (Exception e) {
                try {
                    dato = big.getMoneda(tblDatos.getValueAt(tblDatos.getSelectedRow(), 5).toString());
                    tblDatos.setValueAt(dato, tblDatos.getSelectedRow(), 5);
                } catch (Exception ex) {
                    Logs.error(e);
                    tblDatos.setValueAt("", tblDatos.getSelectedRow(), 5);
                    return;
                }
            }

            String tipoDato = "";
            tipoDato = tblDatos.getValueAt(tblDatos.getSelectedRow(), 3).toString();
            if (tipoDato.contains("formatoNumero")) {
                tblDatos.setValueAt(big.setMoneda(dato), tblDatos.getSelectedRow(), 5);
            }
        } else if (tblDatos.getValueAt(tblDatos.getSelectedRow(), 2).equals("F")) {
            String fecha = tblDatos.getValueAt(tblDatos.getSelectedRow(), 5).toString();
            if (fecha.length() < 10 || fecha.length() > 10) {
                tblDatos.setValueAt("", tblDatos.getSelectedRow(), 5);
            }
            if (!fecha.substring(4, 5).equals("/") && !fecha.substring(7, 8).equals("/")) {
                tblDatos.setValueAt("", tblDatos.getSelectedRow(), 5);
            }
        } else if (tblDatos.getValueAt(tblDatos.getSelectedRow(), 2).equals("H")) {
            BigDecimal dato = BigDecimal.ZERO;
            try {
                dato = big.getBigDecimal(tblDatos.getValueAt(tblDatos.getSelectedRow(), 5).toString());
                tblDatos.setValueAt(big.setMoneda(dato), tblDatos.getSelectedRow(), 5);
            } catch (Exception e) {
                Logs.error(e);
                try {
                    dato = big.getMoneda(tblDatos.getValueAt(tblDatos.getSelectedRow(), 5).toString());
                    tblDatos.setValueAt(big.setMoneda(dato), tblDatos.getSelectedRow(), 5);
                } catch (Exception ex) {
                    Logs.error(e);
                    tblDatos.setValueAt("", tblDatos.getSelectedRow(), 5);
                    return;
                }
            }
        }
    }//GEN-LAST:event_tblDatosKeyReleased

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        if (tblDatos.getSelectedColumn() == 5) {
            if (tblDatos.getValueAt(tblDatos.getSelectedRow(), 2).toString().equals("D")) {
                instancias.setCampoActual(txtCampo);
                infComboBox cargarCombo = new infComboBox(null, true, tblDatos.getValueAt(tblDatos.getSelectedRow(), 6).toString(), tblDatos.getSelectedRow());
                cargarCombo.setVisible(true);
            }
        }
    }//GEN-LAST:event_tblDatosMouseClicked

    private void txtCampoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCampoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String cod = txtCampo.getText();
            tblDatos.setValueAt(cod.split("XXX")[0], Integer.parseInt(cod.split("XXX")[2]), 7);
            tblDatos.setValueAt(cod.split("XXX")[1], Integer.parseInt(cod.split("XXX")[2]), 5);
            txtCampo.setText("");
        }
    }//GEN-LAST:event_txtCampoKeyReleased

    private void tblDatosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseExited

    }//GEN-LAST:event_tblDatosMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        validarTabla();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void lbImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImagenMouseClicked
        validarTabla();
    }//GEN-LAST:event_lbImagenMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        validarTabla();
    }//GEN-LAST:event_jPanel2MouseClicked

    public void validarTabla() {

        btnNuevoProducto.requestFocus();

        tblDatos.editCellAt(0, 0);
        tblDatos.setColumnSelectionInterval(0, 0);
        tblDatos.transferFocus();

        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            if (tblDatos.getValueAt(i, 2).equals("N")) {
                BigDecimal dato = BigDecimal.ZERO;

                try {
                    dato = big.getBigDecimal(tblDatos.getValueAt(i, 5).toString());
                    tblDatos.setValueAt(dato, i, 5);
                } catch (Exception e) {
                    Logs.error(e);
                    try {
                        dato = big.getMoneda(tblDatos.getValueAt(i, 5).toString());
                        tblDatos.setValueAt(dato, i, 5);
                    } catch (Exception ex) {
                        Logs.error(ex);
                        tblDatos.setValueAt("", i, 5);
                        return;
                    }
                }

                String tipoDato = "";
                tipoDato = tblDatos.getValueAt(i, 3).toString();
                if (tipoDato.contains("formatoNumero")) {
                    tblDatos.setValueAt(big.setMoneda(dato), i, 5);
                }
            } else if (tblDatos.getValueAt(i, 2).equals("F")) {
                String fecha = tblDatos.getValueAt(i, 5).toString();
                if (fecha.length() < 10 || fecha.length() > 10) {
                    tblDatos.setValueAt("", i, 5);
                }
                if (!fecha.substring(4, 5).equals("/") && !fecha.substring(7, 8).equals("/")) {
                    tblDatos.setValueAt("", i, 5);
                }
            } else if (tblDatos.getValueAt(i, 2).equals("H")) {
                BigDecimal dato = BigDecimal.ZERO;
                try {
                    dato = big.getBigDecimal(tblDatos.getValueAt(i, 5).toString());
                    tblDatos.setValueAt(big.setMoneda(dato), i, 5);
                } catch (Exception e) {
                    Logs.error(e);
                    try {
                        dato = big.getMoneda(tblDatos.getValueAt(i, 5).toString());
                        tblDatos.setValueAt(big.setMoneda(dato), i, 5);
                    } catch (Exception ex) {
                        Logs.error(ex);
                        tblDatos.setValueAt("", i, 5);
                        return;
                    }
                }
            }
        }
    }

    public static void crearPdf(String html) {
        try {
            OutputStream file = new FileOutputStream(new File("Impresion.pdf"));
            Document document = new Document();
            PdfWriter.getInstance(document, file);
            document.open();
            HTMLWorker htmlWorker = new HTMLWorker(document);
            htmlWorker.parse(new StringReader(html));
            document.close();
            file.close();
        } catch (Exception e) {
            Logs.error(e);
        }
    }

    public static void crearHtml(String codigo) {
        try {
            File archivo = new File("Confirmacion.html");
            archivo.delete();
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(codigo);
            escribir.close();
        } catch (Exception e) {
            Logs.error(e);
            Logs.log("Error al escribir " + e);
        }
    }

    private void consumirServicioConfirmacion() {
        String client = "", pass = "";
        if (datos[110] != null) {
            client = datos[110].toString();
        }
        if (datos[111] != null) {
            pass = Utils.decrypt(datos[111].toString());
        }

        Boolean valorVen = false;
        int valor = 0;
        String contrato = "";
        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            if ("contratoVenta".equals(tblDatos.getValueAt(i, 8))) {
                contrato = tblDatos.getValueAt(i, 5).toString();
            }
            if ("valorVenta".equals(tblDatos.getValueAt(i, 8))) {
                valor = Integer.parseInt(tblDatos.getValueAt(i, 5).toString().replace(this.simbolo + " ", "").replace(".", ""));
                valorVen = true;
            }
        }

        if (valorVen) {
            if (valor < Integer.parseInt(big.setNumero(big.getMoneda(datosActuales[0][6].toString())).replace(".", ""))) {
                metodos.msgAdvertenciaAjustado(null, "El valor debe ser mayor a " + datosActuales[0][6].toString());
                return;
            }

            if (valor > Integer.parseInt(big.setNumero(big.getMoneda(datosActuales[0][5].toString())).replace(".", ""))) {
                metodos.msgAdvertenciaAjustado(null, "El valor debe ser menor a " + datosActuales[0][5].toString());
                return;
            }
        } else {
            valor = 1;
        }

        if (contrato.equals("")) {
            metodos.msgAdvertencia(null, "El # del contrato es obligatorio");
            return;
        }

        String fechaHora = metodosGenerales.hora().replace(" ", "_");
        String txClient = instancias.getSql().getNumConsecutivo("TXCLIENTE")[0].toString() + "-" + fechaHora + "-" + (int) (Math.random() * 100 + 1);
//        String hashEncriptado = "6315992471" + "]]" + "C1m31p$nG$#ptM$pr5" + "]]" + client + "]]" + pass + "]]" + "1" + "]]"
//                + txClient + "]]" + codigoGeneral + "]]" + contrato + "]]" + valor + "]]";

        String hashEncriptado = Propiedades.getInstancia().getTerceroPTM() + "]]" + Propiedades.getInstancia().getPassTerceroPTM() + "]]" + client + "]]" + pass + "]]" + "1" + "]]"
                + txClient + "]]" + codigoGeneral + "]]" + contrato + "]]" + valor + "]]";
        try {
//            hashEncriptado = Encriptar(hashEncriptado, "w2p4s$EncrYptPr5tr$ck8$");
            hashEncriptado = Encriptar(hashEncriptado, Propiedades.getInstancia().getHashEncricionPTM());
        } catch (Exception ex) {
            Logs.error(ex);            
        }

        UsuarioWS usuario = new UsuarioWS();
        usuario.setClave(pass);
        usuario.setCodigo(client);
        usuario.setHash(hashEncriptado);
        usuario.setIdCliente(Propiedades.getInstancia().getTerceroPTM());
//        usuario.setPwdCliente("C1m31p$nG$#ptM$pr5");
        usuario.setPwdCliente(Propiedades.getInstancia().getPassTerceroPTM());
        usuario.setTerminal("1");
        usuario.setTipoUsuario(1);

        VentaWS venta = new VentaWS();
        venta.setContrato(contrato);

//        CamposProducto[] entrada = new CamposProducto[tblDatos.getRowCount() + datosOcultos.length];
        CamposProducto[] entrada = new CamposProducto[datosOcultos.length];

        int ser = 0;
        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            String cod = tblDatos.getValueAt(i, 8).toString();
            String val = null;

            if (tblDatos.getValueAt(i, 2).toString().equals("D")) {
                val = tblDatos.getValueAt(i, 7).toString();
            } else {
                val = tblDatos.getValueAt(i, 5).toString();
            }

            CamposProducto campos = new CamposProducto();
            campos.setCodigo(cod);
            campos.setValor(val);
            entrada[ser] = campos;
            ser++;
        }

        for (int i = 0; i < datosOcultos.length - tblDatos.getRowCount(); i++) {
            if (datosOcultos[i][0] != null) {
                CamposProducto campos = new CamposProducto();
                campos.setCodigo(datosOcultos[i][0].toString());
                campos.setValor(datosOcultos[i][1].toString());
                entrada[ser] = campos;
                ser++;
            }
        }

        venta.setDatosEntrada(entrada);
        venta.setProducto(codigoGeneral);
        venta.setTxCliente(txClient);
        venta.setValor(valor);

//        instancias.getSql().aumentarConsecutivo("TXCLIENTE", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("TXCLIENTE")[0]) + 1);

        RespuestaVentaWS respuestas = null;
        try {
            
            respuestas = servicioWeb.getService().confirmarVenta(usuario, venta);            
            
        } catch (RemoteException ex) {
            System.err.println("Respuesta Error servicio : "+ex.getMessage());
            Logger.getLogger(dlgFormularios.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        if (respuestas.getCodigoRespuesta().equals("0")) {
            String htmlConfirmacion = datosActuales[0][1].toString();

//            List<CamposProducto> campo = respuestas.getDatosSalida();
            CamposProducto[] campo = respuestas.getDatosSalida();
            htmlConfirmacion = htmlConfirmacion.replace("#LOGO#", "<img src=https://www.comercialcard.com.co/DistribuidoresTFCC/themes/images/boton_productos/" + codigoGeneral + ".png>");

            for (CamposProducto campo1 : campo) {
                Logs.log("Reemplazando campos del html");
                try {
                    htmlConfirmacion = htmlConfirmacion.replace("#" + campo1.getCodigo() + "#", campo1.getValor());
                } catch (Exception e) {
                    Logs.error(e);
                    Logs.log("Fallo al reemplazar");
                }
            }

            String tipo = "";
            if (instancias.getImpresion().equals("pos")) {
                tipo = "2";
            } else if (instancias.getImpresion().equals("facturaCompleta")) {
                tipo = "";
            } else {
                tipo = "1";
            }

            crearHtml(htmlConfirmacion);

            File paginaHTML = new File("Confirmacion.html");
            String urlDocumento = "file://localhost/" + paginaHTML.getAbsolutePath();
            ejecutarHtml ejecutar = new ejecutarHtml(null, true, urlDocumento);
            ejecutar.setSize(630, 710);
            ejecutar.setTitle("Servicio de confirmación...");
            ejecutar.setLocationRelativeTo(null);
            ejecutar.setVisible(true);

            if (instancias.isConfirmarServicio()) {
                consumirServicio();
            } else {
                limpiarTabla();
            }

        } else {
            metodos.msgAdvertencia(null, respuestas.getMensajeError());
        }
    }

    public void consumirServicio() {
        String client = "", pass = "";
       
        
        if (datos[110] != null) {
            client = datos[110].toString();
        }
        if (datos[111] != null) {
            pass = Utils.decrypt(datos[111].toString());
        }

        Boolean valorVen = false;
        int valor = 0;
        String contrato = "";
        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            if ("contratoVenta".equals(tblDatos.getValueAt(i, 8))) {
                contrato = tblDatos.getValueAt(i, 5).toString();
            }
            if ("valorVenta".equals(tblDatos.getValueAt(i, 8))) {
                valor = Integer.parseInt(tblDatos.getValueAt(i, 5).toString().replace(this.simbolo + " ", "").replace(".", ""));
                valorVen = true;
            }
        }

        if (valorVen) {
            if (valor < Integer.parseInt(big.setNumero(big.getMoneda(datosActuales[0][6].toString())).replace(".", ""))) {
                metodos.msgAdvertenciaAjustado(null, "El valor debe ser mayor a " + datosActuales[0][6].toString());
                return;
            }

            if (valor > Integer.parseInt(big.setNumero(big.getMoneda(datosActuales[0][5].toString())).replace(".", ""))) {
                metodos.msgAdvertenciaAjustado(null, "El valor debe ser menor a " + datosActuales[0][5].toString());
                return;
            }
        } else {
            valor = 1;
        }

        if (contrato.equals("")) {
            metodos.msgAdvertencia(null, "El # del contrato es obligatorio");
            return;
        }

        String hora = metodosGenerales.hora().replace(" ", "_");
        String txClient = instancias.getSql().getNumConsecutivo("TXCLIENTE")[0].toString() + "-" + hora + "-" + (int) (Math.random() * 100 + 1);
//        String hashEncriptado = Propiedades.getInstancia().getTerceroPTM() + "]]" + "C1m31p$nG$#ptM$pr5" + "]]" + client + "]]" + pass + "]]" + "1" + "]]"
//                + txClient + "]]" + codigoGeneral + "]]" + contrato + "]]" + valor + "]]";
        String hashEncriptado = Propiedades.getInstancia().getTerceroPTM() + "]]" + Propiedades.getInstancia().getPassTerceroPTM() + "]]" + client + "]]" + pass + "]]" + "1" + "]]"
                + txClient + "]]" + codigoGeneral + "]]" + contrato + "]]" + valor + "]]";

        try {
//            hashEncriptado = Encriptar(hashEncriptado, "w2p4s$EncrYptPr5tr$ck8$");
            hashEncriptado = Encriptar(hashEncriptado, Propiedades.getInstancia().getHashEncricionPTM());
        } catch (Exception ex) {
            Logs.error(ex);
        }
        
       
        UsuarioWS usuario = new UsuarioWS();
        usuario.setClave(pass);
        usuario.setCodigo(client);
        usuario.setHash(hashEncriptado);
        usuario.setIdCliente(Propiedades.getInstancia().getTerceroPTM());
//        usuario.setPwdCliente("C1m31p$nG$#ptM$pr5");
        usuario.setPwdCliente(Propiedades.getInstancia().getPassTerceroPTM());
        usuario.setTerminal("1");
        usuario.setTipoUsuario(1);

        VentaWS venta = new VentaWS();
        venta.setContrato(contrato);

        int ser = 0;
        CamposProducto[] entrada = new CamposProducto[datosOcultos.length + tblDatos.getRowCount()];
        for (int i = 0; i < datosOcultos.length; i++) {
            if (datosOcultos[i][0] != null) {
                CamposProducto campos = new CamposProducto();
                campos.setCodigo(datosOcultos[i][0].toString());
                campos.setValor(datosOcultos[i][1].toString());
                entrada[ser] = campos;
                ser++;
            }
        }

        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            String val = null;
            if (tblDatos.getValueAt(i, 2).toString().equals("D")) {
                val = tblDatos.getValueAt(i, 7).toString();
            } else {
                val = tblDatos.getValueAt(i, 5).toString();
            }

            CamposProducto campos = new CamposProducto();
            campos.setCodigo(tblDatos.getValueAt(i, 8).toString());
            campos.setValor(val);

            entrada[ser] = campos;
            ser++;
        }

        venta.setDatosEntrada(entrada);
        venta.setProducto(codigoGeneral);
        venta.setTxCliente(txClient);
        venta.setValor(valor);

//        instancias.getSql().aumentarConsecutivo("TXCLIENTE", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("TXCLIENTE")[0]) + 1);
        RespuestaVentaWS respuestas = null;
        try {
            respuestas = servicioWeb.getService().venta(usuario, venta);
        } catch (RemoteException ex) {
            Logger.getLogger(dlgFormularios.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (respuestas.getCodigoRespuesta().equals("0")) {
            try {
                String htmlRecivo = "";
                if (datosActuales[0][2] != null) {
                    if (!datosActuales[0][2].toString().equals("")) {
                        htmlRecivo = datosActuales[0][2].toString();
                        htmlRecivo = htmlRecivo.replace("#LOGO#", "<img src=https://www.comercialcard.com.co/DistribuidoresTFCC/themes/images/logos_productos/" + codigoGeneral + ".png>");
                    }
                }
                
            //            List<CamposProducto> campo = respuestas.getDatosSalida();
            CamposProducto[] campo = respuestas.getDatosSalida();

            for (CamposProducto campo1 : campo) {
                if (datosActuales[0][2] != null) {
                    if (!datosActuales[0][2].toString().equals("")) {
                        Logs.log("Reemplazando valores del html");
                        try {
                            htmlRecivo = htmlRecivo.replace("#" + campo1.getCodigo() + "#", campo1.getValor());
                        } catch (Exception e) {
                            Logs.error(e);
                            htmlRecivo = htmlRecivo.replace("#" + campo1.getCodigo() + "#", "");
                            Logs.log("Fallo al reemplazar");
                        }
                    }
                }
            }

            String factura = instancias.getFactura().facturarServicioPTM(datosActuales[0][3].toString(), respuestas.getValor(), respuestas.getContrato());
            instancias.getSql().agregarReciboPTM(htmlRecivo, factura);

            if (!htmlRecivo.equals("")) {
                String tipo = "";
                if (instancias.getImpresion().equals("pos")) {
                    tipo = "2";
                } else if (instancias.getImpresion().equals("facturaCompleta")) {
                    tipo = "";
                } else {
                    tipo = "1";
                }

                crearPdf(htmlRecivo);
                crearImg(tipo);
                instancias.getReporte().ver_Recibo(tipo);
            }

            limpiarTabla();
            this.dispose();
//            btnNuevoProducto.setText(datosActuales[0][16].toString());
            } catch (Exception ex) {
                 Logs.error(ex);
                 metodos.msgError(null, "Ocurrio un error : "+ex.getMessage());
            }
        } else {
            metodos.msgAdvertencia(null, respuestas.getMensajeError());
        }
    }

    public static void crearImg(String tipo) {
        try {
            String sourceDir = System.getProperty("user.dir") + "\\Impresion.pdf";
            String destinationDir = "";
            File sourceFile = new File(sourceDir);
            File destinationFile = new File(destinationDir);

            if (!destinationFile.exists()) {
                destinationFile.mkdir();
            }

            if (sourceFile.exists()) {
                PDDocument document = PDDocument.load(sourceDir);
                @SuppressWarnings("unchecked")
                List<PDPage> list = document.getDocumentCatalog().getAllPages();
                String fileName = sourceFile.getName().replace(".pdf", "");
                int pageNumber = 1;
                for (PDPage page : list) {
                    BufferedImage image = page.convertToImage();
                    File outputfile = new File(destinationDir + fileName + "_" + pageNumber + ".png");

                    if (tipo.equals("")) {
                        ImageIO.write(image, "png", outputfile);
                    } else {
                        ImageIO.write(image.getSubimage(image.getMinX(), image.getMinX(), 1150, 800), "png", outputfile);
                    }

                    pageNumber++;
                }
                document.close();
            } else {
                Logs.error(sourceFile.getName() + " File does not exist");
            }
        } catch (Exception e) {
            Logs.error(e);
            e.printStackTrace();
        }
    }

    private void limpiarTabla() {
        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            if (tblDatos.getValueAt(i, 2).toString().equals("D")) {
                tblDatos.setValueAt("Seleccionar...", i, 5);
            } else {
                tblDatos.setValueAt("", i, 5);
            }
            tblDatos.setValueAt("", i, 7);
        }
    }

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

        byte[] valorEncriptado = mac.doFinal(valor.getBytes());

        //Cadena con los digitos correspondientes en hexadecimal   
        String digitosHexadecimales = "0123456789abcdef";
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
            java.util.logging.Logger.getLogger(dlgFormularios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgFormularios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgFormularios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgFormularios.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgFormularios dialog = new dlgFormularios(new javax.swing.JFrame(), true, 0, null);
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
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.ButtonGroup filtro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCampo;
    // End of variables declaration//GEN-END:variables

//    private static RespuestaVentaWS venta(co.com.tecnofactor.ptfcc.modelo.ws.xsd.UsuarioWS usuarioWS, co.com.tecnofactor.ptfcc.modelo.ws.xsd.VentaWS ventaWS) {
//        co.com.ptm.pruebas.ptmws.services.serviciosptmws.ServiciosPTMWS service = new co.com.ptm.pruebas.ptmws.services.serviciosptmws.ServiciosPTMWS();
//        co.com.ptm.pruebas.ptmws.services.serviciosptmws.ServiciosPTMWSPortType port = service.getServiciosPTMWSHttpSoap12Endpoint();
//        return port.venta(usuarioWS, ventaWS);
//    }
//
//    private static RespuestaVentaWS confirmarVenta(co.com.tecnofactor.ptfcc.modelo.ws.xsd.UsuarioWS usuarioWS, co.com.tecnofactor.ptfcc.modelo.ws.xsd.VentaWS ventaWS) {
//        co.com.ptm.pruebas.ptmws.services.serviciosptmws.ServiciosPTMWS service = new co.com.ptm.pruebas.ptmws.services.serviciosptmws.ServiciosPTMWS();
//        co.com.ptm.pruebas.ptmws.services.serviciosptmws.ServiciosPTMWSPortType port = service.getServiciosPTMWSHttpSoap11Endpoint();
//        return port.confirmarVenta(usuarioWS, ventaWS);
//    }
}
