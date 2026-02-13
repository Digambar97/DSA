package com.LinkedList;

import java.util.Stack;

public class Palindrome {
	static Node head = null;
	public static void main(String[] args) {
		head  = new Node(45);
		head.next = new Node(47);
		head.next.next = new Node(49);
		head.next.next.next = new Node(47);
		head.next.next.next.next = new Node(45);
		boolean status = Palindrome.checkPalindrome();
		if(status) {
			System.out.println("Linked List is Palindrome ");
		}else {
			System.out.println("Linked List is Not Palindrome ");
		}
	}
	private static boolean checkPalindrome() {
		Stack<Integer> st = new Stack<Integer>();
		Node temp = head;
		while(temp!=null) {
			st.add(temp.data);
			temp = temp.next;
		}
		temp = head;
		while(temp!=null) {
			int data = st.pop();
			if(temp.data!=data) {
				return false;
			}
			temp = temp.next;
		}
		return true;
	}
}
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
