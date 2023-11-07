package com.NopCommerce_Window1_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	WebDriver driver;
	public  Login_Page(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	public void setEmail(String mail)
	{
		email.sendKeys(mail);
	}
	public void clearEmail()
	{
		email.clear();
	}
	@FindBy(xpath="//input[@id='Password']")
	WebElement passWord;
	public void setPassWord(String pwd)
	{
		passWord.sendKeys(pwd);
	}
	public void clearPassWord()
	{
		passWord.clear();
	}
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement button;
	public void clickButton()
	{
		button.click();
	}
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logOut;
	public void clickLogOut()
	{
		logOut.click();
	}
	

}
