/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author glender
 */
public class Utilities {
	
	// StringSplitter class variable
	public StringSplitter stringSplitter = new StringSplitter();
	//BitStringToByte class variable
	public BitStringToByte bitStringToByte = new BitStringToByte();
	//WordChecker class variable
	public WordChecker wordChecker = new WordChecker();
	//CompressionRatio class variable
	public CompressionRatio compressionRatio = new CompressionRatio();
	//BytesStreamsAndFiles class variable 
	BytesStreamsAndFiles bytesStreamsAndFiles = new BytesStreamsAndFiles();
	
	public Utilities() {}
	
	public List<byte[]> divideArray(byte[] source, int chunksize) {

		List<byte[]> result = new ArrayList<byte[]>();
		int start = 0;
		while (start < source.length) {
			int end = Math.min(source.length, start + chunksize);
			result.add(Arrays.copyOfRange(source, start, end));
			start += chunksize;
		}

		return result;
	}
	
	public List<String> splitEqually(String text, int size) {
		
		List<String> ret = new ArrayList<String>((text.length() + size - 1) / size);

		for (int start = 0; start < text.length(); start += size) {
			ret.add(text.substring(start, Math.min(text.length(), start + size)));
		}
		return ret;
	}
	
	/**
	 * Subclass StringSplitter
	 * @author glender
	 */
	public class StringSplitter {

		private int LENGTH;
		private final int LOWER_BOUND = 2*LENGTH; // 2 ints per character with word length LENGTH (i.e. 98, 62, etc.)
		private final int UPPER_BOUND = 3*LENGTH; // 3 ints per character with word length LENGTH (i.e. 101, 121, etc.)

		private Ascii ascii = new Ascii();

		StringSplitter() {
			this.LENGTH = determineWordSize();
		}

