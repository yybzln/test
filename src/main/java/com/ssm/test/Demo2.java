package com.ssm.test;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("yyb's sheet01");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue(1);
        CellStyle cellStyle = wb.createCellStyle();
        CreationHelper creationHelper = wb.getCreationHelper();
        cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy/MM/dd"));
        row.createCell(5).setCellValue(new Date());
        cell.setCellStyle(cellStyle);

        FileOutputStream out = new FileOutputStream("e:\\yyb03.xls");
        wb.write(out);
        out.close();
    }
}
