package com.nopcommerce_Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.NopCommerce_Window1_PageObject.Login_Page;
import com.NopCommerce_Window1_PageObject.Promotion_Discount_Page;

public class Promotion_Discount_Test extends BaseClass_NopCommerce{
	@Test
	public void discountTest() throws InterruptedException
	{
		
		Login_Page lp=new Login_Page(driver);
		lp.clearEmail();
		lp.setEmail(NoCoUserId);
		lp.clearPassWord();
		lp.setPassWord(NoCoPassWord);
		lp.clickButton();
		Thread.sleep(3000);
		
		Promotion_Discount_Page pp=new Promotion_Discount_Page(driver);
		pp.clickPromotion();
		//Thread.sleep(3000);
		pp.clickDiscount();
		pp.clickStartDate();
		pp.clickAddNew();
		pp.clickChkBox1();
		pp.setDropDown("10");
		String cost="15";
		while(true)
		{
		String text=driver.findElement(By.xpath(" //input[@title='0.0000 USD']")).getText();
		if(text.equals(cost))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath(" //div[@id='pnlDiscountAmount']//span[@class='k-icon k-i-arrow-60-up']")).click();
			break;
		
		}
				
	}

}

}























