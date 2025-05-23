package Exc5;

public class exc5 {
    public static void main(String[] args) {
        // Print message to indicate creation of a BankAccount object
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
        // Create a BankAccount object (A/c No. "BA1234") with initial balance of $500
        BankAccount BA1234 = new BankAccount("BA1234", 500);

        // Print message to indicate deposit action
        System.out.println("Deposit $1000 into account BA1234:");
        // Deposit $1000 into account BA1234
        BA1234.deposit(1000);
        // Print the new balance after deposit
        System.out.println("New balance after depositing $1000: $" + BA1234.getBalance());

        // Print message to indicate withdrawal action
        System.out.println("Withdraw $600 from account BA1234:");
        // Withdraw $600 from account BA1234
        BA1234.withdraw(600);
        // Print the new balance after withdrawal
        System.out.println("New balance after withdrawing $600: $" + BA1234.getBalance());

        // Print message to indicate creation of a SavingsAccount object
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of $450:");
        // Create a SavingsAccount object (A/c No. "SA1234") with initial balance of $450
        SavingsAccount SA1234 = new SavingsAccount("SA1234", 450);

        // Withdraw $300 from SA1234
        SA1234.withdraw(300);
        // Print the balance after attempting to withdraw $300
        System.out.println("Balance after trying to withdraw $300: $" + SA1234.getBalance());

        // Print message to indicate creation of another SavingsAccount object
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        // Create a SavingsAccount object (A/c No. "SA1000") with initial balance of $300
        SavingsAccount SA1000 = new SavingsAccount("SA1000", 300);

        // Print message to indicate withdrawal action
        System.out.println("Try to withdraw $250 from SA1000!");
        // Withdraw $250 from SA1000 (balance falls below $100)
        SA1000.withdraw(250);
        // Print the balance after attempting to withdraw $250
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());
    }
}
