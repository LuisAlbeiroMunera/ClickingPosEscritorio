package formularios;
import clases.Cliente;
import logs.Logs;
import clases.Iniciar2;
import clases.Instancias;
import clases.MySql_connection_scripts;
import clases.RespuestaServicioRest;
import clases.Utils;
import clases.jcThread;
import clases.metodosGenerales;
import com.google.gson.JsonObject;
import configuracion.Propiedades;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;

public class dlgNuevaEmpresa extends javax.swing.JFrame {
    jcThread barra2;
    private Instancias instancias;
    metodosGenerales metodos = new metodosGenerales();   
    private static final String PERIODICIDAD = "Mensual";
    private static final String SEPARADOR_HASH = "##";
    private static final String SEPARADOR = "/-/";
    
    
    public dlgNuevaEmpresa() {
        initComponents();
        this.setLocationRelativeTo(null);
        instancias = Instancias.getInstancias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nitEmpresa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nombreEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        celularEmpresa = new javax.swing.JTextField();
        ingresarNuevaEmpresa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TanFacil.Click");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 102)));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese los datos de la nueva empresa");
        jLabel3.setAlignmentY(0.0F);

        jLabel4.setText("Nit *:");

        nitEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitEmpresaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre*:");

        jLabel2.setText("Celular*:");

