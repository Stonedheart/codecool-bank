package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {

    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);
        assertEquals(SavingAccount.class, savingAccount.getClass());
    }

    @Test
    void testIfConstructorIsInitializedValid() throws InvalidValue {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);
        assertEquals(SavingAccount.class, savingAccount.getClass());
    }

    @Test
    void testIfCustomerFromDebitAccountIsValid() throws InvalidValue {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);
        assertEquals(customer.getId(), savingAccount.getCustomer().getId());
    }

    @Test
    void testIfAccountTypeFromDebitAccountIsValid() throws InvalidValue {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);
        assertEquals(accountType.getId(), savingAccount.getAccountType().getId());
    }

    @Test
    void testIfAccountStatusFromDebitAccountIsValid() throws InvalidValue {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        DebitAccount debitAccount = new DebitAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);
        assertEquals(accountStatus.getId(), debitAccount.getAccountStatus().getId());
    }

    @Test
    void testIfOpenDateFromDebitAccountIsValid() throws InvalidValue {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);
        assertEquals(openDate, savingAccount.getOpenDate());
    }

    @Test
    void testIfBalanceFromDebitAccountIsValid() throws InvalidValue {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);
        assertEquals(balance, savingAccount.getBalance());
    }

    @Test
    void testIfSetBalanceLT0IsInvalid() throws InvalidValue {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);

        BigDecimal newBalance = BigDecimal.valueOf(-1.00);
        assertThrows(InvalidValue.class, ()-> new SavingAccount(savingAccount.getId(), savingAccount.getCustomer(), savingAccount.getNumber(), savingAccount.getAccountType(), savingAccount.getAccountStatus(), savingAccount.getOpenDate(), newBalance, savingAccount.getDebitLine(), savingAccount.getInterest()));
    }

    @Test
    void testIfDebitLineFromDebitAccountIsValid() throws InvalidValue {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);
        assertEquals(debitLimit, savingAccount.getDebitLine());
    }

    @Test
    void testIfInterestFromDebitAccountIsValid() throws InvalidValue {
        final Integer customerID = 1;
        final String createDate = "11-11-2014";
        final String lastLogin = "24-01-2017";
        Customer customer = new Customer(customerID, "Jan", "Kowalski", "JFK", "notDead", createDate, true, lastLogin);

        final Integer accountTypeID = 1;
        AccountType accountType = new AccountType(accountTypeID, "Saving account", "Account for your savings, percentage 5%");

        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");

        final Integer debitAccountID = 1;
        final String accountNumber = "00008798123400000012";
        final String openDate = "12-02-2015";
        final BigDecimal balance = BigDecimal.valueOf(2500.00);
        final BigDecimal debitLimit = BigDecimal.valueOf(0.00);
        final Integer interest = 5;
        SavingAccount savingAccount = new SavingAccount(debitAccountID, customer, accountNumber, accountType, accountStatus, openDate, balance, debitLimit, interest);
        assertEquals(interest, (Integer)savingAccount.getInterest().intValue());
    }
}