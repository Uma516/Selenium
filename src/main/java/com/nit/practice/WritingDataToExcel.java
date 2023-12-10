package com.nit.practice;

import com.google.common.io.FileBackedOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingDataToExcel {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\Student.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        XSSFRow headerrow = sheet.createRow(1);

       /*headerrow.createCell(1).setCellValue("sid");
       headerrow.createCell(2).setCellValue("sname");
       headerrow.createCell(3).setCellValue("sfee");
       headerrow.createCell(4).setCellValue("rollno");
         */

        Scanner s = new Scanner(System.in);
        for (int r = 0; r <= 3; r++) {
            XSSFRow currentrow = sheet.createRow(r);
            for (int c = 0; c < 3; c++) {
                System.out.println("pls enter your data: ");
                String value = s.next();
                XSSFCell cell = currentrow.createCell(c);
                cell.setCellValue(value);
            }
            workbook.write(file);
            workbook.close();
            file.close();
        }
        System.out.println("Data written in the Excel sheet");
    }
}