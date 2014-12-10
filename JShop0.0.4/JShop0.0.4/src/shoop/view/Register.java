/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoop.view;

import java.awt.Color;
import shoop.controller.RegisterViewController;

/**
 *
 * @author Juan Francisco
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Register() {
        initComponents();
        initMyOwnComponents();
        this.setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelPlease = new javax.swing.JLabel();
        ButCancel = new javax.swing.JButton();
        ButRegister = new javax.swing.JButton();
        LabelUsername = new javax.swing.JLabel();
        LabelName = new javax.swing.JLabel();
        LabelLastName = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        LabelRepeatPW = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelID = new javax.swing.JLabel();
        LabelBday = new javax.swing.JLabel();
        FieldID = new javax.swing.JTextField();
        FieldEmail = new javax.swing.JTextField();
        FieldBdayMonth = new javax.swing.JTextField();
        FieldBdayYear = new javax.swing.JTextField();
        FieldBdayDay = new javax.swing.JTextField();
        FieldName = new javax.swing.JTextField();
        FieldUsername = new javax.swing.JTextField();
        FieldLastName = new javax.swing.JTextField();
        FieldRepPW = new javax.swing.JPasswordField();
        FieldPW = new javax.swing.JPasswordField();
        Background = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        LabelRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelPlease.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/register text.png"))); // NOI18N
        getContentPane().add(LabelPlease, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        ButCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/cancel.png"))); // NOI18N
        ButCancel.setBorder(null);
        ButCancel.setBorderPainted(false);
        ButCancel.setContentAreaFilled(false);
        ButCancel.setDefaultCapable(false);
        ButCancel.setFocusPainted(false);
        ButCancel.setFocusable(false);
        ButCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCancelActionPerformed(evt);
            }
        });
        getContentPane().add(ButCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, 270, -1));

        ButRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/register.png"))); // NOI18N
        ButRegister.setBorder(null);
        ButRegister.setBorderPainted(false);
        ButRegister.setContentAreaFilled(false);
        ButRegister.setDefaultCapable(false);
        ButRegister.setFocusPainted(false);
        ButRegister.setFocusable(false);
        ButRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(ButRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 570, 270, -1));

        LabelUsername.setFont(new java.awt.Font("Lakesight Personal Use Only", 0, 30)); // NOI18N
        LabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/username.png"))); // NOI18N
        getContentPane().add(LabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, 30));

        LabelName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/name.png"))); // NOI18N
        getContentPane().add(LabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, 30));

        LabelLastName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/last name.png"))); // NOI18N
        getContentPane().add(LabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, 30));

        LabelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/password.png"))); // NOI18N
        getContentPane().add(LabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, 30));

        LabelRepeatPW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/repeat password.png"))); // NOI18N
        getContentPane().add(LabelRepeatPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 30));

        LabelEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/email.png"))); // NOI18N
        getContentPane().add(LabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, 30));

        LabelID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/id.png"))); // NOI18N
        getContentPane().add(LabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, 30));

        LabelBday.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/bday.png"))); // NOI18N
        getContentPane().add(LabelBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, 30));

        FieldID.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldIDActionPerformed(evt);
            }
        });
        getContentPane().add(FieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 250, 30));

        FieldEmail.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(FieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 250, 30));

        FieldBdayMonth.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldBdayMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FieldBdayMonth.setText("MM");
        FieldBdayMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FieldBdayMonthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FieldBdayMonthFocusLost(evt);
            }
        });
        FieldBdayMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldBdayMonthActionPerformed(evt);
            }
        });
        getContentPane().add(FieldBdayMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 60, 30));

        FieldBdayYear.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldBdayYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FieldBdayYear.setText("yyyy");
        FieldBdayYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FieldBdayYearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FieldBdayYearFocusLost(evt);
            }
        });
        FieldBdayYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldBdayYearActionPerformed(evt);
            }
        });
        getContentPane().add(FieldBdayYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 60, 30));

        FieldBdayDay.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldBdayDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FieldBdayDay.setText("dd");
        FieldBdayDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FieldBdayDayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FieldBdayDayFocusLost(evt);
            }
        });
        FieldBdayDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldBdayDayActionPerformed(evt);
            }
        });
        getContentPane().add(FieldBdayDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 60, 30));

        FieldName.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNameActionPerformed(evt);
            }
        });
        getContentPane().add(FieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 250, 30));

        FieldUsername.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(FieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 250, 30));

        FieldLastName.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(FieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 250, 30));
        getContentPane().add(FieldRepPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 250, 30));

        FieldPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPWActionPerformed(evt);
            }
        });
        getContentPane().add(FieldPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 250, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BGlogReg.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "V-", "J-", "E-" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 40, 30));

        LabelRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/register.png"))); // NOI18N
        getContentPane().add(LabelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCancelActionPerformed
        this.dispose();

    }//GEN-LAST:event_ButCancelActionPerformed

    private void ButRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRegisterActionPerformed
        int count = 0;
        /*Checkin empty spaces*/
        String day = FieldBdayDay.getText();
        String month = FieldBdayMonth.getText();
        String year = FieldBdayYear.getText();
        if ((FieldUsername.getText().trim().length()==0)        || 
                (FieldName.getText().trim().length()==0)        ||
                (FieldLastName.getText().trim().length()==0)    ||
                (FieldPW.getText().trim().length()==0)          ||
                (FieldRepPW.getText().trim().length()==0)       ||
                (FieldEmail.getText().trim().length()==0)       ||
                (FieldID.getText().trim().length()==0)          || 
                (month.equals("MM")        ||
                year.equals("yy")       ||
                day.equals("dd")))
                {
            System.out.println("Missing Fields");
        } else {
            System.out.println("No missing fields");
            count = count +1;
            }
        
        /*Checkin Pws */
        String a = FieldPW.getText();
        String b = FieldRepPW.getText();
        if (a.equals(b)){
            System.out.println("Password Match");count = count +1;} 
        else {
            System.out.println("Passwords didn't match");}
        if (count == 2){
            RegisterViewController.registerUser();
            this.dispose();}
    }//GEN-LAST:event_ButRegisterActionPerformed

    private void FieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNameActionPerformed

    private void FieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsernameActionPerformed

    private void FieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldLastNameActionPerformed

    private void FieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldIDActionPerformed

    private void FieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldEmailActionPerformed

    private void FieldBdayMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldBdayMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldBdayMonthActionPerformed

    private void FieldPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPWActionPerformed

    private void FieldBdayYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldBdayYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldBdayYearActionPerformed

    private void FieldBdayDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldBdayDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldBdayDayActionPerformed

    private void FieldBdayDayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldBdayDayFocusLost
        if ((FieldBdayDay.getText().trim().length()==0)){
            FieldBdayDay.setText("dd");
        }
    }//GEN-LAST:event_FieldBdayDayFocusLost

    private void FieldBdayMonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldBdayMonthFocusLost
        if ((FieldBdayMonth.getText().trim().length()==0)){
            FieldBdayMonth.setText("MM");
        }
    }//GEN-LAST:event_FieldBdayMonthFocusLost

    private void FieldBdayYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldBdayYearFocusLost
        if ((FieldBdayYear.getText().trim().length()==0)){
            FieldBdayYear.setText("yyyy");
        }
    }//GEN-LAST:event_FieldBdayYearFocusLost

    private void FieldBdayMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldBdayMonthFocusGained
        FieldBdayMonth.setText("");
    }//GEN-LAST:event_FieldBdayMonthFocusGained

    private void FieldBdayYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldBdayYearFocusGained
        FieldBdayYear.setText("");
    }//GEN-LAST:event_FieldBdayYearFocusGained

    private void FieldBdayDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldBdayDayFocusGained
        FieldBdayDay.setText("");
    }//GEN-LAST:event_FieldBdayDayFocusGained
    private void initMyOwnComponents()
    {
        RegisterViewController.initOutlets(FieldName, FieldLastName, FieldID, FieldEmail, FieldUsername, FieldPW, FieldBdayMonth, FieldBdayYear, FieldBdayDay, jComboBox1);
    
    }
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ButCancel;
    private javax.swing.JButton ButRegister;
    private javax.swing.JTextField FieldBdayDay;
    private javax.swing.JTextField FieldBdayMonth;
    private javax.swing.JTextField FieldBdayYear;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JTextField FieldID;
    private javax.swing.JTextField FieldLastName;
    private javax.swing.JTextField FieldName;
    private javax.swing.JPasswordField FieldPW;
    private javax.swing.JPasswordField FieldRepPW;
    private javax.swing.JTextField FieldUsername;
    private javax.swing.JLabel LabelBday;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelLastName;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelPlease;
    private javax.swing.JLabel LabelRegister;
    private javax.swing.JLabel LabelRepeatPW;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JComboBox jComboBox1;
    // End of variables declaration//GEN-END:variables
}
