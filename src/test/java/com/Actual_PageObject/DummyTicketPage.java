package com.Actual_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DummyTicketPage {
	WebDriver driver;
	public DummyTicketPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath=" //input[@id='product_549']")
	WebElement radioButton;
	public void clickRadioButton()
	{
		radioButton.click();
	}
	@FindBy(xpath=" //input[@id='travname']")
	WebElement Fname;
	public void setFname(String fName)
	{
		Fname.sendKeys(fName);
	}
	@FindBy(xpath=" //input[@id='travlastname']")
	WebElement Lname;
	public void setLname(String lName)
	{
		Lname.sendKeys(lName);
	}
	

}
