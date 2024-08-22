package com.occurance.digit;

import java.util.HashMap;

public class Occurance {
	public static int countOccurrences(long n, int d) {
		// Initialize hash map with keys 0 to 9 and values 0
		HashMap<Integer, Integer> digitCounts = new HashMap<>();
		for (int i = 0; i <= 9; i++) {
			digitCounts.put(i, 0);
		}
		
		// Convert number to string and loop through its digits
		String numString = Long.toString(n);
		for (int i = 0; i < numString.length(); i++) {
			int digit = Character.getNumericValue(numString.charAt(i));
			digitCounts.put(digit, digitCounts.get(digit) + 1);
		}
		
		// Return count for the digit we are interested in
		return digitCounts.get(d);
	}

	public static void main(String[] args) {
		int d = 2;
		long n = 214215421;

		System.out.println(countOccurrences(n, d));
	}
}

