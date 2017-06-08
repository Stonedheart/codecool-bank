package com.codecoolbank.javase.model;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    public DebitAccount(Customer customer, String number, AccountType accountType, AccountStatus accountStatus, String openDate, BigDecimal balance, BigDecimal debitLine, Integer interest) {
        super(customer, number, accountType, accountStatus, openDate, balance, debitLine, interest);
    }

    public DebitAccount(Integer id, Customer customer, String number, AccountType accountType, AccountStatus accountStatus, String openDate, BigDecimal balance, BigDecimal debitLine, Integer interest) throws InvalidValue {
        super(id, customer, number, accountType, accountStatus, openDate, balance, debitLine, interest);
    }
}
