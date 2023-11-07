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

public class HandleCheckBox_Good {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-notificaton");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
	}
	@Test
	public void chekBoxTest()
	{
    
    List<WebElement> chk=driver.findElements(By.xpath("//input[@type='checkbox']"));
    int allChk=chk.size();
    System.out.println(allChk);
   /* for(int i=0;i<allChk;i++)
    {
    	chk.get(i).click();
    }*/
    for(WebElement ele:chk)
    {
    	String val=ele.getAttribute("value");
    	if(val.equals("checkbox3")||val.equals("checkbox2"))
    	{
    		ele.click();
    	}
    }
		
	
		
	}
    @AfterClass
	public void tearDown()
	{
	driver.close();
	}
	
	

}
