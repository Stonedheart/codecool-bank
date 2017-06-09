package com.codecoolbank.javase.model;

import org.junit.jupiter.api.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class HashingPasswordTest {
    @Test
    void testIsHashAlgoritmIsValid() {
        assertThrows(NoSuchAlgorithmException.class, ()-> MessageDigest.getInstance("SHA-244"));
    }

    @Test
    void testIfClassthrowsRuntimeException() throws NoSuchAlgorithmException {
        assertThrows(RuntimeException.class, ()-> HashingPassword.hashPassword(null));
    }
}