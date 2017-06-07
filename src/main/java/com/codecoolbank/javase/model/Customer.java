package com.codecoolbank.javase.model;

import java.util.Date;

public class Customer extends BaseModel {
    String firstName;
    String lastName;
    String login;
    String password;
    String createDate;
    Boolean isActive;
    String lastLogin;

    public Customer(String firstName, String lastName, String login, String password, String createDate, Boolean isActive, String lastLogin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.createDate = createDate;
        this.isActive = isActive;
        this.lastLogin = lastLogin;
    }

    public Customer(Integer id, String firstName, String lastName, String login, String password, String createDate, Boolean isActive, String lastLogin) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.createDate = createDate;
        this.isActive = isActive;
        this.lastLogin = lastLogin;
    }



    public Boolean logIn(String providedLogin, String providedPassword) {
        return this.login.equals(providedLogin) && this.password.equals(providedPassword);
    }

    public String getName() {
        return firstName;
    }
}
