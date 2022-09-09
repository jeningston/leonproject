package org.issac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KOL {

	public static void main(String[] args) throws IOException  {
		File file =new File ("C:\\kiya\\ret.xlsx");
		FileOutputStream fs =new FileOutputStream(file);
		Workbook w=new XSSFWorkbook();
		Sheet Createsheet = w.createSheet("fristSheet");
		
		Row Createrow =Createsheet.getRow(0);
		 Cell Createcell = Createrow.getCell(0);
		 Createcell.setCellValue("leon");
		 w.write(fs);
		
	}}