package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Account;
import com.codecoolbank.javase.model.AccountType;
import com.codecoolbank.javase.model.Customer;
import com.codecoolbank.javase.model.SavingAccount;
import com.oracle.jrockit.jfr.InvalidValueException;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {
    SQLiteJDBC connToDB = SQLiteJDBC.getInstance();

    @Override
    public Account findByID(Integer id) throws SQLException, InvalidValue {
        String selectQuery = String.format("SELECT * FROM Accounts WHERE `AccountID` = ?");
        PreparedStatement preparedStatement = connToDB.connectionWithDB().prepareStatement(selectQuery);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (!resultSet.isClosed()) {
            id = resultSet.getInt("AccountID");
            Integer customerID = resultSet.getInt("CustomerID");
            String number = resultSet.getString("Number");
            Integer accountTypeID = resultSet.getInt("AccountTypeID");
            Integer accountStatusID = resultSet.getInt("AccountStatusID");
            String openDate = resultSet.getString("OpenDate");
            Integer balance = resultSet.getInt("Balance");
            Integer debitLine = resultSet.getInt("DebitLine");
            Integer interest = resultSet.getInt("Interest");

            preparedStatement.close();

            switch (accountTypeID) {
                case 1:
                    return new SavingAccount(id, customerID, number, accountTypeID, accountStatusID, openDate, balance, debitLine, interest);
                case 2:
                    return new DebitAccount(id, customerID, number, accountTypeID, accountStatusID, openDate, balance, debitLine, interest);
                default:
                    throw new InvalidValue("There is no such account type!");
            }

        } else {
            return null;
        }
    }
}
