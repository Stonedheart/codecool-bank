package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTypesTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        AccountTypes accountStatuses = new AccountTypes("Saving account","Account for your savings, percentage 2,5%");
        assertEquals(AccountTypes.class, accountStatuses.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        AccountTypes accountStatuses = new AccountTypes(1,"Saving account","Account for your savings, percentage 2,5%");
        assertEquals(AccountTypes.class, accountStatuses.getClass());
    }
}