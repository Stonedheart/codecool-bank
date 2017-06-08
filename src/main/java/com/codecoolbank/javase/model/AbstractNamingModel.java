package com.codecoolbank.javase.model;

public abstract class AbstractNamingModel extends AbstractDescriptionModel {
    private String name;

    public AbstractNamingModel(String name, String description) {
        super(description);
        this.name = name;
    }

    public AbstractNamingModel(Integer id, String name, String description) {
        super(id, description);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
