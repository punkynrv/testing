package org.mboaghe.testNg;

import org.apache.log4j.Logger;
import org.mboaghe.utils.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasicTest {
    public static WebDriver driver;
    public static Logger logger = Logger.getLogger(BasicTest.class);

    @BeforeTest
    public void startTest() {
//        SwagTest.driver = SeleniumDriver.setLocalDriver();
        BasicTest.driver = SeleniumDriver.getRemoteDriver();
    }

    @AfterTest
    public void stopTest() {
        driver.quit();
    }

}
