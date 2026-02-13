package com.Array;

import java.util.Scanner;

public class ArraySorted {
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
		boolean status = ArraySorted.sortedArray(arr);
		if (status) {
			System.out.println("Array is Sorted ");
		} else {
			System.out.println("Array is Not Sorted");
		}

		sc.close();
	}

	private static boolean sortedArray(int[] arr) {
		int sum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != sum) {
				return false;
			}
			sum++;
		}

		return true;
	}
}
