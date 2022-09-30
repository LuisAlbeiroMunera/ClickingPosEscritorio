/*
 * Clase que contiene utilidades que se usaran en la aplicación de forma frecuente
 */
package clases;
import java.io.ByteArrayOutputStream;
import logs.Logs;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author johnj
 */
public class Utils {
    
    private static final String KEY_STRING = "121-444-248-151-27-89-303-249";
    
    public static void main(String[] args) {
        List<Integer> lList = new ArrayList<Integer>();
        

        lList.add(4);       
        lList.add(1);
        lList.add(7);
        lList.add(2);
        lList.add(9);
        lList.add(1);
        lList.add(5);

        Collections.sort(lList);

        for(int i=0; i<lList.size();i++ )
        {
            System.out.println(lList.get(i));
        }

//        String version = "3.1.1";
//        Logs.log("clases.Utils.main() "+version.replace(".", ""));
    }
    
//public static void ingresarImagen(String id, BufferedImage bufferedImage, String formato) {
//        PreparedStatement ps = null;
//        InputStream fis = null;
//    try {
//         Logs.log("insertaImagen ruta  id "+id);
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ImageIO.write(bufferedImage, formato, baos);
//        fis = new ByteArrayInputStream(baos.toByteArray());
//        ps = MySql_connection_scripts.getMySql_connection().getConnection().prepareStatement("INSERT INTO bdimagenes VALUES (?, ?)");
//        ps.setString(1,id);
//        int fileLength = (int) baos.size();
//        Logs.error(" los datos " + fileLength );
//        ps.setBinaryStream(2, fis, fileLength);
//        ps.executeUpdate();
//    } catch (Exception e) {
//        e.printStackTrace();
//    } finally{
//
//        try {
//            fis.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//   
//        try {
//            ps.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//   
//
//}
//
//
//public static void actualizarImagen(String id, BufferedImage bufferedImage, String formato) {
//        PreparedStatement ps = null;
//        InputStream fis = null;
//    try {
//         Logs.log("actualizarImagen ruta id "+id);
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ImageIO.write(bufferedImage, formato, baos);
//        fis = new ByteArrayInputStream(baos.toByteArray());
//        ps = MySql_connection_scripts.getMySql_connection().getConnection().prepareStatement("UPDATE bdimagenes SET IMAGEN = ? WHERE ID = ?");
//
//        int fileLength = (int) baos.size();
//        Logs.error(" los datos " + fileLength );
//        ps.setBinaryStream(1, fis, fileLength);
//        ps.setString(2,id);
//        ps.executeUpdate();
//    } catch (Exception e) {
//        e.printStackTrace();
//    } finally{
//
//        try {
//            fis.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//   
//        try {
//            ps.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      
//    }
//   
//
//}
//
//public static BufferedImage getImagen(String idImagen){
//    BufferedImage bimage = new BufferedImage(1, 1, 1);
//    PreparedStatement ps = null;
//    ResultSet rs = null;
//    try {
//        
//        String sql = "SELECT IMAGEN FROM bdimagenes WHERE id = ?";
//        ps = MySql_connection_scripts.getMySql_connection().getConnection().prepareStatement(sql);
//        ps.setString(1, idImagen);
//        rs = ps.executeQuery();
//        if (rs.next()) {
//            Blob bin = rs.getBlob("imagen");
//            bimage = ImageIO.read(bin.getBinaryStream());
//        }
//    } catch (Exception e) {
//        e.printStackTrace();
//    }finally{
//        try {
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            ps.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      return bimage;
//    }
//}  
//
//public static boolean imagenExiste(String idImagen){
//    boolean existe = false;
//    PreparedStatement ps = null;
//    ResultSet rs = null;
//    try {
//        
//        String sql = "SELECT IMAGEN FROM bdimagenes WHERE id = ?";
//        ps = MySql_connection_scripts.getMySql_connection().getConnection().prepareStatement(sql);
//        ps.setString(1, idImagen);
//        rs = ps.executeQuery();
//        if (rs.next()) {
//            existe = true;
//        }
//    } catch (Exception e) {
//        e.printStackTrace();
//    }finally{
//        try {
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            ps.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      return existe;
//    }
//}  
//
//public static void setImagenDB(String idImagen, BufferedImage bufferedImage, String formato){
//    PreparedStatement ps=null;
//    ResultSet rs = null;
//    try {
//        String sql = "SELECT id FROM bdimagenes WHERE id = ?";
//        ps = MySql_connection_scripts.getMySql_connection().getConnection().prepareStatement(sql);
//        ps.setString(1, idImagen);
//        rs = ps.executeQuery();
//        if (rs.next()){
//           actualizarImagen(idImagen, bufferedImage, formato);
//        }else{
//           ingresarImagen(idImagen, bufferedImage, formato); 
//        }
//
//    } catch (Exception e) {
//        Logs.log("clases.Utils.validarImagenExiste() 7" + e.getMessage());
//    }finally{
//         try {
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            ps.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//}
//
//
//public static void loadImgToDb(){
//    try {
//        
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
//
//
//public static void main(String[] args) {
//    final File folder = new File("C:\\ClickingPos\\imagenes");
//    try {
//          migrarImagenesToDB(folder);
//    } catch (Exception e) {
//        e.printStackTrace();
//    }finally{
//        setImagenesMigradas();
//    }
// 
//
//}
//    
//public static void migrarImagenesToDB(final File folder) {
//    for (final File f : folder.listFiles()) {
//
//        if (f.isDirectory()) {
//            migrarImagenesToDB(f);
//        }
//
//        if (f.isFile() && (f.getAbsolutePath().endsWith(".png") || f.getAbsolutePath().endsWith(".jpg"))) {
//                String id = f.getAbsolutePath();
//                id = id.replace("C:\\ClickingPos\\imagenes\\", "");
//                String formato = id.endsWith(".png")?"png":"jpg";
//            try {
//                setImagenDB(id, ImageIO.read(f),formato);
//            } catch (IOException ex) {
//                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
//    }
//}
//
// public static BufferedImage pathToBimage(String origen) {
//    BufferedImage bimage = null;
//    try {
//        bimage = ImageIO.read(new File(origen));
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//    return bimage;
//}
// 
// public static void setImagenesMigradas() {
//        PreparedStatement ps = null;
//    try {
//        ps = MySql_connection_scripts.getMySql_connection().getConnection().prepareStatement("UPDATE configuracion SET imgMigradas = 1");
//        ps.executeUpdate();
//    } catch (Exception e) {
//        e.printStackTrace();
//    } finally{
//        try {
//            ps.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      
//    }
//   
//
//}
 
public static String encriptar(String texto) {
      String secretKey = "yI4z%jIMndKd3N%bj#%f"; //llave para encriptar datos
      String base64EncryptedString = "";

      try {

          MessageDigest md = MessageDigest.getInstance("MD5");
          byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
          byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

          SecretKey key = new SecretKeySpec(keyBytes, "DESede");
          Cipher cipher = Cipher.getInstance("DESede");
          cipher.init(Cipher.ENCRYPT_MODE, key);

          byte[] plainTextBytes = texto.getBytes("utf-8");
          byte[] buf = cipher.doFinal(plainTextBytes);
          byte[] base64Bytes = Base64.encodeBase64(buf);
          base64EncryptedString = new String(base64Bytes);

      } catch (Exception ex) {
          Logs.error(ex);
      }
      return base64EncryptedString;
  }
 

