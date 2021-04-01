package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public XSSFWorkbook workbook;
	public XSSFSheet sheets;
	
	public ExcelReader(String path) {
		
		File f=new File(path);
		try {
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String getData(int SheetIndex, int row, int cell) {
		sheets=workbook.getSheetAt(SheetIndex);
		String celldata=sheets.getRow(row).getCell(cell).getStringCellValue();
		return celldata;
	}
	
	public int getLastRowCount(int sheetIndex) {
		int lastrows=sheets.getLastRowNum();
		return lastrows;
	}
	
}
