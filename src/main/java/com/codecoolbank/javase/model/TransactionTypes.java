package com.codecoolbank.javase.model;

public class TransactionTypes extends AbstractNamingModel {

    public TransactionTypes(String name, String description) {
        super(name, description);
    }

    public TransactionTypes(Integer id, String name, String description) {
        super(id, name, description);
    }
}
