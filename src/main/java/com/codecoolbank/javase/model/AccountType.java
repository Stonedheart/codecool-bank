package com.codecoolbank.javase.model;

public class AccountType extends AbstractNamingModel {

    public AccountType(String name, String description) {
        super(name, description);
    }

    public AccountType(Integer id, String name, String description) {
        super(id, name, description);
    }
}
