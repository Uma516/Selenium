package com.nit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {

        FileInputStream file=new FileInputStream(System.getProperty("user.dir") + "\\TestData\\Employee.xlsx");

        XSSFWorkbook workbook=new XSSFWorkbook(file);

        XSSFSheet sheet=workbook.getSheet("Sheet0");

        int totalRows=sheet.getLastRowNum();
        int totalCells=sheet.getRow(1).getLastCellNum();

        System.out.println("Total number of Rows in Employee: " + totalRows);
        System.out.println("Total number of Cells in Row1: "+ totalCells);

        for (int r = 0; r <= totalRows; r++) {
            XSSFRow currentRow=sheet.getRow(r);

            for (int c = 0; c < totalCells; c++) {
                XSSFCell cell=currentRow.getCell(c);
                String value=cell.toString();
                System.out.print(value+"           ");
            }
            System.out.println();
        }
    }
}





