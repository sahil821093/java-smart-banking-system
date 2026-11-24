package com.bank;

// Abstract class: iska direct object nahi ban sakta
public abstract class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    protected double balance; // protected rakha hai taaki child classes ise use kar sakein

    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid amount! Amount 0 se zyada hona chahiye.");
        }
    }

    // Abstract method: har child class apna khud ka withdraw rule likhegi
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: Rs. " + balance);
        System.out.println("-----------------------");
    }
}
