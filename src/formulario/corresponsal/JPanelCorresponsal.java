/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario.corresponsal;

import configuracion.Propiedades;

/**
 *
 * @author amgon
 */
public class JPanelCorresponsal extends java.awt.Panel {

    /**
     * Creates new form CORRES
     */
    SwingBrowser browser;
    public JPanelCorresponsal() {
        initComponents();
        CorresponsaBancario();        
    }
    
    public void CorresponsaBancario(){ 
        SwingBrowser browser = new SwingBrowser();
        browser.loadURL(Propiedades.getInstancia().getUrlClickingPosWeb()); 
//        browser.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        jPanel1.add(browser);
    }
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(null);
        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
