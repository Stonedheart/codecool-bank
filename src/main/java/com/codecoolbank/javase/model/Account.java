package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class Account extends AbstractNumberModel {
    private Customer customer;
    private AccountType accountType;
    private AccountStatus accountStatus;
    private String openDate;
    private BigDecimal balance;
    private BigDecimal debitLine;
    private Integer interest;

    public Account(Customer customer, String number, AccountType accountType, AccountStatus accountStatus, String openDate, BigDecimal balance, BigDecimal debitLine, Integer interest) {
        super(number);
        this.customer = customer;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
        this.openDate = openDate;
        this.balance = balance;
        this.debitLine = debitLine;
        this.interest = interest;
    }

    public Account(Integer id, Customer customer, String number, AccountType accountType, AccountStatus accountStatus, String openDate, BigDecimal balance, BigDecimal debitLine, Integer interest) {
        super(id, number);
        this.customer = customer;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
        this.openDate = openDate;
        this.balance = balance;
        this.debitLine = debitLine;
        this.interest = interest;
    }
}
