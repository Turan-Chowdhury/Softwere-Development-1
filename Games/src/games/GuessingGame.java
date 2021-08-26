
package games;

import java.awt.Color;
import javax.swing.JOptionPane;

public class GuessingGame extends javax.swing.JFrame {
    
    int random_num = (int)(Math.random()*100 + 1);
    int user_ans;
    int total_guesses = 0;

    public GuessingGame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUserAns = new javax.swing.JTextField();
        btnGuess = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblTotalGuesses = new javax.swing.JLabel();
        btnRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Guessing Game");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GUESSING GAME");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Enter a guess between 1 and 100");

        txtUserAns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUserAns.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnGuess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuess.setText("Guess");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });

        lblResult.setBackground(new java.awt.Color(255, 255, 255));
        lblResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResult.setForeground(new java.awt.Color(204, 0, 0));
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText(" Total Guesses :");

        lblTotalGuesses.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalGuesses.setForeground(new java.awt.Color(153, 0, 0));
        lblTotalGuesses.setText("0");

        btnRestart.setBackground(new java.awt.Color(0, 0, 0));
        btnRestart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRestart.setForeground(new java.awt.Color(255, 255, 255));
        btnRestart.setText("Restart");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalGuesses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRestart)
                .addGap(61, 61, 61))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTotalGuesses))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(btnRestart)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtUserAns, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(171, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
       
        try{
            user_ans = Integer.parseInt(txtUserAns.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Put An Integer","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        Check();
    }//GEN-LAST:event_btnGuessActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        random_num = (int)(Math.random()*100 + 1);
        
        txtUserAns.setEnabled(true);
        btnGuess.setEnabled(true);
        btnRestart.setBackground(Color.BLACK);
        
        txtUserAns.setText(null);
        lblResult.setText(null);
        lblTotalGuesses.setText("0");
        
        total_guesses = 0;
    }//GEN-LAST:event_btnRestartActionPerformed
    
    public void Check()
    {
        if(user_ans<=0 || user_ans>100)
        {
            lblResult.setText("Invalid!");
        }
        else if(user_ans < random_num)
        {
            lblResult.setText("Too Low, try agian.");
            total_guesses++;
            lblTotalGuesses.setText(Integer.toString(total_guesses));
        }
        else if(user_ans > random_num)
        {
            lblResult.setText("Too High, try agian.");
            total_guesses++;
            lblTotalGuesses.setText(Integer.toString(total_guesses));
        }
        else if(user_ans == random_num)
        {
            lblResult.setText("Correct!");
            total_guesses++;
            lblTotalGuesses.setText(Integer.toString(total_guesses));
            txtUserAns.setEnabled(false);
            btnGuess.setEnabled(false);
            btnRestart.setBackground(Color.RED);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new GuessingGame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuess;
    private javax.swing.JButton btnRestart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTotalGuesses;
    private javax.swing.JTextField txtUserAns;
    // End of variables declaration//GEN-END:variables
}
