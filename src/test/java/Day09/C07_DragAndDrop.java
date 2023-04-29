package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C07_DragAndDrop extends Base {

    @Test
    public void test01(){
        Actions actions = new Actions(driver);

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement italy = driver.findElement(By.id("box106"));
        WebElement wshington = driver.findElement(By.id("box3"));

        WebElement wshi = driver.findElement(By.id("box103"));

        //drag and drop
        actions.dragAndDrop(rome,italy).perform();


        // drag hold and drop

        actions.clickAndHold(wshington).moveToElement(wshi).release().perform();

        driver.quit();
    }
}
