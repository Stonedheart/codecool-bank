package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testIfConstructorWithoutIdInitializeValidClassInstance() {
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer("Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);
        assertEquals(Customer.class, customer.getClass());
    }

    @Test
    void testIfConstructorWithIdInitializeValidClassInstance() {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);
        assertEquals(Customer.class, customer.getClass());
    }

    @Test
    void testGetters() {
        final Integer customerID = 1;
        final String createDate = "11-11-2011";
        final String lastLogin = "06-06-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "jfk", "notdead", createDate, true, lastLogin);
        assertAll(
            ()-> assertTrue(customer.getId() == 1),
            ()-> assertTrue(customer.getFirstName().equals("Jan")),
            ()-> assertTrue(customer.getLastName().equals("Kowalski")),
            ()-> assertTrue(customer.getLogin().equals("jfk")),
            ()-> assertTrue(customer.getPassword().equals(HashingPassword.hashPassword("notdead"))),
            ()-> assertTrue(customer.getCreateDate().equals("11-11-2011")),
            ()-> assertTrue(customer.getIsActive().equals(true)),
            ()-> assertTrue(customer.getLastLogin().equals("06-06-2017"))
        );
    }

    @Test
    void testIsAccountListIsEmptyByDefault() {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);
        assertEquals(Collections.emptyList(), customer.getAccountList());
    }

    @Test
    void testIsCardsListIsEmptyByDefault() {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);
        assertEquals(Collections.emptyList(), customer.getCardList());
    }
}