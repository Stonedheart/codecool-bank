package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTypeTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        CardType testCardType = new CardType("Debit", "Debit card for your savings, without credit limit");
        assertEquals(CardType.class, testCardType.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        CardType testCardType = new CardType(1, "Debit", "Debit card for your savings, without credit limit");
        assertEquals(CardType.class, testCardType.getClass());
    }
}