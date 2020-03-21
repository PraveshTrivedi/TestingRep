package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static String TESTDATA_SHEET_PATH ="/Users/pkumar/git/CRMRep/src/main/java/com/crm/qa/testdata/FreeCRMTestData.xlsx";
	static Workbook book;
	static Sheet sheet;
	public void swithToFrame()
	{
		driver.switchTo().frame("String frameName");
	}
	
	public static Object[][] getTestData(String sheetName)
	{
		FileInputStream file=null;
		try{
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try{
			 book = WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][]data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum();i++)
		{
			for(int j=0; j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	
	public static void takeScreenshotAsEnd()
	{
		try{
				TakesScreenshot ts = (TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				String currentDir = System.getProperty("user.dir");
				FileUtils.copyFile(source, new File(currentDir+"/screenshots/"+ System.currentTimeMillis()+".png"));
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

