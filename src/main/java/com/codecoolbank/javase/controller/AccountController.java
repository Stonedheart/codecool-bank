package com.codecoolbank.javase.controller;

public interface AccountController {
    void deposit(long amount);
    void withdraw(long amount);
    long getBalance();
    int getAccountId();
}
