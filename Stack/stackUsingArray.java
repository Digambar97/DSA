package com.Stack;

import java.util.Scanner;

public class stackUsingArray {
	int arr[];
	int top = -1;
	int size;

	public stackUsingArray(int n) {
		arr = new int[n];
		this.size = n;
	}

	private void push(int n) {
		if (top == size - 1) {
			System.out.println("Stack is Overflow");
			return;
		}
		arr[++top] = n;
		System.out.println("Element is pushed : "+n);
	}

	private void pop() {
		if (top == -1) {
			System.out.println("Stack is underflow");
			return;
		}
		System.out.println("top Element is poped : " + arr[top]);
		top--;
	}

	private void peek() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Peek of Stack Element is : " + arr[top]);
	}

	private void isEmpty() {
		if (top == -1) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Stack is Not Empty");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int n = sc.nextInt();
		stackUsingArray st = new stackUsingArray(n);
		st.push(45);
		st.push(86);
		st.pop();
		st.peek();
		st.isEmpty();
		sc.close();
	}
}
