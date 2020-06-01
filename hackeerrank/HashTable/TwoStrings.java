package com.hackeerrank.HashTable;

import java.util.HashSet;

public class TwoStrings {

	public static void main(String[] args) {
		System.out.println(twoStrings("a", "cat"));

	}

	static String twoStrings(String s1, String s2) {

		HashSet<Character> s1Set = new HashSet<>();
		HashSet<Character> s2Set = new HashSet<>();

		for (int i = 0; i < s1.length(); i++) {
			s1Set.add(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			s2Set.add(s2.charAt(i));
		}

		s1Set.retainAll(s2Set);

		if (!s1Set.isEmpty()) {
			return "YES";
		}
		return "NO";
	}
}
