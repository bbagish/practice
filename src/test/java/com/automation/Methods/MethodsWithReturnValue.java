package com.automation.Methods;


public class MethodsWithReturnValue {
	
	public int add(int n1, int n2){
		int sum=n1+n2;
		return sum;
		
	}
	public String generateEmail(String name, String domain){
		String email=name+"@"+domain+".com";
		return email;
	}
}
