package com.ActualTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Actual_PageObject.Selenium_RadioButton_page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_CheckBox_Good {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	@Test
	public void tableDemoTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//li[@class='dropdown']//a[normalize-space()='Selenium']")).click();
		Selenium_RadioButton_page se=new Selenium_RadioButton_page(driver);
		se.clickRadioButton();
		Thread.sleep(3000);
		se.clickRaButton();
		//se.clickChkBox();
		List<WebElement>allChkBox=driver.findElements(By.xpath("//div[@style='margin-left:20px;']//input[@type='checkbox']"));
		for(WebElement ChkBox:allChkBox)
		{
			ChkBox.click();
		}
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
