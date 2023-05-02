package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C05_FileUpload extends Base {


    @Test
    public void test01() throws InterruptedException {

        /*
        Go to URL: https://the-internet.herokuapp.com/upload
        Find the path of the file that you want to upload.
        Click on Upload button.
        Verify the upload message.
         */
        driver.get("https://the-internet.herokuapp.com/upload");
        String path  = System.getProperty("user.dir") +
                System.getProperty("file.separator")+
                "fileExists.txt";
        WebElement elementtoupload = driver.findElement(By.id("file-upload"));
        elementtoupload.sendKeys(path);

        WebElement submit = driver.findElement(By.id("file-submit"));
        submit.click();


        Thread.sleep(2000);
        List<WebElement> h3 = driver.findElements(By.xpath("//h3[text() = 'File Uploaded!']"));
        Assert.assertEquals("We couldn't receive it",1,h3.size());


    }


}
