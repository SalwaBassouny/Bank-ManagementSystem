1. PROJECT TITLE :

 Java Bank Managment System

 
2. PROJECT OBJECTIVE :
 
 Develop a simple Bank Management System using Java that incorporates core programming concepts such
as object-oriented programming (OOP), exception handling, collections, and input/output handling.


3. PROJECT DESCRIPTION :
   * REQUIREMENTS:

	 
@ Account Management:

BankAccount class allows for account creation, balance checking, and display account details.
SavingsAccount inheites BankAccount and enforces a minimum balance constraint for withdrawals.


@ Deposits:

Allow to deposit an amount into an account.
Validates the deposit amount and updates the account balance.


@ Withdrawals:

Withdraw funds with:
Insufficient Funds Protection: Prevents withdrawal if the account balance is insufficient.
Minimum Balance Enforcement (for Savings accounts): Prevents withdrawals that bring the balance below the minimum required.


@ Interest Calculation (for Savings Accounts):

Automatically adds monthly interest to the balance (20% per month for this example).
Interest is added as a deposit, and the balance is updated.


@ Error Handling:

Uses custom exceptions such as :
InsufficientFundsException: Triggered when attempting to withdraw more than the available balance.
InvalidInputException: Triggered when deposit or withdrawal amounts are invalid (e.g., negative amounts or Zero).

   *CODE EXCUTION:
  
  1- Create Super Class:

  💮BankAccount {chosen to be abstract class to be inherited and used to share common (like deposits, withdrawals)
	 while enabling subclass to customize and extend specific functionality}.
   This abstract class encapsulates: accountNumber, balance, and transactions.
   Provides methods for deposit, withdrawal, balance checking.
   
	 
2- Create subclass: 

💮SavingAccount which extends the superclassSubclass Enforces a minimum balance of 3000 for withdrawals{declared as static final}.
 with the ability to calculate and add monthly interest at a rate of 20% per month. 


3- Custom Exceptions :

two types of exceptions are identified to be thrown 

   a) InsufficientFundsException ; Thrown when attempting to withdraw more funds than available in the account. 
					 
   b) InvalidInputException ; Thrown when deposit or withdrawal amounts are invalid (e.g., zero or negative).
					 
   c) try catch used to handle exceptions that are thrown during program execution to ensures the program doesn't terminate abruptly.
 
	 
4- If else statement used to manage some conditional control to execute specific blocks of code based on whether a condition is true or false.such as if withdraw is less than 
      minimam balance to ensure presence of limited balance in the account.
  
	
 5- While loop is used as the number of iterations unknown and the loop depends on a condition being true as to provide menu of options used by the user.
  
	 
	
 6- Switch statement is used to execute one block of code out of multiple options based on the value of an expression as in options user should switch between them. to decrease use of multiple {if else } statments and it ends with {break} to exit the switch after executing the block.
   
	 
	
 7- For loop used to iterate through the elements of the transactions list as iteration number is known.
  
	 
	
 8- Overriding withdraw method is used by subclass while it is implemented in superclass to decrease code mistakes.
  
	 
	
 9-Scanner method called in tne Main class to write in console 
 
  *WHAT HAPPEN WHEN CODE IS USED:
			
  - User will be asked to enter account details (account number, holder name, initial deposit).
    
  - Asked to choose an option from the menu:
     1: Deposit funds.
    
     2: Withdraw funds (ensure sufficient balance).
    
      3: Check account balance.
    
      4: View transaction history.
    
      5: Display account details.
    
      6: Add interest to the account.
    
      7: Exit the program.
    
      Error Handling:
    
    - Handles invalid inputs and insufficient funds with descriptive error messages.

			
   4- CHALLENGES:
	 
   A) Exception Handling: Implementing custom exceptions like InvalidInputException and InsufficientFundsException to handle specific errors was challenging.
		 	 
   B) Interest Calculation: Adding a feature to calculate and deposit monthly interest required more time and rsearch to avoid conflicts with existing operations.
  
   C) Dynamic Menu Navigation: Designing a flexible and user-friendly menu system using a while loop and switch statements to handle various operations without crashing the 
       program.
			 
   D) Transaction History Management: Recording transactions in a list and ensuring they are correctly displayed in chronological order was challanging.
   
   E) Understanding Abstract Classes: purpose and implementation of abstract classes and their role in designing reusable code.
  
   F) Time Management: Managing time effectively to design ,trials , code, and test the project within deadlines.
   
   G) Low Experience: This is my first project without any previous knowledge in java.  

     
