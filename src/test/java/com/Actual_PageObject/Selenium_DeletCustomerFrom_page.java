package com.Actual_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium_DeletCustomerFrom_page {
	WebDriver driver;
	public Selenium_DeletCustomerFrom_page(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[normalize-space()='Delete Customer Form']")
	WebElement customerDelete;
	public void clickCustDelete()
	{
		customerDelete.click();
	}
	

}
