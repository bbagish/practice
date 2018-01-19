package com.automation.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.Utils.Driver;
import com.automation.Utils.UsefulMethods;

public class WebTablesPage {
	private static WebDriver driver;
public WebTablesPage() {
	PageFactory.initElements(Driver.getInstance(), this);
}
@FindBy(xpath="//tfoot/tr/th")
public List<WebElement> webtableHeader;




public String[] searchWebTable(String person, WebDriver driver) {
	List<WebElement> rows = driver.findElements(By.xpath("//td[@class='sorting_1']"));
	int index = 0;
	WebElement row = null;
	for (int i = 1; i <= rows.size(); i++) {
		row = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[@class='sorting_1']"));
		if (row.getText().equals(person)) {
			index = i;
		}
	}
	WebElement name = driver.findElement(By.xpath("//tbody/tr[" + index + "]/td[1]"));
	WebElement position = driver.findElement(By.xpath("//tbody/tr[" + index + "]/td[2]"));
	WebElement city = driver.findElement(By.xpath("//tbody/tr[" + index + "]/td[3]"));
	String[] list = { name.getText(), position.getText(), city.getText() };
	List list2 = Arrays.asList(list);
	System.out.println(list2);
	return list;
}


public static void createNewRow(String[] array, WebDriver driver) throws InterruptedException {
	driver.findElement(By.cssSelector("button[class='dt-button buttons-create']")).click();
	WebElement fistName = driver.findElement(By.id("DTE_Field_first_name"));
	UsefulMethods.waitForVisibilityOfElement(driver, fistName, 10);
	driver.findElement(By.id("DTE_Field_first_name")).sendKeys(array[0]);
	driver.findElement(By.id("DTE_Field_last_name")).sendKeys(array[1]);
	driver.findElement(By.id("DTE_Field_position")).sendKeys(array[2]);
	driver.findElement(By.id("DTE_Field_office")).sendKeys(array[3]);
	driver.findElement(By.cssSelector("button[class='btn']")).click();
	Thread.sleep(3000);
}
public List<String> getActualHeader(List<WebElement> webTableHeader){
	List<String> actualHeaderList = new ArrayList();
	for (WebElement el : webTableHeader) {
		actualHeaderList.add(el.getText());
	}
	return actualHeaderList;
}
}
