package com.Array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter Size of Array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arraya[] = new int[n];
		System.out.println("Enter Element in Array : ");
		for (int i = 0; i < n; i++) {
			arraya[i] = sc.nextInt();
		}
		System.out.println("Array is Printed : ");
		for (int ele : arraya) {
			System.out.print(ele + " ");
		}

		int j = n - 1;
		for (int i = 0; i <= j; i++) {
			int temp = arraya[i];
			arraya[i] = arraya[j];
			arraya[j] = temp;
			j--;
		}

		System.out.println("\nArray is Printed in Reverse Order : ");
		for (int ele : arraya) {
			System.out.print(ele + " ");
		}

		sc.close();
	}
}
