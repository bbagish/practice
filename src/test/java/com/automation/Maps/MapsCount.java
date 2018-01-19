package com.automation.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsCount {
	public static void main(String[] args) {
		Map<String, Integer> employeeSalaries = new HashMap<>();
		employeeSalaries.put("Ruslan", 100000);
		employeeSalaries.put("Ali", 115000);
		employeeSalaries.put("Wassim", 101000);
		employeeSalaries.put("Nigorahon", 108234);
		int numberOfPaidEmployees = employeeSalaries.size();
		System.out.println("Number of Paid Employees: " + numberOfPaidEmployees);
		List<String> volunteers = new ArrayList<>();
		volunteers.add("Yasin");
		volunteers.add("Zafer");
		int volunteersCount = volunteers.size();
		System.out.println("Number of volunteers: " + volunteers.size());
		int WassimsSalary = (int) (employeeSalaries.get("Wassim") + employeeSalaries.get("Wassim") * 0.1);
		System.out.println(WassimsSalary);
		employeeSalaries.replace("Wassim", WassimsSalary);
		System.out.println("Wassim's new Salary: " + employeeSalaries.get("Wassim"));

	}
}
