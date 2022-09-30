package formularios.productos;

import clases.Identidad;
import formularios.productos.*;
import clases.Instancias;
import clases.big;
import clases.metodosGenerales;
import clases.productos.ndProducto;
import formularios.Ventas.pnlFactura;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Robot;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import logs.Logs;

public final class dlgCompraDetallada1 extends javax.swing.JDialog {

    Instancias instancias;
    metodosGenerales metodos = new metodosGenerales();
    String prodOficial = "";
    String desdeForm = "";
    String bodegaBase = "";
    String tipoMovimiento = "";
    String tipoProducto = "";
    TableRowSorter modeloOrdenado;
    DecimalFormat df = new DecimalFormat("#.00");
    int filaSelectAnterior=-1;
    int columnSelectAnterior=-1;
    Map<String, Double> productosConSerie = new HashMap<String, Double>();
    private pnlFactura factura;
     
    public dlgCompraDetallada1() {
        
    }
   
    public dlgCompraDetallada1(java.awt.Frame parent, boolean modal, String tipoProd, String prod, Object[][] productos, String tipoMov,
            String desde, String bodega, String bod) {
        super(parent, modal);
        initComponents();
        dlgCompraDetallada(parent,modal,tipoProd,prod,productos,tipoMov,desde,bodega,bod);
    }
    
    public dlgCompraDetallada1(java.awt.Frame parent, boolean modal, String tipoProd, String prod, Object[][] productos, String tipoMov,
            String desde, String bodega, String bod,Map<String, Double> map) {
        super(parent, modal);
        initComponents();
        productosConSerie = map;
        dlgCompraDetallada(parent,modal,tipoProd,prod,productos,tipoMov,desde,bodega,bod);
    }
    
