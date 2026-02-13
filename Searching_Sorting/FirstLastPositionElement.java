package com.Searching_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastPositionElement {
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
		System.out.println("\nElement which want to find occurance : ");
		ele = sc.nextInt();

		int firstPos = FirstLastPositionElement.firstPosition(arr, ele);
		int secondPos = FirstLastPositionElement.lastPosition(arr, ele);

		if (firstPos != -1 || secondPos != -1) {
			System.out.println("First Position is : " + firstPos + "  Second Position is : " + secondPos);
		} else {
			System.out.println("Element is Not Found ");
		}

		sc.close();
	}

	private static int firstPosition(int[] arr, int ele) {
		int left = 0, right = arr.length - 1, mid;
		int result = -2;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (arr[mid] == ele) {
				result = mid;
				right = mid - 1;
			} else if (arr[mid] < ele) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return result + 1;
	}

	private static int lastPosition(int[] arr, int ele) {
		int left = 0, right = arr.length - 1, mid;
		int result = -2;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (arr[mid] == ele) {
				result = mid;
				left = mid + 1;
			} else if (arr[mid] < ele) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return result + 1;
	}
}
