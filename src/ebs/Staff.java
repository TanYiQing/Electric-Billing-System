/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebs;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Yi Qing Tan
 */
public class Staff extends javax.swing.JFrame {

    /**
     * Creates new form Staff
     */
    public Staff() {
        initComponents();
        
        setIconImage();
        
        ImageIcon staff=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Stafficon.png")));
        Image img1= staff.getImage();
        Image img2=img1.getScaledInstance(staffIcon.getWidth(),staffIcon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon s=new ImageIcon(img2);     
        staffIcon.setIcon(s);
        
        //View Data Logo
        ImageIcon view =new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("viewData.png")));
        Image view1=view.getImage();
        Image view2=view1.getScaledInstance(viewData.getWidth(),viewData.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon v=new ImageIcon(view2);
        viewData.setIcon(v);
        
        //Add Data Logo
        ImageIcon add=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("addData.png")));
        Image add1=add.getImage();
        Image add2=add1.getScaledInstance(addDataicon.getWidth(),addDataicon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon a=new ImageIcon(add2);
        addDataicon.setIcon(a);
        
        //Edit Data Logo
        ImageIcon edit=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("editData.png")));
        Image edit1=edit.getImage();
        Image edit2=edit1.getScaledInstance(editDataIcon.getWidth(),editDataIcon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon e=new ImageIcon(edit2);
        editDataIcon.setIcon(e);
        
        //Delete Data Logo
        ImageIcon del=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("deleteData.png")));
        Image del1=del.getImage();
        Image del2=del1.getScaledInstance(deleteDataIcon.getWidth(),deleteDataIcon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon d=new ImageIcon(del2);
        deleteDataIcon.setIcon(d);
        
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
        
        //Customer Service Logo
        ImageIcon cs=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("customerService.png")));
        Image cs1=cs.getImage();
        Image cs2=cs1.getScaledInstance(customerservice.getWidth(),customerservice.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon cs3=new ImageIcon(cs2);
        customerservice.setIcon(cs3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        staffIcon = new javax.swing.JLabel();
        stafftitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        addDataLabel = new javax.swing.JPanel();
        addDataicon = new javax.swing.JLabel();
        addDatatxt = new javax.swing.JLabel();
        editdatapanel = new javax.swing.JPanel();
        editdatatxt = new javax.swing.JLabel();
        editDataIcon = new javax.swing.JLabel();
        deletedatapanel = new javax.swing.JPanel();
        deletedatatxt = new javax.swing.JLabel();
        deleteDataIcon = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        customerservice = new javax.swing.JLabel();
        viewDataLabel = new javax.swing.JPanel();
        viewData = new javax.swing.JLabel();
        viewDatatxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electricity Billing System");

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 51));

        staffIcon.setText("Staff");

        stafftitle.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 48)); // NOI18N
        stafftitle.setText("Staff");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staffIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stafftitle, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stafftitle, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        addDataLabel.setBackground(new java.awt.Color(255, 153, 153));
        addDataLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDataLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDataLabelMouseClicked(evt);
            }
        });

        addDataicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDataiconMouseClicked(evt);
            }
        });

        addDatatxt.setFont(new java.awt.Font("News701 BT", 1, 24)); // NOI18N
        addDatatxt.setText("Add Data");
        addDatatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDatatxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addDataLabelLayout = new javax.swing.GroupLayout(addDataLabel);
        addDataLabel.setLayout(addDataLabelLayout);
        addDataLabelLayout.setHorizontalGroup(
            addDataLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDataLabelLayout.createSequentialGroup()
                .addGroup(addDataLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDataLabelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(addDataicon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addDataLabelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addDatatxt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addDataLabelLayout.setVerticalGroup(
            addDataLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDataLabelLayout.createSequentialGroup()
                .addComponent(addDataicon, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addDatatxt)
                .addGap(12, 12, 12))
        );

        editdatapanel.setBackground(new java.awt.Color(153, 153, 255));
        editdatapanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editdatapanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editdatapanelMouseClicked(evt);
            }
        });

        editdatatxt.setFont(new java.awt.Font("News701 BT", 1, 24)); // NOI18N
        editdatatxt.setText("Edit Data");
        editdatatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editdatatxtMouseClicked(evt);
            }
        });

        editDataIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editDataIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editdatapanelLayout = new javax.swing.GroupLayout(editdatapanel);
        editdatapanel.setLayout(editdatapanelLayout);
        editdatapanelLayout.setHorizontalGroup(
            editdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editdatapanelLayout.createSequentialGroup()
                .addGroup(editdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editdatapanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(editdatatxt))
                    .addGroup(editdatapanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(editDataIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        editdatapanelLayout.setVerticalGroup(
            editdatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editdatapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editDataIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editdatatxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deletedatapanel.setBackground(new java.awt.Color(153, 255, 153));
        deletedatapanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deletedatapanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletedatapanelMouseClicked(evt);
            }
        });

        deletedatatxt.setFont(new java.awt.Font("News701 BT", 1, 24)); // NOI18N
        deletedatatxt.setText("Delete Data");
        deletedatatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletedatatxtMouseClicked(evt);
            }
        });

        deleteDataIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteDataIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout deletedatapanelLayout = new javax.swing.GroupLayout(deletedatapanel);
        deletedatapanel.setLayout(deletedatapanelLayout);
        deletedatapanelLayout.setHorizontalGroup(
            deletedatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletedatapanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deletedatatxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(deletedatapanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(deleteDataIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deletedatapanelLayout.setVerticalGroup(
            deletedatapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletedatapanelLayout.createSequentialGroup()
                .addComponent(deleteDataIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(deletedatatxt))
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

        viewDataLabel.setBackground(new java.awt.Color(204, 255, 255));
        viewDataLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewDataLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDataLabelMouseClicked(evt);
            }
        });

        viewData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDataMouseClicked(evt);
            }
        });

        viewDatatxt.setFont(new java.awt.Font("News701 BT", 1, 24)); // NOI18N
        viewDatatxt.setText("View Data");
        viewDatatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDatatxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewDataLabelLayout = new javax.swing.GroupLayout(viewDataLabel);
        viewDataLabel.setLayout(viewDataLabelLayout);
        viewDataLabelLayout.setHorizontalGroup(
            viewDataLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLabelLayout.createSequentialGroup()
                .addGroup(viewDataLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewDataLabelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewDatatxt))
                    .addGroup(viewDataLabelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(viewData, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        viewDataLabelLayout.setVerticalGroup(
            viewDataLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLabelLayout.createSequentialGroup()
                .addComponent(viewData, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewDatatxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customerservice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deletedatapanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editdatapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editdatapanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deletedatapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(viewDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(customerservice, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDatatxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDatatxtMouseClicked
        AddData add=new AddData();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_addDatatxtMouseClicked

    private void addDataiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDataiconMouseClicked
        AddData add=new AddData();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_addDataiconMouseClicked

    private void addDataLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDataLabelMouseClicked
        AddData add=new AddData();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_addDataLabelMouseClicked

    private void editdatatxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editdatatxtMouseClicked
        EditData cb=new EditData();
        cb.setVisible(true);
        this.dispose();
        cb.setLocationRelativeTo(null);
    }//GEN-LAST:event_editdatatxtMouseClicked

    private void editDataIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDataIconMouseClicked
        EditData cb=new EditData();
        cb.setVisible(true);
        this.dispose();
        cb.setLocationRelativeTo(null);
    }//GEN-LAST:event_editDataIconMouseClicked

    private void editdatapanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editdatapanelMouseClicked
        EditData cb=new EditData();
        cb.setVisible(true);
        this.dispose();
        cb.setLocationRelativeTo(null);
    }//GEN-LAST:event_editdatapanelMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        Menu menu=new Menu();
        menu.setVisible(true);
        this.dispose();
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        Menu menu=new Menu();
        menu.setVisible(true);
        this.dispose();
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_homeBtnMouseClicked

    private void viewDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDataMouseClicked
        ViewData view=new ViewData();
        view.setVisible(true);
        this.dispose();
        view.setLocationRelativeTo(null);
    }//GEN-LAST:event_viewDataMouseClicked

    private void viewDatatxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDatatxtMouseClicked
        ViewData view=new ViewData();
        view.setVisible(true);
        this.dispose();
        view.setLocationRelativeTo(null);
    }//GEN-LAST:event_viewDatatxtMouseClicked

    private void viewDataLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDataLabelMouseClicked
        
        ViewData view=new ViewData();
        view.setVisible(true);
        this.dispose();
        view.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_viewDataLabelMouseClicked

    private void deleteDataIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteDataIconMouseClicked
        try{
        DeleteData del=new DeleteData();
        del.setVisible(true);
        del.setLocationRelativeTo(null);
        this.dispose();
        }catch(FileNotFoundException ex){
           Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteDataIconMouseClicked

    private void deletedatapanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletedatapanelMouseClicked
        try{
        DeleteData del=new DeleteData();
        del.setVisible(true);
        del.setLocationRelativeTo(null);
        this.dispose();
        }catch(FileNotFoundException ex){
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deletedatapanelMouseClicked

    private void deletedatatxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletedatatxtMouseClicked
  
        try {
            DeleteData del=new DeleteData();
            del.setVisible(true);
            del.setLocationRelativeTo(null);
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_deletedatatxtMouseClicked

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addDataLabel;
    private javax.swing.JLabel addDataicon;
    private javax.swing.JLabel addDatatxt;
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel customerservice;
    private javax.swing.JLabel deleteDataIcon;
    private javax.swing.JPanel deletedatapanel;
    private javax.swing.JLabel deletedatatxt;
    private javax.swing.JLabel editDataIcon;
    private javax.swing.JPanel editdatapanel;
    private javax.swing.JLabel editdatatxt;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel staffIcon;
    private javax.swing.JLabel stafftitle;
    private javax.swing.JLabel viewData;
    private javax.swing.JPanel viewDataLabel;
    private javax.swing.JLabel viewDatatxt;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
}
