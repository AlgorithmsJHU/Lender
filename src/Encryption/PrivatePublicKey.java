/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.util.Base64;

/**
 *
 * @author glender
 */
public class PrivatePublicKey {

	public final Key generateKey() throws NoSuchAlgorithmException {
		KeyGenerator kg = KeyGenerator.getInstance("AES");
		SecureRandom random = new SecureRandom();
		kg.init(random);
		return kg.generateKey();
	}

	public final String encrypt(final String message, final Key key, final IvParameterSpec iv) throws IllegalBlockSizeException,
			BadPaddingException, NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidKeyException,
			UnsupportedEncodingException, InvalidAlgorithmParameterException {

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, key, iv);

		byte[] stringBytes = message.getBytes();

		byte[] raw = cipher.doFinal(stringBytes);

		return Base64.getEncoder().encodeToString(raw);
	}

	public final String decrypt(final String encrypted, final Key key, final IvParameterSpec iv) throws InvalidKeyException,
			NoSuchAlgorithmException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException, IOException, InvalidAlgorithmParameterException {

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key, iv);

		byte[] raw = Base64.getDecoder().decode(encrypted);

		byte[] stringBytes = cipher.doFinal(raw);

		String clearText = new String(stringBytes, "UTF8");
		return clearText;
	}

}
