package Tasks.Day10;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C02 extends Base {

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://get.foundation/sites/docs-v5/components/range_slider.html");
        WebElement first_slider = driver.findElement(By.xpath("(//span[@class='range-slider-handle'])[2]"));

        int slideprev =  Integer.parseInt(first_slider.getAttribute("aria-valuenow"));

        actions.dragAndDropBy(first_slider,-34,0).perform();
        Thread.sleep(2000);
       actions.moveToElement(first_slider).clickAndHold().moveByOffset(33,0).release().perform();

        int sliderafter =  Integer.parseInt(first_slider.getAttribute("aria-valuenow"));

        System.out.println("current postioion of slider is " + sliderafter);
        Assert.assertEquals(slideprev,sliderafter);

        driver.quit();
    }
}
