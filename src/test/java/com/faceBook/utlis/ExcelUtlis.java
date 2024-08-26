package com.faceBook.utlis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtlis {
	public static List<String> excelRead(String carname,String sheetname) throws Throwable{
		File f = new File(carname);
		List<String> list = new ArrayList<String>();
		try {
			FileInputStream f1 = new FileInputStream(f);
			XSSFWorkbook book = new XSSFWorkbook(f1);
			XSSFSheet sheet = book.getSheet(sheetname);
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
					XSSFCell cell = row.getCell(j);
					String cellstring = cell.toString();
					list.add(cellstring);	
				}	
			}
			
			
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}

}
