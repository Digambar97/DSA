package com.Tree;

public class insertIntoBST {
	static Node root = null;

	public static void main(String[] args) {
		root = insertIntoBST.insert(root, 55);
		insertIntoBST.insert(root, 51);
		insertIntoBST.insert(root, 59);
		insertIntoBST.insert(root, 45);
		insertIntoBST.insert(root, 48);
		System.out.println("Printing In-Order Traversal");
		printBST(root);
	}

	private static void printBST(Node root2) {
		if (root2 == null) {
			return;
		}
		printBST(root2.left);
		System.out.print(root2.data + " ");
		printBST(root2.right);
	}

	private static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}
}
