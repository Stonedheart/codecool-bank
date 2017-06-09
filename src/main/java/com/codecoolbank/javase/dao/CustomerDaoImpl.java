package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {
    private SQLiteJDBC connToDb = SQLiteJDBC.getInstance();

    @Override
    public Boolean logIn(String providedLogin, String providedPassword) throws SQLException {
        String selectQuery = String.format("SELECT * FROM Customers WHERE Login = ? AND Password = ?");
        PreparedStatement preparedStatement = connToDb.connectionWithDB().prepareStatement(selectQuery);
        preparedStatement.setString(1, providedLogin);
        preparedStatement.setString(2, providedPassword);
        ResultSet result = preparedStatement.executeQuery();
        if (result.isClosed()) {
            connToDb.closeJDBC();
            return false;
        } else {
            preparedStatement.close();
            connToDb.closeJDBC();
            return true;
        }
    }

    @Override
    public void saveCustomerToDb(Customer customer) throws SQLException {
        if (customer.getId() == null) {
            String insertQuery = "INSERT INTO Customers (FirstName, LastName, Login, Password, CreateDate, IsActive, LastLogin) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connToDb.connectionWithDB().prepareStatement(insertQuery);
            preparedStatement.setString(1, customer.getFirstName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setString(3, customer.getLogin());
            preparedStatement.setString(4, customer.getPassword());
            preparedStatement.setString(5, customer.getCreateDate());
            preparedStatement.setInt(6, (customer.getIsActive()) ? 1 : 0 );
            preparedStatement.setString(7, customer.getLastLogin());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connToDb.closeJDBC();
        } else {
            String updateQuery = "UPDATE Customers SET `FirstName` = ?, `LastName` = ?, `Login` = ?, `Password` = ?, `IsActive` = ?, `LastLogin` = ? WHERE `CustomerID` = ?";
            PreparedStatement preparedStatement = connToDb.connectionWithDB().prepareStatement(updateQuery);
            preparedStatement.setString(1, customer.getFirstName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setString(3, customer.getLogin());
            preparedStatement.setString(4, customer.getPassword());
            preparedStatement.setInt(5, customer.getIsActive() ? 1 : 0);
            preparedStatement.setString(6, customer.getLastLogin());
            preparedStatement.setInt(7, customer.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connToDb.closeJDBC();
        }
    }

    @Override
    public Customer findCustomerById(Integer idToFind) throws SQLException {
        String selectQuery = String.format("SELECT * FROM Customers WHERE CustomerID = ?");
        PreparedStatement preparedStatement = connToDb.connectionWithDB().prepareStatement(selectQuery);
        preparedStatement.setInt(1, idToFind);
        ResultSet results = preparedStatement.executeQuery();
        if (!results.isClosed()) {
            Integer id = results.getInt("CustomerID");
            String firstName = results.getString("FirstName");
            String lastName = results.getString("LastName");
            String login = results.getString("Login");
            String password = results.getString("Password");
            String createDate = results.getString("CreateDate");
            Boolean isActive = results.getInt("IsActive") != 0;
            String lastLogin = results.getString("LastLogin");

            preparedStatement.close();
            connToDb.closeJDBC();
            return new Customer(id, firstName, lastName, login, password, createDate, isActive, lastLogin);

        } else {
            connToDb.closeJDBC();
            return null;
        }
    }
}
