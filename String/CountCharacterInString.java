package com.String;

import java.util.Scanner;

public class CountCharacterInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String nm = sc.next();
		CountCharacterInString.stringCount(nm);

		sc.close();
	}

	private static void stringCount(String nm) {
		int[] count = new int[26];
		for (char ch : nm.toLowerCase().toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				count[ch - 'a']++;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.println((char) (i + 'a') + " : " + count[i]);
			}
		}
	}

//	private static void stringCount(String nm) {
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		for (int i = 0; i < nm.length(); i++) {
//			char ch = nm.charAt(i);
//			map.put(ch, map.getOrDefault(ch, 0) + 1);
//		}
//		for (Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
//	}

}
