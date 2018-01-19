package com.automation.RandomTests;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DateComparison {
	WebDriver driver;
	public static String todaysDate;

	@BeforeTest
	public void setUP() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 0)
	public void getDataFromGoogle() throws InterruptedException {
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("today's date" + Keys.ENTER);
		Thread.sleep(2000);
		String todaysDate = driver.findElement(By.xpath("//div[@class='vk_bk vk_ans']")).getText();
	}

	@Test(priority = 2)
	public void calendarDate() {
		driver.get("https://www.calendardate.com/");
		String cdDate = driver.findElement(By.xpath("/html/body/header/div")).getText();
		String altDate = cdDate.replaceAll("Friday", "Friday,");
		String altDate2 = altDate.replaceAll("03", "3");
		assertEquals(altDate2, todaysDate);

	}

	@Test(priority = 3)
	public void todaysDate() {
		driver.get("http://todays-date.net");
		String tdDate = driver.findElement(By.xpath("//*[@id=\"date\"]")).getText();
		System.out.println(tdDate);
		// assertEquals(tdDate, todaysDate);

	}

	@AfterTest
	public void close() {
		driver.quit();
	}

}
