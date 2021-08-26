package movie.ticketbooking.system;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
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
public class AdminMainFrm extends javax.swing.JFrame {
    
    public AdminMainFrm() {
        initComponents();
        loadFrameImage();
        try {
            getManageMovies();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadFrameImage() {
        try {
            setIconImage(ImageIO.read(new File("logo.png")));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navPanel = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        viewBookingsBtn = new javax.swing.JButton();
        manageMoviesBtn = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        contactusLink = new javax.swing.JLabel();
        manageMoviesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        moviesTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        viewBookingsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewBookingsTable = new javax.swing.JTable();
        sortByMYCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        viewInvoiceBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
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

        viewBookingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/viewBookingsBtn.png"))); // NOI18N
        viewBookingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingsBtnActionPerformed(evt);
            }
        });
        navPanel.add(viewBookingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 35));

        manageMoviesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/managemoviesBtnHover.png"))); // NOI18N
        manageMoviesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMoviesBtnActionPerformed(evt);
            }
        });
        navPanel.add(manageMoviesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 35));

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
        navPanel.add(contactusLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, 20));

        getContentPane().add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        manageMoviesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moviesTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Movie Tit.", "Genre", "Rating", "Runtime", "Cont. Rat.", "Theater", "Tic. Price."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        moviesTable.setShowGrid(true);
        jScrollPane1.setViewportView(moviesTable);

        manageMoviesPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 640, 230));

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
        manageMoviesPanel.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 40, 30));

        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/editBtn.png"))); // NOI18N
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editBtnMouseExited(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        manageMoviesPanel.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 80, 30));

        getContentPane().add(manageMoviesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 720, 500));

        viewBookingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewBookingsTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        viewBookingsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cust. ID", "Bked M.ID", "Cust. Name", "Movie Title", "Purchased Date", "Booked Date", "No of Tickets", "Seats", "Tick. Price", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane2.setViewportView(viewBookingsTable);

        viewBookingsPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 650, 390));

        sortByMYCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        sortByMYCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort by Month/Year", "This Month", "This Year", "Last Year" }));
        sortByMYCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByMYComboActionPerformed(evt);
            }
        });
        viewBookingsPanel.add(sortByMYCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/icons8_search_20px.png"))); // NOI18N
        viewBookingsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 20, 20));

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
        viewBookingsPanel.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 180, -1));

        viewInvoiceBtn.setText("View Invoice");
        viewInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvoiceBtnActionPerformed(evt);
            }
        });
        viewBookingsPanel.add(viewInvoiceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        getContentPane().add(viewBookingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 720, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelVisible(Boolean mm, Boolean vb){
        manageMoviesPanel.setVisible(mm);
        viewBookingsPanel.setVisible(vb);
    }
    
    private void manageMoviesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMoviesBtnActionPerformed
        panelVisible(true, false);
        try {
            getManageMovies();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Image manageMoviesBtnChecked = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/manageMoviesBtnHover.png"));
            manageMoviesBtn.setIcon(new ImageIcon(manageMoviesBtnChecked));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Image viewBookingsBtnChecked = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/viewBookingsBtn.png"));
            viewBookingsBtn.setIcon(new ImageIcon(viewBookingsBtnChecked));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_manageMoviesBtnActionPerformed

    private void getManageMovies() throws SQLException{
        DefaultTableModel model = new DefaultTableModel(new String[]{"Id", "Movie Tit.", "Genre", "Rating", "Runtime", "Cont. Rat.", "Screen", "Ticket Price"}, 0);
        String getMoviesQuery="SELECT id, movie_title, genre, rating, hour, minute, content_rating, screen, ticket_price FROM movies";
        try{
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(getMoviesQuery)) {
                rs = pst.executeQuery();
                while(rs.next())
                {
                    int id = rs.getInt("id");
                    String movieTitle = rs.getString("movie_title");
                    String genre = rs.getString("genre");
                    Double rating = rs.getDouble("rating");
                    int hour = rs.getInt("hour");
                    int minute = rs.getInt("minute");
                    String contentRating = rs.getString("content_rating");
                    String screen = rs.getString("screen");
                    int ticketPrice = rs.getInt("ticket_price");
                    String runtime = hour+" h and "+minute+" m";
                    model.addRow(new Object[]{id, movieTitle, genre, rating, runtime, contentRating, screen, ticketPrice});
                }   moviesTable.setModel(model);
            }
            rs.close();
            DBConnectClass.getConnection().close();
        }catch(SQLException ex){
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Cust. ID", "Bked M.ID", "Cust. Name", "Movie Title", "Purchased Date", "Booked Date", "No of Tickets", "Seats", "Tick. Price", "Total Amount"}, 0);
    private void getBookingInfo(String chooseDate){
        tableModel.setRowCount(0);
        String query = null;
        //Select all
        if("null".equals(chooseDate)){
            query = "SELECT bookings.userid, bookings.booked_movie_id, users.name, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.total_amount, booked_movie.movie_title, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id INNER JOIN `users` ON users.id=bookings.userid";
        }
        //Select this month
        if("This Month".equals(chooseDate)){
            query = "SELECT bookings.userid, bookings.booked_movie_id, users.name, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.total_amount, booked_movie.movie_title, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id INNER JOIN `users` ON users.id=bookings.userid AND MONTH(booked_date) = MONTH(CURRENT_DATE()) AND YEAR(booked_date) = YEAR(CURRENT_DATE())";
        }
        //Select this year
        if("This Year".equals(chooseDate)){
            query = "SELECT bookings.userid, bookings.booked_movie_id, users.name, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.total_amount, booked_movie.movie_title, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id INNER JOIN `users` ON users.id=bookings.userid AND YEAR(booked_date) = YEAR(CURRENT_DATE())";
        }
        //Select last year
        if("Last Year".equals(chooseDate)){
            query = "SELECT bookings.userid, bookings.booked_movie_id, users.name, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.total_amount, booked_movie.movie_title, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id INNER JOIN `users` ON users.id=bookings.userid AND YEAR(booked_date) = YEAR(DATE_SUB(CURDATE(), INTERVAL 1 YEAR))";
        }
        
        try {
        ResultSet rs;
        try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
            rs = pst.executeQuery();
            while(rs.next()){
                int customerId = rs.getInt("userid");
                int bookedMovieId = rs.getInt("booked_movie_id");
                String customerName = rs.getString("name");
                String movietitle = rs.getString("movie_title");
                String purchasedDate = String.valueOf(rs.getDate("purchased_date"));
                String bookedDate = String.valueOf(rs.getDate("booked_date"));
                int noOfTickets = rs.getInt("no_of_tickets");
                String seats = rs.getString("seat");
                int ticketPrice = rs.getInt("ticket_price");
                int totalAmount = rs.getInt("total_amount");

                tableModel.addRow(new Object[]{customerId, bookedMovieId, customerName, movietitle, purchasedDate, bookedDate, noOfTickets, seats, ticketPrice, totalAmount});
            }
        }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        viewBookingsTable.setModel(tableModel);
    }
    
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

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        try {
            getManageMovies();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void viewBookingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingsBtnActionPerformed
        panelVisible(false, true);
        String nowdate = String.format("%1$tY-%1$tm-%1$td", LocalDate.now());
        java.sql.Date formatdate = java.sql.Date.valueOf(nowdate);
        getBookingInfo("null");
        try {
            Image manageMoviesBtnChecked = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/manageMoviesBtn.png"));
            manageMoviesBtn.setIcon(new ImageIcon(manageMoviesBtnChecked));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Image viewBookingsBtnChecked = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/viewBookingsBtnHover.png"));
            viewBookingsBtn.setIcon(new ImageIcon(viewBookingsBtnChecked));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewBookingsBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        LoginFrm lgnFrm = new LoginFrm();
        lgnFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void editBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseEntered
        try {
            Image editBtnImgHover = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/editBtnHover.png"));
            editBtn.setIcon(new ImageIcon(editBtnImgHover));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editBtnMouseEntered

    private void editBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseExited
        try {
            Image editBtnImg = ImageIO.read(getClass().getResource("/movie/ticketbooking/system/assets/components/editBtn.png"));
            editBtn.setIcon(new ImageIcon(editBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editBtnMouseExited

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if(moviesTable.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Please select a record to edit", "Row not selected", 2);
        }
        else{
            int column = 0;
            int row = moviesTable.getSelectedRow();
            int idvalue = (int) moviesTable.getModel().getValueAt(row, column);
            UpdateMovieFrm addUpdateMovieFrm = new UpdateMovieFrm(idvalue);
            addUpdateMovieFrm.pack();
            addUpdateMovieFrm.setVisible(true);
        }   
    }//GEN-LAST:event_editBtnActionPerformed

    private void sortByMYComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByMYComboActionPerformed
        //This Month
        if(sortByMYCombo.getSelectedItem() == "This Month"){
            getBookingInfo("This Month");
        }
        //Last Month
        if(sortByMYCombo.getSelectedItem() == "This Year"){
            getBookingInfo("This Year");
        }
        //Last Year
        if(sortByMYCombo.getSelectedItem() == "Last Year"){
            getBookingInfo("Last Year");
        }
    }//GEN-LAST:event_sortByMYComboActionPerformed

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

    DefaultTableModel searchTableModel = new DefaultTableModel(new String[]{"Cust. ID", "Bked M.ID", "Cust. Name", "Movie Title", "Purchased Date", "Booked Date", "No of Tickets", "Seats", "Tick. Price", "Total Amount"}, 0);
    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        tableModel.setRowCount(0);
        searchTableModel.setRowCount(0);
        String searchValue = searchTextField.getText();
        String query = "";
        if(searchValue.equals("")){
            query = "SELECT bookings.userid, bookings.booked_movie_id, users.name, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.total_amount, booked_movie.movie_title, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id INNER JOIN `users` ON users.id=bookings.userid";
        }else{
            query = "SELECT bookings.userid, bookings.booked_movie_id, users.name, bookings.seat, bookings.no_of_tickets, bookings.purchased_date, bookings.booked_date, bookings.total_amount, booked_movie.movie_title, booked_movie.ticket_price FROM `bookings` INNER JOIN `booked_movie` ON bookings.booked_movie_id=booked_movie.id INNER JOIN `users` ON users.id=bookings.userid AND booked_movie.movie_title LIKE '%" + searchValue + "%' OR bookings.purchased_date LIKE '%" + searchValue + "%' OR users.name LIKE '%" + searchValue + "%'";
        }

        try {
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while(rs.next()){
                    int customerId = rs.getInt("userid");
                    int bookedMovieId = rs.getInt("booked_movie_id");     
                    String customerName = rs.getString("name");
                    String movietitle = rs.getString("movie_title");
                    String purchasedDate = String.valueOf(rs.getDate("purchased_date"));
                    String bookedDate = String.valueOf(rs.getDate("booked_date"));
                    int noOfTickets = rs.getInt("no_of_tickets");
                    String seats = rs.getString("seat");
                    int ticketPrice = rs.getInt("ticket_price");
                    int totalAmount = rs.getInt("total_amount");

                    searchTableModel.addRow(new Object[]{customerId, bookedMovieId, customerName, movietitle, purchasedDate, bookedDate, noOfTickets, seats, ticketPrice, totalAmount});
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        viewBookingsTable.setModel(searchTableModel);
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void viewInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvoiceBtnActionPerformed
        if(viewBookingsTable.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Please select a record to view invoice", "Row not selected", 2);
        }
        else{
            int row = viewBookingsTable.getSelectedRow();
            int userid = (int) viewBookingsTable.getModel().getValueAt(row, 0);
            int bookedid = (int) viewBookingsTable.getModel().getValueAt(row, 1);
            InvoiceFrm invoice = new InvoiceFrm(userid, bookedid);
            invoice.pack();
            invoice.setVisible(true);
        }
    }//GEN-LAST:event_viewInvoiceBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminMainFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactusLink;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton manageMoviesBtn;
    private javax.swing.JPanel manageMoviesPanel;
    private javax.swing.JTable moviesTable;
    private javax.swing.JPanel navPanel;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JComboBox<String> sortByMYCombo;
    private javax.swing.JButton viewBookingsBtn;
    private javax.swing.JPanel viewBookingsPanel;
    private javax.swing.JTable viewBookingsTable;
    private javax.swing.JButton viewInvoiceBtn;
    // End of variables declaration//GEN-END:variables
}
