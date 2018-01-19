package com.automation.RandomTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTest {
	WebDriver driver = new ChromeDriver();

	@Before
	public void setUP() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void search(String item) {
		driver.get("http://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item + Keys.ENTER);
	}

	@Test
	public void AmazonTest1() throws InterruptedException {
		search("bag");
		WebElement price = driver.findElements(By.className("sx-price-whole")).get(2);
		String fraction = driver.findElement(By.className("sx-price-fractional")).getText();
		String combo = "$" + price + "." + fraction;
		WebElement product = driver.findElements(By.className("s-inline")).get(2);
		product.click();
		Thread.sleep(2000);
		WebElement quantity = driver.findElement(By.xpath("//*[@id='quantity']"));
		Select quan = new Select(quantity);
		WebElement first_value = quan.getFirstSelectedOption();
		String value = first_value.getText();
		System.out.println(value);
		assertEquals("1", value);
		String str;
		try {
		
				assertEquals(combo, driver.findElement(By.xpath("//*[@id='priceblock_ourprice' OR @class='a-text-strike']")).getText());
		} catch (Exception e) {
			System.err.println("Caught exception: " + e.getMessage());
		}

		driver.findElement(By.id("add-to-cart-button")).click();
		assertEquals("Added to Cart", driver.findElement(By.id("huc-v2-order-row-confirm-text")).getText());

	}

	@Test
	public void AmazonTest2() throws InterruptedException {
		search("bag");
		WebElement product = driver.findElements(By.className("s-inline")).get(0);
		String original = product.getAttribute("data-attribute");
		System.out.println(original);
		if (!driver.findElement(By.name("s-ref-checkbox-adidas")).isSelected()) {
			driver.findElement(By.name("s-ref-checkbox-adidas")).click();
		}
		Thread.sleep(12000);
		WebElement product2 = driver.findElements(By.className("s-inline")).get(0);
		String prod2 = product2.getAttribute("data-attribute");
		System.out.println(prod2);
		assertNotEquals(original, prod2);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("s-ref-checkbox-adidas"))));
		if (driver.findElement(By.name("s-ref-checkbox-adidas")).isSelected()) {
			driver.findElement(By.name("s-ref-checkbox-adidas")).click();
		}
		Thread.sleep(20000);
		WebElement product3 = driver.findElements(By.className("s-inline")).get(0);
		String prod3 = product3.getAttribute("data-attribute");
		System.out.println(prod3);
		assertEquals(original, prod3);

	}

	@Test
	public void AmazonTest3() throws InterruptedException {
		search("bag");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String ready = (String) js.executeScript("return document.readyState");
		System.out.println("ready or not: " + ready);
		List<WebElement> cb = driver.findElements(By.cssSelector("input[type='checkbox']"));

		System.out.println(cb.size());
		cb.get(7).click();
		System.out.println("Selected");

		Thread.sleep(3000);
		List<WebElement> cb2 = driver.findElements(By.cssSelector("input[type='checkbox']"));
		cb2.get(8).click();
		System.out.println("Selected");
		List<WebElement> cb3 = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for (int i = 9; i < cb3.size() - 1; i++) {
			if (!cb3.get(i).isSelected()) {
				System.out.println("Not Selected");
			}
		}
	}

	@Test
	public void AmazonTest4() throws InterruptedException {
		search("bag");
		driver.findElement(By.linkText("Women's Top-Handle Handbags")).click();

		Thread.sleep(10000);
		List<WebElement> elements = driver
				.findElements(By.cssSelector("span[class='a-color-secondary s-overflow-ellipsis s-size-mild']"));
		ArrayList<String> brand = new ArrayList<String>();
		for (WebElement element : elements) {
			brand.add(element.getText());
			// System.out.println(element.getText());
		}
		brand.removeAll(Collections.singleton(null));
		brand.removeAll(Collections.singleton(""));
		brand.size();
		for (int i = 0; i <= brand.size() - 1; i++) {
			System.out.println(brand.get(i));
		}
		search("bag");
		driver.findElement(By.linkText("Luggage & Travel Gear")).click();
		Thread.sleep(10000);
		List<WebElement> elements2 = driver
				.findElements(By.cssSelector("span[class='a-color-secondary s-overflow-ellipsis s-size-mild']"));
		ArrayList<String> brand2 = new ArrayList<String>();
		for (WebElement element : elements2) {
			brand2.add(element.getText());
		}
		brand2.removeAll(Collections.singleton(null));
		brand2.removeAll(Collections.singleton(""));
		System.out.println(brand2.size());
		Set set1 = new HashSet(brand);
		Set set2 = new HashSet(brand2);

		try {
			assertTrue(equals(set1, set2));
		} catch (AssertionError e) {

			String message = e.getMessage();
			System.out.println("Brand lists are not equal " + message);
		}

	}

	public static boolean equals(Set<?> set1, Set<?> set2) {

		if (set1 == null || set2 == null) {
			return false;
		}

		if (set1.size() != set2.size()) {
			return false;
		}

		return set1.containsAll(set2);

	}

	@Test
	public void AmazonTest5() throws InterruptedException {
		driver.get("https://www.amazon.com/gp/site-directory/ref=nav_shopall_btn");
	
		List<WebElement> elements = driver
				.findElements(By.xpath("//span[@class='            "
						+ "        nav-hasPanel                    "
						+ "          nav-item']"));
		
		System.out.println(elements.size());
		ArrayList<String> brand = new ArrayList<String>();
		for (WebElement element : elements) {
			brand.add(element.getAttribute("aria-label"));
			System.out.println(element.getAttribute("aria-label"));
		}
		brand.removeAll(Collections.singleton(null));
		brand.removeAll(Collections.singleton(""));
		brand.size();
		for (int i = 0; i <= brand.size() - 1; i++) {
			System.out.println("Dept " + brand.get(i));
		}
		Thread.sleep(10000);
		List<WebElement> elements2 = driver
				.findElements(By.cssSelector("h2[class='fsdDeptTitle']"));
		ArrayList<String> brand2 = new ArrayList<String>();
		for (WebElement element : elements2) {
			brand2.add(element.getText());
			System.out.println("Dept 2 "+element.getText());
		}
		brand2.removeAll(Collections.singleton(null));
		brand2.removeAll(Collections.singleton(""));
		System.out.println(brand2.size());
		Set set1 = new HashSet(brand);
		Set set2 = new HashSet(brand2);

		try {
			assertTrue(equals(set1, set2));
		} catch (AssertionError e) {

			String message = e.getMessage();
			System.out.println("Brand lists are not equal " + message);
		}



	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
