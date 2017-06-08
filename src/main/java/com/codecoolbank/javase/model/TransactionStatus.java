package com.codecoolbank.javase.model;

public class TransactionStatus extends AbstractNamingModel {

    public TransactionStatus(String name, String description) {
        super(name, description);
    }

    public TransactionStatus(Integer id, String name, String description) {
        super(id, name, description);
    }
}
