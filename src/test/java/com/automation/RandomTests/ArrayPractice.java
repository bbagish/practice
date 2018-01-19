package com.automation.RandomTests;

public class ArrayPractice {
public static void main(String[] args) {
	int[] numArr= {1,2,3,456};
	int[] numArr1= new int[3];
	numArr1[0]=1;
	numArr1[1]=2;
	numArr1[2]=3;
	for(int callWhatever:numArr){
	System.out.println(callWhatever);
	}
	int index=0;
	while(numArr.length>index){
		System.out.println("Current value of index: "+index);
		System.out.println("Value of array item number: "+numArr[index]);
		index++;
	}
	
	String[] studentsName={"Bob", "Mike", "Chase", "David", "John"};
	for(String callWhatever:studentsName){
		System.out.println("Current student name: "+callWhatever);
		System.out.println("Length of \"student name\": "+callWhatever.length());
		
		}
}
}
