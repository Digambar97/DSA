package com.Searching_Sorting;

import java.util.Scanner;

public class BubbleSort {
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
		BubbleSort.sortElement(arr, n);
		sc.close();
	}

	private static void sortElement(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Array  :  ");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}