    public void dlgCompraDetallada(java.awt.Frame parent, boolean modal, String tipoProd, String prod, Object[][] productos, String tipoMov,
            String desde, String bodega, String bod) {
//        super(parent, modal);
//        initComponents();
       
        this.getRootPane().registerKeyboardAction(accion("cerrar", this), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
        instancias = Instancias.getInstancias();

        this.setTitle("Detallado");

        DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();
        modeloOrdenado = new TableRowSorter<>(modelo);
        tblDetalle.setRowSorter(modeloOrdenado);

        prodOficial = prod;
        tipoProducto = tipoProd;
        tipoMovimiento = tipoMov;
        desdeForm = desde;
        bodegaBase = bodega;

        ndProducto nodo = instancias.getSql().getDatosProducto(prod, bodegaBase);
        lbTitulo.setText(nodo.getDescripcion());

        JTableHeader tableHeader = tblDetalle.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();

        if (tipoMovimiento.equals("Entrada")) {
            tblDetalle.getColumnModel().getColumn(4).setMinWidth(0);
            tblDetalle.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblDetalle.getColumnModel().getColumn(4).setMaxWidth(0);
            tblDetalle.getColumnModel().getColumn(5).setMinWidth(0);
            tblDetalle.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblDetalle.getColumnModel().getColumn(5).setMaxWidth(0);
          
            tblDetalle.removeColumn(tblDetalle.getColumnModel().getColumn(12));
            tblDetalle.removeColumn(tblDetalle.getColumnModel().getColumn(11));
            tblDetalle.removeColumn(tblDetalle.getColumnModel().getColumn(10));
            tblDetalle.removeColumn(tblDetalle.getColumnModel().getColumn(9));
            tblDetalle.removeColumn(tblDetalle.getColumnModel().getColumn(8));
                       //valida si es lote para agregar otro columna en la tabla            
//            if (!tipoProd.equals("Fecha/Lote")){
//                System.err.println("ssssssssssssssssssssssss");
//                tblDetalle.removeColumn(tblDetalle.getColumnModel().getColumn(7));
//                jComboBoxPlu.setVisible(true);
//                jLabelPlu.setVisible(true);             
//            } 
            
            ////////////se crea jcombobox para los plu de los seriales
                ArrayList<Map<String, String>> existenciasList = new ArrayList<Map<String, String>>();
                existenciasList = instancias.getSql().getProductos(prod, bodega);   
                
//                DefaultComboBoxModel modelCombo = new DefaultComboBoxModel(); 
                cargarCombobox(existenciasList,jComboBoxPlu);
                cargarCombobox(existenciasList,jComboBoxPluTallaColor);
                cargarCombobox(existenciasList,jComboBoxPluImeiColor);
//                List<ComboItem> concepts ;
                
///AQUI VA EL COMBOBOX
                /////////////////////////////////
            if (tipoProd.equals("Imei") || tipoProd.equals("Serial") || tipoProd.equals("SerialColor")) {
                pnlColor.setVisible(false);
                pnlFechaLote.setVisible(false);

                if (productos != null) {
                    for (Object[] reg : productos) {
                        String descripcion=((Integer.parseInt(reg[8].toString()) > 1)?(existenciasList.get(0).get("descripcion"+reg[8].toString())+" - L"+reg[8].toString()):existenciasList.get(0).get("descripcion")+" - L1");
                        String cantidadPlu=((Integer.parseInt(reg[8].toString()) > 1)?(existenciasList.get(0).get("cantidad"+reg[8].toString())):"1");
                        modelo.addRow(new Object[]{reg[0], reg[5], "", "1", false, reg[7], "",descripcion,reg[8],cantidadPlu});
                    }
                }

                TableColumn tableColumn = tableColumnModel.getColumn(0);
                tableColumn.setHeaderValue("Imei");

                tblDetalle.getColumnModel().getColumn(2).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(2).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(2).setMaxWidth(0);
                tblDetalle.getColumnModel().getColumn(3).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(3).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(3).setMaxWidth(0);
               
                if (tipoProd.equals("Imei")) {
                    lbFiltro1.setText("Imei:");
                } else {
                    tableColumn.setHeaderValue("Serial");
                    lbFiltro1.setText("Serial:");
                    lbImei.setText("Serial:");
                }

                tableColumn = tableColumnModel.getColumn(1);
                tableColumn.setHeaderValue("Color");
                tableColumn = tableColumnModel.getColumn(7);
                tableColumn.setHeaderValue("Plu");
                tableColumn.setWidth(10);
                tableHeader.repaint();

                if (tipoProd.equals("Serial")) {
                    lbFiltro2.setVisible(false);
                    txtFiltro2.setVisible(false);
                    txtColor.setVisible(false);
                    lbColor1.setVisible(false);
                    tblDetalle.getColumnModel().getColumn(1).setMinWidth(0);
                    tblDetalle.getColumnModel().getColumn(1).setPreferredWidth(0);
                    tblDetalle.getColumnModel().getColumn(1).setMaxWidth(0);
                    
                }

                lbFiltro2.setText("Color:");
                lbFiltro3.setVisible(false);
                txtFiltro3.setVisible(false);
                txtImei.requestFocus();
            } else if (tipoProd.equals("Color") || tipoProd.equals("ColorTalla") || tipoProd.equals("Talla")) {
                lbFiltro1.setText("Color:");
                lbFiltro2.setText("Talla:");

                txtColor1.requestFocus();
                this.setSize(new Dimension(950, 647));
                TableColumn tableColumn = tableColumnModel.getColumn(0);
                tableColumn.setHeaderValue("Color");

                tableColumn = tableColumnModel.getColumn(1);
                tableColumn.setHeaderValue("Talla");
                
                tableColumn = tableColumnModel.getColumn(7);
                tableColumn.setHeaderValue("Plu");
                tableColumn.setWidth(10);              
                
                if (tipoProd.equals("Color")) {
                    lbTalla.setVisible(false);
                    txtTalla.setVisible(false);
                    lbFiltro2.setVisible(false);
                    txtFiltro2.setVisible(false);
                    lbFiltro3.setVisible(false);
                    txtFiltro3.setVisible(false);
                    tblDetalle.getColumnModel().getColumn(1).setMinWidth(0);
                    tblDetalle.getColumnModel().getColumn(1).setPreferredWidth(0);
                    tblDetalle.getColumnModel().getColumn(1).setMaxWidth(0);
                } else if (tipoProd.equals("ColorTalla")) {
                    lbFiltro3.setVisible(false);
                    txtFiltro3.setVisible(false);
                } else {
                    tableColumn = tableColumnModel.getColumn(0);
                    tableColumn.setHeaderValue("Talla");

                    lbFiltro1.setText("Talla:");
                    lbFiltro2.setVisible(false);
                    txtFiltro2.setVisible(false);
                    lbFiltro3.setVisible(false);
                    txtFiltro3.setVisible(false);
                    lbColor.setVisible(false);
                    txtColor1.setVisible(false);
                    tblDetalle.getColumnModel().getColumn(1).setMinWidth(0);
                    tblDetalle.getColumnModel().getColumn(1).setPreferredWidth(0);
                    tblDetalle.getColumnModel().getColumn(1).setMaxWidth(0);
                    txtTalla.requestFocus();
                }

                tableHeader.repaint();

                if (productos != null) {
                    for (Object[] reg : productos) {
                        String descripcion=((Integer.parseInt(reg[8].toString()) > 1)?(existenciasList.get(0).get("descripcion"+reg[8].toString())+" - L"+reg[8].toString()):existenciasList.get(0).get("descripcion")+" - L1");
                        String cantidadPlu=((Integer.parseInt(reg[8].toString()) > 1)?(existenciasList.get(0).get("cantidad"+reg[8].toString())):"1");
                       
                        if (tipoProd.equals("Talla")) {
                            modelo.addRow(new Object[]{reg[6], "", "", reg[4], false, reg[7], "",descripcion,reg[8],cantidadPlu});
                        } else {
                            modelo.addRow(new Object[]{reg[5], reg[6], "", reg[4], false, reg[7], "",descripcion,reg[8],cantidadPlu});
                        }
                    }
                }

                pnlFechaLote.setVisible(false);
                pnlImei.setVisible(false);
                tblDetalle.getColumnModel().getColumn(2).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(2).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(2).setMaxWidth(0);
            } else if (tipoProd.equals("Fecha/Lote")) {    
                this.setSize(new Dimension(950, 647));
                TableColumn tableColumn = tableColumnModel.getColumn(0);
                tableColumn.setHeaderValue("Lote");

                tableColumn = tableColumnModel.getColumn(1);
                tableColumn.setHeaderValue("Fecha Vence");

                tableColumn = tableColumnModel.getColumn(2);
                tableColumn.setHeaderValue("Temperatura");
                tableColumn = tableColumnModel.getColumn(7);
                tableColumn.setHeaderValue("Plu");
                tableColumn.setWidth(200);
                tableHeader.repaint();
                //deboc              
//                JComboBox<Concept> comboBox = new JComboBox<>(new Vector<>(concepts));
                lbFiltro1.setText("Lote:");
                lbFiltro2.setText("Fecha V:");
                lbFiltro3.setText("Temp:");
                
                if (productos != null ) {
                    for (Object[] reg : productos) {
                        String descripcion=((Double.parseDouble(reg[8].toString()) > 1)?(existenciasList.get(0).get("descripcion"+reg[8].toString())+" - L"+reg[8].toString()):existenciasList.get(0).get("descripcion")+" - L1");
                        String cantidadPlu=((Double.parseDouble(reg[8].toString()) > 1)?(existenciasList.get(0).get("cantidad"+reg[8].toString())):"1.0");
                        double cantidadProducto = (Double.parseDouble(reg[4].toString())/Double.parseDouble(cantidadPlu));
                        modelo.addRow(new Object[]{reg[1], reg[2], reg[3], cantidadProducto, false, reg[7], "",descripcion,reg[8],cantidadPlu}); 
                       
                    }
                }

                pnlImei.setVisible(false);
                pnlColor.setVisible(false);
                dtFVence.requestFocus();
            }
        } else {
            tblDetalle.getColumnModel().getColumn(11).setMinWidth(0);
            tblDetalle.getColumnModel().getColumn(11).setPreferredWidth(0);
            tblDetalle.getColumnModel().getColumn(11).setMaxWidth(0);
            tblDetalle.getColumnModel().getColumn(12).setMinWidth(0);
            tblDetalle.getColumnModel().getColumn(12).setPreferredWidth(0);
            tblDetalle.getColumnModel().getColumn(12).setMaxWidth(0);
            
            Object[][] existencias = null;
            ArrayList<Map<String, String>> existenciasList = new ArrayList<Map<String, String>>();
            
                existenciasList = instancias.getSql().getProductosDetallePlu(prod, bod);
            
                existencias = instancias.getSql().getProductosDetalle(prod, bod);
            
            
            pnlColor.setVisible(false);
            pnlFechaLote.setVisible(false);
            pnlImei.setVisible(false);

            if (tipoProd.equals("Imei") || tipoProd.equals("Serial") || tipoProd.equals("SerialColor")) {

                TableColumn tableColumn = tableColumnModel.getColumn(0);
                if (tipoProd.equals("Serial") || tipoProd.equals("SerialColor")) {
                    tableColumn.setHeaderValue("Serial");
                } else {
                    tableColumn.setHeaderValue("Imei");
                }

                tableColumn = tableColumnModel.getColumn(1);
                tableColumn.setHeaderValue("Color");
                tableColumn = tableColumnModel.getColumn(3);
                tableColumn.setHeaderValue("Stock");              
                tableColumn.setWidth(10);
                tableColumn = tableColumnModel.getColumn(7);
                tableColumn.setHeaderValue("Plu");
                tableColumn.setWidth(10);
                tableColumn = tableColumnModel.getColumn(8);
                tableColumn.setHeaderValue("Descripción");
                tableColumn.setWidth(50);
                tableColumn = tableColumnModel.getColumn(9);
                tableColumn.setWidth(10);
                tableColumn.setHeaderValue("Valor");
                tableColumn = tableColumnModel.getColumn(10);
                tableColumn.setWidth(10);
                tableColumn.setHeaderValue("Plu");
                tblDetalle.getColumnModel().getColumn(7).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(7).setPreferredWidth(70);
                tblDetalle.getColumnModel().getColumn(7).setMaxWidth(70);
                tblDetalle.getColumnModel().getColumn(8).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(8).setPreferredWidth(290);
                tblDetalle.getColumnModel().getColumn(8).setMaxWidth(300);
                tblDetalle.getColumnModel().getColumn(9).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(9).setPreferredWidth(100);
                tblDetalle.getColumnModel().getColumn(9).setMaxWidth(100);
                tblDetalle.getColumnModel().getColumn(10).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(10).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(10).setMaxWidth(0);
                tableHeader.repaint();
                
                ArrayList<Map<String, Object>> listaPlus = new ArrayList<Map<String, Object>>();
                    for (Map<String, String> producto : existenciasList) {
                        listaPlus = formarArregloPlu(producto);
                        for (Map<String, Object> plus : listaPlus) {
                            modelo.addRow(new Object[]{producto.get("imei"),producto.get("color"), "",
                                plus.get("cantidad"), false, "", producto.get("Id"), plus.get("codigo"), plus.get("descripcion"), plus.get("valor"), plus.get("numeroPlu"), plus.get("cantidadPlu")});
//                        modelo.addRow(new Object[]{reg[3], reg[7], "", "1", false, "", reg[8]});
                        }
                    }

                if (tipoProd.equals("Serial")) {
                    lbFiltro2.setVisible(false);
                    txtFiltro2.setVisible(false);
                    txtColor.setVisible(false);
                    lbColor1.setVisible(false);
                    tblDetalle.getColumnModel().getColumn(1).setMinWidth(0);
                    tblDetalle.getColumnModel().getColumn(1).setPreferredWidth(0);
                    tblDetalle.getColumnModel().getColumn(1).setMaxWidth(0);
                }

                tblDetalle.getColumnModel().getColumn(2).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(2).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(2).setMaxWidth(0);
                tblDetalle.getColumnModel().getColumn(3).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(3).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(3).setMaxWidth(0);
                tblDetalle.getColumnModel().getColumn(5).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(5).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(5).setMaxWidth(0);

                if (tipoProd.equals("Imei")) {
                    lbFiltro1.setText("Imei:");
                } else {
                    lbFiltro1.setText("Serial:");
                }

                lbFiltro2.setText("Color:");
                lbFiltro3.setVisible(false);
                txtFiltro3.setVisible(false);
            } else if (tipoProd.equals("Color") || tipoProd.equals("ColorTalla") || tipoProd.equals("Talla")) {

                TableColumn tableColumn = tableColumnModel.getColumn(0);
                tableColumn.setHeaderValue("Color");

                tableColumn = tableColumnModel.getColumn(1);
                tableColumn.setHeaderValue("Talla");
                tableColumn = tableColumnModel.getColumn(3);
                tableColumn.setHeaderValue("Stock");              
                tableColumn.setWidth(10);
                tableColumn = tableColumnModel.getColumn(7);
                tableColumn.setHeaderValue("Plu");
                tableColumn.setWidth(10);
                tableColumn = tableColumnModel.getColumn(8);
                tableColumn.setHeaderValue("Descripción");
                tableColumn.setWidth(50);
                tableColumn = tableColumnModel.getColumn(9);
                tableColumn.setWidth(10);
                tableColumn.setHeaderValue("Valor");
                tableColumn = tableColumnModel.getColumn(10);
                tableColumn.setWidth(10);
                tableColumn.setHeaderValue("Plu");
                tblDetalle.getColumnModel().getColumn(7).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(7).setPreferredWidth(70);
                tblDetalle.getColumnModel().getColumn(7).setMaxWidth(70);
                tblDetalle.getColumnModel().getColumn(8).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(8).setPreferredWidth(290);
                tblDetalle.getColumnModel().getColumn(8).setMaxWidth(300);
                tblDetalle.getColumnModel().getColumn(9).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(9).setPreferredWidth(100);
                tblDetalle.getColumnModel().getColumn(9).setMaxWidth(100);
                tblDetalle.getColumnModel().getColumn(10).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(10).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(10).setMaxWidth(0);
                
                lbFiltro1.setText("Color:");
                lbFiltro2.setText("Talla:");

                if (tipoProd.equals("Talla")) {

                    tableColumn = tableColumnModel.getColumn(0);
                    tableColumn.setHeaderValue("Talla");
                    
                    ArrayList<Map<String, Object>> listaPlus = new ArrayList<Map<String, Object>>();
                    for (Map<String, String> producto : existenciasList) {
                        listaPlus = formarArregloPlu(producto);
                        for (Map<String, Object> plus : listaPlus) {
                            modelo.addRow(new Object[]{producto.get("talla"), "", "",
                                plus.get("cantidad"), false, "", producto.get("Id"), plus.get("codigo"), plus.get("descripcion"), plus.get("valor"), plus.get("numeroPlu"), plus.get("cantidadPlu")});
//                       modelo.addRow(new Object[]{reg[9], "", "", reg[2], false, "", reg[8]});
                        }
                    }
                } else {
                    ArrayList<Map<String, Object>> listaPlus = new ArrayList<Map<String, Object>>();
                    for (Map<String, String> producto : existenciasList) {
                        listaPlus = formarArregloPlu(producto);
                        for (Map<String, Object> plus : listaPlus) {
                            modelo.addRow(new Object[]{producto.get("color"),producto.get("talla"), "",
                                plus.get("cantidad"), false, "", producto.get("Id"), plus.get("codigo"), plus.get("descripcion"), plus.get("valor"), plus.get("numeroPlu"), plus.get("cantidadPlu")});
//                        modelo.addRow(new Object[]{reg[7], reg[9], "", reg[2], false, "", reg[8]});
                        }
                    }
                }

                tableHeader.repaint();

                if (tipoProd.equals("Talla")) {
                    lbFiltro1.setText("Talla:");
                    lbFiltro2.setVisible(false);
                    txtFiltro2.setVisible(false);
                } else if (tipoProd.equals("Color")) {
                    lbFiltro2.setVisible(false);
                    txtFiltro2.setVisible(false);
                }

                if (!tipoProd.equals("ColorTalla")) {
                    tblDetalle.getColumnModel().getColumn(1).setMinWidth(0);
                    tblDetalle.getColumnModel().getColumn(1).setPreferredWidth(0);
                    tblDetalle.getColumnModel().getColumn(1).setMaxWidth(0);
                }

                tblDetalle.getColumnModel().getColumn(2).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(2).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(2).setMaxWidth(0);
                lbFiltro3.setVisible(false);
                txtFiltro3.setVisible(false);
            } else if (tipoProd.equals("Fecha/Lote")) {
                this.setSize(new Dimension(950, 647));
                TableColumn tableColumn = tableColumnModel.getColumn(0);
                tableColumn.setHeaderValue("Lote");                
                tableColumn = tableColumnModel.getColumn(1);
                tableColumn.setHeaderValue("Fecha Vencimiento");
                tableColumn.setWidth(15);
                tableColumn = tableColumnModel.getColumn(2);
                tableColumn.setHeaderValue("°C");
                tableColumn.setWidth(5);
                tableColumn = tableColumnModel.getColumn(3);
                tableColumn.setHeaderValue("Stock");              
                tableColumn.setWidth(10);
                tableColumn = tableColumnModel.getColumn(7);
                tableColumn.setHeaderValue("Plu");
                tableColumn.setWidth(10);
                tableColumn = tableColumnModel.getColumn(8);
                tableColumn.setHeaderValue("Descripción");
                tableColumn.setWidth(50);
                tableColumn = tableColumnModel.getColumn(9);
                tableColumn.setWidth(10);
                tableColumn.setHeaderValue("Valor");
                tableColumn = tableColumnModel.getColumn(10);
                tableColumn.setWidth(10);
                tableColumn.setHeaderValue("Plu");
                
                tblDetalle.getColumnModel().getColumn(0).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(0).setPreferredWidth(70);
                tblDetalle.getColumnModel().getColumn(0).setMaxWidth(100);
                tblDetalle.getColumnModel().getColumn(1).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(1).setPreferredWidth(70);
                tblDetalle.getColumnModel().getColumn(1).setMaxWidth(100);                
                tblDetalle.getColumnModel().getColumn(2).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(2).setPreferredWidth(50);
                tblDetalle.getColumnModel().getColumn(2).setMaxWidth(50);
                tblDetalle.getColumnModel().getColumn(3).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(3).setPreferredWidth(80);
                tblDetalle.getColumnModel().getColumn(3).setMaxWidth(80);
                tblDetalle.getColumnModel().getColumn(7).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(7).setPreferredWidth(50);
                tblDetalle.getColumnModel().getColumn(7).setMaxWidth(60);
                tblDetalle.getColumnModel().getColumn(8).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(8).setPreferredWidth(290);
                tblDetalle.getColumnModel().getColumn(8).setMaxWidth(300);
                tblDetalle.getColumnModel().getColumn(9).setMinWidth(10);
                tblDetalle.getColumnModel().getColumn(9).setPreferredWidth(80);
                tblDetalle.getColumnModel().getColumn(9).setMaxWidth(90);
                tblDetalle.getColumnModel().getColumn(10).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(10).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(10).setMaxWidth(0);
                tblDetalle.getColumnModel().getColumn(11).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(11).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(11).setMaxWidth(0);
                tblDetalle.getColumnModel().getColumn(12).setMinWidth(0);
                tblDetalle.getColumnModel().getColumn(12).setPreferredWidth(0);
                tblDetalle.getColumnModel().getColumn(12).setMaxWidth(0);
                
                lbFiltro1.setText("Lote:");
                lbFiltro2.setText("Fecha V:");
                lbFiltro3.setText("Temp:");
                
                ArrayList<Map<String, Object>> listaPlus = new ArrayList<Map<String, Object>>();
                for (Map<String, String> producto : existenciasList) {
                    listaPlus=formarArregloPlu(producto);
                    for (Map<String, Object> plus : listaPlus) {
                        modelo.addRow(new Object[]{producto.get("lote"), producto.get("fechaVencimiento"), producto.get("temperatura"), 
                         plus.get("cantidad"), false, "0", producto.get("Id"),plus.get("codigo"),plus.get("descripcion"),plus.get("valor"),plus.get("numeroPlu"),plus.get("cantidadPlu"),producto.get("stock")});
//                        modelo.addRow(new Object[]{reg[4], reg[5], reg[6], reg[2], false, "", reg[8]});
                    }           
                }
            }
        }
    }

    public pnlFactura getFactura() {
        return factura;
    }

    public void setFactura(pnlFactura factura) {
        this.factura = factura;
    }
    
     public Map<String, Double> getProductosConSerie() {
        return productosConSerie;
    }

    public void setProductosConSerie(Map<String, Double> productosConSerie) {
        this.productosConSerie = productosConSerie;
    }
    
    public ArrayList<Map<String, Object>> formarArregloPlu(Map<String, String> producto){
        ArrayList<Map<String, Object>> existenciasList = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        String inv = producto.get("stock");
        double descuento = 0.0;
//        if(getProductosConSerie().isEmpty()){
//         descuento=getProductosConSerie().get(producto.get("Id"));
//        }
        inv = String.valueOf(Double.parseDouble(inv.replace(",", ".")) - descuento).replace(".", ","); 
        map.put("codigo",producto.get("codigo") + "-1");
        map.put("descripcion",producto.get("descripcion")+" - L1");
        map.put("label",producto.get("descripcion"));
        map.put("ubicacion",producto.get("ubicacion1"));
        map.put("cantidad",big.getMoneda(inv).divide(big.getBigDecimal(1), 2, RoundingMode.HALF_DOWN));
        map.put("cantidadPlu",1);
        map.put("valor",producto.get("L1"));
        map.put("numeroPlu",1);
        map.put("value",1);
        existenciasList.add(map);
        for(int i=2;i<9;i++){
            if (Integer.parseInt(producto.get("plu"+i)) > 0) {
                Map<String, Object> map2 = new HashMap<String, Object>();
                map2.put("codigo",producto.get("codigo") + "-"+i);
                map2.put("descripcion",producto.get("descripcion"+i)+" - L"+i);
                map2.put("label",producto.get("descripcion"+i));
                map2.put("ubicacion",producto.get("ubicacion"+i));
                map2.put("cantidad", big.getMoneda(inv).divide(big.getBigDecimal(producto.get("cantidad"+i).trim()), 2, RoundingMode.HALF_DOWN));
                map2.put("cantidadPlu",producto.get("cantidad"+i));
                map2.put("valor",producto.get("L"+i));
                map2.put("numeroPlu",i);
                map2.put("value",i);
                existenciasList.add(map2);
            }        
        }
        return existenciasList;
    }
//    , javax.swing.JComboBox<>() jComboBoxPlu
    private void cargarCombobox(ArrayList<Map<String, String>> existenciasList, JComboBox jComboBoxPlu) {
        
        ArrayList<Map<String, Object>> listaPlus = new ArrayList<Map<String, Object>>();
        for (Map<String, String> producto : existenciasList) {
            listaPlus = formarArregloPlu(producto);
            if (listaPlus.size() > 1) {
                jComboBoxPlu.addItem("Seleccionar");
            }
            for (Map<String, Object> plus : listaPlus) {
                jComboBoxPlu.addItem(plus);
            }
        }
        //SE RENDERIZA EL COMBO PARA CARGAR EL OBJETO COMPLETO
        jComboBoxPlu.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Map) {
                    Map producto = (Map) value;
                    StringBuilder sb = new StringBuilder();
                    sb.append(producto.get("descripcion"));
                    setText(sb.toString());
                }
                return this;
            }
        });
    }

    private ActionListener accion(final String opc, final JDialog ventana) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (opc) {
                    case "cerrar":
                        ventana.dispose();
                        break;
                }
            }
        };
        return a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtro = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        popBorrar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pnlImei = new javax.swing.JPanel();
        lbImei = new javax.swing.JLabel();
        txtImei = new javax.swing.JTextField();
        btnCargarImei = new javax.swing.JButton();
        lbColor1 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabelPlu2 = new javax.swing.JLabel();
        jComboBoxPluImeiColor = new javax.swing.JComboBox<>();
        pnlBuscadorColorTalla = new javax.swing.JPanel();
        lbFiltro1 = new javax.swing.JLabel();
        txtFiltro1 = new javax.swing.JTextField();
        lbFiltro2 = new javax.swing.JLabel();
        txtFiltro2 = new javax.swing.JTextField();
        lbFiltro3 = new javax.swing.JLabel();
        txtFiltro3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pnlColor = new javax.swing.JPanel();
        lbColor = new javax.swing.JLabel();
        txtColor1 = new javax.swing.JTextField();
        btnCargarColor = new javax.swing.JButton();
        txtCant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbTalla = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        jLabelPlu1 = new javax.swing.JLabel();
        jComboBoxPluTallaColor = new javax.swing.JComboBox<>();
        pnlFechaLote = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        btnCargarFecha = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCant1 = new javax.swing.JTextField();
        dtFVence = new com.toedter.calendar.JDateChooser();
        jComboBoxPlu = new javax.swing.JComboBox<>();
        jLabelPlu = new javax.swing.JLabel();

        popBorrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        popBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        popBorrar.setText("Borrar");
        popBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popBorrarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(popBorrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ANULACIÓN");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblDetalle.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Detalle 1", "Detalle 2", "Detalle 3", "Cant", "Sel", "Cant", "Codigo", "de1", "de2", "de3", "de4", "de5", "de6"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetalle.setComponentPopupMenu(jPopupMenu1);
        tblDetalle.setRowHeight(30);
        tblDetalle.getTableHeader().setReorderingAllowed(false);
        tblDetalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblDetalleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblDetalleFocusLost(evt);
            }
        });
        tblDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDetalleKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDetalleKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblDetalleKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalle);
        if (tblDetalle.getColumnModel().getColumnCount() > 0) {
            tblDetalle.getColumnModel().getColumn(3).setMinWidth(50);
            tblDetalle.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblDetalle.getColumnModel().getColumn(3).setMaxWidth(120);
            tblDetalle.getColumnModel().getColumn(4).setMinWidth(40);
            tblDetalle.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblDetalle.getColumnModel().getColumn(4).setMaxWidth(40);
            tblDetalle.getColumnModel().getColumn(5).setMinWidth(50);
            tblDetalle.getColumnModel().getColumn(5).setPreferredWidth(50);
            tblDetalle.getColumnModel().getColumn(5).setMaxWidth(60);
            tblDetalle.getColumnModel().getColumn(6).setMinWidth(0);
            tblDetalle.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblDetalle.getColumnModel().getColumn(6).setMaxWidth(0);
            tblDetalle.getColumnModel().getColumn(11).setResizable(false);
            tblDetalle.getColumnModel().getColumn(12).setResizable(false);
        }

        lbTitulo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("DETALLADO DEL PRODUCTO:");

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventasIco.png"))); // NOI18N
        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pnlImei.setBackground(new java.awt.Color(255, 255, 255));

        lbImei.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbImei.setText("Imei:");

        txtImei.setBackground(new java.awt.Color(255, 255, 204));
        txtImei.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtImei.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImei.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtImeiKeyReleased(evt);
            }
        });

        btnCargarImei.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCargarImei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar1.png"))); // NOI18N
        btnCargarImei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarImeiActionPerformed(evt);
            }
        });

        lbColor1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbColor1.setText("Color:");

        txtColor.setBackground(new java.awt.Color(255, 204, 204));
        txtColor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColorKeyReleased(evt);
            }
        });

        jLabelPlu2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelPlu2.setText("Plu:");

        javax.swing.GroupLayout pnlImeiLayout = new javax.swing.GroupLayout(pnlImei);
        pnlImei.setLayout(pnlImeiLayout);
        pnlImeiLayout.setHorizontalGroup(
            pnlImeiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImeiLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbImei, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImei, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lbColor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPlu2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxPluImeiColor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargarImei, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlImeiLayout.setVerticalGroup(
            pnlImeiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImeiLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlImeiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCargarImei, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlImeiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbImei, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtImei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbColor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPlu2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxPluImeiColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        pnlBuscadorColorTalla.setBackground(new java.awt.Color(255, 255, 255));
        pnlBuscadorColorTalla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 10))); // NOI18N

        lbFiltro1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbFiltro1.setText("Filtro 1:");

        txtFiltro1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFiltro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltro1KeyReleased(evt);
            }
        });

        lbFiltro2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbFiltro2.setText("Filtro 2:");

        txtFiltro2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFiltro2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltro2KeyReleased(evt);
            }
        });

        lbFiltro3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbFiltro3.setText("Filtro 3:");

        txtFiltro3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFiltro3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltro3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscadorColorTallaLayout = new javax.swing.GroupLayout(pnlBuscadorColorTalla);
        pnlBuscadorColorTalla.setLayout(pnlBuscadorColorTallaLayout);
        pnlBuscadorColorTallaLayout.setHorizontalGroup(
            pnlBuscadorColorTallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscadorColorTallaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbFiltro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltro1)
                .addGap(22, 22, 22)
                .addComponent(lbFiltro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltro2)
                .addGap(21, 21, 21)
                .addComponent(lbFiltro3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltro3)
                .addContainerGap())
        );
        pnlBuscadorColorTallaLayout.setVerticalGroup(
            pnlBuscadorColorTallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscadorColorTallaLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnlBuscadorColorTallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFiltro3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFiltro3)
                    .addComponent(txtFiltro2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFiltro2)
                    .addComponent(txtFiltro1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFiltro1))
                .addGap(5, 5, 5))
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        pnlColor.setBackground(new java.awt.Color(255, 255, 255));

        lbColor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbColor.setText("Color:");

        txtColor1.setBackground(new java.awt.Color(255, 204, 204));
        txtColor1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtColor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColor1ActionPerformed(evt);
            }
        });
        txtColor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColor1KeyReleased(evt);
            }
        });

        btnCargarColor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCargarColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar1.png"))); // NOI18N
        btnCargarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarColorActionPerformed(evt);
            }
        });

        txtCant.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Cant:");

        lbTalla.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbTalla.setText("Talla:");

        txtTalla.setBackground(new java.awt.Color(255, 204, 204));
        txtTalla.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTalla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTallaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTallaKeyTyped(evt);
            }
        });

        jLabelPlu1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelPlu1.setText("Plu:");

        javax.swing.GroupLayout pnlColorLayout = new javax.swing.GroupLayout(pnlColor);
        pnlColor.setLayout(pnlColorLayout);
        pnlColorLayout.setHorizontalGroup(
            pnlColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlColorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTalla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPlu1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxPluTallaColor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargarColor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlColorLayout.setVerticalGroup(
            pnlColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlColorLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnlColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCargarColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColor1)
                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTalla)
                            .addComponent(lbTalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPlu1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPluTallaColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );

        pnlFechaLote.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("F. Vence:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Lote:");

        txtLote.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLote.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLoteKeyReleased(evt);
            }
        });

        btnCargarFecha.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCargarFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar1.png"))); // NOI18N
        btnCargarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarFechaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Cant:");

        txtTemp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTemp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTempKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Temp°:");

        txtCant1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCant1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCant1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCant1KeyReleased(evt);
            }
        });

        jLabelPlu.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelPlu.setText("Plu:");

        javax.swing.GroupLayout pnlFechaLoteLayout = new javax.swing.GroupLayout(pnlFechaLote);
        pnlFechaLote.setLayout(pnlFechaLoteLayout);
        pnlFechaLoteLayout.setHorizontalGroup(
            pnlFechaLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFechaLoteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlFechaLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFechaLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtFVence, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtLote))
                .addGap(18, 18, 18)
                .addGroup(pnlFechaLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFechaLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTemp)
                    .addComponent(txtCant1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFechaLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxPlu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFechaLoteLayout.createSequentialGroup()
                        .addComponent(jLabelPlu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCargarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFechaLoteLayout.setVerticalGroup(
            pnlFechaLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFechaLoteLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnlFechaLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFechaLoteLayout.createSequentialGroup()
                        .addGroup(pnlFechaLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtFVence, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPlu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(pnlFechaLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBuscadorColorTalla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlImei, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFechaLote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(pnlBuscadorColorTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(pnlFechaLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnlColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(pnlImei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private boolean validarSeriales(DefaultTableModel modelo, String nombreDetalle) {
        String detalle1 = "";
        String detalle2 = "";
        double cantidad = 0.0;
        double inventario = 0.0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.setValueAt(modelo.getValueAt(i, 5).toString().trim(),i, 5);
           if (modelo.getValueAt(i, 4).equals(true) && !modelo.getValueAt(i, 5).toString().equals("")){  
            detalle1 = modelo.getValueAt(i, 0).toString();
            detalle2 = modelo.getValueAt(i, 1).toString();
            inventario = Double.parseDouble(modelo.getValueAt(i, 3).toString()) * Double.parseDouble(modelo.getValueAt(i, 11).toString());
            cantidad = Double.parseDouble(modelo.getValueAt(i, 5).toString()) * Double.parseDouble(modelo.getValueAt(i, 11).toString());
         
            if(cantidad > inventario){
              metodos.msgAdvertenciaAjustado(null, "Cantidad Superior al Inventario ("+nombreDetalle+"): " + detalle1);
              modelo.setValueAt(0, i, 5);
              return false;
            }
            int a = validarInventario(detalle1, detalle2, modelo, i,inventario , cantidad, nombreDetalle);
            if (a == -1) {
                return false;
            }
            cantidad = 0.0;
          }
        }
        return true;
    }
    
    private int validarInventario(String detalle1, String detalle2, DefaultTableModel modelo, int x, double inventario, double cantidad, String nombreDetalle) {
        int i = x;
        int j = 0;
        for (i = x + 1; i < modelo.getRowCount(); i++) {
            
            if (modelo.getValueAt(i, 4).equals(true) && modelo.getValueAt(i, 0).equals(detalle1) && modelo.getValueAt(i, 1).equals(detalle2)) {
                if (Double.parseDouble(modelo.getValueAt(i, 5).toString()) > 0) {
                    cantidad += Double.parseDouble(modelo.getValueAt(i, 5).toString()) * Double.parseDouble(modelo.getValueAt(i, 11).toString());
                    
                    if (cantidad > inventario) {
                        metodos.msgAdvertenciaAjustado(null, "Cantidad Superior al inventario ("+nombreDetalle+"): " + detalle1);
                        modelo.setValueAt(0, i, 5);
                        return -1;
                    }
                }
            }
            j = i;
        }
        return j + 1;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ndProducto producto = instancias.getSql().getDatosProducto(prodOficial, bodegaBase);
        Object datos[];
        datos = instancias.getSql().getDatosMaestra();
        Boolean facturarSinInventario = (Boolean) datos[Identidad.facturarSinInventario];
        DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();
                    
        if (tipoMovimiento.equals("Entrada")) {

            if (tblDetalle.getRowCount() == 0) {
                metodos.msgAdvertenciaAjustado(null, "Debe ingresar almenos un registro");
                txtImei.requestFocus();
                return;
            }

            // VALIDAMOS SI EL IMEI QUE ESTAMOS INSERTANDO NO EXISTA
            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
                    String id = "";
                    try {
                        id = instancias.getSql().imeiExistente(tblDetalle.getValueAt(i, 0).toString());
                    } catch (Exception e) {
                        Logs.error(e);
                    }

                    if (id.equals("") || id == null) {
                    } else {
                        if (tipoProducto.equals("Imei")) {
                            metodos.msgError(null, "El imei '" + tblDetalle.getValueAt(i, 0) + "' ya existe !");
                            return;
                        } else {
                            metodos.msgError(null, "El serial '" + tblDetalle.getValueAt(i, 0) + "' ya existe !");
                            return;
                        }
                    }
                } else {
                    // VALIDAMOS QUE LA CANTIDAD SI SEA UN NÚMERO VALIDO
                    Double cantidad = 0.0;
                    try {
                        cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 3).toString().replace(",", "."));
                    } catch (Exception e) {
                        metodos.msgError(null, "Cantidad invalida");
                        tblDetalle.setColumnSelectionInterval(1, 1);
                        tblDetalle.setRowSelectionInterval(i, i);
                        tblDetalle.editCellAt(i, 1);
                        tblDetalle.transferFocus();
                        return;
                    }

                    if (cantidad <= 0) {
                        metodos.msgError(null, "Cantidad debe ser mayor a 0");
                        tblDetalle.setColumnSelectionInterval(1, 1);
                        tblDetalle.setRowSelectionInterval(i, i);
                        tblDetalle.editCellAt(i, 1);
                        tblDetalle.transferFocus();
                        return;
                    }
                }
            }

            if (desdeForm.equals("pnlIngreso")) {
                if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
//                    instancias.getIngresos().eliminarRegistros(prodOficial);
                    instancias.getIngresos().setPlu(false);
                    Double cantidad = 0.0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        if (modelo.getValueAt(i, 5).toString().equals(1)) {
                                cantidad += Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Integer.parseInt(modelo.getValueAt(i, 9).toString());
                            } else {
                                double cantDetalle = Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Integer.parseInt(modelo.getValueAt(i, 9).toString());
                                cantidad += cantDetalle;
                                instancias.getIngresos().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
                                "", "", "", String.valueOf(cantDetalle), producto.getDescripcion(), tblDetalle.getValueAt(i, 1).toString(), "",tblDetalle.getValueAt(i, 5).toString(),Integer.parseInt(modelo.getValueAt(i, 8).toString()));
                            }
                    }// EN String.valueOf(cantDetalle) iba ""
                    instancias.getIngresos().cargarProducto1(prodOficial, String.valueOf(df.format(cantidad)).replace(".", ","), 1);
//                    instancias.getIngresos().cargarProducto1(prodOficial, String.valueOf(tblDetalle.getRowCount()), 1);
                } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
//                    instancias.getIngresos().eliminarRegistros(prodOficial);
                    instancias.getIngresos().setPlu(false);
                    Double cantidad = 0.0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        if (tipoProducto.equals("Talla")) {
                            if (modelo.getValueAt(i, 5).toString().equals(1)) {
                                cantidad += Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString().replace(",", "."));
                            } else {
                                double cantDetalle = Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString().replace(",", "."));
                                cantidad += cantDetalle;
                                instancias.getIngresos().cargarDetallado(prodOficial, "", "", "", "", String.valueOf(cantDetalle),
                                        producto.getDescripcion(), "", tblDetalle.getValueAt(i, 0).toString(),
                                        tblDetalle.getValueAt(i, 5).toString(), Integer.parseInt(modelo.getValueAt(i, 8).toString()));
                            }
                        } else {
                            //VALIDA SI HAY  SERIALES YA ALMACENADOS EN BD
                            if (modelo.getValueAt(i, 5).toString().equals("1")) {
                                cantidad += Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString().replace(",", "."));
                            } else {
                                double cantDetalle = Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString().replace(",", "."));
                                cantidad += cantDetalle;
                                instancias.getIngresos().cargarDetallado(prodOficial, "", "", "", "", String.valueOf(cantDetalle),
                                        producto.getDescripcion(), tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 1).toString(),
                                        tblDetalle.getValueAt(i, 5).toString(), Integer.parseInt(modelo.getValueAt(i, 8).toString()));
                            }               
                        }
                    }
                    instancias.getIngresos().cargarProducto1(prodOficial, String.valueOf(df.format(cantidad)).replace(".", ","), 0);
                } else if (tipoProducto.equals("Fecha/Lote")) {
                    instancias.getIngresos().setPlu(false);
                    Double cantidad = 0.0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {                      
                        if(modelo.getValueAt(i, 5).toString().equals("1")){
                            cantidad += Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString().replace(",", "."));
                        }else{
                            double cantDetalle = Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString().replace(",", "."));
                            cantidad += cantDetalle; 
                            instancias.getIngresos().cargarDetallado(prodOficial, "", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 1).toString(),
                                tblDetalle.getValueAt(i, 2).toString(), String.valueOf(cantDetalle), producto.getDescripcion(), "", "",
                                tblDetalle.getValueAt(i, 5).toString(),Integer.parseInt(modelo.getValueAt(i, 8).toString()));
                           
                        }
                    }
                    instancias.getIngresos().cargarProducto1(prodOficial, String.valueOf(cantidad).replace(".", ","), 0);
                }
            } else if (desdeForm.equals("ajusteInv")) {
                    
                if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
//                    instancias.getuInt().eliminarRegistros(prodOficial);  
                    instancias.getuInt().setPlu(false);
                    Double cantidad = 0.0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        if (modelo.getValueAt(i, 5).toString().equals("1")) {
                            cantidad += Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString()); 
                        }else{
                            double cantDetalle = Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString());
                            cantidad += cantDetalle;
                            instancias.getuInt().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
                                "", "", "", String.valueOf(cantDetalle), producto.getDescripcion(), tblDetalle.getValueAt(i, 1).toString(), "",tblDetalle.getValueAt(i, 5).toString(),Integer.parseInt(modelo.getValueAt(i, 8).toString()));
                        }
                    }
                    instancias.getuInt().cargarProducto1(prodOficial, String.valueOf(cantidad), 1,"");

                } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                    //instancias.getuInt().eliminarRegistros(prodOficial);
                    instancias.getuInt().setPlu(false);
                    Double cantidad = 0.0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        if (tipoProducto.equals("Talla")) {
                            if (modelo.getValueAt(i, 5).toString().equals("1")) {
                             cantidad += Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString());   
                            }else{
                                double cantDetalle = Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString());
                                cantidad += cantDetalle;
                                instancias.getuInt().cargarDetallado(prodOficial, "", "", "", "", String.valueOf(cantDetalle),
                                    producto.getDescripcion(), "", tblDetalle.getValueAt(i, 0).toString(),tblDetalle.getValueAt(i, 5).toString(),Integer.parseInt(modelo.getValueAt(i, 8).toString()));
                            }
                        } else {
                            if (modelo.getValueAt(i, 5).toString().equals("1")) {
                             cantidad += Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString());
                            }else{
                                double cantDetalle = Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString());
                                cantidad += cantDetalle;
                                cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 3).toString().replace(",", "."));
                                instancias.getuInt().cargarDetallado(prodOficial, "", "", "", "", String.valueOf(cantDetalle),
                                    producto.getDescripcion(), tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 1).toString(),tblDetalle.getValueAt(i, 5).toString(),Integer.parseInt(modelo.getValueAt(i, 8).toString()));
                            }
                        }
                    }
                    instancias.getuInt().cargarProducto1(prodOficial, String.valueOf(df.format(cantidad)).replace(".", ","), 1, "");
                } else if (tipoProducto.equals("Fecha/Lote")) {
//                    instancias.getuInt().eliminarRegistros(prodOficial); setPlu
                    instancias.getuInt().setPlu(false);
                    double cantidad = 0.0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        if (modelo.getValueAt(i, 5).toString().equals("1")) {
                         cantidad += Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", "."))* Double.parseDouble(modelo.getValueAt(i, 9).toString()); 
                        }else{
                         double cantDetalle = Double.parseDouble(modelo.getValueAt(i, 3).toString().replace(",", ".")) * Double.parseDouble(modelo.getValueAt(i, 9).toString());
                         cantidad += cantDetalle;
                        instancias.getuInt().cargarDetallado(prodOficial, "", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 1).toString(),
                                tblDetalle.getValueAt(i, 2).toString(), String.valueOf(cantDetalle), producto.getDescripcion(), "", "",tblDetalle.getValueAt(i, 5).toString(),Integer.parseInt(modelo.getValueAt(i, 8).toString()));
                        }
                    }
                    instancias.getuInt().cargarProducto1(prodOficial, String.valueOf(cantidad).replace(".", ","), 1,"");
                }
            } else if (desdeForm.equals("invInicial")) {

                if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
                    instancias.getInventarioInicial().eliminarRegistros();
                    instancias.getInventarioInicial().cargarProducto1(String.valueOf(tblDetalle.getRowCount()));

                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        instancias.getInventarioInicial().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
                                "", "", "", "", producto.getDescripcion(), tblDetalle.getValueAt(i, 1).toString(), "");
                    }
                } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                    instancias.getInventarioInicial().eliminarRegistros();
                    Double cantidad = 0.0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        if (tipoProducto.equals("Talla")) {
                            cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 3).toString().replace(",", "."));
                            instancias.getInventarioInicial().cargarDetallado(prodOficial, "", "", "", "", tblDetalle.getValueAt(i, 3).toString(),
                                    producto.getDescripcion(), "", tblDetalle.getValueAt(i, 0).toString());
                        } else {
                            cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 3).toString().replace(",", "."));
                            instancias.getInventarioInicial().cargarDetallado(prodOficial, "", "", "", "", tblDetalle.getValueAt(i, 3).toString(),
                                    producto.getDescripcion(), tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 1).toString());
                        }
                    }
                    instancias.getInventarioInicial().cargarProducto1(String.valueOf(df.format(cantidad)).replace(".", ","));
                } else if (tipoProducto.equals("Fecha/Lote")) {
                    instancias.getInventarioInicial().eliminarRegistros();
                    Double cantidad = 0.0;
                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                        cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 3).toString().replace(",", "."));
                        instancias.getInventarioInicial().cargarDetallado(prodOficial, "", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 1).toString(),
                                tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 3).toString().replace(",", "."), producto.getDescripcion(), "", "");
                    }
                    instancias.getInventarioInicial().cargarProducto1(String.valueOf(cantidad).replace(".", ","));
                }
            }
        } else {
            
             if (tipoProducto.equals("Fecha/Lote") || tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                JTableHeader tableHeader = tblDetalle.getTableHeader();
                TableColumnModel tableColumnModel = tableHeader.getColumnModel();
                TableColumn tableColumn = tableColumnModel.getColumn(0);
                
                 if(!facturarSinInventario){
                    if(producto.getManejaInventario()){
                        if (!validarSeriales(modelo,tableColumn.getHeaderValue().toString())) {
                            return;
                        }
                    }
                 }
            }
            
            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                if ((Boolean) tblDetalle.getValueAt(i, 4)) {
                    if (tipoProducto.equals("Fecha/Lote") || tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                        Double cantidad = 0.0;
                        
                        try {
                            cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 5).toString().replace(",", "."));
                        } catch (Exception e) {
                            tblDetalle.setColumnSelectionInterval(1, 1);
                            tblDetalle.setRowSelectionInterval(i, i);
                            tblDetalle.editCellAt(i, 1);
                            tblDetalle.transferFocus();
                            metodos.msgAdvertenciaAjustado(null, "La cantidad es inválida");
                            return;
                        }

                        if (cantidad <= 0) {
                            tblDetalle.setColumnSelectionInterval(1, 1);
                            tblDetalle.setRowSelectionInterval(i, i);
                            tblDetalle.editCellAt(i, 1);
                            tblDetalle.transferFocus();
                            metodos.msgAdvertenciaAjustado(null, "La cantidad debe ser mayor a 0");
                            return;
                        }
                    }
                }
            }

            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                if ((Boolean) tblDetalle.getValueAt(i, 4)) {
                    if (tipoProducto.equals("Fecha/Lote") || tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                        Double cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 5).toString().replace(",", "."));
                        
                        if (Double.parseDouble(tblDetalle.getValueAt(i, 3).toString().replace(",", ".")) < cantidad && !facturarSinInventario) {
                            tblDetalle.setColumnSelectionInterval(1, 1);
                            tblDetalle.setRowSelectionInterval(i, i);
                            tblDetalle.editCellAt(i, 1);
                            tblDetalle.transferFocus();
                            metodos.msgAdvertenciaAjustado(null, "¡Cantidades insuficientes!");
                            return;
                        }
                    }
                }
            }

            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                if ((Boolean) tblDetalle.getValueAt(i, 4)) {
                    
                    if (desdeForm.equals("pnlFactura")) {
                        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
                            factura.setPlu(false);
                            factura.cargarProducto(prodOficial, "1",  Integer.parseInt(tblDetalle.getValueAt(i, 10).toString()), tblDetalle.getValueAt(i, 0).toString(),
                                    "", tblDetalle.getValueAt(i, 6).toString(), false, "", tblDetalle.getValueAt(i, 1).toString(), "", "", "", "");
                            this.dispose();
                        } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                            factura.setPlu(false);
                            factura.cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), Integer.parseInt(tblDetalle.getValueAt(i, 10).toString()),
                                    "", "", tblDetalle.getValueAt(i, 6).toString(), false, tblDetalle.getValueAt(i, 1).toString(), tblDetalle.getValueAt(i, 0).toString(), "", "", "", "");
                            this.dispose();
                        } else if (tipoProducto.equals("Fecha/Lote")) {
                            factura.setPlu(false);
                            factura.cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), Integer.parseInt(tblDetalle.getValueAt(i, 10).toString()),
                                    "", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(), false, "", tblDetalle.getValueAt(i, 0).toString(),
                                    tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 1).toString(), "", "");
                            this.dispose();
                        }
                    } else if (desdeForm.equals("ajusteInv1")) {
                        instancias.getuInt().setPlu(false);
                        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
                            instancias.getuInt().cargarProducto(prodOficial, "1", Integer.parseInt(modelo.getValueAt(i, 10).toString()), tblDetalle.getValueAt(i, 0).toString(),
                                    "", tblDetalle.getValueAt(i, 6).toString(), "", tblDetalle.getValueAt(i, 1).toString(), "", "");
                        } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                            instancias.getuInt().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), Integer.parseInt(modelo.getValueAt(i, 10).toString()),
                                    "", "", tblDetalle.getValueAt(i, 6).toString(), tblDetalle.getValueAt(i, 1).toString(), tblDetalle.getValueAt(i, 0).toString(), "", "");
                        } else if (tipoProducto.equals("Fecha/Lote")) {
                            instancias.getuInt().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), Integer.parseInt(modelo.getValueAt(i, 10).toString()),
                                    "", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(), "", tblDetalle.getValueAt(i, 0).toString(),
                                    tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 1).toString());
                        }
                        this.dispose();
                    } else if (desdeForm.equals("trasladoInterno")) {
                        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
                            instancias.getTrasladosInternos().cargarProducto(prodOficial, "1", 1, tblDetalle.getValueAt(i, 0).toString(),
                                    "", tblDetalle.getValueAt(i, 6).toString(), "", tblDetalle.getValueAt(i, 1).toString(), "", "");
                        } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                            instancias.getTrasladosInternos().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), 1,
                                    "", "", tblDetalle.getValueAt(i, 6).toString(), tblDetalle.getValueAt(i, 1).toString(), tblDetalle.getValueAt(i, 0).toString(), "", "");
                        } else if (tipoProducto.equals("Fecha/Lote")) {
                           
                            instancias.getTrasladosInternos().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), 1,
                                    "", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(), "", tblDetalle.getValueAt(i, 0).toString(),
                                    tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 1).toString());
                        }
                    } else if (desdeForm.equals("prestamos")) {
                        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
                            instancias.getPrestamos().cargarProducto(prodOficial, "1", 1, tblDetalle.getValueAt(i, 0).toString(),
                                    "", tblDetalle.getValueAt(i, 6).toString(), "", tblDetalle.getValueAt(i, 1).toString(), "", "");
                        } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                            instancias.getPrestamos().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), 1,
                                    "", "", tblDetalle.getValueAt(i, 6).toString(), tblDetalle.getValueAt(i, 1).toString(), tblDetalle.getValueAt(i, 0).toString(), "", "");
                        } else if (tipoProducto.equals("Fecha/Lote")) {
                            
                            instancias.getPrestamos().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), 1,
                                    "", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(), "", tblDetalle.getValueAt(i, 0).toString(),
                                    tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 1).toString());
                        }
                    } else if (desdeForm.equals("separe")) {
                        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
                            instancias.getPlanSepare().cargarProducto(prodOficial, "1", 1, tblDetalle.getValueAt(i, 0).toString(),
                                    "", tblDetalle.getValueAt(i, 6).toString(), false, "", tblDetalle.getValueAt(i, 1).toString(), "", "", "", "");
                        } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                            instancias.getPlanSepare().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), 1,
                                    "", "", tblDetalle.getValueAt(i, 6).toString(), false, tblDetalle.getValueAt(i, 1).toString(),
                                    tblDetalle.getValueAt(i, 0).toString(), "", "", "", "");
                        } else if (tipoProducto.equals("Fecha/Lote")) {
                       
                            instancias.getPlanSepare().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), 1,
                                    "", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(), false, "", tblDetalle.getValueAt(i, 0).toString(),
                                    tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 1).toString(), "", "");
                        }
                    } else if (desdeForm.equals("congelada")) {
                        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
                            instancias.getMesa1().cargarProducto(prodOficial, "1", 1, tblDetalle.getValueAt(i, 0).toString(),
                                    "", tblDetalle.getValueAt(i, 6).toString(), false, "", tblDetalle.getValueAt(i, 1).toString(), "", "", "", "");
                        } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                            instancias.getMesa1().setPlu(false);
                            instancias.getMesa1().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), Integer.parseInt(modelo.getValueAt(i, 10).toString()),
                                    "", "", tblDetalle.getValueAt(i, 6).toString(), false, tblDetalle.getValueAt(i, 1).toString(),
                                    tblDetalle.getValueAt(i, 0).toString(), "", "", "", "");
                            this.dispose();
                        } else if (tipoProducto.equals("Fecha/Lote")) {
                          
                            instancias.getMesa1().setPlu(false);
                            instancias.getMesa1().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), Integer.parseInt(modelo.getValueAt(i, 10).toString()),
                                    "", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(), false, "", tblDetalle.getValueAt(i, 0).toString(),
                                    tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 1).toString(), "", "");
                            this.dispose();
                        }
                    } else if (desdeForm.equals("pedido")) {
                        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {
                            instancias.getPedido().cargarProducto(prodOficial, "1", 1, tblDetalle.getValueAt(i, 0).toString(),
                                    "", tblDetalle.getValueAt(i, 6).toString(), false, "", tblDetalle.getValueAt(i, 1).toString(), "", "", "", "");
                        } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {
                            instancias.getPedido().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), 1,
                                    "", "", tblDetalle.getValueAt(i, 6).toString(), false, tblDetalle.getValueAt(i, 1).toString(),
                                    tblDetalle.getValueAt(i, 0).toString(), "", "", "", "");
                        } else if (tipoProducto.equals("Fecha/Lote")) {
                        
                            instancias.getPedido().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 5).toString().replace(",", "."), 1,
                                    "", tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 6).toString(), false, "", tblDetalle.getValueAt(i, 0).toString(),
                                    tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 1).toString(), "", "");
                        }
                    }
                }
            }
        }

        this.dispose();

