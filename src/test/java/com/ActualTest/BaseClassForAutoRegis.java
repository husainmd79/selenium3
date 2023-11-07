package com.ActualTest;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClassForAutoRegis {
	public String BaleUrl="https://practice.automationtesting.in/checkout/";
	
	public static WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(BaleUrl);
	}
	/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/
	public String randomNumeric()
	{
		RandomStringUtils rm=new RandomStringUtils();
		String numeric=rm.randomNumeric(10);
		return numeric;
	}
	public String randomString()
	{
		RandomStringUtils rms=new RandomStringUtils();
		String randomstring=rms.randomAlphabetic(9);
		return randomstring;
	}

}
