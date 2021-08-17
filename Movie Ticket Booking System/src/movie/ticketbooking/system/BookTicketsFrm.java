package movie.ticketbooking.system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author nadinCodeHat
 */
public class BookTicketsFrm extends javax.swing.JFrame {

    public BookTicketsFrm(){}
    
    private int idval = 0;
    public BookTicketsFrm(int id) {
        initComponents();
        this.idval = id;
        loadMovieData();
    }

    private void loadMovieData(){
        //Retrieve data
        String query = "SELECT movie_title, genre, rating, hour, minute, content_rating, description, screen, ticket_price_child, ticket_price_adult, poster FROM `movies` WHERE id = '"+idval+"'";
        try {
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while(rs.next()){
                    movieTitle.setText("<html>"+ rs.getString("movie_title")+ "</html>");
                    genreLabel.setText(rs.getString("genre"));
                    ratingLabel.setText(String.valueOf(rs.getDouble("rating"))+"/10");
                    runtimeLabel.setText(rs.getInt("hour")+"h and "+rs.getInt("minute")+"m");
                    contentRatingLabel.setText(rs.getString("content_rating"));
                    descriptionTextArea.setText(rs.getString("description"));
                    screenLabel.setText(rs.getString("screen"));
                    tckPriceChildLabel.setText("Rs. "+String.valueOf(rs.getInt("ticket_price_child")));
                    tckPriceAdultLabel.setText("Rs. "+String.valueOf(rs.getInt("ticket_price_adult")));
                    movieLabel.setIcon(parsePoster(rs.getBytes("poster")));
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(BookTicketsFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private ImageIcon parsePoster(byte[] dTM){
        ImageIcon icon =new ImageIcon(dTM);
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
        adultLabel1 = new javax.swing.JLabel();
        childLabel1 = new javax.swing.JLabel();
        tckPriceAdultLabel = new javax.swing.JLabel();
        tckPriceChildLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        showtimeCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        screenLabel = new javax.swing.JLabel();
        a3TogBtn = new javax.swing.JToggleButton();
        a1TogBtn = new javax.swing.JToggleButton();
        a2TogBtn = new javax.swing.JToggleButton();
        b3TogBtn = new javax.swing.JToggleButton();
        b1TogBtn = new javax.swing.JToggleButton();
        b2TogBtn = new javax.swing.JToggleButton();
        c3TogBtn = new javax.swing.JToggleButton();
        c1TogBtn = new javax.swing.JToggleButton();
        c2TogBtn = new javax.swing.JToggleButton();
        d3TogBtn = new javax.swing.JToggleButton();
        d1TogBtn = new javax.swing.JToggleButton();
        d2TogBtn = new javax.swing.JToggleButton();
        a6TogBtn = new javax.swing.JToggleButton();
        a4TogBtn = new javax.swing.JToggleButton();
        a5TogBtn = new javax.swing.JToggleButton();
        b6TogBtn = new javax.swing.JToggleButton();
        b4TogBtn = new javax.swing.JToggleButton();
        b5TogBtn = new javax.swing.JToggleButton();
        c6TogBtn = new javax.swing.JToggleButton();
        c4TogBtn = new javax.swing.JToggleButton();
        c5TogBtn = new javax.swing.JToggleButton();
        d6TogBtn = new javax.swing.JToggleButton();
        d4TogBtn = new javax.swing.JToggleButton();
        d5TogBtn = new javax.swing.JToggleButton();
        a9TogBtn = new javax.swing.JToggleButton();
        a7TogBtn = new javax.swing.JToggleButton();
        a8TogBtn = new javax.swing.JToggleButton();
        b9TogBtn = new javax.swing.JToggleButton();
        b7TogBtn = new javax.swing.JToggleButton();
        b8TogBtn = new javax.swing.JToggleButton();
        c9TogBtn = new javax.swing.JToggleButton();
        c7TogBtn = new javax.swing.JToggleButton();
        c8TogBtn = new javax.swing.JToggleButton();
        d9TogBtn = new javax.swing.JToggleButton();
        d7TogBtn = new javax.swing.JToggleButton();
        d8TogBtn = new javax.swing.JToggleButton();
        d12TogBtn = new javax.swing.JToggleButton();
        c12TogBtn = new javax.swing.JToggleButton();
        c11TogBtn = new javax.swing.JToggleButton();
        a12TogBtn = new javax.swing.JToggleButton();
        c10TogBtn = new javax.swing.JToggleButton();
        d10TogBtn = new javax.swing.JToggleButton();
        b12TogBtn = new javax.swing.JToggleButton();
        d11TogBtn = new javax.swing.JToggleButton();
        b10TogBtn = new javax.swing.JToggleButton();
        a10TogBtn = new javax.swing.JToggleButton();
        b11TogBtn = new javax.swing.JToggleButton();
        a11TogBtn = new javax.swing.JToggleButton();
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
        pickDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        adultLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        adultLabel1.setText("Adults (ages 14 & up)");
        moviePanel1.add(adultLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        childLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        childLabel1.setText("Children (ages 2 - 13)");
        moviePanel1.add(childLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));
        moviePanel1.add(tckPriceAdultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 492, -1, -1));
        moviePanel1.add(tckPriceChildLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 462, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_movie_ticket_20px.png"))); // NOI18N
        moviePanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

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

        screenLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        screenLabel.setForeground(new java.awt.Color(235, 16, 42));
        jPanel1.add(screenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 15, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 570, 50));

        a3TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a3TogBtn.setAlignmentY(0.0F);
        a3TogBtn.setBorder(null);
        jPanel3.add(a3TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 30, 30));

        a1TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a1TogBtn.setAlignmentY(0.0F);
        a1TogBtn.setBorder(null);
        jPanel3.add(a1TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, 30));

        a2TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a2TogBtn.setAlignmentY(0.0F);
        a2TogBtn.setBorder(null);
        jPanel3.add(a2TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 30, 30));

        b3TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b3TogBtn.setAlignmentY(0.0F);
        b3TogBtn.setBorder(null);
        jPanel3.add(b3TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 30, 30));

