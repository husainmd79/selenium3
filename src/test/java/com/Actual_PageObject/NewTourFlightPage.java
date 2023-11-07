package com.Actual_PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewTourFlightPage {
	WebDriver driver;
	public NewTourFlightPage(WebDriver rdriver)
	
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //a[normalize-space()='Flights']")
	WebElement flightLink;
	public void ClickFlight()
	{
		flightLink.click();
	}
	@FindBy(xpath=" //input[@value='oneway']")
	WebElement selectOneWay;
	public void ClickOneWay()
	{
		selectOneWay.click();
	}
	@FindBy(xpath=" //select[@name='passCount']")
	WebElement passDrp;
	public void setPassDrp(String ele)
	{
		Select se=new Select(passDrp);
		se.selectByVisibleText(ele);
				
	}
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement departingForm;
	public void selectOptionFromDrp(String value)
	{
		Select se=new Select(departingForm);
		
		se.selectByVisibleText(value);
	}
	
	}












