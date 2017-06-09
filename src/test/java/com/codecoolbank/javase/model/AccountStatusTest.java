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
        final Integer accountStatusID = 1;
        AccountStatus accountStatus = new AccountStatus(accountStatusID, "Active", "Account is active");
        assertEquals(AccountStatus.class, accountStatus.getClass());
    }
}