		private int determineWordSize() {
			int len = 0;
			String determined = "";

			File dir = new File(System.getProperty("user.dir") + "/src/scripts/");

			System.out.println(dir);

			File[] matches = dir.listFiles((File dir1, String name) -> name.startsWith("createRandomWordFile") && name.endsWith(".pl"));

			File file = new File(matches[0].getAbsolutePath());

			Scanner in = null;

			try {

				in = new Scanner(file);

				while(in.hasNext()) {
					String line = in.nextLine();
					if(line.contains("length")) {
						determined = line.substring(line.indexOf("= ") + 1, line.indexOf(";")).replace(" ", "");
						break;
					}
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	

			return Integer.valueOf(determined);
		}


		public List<Integer> splitString(String str) {

			ArrayList<Integer> list = new ArrayList<Integer>();
			List<String> finalString = new ArrayList<String>();

			int letterCount = 0;
			String ans = "";
			String check = "";
			for (int index = 0; index < str.length(); index++) {

				if (check.length() == 4) {
					check = "";
				}

				check += str.charAt(index);

				if (check.length() == 3) {
					if (check.charAt(0) == '0') {
						System.out.println("LENDER -- removing leading zero");
						check = check.replaceFirst("0", "");
					}
				}


				if (check.length() >= 2 && check.length() <= 3) {
					// determine if the string is in our final list

					if (ascii.ascii.contains(Integer.valueOf(check))) {

						// add the value to our list
						letterCount++;
						list.add(Integer.valueOf(check));
						System.out.println(check);
						check = "";

					} else {

						// determine if the string is in the ascii new line list
						if (ascii.asciiNew.contains(Integer.valueOf(check)) && letterCount > LENGTH - 1) {

							// add the value to our list
							letterCount = 0;
							list.add(Integer.valueOf(check));
							System.out.println(check);
							check = "";

						} else {}
					}
				}

			}

			return list;
		}

		private boolean removeLocation(int amount) {

			if (amount < LOWER_BOUND || amount > UPPER_BOUND) {
				return true;
			} else {
				return false;
			}
		}

	}	

	/**
	 * Subclass BitStringToByte
	 * @author glender
	 */
	public class BitStringToByte {

		public BitStringToByte() {}

		public List<String> splitEqually(String text, int size) {
			// Give the list the right capacity to start with. You could use an array
			// instead if you wanted.
			List<String> ret = new ArrayList<String>((text.length() + size - 1) / size);

			for (int start = 0; start < text.length(); start += size) {
				ret.add(text.substring(start, Math.min(text.length(), start + size)));
			}
			return ret;
		}

	}
	
	/**
	 * Subclass Ascii
	 * @author glender
	 */
	public static class Ascii {

		public ArrayList<Integer> ascii = new ArrayList<Integer>();
		public ArrayList<Integer> asciiNew = new ArrayList<Integer>();

		/**
		 *
		 */
		public enum ascii_lower {

			a(97), b(98), c(99), d(100), e(101), f(102), g(103), h(104), i(105), j(106), k(107), l(108), m(109), n(110), o(111), p(112), q(113), r(114), s(115), t(116), u(117), v(118), w(119), x(120), y(121), z(122);

			private final int id;
			ascii_lower(int id) { this.id = id; }
			public int getValue() { return id; }
		}

		public enum ascii_upper {

			A(65), B(66), C(67), D(68), E(69), F(70), G(71), H(72), I(73), J(74), K(75), L(76), M(77), N(78), O(79), P(80), Q(81), R(82), S(83), T(84), U(85), V(86), W(87), X(88), Y(89), Z(90);

			private final int id;
			ascii_upper(int id) { this.id = id; }
			public int getValue() { return id; }
		}

		public enum ascii_special {

			SPACE(32), BANG(33), DOUBLE_QUOTES(34), HASH(35), DOLLAR(36), PERCENT(37), AMPERSAND(38), SINGLE_QUOTE(39), OPEN_PAREN(40), CLOSE_PAREN(41), ASTERISK(42), PLUS(43), COMMA(44), MINUS(45), PERIOD(46), SLASH(47), COLON(58), SEMI_COLON(59), LESS_THAN(60), EQUAL(61), GREATER_THAN(62), QUESTION(63), AT(64), OPEN_BRAC(91), BACKSLASH(92), CLOSE_BRAC(93), CIRCUMFLEX(94), UNDERSCORE(95), GRAVE_ACCENT(96), OPEN_BRACE(123), VERT_BAR(124), CLOSE_BRACE(125), EQUIVALENCY(126), PLUS_MINUS(261);

			private final int id;
			ascii_special(int id) { this.id = id; }
			public int getValue() { return id; }
		}

		public enum ascii_numbers {
			ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);

			private final int id;
			ascii_numbers(int id) { this.id = id; }
			public int getValue() { return id; }
		}

		public enum ascii_new_line {
			newLine(10);

			private final int id;
			ascii_new_line(int id) { this.id = id; }
			public int getValue() { return id; }
		}

		Ascii() {

			// put the enum values into the arrayList
			for (ascii_lower al : ascii_lower.values()) {
				ascii.add(al.id);
			}

			// put the enum values into the arrayList
			for (ascii_upper au : ascii_upper.values()) {
				ascii.add(au.id);
			}

			// put the enum values into the arrayList
			for (ascii_special as : ascii_special.values()) {
				ascii.add(as.id);
			}

			// put the enum values into the arrayList
			//for (ascii_numbers an : ascii_numbers.values()) {
			//	ascii.add(an.id);
			//}

			// put the enum values into the arrayList
			for (ascii_new_line anl : ascii_new_line.values()) {
				asciiNew.add(anl.id);
			}

			for (int index = 128; index < 255; index++) {
				ascii.add(index);
			}

		}

	}
	
	/**
	 *
	 * @author glender
	 */
	public class WordChecker {

		/**
		 *
		 */
		public WordChecker() {
		}

		/**
		 *
		 * @param word
		 * @return
		 */
		public boolean checkForWord(String word) {

			try {
				BufferedReader in = new BufferedReader(new FileReader(
						"/usr/share/dict/words"));
				String str;
				while ((str = in.readLine()) != null) {
					if (str.contains(word)) {
						return true;
					}
				}
				in.close();
			} catch (IOException e) {
				System.out.println("LENDER -- error with checking if words are in file");
			}

			return false;
		}

		/**
		 *
		 * @return
		 */
		public boolean checkIfFileExists() {
			File f = new File("/usr/share/dict/words");
			if (!f.exists() && !f.isDirectory()) {
				return false;
			}

			return true;
		}

		/**
		 *
		 * @param file
		 * @return
		 */
		public boolean checkIfFileExists(String file) {
			File f = new File(file);
			if (!f.exists() && !f.isDirectory()) {
				return false;
			}

			return true;
		}

	}
	
	/**
	 *
	 * @author glender
	 */
	public class CompressionRatio {

		private double uncompressed;
		private double compressed;

		public CompressionRatio() {
		}

		public void setCompressed(double compressedSize) {
			this.compressed = compressedSize;
		}

		public void setUncompressed(double uncompressedSize) {
			this.uncompressed = uncompressedSize;
		}