//        if (tipoMovimiento.equals("Entrada")) {
//
//            if (tblDetalle.getRowCount() == 0) {
//                metodos.msgError(null, "Debe ingresar almenos un registro");
//                txtImei.requestFocus();
//                return;
//            }
//
//            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                // VALIDAMOS SI EL IMEI QUE ESTAMOS INSERTANDO NO EXISTA
//                if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial")) {
//                    String id = "";
//                    try {
//                        id = instancias.getSql().imeiExistente(tblDetalle.getValueAt(i, 0).toString());
//                    } catch (Exception e) {
//                    }
//
//                    if (id.equals("") || id == null) {
//                    } else {
//
//                        if (tipoProducto.equals("Imei")) {
//                            metodos.msgError(null, "El imei '" + tblDetalle.getValueAt(i, 0) + "' ya existe !");
//                            return;
//                        } else {
//                            metodos.msgError(null, "El serial '" + tblDetalle.getValueAt(i, 0) + "' ya existe !");
//                            return;
//                        }
//                    }
//                } else {
//                    // VALIDAMOS QUE LA CANTIDAD SI SEA UN NÚMERO VALIDO
//                    Double cantidad = 0.0;
//                    try {
//                        cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", "."));
//                    } catch (Exception e) {
//                        metodos.msgError(null, "Debe ingresar una cantidad valida en la fila " + i + ". ");
//                        return;
//                    }
//
//                    if (cantidad <= 0) {
//                        metodos.msgError(null, "Debe ingresar una cantidad  mayor a 0 en la fila " + i + ". ");
//                        return;
//                    }
//                }
//            }
//
//            ndProducto producto = instancias.getSql().getDatosProducto(prodOficial, bodegaBase);
//
//            if (tipoProducto.equals("Color")) {
//                if (desdeForm.equals("ajusteInv")) {
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        instancias.getuInt().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 1).toString(), 1,
//                                tblDetalle.getValueAt(i, 0).toString(), "", "", tblDetalle.getValueAt(i, 5).toString(), "",
//                                "", tblDetalle.getValueAt(i, 9).toString());
//                    }
//                } else if (desdeForm.equals("pnlIngreso")) {
//                    instancias.getIngresos().eliminarRegistros(prodOficial);
//
//                    Double cantidad = 0.0;
//
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", "."));
//                        instancias.getIngresos().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
//                                "", "", "", tblDetalle.getValueAt(i, 1).toString(), producto.getDescripcion(), tblDetalle.getValueAt(i, 5).toString(),
//                                tblDetalle.getValueAt(i, 9).toString());
//                    }
//
//                    instancias.getIngresos().cargarProducto1(prodOficial, String.valueOf(cantidad).replace(",", "."), 1);
//                } else if (desdeForm.equals("pnlIngresoEx")) {
//                    instancias.getIngresosEx().eliminarRegistros(prodOficial);
//                    Double cantidad = 0.0;
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", "."));
//                        instancias.getIngresosEx().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
//                                tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 4).toString(),
//                                tblDetalle.getValueAt(i, 1).toString().replace(",", "."), producto.getDescripcion(), tblDetalle.getValueAt(i, 5).toString());
//                    }
//                    instancias.getIngresosEx().cargarProducto1(prodOficial, String.valueOf(cantidad).replace(",", "."), 1);
//                }
//            } else if (tipoProducto.equals("Talla")) {
//                if (desdeForm.equals("ajusteInv")) {
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        instancias.getuInt().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 1).toString(), 1,
//                                tblDetalle.getValueAt(i, 0).toString(), "", "", tblDetalle.getValueAt(i, 5).toString(), "", "",
//                                tblDetalle.getValueAt(i, 9).toString());
//                    }
//                } else if (desdeForm.equals("pnlIngreso")) {
//
//                    instancias.getIngresos().eliminarRegistros(prodOficial);
//
//                    Double cantidad = 0.0;
//
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", "."));
//                        instancias.getIngresos().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
//                                "", "", "", tblDetalle.getValueAt(i, 1).toString(), producto.getDescripcion(), tblDetalle.getValueAt(i, 5).toString(),
//                                tblDetalle.getValueAt(i, 9).toString());
//                    }
//
//                    instancias.getIngresos().cargarProducto1(prodOficial, String.valueOf(cantidad).replace(",", "."), 1);
//
//                } else if (desdeForm.equals("pnlIngresoEx")) {
//                    instancias.getIngresosEx().eliminarRegistros(prodOficial);
//                    Double cantidad = 0.0;
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", "."));
//                        instancias.getIngresosEx().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
//                                tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 4).toString(),
//                                tblDetalle.getValueAt(i, 1).toString().replace(",", "."), producto.getDescripcion(), tblDetalle.getValueAt(i, 5).toString());
//                    }
//                    instancias.getIngresosEx().cargarProducto1(prodOficial, String.valueOf(cantidad).replace(",", "."), 1);
//                }
//            } else if (tipoProducto.equals("ColorTalla")) {
//                if (desdeForm.equals("ajusteInv")) {
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        instancias.getuInt().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 1).toString(), 1,
//                                tblDetalle.getValueAt(i, 0).toString(), "", "", tblDetalle.getValueAt(i, 5).toString(), "", "",
//                                tblDetalle.getValueAt(i, 9).toString());
//                    }
//                } else if (desdeForm.equals("pnlIngreso")) {
//
//                    instancias.getIngresos().eliminarRegistros(prodOficial);
//
//                    Double cantidad = 0.0;
//
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", "."));
//                        instancias.getIngresos().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
//                                "", "", "", tblDetalle.getValueAt(i, 1).toString(), producto.getDescripcion(), tblDetalle.getValueAt(i, 5).toString(),
//                                tblDetalle.getValueAt(i, 9).toString());
//                    }
//
//                    instancias.getIngresos().cargarProducto1(prodOficial, String.valueOf(cantidad).replace(",", "."), 1);
//
//                } else if (desdeForm.equals("pnlIngresoEx")) {
//                    instancias.getIngresosEx().eliminarRegistros(prodOficial);
//                    Double cantidad = 0.0;
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", "."));
//                        instancias.getIngresosEx().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
//                                tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 4).toString(),
//                                tblDetalle.getValueAt(i, 1).toString().replace(",", "."), producto.getDescripcion(), tblDetalle.getValueAt(i, 5).toString());
//                    }
//                    instancias.getIngresosEx().cargarProducto1(prodOficial, String.valueOf(cantidad).replace(",", "."), 1);
//                }
//            } else if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial")) {
//                if (desdeForm.equals("ajusteInv")) {
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        instancias.getuInt().cargarProducto(prodOficial, "1", 1, tblDetalle.getValueAt(i, 0).toString(), "", "",
//                                tblDetalle.getValueAt(i, 5).toString(), "", "", tblDetalle.getValueAt(i, 9).toString());
//                    }
//                } else if (desdeForm.equals("pnlIngreso")) {
//                    instancias.getIngresos().eliminarRegistros(prodOficial);
//                    instancias.getIngresos().cargarProducto1(prodOficial, String.valueOf(tblDetalle.getRowCount()), 1);
//
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        instancias.getIngresos().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
//                                "", "", "", "", producto.getDescripcion(), tblDetalle.getValueAt(i, 5).toString(),
//                                tblDetalle.getValueAt(i, 9).toString());
//                    }
//                } else if (desdeForm.equals("pnlIngresoEx")) {
//                    instancias.getIngresosEx().eliminarRegistros(prodOficial);
//                    instancias.getIngresosEx().cargarProducto1(prodOficial, String.valueOf(tblDetalle.getRowCount()), 1);
//
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        instancias.getIngresosEx().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
//                                "", "", "", "", producto.getDescripcion(), tblDetalle.getValueAt(i, 5).toString());
//                    }
//                }
//            } else if (tipoProducto.equals("Fecha/Lote")) {
//                if (desdeForm.equals("ajusteInv")) {
////                    instancias.getIngresos().eliminarRegistros(prodOficial);
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        instancias.getuInt().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 1).toString(), 1,
//                                "", tblDetalle.getValueAt(i, 3).toString(), "", "", tblDetalle.getValueAt(i, 2).toString(),
//                                tblDetalle.getValueAt(i, 4).toString(), tblDetalle.getValueAt(i, 9).toString());
//                    }
//
//                } else if (desdeForm.equals("pnlIngreso")) {
//                    instancias.getIngresos().eliminarRegistros(prodOficial);
//                    Double cantidad = 0.0;
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", "."));
//                        instancias.getIngresos().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
//                                tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 4).toString(),
//                                tblDetalle.getValueAt(i, 1).toString().replace(",", "."), producto.getDescripcion(), "",
//                                tblDetalle.getValueAt(i, 9).toString());
//                    }
//                    instancias.getIngresos().cargarProducto1(prodOficial, String.valueOf(cantidad).replace(".", ","), 1);
//                } else if (desdeForm.equals("pnlIngresoEx")) {
//                    instancias.getIngresosEx().eliminarRegistros(prodOficial);
//                    Double cantidad = 0.0;
//                    for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                        cantidad = cantidad + Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", "."));
//                        instancias.getIngresosEx().cargarDetallado(prodOficial, tblDetalle.getValueAt(i, 0).toString(),
//                                tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 2).toString(), tblDetalle.getValueAt(i, 4).toString(),
//                                tblDetalle.getValueAt(i, 1).toString().replace(",", "."), producto.getDescripcion(), "");
//                    }
//                    instancias.getIngresosEx().cargarProducto1(prodOficial, String.valueOf(cantidad).replace(".", ","), 1);
//                }
//            }
//
//            this.dispose();
//
//        } else if (tipoMovimiento.equals("Salida")) {
//
//            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                if ((Boolean) tblDetalle.getValueAt(i, 6)) {
//                    if (tipoProducto.equals("Fecha/Lote") || tipoProducto.equals("Color")) {
//                        Double cantidad = 0.0;
//
//                        try {
//                            cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 7).toString().replace(",", "."));
//                        } catch (Exception e) {
//                            metodos.msgError(null, "Debe ingresar una cantidad valida del lote '" + tblDetalle.getValueAt(i, 3) + "' ");
//                            return;
//                        }
//
//                        if (cantidad <= 0) {
//                            metodos.msgError(null, "Debe ingresar una cantidad mayor a 0 del lote '" + tblDetalle.getValueAt(i, 3) + "' ");
//                            return;
//                        }
//                    }
//                }
//            }
//
//            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                if ((Boolean) tblDetalle.getValueAt(i, 6)) {
//
//                    if (tipoProducto.equals("Fecha/Lote") || tipoProducto.equals("Color")) {
//                        Double cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 7).toString().replace(",", "."));
//
//                        if (Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", ".")) < cantidad) {
//                            metodos.msgError(null, "No tiene cantidades suficientes del lote '" + tblDetalle.getValueAt(i, 3) + "' ");
//                            return;
//                        }
//                    }
//
//                }
//            }
//
//            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
//                if ((Boolean) tblDetalle.getValueAt(i, 6)) {
//                    if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial")) {
//                        if (desdeForm.equals("pnlFactura")) {
//                            instancias.getFactura().cargarProducto(prodOficial, "1", 1, tblDetalle.getValueAt(i, 0).toString(),
//                                    tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString(), false, "", "");
//                        } else if (desdeForm.equals("separe")) {
//                            instancias.getPlanSepare().cargarProducto(prodOficial, "1", 1, tblDetalle.getValueAt(i, 0).toString(),
//                                    tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString(), false, "", "");
//                        } else if (desdeForm.equals("congelada")) {
//                            instancias.getMesa1().cargarProducto(prodOficial, "1", 1, tblDetalle.getValueAt(i, 0).toString(),
//                                    tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString(), false, "", "");
//                        } else if (desdeForm.equals("ajusteInv")) {
//                            instancias.getuInt().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 1).toString(), 1,
//                                    tblDetalle.getValueAt(i, 0).toString(), "", tblDetalle.getValueAt(i, 8).toString(),
//                                    tblDetalle.getValueAt(i, 5).toString(), "", "", tblDetalle.getValueAt(i, 9).toString());
//                        } else if (desdeForm.equals("traslados")) {
//                            instancias.getTraslados().cargarProducto(prodOficial, "1", tblDetalle.getValueAt(i, 0).toString(),
//                                    tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString(), 1, tblDetalle.getValueAt(i, 9).toString());
//                        } else if (desdeForm.equals("trasladoInterno")) {
//                            instancias.getTrasladosInternos().cargarProducto(prodOficial, "1",
//                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(),
//                                    tblDetalle.getValueAt(i, 8).toString(), 1);
//                        }
//                    } else {
//                        if (desdeForm.equals("pnlFactura")) {
//                            instancias.getFactura().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 7).toString().replace(",", "."), 1,
//                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(),
//                                    tblDetalle.getValueAt(i, 8).toString(), false, tblDetalle.getValueAt(i, 5).toString(),
//                                    tblDetalle.getValueAt(i, 9).toString());
//                        } else if (desdeForm.equals("traslados")) {
//                            instancias.getTraslados().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 7).toString().replace(",", "."),
//                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(),
//                                    tblDetalle.getValueAt(i, 8).toString(), 1, tblDetalle.getValueAt(i, 9).toString());
//                        }
//                    }
////
////                    if (desdeForm.equals("pnlFactura")) {
////                        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial")) {
////                            instancias.getFactura().cargarProducto(prodOficial, "1", 1,
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString());
////                        } else {
////                            instancias.getFactura().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 7).toString().replace(",", "."), 1,
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString());
////                        }
////                    }
////
////                    if (desdeForm.equals("pnlFactura")) {
////                        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial")) {
////                            instancias.getFactura().cargarProducto(prodOficial, "1", 1,
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString());
////                        } else {
////                            instancias.getFactura().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 7).toString().replace(",", "."), 1,
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString());
////                        }
////                    }
//
//                    if (tipoMovimiento.equals("Traslados")) {
//                        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial")) {
//                            instancias.getTraslados().cargarProducto(prodOficial, "1",
//                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(),
//                                    tblDetalle.getValueAt(i, 8).toString(), 1, tblDetalle.getValueAt(i, 9).toString());
//                        } else {
//                            instancias.getTraslados().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 7).toString().replace(",", "."),
//                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(),
//                                    tblDetalle.getValueAt(i, 8).toString(), 1, tblDetalle.getValueAt(i, 9).toString());
//                        }
//                    }
//
////                    if (tipoMovimiento.equals("modificarPedido")) {
////                        if (tipoProducto.equals("Imei")) {
////                            instancias.getModificarPedido().cargarProducto(prodOficial, "1",
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString(), 1);
////                        } else {
////                            instancias.getTraslados().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 7).toString().replace(",", "."),
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString(), 1);
////                        }
////                    }
//                }
//            }
//
//            this.dispose();
//
//        }
//
////        if (tipoMovimiento.equals("CompraEx")) {
////        } else if (tipoMovimiento.equals("Compras")) {
////        } else {
////
////            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
////                if ((Boolean) tblDetalle.getValueAt(i, 6)) {
////                    if (!tipoProducto.equals("Imei")) {
////                        Double cantidad = 0.0;
////
////                        try {
////                            cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 7).toString().replace(",", "."));
////                        } catch (Exception e) {
////                            metodos.msgError(null, "Debe ingresar una cantidad valida del lote '" + tblDetalle.getValueAt(i, 3) + "' ");
////                            return;
////                        }
////
////                        if (cantidad <= 0) {
////                            metodos.msgError(null, "Debe ingresar una cantidad mayor a 0 del lote '" + tblDetalle.getValueAt(i, 3) + "' ");
////                            return;
////                        }
////                    }
////                }
////            }
////
////            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
////                if ((Boolean) tblDetalle.getValueAt(i, 6)) {
////                    if (!tipoProducto.equals("Imei")) {
////                        Double cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 7).toString().replace(",", "."));
////                        if (Double.parseDouble(tblDetalle.getValueAt(i, 1).toString().replace(",", ".")) < cantidad) {
////                            metodos.msgError(null, "No tiene cantidades suficientes del lote '" + tblDetalle.getValueAt(i, 3) + "' ");
////                            return;
////                        }
////                    }
////                }
////            }
////
////            if (tipoMovimiento.equals("Ventas")) {
////                for (int i = 0; i < tblDetalle.getRowCount(); i++) {
////                    if ((Boolean) tblDetalle.getValueAt(i, 6)) {
////                        if (tipoProducto.equals("Imei")) {
////                            instancias.getFactura().cargarProducto(prodOficial, "1", 1,
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString());
////                        } else {
////                            instancias.getFactura().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 7).toString().replace(",", "."), 1,
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString());
////                        }
////                    }
////                }
////            } else if (tipoMovimiento.equals("Traslados")) {
////                for (int i = 0; i < tblDetalle.getRowCount(); i++) {
////                    if ((Boolean) tblDetalle.getValueAt(i, 6)) {
////                        if (tipoProducto.equals("Imei")) {
////                            instancias.getTraslados().cargarProducto(prodOficial, "1",
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString(), 1);
////                        } else {
////                            instancias.getTraslados().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 7).toString().replace(",", "."),
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString(), 1);
////                        }
////                    }
////                }
////            } else if (tipoMovimiento.equals("modificarPedido")) {
////                for (int i = 0; i < tblDetalle.getRowCount(); i++) {
////                    if ((Boolean) tblDetalle.getValueAt(i, 6)) {
////                        if (tipoProducto.equals("Imei")) {
////                            instancias.getModificarPedido().cargarProducto(prodOficial, "1",
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString(), 1);
////                        } else {
////                            instancias.getTraslados().cargarProducto(prodOficial, tblDetalle.getValueAt(i, 7).toString().replace(",", "."),
////                                    tblDetalle.getValueAt(i, 0).toString(), tblDetalle.getValueAt(i, 3).toString(), tblDetalle.getValueAt(i, 8).toString(), 1);
////                        }
////                    }
////                }
////            }
////
////            this.dispose();
////        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void ocultarSiLoteFecha(boolean oculta){
       jButton2.setVisible(oculta);
       btnCargarFecha.setVisible(oculta);
    }
    
    private void btnCargarImeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarImeiActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();

        String imei, color;
        imei = txtImei.getText();
        color = txtColor.getText();

        if (color.equals("")) {
            if (tipoProducto.equals("Imei") || tipoProducto.equals("SerialColor")) {
                metodos.msgAdvertenciaAjustado(null, "¡ Ingrese el color !");
                return;
            }
        }

        if (imei.equals("")) {
            if (tipoProducto.equals("Imei")) {
                metodos.msgAdvertenciaAjustado(null, "¡ Ingrese el imei !");
                return;
            } else {
                metodos.msgAdvertenciaAjustado(null, "¡ Ingrese el serial !");
                return;
            }
        }

        if (tipoProducto.equals("Imei")) {
            if (imei.length() != 15) {
                metodos.msgAdvertenciaAjustado(null, "Imei errado, verifique el número");
                return;
            }
        }

        for (int i = 0; i < tblDetalle.getRowCount(); i++) {
            if (imei.equals(tblDetalle.getValueAt(i, 0))) {
                if (tipoProducto.equals("Imei")) {
                    metodos.msgAdvertenciaAjustado(null, "Este imei ya esta cargado");
                    return;
                } else {
                    metodos.msgAdvertenciaAjustado(null, "Este serial ya esta cargado");
                    return;
                }
            }
        }
        
        if((jComboBoxPluImeiColor.getSelectedItem().toString()).equals("Seleccionar")){
          metodos.msgAdvertenciaAjustado(null, "¡Seleccione el Plu!");
          return;
        }
        
        String plu="";
        String idPlu="";
        int cantidadPlu=0;
                
         Map<String, Object> map = new HashMap<String, Object>();
         map = (Map<String, Object>) jComboBoxPluImeiColor.getSelectedItem();
         plu = map.get("descripcion").toString();
         idPlu = map.get("numeroPlu").toString();
         cantidadPlu = Integer.parseInt(map.get("cantidadPlu").toString());
         
        modelo.addRow(new Object[]{imei, color, "", 1, false, 0, "",plu,idPlu,cantidadPlu});
        txtImei.setText("");
        txtColor.setText("");
        txtImei.requestFocus();

        if (tipoProducto.equals("Imei")) {
            txtImei.setBackground(new Color(255, 255, 204));
        }
    }//GEN-LAST:event_btnCargarImeiActionPerformed

    private void popBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popBorrarActionPerformed
        if (tblDetalle.getSelectedRow() > -1) {

            int fila = tblDetalle.getSelectedRow();

            DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();
            modelo.removeRow(fila);

            tblDetalle.removeEditor();
        } else {
            metodos.msgAdvertencia(null, "Seleccione un registro");
        }
    }//GEN-LAST:event_popBorrarActionPerformed

    private void txtImeiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImeiKeyReleased
        if (tipoProducto.equals("Imei")) {
            if (txtImei.getText().length() != 15) {
                txtImei.setBackground(new Color(255, 255, 204));
            } else {
                txtImei.setBackground(new Color(153, 255, 153));
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tipoProducto.equals("Serial")) {
                btnCargarImeiActionPerformed(null);
            } else {
                txtColor.requestFocus();
            }
        }
    }//GEN-LAST:event_txtImeiKeyReleased

    private void txtFiltro1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltro1KeyReleased
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltro1.getText(), 0));
    }//GEN-LAST:event_txtFiltro1KeyReleased

    private void txtColorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtColor.getText().equals("")) {
                btnCargarImeiActionPerformed(null);
            } else {
                ventanaColores1(txtColor.getText());
            }
        } else {
            txtColor.setText("");
        }
    }//GEN-LAST:event_txtColorKeyReleased

    private void txtFiltro2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltro2KeyReleased
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltro2.getText(), 1));
    }//GEN-LAST:event_txtFiltro2KeyReleased

    private void txtFiltro3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltro3KeyReleased
        modeloOrdenado.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltro3.getText(), 2));
    }//GEN-LAST:event_txtFiltro3KeyReleased

    private void txtColor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColor1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtColor1.getText().equals("")) {
                if (tipoProducto.equals("Color")) {
                    txtCant.requestFocus();
                } else {
                    txtTalla.requestFocus();
                }
            } else {
                ventanaColores2(txtColor1.getText());
            }
        } else {
            txtColor1.setText("");
        }
    }//GEN-LAST:event_txtColor1KeyReleased

    private void btnCargarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarColorActionPerformed
        String cant = txtCant.getText();
        if (cant.equals("")) {
            metodos.msgAdvertenciaAjustado(null, "Ingrese la cantidad");
            return;
        }

        if (tipoProducto.equals("Talla")) {
            if (txtTalla.getText().equals("")) {
                metodos.msgAdvertenciaAjustado(null, "¡Ingrese una talla!");
                return;
            } else {
                for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                    if (txtTalla.getText().equals(tblDetalle.getValueAt(i, 0))) {
                        Double cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 3).toString().replace(",", "."));
                        cantidad = cantidad + Double.parseDouble(cant.replace(",", "."));
                        tblDetalle.setValueAt(cantidad, i, 3);
                        txtCant.setText("");
                        txtColor1.setText("");
                        txtTalla.setText("");
                        txtTalla.requestFocus();
                        return;
                    }
                }
            }
        }

        if (tipoProducto.equals("Color")) {
            if (txtColor1.getText().equals("")) {
                metodos.msgAdvertenciaAjustado(null, "¡Ingrese un color!");
                return;
            } else {
                for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                    if (txtColor1.getText().equals(tblDetalle.getValueAt(i, 0))) {
                        Double cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 3).toString().replace(",", "."));
                        cantidad = cantidad + Double.parseDouble(cant.replace(",", "."));
                        tblDetalle.setValueAt(cantidad, i, 3);
                        txtCant.setText("");
                        txtColor1.setText("");
                        txtTalla.setText("");
                        txtColor1.requestFocus();
                        return;
                    }
                }
            }
        }

        if (tipoProducto.equals("ColorTalla")) {
            if (txtTalla.getText().equals("")) {
                metodos.msgAdvertenciaAjustado(null, "¡Ingrese una talla!");
                return;
            }

            if (txtColor1.getText().equals("")) {
                metodos.msgAdvertenciaAjustado(null, "¡Ingrese un color!");
                return;
            }

            for (int i = 0; i < tblDetalle.getRowCount(); i++) {
                if (txtColor1.getText().equals(tblDetalle.getValueAt(i, 0)) && txtTalla.getText().equals(tblDetalle.getValueAt(i, 1))) {
                    Double cantidad = Double.parseDouble(tblDetalle.getValueAt(i, 3).toString().replace(",", "."));
                    cantidad = cantidad + Double.parseDouble(cant.replace(",", "."));
                    tblDetalle.setValueAt(cantidad, i, 3);
                    txtCant.setText("");
                    txtColor1.setText("");
                    txtTalla.setText("");
                    txtColor1.requestFocus();
                    return;
                }
            }
        }
        
     if((jComboBoxPluTallaColor.getSelectedItem().toString()).equals("Seleccionar")){
          metodos.msgAdvertenciaAjustado(null, "¡Seleccione el Plu!");
          return;
        }
        
        String plu="";
        String idPlu="";
        int cantidadPlu=0;
                
         Map<String, Object> map = new HashMap<String, Object>();
         map = (Map<String, Object>) jComboBoxPluTallaColor.getSelectedItem();
         plu = map.get("descripcion").toString();
         idPlu = map.get("numeroPlu").toString();
         cantidadPlu = Integer.parseInt(map.get("cantidadPlu").toString());
         
        DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();

        if (tipoProducto.equals("Talla")) {
            modelo.addRow(new Object[]{txtTalla.getText(), "", "", cant, false, 0, "",plu,idPlu,cantidadPlu});
        } else {
            modelo.addRow(new Object[]{txtColor1.getText(), txtTalla.getText(), "", cant, false, 0, "",plu,idPlu,cantidadPlu});
        }

        txtCant.setText("");
        txtColor1.setText("");
        txtTalla.setText("");
        txtColor1.requestFocus();
    }//GEN-LAST:event_btnCargarColorActionPerformed

    private void txtCantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCargarColorActionPerformed(null);
        }
    }//GEN-LAST:event_txtCantKeyReleased

    private void txtColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColor1ActionPerformed

    private void txtCantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyTyped
        metodos.soloNum(evt);
    }//GEN-LAST:event_txtCantKeyTyped

    private void txtTallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTallaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtTalla.getText().equals("")) {
                txtCant.requestFocus();
            } else {
                ventanaTallas(txtTalla.getText());
            }
        } else {
            txtTalla.setText("");
        }
    }//GEN-LAST:event_txtTallaKeyReleased

    private void txtTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTallaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTallaKeyTyped

    private void btnCargarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarFechaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();
        String cant, lote, temp, fecha;
        cant = txtCant1.getText();
        lote = txtLote.getText();
        temp = txtTemp.getText();

        try {
            fecha = metodos.desdeDate(dtFVence.getCalendar());
        } catch (Exception e) {
            metodos.msgAdvertenciaAjustado(null, "Falta fecha de vencimiento");
            return;
        }

        if (cant.equals("")) {
            metodos.msgAdvertenciaAjustado(null, "¡Ingrese la cantidad!");
            return;
        }
           
        if((jComboBoxPlu.getSelectedItem().toString()).equals("Seleccionar")){
          metodos.msgAdvertenciaAjustado(null, "¡Seleccione el Plu!");
          return;
        }
        
        String plu="";
        String idPlu="";
        int cantidadPlu=0;
                
         Map<String, Object> map = new HashMap<String, Object>();
         map = (Map<String, Object>) jComboBoxPlu.getSelectedItem();
         plu = map.get("descripcion").toString();
         idPlu = map.get("numeroPlu").toString();
         cantidadPlu = Integer.parseInt(map.get("cantidadPlu").toString());
        
        modelo.addRow(new Object[]{lote, metodos.desdeDate2(dtFVence.getCalendar()), temp, cant,false,0,"",plu,idPlu,cantidadPlu});
        txtCant1.setText("");
        txtLote.setText("");
        txtTemp.setText("");
        dtFVence.setCalendar(null);
    }//GEN-LAST:event_btnCargarFechaActionPerformed

    private void txtCant1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCant1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLote.requestFocus();
        }
    }//GEN-LAST:event_txtCant1KeyReleased

    private void txtLoteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoteKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTemp.requestFocus();
        }
    }//GEN-LAST:event_txtLoteKeyReleased

    private void txtTempKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTempKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCargarFechaActionPerformed(null);
        }
    }//GEN-LAST:event_txtTempKeyReleased

    private void tblDetalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetalleKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDetalleKeyPressed

    private void tblDetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetalleKeyReleased
     
    }//GEN-LAST:event_tblDetalleKeyReleased

    private void tblDetalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblDetalleFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDetalleFocusGained

    private void tblDetalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblDetalleFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDetalleFocusLost

    private void tblDetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDetalleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDetalleKeyTyped
    
     private java.awt.Robot robot = null;

    public void PresionarEnter() {

        try {
            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_ENTER); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_ENTER); // Simula soltar la tecla

        } catch (AWTException e) {
            throw new RuntimeException("Error");
        }

    }
    public void validaSeriales() {
        DefaultTableModel modelo = (DefaultTableModel) tblDetalle.getModel();                
        int fila = -1;
        double sumaDigitado = 0.0;
        int columna = 5;
        for (int row : tblDetalle.getSelectedRows()) {
            fila = row;
        }
        if(tblDetalle.getValueAt(fila, tblDetalle.getSelectedColumn()).toString().equals("")){
              
            return;
        }
        double valorDigitado = Double.parseDouble(tblDetalle.getValueAt(fila, columna).toString().replace(",", ".")) * Double.parseDouble(tblDetalle.getValueAt(fila, 11).toString());
        double Stock = Double.parseDouble(tblDetalle.getValueAt(fila, 3).toString().replace(",", ".")) * Double.parseDouble(tblDetalle.getValueAt(fila, 11).toString());
        sumaDigitado = valorDigitado;
        if (valorDigitado > Stock) {
            metodos.msgAdvertenciaAjustado(null, "¡Cantidad insuficientes en Stock!");
            tblDetalle.setValueAt(0, fila, columna);
            return;
        }

        if (tipoProducto.equals("Imei") || tipoProducto.equals("Serial") || tipoProducto.equals("SerialColor")) {

        } else if (tipoProducto.equals("Color") || tipoProducto.equals("ColorTalla") || tipoProducto.equals("Talla")) {

        } else if (tipoProducto.equals("Fecha/Lote")) {
            String lote = tblDetalle.getValueAt(fila, 0).toString();
            String fecha = tblDetalle.getValueAt(fila, 1).toString();
            String temperatura = tblDetalle.getValueAt(fila, 2).toString();

            for (int i = 0; i < modelo.getRowCount(); i++) {
                if (fila != i && modelo.getValueAt(i, 0).equals(lote) && modelo.getValueAt(i, 1).equals(fecha) && modelo.getValueAt(i, 2).equals(temperatura)) {
                    sumaDigitado += Double.parseDouble(tblDetalle.getValueAt(i, 5).toString()) * Double.parseDouble(tblDetalle.getValueAt(i, 11).toString());
                }
            }
        }
        
        if (sumaDigitado > Stock) {              
            metodos.msgAdvertenciaAjustado(null, "¡Cantidad insuficientes en Stock!");
            tblDetalle.setValueAt(0, fila, columna);
            return;
        }
    }
    
    public void ventanaTallas(String nit) {
        buscTallas buscar = new buscTallas(instancias.getMenu(), rootPaneCheckingEnabled);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscTallas(buscar);
        instancias.setCampoActual(txtTalla);
        txtTalla.requestFocus();
        buscar.setInstancia(instancias);
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public void ventanaColores1(String nit) {
        buscColores buscar = new buscColores(instancias.getMenu(), rootPaneCheckingEnabled);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscColores(buscar);
        instancias.setCampoActual(txtColor);
        txtColor.requestFocus();
        buscar.setInstancia(instancias);
        buscar.noEncontrado(nit);
        buscar.show();
    }

//    public void ventanaTallas(String nit) {
//        buscTallas buscar = new buscTallas(instancias.getMenu(), rootPaneCheckingEnabled);
//        buscar.setLocationRelativeTo(null);
//        instancias.setBuscTallas(buscar);
//        instancias.setCampoActual(txtTalla);
//        txtTalla.requestFocus();
//        buscar.setInstancia(instancias);
//        buscar.noEncontrado(nit);
//        buscar.show();
//    }
//
//    public void ventanaTallas1(String nit) {
//        buscTallas buscar = new buscTallas(instancias.getMenu(), rootPaneCheckingEnabled);
//        buscar.setLocationRelativeTo(null);
//        instancias.setBuscTallas(buscar);
//        instancias.setCampoActual(txtTalla2);
//        txtTalla2.requestFocus();
//        buscar.setInstancia(instancias);
//        buscar.noEncontrado(nit);
//        buscar.show();
//    }
//
//    public void ventanaColores(String nit) {
//        buscColores buscar = new buscColores(instancias.getMenu(), rootPaneCheckingEnabled);
//        buscar.setLocationRelativeTo(null);
//        instancias.setBuscColores(buscar);
//        instancias.setCampoActual(txtColor2);
//        txtColor2.requestFocus();
//        buscar.setInstancia(instancias);
//        buscar.noEncontrado(nit);
//        buscar.show();
//    }
    public void ventanaColores2(String nit) {
        buscColores buscar = new buscColores(instancias.getMenu(), rootPaneCheckingEnabled);
        buscar.setLocationRelativeTo(null);
        instancias.setBuscColores(buscar);
        instancias.setCampoActual(txtColor1);
        txtColor1.requestFocus();
        buscar.setInstancia(instancias);
        buscar.noEncontrado(nit);
        buscar.show();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dlgCompraDetallada1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgCompraDetallada1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgCompraDetallada1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgCompraDetallada1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                dlgCompraDetallada1 dialog = new dlgCompraDetallada1(new javax.swing.JFrame(), true, "", "", null, "", "", "", "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarColor;
    private javax.swing.JButton btnCargarFecha;
    private javax.swing.JButton btnCargarImei;
    private com.toedter.calendar.JDateChooser dtFVence;
    private javax.swing.ButtonGroup filtro;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Object> jComboBoxPlu;
    private javax.swing.JComboBox<Object> jComboBoxPluImeiColor;
    private javax.swing.JComboBox<Object> jComboBoxPluTallaColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelPlu;
    private javax.swing.JLabel jLabelPlu1;
    private javax.swing.JLabel jLabelPlu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbColor;
    private javax.swing.JLabel lbColor1;
    private javax.swing.JLabel lbFiltro1;
    private javax.swing.JLabel lbFiltro2;
    private javax.swing.JLabel lbFiltro3;
    private javax.swing.JLabel lbImei;
    private javax.swing.JLabel lbTalla;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnlBuscadorColorTalla;
    private javax.swing.JPanel pnlColor;
    private javax.swing.JPanel pnlFechaLote;
    private javax.swing.JPanel pnlImei;
    private javax.swing.JMenuItem popBorrar;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCant1;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtColor1;
    private javax.swing.JTextField txtFiltro1;
    private javax.swing.JTextField txtFiltro2;
    private javax.swing.JTextField txtFiltro3;
    private javax.swing.JTextField txtImei;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
//
//    private void registerKeyboardAction(ActionListener accionTeclas, String cerrar, KeyStroke CTRL_G, int WHEN_IN_FOCUSED_WINDOW) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
