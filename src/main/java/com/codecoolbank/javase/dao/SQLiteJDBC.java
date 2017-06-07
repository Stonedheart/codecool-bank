package com.codecoolbank.javase.dao;

import java.sql.*;

public class SQLiteJDBC {

    private static SQLiteJDBC ourInstance = new SQLiteJDBC();

    private Connection conn = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    private SQLiteJDBC() {

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:src/main/resources/db/onlineshop.db");
            statement = conn.createStatement();
            conn.setAutoCommit(false);
        } catch ( SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public static SQLiteJDBC getInstance() {
        return ourInstance;
    }

    public Connection getJDBC() {
        return conn;
    }

    public void closeJDBC() {
        try {
            clearAndPrepare();
            conn.close();
        } catch ( SQLException e) {
            System.err.println( e.getMessage() );
        }
    }

    public void executeUpdateQuery(String query) {
        try {
            clearAndPrepare();
            this.statement.executeUpdate(query);
            this.statement.close();
            this.conn.commit();
        } catch ( SQLException e) {
            System.err.println( e.getMessage() );
        }
    }

    public ResultSet executeSelectQuery(String query) {
        try {
            clearAndPrepare();
            resultSet = statement.executeQuery(query);
        } catch ( SQLException e) {
            System.err.println( e.getMessage() );
        }
        return resultSet;
    }

    private void clearAndPrepare() throws SQLException {
        if (statement != null) {
            statement.close();
        }
        if (resultSet != null) {
            resultSet.close();
        }
    }
}
