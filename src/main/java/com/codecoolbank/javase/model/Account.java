package com.codecoolbank.javase.model;

public interface Account {
    void deposit(long amount);
    void withdraw(long amount);
    long getBalance();
    int getAccountId();
}
