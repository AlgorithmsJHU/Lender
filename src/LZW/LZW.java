/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LZW;

import Encryption.PKCryptosys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author glender
 */
public class LZW {

	private PKCryptosys pk = new PKCryptosys();
	
    /** Compress a string to a list of output symbols.
     * @param uncompressed
     * @return  
     */
    public List<Integer> compress(String uncompressed) {
        
        // Build the dictionary.
        int dictSize = 256;
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        
        for (int index = 0; index < 256; index++) {
            dictionary.put("" + (char)index, index);
        }
 
        String character = "";
        List<Integer> result = new ArrayList<Integer>();
        
        for (char ch : uncompressed.toCharArray()) {
            
            String characterCh = character + ch;
            
            if (dictionary.containsKey(characterCh)) {
                character = characterCh;
            } else {
                result.add(dictionary.get(character));
                // Add characterCh to the dictionary.
                dictionary.put(characterCh, dictSize++);
                character = "" + ch;
            }
            
        }
 
        // Output the code for character.
        if (!character.equals("")) {
            result.add(dictionary.get(character));
        }
        
        return result;
        
    }
 
    /** Decompress a list.
     * @param compressed
     * @return  
     */
    public String decompress(List<Integer> compressed) {
        // Build the dictionary.
        int dictSize = 256;
        Map<Integer, String> dictionary = new HashMap<Integer, String>();
        
        for (int index = 0; index < 256; index++) {
            dictionary.put(index, "" + (char)index);
        }
 
        String compressedLetter = "" + (char)(int)compressed.remove(0);
        StringBuilder result = new StringBuilder(compressedLetter);
        
        for (int index : compressed) {
            String entry;
            if (dictionary.containsKey(index)) {
                entry = dictionary.get(index);
            } else if (index == dictSize) {
                entry = compressedLetter + compressedLetter.charAt(0);
            } else {
                throw new IllegalArgumentException("Bad compressed index: " + index);
            }
 
            result.append(entry);
 
            // Add compressedLetter + entry[0] to the dictionary.
            dictionary.put(dictSize++, compressedLetter + entry.charAt(0));
 
            compressedLetter = entry;
        }
        return result.toString();
    }
	
}
