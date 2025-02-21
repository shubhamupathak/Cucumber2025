package com.basic.DataTableSD;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DataTableStepDef 
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

	@When("^User enters following data$")
	public void User_enters_following_data(DataTable table)
	{
		try
		{
			// Convert DataTable to a List of Lists
			List<List<String>> gpttable = table.asLists();

			// Get the number of rows
			int rowCount = gpttable.size(); // Includes the header row
			
			// If you want only data rows (excluding the header), subtract 1
			int dataRowCount = rowCount - 1;
			System.out.println("Total number of data rows in table :" +dataRowCount);
			
			int columnCount = gpttable.get(0).size(); // Number of columns from the header row
			System.out.println("Total number of columns in table :" +columnCount);

			for(int i=1;i<=dataRowCount;i++)
			{
				int j=0;
				String UserName=gpttable.get(i).get(j);
				j++;
				String Password=gpttable.get(i).get(j);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='username']")).clear();
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UserName);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='password']")).clear();
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
