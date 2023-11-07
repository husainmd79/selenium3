package com.ActualTest;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Utility.ReadConfig;
import com.google.protobuf.Option;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig rc=new ReadConfig();
	public String BaseUrl=rc.getGuru99Url();
	public String UserId=rc.guruUserId();
	public String PassWord="dUtEmah";
	
	public String JqueryUrl=rc.getJQureyUrl();
	
	public String newTourUrl=rc.getNewTourUrl();
	public static WebDriver driver;
	
	
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
				
	}
    @AfterClass
	public void tearDown()
	{
		driver.quit();
	}
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
	public String getScreenshot(WebDriver driver,String tName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File ter=new File(".\\ScreenShot\\"+tName+".png");
		FileUtils.copyFile(src, ter);
		return tName;
	}
	public void getOptionFromDropDown(List<WebElement>ele,String value)
	{
		for(WebElement option:ele)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}
	public void selectOptionFromDrp(WebElement ele,String value)
	{
		Select se=new Select(ele);
		List<WebElement>option=se.getOptions();
		for(WebElement op:option)
		{
			if(op.getText().equals(value))
			{
				op.click();
				break;
			}
		}
	}

}


















