package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Account;
import com.codecoolbank.javase.model.Customer;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.sql.SQLException;

public interface AccountDao {
    void saveCustomerToDb(Customer customer) throws SQLException;
    Account findAccountByID(Integer id) throws SQLException, InvalidValue;
}
