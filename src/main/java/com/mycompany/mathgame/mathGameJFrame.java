package com.mycompany.mathgame;

    import org.apache.commons.lang3.math.NumberUtils;
    import java.awt.Color; 
    import java.awt.event.KeyEvent;
    //import java.util.Timer;

public class mathGameJFrame extends javax.swing.JFrame  {

    int answer, numCorrect=0, Answered=0, divr=0, subr=0,addr=0,mulr=0;
    //int Operator,num1,num2;
    
    String guessRaw="go";//Variable used to exit Loops
    String quitRaw="go"; //Variable used to exit Loops
    
    ProblemType Operand = new ProblemType();
    //Timer timer = new Timer();
    
   
    public mathGameJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Submit = new javax.swing.JButton();
        answerTextField = new javax.swing.JTextField();
        displayProblem = new javax.swing.JLabel();
        displayProblemNumber = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        Incorrect = new javax.swing.JLabel();
        Correct = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Stats_Score = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(348, 348));
        setResizable(false);

        Submit.setFont(new java.awt.Font("Ravie", 0, 10)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        Submit.setVisible(false);

        answerTextField.setForeground(new java.awt.Color(153, 153, 153));
        answerTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerTextField.setText("Answer Here");
        answerTextField.setAutoscrolls(false);
        answerTextField.setVisible(false);
        answerTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                answerTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                answerTextFieldFocusLost(evt);
            }
        });
        answerTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answerTextFieldKeyPressed(evt);
            }
        });

        displayProblem.setFont(new java.awt.Font("Sitka Banner", 0, 24)); // NOI18N
        displayProblem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayProblem.setText("Problem");
        displayProblem.setVisible(false);

        displayProblemNumber.setFont(new java.awt.Font("Ravie", 0, 10)); // NOI18N
        displayProblemNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayProblemNumber.setText("Display Problem");
        displayProblemNumber.setVisible(false);

        Start.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        Start.setText("Start");
        Start.setName(""); // NOI18N
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        Incorrect.setFont(new java.awt.Font("Ravie", 0, 12)); // NOI18N
        Incorrect.setForeground(new java.awt.Color(255, 51, 51));
        Incorrect.setText("Incorrect!");
        Incorrect.setVisible(false);

        Correct.setFont(new java.awt.Font("Ravie", 0, 12)); // NOI18N
        Correct.setForeground(new java.awt.Color(0, 255, 51));
        Correct.setText("Correct!");
        Correct.setVisible(false);

        jMenu1.setText("File");

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        Stats_Score.setText("Stats/Score");
        Stats_Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stats_ScoreActionPerformed(evt);
            }
        });
        jMenu2.add(Stats_Score);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Correct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Incorrect)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(Start)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(displayProblemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(displayProblemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Incorrect)
                    .addComponent(Correct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getProblem1(){
                
        return (Operand.getProblem());
    }

    public void getProblemNumber1(){
        
        //answer = Operand.Select(Operator,num1,num2);//Selects a problem
        
        answer = Operand.workProblem();//Creates a problem returns answer
        
        displayProblemNumber.setText("Number " + Operand.getProblemNumber());//Displays problem number
        displayProblem.setText(Operand.getProblem());//Displays + gets problem
        
        Start.setVisible(false);
        Submit.setVisible(true);
        answerTextField.setVisible(true);
        displayProblem.setVisible(true);
        displayProblemNumber.setVisible(true);
        
    }

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        if (answerTextField.getText().equalsIgnoreCase("quit"))//If quit is entered, program quits
           {System.out.println("You ended the session\n");
            Answered+=0;
            switch (Operand.getOperator()) {
            case 1 -> Operand.setDivide();
            case 2 -> Operand.setMultiply();
            case 3 -> Operand.setAdd();
            case 4 -> Operand.setSubtract();
            default -> {
                    }//end Default Case
                }//ends switch Operator
            }//end if
        
        else if ((!(answerTextField.getText().equalsIgnoreCase("quit"))) && (!(NumberUtils.isParsable(answerTextField.getText())))){
            System.out.println("Invalid Response\n");        
            }//end else if
        
        else if (Integer.parseInt(answerTextField.getText())==answer)
            {System.out.println("Correct!\n");
            Correct.setVisible(true);
            Incorrect.setVisible(false);
            numCorrect++;
            Answered++;

            switch (Operand.getOperator()) {
                case 1 -> divr++;
                case 2 -> mulr++;
                case 3 -> addr++;
                case 4 -> subr++;
                default -> {
                        }//end default
                    }//end switch
                }//End of Operator if. Keeps up with num of correct

        else if (Integer.parseInt(answerTextField.getText())!=answer)
            {System.out.println("Incorrect. The Correct Answer is: "+answer +"\n");
            Incorrect.setVisible(true);
            Correct.setVisible(false);
            Answered++;
            
            }//end else if
        
        answerTextField.setText("");//Reset Text Box

        answer = Operand.workProblem();
        
        displayProblemNumber.setText("Number " + Operand.getProblemNumber());//Displays problem number
        displayProblem.setText(Operand.getProblem());//Displays + gets problem
    
// TODO add your handling code here:}
    }//GEN-LAST:event_SubmitActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed

        getProblemNumber1();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_StartActionPerformed

    private void answerTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerTextFieldFocusGained
        if (answerTextField.getText().equals("Answer Here"))
        {answerTextField.setText("");
        answerTextField.setForeground(new Color (153,153,156));
                }
    // This handles what happens when you click the box
    }//GEN-LAST:event_answerTextFieldFocusGained

    private void answerTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerTextFieldFocusLost
        if (answerTextField.getText().equals(""))
            {answerTextField.setText("Answer Here");
            answerTextField.setForeground(new Color (0,0,0));
        }
        //This handles what happend when you click the out of the box
    }//GEN-LAST:event_answerTextFieldFocusLost

    private void answerTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerTextFieldKeyPressed
      if(evt.getKeyCode()== KeyEvent.VK_ENTER){
       
        if (answerTextField.getText().equalsIgnoreCase("quit"))//If quit is entered, program quits
           {System.out.println("You ended the session\n");
            Answered+=0;
            switch (Operand.getOperator()) {
            case 1 -> Operand.setDivide();
            case 2 -> Operand.setMultiply();
            case 3 -> Operand.setAdd();
            case 4 -> Operand.setSubtract();
            default -> {
                    }//end Default Case
                }//ends switch Operator
            }//end if
        
        else if ((!(answerTextField.getText().equalsIgnoreCase("quit"))) && (!(NumberUtils.isParsable(answerTextField.getText())))){
            System.out.println("Invalid Response\n");        
            }//end else if
        
        else if (Integer.parseInt(answerTextField.getText())==answer)
            {System.out.println("Correct!\n");
            //new javax.swing.Timer(delay,Sleep()).start();
            Correct.setVisible(true);
            Incorrect.setVisible(false);
            
            
            numCorrect++;
            Answered++;

            switch (Operand.getOperator()) {
                case 1 -> divr++;
                case 2 -> mulr++;
                case 3 -> addr++;
                case 4 -> subr++;
                default -> {
                        }//end default
                    }//end switch
                }//End of Operator if. Keeps up with num of correct

        else if (Integer.parseInt(answerTextField.getText())!=answer) 
            {System.out.println("Incorrect. The Correct Answer is: "+answer +"\n");
            Incorrect.setVisible(true);
            Correct.setVisible(false);
            
            Answered++;
            }//end else if
        
        answerTextField.setText("");//Reset Text Box

        answer = Operand.workProblem();
        
        displayProblemNumber.setText("Number " + Operand.getProblemNumber());//Displays problem number
        displayProblem.setText(Operand.getProblem());//Displays + gets problem
      
      } 
    }//GEN-LAST:event_answerTextFieldKeyPressed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    dispose();
    System.exit(0);
    // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void Stats_ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stats_ScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stats_ScoreActionPerformed

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
            java.util.logging.Logger.getLogger(mathGameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mathGameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mathGameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mathGameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mathGameJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Correct;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JLabel Incorrect;
    private javax.swing.JButton Start;
    private javax.swing.JMenuItem Stats_Score;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField answerTextField;
    private javax.swing.JLabel displayProblem;
    private javax.swing.JLabel displayProblemNumber;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
