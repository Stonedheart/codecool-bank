package com.codecoolbank.javase.model;

public class AccountTypes extends AbstractCodecoolBankModel {

    public AccountTypes(String name, String description) {
        super(name, description);
    }

    public AccountTypes(Integer id, String name, String description) {
        super(id, name, description);
    }
}
