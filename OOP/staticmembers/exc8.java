package staticmembers;

class BankAccount {
    // Instance variables
    private int accountNumber;
    private double balance;

    // Static variables
    private static String bankName;
    private static double interestRate;

    // Constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Static setter and getter for bankName
    public static void setBankName(String name) {
        bankName = name;
    }

    public static String getBankName() {
        return bankName;
    }

    // Static setter and getter for interestRate
    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    // Method to display account info
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-----------------------------");
    }
}
public class exc8 {
    public static void main(String[] args) {
        // Set static variables once
        BankAccount.setBankName("Asadbek Bank");
        BankAccount.setInterestRate(5.5);

        // Create multiple bank accounts
        BankAccount acc1 = new BankAccount(1001, 2500.0);
        BankAccount acc2 = new BankAccount(1002, 5000.0);
        BankAccount acc3 = new BankAccount(1003, 1500.5);

        // Print details
        acc1.displayInfo();
        acc2.displayInfo();
        acc3.displayInfo();
    }
}
