package com.automation.StringsAndLoops;
import java.util.List;
import java.util.Scanner;


public class Reverso {
	public static void main(String[] args) {
	String str="Belek";
	StringBuilder strRev= new StringBuilder(str);
	System.out.println("First method "+strRev.reverse());
	String rev="";
	for(int i=str.length()-1; i>=0; i--) {
		rev+=str.charAt(i);
	}
	System.out.println(rev);
	}
}