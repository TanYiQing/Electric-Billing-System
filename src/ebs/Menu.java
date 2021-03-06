/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebs;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Yi Qing Tan
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setIconImage();
        
        //Logo
        ImageIcon logo=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        Image l1= logo.getImage();
        Image l2=l1.getScaledInstance(logolabel.getWidth(),logolabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon l=new ImageIcon(l2);     
        logolabel.setIcon(l);
        
        //Staff Icon
        ImageIcon staff=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Stafficon.png")));
        Image img1= staff.getImage();
        Image img2=img1.getScaledInstance(staffbtn2.getWidth(),staffbtn2.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon s=new ImageIcon(img2);     
        staffbtn2.setIcon(s);
        
        //Guest Icon
        ImageIcon guest=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("guest.png")));
        Image img3=guest.getImage();
        Image img4=img3.getScaledInstance(guestbtn1.getWidth(),guestbtn1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon g=new ImageIcon(img4);
        guestbtn1.setIcon(g);
        this.setLocationRelativeTo(null);    
        
        
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
        guestbtn3 = new javax.swing.JPanel();
        guestbtn1 = new javax.swing.JLabel();
        guestbtn = new javax.swing.JLabel();
        staffbtn3 = new javax.swing.JPanel();
        staffbtn2 = new javax.swing.JLabel();
        staffbtn = new javax.swing.JLabel();
        logolabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electricity Billing System");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        guestbtn3.setBackground(new java.awt.Color(255, 255, 51));
        guestbtn3.setForeground(new java.awt.Color(255, 255, 51));
        guestbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestbtn3MouseClicked(evt);
            }
        });

        guestbtn1.setText("Guest");
        guestbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestbtn1MouseClicked(evt);
            }
        });

        guestbtn.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 48)); // NOI18N
        guestbtn.setText("Guest");
        guestbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout guestbtn3Layout = new javax.swing.GroupLayout(guestbtn3);
        guestbtn3.setLayout(guestbtn3Layout);
        guestbtn3Layout.setHorizontalGroup(
            guestbtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guestbtn3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guestbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(guestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        guestbtn3Layout.setVerticalGroup(
            guestbtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guestbtn3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(guestbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guestbtn3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guestbtn)
                .addContainerGap())
        );

        staffbtn3.setBackground(new java.awt.Color(255, 204, 0));
        staffbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffbtn3MouseClicked(evt);
            }
        });

        staffbtn2.setText("Staff");
        staffbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffbtn2MouseClicked(evt);
            }
        });

        staffbtn.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 48)); // NOI18N
        staffbtn.setText("Staff");
        staffbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout staffbtn3Layout = new javax.swing.GroupLayout(staffbtn3);
        staffbtn3.setLayout(staffbtn3Layout);
        staffbtn3Layout.setHorizontalGroup(
            staffbtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffbtn3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(staffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(staffbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        staffbtn3Layout.setVerticalGroup(
            staffbtn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffbtn3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(staffbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffbtn3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staffbtn)
                .addContainerGap())
        );

        logolabel.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(logolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(guestbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(staffbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guestbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guestbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestbtnMouseClicked
        Guest guest=new Guest();
        guest.setVisible(true);
        guest.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_guestbtnMouseClicked

    private void guestbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestbtn3MouseClicked
        Guest guest=new Guest();
        guest.setVisible(true);
        guest.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_guestbtn3MouseClicked

    private void guestbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestbtn1MouseClicked
        Guest guest=new Guest();
        guest.setVisible(true);
        guest.setLocationRelativeTo(null);
    }//GEN-LAST:event_guestbtn1MouseClicked

    private void staffbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffbtnMouseClicked
        Login login=new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_staffbtnMouseClicked

    private void staffbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffbtn2MouseClicked
        Login login=new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_staffbtn2MouseClicked

    private void staffbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffbtn3MouseClicked
        Login login=new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_staffbtn3MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel guestbtn;
    private javax.swing.JLabel guestbtn1;
    private javax.swing.JPanel guestbtn3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logolabel;
    private javax.swing.JLabel staffbtn;
    private javax.swing.JLabel staffbtn2;
    private javax.swing.JPanel staffbtn3;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
    
}
