package com.test.genrics;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
public class Base_Page 
{
public WebDriver driver;
	public Base_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void VerifyTitle(String title)
	{
		try{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(title));
			Reporter.log("Title is Matching",true);
		}
		catch(Exception e){
			Reporter.log("Title is not matching",true);
		}
	}
	public void VerifyElement(WebElement ele,String message)
	{
		try{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		Reporter.log(message+" is displayed",true);
		}
		catch(Exception e){
		Reporter.log(message+" is not displayed ",true);	
		}
	}
	public void Dropdown(String text,WebElement ele)
	{
		Select sel=new Select(ele);
		List<WebElement> options = sel.getOptions();
		for (WebElement option : options) 
		{
			if (option.getText().contains(text));
			{
				option.click();
				break;
			}
		}
	}
}
