package com.automation.Maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMaps {
	public static void main(String[] args) {
		Map<String, Integer> shopping = new HashMap<>();
		shopping.put("Tomatos", 5);
		shopping.put("Cucumber", 5);
		shopping.put("Milk", 1);
		shopping.put("Fresh Salmon", 7);
		shopping.put("Bananas", 10);
		System.out.println("Time for shopping. Arrived at Harris Teeter.");
		System.out.println("How many tomatos " + shopping.get("Tomatos"));
		shopping.remove("Tomatos");
		int salmonAmount = shopping.get("Fresh Salmon");
		System.out.println("How much Salmon? - " + salmonAmount);
		shopping.remove("Fresh Salmon");
		shopping.put("Bread", 3);
		System.out.println("How much bread do we have? " + shopping.get("Bread"));
		int breadAmount = shopping.get("Bread");
		System.out.println("We have "+breadAmount+ " breads.");

	}
}
