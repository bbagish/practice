package com.automation.DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoSiteDDT {
	static WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void openDemoSite() {
		driver.get("http://thedemosite.co.uk/addauser.php");
	}

	@Test(dataProvider = "Credentials")
	public void demoSiteCoUkDDT(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("FormsButton2")).click();

	}

	@DataProvider(name="Credentials")
	  public Object[][] generateCredentials(){
		  Object[][] employees=new Object[4][2];
		  employees[0][0]=new String("Mike");
		  employees[0][1]="mike@gmail.com";
	  
		  employees[1][0]="Steven";
		  employees[1][1]="steven@gmail.com";
		  
		  employees[2][0]="Sarah";
		  employees[2][1]="sarah@gmail.com";
		  
		  employees[3][0]="Kevin";
		  employees[3][1]="kevin@gmail.com";
		  
		  return employees;
	  }

}
