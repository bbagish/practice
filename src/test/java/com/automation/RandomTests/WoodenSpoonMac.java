package com.automation.RandomTests;



import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



import com.automation.Pages.*;

public class WoodenSpoonMac {
	static WebDriver driver;
	public static final String URL = "http://localhost:4444/wd/hub";

	@Before
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

	@After
	public void tearDown() {
		driver.quit();
	}
}
