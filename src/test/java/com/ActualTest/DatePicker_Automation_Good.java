package com.ActualTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_Automation_Good {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void pickDate() throws InterruptedException
	{
		WebElement ca=driver.findElement(By.id("datepicker1"));
		ca.click();
		String month="December 2024";
		String date1="15";
		
	while(true)
	{
		String MonthYear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		/*String a[]=MonthYear.split("  ");
		String mo=a[0];
		String yr=a[1];*/
		if(MonthYear.equals(month))
		{
			break;
			
		}
		else
		{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		
	}
	List<WebElement>allDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
	for(WebElement date:allDate)
	{
		if(date.getText().equals(date1))
		{
			date.click();
			break;
		}
	}
	
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}












