package com.Recursion;

import java.util.Scanner;

public class countDigit {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int n = sc.nextInt();
			int result = countDigit.count(n);
			System.out.println("Count of Digit is : "+result);
			sc.close();
	}
static int total = 0;
	private static int count(int n) {
		if(n==0) {
			return total;
		}
		total++;
		return count(n/10);
	}
}
