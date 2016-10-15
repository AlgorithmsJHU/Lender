package Huffman;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Define a Huffman coding tree
 *
 * @author glender
 */
public class Tree implements Comparable<Tree> {

	public Node root; // The root of the tree

	/**
	 * Create a tree with two subtrees
	 *
	 * @param t1
	 * @param t2
	 */
	public Tree(Tree t1, Tree t2) {
		root = new Node();
		root.left = t1.root;
		root.right = t2.root;
		root.weight = t1.root.weight + t2.root.weight;
	}

	/**
	 * Create a tree containing a leaf node
	 *
	 * @param weight
	 * @param element
	 */
	public Tree(int weight, char element) {
		root = new Node(weight, element);
	}

	/**
	 *
	 */
	public Tree() {
	}

	/**
	 * Compare trees based on their weights
	 *
	 * @param o
	 * @return
	 */
	public int compareTo(Tree o) {
		if (root.weight < o.root.weight) // Purposely reverse the order
		{
			return 1;
		} else if (root.weight == o.root.weight) {
			return 0;
		} else {
			return -1;
		}
	}

	/**
	 *
	 */
	public class Node {

		char element; // Stores the character for a leaf node
		int weight; // weight of the subtree rooted at this node
		Node left; // Reference to the left subtree
		Node right; // Reference to the right subtree
		String code = ""; // The code of this node from the root

		/**
		 * Create an empty node
		 */
		public Node() {
		}

		/**
		 * Create a node with the specified weight and character
		 *
		 * @param weight
		 * @param element
		 */
		public Node(int weight, char element) {
			this.weight = weight;
			this.element = element;
		}
	}
}
