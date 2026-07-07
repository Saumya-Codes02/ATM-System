package com.saumya.atm;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Saumya Shukla", 1234, 10000.0);

        ATM atm = new ATM(account);
        atm.start();
    }
}