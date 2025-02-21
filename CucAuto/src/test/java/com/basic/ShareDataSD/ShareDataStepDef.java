package com.basic.ShareDataSD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ShareDataStepDef 
{
	WebDriver driver;
	
	public ShareDataStepDef(SharedClass SC)
	{
		driver = SC.Setup();
	}
	@Given("^User is on HRM login page$")
	public void User_is_on_HRM_login_page()
	{
		try
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("^User enters \"([^\"]*)\" as username$")
	public void User_enters_username(String UserName)
	{
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UserName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@And("^User enters \"([^\"]*)\" as password$")
	public void User_enters_password(String Password)
	{
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
