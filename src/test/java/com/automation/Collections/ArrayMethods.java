package com.automation.Collections;

public class ArrayMethods {
	public static void main(String[] args) {
		String[] words = { "All", "WE", "You", "Good", "Hi", "Books", "Internet", "C#", "W++" };
		printArray(words);
	}

	public static void printArray(String[] args) {
		for (String elem : args) {
			System.out.print(elem + ", ");
		}
		System.out.println();
	}

	public static void printArray(int[] args) {
		for (int elem : args) {
			System.out.print(elem + ", ");
		}
		System.out.println();
	}

}
