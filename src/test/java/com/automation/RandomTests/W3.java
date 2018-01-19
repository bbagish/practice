package com.automation.RandomTests;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3 {
WebDriver driver=new ChromeDriver();
//	go to  https://www.w3schools.com/
//		Find the number of elements in the page with the tag a
//		for each of those elements, if it is displayed on the page, print the text and the url of that element.
@Test
public void test() {
	driver.get("https://www.w3schools.com/");
	List<WebElement> list=driver.findElements(By.tagName("a"));
	for(WebElement lists : list) {
		System.out.println(lists.getText()+" "+lists.getAttribute("href"));
	}
}
@After
public void tearDown() {
	driver.quit();
}

}
