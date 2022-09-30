package clases.PTM;

import clases.Instancias;
import clases.metodosGenerales;
import formularios.PTM.dlgFormularios;
import formularios.Ventas.pnlFactura;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class desingServicios extends JPanel implements MouseListener {

    Instancias instancias;
    private JLabel imagen, texto;
    private int cod;
    private metodosGenerales metodos;

    public desingServicios(String descripcion, int codigo) {

        metodos = new metodosGenerales();
        instancias = Instancias.getInstancias();
        cod = codigo;

//        this.setSize(145, 145);
        this.setSize(155, 70);
        this.setLayout(null);

        imagen = new JLabel();
        imagen.setBounds(0, 0, this.getWidth(), this.getHeight());
        this.add(imagen);

//        texto = new JLabel(descripcion);
//        texto.setSize(texto.getPreferredSize());
//        texto.setFont(new Font("arial", Font.PLAIN, 11));
//        texto.setBounds(0, 60, texto.getWidth(), 40);
//        this.add(texto);
//        imagen.setText("<html><img src=\"https://www.comercialcard.com.co/DistribuidoresTFCC/themes/images/boton_productos/" + codigo + ".png\"></html>");
        BufferedImage bufferedImage = instancias.getSql().getImagen2("BotonProductosPTM\\"+ codigo + ".png");
        ImageIcon iconLogo = new ImageIcon(bufferedImage);
        Icon icono = new ImageIcon(iconLogo.getImage());
        imagen.setIcon(icono);
        this.repaint();
        
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setBackground(Color.WHITE);
        this.addMouseListener(this);
    }

    public void activar() {
        metodos.ponerIcono("/imagenes/camion.png", imagen);
    }

    public void desactivar() {
        metodos.ponerIcono("/imagenes/camion.png", imagen);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.drawRect(0, 0, 100, 50);
//        g.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object[][] datos = instancias.getServiciosPTM().datosServicio(String.valueOf(cod));

        boolean seVe = instancias.getMenu().getSeVeElMenu();
        if (seVe) {
            instancias.getMenu().ocultarMenu("");
        }

        dlgFormularios formulario = new dlgFormularios(null, true, cod, datos);
        formulario.setVisible(true);

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
