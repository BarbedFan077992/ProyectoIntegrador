/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.proyectointegrador.View;

import ucr.ac.cr.tm2100.g3.proyectointegrador.Controller.GameController;

/**
 *
 * @author casa
 */
public class GUIGame extends javax.swing.JFrame {

    /**
     * Creates new form GUIGame
     */
    public GUIGame(GameController controller) {
        initComponents();
    }
    
    public void escuchar(GameController controller){
        btnOut.addActionListener(controller);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOut.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        btnOut.setText("Salir :|");
        btnOut.setActionCommand("OutGame");
        getContentPane().add(btnOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 220, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Laberinto.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOut;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
