package com.Array;

import java.util.Scanner;

public class ArraySimple {

	public static void main(String[] args) {
		int n = 0;
		System.out.println(" Enter size of Array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Printing Array  Element : ");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}

		sc.close();
	}

}
