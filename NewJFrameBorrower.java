/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.JFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Divya
 */
public class NewJFrameBorrower extends javax.swing.JFrame {
int max_card_no = 0;
Connection conn = null;
ResultSet rs = null;
ResultSet rs1 = null;
ResultSet rs2 = null;
ResultSet rs3 = null;
ResultSet rs4 = null;
ResultSet rs5 = null;
PreparedStatement pst = null;
Statement stmt = null;
Statement stmt1 = null;
Statement stmt2 = null;
Statement stmt3 = null;
Statement stmt4 = null;
Statement stmt5 = null;
DefaultTableModel model;
Boolean tupleExists = false;
String BorrowerTable_card_no = null;

    /**
     * Creates new form NewJFrameBorrower
     */
    public NewJFrameBorrower() {
        initComponents();
        try {
             PayFineButton.setVisible(false);
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "divya");
         // Create a SQL statement object and execute the query.
	   stmt = conn.createStatement();
            stmt1 = conn.createStatement();
             stmt2 = conn.createStatement();
		 stmt3 = conn.createStatement();
                  stmt4 = conn.createStatement();
                  stmt5 = conn.createStatement();
			// Set the current database, if not already set in the getConnection
			// Execute a SQL statement
			stmt.execute("use library;");
                        stmt1.execute("use library;");
                        stmt2.execute("use library;");
                        stmt3.execute("use library;");
                        stmt4.execute("use library;");
                        stmt5.execute("use library;");
     } catch (SQLException ex) {
         Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        FirstnameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        AddressTextField = new javax.swing.JTextField();
        PhoneTextField = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();
        ShowBorrowers = new javax.swing.JButton();
        CityLabel = new javax.swing.JLabel();
        CityTextField = new javax.swing.JTextField();
        Statelabel = new javax.swing.JLabel();
        StateTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BorrowerTable = new javax.swing.JTable();
        CheckFineButton = new javax.swing.JButton();
        PayFineButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("                           NEW BORROWER REGISTRATION");

        FirstNameLabel.setText("FirstName");

        LastNameLabel.setText("LastName");

        AddressLabel.setText("Street");

        PhoneLabel.setText("Phone");

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        FirstnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnameTextFieldActionPerformed(evt);
            }
        });

        LastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextFieldActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        ShowBorrowers.setText("Show Borrowers");
        ShowBorrowers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBorrowersActionPerformed(evt);
            }
        });

        CityLabel.setText("City");

        Statelabel.setText("State");

        StateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateTextFieldActionPerformed(evt);
            }
        });

        BorrowerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        BorrowerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrowerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BorrowerTable);

        CheckFineButton.setText("Check Fine");
        CheckFineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckFineButtonActionPerformed(evt);
            }
        });

        PayFineButton.setText("PayFine");
        PayFineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayFineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                            .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LastNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                .addComponent(PhoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                    .addComponent(PhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AddressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                        .addComponent(LastNameTextField)
                                        .addComponent(FirstnameTextField)
                                        .addComponent(CityTextField)))))
                        .addComponent(StateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CityLabel)
                    .addComponent(Statelabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(ShowBorrowers, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(CheckFineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(PayFineButton)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowBorrowers, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckFineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameLabel)
                            .addComponent(FirstnameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastNameLabel)
                            .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressLabel)
                            .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CityLabel)
                            .addComponent(CityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Statelabel)
                            .addComponent(StateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PhoneLabel)
                            .addComponent(PhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PayFineButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
@Override
    public void setDefaultCloseOperation(int operation) {
        //super.setDefaultCloseOperation(operation); 
        super.setDefaultCloseOperation(NewJFrame2.DISPOSE_ON_CLOSE);//To change body of generated methods, choose Tools | Templates.
    }
    private void FirstnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnameTextFieldActionPerformed

    private void LastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTextFieldActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        FirstnameTextField.setText("");
        LastNameTextField.setText("");
        AddressTextField.setText("");
        PhoneTextField.setText("");
        CityTextField.setText("");
        StateTextField.setText("");
        
        
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
      tupleExists = false;
        if(FirstnameTextField.getText().equals(""))
        JOptionPane.showMessageDialog(null, "Please Enter FirstName");
       else if(LastNameTextField.getText().equals(""))
           JOptionPane.showMessageDialog(null, "Please Enter LastName");
       else if(AddressTextField.getText().equals(""))
           JOptionPane.showMessageDialog(null, "Please Enter Street Address");
       else if(CityTextField.getText().equals(""))
           JOptionPane.showMessageDialog(null, "Please Enter City Address");
       else if(StateTextField.getText().equals(""))
           JOptionPane.showMessageDialog(null, "Please Enter State Address");
       //Checking no empty values for fields
       else if(!(FirstnameTextField.getText().equals("") )&&!( LastNameTextField.getText().equals("") )&&(! AddressTextField.getText().equals(""))
               && (!CityTextField.getText().equals("")) &&(! StateTextField.getText().equals(""))){
         
     try {
       //checking a member already exists
       rs1 = stmt.executeQuery("SELECT Fname,Lname,Address FROM borrower WHERE Fname = '"+FirstnameTextField.getText()+
               "' AND Lname = '"+LastNameTextField.getText()+"' AND Address = '"+AddressTextField.getText()+
               "' AND City = '"+CityTextField.getText()+"' AND State = '"+StateTextField.getText()+"';");
       while(rs1.next()){
           tupleExists = true;
           JOptionPane.showMessageDialog(null, "Member Already Exists.Cannot create more than one account");
       }
     if(tupleExists == false){
 try {
     rs = stmt.executeQuery("SELECT MAX(card_no) AS card_number FROM borrower;");
     while (rs.next()) {
     max_card_no = rs.getInt("card_number");
     max_card_no++;
     }
     String sql = "INSERT INTO BORROWER (Card_no,Fname,Lname,Address,City,State,Phone,No_of_bookloans) Values("+max_card_no+ ",'"+FirstnameTextField.getText()+"','"+LastNameTextField.getText()+"','"+
         AddressTextField.getText()+"','"+CityTextField.getText()+"','"+StateTextField.getText()+"','"+ PhoneTextField.getText()+"',"+0+");";
     //rs = stmt.executeQuery("SELECT * FROM book;");
     stmt = conn.createStatement();
      stmt.executeUpdate(sql);
      JOptionPane.showMessageDialog(null,"Registered Successfully: Card_no : "+max_card_no);
     //BookTable.setModel(DbUtils.resultSetToTableModel(rs));
 } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null,ex);
    
     //Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
 }
   
     }
   } catch (SQLException ex) {
               Logger.getLogger(NewJFrameBorrower.class.getName()).log(Level.SEVERE,null,ex);
        
     }
           
    
       }
    
    
    
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void StateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateTextFieldActionPerformed

    private void ShowBorrowersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBorrowersActionPerformed
 try {
         String sql = "SELECT * FROM borrower;";
         pst = conn.prepareStatement(sql);
         rs = pst.executeQuery(sql);
         BorrowerTable.setModel(DbUtils.resultSetToTableModel(rs));
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,ex);
        
            }    
    }//GEN-LAST:event_ShowBorrowersActionPerformed

    private void CheckFineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckFineButtonActionPerformed
         PayFineButton.setVisible(true);
         BorrowerTable.clearSelection();
         try {
              //rs1 = stmt.executeQuery("DELETE FROM FINES;");
         rs = stmt.executeQuery("SELECT loan_id,(date_in - due_date)*0.25 AS Fine from book_loans where date_in > due_date ;");
          //BorrowerTable.setModel(DbUtils.resultSetToTableModel(rs));
         while(rs.next()){
            int loan_id = rs.getInt("loan_id");
             float fine = rs.getFloat("fine");
             System.out.println("Im here"+ loan_id);
             System.out.println("Im here fine"+ fine);
                  //String date = rs.getDate("Due_date").toString();
            rs1 = stmt1.executeQuery("SELECT COUNT(*) AS present from fines where loan_id ="+loan_id+";");
            while(rs1.next()){
                int present = rs1.getInt("present"); 
                System.out.println("Im here present"+ present);
             
                
                if(present == 0){
                  String sql2 = "INSERT INTO FINES VALUES("+loan_id+","+fine+",'false');";
                 pst = conn.prepareStatement(sql2);
                  pst.executeUpdate(sql2);
                }
                else{
                 rs2 = stmt2.executeQuery("SELECT  * from fines where loan_id ="+loan_id+";"); 
                 while(rs2.next()){
                boolean paid = rs2.getBoolean("paid"); 
                System.out.println("Im here paid"+ paid);
                 }
                }
            }   
        }
         
        ///////////////////////////////////////////////////////// 
        rs3 = stmt3.executeQuery("SELECT loan_id,(CURDATE() - due_date)*0.25 AS Fine from book_loans where CURDATE() > due_date AND date_in is null ;");
          //BorrowerTable.setModel(DbUtils.resultSetToTableModel(rs));
         while(rs3.next()){
            int loan_id_date_in_null = rs3.getInt("loan_id");
             float fine_date_in_null = rs3.getFloat("fine");
             System.out.println("Im here dateinnull"+ loan_id_date_in_null);
             System.out.println("Im here fine dateinnull"+ fine_date_in_null);
                  //String date = rs.getDate("Due_date").toString();
            rs4 = stmt4.executeQuery("SELECT COUNT(*) AS present from fines where loan_id ="+loan_id_date_in_null+";");
            while(rs4.next()){
                int presentnull = rs4.getInt("present"); 
                System.out.println("Im here present null"+ presentnull);
             
                
                if(presentnull == 0){
                  String sql4 = "INSERT INTO FINES VALUES("+loan_id_date_in_null+","+fine_date_in_null+",'false');";
                 pst = conn.prepareStatement(sql4);
                  pst.executeUpdate(sql4);
                }
                else{
                 rs5 = stmt5.executeQuery("SELECT  * from fines where loan_id ="+loan_id_date_in_null+";"); 
                 
                 while(rs5.next()){
                     
                boolean paid = rs5.getBoolean("paid"); 
                System.out.println("Im here paid"+ paid);
                if(paid == false){
                     String sql5 = "UPDATE FINES,book_loans SET fine_amt = ((CURDATE() - book_loans.due_date)*0.25)  WHERE fines.loan_id ="
                             +loan_id_date_in_null+" AND fines.loan_id = book_loans.loan_id;";
        pst = conn.prepareStatement(sql5);
        pst.executeUpdate(sql5);
                }
                 }
                }
            }
         }
         
        rs1 = stmt1.executeQuery("select book_loans.card_no,Fname,Lname,SUM(fine_amt) AS Fine from fines,book_loans,borrower where book_loans.loan_id = fines.loan_id  "
                + "AND book_loans.card_no = borrower.card_no  AND paid = 'false' GROUP BY card_no;"); 
          BorrowerTable.setModel(DbUtils.resultSetToTableModel(rs1));
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,ex);
        
            }    
                   
         
    }//GEN-LAST:event_CheckFineButtonActionPerformed

    private void PayFineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayFineButtonActionPerformed
    try {
        rs1 = stmt1.executeQuery("select fines.loan_id AS loan_id from fines,book_loans where book_loans.loan_id = fines.loan_id AND book_loans.card_no = "+BorrowerTable_card_no +";");  
       // BorrowerTable.setModel(DbUtils.resultSetToTableModel(rs1));
        while(rs1.next()){
             int loan_id = rs1.getInt("loan_id");
            String sql5 = "UPDATE FINES SET fine_amt = 0.00,paid = 'true'  WHERE loan_id ="+loan_id+";";
        pst = conn.prepareStatement(sql5);
        pst.executeUpdate(sql5);
        }
        JOptionPane.showMessageDialog(null,"Fine Paid Successfully");
    } catch (SQLException ex) {
        Logger.getLogger(NewJFrameBorrower.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_PayFineButtonActionPerformed

    private void BorrowerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowerTableMouseClicked
         int row = BorrowerTable.getSelectedRow();
         BorrowerTable_card_no = BorrowerTable.getModel().getValueAt(row, 0).toString();
    //System.out.println("TABLE CLICK VALUE" + searchtable_book_id);// TODO add your handling code here:
    }//GEN-LAST:event_BorrowerTableMouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrameBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameBorrower.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameBorrower().setVisible(true);
               
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JTable BorrowerTable;
    private javax.swing.JButton CheckFineButton;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField CityTextField;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstnameTextField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JButton PayFineButton;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton ShowBorrowers;
    private javax.swing.JTextField StateTextField;
    private javax.swing.JLabel Statelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
