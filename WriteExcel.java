package com.test.Methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	private static XSSFWorkbook wb;

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Writeexcel.xlsx");
		wb = new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("sheet1");
		
	//	Row row = ws.getRow(0);
		//Cell cell = row.getCell(0);
	//	String c=cell.getStringCellValue();
		//System.out.println(c);
       // System.out.println(ws.getRow(0).getCell(0));
		
		Row row=ws.createRow(0);
				Cell cell=row.createCell(0);
			cell.setCellType(Cell.CELL_TYPE_STRING);
				
				cell.setCellValue("I LOVE YOU ANJU 1978");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\Writeexcel.xlsx");
		wb.write(fos);
		fos.close();

	}

}
