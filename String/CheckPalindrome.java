package com.String;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		boolean status = CheckPalindrome.palindrome(s);
		if (status) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is Not Plindrome");
		}
		
		sc.close();
	}

	private static boolean palindrome(String nm) {
		String s = nm.toLowerCase();
		int left = 0, right = s.length() - 1;
		while (left < right) {
			char lChar = s.charAt(left);
			char rChar = s.charAt(right);
			if (!Character.isLetterOrDigit(lChar)) {
				left++;
			} else if (!Character.isLetterOrDigit(rChar)) {
				right--;
			} else {
				if (s.charAt(left) != s.charAt(right)) {
					return false;
				}
				left++;
				right--;
			}
		}
		return true;
	}
}
