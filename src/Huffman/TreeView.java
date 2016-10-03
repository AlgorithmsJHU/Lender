package Huffman;


import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * class TreeView for displaying a tree on a panel
 * @author glender
 */
public class TreeView extends JPanel {   
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int radius = 20; // Tree node radius
	private int vGap = 50; // Gap between two levels in a tree
	Tree tree;

	/**
	 *
	 */
	public TreeView() { 
	}

	/**
	 *
	 * @param tree
	 */
	public TreeView(Tree tree) {
	  this.tree = tree;  
	}

	/**
	 *
	 * @param tree
	 */
	public void setTree(Tree tree) {
	  this.tree = tree;
	  repaint();
	}

	/**
	 *
	 * @param g
	 */
	@Override
	protected void paintComponent(Graphics g) {
	  super.paintComponent(g);

	  if (tree == null) return;

	  if (tree.root != null) {
		// Display tree recursively    
		displayTree(g, tree.root, getWidth() / 2, 30, 
		  getWidth() / 4); 
	  }
	}
	
	/** Get a Huffman tree from the codes
	   * @param counts
	   * @return  */  
	public Tree getHuffmanTree(int[] counts) {
	  // Create a heap to hold trees
	  Heap<Tree> heap = new Heap<Tree>();
	  for (int i = 0; i < counts.length; i++) {
		if (counts[i] > 0)
		  heap.add(new Tree(counts[i], (char)i)); // A leaf node tree
	  }

	  while (heap.getSize() > 1) { 
		Tree t1 = heap.remove(); // Remove the smallest weight tree
		Tree t2 = heap.remove(); // Remove the next smallest weight 
		heap.add(new Tree(t1, t2)); // Combine two trees
	  }

	  return heap.remove(); // The final tree
	}

	/**
	 * Display a subtree rooted at position (x, y)
	 * @param g
	 * @param root
	 * @param x
	 * @param y
	 * @param hGap 
	 */
	public void displayTree(Graphics g, Tree.Node root, 
		int x, int y, int hGap) {
	  // Display the root
	  g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
	  g.drawString(root.weight + "", x - 6, y + 4);

	  if (root.left == null) // Display the character for leaf node
		g.drawString(root.element + "", x - 6, y + 34);

	  if (root.left != null) {
		// Draw a line to the left node
		connectLeftChild(g, x - hGap, y + vGap, x, y);
		// Draw the left subtree recursively
		displayTree(g, root.left, x - hGap, y + vGap, hGap / 2);
	  }

	  if (root.right != null) {
		// Draw a line to the right node
		connectRightChild(g, x + hGap, y + vGap, x, y);
		// Draw the right subtree recursively
		displayTree(g, root.right, x + hGap, y + vGap, hGap / 2);  
	  }
	}

	/** Connect a parent at (x2, y2) with 
	 * its left child at (x1, y1) */
	private void connectLeftChild(Graphics g, 
		int x1, int y1, int x2, int y2) { 
	  double d = Math.sqrt(vGap * vGap + (x2 - x1) * (x2 - x1));
	  int x11 = (int)(x1 + radius * (x2 - x1) / d);
	  int y11 = (int)(y1 - radius * vGap / d);
	  int x21 = (int)(x2 - radius * (x2 - x1) / d);
	  int y21 = (int)(y2 + radius * vGap / d);
	  g.drawLine(x11, y11, x21, y21);
	  g.drawString("0", (x11 + x21) / 2 - 5, (y11 + y21) / 2);
	}

	/** Connect a parent at (x2, y2) with 
	 * its right child at (x1, y1) */
	private void connectRightChild(Graphics g, 
		int x1, int y1, int x2, int y2) {
	  double d = Math.sqrt(vGap * vGap + (x2 - x1) * (x2 - x1));
	  int x11 = (int)(x1 - radius * (x1 - x2) / d);
	  int y11 = (int)(y1 - radius * vGap / d);
	  int x21 = (int)(x2 + radius * (x1 - x2) / d);
	  int y21 = (int)(y2 + radius * vGap / d);
	  g.drawLine(x11, y11, x21, y21);
	  g.drawString("1", (x11 + x21) / 2 + 5, (y11 + y21) / 2);
	}

	/**
	 *
	 * @return
	 */
	public Dimension getPreferredSize() {
	  return new Dimension(300, 300);
	}
	
}
