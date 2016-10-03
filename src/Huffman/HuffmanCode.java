package Huffman;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.PriorityQueue;

/**
 *
 * @author glender
 */
public class HuffmanCode {
    // input is an array of frequencies, indexed by character code

	/**
	 *
	 * @param charFreqs
	 * @return
	 */
	public HuffmanTree buildTree(int[] charFreqs) {
        PriorityQueue<HuffmanTree> trees = new PriorityQueue<HuffmanTree>();
        // initially, we have a forest of leaves
        // one for each non-empty character
        for (int i = 0; i < charFreqs.length; i++)
            if (charFreqs[i] > 0)
                trees.offer(new HuffmanLeaf(charFreqs[i], (char)i));
 
        assert trees.size() > 0;
        // loop until there is only one tree left
        while (trees.size() > 1) {
            // two trees with least frequency
            HuffmanTree a = trees.poll();
            HuffmanTree b = trees.poll();
 
            // put into new node and re-insert into queue
            trees.offer(new HuffmanNode(a, b));
        }
        return trees.poll();
    }
	
	/** Get Huffman codes for the characters 
	 * This method is called once after a Huffman tree is built
	   * @param root
	   * @return 
	 */
	public String[] getCode(Tree.Node root) {
	  if (root == null) return null;    
	  String[] codes = new String[2 * 128];
	  assignCode(root, codes);
	  return codes;
	}
	
	/* Recursively get codes to the leaf node */
	private void assignCode(Tree.Node root, String[] codes) {
	  if (root.left != null) {
		root.left.code = root.code + "0";
		assignCode(root.left, codes);

		root.right.code = root.code + "1";
		assignCode(root.right, codes);
	  }
	  else {
		codes[(int)root.element] = root.code;
	  }
	}
	
	/** Encode the text using the codes
	   * @param text
	   * @param codes
	   * @return  */
	public String encode(String text, String[] codes) {
	  String result = "";
	  for (int i = 0; i < text.length(); i++) 
		result += codes[text.charAt(i)];    
	  return result;   
	}
	
	/** Decode the bit string into a text
	   * @param bits
	 * @param tree
	   * @return  */
	public String decode(String bits, Tree tree) {
	  String result = "";

	  Tree.Node p = tree.root; // Start from the root
	  for (int i = 0; i < bits.length(); i++) {
		if (bits.charAt(i) == '0') 
		  p = p.left;
		else if (bits.charAt(i) == '1')
		  p = p.right;
		else
		  return null; // Wrong bits

		if (p.left == null) { // A leaf detected
		  result += p.element;
		  p = tree.root; // Restart from the root
		}
	  }

	  return result;
	}
 
	/**
	 *
	 * @param tree
	 * @param prefix
	 */
	public void printCodes(HuffmanTree tree, StringBuffer prefix) {
        assert tree != null;
        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf)tree;
 
            // print out character, frequency, and code for this leaf (which is just the prefix)
            System.out.println(leaf.value + "\t" + leaf.frequency + "\t" + prefix);
 
        } else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode)tree;
 
            // traverse left
            prefix.append('0');
            printCodes(node.left, prefix);
            prefix.deleteCharAt(prefix.length()-1);
 
            // traverse right
            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length()-1);
        }
    }
	
	/**
	 *
	 * @param args
	 */
	public void main(String[] args) {
        String test = "this is an example for huffman encoding";
 
        // we will assume that all our characters will have
        // code less than 256, for simplicity
        int[] charFreqs = new int[256];
        // read each character and record the frequencies
        for (char c : test.toCharArray())
            charFreqs[c]++;
 
        // build tree
        HuffmanTree tree = buildTree(charFreqs);
 
        // print out results
        System.out.println("SYMBOL\tWEIGHT\tHUFFMAN CODE");
        printCodes(tree, new StringBuffer());
    }
	
}
