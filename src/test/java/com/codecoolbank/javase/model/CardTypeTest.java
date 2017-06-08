package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTypeTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        CardType accountStatuses = new CardType("Debit", "Debit card for your savings, without credit limit");
        assertEquals(CardType.class, accountStatuses.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        CardType accountStatuses = new CardType(1, "Debit", "Debit card for your savings, without credit limit");
        assertEquals(CardType.class, accountStatuses.getClass());
    }
}