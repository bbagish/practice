package com.automation.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {
public static void main(String[] args) {
	File file=new File("test.txt");
	
	//write name and age to the file
	
	PrintWriter output=null;
	try {
	output =new PrintWriter(file);
	output.println("Belek Bagishbekov");
	output.println(42);
	}catch(Exception e) {
	e.printStackTrace();
	System.out.printf("Error" +e.getMessage());
	}finally {
		output.close();
	}
	
	//reads from the file
	
	try {
	Scanner input =new Scanner(file);
	String name=input.nextLine();
	int age=input.nextInt();
	System.out.println("Name is "+name + " age is "+age);
	}catch(FileNotFoundException e) {
		System.out.println("Please correct the location of file");
	}
}
}
