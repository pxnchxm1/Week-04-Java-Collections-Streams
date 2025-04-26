package com.testfiles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.test.BankAccount;

public class BankAccountTest {

    BankAccount account = new BankAccount(1000);


    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testSuccessfulWithdrawal() {
        String result = account.withdrawAmount(300);
        assertEquals("successfull withdrawal", result);
        assertEquals(700, account.getBalance());
    }

    @Test
    void testInsufficientFunds() {
        String result = account.withdrawAmount(2000);
        assertEquals("Insufficient balance", result);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testInvalidAmountWithdrawal() {
        assertThrows(ArithmeticException.class, () -> {
            account.withdrawAmount(-100);
        });
    }

}
