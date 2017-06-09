package com.codecoolbank.javase.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class SQLiteJDBCTest {
    private SQLiteJDBC testJDBC;

    @BeforeEach
    void setUp() {
        this.testJDBC = SQLiteJDBC.getInstance();
    }

    @Test
    void testGetInstanceReturnsJDBCInstance() {
        assertEquals(SQLiteJDBC.getInstance(), testJDBC);
    }

    @Test
    void testIfStatementIsSetByDefaultConstructor() {
        assertEquals(SQLiteJDBC.getInstance().getStatement(), testJDBC.getStatement());
    }

    @Test
    void testIfConnectionIsNullThenThrowsSQLException() throws SQLException {
        assertThrows(SQLException.class, ()-> DriverManager.getConnection(null));
    }

    @Test
    void testGetJDBCReturnsConnection() {
        assertEquals(SQLiteJDBC.getInstance().getJDBC(), testJDBC.getJDBC());
    }


}