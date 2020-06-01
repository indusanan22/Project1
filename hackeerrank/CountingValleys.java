package com.hackeerrank;

import java.util.Stack;

public class CountingValleys {

	public static void main(String args[]) {
		String s = "DUDU";
		System.out.println(countingValleys(4, s));
	}

	static int countingValleys(int n, String s) {
		int lvl = 0;
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == 'U') {
				lvl++;
			} else
				lvl--;

			if (lvl == 0 && c == 'U') {
				count++;
			}
		}
		return count;
	}
}
