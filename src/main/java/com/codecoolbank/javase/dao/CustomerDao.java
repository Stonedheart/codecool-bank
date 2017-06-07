package com.codecoolbank.javase.dao;

import com.codecoolbank.javase.model.Customer;

import java.sql.SQLException;

public interface CustomerDao {
    Boolean logIn(String providedLogin, String providedPassword) throws SQLException;
    void saveCustomerToDb(Customer customer) throws SQLException;
    Customer findCustomerById(Integer idToFind) throws SQLException;
//    void deactivateCustomer(Customer customer);
//    Account addAccount();
//    Boolean changeAccountStatus(Account account);
//    void addNewCard();
//    Boolean changeCardStatus(Card card);
}
