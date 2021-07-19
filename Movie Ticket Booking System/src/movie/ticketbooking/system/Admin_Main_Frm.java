package movie.ticketbooking.system;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author nadinCodeHat
 */
public class Admin_Main_Frm extends javax.swing.JFrame {

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
        moviesBtn2 = new javax.swing.JButton();
        login_link3 = new javax.swing.JLabel();
        addAMoviePanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        posterLabel = new javax.swing.JLabel();
        movieTitleLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();
        login_link31 = new javax.swing.JLabel();
        contentRatingLabel = new javax.swing.JLabel();
        login_link40 = new javax.swing.JLabel();
        ticketPriceAdultLabel = new javax.swing.JLabel();
        login_link33 = new javax.swing.JLabel();
        login_link43 = new javax.swing.JLabel();
        ticketPriceChidLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        movieTitleTxtField = new javax.swing.JTextField();
        login_link12 = new javax.swing.JLabel();
        hourSpinner = new javax.swing.JSpinner();
        login_link13 = new javax.swing.JLabel();
        login_link14 = new javax.swing.JLabel();
        minuteSpinner = new javax.swing.JSpinner();
        contRatingCombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripTxtArea = new javax.swing.JTextArea();
        login_link26 = new javax.swing.JLabel();
        login_link28 = new javax.swing.JLabel();
        childTckPriceTxtField = new javax.swing.JTextField();
        login_link30 = new javax.swing.JLabel();
        adultTckPriceTxtField = new javax.swing.JTextField();
        addMovieBtn = new javax.swing.JButton();
        login_link32 = new javax.swing.JLabel();
        theaterCombo = new javax.swing.JComboBox<>();
        login_link36 = new javax.swing.JLabel();
        horrorTogBtn = new javax.swing.JToggleButton();
        adventureTogBtn = new javax.swing.JToggleButton();
        actionTogBtn = new javax.swing.JToggleButton();
        thrillerTogBtn = new javax.swing.JToggleButton();
        fantasyTogBtn = new javax.swing.JToggleButton();
        dramaTogBtn = new javax.swing.JToggleButton();
        mysteryTogBtn = new javax.swing.JToggleButton();
        historicalTogBtn = new javax.swing.JToggleButton();
        comedyTogBtn = new javax.swing.JToggleButton();
        animationTogBtn = new javax.swing.JToggleButton();
        romanceTogBtn = new javax.swing.JToggleButton();
        crimeTogBtn = new javax.swing.JToggleButton();
        uploadPosterBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        miniBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ratingSpinner = new javax.swing.JSpinner();
        login_link11 = new javax.swing.JLabel();
        login_link34 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        login_link25 = new javax.swing.JLabel();
        login_link38 = new javax.swing.JLabel();
        login_link41 = new javax.swing.JLabel();
        login_link42 = new javax.swing.JLabel();
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

