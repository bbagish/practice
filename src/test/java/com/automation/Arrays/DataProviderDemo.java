package com.automation.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="EmployeesInfo")
	public void dataProviderTest(String name, String email) {
		System.out.println("Name: "+name +", Email: "+email);
	}

	@DataProvider(name="EmployeesInfo")
	public Object[][] EmployeeData() {
		Object[][] employees = new Object[2][2];
		String name = "Mike";
		employees[0][0] = name;
		employees[0][1] = "mike@gmail.com";
		employees[1][0] = "Stevene";
		employees[1][1] = "steven@gmail.com";
		return employees;
	}
}
