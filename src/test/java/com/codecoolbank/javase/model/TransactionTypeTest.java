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
        final Integer transactionTypeID = 1;
        TransactionType transactionType = new TransactionType(transactionTypeID, "External", "External transaction to the another account");
        assertEquals(TransactionType.class, transactionType.getClass());
    }

    @Test
    void testIfNameIsInitializedValid() {
        final Integer transactionTypeID = 1;
        TransactionType transactionType = new TransactionType(transactionTypeID, "External", "External transaction to the another account");
        assertEquals("External", transactionType.getName());
    }

    @Test
    void testIfDescriptionIsInitializedValid() {
        final Integer transactionTypeID = 1;
        TransactionType transactionType = new TransactionType(transactionTypeID, "External", "External transaction to the another account");
        assertEquals("External transaction to the another account", transactionType.getDescription());
    }
}