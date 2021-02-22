package com.example.oauth2.test1.utils;

import lombok.extern.slf4j.Slf4j;

import java.security.MessageDigest;

/**
 * SHA256 암호화를 담당하는 클래스
 * @author timi121
 */

@Slf4j
public class Crypto {
    public static String sha256(final String string) {
        log.info("Crypto.sha256::: {}", string);
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(string.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            //TODO : handler exception
            throw new RuntimeException(e);
        }
    }
}
