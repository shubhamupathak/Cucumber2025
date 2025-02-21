package com.basic.ShareDataSD;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SharedClass 
{
	WebDriver driver;

	@Before
	public WebDriver Setup()
	{
		try
		{
			if(driver==null)
			{
				System.setProperty("webdriver.chrome.driver","C:\\MyFiles\\Cucumber\\Driver\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver;
	}

	@After
	public void CloseSetup()
	{
		try
		{
			driver.quit();
			driver=null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
