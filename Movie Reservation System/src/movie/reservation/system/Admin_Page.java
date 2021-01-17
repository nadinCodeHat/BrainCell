package movie.reservation.system;

import java.awt.Color;
import javax.swing.ImageIcon;

public class Admin_Page extends javax.swing.JFrame {

    public Admin_Page() {
        initComponents();
        dashboard_sm_pnl.setVisible(true);
        add_movie_sm_pnl.setVisible(false);
        screens_sm_pnl.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logout_pnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logout_ico = new javax.swing.JLabel();
        dashboard_pnl = new javax.swing.JPanel();
        dashboard_sm_pnl = new javax.swing.JPanel();
        dashboard_lb = new javax.swing.JLabel();
        dashboard_ico = new javax.swing.JLabel();
        add_movie_pnl = new javax.swing.JPanel();
        add_movie_sm_pnl = new javax.swing.JPanel();
        add_movie_lb = new javax.swing.JLabel();
        add_movie_ico = new javax.swing.JLabel();
        screens_pnl = new javax.swing.JPanel();
        screens_sm_pnl = new javax.swing.JPanel();
        screens_lb = new javax.swing.JLabel();
        screens_ico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(4, 95, 202));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(4, 85, 181));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(3, 29, 124));
        jLabel19.setText("BrainCell Cinema");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/images/small logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19)))
                .addContainerGap())
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome, nadinCodeHat");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jPanel1.setBackground(new java.awt.Color(25, 28, 31));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout_pnl.setBackground(new java.awt.Color(25, 28, 31));
        logout_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Log Out");
        logout_pnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 12, -1, -1));

        logout_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/asserts/Icons/logout.png"))); // NOI18N
        logout_pnl.add(logout_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, 25, 25));

        jPanel1.add(logout_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 200, 40));

        dashboard_pnl.setBackground(new java.awt.Color(34, 43, 49));
        dashboard_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard_pnlMouseClicked(evt);
            }
        });
        dashboard_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard_sm_pnl.setBackground(new java.awt.Color(61, 99, 125));

        javax.swing.GroupLayout dashboard_sm_pnlLayout = new javax.swing.GroupLayout(dashboard_sm_pnl);
        dashboard_sm_pnl.setLayout(dashboard_sm_pnlLayout);
        dashboard_sm_pnlLayout.setHorizontalGroup(
            dashboard_sm_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dashboard_sm_pnlLayout.setVerticalGroup(
            dashboard_sm_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        dashboard_pnl.add(dashboard_sm_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, -1));

        dashboard_lb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        dashboard_lb.setForeground(new java.awt.Color(4, 95, 202));
        dashboard_lb.setText("Dashboard");
        dashboard_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard_lbMouseClicked(evt);
            }
        });
        dashboard_pnl.add(dashboard_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 12, -1, -1));

        dashboard_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/asserts/Icons/dashboard_clicked.png"))); // NOI18N
        dashboard_pnl.add(dashboard_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, 25, 25));

        jPanel1.add(dashboard_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, 40));

        add_movie_pnl.setBackground(new java.awt.Color(25, 28, 31));
        add_movie_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_movie_pnlMouseClicked(evt);
            }
        });
        add_movie_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_movie_sm_pnl.setBackground(new java.awt.Color(61, 99, 125));

        javax.swing.GroupLayout add_movie_sm_pnlLayout = new javax.swing.GroupLayout(add_movie_sm_pnl);
        add_movie_sm_pnl.setLayout(add_movie_sm_pnlLayout);
        add_movie_sm_pnlLayout.setHorizontalGroup(
            add_movie_sm_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        add_movie_sm_pnlLayout.setVerticalGroup(
            add_movie_sm_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add_movie_pnl.add(add_movie_sm_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, -1));

        add_movie_lb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add_movie_lb.setForeground(new java.awt.Color(204, 204, 204));
        add_movie_lb.setText("Add Movie");
        add_movie_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_movie_lbMouseClicked(evt);
            }
        });
        add_movie_pnl.add(add_movie_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 12, -1, -1));

        add_movie_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/asserts/Icons/add.png"))); // NOI18N
        add_movie_pnl.add(add_movie_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, 25, 25));

        jPanel1.add(add_movie_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 40));

        screens_pnl.setBackground(new java.awt.Color(25, 28, 31));
        screens_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                screens_pnlMouseClicked(evt);
            }
        });
        screens_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screens_sm_pnl.setBackground(new java.awt.Color(61, 99, 125));

        javax.swing.GroupLayout screens_sm_pnlLayout = new javax.swing.GroupLayout(screens_sm_pnl);
        screens_sm_pnl.setLayout(screens_sm_pnlLayout);
        screens_sm_pnlLayout.setHorizontalGroup(
            screens_sm_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        screens_sm_pnlLayout.setVerticalGroup(
            screens_sm_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        screens_pnl.add(screens_sm_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, -1));

        screens_lb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        screens_lb.setForeground(new java.awt.Color(204, 204, 204));
        screens_lb.setText("Screens");
        screens_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                screens_lbMouseClicked(evt);
            }
        });
        screens_pnl.add(screens_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 12, -1, -1));

        screens_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movie/reservation/system/asserts/Icons/scenes.png"))); // NOI18N
        screens_pnl.add(screens_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, 25, 25));

        jPanel1.add(screens_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboard_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_pnlMouseClicked
        dashboard_pnl.setBackground(new Color(34,43,49));
        dashboard_sm_pnl.setVisible(true);
        dashboard_lb.setForeground(new Color(4,95,202));
        dashboard_ico.setIcon(new ImageIcon("assets/icons/dashboard_clicked.png"));
        
        add_movie_pnl.setBackground(new Color(25,28,31));
        add_movie_sm_pnl.setVisible(false);
        add_movie_lb.setForeground(Color.WHITE);
        add_movie_ico.setIcon(new ImageIcon(getClass().getResource("assets/icons/add_clicked.png")));
        
        screens_pnl.setBackground(new Color(25,28,31));
        screens_sm_pnl.setVisible(false);
        screens_lb.setForeground(Color.WHITE);
        screens_ico.setIcon(new ImageIcon(getClass().getResource("assets/icons/screens_ico.png")));
    }//GEN-LAST:event_dashboard_pnlMouseClicked

    private void dashboard_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_lbMouseClicked
        dashboard_pnl.setBackground(new Color(34,43,49));
        dashboard_sm_pnl.setVisible(true);
        dashboard_lb.setForeground(new Color(4,95,202));
        
        add_movie_pnl.setBackground(new Color(25,28,31));
        add_movie_sm_pnl.setVisible(false);
        add_movie_lb.setForeground(Color.WHITE);
        
        screens_pnl.setBackground(new Color(25,28,31));
        screens_sm_pnl.setVisible(false);
        screens_lb.setForeground(Color.WHITE);
    }//GEN-LAST:event_dashboard_lbMouseClicked

    private void add_movie_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_movie_pnlMouseClicked
        dashboard_pnl.setBackground(new Color(25,28,31));
        dashboard_sm_pnl.setVisible(false);
        dashboard_lb.setForeground(Color.WHITE);
        
        add_movie_pnl.setBackground(new Color(34,43,49));
        add_movie_sm_pnl.setVisible(true);
        add_movie_lb.setForeground(new Color(4,95,202));
        
        screens_pnl.setBackground(new Color(25,28,31));
        screens_sm_pnl.setVisible(false);
        screens_lb.setForeground(Color.WHITE);
    }//GEN-LAST:event_add_movie_pnlMouseClicked

    private void add_movie_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_movie_lbMouseClicked
        dashboard_pnl.setBackground(new Color(25,28,31));
        dashboard_sm_pnl.setVisible(false);
        dashboard_lb.setForeground(Color.WHITE);
        
        add_movie_pnl.setBackground(new Color(34,43,49));
        add_movie_sm_pnl.setVisible(true);
        add_movie_lb.setForeground(new Color(4,95,202));
        
        screens_pnl.setBackground(new Color(25,28,31));
        screens_sm_pnl.setVisible(false);
        screens_lb.setForeground(Color.WHITE);
    }//GEN-LAST:event_add_movie_lbMouseClicked

    private void screens_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screens_pnlMouseClicked
        dashboard_pnl.setBackground(new Color(25,28,31));
        dashboard_sm_pnl.setVisible(false);
        dashboard_lb.setForeground(Color.WHITE);
        
        add_movie_pnl.setBackground(new Color(25,28,31));
        add_movie_sm_pnl.setVisible(false);
        add_movie_lb.setForeground(Color.WHITE);
        
        screens_pnl.setBackground(new Color(34,43,49));
        screens_sm_pnl.setVisible(true);
        screens_lb.setForeground(new Color(4,95,202));
    }//GEN-LAST:event_screens_pnlMouseClicked

    private void screens_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screens_lbMouseClicked
        dashboard_pnl.setBackground(new Color(25,28,31));
        dashboard_sm_pnl.setVisible(false);
        dashboard_lb.setForeground(Color.WHITE);
        
        add_movie_pnl.setBackground(new Color(25,28,31));
        add_movie_sm_pnl.setVisible(false);
        add_movie_lb.setForeground(Color.WHITE);
        
        screens_pnl.setBackground(new Color(34,43,49));
        screens_sm_pnl.setVisible(true);
        screens_lb.setForeground(new Color(4,95,202));
    }//GEN-LAST:event_screens_lbMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_movie_ico;
    private javax.swing.JLabel add_movie_lb;
    private javax.swing.JPanel add_movie_pnl;
    private javax.swing.JPanel add_movie_sm_pnl;
    private javax.swing.JLabel dashboard_ico;
    private javax.swing.JLabel dashboard_lb;
    private javax.swing.JPanel dashboard_pnl;
    private javax.swing.JPanel dashboard_sm_pnl;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logout_ico;
    private javax.swing.JPanel logout_pnl;
    private javax.swing.JLabel screens_ico;
    private javax.swing.JLabel screens_lb;
    private javax.swing.JPanel screens_pnl;
    private javax.swing.JPanel screens_sm_pnl;
    // End of variables declaration//GEN-END:variables
}
