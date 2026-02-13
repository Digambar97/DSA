package com.Searching_Sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		SelectionSort.sortElement(arr, n);
		sc.close();
	}

	private static void sortElement(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Sorted Array Elements : ");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}
