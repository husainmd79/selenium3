package com.ActualTest;

import org.testng.annotations.Test;

import com.PageObject.CustomizedStatementPage;
import com.PageObject.LoginPage;

public class TC_CustomizedTest_001 extends BaseClass{
	@Test
	public void customizedTest()
	{

		LoginPage lp=new LoginPage(driver);
		lp.setUser(UserId);
		lp.setpassWord(PassWord);
		lp.clickLogin();
		CustomizedStatementPage cs=new CustomizedStatementPage(driver);
		cs.ClickCustomized();
		String act=randomNumber();
		cs.setAccount(act);
		cs.setFromDate("06", "15","1995");
	}

}
