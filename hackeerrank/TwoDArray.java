package com.hackeerrank;

import java.util.ArrayList;
import java.util.List;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6, 7 } };

	}

	static int hourglassSum(int[][] arr) {
		int rows = arr.length;
		int columns = arr[0].length;

		int minHourGlassSum = -63;
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= columns - 1; j++) {
				int min = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];

				if (min < minHourGlassSum) {
					minHourGlassSum = min;
				}
			}
		}
		return minHourGlassSum;
	}
}