        sidePanel.setBackground(new java.awt.Color(36, 34, 54));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/profileBtn.png"))); // NOI18N
        sidePanel.add(profileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 35));

        moviesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/viewBookingsBtn.png"))); // NOI18N
        sidePanel.add(moviesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 35));

        moviesBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/viewMoviesBtnHover.png"))); // NOI18N
        sidePanel.add(moviesBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 35));

        moviesBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/addAMovieBtn.png"))); // NOI18N
        sidePanel.add(moviesBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 35));

        login_link3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_link3.setForeground(new java.awt.Color(235, 16, 42));
        login_link3.setText("BrainCell");
        sidePanel.add(login_link3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        addAMoviePanel.setBackground(new java.awt.Color(21, 20, 31));
        addAMoviePanel.setMinimumSize(new java.awt.Dimension(1060, 700));
        addAMoviePanel.setPreferredSize(new java.awt.Dimension(1060, 700));
        addAMoviePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(36, 34, 54));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        posterLabel.setBackground(new java.awt.Color(255, 255, 255));
        posterLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        posterLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(posterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 200));

        movieTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        movieTitleLabel.setForeground(new java.awt.Color(235, 16, 42));
        jPanel3.add(movieTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 300, -1));

        lengthLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lengthLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lengthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_25px.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(235, 16, 42));
        jLabel7.setText("Content Rating");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(235, 16, 42));
        jLabel8.setText("Genre");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        ratingLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ratingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ratingLabel.setText("/10");
        jPanel3.add(ratingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 312, -1, -1));

        login_link31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link31.setForeground(new java.awt.Color(235, 16, 42));
        login_link31.setText("Ticket Price");
        jPanel3.add(login_link31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        contentRatingLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contentRatingLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(contentRatingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        login_link40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link40.setForeground(new java.awt.Color(235, 16, 42));
        login_link40.setText("Length");
        jPanel3.add(login_link40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        ticketPriceAdultLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ticketPriceAdultLabel.setForeground(new java.awt.Color(255, 255, 255));
        ticketPriceAdultLabel.setText("Rs.");
        jPanel3.add(ticketPriceAdultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, -1, -1));

        login_link33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link33.setForeground(new java.awt.Color(255, 255, 255));
        login_link33.setText("Adults (ages 14 & up)");
        jPanel3.add(login_link33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        login_link43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link43.setForeground(new java.awt.Color(255, 255, 255));
        login_link43.setText("Children (ages 2 - 13)");
        jPanel3.add(login_link43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        ticketPriceChidLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ticketPriceChidLabel.setForeground(new java.awt.Color(255, 255, 255));
        ticketPriceChidLabel.setText("Rs.");
        jPanel3.add(ticketPriceChidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(235, 16, 42));
        jLabel9.setText("Rating");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        genreLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(255, 255, 255));
        genreLabel.setText("Adventure, Action, Comedy, Thriller");
        jPanel3.add(genreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        addAMoviePanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 320, 640));

        movieTitleTxtField.setBackground(new java.awt.Color(36, 34, 54));
        movieTitleTxtField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        movieTitleTxtField.setForeground(new java.awt.Color(255, 255, 255));
        movieTitleTxtField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movieTitleTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                movieTitleTxtFieldFocusLost(evt);
            }
        });
        addAMoviePanel.add(movieTitleTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 450, 30));

        login_link12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link12.setForeground(new java.awt.Color(235, 16, 42));
        login_link12.setText("Content Rating");
        addAMoviePanel.add(login_link12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, -1, -1));

        hourSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));
        hourSpinner.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                hourSpinnerPropertyChange(evt);
            }
        });
        addAMoviePanel.add(hourSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        login_link13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link13.setForeground(new java.awt.Color(235, 16, 42));
        login_link13.setText("Description");
        addAMoviePanel.add(login_link13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        login_link14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link14.setForeground(new java.awt.Color(255, 255, 255));
        login_link14.setText("Minutes:");
        addAMoviePanel.add(login_link14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, -1));

        minuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        minuteSpinner.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                minuteSpinnerPropertyChange(evt);
            }
        });
        addAMoviePanel.add(minuteSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 50, -1));

        contRatingCombo.setBackground(new java.awt.Color(36, 34, 54));
        contRatingCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G", "PG", "PG-13", "R", "NC-17" }));
        contRatingCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                contRatingComboPropertyChange(evt);
            }
        });
        addAMoviePanel.add(contRatingCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 90, 20));

        descripTxtArea.setBackground(new java.awt.Color(36, 34, 54));
        descripTxtArea.setColumns(20);
        descripTxtArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descripTxtArea.setForeground(new java.awt.Color(255, 255, 255));
        descripTxtArea.setLineWrap(true);
        descripTxtArea.setRows(5);
        descripTxtArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 34, 54)));
        jScrollPane1.setViewportView(descripTxtArea);

        jScrollPane2.setViewportView(jScrollPane1);

        addAMoviePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 450, 100));

        login_link26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link26.setForeground(new java.awt.Color(235, 16, 42));
        login_link26.setText("Rating");
        addAMoviePanel.add(login_link26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        login_link28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link28.setForeground(new java.awt.Color(255, 255, 255));
        login_link28.setText("Rs.");
        addAMoviePanel.add(login_link28, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, -1, -1));

        childTckPriceTxtField.setText("300");
        childTckPriceTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                childTckPriceTxtFieldFocusLost(evt);
            }
        });
        addAMoviePanel.add(childTckPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 40, -1));

        login_link30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link30.setForeground(new java.awt.Color(255, 255, 255));
        login_link30.setText("Rs.");
        addAMoviePanel.add(login_link30, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, -1, -1));

        adultTckPriceTxtField.setText("400");
        adultTckPriceTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adultTckPriceTxtFieldFocusLost(evt);
            }
        });
        addAMoviePanel.add(adultTckPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 40, -1));

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
        addAMoviePanel.add(addMovieBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 100, 35));

        login_link32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link32.setForeground(new java.awt.Color(235, 16, 42));
        login_link32.setText("Theater");
        addAMoviePanel.add(login_link32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        theaterCombo.setBackground(new java.awt.Color(36, 34, 54));
        theaterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theater 1", "Theater 2", "Theater 3" }));
        addAMoviePanel.add(theaterCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, -1, 20));

        login_link36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link36.setForeground(new java.awt.Color(235, 16, 42));
        login_link36.setText("Ticket Price");
        addAMoviePanel.add(login_link36, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, -1, -1));

        horrorTogBtn.setText("Horror");
        addAMoviePanel.add(horrorTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        adventureTogBtn.setBackground(new java.awt.Color(255, 51, 51));
        adventureTogBtn.setText("Adventure");
        addAMoviePanel.add(adventureTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        actionTogBtn.setText("Action");
        addAMoviePanel.add(actionTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, -1));

        thrillerTogBtn.setText("Thriller");
        addAMoviePanel.add(thrillerTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        fantasyTogBtn.setText("Fantasy");
        addAMoviePanel.add(fantasyTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));

        dramaTogBtn.setText("Drama");
        addAMoviePanel.add(dramaTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, -1));

        mysteryTogBtn.setText("Mystery");
        addAMoviePanel.add(mysteryTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, -1, -1));

        historicalTogBtn.setText("Historical");
        addAMoviePanel.add(historicalTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        comedyTogBtn.setText("Comedy");
        addAMoviePanel.add(comedyTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        animationTogBtn.setText("Animation");
        addAMoviePanel.add(animationTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        romanceTogBtn.setText("Romance");
        addAMoviePanel.add(romanceTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, -1, -1));

        crimeTogBtn.setText("Crime");
        addAMoviePanel.add(crimeTogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

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
        addAMoviePanel.add(uploadPosterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 100, 35));

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
        addAMoviePanel.add(miniBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 16, 16));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("/10");
        addAMoviePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        ratingSpinner.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 10.0d, 1.0d));
        ratingSpinner.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ratingSpinnerPropertyChange(evt);
            }
        });
        addAMoviePanel.add(ratingSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 40, -1));

        login_link11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link11.setForeground(new java.awt.Color(235, 16, 42));
        login_link11.setText("Movie Title");
        addAMoviePanel.add(login_link11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        login_link34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link34.setForeground(new java.awt.Color(255, 255, 255));
        login_link34.setText("Hours:");
        addAMoviePanel.add(login_link34, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_25px.png"))); // NOI18N
        addAMoviePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 245, 25, 25));

        login_link25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link25.setForeground(new java.awt.Color(235, 16, 42));
        login_link25.setText("Genre");
        addAMoviePanel.add(login_link25, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        login_link38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link38.setForeground(new java.awt.Color(235, 16, 42));
        login_link38.setText("Length");
        addAMoviePanel.add(login_link38, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, -1, -1));

        login_link41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link41.setForeground(new java.awt.Color(255, 255, 255));
        login_link41.setText("Children (ages 2 - 13)");
        addAMoviePanel.add(login_link41, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        login_link42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_link42.setForeground(new java.awt.Color(255, 255, 255));
        login_link42.setText("Adults (ages 14 & up)");
        addAMoviePanel.add(login_link42, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

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

    private void uploadPosterBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadPosterBtnMouseEntered
        try {
            Image uploadPstBtnHover = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/uploadPosterBtnHover.png"));
            uploadPosterBtn.setIcon(new ImageIcon(uploadPstBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadPosterBtnMouseEntered

    private void uploadPosterBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadPosterBtnMouseExited
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
         
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            ImageIcon ii = new ImageIcon(selectedImagePath);
            posterLabel.setIcon(new ImageIcon(ii.getImage()));
        }  
    }//GEN-LAST:event_uploadPosterBtnMouseExited

    private void uploadPosterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPosterBtnActionPerformed
        try {
            Image addMovieBtnHover = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/addMovieBtnHover.png"));
            addMovieBtn.setIcon(new ImageIcon(addMovieBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadPosterBtnActionPerformed

    private void addMovieBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMovieBtnMouseEntered
        try {
            Image addMovieBtnHover = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/addMovieBtnHover.png"));
            addMovieBtn.setIcon(new ImageIcon(addMovieBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addMovieBtnMouseEntered

    private void addMovieBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMovieBtnMouseExited
        try {
            Image addMovieBtnIM = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/addMovieBtn.png"));
            addMovieBtn.setIcon(new ImageIcon(addMovieBtnIM));
        } catch (IOException ex) {
            Logger.getLogger(Admin_Main_Frm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addMovieBtnMouseExited

    private void addMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMovieBtnActionPerformed

    private void movieTitleTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_movieTitleTxtFieldFocusLost
        movieTitleLabel.setText("<html>"+ movieTitleTxtField.getText() +"</html>");
    }//GEN-LAST:event_movieTitleTxtFieldFocusLost

    private void ratingSpinnerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ratingSpinnerPropertyChange
        ratingLabel.setText(ratingSpinner.getValue() +"/10");
    }//GEN-LAST:event_ratingSpinnerPropertyChange

    private void hourSpinnerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_hourSpinnerPropertyChange
        if("1".equals(hourSpinner.getValue().toString()))
            lengthLabel.setText(hourSpinner.getValue() +" hour and "+minuteSpinner.getValue()+" minutes");
        else
            lengthLabel.setText(hourSpinner.getValue() +" hours and "+minuteSpinner.getValue()+" minutes");
    }//GEN-LAST:event_hourSpinnerPropertyChange

    private void minuteSpinnerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_minuteSpinnerPropertyChange
        if("1".equals(hourSpinner.getValue().toString()))
            lengthLabel.setText(hourSpinner.getValue() +" hour and "+minuteSpinner.getValue()+" minutes");
        else
            lengthLabel.setText(hourSpinner.getValue() +" hours and "+minuteSpinner.getValue()+" minutes");
    }//GEN-LAST:event_minuteSpinnerPropertyChange

    private void contRatingComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_contRatingComboPropertyChange
        contentRatingLabel.setText(contRatingCombo.getSelectedItem().toString());
    }//GEN-LAST:event_contRatingComboPropertyChange

    private void childTckPriceTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_childTckPriceTxtFieldFocusLost
        ticketPriceChidLabel.setText("Rs. "+childTckPriceTxtField.getText());
    }//GEN-LAST:event_childTckPriceTxtFieldFocusLost

    private void adultTckPriceTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adultTckPriceTxtFieldFocusLost
        ticketPriceAdultLabel.setText("Rs. "+adultTckPriceTxtField.getText());
    }//GEN-LAST:event_adultTckPriceTxtFieldFocusLost

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Main_Frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton actionTogBtn;
    private javax.swing.JPanel addAMoviePanel;
    private javax.swing.JButton addMovieBtn;
    private javax.swing.JTextField adultTckPriceTxtField;
    private javax.swing.JToggleButton adventureTogBtn;
    private javax.swing.JToggleButton animationTogBtn;
    private javax.swing.JTextField childTckPriceTxtField;
    private javax.swing.JToggleButton comedyTogBtn;
    private javax.swing.JComboBox<String> contRatingCombo;
    private javax.swing.JLabel contentRatingLabel;
    private javax.swing.JToggleButton crimeTogBtn;
    private javax.swing.JTextArea descripTxtArea;
    private javax.swing.JToggleButton dramaTogBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JToggleButton fantasyTogBtn;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JToggleButton historicalTogBtn;
    private javax.swing.JToggleButton horrorTogBtn;
    private javax.swing.JSpinner hourSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JLabel login_link11;
    private javax.swing.JLabel login_link12;
    private javax.swing.JLabel login_link13;
    private javax.swing.JLabel login_link14;
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
    private javax.swing.JLabel login_link25;
    private javax.swing.JLabel login_link26;
    private javax.swing.JLabel login_link28;
    private javax.swing.JLabel login_link3;
    private javax.swing.JLabel login_link30;
    private javax.swing.JLabel login_link31;
    private javax.swing.JLabel login_link32;
    private javax.swing.JLabel login_link33;
    private javax.swing.JLabel login_link34;
    private javax.swing.JLabel login_link36;
    private javax.swing.JLabel login_link38;
    private javax.swing.JLabel login_link40;
    private javax.swing.JLabel login_link41;
    private javax.swing.JLabel login_link42;
    private javax.swing.JLabel login_link43;
    private javax.swing.JLabel login_link5;
    private javax.swing.JLabel login_link6;
    private javax.swing.JLabel login_link7;
    private javax.swing.JLabel login_link8;
    private javax.swing.JLabel login_link9;
    private javax.swing.JButton miniBtn;
    private javax.swing.JSpinner minuteSpinner;
    private javax.swing.JLabel movieTitleLabel;
    private javax.swing.JTextField movieTitleTxtField;
    private javax.swing.JButton moviesBtn;
    private javax.swing.JButton moviesBtn1;
    private javax.swing.JButton moviesBtn2;
    private javax.swing.JToggleButton mysteryTogBtn;
    private javax.swing.JLabel posterLabel;
    private javax.swing.JButton profileBtn;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JSpinner ratingSpinner;
    private javax.swing.JToggleButton romanceTogBtn;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JComboBox<String> theaterCombo;
    private javax.swing.JToggleButton thrillerTogBtn;
    private javax.swing.JLabel ticketPriceAdultLabel;
    private javax.swing.JLabel ticketPriceChidLabel;
    private javax.swing.JButton uploadPosterBtn;
    private javax.swing.JPanel viewMoviesPanel;
    // End of variables declaration//GEN-END:variables
}
