package com.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Smart Banking System ===");
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Initial Deposit Amount (Rs.): ");
        double initialDeposit = sc.nextDouble();

        // BankAccount class ka object banaya
        BankAccount account = new BankAccount(name, accNo, initialDeposit);
        System.out.println("\nAccount created successfully!");

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
                    double depAmount = sc.nextDouble();
                    account.deposit(depAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    double withAmount = sc.nextDouble();
                    account.withdraw(withAmount);
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
