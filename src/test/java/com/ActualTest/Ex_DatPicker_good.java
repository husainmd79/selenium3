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

public class Ex_DatPicker_good {
	WebDriver driver;
	@BeforeClass()
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.Expedia.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void expediaDateTest() throws InterruptedException
	{
		driver.findElement(By.name("EGDSDateRange-date-selector-trigger")).click();
		
		String moyr="January 2024";
		String day="25";
		while(true)
		{	
			
		WebElement MoYr=driver.findElement(By.xpath("(//span[@class='uitk-align-center uitk-month-label'])"));
		
			if(MoYr.getText().equals(moyr))
			{
				break;

				
			}
			else
			{
				driver.findElement(By.xpath(" //button[@data-stid='uitk-calendar-navigation-controls-next-button']")).click();
			}
		}
		
	 
	List<WebElement>allDate=driver.findElements(By.xpath("(//tbody)[1]/tr/td/div"));
		for(WebElement date : allDate)
		{
			if(date.getText().equals(day))
			{
				date.click();
			}
		}
		
		
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}



