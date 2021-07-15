package movie.reservation.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nadinCodeHat
 */
public class SignUp_Frm extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;
    int posX=0,posY=0;
    
    public SignUp_Frm() {
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
        miniBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBackground(new java.awt.Color(21, 20, 31));
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Password");
        login_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 300, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 16, 42));
        jLabel2.setText("Register");
        login_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("account to join with us.");
        login_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 110, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");
        login_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 370, -1, 20));

        signup_Btn.setBackground(new java.awt.Color(255, 255, 255));
        signup_Btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signup_Btn.setForeground(new java.awt.Color(255, 255, 255));
        signup_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/assets/components/registerBtn.png"))); // NOI18N
        signup_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signup_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signup_BtnMouseExited(evt);
            }
        });
        signup_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_BtnActionPerformed(evt);
            }
        });
        login_panel.add(signup_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 470, 220, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Have an account?");
        login_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 520, -1, 20));

        login_link.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link.setForeground(new java.awt.Color(235, 16, 42));
        login_link.setText("Go to Login");
        login_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_linkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_linkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_linkMouseExited(evt);
            }
        });
        login_panel.add(login_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 520, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Welcome to BrainCell, Create an");
        login_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 90, -1, 20));

        email_TextField.setBackground(new java.awt.Color(21, 20, 31));
        email_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_TextField.setForeground(new java.awt.Color(255, 255, 255));
        email_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_TextField.setToolTipText("");
        email_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        email_TextField.setCaretColor(new java.awt.Color(255, 255, 255));
        email_TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_panel.add(email_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 260, 220, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        login_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 230, -1, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Full Name");
        login_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 160, -1, 20));

        fullname_TextField.setBackground(new java.awt.Color(21, 20, 31));
        fullname_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fullname_TextField.setForeground(new java.awt.Color(255, 255, 255));
        fullname_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fullname_TextField.setToolTipText("");
        fullname_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        fullname_TextField.setCaretColor(new java.awt.Color(255, 255, 255));
        fullname_TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_panel.add(fullname_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 190, 220, 30));

        confirmPassword_TextField.setBackground(new java.awt.Color(21, 20, 31));
        confirmPassword_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmPassword_TextField.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassword_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        confirmPassword_TextField.setCaretColor(new java.awt.Color(255, 255, 255));
        confirmPassword_TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_panel.add(confirmPassword_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 400, 220, 30));

        createPassword_TextField.setBackground(new java.awt.Color(21, 20, 31));
        createPassword_TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createPassword_TextField.setForeground(new java.awt.Color(255, 255, 255));
        createPassword_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        createPassword_TextField.setCaretColor(new java.awt.Color(255, 255, 255));
        createPassword_TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_panel.add(createPassword_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 330, 220, 30));

        miniBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/assets/components/miniBtn.png"))); // NOI18N
        miniBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miniBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniBtnMouseExited(evt);
            }
        });
        miniBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniBtnActionPerformed(evt);
            }
        });
        login_panel.add(miniBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 16, 16));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/assets/components/exitBtn.png"))); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        login_panel.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 16, 16));

        getContentPane().add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 310, 600));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/assets/other/signup_back.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Use password hash
    private void signup_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_BtnActionPerformed
        if(validate_info() && checkEmail(email_TextField.getText())){
            
            String name = fullname_TextField.getText();
            String userEmail = email_TextField.getText();
            try{
                String insertUsersQuery = "INSERT INTO `users` (email, password_hash, name, role_id) VALUES(?,?,?,?)";
                pst = DBConnectClass.getConnection().prepareStatement(insertUsersQuery);
                
                pst.setString(1, userEmail);
                pst.setString(2, String.valueOf(confirmPassword_TextField.getPassword()));
                pst.setString(3, name);
                pst.setString(4, "2");
                pst.execute();
                
//                String FromEmail = "nadinpethiyagoda4@gmail.com";
//                String FromEmailPassword= "ENTER YOUR PASSWORD";
//
//                Properties props = new Properties();
//
//                props.put("mail.smtp.user","username"); 
//                props.put("mail.debug", "true"); 
//                props.put("mail.smtp.auth", "true"); 
//                props.put("mail.smtp.starttls.enable","true");
//                props.put("mail.smtp.host", "smtp.gmail.com"); 
//                props.put("mail.smtp.port", "587");
//                props.put("mail.smtp.EnableSSL.enable","true");
//                props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
//                props.setProperty("mail.smtp.socketFactory.fallback", "false");   
//                props.setProperty("mail.smtp.port", "465");   
//                props.setProperty("mail.smtp.socketFactory.port", "465"); 
//
//                Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
//                @Override
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(FromEmail, FromEmailPassword);
//                    }
//                });
//
//                try{
//                    MimeMessage message = new MimeMessage(session);
//                    message.setFrom(new InternetAddress(FromEmail));
//                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
//                    message.setSubject("BrainCell User Account SignUp");
//                    message.setText("Hello "+fullName+" thankyou for joining with BrainCell Cinema!");
//                    Transport.send(message);
//                } catch (MessagingException e){
//                    JOptionPane.showMessageDialog(null,"Something happened!");
//                    throw new RuntimeException(e);
//                }
            }catch(SQLException ex){
                Logger.getLogger(SignUp_Frm.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                JOptionPane.showMessageDialog(null, "Account created successfully!","Successful",2);
            }
        }
    }//GEN-LAST:event_signup_BtnActionPerformed

    private void signup_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_BtnMouseEntered
        try {
            Image signupBtnHoverImg = ImageIO.read(getClass().getResource("/movie/reservation/system/assets/components/registerBtnHover.png"));
            signup_Btn.setIcon(new ImageIcon(signupBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(SignUp_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signup_BtnMouseEntered

    private void signup_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_BtnMouseExited
        try {
            Image signupBtnImg = ImageIO.read(getClass().getResource("/movie/reservation/system/assets/components/registerBtn.png"));
            signup_Btn.setIcon(new ImageIcon(signupBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(SignUp_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signup_BtnMouseExited

    private void login_linkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_linkMouseEntered
        login_link.setForeground(new Color(209, 15, 38));
    }//GEN-LAST:event_login_linkMouseEntered

    private void login_linkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_linkMouseExited
        login_link.setForeground(new Color(235, 16, 42));
    }//GEN-LAST:event_login_linkMouseExited

    private void login_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_linkMouseClicked
        Login_Frm lgnFrm = new Login_Frm();
        lgnFrm.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_login_linkMouseClicked

    private void miniBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseEntered
        try {
            Image miniBtnHoverImg = ImageIO.read(getClass().getResource("/movie/reservation/system/assets/components/miniBtnHover.png"));
            miniBtn.setIcon(new ImageIcon(miniBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miniBtnMouseEntered

    private void miniBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseExited
        try {
            Image miniBtnImg = ImageIO.read(getClass().getResource("/movie/reservation/system/assets/components/miniBtn.png"));
            miniBtn.setIcon(new ImageIcon(miniBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miniBtnMouseExited

    private void miniBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniBtnActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniBtnActionPerformed

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        try {
            Image exitBtnHoverImg = ImageIO.read(getClass().getResource("/movie/reservation/system/assets/components/exitBtnHover.png"));
            exitBtn.setIcon(new ImageIcon(exitBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        try {
            Image exitBtnImg = ImageIO.read(getClass().getResource("/movie/reservation/system/assets/components/exitBtn.png"));
            exitBtn.setIcon(new ImageIcon(exitBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnMouseExited

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    //validate fields
    public boolean validate_info(){
        String fullname = fullname_TextField.getText();
        String email = email_TextField.getText();
        String createpass = String.valueOf(createPassword_TextField.getPassword());
        String confirmpass = String.valueOf(confirmPassword_TextField.getPassword());
        
        //check empty fields
        if (fullname.trim().equals("") || email.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill the empty field(s)","Empty Field",2);
            return false;
        }
        if (createpass.trim().equals("") || confirmpass.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please create a password","Empty Password",2);
            return false;
        }
        if (createpass.trim().equals("") || (!createpass.equals(confirmpass))){
            JOptionPane.showMessageDialog(null, "Passwords do not match","Confirm Password",2);
            return false;
        }
        else {
            return true;
        }
    }
    
    //Check for duplicate emails
    public boolean checkEmail(String email){
        boolean email_notexists = true;
        String query = "SELECT COUNT(*) FROM `users` WHERE `email` = ?";
        try {
            pst = DBConnectClass.getConnection().prepareStatement(query);
            pst.setString(1,email);
            rs = pst.executeQuery();
            rs.next();
            if(rs.getInt(1)!=0){
                email_notexists = false;
                JOptionPane.showMessageDialog(null, "An account exists by this email, please enter different email.", "Email Duplicate",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return email_notexists;
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
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField fullname_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel login_link;
    private javax.swing.JPanel login_panel;
    private javax.swing.JButton miniBtn;
    private javax.swing.JButton signup_Btn;
    // End of variables declaration//GEN-END:variables
}
