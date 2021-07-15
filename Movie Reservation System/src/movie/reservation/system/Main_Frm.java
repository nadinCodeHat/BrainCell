package movie.reservation.system;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 *
 * @author nadinCodeHat
 */
public class Main_Frm extends javax.swing.JFrame {

    public Main_Frm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        brainCellLogo = new javax.swing.JLabel();
        myTicketsBtn = new javax.swing.JButton();
        moviesBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1260, 700));
        setMinimumSize(new java.awt.Dimension(1260, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1260, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(36, 34, 54));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brainCellLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        brainCellLogo.setForeground(new java.awt.Color(235, 16, 42));
        brainCellLogo.setText("BrainCell");
        sidePanel.add(brainCellLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        myTicketsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/assets/components/myBookingsBtn.png"))); // NOI18N
        sidePanel.add(myTicketsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 35));

        moviesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/assets/components/moviesBtnHover.png"))); // NOI18N
        sidePanel.add(moviesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 35));

        profileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/assets/components/profileBtn.png"))); // NOI18N
        sidePanel.add(profileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 35));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brainCellLogo;
    private javax.swing.JButton login_Btn;
    private javax.swing.JButton moviesBtn;
    private javax.swing.JButton myTicketsBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
