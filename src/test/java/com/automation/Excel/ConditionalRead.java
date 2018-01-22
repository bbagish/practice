package com.automation.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConditionalRead {
	public static void main(String[] args) throws IOException {
		String excelPath = "C:/Users/Bagishman/Desktop/EmpData.xlsx";
		FileInputStream in = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(in);
		XSSFSheet worksheet = workbook.getSheet("Sheet2");
		int rowsCount = worksheet.getPhysicalNumberOfRows();
		for (int rownum = 1; rownum < rowsCount; rownum++) {
			String execute = worksheet.getRow(rownum).getCell(0).toString();
			if (execute.equals("Y")) {
				String search = worksheet.getRow(rownum).getCell(1).toString();
				System.out.println("Searching for " + search);
			}
		}
		in.close();

	}
}
