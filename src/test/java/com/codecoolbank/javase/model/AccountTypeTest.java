package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTypeTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        AccountType accountType = new AccountType("Saving account", "Account for your savings, percentage 5%");
        assertEquals(AccountType.class, accountType.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");
        assertEquals(AccountType.class, accountType.getClass());
    }
}