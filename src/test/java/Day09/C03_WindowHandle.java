package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class C03_WindowHandle extends Base {

    @Test
    public void test01(){
        driver.get("https://www.amazon.de/");


        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Set<String> windowhandels = driver.getWindowHandles();
        Iterator<String>  i = windowhandels.iterator();
        while (i.hasNext()){
            String current = i.next();
            driver.switchTo().window(current);
            System.out.println("current is "+driver.getWindowHandle());

            if (driver.getTitle().toLowerCase().contains("amazon")){
                break;
            }
        }
        driver.findElement(By.id("tabtwosearch")).sendKeys("you have found it");



    }
}
