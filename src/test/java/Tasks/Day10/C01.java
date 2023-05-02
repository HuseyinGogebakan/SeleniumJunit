package Tasks.Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Files;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class C01 extends Base {


    @Test
    public  void  test01(){
        driver.get("https://www.monsterindia.com/seeker/registration");

        String path = System.getProperty("user.dir")+"\\Resume.pdf";

        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
    }

    @Test
    public void  test02() throws InterruptedException {

        /*
        Go to URL: http://facebook.com
getCookies,
addCookie,
deleteCookieNamed,
deleteAllCookies.
         */

        driver.get("http://facebook.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
        Thread.sleep(1000);
        Set<Cookie> cookies = driver.manage().getCookies();
        Iterator<Cookie> cookieIterator = cookies.iterator();
        while (cookieIterator.hasNext()){
            Cookie ck = cookieIterator.next();
            System.out.println(ck.getName()+" : "+ck.getValue());
        }
        Cookie is_Night_Mode = new Cookie("Nigthmd","enabled");
        driver.manage().addCookie(is_Night_Mode);
        driver.manage().deleteCookieNamed("datr");
        System.out.println(driver.manage().getCookies().size());
        driver.manage().deleteAllCookies();
        System.out.println(driver.manage().getCookies().size());

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.visibilityOfElementLocated())
        driver.quit();
        /*
        websites can prevent you from retrieving certain cookies, specifically by using HttpOnly cookies.

        HttpOnly is a flag that can be included in a Set-Cookie HTTP response header. If this flag is set, then the cookie will not be accessible through client-side scripts,
        including JavaScript, which Selenium controls. This is a security measure to help prevent cross-site scripting (XSS) attacks.
         */

    }
}
