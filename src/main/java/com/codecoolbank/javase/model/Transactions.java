package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class Transactions extends AbstractCodecoolBankModel {
    private String dateOfTransaction;
    private TransactionTypes transactionType;
    private BigDecimal value;
    private TransactionStatuses transactionStatus;
    private Accounts account;
    private Cards card;

    public Transactions(String dateOfTransaction, TransactionTypes transactionType, BigDecimal value, String description, TransactionStatuses transactionStatus, Accounts account, Cards card) {
        super(description);
        this.dateOfTransaction = dateOfTransaction;
        this.transactionType = transactionType;
        this.value = value;
        this.transactionStatus = transactionStatus;
        this.account = account;
        this.card = card;
    }

    public Transactions(Integer id, String dateOfTransaction, TransactionTypes transactionType, BigDecimal value, String description, TransactionStatuses transactionStatus, Accounts account, Cards card) {
        super(id, description);
        this.dateOfTransaction = dateOfTransaction;
        this.transactionType = transactionType;
        this.value = value;
        this.transactionStatus = transactionStatus;
        this.account = account;
        this.card = card;
    }
}
