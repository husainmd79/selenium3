package com.Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports implements ITestListener{
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public ExtentTest test;
	public void onStart(ITestContext context)
	{
		String dateStamp=new SimpleDateFormat("yyyy.MM.dd.hh.ss").format(new Date());
		String repName="myReport"+dateStamp+".html";
		
		spark=new  ExtentSparkReporter(repName);
		spark.config().setDocumentTitle("title of the page");
		spark.config().setReportName("name of the report");
		spark.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("host","localhost");
		extent.setSystemInfo("os", "windows");
		extent.setSystemInfo("tester", "husain");
		extent.setSystemInfo("browser", "chrome");
				
	}
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
				
	}
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		
		String scr=".\\ScreenShot\\"+result.getName()+".png";
		File f=new File(scr);
		if(f.exists())
			try
		{
			test.fail("ScreenShot is below"+test.addScreenCaptureFromPath(scr));
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	public void ontestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));
	}
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}

}














