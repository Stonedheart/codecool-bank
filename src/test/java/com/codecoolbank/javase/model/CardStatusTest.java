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
        final Integer cardStatusID = 1;
        CardStatus cardStatus = new CardStatus(cardStatusID, "Active", "Card is active");
        assertEquals(CardStatus.class, cardStatus.getClass());
    }
}