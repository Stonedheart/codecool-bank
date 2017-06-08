package com.codecoolbank.javase.model;

import java.math.BigDecimal;

public class Card extends AbstractNumberModel {
    private CardType cardType;
    private String validity;
    private BigDecimal buyingLimit;
    private BigDecimal cashWithDrawLimit;
    private BigDecimal limit;
    private Account account;
    private CardStatus cardStatus;

    public Card(String number, CardType cardType, String validity, BigDecimal buyingLimit, BigDecimal cashWithDrawLimit, BigDecimal limit, Account account, CardStatus cardStatus) {
        super(number);
        this.cardType = cardType;
        this.validity = validity;
        this.buyingLimit = buyingLimit;
        this.cashWithDrawLimit = cashWithDrawLimit;
        this.limit = limit;
        this.account = account;
        this.cardStatus = cardStatus;
    }

    public Card(Integer id, String number, CardType cardType, String validity, BigDecimal buyingLimit, BigDecimal cashWithDrawLimit, BigDecimal limit, Account account, CardStatus cardStatus) {
        super(id, number);
        this.cardType = cardType;
        this.validity = validity;
        this.buyingLimit = buyingLimit;
        this.cashWithDrawLimit = cashWithDrawLimit;
        this.limit = limit;
        this.account = account;
        this.cardStatus = cardStatus;
    }
}
