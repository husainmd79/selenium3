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

public class DropDown_withoutSelect_twoPlug {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com");
		driver.manage().window().maximize();
	}
	@Test
	public void dropDownTest()
	{
		driver.findElement(By.xpath("//div[@class='jq-selectbox__select']")).click();
		List<WebElement>allOption=driver.findElements(By.xpath("//div[@class='jq-selectbox__dropdown']//li"));
		for(WebElement option:allOption)
		{
			if(option.getText().equals("sell"));
			{
				option.click();
				break;
			}
		}
        
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
