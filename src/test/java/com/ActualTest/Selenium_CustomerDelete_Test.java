package com.ActualTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Actual_PageObject.Selenium_DeletCustomerFrom_page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_CustomerDelete_Test {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	@Test
	public void customerDeletTest()
	{
		//Selenium_DeletCustomerFrom_page sd=new Selenium_DeletCustomerFrom_page(driver);
		//sd.clickCustDelete();
		WebElement cus=driver.findElement(By.xpath("//a[normalize-space()='Delete Customer Form']"));
		System.out.println(cus.isDisplayed());
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	

}
