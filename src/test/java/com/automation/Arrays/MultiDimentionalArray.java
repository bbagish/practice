package com.automation.Arrays;

import org.testng.annotations.Test;

public class MultiDimentionalArray {
  @Test
  public void AnimalsArray() {
	  String [] [] animals=new String[4][2];
	  
	  animals[0][0]="Cat"; animals[0][1]="Myaw";
	  animals[1][0]="Dog"; animals[1][1]="Woof";
	  animals [2][0]="Cow";animals[2][1]="Moo";
	  animals[3][0]="Sheep";animals[3][1]="Baa";
	  
	  System.out.println("Neighbor's " +animals[1][0]+" is saying"+animals[1][1] );
	  System.out.println(animals[0][0]+"s do not "+animals[3][1]);
	  for (int i=0; i<animals.length; i++) {
		  System.out.println(animals[i][0]+ " is "+animals[i][1]+"ing");
	
	  }
  }
  @Test
  public void objectArray() {
	  Object [][] employees=new Object[2][2];
	  String name ="Mike";
	  employees[0][0]=name;
	  employees[0][1]="mike@gmail.com";
	  employees[1][0]="Stevene";
	  employees[1][1]="steven@gmail.com";

	  System.out.println(employees[1][1]);
	  System.out.println("last one "+employees[employees.length-1][employees[employees.length-1].length-1]);
	  int rows=employees.length;
	  int cellsInLast=employees[rows-1].length;
	  System.out.println(employees[rows-1][cellsInLast-1]);
	  
	  for (Object[] obj  : employees) {
		  System.out.println("For each loop "+obj[1]);
	  }
	  printEmpInfo(employees);
  }
  
  public void printEmpInfo(Object[][] multiArray) {
	  for(int i=0; i<multiArray.length; i++) {
		  String name=(String) multiArray[i][0];
		  String email=(String) multiArray[i][1];
		 // System.out.println(multiArray[i][0]+ "," +multiArray[i][1]);
		  print2Strings(name, email);
	  }
	 
  }
  public void print2Strings(String str1, String str2) {
	  System.out.println("Print2 method " +str1 + " , " +str2);
  }
}
