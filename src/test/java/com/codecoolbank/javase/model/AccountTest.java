package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 2,5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        SavingAccount savingAccount = new SavingAccount(customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 1);
        assertEquals(Account.class, savingAccount.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 2,5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        SavingAccount savingAccount = new SavingAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 1);
        assertEquals(Account.class, savingAccount.getClass());
    }
}