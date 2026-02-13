package com.Hashing;

import java.util.HashMap;

public class TwoSumProblem {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15, 5, 9 };
		int target = 9;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr) {
			int complement = target - num;
			if (map.containsKey(complement)) {
				System.out.println(complement + "  " + num);
				break;
			}
			map.put(num, 1);
		}
	}
}
