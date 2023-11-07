package com.Actual_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	WebDriver driver;
	public NewCustomerPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //a[normalize-space()='New Customer']")
	WebElement newCustomer;
	public void setCustomer()
	{
		newCustomer.click();
	}
	@FindBy(xpath=" //input[@id='dob']")
	WebElement cusDob;
	public void setCusDob(String mm,String dd,String yyyy)
	{
		cusDob.sendKeys(mm);
		cusDob.sendKeys(dd);
		cusDob.sendKeys(yyyy);
	}
	@FindBy(xpath=" //input[@name='emailid']")
	WebElement emailTxt;
	public void setEmail(String email)
	{
		emailTxt.sendKeys(email);
	}
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement telTxt;
	public void setTel(String tel)
	{
		telTxt.sendKeys(tel);
	}

}
