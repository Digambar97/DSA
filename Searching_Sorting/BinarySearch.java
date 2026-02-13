package com.Searching_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements in Array :  ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (int el : arr) {
			System.out.print(el + " ");
		}
		int ele = 0;
		System.out.println("\nEnter Element to search in array : ");
		ele = sc.nextInt();

		int result = BinarySearch.searchElement(arr, ele);

		if (result != 0) {
			System.out.println("Element Found At index : " + result);
		} else {
			System.out.println("Element is Not Found in Array ");
		}

		sc.close();
	}

	private static int searchElement(int[] arr, int ele) {
		int left = 0, right = arr.length - 1, mid;
		while (left < right) {
			mid = right + left / 2;
			if (arr[mid] == ele) {
				return mid + 1;
			} else if (arr[mid] < ele) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return 0;
	}
}
