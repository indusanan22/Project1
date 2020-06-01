package com.hackeerrank.HashTable;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {

		String[] magazine = { "give", "one", "one", "grand", "today", "night" };
		String[] note = { "give", "One", "grand", "today" };
		checkMagazine(magazine, note);
	}

	static void checkMagazine(String[] magazine, String[] note) {
		HashMap<String, Integer> mag = new HashMap<>();
		for (int i = 0; i < magazine.length; i++) {
			String currentWord = magazine[i];
			if (mag.containsKey(currentWord)) {
				int count = mag.get(currentWord);
				count++;
				mag.put(currentWord, count);
			} else {
				mag.put(currentWord, 1);
			}
		}

		for (String i : note) {
			if (mag.containsKey(i)) {
				int count = mag.get(i);
				if (count > 0) {
					count--;
					mag.put(i, count);
				} else {
					System.out.println("No");
					return;
				}
			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		return;
	}
}
