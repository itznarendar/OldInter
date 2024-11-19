package dsa;
// Java code to implement the above approach
import java.util.*;

// Definition of a binary tree node
class Node {
	int data;
	Node left, right;

	// Constructor to create a new binary tree node
	Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

class BinaryTreeBoundary {
	// Function to print the left boundary nodes of a binary tree
	static void printLeftBoundary(Node root) {
		if (root == null) {
			return;
		}
		if (root.left != null || root.right != null) {
			System.out.print(root.data + " ");
		}
		if (root.left != null) {
			printLeftBoundary(root.left);
		} else {
			printLeftBoundary(root.right);
		}
	}

	// Function to print the right boundary nodes of a binary tree
	static void printRightBoundary(Node root) {
		if (root == null) {
			return;
		}
		if (root.left != null || root.right != null) {
			System.out.print(root.data + " ");
		}
		if (root.right != null) {
			printRightBoundary(root.right);
		} else {
			printRightBoundary(root.left);
		}
		
	}

	// Function to print the leaves of a binary tree
	static void printLeaves(Node root) {
		if (root == null) {
			return;
		}
		printLeaves(root.left);
		if (root.left == null && root.right == null) {
			System.out.print(root.data + " ");
		}
		printLeaves(root.right);
	}

	// Function to print the boundary nodes of a binary tree in anticlockwise order
	static void printBoundary(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printLeftBoundary(root.left);
		printLeaves(root.left);
		printLeaves(root.right);
		printRightBoundary(root.right);
	}

	// Driver code
	public static void main(String[] args) {
		// Creating the binary tree
		Node root = new Node(20);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.left.left = new Node(3);

		root.left.left.right = new Node(5);
		root.left.left.right.left = new Node(1);
		root.left.left.right.right = new Node(7);

		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		root.right = new Node(22);
		root.right.left = new Node(21); 

		root.right.right = new Node(25);
		root.right.right.left = new Node(23);
		root.right.right.right = new Node(26);


		// Printing the boundary nodes of the binary tree
		printBoundary(root);
	}
}
