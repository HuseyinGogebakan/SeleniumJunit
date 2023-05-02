package Day12;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Date;

public class C04_ScreenShots  extends Base {


    @Test
    public void test01() throws IOException {

        // to get screenshoot  objcet

        // and then we take the  file and store it

        // at last we write the ss to a file

        driver.get("https://www.linkedin.com/");

        TakesScreenshot ss01 = driver;

       File source = ss01.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(source, new File(".\\test-output\\photo.png"));


    }
}
