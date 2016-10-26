/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
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

		private final int LENGTH = determineWordSize();
		private final int LOWER_BOUND = 2*LENGTH; // 2 ints per character with word length LENGTH (i.e. 98, 62, etc.)
		private final int UPPER_BOUND = 3*LENGTH; // 3 ints per character with word length LENGTH (i.e. 101, 121, etc.)

		private Utilities utils = new Utilities();
		private Ascii ascii = new Ascii();

		public void StringSplitter() {}

		private int determineWordSize() {
			int len = 0;
			String determined = "";

			File dir = new File(System.getProperty("user.dir") + "/src/scripts/");

			System.out.println(dir);

			File[] matches = dir.listFiles(new FilenameFilter()
			{
			  @Override
			  public boolean accept(File dir, String name)
			  {
				 return name.startsWith("createRandomWordFile") && name.endsWith(".pl");
			  }
			});

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
	
}