        ingresarNuevaEmpresa.setBackground(new java.awt.Color(255, 102, 0));
        ingresarNuevaEmpresa.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ingresarNuevaEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        ingresarNuevaEmpresa.setText("Ingresar Empresa");
        ingresarNuevaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarNuevaEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ingresarNuevaEmpresa)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(nitEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(celularEmpresa)
                                            .addComponent(nombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nitEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(celularEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresarNuevaEmpresa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void nitEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitEmpresaActionPerformed

    private void ingresarNuevaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarNuevaEmpresaActionPerformed
           
            if(nitEmpresa.getText().isEmpty()){
                metodos.msgError(null, "El nit de la empresa es obligatorio");
                nitEmpresa.requestFocus();
            }else if(nombreEmpresa.getText().isEmpty()){
                metodos.msgError(null, "El nombre de la empresa es obligatorio");
                nombreEmpresa.requestFocus();
            }else if(celularEmpresa.getText().isEmpty()){
                metodos.msgError(null, "El celular de la empresa es obligatorio");
                celularEmpresa.requestFocus();
            }else{
        
        
                Iniciar2 ini = new Iniciar2();
                esperandoRespuesta barra = new esperandoRespuesta(ini, Instancias.getInstancias(), "CARGANDO...");
                barra.show();
                barra2 = ini.getBarra();

                String base = instancias.getSql().getEmpresaPricipal("0");
                Logs.log("base = "+base);
                if (base.equals("")) {
                    Logs.log("Se creara la empresa base");
                    instancias.getSql().agregarMutiempresas("0", "PRINCIPAL", "bdclick");
                }

                int consecutivoMulti = Integer.parseInt(instancias.getSql().getNumConsecutivo("MULTI")[0].toString());
                reemplazar(consecutivoMulti);
                String rutaCompleta = System.getProperty("user.home") + "\\BD-Multiempresas.sql";

                File query = new File(rutaCompleta);
                executeQuery1(query);

                instancias.getSql().agregarMutiempresas(String.valueOf(consecutivoMulti), "", "bdclick" + consecutivoMulti);
//                instancias.getSql().aumentarConsecutivo("MULTI", Integer.parseInt((String) instancias.getSql().getNumConsecutivo("MULTI")[0]) + 1);
                //modelo.addRow(new Object[]{consecutivoMulti, "", "bdclick" + consecutivoMulti});

                String respuesta = agregarClienteMultiEmpresa(nitEmpresa.getText(), nombreEmpresa.getText(), celularEmpresa.getText());
                Logs.log("respuesta "+respuesta);
             
                try {
                    instancias.getSql().cambiarDescripcionEmpresa(""+consecutivoMulti, nombreEmpresa.getText());   
                } catch (Exception e) {
                    Logs.error(e);
                }
                
                try {
                    //se conecta temporalmente a la nueva base de datos
                    instancias.getSql().SQL1("bdclick" + consecutivoMulti, true);
                    instancias.getSql().modificarConfiguraciones(nitEmpresa.getText(), nombreEmpresa.getText());
                    String fechaCorte = metodos.sumarFecha(metodosGenerales.fecha(), 30);                 
                    fechaCorte = Utils.encriptar(fechaCorte);
                    instancias.getSql().agregarFechasBloqueo(fechaCorte);
                    
                } catch (Exception e) {
                    Logs.error(e);
                }
                    
                instancias.getSql().SQL1("bdclick", true);  
                this.dispose();
              
                
               
                barra2.detener(true);
                metodos.msgExito(null, "Empresa registrada con éxito");
            }
    }//GEN-LAST:event_ingresarNuevaEmpresaActionPerformed

     
    public String agregarClienteMultiEmpresa2(String nit, String nombreCliente, String celular) {
        //crear una nueva empresa
        
        String trama = "Multiempresa"+SEPARADOR+calcularCodigo(nit, nombreCliente)+SEPARADOR+nit+SEPARADOR+nombreCliente+SEPARADOR+PERIODICIDAD+SEPARADOR+celular;
        Logs.log("trama enviada  "+trama);
        String resultadoFinal = "";
        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(Propiedades.getInstancia().getUrlFuncionesLambdaAWS());
            StringEntity postingString = new StringEntity("\"" + trama + "\"");
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
    
    public String agregarClienteMultiEmpresa(String nit, String nombreCliente, String celular) {
       
        RespuestaServicioRest respuesta = null;
        JsonObject json = new JsonObject(); 
        json.addProperty("id",calcularCodigo(nit, nombreCliente));
        json.addProperty("nit",nit);
        json.addProperty("nombre",nombreCliente);
        json.addProperty("celular",celular);        
        json.addProperty("pais","Colombia");
        json.addProperty("tipoPago","mensual");
        json.addProperty("anterioridad",3);
        json.addProperty("plazo",3);
        json.addProperty("clientePTM",2);        
        respuesta = metodos.CrearMultiEmpresaRest(json,1);  
        return respuesta.getMensaje();
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
     
    
    public void reemplazar(int numero) {
        try {
//            final BufferedReader reader = new BufferedReader(new FileReader("C:\\Program Files (x86)\\ClickingPos\\Clicking Pos\\BD-Multiempresas.sql"));
//            final BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\BD-Multiempresas.sql"));
            final BufferedReader reader = new BufferedReader(new FileReader("C:\\ClickingPos\\BD-Multiempresas.sql"));

            String line = "", content = "";
            while ((line = reader.readLine()) != null) {
                content += line + "\r\n";
            }

            reader.close();
            String nuevo = "`bdclick" + numero + "`";
            String viejo = "`bdclick`";

            String newContent = content.replace(viejo, nuevo);
            FileWriter writer = new FileWriter(System.getProperty("user.home") + "\\BD-Multiempresas.sql");
            writer.write(newContent);
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean executeQuery1(File rutaArchivo) {
        boolean ok = false;

        MySql_connection_scripts mysql = MySql_connection_scripts.getMySql_connection();

        String archivo = "";
        try {
            archivo = FileUtils.readFileToString(rutaArchivo);
        } catch (IOException ex) {
            Logger.getLogger(infMaestra.class.getName()).log(Level.SEVERE, null, ex);
        }

        String query[] = archivo.split(";");

        for (int i = 0; i < query.length; i++) {
            try {
                if (query[i].length() > 2) {
                    PreparedStatement pstm = mysql.getConnection().prepareStatement(query[i]);
                    pstm.execute();
                    pstm.close();
                    ok = true;
                }
            } catch (SQLException e) {
                Logs.error(e);
            }
        }

        return ok;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField celularEmpresa;
    private javax.swing.JButton ingresarNuevaEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nitEmpresa;
    private javax.swing.JTextField nombreEmpresa;
    // End of variables declaration//GEN-END:variables
}
