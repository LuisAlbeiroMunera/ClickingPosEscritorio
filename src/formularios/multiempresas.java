package formularios;

import clases.SQL;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class multiempresas extends JPanel {

    private int numeroEmpresas;
    private entradaMultiempresas mesas[];
    private SQL sql;
    private int tamañoX, tamañoY;

    public multiempresas(int tamañoX, int tamañoY, Object[][] empresas, frmIngresarMulti ventana, Inicio ventanaInicial) {

        this.tamañoX = tamañoX;
        this.tamañoY = tamañoY;
        this.sql = new SQL();

        this.setSize(tamañoX, tamañoY);
        this.setLayout(null);

        numeroEmpresas = empresas.length;
        mesas = new entradaMultiempresas[numeroEmpresas];

        int i = 0;
        for (Object[] producto : empresas) {
            mesas[i] = new entradaMultiempresas(producto[1].toString(), producto[2].toString(), ventana, ventanaInicial);
            mesas[i].setBounds(0, 0, mesas[i].getWidth(), mesas[i].getHeight());
            this.add(mesas[i]);
            i++;
        }

        this.setBackground(Color.WHITE);
    }

    public entradaMultiempresas[] getMesas() {
        return mesas;
    }

    @Override
    public void paint(Graphics g) {
        int x = 10, y = 10;
        for (int i = 0; i < numeroEmpresas; i++) {
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
//        this.setBackground(new Color(240, 240, 240));
        return new Dimension(426, 578);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        multiempresas panel = new multiempresas(426, 578, null, null, null);
//        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setBackground(Color.orange);
        frame.setBackground(Color.orange);

//        panel.setBounds(0, 0, 440, 620);
        frame.add(panel);
        panel.setVisible(true);
        frame.setVisible(true);
    }

}
