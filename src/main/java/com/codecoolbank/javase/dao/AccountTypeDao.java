package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.AccountType;

import java.sql.SQLException;

public interface AccountTypeDao {
    AccountType findAccountTypeById(Integer id) throws SQLException;
}
