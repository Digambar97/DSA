package com.Searching_Sorting;

import java.util.Scanner;

public class DesceSearchElement {
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
		System.out.println("\nElement which want to find occurance : ");
		ele = sc.nextInt();
		int result = DesceSearchElement.SearchElement(arr, ele);
		if (result != -1) {
			System.out.println("Element is found at : " + result + "  position");
		} else {
			System.out.println("Element is Not Found ");
		}

		sc.close();
	}

	private static int SearchElement(int[] arr, int ele) {
		int left = 0, right = arr.length - 1, mid;
		while (left < right) {
			mid = left + (right - left) / 2;
			if (arr[mid] == ele) {
				return mid + 1;
			} else if (arr[mid] < ele) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
}
