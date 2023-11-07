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

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoDropDown {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void autoDropDown()
	{
		driver.findElement(By.xpath(" //textarea[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement>List=driver.findElements(By.xpath(" //div[@id='Alh6id']//li"));
		for(WebElement item:List)
		{
			if(item.getText().equals("selenium benefits"))
			{
				item.click();
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
