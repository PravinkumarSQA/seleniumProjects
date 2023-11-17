package org.sam;

import java.io.IOException;

public class DataDriven6 extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		createNewExcelFile(0, 0, "Selenium");
		createCell(0, 1, "Java");
		createCell(0, 2, "Data Driven");
		createCell(0, 3, "POM");
		
		createRow(1, 0, "Appium");
		createCell(1, 1, "Cucumber");
		createCell(1, 2, "JUnit");
		createCell(1, 3, "TestNG");
	}

}
