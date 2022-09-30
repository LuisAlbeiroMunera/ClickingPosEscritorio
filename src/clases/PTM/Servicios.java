package clases.PTM;

import clases.SQL;
import co.com.tecnofactor.ptfcc.modelo.ws.xsd.ProductoWS;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Servicios extends JPanel {

    private int numeroServicios;
    private desingServicios mesas[];
    private SQL sql;
    private int tamañoX, tamañoY;

//    public Servicios(int tamañoX, int tamañoY, List<ProductoWS[]> var1, Object[][] productos) {
    public Servicios(int tamañoX, int tamañoY, ProductoWS[] var1, Object[][] productos) {

        this.tamañoX = tamañoX;
        this.tamañoY = tamañoY;
        this.sql = new SQL();

        this.setSize(tamañoX, tamañoY);
        this.setLayout(null);

        if (productos == null) {
//            numeroServicios = var1.size;
            numeroServicios = var1.length;
            mesas = new desingServicios[numeroServicios];

            int i = 0;
            for (ProductoWS variable1 : var1) {
                mesas[i] = new desingServicios(variable1.getNombre(), variable1.getCodigo());
                mesas[i].setBounds(0, 0, mesas[i].getWidth(), mesas[i].getHeight());
                this.add(mesas[i]);
                i++;
            }
        } else {
            numeroServicios = productos.length;
            mesas = new desingServicios[numeroServicios];

            int i = 0;
            for (Object[] producto : productos) {
                mesas[i] = new desingServicios(producto[1].toString(), Integer.parseInt(producto[0].toString()));
                mesas[i].setBounds(0, 0, mesas[i].getWidth(), mesas[i].getHeight());
                this.add(mesas[i]);
                i++;
            }
        }

        this.setBackground(Color.WHITE);
    }

    public desingServicios[] getMesas() {
        return mesas;
    }

    @Override
    public void paint(Graphics g) {
        int x = 10, y = 10;
        for (int i = 0; i < numeroServicios; i++) {
            mesas[i].setBounds(x, y, mesas[i].getWidth(), mesas[i].getHeight());

            this.add(mesas[i]);
            x += +mesas[i].getWidth() + 10;
            if (x >= (this.getWidth() - 200)) {
                y += mesas[i].getHeight() + 10;
                x = 10;
            }
        }
        super.paint(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1000, 20000);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        Servicios panel = new Servicios(5000, 5000, null, null);
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBounds(0, 0, 5000, 5000);
        frame.add(panel);
        panel.setVisible(true);
        frame.setVisible(true);
    }

}
