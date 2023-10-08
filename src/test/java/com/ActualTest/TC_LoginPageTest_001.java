package com.ActualTest;

import org.testng.annotations.Test;

import com.PageObject.LoginPage;

public class TC_LoginPageTest_001 extends BaseClass{
	@Test
	public void loginTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUser(UserId);
		lp.setpassWord(PassWord);
		lp.clickLogin();
	}

}
