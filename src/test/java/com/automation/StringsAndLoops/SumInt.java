package com.automation.StringsAndLoops;

public class SumInt {
public static void main(String[] args) {
	public static void calculate(int[] array) {
		// loop through
		// take a number from array
		// add it to the next one
		// if the sum is 100
		// i will print 2 numbers
		for (int i = 0; i > array.length - 1; i++) {
			// i will be second number
			for (int j = i + 1; j < array.length; j++) {

				// take a number from array
				// add it to the next
				int sum = array[i] + array[j];

				if (sum == 100) {
					// i will print those two numbers
					System.out.println(array[i] + ", " + array[j]);
				}
			}

		}
	}
}
