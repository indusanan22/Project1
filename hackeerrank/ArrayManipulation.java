package com.hackeerrank;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[][] queries = { { 1, 2, 100 }, { 2, 5, 100 }, { 3, 4, 100 } };
		System.out.println(arrayManipulation(n, queries));
	}

	static long arrayManipulation(int n, int[][] queries) {
		long[] arr = new long[n + 2];
		long length = queries.length;
		for (int i = 0; i < length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			int increment = queries[i][2];

			arr[start] += increment;
			arr[end + 1] -= increment;
		}
		return getMax(arr);
	}

	static long getMax(long[] arr) {
		long max = Long.MIN_VALUE;
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			max = Math.max(sum, max);
		}
		return max;
	}

}
