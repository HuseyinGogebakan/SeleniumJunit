package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C03_FileDownload extends Base {

    @Test
    public  void  test02() throws InterruptedException, IOException {
        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("testing.pdf")).click(); // downloads user.home -> / downloads/ text

        Thread.sleep(2000);

        String pathofdw = System.getProperty("user.home")+
                System.getProperty("file.separator")
                +"Downloads"
                +System.getProperty("file.separator")
                +"testing.pdf";

        Assert.assertTrue(Files.exists(Paths.get(pathofdw)));

        Files.delete(Paths.get(pathofdw));

    }
}
