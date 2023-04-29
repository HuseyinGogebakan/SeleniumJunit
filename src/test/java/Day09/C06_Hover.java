package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C06_Hover extends Base {

    @Test
    public void test02() throws InterruptedException {
        Actions action = new Actions(driver);

        driver.get("https://www.amazon.de/");
        WebElement acttount = driver.findElement(By.id("nav-link-accountList"));
        WebElement account = driver.findElement(By.id("nav-prefetch-yourorders"));
        action.moveToElement(acttount).click(account).perform();


    }
}
