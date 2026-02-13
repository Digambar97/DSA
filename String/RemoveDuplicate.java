package com.String;

import java.util.Scanner;
public class RemoveDuplicate {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a String : ");
//		String nm = sc.next();
//		Set<Character> set = new LinkedHashSet<Character>();
//		for (char ch : nm.toCharArray()) {
//			set.add(ch);
//		}
//		StringBuilder sb = new StringBuilder();
//		for(Character ch : set) {
//			sb.append(ch);
//		}
//		System.out.println("String Without Duplicate : " + sb.toString());
//
//		sc.close();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String nm = sc.next();

		String result = RemoveDuplicate.removeDuplicates(nm);
		System.out.println("Result is : "+result);
		
		sc.close();

	}

	public static String removeDuplicates(String nm) {
		if (nm == null || nm.length() < 2)
			return nm;

		boolean[] seen = new boolean[256];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < nm.length(); i++) {
			char ch = nm.charAt(i);

			if (!seen[ch]) {
				seen[ch] = true;
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
