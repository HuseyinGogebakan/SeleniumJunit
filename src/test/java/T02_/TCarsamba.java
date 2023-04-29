package T02_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TCarsamba extends Testbfaf {

    @Test
    public void relatioveLocator() {

//        Go to http://www.bestbuy.com
//        Verify that the page title contains "Best" Also
//        , using Relative Locator.
//        LogoTest  Verify if the BestBuy logo is displayed.
//        mexicoLinkTest  Verify if the link is displayed.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.bestbuy.com");

        String pageTitle = driver.getTitle();

        Assert.assertTrue(pageTitle.contains("Best"));

        By logoLocator = RelativeLocator.with(By.tagName("img")).above(By.xpath("//div[text()='Hello!']"));

        WebElement logo = driver.findElement(logoLocator);
        Assert.assertTrue(logo.isDisplayed());
//        String bestBuyAlt = logo.getAttribute("alt");
//        System.out.println(bestBuyAlt);

        // canada link = (//a[@class='canada-link'])[1]

        By USLinkLocator = RelativeLocator.with(By.tagName("a")).toRightOf(By.xpath("(//a[@class='canada-link'])[1]"));
        WebElement USLink = driver.findElement(USLinkLocator);
        Assert.assertTrue(USLink.isDisplayed());

    }
}
