package com.hackeerrank;

public class NewYearChaos_MySolution_Wrong {

	public static void main(String[] args) {
		int[] q = { 1, 3, 5, 2, 4, 6, 7 };
		System.out.println(minimumBribes(q));
	}

	static int minimumBribes(int[] arr) {
		int length = arr.length;
		int count = 0;
		for (int i = 0; i < length; i++) {
			while (arr[i] != i + 1) {
				count++;
				int temp = arr[i];
				arr[i]= arr[temp - 1];
				arr[temp - 1] = temp;
			}
		}
		return count;
	}

}
