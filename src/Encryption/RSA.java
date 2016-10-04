/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;

import Utils.BitStringToByte;
import Utils.Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author glender
 */
public class RSA {

	/**
	 * String to hold name of the encryption algorithm.
	 */
	public final String ALGORITHM = "RSA";

	/**
	 * String to hold the name of the private key file.
	 */
	public final String PRIVATE_KEY_FILE = "private.key";

	/**
	 * String to hold name of the public key file.
	 */
	public final String PUBLIC_KEY_FILE = "public.key";

	/**
	 * String to hold directory name of key files
	 */
	public final String KEY_DIRECTORY = System.getProperty("user.dir") + "/key/";
	
	private Utilities utils = new Utilities();
	// bit to byte
	private BitStringToByte bitStringToByte = new BitStringToByte();

	/**
	 * Generate key which contains a pair of private and public key using 1024
	 * bytes. Store the set of keys in Prvate.key and Public.key files.
	 *
	 */
	public void generateKey() {
		try {

			// generate the ket generator and key pair
			final KeyPairGenerator keyGen = KeyPairGenerator.getInstance(ALGORITHM);
			keyGen.initialize(1024);
			final KeyPair key = keyGen.generateKeyPair();

			File privateKeyFile = new File(KEY_DIRECTORY);
			File publicKeyFile = new File(KEY_DIRECTORY);

			// Create files to store public and private key, attempting to do mkdirs
			privateKeyFile.getParentFile().mkdirs();

			File tmpPrivate = new File(privateKeyFile, PRIVATE_KEY_FILE);
			tmpPrivate.createNewFile();

			publicKeyFile.getParentFile().mkdirs();

			File tmpPublic = new File(publicKeyFile, PUBLIC_KEY_FILE);
			tmpPublic.createNewFile();

			try (
					// Saving the Public key in a file
					ObjectOutputStream publicKeyOS = new ObjectOutputStream(
							new FileOutputStream(tmpPublic))) {
						publicKeyOS.writeObject(key.getPublic());
					}

					try (
							// Saving the Private key in a file
							ObjectOutputStream privateKeyOS = new ObjectOutputStream(
									new FileOutputStream(tmpPrivate))) {
								privateKeyOS.writeObject(key.getPrivate());
							}
		} catch (NoSuchAlgorithmException | IOException e) {
		}

	}

	/**
	 * The method checks if the pair of public and private key has been
	 * generated.
	 *
	 * @return flag indicating if the pair of keys were generated.
	 */
	public boolean areKeysPresent() {

		File privateKey = new File(PRIVATE_KEY_FILE);
		File publicKey = new File(PUBLIC_KEY_FILE);

		if (privateKey.exists() && publicKey.exists()) {
			return true;
		}
		return false;
	}

	/**
	 * Encrypt the plain text using public key.
	 *
	 * @param text : original plain text
	 * @param key :The public key
	 * @return Encrypted text
	 */
	public ArrayList<byte[]> encrypt(String text, PublicKey key) {
		byte[] cipherText = null;
		ArrayList<byte[]> byteList = new ArrayList<byte[]>();

		try {
			// get an RSA cipher object and print the provider
			final Cipher cipher = Cipher.getInstance(ALGORITHM);
			// encrypt the plain text using the public key
			cipher.init(Cipher.ENCRYPT_MODE, key);

			// split into 14 byte chunks
			List<byte[]> tmpBytes = utils.divideArray(text.getBytes(), 14);

			// iterate over the bytes
			for (byte[] b : tmpBytes) {
				byteList.add(cipher.doFinal(b));
			}

		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
			e.printStackTrace();
		}
		return byteList;
	}

	/**
	 * Decrypt text using private key.
	 *
	 * @param text :encrypted text
	 * @param key :The private key
	 * @return plain text
	 */
	public ArrayList<byte[]> decrypt(byte[] text, PrivateKey key) {
		byte[] decryptedText = null;
		String result = "";
		ArrayList<byte[]> byteList = new ArrayList<byte[]>();
		
		try {
			
		// get an RSA cipher object and print the provider
		final Cipher cipher = Cipher.getInstance(ALGORITHM);

		// decrypt the text using the private key
		cipher.init(Cipher.DECRYPT_MODE, key);
		
		// split into 14 byte chunks
		List<byte[]> tmpBytes = utils.divideArray(text, 128);

		// iterate over the bytes
		for (byte[] b : tmpBytes) {
			byteList.add(cipher.doFinal(b));
		}
		

		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException ex) {
			ex.printStackTrace();
		}

		return byteList;
	}

}
