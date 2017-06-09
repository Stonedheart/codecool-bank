package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Customer;
import com.codecoolbank.javase.model.HashingPassword;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class CustomerDaoImplTest {

    @Test
    void testIfSuccessfullLogInReturnTrue() throws SQLException {
        Customer testCustomer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-02-2014", true, "06-06-2017");
        CustomerDaoImpl testCustomerDao = new CustomerDaoImpl();
        String validLogin = testCustomer.getLogin();
        String validPassword = testCustomer.getPassword();
        assertTrue(testCustomerDao.logIn(validLogin, validPassword));
    }

    @Test
    void testIfFailLogInReturnFalse() throws SQLException {
        CustomerDaoImpl testCustomerDao = new CustomerDaoImpl();
        String invalidLogin = "user";
        String invalidPassword = "1234";
        assertFalse(testCustomerDao.logIn(invalidLogin, invalidPassword));
    }

    @Test
    void testSaveCustomerToDbInsertQuery() throws SQLException {
        CustomerDaoImpl testCustomerDaoImpl = new CustomerDaoImpl();
        Customer testCustomer = new Customer("Marian", "Nowak", "mrn", "1234", "01-01-2012", true, "10-11-2016");
        testCustomerDaoImpl.saveCustomerToDb(testCustomer);
        Integer testCustomerId = 2;
        assertEquals(testCustomerId, testCustomerDaoImpl.findCustomerById(testCustomerId).getId());
    }

    @Test
    void testSaveCustomerToDbUpdateQuery() throws SQLException {
        CustomerDaoImpl testCustomerDaoImpl = new CustomerDaoImpl();
        Integer idCustomerFromDb = 1;

        Customer testCustomer = testCustomerDaoImpl.findCustomerById(idCustomerFromDb);
        testCustomer.changeCustomerStatus();
        testCustomerDaoImpl.saveCustomerToDb(testCustomer);

        Customer testCustomerAfterUpdate = testCustomerDaoImpl.findCustomerById(idCustomerFromDb);

        assertEquals(!testCustomer.getIsActive(), testCustomerAfterUpdate.getIsActive());
    }

    @Test
    void testIfFindByIdIsValid() throws SQLException {
        Customer customerFromDb = new CustomerDaoImpl().findCustomerById(1);
        assertTrue(customerFromDb.getId() == 1);
    }

    @Test
    void testIfFindByIdReturnNullIfIdIsInvalid() throws SQLException {
        Integer invalidCustomerId = 10000000;
        Customer customerFromDb = new CustomerDaoImpl().findCustomerById(invalidCustomerId);
        assertEquals(null, customerFromDb );
    }
}