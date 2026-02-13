package com.Hashing;

import java.util.HashMap;

public class FirstNonRepeatingElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 2, 1, 2, 3, 4, 3, 5 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int num : arr) {
			if (map.get(num) == 1) {
				System.out.println(num);
				break;
			}
		}
	}
}
