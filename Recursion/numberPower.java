package com.Recursion;

import java.util.Scanner;

public class numberPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		long n = sc.nextLong();
		System.out.println("Enter power of number : ");
		int x = sc.nextInt();
		long result = numberPower.power(n,x);
		System.out.println("Power of number is : "+result);
		sc.close();
	}

	private static long power(long n, int x) {
		if(x==0) {
			return 1;
		}
		return n*power(n, x-1);
	}
}
