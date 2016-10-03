/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordChecker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author glender
 */
public class WordChecker {
	
	/**
	 *
	 */
	public WordChecker() {}
	
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
		if(!f.exists() && !f.isDirectory()) { 
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
		if(!f.exists() && !f.isDirectory()) { 
			return false;
		}
		
		return true;
	}

}