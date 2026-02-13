package com.Tree;

public class SearchInBST {
	static Node root = null;

	public static void main(String[] args) {
		root = SearchInBST.insert(root, 75);
		SearchInBST.insert(root, 45);
		SearchInBST.insert(root, 47);
		SearchInBST.insert(root, 82);
		SearchInBST.insert(root, 78);
		SearchInBST.insert(root, 55);
		SearchInBST.insert(root, 42);
		System.out.println("Printing In-Order Traversal");
		printBST(root);
		System.out.println("\nSearching Element In BST");
		searchBST(root, 42);
	}

	private static Node searchBST(Node root, int data) {
		if (root == null) {
			return null;
		}
		if (root.data == data) {
			System.out.println("Data is Found in Tree " + data);
			return root;
		}
		if (data < root.data) {
			return searchBST(root.left, data);
		} else if (data > root.data) {
			return searchBST(root.right, data);
		}
		System.out.println("Data is Not Found in Tree ");
		return root;
	}

	private static void printBST(Node root) {
		if (root == null) {
			return;
		}
		printBST(root.left);
		System.out.print(root.data + " ");
		printBST(root.right);
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
