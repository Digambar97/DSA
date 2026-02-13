package com.Recursion;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = SumOfDigit.sumDigit(n);
		System.out.println("Sum of Digit is :  "+sum);
		sc.close();
	}

	private static int sumDigit(int n) {
		if(n==0) {
			return 0;
		}
		return (n%10)+sumDigit(n/10);
	}
}
