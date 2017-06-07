package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {
    private SQLiteJDBC connToDb = SQLiteJDBC.getInstance();

    @Override
    public void saveCustomerToDb(Customer customer) throws SQLException {
        String firstName = customer.getName();
        String supplierDescription = supplier.getDescription();
        String insertQuery = "INSERT INTO suppliers (NAME, DESCRIPTION) ";
        String insertValue = String.format("VALUES ('%1$s' , '%2$s')", supplierName, supplierDescription);
        db.executeUpdateQuery(insertQuery + insertValue);
    };

    @Override
    public Customer findCustomerById(Integer idToFind) throws SQLException {
        String selectQuery = String.format("SELECT * FROM Customers WHERE CustomerID = '%1$d'", idToFind);
        ResultSet results = connToDb.executeSelectQuery(selectQuery);

        Integer id = results.getInt("CustomerID");
        String firstName = results.getString("FirstName");
        String lastName = results.getString("LastName");
        String login = results.getString("Login");
        String password = results.getString("Password");
        String createDate = results.getString("CreateDate");
        Boolean isActive = results.getInt("IsActive") != 0;
        String lastLogin = results.getString("LastLogin");

        return new Customer(id, firstName, lastName, login, password, createDate, isActive, lastLogin);
    }
}
