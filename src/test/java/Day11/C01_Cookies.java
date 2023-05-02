package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Iterator;
import java.util.Set;

public class C01_Cookies extends Base {


    @Test
    public void test01() {

        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        Set<Cookie> cookies = driver.manage().getCookies();
        int size = cookies.size(); // 2
        printcookies(cookies);
        System.out.println("Cookies size is  " + size);


        // Add Cookie

        Cookie cookieToAdd = new Cookie("Dessert", "Spaghetti ice cream");

        driver.manage().addCookie(cookieToAdd);// 3

        System.out.println();
        printcookies(driver.manage().getCookies());
        Assert.assertEquals("Cookie ekleme islemi basarisiz", size+1, driver.manage().getCookies().size());

        Assert.assertEquals(cookieToAdd.getValue(), driver.manage().getCookieNamed(cookieToAdd.getName()).getValue());
        // delete a cookie
        driver.manage().deleteCookie( driver.manage().getCookieNamed("protein"));
        // delete all cookies
        driver.manage().deleteAllCookies();

    }



    public void printcookies(Set<Cookie> cookies){

        Iterator<Cookie> itcookies = cookies.iterator();

        while (itcookies.hasNext()) {
            Cookie currentcookie = itcookies.next();


            System.out.println(currentcookie.getName() + " :  " + currentcookie.getValue());
        }

    }
}
