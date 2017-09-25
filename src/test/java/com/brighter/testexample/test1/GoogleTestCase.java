package com.brighter.testexample.test1;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleTestCase {

	WebDriver driver;
	HomePage hp;
	CreateAccountPage cap;

	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\CoreFiles\\chromedriver.exe");
		driver= new ChromeDriver();
		String url= "https://www.google.com/";
		driver.get(url);
		hp= new HomePage(driver);
		cap= new CreateAccountPage(driver);

	}

	@Test(priority=0, testName = "TC01") 
	public void getToAccountForm()  
	{
		try
		{
			hp.clickOnGmail();
			hp.clickCreateAccount();}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	@Test(priority=1, testName = "TC02") 
	public void verifyForm()  
	{
		try
		{
			
			assertTrue(cap.getUrl().contains("gmail"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}

}