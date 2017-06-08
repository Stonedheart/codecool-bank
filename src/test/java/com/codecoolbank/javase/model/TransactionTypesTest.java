package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTypesTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        TransactionTypes accountStatuses = new TransactionTypes("External","External transaction to the another account");
        assertEquals(TransactionTypes.class, accountStatuses.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        TransactionTypes accountStatuses = new TransactionTypes(1,"External","External transaction to the another account");
        assertEquals(TransactionTypes.class, accountStatuses.getClass());
    }
}