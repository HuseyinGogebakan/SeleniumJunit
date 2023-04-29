package Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C01 extends Base {

    @Test
    public  void test01() throws InterruptedException {
        driver.get("https://www.google.com/");

        driver.findElement(By.id("L2AGLb")).click();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.name("q"));

        actions.moveToElement(element).click().sendKeys("chatGpt");

        actions.moveToElement(element).click().sendKeys("chat").
                keyDown(Keys.SHIFT).
                sendKeys("gpt").
                keyUp(Keys.SHIFT)
                .perform();
    }

}
