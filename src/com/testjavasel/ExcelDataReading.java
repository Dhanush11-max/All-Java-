package com.testjavasel;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReading {

	public static void main(String[] args) throws Exception {
		
		// Specifying the location of excel file
		File src = new File("C:\\Users\\dines\\Downloads\\TestData.xlsx");
		
		// Loading Excel file
		FileInputStream fis = new FileInputStream(src);
		
		// Loading workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		// Loading work-sheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		// printing sheet name
		System.out.println(sh.getSheetName());
		
		// Printing "password" text from excel [ As this work on index--> Index starts from 'Zero' (0) ]
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		
		// Printing "Email ID" text from excel
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		// Printing float/double from excel
		System.out.println(sh.getRow(1).getCell(2).getNumericCellValue());
		
		// Printing int from excel
		System.out.println((int)sh.getRow(3).getCell(2).getNumericCellValue());

		// Printing total number of Rows --> 1st Way
		System.out.println("Total Rows :" +sh.getPhysicalNumberOfRows());
		
		// Printing total number of Rows --> 2nd Way
		System.out.println("Total Rows :" +(sh.getLastRowNum()+1));
		
		// Printing total number of Column --> 1st Way
		System.out.println("Total Columns :" +sh.getRow(1).getLastCellNum());
		
		// Printing total number of Column --> 2nd Way
		System.out.println("Total Columns :" +sh.getRow(1).getPhysicalNumberOfCells());
		
		// Real time implementation by using FB
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		// Entering the User-name and Password from Excel
		String str1 = sh.getRow(1).getCell(0).getStringCellValue();
		String str2 = sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(str1);
		driver.findElement(By.id("pass")).sendKeys(str2);
	}
}
