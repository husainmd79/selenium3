package com.NopCommerce_Window1_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Promotion_Affliate_Page {
	WebDriver driver;
	public Promotion_Affliate_Page(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath=" //i[@class='nav-icon fas fa-tags']")
	WebElement promotion;
	public void clickPromotion()
	{
		promotion.click();
	}
	@FindBy(xpath=" //p[normalize-space()='Affiliates']")
	WebElement affiliate;
	public void clickAffiliate()
	{
		affiliate.click();
	}
	//Add new 
	@FindBy(xpath="//i[@class='fas fa-plus-square']")
	WebElement AddNew;
	public void clickAddNew()
	{
		AddNew.click();
	}
	@FindBy(id="Address_Email")
	WebElement addNewEmail;
	public void setEmail(String email)
	{
		addNewEmail.sendKeys(email);
	}
	@FindBy(id="Address_CountryId")
	WebElement countryDrp;
	public void setCountry(String value)
	{
		Select se=new Select(countryDrp);
		se.selectByValue(value);
	}
	@FindBy(id="Address_PhoneNumber")
	WebElement Phone;
	public void setPhone(String tel)
	{
		Phone.sendKeys(tel);
	}
	//Different Windows
	@FindBy(xpath=" //div[@class='col-md-4 col-xs-12 text-md-left text-center']")
	WebElement  nopWindows;
	public void clickWindows()
	{
		 nopWindows.click();
	}
	

}





























