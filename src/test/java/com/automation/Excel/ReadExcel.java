package com.automation.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		String excelPath = "C:/Users/Bagishman/Desktop/EmpData.xlsx";
		FileInputStream in = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(in);
		XSSFSheet worksheet = workbook.getSheet("Sheet1");
		int rowsCount = worksheet.getPhysicalNumberOfRows();
		System.out.println("number of rows " + rowsCount);
		System.out.println(worksheet.getRow(0).getCell(0));
		for (int row = 1; row < rowsCount; row++) {
			String name = worksheet.getRow(row).getCell(1).toString();
			String department = worksheet.getRow(row).getCell(2).getStringCellValue();
			String ID = worksheet.getRow(row).getCell(0).toString();
			System.out.println(ID + " " + name + " -> " + department);
		}
		in.close();
	}
}
