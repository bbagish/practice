package JUnit_Parallel;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;

public class GridParallelTestBase {
	// Declare DesiredCapabilities configuration variables
	protected String browserName;
	protected Platform platformName;
	protected WebDriver driver;

	// Hold all Configuration values in a LinkedList
	// Extra Usage Information:
	// http://www.swtestacademy.com/junit-parametrized-tests/
	@Parameterized.Parameters
	public static LinkedList<String[]> getEnvironments() throws Exception {
		LinkedList<String[]> browser = new LinkedList<String[]>();
	    //browser.add(new String[] { "firefox" });
		browser.add(new String[] { "chrome" });
		//
		return browser;
	}

	// Constructor
	public GridParallelTestBase(String browserName) {
		this.browserName = browserName;
	}

	public void setPlatform(Platform platform) {
		platformName = platform;
	}

	@Before
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// Firefox Profile Settings
		if (browserName.equals("firefox")) {
			FirefoxProfile profile = new FirefoxProfile();
			// Accept Untrusted Certificates
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(false);
			// Use No Proxy Settings
			profile.setPreference("network.proxy.type", 0);
			// Set Firefox profile to capabilities
			capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		}
		// Set Platform
		capabilities.setPlatform(platformName);
		// Set BrowserName
		capabilities.setCapability("browserName", browserName);
		capabilities.setCapability("build", "JUnit-Parallel");
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
	}

	// TakeScreenShot
	public void takeScreenShot() {
		driver = new Augmenter().augment(driver);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotName = getClass().getSimpleName();
		System.out.println("ScreenShotName: " + screenshotName);
		try {
			FileUtils.copyFile(srcFile, new File("screenshotName.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}