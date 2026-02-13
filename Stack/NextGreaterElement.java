package com.Stack;

import java.util.Stack;

public class NextGreaterElement {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 2, 25 };
		NextGreaterElement.nextElement(arr);
	}

	private static void nextElement(int[] arr) {
		int result[] = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				result[i] = -1;
			} else {
				result[i] = st.peek();
			}
			st.push(arr[i]);
		}
		System.out.println("Printing Next Greater Elements : ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(arr[i] + " -> " + result[i]);
		}
	}
}
