package com.automation.RandomTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListOfElements {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bagishman/Documents/Libraries/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void findAllLink() {
		driver.get("http://www.google.com");
		// driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		System.out.println(links.get(10).getText());
		List<WebElement> buttons = driver.findElements(By.xpath("// input[@type='submit']"));
		System.out.println("Number of Buttons: " + buttons.size());

	}

	@Test
	public void findImages() throws InterruptedException {
		driver.get("http://www.etsy.com");
		Thread.sleep(1000);
		List<WebElement> images = driver.findElements(By.tagName("pictures"));
		System.out.println("Number of images " + images.size());
	}

	@Test
	public void printAllLinks() throws InterruptedException {
		driver.get("http://www.newtours.demoaut.com");
		Thread.sleep(1000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: " + links.size());
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
	}
}
