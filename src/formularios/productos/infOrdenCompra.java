package formularios.productos;

import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.table.DefaultTableModel;

public class infOrdenCompra extends javax.swing.JInternalFrame {

    private pnlIngreso pnlIngreso;
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;
    DefaultTableModel modelo;

    public pnlIngreso getPnlIngreso() {
        return pnlIngreso;
    }
    public void setPnlIngreso(pnlIngreso pnlIngreso) {
        this.pnlIngreso = pnlIngreso;
    }

    public infOrdenCompra() {
        initComponents();

        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        setBorder(null);
        repaint();

        pnlIngreso = new pnlIngreso("ordenCompra");
        pnlIngreso.setSize(pnlContenedor.getSize());
        pnlContenedor.add(pnlIngreso, CENTER_ALIGNMENT);
        pnlContenedor.revalidate();
        pnlContenedor.repaint();
        pnlContenedor.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlContenedor = new javax.swing.JPanel();

        pnlContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedor.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                pnlContenedorComponentResized(evt);
            }
        });

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnlContenedor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlContenedorComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlContenedorComponentResized
        pnlIngreso.setSize(pnlContenedor.getSize());
    }//GEN-LAST:event_pnlContenedorComponentResized


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlContenedor;
    // End of variables declaration//GEN-END:variables
}
