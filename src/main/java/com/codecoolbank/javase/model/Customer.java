package com.codecoolbank.javase.model;

import java.util.Date;

public class Customer extends BaseModel {
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String createDate;
    private Boolean isActive;
    private String lastLogin;


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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getCreateDate() {
        return createDate;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public Boolean logIn(String providedLogin, String providedPassword) {
        return this.login.equals(providedLogin) && this.password.equals(providedPassword);
    }
}
