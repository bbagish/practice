package com.automation.RandomTests;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTest {
	WebDriver driver = new ChromeDriver();

	@Before
	public void setUP() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");

	}

	public void login(String username, String password) {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Test
	public void test1() {
		login("testusertwo@ipdeer.com", "password");
		driver.findElement(By.cssSelector("img[class='logo img-responsive']")).click();
		List<WebElement> products = driver.findElements(By.cssSelector("a[class='product-name']"));
		WebElement product = products.get(1);
		product.click();
		WebElement quantity = driver.findElement(By.id("quantity_wanted"));
		quantity.clear();
		quantity.sendKeys("2");
		WebElement dropdown = driver.findElement(By.id("group_1"));
		Select drop = new Select(dropdown);
		drop.selectByIndex(2);
		WebElement item = driver.findElement(By.cssSelector("h1[itemprop='name']"));
		List<String> list = new ArrayList<String>();
		list.add(item.getText());

		String item1 = item.getText();
		System.out.println(item1);
		driver.findElement(By.name("Submit")).click();
		WebElement submit = driver.findElement(By.cssSelector("a[class='btn btn-default button button-medium']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(submit));
		submit.click();
		WebElement el = driver.findElement(By.linkText("Blouse"));

		assertEquals(el.getText(), list.get(0));
		System.out.println("succesful assertion");
		assertEquals(driver.findElement(By.name("quantity_2_11_0_20637")).getAttribute("value"), "2");
		assertEquals(driver.findElement(By.id("total_price")).getText(), "$58.24");
		assertions("address_name");
		assertions("address_address1");
	
		
		assertions("address_phone_mobile");
		
		driver.findElement(By.cssSelector("a[class='account']")).click();
		driver.findElement(By.className("icon-building")).click();
	}

	public void assertions(String str) {
			
		try {
				List<WebElement> name = driver.findElements(By.cssSelector("span[class='" + str + "']"));
				assertEquals(name.get(0).getText(), name.get(1).getText());
				System.out.println("assertion passed");
				List<String> strings = new ArrayList<String>();
				for(WebElement e : name){
				    strings.add(e.getText());
				}
				} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Assertion of element failed due to " + e.getMessage());
	
	}
}
}
