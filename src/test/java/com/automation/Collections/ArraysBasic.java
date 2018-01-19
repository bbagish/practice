package com.automation.Collections;

public class ArraysBasic {
	public static void main(String[] args) {
		String[] days = new String[8];
		days[0] = "Mon";
		days[1] = "Tue";
		days[2] = "Wed";
		days[3] = "Thu";
		days[4] = "Fri";
		days[5] = "Sat";
		days[6] = "Sun";
		days[7] = "Funday";
		System.out.println("Today is " + days[6]);
		String tomorrow = days[0];
		System.out.println("Tomorrow is " + tomorrow);
		if (days[4] == "Fri") {
			System.out.println("It it Friday");
		} else {
			System.out.println("It is not Friday");
			System.out.println("It is " + days[4]);
		}
		String yesterday = days[5];
		System.out.println("Yesterday was " + yesterday);

		System.out.println(days[7]);

	}
}
