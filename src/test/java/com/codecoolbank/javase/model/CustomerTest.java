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

//    @Test
//    void testIfSuccessfullLogInReturnTrue() {
//        Customer t
    // estCustomer = new Customer(1,"Jan", "Kowalski", "jfk", "notdead", "11-11-2011", true, "06-06-2017");
//        String validLogin = testCustomer.getLogin();
//        String validPassword = testCustomer.getPassword();
//        assertTrue(testCustomer.logIn(validLogin, validPassword));
//    }

//    @Test
//    void testIfFailLogInReturnFalse() {
//        Customer testCustomer = new Customer(1,"Jan", "Kowalski", "jfk", "notdead", "11-11-2011", true, "06-06-2017");
//        String invalidLogin = "user";
//        String invalidPassword = "1234";
//        assertFalse(testCustomer.logIn(invalidLogin, invalidPassword));
//    }

}