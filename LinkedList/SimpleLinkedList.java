package com.LinkedList;

public class SimpleLinkedList {
	static Node head;

	public static void main(String[] args) {
		head = new Node(23);
		head.next = new Node(45);
		head.next.next = new Node(86);

		SimpleLinkedList.printList();
	}

	private static void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
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