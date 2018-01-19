package com.automation.RandomTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AutomationPractice {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Bagishman/Documents/Libraries/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get("http://automationpractice.com");
		driver.findElement(By.linkText("T-SHIRTS")).click();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total checkboxes: " + checkboxes.size());
		if (!checkboxes.get(0).isSelected()) {
			checkboxes.get(0).click();
		}
		if (!checkboxes.get(checkboxes.size() - 1).isSelected()) {
			checkboxes.get(checkboxes.size() - 1).click();
		}
		SoftAssert softAssert = new SoftAssert();
		for (WebElement box : checkboxes) {
			if (!box.isSelected()) {
				box.click();
			}

			softAssert.assertTrue(box.isEnabled());

		}
		softAssert.assertAll();
	}
}
