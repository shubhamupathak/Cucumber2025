package com.basic.MultipleSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleStepDef 
{

	WebDriver driver = new ChromeDriver();
	@Given("^User need to launch google site$")
	public void User_need_to_launch_google_site()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\MyFiles\\Cucumber\\Driver\\chromedriver-win64\\chromedriver.exe");
			Thread.sleep(3000);
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("User enters \"([^\"]*)\" as keyword$")
	public void User_enters_keyword(String Keyword)
	{
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).clear();
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keyword);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Then("^Check keyword \"([^\"]*)\" is present in searchbox")
	public void Check_keyword_is_present_in_searchbox(String Keyword)
	{
		try
		{
			String ActualKey = driver.findElement(By.xpath("//textarea[@id='APjFqb']")).getAttribute("value");
			System.out.println("Actual user name is : " +ActualKey);
			Assert.assertEquals(Keyword, ActualKey);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
