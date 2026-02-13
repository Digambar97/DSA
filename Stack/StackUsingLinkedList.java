package com.Stack;

public class StackUsingLinkedList {
	static Node head = null;

	public static void main(String[] args) {
		StackUsingLinkedList st = new StackUsingLinkedList();
		st.push(86);
		st.push(65);
		st.pop();
		st.peek();
		st.isEmpty();
	}

	private void push(int n) {
		Node newnode = new Node(n);
		newnode.next = head;
		head = newnode;
		System.out.println("Data is Push : " + n);
	}

	private void pop() {
		if (head == null) {
			System.out.println("Stack using Linked List is Empty ");
			return;
		}
		System.out.println("Data is poped : " + head.data);
		head = head.next;
	}

	private void peek() {
		if (head == null) {
			System.out.println("Stack is Empty ");
			return;
		}
		System.out.println("Stack Peek Element is : " + head.data);
	}

	private void isEmpty() {
		if (head == null) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Stack is Not Empty");
		}
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