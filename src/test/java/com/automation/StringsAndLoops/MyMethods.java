package com.automation.StringsAndLoops;


public class MyMethods {


	public void print(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	public void email(String name, String domain){
		System.out.println(name+"@"+domain+".com");
	}
	public void add(int n1, int n2, int n3){
		int sum=n1+n2+n3;
		System.out.println(sum);
	}
	public void printUntill(int n){
		if(n<=0){
			System.out.println("Enter positive number");
		}else{
		for (int i=0; i<=n; i++)
			System.out.println(i);
	}
	}
	public void printRange(int start, int end){
		if (end<start){
			System.out.println("Enter correct value");
		}else{
		for (int num=start; num<=end; num++){
			System.out.println(num);
		}
	}
	}
	public void printChars(String str, int num){
		if(num<=0){
			System.out.println("Enter positive number");
		}else{
		for (int i =0; i<=num; i++){
			System.out.print(str+", ");
		}
		}
	}
}
