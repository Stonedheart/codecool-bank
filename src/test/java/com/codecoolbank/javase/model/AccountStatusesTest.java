package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountStatusesTest {
    @Test
    void testIfConstructorWithoutIDIsInitializedValid() {
        AccountStatuses accountStatuses = new AccountStatuses("Active","Account is active");
        assertEquals(AccountStatuses.class, accountStatuses.getClass());
    }
    
    @Test
    void testIfConstructorIsInitializedValid() {
        AccountStatuses accountStatuses = new AccountStatuses(1,"Active","Account is active");
        assertEquals(AccountStatuses.class, accountStatuses.getClass());
    }
}