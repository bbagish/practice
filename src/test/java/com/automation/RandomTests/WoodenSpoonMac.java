package com.automation.RandomTests;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AmazonP;
import pages.EtsyP;

public class WoodenSpoonMac {
	static WebDriver driver;
	public static final String URL = "http://localhost:4444/wd/hub";

	@BeforeClass
	public void setUP() throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "macOS 10.13");
		caps.setCapability("version", "45.0");
		driver = new RemoteWebDriver(new URL(URL), caps);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test

	public void EtsySearchTest() {

		EtsyP etsy = new EtsyP(driver);
		etsy.goTo();
		assertTrue(etsy.atEtsyPage());
		etsy.searchFor("Wooden Spoon");
		assertTrue(etsy.resultsAreDisplayed());

		driver.quit();

	}

	@Test

	public void AmazonSearchTest() {
		AmazonP amazon = new AmazonP(driver);
		amazon.goTo();
		assertTrue(amazon.atAmazonPage());
		amazon.searchFor("Wooden Spoon");
		assertTrue(amazon.resultsAreDisplayed());

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
