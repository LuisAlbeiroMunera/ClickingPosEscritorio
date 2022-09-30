/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author .CLIK
 */
public class publicidadFactura extends Thread {

    JLabel etiqueta;

    // Constructor, getter & setter
    public publicidadFactura(JLabel etiqueta) {

        this.etiqueta = etiqueta;
    }

    @Override
    public void run() {
        int i = 0;
        while (1 == 1) {
            i++;
                       
            //File fichero = new File(Paths.get(System.getProperty("user.dir") + "\\imagenes\\publicidad\\" + i + ".jpg").toString());
           String idImagen = "publicidad\\" + i + ".jpg";
           if (Instancias.getInstancias().getSql().imagenExiste(idImagen)) {
                ImageIcon fot = new ImageIcon(Instancias.getInstancias().getSql().getImagen( "publicidad\\" + i + ".jpg"));
                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(etiqueta.getSize().width - 5, etiqueta.getSize().height - 5, Image.SCALE_DEFAULT));
                etiqueta.setIcon(icono);
                etiqueta.repaint();
           }else {
                i = 1;
                ImageIcon fot = new ImageIcon(Instancias.getInstancias().getSql().getImagen( "publicidad\\" + i + ".jpg"));
                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(etiqueta.getSize().width - 5, etiqueta.getSize().height - 5, Image.SCALE_DEFAULT));
                etiqueta.setIcon(icono);
                etiqueta.repaint();
            }
            esperarXsegundos(2);
        }
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
