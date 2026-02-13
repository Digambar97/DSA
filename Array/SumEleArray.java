package com.Array;

import java.util.Scanner;

public class SumEleArray {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter Size of Array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Element in Array : ");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Summation of Element is : " + sum);

		sc.close();
	}
}
