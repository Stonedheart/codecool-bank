package com.codecoolbank.javase.model;

public class TransactionStatuses extends AbstractCodecoolBankModel {

    public TransactionStatuses(String name, String description) {
        super(name, description);
    }

    public TransactionStatuses(Integer id, String name, String description) {
        super(id, name, description);
    }
}
