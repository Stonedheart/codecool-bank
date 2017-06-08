package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class Transactions {
    private String dateOfTransaction;
    private BigDecimal value;
    private String description;
    private TransactionTypes transactionType;
    private TransactionStatuses transactionStatus;
    private Account account;
    private Card card;

    public Transactions(String dateOfTransaction, BigDecimal value, String description, TransactionTypes transactionType, TransactionStatuses transactionStatus, Account account, Card card) {
        this.dateOfTransaction = dateOfTransaction;
        this.value = value;
        this.description = description;
        this.transactionType = transactionType;
        this.transactionStatus = transactionStatus;
        this.account = account;
        this.card = card;
    }
}
