package com.bank;

// Inheritance: SavingsAccount ne BankAccount ko inherit kiya
public class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 500.0;

    public SavingsAccount(String accountHolderName, String accountNumber, double initialBalance) {
        super(accountHolderName, accountNumber, initialBalance); // Parent constructor call
    }

    // Method Overriding (Polymorphism)
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Successfully withdrawn: Rs. " + amount);
        } else {
            System.out.println("Withdrawal failed! Savings Account mein kam se kam Rs. " + MIN_BALANCE + " hona zaroori hai.");
        }
    }
}
