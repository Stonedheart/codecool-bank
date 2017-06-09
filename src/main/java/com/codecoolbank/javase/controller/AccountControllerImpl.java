package com.codecoolbank.javase.controller;

import com.codecoolbank.javase.dao.AccountDaoImpl;
import com.codecoolbank.javase.model.Account;
import com.codecoolbank.javase.model.DebitAccount;
import com.codecoolbank.javase.model.SavingAccount;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;
import java.sql.SQLException;

public class AccountControllerImpl implements AccountController {
    private AccountDaoImpl accountDaoImpl = new AccountDaoImpl();

    @Override
    public void deposit(Integer id, BigDecimal amount) throws SQLException, InvalidValue {
        Account account = new AccountDaoImpl().findAccountByID(id);
        if (account == null) {
            throw new NullPointerException("Account does not exists!");
        }

        if (account.getAccountStatus().getName().equals("Active")) {
            BigDecimal actualBalance = account.getBalance();
            BigDecimal newBalance = actualBalance.add(amount);

            switch (account.getAccountType().getName()) {
                case "Saving account":
                    SavingAccount updatedSavingAccount = new SavingAccount(account.getId(), account.getCustomer(), account.getNumber(), account.getAccountType(), account.getAccountStatus(), account.getOpenDate(), newBalance, account.getDebitLine(), account.getInterest());
                    accountDaoImpl.saveAccountToDb(updatedSavingAccount);
                    break;
                case "Debit account":
                    DebitAccount updatedDebitAccount = new DebitAccount(account.getId(), account.getCustomer(), account.getNumber(), account.getAccountType(), account.getAccountStatus(), account.getOpenDate(), newBalance, account.getDebitLine(), account.getInterest());
                    accountDaoImpl.saveAccountToDb(updatedDebitAccount);
                    break;
                default:
                    throw new InvalidValue("There is no such account type!");
            }
        }
    }

    @Override
    public void withdraw(long amount) {

    }
}
