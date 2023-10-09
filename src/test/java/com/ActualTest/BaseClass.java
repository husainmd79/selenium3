package com.ActualTest;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String BaseUrl="https://demo.guru99.com/v4/";
	public String UserId="mngr531592";
	public String PassWord="emezevu";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(BaseUrl);
				
	}
	/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/
	public String randomString()
	{
		RandomStringUtils rm=new RandomStringUtils();
		String generateRandom=rm.randomAlphabetic(8);
		return generateRandom;
	}
	public String randomNumber()
	{
		RandomStringUtils rn=new RandomStringUtils();
	String number=rn.randomNumeric(9);
	return number;
	}

}
