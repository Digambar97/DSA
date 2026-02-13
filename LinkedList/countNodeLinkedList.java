package com.LinkedList;

public class countNodeLinkedList {
	static Node head = null;
	public static void main(String[] args) {
		head  = new Node(45);
		head.next = new Node(47);
		head.next.next = new Node(49);
		head.next.next.next = new Node(51);
		countNodeLinkedList.countNode();
	}
	private static void countNode() {
		Node temp = head;
		int count=0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		System.out.println("Total number of Node in Linked List is : "+count);
	}
}

//class Node{
//	int data;
//	Node next;
//	public Node(int data) {
//		this.data = data;
//		this.next = null;
//	}
//}
