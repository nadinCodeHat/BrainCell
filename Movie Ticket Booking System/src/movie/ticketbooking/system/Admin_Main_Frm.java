package movie.ticketbooking.system;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author nadinCodeHat
 */
public class Admin_Main_Frm extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;
    int posX=0,posY=0;
    
    public Admin_Main_Frm() {
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

        sidePanel = new javax.swing.JPanel();
        profileBtn = new javax.swing.JButton();
        moviesBtn = new javax.swing.JButton();
        moviesBtn1 = new javax.swing.JButton();
        login_link3 = new javax.swing.JLabel();
        profileBtn1 = new javax.swing.JButton();
        addAMoviePanel = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        miniBtn = new javax.swing.JButton();
        posterLabel = new javax.swing.JLabel();
        addMovieBtn = new javax.swing.JButton();
        viewMoviesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        login_link5 = new javax.swing.JLabel();
        login_link6 = new javax.swing.JLabel();
        login_link7 = new javax.swing.JLabel();
        login_link8 = new javax.swing.JLabel();
        login_link9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        login_link15 = new javax.swing.JLabel();
        login_link16 = new javax.swing.JLabel();
        login_link17 = new javax.swing.JLabel();
        login_link18 = new javax.swing.JLabel();
        login_link19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        login_link20 = new javax.swing.JLabel();
        login_link21 = new javax.swing.JLabel();
        login_link22 = new javax.swing.JLabel();
        login_link23 = new javax.swing.JLabel();
        login_link24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1260, 700));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1260, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(21, 20, 31));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/logoutBtn.png"))); // NOI18N
        sidePanel.add(profileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 208, 200, 35));

        moviesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/viewBookingsBtn.png"))); // NOI18N
        sidePanel.add(moviesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, 200, 35));

        moviesBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/managemoviesBtnHover.png"))); // NOI18N
        sidePanel.add(moviesBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 35));

        login_link3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_link3.setForeground(new java.awt.Color(235, 16, 42));
        login_link3.setText("BrainCell");
        sidePanel.add(login_link3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        profileBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/profileBtn.png"))); // NOI18N
        sidePanel.add(profileBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 172, 200, 35));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        addAMoviePanel.setBackground(new java.awt.Color(36, 34, 54));
        addAMoviePanel.setMinimumSize(new java.awt.Dimension(1060, 700));
        addAMoviePanel.setPreferredSize(new java.awt.Dimension(1060, 700));
        addAMoviePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        addAMoviePanel.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 16, 16));

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
        addAMoviePanel.add(miniBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 16, 16, 4));

        posterLabel.setBackground(new java.awt.Color(255, 255, 255));
        posterLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        posterLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addAMoviePanel.add(posterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 320, 200));

        addMovieBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/addMovieBtn.png"))); // NOI18N
        addMovieBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMovieBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMovieBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMovieBtnMouseExited(evt);
            }
        });
        addAMoviePanel.add(addMovieBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 100, 30));

        getContentPane().add(addAMoviePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1060, 700));

        viewMoviesPanel.setBackground(new java.awt.Color(21, 20, 31));
        viewMoviesPanel.setMinimumSize(new java.awt.Dimension(1060, 700));
        viewMoviesPanel.setPreferredSize(new java.awt.Dimension(1060, 700));
        viewMoviesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 16, 42));
        jLabel1.setText("Now Screening");
        viewMoviesPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel4.setBackground(new java.awt.Color(21, 20, 31));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 200));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(235, 16, 42));
        jLabel11.setText("Fast & Furious Hobbs & Shaw");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        login_link5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link5.setForeground(new java.awt.Color(255, 255, 255));
        login_link5.setText("8.0");
        jPanel4.add(login_link5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        login_link6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link6.setForeground(new java.awt.Color(255, 255, 255));
        login_link6.setText("Action | Fantasy");
        jPanel4.add(login_link6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 223, -1, -1));

        login_link7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link7.setForeground(new java.awt.Color(255, 255, 255));
        login_link7.setText("PG-13");
        jPanel4.add(login_link7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 223, -1, -1));

        login_link8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link8.setForeground(new java.awt.Color(255, 255, 255));
        login_link8.setText("2019");
        jPanel4.add(login_link8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, -1, -1));

        login_link9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link9.setForeground(new java.awt.Color(255, 255, 255));
        login_link9.setText("Runtime : 143 min");
        jPanel4.add(login_link9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        viewMoviesPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 320, 270));

        jPanel6.setBackground(new java.awt.Color(21, 20, 31));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 200));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(235, 16, 42));
        jLabel15.setText("Fast & Furious Hobbs & Shaw");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        login_link15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link15.setForeground(new java.awt.Color(255, 255, 255));
        login_link15.setText("8.0");
        jPanel6.add(login_link15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        login_link16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link16.setForeground(new java.awt.Color(255, 255, 255));
        login_link16.setText("Action | Fantasy");
        jPanel6.add(login_link16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 223, -1, -1));

        login_link17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link17.setForeground(new java.awt.Color(255, 255, 255));
        login_link17.setText("PG-13");
        jPanel6.add(login_link17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 223, -1, -1));

        login_link18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link18.setForeground(new java.awt.Color(255, 255, 255));
        login_link18.setText("2019");
        jPanel6.add(login_link18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, -1, -1));

        login_link19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link19.setForeground(new java.awt.Color(255, 255, 255));
        login_link19.setText("Runtime : 143 min");
        jPanel6.add(login_link19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        viewMoviesPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 320, 270));

        jPanel7.setBackground(new java.awt.Color(21, 20, 31));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 200));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(235, 16, 42));
        jLabel17.setText("Fast & Furious Hobbs & Shaw");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        login_link20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link20.setForeground(new java.awt.Color(255, 255, 255));
        login_link20.setText("8.0");
        jPanel7.add(login_link20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        login_link21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link21.setForeground(new java.awt.Color(255, 255, 255));
        login_link21.setText("Action | Fantasy");
        jPanel7.add(login_link21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 223, -1, -1));

        login_link22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link22.setForeground(new java.awt.Color(255, 255, 255));
        login_link22.setText("PG-13");
        jPanel7.add(login_link22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 223, -1, -1));

        login_link23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link23.setForeground(new java.awt.Color(255, 255, 255));
        login_link23.setText("2019");
        jPanel7.add(login_link23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, -1, -1));

        login_link24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link24.setForeground(new java.awt.Color(255, 255, 255));
        login_link24.setText("Runtime : 143 min");
        jPanel7.add(login_link24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        viewMoviesPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 320, 270));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 16, 42));
        jLabel2.setText("Upcoming");
        viewMoviesPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        getContentPane().add(viewMoviesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1060, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        try {
            Image exitBtnHoverImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtnHover.png"));
            exitBtn.setIcon(new ImageIcon(exitBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        try {
            Image exitBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtn.png"));
            exitBtn.setIcon(new ImageIcon(exitBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miniBtnMouseEntered

    private void miniBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseExited
        try {
            Image miniBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/miniBtn.png"));
            miniBtn.setIcon(new ImageIcon(miniBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miniBtnMouseExited

    private void miniBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniBtnActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniBtnActionPerformed

    private void addMovieBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMovieBtnMouseEntered
        try {
            Image addMovieBtnHover = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/addMovieBtnHover.png"));
            addMovieBtn.setIcon(new ImageIcon(addMovieBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(Add_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addMovieBtnMouseEntered

    private void addMovieBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMovieBtnMouseExited
        try {
            Image addMovieBtnIM = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/addMovieBtn.png"));
            addMovieBtn.setIcon(new ImageIcon(addMovieBtnIM));
        } catch (IOException ex) {
            Logger.getLogger(Add_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addMovieBtnMouseExited

    ArrayList<String> genreList = new ArrayList<>();
    String str;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Main_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_Main_Frm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addAMoviePanel;
    private javax.swing.JButton addMovieBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel login_link15;
    private javax.swing.JLabel login_link16;
    private javax.swing.JLabel login_link17;
    private javax.swing.JLabel login_link18;
    private javax.swing.JLabel login_link19;
    private javax.swing.JLabel login_link20;
    private javax.swing.JLabel login_link21;
    private javax.swing.JLabel login_link22;
    private javax.swing.JLabel login_link23;
    private javax.swing.JLabel login_link24;
    private javax.swing.JLabel login_link3;
    private javax.swing.JLabel login_link5;
    private javax.swing.JLabel login_link6;
    private javax.swing.JLabel login_link7;
    private javax.swing.JLabel login_link8;
    private javax.swing.JLabel login_link9;
    private javax.swing.JButton miniBtn;
    private javax.swing.JButton moviesBtn;
    private javax.swing.JButton moviesBtn1;
    private javax.swing.JLabel posterLabel;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton profileBtn1;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel viewMoviesPanel;
    // End of variables declaration//GEN-END:variables
}
