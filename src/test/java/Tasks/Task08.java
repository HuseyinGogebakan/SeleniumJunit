package Tasks;

import Utilities.Base;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task08 extends Base {

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.youtube.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));


        driver.close();
    }
}
