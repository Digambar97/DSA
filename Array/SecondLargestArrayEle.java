package com.Array;

import java.util.Scanner;

public class SecondLargestArrayEle {
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
		int max = arr[0];
		int smax = arr[1];
		if (max < smax) {
			smax = arr[0];
			max = arr[1];
		}
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				smax = max;
				max = arr[i];
			}
			if (arr[i] > smax && arr[i] != max) {
				smax = arr[i];
			}
		}
		System.out.println("Second Max Element is : " + smax + "\nMax Element is : " + max);

		sc.close();
	}
}
