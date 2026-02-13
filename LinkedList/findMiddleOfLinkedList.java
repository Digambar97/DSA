package com.LinkedList;

public class findMiddleOfLinkedList {
	static Node head = null;

	public static void main(String[] args) {
		head = new Node(45);
		head.next = new Node(47);
		head.next.next = new Node(49);
		head.next.next.next = new Node(51);
		head.next.next.next.next = new Node(86);
		findMiddleOfLinkedList.middleNode();

	}

	private static void middleNode() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("The Middle Node is : " + slow.data);
	}
}

//class Node {
//	int data;
//	Node next;
//
//	public Node(int data) {
//		this.data = data;
//		this.next = null;
//	}
//}
