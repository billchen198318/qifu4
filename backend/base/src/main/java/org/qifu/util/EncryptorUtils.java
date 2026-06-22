/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.util;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.qifu.base.Constants;

/**
 * from network resource
 * http://stackoverflow.com/questions/15554296/simple-java-aes-encrypt-decrypt-example
 * 
 * AES-256 , Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files 8 Download
 * http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html
 *
 */
public class EncryptorUtils {

	private static final String GCM_TRANSFORMATION = "AES/GCM/NoPadding";
	private static final String GCM_PAYLOAD_VERSION = "v1";
	private static final int GCM_IV_LENGTH_BYTES = 12;
	private static final int GCM_TAG_LENGTH_BITS = 128;
	private static final SecureRandom SECURE_RANDOM = new SecureRandom();
	
	protected EncryptorUtils() {
		throw new IllegalStateException("Utils class: EncryptorUtils");
	}
	
	public static String encrypt(String key1, String iv1, String value) {
		try {
			IvParameterSpec iv = new IvParameterSpec(iv1.getBytes(Constants.BASE_ENCODING));
            SecretKeySpec skeySpec = new SecretKeySpec(key1.getBytes(Constants.BASE_ENCODING), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
            byte[] encrypted = cipher.doFinal(value.getBytes());
            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String key1, String iv1, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(iv1.getBytes(Constants.BASE_ENCODING));
            SecretKeySpec skeySpec = new SecretKeySpec(key1.getBytes(Constants.BASE_ENCODING), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));
            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

	/**
	 * Encrypts a value with AES-GCM. The key must be a Base64-encoded AES key
	 * containing 16, 24, or 32 bytes.
	 */
	public static String encryptGcm(String base64Key, String value) {
		if (value == null) {
			throw new IllegalArgumentException("Value must not be null");
		}

		byte[] iv = new byte[GCM_IV_LENGTH_BYTES];
		SECURE_RANDOM.nextBytes(iv);

		try {
			Cipher cipher = Cipher.getInstance(GCM_TRANSFORMATION);
			cipher.init(Cipher.ENCRYPT_MODE, buildGcmKey(base64Key),
					new GCMParameterSpec(GCM_TAG_LENGTH_BITS, iv));
			byte[] encrypted = cipher.doFinal(value.getBytes(StandardCharsets.UTF_8));
			return String.join(":", GCM_PAYLOAD_VERSION,
					java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(iv),
					java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(encrypted));
		} catch (GeneralSecurityException ex) {
			throw new IllegalStateException("Unable to encrypt value with AES-GCM", ex);
		}
	}

	/**
	 * Decrypts a payload created by {@link #encryptGcm(String, String)}.
	 */
	public static String decryptGcm(String base64Key, String encryptedPayload) {
		if (encryptedPayload == null) {
			throw new IllegalArgumentException("Encrypted payload must not be null");
		}

		String[] parts = encryptedPayload.split(":", -1);
		if (parts.length != 3 || !GCM_PAYLOAD_VERSION.equals(parts[0])) {
			throw new IllegalArgumentException("Unsupported AES-GCM payload format");
		}

		try {
			byte[] iv = java.util.Base64.getUrlDecoder().decode(parts[1]);
			if (iv.length != GCM_IV_LENGTH_BYTES) {
				throw new IllegalArgumentException("Invalid AES-GCM IV");
			}
			byte[] encrypted = java.util.Base64.getUrlDecoder().decode(parts[2]);
			Cipher cipher = Cipher.getInstance(GCM_TRANSFORMATION);
			cipher.init(Cipher.DECRYPT_MODE, buildGcmKey(base64Key),
					new GCMParameterSpec(GCM_TAG_LENGTH_BITS, iv));
			return new String(cipher.doFinal(encrypted), StandardCharsets.UTF_8);
		} catch (GeneralSecurityException | IllegalArgumentException ex) {
			throw new IllegalArgumentException("Unable to decrypt or authenticate AES-GCM payload", ex);
		}
	}

	private static SecretKeySpec buildGcmKey(String base64Key) {
		if (base64Key == null || base64Key.isBlank()) {
			throw new IllegalArgumentException("AES-GCM key must not be blank");
		}

		byte[] key;
		try {
			key = java.util.Base64.getDecoder().decode(base64Key);
		} catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException("AES-GCM key must be Base64 encoded", ex);
		}
		if (key.length != 16 && key.length != 24 && key.length != 32) {
			throw new IllegalArgumentException("AES-GCM key must contain 16, 24, or 32 bytes");
		}
		return new SecretKeySpec(key, "AES");
	}
    
}
