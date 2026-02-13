package com.String;

import java.util.Scanner;

public class FindNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String nm = sc.next();

		FindNonRepeatingCharacter.nonRepeat(nm);
		sc.close();
	}

	private static void nonRepeat(String nm) {
		int[] freq = new int[256];
		for (int i = 0; i < nm.length(); i++) {
			freq[nm.charAt(i)]++;
		}
		for (int i = 0; i < nm.length(); i++) {
			if (freq[nm.charAt(i)] == 1) {
				System.out.println("First Non Repeating Character : " + nm.charAt(i));
				return;
			}
		}
		System.out.println("All Character Are Repeatin");
	}

//	private static void findFirstUnique(String s) {
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (s.indexOf(ch) == s.lastIndexOf(ch)) {
//				System.out.println("First Non Reapeating Character is : " + ch);
//				return;
//			}
//		}
//		System.out.println("Not Unique Character is Found");// tc(O^2)
//	}
}
