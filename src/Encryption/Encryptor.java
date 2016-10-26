package Encryption;

/**
 *
 * @author glender
 */
public interface Encryptor {

	/**
	 *
	 * @param key
	 * @param input
	 * @return
	 */
	public String encrypt(String key, String input);

	/**
	 *
	 * @param key
	 * @param input
	 * @return
	 */
	public String decrypt(String key, String input);
}
