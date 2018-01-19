package com.automation.StringsAndLoops;
import java.util.Scanner;

public class printlettersexept {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a word to print");
		String word=input.nextLine();
		
		for (int i=0; i<word.length(); i++){
			if (word.charAt(i)=='a'){
				continue;//continue to next iteration and do not run code below that's why we have to break this code
				
			}
		System.out.println(word.charAt(i));
		}
		for (int i=0; i<10; i++){
			System.out.println("before continue statement");
			if (i>5){
				break;
				
			}
			System.out.println("hello");
			System.out.println(i);
		}
		input.close();
	}
}
