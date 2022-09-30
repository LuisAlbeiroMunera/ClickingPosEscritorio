package formularios;
import logs.Logs;
import clases.Iniciar2;
import clases.Instancias;
import clases.metodosGenerales;
import com.google.gson.Gson;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;
import configuracion.Propiedades;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import org.apache.commons.io.FileUtils;

public class dlgActualizacionPendiente extends javax.swing.JFrame {

    private Instancias instancias;
    metodosGenerales metodos;
    String versionInstalar = "";
    Iniciar2 ini;
    cargando barra;
    Inicio insInicio; 
    List<Integer> listaVersiones;
   
    public dlgActualizacionPendiente(){
       initComponents();
       this.setLocationRelativeTo(null); 
       instancias = Instancias.getInstancias();
        System.err.println(" "+instancias.getSql().getCantProsponer());
       metodos = new metodosGenerales();
//       File fichero = new File("actualizacion");
//       deleteFolder(fichero);
    }
    
    public dlgActualizacionPendiente(String versionNueva, String versionActual, Inicio insInicio, List<Integer> listaVersiones) {
        this.insInicio = insInicio;
        this.listaVersiones = listaVersiones;
        initComponents();
        this.setLocationRelativeTo(null);
        ini = new Iniciar2();
        instancias = Instancias.getInstancias();
        metodos = new metodosGenerales();
        barra = new cargando(ini, instancias);
        lbVersionActual.setText("Versión del sistema: " + versionActual);
        lbNuevaInstalacion.setText("Versión a instalar: " + versionNueva);
        versionInstalar = versionNueva;

        btnProsponer.setText("POSPONER (" + instancias.getSql().getCantProsponer() + ")");

        File fichero = new File("actualizacion");
        deleteFolder(fichero);

        if (instancias.getSql().getCantProsponer().equals("0")) {
            btnProsponer.setEnabled(false);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbVersionActual = new javax.swing.JLabel();
        lbNuevaInstalacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnProsponer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbVersionActual1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TanFacil.Click");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizacion.png"))); // NOI18N

        lbVersionActual.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbVersionActual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbVersionActual.setText("Versión del sistema: 2.0.0");

        lbNuevaInstalacion.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lbNuevaInstalacion.setText("Versión a instalar: 2.0.0");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnGuardar.setText("ACTUALIZAR AHORA");
        btnGuardar.setToolTipText("Ctrl+G");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.setMargin(new java.awt.Insets(2, 14, 2, 5));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnGuardarKeyReleased(evt);
            }
        });

        btnProsponer.setBackground(new java.awt.Color(241, 148, 138));
        btnProsponer.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnProsponer.setText("POSPONER (3)");
        btnProsponer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProsponer.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnProsponer.setMargin(new java.awt.Insets(2, 7, 2, 5));
        btnProsponer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsponerActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Solo se podrá posponer 3 veces.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProsponer, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProsponer, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnGuardar.getAccessibleContext().setAccessibleDescription("");

        lbVersionActual1.setFont(new java.awt.Font("Corbel Light", 1, 30)); // NOI18N
        lbVersionActual1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersionActual1.setText("¡ NUEVA ACTUALIZACIÓN !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbVersionActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNuevaInstalacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbVersionActual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbVersionActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbVersionActual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNuevaInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void presionarAutoGuardar(){
      btnGuardarActionPerformed(null);
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
           backupBaseDatos();
           
           File directorio = new File("actualizacion");
           directorio.mkdir();
           //if(listaVersiones.size() > 1){
               int i=0;
               for (Integer version : listaVersiones) {
                   i ++;
                   if(i==listaVersiones.size()){      
                       consultarArchivosConciliarMultiple("actualizacion", version, true);
                   }else{
                       consultarArchivosConciliarMultiple("actualizacion", version, false);
                   }
               }
               
           //}else{
               //consultarArchivosConciliar("actualizacion");
           //}
           
           this.dispose();
        } catch (Exception e) {
            Logs.error(e);
            metodos.msgError(null, "Ocurrio un error haciendo el respaldo de la base de datos");
        }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

     
    private void backupBaseDatos(){
        int num = Integer.parseInt(instancias.getSql().getNumConsecutivoActual("MULTI")[0].toString());
        if (num > 1) {
            generarCopiaSeguridad(true);
        } else {
            generarCopiaSeguridad(false);
        }
    }  
    
    public void generarCopiaSeguridad(Boolean multi) {
   
        String formatoFecha="dd_MM_yyyy";  
        SimpleDateFormat sdf = metodos.generarFecha(formatoFecha);            
        sdf.applyPattern("dd_MM_yyyy|hh_mm_ss");
        Gson gson = new Gson();
       
      try{              
        barra.show();
        
        String urlCompleto = "\"" + System.getProperty("user.dir") + "\\mariadb\\bin\"";

        int cantidad = 0;
        String baseUtilizada = "";
        if (multi) {
            cantidad = Integer.parseInt(instancias.getSql().getNumConsecutivoActual("MULTI")[0].toString());
        } else {
            cantidad = 1;
            baseUtilizada = instancias.getSql().getBaseDatos();
        }
        
        String rutaDestino = "";
        String destino = System.getProperty("user.home") + "\\Desktop";
        JFileChooser chooser;

        if(!new File(destino).exists()){
            chooser = new JFileChooser(); 
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Seleccione el destino para guardar la copia de seguridad");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            //
            // disable the "All files" option.
            //
            chooser.setAcceptAllFileFilterUsed(false); 
             if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
                destino = chooser.getSelectedFile().getPath();
                System.out.println("destino : "  +  destino);
                Properties properties = new Properties();
                properties = metodos.readFile();
                properties.setProperty("backup","0");
                properties.setProperty("backupProceso","0");
                properties.setProperty("backupFechaInicio",sdf.format(Calendar.getInstance().getTime()));
                properties.setProperty("backupNumeroEmpresas",cantidad+"");
                properties.setProperty("backupFechaFin",sdf.format(Calendar.getInstance().getTime()));//fechaFin backup
                gson = new Gson();
                String json = gson.toJson(properties);
                metodos.writeFile(json);
                
                
             }else {
                System.out.println("No Selection ");
                Properties properties = new Properties();
                properties = metodos.readFile();
                properties.setProperty("backup","0");
                properties.setProperty("backupProceso","2");
                properties.setProperty("backupFechaInicio",sdf.format(Calendar.getInstance().getTime()));
                properties.setProperty("backupNumeroEmpresas",cantidad+"");
                properties.setProperty("backupFechaFin",sdf.format(Calendar.getInstance().getTime()));//fechaFin backup
                gson = new Gson();
                String json = gson.toJson(properties);
                metodos.writeFile(json);
                metodos.msgAdvertenciaAjustado(null, "la copia de seguridad no se realizó.");
                return;
             }
        }

       

        for (int i = 0; i < cantidad; i++) {
            if (cantidad > 1) {
                if (i == 0) {
                    baseUtilizada = "bdclick";
                } else {
                    baseUtilizada = "bdclick" + i;
                }
            }
            rutaDestino = "\"" +destino+ "\\Copia_Seguridad_" + baseUtilizada + "\"";
            
            String sentencia = "cmd /C " + urlCompleto + "\\" + "mysqldump.exe\" -u "+Propiedades.getInstancia().getUsuarioDB()+" --password="+Propiedades.getInstancia().getPasswordDB()+" " + baseUtilizada + " > " + rutaDestino;

            try {
                
                
                Runtime rt = Runtime.getRuntime();
                Process p = rt.exec(new String[]{"cmd", "/C " + sentencia});
                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = null;
                while ((line = in.readLine()) != null) {
                    Logs.log(line);
                }
            } catch (IOException e) {
                Logs.error(e);
            }
        }

       } catch (Exception e) {
          Logs.error(e);
       }
        
    }

    
    private void btnGuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyReleased

    }//GEN-LAST:event_btnGuardarKeyReleased

    private void btnProsponerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsponerActionPerformed
        int cant = Integer.parseInt(instancias.getSql().getCantProsponer());
        cant = cant - 1;
        instancias.getSql().modificarCantProsponer(cant);
        this.insInicio.iniciarAplicacion("");
        System.err.println("iniciarAplicacion 5");
        this.dispose();  
        
    }//GEN-LAST:event_btnProsponerActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void deleteFolder(File fileDel) {
        if (fileDel.isDirectory()) {

            if (fileDel.list().length == 0) {
                fileDel.delete();
            } else {
                for (String temp : fileDel.list()) {
                    File fileDelete = new File(fileDel, temp);
                    //recursive delete
                    deleteFolder(fileDelete);
                }

                //check the directory again, if empty then delete it
                if (fileDel.list().length == 0) {
                    fileDel.delete();
                }
            }
        } else {
            //if file, then delete it
            fileDel.delete();
        }
    }

    @SuppressWarnings("unchecked")
    public void consultarArchivosConciliar(String pathFile) {
        List<String> retornoZip = new ArrayList<String>();
        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(Propiedades.getInstancia().getUsuarioSFTP(), Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            UserInfo ui = new SUserInfo(Propiedades.getInstancia().getPasswordSFTP(), null);
            session.setUserInfo(ui);
            session.setPassword(Propiedades.getInstancia().getPasswordSFTP());
            session.setTimeout(120000);
            session.connect();

            ChannelSftp sftp = (ChannelSftp) session.openChannel("sftp");
            sftp.connect();

            Vector<ChannelSftp.LsEntry> remoteFiles = sftp.ls(Propiedades.getInstancia().getDirSFTP() + versionInstalar);

            for (int i = 0; i < remoteFiles.size(); i++) {
                String remoteFile = remoteFiles.get(i).getFilename();
                if (remoteFile.startsWith(".")) {
                    continue;
                }
                retornoZip.add(remoteFile);
            }

            sftp.cd(Propiedades.getInstancia().getDirSFTP()+ versionInstalar);
            sftp.lcd(pathFile);
            instancias.getSql().SQL1("bdClick", true);
            int multiempresas = 1;
            try {
                multiempresas = Integer.parseInt(instancias.getSql().getNumConsecutivoActual("MULTI")[0].toString());
            } catch (Exception e) {
                Logs.error(e);
            }
           
            for (String saveFile : retornoZip) {
                try {
                    sftp.get(saveFile, saveFile);
                    if (saveFile.contains(".jar")) {
                        try {
                             moverArchivos(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir") + "\\lib\\" + saveFile);
                        } catch (Exception e) {
                            Logs.error(e);
                        }
                       
                    } else if (saveFile.contains(".sql")) {

                        if (saveFile.equals("BD-Multiempresas.sql")) {
                            try {
                                moverArchivos(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir") + "\\" + saveFile);
                            } catch (Exception e) {
                                Logs.error(e);
                            }
                        } else {
                            try {
                                String rutaCompleta = System.getProperty("user.dir") + "\\actualizacion\\" + saveFile;
                                File query = new File(rutaCompleta);
                                for (int i = 0;i< multiempresas; i++) {
                                    String base = "";
                                    if (i == 0) {
                                        base = "bdClick";
                                    } else {
                                        base = "bdClick" + i;
                                    }
                                    try {
                                        executeQuery1(query, base);
                                    } catch (Exception e) {
                                        Logs.error(e);
                                    } 
                                }
                            } catch (Exception e) {
                                Logs.error(e);
                            }
                        }

                    } else if (saveFile.contains(".zip")) {
                        
                        try {
                            Descomprimir(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir"));
                        } catch (Exception e) {
                            Logs.error(e);
                        }
                    } else if (saveFile.contains(".cmd")) {                                                                    
                            String rutaCompleta = System.getProperty("user.dir") + "\\actualizacion\\" + saveFile;                                
                            String archivo = "";
                            try {
                                archivo = FileUtils.readFileToString(new File(rutaCompleta));
                            } catch (IOException ex) {
                                Logger.getLogger(infMaestra.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            String query[] = archivo.split(";");
                            Logs.log("CMD size "+query.length);
                            for (int i = 0; i < query.length; i++) {
                               
                                Logs.log("CMD a ejecutar "+query[i]);
                                if (query[i].length() > 2) {

                                     try {
                                        String sentencia = "cmd /C " +query[i];
                                        Runtime rt = Runtime.getRuntime();
                                        Process p = rt.exec(sentencia);
                                        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                                        String line = null;
                                        while ((line = in.readLine()) != null) {
                                            Logs.log(line);
                                        }
                                    } catch (IOException e) {
                                        Logs.error(e);
                                    }

                                }
                             
                            }                                                
                    } else {
                        try {
                             moverArchivos(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir") + "\\" + saveFile);
                        } catch (Exception e) {
                            Logs.error(e);
                        }
                       
                    }
                } catch (Exception e) {
                    Logs.error(e);
                }
            }

            sftp.exit();
            sftp.disconnect();
            session.disconnect();

            Logs.log("Se actualiza todas las bases de datos de multiempresas");
            for (int i = 0;i< multiempresas; i++) {
                String base = "";
                if (i == 0) {
                    base = "bdClick";
                } else {
                    base = "bdClick" + i;
                }
                
                try {
                     Logs.log("Se actualiza la version en la base de datos "+base);
                    instancias.getSql().SQL1(base, true);
                    instancias.getSql().modificarVersion(versionInstalar);
                    instancias.getSql().modificarCantProsponer(3);
                } catch (Exception e) {
                    Logs.error(e);
                } 
            }
            barra.dispose();
//            metodos.msgExito(null, "Actualización finalizada con exito");
            //se lanza de nuevo el programa
            String file = "\"" + System.getProperty("user.dir") + "\\jre8\\bin\\javaw.exe\" -Xms1024m -jar \"" + System.getProperty("user.dir") + "\\ClickingPos.dat\"";
            try {
                Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + file);
            } catch (IOException e) {
                System.out.println("Error lansando app "+ e.getMessage());
                Logs.error(e);
            }
           
            //se cierra la actualización   
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Error actualizando "+ e.getMessage());
            Logs.error(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    public void consultarArchivosConciliarMultiple(String pathFile, Integer versionInt, boolean isUltimo) {
        barra.cambiarTexto("Download...");
       
        Properties properties = new Properties();
        properties = metodos.readFile();
        properties.setProperty("descarga","1");
        properties.setProperty("descargaProceso","1");
        SimpleDateFormat sdfin = new SimpleDateFormat();
        sdfin = metodos.generarFecha("dd_MM_yyyy|hh_mm_ss");//fechaFin backup
        properties.setProperty("descargaFechaInicio",sdfin.format(Calendar.getInstance().getTime()));//fechaFin backup
        Gson gson = new Gson();
        String json = gson.toJson(properties);
        metodos.writeFile(json);
        
        List<String> retornoZip = new ArrayList<String>();
        try {
          
            String actualizacionPendiente = versionInt.toString();
            String version = "";
            for(int j=0; j<actualizacionPendiente.length();j++ )  {

                 if(j == 0){
                     version = ""+actualizacionPendiente.charAt(j);
                 }else{
                     version = version+"."+actualizacionPendiente.charAt(j);  
                 }
            }

            JSch jsch = new JSch();
            Session session = jsch.getSession(Propiedades.getInstancia().getUsuarioSFTP(), Propiedades.getInstancia().getHostSFTP(), Propiedades.getInstancia().getPuertoSFTP());
            UserInfo ui = new SUserInfo(Propiedades.getInstancia().getPasswordSFTP(), null);
            session.setUserInfo(ui);
            session.setPassword(Propiedades.getInstancia().getPasswordSFTP());
            session.setTimeout(120000);
            session.connect();

            ChannelSftp sftp = (ChannelSftp) session.openChannel("sftp");
            sftp.connect();

            Vector<ChannelSftp.LsEntry> remoteFiles = sftp.ls(Propiedades.getInstancia().getDirSFTP() + version);

            for (int i = 0; i < remoteFiles.size(); i++) {
                String remoteFile = remoteFiles.get(i).getFilename();
                if (remoteFile.startsWith(".") || (remoteFile.endsWith(".zip") && !isUltimo)) {
                    continue;
                }
                retornoZip.add(remoteFile);
            }

            sftp.cd(Propiedades.getInstancia().getDirSFTP()+ version);
            sftp.lcd(pathFile);
            instancias.getSql().SQL1("bdClick", true);
            int multiempresas = 1;
            try {
                multiempresas = Integer.parseInt(instancias.getSql().getNumConsecutivoActual("MULTI")[0].toString());
            } catch (Exception e) {
                Logs.error(e);
            }
           
            for (String saveFile : retornoZip) {
                try {
                    sftp.get(saveFile, saveFile);
                    if (saveFile.contains(".jar")) {
                        try {
                             moverArchivos(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir") + "\\lib\\" + saveFile);
                        } catch (Exception e) {
                            Logs.error(e);
                        }
                       
                    } else if (saveFile.contains(".sql")) {

                        if (saveFile.equals("BD-Multiempresas.sql")) {
                            try {
                                moverArchivos(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir") + "\\" + saveFile);
                            } catch (Exception e) {
                                Logs.error(e);
                            }
                        } else {
                            try {
                                String rutaCompleta = System.getProperty("user.dir") + "\\actualizacion\\" + saveFile;
                                File query = new File(rutaCompleta);
                                for (int i = 0;i< multiempresas; i++) {
                                    String base = "";
                                    if (i == 0) {
                                        base = "bdClick";
                                    } else {
                                        base = "bdClick" + i;
                                    }
                                    try {
                                        executeQuery1(query, base);
                                    } catch (Exception e) {
                                        Logs.error(e);
                                    } 
                                }
                            } catch (Exception e) {
                                Logs.error(e);
                            }
                        }

                    } else if (saveFile.contains(".zip")) {
                        if(isUltimo){
                            try {
                                Descomprimir(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir"));
                            } catch (Exception e) {
                                Logs.error(e);
                            }
                        }
                    } else if (saveFile.contains(".cmd")) {                                                                    
                            String rutaCompleta = System.getProperty("user.dir") + "\\actualizacion\\" + saveFile;                                
                            String archivo = "";
                            try {
                                archivo = FileUtils.readFileToString(new File(rutaCompleta));
                            } catch (IOException ex) {
                                Logger.getLogger(infMaestra.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            String query[] = archivo.split(";");
                            Logs.log("CMD size "+query.length);
                            for (int i = 0; i < query.length; i++) {
                               
                                Logs.log("CMD a ejecutar "+query[i]);
                                if (query[i].length() > 2) {

                                     try {
                                        String sentencia = "cmd /C " +query[i];
                                        Runtime rt = Runtime.getRuntime();
                                        Process p = rt.exec(sentencia);
                                        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                                        String line = null;
                                        while ((line = in.readLine()) != null) {
                                            Logs.log(line);
                                        }
                                    } catch (IOException e) {
                                        Logs.error(e);
                                    }

                                }
                             
                            }                                                
                    } else {
                        try {
                             moverArchivos(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir") + "\\" + saveFile);
                        } catch (Exception e) {
                            Logs.error(e);
                        }
                       
                    }
                } catch (Exception e) {
                    Logs.error(e);
                }
            }

            sftp.exit();
            sftp.disconnect();
            session.disconnect();

            if(isUltimo){
                
                Logs.log("Se actualiza todas las bases de datos de multiempresas");
                for (int i = 0;i< multiempresas; i++) {
                    String base = "";
                    if (i == 0) {
                        base = "bdClick";
                    } else {
                        base = "bdClick" + i;
                    }

                    try {
                         Logs.log("Se actualiza la version en la base de datos "+base);
                        instancias.getSql().SQL1(base, true);
                        instancias.getSql().modificarVersion(version);
                        instancias.getSql().modificarCantProsponer(3);
                    } catch (Exception e) {
                        Logs.error(e);
                    } 
                }

                barra.dispose();
                //se lanza de nuevo el programa
                String file = "\"" + System.getProperty("user.dir") + "\\jre8\\bin\\javaw.exe\" -Xms1024m -jar \"" + System.getProperty("user.dir") + "\\ClickingPos.dat\"";
                try {
                    Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + file);
                } catch (IOException e) {
                    System.out.println("Error lansando app "+ e.getMessage());
                    Logs.error(e);
                }
                 
                properties.setProperty("descargaProceso","0");
                properties.setProperty("descargaError","");
                properties.setProperty("descargaNumeroArchivo","");
                properties.setProperty("descargaVersion",version);//version para Descarga
                sdfin = new SimpleDateFormat();
                sdfin = metodos.generarFecha("dd_MM_yyyy|hh_mm_ss");//fechaFin backup
                properties.setProperty("descargaFechaFin",sdfin.format(Calendar.getInstance().getTime()));//fechaFin backup
                gson = new Gson();
                json = gson.toJson(properties);
                metodos.writeFile(json);
                //se cierra la actualización   
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("Error actualizando "+ e.getMessage());
            properties = new Properties();
            properties = metodos.readFile();
            properties.setProperty("descargaProceso","2");
            properties.setProperty("descargaError",e.getMessage());
            sdfin = new SimpleDateFormat();
            sdfin = metodos.generarFecha("dd_MM_yyyy|hh_mm_ss");//fechaFin backup
            properties.setProperty("descargaFechaFin",sdfin.format(Calendar.getInstance().getTime()));//fechaFin backup
            gson = new Gson();
            json = gson.toJson(properties);
            metodos.writeFile(json);
            Logs.error(e);
            barra.dispose();
        }
    }
    
    public void ActualizarVersion(String version){
       
        copiarArchivo(System.getProperty("user.dir") + "\\actualizacionSegundoPlano\\" , System.getProperty("user.dir") + "\\actualizacion\\");
        String sDirectorio = System.getProperty("user.dir") + "\\actualizacionSegundoPlano\\";
        File f = new File(sDirectorio);

        if (f.delete())
         System.out.println("El fichero " + sDirectorio + " ha sido borrado correctamente");
        else
         System.out.println("El fichero " + sDirectorio + " no se ha podido borrar");
        
        File folder = new File(System.getProperty("user.dir") + "\\actualizacion\\");
        List<String> retornoZip = findAllFilesInFolder(folder);
        
        instancias.getSql().SQL1("bdClick", true);
        int multiempresas = 1;
        try {
            multiempresas = Integer.parseInt(instancias.getSql().getNumConsecutivoActual("MULTI")[0].toString());
        } catch (Exception e) {
            Logs.error(e);
        }
        
        String nombreZip=""; 
        
        for (String saveFile : retornoZip) {
                try {
//                    sftp.get(saveFile, saveFile);
                    if (saveFile.contains(".jar")) {
                        try {
                             if(saveFile.contains("clickSegundoPlano")){
                              moverArchivos(System.getProperty("user.dir") + "\\" + saveFile, System.getProperty("user.dir") + "\\lib\\" + saveFile);
                             }else{
                              moverArchivos(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir") + "\\lib\\" + saveFile);
                             }
                        } catch (Exception e) {
                            Logs.error("Error al mover archivo");
                            Logs.error(e);
                        }
                       
                    } else if (saveFile.contains(".sql")) {

                        if (saveFile.equals("BD-Multiempresas.sql")) {
                            try {
                                moverArchivos(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir") + "\\" + saveFile);
                            } catch (Exception e) {
                                Logs.error("Error al mover archivo");
                                Logs.error(e);
                            }
                        } else {
                            try {
                                String rutaCompleta = System.getProperty("user.dir") + "\\actualizacion\\" + saveFile;
                                File query = new File(rutaCompleta);
                                for (int i = 0;i< multiempresas; i++) {
                                    String base = "";
                                    if (i == 0) {
                                        base = "bdClick";
                                    } else {
                                        base = "bdClick" + i;
                                    }
                                    try {
                                        executeQuery1(query, base);
                                    } catch (Exception e) {
                                        Logs.error("Error al ejecutar Query 1");
                                        Logs.error(e);
                                        continue;
                                    } 
                                }
                            } catch (Exception e) {
                                Logs.error(e);
                                Logs.error("Error al ejecutar Query 2");
                            }
                        }

                    } else if (saveFile.contains(".zip")) {
//                        if(isUltimo){
                         nombreZip=saveFile;
//                            try {
//                                Descomprimir(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir"));
//                            } catch (Exception e) {
//                                Logs.error(e);
//                            }
//                        }
                    } else if (saveFile.contains(".cmd")) {                                                                    
                            String rutaCompleta = System.getProperty("user.dir") + "\\actualizacion\\" + saveFile;                                
                            String archivo = "";
                            try {
                                archivo = FileUtils.readFileToString(new File(rutaCompleta));
                            } catch (IOException ex) {
                                Logs.error("Error al crear archivo");
                                Logger.getLogger(infMaestra.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            String query[] = archivo.split(";");
                            Logs.log("CMD size "+query.length);
                            for (int i = 0; i < query.length; i++) {
                               
                                Logs.log("CMD a ejecutar "+query[i]);
                                if (query[i].length() > 2) {

                                     try {
                                        String sentencia = "cmd /C " +query[i];
                                        Runtime rt = Runtime.getRuntime();
                                        Process p = rt.exec(sentencia);
                                        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                                        String line = null;
                                        while ((line = in.readLine()) != null) {
                                            Logs.log(line);
                                        }
                                    } catch (IOException e) {
                                        Logs.error("Error al ejecutar cmd ");
                                        Logs.error(e);
                                        continue;
                                    }

                                }
                             
                            }                                                
                    } else {
                        try {
                             moverArchivos(System.getProperty("user.dir") + "\\actualizacion\\" + saveFile, System.getProperty("user.dir") + "\\" + saveFile);
                        } catch (Exception e) {
                            Logs.error("Error al mover archivo");
                            Logs.error(e);
                        }
                       
                    }
                } catch (Exception e) {
                    Logs.error("Error al ejecutar Query 3");
                    Logs.error(e);
                }
            }
            
        //descomprimo ZIP
        if (!nombreZip.equals("")) {
            try {
                System.err.println("mueve a actualizacion "+nombreZip);
                Descomprimir(System.getProperty("user.dir") + "\\actualizacion\\" + nombreZip, System.getProperty("user.dir"));
            } catch (Exception e) {
                Logs.error("Error al Descomprimir Y mover a actualizacion"+nombreZip);
                Logs.error(e);
            }
        }else{
                  Logs.error("No encontro ZIP");
        }
        
           for (int i = 0; i < multiempresas; i++) {
            String base = "";
            if (i == 0) {
                base = "bdClick";
            } else {
                base = "bdClick" + i;
            }
               try{  
                Properties properties = new Properties();
                properties = metodos.readFile();
                properties.setProperty("versionActualizada",version);
                Gson gson = new Gson();
                String json = gson.toJson(properties);
                metodos.writeFile(json);
               }catch(Exception ex){
                 Logs.error("Error al escribir en .json");
               }
            try {
                
                Logs.log("Se actualiza la version en la base de datos " + base);
                Logs.log("---->> VERSION: " + version);
                instancias.getSql().SQL1(base, true);
                instancias.getSql().modificarVersion(version);
                instancias.getSql().modificarCantProsponer(3);
                
            } catch (Exception e) {
                Logs.error("Error al actualizar version");
                Logs.error(e);
                continue;
            }
        }
        instancias.getSql().SQL1("bdClick", true);
    }
 
    public static List<String> findAllFilesInFolder(File folder) {
         List<String> retornoZip = new ArrayList<String>();
        for (File file : folder.listFiles()) {
            if (!file.isDirectory()) {
                if (file.getName().startsWith(".")) { //|| (file.getName().endsWith(".zip"))
                    continue;
                }
                retornoZip.add(file.getName());
                System.out.println(file.getName());
            } else {
                findAllFilesInFolder(file);
            }
        }
        return retornoZip;
    }

    public void copiarArchivo(String origenArchivo, String destinoArchivo) {
            try {
                Path origenPath = Paths.get(origenArchivo);
                Path destinoPath = Paths.get(destinoArchivo);
                //sobreescribir el fichero de destino si existe y lo copia
                Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception ex) {
                Logs.error(ex);
            }
    }
    
    public void Descomprimir(String ficheroZip, String directorioSalida) throws Exception {

        final int TAM_BUFFER = 4096;
        byte[] buffer = new byte[TAM_BUFFER];

        ZipInputStream flujo = null;

        try {
            flujo = new ZipInputStream(new BufferedInputStream(new FileInputStream(ficheroZip)));
            ZipEntry entrada;
            while ((entrada = flujo.getNextEntry()) != null) {
                String nombreSalida = directorioSalida + File.separator + entrada.getName();
                if (entrada.isDirectory()) {
                    File directorio = new File(nombreSalida);
                    directorio.mkdir();
                } else {
                    BufferedOutputStream salida = null;
                    try {
                        int leido;
                        salida = new BufferedOutputStream(new FileOutputStream(nombreSalida), TAM_BUFFER);
                        while ((leido = flujo.read(buffer, 0, TAM_BUFFER)) != -1) {
                            salida.write(buffer, 0, leido);
                        }
                    } finally {
                        if (salida != null) {
                            salida.close();
                        }
                    }
                }
            }
        } finally {
            if (flujo != null) {
                flujo.close();
            }

        }
    }

    public void moverArchivos(String origen, String destino) throws IOException {
        Path FROM = Paths.get(origen);
        Path TO = Paths.get(destino);
        //sobreescribir el fichero de destino, si existe, y copiar
        // los atributos, incluyendo los permisos rwx
        CopyOption[] options = new CopyOption[]{
            StandardCopyOption.REPLACE_EXISTING,
            StandardCopyOption.COPY_ATTRIBUTES
        };
        Files.copy(FROM, TO, options);
    }

    private boolean executeQuery1(File rutaArchivo, String base) {
        boolean ok = false;

        instancias.getSql().SQL1(base, true);

        String archivo = "";
        try {
            archivo = FileUtils.readFileToString(rutaArchivo);
        } catch (IOException ex) {
            Logger.getLogger(infMaestra.class.getName()).log(Level.SEVERE, null, ex);
        }

        String query[] = archivo.split(";");
//        Logs.log("query size "+query.length);
        for (int i = 0; i < query.length; i++) {
            try {
//                Logs.log("query a ejecutar "+query[i]);
                if (query[i].length() > 2) {
                    PreparedStatement pstm = instancias.getSql().getMysql().getConnection().prepareStatement(query[i]);
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

    class SUserInfo implements UserInfo {

        private String password;
        private String passPhrase;

        public SUserInfo(String password, String passPhrase) {
            this.password = password;
            this.passPhrase = passPhrase;
        }

        public String getPassphrase() {
            return passPhrase;
        }

        public String getPassword() {
            return password;
        }

        public boolean promptPassphrase(String arg0) {
            return true;
        }

        public boolean promptPassword(String arg0) {
            return false;
        }

        public boolean promptYesNo(String arg0) {
            return true;
        }

        public void showMessage(String arg0) {
//            Logs.log("SUserInfo.showMessage()");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnProsponer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbNuevaInstalacion;
    private javax.swing.JLabel lbVersionActual;
    private javax.swing.JLabel lbVersionActual1;
    // End of variables declaration//GEN-END:variables
}
