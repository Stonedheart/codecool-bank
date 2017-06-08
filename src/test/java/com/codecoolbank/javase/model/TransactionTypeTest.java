package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTypeTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        TransactionType accountStatuses = new TransactionType("External", "External transaction to the another account");
        assertEquals(TransactionType.class, accountStatuses.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        TransactionType accountStatuses = new TransactionType(1, "External", "External transaction to the another account");
        assertEquals(TransactionType.class, accountStatuses.getClass());
    }
}