package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class AddCustomerSteps {
	
	
static WebDriver driver;
	
	@Given("user launches demo telecom site")
	public void user_launches_demo_telecom_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\chromedriv\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();	
		driver.switchTo().parentFrame();
	}
	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() throws Throwable {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();	
		driver.switchTo().parentFrame();
	}
	
	@When("user  enters all the fields")
	public void user_enters_all_the_fields() {
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();	    
		driver.findElement(By.id("fname")).sendKeys("sathya");
		driver.findElement(By.id("lname")).sendKeys("vijayan");	    
		driver.findElement(By.id("email")).sendKeys("sathyajva625@gmail.com");	  
		driver.findElement(By.id("Add")).sendKeys("chennai25");	       
		driver.findElement(By.id("telephoneno")).sendKeys("9455144256");	    

	    }

	@When("user  enters all the fields with one dimensional")
	public void user_enters_all_the_fields_with_one_dimensional(DataTable dataTable) {
		List<String> data = dataTable.asList();
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();	    
		driver.findElement(By.id("fname")).sendKeys(data.get(0));
		driver.findElement(By.id("lname")).sendKeys(data.get(1));	    
		driver.findElement(By.id("email")).sendKeys(data.get(2));	  
		driver.findElement(By.id("Add")).sendKeys(data.get(3));	       
		driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));	    

	    }

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();	    

	    	}

	@Then("user should be displayed customer ID is generated or not")
	public void user_should_be_displayed_customer_ID_is_generated_or_not() throws Throwable {
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"flow_close_btn_iframe\"]")));
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();	
		driver.switchTo().parentFrame();
      Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	String text=driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();	
	System.out.println(text);
	}
	

	
}


	
	