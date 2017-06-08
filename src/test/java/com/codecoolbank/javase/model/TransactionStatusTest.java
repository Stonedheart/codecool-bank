package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionStatusTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        TransactionStatus accountStatuses = new TransactionStatus("Waiting", "Your transaction is in order to accomplish");
        assertEquals(TransactionStatus.class, accountStatuses.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        TransactionStatus accountStatuses = new TransactionStatus(1, "Waiting", "Your transaction is in order to accomplish");
        assertEquals(TransactionStatus.class, accountStatuses.getClass());
    }
}