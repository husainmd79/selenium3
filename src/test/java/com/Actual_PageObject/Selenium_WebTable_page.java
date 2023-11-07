package com.Actual_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium_WebTable_page {
	WebDriver driver;
	public Selenium_WebTable_page(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //a[@class='dropdown-toggle'][normalize-space()='Selenium']")
	WebElement selenium;
	public void clickSelenium()
	{
		selenium.click();
	}
	@FindBy(xpath="//a[normalize-space()='Table Demo']")
	WebElement tableDemo;
	public void clickTableDemo()
	{
		tableDemo.click();
	}
	@FindBy(xpath=" //body/table[1]//tbody//tr")
	WebElement numberOfRow;
	public void RowCount()
	{
		numberOfRow.getSize();
	}

}
