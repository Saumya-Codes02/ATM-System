package com.saumya.atm;

public class BankAccount {

    private String accountHolder;
    private int pin;
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

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}