package com.hackeerrank;

import java.util.ArrayList;
import java.util.List;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51 };
		int[] ar = rotLeft(arr, 10);

		for (int i : ar) {
			System.out.print(i + " ");
		}
	}

	static int[] rotLeft(int[] a, int d) {
		int length = a.length;
		int rotatedArray[] = new int[length];
		if (length == d) {
			rotatedArray = a.clone();
		} else {
			int s = 0;
			for (int start = d; start < length; start++) {
				rotatedArray[s] = a[start];
				s++;
			}
			for (int j = 0; j < d; j++) {
				rotatedArray[s] = a[j];
				s++;
			}
		}
		return rotatedArray;
	}
}
