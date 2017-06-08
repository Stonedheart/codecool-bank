package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardStatusesTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        CardStatuses accountStatuses = new CardStatuses("Active","Card is active");
        assertEquals(CardStatuses.class, accountStatuses.getClass());
    }
}