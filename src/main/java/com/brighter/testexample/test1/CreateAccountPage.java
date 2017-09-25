package com.brighter.testexample.test1;

	import org.openqa.selenium.WebDriver;

	public class CreateAccountPage 
	{
		WebDriver driver;


	public String getUrl()
	{
		
		System.out.println("Adding in Branch 2");
		return driver.getCurrentUrl();
		
	}





		public  CreateAccountPage(WebDriver driver)
		{
			this.driver=driver;
		}

		
		
		
		
		
	}


