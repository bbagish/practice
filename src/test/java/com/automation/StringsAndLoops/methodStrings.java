package com.automation.StringsAndLoops;
import java.util.ArrayList;
import java.util.List;

public class methodStrings {
	public static void main(String[] args) {
		List<String> str2=new ArrayList<>();
		str2.add("Banan");
		str2.add("Potato");
		str2.add("what the fuck");
	accept(str2);
		
	}

	public static void accept(List<String> str) {
		  int largestString = str.get(0).length();
	        int index = 0;

	        for(int i = 0; i < str.size(); i++)
	        {
	            if(str.get(i).length() > largestString)
	            {
	                largestString = str.get(i).length();
	                                index = i;
	            }
	        }
	        System.out.println("Index " + index + " "+ str.get(index) + " " + "is the largest and is size " + largestString);  

	    }
}
