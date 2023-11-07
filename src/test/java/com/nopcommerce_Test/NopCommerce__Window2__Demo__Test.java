package com.nopcommerce_Test;

import java.util.Set;

import org.testng.annotations.Test;

import com.NopCommerce_Window1_PageObject.Login_Page;
import com.NopCommerce__Window2__PageObject.NopCommerce__Window_Page;

public class NopCommerce__Window2__Demo__Test extends  BaseClass_NopCommerce{
	@Test
	public void window2DemoTest() throws InterruptedException
	{
		Login_Page lp=new Login_Page(driver);
		lp.clearEmail();
		lp.setEmail(NoCoUserId);
		lp.clearPassWord();
		lp.setPassWord(NoCoPassWord);
		lp.clickButton();
		Thread.sleep(3000);
		
		NopCommerce__Window_Page nw=new NopCommerce__Window_Page(driver);
		nw.clickWindow2();
		//nw.clickVewDemo();
		Set<String>allWindow=driver.getWindowHandles();
		for(String wind:allWindow)
		{
			String title=driver.switchTo().window(wind).getTitle();
			System.out.println(title);
			//if(title.contains("Free and open-source eCommerce platform"))
			
		}
		driver.quit();
		
		
	}
	

}
