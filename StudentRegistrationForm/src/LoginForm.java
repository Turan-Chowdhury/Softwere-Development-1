
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public LoginForm() {
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
        btnLogin = new javax.swing.JButton();
        lblRegister = new javax.swing.JLabel();

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
        jLabel2.setText("Login Form");

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

        btnLogin.setBackground(new java.awt.Color(36, 167, 240));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("click here to create a new account");
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passPass)
                            .addComponent(txtUN)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegister)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCancel)
                                .addGap(18, 18, 18)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passPass))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblRegister)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMin)
                .addGap(18, 18, 18)
                .addComponent(lblClose)
                .addGap(21, 21, 21))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClose)
                    .addComponent(lblMin)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        RegisterForm ob = new RegisterForm();
        ob.setVisible(true);
        ob.pack();
        ob.setLocationRelativeTo(null);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            String query = "SELECT * FROM `student` WHERE `user_name` =? AND `password` =?";            
            ps = conn.prepareStatement(query);
            
            ps.setString(1,txtUN.getText());
            ps.setString(2,passPass.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                setVisible(false);
                Home ob = new Home();
                ob.setVisible(true);
                ob.pack();
                ob.setLocationRelativeTo(null);
                ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ob.lblWelcomeMsg.setText("Welcome < "+txtUN.getText()+" >");
                ob.lblFN.setText(rs.getString("first_name"));
                ob.lblLN.setText(rs.getString("last_name"));
                ob.lblUN.setText(rs.getString("user_name"));
                ob.lblPass.setText(rs.getString("password"));
                ob.lblBdate.setText(rs.getString("birthdate"));
                ob.lblAddress.setText(rs.getString("address"));
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", JOptionPane.WARNING_MESSAGE);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPasswordField passPass;
    private javax.swing.JTextField txtUN;
    // End of variables declaration//GEN-END:variables
}
