package com.ActualTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Actual_PageObject.DummyTicketPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SouthWestAirlines_DatePicker_Good {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.southwest.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void dummyTest()
	{
		String Month="June 2024";
		String date="15";
		
		driver.findElement(By.id("LandingAirBookingSearchForm_departureDate")).click();
		while(true)
		{
			String month=driver.findElement(By.xpath("//div[@class='calendar-month--title']")).getText();
			if(month.equals(Month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath(" //button[@aria-label='Next Month']"))
				.click();
			}
		}
		List<WebElement>allDate=driver.findElements(By.xpath(" (//div[@class='calendar-month--days'])[1]//button"));
		for(WebElement dat:allDate)
		{
			String txt=dat.getText();
			if(txt.equals(date))
			{
				dat.click();
			}
		}
		
		
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
