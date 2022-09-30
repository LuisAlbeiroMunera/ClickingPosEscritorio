/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import formularios.Ventas.buscFacturasElectronicasDian;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;
import logs.Logs;

/**
 * @author amgon 
 * El Hilo se ejecuta cada 2 Minutos, procesando los procedos de facturacion
 * Electonica Automatica
 */
public class FacturacionAutomatica extends Thread  {

    int counter1 = 0;
    buscFacturasElectronicasDian facturaElectronica;

    public FacturacionAutomatica(buscFacturasElectronicasDian facturaElectronica) {
      this.facturaElectronica = facturaElectronica;  
      
    }

    public void run() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Tarea PTM -> " + dtf.format(LocalDateTime.now()));
        this.facturaElectronica.esperarXsegundos(30);        
        this.facturaElectronica.progressBar(5);
        tarePTM();
    }
    
    public void tarePTM(){
        System.out.println("Entra tarePTM"); 
            this.facturaElectronica.progressBar(5);
//        try {
            this.facturaElectronica.consultarRespuestaFactura();
            this.facturaElectronica.progressBar(30);
//        } catch (Exception exprespuestaDomina) {
//            Logs.error("Error consultarRespuestaFactura " + exprespuestaDomina.getMessage());
//        }
        try {
            this.facturaElectronica.procesoPrefacturaPTM();
            this.facturaElectronica.progressBar(60);
        } catch (Exception exprealizarPrefactura) {
             this.facturaElectronica.progressBar(60);
            Logs.error("Error procesoPrefacturaPTM " + exprealizarPrefactura.getMessage());
        }
           this.facturaElectronica.progressBar(70);
//        try {
//            this.facturaElectronica.facturar();
//            this.facturaElectronica.progressBar(70);
//        } catch (Exception expfacturar) {
//            Logs.error("Error factura Automatica " + expfacturar.getMessage());
//        }
        try {
            facturaElectronica.recargarTabla("","","");
            this.facturaElectronica.progressBar(90);
            facturaElectronica.recargarTablaPrefacturas("","","");
            this.facturaElectronica.progressBar(100);
        } catch (Exception exprecargarTabla) {
            this.facturaElectronica.progressBar(100);
            Logs.error("Error recargar tabla factura Automatica " + exprecargarTabla.getMessage());
        }
    }

}
