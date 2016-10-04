package Encryption;

/**
 * This is a simple encryptor
 *
 * @author glender
 *
 */
public class SimpleEncryptor implements Encryptor {

	public SimpleEncryptor() {
	}

	/**
	 *
	 * @param from
	 * @param to
	 * @return
	 */
	private static String lengthen(String from, int to) {
		String output = "";
		while (output.length() < to) {
			output += from;
		}
		return output.substring(0, to);
	}

	/**
	 *
	 * @param key
	 * @param input
	 * @return
	 */
	@Override
	public String encrypt(String key, String input) {
		if (key.length() == 0) {
			throw new IllegalArgumentException("Key must not be empty");
		}
		//lengthen key to be same size as s
		String fullkey = lengthen(key, input.length());
		String output = "";
		//perform xor
		for (int i = 0; i < input.length(); i++) {
			output += (char) ((byte) fullkey.charAt(i) ^ (byte) input.charAt(i));
		}
		return output;
	}

	/**
	 *
	 * @param key
	 * @param key
	 * @param s
	 * @param s
	 * @return
	 * @return
	 */
	@Override
	public String decrypt(String key, String s) {
		return encrypt(key, s);
	}
}
