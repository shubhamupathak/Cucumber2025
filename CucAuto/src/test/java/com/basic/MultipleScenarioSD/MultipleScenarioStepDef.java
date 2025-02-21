package com.basic.MultipleScenarioSD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleScenarioStepDef 
{

	WebDriver driver = new ChromeDriver();
	@Given("^User is on HRM login page$")
	public void User_is_on_HRM_login_page()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\MyFiles\\Cucumber\\Driver\\chromedriver-win64\\chromedriver.exe");
			Thread.sleep(3000);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@When("^User enters username$")
	public void User_enters_username()
	{
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@And("^User enters password$")
	public void User_enters_password()
	{
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("^Check username is present in username textbox$")
	public void Check_username_is_present_in_username_textbox()
	{
		try
		{
			String UserNameActual = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
			System.out.println("Actual user name is : " +UserNameActual);
			Assert.assertEquals("Admin", UserNameActual);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("^Check password is present in password textbox$")
	public void Check_password_is_present_in_password_textbox()
	{
		try
		{
			String PasswordActual = driver.findElement(By.xpath("//input[@name='password']")).getAttribute("value");
			System.out.println("Actual password is : " +PasswordActual);
			Assert.assertEquals("admin123", PasswordActual);
			//driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	@When("^User clicks submit button$")
	public void User_clicks_submit_button()
	{
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit' and normalize-space()='Login']")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("^Check user is on dashboard page$")
	public void Check_user_is_on_dashboard_page()
	{
		try
		{
			Thread.sleep(3000);
			WebElement header = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']"));
			boolean IsPresent = header.isDisplayed();
			if(IsPresent==true)
			{
				System.out.println("User is on dashboard page.");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
