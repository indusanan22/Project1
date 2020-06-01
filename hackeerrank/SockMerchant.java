package com.hackeerrank;

import java.util.HashMap;
import java.util.HashSet;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		sockMerchant(9, arr);
	}

	static int sockMerchant(int n, int[] ar) {
		HashSet<Integer> hs = new HashSet<>();
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (hs.contains(ar[i])) {
				hs.remove(ar[i]);
				count++;
			} else {
				hs.add(ar[i]);
			}

			for (int l : hs) {
				System.out.println(l);
			}
		}
		return count;
	}
}