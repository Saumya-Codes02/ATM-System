package com.saumya.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    // Read an integer
    public int readInt(String message) {

        while (true) {

            System.out.print(message);

            try {
                int value = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                return value;

            } catch (InputMismatchException e) {

                System.out.println("❌ Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    // Read a positive integer
    public int readPositiveInt(String message) {

        while (true) {

            int value = readInt(message);

            if (value > 0) {
                return value;
            }

            System.out.println("❌ Value must be greater than zero.");
        }
    }

    // Read a double
    public double readDouble(String message) {

        while (true) {

            System.out.print(message);

            try {
                double value = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                return value;

            } catch (InputMismatchException e) {

                System.out.println("❌ Invalid amount. Please enter numbers only.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    // Read a positive double
    public double readPositiveDouble(String message) {

        while (true) {

            double value = readDouble(message);

            if (value > 0) {
                return value;
            }

            System.out.println("❌ Amount must be greater than zero.");
        }
    }

    // Read a String
    public String readString(String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("❌ Input cannot be empty.");
        }
    }

    // Read PIN (exactly 4 digits)
    public int readPin(String message) {

        while (true) {

            int pin = readInt(message);

            if (pin >= 1000 && pin <= 9999) {
                return pin;
            }

            System.out.println("❌ PIN must be exactly 4 digits.");
        }
    }
}