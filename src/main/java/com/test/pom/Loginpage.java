package com.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.test.genrics.Base_Page;

public class Loginpage extends Base_Page 
{
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath=".//input[@id='email']")
	public WebElement UsernameTextBox;
	
	@FindBy(xpath=".//input[@id='passwd']")
	public WebElement PasswordTextBox;
	
	@FindBy(xpath=".//button[@id='SubmitLogin']")
	public WebElement LoginButton;
	
	@FindBy(xpath=".//a[@title='Log in to your customer account']")
	public WebElement SignIn_Button;
	
	@FindBy(xpath=".//div[@class='alert alert-danger']")
	public WebElement ErrorDiv;
	
	public void Sign_button()
	{
		SignIn_Button.click();
	}
	
	public void username(String username)
	{
		UsernameTextBox.sendKeys(username);
	}
	
	public void password(String password)
	{
		PasswordTextBox.sendKeys(password);
	}
	
	public void Login()
	{
		LoginButton.click();
	}
	
	public void errordiv()
	{
		VerifyElement(ErrorDiv, "Error message");
	}
}	


