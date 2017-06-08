package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class Cards {
    private String number;
    private String validity;
    private BigDecimal buyingLimit;
    private BigDecimal cashWithDrawLimit;
    private BigDecimal limit;
    private CardTypes cardType;
    private CardStatuses cardStatus;
    private Accounts account;

    public Cards(String number, String validity, BigDecimal buyingLimit, BigDecimal cashWithDrawLimit, BigDecimal limit, CardTypes cardType, CardStatuses cardStatus, Accounts account) {
        this.number = number;
        this.validity = validity;
        this.buyingLimit = buyingLimit;
        this.cashWithDrawLimit = cashWithDrawLimit;
        this.limit = limit;
        this.cardType = cardType;
        this.cardStatus = cardStatus;
        this.account = account;
    }
}
