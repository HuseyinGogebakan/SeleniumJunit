package Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class C02_Jsexecutor extends Base {



    @Test
    public void test01(){

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.get("https://www.google.com/");

       // jse.executeScript("alert(\"Hellow world!\");");
        //jse.executeScript("console.log('Wow thats so cool');");




    }
}
