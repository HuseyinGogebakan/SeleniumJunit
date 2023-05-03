package Tasks.Day10;

import Utilities.Base;
import io.opentelemetry.sdk.trace.internal.data.ExceptionEventData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C03 extends Base {

    @Test
    public void test01(){
        /*
        Go to URL: https://rangeslider.js.org/
        Shift 100 units to the right and 100 units to the left on the horizontal axis.
         */
        driver.get("https://rangeslider.js.org/");
        WebElement element = driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));

        actions.dragAndDropBy(element,100,0).perform();
        actions.dragAndDropBy(element,-100,0).perform();

        driver.quit();
    }

    @Test
    public  void test02() throws InterruptedException {

        /*
        Go to URL: http://demo.guru99.com/test/drag_drop.html
        Drag and drop the BANK button to the Account section in DEBIT SIDE
        Drag and drop the SALES button to the Account section in CREDIT SIDE
        Drag and drop the 5000 button to the Amount section in DEBIT SIDE
        Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
        Verify the visibility of Perfect text.
         */

        driver.get("http://demo.guru99.com/test/drag_drop.html");



        Thread.sleep(6000);
        //driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER);

        Thread.sleep(1000);
        WebElement element01= driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
        WebElement element02= driver.findElement(By.xpath("//li[@class='block15 ui-draggable']"));
        WebElement element03= driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
        WebElement element04= driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[2]"));
        WebElement shoppingcart = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        WebElement shoppingcartsale = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        WebElement shoppingcartdebitleft = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
        WebElement shoppingcartright = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

        actions.dragAndDrop(element01,shoppingcart).perform();
        Thread.sleep(1000);
        actions.dragAndDrop(element03,shoppingcartsale).perform();
        Thread.sleep(1000);
        actions.dragAndDrop(element02,shoppingcartdebitleft).perform();
        Thread.sleep(1000);
        actions.dragAndDrop(element04,shoppingcartright).perform();
        driver.quit();
    }



    @Test
    public void test03(){
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'][1]")).click();
    }
}
