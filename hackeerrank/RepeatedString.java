package com.hackeerrank;

public class RepeatedString {

	static long repeatCount(String s, long n) {
		int stringLength = s.length();
		int aCount = 0;
		int rCount = 0;

		for (int i = 0; i < stringLength; i++) {
			if (s.charAt(i) == 'a') {
				aCount++;
			}
		}
		int remainder = (int) (n % stringLength);

		for (int j = 0; j < remainder; j++) {
			if (s.charAt(j) == 'a') {
				rCount++;
			}
		}
		return (((n / stringLength) * aCount) + rCount);

	}

	public static void main(String[] args) {
		String a = "aba";
		long n = 10L;
		System.out.println(repeatCount(a, n));
	}

}
