package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class Transaction extends AbstractDescriptionModel {
    private String dateOfTransaction;
    private TransactionType transactionType;
    private BigDecimal value;
    private TransactionStatus transactionStatus;
    private Account account;
    private Card card;

    public Transaction(String dateOfTransaction, TransactionType transactionType, BigDecimal value, String description, TransactionStatus transactionStatus, Account account, Card card) {
        super(description);
        this.dateOfTransaction = dateOfTransaction;
        this.transactionType = transactionType;
        this.value = value;
        this.transactionStatus = transactionStatus;
        this.account = account;
        this.card = card;
    }

    public Transaction(Integer id, String dateOfTransaction, TransactionType transactionType, BigDecimal value, String description, TransactionStatus transactionStatus, Account account, Card card) {
        super(id, description);
        this.dateOfTransaction = dateOfTransaction;
        this.transactionType = transactionType;
        this.value = value;
        this.transactionStatus = transactionStatus;
        this.account = account;
        this.card = card;
    }
}
