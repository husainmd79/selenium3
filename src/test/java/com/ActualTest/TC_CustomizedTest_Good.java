package com.ActualTest;

import org.testng.annotations.Test;

import com.Actual_PageObject.CustomizedStatementPage;
import com.Actual_PageObject.LoginPage;

public class TC_CustomizedTest_Good extends BaseClass{
	@Test
	public void customizedTest()
	{
		driver.get(BaseUrl);

		LoginPage lp=new LoginPage(driver);
		lp.clearUser();
		lp.setUser(UserId);
		lp.clearPassWord();
		lp.setpassWord( PassWord);
		lp.clickLogin();
		CustomizedStatementPage cs=new CustomizedStatementPage(driver);
		cs.ClickCustomized();
		String act=randomNumber();
		cs.setAccount(act);
		cs.setFromDate("06", "15","1995");
	}

}
