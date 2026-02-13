package com.Searching_Sorting;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallestElement {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements in Array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the postion of smallest elemrnt : ");
		int k = sc.nextInt();
		kthSmallestElement.kthPosition(arr, n, k);

		sc.close();
	}

//	private static void kthPosition(int[] arr, int n, int k) {
//		Arrays.sort(arr);
//		System.out.println("Element is : " + arr[k - 1]);
//	}

	private static void kthPosition(int[] arr, int n, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int val : arr) {
			maxHeap.add(val);
			if (maxHeap.size() > k) {
				maxHeap.poll();
			}
		}
		System.out.println("Element in that kth smallest position is : " + maxHeap.peek());
	}  

}
