package com.test.testcases;

import org.testng.annotations.Test;

import com.test.dataprovider.Datasource;
import com.test.genrics.Base_Test;
import com.test.pom.Regestrationpage;

//Navigate to application register for new user 
public class Createuser extends Base_Test
{
	@Test(dataProvider="register",dataProviderClass=Datasource.class)
	public void Testcreateuser(String srno,String Registeredmail,String Firstname,String Lastname,String Email,String password,String DOB,String FN,String LN,String Company,String address,String city,String State,String Zipcode,String country ,String additional,String homephone,String mobilephone,String Assignaddress) throws InterruptedException
	{
		Regestrationpage Reg=new Regestrationpage(driver);
		Reg.Signin();
		Thread.sleep(8000);
		Reg.EmailIdTextBox.sendKeys(Registeredmail);
		Reg.Create_Account();
		Thread.sleep(8000);
		Reg.Mrgender();
		Reg.Firstname(Firstname);
		Reg.Lastname(Lastname);
		Reg.Email(Email);
		Reg.password(password);
		//Reg.days_DOB(DOB);           //while fetching date , it converting into other formate
		//Reg.month_DOB(DOB);
		//Reg.year_DOB(DOB);
		Reg.Add_FN(FN);
		Reg.Add_LN(LN);
		Reg.Add_Company(Company);
		Reg.Add_address1(address);
		Reg.Add_city(city);
		Reg.Add_States(State);
		Reg.Add_zipcode(Zipcode);
		Reg.Add_country(country);
		Reg.Additional_info(additional);
		Reg.Homephone(homephone);
		Reg.Mobile_phone(mobilephone);
		Reg.ASS_address(Assignaddress);
		//Reg.Create_Account();					//it is not creating just filling all reqired informations
	} 	
	
}
	