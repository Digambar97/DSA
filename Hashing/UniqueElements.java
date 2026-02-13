package com.Hashing;

import java.util.HashSet;

//Remove duplicates from array
public class UniqueElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
		HashSet<Integer> set = new HashSet<Integer>();
		for (int num : arr) {
			set.add(num);
		}
		System.out.println(set);
	}
}
