package com.ActualTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Actual_PageObject.NewTourFlightPage;

public class TC_FlightTest_001 extends BaseClass{
	@Test
	public void flightTest() throws InterruptedException, IOException
	{
		driver.get(newTourUrl);
		NewTourFlightPage nt=new NewTourFlightPage(driver);
		nt.ClickFlight();
		Thread.sleep(3000);
		nt.ClickOneWay();
		nt.selectOptionFromDrp("London");
		nt.setPassDrp("2");
		
		WebElement onMonth=driver.findElement(By.xpath(" //select[@name='fromMonth']"));
		selectOptionFromDrp(onMonth,"June");
		WebElement onDay=driver.findElement(By.xpath("//select[@name='fromDay']"));
		selectOptionFromDrp(onDay,"28");
		WebElement arraive=driver.findElement(By.xpath(" //select[@name='toPort'] "));
		selectOptionFromDrp(arraive,"New York");
		
		WebElement returnMonth=driver.findElement(By.xpath(" //select[@name='toMonth']"));
		selectOptionFromDrp(returnMonth,"May");
		
		WebElement returnDay=driver.findElement(By.xpath("//select[@name='toDay']"));
		selectOptionFromDrp(returnDay,"18");
		
		WebElement service=driver.findElement(By.xpath(" //input[@value='Business']"));
		service.click();
		WebElement airLine=driver.findElement(By.xpath("//select[@name='airline']"));
		//selectOptionFromDrp(airLine,"Blue Skies Airlines");
		getScreenshot(driver,"flightTest");
		
	}

}
