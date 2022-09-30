
package formularios.Ventas;

import clases.Instancias;
import clases.PrefacturaPTM;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;
 
public abstract class facturaTableModel<T> extends AbstractTableModel{
    
    private PrefacturaPTM prefacturaPTM;
    ArrayList<Map<String, String>> listaPrefacturas = new  ArrayList<Map<String, String>>();
    private Instancias instancias;

     private List<T> listadoDeFilas = new ArrayList<>();

    public List<T> getListRows() {
        return listadoDeFilas;
    }

    public void setListRows(List<T> listadoDeFilas) {
        this.listadoDeFilas = listadoDeFilas;
    }

    public facturaTableModel(){
     
    }
    
    public facturaTableModel(PrefacturaPTM prefacturaPTM){
     this.prefacturaPTM = prefacturaPTM;
    }  
     
    public void UpdateModel(Instancias instancias,String factura,String fechaInicio,String fechaFin, String documento){
      instancias=instancias;
      Object[] datosFacElect = instancias.getSql().getResolucionTerminales("FE");
      if(datosFacElect[4] != null){
       listaPrefacturas = instancias.getSql().consultarPreFacturasFacturasDetallada(factura,datosFacElect[4].toString(),fechaInicio,fechaFin,documento);
      }
    }
    
    public void UpdateModelDocSoporte(Instancias instancias,String factura,String fechaInicio,String fechaFin, String documento){
      instancias=instancias;
      Object[] datosFacElect = instancias.getSql().getResolucionTerminales("DS");
      if(datosFacElect[4] != null){
       listaPrefacturas = instancias.getSql().consultarDocSoporteDetallada(factura,datosFacElect[4].toString(),fechaInicio,fechaFin,documento);
      }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Factura";
            case 1: return "Fecha";
            case 2: return "Identificacion";
            case 3: return "Razon Social";
            case 4: return "Estado";
            case 5: return "Mensaje";
            case 6: return "Factura Pdf";
            case 7: return "Error";
            default : return "No";
        }
    }
    
    @Override
    public int getRowCount() {
        return listaPrefacturas.size();
    }

    @Override
    public int getColumnCount() {
       return 8;
    }

    @Override
    public Object getValueAt(int fila, int column) {
        Map factura=listaPrefacturas.get(fila);
        JButton boton=new JButton("Ver");
        boton.setName("Ver");
        JButton botonpdf=new JButton();
        if(factura.get("tipo").equals("0")){
         botonpdf.setEnabled(false);
        }else{
         botonpdf.setName("Descargar");
         botonpdf.setText("Descargar");
        }
        switch(column){
            case 0: return factura.get("factura2");
            case 1: return factura.get("fechaFactura");
            case 2: return factura.get("identificacion");
            case 3: return factura.get("razonSocial");
            case 4: return factura.get("estadotipo");
            case 5: return factura.get("mensaje").toString();
            case 6: return botonpdf;
            case 7: return boton;
            default : return "No";
        }
    }
        
}