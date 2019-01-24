package com.test.genrics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_Constant
{
	protected WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
	System.setProperty(GECKO_KEY, GECKO_VALUE);
	driver=new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php");
	}
	//@AfterMethod
	public void closeapp()
	{
		driver.quit();
	}
}
