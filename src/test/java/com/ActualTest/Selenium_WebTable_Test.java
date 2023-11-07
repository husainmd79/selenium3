package com.ActualTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Actual_PageObject.Selenium_WebTable_page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_WebTable_Test {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4//");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test 
	public void webTableTest()
	{
		Selenium_WebTable_page sp=new Selenium_WebTable_page(driver);
		sp.clickSelenium();
		sp.clickTableDemo();
	WebElement rowCount=driver.findElement(By.xpath(" //body/table[1]//tbody//tr//td"));
	System.out.println(rowCount);
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
