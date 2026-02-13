package com.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter a String :  ");
		Scanner sc = new Scanner(System.in);
		String nm = sc.next();
		ReverseString.reverse(nm);
		sc.close();
	}

	private static void reverse(String nm) {
		Stack<Character> st = new Stack<Character>();
		for (char ch : nm.toCharArray()) {
			st.push(ch);
		}
		StringBuilder rev = new StringBuilder();
		while (!st.isEmpty()) {
			rev.append(st.pop());
		}
		System.out.println("String Reverses is : " + rev.toString());
	}
}
