package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testIfConstructorWithoutIdInitializeValidClassInstance() {
        Customer testCustomer = new Customer("Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        assertEquals(Customer.class, testCustomer.getClass());
    }

    @Test
    void testIfConstructorWithIdInitializeValidClassInstance() {
        Customer customer = new Customer(1, "Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        assertEquals(Customer.class, customer.getClass());
    }

    @Test
    void testGetters() {
        Customer customer = new Customer(1,"Jan", "Kowalski", "jfk", "notdead", "11-11-2011", true, "06-06-2017");
        assertAll(
                ()-> assertTrue(customer.getId() == 1),
                ()-> assertTrue(customer.getFirstName().equals("Jan")),
                ()-> assertTrue(customer.getLastName().equals("Kowalski")),
                ()-> assertTrue(customer.getLogin().equals("jfk")),
                ()-> assertTrue(customer.getPassword().equals("notdead")),
                ()-> assertTrue(customer.getCreateDate().equals("11-11-2011")),
                ()-> assertTrue(customer.getIsActive().equals(true)),
                ()-> assertTrue(customer.getLastLogin().equals("06-06-2017"))
        );
    }
}