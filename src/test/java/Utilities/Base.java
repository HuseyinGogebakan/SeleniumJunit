package Utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public abstract class Base {

    protected Actions actions;
    protected ChromeDriver driver;
    protected Faker faker = new Faker();
    @Before
    public void start(){
        WebDriverManager.chromedriver().setup();

       // ChromeOptions options = new ChromeOptions();

       // options.addExtensions(new File("C:\\Users\\830-G7\\Desktop\\SelenuimJunit\\src\\test\\java\\Utilities\\Adblock-Plusgratis-adblocker.crx"));
       // options.setBinary(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));

        // For use with ChromeDriver:
        driver = new ChromeDriver();
        actions = new Actions(driver);
        driver.manage().window().maximize();
    }
}
