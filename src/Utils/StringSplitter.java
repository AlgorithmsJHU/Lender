/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
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
					if (ascii.asciiNew.contains(Integer.valueOf(check)) && letterCount > 6) {

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
