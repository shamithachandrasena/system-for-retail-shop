/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.billing.sw;

import com.sun.nio.sctp.SendFailedNotification;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.*;

/**
 *
 * @author ASUS_PC
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        txtUser_Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("User Name  :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 210, 80, 29);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(220, 270, 200, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Password   :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(128, 270, 80, 28);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("User Login");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 120, 150, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("SHAN TRADE CENTRE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 30, 400, 50);

        btnOk.setBackground(new java.awt.Color(204, 51, 255));
        btnOk.setText("OK");
        btnOk.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnOkMouseMoved(evt);
            }
        });
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel1.add(btnOk);
        btnOk.setBounds(290, 330, 81, 37);

        btnCancle.setBackground(new java.awt.Color(204, 51, 255));
        btnCancle.setText("Cancle");
        btnCancle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancleMouseClicked(evt);
            }
        });
        btnCancle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCancleMouseMoved(evt);
            }
        });
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancle);
        btnCancle.setBounds(390, 330, 81, 37);

        txtUser_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_NameKeyPressed(evt);
            }
        });
        jPanel1.add(txtUser_Name);
        txtUser_Name.setBounds(220, 210, 201, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop/billing/sw/images/10442-vi_bg_NL-Versand.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-430, -140, 1210, 760);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        // TODO add your handling code here:
        String ext=new String(txtPassword.getPassword());
        
        if(txtUser_Name.getText().equals("admin")&& ext.equals("123"))
        {
            JOptionPane.showMessageDialog(null, "Login Sucessful");
            Home home=new Home();
            home.setVisible(true);
            dispose();
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Login Failed");
            txtUser_Name.setText("");
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnOkMouseClicked

    private void btnCancleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancleMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCancleMouseClicked

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(null, "Do You Want to Exit?","EXIT",JOptionPane.YES_NO_OPTION);
        if(p==0){
        dispose();}
        else{
        //Login log=new Login();
        //log.setVisible(true);
        
        }
    }//GEN-LAST:event_btnCancleActionPerformed
    
    private void txtUser_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_NameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            txtPassword.getCursor();
        }
        else{}
    }//GEN-LAST:event_txtUser_NameKeyPressed

    private void btnOkMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseMoved
        // TODO add your handling code here:
        btnOk.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnOkMouseMoved

    private void btnCancleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancleMouseMoved
        // TODO add your handling code here:
        btnCancle.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCancleMouseMoved

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser_Name;
    // End of variables declaration//GEN-END:variables
}
