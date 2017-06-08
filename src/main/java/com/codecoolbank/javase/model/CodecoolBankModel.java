package com.codecoolbank.javase.model;

abstract class CodecoolBankModel extends BaseModel {
    private String name;
    private String description;

    public CodecoolBankModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CodecoolBankModel(Integer id, String name, String description) {
        super(id);
        this.name = name;
        this.description = description;
    }
}
