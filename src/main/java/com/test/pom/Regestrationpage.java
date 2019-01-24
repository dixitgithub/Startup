package com.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.reporters.jq.BasePanel;

import com.test.genrics.Auto_Constant;
import com.test.genrics.Base_Page;

public class Regestrationpage extends Base_Page
{
	public Regestrationpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(className="login")
	private WebElement SignIn_button;
		
	@FindBy(id="email_create")
	public WebElement EmailIdTextBox;
	
	@FindBy(id="SubmitCreate")
	public WebElement CreateAnAccountButton;
	
	@FindBy(id="id_gender1")
	public WebElement MrRadioButton;
	
	@FindBy(id="id_gender2")
	public WebElement MrsRadioButton;
	
	@FindBy(id="customer_firstname")
	public WebElement FirstNameTextBox;
	
	@FindBy(id="customer_lastname")
	public WebElement LastNameTextBox;
	
	@FindBy(xpath=".//input[@id='email']")
	public WebElement emailTextBox;
	
	@FindBy(id="passwd")
	public WebElement PasswordTextBox;
	
	@FindBy(id="days")
	public WebElement DaysDropDown;
	
	@FindBy(id="months")
	public WebElement MonthsDropDown;
	
	@FindBy(id="years")
	public WebElement YearsDropDown;
	
	
	@FindBy(id="firstname")
	public WebElement Addrs_FirstName_TextBox;
	
	@FindBy(id="lastname")
	public WebElement Addrs_LastName_TextBox;
	
	@FindBy(id="company")
	public WebElement Addrs_Company_TextBox;
	
	@FindBy(id="address1")
	public WebElement Addrs_Address1_TextBox;
	
	@FindBy(id="address2")
	public WebElement Addrs_Address2_TextBox;
	
	@FindBy(id="city")
	public WebElement Addrs_city_TextBox;
	
	@FindBy(id="id_state")
	public WebElement Addrs_State_DropDown;
	
	@FindBy(id="postcode")
	public WebElement Addrs_Zipcode_TextBox;
	
	@FindBy(id="id_country")
	public WebElement Addrs_Country_DropDown;
	
	@FindBy(id="other")
	public WebElement AdditionalInfo_TextBox;
	
	@FindBy(id="phone")
	public WebElement Home_Phone_Textbox;
	
	@FindBy(id="phone_mobile")
	public WebElement Mobile_Phone_Textbox;
	
	@FindBy(id="alias")
	public WebElement Alias_Textbox;
	
	@FindBy(id="submitAccount")
	public WebElement Register_Button;
	
	public void Signin()			//Button
	{
		SignIn_button.click();
	}
	
	public void Email_ID(String Email_ID)
	{
		EmailIdTextBox.sendKeys(Email_ID);
	}
	
	public void Create_Account()		//Button
	{
		CreateAnAccountButton.click();		
	}
	
	public void Mrgender()
	{
		MrRadioButton.click();
	}
	
	public void Mrsgender()
	{
		MrsRadioButton.click();
	}
	
	public void Firstname(String FN)
	{
		FirstNameTextBox.clear();
		FirstNameTextBox.sendKeys(FN);
	}
	
	public void Lastname(String LN)
	{
		LastNameTextBox.clear();
		LastNameTextBox.sendKeys(LN);
	}
	
	public void Email(String Email)
	{
		emailTextBox.clear();
		emailTextBox.sendKeys(Email);
	}
	
	public void password(String password)
	{
		PasswordTextBox.sendKeys(password);
	}
	
	 public void days_DOB(String dt)		//drop down
	 {
		 String []arr=dt.split("-");
		 String days=arr[0];
		 Dropdown(days,DaysDropDown);
	 }
	 
	 public void month_DOB(String mon)		//drop down
	 {
		 String []arr=mon.split("-");
		 String month=arr[1];
		 Dropdown(month, MonthsDropDown);
	 }
	 
	 public void year_DOB(String yr)		//drop down
	 {
		 String[]arr=yr.split("-");
		 String year=arr[2];
		 Dropdown(year, YearsDropDown);
	 }
	 
	 public void Add_FN(String Add_FN)
	 {
		 Addrs_FirstName_TextBox.clear();
		 Addrs_FirstName_TextBox.sendKeys(Add_FN);
	 }
	 
	 public void Add_LN(String Add_LN)
	 {
		 Addrs_LastName_TextBox.clear();
		 Addrs_LastName_TextBox.sendKeys(Add_LN);
	 }
	 
	 public void Add_Company(String Add_Company)
	 {
		 Addrs_Company_TextBox.sendKeys(Add_Company);
	 }
	 
	 public void Add_address1(String Add_address1)
	 {
		 Addrs_Address1_TextBox.sendKeys(Add_address1);
	 }
	 
	 public void Add_address2(String Add_address2)
	 {
		 Addrs_Address2_TextBox.sendKeys(Add_address2);
	 }
	 
	 public void Add_city(String Add_city)
	 {
		 Addrs_city_TextBox.sendKeys(Add_city);
	 }
	 
	 public void Add_States(String State) 			 //dropdown
	 {
		Dropdown(State, Addrs_State_DropDown);
	 }
	 
	 public void Add_zipcode(String Add_zipcode)
	 {
		 
		 Addrs_Zipcode_TextBox.sendKeys(Add_zipcode);
	 }
	 
	 public void Add_country(String Add_country)		//dropdown
	 {
		Dropdown(Add_country, Addrs_Country_DropDown);
	 }
	 
	 public void Additional_info(String Add_additional_info)
	 {
		 AdditionalInfo_TextBox.sendKeys(Add_additional_info);
	 }
	 
	 public void Homephone(String home_phone)
	 {
		 Home_Phone_Textbox.sendKeys(home_phone);
	 }
	 
	 public void Mobile_phone(String Mobile_phone)
	 {
		Mobile_Phone_Textbox.sendKeys(Mobile_phone);
	 }
	 
	 public void ASS_address(String Assign_address)
	 {
		 Alias_Textbox.clear();
		 Alias_Textbox.sendKeys(Assign_address);
	 }
	 
	 public void Register_button()		//button
	 {
		 Register_Button.click();
	 } 
}
