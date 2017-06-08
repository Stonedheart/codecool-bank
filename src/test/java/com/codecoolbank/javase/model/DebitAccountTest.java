package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class DebitAccountTest {

    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);
        assertEquals(DebitAccount.class, debitAccount.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() throws InvalidValue {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);
        assertEquals(DebitAccount.class, debitAccount.getClass());
    }

    @Test
    void testIfCustomerFromDebitAccountIsValid() throws InvalidValue {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);
        assertEquals(customer.getId(), debitAccount.getCustomer().getId());
    }

    @Test
    void testIfAccountTypeFromDebitAccountIsValid() throws InvalidValue {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);
        assertEquals(accountType.getId(), debitAccount.getAccountType().getId());
    }

    @Test
    void testIfAccountStatusFromDebitAccountIsValid() throws InvalidValue {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);
        assertEquals(accountStatus.getId(), debitAccount.getAccountStatus().getId());
    }

    @Test
    void testIfOpenDateFromDebitAccountIsValid() throws InvalidValue {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);
        assertEquals("12-02-2015", debitAccount.getOpenDate());
    }

    @Test
    void testIfBalanceFromDebitAccountIsValid() throws InvalidValue {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);
        assertEquals(BigDecimal.valueOf(2500.00), debitAccount.getBalance());
    }

    @Test
    void testIfSetBalanceLT0IsInvalid() throws InvalidValue {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);
        BigDecimal newBalance = BigDecimal.valueOf(-1.00);
        assertThrows(InvalidValue.class, ()-> new DebitAccount(debitAccount.getId(), debitAccount.getCustomer(), debitAccount.getNumber(), debitAccount.getAccountType(), debitAccount.getAccountStatus(), debitAccount.getOpenDate(), newBalance, debitAccount.getDebitLine(), debitAccount.getInterest()));
    }

    @Test
    void testIfDebitLineFromDebitAccountIsValid() throws InvalidValue {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);
        assertEquals(BigDecimal.valueOf(0.00), debitAccount.getDebitLine());
    }

    @Test
    void testIfInterestFromDebitAccountIsValid() throws InvalidValue {
        Customer customer = new Customer(1,"Jan", "Kowalski", "JFK", "notDead", "11-11-2014", true, "24-01-2017");
        AccountType accountType = new AccountType(1, "Saving account", "Account for your savings, percentage 5%");
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");

        DebitAccount debitAccount = new DebitAccount(1, customer, "00008798123400000012", accountType, accountStatus, "12-02-2015", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(0.00), 5);
        assertEquals(5, debitAccount.getInterest().intValue());
    }
}