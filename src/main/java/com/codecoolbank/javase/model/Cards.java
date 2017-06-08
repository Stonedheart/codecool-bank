package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class Cards extends AbstractBaseModel {
    private String number;
    private CardTypes cardType;
    private String validity;
    private BigDecimal buyingLimit;
    private BigDecimal cashWithDrawLimit;
    private BigDecimal limit;
    private Accounts account;
    private CardStatuses cardStatus;

    public Cards(String number, CardTypes cardType, String validity, BigDecimal buyingLimit, BigDecimal cashWithDrawLimit, BigDecimal limit, Accounts account, CardStatuses cardStatus) {
        this.number = number;
        this.cardType = cardType;
        this.validity = validity;
        this.buyingLimit = buyingLimit;
        this.cashWithDrawLimit = cashWithDrawLimit;
        this.limit = limit;
        this.account = account;
        this.cardStatus = cardStatus;
    }

    public Cards(Integer id, String number, CardTypes cardType, String validity, BigDecimal buyingLimit, BigDecimal cashWithDrawLimit, BigDecimal limit, Accounts account, CardStatuses cardStatus) {
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
