package com.Recursion;

import java.util.Scanner;

public class PrintNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number where you want to print : ");
		int n = sc.nextInt();
		PrintNumber.print(n);

		sc.close();
	}

//	private static void print(int n) {
//		if (n == 0) {
//			return;
//		}
//		print(n - 1);
//		System.out.print(n + " ");
//	}
	
	private static void print(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + " ");
		print(n - 1);
	}
}
