package movie.ticketbooking.system;

import java.awt.Image;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        try {
            getManageMovies();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navPanel = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();
        viewBookingsBtn = new javax.swing.JButton();
        manageMoviesBtn = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        manageMoviesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        moviesTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        viewBookingsPanel = new javax.swing.JPanel();
        profilePanel = new javax.swing.JPanel();

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

        viewBookingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/viewBookingsBtn.png"))); // NOI18N
        viewBookingsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewBookingsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewBookingsBtnMouseExited(evt);
            }
        });
        viewBookingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingsBtnActionPerformed(evt);
            }
        });
        navPanel.add(viewBookingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 35));

        manageMoviesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/components/managemoviesBtnHover.png"))); // NOI18N
        manageMoviesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageMoviesBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageMoviesBtnMouseExited(evt);
            }
        });
        manageMoviesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMoviesBtnActionPerformed(evt);
            }
        });
        navPanel.add(manageMoviesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 35));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/ticketbooking/system/assets/other/logo.png"))); // NOI18N
        navPanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 50));

        getContentPane().add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        manageMoviesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moviesTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        moviesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Movie Tit.", "Genre", "Rating", "Runtime", "Cont. Rat.", "Theater", "TP - Child", "TP - Adult"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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

        javax.swing.GroupLayout viewBookingsPanelLayout = new javax.swing.GroupLayout(viewBookingsPanel);
        viewBookingsPanel.setLayout(viewBookingsPanelLayout);
        viewBookingsPanelLayout.setHorizontalGroup(
            viewBookingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        viewBookingsPanelLayout.setVerticalGroup(
            viewBookingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(viewBookingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 550, 520));

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(profilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 550, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelVisible(Boolean mm, Boolean vb, Boolean p){
        manageMoviesPanel.setVisible(mm);
        viewBookingsPanel.setVisible(vb);
        profilePanel.setVisible(p);
    }
    
    private void manageMoviesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMoviesBtnActionPerformed
        panelVisible(true, false, false);
        try {
            getManageMovies();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_manageMoviesBtnActionPerformed

    private void getManageMovies() throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        DefaultTableModel model = new DefaultTableModel(new String[]{"Id", "Movie Tit.", "Genre", "Rating", "Runtime", "Cont. Rat.", "Screen", "TP - Child", "TP - Adult"}, 0);
        String getMoviesQuery="SELECT id, movie_title, genre, rating, hour, minute, content_rating, screen, ticket_price_child, ticket_price_adult FROM movies";
        try{
            pst = DBConnectClass.getConnection().prepareStatement(getMoviesQuery);
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
                int ticketPriceChild = rs.getInt("ticket_price_child");
                int ticketPriceAdult = rs.getInt("ticket_price_adult");

                String runtime = hour+" h and "+minute+" m";
                model.addRow(new Object[]{id, movieTitle, genre, rating, runtime, contentRating, screen, ticketPriceChild, ticketPriceAdult});
            }
            moviesTable.setModel(model);
            pst.close();
            rs.close();
            DBConnectClass.getConnection().close();
        }catch(SQLException ex){
            Logger.getLogger(AdminMainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBookingsBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void manageMoviesBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMoviesBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_manageMoviesBtnMouseEntered

    private void manageMoviesBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMoviesBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_manageMoviesBtnMouseExited

    private void viewBookingsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewBookingsBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBookingsBtnMouseEntered

    private void viewBookingsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewBookingsBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBookingsBtnMouseExited

    private void profileBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnMouseEntered

    private void profileBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_profileBtnMouseExited

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnMouseExited

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
            AddUpdateMovieFrm addUpdateMovieFrm = new AddUpdateMovieFrm(idvalue);
            addUpdateMovieFrm.pack();
            addUpdateMovieFrm.setVisible(true);
        }   
    }//GEN-LAST:event_editBtnActionPerformed

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
    private javax.swing.JButton editBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton manageMoviesBtn;
    private javax.swing.JPanel manageMoviesPanel;
    private javax.swing.JTable moviesTable;
    private javax.swing.JPanel navPanel;
    private javax.swing.JButton profileBtn;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewBookingsBtn;
    private javax.swing.JPanel viewBookingsPanel;
    // End of variables declaration//GEN-END:variables
}
