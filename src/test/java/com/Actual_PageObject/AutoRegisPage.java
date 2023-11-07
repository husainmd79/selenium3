package com.Actual_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutoRegisPage {
	WebDriver driver;
	public AutoRegisPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath=" //a[normalize-space()='Practice Site']")
	WebElement practiceClick;
	public void clickPractice()
	{
		practiceClick.click();
	}
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	WebElement shopTxt;
	public void clickShop()
	{
		shopTxt.click();
	}
	@FindBy(xpath="//*[@id=\"content\"]/ul/li[1]/a[2]")
	WebElement androidAddCart;
	public void ClickAndroidAdd()
	{
		androidAddCart.click();
	}
	@FindBy(xpath=" //a[contains(text(),'View Basket')]")
	WebElement ClickView;
	public void clickView()
	{
		ClickView.click();
	}
	@FindBy(xpath="//a[normalize-space()='Proceed to Checkout']")
	WebElement proceedCheckOutClick;
	public void setCheckout()
	{
		proceedCheckOutClick.click();
	}
	@FindBy(xpath=" //input[@id='billing_phone']")
	WebElement billPhone;
	public void setPhon(String tel)
	{
		billPhone.sendKeys(tel);
	}
	@FindBy(xpath=" //input[@id='billing_email']")
	WebElement BillEmail;
	public void setEmail(String email)
	{
		BillEmail.sendKeys(email);
	}
	@FindBy(xpath="//span[@id='select2-chosen-1']")
	WebElement billDrp;
	public void setBillState(String country)
	{
		Select se=new Select(billDrp);
		se.selectByVisibleText(country);
	}
	

}



























