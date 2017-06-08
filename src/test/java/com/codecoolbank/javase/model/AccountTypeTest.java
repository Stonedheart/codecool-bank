package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTypeTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        AccountType testAccountType = new AccountType("Saving account", "Account for your savings, percentage 2,5%");
        assertEquals(AccountType.class, testAccountType.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        AccountType testAccountType = new AccountType(1, "Saving account", "Account for your savings, percentage 2,5%");
        assertEquals(AccountType.class, testAccountType.getClass());
    }
}