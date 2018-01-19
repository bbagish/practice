package com.automation.StringsAndLoops;
public class A{
	public static String trunk(String str) {
		if(str.length() <=2) {
			return str.replaceAll("A", " ");
		}
		String first2chars=str.substring(0, 2);
		String minus2chars=str.substring(2);
		return first2chars.replace("A", "")+minus2chars;
		
	}
	public static void main(String[] args) {
		String s = " I live in India";
		String[] split = s.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
		  System.out.print(split[i] + " ");
		}
		
	}
	}

