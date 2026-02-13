package com.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	public static void main(String[] args) {
		StackUsingQueue st = new StackUsingQueue();
		st.push(20);
		st.push(30);
		st.pop();
		st.peek();
		st.isEmpty();
	}

	private void push(int data) {
		q2.add(data);
		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		System.out.println("Data is Push in Stack : " + data);
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	private void pop() {
		if (q1.isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		int data = q1.remove();
		System.out.println("Data is Remove : " + data);
	}

	private void peek() {
		if (q1.isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Peek Element in Stack is : " + q1.peek());
	}

	private void isEmpty() {
		if (q1.isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Stack is Not Empty");
	}
}
