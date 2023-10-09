package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizedStatementPage {
	WebDriver driver;
	public CustomizedStatementPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //a[normalize-space()='Customised Statement']")
	WebElement customizedTxt;
	public void ClickCustomized()
	{
		customizedTxt.click();
	}
	@FindBy(xpath=" //input[@name='accountno']")
	WebElement accountTxt;
	public void setAccount(String act)
	{
		accountTxt.sendKeys(act);
	}
	@FindBy(xpath="//input[@name='fdate']")
	WebElement fromDate;
	public void setFromDate(String mm,String dd,String yyyy)
	{
		fromDate.sendKeys(mm);
		fromDate.sendKeys(dd);
		fromDate.sendKeys(yyyy);
	}

}
