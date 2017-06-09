package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionStatusTest {

    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        TransactionStatus transactionStatus = new TransactionStatus("Waiting", "Your transaction is in order to accomplish");
        assertEquals(TransactionStatus.class, transactionStatus.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        final Integer transactionStatusID = 1;
        TransactionStatus transactionStatus = new TransactionStatus(transactionStatusID, "Waiting", "Your transaction is in order to accomplish");
        assertEquals(TransactionStatus.class, transactionStatus.getClass());
    }

    @Test
    void testIfNameIsInitializedValid() {
        final Integer transactionStatusID = 1;
        TransactionStatus transactionStatus = new TransactionStatus(transactionStatusID, "Waiting", "Your transaction is in order to accomplish");
        assertEquals("Waiting", transactionStatus.getName());
    }

    @Test
    void testIfDescriptionIsInitializedValid() {
        final Integer transactionStatusID = 1;
        TransactionStatus transactionStatus = new TransactionStatus(transactionStatusID, "Waiting", "Your transaction is in order to accomplish");
        assertEquals("Your transaction is in order to accomplish", transactionStatus.getDescription());
    }
}