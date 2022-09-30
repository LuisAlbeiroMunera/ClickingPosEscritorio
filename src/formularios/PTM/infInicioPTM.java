package formularios.PTM;

import clases.Instancias;
import clases.PTM.Servicios;
import clases.PTM.PruebaPTM;
import clases.Utils;
import clases.big;
import clases.metodosGenerales;
import co.com.tecnofactor.ptfcc.modelo.dto.common.xsd.CamposProducto;
import co.com.tecnofactor.ptfcc.modelo.dto.common.xsd.LabelsProducto;
import co.com.tecnofactor.ptfcc.modelo.ws.xsd.ProductoWS;
import co.com.tecnofactor.ptfcc.modelo.ws.xsd.RespuestaProductosWS;
import co.com.tecnofactor.ptfcc.modelo.ws.xsd.UsuarioWS;
import configuracion.Propiedades;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import logs.Logs;

public class infInicioPTM extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    private Servicios mesas;
    metodosGenerales metodos;
    Instancias instancias;
    Object[] datos;
    DefaultTableModel modelo1;

    public infInicioPTM() {
        initComponents();
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        modelo1 = (DefaultTableModel) tblTabla1.getModel();
        metodos = new metodosGenerales();
        instancias = Instancias.getInstancias();
        cargarMaestra();
        cargarServicosPTM();
        jScrollPane2.setVisible(false);
    }

    @Override
    public void setSelected(boolean selected) {
        try {
            super.setSelected(selected); //To change body of generated methods, choose Tools | Templates.
        } catch (PropertyVetoException ex) {
            Logger.getLogger(infInicioPTM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla1 = new javax.swing.JTable();
        pnlServicios = new javax.swing.JPanel();

        setTitle("Factura");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblTabla1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Html Recivido", "Html Confirmacion", "Descripcion", "Verificacion", "Valor maximo", "Valor minimo", "Clase Validación", "Codigo", "Descripcion", "Obligatorio", "Orden", "Tipo", "Valor", "Valor Programado", "nombreBoton", "nuevoNombre"
            }
        ));
        tblTabla1.setRowHeight(27);
        tblTabla1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblTabla1);

        pnlServicios.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlServiciosLayout = new javax.swing.GroupLayout(pnlServicios);
        pnlServicios.setLayout(pnlServiciosLayout);
        pnlServiciosLayout.setHorizontalGroup(
            pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlServiciosLayout.setVerticalGroup(
            pnlServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addComponent(pnlServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarMaestra() {
        datos = instancias.getSql().getDatosMaestra();
    }

    public void cargarServicosPTM() {
        while (tblTabla1.getRowCount() > 0) {
            modelo1.removeRow(0);
        }

        Object[][] servicios = instancias.getSql().getServiciosPTM();
        if (servicios.length > 0) {
            String fechaSericio = servicios[0][2].toString();
            if (metodos.restarFecha(metodosGenerales.fecha(), metodos.fecha(fechaSericio)) == 0) {
                Object[][] resultados = instancias.getSql().getServiciosPTM1();
                for (int i = 0; i < resultados.length; i++) {
                    Object[] recortes = resultados[i][0].toString().split("XXXX ");

                    String dato14 = "";
                    try {
                        dato14 = recortes[14].toString();
                    } catch (Exception e) {
                    }

                    if (dato14.equals("null")) {
                        dato14 = "";
                    }

                    modelo1.addRow(new Object[]{recortes[0], recortes[1], recortes[2], recortes[3], recortes[4], recortes[5], recortes[6],
                        recortes[7], recortes[8], recortes[9], recortes[10], recortes[11], recortes[12], recortes[13], dato14, recortes[15], recortes[16]});
                }

                mesas = new Servicios(pnlServicios.getSize().width, pnlServicios.getSize().height, null, servicios);
                mesas.setVisible(true);
            } else {
                consumirServicioPTM();
            }
        } else {
            consumirServicioPTM();
        }

        pnlServicios.setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(mesas);
        scrollPane.getVerticalScrollBar().setUnitIncrement(50);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pnlServicios.add(scrollPane);
    }

    public void consumirServicioPTM() {
        UsuarioWS usuario = new UsuarioWS();

        String client = "", pass = "";
        if (datos[110] != null) {
            client = datos[110].toString();
        }
        if (datos[111] != null) {
            pass = Utils.decrypt(datos[111].toString());
        }

        String hashEncriptado = Propiedades.getInstancia().getTerceroPTM() + "]]" + Propiedades.getInstancia().getPassTerceroPTM() + "]]" + client + "]]" + "1" + "]]";
        try {
            hashEncriptado = Encriptar(hashEncriptado, Propiedades.getInstancia().getHashEncricionPTM());
        } catch (Exception ex) {
            Logs.error(ex);
            
        }

        usuario.setClave(pass);
        usuario.setCodigo(client);
        usuario.setHash(hashEncriptado);
        usuario.setIdCliente(Propiedades.getInstancia().getTerceroPTM());
        usuario.setPwdCliente(Propiedades.getInstancia().getPassTerceroPTM() );
        usuario.setTerminal("1");
        usuario.setTipoUsuario(1);

        PruebaPTM servicioWeb = new PruebaPTM();

        RespuestaProductosWS respuestas = null;

        try {
            Socket s = new Socket(Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            if (s.isConnected()) {
                respuestas = servicioWeb.getService().consultaProductos(usuario);
            }
        } catch (Exception e) {
            Logs.error(e);
            Logs.error("No hay conexión de internet y no se cargo los servicios PTM");
        }
  
        try {
            instancias.getSql().eliminarTodo("bdServiciosPTM");
            instancias.getSql().eliminarTodo("bdServiciosPTM1");

            for (ProductoWS var1 : respuestas.getListaProductos()) {
                
                try {
                    BufferedImage bufferedImage = null;
                    System.err.println("imagen: "+"https://www.comercialcard.com.co/DistribuidoresTFCC/themes/images/logos_productos/" + var1.getCodigo() + ".png");
                    InputStream logo = new URL("https://www.comercialcard.com.co/DistribuidoresTFCC/themes/images/logos_productos/" + var1.getCodigo() + ".png").openStream();
                    InputStream boton = new URL("https://www.comercialcard.com.co/DistribuidoresTFCC/themes/images/boton_productos/" + var1.getCodigo() + ".png").openStream();
                    BufferedImage imBuff;
                    imBuff = ImageIO.read(logo);
                    String idImagen = "LogosProductosPTM\\" + var1.getCodigo() + ".png";
                    metodos.guardarImagen(imBuff, idImagen);
                    
                    imBuff = ImageIO.read(boton);
                    String idImagenBoton = "BotonProductosPTM\\" + var1.getCodigo() + ".png";
                    metodos.guardarImagen(imBuff, idImagenBoton);
                } catch (Exception ex) {
                    Logs.error(ex);
                    metodos.msgError(this, "Hubo un error al cargar LA Imagen");
                    return;
                }
                instancias.getSql().agregarServicioPTM(var1.getCodigo(), var1.getNombre());
                LabelsProducto labels = var1.getLabels();

                for (CamposProducto var2 : var1.getCamposProducto()) {
                    modelo1.addRow(new Object[]{var1.getCodigo(), var1.getHtmlConfirmacion(), var1.getHtmlRecibo(),
                        var1.getNombre(), var1.getRequiereConfirmacion(), big.setMoneda(big.getBigDecimal(var1.getValorMaxVenta())),
                        big.setMoneda(big.getBigDecimal(var1.getValorMinVenta())), var2.getClaseValidacion(),
                        var2.getCodigo(), var2.getDescripcion(), var2.getObligatorio(), var2.getOrden(),
                        var2.getTipo(), var2.getValor(), var2.getValorProgramado(), labels.getDsVenta(),
                        labels.getDsNuevaVenta()});

                    String cadena = var1.getCodigo() + "XXXX " + var1.getHtmlConfirmacion() + "XXXX " + var1.getHtmlRecibo() + "XXXX "
                            + var1.getNombre() + "XXXX " + var1.getRequiereConfirmacion() + "XXXX "
                            + big.setMoneda(big.getBigDecimal(var1.getValorMaxVenta())) + "XXXX " + big.setMoneda(big.getBigDecimal(var1.getValorMinVenta()))
                            + "XXXX " + var2.getClaseValidacion() + "XXXX " + var2.getCodigo() + "XXXX " + var2.getDescripcion()
                            + "XXXX " + var2.getObligatorio() + "XXXX " + var2.getOrden() + "XXXX " + var2.getTipo() + "XXXX " + var2.getValor()
                            + "XXXX " + var2.getValorProgramado() + "XXXX " + labels.getDsVenta() + "XXXX " + labels.getDsNuevaVenta();
                    instancias.getSql().agregarServicioPTM(cadena);
                }
            }

            mesas = new Servicios(pnlServicios.getSize().width, pnlServicios.getSize().height, respuestas.getListaProductos(), null);
            mesas.setVisible(true);
        } catch (Exception e) {
            Logs.error(e);
            metodos.msgAdvertenciaAjustado(null, respuestas.getMensajeError());
            return;
        }
    }

    public Object[][] datosServicio(String cod) {

        int numeroCampos = 0;
        for (int i = 0; i < tblTabla1.getRowCount(); i++) {
            if (tblTabla1.getValueAt(i, 0) != null) {
                if (cod.equals(tblTabla1.getValueAt(i, 0).toString())) {
                    numeroCampos++;
                }
            }
        }

        Object[][] datos = new Object[numeroCampos][17];

        int ser = 0;
        for (int i = 0; i < tblTabla1.getRowCount(); i++) {
            if (tblTabla1.getValueAt(i, 0) != null) {
                if (cod.equals(tblTabla1.getValueAt(i, 0).toString())) {
                    datos[ser][0] = tblTabla1.getValueAt(i, 0);
                    datos[ser][1] = tblTabla1.getValueAt(i, 1);
                    datos[ser][2] = tblTabla1.getValueAt(i, 2);
                    datos[ser][3] = tblTabla1.getValueAt(i, 3);
                    datos[ser][4] = tblTabla1.getValueAt(i, 4);
                    datos[ser][5] = tblTabla1.getValueAt(i, 5);
                    datos[ser][6] = tblTabla1.getValueAt(i, 6);
                    datos[ser][7] = tblTabla1.getValueAt(i, 7);
                    datos[ser][8] = tblTabla1.getValueAt(i, 8);
                    datos[ser][9] = tblTabla1.getValueAt(i, 9);
                    datos[ser][10] = tblTabla1.getValueAt(i, 10);
                    datos[ser][11] = tblTabla1.getValueAt(i, 11);
                    datos[ser][12] = tblTabla1.getValueAt(i, 12);
                    datos[ser][13] = tblTabla1.getValueAt(i, 13);
                    datos[ser][14] = tblTabla1.getValueAt(i, 14);
                    datos[ser][15] = tblTabla1.getValueAt(i, 15);
                    datos[ser][16] = tblTabla1.getValueAt(i, 16);
                    ser++;
                }
            }
        }

        return datos;
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

//    private static RespuestaProductosWS consultaProductos(co.com.tecnofactor.ptfcc.modelo.ws.xsd.UsuarioWS usuarioWS) {
//        try {
//            co.com.tecnofactor.ptfcc.services.ServiciosPTMWS.ServiciosPTMWS service = new co.com.tecnofactor.ptfcc.services.ServiciosPTMWS.ServiciosPTMWS();
//            co.com.tecnofactor.ptfcc.services.ServiciosPTMWS.ServiciosPTMWSPortType port = service.getServiciosPTMWSHttpSoap11Endpoint();
//            return port.consultaProductos(usuarioWS);
//        } catch (Exception e) {
//            Logs.log("Sin internet");
//            return null;
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlServicios;
    private javax.swing.JTable tblTabla1;
    // End of variables declaration//GEN-END:variables

}
