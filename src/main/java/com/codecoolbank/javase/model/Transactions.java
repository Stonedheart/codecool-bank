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
}
