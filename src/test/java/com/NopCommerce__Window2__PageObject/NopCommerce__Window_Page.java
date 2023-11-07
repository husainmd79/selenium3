package com.NopCommerce__Window2__PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerce__Window_Page {
	WebDriver driver;
	public NopCommerce__Window_Page(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='col-md-4 col-xs-12 text-md-left text-center']")
	WebElement nopCoWindow2;
	public void clickWindow2()
	{
		nopCoWindow2.click();
	}
	@FindBy(xpath=" //div[@class='home-banner-button']//a[@class='btn black-border-button'][normalize-space()='View demo']")
	
	WebElement vewDemo;
	public void clickVewDemo()
	{
		vewDemo.click();
	}

}
