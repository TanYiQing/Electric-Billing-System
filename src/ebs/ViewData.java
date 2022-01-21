/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebs;

import static ebs.AddData.userList;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yi Qing Tan
 */
public class ViewData extends javax.swing.JFrame {

    /**
     * Creates new form ViewData
     */
    Sort srt=new Sort();
    ArrayList <User> userRec=new ArrayList<User>();
    static String aN,iN,date,nm,ads,mN,pM,cM,tU,uB,cC;
    int index;
    Search sch=new Search();

    public ViewData() {
            initComponents();
            setIconImage();
            ImageIcon stf=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Stafficon.png")));
            Image stf1= stf.getImage();
            Image stf2=stf1.getScaledInstance(staff1.getWidth(),staff1.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon s=new ImageIcon(stf2);
            staff1.setIcon(s);
            ImageIcon bck=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("BackButton.png")));
            Image bck1=bck.getImage();
            Image bck2=bck1.getScaledInstance(backBtn.getWidth(), backBtn.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon b= new ImageIcon(bck2);
            backBtn.setIcon(b);
            ImageIcon home=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("HomeButton.png")));
            Image home1=home.getImage();
            Image home2=home1.getScaledInstance(homeBtn.getWidth(), homeBtn.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon h= new ImageIcon(home2);
            homeBtn.setIcon(h);
            ImageIcon cs=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("customerservice.png")));
            Image cs1=cs.getImage();
            Image cs2=cs1.getScaledInstance(csBtn.getWidth(), csBtn.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon c= new ImageIcon(cs2);
            csBtn.setIcon(c);
            
            //Recent Add Data Table
            DefaultTableModel model=(DefaultTableModel) recentTable.getModel();
            Object rowData[]=new Object[11];
            for(User us:userList){
                rowData[0]=us.getaN();
                rowData[1]=us.getiN();
                rowData[2]=us.getDate();
                rowData[3]=us.getnm();
                rowData[4]=us.getads();
                rowData[5]=us.getmN();
                rowData[6]=us.getpM();
                rowData[7]=us.getcM();
                rowData[8]=us.gettUsage();
                rowData[9]=us.getuBill();
                rowData[10]=us.getcCharge();
                model.addRow(rowData);
            }
            
            //All Data Table
            loadUserList();
    
            DefaultTableModel mdl=(DefaultTableModel)alldatatable.getModel();
            Object rowdata[]=new Object[11];
            srt.BubbleSort(userRec);
            for(int i=0;i<userRec.size();i++){
            rowdata[0]=userRec.get(i).getaN();
            rowdata[1]=userRec.get(i).getiN();
            rowdata[2]=userRec.get(i).getDate();
            rowdata[3]=userRec.get(i).getnm();
            rowdata[4]=userRec.get(i).getads();
            rowdata[5]=userRec.get(i).getmN();
            rowdata[6]=userRec.get(i).getpM();
            rowdata[7]=userRec.get(i).getcM();
            rowdata[8]=userRec.get(i).gettUsage();
            rowdata[9]=userRec.get(i).getuBill();
            rowdata[10]=userRec.get(i).getcCharge();
                mdl.addRow(rowdata);
            }
        
        }
        
    public void loadUserList(){
        try {
            File user=new File("User List.txt");
            Scanner scan=new Scanner(user);
            while (scan.hasNext()){
                String userRecord=scan.nextLine();
                Scanner input=new Scanner(userRecord);
                input.useDelimiter("#");
                aN=input.next();
                iN=input.next();
                date=input.next();
                nm=input.next();
                ads=input.next();
                mN=input.next();
                pM=input.next();
                cM=input.next();
                tU=input.next();
                uB=input.next();
                cC=input.next();
                userRec.add(new User(date,aN,iN,nm,ads,mN,pM,cM,tU,uB,cC));
            
    }
        } catch (FileNotFoundException ex) {
    
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        staff1 = new javax.swing.JLabel();
        viewdatatitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        recentdata = new javax.swing.JLabel();
        alldata = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recentTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        alldatatable = new javax.swing.JTable();
        backBtn = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        csBtn = new javax.swing.JLabel();
        searchtitle = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        clearbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electricity Billing System");

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 51));

        staff1.setText("Guest");

        viewdatatitle.setFont(new java.awt.Font("Adobe Gothic Std B", 1, 48)); // NOI18N
        viewdatatitle.setText("View Data");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staff1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewdatatitle, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staff1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewdatatitle, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        recentdata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recentdata.setText("Recently Added Data");

        alldata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alldata.setText("All Data (Sorted by Account Number)");

        recentTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        recentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Number", "Invois Number", "Date", "Name", "Address", "Meter Number", "Previous Meter", "Current Meter", "Total Usage", "Previous Unpaid Bill(RM)", "Current Charge(RM)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(recentTable);

        alldatatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Number", "Invois Number", "Date", "Name", "Address", "Meter Number", "Previous Meter", "Current Meter", "Total Usage", "Previous Unpaid Bill(RM)", "Current Charge(RM)"
            }
        ));
        jScrollPane2.setViewportView(alldatatable);

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

        csBtn.setText("jLabel10");

        searchtitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchtitle.setText("Search:");

        searchtxt.setText("Account Number or Name");
        searchtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchtxtMouseClicked(evt);
            }
        });

        searchbtn.setBackground(new java.awt.Color(51, 51, 255));
        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchbtn.setText("Search");
        searchbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchbtnMouseClicked(evt);
            }
        });

        searchTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Number", "Invois Number", "Date", "Name", "Address", "Meter Number", "Previous Meter", "Current Meter", "Total Usage", "Previous Unpaid Bill(RM)", "Current Charge(RM)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(searchTable);

        clearbtn.setBackground(new java.awt.Color(255, 51, 51));
        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1413, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(591, 591, 591)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(csBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alldata, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recentdata, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1413, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(493, 493, 493))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchtitle)
                    .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn)
                    .addComponent(clearbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(recentdata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(alldata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(csBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        Menu menu=new Menu();
        menu.setVisible(true);
        this.dispose();
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_homeBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        Staff staff=new Staff();
        staff.setVisible(true);
        this.dispose();
        staff.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBtnMouseClicked
    
    private void searchbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchbtnMouseClicked
            try{
            try{
            String accNum=searchtxt.getText();
            long aNum=Long.parseLong(accNum);
            srt.BubbleSort(userRec);
            index=sch.BinarySearch(aNum, userRec);
            }catch(NumberFormatException ex){
            String name=searchtxt.getText();
            srt.BubbleSortName(userRec);
            index=sch.BinarySearchName(name,userRec);
                  
            }
            DefaultTableModel md=(DefaultTableModel)searchTable.getModel();
            
                Object row[]=new Object[11];
        row[0]=userRec.get(index).getaN();
        row[1]=userRec.get(index).getiN();
        row[2]=userRec.get(index).getDate();
        row[3]=userRec.get(index).getnm();
        row[4]=userRec.get(index).getads();
        row[5]=userRec.get(index).getmN();
        row[6]=userRec.get(index).getpM();
        row[7]=userRec.get(index).getcM();
        row[8]=userRec.get(index).gettUsage();
        row[9]=userRec.get(index).getuBill();
        row[10]=userRec.get(index).getcCharge();
                md.addRow(row);
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Data not found");
            }
    }//GEN-LAST:event_searchbtnMouseClicked

    private void searchtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtxtMouseClicked
        searchtxt.setText("");
        
    }//GEN-LAST:event_searchtxtMouseClicked

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        try{
        DefaultTableModel tm=(DefaultTableModel)searchTable.getModel();
        tm.removeRow(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "No data to be clear");
        }
    }//GEN-LAST:event_clearbtnMouseClicked
    
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
            java.util.logging.Logger.getLogger(ViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewData().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ViewData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alldata;
    private javax.swing.JTable alldatatable;
    private javax.swing.JLabel backBtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel csBtn;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable recentTable;
    private javax.swing.JLabel recentdata;
    private javax.swing.JTable searchTable;
    private javax.swing.JButton searchbtn;
    private javax.swing.JLabel searchtitle;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JLabel staff1;
    private javax.swing.JLabel viewdatatitle;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
    
    public void clearData(){
        
        DefaultTableModel model=(DefaultTableModel)alldatatable.getModel();
        while(model.getRowCount()>0){
        for(int i=0;i<model.getRowCount();i++)
        {
            model.removeRow(i);
        }
        }
    }


}