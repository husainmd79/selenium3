package com.nopcommerce_Test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.NopCommerce_Window1_PageObject.Login_Page;
import com.NopCommerce_Window1_PageObject.Promotion_Affliate_Page;

public class Ptomotion_Affiliate_Test extends BaseClass_NopCommerce{
	@Test
	public void affiliateTest() throws InterruptedException
	{
		Login_Page lp=new Login_Page(driver);
		lp.clearEmail();
		lp.setEmail(NoCoUserId);
		lp.clearPassWord();
		lp.setPassWord(NoCoPassWord);
		lp.clickButton();
		Thread.sleep(3000);
				
	Promotion_Affliate_Page pa=new Promotion_Affliate_Page(driver);
	pa.clickPromotion();
	Thread.sleep(3000);
	pa.clickAffiliate();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//p[normalize-space()='Affiliates']"));
	pa.clickAddNew();
	String email=randomString()+"@gmail.com";
	pa.setEmail(email);
	pa.setCountry("10");
	
	 String telp=randomNumber();
	 pa.setPhone(telp);            
	  //Another windows
	 pa.clickWindows();
	 
	 
	}
	

}
