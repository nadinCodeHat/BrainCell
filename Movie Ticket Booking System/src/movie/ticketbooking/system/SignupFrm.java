package movie.ticketbooking.system;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
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
import javax.swing.JOptionPane;

/**
 *
 * @author nadinCodeHat
 */
public class SignupFrm extends javax.swing.JFrame {

    public SignupFrm() {
        initComponents();
        loadFrameImage();
    }

    public void loadFrameImage() {
        try {
            setIconImage(ImageIO.read(new File("logo.png")));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(SignupFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();
        createPasswordLabel = new javax.swing.JLabel();
        msgLabel2 = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        signupBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        login_link = new javax.swing.JLabel();
        msgLabel1 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        fullnameLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        fullnameTextField = new javax.swing.JTextField();
        confirmPasswordTextField = new javax.swing.JPasswordField();
        createPasswordTextField = new javax.swing.JPasswordField();
        signupBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUp");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBackground(new java.awt.Color(255, 255, 255));
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        registerLabel.setForeground(new java.awt.Color(235, 16, 42));
        registerLabel.setText("Register");
        login_panel.add(registerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 40, -1, -1));

        createPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        createPasswordLabel.setText("Create Password");
        login_panel.add(createPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 290, -1, 20));

        msgLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        msgLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msgLabel2.setText("account to join with us.");
        login_panel.add(msgLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 100, -1, 20));

        confirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        confirmPasswordLabel.setText("Confirm Password");
        login_panel.add(confirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 360, -1, 20));

        signupBtn.setBackground(new java.awt.Color(255, 255, 255));
        signupBtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/registerBtn.png"))); // NOI18N
        signupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupBtnMouseExited(evt);
            }
        });
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        login_panel.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 430, 220, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Have an account?");
        login_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, 20));

        login_link.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
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
        login_panel.add(login_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, 20));

        msgLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        msgLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msgLabel1.setText("Welcome to BrainCell, Create an");
        login_panel.add(msgLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 80, -1, 20));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailLabel.setText("Email");
        login_panel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 220, -1, 20));

        fullnameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fullnameLabel.setText("Full Name");
        login_panel.add(fullnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 150, -1, 20));

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_panel.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 250, 220, 30));

        fullnameTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_panel.add(fullnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 180, 220, 30));

        confirmPasswordTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_panel.add(confirmPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 390, 220, 30));

        createPasswordTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_panel.add(createPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 320, 220, 30));

        getContentPane().add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 310, 540));

        signupBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/other/signupBack.png"))); // NOI18N
        getContentPane().add(signupBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseEntered
        try {
            Image signupBtnHoverImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/registerBtnHover.png"));
            signupBtn.setIcon(new ImageIcon(signupBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(SignupFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signupBtnMouseEntered

    private void signupBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBtnMouseExited
        try {
            Image signupBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/registerBtn.png"));
            signupBtn.setIcon(new ImageIcon(signupBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(SignupFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signupBtnMouseExited

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        if (checkEmail(emailTextField.getText()) && validate_info()) {

            String name = fullnameTextField.getText();
            String userEmail = emailTextField.getText();
            try {
                String insertUsersQuery = "INSERT INTO `users` (email, password_hash, name, role_id) VALUES(?,?,?,?)";
                try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(insertUsersQuery)) {
                    pst.setString(1, userEmail);
                    pst.setString(2, String.valueOf(confirmPasswordTextField.getPassword()));
                    pst.setString(3, name);
                    pst.setString(4, "2");
                    pst.execute();
                    String FromEmail = "ENTER YOUR EMAIL";
                    String FromEmailPassword = "ENTER YOUR PASSWORD";
                    Properties props = new Properties();
                    props.put("mail.smtp.user", "username");
                    props.put("mail.debug", "true");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", "smtp.gmail.com");
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.EnableSSL.enable", "true");
                    props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                    props.setProperty("mail.smtp.socketFactory.fallback", "false");
                    props.setProperty("mail.smtp.port", "465");
                    props.setProperty("mail.smtp.socketFactory.port", "465");
                    Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(FromEmail, FromEmailPassword);
                        }
                    });
                    try {
                        MimeMessage message = new MimeMessage(session);
                        message.setFrom(new InternetAddress(FromEmail));
                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
                        message.setSubject("BrainCell User Account SignUp");
                        message.setText("Hello " + name + " thankyou for joining with BrainCell Cinema!");
                        Transport.send(message);
                    } catch (MessagingException e) {
                        JOptionPane.showMessageDialog(null, "Something happened!");
                        throw new RuntimeException(e);
                    }
                }
                DBConnectClass.getConnection().close();
            } catch (SQLException ex) {
                Logger.getLogger(SignupFrm.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                JOptionPane.showMessageDialog(null, "Account created successfully!");
            }
        }
    }//GEN-LAST:event_signupBtnActionPerformed

    private void login_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_linkMouseClicked
        LoginFrm lgnFrm = new LoginFrm();
        lgnFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_login_linkMouseClicked

    private void login_linkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_linkMouseEntered
        login_link.setForeground(new Color(209, 15, 38));
    }//GEN-LAST:event_login_linkMouseEntered

    private void login_linkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_linkMouseExited
        login_link.setForeground(new Color(235, 16, 42));
    }//GEN-LAST:event_login_linkMouseExited

    //validate fields
    public boolean validate_info() {
        String fullname = fullnameTextField.getText();
        String email = emailTextField.getText();
        String createpass = String.valueOf(createPasswordTextField.getPassword());
        String confirmpass = String.valueOf(confirmPasswordTextField.getPassword());

        //check empty fields
        if (fullname.trim().equals("") || email.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the empty field(s)", "Empty Field", 2);
            return false;
        }
        if (createpass.trim().equals("") || confirmpass.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please create a password", "Empty Password", 2);
            return false;
        }
        if (createpass.trim().equals("") || (!createpass.equals(confirmpass))) {
            JOptionPane.showMessageDialog(null, "Passwords do not match", "Confirm Password", 2);
            return false;
        } else {
            return true;
        }
    }

    //Check for duplicate emails
    public boolean checkEmail(String email) {
        boolean email_notexists = true;
        String query = "SELECT COUNT(*) FROM `users` WHERE `email` = ?";
        try {
            PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            rs.next();
            if (rs.getInt(1) != 0) {
                email_notexists = false;
                JOptionPane.showMessageDialog(null, "An account exists by this email, please enter different email.", "Email Duplicate", 2);
            }
            pst.close();
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(SignupFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return email_notexists;
    }

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
            java.util.logging.Logger.getLogger(SignupFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignupFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordTextField;
    private javax.swing.JLabel createPasswordLabel;
    private javax.swing.JPasswordField createPasswordTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel fullnameLabel;
    private javax.swing.JTextField fullnameTextField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel login_link;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel msgLabel1;
    private javax.swing.JLabel msgLabel2;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel signupBack;
    private javax.swing.JButton signupBtn;
    // End of variables declaration//GEN-END:variables
}
