package org.mboaghe.testNg;

import org.mboaghe.pom.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormaTest extends BasicTest {

    public static String URL_TEST = "https://www.saucedemo.com/";
    public static String USER_NAME = "standard_user";
    public static String USER_PASSWORD = "secret_sauce";
    public static String TITLE = "Products";


    @Test
    public void loginTest() throws InterruptedException {
        logger.info("Start  login test");
        driver.get(URL_TEST);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Login login = new Login(driver);
        login.setUserName(USER_NAME);
        login.setUserPassword(USER_PASSWORD);
        Thread.sleep(2000);
        login.clickSend();
        String actualTtile = login.getTitleText();
        Assert.assertEquals(actualTtile, TITLE, "Actual and expected titles are not equal");
        Thread.sleep(2000);
        logger.info("Finish login test");
    }
}
