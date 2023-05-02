package Day12;

import Utilities.Base;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Read extends Base {


    @Test
    public void test02() throws IOException {
        String path = System.getProperty("user.dir")+"\\src\\test\\resources\\excelData.xlsx";

        FileInputStream  fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        // calling by the information data

        //wb.getSheet()

        // by index

        Sheet sh1 = wb.getSheetAt(0);

        Row row1 = sh1.getRow(3);// starts form 0

        Cell cell4_6 = row1.getCell(5); // starts form 0

        String str01 = cell4_6.toString();
        System.out.println("str01 = " + str01);

        fis.close();
        wb.close();
    }
}
