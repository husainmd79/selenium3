package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig()
	{
		String src=".//Configuration//config.properties";
		try
		{
			FileInputStream file=new FileInputStream(src);
			pro=new Properties();
			pro.load(file);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getGuru99Url()
	{
		String guru=pro.getProperty("BaseUrl");
		return guru;
	}
	public String guruUserId()
	{
		String user=pro.getProperty("UserId");
		return user;
	}
	public String getJQureyUrl()
	{
		String query=pro.getProperty("JqueryUrl");
		return query;
	}
	public String getNewTourUrl()
	{
		String Tour=pro.getProperty("newTourUrl");
		return Tour;
	}
	public String setPassWord()
	{
		String pwd=pro.getProperty("PassWord");
		return pwd;
	}
	

}







