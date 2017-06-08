package com.codecoolbank.javase.model;

public abstract class AbstractCodecoolBankModel extends AbstractBaseModel {
    private String name;
    private String description;

    public AbstractCodecoolBankModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public AbstractCodecoolBankModel(Integer id, String name, String description) {
        super(id);
        this.name = name;
        this.description = description;
    }
}
