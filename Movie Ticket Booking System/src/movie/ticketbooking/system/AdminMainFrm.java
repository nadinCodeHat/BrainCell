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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadinCodeHat
 **/
public class AdminMainFrm extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;
    int posX=0,posY=0;
    
    public AdminMainFrm() {
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
        try {
            getManageMovies();
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        viewBookingsPanel = new javax.swing.JPanel();
        manageMoviesPanel = new javax.swing.JPanel();
        moviePanel1 = new javax.swing.JPanel();
        posterLabel1 = new javax.swing.JLabel();
        movieTitle1 = new javax.swing.JLabel();
        starLabel1 = new javax.swing.JLabel();
        runtimeLabel1 = new javax.swing.JLabel();
        ratingLabel1 = new javax.swing.JLabel();
        genreLabel1 = new javax.swing.JLabel();
        contentRatingLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        moviePanel2 = new javax.swing.JPanel();
        posterLabel2 = new javax.swing.JLabel();
        runtimeLabel2 = new javax.swing.JLabel();
        contentRatingLabel2 = new javax.swing.JLabel();
        ratingLabel2 = new javax.swing.JLabel();
        starLabel2 = new javax.swing.JLabel();
        genreLabel2 = new javax.swing.JLabel();
        movieTitle2 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        moviePanel3 = new javax.swing.JPanel();
        posterLabel3 = new javax.swing.JLabel();
        runtimeLabel3 = new javax.swing.JLabel();
        contentRatingLabel3 = new javax.swing.JLabel();
        ratingLabel3 = new javax.swing.JLabel();
        starLabel3 = new javax.swing.JLabel();
        genreLabel3 = new javax.swing.JLabel();
        movieTitle3 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        profilePanel = new javax.swing.JPanel();
        miniBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1260, 700));
        setSize(new java.awt.Dimension(1260, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(255, 255, 255));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/logoutBtn.png"))); // NOI18N
        sidePanel.add(profileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 208, 180, 35));

        moviesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/viewBookingsBtn.png"))); // NOI18N
        sidePanel.add(moviesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, 180, 35));

        manageMoviesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/managemoviesBtnHover.png"))); // NOI18N
        manageMoviesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMoviesBtnActionPerformed(evt);
            }
        });
        sidePanel.add(manageMoviesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 35));

        login_link3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_link3.setForeground(new java.awt.Color(235, 16, 42));
        login_link3.setText("BrainCell");
        sidePanel.add(login_link3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        profileBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/profileBtn.png"))); // NOI18N
        sidePanel.add(profileBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 172, 180, 35));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 710));

        viewBookingsPanel.setBackground(new java.awt.Color(36, 34, 54));
        viewBookingsPanel.setMinimumSize(new java.awt.Dimension(1060, 700));
        viewBookingsPanel.setPreferredSize(new java.awt.Dimension(1060, 700));
        viewBookingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageMoviesPanel.setBackground(new java.awt.Color(36, 34, 54));
        manageMoviesPanel.setMinimumSize(new java.awt.Dimension(1060, 700));
        manageMoviesPanel.setPreferredSize(new java.awt.Dimension(1060, 700));
        manageMoviesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moviePanel1.setBackground(new java.awt.Color(21, 20, 31));
        moviePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        posterLabel1.setBackground(new java.awt.Color(255, 255, 255));
        posterLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        posterLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moviePanel1.add(posterLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 155));

        movieTitle1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movieTitle1.setForeground(new java.awt.Color(235, 16, 42));
        moviePanel1.add(movieTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        starLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        moviePanel1.add(starLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 20, 20));

        runtimeLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        runtimeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel1.add(runtimeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        ratingLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ratingLabel1.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel1.add(ratingLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        genreLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreLabel1.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel1.add(genreLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        contentRatingLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel1.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel1.add(contentRatingLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        moviePanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 80, 30));

        manageMoviesPanel.add(moviePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 950, -1));

        moviePanel2.setBackground(new java.awt.Color(21, 20, 31));
        moviePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        posterLabel2.setBackground(new java.awt.Color(255, 255, 255));
        posterLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        posterLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moviePanel2.add(posterLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 155));

        runtimeLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        runtimeLabel2.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel2.add(runtimeLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        contentRatingLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel2.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel2.add(contentRatingLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        ratingLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ratingLabel2.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel2.add(ratingLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        starLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        moviePanel2.add(starLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 20, 20));

        genreLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreLabel2.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel2.add(genreLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        movieTitle2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movieTitle2.setForeground(new java.awt.Color(235, 16, 42));
        moviePanel2.add(movieTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        moviePanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 80, 30));

        manageMoviesPanel.add(moviePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 950, -1));

        moviePanel3.setBackground(new java.awt.Color(21, 20, 31));
        moviePanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        posterLabel3.setBackground(new java.awt.Color(255, 255, 255));
        posterLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        posterLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moviePanel3.add(posterLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 155));

        runtimeLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        runtimeLabel3.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel3.add(runtimeLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        contentRatingLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel3.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel3.add(contentRatingLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        ratingLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ratingLabel3.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel3.add(ratingLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        starLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        moviePanel3.add(starLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 20, 20));

        genreLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreLabel3.setForeground(new java.awt.Color(255, 255, 255));
        moviePanel3.add(genreLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        movieTitle3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movieTitle3.setForeground(new java.awt.Color(235, 16, 42));
        moviePanel3.add(movieTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        moviePanel3.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 80, 30));

        manageMoviesPanel.add(moviePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 950, -1));

        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/refreshBtn.png"))); // NOI18N
        refreshBtn.setToolTipText("");
        refreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshBtnMouseExited(evt);
            }
        });
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        manageMoviesPanel.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 40, 35));

        viewBookingsPanel.add(manageMoviesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, -1, 670));

        getContentPane().add(viewBookingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 1060, 670));

        profilePanel.setBackground(new java.awt.Color(36, 34, 54));
        profilePanel.setMinimumSize(new java.awt.Dimension(1060, 700));
        profilePanel.setPreferredSize(new java.awt.Dimension(1060, 700));
        profilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(profilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 1060, 670));

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
        getContentPane().add(miniBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 16, 16, 4));

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
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, 16, 16));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        try {
            Image exitBtnHoverImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtnHover.png"));
            exitBtn.setIcon(new ImageIcon(exitBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        try {
            Image exitBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtn.png"));
            exitBtn.setIcon(new ImageIcon(exitBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miniBtnMouseEntered

    private void miniBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseExited
        try {
            Image miniBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/miniBtn.png"));
            miniBtn.setIcon(new ImageIcon(miniBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miniBtnMouseExited

    private void miniBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniBtnActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniBtnActionPerformed
    
    AddUpdateMovieFrm add_edit_movie_frm;
    private void manageMoviesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMoviesBtnActionPerformed
        manageMoviesPanel.setVisible(true);
        viewBookingsPanel.setVisible(false);
        profilePanel.setVisible(false);
        try {
            getManageMovies();
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_manageMoviesBtnActionPerformed

    private DefaultTableModel model = new DefaultTableModel(new String[]{"Movie Title", "Genre", "rating", "Hour", "Minute", "Content Rating", "Poster"}, 0);
    int count=0;
    
    private void getrow1(){
        movieTitle1.setText(model.getValueAt(0, 0).toString());
        genreLabel1.setText(model.getValueAt(0, 1).toString());
        ratingLabel1.setText(model.getValueAt(0, 2).toString()+"/10");
        String runtime1 = model.getValueAt(0,3).toString()+"h "+model.getValueAt(0,4).toString()+"m";
        runtimeLabel1.setText(runtime1);
        contentRatingLabel1.setText(model.getValueAt(0, 5).toString());
        posterLabel1.setIcon((ImageIcon) model.getValueAt(0, 6));
    }
    
    private void getrow2(){
        movieTitle2.setText(model.getValueAt(1, 0).toString());
        genreLabel2.setText(model.getValueAt(1, 1).toString());
        ratingLabel2.setText(model.getValueAt(1, 2).toString()+"/10");
        String runtime2 = model.getValueAt(1,3).toString()+"h "+model.getValueAt(1,4).toString()+"m";
        runtimeLabel2.setText(runtime2);
        contentRatingLabel2.setText(model.getValueAt(1, 5).toString());
        posterLabel2.setIcon((ImageIcon) model.getValueAt(1, 6));
    }
    private void getrow3(){
        movieTitle3.setText(model.getValueAt(2, 0).toString());
        genreLabel3.setText(model.getValueAt(2, 1).toString());
        ratingLabel3.setText(model.getValueAt(2, 2).toString()+"/10");
        String runtime3 = model.getValueAt(2,3).toString()+"h "+model.getValueAt(2,4).toString()+"m";
        runtimeLabel3.setText(runtime3);
        contentRatingLabel3.setText(model.getValueAt(2, 5).toString());
        posterLabel3.setIcon((ImageIcon) model.getValueAt(2, 6));
    }
    private void getEditBtn(JButton btn){
        try {
            Image editBtn = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/editBtn.png"));
            btn.setIcon(new ImageIcon(editBtn));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getAddBtn(JButton btn){
        try {
            Image addBtn = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/addBtn.png"));
            btn.setIcon(new ImageIcon(addBtn));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     private void getEditBtnHover(JButton btn){
        try {
            Image editBtnHover = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/editBtnHover.png"));
            btn.setIcon(new ImageIcon(editBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getAddBtnHover(JButton btn){
        try {
            Image addBtnHover = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/addBtnHover.png"));
            btn.setIcon(new ImageIcon(addBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    String movieTitle = null;
    String genre = null;
    String rating = null;
    int hour = 0;
    int minute = 0;
    String contentRating = null;
    ImageIcon posterIcon = null;
    private void getManageMovies() throws IOException{
        //Retrieve data
        String countquery = "SELECT COUNT(*) FROM movies";
        try{
            pst = DBConnectClass.getConnection().prepareStatement(countquery);
            rs = pst.executeQuery();
            
            while( rs.next() ) 
            {
                count = rs.getInt(1);
            }
        }catch(SQLException ex){
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        String query = "SELECT movie_title, genre, rating, hour, minute, content_rating, poster FROM `movies`";
        try {
            pst = DBConnectClass.getConnection().prepareStatement(query);
            rs = pst.executeQuery();
            while(rs.next()){
                movieTitle = rs.getString("movie_title");
                genre = rs.getString("genre");
                rating = String.valueOf(rs.getDouble("rating"));
                hour = rs.getInt("hour");
                minute = rs.getInt("minute");
                contentRating = rs.getString("content_rating");
                posterIcon = parsePoster((Blob) rs.getBlob("poster"));
                model.addRow(new Object[]{movieTitle, genre, rating, hour, minute, contentRating, posterIcon});
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch (count) {
            case 0 -> {
                getAddBtn(btn1);
                getAddBtn(btn2);
                getAddBtn(btn3);
                starLabel1.setVisible(false);
                starLabel2.setVisible(false);
                starLabel3.setVisible(false);
            }
            case 1 -> {
                getrow1();
                getEditBtn(btn1);
                getAddBtn(btn2);
                getAddBtn(btn3);
                starLabel2.setVisible(false);
                starLabel3.setVisible(false);
            }
            case 2 -> {
                getrow1();
                getrow2();
                getEditBtn(btn1);
                getEditBtn(btn2);
                getAddBtn(btn3);
                starLabel3.setVisible(false);
            }
            default -> {
                getrow1();
                getrow2();
                getrow3();
                getEditBtn(btn1);
                getEditBtn(btn2);
                getEditBtn(btn3);
            }
        }
    }
    
    private ImageIcon parsePoster(Blob posterBlob) throws SQLException, IOException{
        int blobLength = (int) posterBlob.length();  
        byte[] bytes = posterBlob.getBytes(1, blobLength);
        posterBlob.free();
        BufferedImage img = ImageIO.read(new ByteArrayInputStream(bytes));
        ImageIcon icon = new ImageIcon(img);
        return icon;
    }
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        try {
            add_edit_movie_frm = new AddUpdateMovieFrm(this, movieTitle1.getText(), count);
            add_edit_movie_frm.pack();
            add_edit_movie_frm.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        try {
            add_edit_movie_frm = new AddUpdateMovieFrm(this, movieTitle2.getText(), count);
            add_edit_movie_frm.pack();
            add_edit_movie_frm.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        try {
            add_edit_movie_frm = new AddUpdateMovieFrm(this, movieTitle3.getText(), count);
            add_edit_movie_frm.pack();
            add_edit_movie_frm.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
        if(count == 0){
            getAddBtnHover(btn1);
        }else{
            getEditBtnHover(btn1);
        }
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        if(count == 0){
            getAddBtn(btn1);
        }else{
            getEditBtn(btn1);
        }
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseEntered
        if(count == 2 || count == 3)
            getEditBtnHover(btn2);
        else
            getAddBtnHover(btn2);
    }//GEN-LAST:event_btn2MouseEntered

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        if(count == 2 || count == 3)
            getEditBtn(btn2);
        else
            getAddBtn(btn2);
    }//GEN-LAST:event_btn2MouseExited

    private void btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseEntered
        if(count == 3)
            getEditBtnHover(btn3);
        else
            getAddBtnHover(btn3);
    }//GEN-LAST:event_btn3MouseEntered

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited
        if(count == 3)
            getEditBtn(btn3);
        else
            getAddBtn(btn3);
    }//GEN-LAST:event_btn3MouseExited

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        try {
            getManageMovies();
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void refreshBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseEntered
        refreshBtn.setToolTipText("Refresh");
        try {
            Image refreshBtnHover = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/refreshBtnHover.png"));
            refreshBtn.setIcon(new ImageIcon(refreshBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshBtnMouseEntered

    private void refreshBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseExited
        try {
            Image refrshBtn = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/refreshBtn.png"));
            refreshBtn.setIcon(new ImageIcon(refrshBtn));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshBtnMouseExited

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
            java.util.logging.Logger.getLogger(AdminMainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminMainFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JLabel contentRatingLabel1;
    private javax.swing.JLabel contentRatingLabel2;
    private javax.swing.JLabel contentRatingLabel3;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel genreLabel1;
    private javax.swing.JLabel genreLabel2;
    private javax.swing.JLabel genreLabel3;
    private javax.swing.JLabel login_link3;
    private javax.swing.JButton manageMoviesBtn;
    private javax.swing.JPanel manageMoviesPanel;
    private javax.swing.JButton miniBtn;
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
    private javax.swing.JButton refreshBtn;
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
