package com.saumya;

import com.saumya.model.BankAccount;
import com.saumya.service.ATM;
import com.saumya.util.InputHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputHandler input = new InputHandler(scanner);

        BankAccount account =
                new BankAccount("Saumya Shukla",1234,10000);

        ATM atm = new ATM(account, input, scanner);

        atm.start();
    }
}