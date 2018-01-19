package com.automation.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsCompare {
	public static void main(String[] args) {

		Map<String, String> employee = new HashMap<>();
		employee.put("EmpID", "Emp123");
		employee.put("Name", "John Smith");
		employee.put("JobTitle", "SDET");
		employee.put("Salary", "$105000");
		Map<String, String> employee2 = new HashMap<>();
		employee2.put("EmpID", "Emp165");
		employee2.put("Name", "Adam Smith");
		employee2.put("JobTitle", "Developer");
		employee2.put("Salary", "$125000");
		System.out.println(employee2.get("JobTitle"));
		if (employee.get("JobTitle").equals(employee2.get("JobTitle"))) {
			System.out.println("Both employees has the same job title");
		} else {
			System.out.println(employee.get("Name") + " is a " + employee.get("JobTitle"));
			System.out.println(employee2.get("Name") + " is a " + employee2.get("JobTitle"));
		}
		String emp1SalaryStr = employee.get("Salary");
		String emp2SalaryStr = employee2.get("Salary");
		emp1SalaryStr = emp1SalaryStr.substring(1);
		emp2SalaryStr = emp2SalaryStr.substring(1);
		System.out.println("Emp1 " + emp1SalaryStr);
		System.out.println("Emp2 " + emp2SalaryStr);
		int emp1Salary = Integer.parseInt(emp1SalaryStr);
		int emp2Salary = Integer.parseInt(emp2SalaryStr);
		int sal1 = Integer.parseInt(employee.get("Salary").substring(1));
		int sal2 = Integer.parseInt(employee2.get("Salary").substring(1));
		if (emp1Salary > emp2Salary) {
			System.out.println(employee.get("Name") + " earns more");

		} else if (emp1Salary < emp2Salary) {
			System.out.println(employee2.get("Name") + " earns more");
		} else {
			System.out.println("Both employees earns same");
		}
	}
}
