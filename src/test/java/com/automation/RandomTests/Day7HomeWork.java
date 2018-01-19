package com.automation.RandomTests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7HomeWork {
	WebDriver driver = new ChromeDriver();

	// @Test
	public void test() {
		driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
		driver.findElement(By.cssSelector("span[class='ui-button-text ui-c']")).click();
		driver.findElement(By.cssSelector("span[class='ui-button-icon-left ui-icon ui-c ui-icon-close']")).click();

	}

	// @Test
	public void test2() {
		driver.get("http://t4t5.github.io/sweetalert/");
		driver.findElement(By.cssSelector("button[class='preview']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		String alert = simpleAlert.getText();
		assertEquals("Oops, something went wrong!", alert);
		simpleAlert.accept();
		WebElement web = driver.findElements(By.cssSelector("button[class='preview']")).get(1);
		web.click();
		driver.findElement(By.cssSelector("button[class='swal-button swal-button--confirm']")).click();

	}

	// @Test
	public void test3() {
		driver.get("http://seleniumframework.com/demo-sites");
		driver.findElement(By.linkText("http://www.seleniumframework.com/Practiceform/")).click();
		String original = driver.getTitle();
		System.out.println(original);
		String target = "Selenium Framework | Practiceform";
		for (String windowHandle : driver.getWindowHandles()) {

			driver.switchTo().window(windowHandle);

			if (driver.getTitle().equals(target)) {

				break;

			}

		}

		String url = driver.getCurrentUrl();
		assertEquals("http://www.seleniumframework.com/Practiceform/", url);
		driver.findElement(By.id("button1")).click();
		String target2 = "Selenium Framework | Selenium, Cucumber, Ruby,\n" + "	// Java et al.";
		for (String windowHandle : driver.getWindowHandles()) {

			driver.switchTo().window(windowHandle);

			if (driver.getTitle().equals(target2)) {

				break;

			}

		}
		assertEquals("http://www.seleniumframework.com/", driver.getCurrentUrl());

	}

	@Test
	public void test4() {
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		
		int size = driver.findElements(By.tagName("frame")).size();
		System.out.println(size);
		System.out.println(driver.findElement(By.xpath("/html")).getText());
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("/html")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("/html")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("/html")).getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(2);
		System.out.println(driver.findElement(By.xpath("/html")).getText());
	
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}
