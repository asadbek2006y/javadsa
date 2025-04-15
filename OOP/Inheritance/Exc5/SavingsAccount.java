package Exc5;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() - amount < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount);
        }
    }
    
}
