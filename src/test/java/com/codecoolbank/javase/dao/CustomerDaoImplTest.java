package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Customer;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;


class CustomerDaoImplTest {

    @Test
    void testIfFindByIdIsValid() throws SQLException {
        Customer customerFromDb = new CustomerDaoImpl().findCustomerById(1);
        assertTrue(customerFromDb.getId() == 1);
    }

}