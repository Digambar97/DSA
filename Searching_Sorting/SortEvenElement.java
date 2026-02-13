package com.Searching_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortEvenElement {
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
		SortEvenElement.sortEven(arr, n);
		sc.close();
	}

	private static void sortEven(int[] arr, int n) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
		if (j > 0) {
			Arrays.sort(arr, 0, j);
		}
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}
	}

//	private static void sortEven(int[] arr, int n) {
//		int count = 0;
//		for (int x : arr) {
//			if (x % 2 == 0)
//				count++;
//		}
//		if (count == 0) {
//			System.out.println("No even elements found.");
//			return;
//		}
//		int[] temp = new int[count];
//		int index = 0;
//		for (int i = 0; i < n; i++) {
//			if (arr[i] % 2 == 0) {
//				temp[index++] = arr[i];
//			}
//		}
//		Arrays.sort(temp);
//		System.out.println("Sorted Even Elements:");
//		for (int i = 0; i < temp.length; i++) {
//			System.out.print(temp[i] + " ");
//		}
//	}

//	private static void sortEven(int[] arr, int n) {
//		Arrays.stream(arr).filter(x -> x % 2 == 0).sorted().forEach(x -> System.out.print(x + " "));
//	}

}
