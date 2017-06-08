package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class Account {
    private Customer customer;
    private String number;
    private AccountTypes accountType;
    private AccountStatuses accountStatus;
    private String openDate;
    private BigDecimal balance;
    private BigDecimal debitLine;
    private Integer interest;

    public Account(Customer customer, String number, AccountTypes accountType, AccountStatuses accountStatus, String openDate, BigDecimal balance, BigDecimal debitLine, Integer interest) {
        this.customer = customer;
        this.number = number;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
        this.openDate = openDate;
        this.balance = balance;
        this.debitLine = debitLine;
        this.interest = interest;
    }
}
