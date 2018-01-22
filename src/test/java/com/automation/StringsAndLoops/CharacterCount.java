package com.automation.StringsAndLoops;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {

		String str = "Belek";

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string to char array
		char[] strArray = str.toCharArray();

		// checking each char of strArray

		for (char character : strArray) {
			if (charCountMap.containsKey(character)) {
				// If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(character, charCountMap.get(character) + 1);
			} else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(character, 1);
			}
		}
		// Printing the charCountMap
		System.out.println(charCountMap);
	}
}
