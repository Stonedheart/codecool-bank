package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testIfConstructorWithoutIdInitializeValidClassInstance() {
        Customer testCustomer = new Customer("Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        assertEquals(Customer.class, testCustomer.getClass());
    }

    @Test
    void testIfConstructorWithIdInitializeValidClassInstance() {
        Customer testCustomer = new Customer(1, "Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        assertEquals(Customer.class, testCustomer.getClass());
    }



    }