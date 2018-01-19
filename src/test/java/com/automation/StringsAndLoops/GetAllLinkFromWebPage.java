package com.automation.StringsAndLoops;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAllLinkFromWebPage {
	static WebDriver driver = new ChromeDriver();
public static void main(String[] args) {
	driver.get("http://www.asos.com");
	List<WebElement> links= driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(WebElement link : links) {
		String url=link.getAttribute("href");
		verifyLink(url);
}
}
public static void verifyLink(String linkStr) {
	try {
	URL url=new URL(linkStr);
	HttpURLConnection httpConnection=(HttpURLConnection)url.openConnection();
	httpConnection.setConnectTimeout(3000);
	httpConnection.connect();
	if(httpConnection.getResponseCode()==200) {
		System.out.println(linkStr +" - " + httpConnection.getResponseMessage());
		
	}
	int neg=0;
	if(httpConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
		System.out.println(linkStr+ " - "+httpConnection.getResponseMessage());
	neg++;
	System.out.println("number of broken links "+ neg);
	}
	}catch(Exception e){
	
}
	
}
}
		
