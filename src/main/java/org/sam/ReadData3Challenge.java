package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData3Challenge {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\win7\\eclipse-workspace\\MavenProject\\Excel\\Read Data 3 Challenge.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mySheet = wb.getSheet("readdata3");
		
		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
			Row row = mySheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				
				if (cellType == 1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MMMM-yyyy");
					String format = s.format(dateCellValue);
					System.out.println(format);
				}
				else {					
					double numericCellValue = cell.getNumericCellValue();
					long l = (long)numericCellValue;
					System.out.println(l);
				}
			}
		}
	}

}
