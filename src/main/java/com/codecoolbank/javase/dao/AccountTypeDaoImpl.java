package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.AccountType;
import com.codecoolbank.javase.model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountTypeDaoImpl implements AccountTypeDao {
    private SQLiteJDBC connToDb = SQLiteJDBC.getInstance();

    @Override
    public AccountType findAccountTypeById(Integer id) throws SQLException {
        String selectQuery = String.format("SELECT * FROM AccountTypes WHERE `AccountTypeID` = ?");
        PreparedStatement preparedStatement = connToDb.connectionWithDB().prepareStatement(selectQuery);
        preparedStatement.setInt(1, id);
        ResultSet results = preparedStatement.executeQuery();
        if (!results.isClosed()) {
            id = results.getInt("AccountTypeID");
            String name = results.getString("Name");
            String description = results.getString("Description");

            preparedStatement.close();
            return new AccountType(id, name, description);

        } else {
            return null;
        }
    }
}
