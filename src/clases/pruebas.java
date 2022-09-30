/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import logs.Logs;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author amgon
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.err.println(" Fecha: "+encriptarFechaBloqueo("01/08/2021"));
         
//         System.err.println("1getBigDecimal "+big.getBigDecimal("1000.2"));
//         System.err.println("2getBigDecimal "+big.setMoneda(big.getBigDecimal("1000.2")));
//         System.err.println("3getBigDecimal "+big.setMonedaExacta(big.getBigDecimal("1000.2")));
//         System.err.println("4getBigDecimal "+big.formatDouble(big.getBigDecimal("1000.2")));
//         System.err.println("5getBigDecimal "+big.setNumero("1000.2"));
//         
//         System.err.println("1vaalor "+"1000.2");
//        System.err.println("2vaalor "+big.getBigDecimal("1000.2".toString()));
//        System.err.println("3vaalor "+big.setMoneda(big.getBigDecimal("1000.2".toString())));
//       
//        System.err.println("5vaalor "+big.getMonedaToDouble(String.valueOf("1000.2")));
//        
//        System.err.println("7vaalor "+big.getMonedaToDouble("1000.2".toString()));
//        System.err.println("8vaalor "+big.setNumero("1000.2".toString()));
//        
//        
//         System.err.println("1-----"+codigoEncriptado("999888777", "variedades ñolandá"));
//         System.err.println("2-----"+codigoEncriptado("1234567", "Sebastian Londoño"));
        
    }
    
    
     public static String codigoEncriptado(String nit, String nombre) {
        String hashEncriptado = nit + "--" + nombre;
        metodosGenerales metodos = new metodosGenerales();
        try {
            hashEncriptado = metodos.EncriptarValidacionUsuario(hashEncriptado, "yI4z%jIMndKd3N%bj#%f");
        } catch (Exception ex) {
            Logs.error(ex);
        }
        return hashEncriptado;
    }
    
    public static String encriptarFechaBloqueo(String texto) {
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
}
