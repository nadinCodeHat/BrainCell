package movie.ticketbooking.system;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadinCodeHat
 */
public class MainFrm extends javax.swing.JFrame {

    public MainFrm() {
        initComponents();
        getMovies();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navPanel = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        myBookingsBtn = new javax.swing.JButton();
        moviesBtn = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        moviesPanel = new javax.swing.JPanel();
        moviePanel1 = new javax.swing.JPanel();
        movieLabel1 = new javax.swing.JLabel();
        movieTitle1 = new javax.swing.JLabel();
        rating1 = new javax.swing.JLabel();
        starLabel1 = new javax.swing.JLabel();
        runtime1 = new javax.swing.JLabel();
        ratingLabel1 = new javax.swing.JLabel();
        runtimeLabel1 = new javax.swing.JLabel();
        genreLabel1 = new javax.swing.JLabel();
        genre1 = new javax.swing.JLabel();
        contentRatingLabel1 = new javax.swing.JLabel();
        contentRating1 = new javax.swing.JLabel();
        ticketPriceLabel1 = new javax.swing.JLabel();
        adultLabel1 = new javax.swing.JLabel();
        childLabel1 = new javax.swing.JLabel();
        watchTrailerBtn1 = new javax.swing.JButton();
        tckPriceAdult1 = new javax.swing.JLabel();
        tckPriceChild1 = new javax.swing.JLabel();
        bookNowBtn1 = new javax.swing.JButton();
        moviePanel2 = new javax.swing.JPanel();
        movieLabel2 = new javax.swing.JLabel();
        movieTitle2 = new javax.swing.JLabel();
        rating2 = new javax.swing.JLabel();
        starLabel2 = new javax.swing.JLabel();
        runtime2 = new javax.swing.JLabel();
        ratingLabel2 = new javax.swing.JLabel();
        runtimeLabel2 = new javax.swing.JLabel();
        genreLabel2 = new javax.swing.JLabel();
        genre2 = new javax.swing.JLabel();
        contentRatingLabel2 = new javax.swing.JLabel();
        contentRating2 = new javax.swing.JLabel();
        ticketPriceLabel2 = new javax.swing.JLabel();
        adultLabel2 = new javax.swing.JLabel();
        childLabel2 = new javax.swing.JLabel();
        watchTrailerBtn2 = new javax.swing.JButton();
        tckPriceAdult2 = new javax.swing.JLabel();
        tckPriceChild2 = new javax.swing.JLabel();
        bookNowBtn2 = new javax.swing.JButton();
        moviePanel3 = new javax.swing.JPanel();
        movieLabel3 = new javax.swing.JLabel();
        movieTitle3 = new javax.swing.JLabel();
        rating3 = new javax.swing.JLabel();
        starLabel3 = new javax.swing.JLabel();
        runtime3 = new javax.swing.JLabel();
        ratingLabel3 = new javax.swing.JLabel();
        runtimeLabel3 = new javax.swing.JLabel();
        genreLabel3 = new javax.swing.JLabel();
        genre3 = new javax.swing.JLabel();
        contentRatingLabel3 = new javax.swing.JLabel();
        contentRating3 = new javax.swing.JLabel();
        ticketPriceLabel3 = new javax.swing.JLabel();
        adultLabel3 = new javax.swing.JLabel();
        childLabel3 = new javax.swing.JLabel();
        watchTrailerBtn3 = new javax.swing.JButton();
        tckPriceAdult3 = new javax.swing.JLabel();
        tckPriceChild3 = new javax.swing.JLabel();
        bookNowBtn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navPanel.setBackground(new java.awt.Color(255, 255, 255));
        navPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/logoutBtn.png"))); // NOI18N
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        navPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 180, 35));

        profileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/profileBtn.png"))); // NOI18N
        profileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileBtnMouseExited(evt);
            }
        });
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });
        navPanel.add(profileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 35));

        myBookingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/myBookingsBtn.png"))); // NOI18N
        myBookingsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myBookingsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myBookingsBtnMouseExited(evt);
            }
        });
        myBookingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBookingsBtnActionPerformed(evt);
            }
        });
        navPanel.add(myBookingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 35));

        moviesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/moviesBtnHover.png"))); // NOI18N
        moviesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                moviesBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                moviesBtnMouseExited(evt);
            }
        });
        moviesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesBtnActionPerformed(evt);
            }
        });
        navPanel.add(moviesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 35));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/other/logo.png"))); // NOI18N
        navPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 50));

        getContentPane().add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 600));

        moviesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moviePanel1.setBackground(new java.awt.Color(255, 255, 255));
        moviePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movieLabel1.setBackground(new java.awt.Color(255, 255, 255));
        movieLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movieLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moviePanel1.add(movieLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 155));

        movieTitle1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        movieTitle1.setForeground(new java.awt.Color(235, 16, 42));
        moviePanel1.add(movieTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, -1));

        rating1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel1.add(rating1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        starLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        moviePanel1.add(starLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        runtime1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel1.add(runtime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        ratingLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ratingLabel1.setForeground(new java.awt.Color(235, 16, 42));
        ratingLabel1.setText("Rating");
        moviePanel1.add(ratingLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        runtimeLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        runtimeLabel1.setForeground(new java.awt.Color(235, 16, 42));
        runtimeLabel1.setText("Runtime");
        moviePanel1.add(runtimeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        genreLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreLabel1.setForeground(new java.awt.Color(235, 16, 42));
        genreLabel1.setText("Genre");
        moviePanel1.add(genreLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        genre1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel1.add(genre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        contentRatingLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel1.setForeground(new java.awt.Color(235, 16, 42));
        contentRatingLabel1.setText("Content Rating");
        moviePanel1.add(contentRatingLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        contentRating1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel1.add(contentRating1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        ticketPriceLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ticketPriceLabel1.setForeground(new java.awt.Color(235, 16, 42));
        ticketPriceLabel1.setText("Ticket Price");
        moviePanel1.add(ticketPriceLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        adultLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        adultLabel1.setText("Adults (ages 14 & up)");
        moviePanel1.add(adultLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        childLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        childLabel1.setText("Children (ages 2 - 13)");
        moviePanel1.add(childLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        watchTrailerBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchTrailerBtn1ActionPerformed(evt);
            }
        });
        moviePanel1.add(watchTrailerBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 30));
        moviePanel1.add(tckPriceAdult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 442, -1, -1));
        moviePanel1.add(tckPriceChild1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        bookNowBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNowBtn1ActionPerformed(evt);
            }
        });
        moviePanel1.add(bookNowBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 110, 30));

        moviesPanel.add(moviePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, 540));

        moviePanel2.setBackground(new java.awt.Color(255, 255, 255));
        moviePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movieLabel2.setBackground(new java.awt.Color(255, 255, 255));
        movieLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movieLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moviePanel2.add(movieLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 155));

        movieTitle2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        movieTitle2.setForeground(new java.awt.Color(235, 16, 42));
        moviePanel2.add(movieTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, -1));

        rating2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel2.add(rating2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        starLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        moviePanel2.add(starLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        runtime2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel2.add(runtime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        ratingLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ratingLabel2.setForeground(new java.awt.Color(235, 16, 42));
        ratingLabel2.setText("Rating");
        moviePanel2.add(ratingLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        runtimeLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        runtimeLabel2.setForeground(new java.awt.Color(235, 16, 42));
        runtimeLabel2.setText("Runtime");
        moviePanel2.add(runtimeLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        genreLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreLabel2.setForeground(new java.awt.Color(235, 16, 42));
        genreLabel2.setText("Genre");
        moviePanel2.add(genreLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        genre2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel2.add(genre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        contentRatingLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel2.setForeground(new java.awt.Color(235, 16, 42));
        contentRatingLabel2.setText("Content Rating");
        moviePanel2.add(contentRatingLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        contentRating2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel2.add(contentRating2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        ticketPriceLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ticketPriceLabel2.setForeground(new java.awt.Color(235, 16, 42));
        ticketPriceLabel2.setText("Ticket Price");
        moviePanel2.add(ticketPriceLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        adultLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        adultLabel2.setText("Adults (ages 14 & up)");
        moviePanel2.add(adultLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        childLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        childLabel2.setText("Children (ages 2 - 13)");
        moviePanel2.add(childLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        watchTrailerBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchTrailerBtn2ActionPerformed(evt);
            }
        });
        moviePanel2.add(watchTrailerBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 30));
        moviePanel2.add(tckPriceAdult2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 442, -1, -1));
        moviePanel2.add(tckPriceChild2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));
        moviePanel2.add(bookNowBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 110, 30));

        moviesPanel.add(moviePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 250, 540));

        moviePanel3.setBackground(new java.awt.Color(255, 255, 255));
        moviePanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movieLabel3.setBackground(new java.awt.Color(255, 255, 255));
        movieLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movieLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moviePanel3.add(movieLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 155));

        movieTitle3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        movieTitle3.setForeground(new java.awt.Color(235, 16, 42));
        moviePanel3.add(movieTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, -1));

        rating3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel3.add(rating3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        starLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        moviePanel3.add(starLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        runtime3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel3.add(runtime3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        ratingLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ratingLabel3.setForeground(new java.awt.Color(235, 16, 42));
        ratingLabel3.setText("Rating");
        moviePanel3.add(ratingLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        runtimeLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        runtimeLabel3.setForeground(new java.awt.Color(235, 16, 42));
        runtimeLabel3.setText("Runtime");
        moviePanel3.add(runtimeLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        genreLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreLabel3.setForeground(new java.awt.Color(235, 16, 42));
        genreLabel3.setText("Genre");
        moviePanel3.add(genreLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        genre3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel3.add(genre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        contentRatingLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel3.setForeground(new java.awt.Color(235, 16, 42));
        contentRatingLabel3.setText("Content Rating");
        moviePanel3.add(contentRatingLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        contentRating3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel3.add(contentRating3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        ticketPriceLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ticketPriceLabel3.setForeground(new java.awt.Color(235, 16, 42));
        ticketPriceLabel3.setText("Ticket Price");
        moviePanel3.add(ticketPriceLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        adultLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        adultLabel3.setText("Adults (ages 14 & up)");
        moviePanel3.add(adultLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        childLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        childLabel3.setText("Children (ages 2 - 13)");
        moviePanel3.add(childLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        watchTrailerBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchTrailerBtn3ActionPerformed(evt);
            }
        });
        moviePanel3.add(watchTrailerBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 30));
        moviePanel3.add(tckPriceAdult3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 442, -1, -1));
        moviePanel3.add(tckPriceChild3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));
        moviePanel3.add(bookNowBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 110, 30));

        moviesPanel.add(moviePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 250, 540));

        getContentPane().add(moviesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 910, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelVisible(Boolean m, Boolean mb, Boolean p){
        moviesPanel.setVisible(m);
       // myBookingsPanel.setVisible(mb);
        //profilePanel.setVisible(p);
    }
    DefaultTableModel model = new DefaultTableModel(new String[]{"Movie Title", "Genre", "Rating", "Hour", "Minute", "Content Rating", "Ticket Price Child", "Ticket Price Adult", "uri", "Poster"}, 0);
    
    private String uri1,uri2,uri3 = null;
    private void getMovies(){
        //Retrieve data
        String query = "SELECT movie_title, genre, rating, hour, minute, content_rating, ticket_price_child, ticket_price_adult, uri, poster FROM `movies`" ;
        String movietitle = null;
        String genre = null;
        Double rating = 0.0;
        int hour = 0;
        int minute = 0;
        String contentRating = null;
        String ticketPriceChild = null;
        String ticketPriceAdult = null;
        String uri = null;
        byte[] posterBytes = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = DBConnectClass.getConnection().prepareStatement(query);
            rs = pst.executeQuery();
            while(rs.next()){
                movietitle = rs.getString("movie_title");
                genre = rs.getString("genre");
                rating = rs.getDouble("rating");
                hour = rs.getInt("hour");
                minute = rs.getInt("minute");
                contentRating = rs.getString("content_rating");
                ticketPriceChild = String.valueOf(rs.getInt("ticket_price_child"));
                ticketPriceAdult = String.valueOf(rs.getInt("ticket_price_adult"));
                uri = rs.getString("uri");
                posterBytes = rs.getBytes("poster");
                model.addRow(new Object[]{movietitle, genre, rating, hour, minute, contentRating, ticketPriceChild, ticketPriceAdult, uri, posterBytes});
            }
            pst.close();
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //set data from model to fields
        movieTitle1.setText("<html>"+ model.getValueAt(0, 0).toString()+"</html>");
        genre1.setText(model.getValueAt(0,1).toString());
        rating1.setText(model.getValueAt(0,2).toString()+"/10");
        runtime1.setText(model.getValueAt(0,3).toString()+ "h and " + model.getValueAt(0,4).toString()+"m");
        contentRating1.setText(model.getValueAt(0,5).toString());
        tckPriceChild1.setText("Rs. "+ model.getValueAt(0,6).toString());
        tckPriceAdult1.setText("Rs. "+ model.getValueAt(0,7).toString());
        uri1 = model.getValueAt(0,8).toString();
        movieLabel1.setIcon(parsePoster((byte[]) model.getValueAt(0,9)));
        
        movieTitle2.setText("<html>"+ model.getValueAt(1, 0).toString()+"</html>");
        genre2.setText(model.getValueAt(1,1).toString());
        rating2.setText(model.getValueAt(1,2).toString()+"/10");
        runtime2.setText(model.getValueAt(1,3).toString()+ "h and " + model.getValueAt(1,4).toString()+"m");
        contentRating2.setText(model.getValueAt(1,5).toString());
        tckPriceChild2.setText("Rs. "+ model.getValueAt(1,6).toString());
        tckPriceAdult2.setText("Rs. "+ model.getValueAt(1,7).toString());
        uri2 = model.getValueAt(1,8).toString();
        movieLabel2.setIcon(parsePoster((byte[]) model.getValueAt(1,9)));
        
//        movieTitle3.setText("<html>"+ model.getValueAt(2, 0).toString()+"</html>");
//        genre3.setText(model.getValueAt(2,1).toString());
//        rating3.setText(model.getValueAt(2,2).toString()+"/10");
//        runtime3.setText(model.getValueAt(2,3).toString()+ "h and " + model.getValueAt(2,4).toString()+"m");
//        contentRating3.setText(model.getValueAt(2,5).toString());
//        tckPriceChild3.setText("Rs. "+ model.getValueAt(2,6).toString());
//        tckPriceAdult3.setText("Rs. "+ model.getValueAt(2,7).toString());
//        uri3 = model.getValueAt(2,8).toString();
//        movieLabel3.setIcon(parsePoster((byte[]) model.getValueAt(2,9)));
    }
    
    private ImageIcon parsePoster(byte[] dTM){
        ImageIcon icon =new ImageIcon(dTM);
        return icon;
    }
    
    public static boolean openWebpage(String uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URI(uri));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    
    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnMouseExited

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void profileBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnMouseEntered

    private void profileBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnMouseExited

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnActionPerformed

    private void myBookingsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingsBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_myBookingsBtnMouseEntered

    private void myBookingsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingsBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_myBookingsBtnMouseExited

    private void myBookingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBookingsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myBookingsBtnActionPerformed

    private void moviesBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviesBtnMouseEntered
        try {
            Image moviesBtnImgHover = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/moviesBtnHover.png"));
            moviesBtn.setIcon(new ImageIcon(moviesBtnImgHover));
        } catch (IOException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_moviesBtnMouseEntered

    private void moviesBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviesBtnMouseExited
        try {
            Image moviesBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/moviesBtn.png"));
            moviesBtn.setIcon(new ImageIcon(moviesBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_moviesBtnMouseExited

    private void moviesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesBtnActionPerformed
//        panelVisible(true, false, false);
//        try {
//            getMovies();
//        } catch (SQLException ex) {
//            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_moviesBtnActionPerformed

    private void bookNowBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNowBtn1ActionPerformed

    private void watchTrailerBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchTrailerBtn1ActionPerformed
        openWebpage(uri1);
    }//GEN-LAST:event_watchTrailerBtn1ActionPerformed

    private void watchTrailerBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchTrailerBtn2ActionPerformed
        openWebpage(uri2);
    }//GEN-LAST:event_watchTrailerBtn2ActionPerformed

    private void watchTrailerBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchTrailerBtn3ActionPerformed
        openWebpage(uri3);
    }//GEN-LAST:event_watchTrailerBtn3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adultLabel1;
    private javax.swing.JLabel adultLabel2;
    private javax.swing.JLabel adultLabel3;
    private javax.swing.JButton bookNowBtn1;
    private javax.swing.JButton bookNowBtn2;
    private javax.swing.JButton bookNowBtn3;
    private javax.swing.JLabel childLabel1;
    private javax.swing.JLabel childLabel2;
    private javax.swing.JLabel childLabel3;
    private javax.swing.JLabel contentRating1;
    private javax.swing.JLabel contentRating2;
    private javax.swing.JLabel contentRating3;
    private javax.swing.JLabel contentRatingLabel1;
    private javax.swing.JLabel contentRatingLabel2;
    private javax.swing.JLabel contentRatingLabel3;
    private javax.swing.JLabel genre1;
    private javax.swing.JLabel genre2;
    private javax.swing.JLabel genre3;
    private javax.swing.JLabel genreLabel1;
    private javax.swing.JLabel genreLabel2;
    private javax.swing.JLabel genreLabel3;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel movieLabel1;
    private javax.swing.JLabel movieLabel2;
    private javax.swing.JLabel movieLabel3;
    private javax.swing.JPanel moviePanel1;
    private javax.swing.JPanel moviePanel2;
    private javax.swing.JPanel moviePanel3;
    private javax.swing.JLabel movieTitle1;
    private javax.swing.JLabel movieTitle2;
    private javax.swing.JLabel movieTitle3;
    private javax.swing.JButton moviesBtn;
    private javax.swing.JPanel moviesPanel;
    private javax.swing.JButton myBookingsBtn;
    private javax.swing.JPanel navPanel;
    private javax.swing.JButton profileBtn;
    private javax.swing.JLabel rating1;
    private javax.swing.JLabel rating2;
    private javax.swing.JLabel rating3;
    private javax.swing.JLabel ratingLabel1;
    private javax.swing.JLabel ratingLabel2;
    private javax.swing.JLabel ratingLabel3;
    private javax.swing.JLabel runtime1;
    private javax.swing.JLabel runtime2;
    private javax.swing.JLabel runtime3;
    private javax.swing.JLabel runtimeLabel1;
    private javax.swing.JLabel runtimeLabel2;
    private javax.swing.JLabel runtimeLabel3;
    private javax.swing.JLabel starLabel1;
    private javax.swing.JLabel starLabel2;
    private javax.swing.JLabel starLabel3;
    private javax.swing.JLabel tckPriceAdult1;
    private javax.swing.JLabel tckPriceAdult2;
    private javax.swing.JLabel tckPriceAdult3;
    private javax.swing.JLabel tckPriceChild1;
    private javax.swing.JLabel tckPriceChild2;
    private javax.swing.JLabel tckPriceChild3;
    private javax.swing.JLabel ticketPriceLabel1;
    private javax.swing.JLabel ticketPriceLabel2;
    private javax.swing.JLabel ticketPriceLabel3;
    private javax.swing.JButton watchTrailerBtn1;
    private javax.swing.JButton watchTrailerBtn2;
    private javax.swing.JButton watchTrailerBtn3;
    // End of variables declaration//GEN-END:variables
}
