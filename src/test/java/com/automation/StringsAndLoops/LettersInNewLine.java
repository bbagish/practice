package com.automation.StringsAndLoops;
import java.util.Scanner;

public class LettersInNewLine {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Enter a word");
	String word=input.next();
	
	int length=word.length();
	
	//System.out.println(length);
	//System.out.println(word.charAt(0));
	
	for (int index=0; index<length; index++){
	System.out.println(word.charAt(index));
	}
	input.close();
}
}
