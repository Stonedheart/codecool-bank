package com.codecoolbank.javase.model;

public class TransactionType extends AbstractNamingModel {

    public TransactionType(String name, String description) {
        super(name, description);
    }

    public TransactionType(Integer id, String name, String description) {
        super(id, name, description);
    }
}
