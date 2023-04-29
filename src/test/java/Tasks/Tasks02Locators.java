package Tasks;

import Utilities.Base;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Tasks02Locators extends Base {
    @Test
    public void test01(){
        driver.get("http://automationpractice.com/index.php");
        Faker faker = new Faker();
        driver.findElement(By.id("email")).sendKeys(faker.internet().emailAddress());// internet for digital
    // values !!


    }

    @Test
    public void test02() throws InterruptedException {
        List<String> results = new ArrayList<>();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        results.add(enterandresults("Green Mile"));
        results.add(enterandresults("Premonition"));
        results.add(enterandresults("The Curious Case of Benjamin Button"));
        System.out.println(results);

        driver.close();
    }

    private String enterandresults(String greenMile) throws InterruptedException {

       WebElement search = driver.findElement(By.className("gLFyf"));
       search.sendKeys(greenMile);
        search.sendKeys(Keys.ENTER);

        Thread.sleep(1000);
        String result = driver.findElement(By.id("result-stats")).getText();
        driver.navigate().to("https://www.google.com/"); //watch out you can use the same thing if you clear
        // because you get a different point!!!
        return result;
    }


    @Test
    public void  test03(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.linkText("Alerts")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.linkText("Basic Ajax")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println(driver.getCurrentUrl());
        WebElement valueint = driver.findElement(By.xpath("//input[@id='lteq30']"));
        valueint.sendKeys("20");
        valueint.submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        System.out.println(driver.findElement(By.tagName("p")).isDisplayed());

    }

    @Test
    public  void  test04() throws InterruptedException {
        driver.get("https://id.heroku.com/login");

        Thread.sleep(2000);
        Faker faker = new Faker();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(faker.internet().emailAddress());
       WebElement element =  driver.findElement(By.xpath("//input[@placeholder='Password']"));
       element.sendKeys(faker.internet().password());
       element.submit();
       Thread.sleep(1000);
       if (driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed()) System.out.println("Kayıt Yapılamadı");
       else System.out.println("kayit yapildi");

       driver.quit();

    }

    @Test
    public  void test05(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement usrname =driver.findElement(By.xpath("//input[@name='username']"));
        WebElement pswrd =driver.findElement(By.name("Password"));
        WebElement button = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));

        driver.close();



    }
}
