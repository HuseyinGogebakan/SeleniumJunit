package T02_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

//    sendKeys(String keys) methodu elementimize gonderilen degerleri klavyeyle yazarmis gibi gonderir
//    isDisplayed() bize boolean ifadeler dondurur!!!!!!!!!! Elementin sayfada goruntulenip goruntulenmedigi bilgisini verir
//    isSelected() methodumuz bize elementin secili olup olmadigi bilgisini verir. (checkbox, radio)
//    isEnabled() bir elementin aktif mi degil mi oldugunun bilgisini verir (button ve girdi yapilan elementlerde kullanilabilir)
//    submit() methodu formlari submit etmemize yani gondermemize yardimci olur. ENTER tusunun gorevini gorur.
//    click() methodu bir elemente sol tiklamamizi saglar.
//    getLocation() methodu bize elementin konumunu verir
//    clear() methodu input alanlarindaki yazilarin temizlenmesini saglar.
//    getText() methodu elementin contentini bize verir
//    getAttribute(String key) methodu bize elementin istedigimiz attribute degerini getirir.
//    getSize() elementin boyutunu bize verir.
    @Test
    public void locatorStrategies(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.de/");
        driver.navigate().to("https://chat.openai.com/");
        //driver.navigate().to("https://stackoverflow.com/questions/5686755/meaning-of-delta-or-epsilon-argument-of-assertequals-for-double-values");

        // findElement() method to look
     WebElement searchTabId = driver.findElement(By.id("twotabsearchtextbox"));
      searchTabId.sendKeys("Asus gaming laptop");
      // it might be a various input points and it makes everthing to complicated so @webelement.submit allows us to not spend time to allocate also submit button gtn

       searchTabId.submit(); // form submitter
     // WebElement button =  driver.findElement(By.id("nav-search-submit-button"));
      // button.click();



    }


    public void name(){
        WebDriverManager.chromedriver().setup();

    }
}
