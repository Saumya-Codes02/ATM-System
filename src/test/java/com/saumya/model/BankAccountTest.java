package com.saumya.model;

import com.saumya.exception.InsufficientBalanceException;
import com.saumya.exception.InvalidAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("Saumya Shukla", 1234, 10000);
    }

    @Test
    @DisplayName("Initial Balance")
    void testInitialBalance() {
        assertEquals(10000, account.getBalance());
    }

    @Test
    @DisplayName("Successful Deposit")
    void testDeposit() throws InvalidAmountException {

        account.deposit(5000);

        assertEquals(15000, account.getBalance());
    }

    @Test
    @DisplayName("Deposit Zero")
    void testDepositZero() {

        assertThrows(
                InvalidAmountException.class,
                () -> account.deposit(0)
        );
    }

    @Test
    @DisplayName("Deposit Negative Amount")
    void testDepositNegative() {

        assertThrows(
                InvalidAmountException.class,
                () -> account.deposit(-500)
        );
    }

    @Test
    @DisplayName("Successful Withdrawal")
    void testWithdraw()
            throws InvalidAmountException, InsufficientBalanceException {

        account.withdraw(3000);

        assertEquals(7000, account.getBalance());
    }

    @Test
    @DisplayName("Withdraw Entire Balance")
    void testWithdrawEntireBalance()
            throws InvalidAmountException, InsufficientBalanceException {

        account.withdraw(10000);

        assertEquals(0, account.getBalance());
    }

    @Test
    @DisplayName("Withdraw More Than Balance")
    void testWithdrawMoreThanBalance() {

        assertThrows(
                InsufficientBalanceException.class,
                () -> account.withdraw(15000)
        );
    }

    @Test
    @DisplayName("Withdraw Zero")
    void testWithdrawZero() {

        assertThrows(
                InvalidAmountException.class,
                () -> account.withdraw(0)
        );
    }

    @Test
    @DisplayName("Withdraw Negative Amount")
    void testWithdrawNegative() {

        assertThrows(
                InvalidAmountException.class,
                () -> account.withdraw(-200)
        );
    }

    @Test
    @DisplayName("Account Holder")
    void testAccountHolder() {

        assertEquals("Saumya Shukla", account.getAccountHolder());
    }

    @Test
    @DisplayName("PIN")
    void testPin() {

        assertEquals(1234, account.getPin());
    }

}