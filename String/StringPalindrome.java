package com.String;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String nm = sc.next();
		boolean status = StringPalindrome.statusPalindrome(nm);
		if (status) {
			System.out.println("String is Palindrome " + nm);
		} else {
			System.out.println("String is Not Palindrome " + nm);
		}

		sc.close();
	}

	private static boolean statusPalindrome(String nm) {
		int left = 0, right = nm.length() - 1;
		while (left < right) {
			if (nm.charAt(left) != nm.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
