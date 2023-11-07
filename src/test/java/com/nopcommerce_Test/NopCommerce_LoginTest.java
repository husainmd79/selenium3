package com.nopcommerce_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.NopCommerce_Window1_PageObject.Login_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerce_LoginTest {
	WebDriver driver;
	@BeforeClass
	public void set()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
	}
	@Test
	public void LoginTest() throws InterruptedException
	{
		 Login_Page lp=new  Login_Page(driver);
		 lp.clearEmail();
		 lp.setEmail("admin@yourstore.com");
		lp.clearPassWord();
		lp.setPassWord("admin");
		lp.clickButton();
		Thread.sleep(6000);
		lp.clickLogOut();
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
