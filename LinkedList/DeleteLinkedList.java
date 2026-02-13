package com.LinkedList;

import java.util.Scanner;

public class DeleteLinkedList {
	static Node head = null;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DeleteLinkedList dl = new DeleteLinkedList();
		int ch = 0;
		do {
			System.out.println("\n********** MENU  *********");
			System.out.println("1.Delete Head\n2.Delete Tail\n3.Delete Before Node"
					+ "\n4.Delete After Node\n5.Print List\n6.Display Data\n7.Insert Data\n8.Exist");
			System.out.println("Enter your Choice :  ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				dl.deleteHead();
				break;
			case 2:
				dl.deletTail();
				break;
			case 3:
				dl.deleteBeforeNode();
				break;
			case 4:
				dl.deleteAfterNode();
				break;
			case 5:
				dl.deleteNode();
				break;
			case 6:
				dl.DisplayList();
				break;
			case 7:
				dl.insertAtHead();
				break;
			case 8:
				System.out.println("Thanks for Performing Operations on List ");
				break;
			default:
				System.out.println("Invalid Choice Try Again Valid Choice");
			}
		} while (ch != 8);
	}

	private void deleteHead() {
		if (head == null) {
			System.out.println("List is Empty ");
			return;
		}
		System.out.println("Deleted node with data : " + head.data);
		head = head.next;
	}

	private void deletTail() {
		if (head == null) {
			System.out.println("List is Empty ");
			return;
		}
		if (head.next == null) {
			System.out.println("Deleted only node : " + head.data);
			head = null;
			return;
		}
		Node temp = head;
		while (temp.next.next!= null) {
			temp = temp.next;
		}
		System.out.println("Delete tail node : " + temp.next.data);
		temp.next = null;
	}

	private void deleteBeforeNode() {
		System.out.println("Enter data of the reference node: ");
		int data = sc.nextInt();
		if (head == null || head.next == null) {
			System.out.println("Operation not possible: List too short.");
			return;
		}

		if (head.next.data == data) {
			System.out.println("Deleting node before " + data + ": " + head.data);
			head = head.next;
			return;
		}

		Node prev = head;
		Node current = head.next;

		while (current.next != null && current.next.data != data) {
			prev = current;
			current = current.next;
		}

		if (current.next == null) {
			System.out.println("Reference node " + data + " not found or no node exists before it.");
		} else {
			System.out.println("Deleting node before " + data + ": " + current.data);
			prev.next = current.next;
		}
	}

	private void deleteAfterNode() {
		System.out.println("Enter data of the reference node: ");
		int data = sc.nextInt();
		if (head == null) {
			System.out.println("List is Empty.");
			return;
		}
		Node temp = head;
		while (temp != null && temp.data != data) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Reference node " + data + " not found.");
		} else if (temp.next == null) {
			System.out.println("No node exists after " + data + " to delete.");
		} else {
			System.out.println("Deleting node after " + data + ": " + temp.next.data);
			temp.next = temp.next.next;
		}
	}

	private void deleteNode() {
		System.out.println("Enter data of node to delete : ");
		int data = sc.nextInt();
		if (head == null) {
			System.out.println("List is Empty ");
			return;
		}
		if (head.data == data) {
			System.out.println("Delete Node At Head : " + head.data);
			head = head.next;
		}
		Node temp = head;
		Node prev = null;
		while (temp != null && temp.data != data) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Data " + data + " Not found in the List");
			return;
		}
		System.out.println("Delete Node with Data : " + temp.data);
		prev.next = temp.next;
	}

	private void DisplayList() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is Empty ");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(" null ");
	}

	private void insertAtHead() {
		System.out.println("Insert the Data : ");
		int data = sc.nextInt();
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		System.out.println("Inserted " + data + " at the head.");
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
