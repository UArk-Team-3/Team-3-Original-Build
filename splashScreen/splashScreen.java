/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package splashScreen;

import java.io.File;

/**
 *
 * @author pjrios, sabubakarq
 *
 */
public class splashScreen extends javax.swing.JFrame {

    /**
     * Creates new form splashScreen
     */
    public splashScreen() {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(splashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
     * this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        LoadingAnimation = new javax.swing.JLabel();
        LoadingText = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(13, 12, 10));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 525));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 525));

        welcomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(204, 51, 0));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(welcomeLabel);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashScreen/images/logo_s.png"))); // NOI18N
        Background.setAlignmentY(0.0F);
        jPanel1.add(Background);

        LoadingAnimation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadingAnimation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashScreen/images/Spinner-1s-81px.gif"))); // NOI18N
        LoadingAnimation.setAlignmentY(0.0F);
        LoadingAnimation.setPreferredSize(new java.awt.Dimension(700, 60));
        jPanel1.add(LoadingAnimation);

        LoadingText.setForeground(new java.awt.Color(255, 255, 255));
        LoadingText.setText("  Loading...");
        LoadingText.setPreferredSize(new java.awt.Dimension(700, 15));
        jPanel1.add(LoadingText);

        LoadingBar.setBackground(new java.awt.Color(153, 0, 0));
        LoadingBar.setForeground(new java.awt.Color(204, 0, 51));
        LoadingBar.setPreferredSize(new java.awt.Dimension(700, 20));
        jPanel1.add(LoadingBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel1,
                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /* Runs the Splash Screen */
    public void start() {
        // set Splash Screen visible
        setVisible(true);
        try {
            // Increase loading bar percentage
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);

                // change loading message
                if (i == 10) {
                    LoadingText.setText("  Preparing interface...");
                } else if (i == 20) {
                    LoadingText.setText("  Prepating lazers...");
                } else if (i == 30) {
                    LoadingText.setText("  Loading backgrounds...");
                } else if (i == 40) {
                    LoadingText.setText("  Connecting to network...");
                } else if (i == 50) {
                    LoadingText.setText("  Preparing support page...");
                } else if (i == 60) {
                    LoadingText.setText("  Connecting to the Database...");
                } else if (i == 70) {
                    LoadingText.setText("  Preparing teams...");
                } else if (i == 80) {
                    LoadingText.setText("  You are almost there...");
                } else if (i == 90) {
                    LoadingText.setText("  Are you ready?");
                } else if (i == 100) {
                    LoadingText.setText("  Loading complete...");
                    Thread.sleep(100);
                }
                LoadingBar.setValue(i);
            }
            Thread.sleep(400);
            // hides Splash Screen
            setVisible(false);
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel LoadingAnimation;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
