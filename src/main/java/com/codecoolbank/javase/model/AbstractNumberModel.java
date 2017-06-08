package com.codecoolbank.javase.model;

public abstract class AbstractNumberModel extends AbstractBaseModel {
    private String number;

    public AbstractNumberModel(String number) {
        this.number = number;
    }

    public AbstractNumberModel(Integer id, String number) {
        super(id);
        this.number = number;
    }
}
