package com.Hashing;

import java.util.HashMap;

public class FrquencyCount {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 2, 1, 3, 7 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		System.out.println(map);
	}
}
