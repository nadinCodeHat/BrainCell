package movie.reservation.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author nadinCodeHat
 */
public class SignUp_Frm extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;

    public SignUp_Frm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        signup_Btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        login_link = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email_TextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fullname_TextField = new javax.swing.JTextField();
        confirmPassword_TextField = new javax.swing.JPasswordField();
        createPassword_TextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBackground(new java.awt.Color(21, 20, 31));
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Password");
        login_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 16, 42));
        jLabel2.setText("Sign Up");
        login_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("account to join us.");
        login_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");
        login_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 20));

        signup_Btn.setBackground(new java.awt.Color(235, 16, 42));
        signup_Btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signup_Btn.setForeground(new java.awt.Color(255, 255, 255));
        signup_Btn.setText("Sign Up");
        login_panel.add(signup_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 220, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Have an account?");
        login_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, 20));

        login_link.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link.setForeground(new java.awt.Color(235, 16, 42));
        login_link.setText("Go to Login");
        login_panel.add(login_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Welcome to BrainCell! Create an");
        login_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        email_TextField.setBackground(new java.awt.Color(21, 20, 31));
        email_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_TextField.setForeground(new java.awt.Color(255, 255, 255));
        email_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_TextField.setToolTipText("");
        email_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        email_TextField.setCaretColor(new java.awt.Color(255, 255, 255));
        email_TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_panel.add(email_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 220, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        login_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Full Name");
        login_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        fullname_TextField.setBackground(new java.awt.Color(21, 20, 31));
        fullname_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fullname_TextField.setForeground(new java.awt.Color(255, 255, 255));
        fullname_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fullname_TextField.setToolTipText("");
        fullname_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        fullname_TextField.setCaretColor(new java.awt.Color(255, 255, 255));
        fullname_TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_panel.add(fullname_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 220, 30));

        confirmPassword_TextField.setBackground(new java.awt.Color(21, 20, 31));
        confirmPassword_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmPassword_TextField.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassword_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        confirmPassword_TextField.setCaretColor(new java.awt.Color(255, 255, 255));
        confirmPassword_TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_panel.add(confirmPassword_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 220, 30));

        createPassword_TextField.setBackground(new java.awt.Color(21, 20, 31));
        createPassword_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createPassword_TextField.setForeground(new java.awt.Color(255, 255, 255));
        createPassword_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        createPassword_TextField.setCaretColor(new java.awt.Color(255, 255, 255));
        createPassword_TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_panel.add(createPassword_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 30));

        getContentPane().add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 310, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //validation function
    public boolean validate_info(){
        String fullname = fullname_TextField.getText();
        String email = email_TextField.getText();
        String createpass = String.valueOf(createPassword_TextField.getPassword());
        String confirmpass = String.valueOf(confirmPassword_TextField.getPassword());
        
        //check empty fields
        if (fullname.trim().equals("") || email.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill the empty field(s).","Empty Field",2);
            return false;
        }
        if (createpass.trim().equals("") || (!createpass.equals(confirmpass))){
            JOptionPane.showMessageDialog(null, "Passwords Do Not Match","Confirm Password",2);
            return false;
        }
        else{
            return true;  
        }
    }
    
    //check for duplicate emails
    public boolean checkEmail(String email){
        boolean username_exist = false;
        
        String query = "SELECT * FROM `customer_login_info` WHERE `email` = ?";

        try {
            pst = DBConnectClass.getConnection().prepareStatement(query);
            pst.setString(1,email);
            rs = pst.executeQuery();
            
            if(rs.next()){
                username_exist = true;
                JOptionPane.showMessageDialog(null, "The entered username is already taken, Please choose entered a different one", "Username Duplicate",2);
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username_exist;
    }
    
   
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
            java.util.logging.Logger.getLogger(SignUp_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPassword_TextField;
    private javax.swing.JPasswordField createPassword_TextField;
    private javax.swing.JTextField email_TextField;
    private javax.swing.JTextField fullname_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel login_link;
    private javax.swing.JPanel login_panel;
    private javax.swing.JButton signup_Btn;
    // End of variables declaration//GEN-END:variables
}
