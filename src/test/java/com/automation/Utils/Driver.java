package com.automation.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getInstance() {
		if (driver == null) {
			switch (ConfigurationReader.getProperty("browser")) {
			case "firefoxMac":
				System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("gecko.driver.path1"));
				driver = new FirefoxDriver();
				break;
			case "chromeMac":
				System.setProperty("webdriver.chrome.driver", ConfigurationReader.getProperty("chrome.driver.path1"));
				driver = new ChromeDriver();
				break;
			case "firefoxWin":
				System.setProperty("webdriver.gecko.driver", ConfigurationReader.getProperty("gecko.driver.path2"));
				driver = new FirefoxDriver();
				break;
			case "chromeWin":
				System.setProperty("webdriver.chrome.driver", ConfigurationReader.getProperty("chrome.driver.path2"));
				driver = new ChromeDriver();
				break;
			
			default:
				System.setProperty("webdriver.chrome.driver", ConfigurationReader.getProperty("chrome.driver.path1"));
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}

}
