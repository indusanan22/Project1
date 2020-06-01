package com.hackeerrank;

public class NewYearChaos {

	public static void main(String[] args) {
		int[] q = { 2, 1, 5, 3, 4 };
		minimumBribes(q);
	}

	static void minimumBribes(int[] q) {
		int l = q.length;
		int count = 0;
		for (int i = l - 1; i >= 1; i--) {
			if (q[i] != i + 1) {
				if (q[i - 1] == i + 1) {
					count++;
					swap(q, i, i - 1);
				} else if (q[i - 2] == i + 1) {
					count += 2;
					swap(q, i - 2, i - 1);
					swap(q, i - 1, i);
				} else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		System.out.println(count);
	}

	static void swap(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
}
