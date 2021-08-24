package movie.ticketbooking.system;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
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
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadinCodeHat
 */
public class BookTicketsFrm extends javax.swing.JFrame {

    public BookTicketsFrm() {}

    private int idval, userid = 0;

    public BookTicketsFrm(int id, int userid) {
        initComponents();
        loadFrameImage();
        this.idval = id;
        this.userid = userid;
        loadMovieData();
        pickDate.setMinSelectableDate(new Date());
        confirmBtn.setEnabled(false);
        if (noOfReservedSeats == 40) {
            confirmBtn.setEnabled(false);
        }
        noOfTcksLabel.setText("0 Tickets");
        totalAmountLabel.setText("Rs. 0");
    }
    
    public void loadFrameImage() {
        try {
            setIconImage(ImageIO.read(new File("logo.png")));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(BookTicketsFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String movietitle = "";

    private void loadMovieData() {
        //Retrieve data
        String query = "SELECT movie_title, genre, rating, hour, minute, content_rating, description, screen, ticket_price, poster FROM `movies` WHERE id = '" + idval + "'";
        try {
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while (rs.next()) {
                    movietitle = rs.getString("movie_title");
                    movieTitle.setText("<html>" + rs.getString("movie_title") + "</html>");
                    genreLabel.setText(rs.getString("genre"));
                    ratingLabel.setText(String.valueOf(rs.getDouble("rating")) + "/10");
                    runtimeLabel.setText(rs.getInt("hour") + "h and " + rs.getInt("minute") + "m");
                    contentRatingLabel.setText(rs.getString("content_rating"));
                    descriptionTextArea.setText(rs.getString("description"));
                    screenLabel.setText(rs.getString("screen"));
                    tckPriceLabel.setText("Rs. " + String.valueOf(rs.getInt("ticket_price")));
                    ticketPrice = rs.getInt("ticket_price");
                    movieLabel.setIcon(parsePoster(rs.getBytes("poster")));
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(BookTicketsFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getUserEmail() {
        String query = "SELECT email FROM `users` WHERE id = '" + userid + "'";
        String email = null;
        try {
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while (rs.next()) {
                    email = rs.getString("email");
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(BookTicketsFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return email;
    }

    private ImageIcon parsePoster(byte[] dTM) {
        ImageIcon icon = new ImageIcon(dTM);
        return icon;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        moviePanel1 = new javax.swing.JPanel();
        movieLabel = new javax.swing.JLabel();
        movieTitle = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();
        starLabel1 = new javax.swing.JLabel();
        runtimeLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        contentRatingLabel = new javax.swing.JLabel();
        ticketLabel = new javax.swing.JLabel();
        tckPriceLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        showtimeCombo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        noOfTcksLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();
        confirmBtn = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        seatsLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        screenLabel = new javax.swing.JLabel();
        a1TogBtn = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        pickDate = new com.toedter.calendar.JDateChooser();
        a3TogBtn = new javax.swing.JToggleButton();
        a2TogBtn = new javax.swing.JToggleButton();
        b3TogBtn = new javax.swing.JToggleButton();
        b2TogBtn = new javax.swing.JToggleButton();
        b1TogBtn = new javax.swing.JToggleButton();
        d1TogBtn = new javax.swing.JToggleButton();
        d3TogBtn = new javax.swing.JToggleButton();
        d2TogBtn = new javax.swing.JToggleButton();
        c1TogBtn = new javax.swing.JToggleButton();
        c2TogBtn = new javax.swing.JToggleButton();
        c3TogBtn = new javax.swing.JToggleButton();
        d8TogBtn = new javax.swing.JToggleButton();
        d9TogBtn = new javax.swing.JToggleButton();
        c9TogBtn = new javax.swing.JToggleButton();
        c8TogBtn = new javax.swing.JToggleButton();
        d10TogBtn = new javax.swing.JToggleButton();
        c10TogBtn = new javax.swing.JToggleButton();
        b10TogBtn = new javax.swing.JToggleButton();
        b9TogBtn = new javax.swing.JToggleButton();
        b8TogBtn = new javax.swing.JToggleButton();
        a8TogBtn = new javax.swing.JToggleButton();
        a9TogBtn = new javax.swing.JToggleButton();
        a10TogBtn = new javax.swing.JToggleButton();
        d4TogBtn = new javax.swing.JToggleButton();
        d5TogBtn = new javax.swing.JToggleButton();
        c5TogBtn = new javax.swing.JToggleButton();
        c4TogBtn = new javax.swing.JToggleButton();
        d6TogBtn = new javax.swing.JToggleButton();
        c6TogBtn = new javax.swing.JToggleButton();
        b6TogBtn = new javax.swing.JToggleButton();
        b5TogBtn = new javax.swing.JToggleButton();
        b4TogBtn = new javax.swing.JToggleButton();
        a4TogBtn = new javax.swing.JToggleButton();
        a5TogBtn = new javax.swing.JToggleButton();
        a6TogBtn = new javax.swing.JToggleButton();
        a7TogBtn = new javax.swing.JToggleButton();
        b7TogBtn = new javax.swing.JToggleButton();
        c7TogBtn = new javax.swing.JToggleButton();
        d7TogBtn = new javax.swing.JToggleButton();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Book Tickets");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moviePanel1.setBackground(new java.awt.Color(255, 255, 255));
        moviePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movieLabel.setBackground(new java.awt.Color(255, 255, 255));
        movieLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movieLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moviePanel1.add(movieLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 155));

        movieTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        movieTitle.setForeground(new java.awt.Color(235, 16, 42));
        moviePanel1.add(movieTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, -1));

        ratingLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel1.add(ratingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 173, -1, -1));

        starLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_star_20px.png"))); // NOI18N
        moviePanel1.add(starLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        runtimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel1.add(runtimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        genreLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel1.add(genreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        contentRatingLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviePanel1.add(contentRatingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 173, -1, -1));

        ticketLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ticketLabel.setText("Ticket Price :");
        moviePanel1.add(ticketLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));
        moviePanel1.add(tckPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_clock_20px.png"))); // NOI18N
        moviePanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_menu_20px.png"))); // NOI18N
        moviePanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_movie_ticket_20px.png"))); // NOI18N
        moviePanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setWrapStyleWord(true);
        descriptionTextArea.setBorder(null);
        jScrollPane1.setViewportView(descriptionTextArea);

        moviePanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, 120));

        jPanel3.add(moviePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 250, 540));

        showtimeCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        showtimeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select showtime", "10:30 AM", "1:30 PM", "4:30 PM", "7:30 PM" }));
        showtimeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showtimeComboActionPerformed(evt);
            }
        });
        jPanel3.add(showtimeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 120, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(235, 16, 42));
        jLabel7.setText("Total Amount");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        noOfTcksLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(noOfTcksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(235, 16, 42));
        jLabel9.setText("Tickets");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        totalAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(totalAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        jPanel2.add(confirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(235, 16, 42));
        jLabel30.setText("Seats");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        seatsLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(seatsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 590, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screenLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        screenLabel.setForeground(new java.awt.Color(235, 16, 42));
        jPanel1.add(screenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 570, 50));

        a1TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a1TogBtn.setAlignmentY(0.0F);
        a1TogBtn.setBorder(null);
        a1TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(a1TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("B");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("A");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("D");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("C");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("10");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("6");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("7");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("3");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setText("1");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setText("2");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setText("5");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setText("4");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setText("8");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setText("9");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, -1, -1));

        jPanel4.setBackground(new java.awt.Color(235, 16, 42));
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 15, 15));
        jPanel4.getAccessibleContext().setAccessibleName("");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setText("Seat Available");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        jPanel5.setBackground(new java.awt.Color(168, 168, 168));
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 15, 15));
        jPanel5.getAccessibleContext().setAccessibleName("");

