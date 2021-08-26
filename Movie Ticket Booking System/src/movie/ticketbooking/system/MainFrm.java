package movie.ticketbooking.system;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
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

    public MainFrm() {}

    private int userid = 0;

    public MainFrm(int id) {
        initComponents();
        this.userid = id;
        getMovies();
        loadFrameImage();
    }
    
    public void loadFrameImage() {
        try {
            setIconImage(ImageIO.read(new File("logo.png")));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navPanel = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        myBookingsBtn = new javax.swing.JButton();
        moviesBtn = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        contactusLink = new javax.swing.JLabel();
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
        tckPrice1 = new javax.swing.JLabel();
        watchTrailerBtn1 = new javax.swing.JButton();
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
        tckPrice2 = new javax.swing.JLabel();
        watchTrailerBtn2 = new javax.swing.JButton();
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
        tckPrice3 = new javax.swing.JLabel();
        watchTrailerBtn3 = new javax.swing.JButton();
        bookNowBtn3 = new javax.swing.JButton();
        myBookingsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myBookingsTable = new javax.swing.JTable();
        sortByMYCombo = new javax.swing.JComboBox<>();
        searchTextField = new javax.swing.JTextField();
        viewInvoiceBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navPanel.setBackground(new java.awt.Color(255, 255, 255));
        navPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/logoutBtn.png"))); // NOI18N
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        navPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 35));

        myBookingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/myBookingsBtn.png"))); // NOI18N
        myBookingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBookingsBtnActionPerformed(evt);
            }
        });
        navPanel.add(myBookingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 35));

        moviesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/moviesBtnHover.png"))); // NOI18N
        moviesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesBtnActionPerformed(evt);
            }
        });
        navPanel.add(moviesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 35));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/other/logo.png"))); // NOI18N
        navPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 50));

        contactusLink.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contactusLink.setForeground(new java.awt.Color(235, 16, 42));
        contactusLink.setText("Contact us");
        contactusLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactusLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactusLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactusLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactusLinkMouseExited(evt);
            }
        });
        navPanel.add(contactusLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, 20));

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

        tckPrice1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel1.add(tckPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        watchTrailerBtn1.setText("Watch Trailer");
        watchTrailerBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchTrailerBtn1ActionPerformed(evt);
            }
        });
        moviePanel1.add(watchTrailerBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 30));

        bookNowBtn1.setText("Buy Tickets");
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

        tckPrice2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel2.add(tckPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        watchTrailerBtn2.setText("Watch Trailer");
        watchTrailerBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchTrailerBtn2ActionPerformed(evt);
            }
        });
        moviePanel2.add(watchTrailerBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 30));

        bookNowBtn2.setText("Buy Tickets");
        bookNowBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNowBtn2ActionPerformed(evt);
            }
        });
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

        tckPrice3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel3.add(tckPrice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        watchTrailerBtn3.setText("Watch Trailer");
        watchTrailerBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchTrailerBtn3ActionPerformed(evt);
            }
        });
        moviePanel3.add(watchTrailerBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 110, 30));

        bookNowBtn3.setText("Buy Tickets");
        bookNowBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNowBtn3ActionPerformed(evt);
            }
        });
        moviePanel3.add(bookNowBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 110, 30));

        moviesPanel.add(moviePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 250, 540));

        getContentPane().add(moviesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 910, 600));

        myBookingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myBookingsTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        myBookingsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Bked Movie ID", "Movie Title", "Screen", "Showtime", "Ticket Price", "Purchased Date", "Booked Date", "No of Tickets", "Seats", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(myBookingsTable);

        myBookingsPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 830, 460));

        sortByMYCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        sortByMYCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort by Month/Year", "This Month", "This Year", "Last Year" }));
        sortByMYCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByMYComboActionPerformed(evt);
            }
        });
        myBookingsPanel.add(sortByMYCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 140, -1));

        searchTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(128, 128, 128));
        searchTextField.setText("Search");
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
        });
        myBookingsPanel.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 180, -1));

        viewInvoiceBtn.setText("View Invoice");
        viewInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvoiceBtnActionPerformed(evt);
            }
        });
        myBookingsPanel.add(viewInvoiceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_search_20px.png"))); // NOI18N
        myBookingsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 20, 20));

        getContentPane().add(myBookingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 910, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelVisible(Boolean m, Boolean mb, Boolean p) {
        moviesPanel.setVisible(m);
        myBookingsPanel.setVisible(mb);
    }

    DefaultTableModel model = new DefaultTableModel(new String[]{"Movie Title", "Genre", "Rating", "Hour", "Minute", "Content Rating", "Ticket Price", "uri", "Poster"}, 0);
    DefaultTableModel idmodel = new DefaultTableModel(new String[]{"ID"}, 0);
    private String uri1, uri2, uri3 = null;
    private int id1, id2, id3 = 0;

    private void getMovies() {
        //Retrieve data
        String query = "SELECT id, movie_title, genre, rating, hour, minute, content_rating, ticket_price, uri, poster FROM `movies`";

        try {
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String movietitle = rs.getString("movie_title");
                    String genre = rs.getString("genre");
                    Double rating = rs.getDouble("rating");
                    int hour = rs.getInt("hour");
                    int minute = rs.getInt("minute");
                    String contentRating = rs.getString("content_rating");
                    String ticketPrice = String.valueOf(rs.getInt("ticket_price"));
                    String uri = rs.getString("uri");
                    byte[] posterBytes = rs.getBytes("poster");
                    model.addRow(new Object[]{movietitle, genre, rating, hour, minute, contentRating, ticketPrice, uri, posterBytes});
                    idmodel.addRow(new Object[]{id});
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        //set data from model to fields
        id1 = (int) idmodel.getValueAt(0, 0);
        movieTitle1.setText("<html>" + model.getValueAt(0, 0).toString() + "</html>");
        genre1.setText(model.getValueAt(0, 1).toString());
        rating1.setText(model.getValueAt(0, 2).toString() + "/10");
        runtime1.setText(model.getValueAt(0, 3).toString() + "h and " + model.getValueAt(0, 4).toString() + "m");
        contentRating1.setText(model.getValueAt(0, 5).toString());
        tckPrice1.setText("Rs. " + model.getValueAt(0, 6).toString());
        uri1 = model.getValueAt(0, 7).toString();
        movieLabel1.setIcon(parsePoster((byte[]) model.getValueAt(0, 8)));

        id2 = (int) idmodel.getValueAt(1, 0);
        movieTitle2.setText("<html>" + model.getValueAt(1, 0).toString() + "</html>");
        genre2.setText(model.getValueAt(1, 1).toString());
        rating2.setText(model.getValueAt(1, 2).toString() + "/10");
        runtime2.setText(model.getValueAt(1, 3).toString() + "h and " + model.getValueAt(1, 4).toString() + "m");
        contentRating2.setText(model.getValueAt(1, 5).toString());
        tckPrice2.setText("Rs. " + model.getValueAt(1, 6).toString());
        uri2 = model.getValueAt(1, 7).toString();
        movieLabel2.setIcon(parsePoster((byte[]) model.getValueAt(1, 8)));

        id3 = (int) idmodel.getValueAt(2, 0);
        movieTitle3.setText("<html>" + model.getValueAt(2, 0).toString() + "</html>");
        genre3.setText(model.getValueAt(2, 1).toString());
        rating3.setText(model.getValueAt(2, 2).toString() + "/10");
        runtime3.setText(model.getValueAt(2, 3).toString() + "h and " + model.getValueAt(2, 4).toString() + "m");
        contentRating3.setText(model.getValueAt(2, 5).toString());
        tckPrice3.setText("Rs. " + model.getValueAt(2, 6).toString());
        uri3 = model.getValueAt(2, 7).toString();
        movieLabel3.setIcon(parsePoster((byte[]) model.getValueAt(2, 8)));
    }

    private ImageIcon parsePoster(byte[] dTM) {
        ImageIcon icon = new ImageIcon(dTM);
        return icon;
    }

    public static boolean openWebpage(String uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URI(uri));
                return true;
            } catch (IOException | URISyntaxException e) {
            }
        }
        return false;
    }

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        LoginFrm lgnFrm = new LoginFrm();
        lgnFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void myBookingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBookingsBtnActionPerformed
        panelVisible(false, true, false);
        String nowdate = String.format("%1$tY-%1$tm-%1$td", LocalDate.now());
        java.sql.Date formatdate = java.sql.Date.valueOf(nowdate);
        getBookingInfo("null");
        try {
            Image moviesBtnChecked = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/moviesBtn.png"));
            moviesBtn.setIcon(new ImageIcon(moviesBtnChecked));
        } catch (IOException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Image myBookingsBtnChecked = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/myBookingsBtnHover.png"));
            myBookingsBtn.setIcon(new ImageIcon(myBookingsBtnChecked));
        } catch (IOException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_myBookingsBtnActionPerformed

    DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Bked Movie ID", "Movie Title", "Screen", "Showtime", "Ticket Price", "Purchased Date", "Booked Date", "No of Tickets", "Seats", "Total Amount"}, 0);

    private void getBookingInfo(String chooseDate) {
        tableModel.setRowCount(0);
        String query = null;
        //Select all
        if ("null".equals(chooseDate)) {
            query = "SELECT bookings.booked_movie_id, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.showtime, bookings.total_amount, booked_movie.movie_title, booked_movie.screen, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id WHERE bookings.userid = '" + userid + "'";
        }
        //Select this month
        if ("This Month".equals(chooseDate)) {
            query = "SELECT bookings.booked_movie_id, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.showtime, bookings.total_amount, booked_movie.movie_title, booked_movie.screen, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id WHERE bookings.userid = '" + userid + "' AND MONTH(booked_date) = MONTH(CURRENT_DATE()) AND YEAR(booked_date) = YEAR(CURRENT_DATE())";
        }
        //Select this year
        if ("This Year".equals(chooseDate)) {
            query = "SELECT bookings.booked_movie_id, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.showtime, bookings.total_amount, booked_movie.movie_title, booked_movie.screen, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id WHERE bookings.userid = '" + userid + "' AND YEAR(booked_date) = YEAR(CURRENT_DATE())";
        }
        //Select last year
        if ("Last Year".equals(chooseDate)) {
            query = "SELECT bookings.booked_movie_id, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.showtime, bookings.total_amount, booked_movie.movie_title, booked_movie.screen, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id WHERE bookings.userid = '" + userid + "' AND YEAR(booked_date) = YEAR(DATE_SUB(CURDATE(), INTERVAL 1 YEAR))";
        }

        try {
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while (rs.next()) {
                    int bookedMovieId = rs.getInt("booked_movie_id");
                    String movietitle = rs.getString("movie_title");
                    String screen = rs.getString("screen");
                    String showtime = rs.getString("showtime");
                    int ticketPrice = rs.getInt("ticket_price");
                    String purchasedDate = String.valueOf(rs.getDate("purchased_date"));
                    String bookedDate = String.valueOf(rs.getDate("booked_date"));
                    int noOfTickets = rs.getInt("no_of_tickets");
                    String seats = rs.getString("seat");
                    int totalAmount = rs.getInt("total_amount");

                    tableModel.addRow(new Object[]{bookedMovieId, movietitle, screen, showtime, ticketPrice, purchasedDate, bookedDate, noOfTickets, seats, totalAmount});
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        myBookingsTable.setModel(tableModel);
    }

    private void moviesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesBtnActionPerformed
        panelVisible(true, false, false);
        getMovies();
        try {
            Image moviesBtnChecked = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/moviesBtnHover.png"));
            moviesBtn.setIcon(new ImageIcon(moviesBtnChecked));
        } catch (IOException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Image myBookingsBtnChecked = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/myBookingsBtn.png"));
            myBookingsBtn.setIcon(new ImageIcon(myBookingsBtnChecked));
        } catch (IOException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_moviesBtnActionPerformed

    private void bookNowBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowBtn1ActionPerformed
        BookTicketsFrm bookTicket = new BookTicketsFrm(id1, userid);
        bookTicket.pack();
        bookTicket.setVisible(true);
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

    private void bookNowBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowBtn2ActionPerformed
        BookTicketsFrm bookTicket = new BookTicketsFrm(id2, userid);
        bookTicket.pack();
        bookTicket.setVisible(true);
    }//GEN-LAST:event_bookNowBtn2ActionPerformed

    private void bookNowBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowBtn3ActionPerformed
        BookTicketsFrm bookTicket = new BookTicketsFrm(id3, userid);
        bookTicket.pack();
        bookTicket.setVisible(true);
    }//GEN-LAST:event_bookNowBtn3ActionPerformed

    private void viewInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvoiceBtnActionPerformed
        if (myBookingsTable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a record to view invoice", "Row not selected", 2);
        } else {
            int column = 0;
            int row = myBookingsTable.getSelectedRow();
            int idvalue = (int) myBookingsTable.getModel().getValueAt(row, column);
            InvoiceFrm invoice = new InvoiceFrm(userid, idvalue);
            invoice.pack();
            invoice.setVisible(true);
        }
    }//GEN-LAST:event_viewInvoiceBtnActionPerformed

    DefaultTableModel searchTableModel = new DefaultTableModel(new String[]{"Bked Movie ID", "Movie Title", "Screen", "Showtime", "Ticket Price", "Purchased Date", "Booked Date", "No of Tickets", "Seats", "Total Amount"}, 0);

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        tableModel.setRowCount(0);
        searchTableModel.setRowCount(0);
        String searchValue = searchTextField.getText();
        String query = "";
        if (searchValue.equals("")) {
            query = "SELECT bookings.booked_movie_id, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.showtime, bookings.total_amount, booked_movie.movie_title, booked_movie.screen, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id WHERE bookings.userid = '" + userid + "'";
        } else {
            query = "SELECT bookings.booked_movie_id, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.showtime, bookings.total_amount, booked_movie.movie_title, booked_movie.screen, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id WHERE bookings.userid = '" + userid + "' AND booked_movie.movie_title LIKE '%" + searchValue + "%' OR bookings.purchased_date LIKE '%" + searchValue + "%'";
        }

        try {
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while (rs.next()) {
                    int bookedMovieId = rs.getInt("booked_movie_id");
                    String movietitle = rs.getString("movie_title");
                    String screen = rs.getString("screen");
                    String showtime = rs.getString("showtime");
                    int ticketPrice = rs.getInt("ticket_price");
                    String purchasedDate = String.valueOf(rs.getDate("purchased_date"));
                    String bookedDate = String.valueOf(rs.getDate("booked_date"));
                    int noOfTickets = rs.getInt("no_of_tickets");
                    String seats = rs.getString("seat");
                    int totalAmount = rs.getInt("total_amount");

                    searchTableModel.addRow(new Object[]{bookedMovieId, movietitle, screen, showtime, ticketPrice, purchasedDate, bookedDate, noOfTickets, seats, totalAmount});
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        myBookingsTable.setModel(searchTableModel);

    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        if (searchTextField.getText().equals("Search")) {
            searchTextField.setText("");
            searchTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchTextFieldFocusGained

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        if (searchTextField.getText().isEmpty()) {
            searchTextField.setForeground(Color.GRAY);
            searchTextField.setText("Search");
        }
    }//GEN-LAST:event_searchTextFieldFocusLost

    private void sortByMYComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByMYComboActionPerformed
        //This Month
        if (sortByMYCombo.getSelectedItem() == "This Month") {
            getBookingInfo("This Month");
        }
        //Last Month
        if (sortByMYCombo.getSelectedItem() == "This Year") {
            getBookingInfo("This Year");
        }
        //Last Year
        if (sortByMYCombo.getSelectedItem() == "Last Year") {
            getBookingInfo("Last Year");
        }
    }//GEN-LAST:event_sortByMYComboActionPerformed

    private void contactusLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactusLinkMouseClicked
        ContactUsFrm contFrm = new ContactUsFrm();
        contFrm.setVisible(true);
    }//GEN-LAST:event_contactusLinkMouseClicked

    private void contactusLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactusLinkMouseEntered
        contactusLink.setForeground(new Color(235, 16, 42));
    }//GEN-LAST:event_contactusLinkMouseEntered

    private void contactusLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactusLinkMouseExited
        contactusLink.setForeground(new Color(209, 15, 38));
    }//GEN-LAST:event_contactusLinkMouseExited

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
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookNowBtn1;
    private javax.swing.JButton bookNowBtn2;
    private javax.swing.JButton bookNowBtn3;
    private javax.swing.JLabel contactusLink;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JPanel myBookingsPanel;
    private javax.swing.JTable myBookingsTable;
    private javax.swing.JPanel navPanel;
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
    private javax.swing.JTextField searchTextField;
    private javax.swing.JComboBox<String> sortByMYCombo;
    private javax.swing.JLabel starLabel1;
    private javax.swing.JLabel starLabel2;
    private javax.swing.JLabel starLabel3;
    private javax.swing.JLabel tckPrice1;
    private javax.swing.JLabel tckPrice2;
    private javax.swing.JLabel tckPrice3;
    private javax.swing.JLabel ticketPriceLabel1;
    private javax.swing.JLabel ticketPriceLabel2;
    private javax.swing.JLabel ticketPriceLabel3;
    private javax.swing.JButton viewInvoiceBtn;
    private javax.swing.JButton watchTrailerBtn1;
    private javax.swing.JButton watchTrailerBtn2;
    private javax.swing.JButton watchTrailerBtn3;
    // End of variables declaration//GEN-END:variables
}
