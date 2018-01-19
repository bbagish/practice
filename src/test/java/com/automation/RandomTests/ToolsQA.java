package com.automation.RandomTests;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQA {
	WebDriver driver;
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/billionaire/Documents/Library/selenium-java-3.6.0/chromedriver");
		driver=new ChromeDriver();
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> list=driver.findElements(By.cssSelector("input[name='sex']"));
		for(int i=0; i <=list.size()-1; i++) {
		//	System.out.println(list.get(i).getAttribute("value"));
		}
		list.get(0).click();
		List<WebElement> list2=driver.findElements(By.cssSelector("input[name='exp']"));
		for(int i=0; i <=list.size()-1; i++) {
		//	System.out.println(list.get(i).getAttribute("value"));
		}
		list2.get(5).click();

	}
}
