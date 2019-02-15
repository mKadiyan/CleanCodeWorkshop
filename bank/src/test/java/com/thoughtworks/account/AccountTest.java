package com.thoughtworks.account;

import com.thoughtworks.error.BalanceException;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void addBalance() {
        Account account = new Account();
        account.addBalance(100);
        assertEquals(100.0, account.getAccountBalance(), 1.0);
        account.updateAccountBalance();
        assertEquals(105.0, account.getAccountBalance(), 1.0);
    }

    @Test(expected = BalanceException.class)
    public void addBalanceException() {
        Account account = new Account();
        account.addBalance(0);
    }

    @Test
    public void updateBalance(){
        Account account = new Account();
        account.addBalance(100);
        account.updateAccountBalance();
        assertEquals(105.0, account.getAccountBalance(), 1.0);
    }

    @Test(expected = BalanceException.class)
    public void updateBalanceException(){
        Account account = new Account();
        account.addBalance(0.3);
        account.updateAccountBalance();
    }
}
