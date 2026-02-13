package com.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
	public static void main(String[] args) {
		System.out.println("Enter Paranthese : ");
		Scanner sc = new Scanner(System.in);
		String nm = sc.next();
		boolean check = ValidParantheses.valid(nm);
		if (check) {
			System.out.println("Valid Parantheses !!!");
		} else {
			System.out.println("Paranthese is Not Valid !!!");
		}
		sc.close();
	}

	private static boolean valid(String nm) {
		Stack<Character> st = new Stack<Character>();
		for (char ch : nm.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			} else {
				if (ch == '(' || ch == '[' || ch == '{') {
					return false;
				} else if (st.empty()) {
					return false;
				} else {
					char peek = st.peek();
					if ((peek == '(' && ch == ')') || (peek == '[' && ch == ']') || (peek == '{' && ch == '}')) {
						st.pop();
					}
				}
			}
		}
		return st.isEmpty();
	}
}
