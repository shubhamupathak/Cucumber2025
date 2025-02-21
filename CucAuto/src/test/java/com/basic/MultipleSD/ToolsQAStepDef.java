package com.basic.MultipleSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToolsQAStepDef 
{

	WebDriver driver = new ChromeDriver();
	@Given("^User need to launch given URL$")
	public void User_need_to_launch_given_URL()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\MyFiles\\Cucumber\\Driver\\chromedriver-win64\\chromedriver.exe");
			Thread.sleep(3000);
			driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("^Check keyword \"([^\"]*)\" header is present in searchbox")
	public void Check_keyword_is_present_in_searchbox(String Keyword)
	{
		try
		{
			WebElement ActualKey = driver.findElement(By.xpath("//h1[normalize-space()='Selenium Tutorial']"));
			boolean IsPresent = ActualKey.isDisplayed();
			if(IsPresent==true)
			{
				System.out.println("URL is correct");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
