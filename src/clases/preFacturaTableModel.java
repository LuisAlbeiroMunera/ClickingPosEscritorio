
package clases;

import java.util.ArrayList;
import clases.big;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;
 
public abstract class preFacturaTableModel<T> extends AbstractTableModel{
    
   
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

    public preFacturaTableModel(){
     
    }
    
    public preFacturaTableModel(PrefacturaPTM prefacturaPTM){
     this.prefacturaPTM = prefacturaPTM;
    }  
     
    public void UpdateModel(Instancias instancias,String factura,String fechaInicio,String fechaFin){
      instancias=instancias;
      Object[] datosFacElect = instancias.getSql().getResolucionTerminales("FE");
      if(datosFacElect[4] != null){
       listaPrefacturas = instancias.getSql().consultarPreFacturasDetallada(factura,datosFacElect[4].toString(),fechaInicio,fechaFin);
      }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Pre-Factura";
            case 1: return "Identificacion";
            case 2: return "Razon Social";
            case 3: return "Sub Total";
            case 4: return "Descuento";
            case 5: return "Iva";
            case 6: return "Total";
            case 7: return "Estado";
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
        switch(column){
            case 0: return factura.get("factura2");
            case 1: return factura.get("identificacion");
            case 2: return factura.get("razonSocial");
            case 3: return big.setMoneda(big.getBigDecimal(factura.get("subTotal").toString()));
            case 4: return big.setMoneda(big.getBigDecimal(factura.get("descuento").toString()));
            case 5: return big.setMoneda(big.getBigDecimal(factura.get("iva").toString()));
            case 6: return big.setMoneda(big.getBigDecimal(factura.get("valorTotal").toString()));
            case 7: return factura.get("estadotipo");
            default : return "No";
        }
    }
        
}