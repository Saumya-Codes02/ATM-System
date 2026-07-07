package com.saumya.service;

import com.saumya.exception.InsufficientBalanceException;
import com.saumya.exception.InvalidAmountException;
import com.saumya.exception.InvalidPinException;
import com.saumya.model.BankAccount;
import com.saumya.ui.Menu;
import com.saumya.util.InputHandler;

import java.util.Scanner;

public class ATM {

    private final BankAccount account;
    private final InputHandler input;
    private final Scanner scanner;

    private static final int MAX_ATTEMPTS = 3;

    public ATM(BankAccount account, InputHandler input, Scanner scanner) {
        this.account = account;
        this.input = input;
        this.scanner = scanner;
    }

    public void start() {

        System.out.println("=================================");
        System.out.println("      WELCOME TO JAVA ATM");
        System.out.println("=================================");

        try {

            authenticateUser();
            runATM();

        } catch (Exception e) {

            System.out.println("\n" + e.getMessage());

        } finally {

            scanner.close();
            System.out.println("\nThank you for using our ATM.");
        }
    }

    private void authenticateUser() throws Exception {

        int attempts = MAX_ATTEMPTS;

        while (attempts > 0) {

            int enteredPin = input.readPin("\nEnter your 4-digit PIN: ");

            if (enteredPin == account.getPin()) {

                System.out.println("\nLogin Successful!");
                System.out.println("Welcome, " + account.getAccountHolder());
                return;
            }

            attempts--;

            if (attempts > 0) {

                System.out.println("Incorrect PIN.");
                System.out.println("Attempts Remaining : " + attempts);

            } else {

                throw new InvalidPinException(
                        "Too many incorrect attempts. Account Locked.");
            }
        }
    }

    private void runATM() {

        int choice;

        do {

            Menu.displayMenu();

            choice = input.readInt("Enter your choice: ");

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
                    System.out.println("\nLogging out...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }

    private void checkBalance() {

        System.out.printf("\nCurrent Balance : ₹%.2f%n", account.getBalance());
    }

    private void depositMoney() {

        try {

            double amount = input.readPositiveDouble("Enter amount to deposit: ₹");

            account.deposit(amount);

            System.out.println("\nDeposit Successful!");
            System.out.printf("Updated Balance : ₹%.2f%n", account.getBalance());

        } catch (InvalidAmountException e) {

            System.out.println(e.getMessage());
        }
    }

    private void withdrawMoney() {

        try {

            double amount = input.readPositiveDouble("Enter amount to withdraw: ₹");

            account.withdraw(amount);

            System.out.println("\nWithdrawal Successful!");
            System.out.printf("Remaining Balance : ₹%.2f%n", account.getBalance());

        } catch (InvalidAmountException | InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}