		public double determinCompressionRatio() {
			return uncompressed / compressed;
		}

		public double getCompressed() {
			return this.compressed;
		}

		public double getUncompressed() {
			return this.uncompressed;
		}

	}
	
	/**
	 * Converting binary data into different forms.
	 * @author glender
	 *
	 * Reads binary data into memory, and writes it back out. (If you're
	 * actually copying a file, there are better ways to do this.)
	 *
	 * Buffering is used when reading and writing files, to minimize the number
	 * of interactions with the disk.
	 */
	public final class BytesStreamsAndFiles {

		/**
		 * Change these settings before running this class.
		 */
		private static final String INPUT_FILE_NAME = "C:\\TEMP\\cottage.jpg";
		private static final String OUTPUT_FILE_NAME = "C:\\TEMP\\cottage_copy.jpg";

		/**
		 * Run the example.
		 */
		public void main(String... aArgs) {
			BytesStreamsAndFiles test = new BytesStreamsAndFiles();
			//read in the bytes
			byte[] fileContents = test.read(INPUT_FILE_NAME);
		//test.readAlternateImpl(INPUT_FILE_NAME);
			//write it back out to a different file name
			test.write(fileContents, OUTPUT_FILE_NAME);
		}

		/**
		 * Read the given binary file, and return its contents as a byte array.
		 */
		byte[] read(String aInputFileName) {
			log("Reading in binary file named : " + aInputFileName);
			File file = new File(aInputFileName);
			log("File size: " + file.length());
			byte[] result = new byte[(int) file.length()];
			try {
				InputStream input = null;
				try {
					int totalBytesRead = 0;
					input = new BufferedInputStream(new FileInputStream(file));
					while (totalBytesRead < result.length) {
						int bytesRemaining = result.length - totalBytesRead;
						//input.read() returns -1, 0, or more :
						int bytesRead = input.read(result, totalBytesRead, bytesRemaining);
						if (bytesRead > 0) {
							totalBytesRead = totalBytesRead + bytesRead;
						}
					}
					/*
					 the above style is a bit tricky: it places bytes into the 'result' array; 
					 'result' is an output parameter;
					 the while loop usually has a single iteration only.
					 */
					log("Num bytes read: " + totalBytesRead);
				} finally {
					log("Closing input stream.");
					input.close();
				}
			} catch (IOException ex) {
				log(ex);
			}
			return result;
		}

		/**
		 * Write a byte array to the given file. Writing binary data is
		 * significantly simpler than reading it.
		 */
		void write(byte[] aInput, String aOutputFileName) {
			log("Writing binary file...");
			try {
				OutputStream output = null;
				try {
					output = new BufferedOutputStream(new FileOutputStream(aOutputFileName));
					output.write(aInput);
				} finally {
					output.close();
				}
			} catch (FileNotFoundException ex) {
				log("File not found.");
			} catch (IOException ex) {
				log(ex);
			}
		}

		/**
		 * Read the given binary file, and return its contents as a byte array.
		 */
		byte[] readAlternateImpl(String aInputFileName) {
			log("Reading in binary file named : " + aInputFileName);
			File file = new File(aInputFileName);
			log("File size: " + file.length());
			byte[] result = null;
			try {
				InputStream input = new BufferedInputStream(new FileInputStream(file));
				result = readAndClose(input);
			} catch (FileNotFoundException ex) {
				log(ex);
			}
			return result;
		}

		/**
		 * Read an input stream, and return it as a byte array. Sometimes the
		 * source of bytes is an input stream instead of a file. This
		 * implementation closes aInput after it's read.
		 */
		byte[] readAndClose(InputStream aInput) {
			//carries the data from input to output :    
			byte[] bucket = new byte[32 * 1024];
			ByteArrayOutputStream result = null;
			try {
				try {
			//Use buffering? No. Buffering avoids costly access to disk or network;
					//buffering to an in-memory stream makes no sense.
					result = new ByteArrayOutputStream(bucket.length);
					int bytesRead = 0;
					while (bytesRead != -1) {
						//aInput.read() returns -1, 0, or more :
						bytesRead = aInput.read(bucket);
						if (bytesRead > 0) {
							result.write(bucket, 0, bytesRead);
						}
					}
				} finally {
					aInput.close();
					//result.close(); this is a no-operation for ByteArrayOutputStream
				}
			} catch (IOException ex) {
				log(ex);
			}
			return result.toByteArray();
		}

		private void log(Object aThing) {
			System.out.println(String.valueOf(aThing));
		}
	} 
	
	
	
}
