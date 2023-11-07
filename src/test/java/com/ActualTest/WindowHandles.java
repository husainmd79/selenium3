package com.ActualTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
	}
	@Test
	public void datePicker() throws InterruptedException
	{
		
		driver.findElement(By.xpath(" //input[@id='Email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //input[@id='Email']")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.xpath("  //input[@id='Password']")).clear();
		driver.findElement(By.xpath("  //input[@id='Password']")).sendKeys("admin");
		driver.findElement(By.xpath(" //button[normalize-space()='Log in']")).click();
		String title=driver.getTitle();
		System.out.println("title of the page: "+title);
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //div[@class='col-md-4 col-xs-12 text-md-left text-center']")).click();
		String windowId=driver.getWindowHandle();
		System.out.println("window of the page: "+windowId);
		Set<String> windowIds=driver.getWindowHandles();
		System.out.println("multiple window:"+windowIds);
		Iterator<String>it=windowIds.iterator();
		String parentWindow=it.next();
		String ChildWindow=it.next();
		System.out.println("this is parent window:"+parentWindow);
		System.out.println("this is child window:"+ChildWindow);
		driver.quit();
		
		
		
		
	}

}
