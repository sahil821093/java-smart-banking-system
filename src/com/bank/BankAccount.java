package com.bank;

public class BankAccount {
    // Encapsulation: data ko private rakha hai taaki direct koi change na kar sake
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor: naya account banate waqt initial values set karne ke liye
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Paise jama karne ka method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid amount! Amount 0 se zyada hona chahiye.");
        }
    }

    // Paise nikalne ka method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: Rs. " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Aapke account mein sirf Rs. " + balance + " hain.");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Balance check karne ka method (Getter)
    public double getBalance() {
        return balance;
    }

    // Account ki poori details dikhane ka method
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: Rs. " + balance);
        System.out.println("-----------------------");
    }
