package com.Recursion;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		
		for (int i = 0; i < n; i++) {
		    System.out.print(fibon(i) + " "); 
		}
		sc.close();
	}
	private static long fibon(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibon(n-1)+fibon(n-2);
	}
}
