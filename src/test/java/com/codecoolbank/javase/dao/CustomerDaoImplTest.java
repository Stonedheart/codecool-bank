package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Customer;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;


class CustomerDaoImplTest {

    @Test
    void testIfSuccessfullLogInReturnTrue() throws SQLException {
        Customer testCustomer = new Customer(1,"Jan", "Kowalski", "jfk", "notdead", "11-02-2014", true, "06-06-2017");
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
    void testIfFindByIdIsValid() throws SQLException {
        Customer customerFromDb = new CustomerDaoImpl().findCustomerById(1);
        assertTrue(customerFromDb.getId() == 1);
    }
}