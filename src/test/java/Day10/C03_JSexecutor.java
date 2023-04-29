package Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class C03_JSexecutor extends Base {


    @Test
    public void test02() throws InterruptedException {

        driver.get("https://www.amazon.de/");
        JavascriptExecutor js = driver;
        js.executeScript("window.scrollTo(0, 1000)"); // specific
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0, 1000)"); // relative
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0, 0)"); // relative

    }
}
