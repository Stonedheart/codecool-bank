package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() throws InvalidValue {
        CardType cardType = new CardType(1, "Debit", "Debit card for your savings, without credit limit");
        CardStatus cardStatus = new CardStatus(1, "Active", "Card is active");

        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 2,5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");
        SavingAccount account = new SavingAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 1);

        Card card = new Card("00008798123400000015", cardType, "5644", BigDecimal.valueOf(0.00), BigDecimal.valueOf(500.00), BigDecimal.valueOf(0.00), account, cardStatus);
        assertEquals(Card.class, card.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() throws InvalidValue {
        CardType cardType = new CardType(1, "Debit", "Debit card for your savings, without credit limit");
        CardStatus cardStatus = new CardStatus(1, "Active", "Card is active");

        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");
        SavingAccount account = new SavingAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);

        Card card = new Card(1,"00008798123400000015", cardType, "5644", BigDecimal.valueOf(0.00), BigDecimal.valueOf(500.00), BigDecimal.valueOf(0.00), account, cardStatus);
        assertEquals(Card.class, card.getClass());
    }
}