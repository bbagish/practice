package com.automation.Webtables;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.Pages.WebTablesPage;
import com.automation.Utils.Driver;

public class WebTables {

	private List<String> actualHeaderList = new ArrayList();
	static WebDriver driver;
	private String[] expectedHeader = { "Name", "Position", "Office", "Extn.", "Start date", "Salary" };
	private List<String> expectedHeaderList = Arrays.asList(expectedHeader);
	private String[] inputArray = { "Bill", "Gates", "Founder", "Seatle" };
	String url="https://editor.datatables.net/examples/simple/simple.html";
	WebTablesPage webTablesPage=new WebTablesPage();
	@Before
	public void setUP() {
		driver=Driver.getInstance();
		driver.get(url);
		
	}

	@Test
	public void test() throws InterruptedException {
		// Comparing headers
		actualHeaderList=webTablesPage.getActualHeader(webTablesPage.webtableHeader);
		
		assertEquals(expectedHeaderList, actualHeaderList);
		assertEquals(expectedHeaderList.size(), actualHeaderList.size());
		
		// Comparing results
		
		String[] brunoActual = webTablesPage.searchWebTable("Bruno Nash", driver);
		String[] brunoExpected = { "Bruno Nash", "Software Engineer", "London" };
		assertArrayEquals(brunoExpected, brunoActual);
		
		// Creating and comparing results
		
		webTablesPage.createNewRow(inputArray, driver);
		String[] expectedArray = { "Bill Gates", "Founder", "Seatle" };
		String[] actualArray = webTablesPage.searchWebTable("Bill Gates", driver);
		assertArrayEquals(expectedArray, actualArray);

	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
