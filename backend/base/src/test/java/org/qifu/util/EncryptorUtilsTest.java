package org.qifu.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.SecureRandom;

import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Test;

class EncryptorUtilsTest {

    private static final String KEY = createKey();

    @Test
    void encryptGcmRoundTripsUtf8Value() {
        String encrypted = EncryptorUtils.encryptGcm(KEY, "OpenAI API key: 測試");

        assertEquals("OpenAI API key: 測試", EncryptorUtils.decryptGcm(KEY, encrypted));
    }

    @Test
    void encryptGcmUsesRandomIv() {
        String first = EncryptorUtils.encryptGcm(KEY, "same-value");
        String second = EncryptorUtils.encryptGcm(KEY, "same-value");

        assertNotEquals(first, second);
    }

    @Test
    void decryptGcmRejectsTamperedCiphertext() {
        String encrypted = EncryptorUtils.encryptGcm(KEY, "secret");
        String[] parts = encrypted.split(":");
        byte[] ciphertext = java.util.Base64.getUrlDecoder().decode(parts[2]);
        ciphertext[0] ^= 1;
        String tampered = parts[0] + ":" + parts[1] + ":"
                + java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(ciphertext);

        assertThrows(IllegalArgumentException.class,
                () -> EncryptorUtils.decryptGcm(KEY, tampered));
    }

    @Test
    void encryptGcmRejectsInvalidKeyLength() {
        String shortKey = Base64.encodeBase64String(new byte[8]);

        assertThrows(IllegalArgumentException.class,
                () -> EncryptorUtils.encryptGcm(shortKey, "secret"));
    }

    private static String createKey() {
        byte[] key = new byte[32];
        new SecureRandom().nextBytes(key);
        return Base64.encodeBase64String(key);
    }
}
