package Tasks.Netflix;

import Utilities.Base;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Netflix01 extends Base {



    String url = "https://www.netflix.com/de-en/login";
    // TEST CASE - 1
// https://www.netflix.com/de-en/login adresine git
// Login sayfasinda oldugumuzu verify et

    @Before
    public void teststart(){
        driver.get(url);


    }
    // TEST CASE - 2 - Positive Test
// Email gir
// Password gir
// Verify Remember me click or not
// if not click, then click
// Sign in Tikla
// Gidilen sayfayi verify et
@Test
    public void test01(){
     WebElement email_input  =  driver.findElement(By.id("id_userLoginId"));
    WebElement password_input = driver.findElement(By.id("id_password"));
        email_input.sendKeys(faker.internet().emailAddress());
        password_input.sendKeys(faker.internet().password());
        WebElement remember_me = driver.findElement(By.className("login-remember-me-label-text"));
        if (!remember_me.isSelected())remember_me.click();
        driver.findElement(By.xpath("//button[@data-uia='login-submit-button']")).click();

}


// TEST CASE - 3 - Positive Test
// Tel no gir
// Password gir
// Verify Remember me click or not
// if not click, then click
// Sign in Tikla
// Gidilen sayfayi verify et
@Test
public void test02(){
    WebElement email_input  =  driver.findElement(By.id("id_userLoginId"));
    WebElement password_input = driver.findElement(By.id("id_password"));
    email_input.sendKeys(faker.phoneNumber().cellPhone()+"");
    password_input.sendKeys(faker.internet().password());
    WebElement remember_me = driver.findElement(By.className("login-remember-me-label-text"));
    if (!remember_me.isSelected())remember_me.click();
    driver.findElement(By.xpath("//button[@data-uia='login-submit-button']")).click();

}

// TEST CASE - 4 - Negative Test
// Email girme
// Tel no girme
// Click Sign in
// Verify email error message // isVisible or get.text() and assertTrue
// Verify password error message

// TEST CASE - 5 - Negative Test
// Invalid email gir
// Verify email error message

// TEST CASE - 6 - Negative Test
// Invalid tel no gir
// Verify email error message

// TEST CASE - 7 - Negative Test
// password yanlis giris
// Verify password error message

// TEST CASE - 8
// Tel no gir
// Dropdown ulke secimi
// Gelen bayrak iconun visible mi


// TEST CASE - 9
// click need help
// gidilen sayfayai verify et
    @Test
    public void test09(){

    }

// TEST CASE - 10
// click Learn more
// gelen text isVisible mi
// click Privacy Policy ve gidilen sayfayi verify et

// TEST CASE - 11
// click sign up
// gidilen sayfayai verify et

// TEST CASE - 12
// password gir
// click show/hide
// eger show ise hide, hide ise show
// show ise password'un gorunur oldugunu verify et
}
