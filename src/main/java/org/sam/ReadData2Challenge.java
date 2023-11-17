package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData2Challenge {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\win7\\eclipse-workspace\\MavenProject\\Excel\\SampleData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mySheet = wb.getSheet("Data");

		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
			Row row = mySheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
	}

}
