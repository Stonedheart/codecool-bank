package com.codecoolbank.javase.model;

abstract class BaseModel {
    private Integer id;

    public BaseModel() {}

    public BaseModel(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
