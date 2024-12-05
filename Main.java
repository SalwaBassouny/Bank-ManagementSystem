public static void main() throws InvalidInputException {

    Scanner scanner = new Scanner(System.in);//scanner method called to write in console

    {
            System.out.println("Please,Enter Account Number: ");//to ask user to enter his new account details
            String accountNumber = scanner.nextLine();

            System.out.println("Please, Enter Account Holder Name: ");
            String accountHolderName = scanner.nextLine();

            System.out.println("Please, Enter Initial Deposit: ");
            double initialDeposit = scanner.nextDouble();

    SavingsAccount account = new SavingsAccount(accountNumber, accountHolderName, initialDeposit) {//object is instantiated from SavingAccount class

    };

    while (true) {// while loop is used as the number of iterations unknown and the loop depends on a condition being true
            System.out.println("\nMain menu");  // provide menu of options
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction history");
            System.out.println("5. account details");
            System.out.println("6. Interest Addition");
            System.out.println("7. Exit");
            System.out.print("Please choose an option (1-7): ");


    int option = scanner.nextInt(); //Identify user's option

    switch (option) {/* switch deals with known(option) discrete values
                             also simplify code compared to using multiple if-else statements*/
                case 1:
                    System.out.println("Please enter your deposit amount");// for deposit
                    double depositAmount = scanner.nextDouble();
                    try {
                        account.deposit(depositAmount);
                        throw new InvalidInputException("Invalid Value");
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;// Exit the switch after executing this block

                case 2:
                    try {
                        System.out.println("Please, Enter The Value You Need To Withdraw");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } catch (InsufficientFundsException | InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    account.getBalance(); //for current balance for the account number
                    break;
                case 4:
                    account.displayTransactionHistory();//display transaction list
                    break;
                case 5:
                    account.displayAccountDetails();// display account details
                    break;
                case 6:
                    account.addInterestCalculated();//for adding interest
                    break;
                case 7:
                    scanner.close();//close scanner
                    System.out.println("Exit system"); // to exit
                    return;
                default://executed when none of the specified cases match
                    System.out.println("Invalid option, please try another one");
            }
        }

    }
}
