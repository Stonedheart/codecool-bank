package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class SavingAccount extends Account {

    public SavingAccount(Customer customer, String number, AccountType accountType, AccountStatus accountStatus, String openDate, BigDecimal balance, BigDecimal debitLine, Integer interest) {
        super(customer, number, accountType, accountStatus, openDate, balance, debitLine, interest);
    }

    public SavingAccount(Integer id, Customer customer, String number, AccountType accountType, AccountStatus accountStatus, String openDate, BigDecimal balance, BigDecimal debitLine, Integer interest) {
        super(id, customer, number, accountType, accountStatus, openDate, balance, debitLine, interest);
    }
}