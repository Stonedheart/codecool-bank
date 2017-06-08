package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTypeTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        AccountType accountStatuses = new AccountType("Saving account", "Account for your savings, percentage 2,5%");
        assertEquals(AccountType.class, accountStatuses.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        AccountType accountStatuses = new AccountType(1, "Saving account", "Account for your savings, percentage 2,5%");
        assertEquals(AccountType.class, accountStatuses.getClass());
    }
}