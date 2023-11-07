package com.nopcommerce_Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_NopCommerce {
	public String NoCoUrl="https://admin-demo.nopcommerce.com/login";
	public String NoCoUserId="admin@yourstore.com";
	public String NoCoPassWord="admin";
	
	public static WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(NoCoUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
	}
	public void selectOptionFromDropDown(WebElement ele,String value)
	{
		Select se=new Select(ele);
		List<WebElement>allOption=se.getOptions();
		for(WebElement option:allOption)
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
	}
	//Random Email
	public String randomString()
	{
		RandomStringUtils rm=new RandomStringUtils();
		String genaratEmail=rm.randomAlphabetic(8);
		return genaratEmail;
	}
	//Random Phone
	public String randomNumber()
	{
		String number=RandomStringUtils.randomNumeric(10);
		return number;
	}
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}

}























