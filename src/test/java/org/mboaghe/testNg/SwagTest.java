package org.mboaghe.testNg;

import org.mboaghe.pom.Login;
import org.mboaghe.utils.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagTest extends BasicTest{

    //for what static?

    public static String URL_TEST = "https://www.saucedemo.com/";
    public static String USER_NAME = "standard_user";
    public static String USER_PASSWORD = "secret_sauce";
    public static String TITLE = "Products";
    public static String actualTitle;


    @Test
    public void firstTest() throws InterruptedException {
        driver.get(URL_TEST);
//        driver.manage().window().maximize();

        Login login = new Login(driver);
        Thread.sleep(1000);
        login.setUserName(USER_NAME);
        Thread.sleep(1000);
        login.setUserPassword(USER_PASSWORD);
        Thread.sleep(1000);
        login.clickSend();
        Thread.sleep(1000);
        actualTitle = login.getTitleText();
        Assert.assertEquals(actualTitle,TITLE,"Welcome");

//        WebElement userNameEl = driver.findElement(By.id("user-name"));
//        userNameEl.sendKeys(USER_NAME);

        System.out.println();
    }


}
