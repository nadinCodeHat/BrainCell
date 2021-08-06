package movie.ticketbooking.system;

import com.mysql.jdbc.Blob;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.awt.Image;
import java.util.List;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author nadinCodeHat
 */
public class Add_Edit_Movie_Frm extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs;
    int posX=0,posY=0;

    public Add_Edit_Movie_Frm(){
        
    }
    
    JFrame obj;
    String moviename;
    public Add_Edit_Movie_Frm(Admin_Main_Frm add_main_frm, String moviename) throws IOException{
        initComponents();
        this.obj = add_main_frm;
        this.moviename = moviename;
        loadEditData();
    }

    public void loadEditData()throws IOException{
        if(!moviename.equals(null)){
            //Retrieve data
            String query = "SELECT genre, rating, runtime, content_rating, description, theater, ticket_price_child, ticket_price_adult, poster FROM `movies` WHERE movie_title= '" + moviename + "'" ;
            String genre = null;
            Double rating = 0.0;
            String runtime = null;
            String contentRating = null;
            String description = null;
            String theater = null;
            String ticketPriceChild = null;
            String ticketPriceAdult = null;
            ImageIcon posterIcon = null;
            try {
                pst = DBConnectClass.getConnection().prepareStatement(query);
                rs = pst.executeQuery();
                while(rs.next()){
                    genre = rs.getString("genre");
                    rating = rs.getDouble("rating");
                    runtime = rs.getString("runtime");
                    contentRating = rs.getString("content_rating");
                    description = rs.getString("description");
                    theater = rs.getString("theater");
                    ticketPriceChild = String.valueOf(rs.getInt("ticket_price_child"));
                    ticketPriceAdult = String.valueOf(rs.getInt("ticket_price_adult"));
                    posterIcon = parsePoster((Blob) rs.getBlob("poster"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login_Frm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            posterLabel.setIcon(posterIcon);
            movieTitleTxtField.setText(moviename);
            ratingSpinner.setValue(rating);
            //hourSpinner.
            //minuteSpinner.
            contRatingCombo.setSelectedItem(contentRating);
            List<String> listGenre = Arrays.asList(genre.split(","));
            
            for (String gen : listGenre) {
                if(gen.equals("Adventure")){
                    adventureTogBtn.setSelected(true);
                }
                if(gen.equals("Action")){
                    actionTogBtn.setSelected(true);
                }
                if(gen.equals("Mystery")){
                    mysteryTogBtn.setSelected(true);
                }
                if(gen.equals("Animation")){
                    animationTogBtn.setSelected(true);
                }
                if(gen.equals("Crime")){
                    crimeTogBtn.setSelected(true);
                }
                if(gen.equals("Comedy")){
                    comedyTogBtn.setSelected(true);
                }
                if(gen.equals("Horror")){
                    horrorTogBtn.setSelected(true);
                }
                if(gen.equals("Thriller")){
                    thrillerTogBtn.setSelected(true);
                }
                if(gen.equals("Fantasy")){
                    fantasyTogBtn.setSelected(true);
                }
                if(gen.equals("Drama")){
                    dramaTogBtn.setSelected(true);
                }
            }
            descripTxtArea.setText(description);
            theaterCombo.setSelectedItem(theater);
            childTckPriceTxtField.setText(ticketPriceChild);
            adultTckPriceTxtField.setText(ticketPriceAdult);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        miniBtn = new javax.swing.JButton();
        posterLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        movieTitleTxtField = new javax.swing.JTextField();
        movieTitleLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ratingSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        hourSpinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        minuteSpinner = new javax.swing.JSpinner();
        ratingLabel2 = new javax.swing.JLabel();
        adventureTogBtn = new javax.swing.JToggleButton();
        actionTogBtn = new javax.swing.JToggleButton();
        thrillerTogBtn = new javax.swing.JToggleButton();
        fantasyTogBtn = new javax.swing.JToggleButton();
        crimeTogBtn = new javax.swing.JToggleButton();
        mysteryTogBtn = new javax.swing.JToggleButton();
        horrorTogBtn = new javax.swing.JToggleButton();
        animationTogBtn = new javax.swing.JToggleButton();
        comedyTogBtn = new javax.swing.JToggleButton();
        contRatingCombo = new javax.swing.JComboBox<>();
        genreLabel = new javax.swing.JLabel();
        contentRatingLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripTxtArea = new javax.swing.JTextArea();
        dramaTogBtn = new javax.swing.JToggleButton();
        descriptionLabel1 = new javax.swing.JLabel();
        theaterLabel1 = new javax.swing.JLabel();
        theaterCombo = new javax.swing.JComboBox<>();
        adultTckPriceTxtField = new javax.swing.JTextField();
        login_link42 = new javax.swing.JLabel();
        login_link41 = new javax.swing.JLabel();
        login_link36 = new javax.swing.JLabel();
        login_link28 = new javax.swing.JLabel();
        login_link30 = new javax.swing.JLabel();
        childTckPriceTxtField = new javax.swing.JTextField();
        addMovieBtn = new javax.swing.JButton();
        uploadPosterBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 20, 31));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 16, 16));

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
        jPanel1.add(miniBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 16, 4));

        posterLabel.setBackground(new java.awt.Color(255, 255, 255));
        posterLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        posterLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(posterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 250, 155));

        lengthLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lengthLabel.setForeground(new java.awt.Color(255, 255, 255));
        lengthLabel.setText("Length");
        jPanel1.add(lengthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        movieTitleTxtField.setBackground(new java.awt.Color(21, 20, 31));
        movieTitleTxtField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        movieTitleTxtField.setForeground(new java.awt.Color(255, 255, 255));
        movieTitleTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        jPanel1.add(movieTitleTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 380, 30));

        movieTitleLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        movieTitleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        movieTitleLabel1.setText("Movie Title");
        jPanel1.add(movieTitleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 20, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("/10");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        ratingSpinner.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 10.0d, 1.0d));
        jPanel1.add(ratingSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 40, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hours");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        hourSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));
        jPanel1.add(hourSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Minutes");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        minuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel1.add(minuteSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 50, -1));

        ratingLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ratingLabel2.setForeground(new java.awt.Color(255, 255, 255));
        ratingLabel2.setText("Rating");
        jPanel1.add(ratingLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        adventureTogBtn.setBackground(new java.awt.Color(255, 255, 255));
        adventureTogBtn.setText("Adventure");
        adventureTogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adventureTogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(adventureTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        actionTogBtn.setBackground(new java.awt.Color(255, 255, 255));
        actionTogBtn.setText("Action");
        actionTogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionTogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(actionTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        thrillerTogBtn.setBackground(new java.awt.Color(255, 255, 255));
        thrillerTogBtn.setText("Thriller");
        thrillerTogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thrillerTogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(thrillerTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        fantasyTogBtn.setBackground(new java.awt.Color(255, 255, 255));
        fantasyTogBtn.setText("Fantasy");
        fantasyTogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantasyTogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fantasyTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        crimeTogBtn.setBackground(new java.awt.Color(255, 255, 255));
        crimeTogBtn.setText("Crime");
        crimeTogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimeTogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(crimeTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        mysteryTogBtn.setBackground(new java.awt.Color(255, 255, 255));
        mysteryTogBtn.setText("Mystery");
        mysteryTogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mysteryTogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mysteryTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        horrorTogBtn.setBackground(new java.awt.Color(255, 255, 255));
        horrorTogBtn.setText("Horror");
        horrorTogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horrorTogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(horrorTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        animationTogBtn.setBackground(new java.awt.Color(255, 255, 255));
        animationTogBtn.setText("Animation");
        animationTogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animationTogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(animationTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        comedyTogBtn.setBackground(new java.awt.Color(255, 255, 255));
        comedyTogBtn.setText("Comedy");
        comedyTogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comedyTogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(comedyTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        contRatingCombo.setBackground(new java.awt.Color(36, 34, 54));
        contRatingCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G", "PG", "PG-13", "R", "NC-17" }));
        jPanel1.add(contRatingCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 80, 20));

        genreLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel.setText("Genre");
        jPanel1.add(genreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        contentRatingLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contentRatingLabel1.setForeground(new java.awt.Color(255, 255, 255));
        contentRatingLabel1.setText("Content rating");
        jPanel1.add(contentRatingLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        descripTxtArea.setBackground(new java.awt.Color(21, 20, 31));
        descripTxtArea.setColumns(20);
        descripTxtArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descripTxtArea.setForeground(new java.awt.Color(255, 255, 255));
        descripTxtArea.setLineWrap(true);
        descripTxtArea.setRows(5);
        descripTxtArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        jScrollPane1.setViewportView(descripTxtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 380, 80));

        dramaTogBtn.setBackground(new java.awt.Color(255, 255, 255));
        dramaTogBtn.setText("Drama");
        jPanel1.add(dramaTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        descriptionLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        descriptionLabel1.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel1.setText("Description");
        jPanel1.add(descriptionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        theaterLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        theaterLabel1.setForeground(new java.awt.Color(255, 255, 255));
        theaterLabel1.setText("Theater");
        jPanel1.add(theaterLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        theaterCombo.setBackground(new java.awt.Color(36, 34, 54));
        theaterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theater 1", "Theater 2", "Theater 3" }));
        jPanel1.add(theaterCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 90, 20));

        adultTckPriceTxtField.setBackground(new java.awt.Color(21, 20, 31));
        adultTckPriceTxtField.setForeground(new java.awt.Color(255, 255, 255));
        adultTckPriceTxtField.setText("700");
        adultTckPriceTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        adultTckPriceTxtField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        adultTckPriceTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adultTckPriceTxtFieldKeyPressed(evt);
            }
        });
        jPanel1.add(adultTckPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 40, -1));

        login_link42.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link42.setForeground(new java.awt.Color(255, 255, 255));
        login_link42.setText("Adults (ages 14 & up)");
        jPanel1.add(login_link42, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        login_link41.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link41.setForeground(new java.awt.Color(255, 255, 255));
        login_link41.setText("Children (ages 2 - 13)");
        jPanel1.add(login_link41, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, -1, -1));

        login_link36.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link36.setForeground(new java.awt.Color(255, 255, 255));
        login_link36.setText("Ticket Price");
        jPanel1.add(login_link36, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, -1));

        login_link28.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link28.setForeground(new java.awt.Color(255, 255, 255));
        login_link28.setText("Rs.");
        jPanel1.add(login_link28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        login_link30.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        login_link30.setForeground(new java.awt.Color(255, 255, 255));
        login_link30.setText("Rs.");
        jPanel1.add(login_link30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, -1, -1));

        childTckPriceTxtField.setBackground(new java.awt.Color(21, 20, 31));
        childTckPriceTxtField.setForeground(new java.awt.Color(255, 255, 255));
        childTckPriceTxtField.setText("400");
        childTckPriceTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 16, 42)));
        childTckPriceTxtField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        childTckPriceTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                childTckPriceTxtFieldKeyPressed(evt);
            }
        });
        jPanel1.add(childTckPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 40, -1));

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
        jPanel1.add(addMovieBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 100, 30));

        uploadPosterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/uploadPosterBtn.png"))); // NOI18N
        uploadPosterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uploadPosterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                uploadPosterBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                uploadPosterBtnMouseExited(evt);
            }
        });
        uploadPosterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPosterBtnActionPerformed(evt);
            }
        });
        jPanel1.add(uploadPosterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        try {
            Image exitBtnHoverImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtnHover.png"));
            exitBtn.setIcon(new ImageIcon(exitBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(Add_Edit_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        try {
            Image exitBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/exitBtn.png"));
            exitBtn.setIcon(new ImageIcon(exitBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(Add_Edit_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnMouseExited
    
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        SwingUtilities.updateComponentTreeUI(obj);
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void miniBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseEntered
        try {
            Image miniBtnHoverImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/miniBtnHover.png"));
            miniBtn.setIcon(new ImageIcon(miniBtnHoverImg));
        } catch (IOException ex) {
            Logger.getLogger(Add_Edit_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miniBtnMouseEntered

    private void miniBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseExited
        try {
            Image miniBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/miniBtn.png"));
            miniBtn.setIcon(new ImageIcon(miniBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(Add_Edit_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miniBtnMouseExited

    private void miniBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniBtnActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniBtnActionPerformed

    ArrayList<String> genreList = new ArrayList<>();
    String str;
    private void adventureTogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adventureTogBtnActionPerformed
        if(adventureTogBtn.isSelected()){
            genreList.add("Adventure");
            str = String.join(", ",genreList);
        }
        else{
            genreList.remove(adventureTogBtn.getText());
            str = String.join(", ",genreList);
        }
    }//GEN-LAST:event_adventureTogBtnActionPerformed

    private void actionTogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionTogBtnActionPerformed
        if(actionTogBtn.isSelected()){
            genreList.add("Action");
            str = String.join(", ",genreList);
        }
        else{
            genreList.remove(actionTogBtn.getText());
            str = String.join(", ",genreList);
        }
    }//GEN-LAST:event_actionTogBtnActionPerformed

    private void thrillerTogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thrillerTogBtnActionPerformed
        if(thrillerTogBtn.isSelected()){
            genreList.add("Thriller");
            str = String.join(", ",genreList);
        }
        else{
            genreList.remove(thrillerTogBtn.getText());
            str = String.join(", ",genreList);
        }
    }//GEN-LAST:event_thrillerTogBtnActionPerformed

    private void fantasyTogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantasyTogBtnActionPerformed
        if(fantasyTogBtn.isSelected()){
            genreList.add("Fantasy");
            str = String.join(", ",genreList);
        }
        else{
            genreList.remove(fantasyTogBtn.getText());
            str = String.join(", ",genreList);
        }
    }//GEN-LAST:event_fantasyTogBtnActionPerformed

    private void crimeTogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeTogBtnActionPerformed
        if(crimeTogBtn.isSelected()){
            genreList.add("Crime");
            str = String.join(", ",genreList);
        }
        else{
            genreList.remove(crimeTogBtn.getText());
            str = String.join(", ",genreList);
        }
    }//GEN-LAST:event_crimeTogBtnActionPerformed

    private void mysteryTogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mysteryTogBtnActionPerformed
        if(mysteryTogBtn.isSelected()){
            genreList.add("Mystery");
            str = String.join(", ",genreList);
        }
        else{
            genreList.remove(mysteryTogBtn.getText());
            str = String.join(", ",genreList);
        }
    }//GEN-LAST:event_mysteryTogBtnActionPerformed

    private void horrorTogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horrorTogBtnActionPerformed
        if(horrorTogBtn.isSelected()){
            genreList.add("Horror");
            str = String.join(", ",genreList);
        }
        else{
            genreList.remove(horrorTogBtn.getText());
            str = String.join(", ",genreList);
        }
    }//GEN-LAST:event_horrorTogBtnActionPerformed

    private void animationTogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animationTogBtnActionPerformed
        if(animationTogBtn.isSelected()){
            genreList.add("Animation");
            str = String.join(", ",genreList);
        }
        else{
            genreList.remove(animationTogBtn.getText());
            str = String.join(", ",genreList);
        }
    }//GEN-LAST:event_animationTogBtnActionPerformed

    private void comedyTogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comedyTogBtnActionPerformed
        if(comedyTogBtn.isSelected()){
            genreList.add("Comedy");
            str = String.join(", ",genreList);
        }
        else{
            genreList.remove(comedyTogBtn.getText());
            str = String.join(", ",genreList);
        }
    }//GEN-LAST:event_comedyTogBtnActionPerformed

    private void adultTckPriceTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adultTckPriceTxtFieldKeyPressed
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && adultTckPriceTxtField.getText().length()<4 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            adultTckPriceTxtField.setEditable(true);
        } else {
            adultTckPriceTxtField.setEditable(false);
        }
    }//GEN-LAST:event_adultTckPriceTxtFieldKeyPressed

    private void childTckPriceTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_childTckPriceTxtFieldKeyPressed
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && childTckPriceTxtField.getText().length()<4 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            childTckPriceTxtField.setEditable(true);
        } else {
            childTckPriceTxtField.setEditable(false);
        }
    }//GEN-LAST:event_childTckPriceTxtFieldKeyPressed
    ImageIcon ii;
    byte[] poster=null;
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

    private void addMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieBtnActionPerformed
        if(checkEmptyFields()){
            String movie_title = movieTitleTxtField.getText();
            String genre = str;
            Double rating = (Double)ratingSpinner.getValue();
            Integer hour = (Integer)hourSpinner.getValue();
            Integer minute = (Integer)minuteSpinner.getValue();
            String contentRating = contRatingCombo.getSelectedItem().toString();
            String description = descripTxtArea.getText();
            String theater = theaterCombo.getSelectedItem().toString();
            Integer ticketPriceChild = Integer.parseInt(childTckPriceTxtField.getText());
            Integer ticketPriceAdult = Integer.parseInt(adultTckPriceTxtField.getText());
            String runtime = null;
            if(hour>1 ){
                runtime = hour+" hours and "+ minute +" minutes";
                if(minute>0 && minute<2){
                    runtime = hour+" hour and "+ minute +" minute";
                }
            }
            
            try{
                String insertUsersQuery = "INSERT INTO `movies` (movie_title, genre, rating, runtime, content_rating, description, theater, ticket_price_child, ticket_price_adult, poster) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                pst = DBConnectClass.getConnection().prepareStatement(insertUsersQuery);

                pst.setString(1, movie_title);
                pst.setString(2, genre);
                pst.setDouble(3, rating);
                pst.setString(4, runtime);
                pst.setString(5, contentRating);
                pst.setString(6, description);
                pst.setString(7, theater);
                pst.setInt(8, ticketPriceChild);
                pst.setInt(9, ticketPriceAdult);
                pst.setBytes(10, poster);
                pst.execute();
            }catch(SQLException ex){
                Logger.getLogger(Add_Edit_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                JOptionPane.showMessageDialog(null, "New movie added successfully!","Successful",2);
                SwingUtilities.updateComponentTreeUI(obj);
                this.dispose();
            }
        }
    }//GEN-LAST:event_addMovieBtnActionPerformed

    private void uploadPosterBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadPosterBtnMouseEntered
        try {
            Image uploadPstBtnHover = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/uploadPosterBtnHover.png"));
            uploadPosterBtn.setIcon(new ImageIcon(uploadPstBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(Add_Edit_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadPosterBtnMouseEntered

    private void uploadPosterBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadPosterBtnMouseExited
        try {
            Image uploadPstBtn = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/uploadPosterBtn.png"));
            uploadPosterBtn.setIcon(new ImageIcon(uploadPstBtn));
        } catch (IOException ex) {
            Logger.getLogger(Add_Edit_Movie_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadPosterBtnMouseExited

    private void uploadPosterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPosterBtnActionPerformed
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            FileInputStream fis = null;
            try {
                File selectedImageFile = browseImageFile.getSelectedFile();
                String selectedImagePath = selectedImageFile.getAbsolutePath();
                ii = new ImageIcon(selectedImagePath);
                //set to label
                posterLabel.setIcon(new ImageIcon(ii.getImage()));
                //set to poster for sql insert
                fis = new FileInputStream(selectedImagePath);
                ByteArrayOutputStream baos=new ByteArrayOutputStream();
                byte[] buf=new byte[1024];
                for(int readnum; (readnum=fis.read(buf)) !=-1;)
                {
                    baos.write(buf,0,readnum);
                }   poster=baos.toByteArray();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_uploadPosterBtnActionPerformed
    private boolean checkEmptyFields(){
        String movie_title = movieTitleTxtField.getText();
        String description = descripTxtArea.getText();
        String ticketPriceChild = childTckPriceTxtField.getText();
        String ticketPriceAdult = adultTckPriceTxtField.getText();

        //check empty fields
        if (movie_title.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a movie title.","Empty Field",2);
            return false;
        }
        if (genreList.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please provide at least (one) genre.", "Empty genre",2);
            return false;
        }
        if (description.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please provide a movie description.", "Empty Field",2);
            return false;
        }
        if(ticketPriceChild.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a price for child ticket.", "Empty Field",2);
            return false;
        }
        if(ticketPriceAdult.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a price for adult ticket.", "Empty Field",2);
            return false;
        }
        else {
            return true;
        }
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
            java.util.logging.Logger.getLogger(Add_Edit_Movie_Frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Add_Edit_Movie_Frm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton actionTogBtn;
    private javax.swing.JButton addMovieBtn;
    private javax.swing.JTextField adultTckPriceTxtField;
    private javax.swing.JToggleButton adventureTogBtn;
    private javax.swing.JToggleButton animationTogBtn;
    private javax.swing.JTextField childTckPriceTxtField;
    private javax.swing.JToggleButton comedyTogBtn;
    private javax.swing.JComboBox<String> contRatingCombo;
    private javax.swing.JLabel contentRatingLabel1;
    private javax.swing.JToggleButton crimeTogBtn;
    private javax.swing.JTextArea descripTxtArea;
    private javax.swing.JLabel descriptionLabel1;
    private javax.swing.JToggleButton dramaTogBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JToggleButton fantasyTogBtn;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JToggleButton horrorTogBtn;
    private javax.swing.JSpinner hourSpinner;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JLabel login_link28;
    private javax.swing.JLabel login_link30;
    private javax.swing.JLabel login_link36;
    private javax.swing.JLabel login_link41;
    private javax.swing.JLabel login_link42;
    private javax.swing.JButton miniBtn;
    private javax.swing.JSpinner minuteSpinner;
    private javax.swing.JLabel movieTitleLabel1;
    private javax.swing.JTextField movieTitleTxtField;
    private javax.swing.JToggleButton mysteryTogBtn;
    private javax.swing.JLabel posterLabel;
    private javax.swing.JLabel ratingLabel2;
    private javax.swing.JSpinner ratingSpinner;
    private javax.swing.JComboBox<String> theaterCombo;
    private javax.swing.JLabel theaterLabel1;
    private javax.swing.JToggleButton thrillerTogBtn;
    private javax.swing.JButton uploadPosterBtn;
    // End of variables declaration//GEN-END:variables
}
