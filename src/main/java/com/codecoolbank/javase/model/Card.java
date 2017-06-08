package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class Card extends AbstractBaseModel {
    private String number;
    private CardTypes cardType;
    private String validity;
    private BigDecimal buyingLimit;
    private BigDecimal cashWithDrawLimit;
    private BigDecimal limit;
    private Account account;
    private CardStatuses cardStatus;

    public Card(String number, CardTypes cardType, String validity, BigDecimal buyingLimit, BigDecimal cashWithDrawLimit, BigDecimal limit, Account account, CardStatuses cardStatus) {
        this.number = number;
        this.cardType = cardType;
        this.validity = validity;
        this.buyingLimit = buyingLimit;
        this.cashWithDrawLimit = cashWithDrawLimit;
        this.limit = limit;
        this.account = account;
        this.cardStatus = cardStatus;
    }

    public Card(Integer id, String number, CardTypes cardType, String validity, BigDecimal buyingLimit, BigDecimal cashWithDrawLimit, BigDecimal limit, Account account, CardStatuses cardStatus) {
        super(id);
        this.number = number;
        this.cardType = cardType;
        this.validity = validity;
        this.buyingLimit = buyingLimit;
        this.cashWithDrawLimit = cashWithDrawLimit;
        this.limit = limit;
        this.account = account;
        this.cardStatus = cardStatus;
    }
}
