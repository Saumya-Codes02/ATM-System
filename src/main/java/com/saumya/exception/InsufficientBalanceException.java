package com.saumya.exception;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}