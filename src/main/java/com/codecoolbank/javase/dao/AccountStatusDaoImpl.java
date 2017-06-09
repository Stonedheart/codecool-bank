package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.AccountStatus;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountStatusDaoImpl implements AccountStatusDao {
    private SQLiteJDBC connToDb = SQLiteJDBC.getInstance();

    @Override
    public AccountStatus findAccountStatusById(Integer id) throws SQLException {
        String selectQuery = String.format("SELECT * FROM AccountStatuses WHERE `AccountStatusID` = ?");
        PreparedStatement preparedStatement = connToDb.connectionWithDB().prepareStatement(selectQuery);
        preparedStatement.setInt(1, id);
        ResultSet results = preparedStatement.executeQuery();
        if (!results.isClosed()) {
            id = results.getInt("AccountStatusID");
            String name = results.getString("Name");
            String description = results.getString("Description");

            preparedStatement.close();
            return new AccountStatus(id, name, description);

        } else {
            return null;
        }
    }
}
