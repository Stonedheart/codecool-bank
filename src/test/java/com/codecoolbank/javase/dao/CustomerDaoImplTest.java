package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Customer;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;


class CustomerDaoImplTest {

    @Test
    void testIfCustomerIsInsertToDatabaseProperly() throws SQLException {
        Customer testCustomer = new Customer("Bob", "Nowak", "urMum", "notDead", "11-11-2014", true, "24-01-2017");
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        customerDao.saveCustomerToDb(testCustomer);

        Customer customerFromDb = new CustomerDaoImpl().findCustomerById(2);
        assertTrue(customerFromDb.getId() == 2);
    }

    @Test
    void testIfFindByIdIsValid() throws SQLException {
        Customer customerFromDb = new CustomerDaoImpl().findCustomerById(1);
        assertTrue(customerFromDb.getId() == 1);
    }
}