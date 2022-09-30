/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.Instancias;
import java.util.ArrayList;
import java.util.Map;
import logs.Logs;

/**
 *
 * @author amgon
 */
public class pruebaTemporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        this.dispose();
//                Logs.log("se pide el codigo 2");
                
//                frmValidacionCodigo validar = new frmValidacionCodigo();
////                dlgNuevaEmpresa validar = new dlgNuevaEmpresa();
//                
//                validar.setVisible(true);  
//                isHabilitadoIngreso = false;
         cargarPreparada("CONGELADA-123","169","PROD-00000483");
    }
    
    public static void cargarPreparada(String congelada, String idCongelada, String codigo){
        Instancias instancias = null;
        ArrayList<Map<String, String>> preparadas = new ArrayList<Map<String, String>>();
        preparadas = instancias.getSql().getProductosPreparacion(congelada, idCongelada, codigo);
        for (Map preparada : preparadas) {
            System.err.println("sss "+preparada);
        }
    }
    
}
