package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.AccountStatus;

import java.sql.SQLException;

public interface AccountStatusDao {
    AccountStatus findAccountStatusById(Integer id) throws SQLException;
}
