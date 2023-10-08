package com.ActualTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

}
