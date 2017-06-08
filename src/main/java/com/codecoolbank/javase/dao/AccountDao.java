package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Account;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.sql.SQLException;

public interface AccountDao {
    void saveAccountToDb(Account account) throws SQLException;
    Account findAccountByID(Integer id) throws SQLException, InvalidValue;
}
