package org.issac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jkolp {
	public static void main(String[] args) throws IOException {
		
		File file =new File ("C:\\oopo\\Book1.xlsx");
		FileInputStream fis =new FileInputStream(file);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet("Sheet1");
		
		Row row =sheet.getRow(0);
		 Cell cell = row.getCell(0);
		 String stringCellValue = cell.getStringCellValue();
		 System.out.println(stringCellValue);
		 
		 Cell cell1 = row.getCell(1);
		 String stringCellValue1 = cell1.getStringCellValue();
		 System.out.println(stringCellValue);
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		 driver.get("https://demoqa.com/automation-practice-form");
		WebElement leon = driver.findElement(By.id("firstName"));
		leon.sendKeys(stringCellValue);
		WebElement leon2 = driver.findElement(By.id("lastName"));
		leon2.sendKeys(stringCellValue1);
		WebElement leon3 = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		leon.click();
		
	}

}
