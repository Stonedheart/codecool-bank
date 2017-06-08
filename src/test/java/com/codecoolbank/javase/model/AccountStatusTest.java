package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountStatusTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        AccountStatus accountStatus = new AccountStatus("Active", "Account is active");
        assertEquals(AccountStatus.class, accountStatus.getClass());
    }
    
    @Test
    void testIfConstructorIsInitializedValid() {
        AccountStatus accountStatus = new AccountStatus(1, "Active", "Account is active");
        assertEquals(AccountStatus.class, accountStatus.getClass());
    }
}