package com.test.testcases;

import org.testng.annotations.Test;

import com.test.genrics.Base_Test;
import com.test.pom.Loginpage;
import com.test.dataprovider.Datasource;

//Test case :Navigate to the application and try to login with invalid creditials and verify proper error message is displayed.
public class InvalidUserlogin extends Base_Test
{
	@Test(dataProvider="logins",dataProviderClass=Datasource.class)
	public void TestInvalidUserlogin(String username,String password)
	{
		Loginpage log=new Loginpage(driver);
		log.VerifyTitle("My Store");
		log.Sign_button();
		log.VerifyTitle("Login - My Store");
		log.username(username);				//invalid username
		log.password(password);				//invalid password
		log.Login();
		log.errordiv();					
	}
}
