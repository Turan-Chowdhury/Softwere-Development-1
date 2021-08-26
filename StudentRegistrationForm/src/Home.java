
import javax.swing.JFrame;


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblClose2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblMin2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        lblWelcomeMsg = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblFN = new javax.swing.JLabel();
        lblUN = new javax.swing.JLabel();
        lblLN = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblBdate = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(248, 148, 6));

        lblClose2.setBackground(new java.awt.Color(255, 255, 255));
        lblClose2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblClose2.setForeground(new java.awt.Color(255, 255, 255));
        lblClose2.setText("X");
        lblClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose2MouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Home");

        lblMin2.setBackground(new java.awt.Color(255, 255, 255));
        lblMin2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMin2.setForeground(new java.awt.Color(255, 255, 255));
        lblMin2.setText("-");
        lblMin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMin2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(lblMin2)
                .addGap(18, 18, 18)
                .addComponent(lblClose2)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClose2)
                            .addComponent(lblMin2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(48, 62, 80));

        btnBack.setBackground(new java.awt.Color(36, 167, 240));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Your Details :");

        lblWelcomeMsg.setBackground(new java.awt.Color(255, 255, 255));
        lblWelcomeMsg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblWelcomeMsg.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Last Name :");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("First Name :");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("User Name :");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Password :");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Birthdate :");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("address :");

        lblFN.setBackground(new java.awt.Color(255, 255, 255));
        lblFN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFN.setForeground(new java.awt.Color(204, 204, 204));

        lblUN.setBackground(new java.awt.Color(255, 255, 255));
        lblUN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUN.setForeground(new java.awt.Color(204, 204, 204));

        lblLN.setBackground(new java.awt.Color(255, 255, 255));
        lblLN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLN.setForeground(new java.awt.Color(204, 204, 204));

        lblPass.setBackground(new java.awt.Color(255, 255, 255));
        lblPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPass.setForeground(new java.awt.Color(204, 204, 204));

        lblBdate.setBackground(new java.awt.Color(255, 255, 255));
        lblBdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBdate.setForeground(new java.awt.Color(204, 204, 204));

        lblAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblWelcomeMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lblWelcomeMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblUN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblLN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBdate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(btnBack)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblClose2MouseClicked

    private void lblMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMin2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMin2MouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false);
        LoginForm ob = new LoginForm();
        ob.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel lblAddress;
    public javax.swing.JLabel lblBdate;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JLabel lblClose2;
    public javax.swing.JLabel lblFN;
    public javax.swing.JLabel lblLN;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblMin1;
    private javax.swing.JLabel lblMin2;
    public javax.swing.JLabel lblPass;
    public javax.swing.JLabel lblUN;
    public javax.swing.JLabel lblWelcomeMsg;
    // End of variables declaration//GEN-END:variables
}
