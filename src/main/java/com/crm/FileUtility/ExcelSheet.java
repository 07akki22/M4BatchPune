package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	
	public static String data(String Organization,int row,int column) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("D:\\Automation\\GiftCard.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(Organization);
		String data = sheet.getRow(row).getCell(column).toString();
		
		return data;
	}
}
