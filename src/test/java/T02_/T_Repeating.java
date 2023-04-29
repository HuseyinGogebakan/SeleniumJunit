package T02_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T_Repeating  extends  Testbfaf{

    @Test
    public void testcase01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tweakers.net/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      WebElement kuki =  driver.findElement(By.xpath("// button[@data-action='acceptAll']"));//gibi gibi
        kuki.click();
        Thread.sleep(3000); // give  wait stuff it goes super fast!!
        // when you set make the code wait for 5 sec so every other code wouldn't compile rapidly after the after
        WebElement searchbox = driver.findElement(By.xpath("// input[@class='text']")); // // the tag [@ + atributte = 'value'] volia
        searchbox.sendKeys("asus");  /// //input[@atrt='']  // input[@atrt][@atrt2]
        searchbox.submit();
    }
}
