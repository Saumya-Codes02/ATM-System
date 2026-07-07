package com.saumya.model;

import com.saumya.exception.InsufficientBalanceException;
import com.saumya.exception.InvalidAmountException;

public class BankAccount {

    private final String accountHolder;
    private final int pin;
    private double balance;

    public BankAccount(String accountHolder, int pin, double balance) {
        this.accountHolder = accountHolder;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }

        balance += amount;
    }

    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }

        balance -= amount;
    }
}