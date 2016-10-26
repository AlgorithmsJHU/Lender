/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * This is the implementation of a triple DES.
 *
 * @author glender
 */
public class PKCryptosys {

	public void PKCryptosys() {
	}

	private final String PASSWORD = "L2EN3D5E7R";

	public byte[] encrypt(String message) throws Exception {

		// Create the password using md5, put it into byte array
		final MessageDigest md = MessageDigest.getInstance("md5");
		final byte[] digestOfPassword = md.digest(PASSWORD.getBytes("UTF-8"));
		final byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

		// splitting of bytes
		for (int index = 0, subindex = 16; index < 8;) {
			keyBytes[subindex++] = keyBytes[index++];
		}

		// Create final key, get IV Spec, initialise cipher to encryption
		final SecretKey key = new SecretKeySpec(keyBytes, "DESede");
		final IvParameterSpec iv = new IvParameterSpec(new byte[8]);
		final Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, key, iv);

		// encrypt the message
		final byte[] plainTextBytes = message.getBytes("UTF-8");
		final byte[] cipherText = cipher.doFinal(plainTextBytes);

		return cipherText;

	}

	public String decrypt(byte[] message) throws Exception {

		// Create the password using md5, put it into byte array
		final MessageDigest md = MessageDigest.getInstance("md5");
		final byte[] digestOfPassword = md.digest(PASSWORD.getBytes("UTF-8"));
		final byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

		// splitting of byters
		for (int index = 0, subindex = 16; index < 8;) {
			keyBytes[subindex++] = keyBytes[index++];
		}

		// Create final key, get IV Spec, initialise cipher to decryption
		final SecretKey key = new SecretKeySpec(keyBytes, "DESede");
		final IvParameterSpec iv = new IvParameterSpec(new byte[8]);
		final Cipher decipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
		decipher.init(Cipher.DECRYPT_MODE, key, iv);

		// decrypt the message
		final byte[] plainText = decipher.doFinal(message);

		return new String(plainText, "UTF-8");
	}

}
