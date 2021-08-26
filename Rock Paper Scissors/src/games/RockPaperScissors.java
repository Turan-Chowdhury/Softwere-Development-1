
package games;

public class RockPaperScissors extends javax.swing.JFrame {
    
    int human_choice;
    int computer_choice;
    int human_score = 0;
    int computer_score = 0;
    int draw = 0;

    public RockPaperScissors() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRock = new javax.swing.JButton();
        btnPaper = new javax.swing.JButton();
        btnScissors = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblComputerChoice = new javax.swing.JLabel();
        lblWin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblHumanScore = new javax.swing.JLabel();
        lblComputerScore = new javax.swing.JLabel();
        lblDraw = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rock Paper Scissors");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("ROCK  PAPER SCISSORS");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        btnRock.setBackground(new java.awt.Color(153, 153, 153));
        btnRock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRock.setText("Rock");
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });

        btnPaper.setBackground(new java.awt.Color(255, 255, 255));
        btnPaper.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPaper.setText("Paper");
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });

        btnScissors.setBackground(new java.awt.Color(255, 255, 204));
        btnScissors.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnScissors.setText("Scissors");
        btnScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Computer Choice is :");

        lblComputerChoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblWin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblWin.setForeground(new java.awt.Color(204, 0, 0));
        lblWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("User Wins");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Computer Wins");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Draw");

        lblHumanScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHumanScore.setForeground(new java.awt.Color(153, 0, 0));
        lblHumanScore.setText("0");

        lblComputerScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblComputerScore.setForeground(new java.awt.Color(153, 0, 0));
        lblComputerScore.setText("0");

        lblDraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDraw.setForeground(new java.awt.Color(153, 0, 0));
        lblDraw.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel5)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(lblHumanScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblComputerScore)
                        .addGap(83, 83, 83)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblDraw))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHumanScore)
                    .addComponent(lblComputerScore)
                    .addComponent(lblDraw))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblWin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(btnRock, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnScissors, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(lblComputerChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRock)
                    .addComponent(btnPaper)
                    .addComponent(btnScissors))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblComputerChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblWin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReset)))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        human_choice = 0;
        ComputerChoice();
        CheckWinner();
    }//GEN-LAST:event_btnRockActionPerformed

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperActionPerformed
        human_choice = 1;
        ComputerChoice();
        CheckWinner();
    }//GEN-LAST:event_btnPaperActionPerformed

    private void btnScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScissorsActionPerformed
        human_choice = 2;
        ComputerChoice();
        CheckWinner();
    }//GEN-LAST:event_btnScissorsActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        human_score = 0;
        int computer_score = 0;
        int draw = 0;
        
        lblComputerChoice.setText("");
        lblWin.setText("");
        lblDraw.setText("0");
        lblHumanScore.setText("0");
        lblComputerScore.setText("0");   
    }//GEN-LAST:event_btnResetActionPerformed

    public void ComputerChoice()
    {
        computer_choice = (int)(Math.random()*3);
        
        switch(computer_choice)
        {
            case 0: lblComputerChoice.setText("Rock");
                    break;
            case 1: lblComputerChoice.setText("Paper");
                    break;
            case 2: lblComputerChoice.setText("Scissors");
                    break;
        }
    }
    
    public void CheckWinner()
    {
        if(human_choice == computer_choice)
        {
            lblWin.setText("Draw!!!");
            draw++;
            lblDraw.setText(Integer.toString(draw));
        }
        else if((human_choice==0 && computer_choice==1)
        {
            lblWin.setText("Computer Win!!!");
            computer_score++;
            lblComputerScore.setText(Integer.toString(computer_score));
        }
        else if((human_choice==0 && computer_choice==2)
        {
            lblWin.setText("You Win!!!");
            human_score++;
            lblHumanScore.setText(Integer.toString(human_score));
        }
        else if((human_choice==1 && computer_choice==0)
        {
            lblWin.setText("You Win!!!");
            human_score++;
            lblHumanScore.setText(Integer.toString(human_score));
        }
        else if((human_choice==1 && computer_choice==2)
        {
            lblWin.setText("Computer Win!!!");
            computer_score++;
            lblComputerScore.setText(Integer.toString(computer_score));
        }
        else if((human_choice==2 && computer_choice==0)
        {
            lblWin.setText("Computer Win!!!");
            computer_score++;
            lblComputerScore.setText(Integer.toString(computer_score));
        }
        else if((human_choice==2 && computer_choice==1)
        {
            lblWin.setText("You Win!!!");
            human_score++;
            lblHumanScore.setText(Integer.toString(human_score));
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new RockPaperScissors().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnScissors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblComputerChoice;
    private javax.swing.JLabel lblComputerScore;
    private javax.swing.JLabel lblDraw;
    private javax.swing.JLabel lblHumanScore;
    private javax.swing.JLabel lblWin;
    // End of variables declaration//GEN-END:variables
}
