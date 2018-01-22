package com.automation.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {

		String excelPath = "C:/Users/Bagishman/Desktop/EmpData.xlsx";
		FileInputStream in = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(in);
		XSSFSheet worksheet = workbook.getSheet("Sheet2");
		int rowsCount = worksheet.getPhysicalNumberOfRows();
		System.out.println("rowsCount: " + rowsCount);

		XSSFCell cell = worksheet.getRow(5).getCell(1);
		if (cell == null) {
			cell = worksheet.getRow(5).createCell(1);
		}
		cell.setCellValue("Fail");
		FileOutputStream out = new FileOutputStream(excelPath);
		workbook.write(out);
		in.close();
		out.close();
	}
}