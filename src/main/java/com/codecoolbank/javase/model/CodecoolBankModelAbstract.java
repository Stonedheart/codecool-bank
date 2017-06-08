package com.codecoolbank.javase.model;

public abstract class CodecoolBankModelAbstract extends AbstractBaseModel {
    private String name;
    private String description;

    public CodecoolBankModelAbstract(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CodecoolBankModelAbstract(Integer id, String name, String description) {
        super(id);
        this.name = name;
        this.description = description;
    }
}
