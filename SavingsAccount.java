 class SavingsAccount extends BankAccount {
    private static final double minimumBalance = 3000.0;


public SavingsAccount(String accountNumber, String ignoredAccountHolderName, double initialDeposit) {//constructor of subclass
        super(accountNumber, initialDeposit);//parameters taken from parent class

        if ( minimumBalance > initialDeposit)
            throw new IllegalArgumentException("Initial deposit must be at least " + minimumBalance);
    }

    @Override// Overriding Withdraw Method where the same method from superclass implemented in subclass with the same method arguments
public void withdraw(double amount) throws InsufficientFundsException, InvalidInputException {
        if (getBalance() - amount < minimumBalance) {
            throw new InsufficientFundsException("Withdrawal would lower balance to less than minimum balance");
        }else
    super.withdraw(amount);
    }

public void addInterestCalculated() throws InvalidInputException {
        double monthInterest = 0.02;
        double interest = getBalance() * monthInterest;
       deposit(interest);//put interest as deposit
        System.out.println("Current balance after adding Interests = " + getBalance());
    }


}
