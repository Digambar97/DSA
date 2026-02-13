package com.String;

import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings : ");
		String s1 = sc.next();
		String s2 = sc.next();

		String result = LongestCommonPrefix.prefix(s1, s2);
		if (result != null) {
			System.out.println("Longest Common Prefix : " + result);
		} else {
			System.out.println("Both String Are Different No Common Prefix");
		}

		sc.close();
	}

	private static String prefix(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				sb.append(s1.charAt(i));
			} else {
				break;
			}
		}
		return sb.toString();
	}

//	public static String longestCommonPrefix(String[] strs) {
//	    if (strs == null || strs.length == 0) return "";
//	    
//	    String res = strs[0];
//	    for (int i = 1; i < strs.length; i++) {
//	        res = prefix(res, strs[i]);
//	        if (res.isEmpty()) break;
//	    }
//	    return res;
//	}
}
