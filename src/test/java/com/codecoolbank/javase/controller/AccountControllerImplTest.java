package com.codecoolbank.javase.controller;

import com.codecoolbank.javase.dao.AccountDaoImpl;
import com.codecoolbank.javase.model.Account;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class AccountControllerImplTest {
    @Test
    void testIfDepositThrowsNullPointerExceptionIfWhileAccountNonExist() throws SQLException, InvalidValue {
        AccountControllerImpl accountController = new AccountControllerImpl();

        final Integer accountID = 10;
        final BigDecimal moneyToDeposit = BigDecimal.valueOf(0.00);

        assertThrows(NullPointerException.class, ()-> accountController.deposit(accountID, moneyToDeposit));
    }

//    @Test
//    void testIfDepositAddFundsToAccount() throws SQLException, InvalidValue {
//        Integer accountID = 2;
//        AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
//        Account account = accountDaoImpl.findAccountByID(accountID);
//        new AccountControllerImpl().deposit(account.getId(), BigDecimal.valueOf(2000.00));
//        assertEquals(BigDecimal.valueOf(502000.00), accountDaoImpl.findAccountByID(accountID).getBalance());
//    }
}