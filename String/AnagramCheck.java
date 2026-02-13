package com.String;

import java.util.Scanner;

// Check two String  has contains same number of character with any position

public class AnagramCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings to check Anagram : ");
		String nm1 = sc.next();
		String nm2 = sc.next();

		AnagramCheck.check(nm1, nm2);
		sc.close();
	}

	private static void check(String nm1, String nm2) {
		if (nm1.length() != nm2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		String s1 = nm1.toLowerCase();
		String s2 = nm2.toLowerCase();
		
		int freq[] = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			freq[s1.charAt(i) - 'a']++;
			freq[s2.charAt(i) - 'a']--;
		}
		boolean isAnagram = true;
		for (int i = 0; i < 26; i++) {
			if (freq[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		if (isAnagram) {
			System.out.println("Strings are Anagram ");
		} else {
			System.out.println("Strings are not Anagram ");
		}
	}
}
