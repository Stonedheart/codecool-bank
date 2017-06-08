package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class Transactions extends AbstractCodecoolBankModel {
    private String dateOfTransaction;
    private BigDecimal value;
    private TransactionTypes transactionType;
    private TransactionStatuses transactionStatus;
    private Accounts account;
    private Cards card;

    public Transactions(String dateOfTransaction, BigDecimal value, String description, TransactionTypes transactionType, TransactionStatuses transactionStatus, Account account, Cards card) {
        super(description);
        this.dateOfTransaction = dateOfTransaction;
        this.value = value;
        this.transactionType = transactionType;
        this.transactionStatus = transactionStatus;
        this.account = account;
        this.card = card;
    }

    public Transactions(Integer id, String dateOfTransaction, BigDecimal value, String description, TransactionTypes transactionType, TransactionStatuses transactionStatus, Account account, Cards card) {
        super(id, description);
        this.dateOfTransaction = dateOfTransaction;
        this.value = value;
        this.transactionType = transactionType;
        this.transactionStatus = transactionStatus;
        this.account = account;
        this.card = card;
    }
}
