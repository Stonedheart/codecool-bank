package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardStatusTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        CardStatus accountStatuses = new CardStatus("Active", "Card is active");
        assertEquals(CardStatus.class, accountStatuses.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() {
        CardStatus accountStatuses = new CardStatus(1, "Active", "Card is active");
        assertEquals(CardStatus.class, accountStatuses.getClass());
    }
}