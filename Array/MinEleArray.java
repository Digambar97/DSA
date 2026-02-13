package com.Array;

import java.util.Scanner;

public class MinEleArray {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter Size of Array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Element in Array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			min = Math.min(min, arr[i]);
		}
		System.out.println("Minmum Element in Array is : " + min);

		sc.close();
	}
}
