package com.automation.DDT;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchDDT {
	static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Bagishman/Documents/Libraries/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");

	}

	@Test
	public void searchTest() throws Exception {
		String excelPath = "./src/test/resources/TestData/AmazonSearchData.xlsx";
		FileInputStream in = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(in);
		XSSFSheet worksheet = workbook.getSheet("Sheet1");
		int rowsCount = worksheet.getPhysicalNumberOfRows();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cucumber book" + Keys.ENTER);
		String results = driver.findElement(By.id("s-result-count")).getText();
		System.out.println(results);
		int numberOfResults = searchResults(results);
		if (numberOfResults > 0) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public int searchResults(String results) {
		String[] resultsArr = results.split(" ");
		int resultsCount = Integer.parseInt(resultsArr[2].replace(",", ""));
		return resultsCount;
	}

}
