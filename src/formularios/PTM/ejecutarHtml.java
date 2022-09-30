package formularios.PTM;

import clases.Instancias;
import clases.metodosGenerales;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

public class ejecutarHtml extends javax.swing.JDialog {

    Instancias instancias;
    JEditorPane panelEditor;
    JScrollPane editorScrollPane;
    metodosGenerales metodos;
    JButton boton1;

    public ejecutarHtml(java.awt.Frame parent, boolean modal, String ruta) {
        super(parent, modal);

        instancias = Instancias.getInstancias();
        metodos = new metodosGenerales();
        panelEditor = new JEditorPane();
        panelEditor.setEditable(false);

        try {
            panelEditor.setPage(new URL(ruta));
        } catch (IOException ex) {
            Logger.getLogger(ejecutarHtml.class.getName()).log(Level.SEVERE, null, ex);
        }

        editorScrollPane = new JScrollPane(panelEditor);

        editorScrollPane.setBorder(null);
        this.getContentPane().add(editorScrollPane);
        initComponents();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                instancias.setConfirmarServicio(false);
                dispose();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setText("REALIZAR");
        jButton1.setPreferredSize(new java.awt.Dimension(170, 45));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.setPreferredSize(new java.awt.Dimension(170, 45));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {
//        }
//
//        if (metodos.msgPregunta(null, "¿Realizar la venta?") == 0) {
//            instancias.setConfirmarServicio(true);
//            this.dispose();
//        } else {
//            instancias.setConfirmarServicio(false);
//            this.dispose();
//        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        instancias.setConfirmarServicio(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        instancias.setConfirmarServicio(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ejecutarHtml dialog = new ejecutarHtml(new javax.swing.JFrame(), true, ""); //Modificar esta línea
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
