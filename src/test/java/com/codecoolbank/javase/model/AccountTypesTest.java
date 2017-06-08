package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTypesTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        AccountTypes accountStatuses = new AccountTypes("Debit","Account for your savings, without credit");
        assertEquals(AccountTypes.class, accountStatuses.getClass());
    }
}