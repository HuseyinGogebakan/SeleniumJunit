package Day12;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class C05_ScreenShots extends Base {

    @Test
    public void test01() throws IOException {

        driver.get("https://www.linkedin.com/");

        WebElement webElement = driver.findElement(By.xpath("//div[@type='COOKIE_CONSENT']"));

        File source = webElement.getScreenshotAs(OutputType.FILE);

        String date = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());

        String path =   ".\\test-output\\screenshoot"+date+".png";

        FileUtils.copyFile(source,new File(path));


    }
}
