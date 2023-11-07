package com.nopcommerce_Test;

import org.testng.annotations.Test;

import com.NopCommerce_Window1_PageObject.Login_Page;
import com.NopCommerce_Window1_PageObject.Promotion_Campaign_Page;

public class Promotion_Campaign_Test extends BaseClass_NopCommerce{
	
	@Test
	public void campaignTest() throws InterruptedException
	{
		Login_Page lp=new Login_Page(driver);
		lp.clearEmail();
		lp.setEmail(NoCoUserId);
		lp.clearPassWord();
		lp.setPassWord(NoCoPassWord);
		lp.clickButton();
		Thread.sleep(3000);
		Promotion_Campaign_Page pc=new Promotion_Campaign_Page(driver);
		pc.clickPromotion();
		//pc.clickCampaign();
	}

}
