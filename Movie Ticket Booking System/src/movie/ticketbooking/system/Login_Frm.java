package movie.ticketbooking.system;

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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
           @Override
           public void mousePressed(MouseEvent e)
           {
              posX=e.getX();
              posY=e.getY();
           }
        });
        this.addMouseMotionListener(new MouseAdapter()
        {
            @Override
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
        email_TextField = new javax.swing.JTextField();
        forgotPassword_link = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        login_Btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        createAccount_link = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        miniBtn = new javax.swing.JButton();
        password_TextField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(36, 34, 54));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBackground(new java.awt.Color(21, 20, 31));
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");
        login_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 190, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 16, 42));
        jLabel2.setText("Login");
        login_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome back! Lets get started");
        login_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 130, -1, 20));

        email_TextField.setBackground(new java.awt.Color(21, 20, 31));
        email_TextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        email_TextField.setForeground(new java.awt.Color(255, 255, 255));
        email_TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_TextField.setToolTipText("");
        email_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        email_TextField.setCaretColor(new java.awt.Color(255, 255, 255));
        login_panel.add(email_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 220, 220, 30));

        forgotPassword_link.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        forgotPassword_link.setForeground(new java.awt.Color(235, 16, 42));
        forgotPassword_link.setText("Forgot Password?");
        forgotPassword_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassword_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassword_linkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotPassword_linkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotPassword_linkMouseExited(evt);
            }
        });
        login_panel.add(forgotPassword_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        login_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 260, -1, 20));

        login_Btn.setBackground(new java.awt.Color(255, 255, 255));
        login_Btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_Btn.setForeground(new java.awt.Color(255, 255, 255));
        login_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/loginBtn.png"))); // NOI18N
        login_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_BtnMouseExited(evt);
            }
        });
        login_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_BtnActionPerformed(evt);
            }
        });
        login_panel.add(login_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 340, 220, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New user?");
        login_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 390, -1, 20));

        createAccount_link.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        createAccount_link.setForeground(new java.awt.Color(235, 16, 42));
        createAccount_link.setText("Create Account");
        createAccount_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccount_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccount_linkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createAccount_linkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createAccount_linkMouseExited(evt);
            }
        });
        login_panel.add(createAccount_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 390, -1, 20));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtn.png"))); // NOI18N
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

        miniBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/miniBtn.png"))); // NOI18N
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
        login_panel.add(miniBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 16, 16, 4));

        password_TextField.setBackground(new java.awt.Color(21, 20, 31));
        password_TextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        password_TextField.setForeground(new java.awt.Color(255, 255, 255));
        password_TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        password_TextField.setCaretColor(new java.awt.Color(255, 255, 255));
        password_TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_panel.add(password_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 290, 220, 30));

        getContentPane().add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 310, 500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/other/login_back.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_BtnMouseEntered
        try {
            Image loginBtnHoverImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/loginBtnHover.png"));
            login_Btn.setIcon(new ImageIcon(loginBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_login_BtnMouseEntered

    private void login_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_BtnMouseExited
        try {
            Image loginBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/loginBtn.png"));
            login_Btn.setIcon(new ImageIcon(loginBtnImg));
        } catch (IOException ex) {
             Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_login_BtnMouseExited

    private void createAccount_linkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccount_linkMouseEntered
        createAccount_link.setForeground(new Color(209, 15, 38));
    }//GEN-LAST:event_createAccount_linkMouseEntered

    private void createAccount_linkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccount_linkMouseExited
        createAccount_link.setForeground(new Color(235, 16, 42));
    }//GEN-LAST:event_createAccount_linkMouseExited

    private void createAccount_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccount_linkMouseClicked
        SignUp_Frm sngFrm = new SignUp_Frm();
        sngFrm.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_createAccount_linkMouseClicked

    private void forgotPassword_linkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassword_linkMouseEntered
        forgotPassword_link.setForeground(new Color(209, 15, 38));
    }//GEN-LAST:event_forgotPassword_linkMouseEntered

    private void forgotPassword_linkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassword_linkMouseExited
        forgotPassword_link.setForeground(new Color(235, 16, 42));
    }//GEN-LAST:event_forgotPassword_linkMouseExited

    private void forgotPassword_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassword_linkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotPassword_linkMouseClicked

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        try {
            Image exitBtnHoverImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtnHover.png"));
            exitBtn.setIcon(new ImageIcon(exitBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        try {
            Image exitBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtn.png"));
            exitBtn.setIcon(new ImageIcon(exitBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnMouseExited

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void miniBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseEntered
        try {
            Image miniBtnHoverImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/miniBtnHover.png"));
            miniBtn.setIcon(new ImageIcon(miniBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miniBtnMouseEntered

    private void miniBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseExited
        try {
            Image miniBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/miniBtn.png"));
            miniBtn.setIcon(new ImageIcon(miniBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miniBtnMouseExited

    private void miniBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniBtnActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniBtnActionPerformed

    private void login_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_BtnActionPerformed
        if(validate_info()){
            String email = email_TextField.getText();
            String password = String.valueOf(password_TextField.getPassword());
            
            String query = "SELECT * FROM `users` WHERE `email` = '"+email+"' AND `password_hash` = '"+password+"'";
            try {
                pst = DBConnectClass.getConnection().prepareStatement(query);
                rs = pst.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Login Successful!", "Login",2);
                    if(rs.getInt("role_id") == 1){
                        Admin_Main_Frm adminMFrm = new Admin_Main_Frm();
                        adminMFrm.setVisible(true);
                        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                    }else{
                        Main_Frm mainFrm = new Main_Frm();
                        mainFrm.setVisible(true);
                        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Login, Please try again.", "Login", 2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_login_BtnActionPerformed
    
    //validate fields
    public boolean validate_info(){
        String email = email_TextField.getText();
        String password = String.valueOf(password_TextField.getPassword());
        
        //check empty fields
        if (email.trim().equals("") || password.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill the empty field(s)","Empty Field",2);
            return false;
        }
        else {
            return true;
        }
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
    private javax.swing.JTextField email_TextField;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel forgotPassword_link;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton login_Btn;
    private javax.swing.JPanel login_panel;
    private javax.swing.JButton miniBtn;
    private javax.swing.JPasswordField password_TextField;
    // End of variables declaration//GEN-END:variables
}
