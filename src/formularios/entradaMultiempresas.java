package formularios;
import logs.Logs;
import clases.Instancias;
import clases.SQL;
import clases.metodosGenerales;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class entradaMultiempresas extends JPanel implements MouseListener {

    private SQL sql;
    Instancias instancias;
    private JLabel imagen, texto;
    private String BD, desc;
    private metodosGenerales metodos;
    frmIngresarMulti ini;
    Inicio ventanaIni;

    public entradaMultiempresas(String descripcion, String base, frmIngresarMulti ventana, Inicio ventanaInicial) {
        ini = ventana;
        ventanaIni = ventanaInicial;
        metodos = new metodosGenerales();
        instancias = Instancias.getInstancias();
        BD = base;
        desc = descripcion;

        this.setSize(206, 80);
        this.setLayout(null);

        imagen = new JLabel();
        imagen.setBounds(0, 0, this.getWidth(), this.getHeight());
        this.add(imagen);

        String idImagen = "logo_empresas\\" + BD  + ".png";
        if (Instancias.getInstancias().getSql().imagenExiste(idImagen)) {
           ImageIcon fot = new ImageIcon(Instancias.getInstancias().getSql().getImagen(idImagen));
           texto = new JLabel(fot);
           texto.setIcon(fot);  
           texto.setText("");
           texto.setToolTipText(descripcion.toUpperCase());
        } else {
            texto = new JLabel(descripcion.toUpperCase());
            texto.setSize(texto.getPreferredSize());
            texto.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        }                                               

        texto.setBounds(0, 0, 206, 80);
        texto.addMouseListener(this);
        this.add(texto);

        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setBackground(Color.WHITE);
        this.addMouseListener(this);
        this.setBackground(new Color(225, 225, 225));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.drawRect(0, 0, 150, 60);
//        g.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Logs.log("Entrando a la empresa "+desc);
        instancias.getSql().SQL1(BD, true);
        sql = new SQL();
        System.err.println("iniciarAplicacion 6");
        ventanaIni.iniciarAplicacion("- " + desc);
        ini.dispose();
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
