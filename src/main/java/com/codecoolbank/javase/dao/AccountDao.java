package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Account;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.sql.SQLException;

public interface AccountDao {
    Account findAccountByID(Integer id) throws SQLException, InvalidValue;
}