  public static String EncriptarHmacMD5(String valor, String keyPrivate) throws Exception {
        String resultado = null;

        byte[] keyBytes = keyPrivate.getBytes();
        Key key = new SecretKeySpec(keyBytes, 0, keyBytes.length, "HmacMD5");
        Mac mac = null;

        try {
                mac = Mac.getInstance("HmacMD5");
                mac.init(key);
        } catch (Exception e) {
                throw  e;
        } 
        byte[] valorEncriptado = mac.doFinal(valor.getBytes(StandardCharsets.ISO_8859_1));

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

  
 public static String[] dividirTextoEnLineas(int maxLineas, int maxByLine, String cadenaInicial){
            String[] vector = new String[maxLineas];
            String cadena = "";            
            int i =0;
            int contador = 0;
            
            while ( i < cadenaInicial.length() && contador < maxLineas) {   
                int posFinal = 0;
                if(i+maxByLine > cadenaInicial.length()){
                  posFinal = cadenaInicial.length();
                }else{
                  posFinal = i+maxByLine;
                }
                String[] palabras = cadenaInicial.substring(i,posFinal).split(" ");
                cadena = "";
                for (int j = 0; (j < palabras.length-1 || (j < palabras.length && posFinal == cadenaInicial.length())); j++) {
                    if(cadena.length() > 0 ){
                         cadena = cadena + " " +palabras[j];
                    }else{
                         cadena = palabras[j];
                    }
                }
                    Logs.log("cadena "+cadena);
                    Logs.log("contador "+i);
                    Logs.log("i "+contador);
                if(posFinal == cadenaInicial.length()){                  
                    vector[contador] = cadenaInicial.substring(i-1, cadenaInicial.length()).trim();
                }else{
                    vector[contador] = cadenaInicial.substring(i, i+cadena.length()).trim();                   
                }
                i = i + cadena.length()+1;
                contador ++;
            }
            
            return vector;
   }  
 
 
   public static String quitarEtiquetas(String cadena){     
       return cadena.replaceAll("\\<.*?\\>", "");
   }
   
    public static String encrypt(String source) {
        try {
            Key key = getKey();

            Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            desCipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] cleartext = source.getBytes();
            byte[] ciphertext = desCipher.doFinal(cleartext);
            return getString(ciphertext);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String source) {
        try {
            Key key = getKey();
            Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            byte[] ciphertext = getBytes(source);
            desCipher.init(Cipher.DECRYPT_MODE, key);
            byte[] cleartext = desCipher.doFinal(ciphertext);
            return new String(cleartext);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Key getKey() {
        try {
            byte[] bytes = getBytes(KEY_STRING);
            DESKeySpec pass = new DESKeySpec(bytes);
            SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
            SecretKey s = skf.generateSecret(pass);
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getString(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            sb.append((int) (0x00FF & b));
            if (i + 1 < bytes.length) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    private static byte[] getBytes(String str) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        StringTokenizer st = new StringTokenizer(str, "-", false);
        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            bos.write((byte) i);
        }
        return bos.toByteArray();
    }
}
