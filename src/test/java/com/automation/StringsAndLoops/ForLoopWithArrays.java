package com.automation.StringsAndLoops;

public class ForLoopWithArrays {
	public static void main(String[] args) {
		String[] letters = { "a", "b", "c", "d", "e" };
		int index = 0;
		System.out.println(letters[index]);
		index++;
		System.out.println(letters[index]);
		index++;
		System.out.println(letters[index]);
		// code below is better way to do it
		for (int index2 = 0; index2 < letters.length; index2++) {

			System.out.println(letters[index2]);

		}
		System.out.println("=================");
		for (int i = 0; i < letters.length; i = i + 2) {
			System.out.println(letters[i]);

		}

		System.out.println("=================");
		System.out.println("For loop backwards ");
		// For loop backwards
		for (int idx = letters.length - 1; idx >= 0; idx--) {

			System.out.print(letters[idx] + ", ");
		}
	}
}
