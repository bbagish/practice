package com.automation.RandomTests;



import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateComparison {
	WebDriver driver;
	public static String todaysDate;

	@Before
	public void setUP() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void getDataFromGoogle() throws InterruptedException {
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("today's date" + Keys.ENTER);
		Thread.sleep(2000);
		String todaysDate = driver.findElement(By.xpath("//div[@class='vk_bk vk_ans']")).getText();
	}

	@Test
	public void calendarDate() {
		driver.get("https://www.calendardate.com/");
		String cdDate = driver.findElement(By.xpath("/html/body/header/div")).getText();
		String altDate = cdDate.replaceAll("Friday", "Friday,");
		String altDate2 = altDate.replaceAll("03", "3");
		assertEquals(altDate2, todaysDate);

	}

	@Test
	public void todaysDate() {
		driver.get("http://todays-date.net");
		String tdDate = driver.findElement(By.xpath("//*[@id=\"date\"]")).getText();
		System.out.println(tdDate);
		// assertEquals(tdDate, todaysDate);

	}

	@After
	public void close() {
		driver.quit();
	}

}
