package com.codecoolbank.javase.model;

public class CardTypes extends AbstractDescriptionModel {

    public CardTypes(String name, String description) {
        super(name, description);
    }

    public CardTypes(Integer id, String name, String description) {
        super(id, name, description);
    }
}
