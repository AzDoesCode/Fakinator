package game;

import javax.swing.SpinnerNumberModel;

public class FormGame extends javax.swing.JFrame {

    int numMax=0, numMin=0, numGuess=0, numCorrect=0;
    boolean useTemp=false, useProx=false;
    public FormGame() {
        initComponents();
        lblTextBox.setText("<html>Welcome to Fakinator!<br>The best Guessing Game!<br>Pick your settings and begin.</html>");
        lblTxt4.setVisible(false);
        spinGuess.setVisible(false);
        btnGuess.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGenie = new javax.swing.JLabel();
        lblTextBox = new javax.swing.JLabel();
        lblSpeechBubble = new javax.swing.JLabel();
        lblTxt1 = new javax.swing.JLabel();
        lblTxt2 = new javax.swing.JLabel();
        lblTxt3 = new javax.swing.JLabel();
        lblTxt4 = new javax.swing.JLabel();
        spinRanMax = new javax.swing.JSpinner();
        spinRanMin = new javax.swing.JSpinner();
        spinNumGuess = new javax.swing.JSpinner();
        btnGuess = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        checkProx = new javax.swing.JCheckBox();
        checkTemp = new javax.swing.JCheckBox();
        spinGuess = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fakinator");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(525, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGenie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/genie.png"))); // NOI18N
        getContentPane().add(lblGenie, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        lblTextBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTextBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 180, 110));

        lblSpeechBubble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/speechBubble.png"))); // NOI18N
        getContentPane().add(lblSpeechBubble, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lblTxt1.setBackground(new java.awt.Color(255, 255, 255));
        lblTxt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTxt1.setText("Maximum Number");
        lblTxt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTxt1.setOpaque(true);
        getContentPane().add(lblTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 263, 150, 30));

        lblTxt2.setBackground(new java.awt.Color(255, 255, 255));
        lblTxt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTxt2.setText("Minimum Number");
        lblTxt2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTxt2.setOpaque(true);
        getContentPane().add(lblTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 312, 150, 30));

        lblTxt3.setBackground(new java.awt.Color(255, 255, 255));
        lblTxt3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTxt3.setText("Number of Guesses");
        lblTxt3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTxt3.setOpaque(true);
        getContentPane().add(lblTxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 358, 150, 30));

        lblTxt4.setBackground(new java.awt.Color(255, 255, 255));
        lblTxt4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTxt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTxt4.setText("Value");
        lblTxt4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTxt4.setOpaque(true);
        getContentPane().add(lblTxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 60, 30));

        spinRanMax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spinRanMax.setModel(new javax.swing.SpinnerNumberModel(10, -99, 100, 1));
        getContentPane().add(spinRanMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 75, 32));

        spinRanMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spinRanMin.setModel(new javax.swing.SpinnerNumberModel(0, -100, 99, 1));
        getContentPane().add(spinRanMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 75, 30));

        spinNumGuess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spinNumGuess.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(spinNumGuess, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 75, 30));

        btnGuess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuess.setText("Guess");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuess, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 90, 30));

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnStart.setText("Start Game");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, 30));

        checkProx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkProx.setText("Proximity Mode");
        getContentPane().add(checkProx, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        checkTemp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkTemp.setText("Temperature Mode");
        checkTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTempActionPerformed(evt);
            }
        });
        getContentPane().add(checkTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        spinGuess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spinGuess.setModel(new javax.swing.SpinnerNumberModel(0, -100, 99, 1));
        getContentPane().add(spinGuess, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 75, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        numMax = (int)spinRanMax.getValue();
        numMin = (int)spinRanMin.getValue();
        numGuess = (int)spinNumGuess.getValue();
        useTemp = (boolean)checkTemp.isSelected();
        useProx = (boolean)checkProx.isSelected();
        
        double ran=Math.random();
        numCorrect=(int)(numMin+(ran*(numMax+1)));
        
        if(numMax>numMin){
            lblTxt1.setVisible(false);
            lblTxt2.setVisible(false);
            lblTxt3.setVisible(false);
            spinRanMax.setVisible(false);
            spinRanMin.setVisible(false);
            spinNumGuess.setVisible(false);
            checkTemp.setVisible(false);
            checkProx.setVisible(false);
            btnStart.setVisible(false);
            
            lblTxt4.setVisible(true);
            spinGuess.setVisible(true);
            btnGuess.setVisible(true);
            SpinnerNumberModel guessModel = new SpinnerNumberModel(numMin, numMin, numMax, 1);
            spinGuess.setModel(guessModel);
            String guessAmount=Integer.toString(numGuess);
            if(numGuess==0){
                guessAmount="∞";
                numGuess=-1;
            }
            lblTextBox.setText("<html>I thought of a number<br>between "+numMin+" and "+numMax+".<br>You've got "+guessAmount+" guesses to get it right!</html>");
        }
        else{
            lblTextBox.setText("<html>Invalid settings...<br> The Maximum number must be greater than the Minimum.<br>Please pick settings that comply with the rules.</html>");
        }
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
        int ranGuess=(int)spinGuess.getValue();
        int ranCold=((numMax-numMin)/3), ranMild=((numMax-numMin)/6), ranHot=((numMax-numMin)/9);
        String ranTemp, ranProx;
        
        if(numCorrect==ranGuess){
            lblTxt1.setVisible(true);
            lblTxt2.setVisible(true);
            lblTxt3.setVisible(true);
            spinRanMax.setVisible(true);
            spinRanMin.setVisible(true);
            spinNumGuess.setVisible(true);
            checkTemp.setVisible(true);
            checkProx.setVisible(true);
            btnStart.setVisible(true);
            lblTextBox.setText("<html><strong>YOU WIN!</strong><br>Wanna try again?</html>");
            
            lblTxt4.setVisible(false);
            spinGuess.setVisible(false);
            btnGuess.setVisible(false);
        }
        else{
            if((ranGuess>(numCorrect-ranHot))&&(ranGuess<(numCorrect+ranHot))) ranTemp="Burning Hot!";
            else if((ranGuess>(numCorrect-ranMild))&&(ranGuess<(numCorrect+ranMild))) ranTemp="Toasty.";
            else if((ranGuess>(numCorrect-ranCold))&&(ranGuess<(numCorrect+ranCold))) ranTemp="Cold.";
            else ranTemp="Freezing Cold!";
            ranProx=numCorrect>ranGuess?"greater":"smaller";
            
            if(numGuess>1){
                numGuess--;
                if((useTemp==true)&&(useProx==true)){
                    lblTextBox.setText("<html>Wrong.<br>Your guess is <strong>"+ranTemp+"</strong><br>The number is <strong>"+ranProx+"</strong> than your guess.<br>You've got <strong>"+numGuess+"</strong> more guesses.</html>");
                }
                else if(useTemp==true){
                    lblTextBox.setText("<html>Wrong.<br>Your guess is <strong>"+ranTemp+"</strong><br>You've got <strong>"+numGuess+"</strong> more guesses.</html>");
                }
                else if(useProx==true){
                    lblTextBox.setText("<html>Wrong.<br>The number is <strong>"+ranProx+"</strong> than your guess.<br>You've got <strong>"+numGuess+"</strong> more guesses.</html>");
                }
                else{
                    lblTextBox.setText("<html>Wrong.<br>You've got <strong>"+numGuess+"</strong> more guesses.</html>");
                }
            }
            else if(numGuess==-1){
                if((useTemp==true)&&(useProx==true)){
                    lblTextBox.setText("<html>Wrong.<br>Your guess is <strong>"+ranTemp+"</strong><br>The number is <strong>"+ranProx+"</strong> than your guess.<br>Try again.</html>");
                }
                else if(useTemp==true){
                    lblTextBox.setText("<html>Wrong.<br>Your guess is <strong>"+ranTemp+"</strong><br>Try again.</html>");
                }
                else if(useProx==true){
                    lblTextBox.setText("<html>Wrong.<br>The number is <strong>"+ranProx+"</strong> than your guess.<br>Try again.</html>");
                }
                else{
                    lblTextBox.setText("<html>Wrong.<br>Try again.</html>");
                }
            }
            else if(numGuess==1){
                lblTxt1.setVisible(true);
                lblTxt2.setVisible(true);
                lblTxt3.setVisible(true);
                spinRanMax.setVisible(true);
                spinRanMin.setVisible(true);
                spinNumGuess.setVisible(true);
                checkTemp.setVisible(true);
                checkProx.setVisible(true);
                btnStart.setVisible(true);
                lblTextBox.setText("<html>You lost...<br>Wanna try again?</html>");
            
                lblTxt4.setVisible(false);
                spinGuess.setVisible(false);
                btnGuess.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnGuessActionPerformed

    private void checkTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTempActionPerformed

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
            java.util.logging.Logger.getLogger(FormGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuess;
    private javax.swing.JButton btnStart;
    private javax.swing.JCheckBox checkProx;
    private javax.swing.JCheckBox checkTemp;
    private javax.swing.JLabel lblGenie;
    private javax.swing.JLabel lblSpeechBubble;
    private javax.swing.JLabel lblTextBox;
    private javax.swing.JLabel lblTxt1;
    private javax.swing.JLabel lblTxt2;
    private javax.swing.JLabel lblTxt3;
    private javax.swing.JLabel lblTxt4;
    private javax.swing.JSpinner spinGuess;
    private javax.swing.JSpinner spinNumGuess;
    private javax.swing.JSpinner spinRanMax;
    private javax.swing.JSpinner spinRanMin;
    // End of variables declaration//GEN-END:variables
}
