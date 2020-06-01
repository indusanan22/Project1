package com.hackeerrank;

public class JumpingClouds {

	static int minjumps(int[] c) {
		int pos = 0;
		int counter = 0;
		while (pos < c.length && (pos + 2) < c.length) {
			if (c[pos + 2] != 0) {
				pos += 1;
				counter++;
			} else {
				pos += 2;
				counter++;
			}
		}
		if ((pos + 2) <= c.length) {
			counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		int[] ar = { 0, 0, 1, 0, 0, 1, 0 };
		System.out.println(minjumps(ar));
	}

}
