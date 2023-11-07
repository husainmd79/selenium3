package com.ActualTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Actual_PageObject.SelectMenuPage;

public class TC_SelectMenu_DropDown_withoutSelect_Good extends BaseClass{
	@Test
	public void dropDownWithoutSelect() throws InterruptedException
	{
		driver.get(JqueryUrl);
		SelectMenuPage sm=new SelectMenuPage(driver);
		sm.clickSelectMenu();
		sm.setIframe();
		sm.clickSpeed();
		List<WebElement>allSpeed=driver.findElements(By.xpath("//ul[@id='speed-menu']//li"));
		getOptionFromDropDown(allSpeed,"Fast");
		
		sm.clickNumber();
		List<WebElement>allNumber=driver.findElements(By.xpath(" //ul[@id='number-menu']//li"));
		getOptionFromDropDown(allNumber,"10");
	}

}
