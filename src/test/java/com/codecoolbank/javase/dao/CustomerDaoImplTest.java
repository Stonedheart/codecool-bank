package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Customer;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class CustomerDaoImplTest {

    @Test
    void testIfSuccessfullLogInReturnTrue() throws SQLException {
        final Integer customerID = 1;
        final String creteDate = "11-02-2014";
        final String lastLogin = "06-06-2017";
        Customer testCustomer = new Customer(customerID,"Jan", "Kowalski", "JFK", "notDead", creteDate, true, lastLogin);

        CustomerDaoImpl testCustomerDao = new CustomerDaoImpl();

        final String validLogin = testCustomer.getLogin();
        final String validPassword = testCustomer.getPassword();
        assertTrue(testCustomerDao.logIn(validLogin, validPassword));
    }

    @Test
    void testIfFailLogInReturnFalse() throws SQLException {
        CustomerDaoImpl testCustomerDao = new CustomerDaoImpl();

        final String invalidLogin = "user";
        final String invalidPassword = "1234";
        assertFalse(testCustomerDao.logIn(invalidLogin, invalidPassword));
    }

    @Test
    void testSaveCustomerToDbInsertQuery() throws SQLException {
        CustomerDaoImpl testCustomerDaoImpl = new CustomerDaoImpl();

        final String createDate = "01-01-2012";
        final String lastLogin = "10-11-2016";
        Customer testCustomer = new Customer("Marian", "Nowak", "mrn", "1234", createDate, true, lastLogin);

        testCustomerDaoImpl.saveCustomerToDb(testCustomer);

        final Integer testCustomerId = 2;
        assertEquals(testCustomerId, testCustomerDaoImpl.findCustomerById(testCustomerId).getId());
    }

    @Test
    void testSaveCustomerToDbUpdateQuery() throws SQLException {
        CustomerDaoImpl testCustomerDaoImpl = new CustomerDaoImpl();

        final Integer idCustomerFromDb = 1;
        Customer testCustomer = testCustomerDaoImpl.findCustomerById(idCustomerFromDb);
        testCustomer.changeCustomerStatus();
        testCustomerDaoImpl.saveCustomerToDb(testCustomer);

        Customer testCustomerAfterUpdate = testCustomerDaoImpl.findCustomerById(idCustomerFromDb);
        assertEquals(!testCustomer.getIsActive(), testCustomerAfterUpdate.getIsActive());
    }

    @Test
    void testIfFindByIdIsValid() throws SQLException {
        final Integer customerID = 1;
        Customer customerFromDb = new CustomerDaoImpl().findCustomerById(customerID);
        assertTrue(customerFromDb.getId() == customerID);
    }

    @Test
    void testIfFindByIdReturnNullIfIdIsInvalid() throws SQLException {
        final Integer invalidCustomerId = 10000000;
        Customer customerFromDb = new CustomerDaoImpl().findCustomerById(invalidCustomerId);
        assertEquals(null, customerFromDb );
    }
}