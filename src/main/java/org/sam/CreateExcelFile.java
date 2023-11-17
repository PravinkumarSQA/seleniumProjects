package org.sam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\win7\\eclipse-workspace\\MavenProject\\Excel\\createsheet.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newSheet = w.createSheet("Sheet 1");
		Row r0 = newSheet.createRow(0);
		Cell c0 = r0.createCell(0);
		c0.setCellValue("Selenium");
		
		Cell c1 = r0.createCell(1);
		c1.setCellValue("Java");
		
		Cell c2 = r0.createCell(2);
		c2.setCellValue("Data Driven");
		
		Cell c3 = r0.createCell(3);
		c3.setCellValue("POM");
		
		Row r1 = newSheet.createRow(1); 
		
		Cell c10 = r1.createCell(0);
		c10.setCellValue("Appium");
		
		Cell c11 = r1.createCell(1);
		c11.setCellValue("Cucumber");
		
		Cell c12 = r1.createCell(2);
		c12.setCellValue("JUnit");
		
		Cell c13 = r1.createCell(3);
		c13.setCellValue("TestNG");		
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}

}
