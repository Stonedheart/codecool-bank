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
        Customer testCustomer = new Customer("Marian", "Nowak", "mrn", "1234", "01-01-2012", true, "10-11-2016");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        SavingAccount savingAccount = new SavingAccount(2, testCustomer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);

        accountDaoImpl.saveAccountToDb(savingAccount);
        Integer testAccountId = 2;
        assertEquals(testAccountId, accountDaoImpl.findAccountByID(testAccountId).getId());
    }

    @Test
    void testDebitAccountToDbByInsertQuery() throws SQLException, InvalidValue {
        AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
        Customer testCustomer = new Customer(3,"Marian", "Nowak", "mrn", "1234", "01-01-2012", true, "10-11-2016");
        AccountType accountType = new AccountType(2, "Debit account", "Account to keeps your money");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(testCustomer, "00008798123400000025", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);

        accountDaoImpl.saveAccountToDb(debitAccount);
        Integer testAccountId = 2;
        assertEquals(testAccountId, accountDaoImpl.findAccountByID(testAccountId).getId());
    }

    @Test
    void testIfFindByIdIsValid() throws SQLException, InvalidValue {
        Account accountFromDB = new AccountDaoImpl().findAccountByID(1);
        assertTrue(accountFromDB.getId() == 1);
    }

//    @Test
//    void testIfFindByIdReturnInvalidValueException() throws SQLException, InvalidValue {
//        AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
//        Account accountFromDB = new AccountDaoImpl().findAccountByID(3);
//        assertThrows(InvalidValue.class, ()-> accountDaoImpl.findAccountByID(accountFromDB.getId()));
//    }

    @Test
    void testIfFindByIdReturnNullIfIdIsInvalid() throws SQLException, InvalidValue {
        Integer invalidCustomerId = 666;
        Account accountFromDB = new AccountDaoImpl().findAccountByID(invalidCustomerId);
            assertEquals(null, accountFromDB);
    }
}