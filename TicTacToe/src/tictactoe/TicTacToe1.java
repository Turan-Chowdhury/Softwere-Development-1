
package tictactoe;

import java.awt.Color;
import javax.swing.JOptionPane;

public class TicTacToe1 extends javax.swing.JFrame {
    
    String value = "X";
    int score_x = 0;
    int score_o = 0;
    boolean reset = false;

    public TicTacToe1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblScoreX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblScoreO = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new java.awt.GridLayout(3, 3, 2, 2));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(java.awt.Color.lightGray);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(java.awt.Color.lightGray);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton3.setBackground(java.awt.Color.lightGray);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton4.setBackground(java.awt.Color.lightGray);
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(java.awt.Color.lightGray);
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(java.awt.Color.lightGray);
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(java.awt.Color.lightGray);
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton8.setBackground(java.awt.Color.lightGray);
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton9.setBackground(java.awt.Color.lightGray);
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel12);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player X :");

        lblScoreX.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        lblScoreX.setForeground(new java.awt.Color(204, 0, 0));
        lblScoreX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblScoreX.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel4.setForeground(java.awt.Color.green);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player O :");

        lblScoreO.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        lblScoreO.setForeground(new java.awt.Color(204, 0, 0));
        lblScoreO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblScoreO.setText("0");

        btnReset.setBackground(java.awt.Color.lightGray);
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jButton10.setBackground(java.awt.Color.lightGray);
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Restart");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblScoreX, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(lblScoreO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(lblScoreX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScoreO, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(reset)
            JOptionPane.showMessageDialog(this, "Please, reset first.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
        else
        {  
            if(jButton1.getText()!= "")
                JOptionPane.showMessageDialog(this, "Sorry, this is already used.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);           
            else
            {
                jButton1.setText(value);
        
                if(value.equals("X"))
                    jButton1.setForeground(Color.BLUE);
                else
                    jButton1.setForeground(Color.GREEN);

                ChooseAPlayer();
                WinningGame();
                Reset();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        if(reset)
            JOptionPane.showMessageDialog(this, "Please, reset first.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
        else
        {
            if(jButton2.getText()!= "")
                JOptionPane.showMessageDialog(this, "Sorry, this is already used.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);           
            else
            {
                jButton2.setText(value);
        
                if(value.equals("X"))
                    jButton2.setForeground(Color.BLUE);
                else
                    jButton2.setForeground(Color.GREEN);

                ChooseAPlayer();
                WinningGame();
                Reset();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        if(reset)
            JOptionPane.showMessageDialog(this, "Please, reset first.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
        else
        {
            if(jButton3.getText()!= "")
                JOptionPane.showMessageDialog(this, "Sorry, this is already used.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);           
            else
            {
                jButton3.setText(value);
        
                if(value.equals("X"))
                    jButton3.setForeground(Color.BLUE);
                else
                    jButton3.setForeground(Color.GREEN);

                ChooseAPlayer();
                WinningGame();
                Reset();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         
        if(reset)
            JOptionPane.showMessageDialog(this, "Please, reset first.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
        else
        {
            if(jButton4.getText()!= "")
                JOptionPane.showMessageDialog(this, "Sorry, this is already used.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);           
            else
            {
                jButton4.setText(value);
        
                if(value.equals("X"))
                    jButton4.setForeground(Color.BLUE);
                else
                    jButton4.setForeground(Color.GREEN);

                ChooseAPlayer();
                WinningGame();
                Reset();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         
        if(reset)
            JOptionPane.showMessageDialog(this, "Please, reset first.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
        else
        {
            if(jButton5.getText()!= "")
                JOptionPane.showMessageDialog(this, "Sorry, this is already used.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);           
            else
            {
                jButton5.setText(value);
        
                if(value.equals("X"))
                    jButton5.setForeground(Color.BLUE);
                else
                    jButton5.setForeground(Color.GREEN);

                ChooseAPlayer();
                WinningGame();
                Reset();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        if(reset)
            JOptionPane.showMessageDialog(this, "Please, reset first.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
        else
        {
            if(jButton6.getText()!= "")
                JOptionPane.showMessageDialog(this, "Sorry, this is already used.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);           
            else
            {
                jButton6.setText(value);
        
                if(value.equals("X"))
                    jButton6.setForeground(Color.BLUE);
                else
                    jButton6.setForeground(Color.GREEN);

                ChooseAPlayer();
                WinningGame();
                Reset();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         
        if(reset)
            JOptionPane.showMessageDialog(this, "Please, reset first.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
        else
        {
            if(jButton7.getText()!= "")
                JOptionPane.showMessageDialog(this, "Sorry, this is already used.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);           
            else
            {
                jButton7.setText(value);
        
                if(value.equals("X"))
                    jButton7.setForeground(Color.BLUE);
                else
                    jButton7.setForeground(Color.GREEN);

                ChooseAPlayer();
                WinningGame();
                Reset();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         
        if(reset)
            JOptionPane.showMessageDialog(this, "Please, reset first.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
        else
        {
            if(jButton8.getText()!= "")
                JOptionPane.showMessageDialog(this, "Sorry, this is already used.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);           
            else
            {
                jButton8.setText(value);
        
                if(value.equals("X"))
                    jButton8.setForeground(Color.BLUE);
                else
                    jButton8.setForeground(Color.GREEN);

                ChooseAPlayer();
                WinningGame();
                Reset();
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         
        if(reset)
            JOptionPane.showMessageDialog(this, "Please, reset first.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
        else
        {
            if(jButton9.getText()!= "")
                JOptionPane.showMessageDialog(this, "Sorry, this is already used.", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);           
            else
            {
                jButton9.setText(value);
        
                if(value.equals("X"))
                    jButton9.setForeground(Color.BLUE);
                else
                    jButton9.setForeground(Color.GREEN);

                ChooseAPlayer();
                WinningGame();
                Reset();
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
     
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
        btnReset.setBackground(Color.lightGray);
        
        value = "X";
        
        reset = false;
    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
        value = "X";
        
        score_x = 0;
        score_o = 0;
        
        lblScoreX.setText("0");
        lblScoreO.setText("0");
        
        reset = false;
    }//GEN-LAST:event_jButton10ActionPerformed
    
    public void GameScore()
    {
        lblScoreX.setText(Integer.toString(score_x));
        lblScoreO.setText(Integer.toString(score_o));
    }
    
    public void ChooseAPlayer()
    {
        if(value.equals("X"))
            value = "O";
        else
            value = "X";
    }
    
    public void WinningGame()
    {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        if(b1.equals("X") && b2.equals("X") && b3.equals("X"))
        {          
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
            
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_x++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b1.equals("O") && b2.equals("O") && b3.equals("O"))
        {          
            jButton1.setBackground(Color.MAGENTA);
            jButton2.setBackground(Color.MAGENTA);
            jButton3.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_o++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b4.equals("X") && b5.equals("X") && b6.equals("X"))
        {
            jButton4.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_x++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b4.equals("O") && b5.equals("O") && b6.equals("O"))
        {
            jButton4.setBackground(Color.MAGENTA);
            jButton5.setBackground(Color.MAGENTA);
            jButton6.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_o++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b7.equals("X") && b8.equals("X") && b9.equals("X"))
        {
            jButton7.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_x++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b7.equals("O") && b8.equals("O") && b9.equals("O"))
        {
            jButton7.setBackground(Color.MAGENTA);
            jButton8.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_o++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b1.equals("X") && b4.equals("X") && b7.equals("X"))
        {
            jButton1.setBackground(Color.YELLOW);
            jButton4.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_x++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b1.equals("O") && b4.equals("O") && b7.equals("O"))
        {
            jButton1.setBackground(Color.MAGENTA);
            jButton4.setBackground(Color.MAGENTA);
            jButton7.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_o++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b2.equals("X") && b5.equals("X") && b8.equals("X"))
        {
            jButton2.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_x++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b2.equals("O") && b5.equals("O") && b8.equals("O"))
        {
            jButton2.setBackground(Color.MAGENTA);
            jButton5.setBackground(Color.MAGENTA);
            jButton8.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_o++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b3.equals("X") && b6.equals("X") && b9.equals("X"))
        {
            jButton3.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_x++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b3.equals("O") && b6.equals("O") && b9.equals("O"))
        {
            jButton3.setBackground(Color.MAGENTA);
            jButton6.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_o++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b1.equals("X") && b5.equals("X") && b9.equals("X"))
        {
            jButton1.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton9.setBackground(Color.YELLOW);
            
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_x++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b1.equals("O") && b5.equals("O") && b9.equals("O"))
        {
            jButton1.setBackground(Color.MAGENTA);
            jButton5.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_o++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b3.equals("X") && b5.equals("X") && b7.equals("X"))
        {
            jButton3.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            
            JOptionPane.showMessageDialog(this, "Player X wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_x++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
        else if(b3.equals("O") && b5.equals("O") && b7.equals("O"))
        {
            jButton3.setBackground(Color.MAGENTA);
            jButton5.setBackground(Color.MAGENTA);
            jButton7.setBackground(Color.MAGENTA);
            
            JOptionPane.showMessageDialog(this, "Player O wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            score_o++;
            GameScore();
            
            reset = true;
            btnReset.setBackground(Color.RED);
        }
    }
    
    public void Reset()
    {
        if(!jButton1.getText().isEmpty() && !jButton2.getText().isEmpty() && !jButton3.getText().isEmpty() &&
           !jButton4.getText().isEmpty() && !jButton5.getText().isEmpty() && !jButton6.getText().isEmpty() &&
           !jButton7.getText().isEmpty() && !jButton8.getText().isEmpty() && !jButton9.getText().isEmpty())
        {
            btnReset.setBackground(Color.RED);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TicTacToe1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblScoreO;
    private javax.swing.JLabel lblScoreX;
    // End of variables declaration//GEN-END:variables
}
