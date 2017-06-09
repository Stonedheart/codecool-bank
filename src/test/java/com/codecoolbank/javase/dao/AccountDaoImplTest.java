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

        SavingAccount savingAccount = new SavingAccount(1, testCustomer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);

        accountDaoImpl.saveAccountToDb(savingAccount);
        Integer testCustomerId = 2;
        assertEquals(testCustomerId, accountDaoImpl.findAccountByID(testCustomerId).getId());
    }

//    @Test
//    void testIfFindByIdIsValid() throws SQLException {
//        Customer customerFromDb = new CustomerDaoImpl().findCustomerById(1);
//        assertTrue(customerFromDb.getId() == 1);
//    }
//
//    @Test
//    void testIfFindByIdReturnNullIfIdIsInvalid() throws SQLException {
//        Integer invalidCustomerId = 10000000;
//        Customer customerFromDb = new CustomerDaoImpl().findCustomerById(invalidCustomerId);
//            assertEquals(null, customerFromDb );
//    }
}