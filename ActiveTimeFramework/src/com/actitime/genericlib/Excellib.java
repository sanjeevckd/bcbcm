package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excellib {
    
	public String getexceldata(String sName,int rowNum,int colNum) throws InvalidFormatException, IOException {
		  
		  String path="C:\\Users\\Dell\\workspace\\ActiveTimeFramework\\testData\\TestData.xlsx";
		  
		  FileInputStream fis=new FileInputStream(path);
		  
		  Workbook wd=new XSSFWorkbook(fis);
		  
		  Sheet sh= wd.getSheet(sName);
		  
		  Row row= sh.getRow(rowNum);
		  
       String value=row.getCell(colNum).getStringCellValue();
//		  String password=row.getCell(3).getStringCellValue();
//		  String customername=row.getCell(4).getStringCellValue();
		  
//		  System.out.println(Username);
//		  System.out.println(password);
//		 System.out.println(customername);
	     fis.close();
		 return value;
		 
	
}
	public void setExceldata(String sName,int rowNum,int colNum,String data) throws InvalidFormatException, IOException
	{
		String path="C:\\Users\\Dell\\workspace\\ActiveTimeFramework\\testData\\TestData.xlsx";
		 //String path="C:\\Users\\Dell\\workspace\\ActiveTimeFramework\\testData\\TestData.xls";
		  //FileInputStream fis=new FileInputStream(path);
//		  
//		  Workbook wb=WorkbookFactory.create(fis);
//		  
//		 // Sheet sh= wb.getSheet(sName);
//		  
//		  Row row= sh.getRow(rowNum);
//		  Cell cel = row.getCell(colNum);
//		  cel.setCellType(cel.CELL_TYPE_STRING);
//		  FileOutputStream fos = new FileOutputStream(path);
//		  cel.setCellValue(data);
//		  wb.write(fos);
		  
		  FileInputStream fin=new FileInputStream(path);
			
		    Workbook wd=new XSSFWorkbook(fin);
		    
		    Sheet sh=wd.getSheet("Sheet1");
		    
		    Row row=sh.getRow(rowNum);
		    Cell cel=row.createCell(colNum);
		    
		    cel.setCellValue(data);
		    
		    fin.close();
		    
		    FileOutputStream out=new FileOutputStream(path);
		    
		    wd.write(out);
		    out.close();
		  
		  
		  
		  
	}
	
	
}	
