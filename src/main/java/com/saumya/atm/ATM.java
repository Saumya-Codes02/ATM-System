package com.saumya.atm;

import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        if (!authenticateUser()) {
            System.out.println("\nToo many incorrect attempts.");
            System.out.println("Account locked.");
            return;
        }

        int choice;

        do {

            Menu.displayMenu();

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    depositMoney();
                    break;

                case 3:
                    withdrawMoney();
                    break;

                case 4:
                    System.out.println("\nThank you for using our ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    private boolean authenticateUser() {

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter 4-digit PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == account.getPin()) {
                System.out.println("\nLogin Successful!");
                System.out.println("Welcome, " + account.getAccountHolder());
                return true;
            }

            attempts--;
            System.out.println("Incorrect PIN.");
            System.out.println("Attempts remaining: " + attempts);
        }

        return false;
    }

    private void checkBalance() {

        System.out.printf("\nCurrent Balance: ₹%.2f%n", account.getBalance());
    }

    private void depositMoney() {

        System.out.print("Enter amount to deposit: ₹");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        account.deposit(amount);

        System.out.println("Deposit Successful.");
        System.out.printf("Updated Balance: ₹%.2f%n", account.getBalance());
    }

    private void withdrawMoney() {

        System.out.print("Enter amount to withdraw: ₹");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (account.withdraw(amount)) {
            System.out.println("Withdrawal Successful.");
            System.out.printf("Remaining Balance: ₹%.2f%n", account.getBalance());
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}