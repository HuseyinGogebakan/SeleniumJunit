package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {


    @Test
    public void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());


        driver.quit();
    }
    @Test
    public void test02(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.clarusway.com/");

        driver.navigate().to("https://www.amazon.de/");

        driver.manage().window().maximize();
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();

        System.out.println(driver.getCurrentUrl());


        driver.quit();
    }


    @Test
    public void test03() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().minimize();

        driver.manage().window().setSize(new Dimension(12,52));
        driver.manage().window().setPosition(new Point(45,12));
        Thread.sleep(5000);
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        driver.quit();
    }

    @Test
    public void test04(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(450,120));

        driver.manage().window().setSize(new Dimension(100,100));

        driver.close();
    }


    @Test
    public void test05(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("video"));
        driver.close();

    }

    @Test
    public void test06(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Assert.assertTrue(driver.getTitle().contains("Facebook"));
        driver.quit();
    }

    @Test
    public void test07(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.de/");
        Assert.assertTrue(driver.getPageSource().contains("Performance Metrics"));
        Assert.assertTrue(driver.getPageSource().contains("MEOW"));
        driver.quit();

    }
}

