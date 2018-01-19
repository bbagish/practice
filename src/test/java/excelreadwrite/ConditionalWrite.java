package excelreadwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConditionalWrite {
	public static void main(String[] args) throws IOException {
		String excelPath = "C:/Users/Bagishman/Desktop/EmpData.xlsx";
		FileInputStream in = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(in);
		XSSFSheet worksheet = workbook.getSheet("Sheet2");
		int rowsCount = worksheet.getPhysicalNumberOfRows();
		for (int rownum = 1; rownum < rowsCount; rownum++) {
			String searchItem = worksheet.getRow(rownum).getCell(1).toString();
			if (searchItem.contains("Cucumber")) {
				XSSFCell status = worksheet.getRow(rownum).getCell(2);
				if (status == null) {
					status = worksheet.getRow(rownum).createCell(2);
					status.setCellValue("Pass");
					break;
				} else {
					status = worksheet.getRow(rownum).createCell(2);
					status.setCellValue("Pass");
					break;
				}
			}
		}
		FileOutputStream ExcelWriteFile = new FileOutputStream(excelPath);
		workbook.write(ExcelWriteFile);
		in.close();
		ExcelWriteFile.close();
		workbook.close();
	}
}
