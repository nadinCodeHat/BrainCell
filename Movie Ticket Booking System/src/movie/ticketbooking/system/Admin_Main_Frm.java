package movie.ticketbooking.system;

import com.mysql.jdbc.Blob;
import java.util.ArrayList;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
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
import javax.swing.table.DefaultTableModel;

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
        
        manageMoviesPanel.setVisible(true);
        viewBookingsPanel.setVisible(false);
        profilePanel.setVisible(false);
//        try {
//            getManageMovies();
//        } catch (IOException ex) {
//            Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePanel = new javax.swing.JPanel();
        profileBtn = new javax.swing.JButton();
        moviesBtn = new javax.swing.JButton();
        manageMoviesBtn = new javax.swing.JButton();
        login_link3 = new javax.swing.JLabel();
        profileBtn1 = new javax.swing.JButton();
        manageMoviesPanel = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        miniBtn = new javax.swing.JButton();
        addMovieBtn = new javax.swing.JButton();
        moviePanel1 = new javax.swing.JPanel();
        posterLabel1 = new javax.swing.JLabel();
        movieTitle1 = new javax.swing.JLabel();
        starLabel1 = new javax.swing.JLabel();
        runtimeLabel1 = new javax.swing.JLabel();
        ratingLabel1 = new javax.swing.JLabel();
        genreLabel1 = new javax.swing.JLabel();
        contentRatingLabel1 = new javax.swing.JLabel();
        moviePanel2 = new javax.swing.JPanel();
        posterLabel2 = new javax.swing.JLabel();
        runtimeLabel2 = new javax.swing.JLabel();
        contentRatingLabel2 = new javax.swing.JLabel();
        ratingLabel2 = new javax.swing.JLabel();
        starLabel2 = new javax.swing.JLabel();
        genreLabel2 = new javax.swing.JLabel();
        movieTitle2 = new javax.swing.JLabel();
        moviePanel3 = new javax.swing.JPanel();
        posterLabel3 = new javax.swing.JLabel();
        runtimeLabel3 = new javax.swing.JLabel();
        contentRatingLabel3 = new javax.swing.JLabel();
        ratingLabel3 = new javax.swing.JLabel();
        starLabel3 = new javax.swing.JLabel();
        genreLabel3 = new javax.swing.JLabel();
        movieTitle3 = new javax.swing.JLabel();
        viewBookingsPanel = new javax.swing.JPanel();
        exitBtn1 = new javax.swing.JButton();
        miniBtn1 = new javax.swing.JButton();
        profilePanel = new javax.swing.JPanel();
        exitBtn2 = new javax.swing.JButton();
        miniBtn2 = new javax.swing.JButton();

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

        manageMoviesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/managemoviesBtnHover.png"))); // NOI18N
        manageMoviesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMoviesBtnActionPerformed(evt);
            }
        });
        sidePanel.add(manageMoviesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 35));

        login_link3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_link3.setForeground(new java.awt.Color(235, 16, 42));
        login_link3.setText("BrainCell");
        sidePanel.add(login_link3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        profileBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/profileBtn.png"))); // NOI18N
        sidePanel.add(profileBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 172, 200, 35));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 710));

        manageMoviesPanel.setBackground(new java.awt.Color(36, 34, 54));
        manageMoviesPanel.setMinimumSize(new java.awt.Dimension(1060, 700));
        manageMoviesPanel.setPreferredSize(new java.awt.Dimension(1060, 700));
        manageMoviesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        manageMoviesPanel.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 16, 16));

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
        manageMoviesPanel.add(miniBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 16, 16, 4));

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
        addMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieBtnActionPerformed(evt);
            }
        });
        manageMoviesPanel.add(addMovieBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 100, 30));

        moviePanel1.setBackground(new java.awt.Color(21, 20, 31));
        moviePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        posterLabel1.setBackground(new java.awt.Color(255, 255, 255));
        posterLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        posterLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moviePanel1.add(posterLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 155));

        movieTitle1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movieTitle1.setForeground(new java.awt.Color(235, 16, 42));
        movieTitle1.setText("Fast & Furious Presents: Hobbs and Shaw");
        moviePanel1.add(movieTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        starLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        moviePanel1.add(starLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 20, 20));

        runtimeLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        runtimeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        runtimeLabel1.setText("2 hours and 16 minutes");
        moviePanel1.add(runtimeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        ratingLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ratingLabel1.setForeground(new java.awt.Color(255, 255, 255));
        ratingLabel1.setText("6.4/10");
        moviePanel1.add(ratingLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        genreLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreLabel1.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel1.setText("Action, Adventure");
        moviePanel1.add(genreLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        contentRatingLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel1.setForeground(new java.awt.Color(255, 255, 255));
        contentRatingLabel1.setText("PG-13");
        moviePanel1.add(contentRatingLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        manageMoviesPanel.add(moviePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 950, -1));

        moviePanel2.setBackground(new java.awt.Color(21, 20, 31));
        moviePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        posterLabel2.setBackground(new java.awt.Color(255, 255, 255));
        posterLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        posterLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moviePanel2.add(posterLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 155));

        runtimeLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        runtimeLabel2.setForeground(new java.awt.Color(255, 255, 255));
        runtimeLabel2.setText("2 hours and 16 minutes");
        moviePanel2.add(runtimeLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        contentRatingLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel2.setForeground(new java.awt.Color(255, 255, 255));
        contentRatingLabel2.setText("PG-13");
        moviePanel2.add(contentRatingLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        ratingLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ratingLabel2.setForeground(new java.awt.Color(255, 255, 255));
        ratingLabel2.setText("6.4/10");
        moviePanel2.add(ratingLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        starLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        moviePanel2.add(starLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 20, 20));

        genreLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreLabel2.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel2.setText("Action, Adventure");
        moviePanel2.add(genreLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        movieTitle2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movieTitle2.setForeground(new java.awt.Color(235, 16, 42));
        movieTitle2.setText("Fast & Furious Presents: Hobbs and Shaw");
        moviePanel2.add(movieTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        manageMoviesPanel.add(moviePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 950, -1));

        moviePanel3.setBackground(new java.awt.Color(21, 20, 31));
        moviePanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        posterLabel3.setBackground(new java.awt.Color(255, 255, 255));
        posterLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        posterLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moviePanel3.add(posterLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 155));

        runtimeLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        runtimeLabel3.setForeground(new java.awt.Color(255, 255, 255));
        runtimeLabel3.setText("2 hours and 16 minutes");
        moviePanel3.add(runtimeLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        contentRatingLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel3.setForeground(new java.awt.Color(255, 255, 255));
        contentRatingLabel3.setText("PG-13");
        moviePanel3.add(contentRatingLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        ratingLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ratingLabel3.setForeground(new java.awt.Color(255, 255, 255));
        ratingLabel3.setText("6.4/10");
        moviePanel3.add(ratingLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        starLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        moviePanel3.add(starLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 20, 20));

        genreLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreLabel3.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel3.setText("Action, Adventure");
        moviePanel3.add(genreLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        movieTitle3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movieTitle3.setForeground(new java.awt.Color(235, 16, 42));
        movieTitle3.setText("Fast & Furious Presents: Hobbs and Shaw");
        moviePanel3.add(movieTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        manageMoviesPanel.add(moviePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 950, -1));

        getContentPane().add(manageMoviesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1060, 710));

        viewBookingsPanel.setBackground(new java.awt.Color(36, 34, 54));
        viewBookingsPanel.setMinimumSize(new java.awt.Dimension(1060, 700));
        viewBookingsPanel.setPreferredSize(new java.awt.Dimension(1060, 700));
        viewBookingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtn.png"))); // NOI18N
        exitBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtn1MouseExited(evt);
            }
        });
        exitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtn1ActionPerformed(evt);
            }
        });
        viewBookingsPanel.add(exitBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 16, 16));

        miniBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/miniBtn.png"))); // NOI18N
        miniBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miniBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniBtn1MouseExited(evt);
            }
        });
        miniBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniBtn1ActionPerformed(evt);
            }
        });
        viewBookingsPanel.add(miniBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 16, 16, 4));

        getContentPane().add(viewBookingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1060, 710));

        profilePanel.setBackground(new java.awt.Color(36, 34, 54));
        profilePanel.setMinimumSize(new java.awt.Dimension(1060, 700));
        profilePanel.setPreferredSize(new java.awt.Dimension(1060, 700));
        profilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtn.png"))); // NOI18N
        exitBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtn2MouseExited(evt);
            }
        });
        exitBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtn2ActionPerformed(evt);
            }
        });
        profilePanel.add(exitBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 16, 16));

        miniBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/miniBtn.png"))); // NOI18N
        miniBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miniBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniBtn2MouseExited(evt);
            }
        });
        miniBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniBtn2ActionPerformed(evt);
            }
        });
        profilePanel.add(miniBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 16, 16, 4));

        getContentPane().add(profilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1060, 710));

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
            Logger.getLogger(Add_Edit_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addMovieBtnMouseEntered

    private void addMovieBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMovieBtnMouseExited
        try {
            Image addMovieBtnIM = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/addMovieBtn.png"));
            addMovieBtn.setIcon(new ImageIcon(addMovieBtnIM));
        } catch (IOException ex) {
            Logger.getLogger(Add_Edit_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addMovieBtnMouseExited
        Add_Edit_Movie_Frm add_edit_movie_frm;
    private void addMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieBtnActionPerformed
        add_edit_movie_frm = new Add_Edit_Movie_Frm(this);
        add_edit_movie_frm.pack();
        add_edit_movie_frm.setVisible(true);
    }//GEN-LAST:event_addMovieBtnActionPerformed

    private void manageMoviesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMoviesBtnActionPerformed
        manageMoviesPanel.setVisible(true);
        viewBookingsPanel.setVisible(false);
        profilePanel.setVisible(false);
        try {
            getManageMovies();
        } catch (IOException ex) {
            Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_manageMoviesBtnActionPerformed

    private DefaultTableModel model = new DefaultTableModel(new String[]{"Movie Title", "Genre", "rating", "Runtime", "Content Rating", "Poster"}, 0);

    private void getManageMovies() throws IOException{
        //Retrieve data
        String query = "SELECT movie_title, genre, rating, runtime, content_rating, poster FROM `movies`";
        try {
            pst = DBConnectClass.getConnection().prepareStatement(query);
            rs = pst.executeQuery();
            while(rs.next()){
               String movieTitle = rs.getString("movie_title");
               String genre = rs.getString("genre");
               String rating = String.valueOf(rs.getDouble("rating"));
               String runtime = String.valueOf(rs.getString("runtime"));
               String contentRating = rs.getString("content_rating");
               ImageIcon posterIcon = parsePoster((Blob) rs.getBlob("poster"));
               model.addRow(new Object[]{movieTitle, genre, rating, runtime, contentRating, posterIcon});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Set values
        movieTitle1.setText(model.getValueAt(0, 0).toString());
        genreLabel1.setText(model.getValueAt(0, 1).toString());
        ratingLabel1.setText(model.getValueAt(0, 2).toString());
        runtimeLabel1.setText(model.getValueAt(0, 3).toString());
        contentRatingLabel1.setText(model.getValueAt(0, 4).toString());
        posterLabel1.setIcon((ImageIcon) model.getValueAt(0, 5));
        
        movieTitle2.setText(model.getValueAt(1, 0).toString());
        genreLabel2.setText(model.getValueAt(1, 1).toString());
        ratingLabel2.setText(model.getValueAt(1, 2).toString());
        runtimeLabel2.setText(model.getValueAt(1, 3).toString());
        contentRatingLabel2.setText(model.getValueAt(1, 4).toString());
        posterLabel2.setIcon((ImageIcon) model.getValueAt(1, 5));
        
        movieTitle3.setText(model.getValueAt(2, 0).toString());
        genreLabel3.setText(model.getValueAt(2, 1).toString());
        ratingLabel3.setText(model.getValueAt(2, 2).toString());
        runtimeLabel3.setText(model.getValueAt(2, 3).toString());
        contentRatingLabel3.setText(model.getValueAt(2, 4).toString());
        posterLabel3.setIcon((ImageIcon) model.getValueAt(2, 5));
    }
    
    private ImageIcon parsePoster(Blob posterBlob) throws SQLException, IOException{
        int blobLength = (int) posterBlob.length();  
        byte[] bytes = posterBlob.getBytes(1, blobLength);
        posterBlob.free();
        BufferedImage img = ImageIO.read(new ByteArrayInputStream(bytes));
        ImageIcon icon = new ImageIcon(img);
        return icon;
    }
    
    private void exitBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtn1MouseEntered

    private void exitBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtn1MouseExited

    private void exitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtn1ActionPerformed

    private void miniBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_miniBtn1MouseEntered

    private void miniBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_miniBtn1MouseExited

    private void miniBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miniBtn1ActionPerformed

    private void exitBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtn2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtn2MouseEntered

    private void exitBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtn2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtn2MouseExited

    private void exitBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtn2ActionPerformed

    private void miniBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtn2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_miniBtn2MouseEntered

    private void miniBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtn2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_miniBtn2MouseExited

    private void miniBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miniBtn2ActionPerformed

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
    private javax.swing.JButton addMovieBtn;
    private javax.swing.JLabel contentRatingLabel1;
    private javax.swing.JLabel contentRatingLabel2;
    private javax.swing.JLabel contentRatingLabel3;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton exitBtn1;
    private javax.swing.JButton exitBtn2;
    private javax.swing.JLabel genreLabel1;
    private javax.swing.JLabel genreLabel2;
    private javax.swing.JLabel genreLabel3;
    private javax.swing.JLabel login_link3;
    private javax.swing.JButton manageMoviesBtn;
    private javax.swing.JPanel manageMoviesPanel;
    private javax.swing.JButton miniBtn;
    private javax.swing.JButton miniBtn1;
    private javax.swing.JButton miniBtn2;
    private javax.swing.JPanel moviePanel1;
    private javax.swing.JPanel moviePanel2;
    private javax.swing.JPanel moviePanel3;
    private javax.swing.JLabel movieTitle1;
    private javax.swing.JLabel movieTitle2;
    private javax.swing.JLabel movieTitle3;
    private javax.swing.JButton moviesBtn;
    private javax.swing.JLabel posterLabel1;
    private javax.swing.JLabel posterLabel2;
    private javax.swing.JLabel posterLabel3;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton profileBtn1;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel ratingLabel1;
    private javax.swing.JLabel ratingLabel2;
    private javax.swing.JLabel ratingLabel3;
    private javax.swing.JLabel runtimeLabel1;
    private javax.swing.JLabel runtimeLabel2;
    private javax.swing.JLabel runtimeLabel3;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel starLabel1;
    private javax.swing.JLabel starLabel2;
    private javax.swing.JLabel starLabel3;
    private javax.swing.JPanel viewBookingsPanel;
    // End of variables declaration//GEN-END:variables
}
