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
        login_link1 = new javax.swing.JLabel();
        login_link3 = new javax.swing.JLabel();
        login_link = new javax.swing.JLabel();
        login_link4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1260, 700));
        setMinimumSize(new java.awt.Dimension(1260, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1260, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(36, 34, 54));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_link1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_link1.setForeground(new java.awt.Color(235, 16, 42));
        login_link1.setText("BrainCell");
        sidePanel.add(login_link1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        login_link3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link3.setForeground(new java.awt.Color(235, 16, 42));
        login_link3.setText("Movies");
        login_link3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_link3MouseClicked(evt);
            }
        });
        sidePanel.add(login_link3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        login_link.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link.setForeground(new java.awt.Color(255, 255, 255));
        login_link.setText("Profile");
        sidePanel.add(login_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        login_link4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link4.setForeground(new java.awt.Color(255, 255, 255));
        login_link4.setText("My tickets");
        login_link4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_link4MouseClicked(evt);
            }
        });
        sidePanel.add(login_link4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_link3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_link3MouseClicked

    }//GEN-LAST:event_login_link3MouseClicked

    private void login_link4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_link4MouseClicked

    }//GEN-LAST:event_login_link4MouseClicked

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
    private javax.swing.JLabel login_link;
    private javax.swing.JLabel login_link1;
    private javax.swing.JLabel login_link3;
    private javax.swing.JLabel login_link4;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
