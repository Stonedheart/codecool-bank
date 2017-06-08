package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.*;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {
    SQLiteJDBC connToDB = SQLiteJDBC.getInstance();

    @Override
    public void saveAccountToDb(Account account) throws SQLException {
        if (account.getId().getClass() == Integer.class) {
            String insertQuery = "INSERT INTO Accounts (`AccountID`, `CustomerID`, `Number`, `AccountTypeID`, `AccountStatusID`, `OpenDate`, `Balance`, `DebitLine`, `Interest`) " +
                                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connToDB.connectionWithDB().prepareStatement(insertQuery);
            preparedStatement.setInt(1, account.getId());
            preparedStatement.setInt(2, account.getCustomer().getId());
            preparedStatement.setString(3, account.getNumber());
            preparedStatement.setInt(4, account.getAccountType().getId());
            preparedStatement.setInt(5, account.getAccountStatus().getId());
            preparedStatement.setString(6, account.getOpenDate());
            preparedStatement.setInt(7, account.getBalance().intValueExact());
            preparedStatement.setInt(8, account.getDebitLine().intValueExact());
            preparedStatement.setInt(9, account.getInterest());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        else {
            String insertQuery = "UPDATE Accounts SET `AccountStatusID` = ?, `Balance` = ?, `DebitLine` = ?, `Interest` = ? WHERE `AccountID` = ?";
            PreparedStatement preparedStatement = connToDB.connectionWithDB().prepareStatement(insertQuery);
            preparedStatement.setInt(1, account.getAccountStatus().getId());
            preparedStatement.setInt(2, account.getBalance().intValueExact());
            preparedStatement.setInt(3, account.getDebitLine().intValueExact());
            preparedStatement.setInt(4, account.getInterest());
            preparedStatement.setInt(5, account.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
    }

    @Override
    public Account findAccountByID(Integer id) throws SQLException, InvalidValue {
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

            Customer customer = new CustomerDaoImpl().findCustomerById(customerID);
            AccountType accountType = new AccountTypeDaoImpl().findAccountTypeById(accountTypeID);
            AccountStatus accountStatus = new AccountStatusDaoImpl().findAccountStatusById(accountStatusID);

            switch (accountTypeID) {
                case 1:
                    return new SavingAccount(id, customer, number, accountType, accountStatus, openDate, BigDecimal.valueOf(balance), BigDecimal.valueOf(debitLine), interest);
                case 2:
                    return new DebitAccount(id, customer, number, accountType, accountStatus, openDate, BigDecimal.valueOf(balance), BigDecimal.valueOf(debitLine), interest);
                default:
                    throw new InvalidValue("There is no such account type!");
            }

        } else {
            return null;
        }
    }
}
