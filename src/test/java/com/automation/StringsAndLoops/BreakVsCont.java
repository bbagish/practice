package com.automation.StringsAndLoops;

public class BreakVsCont {
	public static void main(String[] args) {
		

	int num=0;
	 
	while(num++ < 20){
	 
	if(num>5 && num < 10){
		continue;
	}else if(num > 15){
		break;
	}else if (num==13){
		System.exit(0);
	}
	System.out.println(num);	
	 

	}
	 
	System.out.println("after loop"+num);
	

}
}