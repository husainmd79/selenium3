package com.NopCommerce_Window1_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Promotion_Campaign_Page {
	WebDriver driver;
	
	public Promotion_Campaign_Page(WebDriver rdriver)
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
	@FindBy(xpath="//a[@class='nav-link active']//i[@class='nav-icon far fa-dot-circle']")
	WebElement campaign;
	public void clickCampaign()
	{
		campaign.click();
	}

}
