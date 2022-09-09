package org.issac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lopkn { 
	public static void main(String[] args) throws IOException {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_g_146");
		File file =new File ("C:\\Users\\jose livi\\Desktop\\clasass\\Book1.xlsx");
		FileInputStream fis =new FileInputStream(file);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet("Sheet1");
		Row row =sheet.getRow(0);
		 org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println("stringCellValue");
	}

}
