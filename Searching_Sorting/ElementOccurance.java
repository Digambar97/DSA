package com.Searching_Sorting;

import java.util.Scanner;

public class ElementOccurance {
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
		int result = ElementOccurance.elementCount(arr, ele);

		if (result != 0) {
			System.out.println("Element present in Array Occurance is : " + result);
		} else {
			System.out.println("Element is Not Present in Array ");
		}

		sc.close();
	}

	private static int elementCount(int[] arr, int ele) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				count++;
			}
		}
		return count;
	}
}
