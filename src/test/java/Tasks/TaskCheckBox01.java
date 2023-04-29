package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TaskCheckBox01 {


    /*
    Go to https://the-internet.herokuapp.com/checkboxes
Locate the elements of checkboxes.
Then click on checkbox 1 if box is not selected.
Then click on checkbox 2 if box is not selected.
Then verify that checkbox 1 is checked.

     */

    @Test
    public  void  test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(2000);
        List<WebElement> wbelemtnts = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement each: wbelemtnts){
            if (!each.isSelected()) each.click();
            Thread.sleep(1000);
        }

        driver.quit();
    }
    /*
    Go to URL: https://demoqa.com/
Click on Elements.
Click on Checkbox.
Verify if Home checkbox is selected.
Verify that "You have selected" is visible
     */
    @Test
    public void test02() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
       WebDriver driver=  new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demoqa.com/");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//li[@class='btn btn-light '][2]")).click();
       Thread.sleep(1000);
       WebElement select = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
       select.click();
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));

       Thread.sleep(2000);
        List<WebElement> results = driver.findElements(By.xpath("//span [@class ='text-success']"));
        for (WebElement result:results) System.out.print(result.getText()+" ");
        Assert.assertTrue(checkboxInput.isSelected()); // you can only check the checkbox
        // but spean is the way you can click it
        //driver.quit();
    }


}
