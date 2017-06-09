package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTypeTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        TransactionType transactionType = new TransactionType("External", "External transaction to the another account");
        assertEquals(TransactionType.class, transactionType.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        TransactionType transactionType = new TransactionType(1, "External", "External transaction to the another account");
        assertEquals(TransactionType.class, transactionType.getClass());
    }

    @Test
    void testIfNameIsInitializedValid() {
        TransactionType transactionType = new TransactionType(1, "External", "External transaction to the another account");
        assertEquals("External", transactionType.getName());
    }

    @Test
    void testIfDescriptionIsInitializedValid() {
        TransactionType transactionType = new TransactionType(1, "External", "External transaction to the another account");
        assertEquals("External transaction to the another account", transactionType.getDescription());
    }
}