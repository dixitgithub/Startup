package com.test.genrics;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;

public class Excel implements Auto_Constant
{
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;
	public static Object[][]readdata(String path,String sheetname)
	{
		try {
			fis = new FileInputStream(path);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e)
		{
			Reporter.log("Could not read the excel file",true);
		} 
		 //load the work book
		int totalrow =wb.getSheet(sheetname).getLastRowNum();
		sheet=wb.getSheet(sheetname); //load sheet in which data is stored
		row=sheet.getRow(0);
		int totalcolumn=row.getLastCellNum();
		System.out.println(totalcolumn+" "+ totalrow);
		Object data[][]=new Object[totalrow][totalcolumn];
		int Ai=0;
		for (int i = 1; i <=totalrow; i++,Ai++)
		{
			int Aj=0;
			for (int j = 0; j <totalcolumn; j++,Aj++)
			{
				data[Ai][Aj]=getdata(i, j);
			}
		}
		return data;
	}
	public static String getdata(int row ,int coll)
	{	
		cell=sheet.getRow(row).getCell(coll); // feth the data from cell
			if (cell==null)
		{
			return "";
		}
		else if (cell.getCellTypeEnum()==CellType.STRING) //if string 
		{
			return cell.getStringCellValue(); //it will return the string
		}
		else if (HSSFDateUtil.isCellDateFormatted(cell))
		{
			DateFormat dt = new SimpleDateFormat("DD/MM/YY");
			Date date = cell.getDateCellValue();
			return dt.format(date);
		}
		else if (cell.getCellTypeEnum()==CellType.NUMERIC||cell.getCellTypeEnum()==CellType.FORMULA) //if numeric or contains formula
		{
			 return String.valueOf(cell.getNumericCellValue()); //converting numeric or formula into string
		}
	
		return null;
	}
	
}
