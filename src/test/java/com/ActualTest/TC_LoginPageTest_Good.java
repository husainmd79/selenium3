package com.ActualTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Actual_PageObject.LoginPage;
import com.Actual_PageObject.NewCustomerPage;

public class TC_LoginPageTest_Good extends BaseClass{
	@Test
	public void loginTest() throws IOException
	{
		driver.get(BaseUrl);
		LoginPage lp=new LoginPage(driver);
		lp.setUser(UserId);
		lp.setpassWord(PassWord);
		
		
		lp.clickLogin();
		NewCustomerPage nc=new NewCustomerPage(driver);
		nc.setCustomer();
		nc.setCusDob("01", "15", "1996");
		
		String tel=randomNumber();
		nc.setTel(tel);
		String email=randomString()+"@gmail.com";
		nc.setEmail(email);
		getScreenshot(driver,"loginTest");
		
	}
	
}
