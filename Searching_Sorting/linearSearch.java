package com.Searching_Sorting;

import java.util.Scanner;

public class linearSearch {
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
		for (int el : arr) {
			System.out.print(el + " ");
		}

		int ele = 0;
		System.out.println("\nEnter Element to Search : ");
		ele = sc.nextInt();

		int result = linearSearch.SearchElement(arr, ele);
		if (result != -1) {
			System.out.println("Element Fount At Location : " + result);
		} else {
			System.out.println("Element is Not Found in Array ");
		}
		sc.close();
	}

	private static int SearchElement(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return i + 1;
			}
		}

		return -1;
	}
}
