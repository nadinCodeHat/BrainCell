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
public class Register_Frm extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;

    public Register_Frm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password_register_confirm_txt = new javax.swing.JPasswordField();
        password_register_txt = new javax.swing.JPasswordField();
        username_register_txt = new javax.swing.JTextField();
        first_name_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        register_btn = new javax.swing.JButton();
        last_name_txt1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        register_backPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(4, 95, 202));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(4, 95, 202));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        password_register_confirm_txt.setBackground(new java.awt.Color(4, 95, 202));
        password_register_confirm_txt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        password_register_confirm_txt.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(password_register_confirm_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, -1));

        password_register_txt.setBackground(new java.awt.Color(4, 95, 202));
        password_register_txt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        password_register_txt.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(password_register_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        username_register_txt.setBackground(new java.awt.Color(4, 95, 202));
        username_register_txt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        username_register_txt.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(username_register_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, -1));

        first_name_txt.setBackground(new java.awt.Color(4, 95, 202));
        first_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        first_name_txt.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(first_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, -1));

        email_txt.setBackground(new java.awt.Color(4, 95, 202));
        email_txt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        email_txt.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 220, -1));

        register_btn.setText("Register");
        register_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });
        jPanel1.add(register_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 220, 40));

        last_name_txt1.setBackground(new java.awt.Color(4, 95, 202));
        last_name_txt1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        last_name_txt1.setForeground(new java.awt.Color(204, 204, 255));
        last_name_txt1.setToolTipText("");
        jPanel1.add(last_name_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 100, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Go to Log In");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Already a member?");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, 260, 410));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(57, 65, 77));
        jLabel9.setText("To");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(57, 65, 77));
        jLabel10.setText("Cinema");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(57, 65, 77));
        jLabel11.setText("Welcome");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 65, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(57, 65, 77));
        jLabel12.setText("BrainCell");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, -1, -1));

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("- Enjoy BrainCell!");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("- Buy tickets, reserve seats and pay for them online");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("- Simple and Elegant User Interface");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("- Booking details are emailed");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/assets/icons/small logo.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 418, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(3, 29, 124));
        jLabel19.setText("BrainCell Cinema");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        register_backPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/assets/other/register_back.png"))); // NOI18N
        jPanel2.add(register_backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        if(validate_info()){
            if(!checkUsername(username_register_txt.getText())){
                try{
                    String query = "INSERT INTO `customer_info`(`first_name`, `last_name`, `email_address`) VALUES (?, ?, ?)";
                    con = DBConnectClass.getConnection();
                    pst = con.prepareStatement(query);
                    pst.setString(1, first_name_txt.getText());
                    pst.setString(2, first_name_txt.getText());
                    pst.setString(3, email_txt.getText());

                    //save image as blob in database
                    if (pst.executeUpdate() !=0) {
                        JOptionPane.showMessageDialog(null, "Register Successful : Your Account has been created");
                        String username = first_name_txt.getText();
                        String useremail = first_name_txt.getText();
                        String fromemail = "nadinpethiyagoda4@gmail.com";
                        String frompassword= "ENTER YOUR EMAIL PASSWORD";

                        Properties props = new Properties();

                        props.put("mail.smtp.user","username");

                        props.put("mail.debug", "true");
                        props.put("mail.smtp.auth", "true");
                        props.put("mail.smtp.starttls.enable","true");
                        props.put("mail.smtp.host", "smtp.gmail.com");
                        props.put("mail.smtp.port", "587");
                        props.put("mail.smtp.EnableSSL.enable","true");

                        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                        props.setProperty("mail.smtp.socketFactory.fallback", "false");
                        props.setProperty("mail.smtp.port", "465");
                        props.setProperty("mail.smtp.socketFactory.port", "465");

                        Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
                            @Override
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(fromemail, frompassword);
                            }
                        });

                        try{
                            MimeMessage message = new MimeMessage(session);
                            message.setFrom(new InternetAddress(fromemail));
                            message.addRecipient(Message.RecipientType.TO, new InternetAddress(useremail));
                            message.setSubject("BrainCell User Account Registration");
                            message.setText("Hello "+username+" thankyou for joining with BrainCell Theaters, Hope you enjoy our movies!");
                            Transport.send(message);

                            JOptionPane.showMessageDialog(null,"Email has been send to your account! Check your inbox");

                        } catch (MessagingException e)
                        {
                            JOptionPane.showMessageDialog(null,"Error : Message not sent");

                            throw new RuntimeException(e);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR :Check your information");
                    }
                }catch(RuntimeException | SQLException ex){
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }//GEN-LAST:event_register_btnActionPerformed

    //validation function
    public boolean validate_info(){
        String firstname = first_name_txt.getText();
        String lastname = first_name_txt.getText();
        String pass = String.valueOf(password_register_confirm_txt.getPassword());
        String confirmpass = String.valueOf(password_register_txt.getPassword());
        String email = email_txt.getText();
        
        //check empty fields
        if (firstname.trim().equals("") || lastname.trim().equals("") || email.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill the empty fields.","Empty Field",2);
            return false;
        }
        if (pass.trim().equals("") || (!pass.equals(confirmpass))){
            JOptionPane.showMessageDialog(null, "Passwords Do Not Match","Confirm Password",2);
            return false;
        }
        else{
            return true;  
        }
    }
    
    //check for duplicate usernames
    public boolean checkUsername(String username){
        boolean username_exist = false;
        
        String query = "SELECT * FROM `customer_login_info` WHERE `username` = ?";

        try {
            pst = DBConnectClass.getConnection().prepareStatement(query);
            pst.setString(1,username);
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
            java.util.logging.Logger.getLogger(Register_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField first_name_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField last_name_txt1;
    private javax.swing.JPasswordField password_register_confirm_txt;
    private javax.swing.JPasswordField password_register_txt;
    private javax.swing.JLabel register_backPanel;
    private javax.swing.JButton register_btn;
    private javax.swing.JTextField username_register_txt;
    // End of variables declaration//GEN-END:variables
}
