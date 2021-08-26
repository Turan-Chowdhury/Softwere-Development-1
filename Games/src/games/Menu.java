
package games;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    
    
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuessingGame = new javax.swing.JButton();
        btnRockPaperScissors = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnTicTacToe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME!!!");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Choose A Game");

        btnGuessingGame.setBackground(new java.awt.Color(0, 0, 0));
        btnGuessingGame.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGuessingGame.setForeground(new java.awt.Color(102, 255, 0));
        btnGuessingGame.setText("1. Guessing Game");
        btnGuessingGame.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuessingGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessingGameActionPerformed(evt);
            }
        });

        btnRockPaperScissors.setBackground(new java.awt.Color(0, 0, 0));
        btnRockPaperScissors.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRockPaperScissors.setForeground(new java.awt.Color(255, 0, 204));
        btnRockPaperScissors.setText("3. Rock Paper Scissors");
        btnRockPaperScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockPaperScissorsActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnTicTacToe.setBackground(new java.awt.Color(0, 0, 0));
        btnTicTacToe.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTicTacToe.setForeground(new java.awt.Color(255, 204, 0));
        btnTicTacToe.setText("2. Tic Tac Toe");
        btnTicTacToe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTicTacToe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicTacToeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 182, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRockPaperScissors, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnGuessingGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addComponent(btnTicTacToe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(180, 180, 180))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(btnGuessingGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTicTacToe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRockPaperScissors)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Confirm if you want to exit.", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnGuessingGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessingGameActionPerformed
        new GuessingGame().setVisible(true);
    }//GEN-LAST:event_btnGuessingGameActionPerformed

    private void btnRockPaperScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockPaperScissorsActionPerformed
        new RockPaperScissors().setVisible(true);
    }//GEN-LAST:event_btnRockPaperScissorsActionPerformed

    private void btnTicTacToeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicTacToeActionPerformed
        new TicTacToe().setVisible(true);
    }//GEN-LAST:event_btnTicTacToeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuessingGame;
    private javax.swing.JButton btnRockPaperScissors;
    private javax.swing.JButton btnTicTacToe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
