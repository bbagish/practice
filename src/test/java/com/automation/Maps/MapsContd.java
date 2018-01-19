package com.automation.Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapsContd {
	public static void main(String[] args) {

		Map<Integer, String> ZipCodes = new TreeMap<>();
		ZipCodes.put(11234, "Brooklyn, NY");
		ZipCodes.put(22102, "Tyson, VA");
		ZipCodes.put(18411, "Clarks Summit, PA");
		if (ZipCodes.containsKey(22102))
			System.out.println(ZipCodes.get(22102));
		else
			System.out.println("22102 is not included");
		if (ZipCodes.containsKey(22103))
			System.out.println(ZipCodes.get(22102));
		else
			System.out.println("22102 is not included");
		if (!ZipCodes.containsKey(22182)) {
			ZipCodes.put(22182, "Vienna, VA");
		}
		if (ZipCodes.containsValue("Brooklyn, NY")) {
			System.out.println("Brooklyn, Ny is here ");
		} else {
			System.out.println("Brooklyn is not here");
		}
		for (int zipcode : ZipCodes.keySet()) {
			System.out.println(zipcode);
		}
		for (String cityState : ZipCodes.values()) {
			System.out.println(cityState);
		}
	}

}
