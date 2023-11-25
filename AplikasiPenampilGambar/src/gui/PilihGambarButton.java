/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;

/**
 *
 * @author USER
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnPanel = new javax.swing.JPanel();
        BtBjm = new javax.swing.JButton();
        BtHandil = new javax.swing.JButton();
        BtBjb = new javax.swing.JButton();
        BtKeluar = new javax.swing.JButton();
        ImagePanel = new javax.swing.JPanel();
        ImgBass = new javax.swing.JLabel();
        ImgHiu = new javax.swing.JLabel();
        ImgOrangMancing = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnPanel.setBackground(new java.awt.Color(102, 102, 102));

        BtBjm.setText("Ikan Bass");
        BtBjm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBjmActionPerformed(evt);
            }
        });
        BtnPanel.add(BtBjm);

        BtHandil.setText("Ikan Hiu");
        BtHandil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHandilActionPerformed(evt);
            }
        });
        BtnPanel.add(BtHandil);

        BtBjb.setText("Orang Mancing");
        BtBjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBjbActionPerformed(evt);
            }
        });
        BtnPanel.add(BtBjb);

        BtKeluar.setText("Keluar");
        BtKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtKeluarActionPerformed(evt);
            }
        });
        BtnPanel.add(BtKeluar);

        getContentPane().add(BtnPanel, java.awt.BorderLayout.PAGE_START);

        ImagePanel.setBackground(new java.awt.Color(51, 255, 255));
        ImagePanel.setLayout(new java.awt.CardLayout());

        ImgBass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgBass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Ikan Largemouth Bass.jpg"))); // NOI18N
        ImagePanel.add(ImgBass, "0");

        ImgHiu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgHiu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ikan-hiu-_140504174756-289.jpg"))); // NOI18N
        ImagePanel.add(ImgHiu, "1");

        ImgOrangMancing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgOrangMancing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images.jpeg"))); // NOI18N
        ImagePanel.add(ImgOrangMancing, "2");

        getContentPane().add(ImagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtBjmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBjmActionPerformed
        CardLayout cl = (CardLayout)(ImagePanel.getLayout());
        cl.show(ImagePanel, "0");
    }//GEN-LAST:event_BtBjmActionPerformed

    private void BtHandilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHandilActionPerformed
        CardLayout cl = (CardLayout)(ImagePanel.getLayout());
        cl.show(ImagePanel, "1");
    }//GEN-LAST:event_BtHandilActionPerformed

    private void BtBjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBjbActionPerformed
        CardLayout cl = (CardLayout)(ImagePanel.getLayout());
        cl.show(ImagePanel, "2");
    }//GEN-LAST:event_BtBjbActionPerformed

    private void BtKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtKeluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBjb;
    private javax.swing.JButton BtBjm;
    private javax.swing.JButton BtHandil;
    private javax.swing.JButton BtKeluar;
    private javax.swing.JPanel BtnPanel;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JLabel ImgBass;
    private javax.swing.JLabel ImgHiu;
    private javax.swing.JLabel ImgOrangMancing;
    // End of variables declaration//GEN-END:variables
}
