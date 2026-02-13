package com.Searching_Sorting;

import java.util.Scanner;

public class CheckSortedArray {
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
		System.out.println("Array Elements are : ");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		boolean status = CheckSortedArray.SortElement(arr, n);
		if (status) {
			System.out.println("\nArray is Sorted ");
		} else {
			System.out.println("\nArray is Not Sorted");
		}
		sc.close();
	}

	private static boolean SortElement(int[] arr, int n) {
		int ele = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] < ele) {
				return false;
			} else {
				ele = arr[i];
			}
		}
		return true;
	}
}
