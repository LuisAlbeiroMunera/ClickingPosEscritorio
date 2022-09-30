package clases;
import logs.Logs;
import configuracion.Propiedades;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySql_connection_scripts {

    private static Connection conexion = null;
    //nombre de la base de datos Acces con extension *.mdb o *.accdb

    static String sURL = "";
    private static MySql_connection_scripts mysql_connection;

    public static MySql_connection_scripts getMySql_connection() {
        if (mysql_connection == null) {
            mysql_connection = new MySql_connection_scripts();
        }
        return mysql_connection;
    }

    public static String leer() {
        String texto = "", resultado = "";
        try {
            //FileReader lector = new FileReader("C:\\Java.old\\Propiedades.txt");
            //FileReader lector = new FileReader("C:\\Java.new\\Propiedades.txt");
            //Path path = Paths.get("Java.old\\").toAbsolutePath();
            //System.out.println(" path "+ path.toString());
            FileReader lector = new FileReader("C:\\Java.old\\Propiedades.txt");
            //FileReader lector = new FileReader(path.toString()+"\\Propiedades.txt");
            
            BufferedReader contenido = new BufferedReader(lector);
            while ((texto = contenido.readLine()) != null) {
                resultado = resultado + texto;
            }
        } catch (Exception e) {
            Logs.log("Error al leer " + e);
            Logs.error(e);
        }
        return resultado;
    }

    private MySql_connection_scripts() {
        String ruta = leer();
        sURL = "jdbc:mysql://" + ruta + ":3306/bdclick";
        //sURL = "jdbc:mysql://" + ruta + ":3307/bdclick";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(sURL, Propiedades.getInstancia().getUsuarioDB(), Propiedades.getInstancia().getPasswordDB());

            if (conexion != null) {
                Logs.log("Conexión a la base de datos exitosa");
            } else {
                Logs.log("No se pudo conectar a la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySql_connection_scripts.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MySql_connection_scripts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        return conexion;
    }

    public static void desconectar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }
}
