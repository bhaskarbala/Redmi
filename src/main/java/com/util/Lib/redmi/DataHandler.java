package com.util.Lib.redmi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataHandler {
	
	String pathDataZoho="./TestData/ZohoCrmTestCase.xlsx";
	String propertiesFileAddress="./TestData/redmidata.properties";
	public String getDataFromePropertiesFile(String key) throws Throwable {
		
	FileInputStream fis=new FileInputStream(propertiesFileAddress);
	Properties pro=new Properties();
	pro.load(fis);
	String data =pro.getProperty(key);
	return data;
	}
	public String getDataForExcelFile(String SheetName,int indexRow,int indexColum) throws Throwable, Throwable {
		/*
		 * 
		 */
		/*  java create object for physical file   */
		FileInputStream file=new FileInputStream(pathDataZoho);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh=wb.getSheet(SheetName);
		Row rh=sh.getRow(indexRow);
		Cell cell=rh.getCell(indexColum);
	    String data=cell.toString();
		 wb.close();
		return data;
	}
	
	public void setDataForexcelFile(String SheetName,int row,int col,String data) throws Throwable, Exception {
		
	
		FileInputStream file=new FileInputStream(pathDataZoho);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh=wb.getSheet(SheetName);
		Row rh=sh.getRow(row);
		Cell ce=rh.createCell(col);
		ce.setCellValue(data);
	    FileOutputStream fos=new FileOutputStream(pathDataZoho);
	    wb.write(fos);
	    wb.close();
		
	}
	public Object[][] getDataSameTestCase(String sheetname) throws Throwable {
		
		FileInputStream fis=new FileInputStream(pathDataZoho);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet(sheetname);
		Object obj[][]=new Object[st.getLastRowNum()][st.getRow(0).getLastCellNum()];
		for(int i=0;i<=st.getLastRowNum();i++) {
			for(int k=0; k<=st.getRow(i).getLastCellNum();k++) {
				obj[i][k]=st.getRow(i+1).getCell(k).toString();
			}
		}
		return obj;
	}
}
