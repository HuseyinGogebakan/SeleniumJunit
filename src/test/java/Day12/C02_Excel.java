package Day12;

import Utilities.Base;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class C02_Excel  {

    @Test
    public  void  test01() throws IOException {

        String path = System.getProperty("user.dir")+"\\src\\test\\resources\\excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);

        HashMap<String,String> data = new HashMap<>();
        Sheet sheet1 =  wb.getSheetAt(0);

        // get Last rowNuM methodu  last used row number

        int  lastRowIndex = sheet1.getLastRowNum();
        int lastrowNumber = sheet1.getPhysicalNumberOfRows(); // length()
        for (int i = 1;i<=lastRowIndex;i++){
            String country = sheet1.getRow(i).getCell(0).toString();
            String value  = sheet1.getRow(i).getCell(1).toString();
            data.put(country,value);

        }
        System.out.println(data);
        wb.close();
        fis.close();
        // if you dont know the  coloumns inner for loop needed
        int rowlast = sheet1.getLastRowNum();
        int coloumn = sheet1.getRow(0).getLastCellNum();

        String [][] arr = new String[rowlast][coloumn];

        for (int i = 0; i< rowlast;i++){

            for (int j = 0; j< coloumn;j++){

                arr[i][j] =  sheet1.getRow(i).getCell(j).toString();
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println(arr[4][0]);




    }
}
