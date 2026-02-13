package com.LinkedList;

import java.util.Scanner;

public class FindNthNodeFromEnd {
	static Node head = null;
	public static void main(String[] args) {
		head = new Node(45);
		head.next = new Node(47);
		head.next.next = new Node(49);
		head.next.next.next = new Node(51);
		head.next.next.next.next = new Node(86);
		
		FindNthNodeFromEnd.findNode();
	}
	private static void findNode() {
		System.out.println("Enter postion from End of Node : ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();
		Node slow = head;
		Node fast = head;
		for (int i = 0; i < k; i++) {
			if(fast==null) {
				System.out.println("List is not Full fill ");
				return;
			}
			fast = fast.next;
		}
		while(fast!=null) {
			slow = slow.next;
			fast= fast.next;
		}
		System.out.println("The Nth position From End is : "+slow.data);
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