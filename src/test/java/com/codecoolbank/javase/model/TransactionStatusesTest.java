package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionStatusesTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        TransactionStatuses accountStatuses = new TransactionStatuses("Waiting","Your transaction is in order to accomplish");
        assertEquals(TransactionStatuses.class, accountStatuses.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        TransactionStatuses accountStatuses = new TransactionStatuses(1,"Waiting","Your transaction is in order to accomplish");
        assertEquals(TransactionStatuses.class, accountStatuses.getClass());
    }
}