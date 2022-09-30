package clases;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author .CLIK
 */
public class publicidadInicio extends Thread {

    int validador = 1;
    JLabel etiqueta;

    // Constructor, getter & setter
    public publicidadInicio(JLabel etiqueta) {

        this.etiqueta = etiqueta;
    }

    @Override
    public void run() {
        int i = 0;
        while (1 == 1) {
            i++;

            //File fichero = new File(Paths.get(System.getProperty("user.dir") + "\\imagenes\\inicio\\" + i + ".png").toString());
            String idImagen = "inicio\\" + i + ".png";
            if (Instancias.getInstancias().getSql().imagenExiste(idImagen)) {
                ImageIcon fot = new ImageIcon(Instancias.getInstancias().getSql().getImagen( "inicio\\" + i + ".png"));
                Icon icono = new ImageIcon(fot.getImage());
//                 Icon icono = new ImageIcon(fot.getImage().getScaledInstance(etiqueta.getSize().width, etiqueta.getSize().height, Image.SCALE_DEFAULT));
                etiqueta.setIcon(icono);
                etiqueta.repaint();
            } else {
                i = 1;
                ImageIcon fot = new ImageIcon(Instancias.getInstancias().getSql().getImagen( "inicio\\" + i + ".png"));
//                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(etiqueta.getSize().width, etiqueta.getSize().height, Image.SCALE_DEFAULT));
                Icon icono = new ImageIcon(fot.getImage());
                etiqueta.setIcon(icono);
                etiqueta.repaint();
            }

            if (validador == 1) {
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                validador = 0;
            } else {
                esperarXsegundos(20);
            }
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
