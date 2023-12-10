package com.nit;

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

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\Employee.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();

        /*
        XSSFRow headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("EID");
        headerRow.createCell(1).setCellValue("ENAME");
        headerRow.createCell(2).setCellValue("ESALARY");

        XSSFRow row1=sheet.createRow(1);
        row1.createCell(0).setCellValue("100");
        row1.createCell(1).setCellValue("jia");
        row1.createCell(2).setCellValue("2000");

        XSSFRow row2=sheet.createRow(2);
        row2.createCell(0).setCellValue("101");
        row2.createCell(1).setCellValue("dia");
        row2.createCell(2).setCellValue("3000");
        */


        Scanner scanner=new Scanner(System.in);

        for (int r = 0; r <=3; r++) {
            XSSFRow currentrow=sheet.createRow(r);
            for (int c = 0; c < 3 ; c++) {
                System.out.println("please enter your value: ");
                String value=scanner.next();
                XSSFCell cell=currentrow.createCell(c);
                cell.setCellValue(value);

            }
            
        }

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("done");
    }
}