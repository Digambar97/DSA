package com.String;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String nm = sc.next();
		ReverseString.reverse(nm);
		sc.close();
	}

	private static void reverse(String nm) {
		char arr[] = nm.toCharArray();
		int left = 0, right = nm.length() - 1;
		while (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println("Revser String is : " + new String(arr));
	}

//	private static void reverse(String nm) {
//		StringBuilder sb = new StringBuilder(nm);
//		System.out.println("Reverse String is : " + sb.reverse());
//	}

//	private static void reverse(String nm) {
//		String rev = "";
//		char arr[] = new char[nm.length()];
//		arr = nm.toCharArray();
//		for (int i = arr.length - 1; i >= 0; i--) {
//			rev += arr[i];
//		}
//		System.out.println("Reverse String is : " + rev);
//	}

//	private static void reverse(String nm) {
//		String rev = "";
//		for (int i = nm.length - 1; i >= 0; i--) {
//			rev += nm.charAt(i);
//		}
//		System.out.println("Reverse String is : " + rev);
//	}
}
