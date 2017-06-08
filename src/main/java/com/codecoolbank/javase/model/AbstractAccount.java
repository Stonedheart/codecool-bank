package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public abstract class AbstractAccount extends AbstractNumberModel implements Account {
    private Customer customer;
    private AccountType accountType;
    private AccountStatus accountStatus;
    private String openDate;
    private BigDecimal balance;
    private BigDecimal debitLine;
    private Integer interest;

    public AbstractAccount(Customer customer, String number, AccountType accountType, AccountStatus accountStatus, String openDate, BigDecimal balance, BigDecimal debitLine, Integer interest) {
        super(number);
        this.customer = customer;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
        this.openDate = openDate;
        this.balance = balance;
        this.debitLine = debitLine;
        this.interest = interest;
    }

    public AbstractAccount(Integer id, Customer customer, String number, AccountType accountType, AccountStatus accountStatus, String openDate, BigDecimal balance, BigDecimal debitLine, Integer interest) {
        super(id, number);
        this.customer = customer;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
        this.openDate = openDate;
        this.balance = balance;
        this.debitLine = debitLine;
        this.interest = interest;
    }

    public void deposit(long amount) {}

    public void withdraw(long amount) {}

    public long getBalance() {
        return 0;
    }

    public int getAccountId() {
        return 0;
    }
}
