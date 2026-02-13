package com.Recursion;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int result = ReverseNumber.reverse(n);
		System.out.println("Revers the Number : "+result);
		
		sc.close();
	}
	static int total = 0;
	private static int reverse(int n) {
		if(n==0) {
			return total;
		}
		total = total *10 + n%10;
		return reverse(n/10);
	}
}
