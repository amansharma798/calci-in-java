

/**
 *
 * @author aman sharma
 */
public class calci extends javax.swing.JFrame {

    
     private static double num1=0;
     private static double num2=0;
     private String action="";
     private static double res;
    public calci() {
        initComponents();
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtval = new javax.swing.JTextField();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        Buttonmul = new javax.swing.JButton();
        Buttondiv = new javax.swing.JButton();
        Buttonplus = new javax.swing.JButton();
        Buttonsub = new javax.swing.JButton();
        Buttondot = new javax.swing.JButton();
        Buttonclear = new javax.swing.JButton();
        Buttonbp = new javax.swing.JButton();
        Buttonequals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("                Calculator");

        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button0.setText("0");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        Buttonmul.setText("*");
        Buttonmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonmulActionPerformed(evt);
            }
        });

        Buttondiv.setText("/");
        Buttondiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtondivActionPerformed(evt);
            }
        });

        Buttonplus.setText("+");
        Buttonplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonplusActionPerformed(evt);
            }
        });

        Buttonsub.setText("-");
        Buttonsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonsubActionPerformed(evt);
            }
        });

        Buttondot.setText(".");
        Buttondot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtondotActionPerformed(evt);
            }
        });

        Buttonclear.setText("Clear");
        Buttonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonclearActionPerformed(evt);
            }
        });

        Buttonbp.setText("Back Space");
        Buttonbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonbpActionPerformed(evt);
            }
        });

        Buttonequals.setText("=");
        Buttonequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonequalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Buttonclear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Buttonbp)
                                    .addGap(18, 18, 18)
                                    .addComponent(Buttonequals, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Button5)
                                            .addGap(18, 18, 18)
                                            .addComponent(Button6)
                                            .addGap(18, 18, 18)
                                            .addComponent(Button7))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Button9)
                                            .addGap(18, 18, 18)
                                            .addComponent(Buttonmul)
                                            .addGap(18, 18, 18)
                                            .addComponent(Buttondiv)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Button8)
                                            .addGap(18, 18, 18)
                                            .addComponent(Buttonsub))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Button0)
                                            .addGap(18, 18, 18)
                                            .addComponent(Buttondot)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button1)
                                .addGap(18, 18, 18)
                                .addComponent(Button2)
                                .addGap(18, 18, 18)
                                .addComponent(Button3)
                                .addGap(18, 18, 18)
                                .addComponent(Button4)
                                .addGap(18, 18, 18)
                                .addComponent(Buttonplus))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(txtval, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtval, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1)
                    .addComponent(Button2)
                    .addComponent(Button3)
                    .addComponent(Button4)
                    .addComponent(Buttonplus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button5)
                    .addComponent(Button6)
                    .addComponent(Button7)
                    .addComponent(Button8)
                    .addComponent(Buttonsub))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button9)
                    .addComponent(Button0)
                    .addComponent(Buttonmul)
                    .addComponent(Buttondiv)
                    .addComponent(Buttondot))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonclear)
                    .addComponent(Buttonbp)
                    .addComponent(Buttonequals))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtondotActionPerformed(java.awt.event.ActionEvent evt) {
        String str=txtval.getText()+Buttondot.getText();
        txtval.setText(String.valueOf(str));
    }                                         

    private void ButtonplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonplusActionPerformed
        action="+";
        num1=Double.valueOf(txtval.getText());
        String str="";
        txtval.setText(str);
        
    }//GEN-LAST:event_ButtonplusActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        String str=txtval.getText()+Button1.getText();
        txtval.setText(str);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        String str=txtval.getText()+Button2.getText();
        txtval.setText(str);
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        String str=txtval.getText()+Button3.getText();
        txtval.setText(str);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        String str=txtval.getText()+Button4.getText();
        txtval.setText(str);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        String str=txtval.getText()+Button5.getText();
        txtval.setText(str);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        String str=txtval.getText()+Button6.getText();
        txtval.setText(str);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        String str=txtval.getText()+Button7.getText();
        txtval.setText(str);
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        String str=txtval.getText()+Button8.getText();
        txtval.setText(str);
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        String str=txtval.getText()+Button9.getText();
        txtval.setText(str);
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonsubActionPerformed
        action="-";
        num1=Double.valueOf(txtval.getText());
        String str="";
        txtval.setText(str);
    }//GEN-LAST:event_ButtonsubActionPerformed

    private void ButtonmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonmulActionPerformed
        action="*";
        num1=Double.valueOf(txtval.getText());
        String str="";
        txtval.setText(str);
    }//GEN-LAST:event_ButtonmulActionPerformed

    private void ButtondivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtondivActionPerformed
        action="/";
        num1=Double.valueOf(txtval.getText());
        String str="";
        txtval.setText(str);
    }//GEN-LAST:event_ButtondivActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        String str=txtval.getText()+Button0.getText();
        txtval.setText(str);
    }//GEN-LAST:event_Button0ActionPerformed

    private void ButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonclearActionPerformed
        String str="";
        txtval.setText(str);
    }//GEN-LAST:event_ButtonclearActionPerformed

    private void ButtonbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonbpActionPerformed
        String str=txtval.getText();
        str=str.substring(0,(str.length()-1));
        txtval.setText(str);
        
    }//GEN-LAST:event_ButtonbpActionPerformed

    private void ButtonequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonequalsActionPerformed
        
        num2=Double.valueOf(txtval.getText());
        if(action=="+")
            res=(double)(num1+num2);
        else if(action=="-")
            res=(double) (num1-num2);
        else if(action=="*")
            res=(double)(num1*num2);
        else if(action=="/")
            res=(double) (num1/num2);
        
        txtval.setText(String.valueOf(res));
    }//GEN-LAST:event_ButtonequalsActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calci().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton Buttonbp;
    private javax.swing.JButton Buttonclear;
    private javax.swing.JButton Buttondiv;
    private javax.swing.JButton Buttondot;
    private javax.swing.JButton Buttonequals;
    private javax.swing.JButton Buttonmul;
    private javax.swing.JButton Buttonplus;
    private javax.swing.JButton Buttonsub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtval;
    // End of variables declaration                   
}
