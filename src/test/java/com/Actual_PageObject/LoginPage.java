package com.Actual_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //input[@name='uid']")
	WebElement userTxt;
	public void setUser(String user)
	{
		userTxt.sendKeys(user);
	}
	public void clearUser()
	{
		userTxt.clear();
	}
	@FindBy(xpath=" //input[@name='password']")
	WebElement passWordTxt;
	public void setpassWord(String pwd)
	{
		passWordTxt.sendKeys(pwd);
	}
	public void clearPassWord()
	{
		passWordTxt.clear();
	}
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement button;
	public void clickLogin()
	{
		button.click();
	}

}
