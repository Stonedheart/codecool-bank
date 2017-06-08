package com.codecoolbank.javase.model;

public abstract class AbstractBaseModel {
    private Integer id;

    public AbstractBaseModel() {}

    public AbstractBaseModel(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
