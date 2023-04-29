package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;

import java.security.Key;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle extends Base {

    @Test
    public void test01() throws InterruptedException {

        // across the tabs you can switch by using window method + index
        // or create new one
     driver.get("https://www.amazon.de/");

        System.out.println("Amazon windowhandel is "+ driver.getWindowHandle());
        //driver.switchTo().newWindow(WindowType.WINDOW);
     driver.switchTo().newWindow(WindowType.TAB);
     driver.get("https://www.linkedin.com/");
        System.out.println("Linkedin window handel is "+driver.getWindowHandle());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Opensource demo is "+driver.getWindowHandle());

        driver.quit();
    }

    @Test
    public void test02(){


        String firstkey = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);


        String second_key = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        String thirdkey = driver.getWindowHandle();


        driver.switchTo().window(second_key);
        driver.get("https://www.linkedin.com/");

        driver.switchTo().window(thirdkey);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.switchTo().window(firstkey);
        driver.get("https://www.amazon.de/");

       Set<String> i = driver.getWindowHandles();
       Iterator<String> it = i.iterator();

        driver.quit();


    }

    @Test
    public void test12(){
        driver.get("https://login.lms.uk.net/login/");

        WebElement element = driver.findElement(By.id("gdpr"));
        actions.moveToElement(element).keyDown(Keys.SHIFT).click().keyUp(Keys.SHIFT).perform();// !

        Set<String> i = driver.getWindowHandles();
        Iterator<String> it = i.iterator();
        System.out.println(driver.getTitle());

        while (it.hasNext()){
            String x = it.next();
            driver.switchTo().window(x);
            System.out.println(driver.getTitle());
        }

    }

    @Test
    public void test13(){
        driver.get("https://www.netflix.com/be/login");

        driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("bahadiiryoruk1234@gmail.com");
       WebElement element =  driver.findElement(By.xpath("//input[@name='password']"));











       element.sendKeys("G0571g0571.");
       element.submit();
    }
}
