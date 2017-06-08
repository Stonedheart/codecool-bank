package com.codecoolbank.javase.model;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;

public abstract class Account extends AbstractNumberModel {
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

    public Account(Integer id, Customer customer, String number, AccountType accountType, AccountStatus accountStatus, String openDate, BigDecimal balance, BigDecimal debitLine, Integer interest) throws InvalidValue {
        super(id, number);
        this.customer = customer;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
        this.openDate = openDate;
        setBalance(balance);
        this.debitLine = debitLine;
        this.interest = interest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public String getOpenDate() {
        return openDate;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    private void setBalance(BigDecimal balance) throws InvalidValue {
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidValue();
        }
        this.balance = balance;
    }

    public BigDecimal getDebitLine() {
        return debitLine;
    }

    public Integer getInterest() {
        return interest;
    }
}
