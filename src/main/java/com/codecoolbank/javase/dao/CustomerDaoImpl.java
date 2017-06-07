package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {
    private SQLiteJDBC connToDb = SQLiteJDBC.getInstance();

    @Override
    public void saveCustomerToDb(Customer customer) throws SQLException {
        String insertQuery = "INSERT INTO Customers (FirstName, LastName, Login, Password, CreateDate, IsActive, LastLogin) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = connToDb.getConn().prepareStatement(insertQuery);
        pstmt.setString(1, customer.getFirstName());
        pstmt.setString(2, customer.getLastName());
        pstmt.setString(3, customer.getLogin());
        pstmt.setString(4, customer.getPassword());
        pstmt.setString(5, customer.getCreateDate());
        pstmt.setInt(6, (customer.getIsActive()) ? 1 : 0 );
        pstmt.setString(7, customer.getLastLogin());
        pstmt.executeUpdate();
        pstmt.close();
    }

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
