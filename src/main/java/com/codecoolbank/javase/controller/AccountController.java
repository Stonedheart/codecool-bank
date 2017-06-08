package com.codecoolbank.javase.controller;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;
import java.sql.SQLException;

public interface AccountController {
    void deposit(Integer id, BigDecimal amount) throws SQLException, InvalidValue;
    void withdraw(long amount);
}
