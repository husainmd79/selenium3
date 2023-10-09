package com.ActualTest;

import org.testng.annotations.Test;

import com.PageObject.LoginPage;
import com.PageObject.NewCustomerPage;

public class TC_LoginPageTest_001 extends BaseClass{
	@Test
	public void loginTest()
	{
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
		
	}
	
}
