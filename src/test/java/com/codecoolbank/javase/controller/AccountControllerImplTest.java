package com.codecoolbank.javase.controller;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class AccountControllerImplTest {
    @Test
    void testIfAccountExistToDepositFunds() throws SQLException, InvalidValue {
        AccountControllerImpl accountController = new AccountControllerImpl();
        assertThrows(NullPointerException.class, ()-> accountController.deposit(10, BigDecimal.valueOf(0.00)));
    }
}