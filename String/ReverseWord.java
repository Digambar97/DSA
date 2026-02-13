package com.String;

import java.util.Scanner;

public class ReverseWord {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Sentence : ");
//		String s = sc.nextLine();
//		String[] s1 = s.split(" ");
//		for (int i = s1.length - 1; i >= 0; i--) {
//			System.out.print(s1[i] + " ");
//		}
//		sc.close();
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String s = sc.nextLine();
		String[] words = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			if (i != 0) {
				sb.append(" ");
			}
		}
		System.out.println("Reverse Sentence : " + sb.toString());

		sc.close();
	}
}
