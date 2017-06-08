package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTypesTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        TransactionTypes accountStatuses = new TransactionTypes("External","External transaction to the another account");
        assertEquals(TransactionTypes.class, accountStatuses.getClass());
    }
}