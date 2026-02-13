package com.Array;

import java.util.Scanner;

public class MaxEleArray {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter Size of Array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arraya[] = new int[n];
		System.out.println("Enter Element in Array : ");
		for (int i = 0; i < n; i++) {
			arraya[i] = sc.nextInt();
		}
		int max = 0;
		for (int ele : arraya) {
			max = Math.max(ele, max);
		}
		System.out.println("Max Element in Array is : " + max);

		sc.close();
	}
}
