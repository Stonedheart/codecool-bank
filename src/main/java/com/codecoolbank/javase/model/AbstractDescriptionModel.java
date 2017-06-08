package com.codecoolbank.javase.model;

public abstract class AbstractDescriptionModel extends AbstractBaseModel {
    private String description;

    public AbstractDescriptionModel(String description) {
        this.description = description;
    }

    public AbstractDescriptionModel(Integer id, String description) {
        super(id);
        this.description = description;
    }
}
