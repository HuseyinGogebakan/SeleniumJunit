package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C04_Actions extends Base {

    @Test
    public void test01(){

        Actions action = new Actions(driver);
        driver.get("https://demoqa.com/buttons");
        WebElement elementdb = driver.findElement(By.id("doubleClickBtn"));
        WebElement elementrg = driver.findElement(By.id("rightClickBtn"));
        WebElement elementclck = driver.findElement(By.xpath("//button[4]"));

        action.doubleClick(elementdb).perform();
        action.contextClick(elementrg).perform();
        action.click(elementclck).perform(); // to get action you need to perform !
    }


}
