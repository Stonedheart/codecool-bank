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
        Customer testCustomer = new Customer(1, "Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        assertEquals(Customer.class, testCustomer.getClass());
    }

    @Test
    void testGetters() {
        Customer testCustomer = new Customer(1,"Jan", "Kowalski", "jfk", "notdead", "11-11-2011", true, "06-06-2017");
        assertAll(
                ()-> assertTrue(testCustomer.getId() == 1),
                ()-> assertTrue(testCustomer.getFirstName().equals("Jan")),
                ()-> assertTrue(testCustomer.getLastName().equals("Kowalski")),
                ()-> assertTrue(testCustomer.getLogin().equals("jfk")),
                ()-> assertTrue(testCustomer.getPassword().equals("notdead")),
                ()-> assertTrue(testCustomer.getCreateDate().equals("11-11-2011")),
                ()-> assertTrue(testCustomer.getIsActive().equals(true)),
                ()-> assertTrue(testCustomer.getLastLogin().equals("06-06-2017"))
        );
    }

    @Test
    void testIfSuccessfullLogInReturnTrue() {
        Customer testCustomer = new Customer(1,"Jan", "Kowalski", "jfk", "notdead", "11-11-2011", true, "06-06-2017");
        String validLogin = testCustomer.getLogin();
        String validPassword = testCustomer.getPassword();
        assertTrue(testCustomer.logIn(validLogin, validPassword));
    }

    @Test
    void testIfFailLogInReturnFalse() {
        Customer testCustomer = new Customer(1,"Jan", "Kowalski", "jfk", "notdead", "11-11-2011", true, "06-06-2017");
        String invalidLogin = "user";
        String invalidPassword = "1234";
        assertFalse(testCustomer.logIn(invalidLogin, invalidPassword));
    }

    }