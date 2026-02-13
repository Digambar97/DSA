package com.Tree;

public class heightOfBinaryTree {
	static Node root = null;

	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		int result = heightOfBinaryTree.height(root);
		System.out.println("Heigth of Tree : " + result);
	}

	private static int height(Node root2) {
		if (root2 == null) {
			return 0;
		}
		int leftHeight = height(root2.left);
		int rigthHeight = height(root2.right);
		return Math.max(leftHeight, rigthHeight) + 1;
	}
}
