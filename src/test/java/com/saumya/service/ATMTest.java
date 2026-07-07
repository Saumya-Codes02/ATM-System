package com.saumya.service;

import com.saumya.model.BankAccount;
import com.saumya.util.InputHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class ATMTest {

    private BankAccount account;
    private InputHandler inputHandler;
    private Scanner scanner;
    private ATM atm;

    @BeforeEach
    void setUp() {

        account = new BankAccount("Saumya Shukla", 1234, 10000);

        inputHandler = mock(InputHandler.class);

        scanner = mock(Scanner.class);

        atm = new ATM(account, inputHandler, scanner);
    }

    @Test
    @DisplayName("ATM Object Should Be Created")
    void testATMCreation() {

        assertNotNull(atm);
    }

    @Test
    @DisplayName("Bank Account Should Not Be Null")
    void testBankAccountCreation() {

        assertNotNull(account);
    }

    @Test
    @DisplayName("InputHandler Should Not Be Null")
    void testInputHandlerCreation() {

        assertNotNull(inputHandler);
    }

    @Test
    @DisplayName("Scanner Should Not Be Null")
    void testScannerCreation() {

        assertNotNull(scanner);
    }

    @Test
    @DisplayName("Mock PIN Input")
    void testPinInput() {

        when(inputHandler.readPin(anyString()))
                .thenReturn(1234);

        int pin = inputHandler.readPin("Enter PIN: ");

        assertNotNull(pin);
    }

    @Test
    @DisplayName("Mock Menu Choice")
    void testMenuChoice() {

        when(inputHandler.readInt(anyString()))
                .thenReturn(4);

        int choice = inputHandler.readInt("Choice: ");

        assertNotNull(choice);
    }

    @Test
    @DisplayName("Mock Deposit Amount")
    void testDepositAmount() {

        when(inputHandler.readPositiveDouble(anyString()))
                .thenReturn(500.0);

        double amount =
                inputHandler.readPositiveDouble("Amount: ");

        assertNotNull(amount);
    }

    @Test
    @DisplayName("Verify PIN Method Called Once")
    void testVerifyPinMethod() {

        when(inputHandler.readPin(anyString()))
                .thenReturn(1234);

        inputHandler.readPin("Enter PIN:");

        verify(inputHandler, times(1))
                .readPin(anyString());
    }

    @Test
    @DisplayName("Verify Menu Method Called Once")
    void testVerifyMenuMethod() {

        when(inputHandler.readInt(anyString()))
                .thenReturn(1);

        inputHandler.readInt("Choice:");

        verify(inputHandler, times(1))
                .readInt(anyString());
    }

    @Test
    @DisplayName("Verify Deposit Method Called Once")
    void testVerifyDepositMethod() {

        when(inputHandler.readPositiveDouble(anyString()))
                .thenReturn(500.0);

        inputHandler.readPositiveDouble("Amount:");

        verify(inputHandler, times(1))
                .readPositiveDouble(anyString());
    }

}