/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoop.view;

import javax.swing.JOptionPane;
import shoop.controller.LobbyViewController;
import shoop.controller.EditProfileViewController;

/**
 *
 * @author Juan Francisco
 */
public class Lobby extends MyOwnJFrame{

    /**
     * Creates new form NewJFrame
     */
    String UserConected;
    public Lobby() {
        initComponents();
        initMyOwnComponents();
        LabelUsername.setVisible(false);
        LabelPassword.setVisible(false);
        LogBarOk.setVisible(false);
        FieldPW1.setVisible(false);
        FieldUsername1.setVisible(false);
        ButCart.setEnabled(false);
        CBCategory.setVisible(false);
        FieldProductName.setVisible(false);
        
        SearchPanel.setVisible(false);
        LabelWelcome.setVisible(false);
        ButLogOut.setVisible(false);
        ButAddItems.setVisible(false);
        ButEditUsers.setVisible(false);
        ButProfile.setEnabled(false);
        
        ButEditUsers.setEnabled(false);
        ButAddItems.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButProfile = new javax.swing.JButton();
        ButCart = new javax.swing.JButton();
        ButSearch = new javax.swing.JButton();
        ButExit = new javax.swing.JButton();
        ButRegister = new javax.swing.JButton();
        FieldUsername = new javax.swing.JTextField();
        FieldPW = new javax.swing.JPasswordField();
        Control = new javax.swing.JLabel();
        ButRegisterLobby = new javax.swing.JButton();
        ButLogIn1 = new javax.swing.JButton();
        SearchPanel = new javax.swing.JTabbedPane();
        NamePanel = new javax.swing.JPanel();
        FieldProductName = new javax.swing.JTextField();
        ButSearchProd1 = new javax.swing.JButton();
        LabelProdName = new javax.swing.JLabel();
        LabelProdCat = new javax.swing.JPanel();
        LabelProdName1 = new javax.swing.JLabel();
        CBCategory = new javax.swing.JComboBox();
        ButSearchProd = new javax.swing.JButton();
        LabelWelcome = new javax.swing.JLabel();
        SearchBar = new javax.swing.JLabel();
        ButLogOut = new javax.swing.JLabel();
        ButAddItems = new javax.swing.JLabel();
        ButEditUsers = new javax.swing.JLabel();
        FieldUsername1 = new javax.swing.JTextField();
        FieldPW1 = new javax.swing.JPasswordField();
        LabelUsername = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        LogBarOk = new javax.swing.JButton();
        LobbyContent = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BannerLogos/ButProfile.png"))); // NOI18N
        ButProfile.setBorderPainted(false);
        ButProfile.setContentAreaFilled(false);
        ButProfile.setEnabled(false);
        ButProfile.setFocusPainted(false);
        ButProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButProfileActionPerformed(evt);
            }
        });
        getContentPane().add(ButProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 90, 120));

        ButCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BannerLogos/ButCart.png"))); // NOI18N
        ButCart.setBorderPainted(false);
        ButCart.setContentAreaFilled(false);
        ButCart.setFocusPainted(false);
        getContentPane().add(ButCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 90, 130));

        ButSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BannerLogos/ButSearch.png"))); // NOI18N
        ButSearch.setBorderPainted(false);
        ButSearch.setContentAreaFilled(false);
        ButSearch.setFocusPainted(false);
        ButSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSearchActionPerformed(evt);
            }
        });
        getContentPane().add(ButSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 90, 120));

        ButExit.setFont(new java.awt.Font("Kristen ITC", 0, 24)); // NOI18N
        ButExit.setForeground(new java.awt.Color(255, 255, 255));
        ButExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BannerLogos/exit.png"))); // NOI18N
        ButExit.setBorderPainted(false);
        ButExit.setContentAreaFilled(false);
        ButExit.setFocusPainted(false);
        ButExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExitActionPerformed(evt);
            }
        });
        getContentPane().add(ButExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 40, 20));

        ButRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BannerLogos/ButRegister.png"))); // NOI18N
        ButRegister.setBorderPainted(false);
        ButRegister.setContentAreaFilled(false);
        ButRegister.setFocusPainted(false);
        ButRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(ButRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 150, 150));

        FieldUsername.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldUsername.setAutoscrolls(false);
        FieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(FieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 210, 30));
        getContentPane().add(FieldPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 210, 30));
        getContentPane().add(Control, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 140, 130));

        ButRegisterLobby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/register.png"))); // NOI18N
        ButRegisterLobby.setBorderPainted(false);
        ButRegisterLobby.setContentAreaFilled(false);
        ButRegisterLobby.setFocusPainted(false);
        ButRegisterLobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButRegisterLobbyActionPerformed(evt);
            }
        });
        getContentPane().add(ButRegisterLobby, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 270, 40));

        ButLogIn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/log in.png"))); // NOI18N
        ButLogIn1.setBorder(null);
        ButLogIn1.setBorderPainted(false);
        ButLogIn1.setContentAreaFilled(false);
        ButLogIn1.setDefaultCapable(false);
        ButLogIn1.setFocusPainted(false);
        ButLogIn1.setFocusable(false);
        ButLogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButLogIn1ActionPerformed(evt);
            }
        });
        getContentPane().add(ButLogIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 260, -1));

        SearchPanel.setForeground(new java.awt.Color(102, 102, 102));
        SearchPanel.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N

        NamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FieldProductName.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldProductNameActionPerformed(evt);
            }
        });
        NamePanel.add(FieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 220, 30));

        ButSearchProd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search.png"))); // NOI18N
        ButSearchProd1.setBorderPainted(false);
        ButSearchProd1.setContentAreaFilled(false);
        ButSearchProd1.setFocusPainted(false);
        NamePanel.add(ButSearchProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 110, 50));

        LabelProdName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        LabelProdName.setForeground(new java.awt.Color(51, 51, 51));
        LabelProdName.setText("Product name:");
        NamePanel.add(LabelProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 40));

        SearchPanel.addTab("Name", NamePanel);

        LabelProdCat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelProdName1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        LabelProdName1.setForeground(new java.awt.Color(51, 51, 51));
        LabelProdName1.setText("Product category:");
        LabelProdCat.add(LabelProdName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 40));

        CBCategory.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        CBCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Book & Audible", "Movies & Music", "Games", "Electronics", "Home & Garden", "Beauty & health", "Toys", "Clothing & Jewelry", "Sports", "Automotive", "Others" }));
        LabelProdCat.add(CBCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 220, 40));

        ButSearchProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/search.png"))); // NOI18N
        ButSearchProd.setBorderPainted(false);
        ButSearchProd.setContentAreaFilled(false);
        ButSearchProd.setFocusPainted(false);
        LabelProdCat.add(ButSearchProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 110, 50));

        SearchPanel.addTab("Category", LabelProdCat);

        getContentPane().add(SearchPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 310, 440));

        LabelWelcome.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        LabelWelcome.setForeground(new java.awt.Color(255, 255, 255));
        LabelWelcome.setText("Welcome");
        getContentPane().add(LabelWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, 20));

        SearchBar.setVisible(false);
        SearchBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/SearchBar.png"))); // NOI18N
        getContentPane().add(SearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 370, 690));

        ButLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BannerLogos/log out.png"))); // NOI18N
        ButLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButLogOutMouseClicked(evt);
            }
        });
        getContentPane().add(ButLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 100, 70));

        ButAddItems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BannerLogos/additems.png"))); // NOI18N
        ButAddItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButAddItemsMouseClicked(evt);
            }
        });
        getContentPane().add(ButAddItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 110, 50));

        ButEditUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BannerLogos/editusers.png"))); // NOI18N
        ButEditUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButEditUsersMouseClicked(evt);
            }
        });
        getContentPane().add(ButEditUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 120, 70));

        FieldUsername1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        FieldUsername1.setAutoscrolls(false);
        FieldUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsername1ActionPerformed(evt);
            }
        });
        getContentPane().add(FieldUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 210, 30));
        getContentPane().add(FieldPW1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 210, 30));

        LabelUsername.setFont(new java.awt.Font("Lakesight Personal Use Only", 0, 30)); // NOI18N
        LabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/smallUser.png"))); // NOI18N
        getContentPane().add(LabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 170, 30));

        LabelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/smallPW.png"))); // NOI18N
        getContentPane().add(LabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 170, 30));

        LogBarOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/letters/smallLog.png"))); // NOI18N
        LogBarOk.setBorderPainted(false);
        LogBarOk.setContentAreaFilled(false);
        LogBarOk.setFocusPainted(false);
        LogBarOk.setFocusable(false);
        LogBarOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogBarOkActionPerformed(evt);
            }
        });
        getContentPane().add(LogBarOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 80, 70, 30));

        LobbyContent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LobbyContent.png"))); // NOI18N
        getContentPane().add(LobbyContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -40, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Background.jpg"))); // NOI18N
        Background.setFocusable(false);
        Background.setRequestFocusEnabled(false);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButExitActionPerformed

    private void ButRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRegisterActionPerformed
        Register WindowReg = new Register();
        WindowReg.setExtendedState(Register.MAXIMIZED_BOTH); 
        //Unfocused WindowUnf = new Unfocused();
        //WindowUnf.setVisible(true);
        WindowReg.setVisible(true);
        
    }//GEN-LAST:event_ButRegisterActionPerformed
   
    private void FieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsernameActionPerformed

    private void ButLogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButLogIn1ActionPerformed
        int count = 0;
        boolean Log = false;
        /*Checkin empty spaces*/
        String a = FieldUsername.getText();
        String b = FieldPW.getText();
        
        if ((a.trim().length()==0)        ||
            (b.trim().length()==0)
        )
        {
            System.out.println("Missing Fields");
        } else {
            System.out.println("No missing fields");
            count = count +1;
        }
        
        Log = LobbyViewController.logIn();
        if (Log == true)
        {
            count = count +1;
        }
        
        if (count == 2){
            //this.dispose();
            UserConected = FieldUsername.getText();
            ButProfile.setEnabled(true);
            if (UserConected.equals("admin")){
            ButEditUsers.setEnabled(true);
            ButProfile.setEnabled(false);
            System.out.println("Administrator Logged");
            }
            if (UserConected.equals("invent")){
            ButAddItems.setEnabled(true);
            System.out.println("Inventory Logged");
            ButProfile.setEnabled(false);
            }
            
            SearchBar.setVisible(true);
            ButLogIn1.setVisible(false);
            ButRegisterLobby.setVisible(false);
            LobbyContent.setVisible(false);
            FieldPW.setVisible(false);
            FieldUsername.setVisible(false);
            FieldPW1.setVisible(false);
            FieldUsername1.setVisible(false);
            
            LabelUsername.setVisible(false);
            LabelPassword.setVisible(false);
            LogBarOk.setVisible(false);
            ButSearch.setEnabled(false);
            
            CBCategory.setVisible(true);
            FieldProductName.setVisible(true);
            
            SearchPanel.setVisible(true);
            
            LabelWelcome.setText("Welcome, "+UserConected+".");
            LabelWelcome.setVisible(true);
            ButLogOut.setVisible(true);
            ButAddItems.setVisible(true);
            ButEditUsers.setVisible(true);
            
            
            //SearchPanel.setVisible()
        }
        else
            JOptionPane.showMessageDialog(this,"The Password or Username are wrong,check them and try again");
    
    }//GEN-LAST:event_ButLogIn1ActionPerformed

    private void ButRegisterLobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButRegisterLobbyActionPerformed
        Register WindowReg = new Register();
        WindowReg.setExtendedState(Register.MAXIMIZED_BOTH);
        WindowReg.setVisible(true);

    }//GEN-LAST:event_ButRegisterLobbyActionPerformed

    private void ButProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButProfileActionPerformed
        EditProfile WindowProf = new EditProfile();
        EditProfileViewController.setNickname(UserConected);
        EditProfileViewController.loadUser(UserConected);
        WindowProf.setExtendedState(EditProfile.MAXIMIZED_BOTH);
        WindowProf.setVisible(true);
    }//GEN-LAST:event_ButProfileActionPerformed

    private void ButSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSearchActionPerformed
            SearchBar.setVisible(true);
            ButLogIn1.setVisible(false);
            ButRegisterLobby.setVisible(false);
            LobbyContent.setVisible(false);
            FieldPW.setVisible(false);
            FieldUsername.setVisible(false);
            
            LabelUsername.setVisible(true);
            LabelPassword.setVisible(true);
            LogBarOk.setVisible(true);
            FieldPW1.setVisible(true);
            FieldUsername1.setVisible(true);
            ButSearch.setEnabled(false);
            
            CBCategory.setVisible(true);
            FieldProductName.setVisible(true);
            
            SearchPanel.setVisible(true);
            LabelWelcome.setVisible(false);
    }//GEN-LAST:event_ButSearchActionPerformed

    private void FieldUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsername1ActionPerformed

    private void LogBarOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogBarOkActionPerformed
        int count = 0;
        boolean Log = false;
        /*Checkin empty spaces*/
        String a = FieldUsername1.getText();
        String b = FieldPW1.getText();
       
        if ((a.trim().length()==0)        ||
            (b.trim().length()==0)
        )
        {
            System.out.println("Missing Fields");
        } else {
            System.out.println("No missing fields");
            count = count +1;
        }
        Log = LobbyViewController.logIn1();
        if (Log == true)
        {
            count = count +1;
        }
        if (count == 2){
            //this.dispose();
            UserConected = FieldUsername1.getText();
            ButProfile.setEnabled(true);
            if (UserConected.equals("admin")){
            ButEditUsers.setEnabled(true);
            ButProfile.setEnabled(false);
            System.out.println("Administrator Logged");
            
            }
            if (UserConected.equals("invent")){
            ButAddItems.setEnabled(true);
            System.out.println("Inventory Logged");
            ButProfile.setEnabled(false);
            }
            
            
            SearchBar.setVisible(true);
            ButLogIn1.setVisible(false);
            ButRegisterLobby.setVisible(false);
            LobbyContent.setVisible(false);
            FieldPW.setVisible(false);
            FieldUsername.setVisible(false);
            FieldPW1.setVisible(false);
            FieldUsername1.setVisible(false);
            
            LabelUsername.setVisible(false);
            LabelPassword.setVisible(false);
            LogBarOk.setVisible(false);
            ButSearch.setEnabled(false);
            
            CBCategory.setVisible(true);
            FieldProductName.setVisible(true);
            
            SearchPanel.setVisible(true);
            
            LabelWelcome.setText("Welcome, "+UserConected+".");
            LabelWelcome.setVisible(true);
            ButLogOut.setVisible(true);
            ButAddItems.setVisible(true);
            ButEditUsers.setVisible(true);
            
        }
        else
            JOptionPane.showMessageDialog(this,"The Password or Username are wrong,check them and try again");
    }//GEN-LAST:event_LogBarOkActionPerformed

    private void ButLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButLogOutMouseClicked
        LabelUsername.setVisible(false);
        LabelPassword.setVisible(false);
        LogBarOk.setVisible(false);
        FieldPW1.setVisible(false);
        FieldUsername1.setVisible(false);
        ButCart.setEnabled(false);
        CBCategory.setVisible(false);
        FieldProductName.setVisible(false);
        
        SearchPanel.setVisible(false);
        LabelWelcome.setVisible(false);
        ButLogOut.setVisible(false);
        ButAddItems.setVisible(false);
        ButEditUsers.setVisible(false);
        ButProfile.setEnabled(false);
        LobbyContent.setVisible(true);
        SearchBar.setVisible(false);
        FieldUsername.setVisible(true);
        FieldPW.setVisible(true);
        FieldUsername.setText("");
        FieldPW.setText("");
        ButSearch.setEnabled(true);
        ButRegisterLobby.setVisible(true);
        ButLogIn1.setVisible(true);
        
        ButEditUsers.setEnabled(false);
        ButAddItems.setEnabled(false);
        
    }//GEN-LAST:event_ButLogOutMouseClicked

    private void FieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldProductNameActionPerformed

    private void ButEditUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButEditUsersMouseClicked
        AdminDeleteEditUser WindowEditing = new AdminDeleteEditUser();
        WindowEditing.setExtendedState(AdminDeleteEditUser.MAXIMIZED_BOTH); 
        
        WindowEditing.setVisible(true);
    }//GEN-LAST:event_ButEditUsersMouseClicked

    private void ButAddItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButAddItemsMouseClicked
        AddItems WindowEditing = new AddItems();
        WindowEditing.setExtendedState(AddItems.MAXIMIZED_BOTH); 
        
        WindowEditing.setVisible(true);
    }//GEN-LAST:event_ButAddItemsMouseClicked

    private void initMyOwnComponents()
    {
        LobbyViewController.initOutlets(FieldUsername, FieldUsername1, FieldPW, FieldPW1,UserConected);
    
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
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel ButAddItems;
    private javax.swing.JButton ButCart;
    private javax.swing.JLabel ButEditUsers;
    private javax.swing.JButton ButExit;
    private javax.swing.JButton ButLogIn1;
    private javax.swing.JLabel ButLogOut;
    private javax.swing.JButton ButProfile;
    private javax.swing.JButton ButRegister;
    private javax.swing.JButton ButRegisterLobby;
    private javax.swing.JButton ButSearch;
    private javax.swing.JButton ButSearchProd;
    private javax.swing.JButton ButSearchProd1;
    private javax.swing.JComboBox CBCategory;
    private javax.swing.JLabel Control;
    private javax.swing.JPasswordField FieldPW;
    private javax.swing.JPasswordField FieldPW1;
    private javax.swing.JTextField FieldProductName;
    private javax.swing.JTextField FieldUsername;
    private javax.swing.JTextField FieldUsername1;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JPanel LabelProdCat;
    private javax.swing.JLabel LabelProdName;
    private javax.swing.JLabel LabelProdName1;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JLabel LabelWelcome;
    private javax.swing.JLabel LobbyContent;
    private javax.swing.JButton LogBarOk;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JLabel SearchBar;
    private javax.swing.JTabbedPane SearchPanel;
    // End of variables declaration//GEN-END:variables
}
