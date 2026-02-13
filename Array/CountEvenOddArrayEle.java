package com.Array;

import java.util.Scanner;

public class CountEvenOddArrayEle {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter Size of Array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Element in Array : ");
		int even = 0, odd = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println("Even Number are : " + even + "\nOdd Number are : " + odd);

		sc.close();
	}
}
