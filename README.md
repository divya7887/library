Library Management Application
TECHNICAL DEPENDENCIES:
Language Used: Java , JDK 1.7
IDE : Netbeans IDE version 7.3.1
SQL: My SQL
Jar files :mysql-connector-java-5.1.30-bin.jar and rs2xml.jar

****************************************************************************

A library application was developed based on the following requirements:
a. USER INTERACTION REQUIREMENTS:

1. GUI

A graphical librarian interface is required for the librarian to interact with the
library database via MYSQL connector. All queries, updates and deletes can
be done from the GUI. Initial table data population to be done from the
command line.
2. Book search and availability

‘Search’ is implemented where librarian can look for books in all branches of
the library. Any combination of book_id, title, author name (first name, last
name and/or middle name) can be used for searching. Books matching the
search criteria will be displayed.
Any part of title, book_id or author name can also be used for searching since
substring matching is implemented. The search displays:
1. Book_id
2. Title
3.Author(s)
4.Branch_id
5.Branch_name
6.Number of copies at each branch
7.Number of available copies at each branch
Also, all books in the library can be displayed by clicking on
‘DisplayAllBooks’ button

3. Book Loans

Book Check-In and Check-Out is designed to check-in and checkout books.
Book_loan tuples are located by searching for book_id, Card_no, and/or any
part of borrower name. Once located, librarian can select one of the multiple
results displayed from a table by using mouse click and check in. The Date_in
value will be the current date. When a borrower returns a book, the number of books loaned will be
decremented by one.
Checkout fails if a particular book is not available at a selected branch and
application returns a message showing the book to be unavailable at that
branch. At each checkout, the book count at a branch is decremented by one.
A unique loan_id is generated (selecting the biggest loan_id from book_loans
and incrementing by 1) every time of checkout.
Also, each borrower is allowed to loan only 3 books at a time. If a borrower
tries to checkout more than 3 books, a message will be displayed rejecting the
book checkout for this particular borrower.
To calculate due date and fine, if any, each book has a due date updated (i.e.
14 days from checkout date).

4. Borrower Management

New borrowers can be added to the library application. A unique card_no will
be generated (by selecting the largest card_no from borrower table and
incrementing by 1) each time a new borrower is registered (card_no to be
inline with existing numbering system).
Full name and address are required to create a new borrower. A message will
be displayed asking to enter values for missing fields. Borrowers are allowed
to possess one library card only. A message will be displayed if an existing
member tries to register with same name and address. Also, in this case
registration will be rejected.

5. Calculating Fine

Fines are calculated for borrowers who has not returned the book within due
date. Exact amount of fine is calculated based on date of return and then
grouped by card number for display. A method to pay fine is also
implemented. A borrower will be removed from fine list after paying the dues.
