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
        TransactionStatus transactionStatus = new TransactionStatus(1, "Waiting", "Your transaction is in order to accomplish");
        assertEquals(TransactionStatus.class, transactionStatus.getClass());
    }

    @Test
    void testIfNameIsInitializedValid() {
        TransactionStatus transactionStatus = new TransactionStatus(1, "Waiting", "Your transaction is in order to accomplish");
        assertEquals("Waiting", transactionStatus.getName());
    }
}