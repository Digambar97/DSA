package com.Recursion;

import java.util.Scanner;

public class checkPalindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int result = checkPalindrome.palindrome(n);
		if(n==result) {
			System.out.println("Number is Palindrome ");
		}else {
			System.out.println("Number is not Palindrome");
		}

		sc.close();
	}

	static int total = 0;

	private static int palindrome(int n) {
		if (n == 0) {
			return total;
		}
		total = total * 10 + n % 10;
		return palindrome(n / 10);
	}
}
