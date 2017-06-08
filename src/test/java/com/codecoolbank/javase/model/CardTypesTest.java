package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTypesTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        CardTypes accountStatuses = new CardTypes("Debit","Debit card for your savings, without credit limit");
        assertEquals(CardTypes.class, accountStatuses.getClass());
    }
}