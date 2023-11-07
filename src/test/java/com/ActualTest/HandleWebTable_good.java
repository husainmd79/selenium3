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

public class HandleWebTable_good {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.Expedia.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	@Test
	public void WebTableTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[normalize-space()='Stays']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='uitk-layout-position uitk-layout-position-relative']//div//div//div")).click();
		List<WebElement>row=driver.findElements(By.xpath("//table[@aria-label='October 2023']//tbody//tr"));
		int totalRows=row.size();
		System.out.println("total number of rows"   +totalRows);
		Thread.sleep(3000);
		
		//number of column
		int column=driver.findElements(By.xpath(" //table[@aria-label='October 2023']//thead//tr/th")).size();
	
		System.out.println("number of column column:"+column);
	
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}






