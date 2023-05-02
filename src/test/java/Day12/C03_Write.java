package Day12;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03_Write {

    @Test
    public void test01() throws IOException {
        String path = System.getProperty("user.dir")+"\\src\\test\\resources\\excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        Sheet sht = wb.createSheet("TestAutomation");

        Row row = sht.createRow(0);
        Cell cell01 = row.createCell(0);
        Cell cell02 = row.createCell(1);

        cell01.setCellValue("Name");
        cell02.setCellValue("Price");
        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);
        fis.close();
        fos.close();
        wb.close();
    }
}
