package com.Actual_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuPage {
	WebDriver driver;
	public SelectMenuPage(WebDriver drivers)
	{
		driver=drivers;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //a[normalize-space()='Selectmenu']")
	WebElement SelectMenu;
	public void clickSelectMenu()
	{
		SelectMenu.click();
	}
	@FindBy(xpath="//span[@id='speed-button']")
	WebElement selectSpeed;
	public void clickSpeed()
	{
		selectSpeed.click();
	}
	@FindBy(xpath=" //iframe[@class='demo-frame']")
	WebElement iFram;
	public void setIframe()
	{
		driver.switchTo().frame(iFram);
	}
	@FindBy(xpath=" //span[@id='number-button']")
	WebElement selectNumber;
	public void clickNumber()
	{
		selectNumber.click();
	}
	

}
