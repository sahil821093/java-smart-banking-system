package com.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Smart Banking System ===");
        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account (Min Balance: Rs. 500)");
        System.out.println("2. Current Account (Overdraft Limit: Rs. 5000)");
        System.out.print("Apna choice chunein (1 or 2): ");
        int accType = sc.nextInt();
        sc.nextLine(); // buffer clear karne ke liye

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Initial Deposit Amount (Rs.): ");
        double initialDeposit = sc.nextDouble();

        // Runtime Polymorphism: Parent ka reference, Child ka object
        BankAccount account;
        if (accType == 1) {
            account = new SavingsAccount(name, accNo, initialDeposit);
            System.out.println("\nSavings Account created successfully!");
        } else {
            account = new CurrentAccount(name, accNo, initialDeposit);
            System.out.println("\nCurrent Account created successfully!");
        }

        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");
            System.out.print("Apna option chunein (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: Rs. ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Current Balance: Rs. " + account.getBalance());
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using Smart Banking System. Goodbye!");
                    break;
                default:
                    System.out.println("Galat option! Kripya 1 se 5 ke beech chunein.");
            }
        } while (choice != 5);

        sc.close();
    }
}
