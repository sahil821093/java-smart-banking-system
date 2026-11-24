package com.bank;

// Inheritance: CurrentAccount ne BankAccount ko inherit kiya
public class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 5000.0;

    public CurrentAccount(String accountHolderName, String accountNumber, double initialBalance) {
        super(accountHolderName, accountNumber, initialBalance);
    }

    // Method Overriding (Polymorphism)
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (balance - amount >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Successfully withdrawn: Rs. " + amount);
            if (balance < 0) {
                System.out.println("Note: Aap Overdraft limit use kar rahe hain.");
            }
        } else {
            System.out.println("Withdrawal failed! Rs. " + OVERDRAFT_LIMIT + " ki overdraft limit cross ho rahi hai.");
        }
    }
}
