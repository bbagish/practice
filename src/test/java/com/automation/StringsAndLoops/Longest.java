package com.automation.StringsAndLoops;
import java.util.ArrayList;
import java.util.List;

public class Longest {
	public static void main(String[] args) {

	}

	public static String longest(List<String> names) {
		List<String> unique = new ArrayList<>();
		for (String name : names) {
			String tracker = "";
			int counter = 0;
			for (int i = 0; i < name.length(); i++) {
				if (!tracker.contains(name.charAt(i) + "")) {
					tracker += name.charAt(i);
				} else {
					counter++;
					break;
				}
			}
			if (counter == 0) {
				unique.add(name);
			}
		}
		if (unique.size() == 0) {
			return null;
		} else if (unique.size() == 1) {
			return unique.get(0);
		}
		String longest = unique.get(0);
		for (String name : unique) {
			if (name.length() > longest.length()) {
				longest = name;
			}
		}
		return longest;
	}
}