        b1TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b1TogBtn.setAlignmentY(0.0F);
        b1TogBtn.setBorder(null);
        jPanel3.add(b1TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 30, 30));

        b2TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b2TogBtn.setAlignmentY(0.0F);
        b2TogBtn.setBorder(null);
        jPanel3.add(b2TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 30, 30));

        c3TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c3TogBtn.setAlignmentY(0.0F);
        c3TogBtn.setBorder(null);
        jPanel3.add(c3TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 30, 30));

        c1TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c1TogBtn.setAlignmentY(0.0F);
        c1TogBtn.setBorder(null);
        jPanel3.add(c1TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 30, 30));

        c2TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c2TogBtn.setAlignmentY(0.0F);
        c2TogBtn.setBorder(null);
        jPanel3.add(c2TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 30, 30));

        d3TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d3TogBtn.setAlignmentY(0.0F);
        d3TogBtn.setBorder(null);
        jPanel3.add(d3TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 30, 30));

        d1TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d1TogBtn.setAlignmentY(0.0F);
        d1TogBtn.setBorder(null);
        jPanel3.add(d1TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 30, 30));

        d2TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d2TogBtn.setAlignmentY(0.0F);
        d2TogBtn.setBorder(null);
        jPanel3.add(d2TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 30, 30));

        a6TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a6TogBtn.setAlignmentY(0.0F);
        a6TogBtn.setBorder(null);
        jPanel3.add(a6TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 30, 30));

        a4TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a4TogBtn.setAlignmentY(0.0F);
        a4TogBtn.setBorder(null);
        jPanel3.add(a4TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 30, 30));

        a5TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a5TogBtn.setAlignmentY(0.0F);
        a5TogBtn.setBorder(null);
        jPanel3.add(a5TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 30, 30));

        b6TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b6TogBtn.setAlignmentY(0.0F);
        b6TogBtn.setBorder(null);
        jPanel3.add(b6TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 30, 30));

        b4TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b4TogBtn.setAlignmentY(0.0F);
        b4TogBtn.setBorder(null);
        jPanel3.add(b4TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 30, 30));

        b5TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b5TogBtn.setAlignmentY(0.0F);
        b5TogBtn.setBorder(null);
        jPanel3.add(b5TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 30, 30));

        c6TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c6TogBtn.setAlignmentY(0.0F);
        c6TogBtn.setBorder(null);
        jPanel3.add(c6TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 30, 30));

        c4TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c4TogBtn.setAlignmentY(0.0F);
        c4TogBtn.setBorder(null);
        jPanel3.add(c4TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 30, 30));

        c5TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c5TogBtn.setAlignmentY(0.0F);
        c5TogBtn.setBorder(null);
        jPanel3.add(c5TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 30, 30));

        d6TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d6TogBtn.setAlignmentY(0.0F);
        d6TogBtn.setBorder(null);
        jPanel3.add(d6TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 30, 30));

        d4TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d4TogBtn.setAlignmentY(0.0F);
        d4TogBtn.setBorder(null);
        jPanel3.add(d4TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 30, 30));

        d5TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d5TogBtn.setAlignmentY(0.0F);
        d5TogBtn.setBorder(null);
        jPanel3.add(d5TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 30, 30));

        a9TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a9TogBtn.setAlignmentY(0.0F);
        a9TogBtn.setBorder(null);
        jPanel3.add(a9TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 30, 30));

        a7TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a7TogBtn.setAlignmentY(0.0F);
        a7TogBtn.setBorder(null);
        jPanel3.add(a7TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 30, 30));

        a8TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a8TogBtn.setAlignmentY(0.0F);
        a8TogBtn.setBorder(null);
        jPanel3.add(a8TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 30, 30));

        b9TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b9TogBtn.setAlignmentY(0.0F);
        b9TogBtn.setBorder(null);
        jPanel3.add(b9TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 30, 30));

        b7TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b7TogBtn.setAlignmentY(0.0F);
        b7TogBtn.setBorder(null);
        jPanel3.add(b7TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 30, 30));

        b8TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b8TogBtn.setAlignmentY(0.0F);
        b8TogBtn.setBorder(null);
        jPanel3.add(b8TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 30, 30));

        c9TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c9TogBtn.setAlignmentY(0.0F);
        c9TogBtn.setBorder(null);
        jPanel3.add(c9TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 30, 30));

        c7TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c7TogBtn.setAlignmentY(0.0F);
        c7TogBtn.setBorder(null);
        jPanel3.add(c7TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 30, 30));

        c8TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c8TogBtn.setAlignmentY(0.0F);
        c8TogBtn.setBorder(null);
        jPanel3.add(c8TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 30, 30));

        d9TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d9TogBtn.setAlignmentY(0.0F);
        d9TogBtn.setBorder(null);
        jPanel3.add(d9TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 30, 30));

        d7TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d7TogBtn.setAlignmentY(0.0F);
        d7TogBtn.setBorder(null);
        jPanel3.add(d7TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 30, 30));

        d8TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d8TogBtn.setAlignmentY(0.0F);
        d8TogBtn.setBorder(null);
        jPanel3.add(d8TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 30, 30));

        d12TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d12TogBtn.setAlignmentY(0.0F);
        d12TogBtn.setBorder(null);
        jPanel3.add(d12TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 30, 30));

        c12TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c12TogBtn.setAlignmentY(0.0F);
        c12TogBtn.setBorder(null);
        jPanel3.add(c12TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 30, 30));

        c11TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c11TogBtn.setAlignmentY(0.0F);
        c11TogBtn.setBorder(null);
        jPanel3.add(c11TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 30, 30));

        a12TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a12TogBtn.setAlignmentY(0.0F);
        a12TogBtn.setBorder(null);
        jPanel3.add(a12TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 170, 30, 30));

        c10TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        c10TogBtn.setAlignmentY(0.0F);
        c10TogBtn.setBorder(null);
        jPanel3.add(c10TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 30, 30));

        d10TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d10TogBtn.setAlignmentY(0.0F);
        d10TogBtn.setBorder(null);
        jPanel3.add(d10TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 30, 30));

        b12TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b12TogBtn.setAlignmentY(0.0F);
        b12TogBtn.setBorder(null);
        jPanel3.add(b12TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 30, 30));

        d11TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        d11TogBtn.setAlignmentY(0.0F);
        d11TogBtn.setBorder(null);
        jPanel3.add(d11TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 30, 30));

        b10TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b10TogBtn.setAlignmentY(0.0F);
        b10TogBtn.setBorder(null);
        jPanel3.add(b10TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 30, 30));

        a10TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a10TogBtn.setAlignmentY(0.0F);
        a10TogBtn.setBorder(null);
        jPanel3.add(a10TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 30, 30));

        b11TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        b11TogBtn.setAlignmentY(0.0F);
        b11TogBtn.setBorder(null);
        jPanel3.add(b11TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 30, 30));

        a11TogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/seatAvailableBtn.png"))); // NOI18N
        a11TogBtn.setAlignmentY(0.0F);
        a11TogBtn.setBorder(null);
        jPanel3.add(a11TogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 30, 30));

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
        jLabel10.setText("12");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("6");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("7");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("3");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setText("1");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setText("2");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setText("8");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setText("5");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setText("4");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setText("9");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setText("10");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setText("11");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, -1, -1));

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

        pickDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel3.add(pickDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 40, 120, -1));

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
    private javax.swing.JToggleButton a10TogBtn;
    private javax.swing.JToggleButton a11TogBtn;
    private javax.swing.JToggleButton a12TogBtn;
    private javax.swing.JToggleButton a1TogBtn;
    private javax.swing.JToggleButton a2TogBtn;
    private javax.swing.JToggleButton a3TogBtn;
    private javax.swing.JToggleButton a4TogBtn;
    private javax.swing.JToggleButton a5TogBtn;
    private javax.swing.JToggleButton a6TogBtn;
    private javax.swing.JToggleButton a7TogBtn;
    private javax.swing.JToggleButton a8TogBtn;
    private javax.swing.JToggleButton a9TogBtn;
    private javax.swing.JLabel adultLabel1;
    private javax.swing.JToggleButton b10TogBtn;
    private javax.swing.JToggleButton b11TogBtn;
    private javax.swing.JToggleButton b12TogBtn;
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
    private javax.swing.JToggleButton c11TogBtn;
    private javax.swing.JToggleButton c12TogBtn;
    private javax.swing.JToggleButton c1TogBtn;
    private javax.swing.JToggleButton c2TogBtn;
    private javax.swing.JToggleButton c3TogBtn;
    private javax.swing.JToggleButton c4TogBtn;
    private javax.swing.JToggleButton c5TogBtn;
    private javax.swing.JToggleButton c6TogBtn;
    private javax.swing.JToggleButton c7TogBtn;
    private javax.swing.JToggleButton c8TogBtn;
    private javax.swing.JToggleButton c9TogBtn;
    private javax.swing.JLabel childLabel1;
    private javax.swing.JLabel contentRatingLabel;
    private javax.swing.JToggleButton d10TogBtn;
    private javax.swing.JToggleButton d11TogBtn;
    private javax.swing.JToggleButton d12TogBtn;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel movieLabel;
    private javax.swing.JPanel moviePanel1;
    private javax.swing.JLabel movieTitle;
    private com.toedter.calendar.JDateChooser pickDate;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JLabel runtimeLabel;
    private javax.swing.JLabel screenLabel;
    private javax.swing.JComboBox<String> showtimeCombo;
    private javax.swing.JLabel starLabel1;
    private javax.swing.JLabel tckPriceAdultLabel;
    private javax.swing.JLabel tckPriceChildLabel;
    // End of variables declaration//GEN-END:variables
}
