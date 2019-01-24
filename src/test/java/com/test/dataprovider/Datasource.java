package com.test.dataprovider;

import org.testng.annotations.DataProvider;

import com.test.genrics.Auto_Constant;
import com.test.genrics.Excel;

public class Datasource implements Auto_Constant
{
	@DataProvider(name="register")
	public static Object[][] Register()
	{
		Object [][] result=Excel.readdata(PATH, "Registration");
		return result;
	}
	@DataProvider(name="logins")
	public Object[][] Logins()
	{
		Object[][]result=Excel.readdata(PATH, "Logins");
		return result;
	}
}