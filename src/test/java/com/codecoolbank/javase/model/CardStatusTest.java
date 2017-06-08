package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardStatusTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        CardStatus cardStatus = new CardStatus("Active", "Card is active");
        assertEquals(CardStatus.class, cardStatus.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        CardStatus cardStatus = new CardStatus(1, "Active", "Card is active");
        assertEquals(CardStatus.class, cardStatus.getClass());
    }
}