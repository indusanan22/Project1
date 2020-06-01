package com.hackeerrank.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long r = 3;
		List<Long> arr = new ArrayList<>();
		arr.add(1L);
		arr.add(3L);
		arr.add(9L);
		arr.add(9L);
		arr.add(27L);
		arr.add(81L);
		System.out.println(countTriplets(arr, r));
	}

	static long countTriplets(List<Long> arr, long r) {
		HashMap<Long, Integer> hm = new HashMap<>();
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			long key = arr.get(i);
			int count = 0;
			if (hm.containsKey(key)) {
				count = hm.get(key);
				count++;
				hm.put(arr.get(i), count);
			} else {
				count++;
				hm.put(arr.get(i), count);
			}

		}
		for (long l : hm.keySet()) {
			long pre = l / r;
			long prepre = (long) (l / Math.pow(r, 2));
			long nex = l * r;
			long nexnex = (long) (l * Math.pow(r, 2));

			if (hm.containsKey(pre) && hm.containsKey(prepre)) {
				sum += hm.get(pre) * hm.get(l) * hm.get(prepre);
			} else if (hm.containsKey(nex) && hm.containsKey(nexnex)) {
				sum += hm.get(l) * hm.get(nex) * hm.get(nexnex);
			} else if (hm.containsKey(pre) && hm.containsKey(nex)) {
				sum += hm.get(l) * hm.get(pre) * hm.get(nex);
			}
		}
		return sum;
	}
}
