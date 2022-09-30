
package formularios.Ventas;

import clases.Instancias;
import clases.Terceros;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;
 
public abstract class tercerosTableModel<T> extends AbstractTableModel{
    
    private Terceros terceros;
    ArrayList<Map<String, String>> listaTerceros = new  ArrayList<Map<String, String>>();
    private Instancias instancias;

     private List<T> listadoDeFilas = new ArrayList<>();

    public List<T> getListRows() {
        return listadoDeFilas;
    }

    public void setListRows(List<T> listadoDeFilas) {
        this.listadoDeFilas = listadoDeFilas;
    }
    
    public tercerosTableModel(){
     
    }
    
    public tercerosTableModel(Terceros terceros){
     this.terceros = terceros;
    }  
     
    public void UpdateModel(Instancias instancias,String identificacion, String estadoCliente){
       instancias=instancias;
       listaTerceros = instancias.getSql().consultarTerceros(identificacion, estadoCliente);
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Nombre";
            case 1: return "Identificacion";
            case 2: return "Facturar Electronicamente.";
            case 3: return "Acción";
            default : return "No";
        }
    }
    
    @Override
    public int getRowCount() {
        return listaTerceros.size();
    }

    @Override
    public int getColumnCount() {
       return 4;
    }

    @Override
    public Object getValueAt(int fila, int column) {
        Map tercero=listaTerceros.get(fila);
        JButton boton=new JButton();
        boton.setPreferredSize(new Dimension(50,30));
        
        String facturaElectronica="";        
        if(tercero.get("isFacturaElectronica") == null){
            facturaElectronica="Sin Establecer";
            boton.setName("NS");
            boton.setText("Cambiar Estado");
        }else if(tercero.get("isFacturaElectronica").equals("1")){
            facturaElectronica="NO";
            boton.setName("SI");
            boton.setText("Cambiar Estado");
        }else if(tercero.get("isFacturaElectronica").equals("0")){
            facturaElectronica="SI";
            boton.setName("NO");
            boton.setText("Cambiar Estado");
        }
        
        switch(column){
            case 0: return tercero.get("nombre");
            case 1: return tercero.get("id");
            case 2: return facturaElectronica;
            case 3: return boton;
            default : return "No";
        }
    }
    
        
}