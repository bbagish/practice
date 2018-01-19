package com.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Utils.Driver;

public class SpeedTestPage {
	private static WebDriver driver;

	public SpeedTestPage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(css = ".start-text")
	public WebElement go;

	@FindBy(css = ".gauge-speed=arc")
	public WebElement speedGauge;

	@FindBy(xpath = "//span[contains(@class, 'download-speed')]")
	public WebElement downloadSpeed;

	@FindBy(css = "span[@class*= 'upload-speed')]")
	public WebElement uploadSpeed;

}
