package movie.reservation.system;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author nadinCodeHat
 */
public class Login_Frm extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;
    int posX=0,posY=0;
    
    public Login_Frm() {
        initComponents();
        //Draggable frame
        this.addMouseListener(new MouseAdapter()
        {
           public void mousePressed(MouseEvent e)
           {
              posX=e.getX();
              posY=e.getY();
           }
        });
        this.addMouseMotionListener(new MouseAdapter()
        {
            public void mouseDragged(MouseEvent evt)
            {
               //sets frame position when mouse dragged			
               setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
            }
        });
        //Draggable frame end
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        forgotPassword_link = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        login_Btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        createAccount_link = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 34, 54));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBackground(new java.awt.Color(21, 20, 31));
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");
        login_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 16, 42));
        jLabel2.setText("Login");
        login_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome back! Lets get started");
        login_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        jTextField1.setBackground(new java.awt.Color(21, 20, 31));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setToolTipText("");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        login_panel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 220, 30));

        forgotPassword_link.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        forgotPassword_link.setForeground(new java.awt.Color(235, 16, 42));
        forgotPassword_link.setText("Forgot Password?");
        login_panel.add(forgotPassword_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, 20));

        jTextField2.setBackground(new java.awt.Color(21, 20, 31));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setToolTipText("");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        login_panel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 220, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        login_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 20));

        login_Btn.setBackground(new java.awt.Color(235, 16, 42));
        login_Btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_Btn.setForeground(new java.awt.Color(255, 255, 255));
        login_Btn.setText("Login");
        login_panel.add(login_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 220, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New User?");
        login_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, 20));

        createAccount_link.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createAccount_link.setForeground(new java.awt.Color(235, 16, 42));
        createAccount_link.setText("Create Account");
        login_panel.add(createAccount_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, 20));

        getContentPane().add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 310, 500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/assets/other/login_back.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 500));

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
            java.util.logging.Logger.getLogger(Login_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login_Frm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createAccount_link;
    private javax.swing.JLabel forgotPassword_link;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton login_Btn;
    private javax.swing.JPanel login_panel;
    // End of variables declaration//GEN-END:variables
}
