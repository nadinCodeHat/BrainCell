package movie.ticketbooking.system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nadinCodeHat
 */
public class BookTicketsFrm extends javax.swing.JFrame {

    public BookTicketsFrm(){
        
    }
    
    private int id=0;
    public BookTicketsFrm(int id) {
        initComponents();
        this.id = id;
    }

    private void loadMovieData(){
        //Retrieve data
        String query = "SELECT movie_title, genre, rating, hour, minute, content_rating, description, screen, ticket_price_child, ticket_price_adult, poster FROM `movies` WHERE id = '"+id+"'" ;
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
            }
            pst.close();
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
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
        contentRating1 = new javax.swing.JLabel();
        ticketPriceLabel1 = new javax.swing.JLabel();
        adultLabel1 = new javax.swing.JLabel();
        childLabel1 = new javax.swing.JLabel();
        tckPriceAdult1 = new javax.swing.JLabel();
        tckPriceChild1 = new javax.swing.JLabel();
        contentRatingLabel2 = new javax.swing.JLabel();
        showtimeCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        contentRatingLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton43 = new javax.swing.JToggleButton();
        jToggleButton46 = new javax.swing.JToggleButton();
        jToggleButton49 = new javax.swing.JToggleButton();
        jToggleButton52 = new javax.swing.JToggleButton();
        jToggleButton55 = new javax.swing.JToggleButton();
        jToggleButton58 = new javax.swing.JToggleButton();
        jToggleButton61 = new javax.swing.JToggleButton();
        jToggleButton85 = new javax.swing.JToggleButton();
        jToggleButton86 = new javax.swing.JToggleButton();
        jToggleButton87 = new javax.swing.JToggleButton();
        jToggleButton88 = new javax.swing.JToggleButton();
        jToggleButton89 = new javax.swing.JToggleButton();
        jToggleButton90 = new javax.swing.JToggleButton();
        jToggleButton91 = new javax.swing.JToggleButton();
        jToggleButton92 = new javax.swing.JToggleButton();
        jToggleButton93 = new javax.swing.JToggleButton();
        jToggleButton94 = new javax.swing.JToggleButton();
        jToggleButton95 = new javax.swing.JToggleButton();
        jToggleButton96 = new javax.swing.JToggleButton();
        jToggleButton97 = new javax.swing.JToggleButton();
        jToggleButton98 = new javax.swing.JToggleButton();
        jToggleButton99 = new javax.swing.JToggleButton();
        jToggleButton100 = new javax.swing.JToggleButton();
        jToggleButton101 = new javax.swing.JToggleButton();
        jToggleButton102 = new javax.swing.JToggleButton();
        jToggleButton103 = new javax.swing.JToggleButton();
        jToggleButton104 = new javax.swing.JToggleButton();
        jToggleButton105 = new javax.swing.JToggleButton();
        jToggleButton106 = new javax.swing.JToggleButton();
        jToggleButton107 = new javax.swing.JToggleButton();
        jToggleButton108 = new javax.swing.JToggleButton();
        jToggleButton109 = new javax.swing.JToggleButton();
        jToggleButton110 = new javax.swing.JToggleButton();
        jToggleButton111 = new javax.swing.JToggleButton();
        jToggleButton112 = new javax.swing.JToggleButton();
        jToggleButton113 = new javax.swing.JToggleButton();
        jToggleButton114 = new javax.swing.JToggleButton();
        jToggleButton115 = new javax.swing.JToggleButton();
        jToggleButton116 = new javax.swing.JToggleButton();
        jToggleButton117 = new javax.swing.JToggleButton();
        jToggleButton118 = new javax.swing.JToggleButton();
        jToggleButton119 = new javax.swing.JToggleButton();
        jToggleButton120 = new javax.swing.JToggleButton();
        jToggleButton121 = new javax.swing.JToggleButton();
        jToggleButton122 = new javax.swing.JToggleButton();
        jToggleButton123 = new javax.swing.JToggleButton();
        jToggleButton124 = new javax.swing.JToggleButton();
        jToggleButton125 = new javax.swing.JToggleButton();
        jToggleButton126 = new javax.swing.JToggleButton();
        jToggleButton127 = new javax.swing.JToggleButton();
        jToggleButton128 = new javax.swing.JToggleButton();
        jToggleButton129 = new javax.swing.JToggleButton();
        jToggleButton130 = new javax.swing.JToggleButton();
        jToggleButton131 = new javax.swing.JToggleButton();
        jToggleButton132 = new javax.swing.JToggleButton();
        jToggleButton133 = new javax.swing.JToggleButton();
        jToggleButton134 = new javax.swing.JToggleButton();
        jToggleButton135 = new javax.swing.JToggleButton();
        jToggleButton136 = new javax.swing.JToggleButton();
        jToggleButton137 = new javax.swing.JToggleButton();
        jToggleButton138 = new javax.swing.JToggleButton();
        jToggleButton139 = new javax.swing.JToggleButton();
        jToggleButton140 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        moviePanel1.add(tckPriceAdult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 442, -1, -1));
        moviePanel1.add(tckPriceChild1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        contentRatingLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel2.setForeground(new java.awt.Color(235, 16, 42));
        contentRatingLabel2.setText("Content Rating");
        moviePanel1.add(contentRatingLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jPanel3.add(moviePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 250, 540));

        showtimeCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        showtimeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select showtime", "10:30 AM", "1:30 PM", "4:30 PM", "7:30 PM" }));
        jPanel3.add(showtimeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("No. of adult tickets");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("No. of child tickets");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));
        jPanel3.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, -1, -1));
        jPanel3.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 590, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentRatingLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contentRatingLabel1.setForeground(new java.awt.Color(235, 16, 42));
        contentRatingLabel1.setText("SCREEN 1");
        jPanel1.add(contentRatingLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 15, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 570, 50));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton1.setAlignmentY(0.0F);
        jToggleButton1.setBorder(null);
        jPanel3.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 30, 30));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton2.setAlignmentY(0.0F);
        jToggleButton2.setBorder(null);
        jPanel3.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 30, 30));

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton3.setAlignmentY(0.0F);
        jToggleButton3.setBorder(null);
        jPanel3.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 30, 30));

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton4.setAlignmentY(0.0F);
        jToggleButton4.setBorder(null);
        jPanel3.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 30, 30));

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton5.setAlignmentY(0.0F);
        jToggleButton5.setBorder(null);
        jPanel3.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 30, 30));

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton6.setAlignmentY(0.0F);
        jToggleButton6.setBorder(null);
        jPanel3.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 30, 30));

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton7.setAlignmentY(0.0F);
        jToggleButton7.setBorder(null);
        jPanel3.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 30, 30));

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton8.setAlignmentY(0.0F);
        jToggleButton8.setBorder(null);
        jPanel3.add(jToggleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 30, 30));

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton9.setAlignmentY(0.0F);
        jToggleButton9.setBorder(null);
        jPanel3.add(jToggleButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 30, 30));

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton10.setAlignmentY(0.0F);
        jToggleButton10.setBorder(null);
        jPanel3.add(jToggleButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 30, 30));

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton11.setAlignmentY(0.0F);
        jToggleButton11.setBorder(null);
        jPanel3.add(jToggleButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 30, 30));

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton12.setAlignmentY(0.0F);
        jToggleButton12.setBorder(null);
        jPanel3.add(jToggleButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 30, 30));

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton13.setAlignmentY(0.0F);
        jToggleButton13.setBorder(null);
        jPanel3.add(jToggleButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 30, 30));

        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton14.setAlignmentY(0.0F);
        jToggleButton14.setBorder(null);
        jPanel3.add(jToggleButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 30, 30));

        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton15.setAlignmentY(0.0F);
        jToggleButton15.setBorder(null);
        jPanel3.add(jToggleButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 30, 30));

        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton16.setAlignmentY(0.0F);
        jToggleButton16.setBorder(null);
        jPanel3.add(jToggleButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 30, 30));

        jToggleButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton17.setAlignmentY(0.0F);
        jToggleButton17.setBorder(null);
        jPanel3.add(jToggleButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 30, 30));

        jToggleButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton18.setAlignmentY(0.0F);
        jToggleButton18.setBorder(null);
        jPanel3.add(jToggleButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 30, 30));

        jToggleButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton19.setAlignmentY(0.0F);
        jToggleButton19.setBorder(null);
        jPanel3.add(jToggleButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 30, 30));

        jToggleButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton20.setAlignmentY(0.0F);
        jToggleButton20.setBorder(null);
        jPanel3.add(jToggleButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 30, 30));

        jToggleButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton21.setAlignmentY(0.0F);
        jToggleButton21.setBorder(null);
        jPanel3.add(jToggleButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 30, 30));

        jToggleButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton43.setAlignmentY(0.0F);
        jToggleButton43.setBorder(null);
        jPanel3.add(jToggleButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 30, 30));

        jToggleButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton46.setAlignmentY(0.0F);
        jToggleButton46.setBorder(null);
        jPanel3.add(jToggleButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 30, 30));

        jToggleButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton49.setAlignmentY(0.0F);
        jToggleButton49.setBorder(null);
        jPanel3.add(jToggleButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 30, 30));

        jToggleButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton52.setAlignmentY(0.0F);
        jToggleButton52.setBorder(null);
        jPanel3.add(jToggleButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 30, 30));

        jToggleButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton55.setAlignmentY(0.0F);
        jToggleButton55.setBorder(null);
        jPanel3.add(jToggleButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 30, 30));

        jToggleButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton58.setAlignmentY(0.0F);
        jToggleButton58.setBorder(null);
        jPanel3.add(jToggleButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 30, 30));

        jToggleButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton61.setAlignmentY(0.0F);
        jToggleButton61.setBorder(null);
        jPanel3.add(jToggleButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 30, 30));

        jToggleButton85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton85.setAlignmentY(0.0F);
        jToggleButton85.setBorder(null);
        jPanel3.add(jToggleButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 30, 30));

        jToggleButton86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton86.setAlignmentY(0.0F);
        jToggleButton86.setBorder(null);
        jPanel3.add(jToggleButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 30, 30));

        jToggleButton87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton87.setAlignmentY(0.0F);
        jToggleButton87.setBorder(null);
        jPanel3.add(jToggleButton87, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 30, 30));

        jToggleButton88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton88.setAlignmentY(0.0F);
        jToggleButton88.setBorder(null);
        jPanel3.add(jToggleButton88, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 30, 30));

        jToggleButton89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton89.setAlignmentY(0.0F);
        jToggleButton89.setBorder(null);
        jPanel3.add(jToggleButton89, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 30, 30));

        jToggleButton90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton90.setAlignmentY(0.0F);
        jToggleButton90.setBorder(null);
        jPanel3.add(jToggleButton90, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 30, 30));

        jToggleButton91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton91.setAlignmentY(0.0F);
        jToggleButton91.setBorder(null);
        jPanel3.add(jToggleButton91, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 30, 30));

        jToggleButton92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton92.setAlignmentY(0.0F);
        jToggleButton92.setBorder(null);
        jPanel3.add(jToggleButton92, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 30, 30));

        jToggleButton93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton93.setAlignmentY(0.0F);
        jToggleButton93.setBorder(null);
        jPanel3.add(jToggleButton93, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 30, 30));

        jToggleButton94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton94.setAlignmentY(0.0F);
        jToggleButton94.setBorder(null);
        jPanel3.add(jToggleButton94, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 30, 30));

        jToggleButton95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton95.setAlignmentY(0.0F);
        jToggleButton95.setBorder(null);
        jPanel3.add(jToggleButton95, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 30, 30));

        jToggleButton96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton96.setAlignmentY(0.0F);
        jToggleButton96.setBorder(null);
        jPanel3.add(jToggleButton96, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 30, 30));

        jToggleButton97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton97.setAlignmentY(0.0F);
        jToggleButton97.setBorder(null);
        jPanel3.add(jToggleButton97, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 30, 30));

        jToggleButton98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton98.setAlignmentY(0.0F);
        jToggleButton98.setBorder(null);
        jPanel3.add(jToggleButton98, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 30, 30));

        jToggleButton99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton99.setAlignmentY(0.0F);
        jToggleButton99.setBorder(null);
        jPanel3.add(jToggleButton99, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 30, 30));

        jToggleButton100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton100.setAlignmentY(0.0F);
        jToggleButton100.setBorder(null);
        jPanel3.add(jToggleButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 30, 30));

        jToggleButton101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton101.setAlignmentY(0.0F);
        jToggleButton101.setBorder(null);
        jPanel3.add(jToggleButton101, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 30, 30));

        jToggleButton102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton102.setAlignmentY(0.0F);
        jToggleButton102.setBorder(null);
        jPanel3.add(jToggleButton102, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 30, 30));

        jToggleButton103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton103.setAlignmentY(0.0F);
        jToggleButton103.setBorder(null);
        jPanel3.add(jToggleButton103, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 30, 30));

        jToggleButton104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton104.setAlignmentY(0.0F);
        jToggleButton104.setBorder(null);
        jPanel3.add(jToggleButton104, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 30, 30));

        jToggleButton105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton105.setAlignmentY(0.0F);
        jToggleButton105.setBorder(null);
        jPanel3.add(jToggleButton105, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 30, 30));

        jToggleButton106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton106.setAlignmentY(0.0F);
        jToggleButton106.setBorder(null);
        jPanel3.add(jToggleButton106, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 30, 30));

        jToggleButton107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton107.setAlignmentY(0.0F);
        jToggleButton107.setBorder(null);
        jPanel3.add(jToggleButton107, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 30, 30));

        jToggleButton108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton108.setAlignmentY(0.0F);
        jToggleButton108.setBorder(null);
        jPanel3.add(jToggleButton108, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 30, 30));

        jToggleButton109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton109.setAlignmentY(0.0F);
        jToggleButton109.setBorder(null);
        jPanel3.add(jToggleButton109, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 30, 30));

        jToggleButton110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton110.setAlignmentY(0.0F);
        jToggleButton110.setBorder(null);
        jPanel3.add(jToggleButton110, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 30, 30));

        jToggleButton111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton111.setAlignmentY(0.0F);
        jToggleButton111.setBorder(null);
        jPanel3.add(jToggleButton111, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 30, 30));

        jToggleButton112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton112.setAlignmentY(0.0F);
        jToggleButton112.setBorder(null);
        jPanel3.add(jToggleButton112, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 30, 30));

        jToggleButton113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton113.setAlignmentY(0.0F);
        jToggleButton113.setBorder(null);
        jPanel3.add(jToggleButton113, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 30, 30));

        jToggleButton114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton114.setAlignmentY(0.0F);
        jToggleButton114.setBorder(null);
        jPanel3.add(jToggleButton114, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 30, 30));

        jToggleButton115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton115.setAlignmentY(0.0F);
        jToggleButton115.setBorder(null);
        jPanel3.add(jToggleButton115, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 30, 30));

        jToggleButton116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton116.setAlignmentY(0.0F);
        jToggleButton116.setBorder(null);
        jPanel3.add(jToggleButton116, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 30, 30));

        jToggleButton117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton117.setAlignmentY(0.0F);
        jToggleButton117.setBorder(null);
        jPanel3.add(jToggleButton117, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 30, 30));

        jToggleButton118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton118.setAlignmentY(0.0F);
        jToggleButton118.setBorder(null);
        jPanel3.add(jToggleButton118, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 30, 30));

        jToggleButton119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton119.setAlignmentY(0.0F);
        jToggleButton119.setBorder(null);
        jPanel3.add(jToggleButton119, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 30, 30));

        jToggleButton120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton120.setAlignmentY(0.0F);
        jToggleButton120.setBorder(null);
        jPanel3.add(jToggleButton120, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 260, 30, 30));

        jToggleButton121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton121.setAlignmentY(0.0F);
        jToggleButton121.setBorder(null);
        jPanel3.add(jToggleButton121, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 30, 30));

        jToggleButton122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton122.setAlignmentY(0.0F);
        jToggleButton122.setBorder(null);
        jPanel3.add(jToggleButton122, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, 30, 30));

        jToggleButton123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton123.setAlignmentY(0.0F);
        jToggleButton123.setBorder(null);
        jPanel3.add(jToggleButton123, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 30, 30));

        jToggleButton124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton124.setAlignmentY(0.0F);
        jToggleButton124.setBorder(null);
        jPanel3.add(jToggleButton124, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, 30, 30));

        jToggleButton125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton125.setAlignmentY(0.0F);
        jToggleButton125.setBorder(null);
        jPanel3.add(jToggleButton125, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 30, 30));

        jToggleButton126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton126.setAlignmentY(0.0F);
        jToggleButton126.setBorder(null);
        jPanel3.add(jToggleButton126, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 30, 30));

        jToggleButton127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton127.setAlignmentY(0.0F);
        jToggleButton127.setBorder(null);
        jPanel3.add(jToggleButton127, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 30, 30));

        jToggleButton128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton128.setAlignmentY(0.0F);
        jToggleButton128.setBorder(null);
        jPanel3.add(jToggleButton128, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 30, 30));

        jToggleButton129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton129.setAlignmentY(0.0F);
        jToggleButton129.setBorder(null);
        jPanel3.add(jToggleButton129, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 30, 30));

        jToggleButton130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton130.setAlignmentY(0.0F);
        jToggleButton130.setBorder(null);
        jPanel3.add(jToggleButton130, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 30, 30));

        jToggleButton131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton131.setAlignmentY(0.0F);
        jToggleButton131.setBorder(null);
        jPanel3.add(jToggleButton131, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 30, 30));

        jToggleButton132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton132.setAlignmentY(0.0F);
        jToggleButton132.setBorder(null);
        jPanel3.add(jToggleButton132, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 30, 30));

        jToggleButton133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton133.setAlignmentY(0.0F);
        jToggleButton133.setBorder(null);
        jPanel3.add(jToggleButton133, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 30, 30));

        jToggleButton134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton134.setAlignmentY(0.0F);
        jToggleButton134.setBorder(null);
        jPanel3.add(jToggleButton134, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 30, 30));

        jToggleButton135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton135.setAlignmentY(0.0F);
        jToggleButton135.setBorder(null);
        jPanel3.add(jToggleButton135, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 30, 30));

        jToggleButton136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton136.setAlignmentY(0.0F);
        jToggleButton136.setBorder(null);
        jPanel3.add(jToggleButton136, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 30, 30));

        jToggleButton137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton137.setAlignmentY(0.0F);
        jToggleButton137.setBorder(null);
        jPanel3.add(jToggleButton137, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 30, 30));

        jToggleButton138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton138.setAlignmentY(0.0F);
        jToggleButton138.setBorder(null);
        jPanel3.add(jToggleButton138, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 30, 30));

        jToggleButton139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton139.setAlignmentY(0.0F);
        jToggleButton139.setBorder(null);
        jPanel3.add(jToggleButton139, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 30, 30));

        jToggleButton140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        jToggleButton140.setAlignmentY(0.0F);
        jToggleButton140.setBorder(null);
        jPanel3.add(jToggleButton140, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("B");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("A");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("D");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("C");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("G");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("E");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("F");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("12");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("6");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("7");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("3");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setText("1");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setText("2");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setText("8");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setText("5");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setText("4");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setText("9");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setText("10");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setText("11");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, -1, -1));

        jPanel4.setBackground(new java.awt.Color(235, 16, 42));
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 15, 15));
        jPanel4.getAccessibleContext().setAccessibleName("");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setText("Seat Available");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        jPanel5.setBackground(new java.awt.Color(36, 34, 54));
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 15, 15));
        jPanel5.getAccessibleContext().setAccessibleName("");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setText("Seat Reserved");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        jPanel6.setBackground(new java.awt.Color(30, 145, 64));
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 15, 15));
        jPanel6.getAccessibleContext().setAccessibleName("");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setText("Your Seat");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BookTicketsFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTicketsFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTicketsFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTicketsFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BookTicketsFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adultLabel1;
    private javax.swing.JLabel childLabel1;
    private javax.swing.JLabel contentRating1;
    private javax.swing.JLabel contentRatingLabel1;
    private javax.swing.JLabel contentRatingLabel2;
    private javax.swing.JLabel genre1;
    private javax.swing.JLabel genreLabel1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton100;
    private javax.swing.JToggleButton jToggleButton101;
    private javax.swing.JToggleButton jToggleButton102;
    private javax.swing.JToggleButton jToggleButton103;
    private javax.swing.JToggleButton jToggleButton104;
    private javax.swing.JToggleButton jToggleButton105;
    private javax.swing.JToggleButton jToggleButton106;
    private javax.swing.JToggleButton jToggleButton107;
    private javax.swing.JToggleButton jToggleButton108;
    private javax.swing.JToggleButton jToggleButton109;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton110;
    private javax.swing.JToggleButton jToggleButton111;
    private javax.swing.JToggleButton jToggleButton112;
    private javax.swing.JToggleButton jToggleButton113;
    private javax.swing.JToggleButton jToggleButton114;
    private javax.swing.JToggleButton jToggleButton115;
    private javax.swing.JToggleButton jToggleButton116;
    private javax.swing.JToggleButton jToggleButton117;
    private javax.swing.JToggleButton jToggleButton118;
    private javax.swing.JToggleButton jToggleButton119;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton120;
    private javax.swing.JToggleButton jToggleButton121;
    private javax.swing.JToggleButton jToggleButton122;
    private javax.swing.JToggleButton jToggleButton123;
    private javax.swing.JToggleButton jToggleButton124;
    private javax.swing.JToggleButton jToggleButton125;
    private javax.swing.JToggleButton jToggleButton126;
    private javax.swing.JToggleButton jToggleButton127;
    private javax.swing.JToggleButton jToggleButton128;
    private javax.swing.JToggleButton jToggleButton129;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton130;
    private javax.swing.JToggleButton jToggleButton131;
    private javax.swing.JToggleButton jToggleButton132;
    private javax.swing.JToggleButton jToggleButton133;
    private javax.swing.JToggleButton jToggleButton134;
    private javax.swing.JToggleButton jToggleButton135;
    private javax.swing.JToggleButton jToggleButton136;
    private javax.swing.JToggleButton jToggleButton137;
    private javax.swing.JToggleButton jToggleButton138;
    private javax.swing.JToggleButton jToggleButton139;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton140;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton43;
    private javax.swing.JToggleButton jToggleButton46;
    private javax.swing.JToggleButton jToggleButton49;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton52;
    private javax.swing.JToggleButton jToggleButton55;
    private javax.swing.JToggleButton jToggleButton58;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton61;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton85;
    private javax.swing.JToggleButton jToggleButton86;
    private javax.swing.JToggleButton jToggleButton87;
    private javax.swing.JToggleButton jToggleButton88;
    private javax.swing.JToggleButton jToggleButton89;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JToggleButton jToggleButton90;
    private javax.swing.JToggleButton jToggleButton91;
    private javax.swing.JToggleButton jToggleButton92;
    private javax.swing.JToggleButton jToggleButton93;
    private javax.swing.JToggleButton jToggleButton94;
    private javax.swing.JToggleButton jToggleButton95;
    private javax.swing.JToggleButton jToggleButton96;
    private javax.swing.JToggleButton jToggleButton97;
    private javax.swing.JToggleButton jToggleButton98;
    private javax.swing.JToggleButton jToggleButton99;
    private javax.swing.JLabel movieLabel1;
    private javax.swing.JPanel moviePanel1;
    private javax.swing.JLabel movieTitle1;
    private javax.swing.JLabel rating1;
    private javax.swing.JLabel ratingLabel1;
    private javax.swing.JLabel runtime1;
    private javax.swing.JLabel runtimeLabel1;
    private javax.swing.JComboBox<String> showtimeCombo;
    private javax.swing.JLabel starLabel1;
    private javax.swing.JLabel tckPriceAdult1;
    private javax.swing.JLabel tckPriceChild1;
    private javax.swing.JLabel ticketPriceLabel1;
    // End of variables declaration//GEN-END:variables
}
