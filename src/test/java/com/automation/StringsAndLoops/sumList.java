package com.automation.StringsAndLoops;
import java.util.ArrayList;
import java.util.List;

public class sumList {
	public static void main(String[] args) {
		List<Integer>nums=new ArrayList();
		nums.add(50);
		nums.add(24);
		nums.add(323);
		
		sum(nums);
	}
	public static void sum(List<Integer> list) {
		int sum=0;
		for(Integer var : list) {
			sum+=var;
		}
		System.out.println(sum);
	}
}

