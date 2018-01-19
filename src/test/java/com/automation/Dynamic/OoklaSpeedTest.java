package com.automation.Dynamic;

import static com.automation.Utils.UsefulMethods.*;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.Pages.SpeedTestPage;
import com.automation.Utils.Driver;

public class OoklaSpeedTest {
	WebDriver driver;
	String url = "http://beta.speedtest.net/";

	String uploadSpeed = "";
	String downLoad = "";

	@Before
	public void setUp() {
		driver = Driver.getInstance();
		driver.get(url);

	}

	@Test
	public void speedTest() {
		SpeedTestPage speedTest = new SpeedTestPage();
		// assertTrue(speedTest.go.isDisplayed());
		speedTest.go.click();
		waitForVisibilityOfElement(driver, speedTest.speedGauge, 60);

		assertTrue(speedTest.speedGauge.isDisplayed());

		waitForInvisibilityOfElement(driver, speedTest.speedGauge, 60);

		waitForVisibilityOfElement(driver, speedTest.downloadSpeed, 60);

		assertTrue(speedTest.downloadSpeed.isDisplayed());

		uploadSpeed = speedTest.uploadSpeed.getText();
		downLoad = speedTest.downloadSpeed.getText();
		System.out.println("Download speed " + downLoad + " Mbps \n" + "Upload speed: " + uploadSpeed);

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
