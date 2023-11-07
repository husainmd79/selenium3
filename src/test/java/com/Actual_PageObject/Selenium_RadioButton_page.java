package com.Actual_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium_RadioButton_page {
	WebDriver driver;
	public Selenium_RadioButton_page(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath=" //a[normalize-space()='Radio & Checkbox Demo']")
	WebElement radioButton;
	public void clickRadioButton()
	{
		radioButton.click();
	}
	@FindBy(id="vfb-7-1")
	WebElement raButton;
	public void clickRaButton()
	{
		raButton.click();
	}
	@FindBy(id="vfb-6-0")
	WebElement chkBox;
	public void clickChkBox()
	{
		chkBox.click();
	}
	

}
