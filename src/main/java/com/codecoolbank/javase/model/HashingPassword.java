package com.codecoolbank.javase.model;

import org.jetbrains.annotations.NotNull;

import java.security.MessageDigest;

public class HashingPassword {

    @NotNull
    static String hashPassword(String password) {
        String separator = "_";
        String saltHash = reversedPassword(separator, password);

        return sha256(password + saltHash);
    }

    @NotNull
    private static String reversedPassword(String separator, String password) {
        char[] newPassword = password.toCharArray();
        Integer begin = 0;
        Integer end = newPassword.length -1;
        Character temporaly;

        while(end > begin){
            temporaly = newPassword[begin];
            newPassword[begin] = newPassword[end];
            newPassword[end] = temporaly;
            begin ++;
            end --;
        }
        String reversedResult = new String(newPassword);

        return separator + reversedResult;
    }

    @NotNull
    private static String sha256(String saltedPassword) {
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(saltedPassword.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();

            for (byte aHash : hash) {
                String hex = Integer.toHexString(0xff & aHash);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        }

        catch(Exception exception){
            throw new RuntimeException(exception);
        }
    }
}
