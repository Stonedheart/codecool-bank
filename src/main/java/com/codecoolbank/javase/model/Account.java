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
}
