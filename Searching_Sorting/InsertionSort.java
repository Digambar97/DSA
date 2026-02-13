package com.Searching_Sorting;

import java.util.Scanner;

public class InsertionSort {
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
		InsertionSort.sortElement(arr, n);
		sc.close();
	}

	private static void sortElement(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println("Sorted Array is : ");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}
