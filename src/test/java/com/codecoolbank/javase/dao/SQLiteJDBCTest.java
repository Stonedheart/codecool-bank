package com.codecoolbank.javase.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.DriverManager;

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
    void testIsConnectionIsSetByConstructor() {

//        DriverManager.getConnection("jdbc:sqlite:src/main/resources/database.db")
//        testJDBC.getConn()
    }

    @Test
    void testGetJDBCReturnsConnection() {
        assertEquals(SQLiteJDBC.getInstance().getJDBC(), testJDBC.getJDBC());
    }


}