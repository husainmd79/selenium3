package com.ActualTest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void dropDown()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Resources']")).click();
		List<WebElement>allOption=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		for(WebElement option:allOption)
		{
			String text=option.getText();
				
			System.out.println(text);
			
		}
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
