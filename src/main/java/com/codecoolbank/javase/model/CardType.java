package com.codecoolbank.javase.model;

public class CardType extends AbstractNamingModel {

    public CardType(String name, String description) {
        super(name, description);
    }

    public CardType(Integer id, String name, String description) {
        super(id, name, description);
    }
}
