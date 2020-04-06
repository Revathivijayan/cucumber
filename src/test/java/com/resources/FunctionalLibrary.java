package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	public static WebDriver driver;
	public void launch(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\chromedriv\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();

	}
	public void insertText(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void button(WebElement element) {
		element.click();
	}

}
