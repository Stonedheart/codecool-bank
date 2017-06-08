package com.codecoolbank.javase.model;

public class AccountStatuses extends AbstractCodecoolBankModel {

    public AccountStatuses(String name, String description) {
        super(name, description);
    }

    public AccountStatuses(Integer id, String name, String description) {
        super(id, name, description);
    }
}
