package com.ssm.test;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Workbook wb = new HSSFWorkbook();
        wb.createSheet("yyb's sheet01");
        wb.createSheet("yyb's sheet02");
        FileOutputStream out = new FileOutputStream("e:\\yyb01.xls");
        wb.write(out);
        out.close();

    }
}
