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
public class NewJFrameBookLoan2 extends javax.swing.JFrame {

Connection conn = null;
ResultSet rs = null;
ResultSet rs1 = null;
ResultSet rs2 = null;
ResultSet rs3 = null;
PreparedStatement pst = null;
Statement stmt = null;
Statement stmt1 = null;
DefaultTableModel model;
int LoanID = 0;
int BookLoanNumber = 0;
Boolean tupleExists = false;
String table_loan_id = null;
String table_book_id = null;
String table_branch_id = null;
String table_card_no = null;
    /**
     * Creates new form NewJFrameBookLoan2
     */
    public NewJFrameBookLoan2() {
    initComponents();
        try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "divya");
         // Create a SQL statement object and execute the query.
	   stmt = conn.createStatement();
		
			// Set the current database, if not already set in the getConnection
			// Execute a SQL statement
			stmt.execute("use library;");
                         stmt1 = conn.createStatement();
		
			// Set the current database, if not already set in the getConnection
			// Execute a SQL statement
			stmt1.execute("use library;");
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
        jSplitPane1 = new javax.swing.JSplitPane();
        jSeparator1 = new javax.swing.JSeparator();
        BookIdOutTextField = new javax.swing.JTextField();
        ClearOutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BranchIdOutTextField = new javax.swing.JTextField();
        CardNumberOutTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BookIdInTextField = new javax.swing.JTextField();
        BorrowerNameInTextField = new javax.swing.JTextField();
        CardNumberInTextField = new javax.swing.JTextField();
        ClearInButton = new javax.swing.JButton();
        CheckInButton = new javax.swing.JButton();
        CheckOutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CheckInTable = new javax.swing.JTable();
        SearchBookLoan = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ClearOutButton.setText("Clear");
        ClearOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearOutButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("BOOK CHECK OUT");

        jLabel3.setText("BOOK CHECK IN");

        jLabel4.setText("Book ID");

        jLabel5.setText("Branch ID");

        jLabel6.setText("Card Number");

        jLabel7.setText("Book ID");

        jLabel8.setText("Borrower Name");

        jLabel9.setText("Card Number");

        BookIdInTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIdInTextFieldActionPerformed(evt);
            }
        });

        BorrowerNameInTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowerNameInTextFieldActionPerformed(evt);
            }
        });

        CardNumberInTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardNumberInTextFieldActionPerformed(evt);
            }
        });

        ClearInButton.setText("Clear");
        ClearInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearInButtonActionPerformed(evt);
            }
        });

        CheckInButton.setText("Check In");
        CheckInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInButtonActionPerformed(evt);
            }
        });

        CheckOutButton.setText("Check Out");
        CheckOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutButtonActionPerformed(evt);
            }
        });

        CheckInTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        CheckInTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckInTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CheckInTable);

        SearchBookLoan.setText("Search Book Loan");
        SearchBookLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBookLoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CardNumberOutTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(BranchIdOutTextField)
                                    .addComponent(BookIdOutTextField))))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(CheckOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(ClearOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(CheckInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BookIdInTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(BorrowerNameInTextField)
                                            .addComponent(CardNumberInTextField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(ClearInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(SearchBookLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BookIdOutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(BranchIdOutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(CardNumberOutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(BookIdInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(BorrowerNameInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(CardNumberInTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CheckOutButton)
                                    .addComponent(ClearOutButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(SearchBookLoan)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CheckInButton)
                                    .addComponent(ClearInButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      @Override
    public void setDefaultCloseOperation(int operation) {
        //super.setDefaultCloseOperation(operation); 
        super.setDefaultCloseOperation(NewJFrame2.DISPOSE_ON_CLOSE);//To change body of generated methods, choose Tools | Templates.
    }
    private void ClearOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearOutButtonActionPerformed
        BookIdOutTextField.setText("");
        BranchIdOutTextField.setText("");
        CardNumberOutTextField.setText("");
    }//GEN-LAST:event_ClearOutButtonActionPerformed

    private void ClearInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearInButtonActionPerformed
        
        BookIdInTextField.setText("");
        BorrowerNameInTextField.setText("");
        CardNumberInTextField.setText("");
    }//GEN-LAST:event_ClearInButtonActionPerformed

    private void CheckOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutButtonActionPerformed
    int Copy = 10;
    int AvailableCopy = 10;
        try {
            //Checking whether a branch has enough book copies
            rs2 = stmt1.executeQuery("SELECT * FROM BOOK_COPIES WHERE Book_id = '"+BookIdOutTextField.getText()+"' AND Branch_Id ="
                    +BranchIdOutTextField.getText()+ ";");
       while (rs2.next()) {
       Copy = rs2.getInt("No_of_copies"); 
       AvailableCopy = rs2.getInt("No_of_available_copies");
       }
       if(AvailableCopy <= 0 || Copy == 0){
           JOptionPane.showMessageDialog(null,"Sorry, This book is not available in this branch");
       }
       
       else{
            
            //checking whether a member has already 3 book loans
            
       rs2 = stmt1.executeQuery("SELECT * FROM BORROWER WHERE Card_no ="+CardNumberOutTextField.getText()+";");
       while (rs2.next()) {
       BookLoanNumber = rs2.getInt("No_of_bookloans"); 
       }
       if(BookLoanNumber == 3){
           JOptionPane.showMessageDialog(null,"This Person has already three bookLoans:Cannot complete checkout");
       }
else
       {
        rs = stmt.executeQuery("SELECT MAX(loan_id) AS LoanID FROM book_loans;");
        while (rs.next()) {
        LoanID = rs.getInt("LoanID");
        LoanID++;
        }
        
       String sql = "INSERT INTO BOOK_LOANS Values("+LoanID+ ",'"+BookIdOutTextField.getText()+"',"+BranchIdOutTextField.getText()+","+
         CardNumberOutTextField.getText()+",CURDATE(),DATE_ADD(CURDATE(),INTERVAL 14 DAY),"+ null +");";
      
        
      stmt = conn.createStatement();
      stmt.executeUpdate(sql);
     
      //updating borrower's no_of_bookLoans
       
       rs2 = stmt1.executeQuery("SELECT * FROM BORROWER WHERE Card_no ="+CardNumberOutTextField.getText()+";");
       while (rs2.next()) {
        BookLoanNumber = rs2.getInt("No_of_bookloans");
        BookLoanNumber++;
       }
       
       
       String sql2 = "UPDATE BORROWER SET No_of_bookloans ="+BookLoanNumber+" WHERE Card_no ="+CardNumberOutTextField.getText()+";";
        pst = conn.prepareStatement(sql2);
        pst.executeUpdate(sql2);
         
        //updating book_Copies remaining at each branch
        AvailableCopy--;
       String sql3 = "UPDATE BOOK_COPIES SET No_of_available_copies ="+AvailableCopy+" WHERE Book_id = '"+BookIdOutTextField.getText()+"' AND Branch_Id ="
                    +BranchIdOutTextField.getText()+ ";";
        pst = conn.prepareStatement(sql3);
        pst.executeUpdate(sql3);
        
      JOptionPane.showMessageDialog(null,"CheckOut Successfully: Loan_ID : "+LoanID);
    } 
        }
        }
        catch (SQLException ex) {
        Logger.getLogger(NewJFrameBookLoan2.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_CheckOutButtonActionPerformed

    private void SearchBookLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBookLoanActionPerformed
    try {
        CheckInTable.clearSelection();
        tupleExists = false;
        String string = BorrowerNameInTextField.getText();
        String Fname = null;
        String Lname = null;
        boolean fnameORlname = true;
        if(string.contains(" "))
        {
        fnameORlname = false;
        String[] parts = string.split(" ");
         Fname = parts[0]; 
         Lname = parts[1]; 
        }
else
    fnameORlname = true;
    
if(fnameORlname == true){
        
        //Only BookId entered
        if((!(BookIdInTextField.getText().equals("")))&&(BorrowerNameInTextField.getText().equals("")) &&(CardNumberInTextField.getText().equals("")))
        {
       rs3 = stmt1.executeQuery("SELECT * FROM BOOK_LOANS WHERE Book_id ='"+BookIdInTextField.getText()+"';");
        } 
     
        //Only CardNO entered
        if(((BookIdInTextField.getText().equals("")))&&(BorrowerNameInTextField.getText().equals("")) &&(!CardNumberInTextField.getText().equals("")))
        {
       rs3 = stmt1.executeQuery("SELECT * FROM BOOK_LOANS WHERE Card_no ='"+CardNumberInTextField.getText()+"';");
        } 
        
        //Only BorrowerName entered
        if(((BookIdInTextField.getText().equals("")))&&(!BorrowerNameInTextField.getText().equals("")) &&(CardNumberInTextField.getText().equals("")))
        {
           
       rs3 = stmt1.executeQuery("SELECT Loan_id,book_id,branch_id,Book_loans.card_no,date_out,Due_date,Date_in FROM BORROWER,BOOK_LOANS WHERE (Fname LIKE '%"
               +BorrowerNameInTextField.getText()+"%' OR Lname LIKE '%"+BorrowerNameInTextField.getText()+"%') AND Book_loans.card_no = Borrower.card_no  ;");
        } 
        //Only BookId And Card number entered
        if((!(BookIdInTextField.getText().equals("")))&&(BorrowerNameInTextField.getText().equals("")) &&(!CardNumberInTextField.getText().equals("")))
        {
       rs3 = stmt1.executeQuery("SELECT * FROM BOOK_LOANS WHERE Book_id ='"+BookIdInTextField.getText()+"' AND Card_no ='"
               +CardNumberInTextField.getText()+"';");
        }
         //Only BorrowerName And Card number entered
        if(((BookIdInTextField.getText().equals("")))&&(!BorrowerNameInTextField.getText().equals("")) &&(!CardNumberInTextField.getText().equals("")))
        {
       rs3 = stmt1.executeQuery("SELECT Loan_id,book_id,branch_id,Book_loans.card_no,date_out,Due_date,Date_in FROM BORROWER,BOOK_LOANS WHERE (Fname LIKE '%"
               +BorrowerNameInTextField.getText()+"%' OR Lname LIKE '%"+BorrowerNameInTextField.getText()
               +"%') AND Book_loans.card_no = Borrower.card_no AND Book_loans.Card_no ='"
               +CardNumberInTextField.getText()+"';");
        }
        //Only BorrowerName And BookId entered
        if(((!BookIdInTextField.getText().equals("")))&&(!BorrowerNameInTextField.getText().equals("")) &&(CardNumberInTextField.getText().equals("")))
        {
       rs3 = stmt1.executeQuery("SELECT Loan_id,book_id,branch_id,Book_loans.card_no,date_out,Due_date,Date_in FROM BORROWER,BOOK_LOANS WHERE (Fname LIKE '%"
               +BorrowerNameInTextField.getText()+"%' OR Lname LIKE '%"+BorrowerNameInTextField.getText()
               +"%') AND Book_loans.card_no = Borrower.card_no AND Book_loans.Book_id ='"
               +BookIdInTextField.getText()+"';");
        }
        //When BorrowerName,CardNO BookId entered
        if(((!BookIdInTextField.getText().equals("")))&&(!BorrowerNameInTextField.getText().equals("")) &&(!CardNumberInTextField.getText().equals("")))
        {
       rs3 = stmt1.executeQuery("SELECT Loan_id,book_id,branch_id,Book_loans.card_no,date_out,Due_date,Date_in FROM BORROWER,BOOK_LOANS WHERE (Fname LIKE '%"
               +BorrowerNameInTextField.getText()+"%' OR Lname LIKE '%"+BorrowerNameInTextField.getText()
               +"%') AND Book_loans.card_no = Borrower.card_no AND Book_loans.Book_id ='"
               +BookIdInTextField.getText()+"' AND Book_loans.card_no ='"
               +CardNumberInTextField.getText()+"';");
        }
}
else
{
 // A persons fname and lname entered   
    //Only BorrowerCompleteName entered
        if(((BookIdInTextField.getText().equals("")))&&(!BorrowerNameInTextField.getText().equals("")) &&(CardNumberInTextField.getText().equals("")))
        {
           
       rs3 = stmt1.executeQuery("SELECT Loan_id,book_id,branch_id,Book_loans.card_no,date_out,Due_date,Date_in FROM BORROWER,BOOK_LOANS WHERE (Fname LIKE '%"
               +Fname+"%' OR Lname LIKE '%"+Lname+"%') AND Book_loans.card_no = Borrower.card_no  ;");
        }
        
        //Only BorrowerCompleteName And Card number entered
        if(((BookIdInTextField.getText().equals("")))&&(!BorrowerNameInTextField.getText().equals("")) &&(!CardNumberInTextField.getText().equals("")))
        {
       rs3 = stmt1.executeQuery("SELECT Loan_id,book_id,branch_id,Book_loans.card_no,date_out,Due_date,Date_in FROM BORROWER,BOOK_LOANS WHERE (Fname LIKE '%"
               +Fname+"%' OR Lname LIKE '%"+Lname
               +"%') AND Book_loans.card_no = Borrower.card_no AND Book_loans.Card_no ='"
               +CardNumberInTextField.getText()+"';");
        }
        //Only BorrowerCompleteName And BookId entered
        if(((!BookIdInTextField.getText().equals("")))&&(!BorrowerNameInTextField.getText().equals("")) &&(CardNumberInTextField.getText().equals("")))
        {
       rs3 = stmt1.executeQuery("SELECT Loan_id,book_id,branch_id,Book_loans.card_no,date_out,Due_date,Date_in FROM BORROWER,BOOK_LOANS WHERE (Fname LIKE '%"
               +Fname+"%' OR Lname LIKE '%"+Lname
               +"%') AND Book_loans.card_no = Borrower.card_no AND Book_loans.Book_id ='"
               +BookIdInTextField.getText()+"';");
        }
        //When BorrowerCompleteName,CardNO BookId entered
        if(((!BookIdInTextField.getText().equals("")))&&(!BorrowerNameInTextField.getText().equals("")) &&(!CardNumberInTextField.getText().equals("")))
        {
       rs3 = stmt1.executeQuery("SELECT Loan_id,book_id,branch_id,Book_loans.card_no,date_out,Due_date,Date_in FROM BORROWER,BOOK_LOANS WHERE (Fname LIKE '%"
               +Fname+"%' OR Lname LIKE '%"+Lname
               +"%') AND Book_loans.card_no = Borrower.card_no AND Book_loans.Book_id ='"
               +BookIdInTextField.getText()+"' AND Book_loans.card_no ='"
               +CardNumberInTextField.getText()+"';");
        }
        
        
}

        CheckInTable.setModel(DbUtils.resultSetToTableModel(rs3));
    } catch (SQLException ex) {
        Logger.getLogger(NewJFrameBookLoan2.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_SearchBookLoanActionPerformed

    private void BookIdInTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIdInTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookIdInTextFieldActionPerformed

    private void BorrowerNameInTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowerNameInTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrowerNameInTextFieldActionPerformed

    private void CardNumberInTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardNumberInTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardNumberInTextFieldActionPerformed

    private void CheckInTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckInTableMouseClicked
       int row = CheckInTable.getSelectedRow();
       table_loan_id = (CheckInTable.getModel().getValueAt(row, 0).toString());
       //System.out.println("TABLE CLICK VALUE" + table_loan_id);
        table_book_id = (CheckInTable.getModel().getValueAt(row, 1).toString());
       //System.out.println("TABLE CLICK VALUE" + table_book_id);
       table_branch_id = (CheckInTable.getModel().getValueAt(row, 2).toString());
       //System.out.println("TABLE CLICK VALUE" + table_branch_id);
       table_card_no = (CheckInTable.getModel().getValueAt(row, 3).toString());
       //System.out.println("TABLE CLICK VALUE" + table_card_no);
        
        
    }//GEN-LAST:event_CheckInTableMouseClicked

    private void CheckInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInButtonActionPerformed
    try {
        int no_ofbookloans = 0;
        int no_of_avail_copies = 0;
        //updating date_in in book_loans
        String sql5 = "UPDATE BOOK_LOANS SET Date_in = CURDATE() WHERE loan_id ="+table_loan_id+";";
        pst = conn.prepareStatement(sql5);
        pst.executeUpdate(sql5);
        //Decrementing no of bookloans value by one for borrower
        rs = stmt.executeQuery("SELECT * FROM borrower WHERE card_no = "+table_card_no+";");
        while (rs.next()) {
         no_ofbookloans = rs.getInt("No_of_bookloans");
         no_ofbookloans--;
     }
        String sql6 = "UPDATE BORROWER SET No_of_bookloans = "+no_ofbookloans+" WHERE card_no ="+table_card_no+";";
        pst = conn.prepareStatement(sql6);
        pst.executeUpdate(sql6);
        //Updating no of available copies in book_copies
        rs = stmt.executeQuery("SELECT * FROM book_copies WHERE book_id = '"+table_book_id+"' AND branch_id ="+table_branch_id+";");
        while (rs.next()) {
         no_of_avail_copies = rs.getInt("No_of_available_copies");
         no_of_avail_copies++;
         
     }
        String sql7 = "UPDATE BOOK_COPIES SET No_of_available_copies = "+no_of_avail_copies+" WHERE book_id ='"+table_book_id+"' AND branch_id ="+table_branch_id+";";
        pst = conn.prepareStatement(sql7);
        pst.executeUpdate(sql7);
        
        JOptionPane.showMessageDialog(null,"Checked In Successfully");
    } catch (SQLException ex) {
        Logger.getLogger(NewJFrameBookLoan2.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_CheckInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrameBookLoan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameBookLoan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameBookLoan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameBookLoan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameBookLoan2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField BookIdInTextField;
    public static javax.swing.JTextField BookIdOutTextField;
    private javax.swing.JTextField BorrowerNameInTextField;
    public static javax.swing.JTextField BranchIdOutTextField;
    private javax.swing.JTextField CardNumberInTextField;
    private javax.swing.JTextField CardNumberOutTextField;
    private javax.swing.JButton CheckInButton;
    private javax.swing.JTable CheckInTable;
    private javax.swing.JButton CheckOutButton;
    private javax.swing.JButton ClearInButton;
    private javax.swing.JButton ClearOutButton;
    private javax.swing.JButton SearchBookLoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}