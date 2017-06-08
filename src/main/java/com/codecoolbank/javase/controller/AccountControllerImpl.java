package com.codecoolbank.javase.controller;

import com.codecoolbank.javase.dao.AccountDaoImpl;
import com.codecoolbank.javase.model.Account;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;
import java.sql.SQLException;

public class AccountControllerImpl implements AccountController {

    @Override
    public void deposit(Integer id, BigDecimal amount) throws SQLException, InvalidValue {
        Account account = new AccountDaoImpl().findAccountByID(id);
        if (account.equals(null)) {
            throw new NullPointerException("Account does not exists!");
        }
        if (account.getAccountStatus().getName().equals("Active")) {
            BigDecimal actualBalance = account.getBalance();
            BigDecimal newBalance = actualBalance.add(amount);

            Account updatedAccount = new Account(account.getId(), account.getCustomer(), account.getNumber(), account.getAccountType(), account.getAccountStatus(), account.getOpenDate(), newBalance, account.getDebitLine(), account.getInterest()) {
            }
        }
    }

    @Override
    public void withdraw(long amount) {

    }
}
