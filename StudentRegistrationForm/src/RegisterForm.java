
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        conn = MyConnection.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUN = new javax.swing.JTextField();
        passPass = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        btnResister = new javax.swing.JButton();
        lblRegister = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        passRepass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        txtBdate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaAddress = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        lblClose.setBackground(new java.awt.Color(255, 255, 255));
        lblClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Resister");

        lblMin.setBackground(new java.awt.Color(255, 255, 255));
        lblMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMin.setForeground(new java.awt.Color(255, 255, 255));
        lblMin.setText("-");
        lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(lblMin)
                .addGap(18, 18, 18)
                .addComponent(lblClose)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClose)
                    .addComponent(lblMin)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(48, 62, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Username: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Password: ");

        txtUN.setBackground(new java.awt.Color(108, 122, 137));
        txtUN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUN.setForeground(new java.awt.Color(228, 241, 254));

        passPass.setBackground(new java.awt.Color(108, 122, 137));
        passPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passPass.setForeground(new java.awt.Color(228, 241, 254));

        btnCancel.setBackground(new java.awt.Color(242, 38, 19));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnResister.setBackground(new java.awt.Color(36, 167, 240));
        btnResister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnResister.setForeground(new java.awt.Color(255, 255, 255));
        btnResister.setText("Register");
        btnResister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResisterActionPerformed(evt);
            }
        });

        lblRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("click here to login");
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("First Name:");

        txtFN.setBackground(new java.awt.Color(108, 122, 137));
        txtFN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFN.setForeground(new java.awt.Color(228, 241, 254));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Last Name:");

        txtLN.setBackground(new java.awt.Color(108, 122, 137));
        txtLN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLN.setForeground(new java.awt.Color(228, 241, 254));
        txtLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Retype Pass: ");

        passRepass.setBackground(new java.awt.Color(108, 122, 137));
        passRepass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passRepass.setForeground(new java.awt.Color(228, 241, 254));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("BirthDate:");

        txtBdate.setBackground(new java.awt.Color(108, 122, 137));
        txtBdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBdate.setForeground(new java.awt.Color(228, 241, 254));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 240, 241));
        jLabel12.setText("Address:");

        txtaAddress.setBackground(new java.awt.Color(108, 122, 137));
        txtaAddress.setColumns(20);
        txtaAddress.setForeground(new java.awt.Color(228, 241, 254));
        txtaAddress.setRows(5);
        jScrollPane1.setViewportView(txtaAddress);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnResister))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passPass, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passRepass, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBdate, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(lblRegister)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passPass))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passRepass))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtBdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResister, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblRegister)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 532, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinMouseClicked

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        LoginForm ob = new LoginForm();
        ob.setVisible(true);
        ob.pack();
        ob.setLocationRelativeTo(null);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void txtLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNActionPerformed

    private void btnResisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResisterActionPerformed
        
        if(txtUN.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Username");
        }
        else if(passPass.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Password");
        }
        else if(!passPass.getText().equals(passRepass.getText()))
        {
            JOptionPane.showMessageDialog(null, "Retype The Password Again");
        }  
        else if(checkUsernameAndPassword())
        {
            JOptionPane.showMessageDialog(null, "This Username And Password Already Exist. Please Change Your Password.");
        }
        else
        {
            try {    
                
            String query = "INSERT INTO `student`(`first_name`, `last_name`, `user_name`, `password`, `birthdate`, `address`) VALUES (?,?,?,?,?,?)";
            ps = conn.prepareStatement(query);

            ps.setString(1,txtFN.getText());
            ps.setString(2,txtLN.getText());
            ps.setString(3,txtUN.getText());
            ps.setString(4,passPass.getText());
            ps.setString(5,txtBdate.getText());
            ps.setString(6,txtaAddress.getText());
            
            if(ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New User Add");
            }
            
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_btnResisterActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    public boolean checkUsernameAndPassword()
    {
        boolean ceck_result = false;
        
        try {
            String query = "SELECT * FROM `student` WHERE `user_name` =? AND `password` =?";            
            ps = conn.prepareStatement(query);
            
            ps.setString(1,txtUN.getText());
            ps.setString(2,passPass.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                ceck_result = true;
            }
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return ceck_result;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new RegisterForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnResister;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPasswordField passPass;
    private javax.swing.JPasswordField passRepass;
    private javax.swing.JTextField txtBdate;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtLN;
    private javax.swing.JTextField txtUN;
    private javax.swing.JTextArea txtaAddress;
    // End of variables declaration//GEN-END:variables
}