        jPanel6.setBackground(new java.awt.Color(30, 145, 64));
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 15, 15));
        jPanel6.getAccessibleContext().setAccessibleName("");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setText("Your Seat");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, -1, -1));

        pickDate.setDateFormatString("yyyy-MM-dd");
        pickDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel3.add(pickDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 40, 120, -1));

        a3TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a3TogBtn.setAlignmentY(0.0F);
        a3TogBtn.setBorder(null);
        a3TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(a3TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 30, 30));

        a2TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a2TogBtn.setAlignmentY(0.0F);
        a2TogBtn.setBorder(null);
        a2TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(a2TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 30, 30));

        b3TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b3TogBtn.setAlignmentY(0.0F);
        b3TogBtn.setBorder(null);
        b3TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(b3TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 30, 30));

        b2TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b2TogBtn.setAlignmentY(0.0F);
        b2TogBtn.setBorder(null);
        b2TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(b2TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 30, 30));

        b1TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b1TogBtn.setAlignmentY(0.0F);
        b1TogBtn.setBorder(null);
        b1TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(b1TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 30, 30));

        d1TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d1TogBtn.setAlignmentY(0.0F);
        d1TogBtn.setBorder(null);
        d1TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(d1TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 30, 30));

        d3TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d3TogBtn.setAlignmentY(0.0F);
        d3TogBtn.setBorder(null);
        d3TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(d3TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 30, 30));

        d2TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d2TogBtn.setAlignmentY(0.0F);
        d2TogBtn.setBorder(null);
        d2TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(d2TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 30, 30));

        c1TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c1TogBtn.setAlignmentY(0.0F);
        c1TogBtn.setBorder(null);
        c1TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(c1TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 30, 30));

        c2TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c2TogBtn.setAlignmentY(0.0F);
        c2TogBtn.setBorder(null);
        c2TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(c2TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 30, 30));

        c3TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c3TogBtn.setAlignmentY(0.0F);
        c3TogBtn.setBorder(null);
        c3TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(c3TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 30, 30));

        d8TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d8TogBtn.setAlignmentY(0.0F);
        d8TogBtn.setBorder(null);
        d8TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d8TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(d8TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 30, 30));

        d9TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d9TogBtn.setAlignmentY(0.0F);
        d9TogBtn.setBorder(null);
        d9TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d9TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(d9TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, 30, 30));

        c9TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c9TogBtn.setAlignmentY(0.0F);
        c9TogBtn.setBorder(null);
        c9TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(c9TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 30, 30));

        c8TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c8TogBtn.setAlignmentY(0.0F);
        c8TogBtn.setBorder(null);
        c8TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(c8TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 30, 30));

        d10TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d10TogBtn.setAlignmentY(0.0F);
        d10TogBtn.setBorder(null);
        d10TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d10TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(d10TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 30, 30));

        c10TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c10TogBtn.setAlignmentY(0.0F);
        c10TogBtn.setBorder(null);
        c10TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c10TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(c10TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 30, 30));

        b10TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b10TogBtn.setAlignmentY(0.0F);
        b10TogBtn.setBorder(null);
        b10TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(b10TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 30, 30));

        b9TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b9TogBtn.setAlignmentY(0.0F);
        b9TogBtn.setBorder(null);
        b9TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(b9TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 30, 30));

        b8TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b8TogBtn.setAlignmentY(0.0F);
        b8TogBtn.setBorder(null);
        b8TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(b8TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 30, 30));

        a8TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a8TogBtn.setAlignmentY(0.0F);
        a8TogBtn.setBorder(null);
        a8TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(a8TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 30, 30));

        a9TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a9TogBtn.setAlignmentY(0.0F);
        a9TogBtn.setBorder(null);
        a9TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(a9TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 30, 30));

        a10TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a10TogBtn.setAlignmentY(0.0F);
        a10TogBtn.setBorder(null);
        a10TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(a10TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 170, 30, 30));

        d4TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d4TogBtn.setAlignmentY(0.0F);
        d4TogBtn.setBorder(null);
        d4TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(d4TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 30, 30));

        d5TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d5TogBtn.setAlignmentY(0.0F);
        d5TogBtn.setBorder(null);
        d5TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(d5TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 30, 30));

        c5TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c5TogBtn.setAlignmentY(0.0F);
        c5TogBtn.setBorder(null);
        c5TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(c5TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 30, 30));

        c4TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c4TogBtn.setAlignmentY(0.0F);
        c4TogBtn.setBorder(null);
        c4TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(c4TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 30, 30));

        d6TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d6TogBtn.setAlignmentY(0.0F);
        d6TogBtn.setBorder(null);
        d6TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(d6TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 30, 30));

        c6TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c6TogBtn.setAlignmentY(0.0F);
        c6TogBtn.setBorder(null);
        c6TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(c6TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 30, 30));

        b6TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b6TogBtn.setAlignmentY(0.0F);
        b6TogBtn.setBorder(null);
        b6TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(b6TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 30, 30));

        b5TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b5TogBtn.setAlignmentY(0.0F);
        b5TogBtn.setBorder(null);
        b5TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(b5TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 30, 30));

        b4TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b4TogBtn.setAlignmentY(0.0F);
        b4TogBtn.setBorder(null);
        b4TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(b4TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 30, 30));

        a4TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a4TogBtn.setAlignmentY(0.0F);
        a4TogBtn.setBorder(null);
        a4TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(a4TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 30, 30));

        a5TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a5TogBtn.setAlignmentY(0.0F);
        a5TogBtn.setBorder(null);
        a5TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(a5TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 30, 30));

        a6TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a6TogBtn.setAlignmentY(0.0F);
        a6TogBtn.setBorder(null);
        a6TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(a6TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 30, 30));

        a7TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a7TogBtn.setAlignmentY(0.0F);
        a7TogBtn.setBorder(null);
        a7TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(a7TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 30, 30));

        b7TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b7TogBtn.setAlignmentY(0.0F);
        b7TogBtn.setBorder(null);
        b7TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(b7TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 30, 30));

        c7TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c7TogBtn.setAlignmentY(0.0F);
        c7TogBtn.setBorder(null);
        c7TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(c7TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 30, 30));

        d7TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d7TogBtn.setAlignmentY(0.0F);
        d7TogBtn.setBorder(null);
        d7TogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d7TogBtnActionPerformed(evt);
            }
        });
        jPanel3.add(d7TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 30, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel25.setText("Seat Reserved");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int noOfReservedSeats = 0;

    private void resetSeats() {
        a1TogBtn.setEnabled(true);
        a2TogBtn.setEnabled(true);
        a3TogBtn.setEnabled(true);
        a4TogBtn.setEnabled(true);
        a5TogBtn.setEnabled(true);
        a1TogBtn.setEnabled(true);
        a7TogBtn.setEnabled(true);
        a8TogBtn.setEnabled(true);
        a9TogBtn.setEnabled(true);
        a10TogBtn.setEnabled(true);

        b1TogBtn.setEnabled(true);
        b2TogBtn.setEnabled(true);
        b3TogBtn.setEnabled(true);
        b4TogBtn.setEnabled(true);
        b5TogBtn.setEnabled(true);
        b1TogBtn.setEnabled(true);
        b7TogBtn.setEnabled(true);
        b8TogBtn.setEnabled(true);
        b9TogBtn.setEnabled(true);
        b10TogBtn.setEnabled(true);

        c1TogBtn.setEnabled(true);
        c2TogBtn.setEnabled(true);
        c3TogBtn.setEnabled(true);
        c4TogBtn.setEnabled(true);
        c5TogBtn.setEnabled(true);
        c1TogBtn.setEnabled(true);
        c7TogBtn.setEnabled(true);
        c8TogBtn.setEnabled(true);
        c9TogBtn.setEnabled(true);
        c10TogBtn.setEnabled(true);

        d1TogBtn.setEnabled(true);
        d2TogBtn.setEnabled(true);
        d3TogBtn.setEnabled(true);
        d4TogBtn.setEnabled(true);
        d5TogBtn.setEnabled(true);
        d1TogBtn.setEnabled(true);
        d7TogBtn.setEnabled(true);
        d8TogBtn.setEnabled(true);
        d9TogBtn.setEnabled(true);
        d10TogBtn.setEnabled(true);
    }
    String hereSeats;

    private void getAlreadyReservedSeats(String date, String showtime) {
        //Retrieve data
        DefaultTableModel model = new DefaultTableModel(new String[]{"Seats"}, 0);
        String query = "SELECT seat FROM `bookings` WHERE booked_date = '" + date + "' AND showtime = '" + showtime + "'";
        String seats = null;
        boolean noseats = false;
        try {
            ResultSet rs = null;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while (rs.next()) {
                    seats = rs.getString("seat");
                    model.addRow(new Object[]{seats});
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(BookTicketsFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (noseats == false) {

            List<String> listSeats = null;
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    listSeats = Arrays.asList(model.getValueAt(row, col).toString().split(","));
                    listSeats.forEach((String gen) -> {
                        switch (gen) {
                            case "A1":
                                a1TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "A2":
                                a2TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "A3":
                                a3TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "A4":
                                a4TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "A5":
                                a5TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "A6":
                                a6TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "A7":
                                a7TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "A8":
                                a8TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "A9":
                                a9TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "A10":
                                a10TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "B1":
                                b1TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "B2":
                                b2TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "B3":
                                b3TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "B4":
                                b4TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "B5":
                                b5TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "B6":
                                b6TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "B7":
                                b7TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "B8":
                                b8TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "B9":
                                b9TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "B10":
                                b10TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "C1":
                                c1TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "C2":
                                c2TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "C3":
                                c3TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "C4":
                                c4TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "C5":
                                c5TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "C6":
                                c6TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "C7":
                                c7TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "C8":
                                c8TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "C9":
                                c9TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "C10":
                                c10TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "D1":
                                d1TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "D2":
                                d2TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "D3":
                                d3TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "D4":
                                d4TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "D5":
                                d5TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "D6":
                                d6TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "D7":
                                d7TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "D8":
                                d8TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "D9":
                                d9TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            case "D10":
                                d10TogBtn.setEnabled(false);
                                noOfReservedSeats++;
                                break;
                            default: {
                            }
                        }
                    });
                }
            }
        }
    }

    String generatedColumns[] = {"ID"};
    private int storeBookedMovie() {
        String query = "INSERT INTO `booked_movie`(`movie_title`, `screen`, `ticket_price`) VALUES (?, ?, ?)";
        int id = 0;
        try {
            PreparedStatement pst = null;
            pst = DBConnectClass.getConnection().prepareStatement(query, generatedColumns);
            pst.setString(1, movietitle);
            pst.setString(2, screenLabel.getText());
            pst.setDouble(3, ticketPrice);
            pst.execute();
            //get id
            ResultSet rs = pst.getGeneratedKeys();

            if (rs.next()) {
                id = rs.getInt(1);
            }
            pst.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(BookTicketsFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        if (showtimeCombo.getSelectedItem().equals("Select showtime")) {
            JOptionPane.showMessageDialog(null, "You cannot proceed until a showtime is picked", "Showtime", 2);
        } else {
            int bookedMovieID = storeBookedMovie();
            String query = "INSERT INTO `bookings`(`userid`, `booked_movie_id`, `seat`, `no_of_tickets`, `purchased_date`, `booked_date`, `showtime`, `total_amount`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = null;
                pst = DBConnectClass.getConnection().prepareStatement(query);
                pst.setInt(1, userid);
                pst.setInt(2, bookedMovieID);
                pst.setString(3, str);
                pst.setInt(4, noOfChecked);

                String nowdate = String.format("%1$tY-%1$tm-%1$td", LocalDate.now());
                java.sql.Date formatdate = java.sql.Date.valueOf(nowdate);
                pst.setDate(5, formatdate);

                String dateStr = String.format("%1$tY-%1$tm-%1$td", pickDate.getDate());
                java.sql.Date date = java.sql.Date.valueOf(dateStr);
                pst.setDate(6, date);

                pst.setString(7, showtimeCombo.getSelectedItem().toString());
                pst.setInt(8, totalAmount);
                pst.execute();

                String getUserquery = "SELECT email, name FROM `users` WHERE id = '" + userid + "'";
                String custEmail = null, custName = null;
                try {
                    ResultSet rs;
                    try (PreparedStatement pstcon = DBConnectClass.getConnection().prepareStatement(getUserquery)) {
                        rs = pstcon.executeQuery();
                        while (rs.next()) {
                            custEmail = rs.getString("email");
                            custName = rs.getString("name");
                        }
                    }
                    rs.close();
                    DBConnectClass.getConnection().close();
                } catch (SQLException ex) {
                    Logger.getLogger(BookTicketsFrm.class.getName()).log(Level.SEVERE, null, ex);
                }

                //send email
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
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(custEmail));
                    message.setSubject("BrainCell - Booked Seats");
                    message.setText("Hello " + custName + " thankyou for choosing BrainCell Cinema! \n"
                            + "you can view your invoice through 'My Bookings'");
                    Transport.send(message);
                } catch (MessagingException e) {
                    JOptionPane.showMessageDialog(null, "Something happened!");
                    throw new RuntimeException(e);
                }

                pst.close();
                DBConnectClass.getConnection().close();
            } catch (SQLException ex) {
                Logger.getLogger(BookTicketsFrm.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                JOptionPane.showMessageDialog(null, "Your seats have been reserved.");
                InvoiceFrm invoice = new InvoiceFrm(userid, bookedMovieID);
                invoice.pack();
                invoice.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void setTogBtnIcon(JToggleButton btn, String iconName) {
        try {
            Image seat = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/" + iconName + ".png"));
            btn.setIcon(new ImageIcon(seat));
        } catch (IOException ex) {
            Logger.getLogger(BookTicketsFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ArrayList<String> seatList = new ArrayList<>();
    String str;
    private int noOfChecked = 0;
    private int ticketPrice = 0;
    private int totalAmount = 0;

    private void checkSeat(JToggleButton btn, String seat) {
        if (showtimeCombo.getSelectedItem().equals("Select showtime")) {
            JOptionPane.showMessageDialog(null, "Please pick a show time", "Showtime", 2);
        } else {
            if (btn.isSelected()) {
                setTogBtnIcon(btn, "seatYourBtn");
                seatList.add(seat);
                str = String.join(",", seatList);
                noOfChecked++;
                totalAmount += ticketPrice;
            } else {
                setTogBtnIcon(btn, "seatAvailableBtn");
                seatList.remove(seat);
                str = String.join(",", seatList);
                noOfChecked--;
                totalAmount -= ticketPrice;
            }
            seatsLabel.setText(str);
            noOfTcksLabel.setText(noOfChecked + " Tickets");
            totalAmountLabel.setText("Rs: " + totalAmount);

            if (noOfChecked != 0) {
                confirmBtn.setEnabled(true);
            } else {
                confirmBtn.setEnabled(false);
            }
        }
    }

    private void a1TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1TogBtnActionPerformed
        checkSeat(a1TogBtn, "A1");
    }//GEN-LAST:event_a1TogBtnActionPerformed

    private void a3TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3TogBtnActionPerformed
        checkSeat(a3TogBtn, "A3");
    }//GEN-LAST:event_a3TogBtnActionPerformed

    private void a2TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2TogBtnActionPerformed
        checkSeat(a2TogBtn, "A2");
    }//GEN-LAST:event_a2TogBtnActionPerformed

    private void b3TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3TogBtnActionPerformed
        checkSeat(b3TogBtn, "A3");
    }//GEN-LAST:event_b3TogBtnActionPerformed

    private void b2TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2TogBtnActionPerformed
        checkSeat(b2TogBtn, "B2");
    }//GEN-LAST:event_b2TogBtnActionPerformed

    private void b1TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1TogBtnActionPerformed
        checkSeat(b1TogBtn, "B1");
    }//GEN-LAST:event_b1TogBtnActionPerformed

    private void d1TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1TogBtnActionPerformed
        checkSeat(d1TogBtn, "D1");
    }//GEN-LAST:event_d1TogBtnActionPerformed

    private void d3TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3TogBtnActionPerformed
        checkSeat(d3TogBtn, "D3");
    }//GEN-LAST:event_d3TogBtnActionPerformed

    private void d2TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2TogBtnActionPerformed
        checkSeat(d2TogBtn, "D2");
    }//GEN-LAST:event_d2TogBtnActionPerformed

    private void c1TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1TogBtnActionPerformed
        checkSeat(c1TogBtn, "C1");
    }//GEN-LAST:event_c1TogBtnActionPerformed

    private void c2TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2TogBtnActionPerformed
        checkSeat(c2TogBtn, "C2");
    }//GEN-LAST:event_c2TogBtnActionPerformed

    private void c3TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3TogBtnActionPerformed
        checkSeat(c3TogBtn, "C3");
    }//GEN-LAST:event_c3TogBtnActionPerformed

    private void d8TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8TogBtnActionPerformed
        checkSeat(d8TogBtn, "C8");
    }//GEN-LAST:event_d8TogBtnActionPerformed

    private void d9TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d9TogBtnActionPerformed
        checkSeat(d9TogBtn, "D9");
    }//GEN-LAST:event_d9TogBtnActionPerformed

    private void c9TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9TogBtnActionPerformed
        checkSeat(c9TogBtn, "C9");
    }//GEN-LAST:event_c9TogBtnActionPerformed

    private void c8TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8TogBtnActionPerformed
        checkSeat(c8TogBtn, "C8");
    }//GEN-LAST:event_c8TogBtnActionPerformed

    private void d10TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d10TogBtnActionPerformed
        checkSeat(d10TogBtn, "D10");
    }//GEN-LAST:event_d10TogBtnActionPerformed

    private void c10TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c10TogBtnActionPerformed
        checkSeat(c10TogBtn, "C10");
    }//GEN-LAST:event_c10TogBtnActionPerformed

    private void b10TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10TogBtnActionPerformed
        checkSeat(b10TogBtn, "B10");
    }//GEN-LAST:event_b10TogBtnActionPerformed

    private void b9TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9TogBtnActionPerformed
        checkSeat(b9TogBtn, "B9");
    }//GEN-LAST:event_b9TogBtnActionPerformed

    private void b8TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8TogBtnActionPerformed
        checkSeat(b8TogBtn, "B8");
    }//GEN-LAST:event_b8TogBtnActionPerformed

    private void a8TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8TogBtnActionPerformed
        checkSeat(a8TogBtn, "A8");
    }//GEN-LAST:event_a8TogBtnActionPerformed

    private void a9TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9TogBtnActionPerformed
        checkSeat(a9TogBtn, "A9");
    }//GEN-LAST:event_a9TogBtnActionPerformed

    private void a10TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10TogBtnActionPerformed
        checkSeat(a10TogBtn, "A10");
    }//GEN-LAST:event_a10TogBtnActionPerformed

    private void d4TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4TogBtnActionPerformed
        checkSeat(d4TogBtn, "D4");
    }//GEN-LAST:event_d4TogBtnActionPerformed

    private void d5TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5TogBtnActionPerformed
        checkSeat(d5TogBtn, "D5");
    }//GEN-LAST:event_d5TogBtnActionPerformed

    private void c5TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5TogBtnActionPerformed
        checkSeat(c5TogBtn, "C5");
    }//GEN-LAST:event_c5TogBtnActionPerformed

    private void c4TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4TogBtnActionPerformed
        checkSeat(c4TogBtn, "C4");
    }//GEN-LAST:event_c4TogBtnActionPerformed

    private void d6TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6TogBtnActionPerformed
        checkSeat(d6TogBtn, "D6");
    }//GEN-LAST:event_d6TogBtnActionPerformed

    private void c6TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6TogBtnActionPerformed
        checkSeat(c6TogBtn, "C6");
    }//GEN-LAST:event_c6TogBtnActionPerformed

    private void b6TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6TogBtnActionPerformed
        checkSeat(b6TogBtn, "B6");
    }//GEN-LAST:event_b6TogBtnActionPerformed

    private void b5TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5TogBtnActionPerformed
        checkSeat(b5TogBtn, "B5");
    }//GEN-LAST:event_b5TogBtnActionPerformed

    private void b4TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4TogBtnActionPerformed
        checkSeat(b4TogBtn, "B4");
    }//GEN-LAST:event_b4TogBtnActionPerformed

    private void a4TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4TogBtnActionPerformed
        checkSeat(a4TogBtn, "A4");
    }//GEN-LAST:event_a4TogBtnActionPerformed

    private void a5TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5TogBtnActionPerformed
        checkSeat(a5TogBtn, "A5");
    }//GEN-LAST:event_a5TogBtnActionPerformed

    private void a6TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6TogBtnActionPerformed
        checkSeat(a6TogBtn, "A6");
    }//GEN-LAST:event_a6TogBtnActionPerformed

    private void a7TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7TogBtnActionPerformed
        checkSeat(a7TogBtn, "A7");
    }//GEN-LAST:event_a7TogBtnActionPerformed

    private void b7TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7TogBtnActionPerformed
        checkSeat(b7TogBtn, "B7");
    }//GEN-LAST:event_b7TogBtnActionPerformed

    private void c7TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7TogBtnActionPerformed
        checkSeat(c7TogBtn, "C7");
    }//GEN-LAST:event_c7TogBtnActionPerformed

    private void d7TogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d7TogBtnActionPerformed
        checkSeat(d7TogBtn, "D7");
    }//GEN-LAST:event_d7TogBtnActionPerformed

    private void showtimeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showtimeComboActionPerformed
        if (pickDate.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please pick a date", "Date", 2);
        } else {
            if (!showtimeCombo.getSelectedItem().equals("Select showtime")) {
                resetSeats();
                getAlreadyReservedSeats(String.format("%1$tY-%1$tm-%1$td", pickDate.getDate()), showtimeCombo.getSelectedItem().toString());
            } else {
                JOptionPane.showMessageDialog(null, "Please pick a show time", "Showtime", 2);
            }
        }
        //JOptionPane.showMessageDialog(null, String.format("%1$tY-%1$tm-%1$td", pickDate.getDate()) +" "+ showtimeCombo.getSelectedItem().toString());
    }//GEN-LAST:event_showtimeComboActionPerformed

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
            java.util.logging.Logger.getLogger(BookTicketsFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
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
    private javax.swing.JToggleButton a10TogBtn;
    private javax.swing.JToggleButton a1TogBtn;
    private javax.swing.JToggleButton a2TogBtn;
    private javax.swing.JToggleButton a3TogBtn;
    private javax.swing.JToggleButton a4TogBtn;
    private javax.swing.JToggleButton a5TogBtn;
    private javax.swing.JToggleButton a6TogBtn;
    private javax.swing.JToggleButton a7TogBtn;
    private javax.swing.JToggleButton a8TogBtn;
    private javax.swing.JToggleButton a9TogBtn;
    private javax.swing.JToggleButton b10TogBtn;
    private javax.swing.JToggleButton b1TogBtn;
    private javax.swing.JToggleButton b2TogBtn;
    private javax.swing.JToggleButton b3TogBtn;
    private javax.swing.JToggleButton b4TogBtn;
    private javax.swing.JToggleButton b5TogBtn;
    private javax.swing.JToggleButton b6TogBtn;
    private javax.swing.JToggleButton b7TogBtn;
    private javax.swing.JToggleButton b8TogBtn;
    private javax.swing.JToggleButton b9TogBtn;
    private javax.swing.JToggleButton c10TogBtn;
    private javax.swing.JToggleButton c1TogBtn;
    private javax.swing.JToggleButton c2TogBtn;
    private javax.swing.JToggleButton c3TogBtn;
    private javax.swing.JToggleButton c4TogBtn;
    private javax.swing.JToggleButton c5TogBtn;
    private javax.swing.JToggleButton c6TogBtn;
    private javax.swing.JToggleButton c7TogBtn;
    private javax.swing.JToggleButton c8TogBtn;
    private javax.swing.JToggleButton c9TogBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel contentRatingLabel;
    private javax.swing.JToggleButton d10TogBtn;
    private javax.swing.JToggleButton d1TogBtn;
    private javax.swing.JToggleButton d2TogBtn;
    private javax.swing.JToggleButton d3TogBtn;
    private javax.swing.JToggleButton d4TogBtn;
    private javax.swing.JToggleButton d5TogBtn;
    private javax.swing.JToggleButton d6TogBtn;
    private javax.swing.JToggleButton d7TogBtn;
    private javax.swing.JToggleButton d8TogBtn;
    private javax.swing.JToggleButton d9TogBtn;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel movieLabel;
    private javax.swing.JPanel moviePanel1;
    private javax.swing.JLabel movieTitle;
    private javax.swing.JLabel noOfTcksLabel;
    private com.toedter.calendar.JDateChooser pickDate;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JLabel runtimeLabel;
    private javax.swing.JLabel screenLabel;
    private javax.swing.JLabel seatsLabel;
    private javax.swing.JComboBox<String> showtimeCombo;
    private javax.swing.JLabel starLabel1;
    private javax.swing.JLabel tckPriceLabel;
    private javax.swing.JLabel ticketLabel;
    private javax.swing.JLabel totalAmountLabel;
    // End of variables declaration//GEN-END:variables
}
