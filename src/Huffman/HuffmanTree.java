package Huffman;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author glender
 */
public class HuffmanTree implements Comparable<HuffmanTree> {

	/**
	 *
	 */
	public final int frequency; // the frequency of this tree

	/**
	 * compares on the frequency
	 *
	 * @param freq
	 */
	public HuffmanTree(int freq) {
		frequency = freq;
	}

	/**
	 *
	 */
	public HuffmanTree() {
		frequency = 0;
	}

	/**
	 *
	 * @param tree
	 * @return
	 */
	public int compareTo(HuffmanTree tree) {
		return frequency - tree.frequency;
	}
}

class HuffmanLeaf extends HuffmanTree {

	public final char value; // the character this leaf represents

	public HuffmanLeaf(int freq, char val) {
		super(freq);
		value = val;
	}
}

class HuffmanNode extends HuffmanTree {

	public final HuffmanTree left, right; // subtrees

	public HuffmanNode(HuffmanTree l, HuffmanTree r) {
		super(l.frequency + r.frequency);
		left = l;
		right = r;
	}

}
