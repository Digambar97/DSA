package com.Stack;

import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostFix {
	public static void main(String[] args) {
		System.out.println("Enter Postfix Expression : ");
		Scanner sc = new Scanner(System.in);
		String nm = sc.next();
		long result = EvaluatePostFix.evaluate(nm);
		System.out.println("Result of PostFix Evaluation : "+result);
		sc.close();
	}

	private static long evaluate(String nm) {
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < nm.length(); i++) {
			char c = nm.charAt(i);
			if (Character.isDigit(c)) {
				st.push(c-'0');
			} else {
				int val1 = st.pop();
				int val2 = st.pop();
				switch (c) {
				case '+':
					st.push(val2 + val1);
					break;
				case '-':
					st.push(val2 - val1);
					break;
				case '*':
					st.push(val2 * val1);
					break;
				case '/':
					st.push(val2 / val1);
					break;
				}
			}
		}
		return st.pop();
	}
}
