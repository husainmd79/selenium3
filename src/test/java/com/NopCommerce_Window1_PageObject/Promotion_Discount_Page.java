package com.NopCommerce_Window1_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Promotion_Discount_Page {
	WebDriver driver;
	public Promotion_Discount_Page(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='nav-icon fas fa-tags']")
	WebElement promotion;
	public void clickPromotion()
	{
		promotion.click();
	}
	@FindBy(xpath=" //p[normalize-space()='Discounts']")
	WebElement discount;
	public void clickDiscount()
	{
		discount.click();
	}
	@FindBy(xpath=" //span[@aria-controls='SearchStartDate_dateview']//span[@class='k-icon k-i-calendar']")
	WebElement startDate;
	public void clickStartDate()
	{
		startDate.click();
	}
	//Add new Discount page
	
	@FindBy(xpath="//i[@class='fas fa-plus-square']")
	WebElement addNew;
	public void clickAddNew()
	{
		addNew.click();
	}
	@FindBy(id="IsActive")
	WebElement chkBox1;
	public void clickChkBox1()
	{
		chkBox1.click();
	}
	@FindBy(id="DiscountTypeId")
	WebElement discountType;
	public void setDropDown(String value)
	{
		Select se=new Select(discountType);
		se.selectByValue(value);
	}
	

}






































