package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        TransactionType transactionType = new TransactionType(1, "External", "External transaction to the another account");
        TransactionStatus transactionStatus = new TransactionStatus(1, "Waiting", "Your transaction is in order to accomplish");

        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 2,5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");
        Account account = new Account(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 1);

        CardType cardType = new CardType(1, "Debit", "Debit card for your savings, without credit limit");
        CardStatus cardStatus = new CardStatus(1, "Active", "Card is active");
        Card card = new Card(1,"00008798123400000015", cardType, "5644", BigDecimal.valueOf(0.00), BigDecimal.valueOf(500.00), BigDecimal.valueOf(0.00), account, cardStatus);

        Transaction transaction = new Transaction("08-06-2017", transactionType, BigDecimal.valueOf(0.00), "Paying rate for Codecool", transactionStatus, account, card);
        assertEquals(Transaction.class, transaction.getClass());
    }
}