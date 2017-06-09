package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.*;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class AccountDaoImplTest {
    @Test
    void testSavingAccountToDbByUpdateQuery() throws SQLException, InvalidValue {
        AccountDaoImpl accountDaoImpl = new AccountDaoImpl();

        final String createDate = "01-01-2012";
        final String lastLogin = "10-11-2016";
        Customer testCustomer = new Customer("John", "Coltraine", "coltr85", "cTH-85", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer savingAccountID = 2;
        final String accountNumber = "00008798123400000012";
        final BigDecimal balanceOnAccount = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLine = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(savingAccountID, testCustomer, accountNumber, accountType, accountStatus, "12-02-2015", balanceOnAccount, debitLine, interest);

        accountDaoImpl.saveAccountToDb(savingAccount);
        final Integer testAccountId = 2;
        assertEquals(testAccountId, accountDaoImpl.findAccountByID(testAccountId).getId());
    }

    @Test
    void testDebitAccountToDbByInsertQuery() throws SQLException, InvalidValue {
        AccountDaoImpl accountDaoImpl = new AccountDaoImpl();

        final Integer customerID = 3;
        final String createDate = "01-01-2012";
        final String lastLogin = "10-11-2016";
        Customer testCustomer = new Customer(customerID,"Marian", "Nowak", "mrn", "1234", createDate, true, lastLogin);

        final Integer accountTypeID = 2;
        AccountType accountType = new AccountType(accountTypeID, "Debit account", "Account to keeps your money");

        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        final String accountNumber = "00008798123400000025";
        final String openDate = "12-02-2015";
        final BigDecimal balanceOnAccount = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLine = BigDecimal.valueOf(0.00);
        final Integer interest = 0;
        DebitAccount debitAccount = new DebitAccount(testCustomer, accountNumber, accountType, accountStatus, openDate, balanceOnAccount, debitLine, interest);

        accountDaoImpl.saveAccountToDb(debitAccount);

        final Integer testAccountId = 2;
        assertEquals(testAccountId, accountDaoImpl.findAccountByID(testAccountId).getId());
    }

    @Test
    void testIfFindByIdIsValid() throws SQLException, InvalidValue {
        final Integer accountID = 1;
        Account accountFromDB = new AccountDaoImpl().findAccountByID(accountID);
        assertTrue(accountFromDB.getId() == accountID);
    }

    @Test
    void testIfFindByIdReturnNullIfIdIsInvalid() throws SQLException, InvalidValue {
        Integer invalidCustomerId = 666;
        Account accountFromDB = new AccountDaoImpl().findAccountByID(invalidCustomerId);
        assertEquals(null, accountFromDB);
    }
}