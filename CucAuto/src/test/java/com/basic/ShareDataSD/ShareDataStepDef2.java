package com.basic.ShareDataSD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ShareDataStepDef2 
{
	WebDriver driver;
	public ShareDataStepDef2(SharedClass SC)
	{
		driver = SC.Setup();
	}
	
	@Then("^Check username \"([^\"]*)\" is present in username textbox$")
	public void Check_username_is_present_in_username_textbox(String UserName)
	{
		try
		{
			String UserNameActual = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
			System.out.println("Actual user name is : " +UserNameActual);
			Assert.assertEquals(UserName, UserNameActual);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("^Check password \"([^\"]*)\" is present in password textbox$")
	public void Check_password_is_present_in_password_textbox(String Password)
	{
		try
		{
			String PasswordActual = driver.findElement(By.xpath("//input[@name='password']")).getAttribute("value");
			System.out.println("Actual password is : " +PasswordActual);
			Assert.assertEquals(Password, PasswordActual);
			//driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
