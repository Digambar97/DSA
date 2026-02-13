package com.Recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		double n = sc.nextDouble();
		double result = Factorial.facto(n);
		System.out.println("Result of Factorialvis : "+result);
		sc.close();
	}

	private static double facto(double n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * facto(n - 1);
	}

}
