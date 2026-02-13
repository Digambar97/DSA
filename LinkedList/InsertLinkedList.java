package com.LinkedList;

import java.util.Scanner;

public class InsertLinkedList {
	static Node head = null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		InsertLinkedList ll = new InsertLinkedList();
		int ch = 0;
		do {
			System.out.println("\n********  MENU  *******");
			System.out.println(
					"1:Insert At Begining \n2:Insert At End \n3:Insert Before Node \n4:Insert After Node \n5:Print Linked List \n6:Exist");
			System.out.println("Enter your Choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				ll.insertAtBegin();
				break;
			case 2:
				ll.insertAtEnd();
				break;
			case 3:
				ll.insertBeforeNode();
				break;
			case 4:
				ll.insertAfterNode();
				break;
			case 5:
				ll.DisplayList();
				break;
			case 6:
				System.out.println("Thanks For Performing Operation on linked list");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		} while (ch != 6);

	}

	private void insertAtBegin() {
		System.out.println("Enter node data insert at begining : ");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	private void insertAtEnd() {
		System.out.println("Enter node data insert at End : ");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		Node temp = head;
		if (head == null) {
			head = newNode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	private void insertBeforeNode() {
		if (head == null) {
			System.out.println("List is Empty ");
			return;
		}
		System.out.println("Enter Data to insert node : ");
		int data = sc.nextInt();
		System.out.println("Enter Node to before insert data : ");
		int val = sc.nextInt();
		Node newNode = new Node(data);
		if (head.data == val) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null && temp.next.data != val) {
			temp = temp.next;
		}
		if (temp.next == null) {
			System.out.println("Node with value " + val + " not Found in List");
		} else {
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	private void insertAfterNode() {
		if(head ==null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Insert new node data : ");
		int data = sc.nextInt();
		System.out.println("Enter value of node : ");
		int val = sc.nextInt();
		Node newNode = new Node(data);
		if(head.data==val) {
			newNode.next = head.next;
			head.next = newNode;
			return;
		}
		Node temp = head;
		while(temp !=null && temp.data != val) {
			temp = temp.next;
		}
		if(temp==null) {
			System.out.println("Node with value "+val+" Not found in list");
		}else {
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	private void DisplayList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
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