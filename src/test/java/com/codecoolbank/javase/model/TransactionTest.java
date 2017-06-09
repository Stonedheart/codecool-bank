package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void testIfConstructorWithoutIDIsInitializedValid() throws InvalidValue {
        final Integer transactionTypeID = 1;
        TransactionType transactionType = new TransactionType(transactionTypeID, "External", "External transaction to the another account");

        final Integer transactionStatusID = 1;
        TransactionStatus transactionStatus = new TransactionStatus(transactionStatusID, "Waiting", "Your transaction is in order to accomplish");

        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);

        final Integer cardTypeID = 1;
        CardType cardType = new CardType(cardTypeID, "Debit", "Debit card for your savings, without credit limit");

        final Integer cardStatusID = 1;
        CardStatus cardStatus = new CardStatus(cardStatusID, "Active", "Card is active");

        final String cardNumber = "00008798123400000015";
        final String cardValidity = "5644";
        final BigDecimal buyingLimit = BigDecimal.valueOf(2500.00);
        final BigDecimal cashWithdrawLimit = BigDecimal.valueOf(500.00);
        final BigDecimal limit = BigDecimal.valueOf(0.00);
        Card card = new Card(cardNumber, cardType, cardValidity, buyingLimit, cashWithdrawLimit, limit, savingAccount, cardStatus);

        final String dateOfTransaction = "08-06-2017";
        final BigDecimal transferingMoneyAmount = BigDecimal.valueOf(50.00);
        Transaction transaction = new Transaction(dateOfTransaction, transactionType, transferingMoneyAmount, "Paying rate for Codecool", transactionStatus, savingAccount, card);
        assertEquals(Transaction.class, transaction.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() throws InvalidValue {
        final Integer transactionTypeID = 1;
        TransactionType transactionType = new TransactionType(transactionTypeID, "External", "External transaction to the another account");

        final Integer transactionStatusID = 1;
        TransactionStatus transactionStatus = new TransactionStatus(transactionStatusID, "Waiting", "Your transaction is in order to accomplish");

        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);

        final Integer cardTypeID = 1;
        CardType cardType = new CardType(cardTypeID, "Debit", "Debit card for your savings, without credit limit");

        final Integer cardStatusID = 1;
        CardStatus cardStatus = new CardStatus(cardStatusID, "Active", "Card is active");

        final String cardNumber = "00008798123400000015";
        final String cardValidity = "5644";
        final BigDecimal buyingLimit = BigDecimal.valueOf(2500.00);
        final BigDecimal cashWithdrawLimit = BigDecimal.valueOf(500.00);
        final BigDecimal limit = BigDecimal.valueOf(0.00);
        Card card = new Card(cardNumber, cardType, cardValidity, buyingLimit, cashWithdrawLimit, limit, savingAccount, cardStatus);

        final Integer transactionID = 1;
        final String dateOfTransaction = "08-06-2017";
        final BigDecimal transferingMoneyAmount = BigDecimal.valueOf(50.00);
        Transaction transaction = new Transaction(transactionID, dateOfTransaction, transactionType, transferingMoneyAmount, "Paying rate for Codecool", transactionStatus, savingAccount, card);
        assertEquals(Transaction.class, transaction.getClass());
    }
}