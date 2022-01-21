/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ebs;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Yi Qing Tan
 */
public class Payment extends javax.swing.JFrame {

    /** Creates new form Payment */
    public Payment() {
        initComponents();
        
        paymentpanel.setVisible(false);
        bill.setVisible(false);
        payment.setVisible(false);
        
        setIconImage();
        
        ImageIcon bill0=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bill.png")));
        Image bill1=bill0.getImage();
        Image bill2=bill1.getScaledInstance(bill.getWidth(),bill.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon b= new ImageIcon(bill2);
        bill.setIcon(b);
        
        //Guest Logo
        ImageIcon guest=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("guest.png")));
        Image img1=guest.getImage();
        Image img2=img1.getScaledInstance(guestIcon.getWidth(), guestIcon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon g=new ImageIcon(img2);
        guestIcon.setIcon(g);    
        
        //BackButton Logo
        ImageIcon back=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("backbutton.png")));
        Image back1=back.getImage();
        Image back2=back1.getScaledInstance(backBtn.getWidth(),backBtn.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon b1=new ImageIcon(back2);
        backBtn.setIcon(b1);
        
        //HomeButton Logo
        ImageIcon home=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("HomeButton.png")));
        Image home1=home.getImage();
        Image home2=home1.getScaledInstance(homeBtn.getWidth(),homeBtn.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon h=new ImageIcon(home2);
        homeBtn.setIcon(h);
        
        //Customer service logo
        ImageIcon cs=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("customerService.png")));
        Image cs1=cs.getImage();
        Image cs2=cs1.getScaledInstance(customerservice.getWidth(),customerservice.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon cs3=new ImageIcon(cs2);
        customerservice.setIcon(cs3);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        guestIcon = new javax.swing.JLabel();
        paymenttitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        searchtitle = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        paymentpanel = new javax.swing.JPanel();
        bill = new javax.swing.JLabel();
        payment = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        customerservice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electricity Billling System");

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setForeground(new java.awt.Color(255, 255, 51));

        guestIcon.setText("Staff");

        paymenttitle.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 48)); // NOI18N
        paymenttitle.setText("Payment");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guestIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paymenttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guestIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymenttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        searchtitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchtitle.setText("Search Account Number:");

        searchbtn.setBackground(new java.awt.Color(51, 51, 255));
        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("Search");
        searchbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchbtnMouseClicked(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(255, 51, 51));
        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });

        paymentpanel.setBackground(new java.awt.Color(255, 255, 51));
        paymentpanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paymentpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentpanelMouseClicked(evt);
            }
        });

        bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billMouseClicked(evt);
            }
        });

        payment.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paymentpanelLayout = new javax.swing.GroupLayout(paymentpanel);
        paymentpanel.setLayout(paymentpanelLayout);
        paymentpanelLayout.setHorizontalGroup(
            paymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentpanelLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(paymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        paymentpanelLayout.setVerticalGroup(
            paymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentpanelLayout.createSequentialGroup()
                .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backBtn.setText("jLabel8");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });

        customerservice.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerservice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(searchtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(paymentpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchtitle)
                    .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn)
                    .addComponent(clearbtn))
                .addGap(37, 37, 37)
                .addComponent(paymentpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerservice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtnMouseClicked
        try{
        ViewData vd=new ViewData();
        vd.loadUserList();
        Sort srt=new Sort();
        srt.BubbleSort(vd.userRec);
        String accNum=searchtxt.getText();
        long aNum=Long.parseLong(accNum);
        Search sch=new Search();
        int index=sch.BinarySearch(aNum, vd.userRec);
        payment.setText("RM"+vd.userRec.get(index).getcCharge());
        paymentpanel.setVisible(true);
        bill.setVisible(true);
        payment.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Data not found");
        }
       
    }//GEN-LAST:event_searchbtnMouseClicked

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        paymentpanel.setVisible(false);
        bill.setVisible(false);
        payment.setVisible(false);
    }//GEN-LAST:event_clearbtnMouseClicked

    private void billMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billMouseClicked
        int response=JOptionPane.showConfirmDialog(rootPane,"Confirm Payment","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(response==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Payment successful");
            paymentpanel.setVisible(false);
        bill.setVisible(false);
        payment.setVisible(false);
        }
    }//GEN-LAST:event_billMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        Guest guest=new Guest();
        guest.setVisible(true);
        this.dispose();
        guest.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        Menu menu=new Menu();
        menu.setVisible(true);
        this.dispose();
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_homeBtnMouseClicked

    private void paymentpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentpanelMouseClicked
        int response=JOptionPane.showConfirmDialog(rootPane,"Confirm Payment","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(response==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Payment successful");
            paymentpanel.setVisible(false);
        bill.setVisible(false);
        payment.setVisible(false);
        }
    }//GEN-LAST:event_paymentpanelMouseClicked

    private void paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentMouseClicked
        int response=JOptionPane.showConfirmDialog(rootPane,"Confirm Payment","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(response==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Payment successful");
        paymentpanel.setVisible(false);
        bill.setVisible(false);
        payment.setVisible(false);
        }
    }//GEN-LAST:event_paymentMouseClicked

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel bill;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel customerservice;
    private javax.swing.JLabel guestIcon;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel payment;
    private javax.swing.JPanel paymentpanel;
    private javax.swing.JLabel paymenttitle;
    private javax.swing.JButton searchbtn;
    private javax.swing.JLabel searchtitle;
    private javax.swing.JTextField searchtxt;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }

}
