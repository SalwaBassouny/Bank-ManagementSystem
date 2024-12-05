import java.util.ArrayList;
import java.util.List;

// class with public access modifier to be accessed by any other class in the same project
public abstract class BankAccount {

    /*encapsulation declared to ensure that they cannot be accessed or modified directly from outside the BankAccount class.
     also final to ensure that they will not be changed by the user*/
    private final String accountNumber;
    private  double balance;//current balance
    private final List<String> transactions;//Stores a list of transaction descriptions as strings

public BankAccount( String accountNumber, double initialDeposit) {//constructor declared to initialize the fields when object created//
       this.accountNumber = accountNumber;
       this.balance = initialDeposit;
        this.transactions = new ArrayList<>();//dynamic array to hold transaction history
        transactions.add("initial deposit of account" + initialDeposit);// Record the initial deposit in the transaction history
    }
public double getBalance() {//Method to check current account balance
        System.out.println("current balance for this account number "+ accountNumber +"="+balance);
        return balance;
    }
public void displayAccountDetails(){//Method to display account details
        System.out.println("this account number : "+accountNumber);
        System.out.println("this account current balance :"+ getBalance());

    }
public void deposit (double amount)//Method for deposit
            throws InvalidInputException {
        if ( amount > 0 ) {
                balance += amount;//increment of current balance
                System.out.println("Deposit successfully added");
                transactions.add("Deposit " + amount);
            } else {
                throw new InvalidInputException("deposit must be greater than zero");
            }

        }
public void withdraw (double amount) //Method for withdraw
                 throws InsufficientFundsException,InvalidInputException {//Exception for insufficient funds
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient balance to withdraw,Check your current balance ");
        }
        if (amount <= 0) {//Exception for invalid withdraw
                throw new InvalidInputException("Withdrawal amount must be greater than zero.");
        }
        else {
            balance -= amount;//decrement of current balance
        }
        transactions.add("Withdrew: " + amount);//add the operation to transaction

    }
public void displayTransactionHistory() {// (for-each loop) is used to iterate through the elements of the transactions list
        System.out.println("Transaction History for Account: " + accountNumber);
        for (String transaction : transactions){// Iterate through each transaction
            System.out.println(transaction);// Print each transaction
    }

   }
}




