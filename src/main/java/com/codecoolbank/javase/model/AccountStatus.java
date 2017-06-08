package com.codecoolbank.javase.model;

public class AccountStatus extends AbstractNamingModel {

    public AccountStatus(String name, String description) {
        super(name, description);
    }

    public AccountStatus(Integer id, String name, String description) {
        super(id, name, description);
    }
}
