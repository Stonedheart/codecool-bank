package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountStatusesTest {
    @Test
    void testIfConstructorOfClassIsInitializedValid() {
        AccountStatuses accountStatuses = new AccountStatuses(1,"Active","Account is active");
        assertEquals(AccountStatuses.class, accountStatuses.getClass());
    }
}