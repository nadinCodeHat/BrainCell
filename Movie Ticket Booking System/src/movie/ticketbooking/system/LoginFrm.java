package movie.ticketbooking.system;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author nadinCodeHat
 */
public class LoginFrm extends javax.swing.JFrame {

    public LoginFrm() {
        initComponents();
        loadFrameImage();
    }

    public void loadFrameImage() {
        try {
            setIconImage(ImageIO.read(new File("logo.png")));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        msgLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        forgotPasswordLink = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        createAccountLink = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        loginBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBackground(new java.awt.Color(255, 255, 255));
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(235, 16, 42));
        loginLabel.setText("Login");
        login_panel.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 40, -1, -1));

        msgLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        msgLabel.setText("Welcome back! Lets get started");
        login_panel.add(msgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 70, -1, 20));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailLabel.setText("Email");
        login_panel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 110, -1, 20));

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        login_panel.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 140, 220, 30));

        forgotPasswordLink.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        forgotPasswordLink.setForeground(new java.awt.Color(235, 16, 42));
        forgotPasswordLink.setText("Forgot Password?");
        forgotPasswordLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPasswordLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotPasswordLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotPasswordLinkMouseExited(evt);
            }
        });
        login_panel.add(forgotPasswordLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 180, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Password");
        login_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 180, -1, 20));

        loginBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/loginBtn.png"))); // NOI18N
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        login_panel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 250, 220, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("New user?");
        login_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 300, -1, 20));

        createAccountLink.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        createAccountLink.setForeground(new java.awt.Color(235, 16, 42));
        createAccountLink.setText("Create Account");
        createAccountLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccountLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createAccountLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createAccountLinkMouseExited(evt);
            }
        });
        login_panel.add(createAccountLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 300, -1, 20));

        passwordTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_panel.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 210, 220, 30));

        getContentPane().add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 310, 380));

        loginBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/other/loginBack.png"))); // NOI18N
        getContentPane().add(loginBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void forgotPasswordLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordLinkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotPasswordLinkMouseClicked

    private void forgotPasswordLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordLinkMouseEntered
        forgotPasswordLink.setForeground(new Color(209, 15, 38));
    }//GEN-LAST:event_forgotPasswordLinkMouseEntered

    private void forgotPasswordLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordLinkMouseExited
        forgotPasswordLink.setForeground(new Color(235, 16, 42));
    }//GEN-LAST:event_forgotPasswordLinkMouseExited

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        try {
            Image loginBtnHoverImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/loginBtnHover.png"));
            loginBtn.setIcon(new ImageIcon(loginBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(LoginFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        try {
            Image loginBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/loginBtn.png"));
            loginBtn.setIcon(new ImageIcon(loginBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(LoginFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if (validate_info()) {
            String email = emailTextField.getText();
            String password = String.valueOf(passwordTextField.getPassword());

            String query = "SELECT * FROM `users` WHERE `email` = '" + email + "' AND `password_hash` = '" + password + "'";
            try {
                ResultSet rs;
                try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Login Successful!");
                        if (rs.getInt("role_id") == 1) {
                            AdminMainFrm adminMFrm = new AdminMainFrm();
                            adminMFrm.setVisible(true);
                            this.dispose();
                        } else {
                            MainFrm mainFrm = new MainFrm(rs.getInt("id"));
                            mainFrm.setVisible(true);
                            this.dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Login, Please try again.", "Login", 2);
                    }
                }
                rs.close();
                DBConnectClass.getConnection().close();
            } catch (SQLException ex) {
                Logger.getLogger(LoginFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    //validate fields
    public boolean validate_info() {
        String email = emailTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());

        //check empty fields
        if (email.trim().equals("") || password.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the empty field(s)", "Empty Field", 2);
            return false;
        } else {
            return true;
        }
    }

    private void createAccountLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountLinkMouseExited
        createAccountLink.setForeground(new Color(235, 16, 42));
    }//GEN-LAST:event_createAccountLinkMouseExited

    private void createAccountLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountLinkMouseEntered
        createAccountLink.setForeground(new Color(209, 15, 38));
    }//GEN-LAST:event_createAccountLinkMouseEntered

    private void createAccountLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountLinkMouseClicked
        SignupFrm sngFrm = new SignupFrm();
        sngFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createAccountLinkMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createAccountLink;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel forgotPasswordLink;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel loginBack;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JPasswordField passwordTextField;
    // End of variables declaration//GEN-END:variables
}
