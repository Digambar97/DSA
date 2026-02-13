package com.Array;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter number for Pattern : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		sc.close();
	}
}
