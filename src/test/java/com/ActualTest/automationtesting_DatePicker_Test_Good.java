package com.ActualTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationtesting_DatePicker_Test_Good {
	WebDriver driver;
	@BeforeClass()
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
	}
	@Test
	public void expediaDateTest() throws InterruptedException
	{
		String day="25";
		//driver.findElement(By.xpath("//button[@aria-label='Leaving from']")).click();
		driver.findElement(By.xpath(" //input[@id='datepicker2']")).click();
		Thread.sleep(3000);
		
		WebElement moDrp=driver.findElement(By.xpath(" //select[@title='Change the month']"));
		Select se=new Select(moDrp);
		se.selectByVisibleText("May");
		 
		WebElement yrDrp=driver.findElement(By.xpath("//select[@title='Change the year']"));
		Select sel=new Select(yrDrp);
		sel.selectByVisibleText("2024");
		List<WebElement>allDate=driver.findElements(By.xpath(" //div[@class='datepick-month']//table//tr/td"));
		for(WebElement date:allDate)
		{
			if(date.getText().equals(day))
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
