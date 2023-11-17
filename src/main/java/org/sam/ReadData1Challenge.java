package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1Challenge {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\win7\\eclipse-workspace\\MavenProject\\Excel\\SampleData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mySheet = wb.getSheet("Data");
		Row row = mySheet.getRow(1);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		
	}

}
