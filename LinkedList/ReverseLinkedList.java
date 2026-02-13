package com.LinkedList;

public class ReverseLinkedList {
	static Node head = null;
	public static void main(String[] args) {
		head  = new Node(45);
		head.next = new Node(47);
		head.next.next = new Node(49);
		head.next.next.next = new Node(51);
		ReverseLinkedList.display();
		ReverseLinkedList.reverse();
		ReverseLinkedList.display();
	}
	static void reverse() {
		Node prev = null;
		Node curr = head;
		Node next = null;
		
		while(curr !=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	static void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println(" null ");
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
