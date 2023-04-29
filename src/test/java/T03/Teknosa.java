package T03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Teknosa {

    @Test
    public  void  tks() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.teknosa.com/");
        driver.manage().window().maximize();
       // driver.manage().deleteAllCookies();
       WebElement searchtab =  driver.findElement(By.xpath("//input[@id='search-input']"));
        searchtab.sendKeys("oppo");
        searchtab.submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//a[@class='prd-link gowitPlp-js'] [1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));;
        WebElement sepet = driver.findElement(By.xpath("//button[@id='addToCartButton'][@type='submit']")); // buttons and websites are slower than  script watch out!!
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        sepet.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();


    }
}
